package test.java;

import fizzBuzz.FizzBuzzConverter;
import org.junit.Assert;
import org.junit.Test;


public class FizzBuzzTest{

    @Test
    public void fizzBuzzConverterLeavesNormalNumberAlone()
    {
     FizzBuzzConverter fizzBuzz = new FizzBuzzConverter();

     Assert.assertEquals("1", fizzBuzz.convert(1));
     Assert.assertEquals("2", fizzBuzz.convert(2));

    }

    @Test
    public void fizzBuzzConverterMultiplesOfThree()
    {
        FizzBuzzConverter fizzBuzz  = new FizzBuzzConverter();

        Assert.assertEquals("Fizz", fizzBuzz.convert(3));

    }

    @Test
    public void fizzBuzzConverterMultiplesOfBothThreeAndFive()
    {
        FizzBuzzConverter fizzBuzz  = new FizzBuzzConverter();

        Assert.assertEquals("FizzBuzz", fizzBuzz.convert(15));

    }

}
