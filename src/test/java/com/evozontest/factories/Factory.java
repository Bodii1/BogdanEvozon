package com.evozontest.factories;

import com.evozontest.entity.User;
import com.evozontest.utils.FieldGenerator;

public class Factory {

    public static User generateUser() {

        User user = new User();

        user.setFirstName(FieldGenerator.generateStringValue(10, FieldGenerator.TypeOfString.ALPHANUMERIC));
        user.setLastName(FieldGenerator.generateStringValue(10, FieldGenerator.TypeOfString.ALPHANUMERIC));
        user.setEmailAddress(FieldGenerator.generateStringValue(10, FieldGenerator.TypeOfString.ALPHANUMERIC) + "@bodii.ro");
        user.setPassword(FieldGenerator.generateStringValue(10, FieldGenerator.TypeOfString.ALPHANUMERIC));

        return user;
    }
}
