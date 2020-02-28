package com.knoldus;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static java.lang.Integer.min;

public class AllFunctioning {
    FunctionalInterface concatenate = (String first, String second, String third, String fourth, String fifth) ->
            first + second + third + fourth + fifth;

    List<String> citiesStartingWithC(List<String> listOfCities) {
        return listOfCities
                .stream()
                .filter(city -> city.startsWith("C") || city.startsWith("c"))
                .sorted()
                .collect(Collectors.toList());
    }

    List<Integer> product(List<Integer> listOne, List<Integer> listTwo) {
        return IntStream
                .range(0, min(listOne.size(), listTwo.size()))
                .map(index -> listOne.get(index) * listTwo.get(index))
                .boxed()
                .collect(Collectors.toList());
    }

    void usersAboveEighteenAndDelhi(List<User> users) {
        users
                .stream()
                .filter(user -> Integer.parseInt(user.age) > 18 && user.address.equals("Delhi"))
                .forEach(user -> {
                    System.out.println("User whose age is more than 18 and lives in Delhi");
                    System.out.println(user.id + " " + user.name + " " + user.age + " " + user.address);}
                    );
    }

    void usersId(List<User> users) {
        users
                .stream()
                .filter(user -> Integer.parseInt(user.age) < 20 && user.id > 10)
                .forEach(user ->{
                    System.out.println("User whose age is less than 20 and user id greater than 10");
                    System.out.println(user.id + " " + user.name + " " + user.age + " " + user.address);}
                    );
    }

    void ageEven(List<User> users) {
        users
                .stream()
                .filter(user -> Integer.parseInt(user.age) % 2 == 0)
                .forEach(user ->{
                    System.out.println("User with even age");
                    System.out.println(user.id + " " + user.name + " " + user.age + " " + user.address);}
                    );
    }

    void ageEighteenAndDelhi(List<User> users) {
        users
                .stream()
                .filter(user -> Integer.parseInt(user.age) == 18 && user.address.equals("Delhi"))
                .forEach(user -> {
                    System.out.println("User whose age is eighteen and lives in delhi");
                    System.out.println(user.id + " " + user.name + " " + user.age + " " + user.address);}
                    );
    }
}