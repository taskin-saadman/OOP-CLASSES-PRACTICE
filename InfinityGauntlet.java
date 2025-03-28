import java.util.ArrayList;
import java.util.List;

public class InfinityGauntlet {
    public static final int maxCapaxity = 6; //Set to 6, representing the maximum number of stones the gauntlet can hold.
    private List<InfinityStone> stones; //A list that holds the stones currently in the gauntlet.

    //Constructor(initializes an empty list of stones).
    public InfinityGauntlet(){
        this.stones = new ArrayList<InfinityStone>();
    }

    /*
     * Adds a stone to the gauntlet if there is capacity and if a stone with the same name is not already present.
     * Returns true if the stone was added, or false otherwise.
     */
    public boolean addStone(InfinityStone stone){
        if(stones.size() < maxCapaxity){//there is capacity
            for(InfinityStone stone2:stones){
                if(stone2.getName().equals(stone.getName())){//name check
                    return false; //if already exists
                }
            }
            stones.add(stone);//name does not exist
            return true;
        }
        return false;//there was no capacity
    }

    /*
     * Removes the stone with the given name from the gauntlet.
     * Returns true if removal was successful, or false if the stone was not found.
     */
    public boolean removeStone(String stoneName){
        for(InfinityStone stone:stones){
            if(stone.getName().equals(stoneName)){//name check
                stones.remove(stone);
                return true; //removal successful
            }
        }
        return false; //stone was not found
    }

    /*
     * Returns the InfinityStone in the gauntlet with the specified name if present;
     * otherwise, returns null.
     */
    public InfinityStone getStone(String stoneName){
        for(InfinityStone stone: stones){
            if(stone.getName().equals(stoneName)){//name check
                return stone;
            }
        }
        return null; //return null if stone was not found in the gauntlet
    }

    /*
     * Returns the sum of the power levels of all stones currently in the gauntlet.
     */
    public int getTotalPower(){
        int totalPower = 0; //initialize total power to 0
        for(InfinityStone stone: stones){
            totalPower += stone.getPowerLevel();
        }
        return totalPower; //return the total power
    }

    //Returns a boolean based on if the gauntlet is full or not.
    public boolean isFull(){
        return stones.size() == maxCapaxity;
    }
}
