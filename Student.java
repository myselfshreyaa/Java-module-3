class InvalidAgeException extends Exception {
    public InvalidAgeException(String str) {
        super(str);
    }
}

public class Student {

    static void validate(int age) throws InvalidAgeException {
        if (age < 17) {
            throw new InvalidAgeException(
                "Age must be at least 17 for registration"
            );
        } else {
            System.out.println("Eligible for registration");
        }
    }

    public static void main(String[] args) {
        try {
            validate(18);
        } catch (InvalidAgeException e) {
            System.out.println(e.getMessage());
        }
    }
}
