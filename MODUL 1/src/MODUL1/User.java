package MODUL1;

import java.util.Scanner;

public class User {

    // TODO Create Attribute of User; Name and Phone Number then Create Setter
    String name, phone;

    public void setName(String name) {
        this.name = name;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    // TODO Create Method to Register User and Display User's Name and Phone Number
    // and success message
    public void registerusr() {
        Scanner ipt = new Scanner(System.in);

        System.out.print("Nama: ");
        name = ipt.nextLine();

        System.out.print("No. Handphone: ");
        phone = ipt.nextLine();

        System.out.println("\nRegister Success");
        System.out.println("Name: " + name);
        System.out.println("Phone Number: " + phone);
        System.out.println("=================================");
    }

}
