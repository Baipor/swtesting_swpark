package swtesting;

public class FizzBuzz {

    public String say(int number) {
        String result = String.valueOf(number);
        if (evaluateFizzBuzz(number)) {
            result = "FizzBuzz";
        } else if (evaluateFizz(number)) {
            result = "Fizz";
        } else if (evaluateBuzz(number)) {
            result = "Buzz";
        }
        return result;
    }

    private boolean evaluateFizzBuzz(int number) {
        return evaluateFizz(number) && evaluateBuzz(number);
    }

    private boolean evaluateFizz(int number) {
        return number % 3 == 0;
    }

    private boolean evaluateBuzz(int number) {
        return number % 5 == 0;
    }

}
