package WIA1002.TUTO.TUTO_3;

public interface BidCollectionInterface {
    /**
     * Adds a bid to this collection.
     * Precondition: none
     * Postcondition: The bid was added into collection
     * @return nothing
     */
    public void addBid();
    
    /**
     * Returns the bid in this collection with the best yearly cost.
     * Precondition:none
     * Postcondition: The yearly cost was compared in the collection and the best one was returned.
     * @return The bid in the collection with the best yearly cost.
     */
    public String getBestYearlyCost();
    
    /**
     * Returns the bid in this collection with the best initial cost. The initial cost will be defined as the unit cost plus the installation cost.
     * Precondition: none
     * Postcondition: The initial cost which is the summation of unit cost and installation cost was compared in the collection and the best one was returned
     * @return The bid in the collection with the best initial cost.
     */
    public String getBestInitialCost();
    
    /**
     * Clears all of the items from this collection
     * Precondition: none
     * Postcondition: All items was removed from the collection
     * @return nothing
     */
    public void removeAAllBid();
    
    /**
     * Gets the number of items in this collection
     * Precondition: none
     * Postcondition:The number of items in the collection was returned.
     * @return The number of items in the collection
     */
    public int getSizeCollection();
    
    /**
     * Sees whether this collection is empty.
     * Precondition: none
     * POstcondition: the result of the collection's content is determined whether it is empty or not
     * @return The result of the collection's content that has been determined
     */
    public Boolean isEmpty();
}
