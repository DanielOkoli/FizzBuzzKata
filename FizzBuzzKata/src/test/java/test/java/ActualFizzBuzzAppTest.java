package test.java;

import fizzBuzz.FizzBuzzConverter;
import org.junit.Assert;
import org.junit.Test;

public class ActualFizzBuzzAppTest {

    @Test
    public void outputTheSixFizzBuzzes(){

        FizzBuzzConverter fizzBuzz = new FizzBuzzConverter();
        StringBuilder output = new StringBuilder();

        for(int i = 0; i <= 6; i++)
        {
            output.append(" ").append(fizzBuzz.convert(i)).append(",");
        }

        Assert.assertEquals(" FizzBuzz, 1, 2, Fizz, 4, Buzz, Fizz,", output.toString());
    }

    @Test
    public void outputTheHundredFizzBuzzes(){

        FizzBuzzConverter fizzBuzz = new FizzBuzzConverter();
        for(int i = 0; i <= 100; i++)
        {
            System.out.println(fizzBuzz.convert(i));
        }
    }

}
