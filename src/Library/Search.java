package Library;

import java.util.Scanner;

public class Search implements IOOperation{
    @Override
    public void oper(Database db , User user){
        Scanner sc = new Scanner(System.in);
        System.out.println("\nEnter Book Name : ");
        String name = sc.next();

        int i= db.getBook(name);
        if(i>-1)
        {
            System.out.println("\n"+db.getBook(i).toString()+"\n");
        }else{
            System.out.println("There does not exist any such book\n");
        }

        user.menu(db,user);
    }
}
