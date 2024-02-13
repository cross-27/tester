package tests;

import model.User;
import utils.TestUtils;

public class UserTest {
    public static void testUserConstructor() {
        String test_username = "mike";
        String test_password = "my_password";
        String test_first_name = "Mike";
        String test_last_name = "Smith";
        String test_mobile_number = "07771234567";

        User testUser = new User(test_username, test_password, test_first_name, test_last_name, test_mobile_number);

        if (testUser.getUsername() == test_username)
            System.out.println(TestUtils.TEXT_COLOR_GREEN + "TC1-getUsername-Passed" + TestUtils.TEXT_COLOR_RESET);
        else
            System.out.println(TestUtils.TEXT_COLOR_RED + "TC1-getUsername-FAILED" + TestUtils.TEXT_COLOR_RESET);

        if (testUser.getPassword() == test_password)
            System.out.println(TestUtils.TEXT_COLOR_GREEN + "TC2-getPassword-Passed" + TestUtils.TEXT_COLOR_RESET);
        else
            System.out.println(TestUtils.TEXT_COLOR_RED + "TC2-getPassword-FAILED" + TestUtils.TEXT_COLOR_RESET);

        if (testUser.getFirst_name() == test_first_name)
            System.out.println(TestUtils.TEXT_COLOR_GREEN + "TC3-getFirst_Name-Passed" + TestUtils.TEXT_COLOR_RESET);
        else
            System.out.println(TestUtils.TEXT_COLOR_RED + "TC3-getFirst_Name-FAILED" + TestUtils.TEXT_COLOR_RESET);

        if (testUser.getLast_name() == test_last_name)
            System.out.println(TestUtils.TEXT_COLOR_GREEN + "TC4-getLast_Name-Passed" + TestUtils.TEXT_COLOR_RESET);
        else
            System.out.println(TestUtils.TEXT_COLOR_RED + "TC4-getLast_Name-FAILED" + TestUtils.TEXT_COLOR_RESET);

        if (testUser.getMobile_number() == test_mobile_number)
            System.out.println(TestUtils.TEXT_COLOR_GREEN + "TC5-getMobile_number-Passed" + TestUtils.TEXT_COLOR_RESET);
        else
            System.out.println(TestUtils.TEXT_COLOR_RED + "TC5-getMobile_number-FAILED" + TestUtils.TEXT_COLOR_RESET);

        System.out.println("All TC's passed.");

        //using assertions

        assert testUser.getUsername() == test_username;
        //assert 1==2;

        //TODO 4: add the other 4 assertions
        assert testUser.getPassword() == test_password;
        assert testUser.getFirst_name() == test_first_name;
        assert testUser.getLast_name() == test_last_name;
        assert testUser.getMobile_number() == test_mobile_number;



        System.out.println("All Java assertions in the test suite have passed (none failed)");
    }

    public static void main(String[] args) {
        testUserConstructor();
    }
}

