package Library;

import java.util.Scanner;

public class CalculateFine implements IOOperation{
    @Override
    public void oper(Database db , User user){
        System.out.println("Enter book name : ");
        Scanner sc = new Scanner(System.in);
        String bookname = sc.next();

        boolean found = false;
        for (Borrowing b: db.getBrws()){
            if(b.getBook().getName().equals(bookname) && b.getUser().getName().equals(user.getName())){
                found = true;
                if(b.getDaysLeft()<0)
                {
                    System.out.println("You are late!\n"
                                +"You have to pay "+ Math.abs(b.getDaysLeft()*50)+" as fine");
                }else{
                    System.out.println("You don't have to pay fine");
                }
                break;
            }
        }
        if(!found)
        {
            System.out.println("you didn't borrow this book\n");
        }
        user.menu(db,user);
    }
}
