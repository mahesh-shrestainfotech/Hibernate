import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import com.java.Dish;

public class TestDishStreams {

	public static void main(String[] args) {
		
		List<Dish> menu = Arrays.asList(new Dish("pork",false,800,Dish.Type.MEAT),
										new Dish("beef",false,700,Dish.Type.MEAT),
										new Dish("chicken",false,400,Dish.Type.MEAT),
										new Dish("french fries",true,530,Dish.Type.OTHER),
										new Dish("rice",true,350,Dish.Type.OTHER),
										new Dish("season fruit",true,120,Dish.Type.OTHER),
										new Dish("pizza",true,550,Dish.Type.OTHER),
										new Dish("prawns",false,300,Dish.Type.FISH),
										new Dish("salmon",false,450,Dish.Type.FISH)
										);
		
		//List<String> names = menu.stream().filter(dish -> dish.getCalories() > 300).map(Dish::getName).limit(3).collect(Collectors.toList());
		
		//List<String> names = menu.stream().filter(dish -> dish.getCalories() > 300).map(Dish::getName).sorted().limit(3).collect(Collectors.toList());
	
		//names.stream().forEach(System.out::println);
		
		//Sorting
//		List<Dish> dishList = menu.stream()
//							  .filter(dish -> dish.getCalories() > 300)
//							  .sorted((Dish d1,Dish d2) -> {return d1.getName().compareTo(d2.getName());})
//							  .collect(Collectors.toList());
//		
//		dishList.stream().forEach(System.out::println);

		//Grouping
//		List<Dish> dishList = menu.stream() 
//				  .collect(Collectors.groupingBy(dish -> { if(dish)})

	}

}
