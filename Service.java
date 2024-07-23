import java.security.SecureRandom;

public class Service {

    private static final String CHARACTERS = "0123456789";
    private static final int OTP_LENGTH = 6;
    private SecureRandom random = new SecureRandom();

    public String generateOTP() {
        StringBuilder otp = new StringBuilder(OTP_LENGTH);
        for (int i = 0; i < OTP_LENGTH; i++) {
            otp.append(CHARACTERS.charAt(random.nextInt(CHARACTERS.length())));
        }
        return otp.toString();
    }

}
