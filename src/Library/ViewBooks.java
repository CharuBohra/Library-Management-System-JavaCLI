package Library;

public class ViewBooks implements IOOperation{
    @Override
    public void oper(Database db , User user){
        System.out.println("View Books");
    }
}
