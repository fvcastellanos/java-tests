package net.cavitos.tests;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDate;

public class MainApp {

    public static void main(String[] args) throws IOException {
        
        var reader = new BufferedReader(
            new InputStreamReader(System.in)
        );

        System.out.println("Enter a year: ");
        var year = reader.readLine();

        System.out.println("Enter a month: ");
        var month = reader.readLine();

        System.out.println("Enter a day: ");
        var day = reader.readLine();

        try {
            var locaDate = LocalDate.of(Integer.parseInt(year), Integer.parseInt(month), Integer.parseInt(day));

            System.out.println("Fecha: " + locaDate);

        } catch (Exception exception) {

            System.out.println("La fecha no es valida");
        }
    }
}
