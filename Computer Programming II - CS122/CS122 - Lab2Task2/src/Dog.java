/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Everton
 */
public abstract class Dog
{
	protected String name;
	// ------------------------------------------------------------
	// Constructor -- store name
	// ------------------------------------------------------------
	public Dog(String n)
	{
		name = n;
	}
	// ------------------------------------------------------------
	// Returns the dog's name
	// ------------------------------------------------------------
	public String getName()
	{
		return name;
	}
	// ------------------------------------------------------------
	// Returns a string with the dog's comments
	// ------------------------------------------------------------
	public String speak()
	{
		return "Woof";
	}
        
        public abstract int avgBreedWeight();
	
}

