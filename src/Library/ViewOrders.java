package Library;

import java.util.ArrayList;
import java.util.Scanner;

public class ViewOrders implements IOOperation{
    @Override
    public void oper(Database db , User user){
        Scanner sc = new Scanner(System.in);
        System.out.println("\nEnter the book name : ");
        String bookname = sc.next();
        int i = db.getBook(bookname);
        if(i>-1)
        {
            System.out.println("Book\t\tUser\t\tQuantity\t\tPrice");
            for(Order order : db.getAllOrders()){
                if(order.getBook().getName().matches(bookname)){
                    System.out.println(order.getBook().getName()+"\t\t"+order.getUser().getName()+"\t\t\t"+
                            order.getQty()+"\t\t\t"+order.getPrice());
                }
            }
            System.out.println();
        }else{
            System.out.println("Book doesnt exist\n");
        }
        user.menu(db,user);
    }
}
