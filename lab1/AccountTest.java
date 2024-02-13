package tests;

import model.Account;
import java.util.Date;

//TODO 5 : Test Account class

public class AccountTest {

    public static void testAccountConstructor() {
        String test_account_number = "40998721";
        String test_username_of_account_holder = "mike";
        String test_account_type = "saving";
        Date test_account_opening_date = new Date(2015, 6, 11);

        Account testAccount = new Account(test_account_number, test_username_of_account_holder, test_account_type, test_account_opening_date);

        assert testAccount.getAccount_number() == test_account_number;
        assert testAccount.getUsername_of_account_holder() == test_username_of_account_holder;
        assert testAccount.getAccount_type() == test_account_type;
        assert testAccount.getAccount_opening_date() == test_account_opening_date;

        System.out.println("testAccountConstructor: All Java assertions in the test suite have passed (none failed)");
    }

    public static void testSetters() {
        Account testAccount = new Account();

        //expected outcomes
        String expected_account_number = "1234";
        String expected_account_username = "mike";
        String expected_account_type = "saving";
        Date expected_account_opening_date = new Date(2015, 6, 11);

        //actual outcomes
        String actual_account_number = "1234";
        String actual_account_username = "mike";
        String actual_account_type = "saving";
        Date actual_account_opening_date = new Date(2015, 6, 11);

        //setters
        testAccount.setAccount_number(expected_account_number);
        testAccount.setUsername_of_account_holder(expected_account_username);
        testAccount.setAccount_type(expected_account_type);
        testAccount.setAccount_opening_date(expected_account_opening_date);

        //assertions
        assert testAccount.getAccount_number() == actual_account_number;
        assert testAccount.getUsername_of_account_holder() == actual_account_username;
        assert testAccount.getAccount_type() == actual_account_type;
        assert testAccount.getAccount_opening_date().equals(actual_account_opening_date);   //used .equals() since '==' was causing a false fail

        System.out.println("testSetters: All Java assertions in the test suite have passed (none failed)");

    }

    public static void main(String[] args) {
        testAccountConstructor();
        testSetters();
    }


}
