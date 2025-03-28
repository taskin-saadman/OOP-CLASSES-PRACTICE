public class StoneTransaction {
    private InfinityStone stone; //the stone involved in the transaction.
    //A string representing the type of transaction (e.g. "ADD" or "REMOVE").
    //You do not need to validate the value contained within this string.
    private String transactionType;

    //Constructor(Initialises all fields.)
    public StoneTransaction(InfinityStone stone, String transactionType){
        this.stone = stone;
        this.transactionType = transactionType;
    }

    //Returns the stone associated with the transaction.
    public InfinityStone getStone(){
        return stone;
    }

    //Returns the transaction type.
    public String getTransactionType(){
        return transactionType;
    }

}
