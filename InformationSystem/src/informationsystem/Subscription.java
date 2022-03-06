package informationsystem;

import java.util.Date;

public class Subscription {
    
    private Date subscriptionStartDate;
    private SubscriptionPlan subscriptionPlan;

    public Subscription(Date subscriptionStartDate, SubscriptionPlan subscriptionPlan) {
        
        this.subscriptionStartDate = subscriptionStartDate;
        this.subscriptionPlan = subscriptionPlan;
    }

    public Date getSubscriptionStartDate() {
        return subscriptionStartDate;
    }

    public void setSubscriptionStartDate(Date subscriptionStartDate) {
        this.subscriptionStartDate = subscriptionStartDate;
    }

    public SubscriptionPlan getSubscriptionPlan() {
        
        return subscriptionPlan;
    }

    public void setSubscriptionPlan(SubscriptionPlan subscriptionPlan) {
        this.subscriptionPlan = subscriptionPlan;
    }

    @Override
    public String toString() {
        return "\nSubscription Start Date:  " + subscriptionStartDate + "\nSubscription Plan: " + subscriptionPlan + " " ;
    }
    
    
    
    
}
