package Library;

import java.util.Scanner;

public class ReturnBook implements IOOperation{
    @Override
    public void oper(Database db , User user){
        System.out.println("Enter book name: ");
        Scanner sc = new Scanner(System.in);
        String bookname = sc.next();
        if(!db.getBrws().isEmpty())
        {
            Borrowing borrowingToRemove = null;
            for(Borrowing b: db.getBrws()){
                if(b.getBook().getName().equals(bookname) && b.getUser().getName().equals(user.getName())){
                    Book book = b.getBook();
                    int i = db.getAllBooks().indexOf(book);
                    if(b.getDaysLeft()<0)
                    {
                        System.out.println("You are late!\n"
                                +"You have to pay "+ Math.abs(b.getDaysLeft()*50)+" as fine");
                    }
                    book.setBorrowCopies(book.getBorrowCopies()+1);
                    borrowingToRemove = b;
                    db.returnBook(borrowingToRemove,book,i);
                    System.out.println("book returned \n Thank you!!!");
                    break;
                }else{
                    System.out.println("you didn't borrow this book!\n");
                }
            }
        }else{
            System.out.println("you didnt borrow this book!\n");
        }
        user.menu(db,user);
    }
}
