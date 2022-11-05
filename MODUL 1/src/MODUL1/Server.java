package MODUL1;

import java.util.Scanner;

public class Server {

    public static void main(String[] args) {
        // TODO Create Database

        // TODO Create Menu

        // TODO Insert Menu to Database

        // TODO Display Main Menu
        System.out.println("Selamat Datang di Restoran EAD");
        System.out.println("Silahkan Register Terlebih Dahulu");
        System.out.println("=================================");
        // TODO Create User
        User reg = new User();
        reg.registerusr();
        // Display Menu
        System.out.println("1.Menu\n2.Pilih Menu\n3.Keluar");
        System.out.println("=================================");
    }
}