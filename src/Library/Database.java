package Library;

import java.util.ArrayList;

public class Database {

    ArrayList<User> users = new ArrayList<User>();
    ArrayList<String> usernames = new ArrayList<String>();

    public void AddUser(User s)
    {
        users.add(s);
        usernames.add(s.getName());
    }

    public int login(String email,String phoneNumber)
    {
        int n = -1;
        for(User s: users)
        {
            if(s.getPhoneNumber().equals(phoneNumber) && s.getEmail().equals(email))
            {
                n = users.indexOf(s);
                //System.out.println(s.getEmail() + " " + s.getPhoneNumber());
                break;
            }
        }
        //System.out.println("Users Count: "+users.size());
        return n;
    }

    public User getUser(int n)
    {
        return users.get(n);
    }
}
