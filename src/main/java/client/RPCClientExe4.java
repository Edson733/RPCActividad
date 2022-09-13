package client;

import org.apache.xmlrpc.XmlRpcException;
import org.apache.xmlrpc.client.XmlRpcClient;
import org.apache.xmlrpc.client.XmlRpcClientConfigImpl;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

public class RPCClientExe4 {
    public static void main(String[] args) throws MalformedURLException, XmlRpcException {
        Scanner teclado = new Scanner(System.in);
        XmlRpcClientConfigImpl config = new XmlRpcClientConfigImpl();
        config.setServerURL(new URL("http://localhost:1200"));
        XmlRpcClient client = new XmlRpcClient();
        client.setConfig(config);
        System.out.print("Coloca el 1er numero: ");
        int num1 = teclado.nextInt();
        System.out.print("Coloca el 2do numero: ");
        int num2 = teclado.nextInt();
        System.out.print("Coloca el 3er numero: ");
        int num3 = teclado.nextInt();
        System.out.print("Coloca el 4to numero: ");
        int num4 = teclado.nextInt();
        System.out.print("Coloca el 5to numero: ");
        int num5 = teclado.nextInt();
        Object[] variables = {num1, num2, num3, num4, num5};
        Object[] response = (Object[]) client.execute("Methods.ordenAscendente", variables);
        System.out.println("\nNumeros Ordenados de Forma Ascendente");
        for (int i = 0; i<variables.length; i++){
            System.out.print(response[i] + " - ");
        }
        System.out.println("\n\nNumeros Ordenados de Forma Descendente");
        for (int i = (variables.length - 1); i>=0; i--){
            System.out.print(response[i] + " - ");
        }
    }
}
