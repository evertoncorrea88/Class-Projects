/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Everton
 */
public class Labrador extends Dog
{
	private String color; //black, yellow, or chocolate?
	private int avgBreedWeight = 75;
	
	public Labrador(String name, String color1)
	{
		super(name);
		color = color1;
	}
	// ------------------------------------------------------------
	// Big bark -- overrides speak method in Dog
	// ------------------------------------------------------------
	public String speak()
	{
		return "WOOF";
	}
	// ------------------------------------------------------------
	// Returns weight
	// ------------------------------------------------------------

    @Override
    public int avgBreedWeight() {
        return avgBreedWeight;
    }
	
}