package Library;

import java.util.Scanner;

public class Exit implements IOOperation{
    private Scanner sc = new Scanner(System.in);
    Database db;
    User user;
    @Override
    public void oper(Database db , User user){

        this.db = db;
        this.user=user;

        System.out.println("\n Are you sure you want to quit?\n");
        System.out.println("1. Yes\n2. Main Menu\n");
        int i = sc.nextInt();
        if(i==1)
        {
            System.out.println(" 0. Exit\n 1. LOGIN \n 2. NEW USER");
            int n1 = sc.nextInt();

            switch(n1)
            {
                case 1 : login();
                    break;
                case 2 : newUser();
                    break;
                //default : System.out.println("There is a Error");
            }
        }else{
            user.menu(db,user);
        }
    }
    private void login() {
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

    private void newUser() {
        System.out.println("Enter name");
        String name = sc.next();
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
