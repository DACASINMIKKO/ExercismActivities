public class IsogramChecker {
    public boolean isIsogram(String phrase){
        String phraseWithoutDash = phrase.replace("-", "").toLowerCase().replace(" ", "");
        for (int i = 0; i < phraseWithoutDash.length(); i++){
            for (int j = 0; j < phraseWithoutDash.length(); j++){
                if (i != j && phraseWithoutDash.charAt(i) == phraseWithoutDash.charAt(j)){
                    return false;
                }
            }
        }
        return true;
    }
}
