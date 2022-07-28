abstract class Fighter {
    boolean isVulnerable() {
        return false;
    }

    abstract int damagePoints(Fighter fighter);

}

class Warrior extends Fighter {

    @Override
    public String toString() {
        return "Fighter is a Warrior";
    }

    @Override
    int damagePoints(Fighter wizard) {
        if (wizard.isVulnerable() == true){
            return 10;
        }
        return 6;
    }
}

class Wizard extends Fighter {
    boolean isPrepared = false;

    public String toString() {
        return "Fighter is a Wizard";
    }


    @Override
    boolean isVulnerable() {
        if (isPrepared == false){
            return true;
        }
        return false;
    }

    @Override
    int damagePoints(Fighter warrior) {
        if (isPrepared == true){
            return 12;
        }
        return 3;
    }

    void prepareSpell() {
        isPrepared = true;
    }

}
