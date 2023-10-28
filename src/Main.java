import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("cities.csv"));

        List<City> cities = new ArrayList<>();

        while(sc.hasNextLine()) {
            String line = sc.nextLine();
            String[] parts = line.split(";");

//            if (parts.length != 6) {
//                continue;
//            }

            String name = parts[1];
            String region = parts[2];
            String district = parts[3];
            int population = Integer.parseInt(parts[4]);
            String foundation = parts[5];

            City city = new City(name, region, district, population, foundation);
            cities.add(city);
        }
        sc.close();

        for (City city : cities) {
            System.out.println(city);
        }
    }
}