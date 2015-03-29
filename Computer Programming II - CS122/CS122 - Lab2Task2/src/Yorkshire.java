/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Everton
 */
public class Yorkshire extends Dog
{
	private int avgBreedWeight = 6;
	
	public Yorkshire(String name)
	{
		super(name);
	}
	// -------------------------------------------------------------
	// Small bark -- overrides speak method in Dog
	// -------------------------------------------------------------
	public String speak()
	{
		return "wooooof";
	}

    @Override
    public int avgBreedWeight() {
        return avgBreedWeight;
    }

}
