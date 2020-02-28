package com.knoldus;

import java.util.Arrays;
import java.util.List;

public class AppDriver {

    public static void main(String[] args) {
        AllFunctioning worker = new AllFunctioning();

        System.out.println(worker.concatenate.concatenateStrings("rishi", "suman", "abby",
                "jojo", "joey"));

        List<String> listOfCities = Arrays.asList("Bhubneshwar", "Aberdeen", "Cincinnati", "Albuquerque", "Brasília",
                "Dallas–Fort Worth", "Cape Town");
        System.out.println(worker.citiesStartingWithC(listOfCities));

        List<Integer> listFirst = Arrays.asList(1, 3, 5, 7, 9);
        List<Integer> listSecond = Arrays.asList(2, 4, 6, 8, 10, 9, 6);
        System.out.println(worker.product(listFirst, listSecond));

        List<User> listOfUsers = Arrays.asList(new User(2, "Radha", "31", "Delhi"),
                new User(11, "Mohit", "14", "Delhi"),
                new User(18, "Radhika", "18", "Delhi"),
                new User(6, "Ram", "24", "Mumbai"),
                new User(16, "Pihu", "21", "Kolkata"));
        worker.usersAboveEighteenAndDelhi(listOfUsers);
        worker.usersId(listOfUsers);
        worker.ageEven(listOfUsers);
        worker.ageEighteenAndDelhi(listOfUsers);


    }
}
