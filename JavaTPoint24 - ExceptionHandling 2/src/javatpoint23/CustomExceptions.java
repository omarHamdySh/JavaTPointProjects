package javatpoint23;

/**
 *
 * @author abdo_
 */
public class CustomExceptions {

    /**
     * "InvalidAgeException" is checked exception, so we must use throws keyword
     * for manual propagation.
     */
    void validateAge(int age) throws InvalidAgeException {
        if (age < 10) {
            throw new InvalidAgeException();
        }
    }

    /**
     * "InvalidNameException" is unchecked exception, so we don't have to use
     * throws keyword, because it's automatically propagated.
     */
    void validateName(String name) {
        if (name.contains("0")
                || name.contains("1")
                || name.contains("2")
                || name.contains("3")
                || name.contains("4")
                || name.contains("5")
                || name.contains("6")
                || name.contains("7")
                || name.contains("8")
                || name.contains("9")) {
            throw new InvalidNameException();
        }
    }
}

/**
 * When an exception inherits "RuntimeException" or an exception of his
 * children, it will become an unchecked exception.
 *
 * This is checked exception:
 */
class InvalidAgeException extends Exception {

    public InvalidAgeException() {
    }

    public InvalidAgeException(String message) {
        super(message);
    }

    @Override
    public String toString() {
        return "Age is invalid!!";
    }
}

/**
 * When an exception inherits "RuntimeException" or an exception of his
 * children, it will be come an unchecked exception.
 *
 * This is unchecked exception:
 */
class InvalidNameException extends RuntimeException {

    public InvalidNameException() {
    }

    public InvalidNameException(String message) {
        super(message);
    }

    @Override
    public String toString() {
        return "Name is invalid!!";
    }
}
