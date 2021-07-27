package fr.damien.calcul_exo;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Enter number and opérator
        System.out.println("Entrer le calcul a effectuer Avec des espace entre les numéro et les opérateur :");

        String fullCalcul = sc.nextLine();

        CalculScanner result = new CalculScanner(fullCalcul);


    }
}