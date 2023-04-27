package org.example.variables;

//utilizando long que gasta o mesmo espaço do double (8 bits mas tem um range maior) mas só aceita numeros inteiros
public class WholeNumbers {

    public static void main(String[] args) {
        long golbalPopulation = 8000000000L;

        System.out.println("The global population is" + golbalPopulation);

        long dailyGoogleSearches = 8_500_000_000_000L;

        System.out.println("There are "+dailyGoogleSearches + " searches in google every day.");
    }
}
