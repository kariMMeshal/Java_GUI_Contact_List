
package contact;

import java.util.HashSet;
import java.util.Set;
import java.util.regex.Pattern;

public class Mail {
private String FullName;
private String Mail;
private  String Password;
private String Messege;
private boolean f;
{
        FullName="";
        Password="";
        Mail="";
        Messege="";
        f=true;
    
    
}

    public Mail(String Name, String Mail, String Password) {
        setName(Name);
        setMail(Mail);
        setPassword(Password);
    }

    public String getName() {
        return FullName.trim();
    }

    public void setName(String Name) {
       if(Pattern.matches( "^[a-zA-Z][a-zA-Z\\s]+$", Name.trim()) )
      this.FullName=FullName.trim();
     else{
         Messege+="-Name is Not Valid\n";
         f=false;
      }
    }

    public Mail() {
    }

    public String getMail() {
        return Mail.trim();
    }

    public void setMail(String Mail) {
         if( Pattern.matches("^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$", Mail.trim())  && Mail.trim().length()>=15 )
            this.Mail=Mail.trim().toLowerCase();
         else{
            Messege+="-Email is Not Valid\n";
            f=false;
        }
    }

    public String getPassword() {
        return Password;
    }
      
    public void setPassword(String Password) {
         if(Pattern.matches("((?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%]).{6,15})", Password.trim()) )
        this.Password=Password.trim();
         else{
             Messege+=
"-Password is Not Strong enough =>"+"Password Policy Is : \n"+ 
"*At least 8 chars\n" +
"*Contains at least one digit\n" +
"*Contains at least one lower alpha char and one upper alpha char\n" +
"*Contains at least one char within a set of special chars (@#%$^ etc.)\n" +
"*Does not contain space, tab, etc.";
             f=false;
         }
    }

    public String getMessege() {
        return Messege;
    }

    public boolean Flag() {
        return f;
    }


    
}
