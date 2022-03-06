package informationsystem;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;


public class InformationSystem {

public static void main(String[] args) throws ParseException {
    
    

    
    Date date = new Date();
    Scanner input = new Scanner(System.in);
    
    
    System.out.println("Enter GSM Service Provider: ");
    GSMProvider provider = new GSMProvider(input.nextLine());
    
    System.out.println("Number of subscription plans (1 - 50): ");
    int subplanno = input.nextInt();
    input.nextLine();
    
    for(int i =0 ; i < subplanno ; i++){
        System.out.println("Enter the plan No." +i+": ");
        
        SubscriptionPlan subs = new SubscriptionPlan(input.nextLine());
        provider.addSubscriptionPlan(subs);
        subs.setServiceProvider(provider);
    }
    
    
    
    System.out.println("----------------------------");
    
    System.out.println("Enter your citizenship number: ");
    String citizennr = input.nextLine(); 
    ExistingCustomer cust = new ExistingCustomer(citizennr);
    
    System.out.println("Enter your name: ");
    cust.setName(input.nextLine());
    
    System.out.println("Name of the plan to be subscribed: ");
    SubscriptionPlan sub = new SubscriptionPlan(input.nextLine());
   
   if(provider.findSubscriptionPlan(sub.getName()) == null){
       System.out.println("The plan you entered is not available.");
       PossibleCustomer p1 = new PossibleCustomer(citizennr);  
             
   }
   else{
   
    
    System.out.println("Start date for subscription (DD/MM/YYYY): ");
    String date3 = input.nextLine();
    Date date2 = new SimpleDateFormat("dd/MM/yyyy").parse(date3);
    Subscription subscription1 = new Subscription(date2,sub);
    sub.setServiceProvider(provider);
      
    System.out.println("\n-----Customer Information-----");
    System.out.println(cust);
    System.out.println("\n-----Subscription Details-----");
    System.out.println(subscription1);
       
   }
    
   
    
    

   }
    
}
