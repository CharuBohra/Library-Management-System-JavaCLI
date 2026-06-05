package Library;

import java.util.Scanner;

public class DeleteBook implements IOOperation {
    @Override
    public void oper(Database db , User user){
        Scanner sc =new Scanner(System.in);
        System.out.println("\nEnter Book Name : ");
        String bookname = sc.next();

        int i = db.getBook(bookname);
        if(i>-1)
        {
            db.deleteBook(i);
            System.out.println("Book deleted successfully\n");
        }else{
            System.out.println("Book doesn't exist\n");
        }
        //sc.close();
        user.menu(db,user);
    }
}
