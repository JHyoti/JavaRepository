package collection;

import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
//import java.util.Set;

public class MovieSetMain {

	public static void main(String[] args) throws LowMovieRatingException {
		MovieSet m1 = new MovieSet(102, "RRR", "S.S. Rajamouli", 4.1f);
		MovieSet m2 = new MovieSet(101, "SummerStory", "S.S. Rajamouli", 4.7f);
		MovieSet m3 = new MovieSet(109, "WinterStory", "R.S. Rajamouli", 3.3f);
		MovieSet m4 = new MovieSet(105, "Bhramastra", " Ayan Mukerji", 2.0f);
		MovieSet m5 = new MovieSet(107, "ABc", "XYZ", 2.0f);
		HashSet<MovieSet> set = new HashSet<MovieSet>();
		set.add(m1);
		set.add(m2);
		set.add(m3);
		set.add(m4);
		set.add(m5);
		for(MovieSet m : set) {
			System.out.println(m);
		}
		checkRating(set);
		System.out.println("============================================================");
		
	}
	
	public static void checkRating(HashSet<MovieSet>set) throws LowMovieRatingException
{
    for(MovieSet temp: set)
    {
        if(temp.getRating()>4.0)
        {
            System.out.println(temp.getMovieName()+" "+temp.getDirectorName());
        }
        else
        {
            throw new LowMovieRatingException();
        }

    }
}

}
