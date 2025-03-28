public class InfinityStone{
    private String name; //The name of the Infinity Stone (e.g. "Space", "Mind").
    private String colour; //The colour of the stone.
    private int powerLevel; //A numeric representation of the stone’s power.

    //Constructor
    public InfinityStone(String name, String colour, int powerLevel){
        this.name = name;
        this.colour = colour;
        this.powerLevel = powerLevel;
    }

    //Methods

    //Returns the stone’s name.
    public String getName(){
        return name;
    }

    //Returns the stone’s colour.
    public String getColour(){
        return colour;
    }

    //Returns the current power level.
    public int getPowerLevel(){
        return powerLevel;
    }

    //Updates the power level to the given value.
    public void setPowerLevel(int newPowerLevel){
        this.powerLevel = newPowerLevel;
    }

}