package Library;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
     static Scanner sc;
     static Database db;
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.

        db = new Database();
        System.out.println("Welcome to Library Management System");
        int n1;
        System.out.println(" 0. Exit\n 1. LOGIN \n 2. NEW USER");
        sc = new Scanner(System.in);
        n1 = sc.nextInt();

        switch(n1) {
                case 1:
                    login();
                    break;
                case 2:
                    newUser();
                    break;
        }
    }

    private static void login() {
        System.out.println("Enter email");
        String email = sc.next();
        System.out.println("Enter Phone Number");
        String phoneNumber = sc.next();
        int n = db.login(email,phoneNumber);
        if(n!=-1)
        {
            User user = db.getUser(n);
            System.out.println("Welcome "+ user.getName());
            user.menu(db,user);
        }
        else{
            System.out.println("User doesn't exist");
        }
    }

    private static void newUser() {
        System.out.println("Enter name");
        String name = sc.next();
        if(db.userExists(name))
        {
            System.out.println("User Exists\n");
            newUser();
        }
        System.out.println("Enter email");
        String email = sc.next();
        System.out.println("Enter Phone Number");
        String phoneNumber = sc.next();
        System.out.println("Select Option");
        System.out.println("1. Admin \n 2. Normal User");
        int n2 = sc.nextInt();
        User user;
        if(n2==1)
        {
            user = new Admin(name,email, phoneNumber);
        }else {
            user = new NormalUser(name,email,phoneNumber);
        }
        db.AddUser(user);
        System.out.println("User Account Created Successfully");
        user.menu(db,user);
    }
}