package Library;

import java.util.Scanner;

public class PlaceOrder implements IOOperation{
    @Override
    public void oper(Database db , User user){
        Order order = new Order();
        System.out.println("\nEnter book name : ");
        Scanner sc = new Scanner(System.in);
        String bookname = sc.next();
        int i = db.getBook(bookname);
        if(i<=-1){
            System.out.println("Book doesn't exist\n");
        }else{
            Book book = db.getBook(i);
            order.setBook(book);
            order.setUser(user);
            System.out.println("Enter Quantity : ");
            int qty = sc.nextInt();
            order.setQty(qty);
            order.setPrice(book.getPrice()*qty);
            int bookIndex = db.getBook(book.getName());
            book.setQty(book.getQty()-qty);
            db.AddOrder(order,book,bookIndex);
            System.out.println("Order placed Successfully\n");
        }

        user.menu(db,user);
    }
}
