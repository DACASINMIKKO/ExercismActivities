class SqueakyClean {
    static String clean(String identifier) {
        StringBuilder b = new StringBuilder();
        boolean dashFlag = false;
        for (int i=0; i < identifier.length(); i++) {
            char c = identifier.charAt(i);
            if (c == ' ') {
                b.append('_');
            } else if (c == '-') {
                dashFlag = true;
            } else if (Character.isISOControl(c)) {
                b.append("CTRL");
            } else if (Character.isLetter(c) && (c < 'α' || c >  'ω')) {
                if (dashFlag) {
                    c = Character.toUpperCase(c);
                    dashFlag = false;
                }
                b.append(c);
            }
        }
        return b.toString();
    }
}