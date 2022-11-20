package com.bridgelabz;

import java.util.Scanner;

public class AddressBookMain {
    public static void main(String[] args) {
        System.out.println("Welcome to Address Book Program");
        Scanner sc = new Scanner(System.in);
        int choice;
        AddressBook addressBook = new AddressBook();
        do {
            System.out.println("1. Add New Contact\n2. Edit Contact\n3. Delete Contact" + "\n4. Display Contact\n5." +
                    " Search by State\n6. Sorted List\n7. New AddressBook \n8. IO Operations \n9. Exit");
            System.out.println("Enter Choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    addressBook.checkContact();
                    break;
                case 2:
                    addressBook.editContact();
                    break;
                case 3:
                    addressBook.deleteContact();
                    break;
                case 4:
                    do {
                        System.out.println("---------------------------");
                        System.out.println("1. Display Contacts\n2. Display and Count by City\n3. Display and Count by State\n0. Exit");
                        System.out.println("Choice :");
                        choice = sc.nextInt();
                        switch (choice) {
                            case 1:
                                addressBook.displayContact();
                                break;
                            case 2:
                                addressBook.countByCity();
                                break;
                            case 3:
                                addressBook.countByState();
                                break;
                            case 0:
                                System.out.println("Thank you for using AddressBook ");
                                break;
                            default:
                                System.out.println("Please Select Valid Input");
                                break;
                        }
                    } while (choice != 0);
                    break;
                case 5:
                    do {
                        System.out.println("-----------------------------");
                        System.out.println("1. Search by City\n2. Search by State\n3. Exit");
                        System.out.println("Choice :");
                        choice = sc.nextInt();
                        switch (choice) {
                            case 1:
                                addressBook.searchByCity();
                                break;
                            case 2:
                                addressBook.searchByState();
                                break;
                            case 3:
                                System.out.println("Thank you for using AddressBook");
                                break;
                            default:
                                System.out.println("Please Select Valid Input");
                                break;
                        }
                    } while (choice != 3);
                    break;
                case 6:
                    do {
                        System.out.println("-----------------------------");
                        System.out.println("1. Sorted list\n 2. Sorted by City\n3. Search by State\n4. Exit");
                        System.out.println("Choice :");
                        choice = sc.nextInt();
                        switch (choice) {
                            case 1:
                                addressBook.sortedList();
                                break;
                            case 2:
                                addressBook.searchByCity();
                                break;
                            case 3:
                                addressBook.searchByState();
                                break;
                            case 4:
                                System.out.println("Thank you for Using AddressBook ");
                                break;
                            default:
                                break;
                        }
                    } while (choice != 4);
                    break;
                case 7:
                    do {
                        System.out.println("-----------------------------");
                        System.out.println("1. Add AddressBook\n2. Show Address Book\n3. Exit");
                        System.out.println("Choice :");
                        choice = sc.nextInt();
                        switch (choice) {
                            case 1:
                                addressBook.addNewAddressBook();
                                break;
                            case 2:
                                addressBook.showAddressBook();
                                break;
                            case 3:
                                System.out.println("Thank you for using AddressBook");
                                break;
                            default:
                                System.out.println("Please Select Valid Input");
                                break;
                        }
                    } while (choice != 3) ;
                    break;
                case 8:
                    do {
                        System.out.println("-----------------------------");
                        System.out.println("1. Write File\n2. Read File\n3. Exit");
                        System.out.println("Choice :");
                        choice = sc.nextInt();
                        switch (choice) {
                            case 1:
                                addressBook.writeFiles();
                                break;
                            case 2:
                                addressBook.readFiles();
                                break;
                            case 3:
                                System.out.println("Thank you");
                            default:
                                System.out.println("Please Select Valid Input");
                                break;
                        }
                    } while (choice != 3) ;
                    break;
                case 9:
                    System.out.println("Thank you for Using Address Book");
                    break;
                default:
                    System.out.println("Please Select between 1 to 9 only.");
                    break;
            }
        }
        while( choice != 9 );
    }
}

