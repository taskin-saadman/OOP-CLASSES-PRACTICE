import java.util.ArrayList;
import java.util.List;
public class StoneCollector {
    private String collectorName; //The name of the stone collector.
    private List<InfinityStone> collection; //A list holding the collected Infinity Stones.

    //Constructor(initializes the collector’s name and empty collection).
    public StoneCollector(String collectorName){

        this.collectorName = collectorName;
        this.collection = new ArrayList<InfinityStone>(); //Initialize an empty ArrayList.
    }

    /*
     * Adds the given stone to the collection.
     * If a stone with the same name already exists, do not add it again.
     */
    public void addStone(InfinityStone stone){
        //first find if stone already exists in the collection
        boolean exists = false; //flag

        for(InfinityStone stone2:collection){
            if(stone2.getName().equals(stone.getName())){//comparing 2 strings
                exists = !exists;
                break; //no need to iterate anymore
            }
        }

        if(!exists){//if does not exist
            collection.add(stone);
        }
    }

    /*
     * Removes the stone with the specified name from the collection and returns true if removed;
     * otherwise (i.e. if there is no stone with the specified name in the collection) returns false.
     */
    public boolean removeStone(String stoneName){
        //check if exists then remove if exists
        for(InfinityStone stone:collection){
            if(stone.getName().equals(stoneName)){
                collection.remove(stone);
                return true; //instantly return true if removed
            }
        }
        return false; //return false if stone was not found in collection
    }

    /*
     * Returns the InfinityStone with the specified name if it exists;
     * otherwise, returns null.
     */
    public InfinityStone getStone(String stoneName){
        //check if exists then return InfinityStone object
        for(InfinityStone stone:collection){
            if(stone.getName().equals(stoneName)){
                return stone;
            }
        }
        return null; //return null if stone was not found in collection
    }

    /*
     * Returns a List<InfinityStone> containing all stones in the collection.
     */
    public List<InfinityStone> listAllStones(){
        return collection;
    }
}
