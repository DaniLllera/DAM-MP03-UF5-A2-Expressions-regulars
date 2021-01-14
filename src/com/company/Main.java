package com.company;

import java.io.*;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    //PARA EJECUTAR LOS METODOS, INDICA EN EL MENU QUE METODO ES EL QUE QUIERES EJECUTAR

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        int option = 0;
        System.out.println("Elige que metodo quieres ejecutar");
        System.out.println("1.-Expresiones Regulares 2.- Otra Manera");

        option = scanner.nextInt();
        while (option < 3) {
            switch (option) {
                case 1:
                    expresionregular();
                    break;
                case 2:
                segundaparte();
                break;
            }
            break;
        }

        }


    private static void expresionregular() throws IOException {
        System.out.println("ECHO CON EXPRESIONES REGULARES");
        File fr = new File("C:\\Users\\DANILLERA\\Desktop\\santako.txt");
        BufferedReader br = new BufferedReader(new FileReader(fr));
        String linea = br.readLine();

        Pattern papanoel = Pattern.compile("\\*<]:-DOo");
        Pattern renos = Pattern.compile(">:o\\)");
        Pattern follet = Pattern.compile("[^*]<]:-D");

        for (int i = 0; i < 4; i++) {

            Matcher matcherPareNoel = papanoel.matcher(linea);
            Matcher matcherRens = renos.matcher(linea);
            Matcher matcherFollet = follet.matcher(linea);

            int contadorpapanoel = 0;
            int contadorens = 0;
            int contadorfollet = 0;


            while (matcherPareNoel.find()) {
                contadorpapanoel++;
            }

            if (contadorpapanoel != 0) {
                System.out.print("Pare Noel " + contadorpapanoel + " | ");
            }

            while (matcherRens.find()) {
                contadorens++;
            }

            if (contadorens != 0) {
                System.out.print("Rens " + contadorens + " | ");
            }

            while (matcherFollet.find()) {
                contadorfollet++;
            }

            if (contadorfollet != 0) {
                System.out.print("Follet " + contadorfollet + " | ");
            }

            System.out.println();
            linea = br.readLine();
        }
    }
    private static void segundaparte() throws IOException {

        System.out.println("ECHO SIN EXPRESIONES REGULARES");
        File fr = new File("C:\\Users\\DANILLERA\\Desktop\\santako.txt");
        BufferedReader br = new BufferedReader(new FileReader(fr));
        String linea = br.readLine();
        int contadorpapanoel = 0;
        int contadorens = 0;
        int contadorfollet = 0;
        int recorrido= 0;

        for (int i = 0; i < 4; i++) {
            recorrido++;


            if (recorrido == 2) {
                contadorpapanoel=1;
            }



            if (linea.contains("<]:-DOo")) {
                contadorpapanoel++;
            }else if (linea.contains("<]:-D")) {
                contadorfollet++;
            }
            if (contadorpapanoel != 0) {
                System.out.print("Pare Noel " + contadorpapanoel + " | ");
            }


            if (linea.contains(">:o")) {
                contadorens++;
            }
            if (contadorens != 0) {
                System.out.print("Rens " + contadorens + " | ");
            }


            if (contadorfollet != 0 ) {
                System.out.print("Follet " + contadorfollet + " | ");
            }
            System.out.println();
            linea = br.readLine();

            contadorpapanoel=0;
            contadorens=0;
        }
    }
}