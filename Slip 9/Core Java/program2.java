import java.util.*;

class program2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter PAN number: ");
        String pan = scanner.next();
        System.out.print("Enter mobile number: ");
        String mobile = scanner.next();
        scanner.close();
        try {
            validatePAN(pan);
            validateMobile(mobile);
            System.out.println("Valid PAN and mobile numbers");
        } catch (InvalidDataException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void validatePAN(String pan) throws InvalidDataException {
        if (!pan.matches("[A-Z]{5}[0-9]{4}[A-Z]{1}")) {
            throw new InvalidDataException("Invalid PAN number");
        }
    }

    public static void validateMobile(String mobile) throws InvalidDataException {
        if (!mobile.matches("\\+\\d{1,3}-\\d{4}-\\d{6}")) {
            throw new InvalidDataException("Invalid mobile number");
        }
    }
}

class InvalidDataException extends Exception {
    public InvalidDataException(String message) {
        super(message);
    }
}
