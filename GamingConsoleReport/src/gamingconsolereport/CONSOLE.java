
package gamingconsolereport;



    import java.util.Scanner;

interface IConsoles {
    String getConsoleType();
    String getStore();
    int getTotalSales();
}

abstract class Consoles implements IConsoles {
    protected String consoleType, store;
    protected int totalSales;

    Consoles(String consoleType, String store, int totalSales) {
        this.consoleType = consoleType;
        this.store = store;
        this.totalSales = totalSales;
    }

    @Override
    public String getConsoleType() { return consoleType; }
    @Override
    public String getStore() { return store; }
    public int getTotalSales() { return totalSales; }

}

class ConsoleSales extends Consoles {
    ConsoleSales(String consoleType, String store, int totalSales) {
        super(consoleType, store, totalSales);
    }

    void printReport() {
        System.out.println("Console type: " + getConsoleType());
        System.out.println("Store name: " + getStore());
        System.out.println("Total sales: " + getTotalSales());
    }
}

public class CONSOLE {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] types = {"PS5", "XBOX", "SWITCH"};

        System.out.println("Select console: 1) PS5  2) XBOX  3) SWITCH");
        String type = types[in.nextInt() - 1];
        in.nextLine();
        System.out.print("Enter store name: ");
        String store = in.nextLine();
        System.out.print("Enter total sales: ");
        int sales = in.nextInt();

        new ConsoleSales(type, store, sales).printReport();
    }
}

