/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Student
 */
public class SBW {
    
    private static SBW instance;

    
    private String name = "Swastik Bakery Works";
    private String address = "Margao Goa";
    private String phone_no = "9876543250";
    private String email_id = "kp1234@gmail.com";

    
       
private SBW(){
}

 static SBW getInstance(){
   if(instance==null)
      instance = new SBW();
   return instance;
}

public void getSBWdetails(){
System.out.println("___________________________________");
System.out.println(name);
System.out.println("******************");
System.out.println(address);
System.out.println("******************");
System.out.println(phone_no);
System.out.println("******************");
System.out.println(email_id);
System.out.println("___________________________________");
}
}