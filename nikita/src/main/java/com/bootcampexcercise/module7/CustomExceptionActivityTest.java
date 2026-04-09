package com.bootcampexcercise.module7;

public class CustomExceptionActivityTest {

        public static void main(String[] args) {
            CustomExceptionActivityTest test = new CustomExceptionActivityTest();

            // We put the try-catch here in the main method
            try {
                test.validateUser("John"); // This will succeed
                test.validateUser("Sergay"); // This will throw the exception

            } catch (CustomExceptionActivity e) {
                //catches the error
                System.out.println("Access Denied: " + e.getMessage());
            }
        }

        // Use 'throws' to pass the responsibility to the main method
        void validateUser(String name) throws CustomExceptionActivity {
            String[] validUsers = {"John", "Mike", "Shanti", "Stacie"};
            int flag = 0;

            for (int i = 0; i < validUsers.length; i++) {
                if (validUsers[i].equalsIgnoreCase(name)) {
                    flag = 1;
                    break;
                }
            }

            if (flag == 0) {
                // Throw the exception out of the method
                throw new CustomExceptionActivity();
            } else {
                System.out.println("Welcome to Payroll program, " + name + "!");
            }
        }
    }
//Welcome to Payroll program, John!
//Access Denied: You are not allowed to use this program
