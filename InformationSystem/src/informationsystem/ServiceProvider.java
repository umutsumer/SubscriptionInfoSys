package informationsystem;

public interface ServiceProvider {
    
    public void addSubscriptionPlan(SubscriptionPlan subscriptionPlan);
    public String findSubscriptionPlan(String subscriptionPlan);
    
    public String getName();
    public void setName(String name);
}
