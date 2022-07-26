public class Twofer {
    public String twofer(){
        return "One for you, one for me.";
    }

    public String twofer(String name){
        if (name == null){
            return "One for you, one for me.";
        }
        return "One for " + name.trim() + ", one for me.";
    }
}
