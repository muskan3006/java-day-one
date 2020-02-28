package com.knoldus;

/**
 * User class has 4 fields id,name,age and address and it can be used to create objects of User that can contain such
 * data.
 */
public class User {
    Integer id;
    String name;
    String age;
    String address;

    /**
     * constructor of class User
     *
     * @param id      User's id
     * @param name    User's name
     * @param age     User's age
     * @param address User's address
     */
    public User(Integer id, String name, String age, String address) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.address = address;
    }


}
