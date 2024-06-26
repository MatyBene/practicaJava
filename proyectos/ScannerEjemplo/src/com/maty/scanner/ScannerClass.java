package com.maty.scanner;

import java.util.Scanner;

public class ScannerClass {

    private int numero;

    private String username;

    private Character letra;

    public void ScannerNumber(){

        System.out.println("Ingrese un numero: ");
        Scanner scanner = new Scanner(System.in);
        this.numero = scanner.nextInt();

    }

    public int getNumero() {
        return numero;
    }
}
