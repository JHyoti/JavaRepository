package collection;
import java.util.TreeSet;

public class MovieForSortMain {

	public static void main(String[] args) throws LowMovieRatingException {
		MovieForSort m1 = new MovieForSort(102, "RRR", "S.S. Rajamouli", 4.1f);
		MovieForSort m2 = new MovieForSort(101, "SummerStory", "S.S. Rajamouli", 4.7f);
		MovieForSort m3 = new MovieForSort(109, "WinterStory", "R.S. Rajamouli", 3.3f);
		MovieForSort m4 = new MovieForSort(105, "Bhramastra", " Ayan Mukerji", 2.0f);
		MovieForSort m5 = new MovieForSort(107, "ABc", "XYZ", 2.0f);
		TreeSet<MovieForSort> set = new TreeSet<MovieForSort>();
		set.add(m1);
		set.add(m2);
		set.add(m3);
		set.add(m4);
		set.add(m5);
		System.out.println("=========================================");
		for(MovieForSort m : set) {
			System.out.println(m);
		}
		
			checkingRating(set);
	
	}
	public static void checkingRating(TreeSet<MovieForSort> set) throws LowMovieRatingException {
		for(MovieForSort temp : set) {
			if(temp.getRating()>4.0) {
				System.out.println(temp.getMovieName()+" " + temp.getDirectorName());
			}else {
				throw new LowMovieRatingException();
			}
		}
	}

}
