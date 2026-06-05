package Library;

import java.util.Scanner;

public class DeleteAllData implements IOOperation{
    @Override
    public void oper(Database db , User user){
        System.out.println("\n Are you sure to Delete All Data?\n");
        System.out.println("1. Continue\n2. Main Menu\n");
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        if(i==1)
        {
            db.deleteAllData();
        }else{
            user.menu(db,user);
        }

    }
}
