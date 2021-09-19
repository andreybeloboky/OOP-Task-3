package com.company;

public class Person {
    private String firstName;
    private String lastName;
    private int age = 18;
    private String say;

    /**
     *
     * @param firstName - the name person entered by the user;
     * @param lastName - the lastName person entered by the user;
     * @param age - the age person entered by the user;
     * @param say - the phrase person entered by the user;
     */
    public Person(String firstName, String lastName, int age, String say) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.say = say;
    }

    /**
     *
     * @param firstName - the name person entered by the user;
     * @param lastName - the lastName person entered by the user;
     */
    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    /**
     *
     * @return the string where person something says
     */
    public String say() {
        return new String(firstName + " " + lastName + " age " + age + " said: " + say);
    }

    /**
     *
     * @return the string wherein description condition person
     */
    public String move() {
        return new String(firstName + " " + lastName + " " + "move");
    }
}
