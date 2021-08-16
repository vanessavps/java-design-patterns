package com.vanessavps.patterns.creational.builder;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class UserTest {

  @Test
  public void testUserBuilderClass() {
    //You can set up all info at once when you create the builder instance
    User homerUser = new User.UserBuilder("Homer", "Simpson")
            .withAge(40)
            .withPhone("(913) 1122-3344")
            .withAddress("742 Evergreen Terrace")
            .build();

    //Or you can set up the info between codes
    User.UserBuilder margeUserBuilder = new User.UserBuilder("Marge", "Simpson")
            .withAge(38);

    String margePhone = homerUser.getPhone();
    margeUserBuilder.withPhone(margePhone);

    String margeAddress = homerUser.getAddress();
    margeUserBuilder.withAddress(margeAddress);

    //Now you build the user
    User margeUser = margeUserBuilder.build();

    assertEquals("User: Homer Simpson, 40 years, phone: (913) 1122-3344, address: 742 Evergreen Terrace",
                 homerUser.toString());
    assertEquals("User: Marge Simpson, 38 years, phone: (913) 1122-3344, address: 742 Evergreen Terrace",
                 margeUser.toString());
  }

}
