package Library;

import java.util.Scanner;

public class AddBook implements IOOperation{
    @Override
    public void oper(Database db , User user){
        Scanner sc = new Scanner(System.in);
        Book book = new Book();
        System.out.println("\nEnter book name : ");
        String name = sc.next();
        if(db.getBook(name)>-1)
        {
            System.out.println("There is a book with this name!\n");
            user.menu(db,user);
            return;
        }
        book.setName(name);
        System.out.println("Enter book author : ");
        book.setAuthor(sc.next());
        System.out.println("Enter book publisher : ");
        book.setPublisher(sc.next());
        System.out.println("Enter book collection address : ");
        book.setAddress(sc.next());
        System.out.println("Enter quantity : ");
        book.setQty(sc.nextInt());
        System.out.println("Enter book price : ");
        book.setPrice(sc.nextDouble());
        System.out.println("Enter borrowing copies : ");
        book.setBorrowCopies(sc.nextInt());
        db.AddBook(book);
        System.out.println("Book added successfully");
        user.menu(db,user);
    }
}
