package bsu.rfe.java.group2.lab1.filipchyck.varB2;
import java.util.Comparator;
public class FoodComparator implements Comparator<Food> {

	@Override
	public int compare(Food arg0, Food arg1) {
		 if (arg0.calculateCalories()>arg1.calculateCalories()) return 1;
	        if (arg0.calculateCalories()<arg1.calculateCalories()) return -1;
	        return 0;

	}

}
