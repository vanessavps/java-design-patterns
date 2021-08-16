package com.vanessavps.patterns.creational.builder;

public class User {
  //Required attributes
  private final String firstName;
  private final String lastName;

  //Optional attributes
  private final int age;
  private final String phone;
  private final String address;

  //Make the constructor private to prevent this class to be instantiated without using the builder process
  private User(UserBuilder builder) {
    this.firstName = builder.firstName;
    this.lastName = builder.lastName;
    this.age = builder.age;
    this.phone = builder.phone;
    this.address = builder.address;
  }

  //There is no setter. We will use the Builder class to set the values
  public String getFirstName() {
    return firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public int getAge() {
    return age;
  }

  public String getPhone() {
    return phone;
  }

  public String getAddress() {
    return address;
  }

  @Override
  public String toString() {
    return "User: " +
           this.firstName +
           " " +
           this.lastName +
           ", " +
           this.age +
           " years, phone: " +
           this.phone +
           ", address: " +
           this.address;
  }

  public static class UserBuilder {
    private final String firstName;
    private final String lastName;
    private int age;
    private String phone;
    private String address;

    //Constructor with the required fields
    public UserBuilder(String firstName, String lastName) {
      this.firstName = firstName;
      this.lastName = lastName;
    }

    //These are the methods used to set the value
    public UserBuilder withAge(int age) {
      this.age = age;
      return this;
    }

    public UserBuilder withPhone(String phone) {
      this.phone = phone;
      return this;
    }

    public UserBuilder withAddress(String address) {
      this.address = address;
      return this;
    }

    //The built User object is returned
    public User build() {
      return new User(this);
    }
  }

}
