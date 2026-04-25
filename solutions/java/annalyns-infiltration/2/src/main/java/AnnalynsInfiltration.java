class AnnalynsInfiltration {
    public static boolean canFastAttack(boolean knightIsAwake) {
        return !knightIsAwake;
    }

    public static boolean canSpy(boolean knightIsAwake, boolean archerIsAwake, boolean prisonerIsAwake) {
        return knightIsAwake || archerIsAwake || prisonerIsAwake;
    }

    public static boolean canSignalPrisoner(boolean archerIsAwake, boolean prisonerIsAwake) {
        if(!archerIsAwake && prisonerIsAwake){
            return true;
        }
        else{return false;}
    }

    public static boolean canFreePrisoner(boolean knightIsAwake, boolean archerIsAwake, boolean prisonerIsAwake, boolean petDogIsPresent) {
        //with dog
        boolean withDog = petDogIsPresent && !archerIsAwake;
        //without dog
        boolean withoutDog = !petDogIsPresent && prisonerIsAwake && !archerIsAwake && !knightIsAwake;

        return withDog || withoutDog;
        
    }
}
