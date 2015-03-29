/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Everton
 */
public class DogTest
{
	public static void main(String[] args)
	{
		Yorkshire york = new Yorkshire("Bel");
                Labrador labrador = new Labrador("Marley", "White");       
                System.out.println(york.getName() + " says " + york.speak());
                System.out.println(labrador.getName() + " says " + labrador.speak());
                System.out.println("Yorkshire average breedweight: " + york.avgBreedWeight());
                System.out.println("Labrador average breedweight: " + labrador.avgBreedWeight());
        }
}

