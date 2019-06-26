/*
 * maven-hibernate-validation
 *
 * Copyright (c) 2019
 * All rights reserved
 * Written by od3ng created on 6/25/19 9:33 PM
 * Blog    : sinaungoding.com
 * Email   : lepengdados@gmail.com
 * Github  : 0d3ng
 * Hp      : 085878554150
 */

package com.odeng.mavenhibernatevalidation.entitas;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;
import java.util.Iterator;
import java.util.Set;

public class BukuTest {
    private static Validator validator;

    @Before
    public void setUp() {
        ValidatorFactory validatorFactory = Validation.buildDefaultValidatorFactory();
        validator = validatorFactory.getValidator();
    }

    @Test
    public void testBuku() {
        Buku buku = new Buku(null, "Mencari Anak Di Negeri Arah", "Noprianto", "Andi Press", 1990, "1234567890123");
        Set<ConstraintViolation<Buku>> validate = validator.validate(buku);

        for (ConstraintViolation<Buku> bukuConstraintViolation : validate) {
            System.out.println(bukuConstraintViolation.getMessage());
        }
        assertEquals(validate.size(),0);
    }
}
