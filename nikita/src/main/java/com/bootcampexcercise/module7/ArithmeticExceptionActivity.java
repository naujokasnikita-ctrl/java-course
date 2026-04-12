package com.bootcampexcercise.module7;

public class ArithmeticExceptionActivity {
    //the main method
    public static void main(String args[]) {
        //we create instance
        ArithmeticExceptionActivity activity = new ArithmeticExceptionActivity();
        
        // triggering exception
        activity.catchMe(10, 0);

        activity.catchMe(10, 2);
    }

    void catchMe(int num1, int num2) {
        try {
            int result = num1 / num2;
            System.out.println("result of division is: " + result);
        } catch (ArithmeticException a) {
            // This runs only if num2 is 0
            System.out.println("You can't divide a number by zero!");
        } finally {
           // works every time we use the code
            System.out.println("Thank you for using this program.");
        }
    }
}
//Division by Zero :
//You can't divide a number by zero!
//Thank you for using this program.
//
//Valid Division :
//result of division is: 5
//Thank you for using this program.
