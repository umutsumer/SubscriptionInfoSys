package informationsystem;

public class CableProvider implements ServiceProvider {
    
    private String name;
    private SubscriptionPlan[] subscriptionPlans;
    private int count = 0;
    public CableProvider(String name) {
        this.name = name;
        this.subscriptionPlans = new SubscriptionPlan[10];
    }

    @Override
    public String getName() {
        return name;
    }
    
    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void addSubscriptionPlan(SubscriptionPlan subscriptionPlan) {
         int i = 0;
        while(i < subscriptionPlans.length && subscriptionPlans[i] != null)
            i++;
        
        if( i != subscriptionPlans.length)
            subscriptionPlans[i] = subscriptionPlan;
            subscriptionPlan.setServiceProvider(this);
            count ++;
    }

    @Override
    public String findSubscriptionPlan(String subscriptionPlan) {
        
        for(int i = 0; i<count ; i++){
            if(subscriptionPlans[i] != null && subscriptionPlans[i].getName().equals(subscriptionPlan)){
                System.out.println(subscriptionPlan + " PLAN IS AVAILABLE.");
                return subscriptionPlan;
                } 
            }
        return null;
       
    }

    @Override
    public String toString() { 
        String info;
        
        info = name + ", subscription plans are; \n";
        for(int i=0; i < count; i++){
            info += " " + subscriptionPlans[i].getName() + "\n" ; 
        }
        return info;
    }

    
    
    
}
