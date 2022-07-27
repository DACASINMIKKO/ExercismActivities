public class AnnalynsInfiltration {
    static boolean canFastAttack(boolean knightIsAwake){
        if (knightIsAwake == true){
            return false;
        }else {
            return true;
        }
    }
    static boolean canSpy(boolean knightIsAwake, boolean archerIsAwake, boolean prisonerIsAwake){
        if (knightIsAwake == true || archerIsAwake == true || prisonerIsAwake == true){
            return true;
        }else{
            return false;
        }
    }
    static boolean canSignalPrisoner(boolean archerIsAwake, boolean prisonerIsAwake){
        if (archerIsAwake == false && prisonerIsAwake == true){
            return true;
        }else {
            return false;
        }
    }
    static boolean canFreePrisoner(boolean knightIsAwake, boolean archerIsAwake, boolean prisonerIsAwake, boolean petDogIsPresent){
        if (knightIsAwake == false && archerIsAwake == false && prisonerIsAwake == true && petDogIsPresent == false ){
            return true;
        } else if (archerIsAwake == false && petDogIsPresent == true) {
            return true;
        }else {
            return false;
        }
    }
}
