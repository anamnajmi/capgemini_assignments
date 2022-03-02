package assignment5.user;
import java.util.Arrays;
import java.util.List;
import static java.util.Comparator.comparing;
import assignment5.main.Trader;
import static java.util.stream.Collectors.toList;


public class Assignment5Q3 {
	
	public static void main(String ...args){   
		List<Trader> traders = Arrays.asList(
		new Trader("John", "Mumbai"),
		new Trader("Malik", "Pune"),
		new Trader("Joe", "Gurugram"),
		new Trader("Shubh", "Pune"));
		
		printUniqueCities(traders);
		tradersFromPuneSortByName(traders);
		allTradersNames(traders);
		areAnyTradersFromIndore(traders);
		
	}

	public static List<String> printUniqueCities(List<Trader> traders) {
	List<String> cities = 
	            traders.stream()
                .map(t->t.getCity())
                .distinct()
                .collect(toList());
      return cities;
	}
	
	public static List<Trader> tradersFromPuneSortByName(List<Trader> traders){
		List<Trader> ts = 
	            traders.stream()
	                        .filter(t -> t.getCity().equals("Pune"))
	                        .distinct()
	                        .sorted(comparing(Trader::getName))
	                        .collect(toList());
		return ts;
	}
	
	public static String allTradersNames(List<Trader> traders) {

        String traderStr = 
            traders.stream()
                        .map(t -> t.getName())
                        .distinct()
                        .sorted()
                        .reduce("", (n1, n2) -> n1 + n2);
        
        return traderStr;
	}
	
	public static boolean areAnyTradersFromIndore(List<Trader> traders) {
		  boolean Indbsd =
		            traders.stream()
		            .anyMatch(t -> t.getCity().equals("Milan"));
		        return Indbsd;
	}
	
	
	
}