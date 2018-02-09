/*
* This class prints the given message on console.
*/
public class Validator {

   private String password;

   public Validator(String password){
      this.password = password;
   }

   // prints the message
   public boolean result(){
      if(password.length()>8&&!password.equals("password"))
      return true;
      return false;
   }   
   		
   
} 