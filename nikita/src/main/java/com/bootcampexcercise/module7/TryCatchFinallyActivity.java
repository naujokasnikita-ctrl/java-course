package com.bootcampexcercise.module7;

public class TryCatchFinallyActivity {
    public static void main(String[] args) {
        // we call the method
        TryCatchFinallyActivity activity = new TryCatchFinallyActivity();
        activity.catchMeIfYouCan();

    }
    //we crate a list
    void catchMeIfYouCan() {
        int[] arr = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        //
        try {// we use <=10 not <10 to activate the exception
            for (int i = 0; i <= 10; i++) {
                // This will succeed for indices 0-9, but fail when i becomes 10
                System.out.println("Door: " + arr[i]);
            }
        }
        catch (IndexOutOfBoundsException e) {
            System.out.println("Opa opa who do we have here");}
        finally {System.out.println("your done for ");
        }
    }
}
//Door: 0
//Door: 1
//Door: 2
//Door: 3
//Door: 4
//Door: 5
//Door: 6
//Door: 7
//Door: 8
//Door: 9
//Opa opa who do we have here
//your done for
