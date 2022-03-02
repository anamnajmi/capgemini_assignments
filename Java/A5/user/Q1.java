package assignment5.user;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.ArrayList;
import assignment5.main.Fruit;
import static java.util.Comparator.comparing;
import static java.util.stream.Collectors.toList;

public class Assignment5Q1{

	public static List<String> reverseSort(List<Fruit> fruits){
		return fruits.stream().filter(f->f.getCalories()<300)
				.sorted(comparing(Fruit::getCalories)//.reversed()
					)
                .map(Fruit::getName)
                .collect(toList());	
	}
	
	public static  Map<Object, List<Fruit>> Sort(List<Fruit> fruitslist){
		return fruitslist.stream().collect(Collectors.groupingBy(w -> w.getColor()));	
	}
		
	public static ArrayList<Fruit> filterRedSortPrice(List<Fruit> fruitslist) { 
		return (ArrayList<Fruit>) fruitslist.stream().filter(f -> f.getColor().equals("Red"))
				.sorted(comparing(Fruit::getPrice))
               .collect(Collectors.toList());
		
	}
	
	public static void main(String[] args) {
		
		 reverseSort(Fruit.fruitslist).forEach(System.out::println);
		 Sort(Fruit.fruitslist);
		 filterRedSortPrice(Fruit.fruitslist).forEach(System.out::println);
		 
	
	
}
}