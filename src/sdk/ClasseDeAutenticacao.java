package sdk;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.PrivateKey;
import java.security.UnrecoverableKeyException;
import java.security.cert.CertificateException;
import java.text.ParseException;
import java.util.Map;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.apache.http.HttpHost;

import org.w3c.dom.Document;
import org.xml.sax.SAXException;

import com.mastercard.api.core.ApiConfig;
import com.mastercard.api.core.model.Environment;
import com.mastercard.api.core.security.oauth.OAuthAuthentication;

public class ClasseDeAutenticacao {
	
	public static void Autenticação(String consumerKey, String keyAlias, String keyPassword) throws KeyStoreException, NoSuchAlgorithmException, CertificateException, IOException, UnrecoverableKeyException, NoSuchProviderException, ParseException, ParserConfigurationException, SAXException {

		Map<String, String> env = System.getenv();
		String mastercom_config_path = env.get("MASTERCOM_CONFIG");

		File xmlFile = new File(mastercom_config_path);
		DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder docBuilder;
		ParametrosConfig parameters = new ParametrosConfig();


		docBuilder = docFactory.newDocumentBuilder();
		Document doc = docBuilder.parse(xmlFile);
		doc.getDocumentElement().normalize();

		parameters.setProxy(doc.getElementsByTagName("Proxy").item(0).getTextContent());
		parameters.setPorta(doc.getElementsByTagName("Porta").item(0).getTextContent());
		parameters.setEhDebug(doc.getElementsByTagName("EhDebug").item(0).getTextContent());
		parameters.setAmbiente(doc.getElementsByTagName("ambiente").item(0).getTextContent());
		parameters.setCertificadoPath(doc.getElementsByTagName("certificadoPath").item(0).getTextContent());
						
		/* CONFIGURANDO PARAMETROS PARA PROXY E PORTA DA APLICAÇÃO */
		if(!"".equals(parameters.getProxy()) && !"".equals(parameters.getPorta())) {

			int porta = Integer.parseInt(parameters.getPorta());

			String ip = parameters.getProxy();

			HttpHost proxy = new HttpHost(ip, porta);			
			ApiConfig.getHttpClientBuilder().setProxy(proxy);
		}

		PrivateKey privateKey = null;

		/* CONFIGURANDO PARAMETRO DO CERTIFICADO DA APLICAÇÃO, CASO NÃO EXISTA UM CERTIFICADO NAS CONFIGURAÇÕES, TENTA PEGAR O CERTIFICADO DO WINDOWS */
		if("".equals(parameters.getCertificadoPath())) {
			KeyStore ks = KeyStore.getInstance("Windows-MY", "SunMSCAPI");  
			ks.load(null, null);  
			privateKey = (PrivateKey) ks.getKey(keyAlias, keyPassword.toCharArray());

		}else {
			String certificado_path = parameters.getCertificadoPath();

			InputStream is = new FileInputStream(certificado_path);
			KeyStore ks = KeyStore.getInstance("PKCS12");
			ks.load(is, keyPassword.toCharArray());

			privateKey = (PrivateKey) ks.getKey(keyAlias, keyPassword.toCharArray());
		}

		/* VERIFICA SE A APLICAÇÃO ESTA SENDO EXECUTADA EM DEBUG MODE OU NÃO*/
		if("".equals(parameters.getEhDebug())) {
			ApiConfig.setDebug(false);			
		}else {
			boolean verdadeiroOuFalso = Boolean.parseBoolean(parameters.getEhDebug());
			ApiConfig.setDebug(verdadeiroOuFalso);	
		}
		ApiConfig.setAuthentication(new OAuthAuthentication(consumerKey, privateKey));

		/* CONFIGURAÇÃO DO AMBIENTE QUE SERA EXECUTADO*/
		if("".equals(parameters.getAmbiente())) {
			ApiConfig.setEnvironment(Environment.parse("sandbox"));			
		}else {
			ApiConfig.setEnvironment(Environment.parse(parameters.getAmbiente()));
			if(!"sandbox".equals(parameters.getAmbiente())) {
				ApiConfig.setSandbox(false);				
			}
		}
	}

}
