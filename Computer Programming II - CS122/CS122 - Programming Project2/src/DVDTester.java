
public class DVDTester {

    public static void main(String[] args) {
        SortableDVD[] movies = new SortableDVD[8];
        movies[0] = new SortableDVD("The Godfather", "Francis Ford Coppala", 1972, 24.95, true);
        movies[1] = new SortableDVD("District 9", "Neill Blomkamp", 2009, 19.95, false);
        movies[2] = new SortableDVD("Iron Man", "Jon Favreau", 2008, 15.95, false);
        movies[3] = new SortableDVD("All About Eve", "Joseph Mankiewicz", 1950, 17.50, false);
        movies[4] = new SortableDVD("The Matrix", "Andy & Lana Wachowski", 1999, 19.95, true);
        movies[5] = new SortableDVD("Clash of the Titans", "Louis Leterrier", 2010, 19.95, true);
        movies[6] = new SortableDVD("Iron Man 2", "Jon Favreau", 2010, 22.99, false);
        movies[7] = new SortableDVD("Casablanca", "Michael Curtiz", 1942, 19.95, false);

        // call sorting algorithm
        Sorting.insertionSort(movies);
        // use loop to display the sorted movie list
        System.out.println("Sorted list of movies:");
        for (Comparable movie : movies) {
            System.out.println(movie);
        }

        SortableDVD movie1 = new SortableDVD("Clash of the Titans", "Desmond Davis", 1981, 5.00, false);
        SortableDVD movie2 = new SortableDVD("The Matrix", "Andy & Lana Wachowski", 1999, 19.95, true);

        //invoke the search algorithm to search the above two movies in the movies list
        //display the search result: found or not found. If found, display the movie information.
        Comparable result = Searching.binarySearch(movies, movie1);
        if (result == null) {
            System.out.println("Not found");
        } else {
            System.out.println("Found: " + result);
        }
        result = Searching.binarySearch(movies, movie2);
        if (result == null) {
            System.out.println("Not found");
        } else {
            System.out.println("Found: " + result);
        }
    }
}
