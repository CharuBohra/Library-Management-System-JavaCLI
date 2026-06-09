package Library;

import java.util.Scanner;

public class BorrowBook implements  IOOperation{
    @Override
    public void oper(Database db , User user){
        Scanner sc = new Scanner(System.in);
        System.out.println("\nEnter Book Name : ");
        String bookname = sc.next();


        int i = db.getBook((bookname));
        if(i>-1)
        {
            Book book = db.getBook(i);
            boolean n = true;
            for(Borrowing b:db.getBrws()){
                if(b.getBook().getName().equals(bookname) && b.getUser().getName().equals(user.getName())){
                    n=false;
                    System.out.println("you have borrowed this book before!\n");
                }
            }
            if(n)
            {
                if(book.getBorrowCopies()>0)
                {
                    System.out.println("Logged In User = " + user.getName());
                    Borrowing borrowing = new Borrowing(book,user);
                    book.setBorrowCopies(book.getBorrowCopies()-1);
                    db.BorrowBook(borrowing,book,i);
                    System.out.println("You must return the book before 14 days from now\n"+
                            "Expiry Date : "+borrowing.getFinish()+"\nEnjoyyy!!\n");
                }else{
                    System.out.println("This book isn't available for borrowing\n");
                }
            }
        }else{
            System.out.println("\nBook doesn't exist\n");

        }
        user.menu(db,user);
    }
}
