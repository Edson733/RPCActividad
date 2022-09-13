package client;

import org.apache.xmlrpc.XmlRpcException;
import org.apache.xmlrpc.client.XmlRpcClient;
import org.apache.xmlrpc.client.XmlRpcClientConfigImpl;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

public class RPCClientExe3 {
    public static void main(String[] args) throws MalformedURLException, XmlRpcException {
        Scanner teclado = new Scanner(System.in);
        XmlRpcClientConfigImpl config = new XmlRpcClientConfigImpl();
        config.setServerURL(new URL("http://localhost:1200"));
        XmlRpcClient client = new XmlRpcClient();
        client.setConfig(config);
        System.out.print("Coloca el 1er numero: ");
        Double num1 = teclado.nextDouble();
        System.out.print("Coloca el 2do numero: ");
        Double num2 = teclado.nextDouble();
        Object[] variables = {num1, num2};
        String response = (String) client.execute("Methods.sumatoriaInterna", variables);
        System.out.println(response);
    }
}
