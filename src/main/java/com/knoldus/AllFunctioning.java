package com.knoldus;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static java.lang.Integer.min;

/**
 * AllFunctioning class has such methods through which we can demonstrate the use of streams and the implementation of
 * Functional Interface
 */
public class AllFunctioning {
    /**
     * Implementation of Functional Interface
     */
    FunctionalInterface concatenate = (String first, String second, String third, String fourth, String fifth) ->
            first + second + third + fourth + fifth;

    /**
     * citiesStartingWithC is a method that takes list of Cities as input, traverses it, finds the name of the cities
     * starting from letter C and then returns a list containing the name of all those cities that have been filtered
     * out.
     *
     * @param listOfCities It is a list of String that contains the name of the cities.
     * @return It returns a list of String that has the names of cities that starts with letter c.
     */
    List<String> citiesStartingWithC(List<String> listOfCities) {
        return listOfCities
                .stream()
                .filter(city -> city.startsWith("C") || city.startsWith("c"))
                .sorted()
                .collect(Collectors.toList());
    }

    /**
     * product method takes two list of Integer as input and give the product of corresponding elements and stores it in
     * a list of Integer.
     *
     * @param listOne first list of Integer
     * @param listTwo second list of Integer
     * @return It returns a list of integer that contains the product of the corresponding elements of a two lists.
     */
    List<Integer> product(List<Integer> listOne, List<Integer> listTwo) {
        return IntStream
                .range(0, min(listOne.size(), listTwo.size()))
                .map(index -> listOne.get(index) * listTwo.get(index))
                .boxed()
                .collect(Collectors.toList());
    }

    /**
     * userAboveEighteenAndDelhi method takes list of User as input and filter out the users whose age is above
     * eighteen and who also lives in Delhi.
     *
     * @param users It is the list of User.
     */
    void usersAboveEighteenAndDelhi(List<User> users) {
        users
                .stream()
                .filter(user -> Integer.parseInt(user.age) > 18 && user.address.equals("Delhi"))
                .forEach(user -> {
                            System.out.println("User whose age is more than 18 and lives in Delhi");
                            System.out.println(user.id + " " + user.name + " " + user.age + " " + user.address);
                        }
                );
    }

    /**
     * userId is the method that takes list of User as input and filter out the users whose age is less than 20 and
     * whose id is greater than 10.
     *
     * @param users It is the list of User.
     */
    void usersId(List<User> users) {
        users
                .stream()
                .filter(user -> Integer.parseInt(user.age) < 20 && user.id > 10)
                .forEach(user -> {
                            System.out.println("User whose age is less than 20 and user id greater than 10");
                            System.out.println(user.id + " " + user.name + " " + user.age + " " + user.address);
                        }
                );
    }

    /**
     * ageEven method takes a list of User as input and filter out the user whose age is even.
     *
     * @param users It is the list of User.
     */
    void ageEven(List<User> users) {
        users
                .stream()
                .filter(user -> Integer.parseInt(user.age) % 2 == 0)
                .forEach(user -> {
                            System.out.println("User with even age");
                            System.out.println(user.id + " " + user.name + " " + user.age + " " + user.address);
                        }
                );
    }

    /**
     * ageEighteenAndDelhi method takes a list of User as input and filter out the users whose age is 18 and also lives
     * in Delhi.
     *
     * @param users It is the list of User.
     */
    void ageEighteenAndDelhi(List<User> users) {
        users
                .stream()
                .filter(user -> Integer.parseInt(user.age) == 18 && user.address.equals("Delhi"))
                .forEach(user -> {
                            System.out.println("User whose age is eighteen and lives in delhi");
                            System.out.println(user.id + " " + user.name + " " + user.age + " " + user.address);
                        }
                );
    }
}