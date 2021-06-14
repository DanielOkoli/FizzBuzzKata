package fizzBuzz;

public class FizzBuzzConverter {

    public String convert(int toConvertFirstBuzz)
    {
        if(toConvertFirstBuzz % 3 == 0 && toConvertFirstBuzz % 5 == 0){
            return "FizzBuzz";
        }
        if(toConvertFirstBuzz % 5 == 0){
            return "Buzz";
        }
        if(toConvertFirstBuzz % 3 == 0){
            return "Fizz";
        }
        return String.valueOf(toConvertFirstBuzz);
    }

}
