public class FootballMatchReports {
    public static String onField(int playerNumber){
        for (int i = 0; i < 12; i++){
            switch (playerNumber) {
                case 1:
                    return "goalie";
                case 2:
                    return "left back";
                case 3:
                case 4:
                    return "center back";
                case 5:
                    return "right back";
                case 6:
                case 7:
                case 8:
                    return "midfielder";
                case 9:
                    return "left wing";
                case 10:
                    return "striker";
                case 11:
                    return "right wing";
                default:
                    throw new IllegalArgumentException();
            }
        }
        return "";
    }
}
