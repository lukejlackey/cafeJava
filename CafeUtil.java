import java.util.ArrayList;
import java.util.Arrays;

public class CafeUtil {
    public int getStreakGoal(int numWeeks){
        int count = 0;
        for(int i = 1; i <= numWeeks; i++){
            count += i;
        }
        return count;
    }

    public double getOrderTotal(double[] prices){
        double totalPrice = 0;
        for(double price : prices){
            totalPrice += price;
        }
        return totalPrice;
    }

    public void displayMenu(ArrayList<String> menuItems){
        for(int i = 0; i < menuItems.size(); i++){
            System.out.println(i + " " + menuItems.get(i));
        }
    }

    public void addCustomer(ArrayList<String> customers){
        System.out.println("Please enter your name:");
        String userName = System.console().readLine();
        System.out.println("Hello, " + userName);
        System.out.printf("There are %d people in front of you.", customers.size());
        customers.add(userName);
        System.out.println(customers);
    }
}