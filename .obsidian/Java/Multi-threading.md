## Synchronisation


```Java
import java.util.HashMap;  
  
class ATM{  
    HashMap<String, Integer> customers = new HashMap<>();  
    synchronized void checkBalance(String name){  
        System.out.println("\n" + name + " checking... ");  
        try {Thread.sleep(1000);} catch (Exception e){}  
        System.out.println(name + " balance is: " + customers.get(name));  
    }  
    synchronized void withdraw(String name, int amount){  
        System.out.println("\n" + name + " withdrawing... ");  
        try {Thread.sleep(1000);} catch (Exception e){}  
        int balance = customers.get(name);  
        balance -= amount;  
        customers.replace(name, balance);  
        System.out.println(name + " new balance is: " + balance);  
    }  
    public void addCustomer(String name, int balance){  
        customers.put(name, balance);  
    }  
}  
class Customer extends Thread{  
    ATM atm;  
    String name;  
    int balance,amount;  
    public Customer(String name, int balance, int amount, ATM atm){  
        this.name = name;  
        this.balance = balance;  
        this.atm = atm;  
        this.amount = amount;  
        atm.addCustomer(name, balance);  
    }  
    public void useATM(){  
        atm.checkBalance(name);  
        atm.withdraw(name, amount);  
    }  
    @Override  
    public void run(){  
        useATM();  
    }  
}  
  
public class Main {  
    public static void main(String[] args) {  
        ATM atm = new ATM();  
        Customer c1 = new Customer("Bob", 1234, 100, atm);  
        Customer c2 = new Customer("Steve", 2228, 500, atm);  
        Customer c3 = new Customer("John", 1488, 400, atm);  
        c1.start();  
        c2.start();  
        c3.start();  
    }  
}
```
## Monitor. Daemon. join and yield