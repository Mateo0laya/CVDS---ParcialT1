import static org.junit.Assert.*;
import org.junit.Test;

public class FizzBuzzTest {
	/**
     * 1- Equivalence Class: Numbers(n) out of the range (n<1 || n>100)
     * 2- Equivalence Class: Numbers multiple of 3 or that contain 3
     * 3- Equivalence Class: Numbers multiple of 5 or that contain 5
     * 4- Equivalence Class: Numbers multiples of 3 and 5 or that contain 3 and 5
     * 5- Equivalence Class: Numbers that aren´t multiple or 3 or 5 and numbers that not contain 3 or 5 
     */

    FizzBuzz FizzBuzz = new FizzBuzz();
    
    /** @Test
    public void ShouldThrowsExceptionWhenNumberOutOfRange() {
         //arrange
        String expectedResult = FizzBuzzException("NUMBER_OUT_OF_RANGE").getMessage();
        int number = 0;

         //action
        try {
            String result = FizzBuzz.FizzBuzzCalculate(number);
        } catch (Exception e){
            //assert
            assertEquals(expectedResult, e.getMessage());
        }
    }
	*/
    
    @Test
    public void ShouldReturnFizzWhenNumberIsMultipleOfThree() {
        //arrange
        String expectedResult = "Fizz";
        int number = 42;

        //action
        try {
            String result = FizzBuzz.FizzBuzzCalculate(number);
            assertEquals(expectedResult, result);
        } catch (Exception e){
            assertEquals(true, false);
        }
    }

    @Test
    public void ShouldReturnFizzWhenNumberContainsThree() {
         //arrange
        String expectedResult = "Fizz";
        int number = 31;

         //action
        try {
            String result = FizzBuzz.FizzBuzzCalculate(number);
            assertEquals(expectedResult, result);
        } catch (Exception e){
            assertEquals(true, false);
        }
    }

    @Test
    public void ShouldReturnBuzzWhenNumberIsMultipleOfFive() {
        //arrange
        String expectedResult = "Buzz";
        int number = 70;

         //action
        try {
            String result = FizzBuzz.FizzBuzzCalculate(number);
            assertEquals(expectedResult, result);
        } catch (Exception e){
            assertEquals(true, false);
        }
    }

    @Test
    public void ShouldReturnBuzzWhenNumberContainsFive() {
         //arrange
        String expectedResult = "Buzz";
        int number = 95;

        //action
        try {
            String result = FizzBuzz.FizzBuzzCalculate(number);
            assertEquals(expectedResult, result);
        } catch (Exception e){
            assertEquals(true, false);
        }
    }

    @Test
    public void ShouldReturnFizzBuzzWhenNumberIsMultipleOfThreeAndFive() {
         //arrange
        String expectedResult = "FizzBuzz";
        int number = 60;

        //action
        try {
            String result = FizzBuzz.FizzBuzzCalculate(number);
            assertEquals(expectedResult, result);
        } catch (Exception e){
            assertEquals(true, false);
        }
    }

    @Test
    public void ShouldReturnFizzBuzzWhenNumberContainsThreeAndFive() {
         //arrange
        String expectedResult = "FizzBuzz";
        int number = 53;

        //action
        try {
            String result = FizzBuzz.FizzBuzzCalculate(number);
            assertEquals(expectedResult, result);
        } catch (Exception e){
            assertEquals(true, false);
        }
    }

    @Test
    public void ShouldReturnTheNumberWhenNumberArentMultipleOrNotcontaisnThreeAndFive() {
        //arrange
        String expectedResult = "84";
        int number = 84;

        //action
        try {
            String result = FizzBuzz.FizzBuzzCalculate(number);
            assertEquals(expectedResult, result);
        } catch (Exception e){
            assertEquals(true, false);
        }
    }
}
