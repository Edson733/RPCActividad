package client;

import org.apache.xmlrpc.XmlRpcException;
import org.apache.xmlrpc.client.XmlRpcClient;
import org.apache.xmlrpc.client.XmlRpcClientConfigImpl;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

public class RPCClientExe1 {
    public static void main(String[] args) throws MalformedURLException, XmlRpcException {
        Scanner teclado = new Scanner(System.in);
        XmlRpcClientConfigImpl config = new XmlRpcClientConfigImpl();
        config.setServerURL(new URL("http://localhost:1200"));
        XmlRpcClient client = new XmlRpcClient();
        client.setConfig(config);
        System.out.print("Coloca tu nombre: ");
        String nombre = teclado.nextLine();
        System.out.print("Coloca tu peso: ");
        Double peso = teclado.nextDouble();
        System.out.print("Coloca tu altura: ");
        Double altura = teclado.nextDouble();
        Object[] variables = {peso, altura};
        Double response = (Double) client.execute("Methods.imc", variables);
        System.out.println("\nHola " + nombre + " tu IMC es: " + response);
    }
}
