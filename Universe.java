public class Universe {
    private int chaosLevel; //Represents the current chaos level in the universe.

    //Constructor
    public Universe(int chaosLevel){
        this.chaosLevel = chaosLevel;
    }

    /*
     * Checks if the gauntlet contains exactly 6 stones (as defined by InfinityGauntlet.maxCapacity). 

     * If yes, reduce the chaos level by the sum of the power levels of the stones in the gauntlet and return the updated chaos level (as an int).

     * If no, do not change the chaos level and return the current chaos level.
     */
    public int snap(InfinityGauntlet gauntlet){
        //if gauntlet has 6 stones
        if(gauntlet.isFull()){
            chaosLevel -= gauntlet.getTotalPower();
            return chaosLevel; //return the updated chaos level
        }
        
        return chaosLevel; //return the current chaos level if gauntlet is not full
    }

    //Returns the current chaos level.
    public int getChaosLevel(){
        return chaosLevel;
    }
}
