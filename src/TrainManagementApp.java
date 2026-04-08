import java.util.*;

public class TrainManagementApp {

    public static void main(String[] args) {

        // Goods bogies: type and cargo
        List<String[]> bogies = new ArrayList<>();

        bogies.add(new String[]{"Cylindrical", "Petroleum"});
        bogies.add(new String[]{"Box", "Grains"});
        bogies.add(new String[]{"Cylindrical", "Petroleum"});
        bogies.add(new String[]{"Box", "Coal"});

        // Safety check using stream + allMatch
        boolean isSafe = bogies.stream().allMatch(bogie -> {
            String type = bogie[0];
            String cargo = bogie[1];

            // Rule: Cylindrical → only Petroleum
            if (type.equals("Cylindrical")) {
                return cargo.equals("Petroleum");
            }
            return true;
        });

        // Output
        if (isSafe) {
            System.out.println("Train is Safety Compliant");
        } else {
            System.out.println("Train is NOT Safety Compliant");
        }
    }
}