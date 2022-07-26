public class RaindropConverter {
    public String convert(int number){
        String divisibleBy3 = "Pling";
        String divisibleBy5 = "Plang";
        String divisibleBy7 = "Plong";
        if ( number % 3 == 0 && number % 5 == 0 && number % 7 == 0){
            return divisibleBy3 + divisibleBy5 + divisibleBy7;
        } else if (number % 3 == 0 && number % 5 == 0) {
            return divisibleBy3 + divisibleBy5;
        } else if (number % 3 == 0 && number % 7 == 0) {
            return divisibleBy3 + divisibleBy7;
        } else if (number % 5 == 0 && number % 7 == 0) {
            return divisibleBy5 + divisibleBy7;
        } else if (number % 3 == 0 && number % 5 != 0 && number % 7 != 0) {
            return divisibleBy3;
        } else if (number % 3 != 0 && number % 5 == 0 && number % 7 != 0) {
            return divisibleBy5;
        } else if (number % 3 != 0 && number % 5 != 0 && number % 7 == 0) {
            return divisibleBy7;
        } else {
            return Integer.toString(number);
        }
    }
}
