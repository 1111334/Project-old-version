package org.example;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Benvenuti nel nostro Hotel!");
        String benvenuti = scanner.nextLine();

        System.out.println("Inserisca il suo nome e cognome: ");
        String nome = scanner.nextLine();

        System.out.println("in quanti alloggierete?: ");
        int numberPerson = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Durata pernottamento giorni: ");
        int durata = scanner.nextInt();

        System.out.println("conferma o annulla? per confermare la prenotazione scrivere true, sennò false");
        boolean prenotationConfirmed = scanner.nextBoolean();

        System.out.println("Data prenotazione");
        LocalDate data = LocalDate.now();

        // Ottieni l'orario corrente
        System.out.println("L'orario corrente è: ");
        LocalTime currentTime = LocalTime.now();


        Prenotation prenotazioneEffettuata = new Prenotation(data, nome, numberPerson,  prenotationConfirmed);

        scanner.close();

        prenotazioneEffettuata.printDetails();


        /*System.out.println(Prenotation.getData());
        prenotazione1.setData("2023-07-25");
        prenotazione1.setData("2023-07-25");

        System.out.println(Prenotation.getNomeCliente());
        prenotazione1.setNomeCliente("Mario Rossi");
        prenotazione1.setNomeCliente("Mario Rossi");

        System.out.println(Prenotation.getNumeroPersone());
        prenotazione1.setNumeroPersone(1);
        prenotazione1.setNumeroPersone(1);

        System.out.println(Prenotation.getreservationConfirmed());
        prenotazione1.setreservationConfirmed(true);
        prenotazione1.setreservationConfirmed(true);


        System.out.println(Prenotation.getData());
        prenotazione2.setData("2023-08-10");
        prenotazione1.setData("2023-08-10");

        System.out.println(Prenotation.getNomeCliente());
        prenotazione2.setNomeCliente("Luca Bianchi");
        prenotazione1.setNomeCliente("Luca Bianchi");

        System.out.println(Prenotation.getNumeroPersone());
        prenotazione2.setNumeroPersone(1);
        prenotazione1.setNumeroPersone(1);

        System.out.println(Prenotation.getreservationConfirmed());
        prenotazione2.setreservationConfirmed(true);
        prenotazione1.setreservationConfirmed(true);


        System.out.println(Prenotation.getData());
        prenotazione3.setData("2023-09-05");
        prenotazione1.setData("2023-09-05");

        System.out.println(Prenotation.getNomeCliente());
        prenotazione3.setNomeCliente("Giulia Verdi");
        prenotazione1.setNomeCliente("Giulia Verdi");

        System.out.println(Prenotation.getNumeroPersone());
        prenotazione3.setNumeroPersone(1);
        prenotazione1.setNumeroPersone(1);

        System.out.println(Prenotation.getreservationConfirmed());
        prenotazione3.setreservationConfirmed(true);
        prenotazione1.setreservationConfirmed(true);*/


    }
}