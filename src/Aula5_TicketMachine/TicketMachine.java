
public class TicketMachine
{
    private int price;
    private int balance;
    private int total;

    public TicketMachine()
    {
        price = 10;
        balance = 0;
        total = 0;
    }
    
    public TicketMachine(int cost)
    {
        price = cost;
        balance = 0;
        total = 0;
    }

    
    public int getPrice()
    {
        return price;
    }

    
    public int getBalance()
    {
        return balance;
    }

    
    public void insertMoney(int amount)
    {
        if(amount > 0) {
            balance = balance + amount;
        }
        else {
            System.out.println("Use a positive amount rather than: " +
                               amount);
        }
    }

    
    public void printTicket()
    {
        if (balance < price)
        {
            System.out.println("You must insert at least: " +
                               (price - balance) + " more money.");
                    
        }
        
        while(balance >= price) {
            System.out.println("##################");
            System.out.println("# The BlueJ Line");
            System.out.println("# Ticket");
            System.out.println("# " + price + " cents.");
            System.out.println("##################");
            System.out.println();

           
            total += price;
            balance -= price;
            refundBalance();
        }
    }

    public void refundBalance()
    {
        System.out.println("Troco: "+balance);
        balance = 0;
    }
}
