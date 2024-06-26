package com.maty.scanner;

public class MainScanner {
    public static void main(String[] args) {

        ScannerClass scannerClass = new ScannerClass(); // METODO QUE SE LLAMA IGUAL QUE LA CLASE ES UN CONSTRUCTOR //OBJETO DE LA CLASE
        scannerClass.ScannerNumber();
        System.out.println("scannerClass = " + scannerClass.getNumero());
    }
}
