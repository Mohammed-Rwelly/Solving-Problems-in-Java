import java.util.*;
public class Main
{
    public double globalbalance=0;
    public void deposte(double mount){
        globalbalance=mount;
        
    }
    public  void withdraw(double withdrawAmount){
        if (withdrawAmount > globalbalance)
           System.out.println("Withdrawal amount exceeded account balance");
        else
           globalbalance-=withdrawAmount;
            
        }
    public double balance(){
        return globalbalance;
    }
  public static void main(String[] args) {
    Main a= new Main();
    Scanner sc= new Scanner(System.in);
    System.out.println("Please enter the operation you want to perform( 1 = Deosite , 2 = Withdraw , 3= Show balance , 4 = Quit");
    int index= sc.nextInt(); 
    while (index >=1 || index <= 4){
        if (index==1){
            System.out.println("Please enter the desired amount!");
            double amount=sc.nextDouble();
            a.deposte(amount);
        }
        else if ( index==2){
            System.out.println("Please enter the amount you want to withdraw");
            double amountwithdraw=sc.nextDouble();
            a.withdraw(amountwithdraw);
        }
        else if (index ==3 ){
           System.out.println(a.balance());
        }
        else if (index ==4 ){
            break;
        }
        System.out.println("Please enter the operation you want to perform( 1 = Deosite , 2 = Withdraw , 3= Show balance , 4 = Quit");
        index= sc.nextInt();
            
    }
  }
}