package com.pocketxtra.pxefms.util;
import java.util.Random;

public class Utils {

    // Generate a 4-digit OTP
    public static String generateOtp() {
        Random random = new Random();
        int otp = 1000 + random.nextInt(9000); // Generates a number between 1000 and 9999
        return String.valueOf(otp);
    }

}
