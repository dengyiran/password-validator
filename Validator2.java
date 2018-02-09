

public class Validator2 {

   private String password;

   public Validator2(String password){
      this.password = password;
   }

   // prints the message
   public boolean result(){
	   String regex="[A-Za-z0-9]*";
      if(password.length()>8&&!password.equals("password")&&password.matches(regex))
      return true;
      return false;
   }    
} 
