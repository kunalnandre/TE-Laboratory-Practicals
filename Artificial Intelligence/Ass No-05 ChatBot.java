import java.util.*;
public class ChatBot {
    public static void main(String[] args) {
        chatBotSystem();
    }

    static void chatBotSystem(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your Name : ");
        String name = sc.nextLine();
        System.out.println("Hello " + name + " Welcome to MET-Restaurent\n");
        System.out.println("What would you like to order " +  name +" \n");

        String  menuOptions[] = {"Rice-Plate", "Samosa", "Vada-Pava", "Chole-Bhature", "Pohe"};
        int qCount[] = new int[menuOptions.length];
        while (true) {
            for(int i = 0; i < menuOptions.length;  i++){
                System.out.println("Option " + (i+1) + " : " + menuOptions[i]);
            }

            System.out.print("\nI would like to have option : " );
            int opt = sc.nextInt();
            if(opt > menuOptions.length){
                System.out.print("Display relevent query\n");
                continue;
            }
            System.out.println("\nYou Confirm order : " + menuOptions[opt-1]);
            qCount[opt-1]++;
            if(qCount[opt-1] >= 5) break;

            System.out.print("Do you want anything else (yes/no): ");

            sc.nextLine();
            String order = sc.nextLine();
            System.out.println();
            if(order.toUpperCase().equals("YES")) continue;
            else break;
        }
        yourOrder(menuOptions, qCount);
        System.out.println("\nYour total bill is "+totalBill(qCount));
        System.out.println("\nThanks for your order!");
        sc.close();
    }

    static int totalBill(int[] qCount){
        int ans = 0;
        int[] prize = {50, 25, 25, 55, 25};
        for(int i = 0; i < qCount.length; i++){
            ans += qCount[i]*prize[i];
        }
        return ans;
    }

    static void yourOrder(String[] menuOptions, int[] qCount){
        System.out.println("Your Order is : ");
        for(int i = 0; i < qCount.length; i++){
            if(qCount[i] > 0){
                System.out.println(menuOptions[i] + " " + qCount[i]);
            }
        }
    }
}


// 1
// yes
// 2
// yes
// 2
// yes
// 3
// yes
// 5
// no
