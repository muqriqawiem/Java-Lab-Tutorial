package WIA1002.TUTO.TUTO_3;

public interface BidInterface {

    /**
     * Return the name of the company making this bid Precondition: none
     * Postcondition: the name was returned
     *
     * @return The name of the company making this bid.
     */
    public String GetCompanyName();

    /**
     * Returns the description of the air conditioner that this bid is for.
     * Precondition: none 
     * Postcondition: the description was returned
     * @return The description of the air conditioner.
     */
    public String GetDescription();

    /**
     * Returns the capacity of this bid's AC in tons (1 ton = 12,000 BTU).
     * Precondition: none 
     * Postcondition: The performance was returned
     * @return The cooling capacity of the AC unit in tons.
     */
    public double GetCapacity();

    /**
     * Returns the seasonal efficiency of this bid's AC (SEER). 
     * Precondition:none 
     * Postcondition: The performance was returned.
     * @return The seasonal efficiency of AC unit.
     */
    public double GetSeer();

    /**
     * Returns the cost of this bid's AC. 
     * Precondition: none
     * Postcondotion: The cost was returned
     * @return The cost of the AC unit.
     */
    public double GetCost();

    /**
     * Returns the cost of installing this bid's AC. 
     * Precondition: none
     * Postcondition: The cost was returned
     * @return The installing cost of AC unit.
     */
    public double getInstallingCost();

    /**
     * Returns the yearly cost of operating this bid's AC. 
     * Precondition: none
     * Postcondition: The cost was returned
     * @return The operating yearly cost of AC unit.
     */
    public double getOperatingYearlyCost();

}
