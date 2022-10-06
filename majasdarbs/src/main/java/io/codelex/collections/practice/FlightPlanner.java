package io.codelex.collections.practice;

import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

public class FlightPlanner {
    private static final Charset charset = Charset.defaultCharset();
    private static final String file = "/collections/flights.txt";

    public static void main(String[] args) throws IOException, URISyntaxException {
        final Path path = Paths.get(Histogram.class.getResource(file).toURI());
        List<String> flightList = Files.readAllLines(path, charset);
        List<String> cityList = new ArrayList<>(
                new HashSet<>(flightList.stream().map(a -> a.replaceAll(" ->\\s.*", "")).toList()));
        List<String> route = new ArrayList<>();
        Map<String, List<String>> flightMap = new HashMap<>();

        for (String city : cityList) {
            List<String> temp = new ArrayList<>();
            for (String flight : flightList) {
                if (flight.startsWith(city)) {
                    temp.add(flight);
                }
            }
            flightMap.put(city, temp);
        }


        System.out.println(flightMap.get("Honolulu"));


        Scanner scan = new Scanner(System.in);
        System.out.println("What would you like to do: ");
        System.out.println("To display list of the cities press 1");
        System.out.println("To exit program press #");

        while (true) {
            String choice = scan.nextLine();
            if (choice.equals("#")) {
                System.out.println("Goodbye");
                System.exit(0);
            } else if (choice.equals("1")) {
                System.out.println(cityList);
                break;
            } else {
                System.out.println("Invalid input");
            }
        }

        System.out.println("Select a city from which you would like to start :");
        travelList(cityList);

        int choice = scan.nextInt();
        String startPlace = cityList.get(checkInput(choice, cityList));
        List<String> flights = availableFlights(flightList, startPlace);
        route.add(destination(flights));
        while (true) {
            if (route.get(route.size() - 1).endsWith(startPlace)) {
                break;
            } else {
                String[] newPlace = route.get(route.size() - 1).split("->");
                flights = flightMap.get(newPlace[1].trim());
                route.add(destination(flights));
            }
        }

        System.out.println("Your chosen route is:");
        for (String flight : route) {
            System.out.println(flight);
        }


    }

    private static List<String> availableFlights(List<String> flightList, String city) {
        return flightList.stream().filter(a -> a.startsWith(city)).toList();
    }

    private static String destination(List<String> availableFlights) {
        Scanner innerScan = new Scanner(System.in);
        System.out.println("Where you want to go from here ?");
        travelList(availableFlights);
        int locationNum = innerScan.nextInt();
        checkInput(locationNum, availableFlights);
        return availableFlights.get(locationNum);
    }

    public static void travelList(List<String> cityList) {
        for (int i = 0; i < cityList.size(); i++) {
            System.out.println("Press " + i + " for " + cityList.get(i));
        }
    }

    public static int checkInput(int choice, List<String> list) {
        if (choice >= 0 && choice < list.size()) {
            return choice;
        } else {
            System.out.println("Invalid input");
            Scanner scan3 = new Scanner(System.in);
            return checkInput(scan3.nextInt(), list);
        }
    }


}
