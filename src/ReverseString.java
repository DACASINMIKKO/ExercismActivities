public class ReverseString {
    public String reverse(String inputString){
        String reversedString = "";
        char ch;
        for (int i = 0; i < inputString.length(); i++){
            ch = inputString.charAt(i);
            reversedString = ch + reversedString;
        }
        return reversedString;
    }
}
