interface Command {
    void execute();
}

public class Main {

    public static void main(String[] args) {
        Stock stock = new Stock();
        Broker broker = new Broker();

        Command buyCommand = new BuyCommand(stock);
        broker.setCommand(buyCommand);
        broker.executeCommand();

        Command sellCommand = new SellCommand(stock);
        broker.setCommand(sellCommand);
        broker.executeCommand();
    }
}

class Stock {

    public void buy() {
        System.out.println("Stock was bought");
    }

    public void sell() {
        System.out.println("Stock was sold");
    }
}

class BuyCommand implements Command {
    private Stock stock;

    public BuyCommand(Stock stock) {
        this.stock = stock;
    }

    @Override
    public void execute() {
        stock.buy();
    }

    /* write your code here */
}

class SellCommand implements Command {
    private Stock stock;

    public SellCommand(Stock stock) {
        this.stock = stock;
    }

    @Override
    public void execute() {
        stock.sell();
    }

    /* write your code here */
}

class Broker {
    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public void executeCommand() {
        command.execute();
    }
}