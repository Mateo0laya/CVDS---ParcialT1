import java.io.Serializable;

public class FizzBuzzException extends Exception implements Serializable{
    public static String NUMBER_OUT_OF_RANGE = "The number is less than one or greater than one hundred";

    public FizzBuzzException(String exception){
        super(exception);
    }
}
