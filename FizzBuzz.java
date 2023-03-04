
public class FizzBuzz {
	
	public String FizzBuzzCalculate(int number) throws FizzBuzzException{
        if(number < 1 || number > 100){
            throw new FizzBuzzException("NUMBER_OUT_OF_RANGE");
        }
        if(Multiple3And5(number) || Contains3And5(number)){
            return "FizzBuzz";
        } else if(Multiple3(number) || Contains3(number)){
            return "Fizz";
        } else if(Multiple5(number) || Contains5(number)){
            return "Buzz";
        } else {
            return "number";
        }
    }

    private boolean Multiple3(int number) {
        return (number % 3 == 0) ? true : false;
    }

    private boolean Multiple5(int number) {
        return (number % 5 == 0) ? true : false;
    }

    private boolean Multiple3And5(int number) {
        return (Multiple3(number) && Multiple5(5)) ? true : false;
    }

    private boolean Contains3(int number) {
        int div = 10;
        int tens = number/div;
        if(number < 10){
            return (number == 3) ? true : false;
        } else {
            return ((number%10 == 3) || (tens == 3)) ? true : false;
        }
    }
    
    private boolean Contains5(int number) {
        int div = 10;
        int tens = number/div;
        if(number < 10){
            return (number == 3) ? true : false;
        } else {
            return ((number%10 == 5) || (tens == 5)) ? true : false;
        }
    }

    private boolean Contains3And5(int number) {
        if(number < 10){
            return (number == 3) ? true : false;
        } else {
            return (Contains3(number) && Contains5(number)) ? true : false;
        }
    }
}
