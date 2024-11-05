
package contact;

import java.util.regex.Pattern;


public class Contact {
    private String FullName;
    private String PhoneNumber;
    private String Email;
    private String Address;
    private String Messege;
    private boolean f;
    {
        FullName="";
        PhoneNumber="";
        Email="";
        Address="";
        Messege="";
        f=true;
    }

     public Contact(String FullName , String PhoneNumber,String Email ) {
          setFullName(FullName);
        setPhoneNumber(PhoneNumber);
         setEmail(Email);
    }
    public Contact(String FullName , String PhoneNumber,String Email,String Address ) {
        this(FullName,PhoneNumber,Email);
        setAddress(Address);
    }

    public String getFullName() {
        return FullName.trim();
    }

    public void setFullName(String FullName) {
     if(Pattern.matches( "^[a-zA-Z][a-zA-Z\\s]+$", FullName.trim()) && FullName.trim().length()>=4 )
      this.FullName=FullName.trim();
     else{
         Messege+="-Name is Not Valid\n";
         f=false;
      }
    }

    public String getPhoneNumber() {
        return PhoneNumber.trim();
    }

    public void setPhoneNumber(String PhoneNumber) {
         if (Pattern.matches("((\\+201)|(201)|(01))[0125]\\d{8}$", PhoneNumber.trim())) 
            this.PhoneNumber = PhoneNumber;            
        if (Pattern.matches("((\\+201)|(201)|(01))[0125]\\d{8}$", PhoneNumber.trim())) //Egyption number only by regex
            this.PhoneNumber = PhoneNumber.trim();   
        else{
            Messege+="-Phone Number is Not Valid\n";
            f=false;
        }
    }

    public String getEmail() {
        return Email.trim();
    }

    public void setEmail(String Email) {
          if( Pattern.matches("^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$", Email.trim())  && Email.trim().length()>=15 )
            this.Email=Email.trim().toLowerCase();
         else{
            Messege+="-Email is Not Valid\n";
            f=false;
        }
    }

    public String getAddress() {
        return Address.trim();
    }

    public void setAddress(String Address) {
       if(Address.trim().length() < 25  && Address.trim().length() > 3 )
           this.Address = Address;
       else{
           Messege+="-Address is Not Valid\n";
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
    
    
    
