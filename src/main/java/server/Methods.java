package server;

import java.util.Arrays;

public class Methods {
    public double addition(double num1, double num2){
        return (num1 + num2);
    }

    public double imc(double peso, double altura){
        return (peso / (altura * altura));
    }

    public String operaciones(double num1, double num2, double num3, double num4){
        double producto = (num1 * num2 * num3 * num4);
        double suma = (num1 + num2 + num3 + num4);
        double promedio = (suma / 4);
        return "\nHola, el producto es: " + producto + ", la suma es: " + suma + " y el promedio es: " + promedio;
    }

    public String sumatoriaInterna(double num1, double num2){
        double minimo = Math.min(num1, num2);
        double maximo = Math.max(num1, num2);
        double sumatoria = 0;
        for (double i = minimo + 1; i < maximo; i++){
            sumatoria += i;
        }
        return "\nLa sumatoria interna entre " + num1 + " y " + num2 + " es de: " + sumatoria;
    }

    public Object[] ordenAscendente(int num1, int num2, int num3, int num4, int num5){
        Object[] numeros = {num1, num2, num3, num4, num5};
        Arrays.sort(numeros);
        return numeros;
    }
}
