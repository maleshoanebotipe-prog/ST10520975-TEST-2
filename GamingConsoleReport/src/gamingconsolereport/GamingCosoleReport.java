package gamingconsolereport;

        
   
 
    public class GamingCosoleReport {
    public static void main(String[] args) {
        String[] cities = {"CAPE TOWN", "PORT ELIZABETH", "PRETORIA"};
        String[] consoles = {"PS5", "XBOX", "SWITCH"};
        int[][] sales = {
            {1000, 2000, 3000},
            {2000, 3000, 4000},
            {1500, 1100, 1200}
        };
        int[] totals = new int[cities.length];
        int maxIndex = 0;

        String line = "-".repeat(60);
        System.out.println(line);
        System.out.println("GAMING CONSOLE REPORT");
        System.out.println(line);

        System.out.printf("%-20s", "");
        for (String c : consoles) System.out.printf("%-10s", c);
        System.out.println();

        for (int i = 0; i < cities.length; i++) {
            System.out.printf("%-20s", cities[i]);
            for (int j = 0; j < consoles.length; j++) {
                System.out.printf("%-10d", sales[i][j]);
                totals[i] += sales[i][j];
            }
            System.out.println();
            if (totals[i] > totals[maxIndex]) maxIndex = i;
        }

        System.out.println(line);
        System.out.println("CONSOLE SALES TOTALS FOR EACH CITY");
        System.out.println(line);
        for (int i = 0; i < cities.length; i++) {
            System.out.printf("%-20s%d%n", cities[i], totals[i]);
        }

        System.out.println(line);
        System.out.println("CITY WITH THE MOST SALES: " + cities[maxIndex]);
        System.out.println(line);
    }
}
    }
    

