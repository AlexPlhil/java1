package bsu.rfe.java.group2.lab1.filipchyck.varB2;
import java.util.*;

public class Main { 
	 public static int Calories = 0;
	    static Scanner console = new Scanner(System.in);
static FoodComparator sd=new FoodComparator();
	    @SuppressWarnings("unchecked")
	    public static void main(String[] args) throws Exception {
	        String[] t=args;
	        Vector<Food> breakfast = new Vector<Food>();
	        	Food[] srt=new Food[args.length];
	      int i=0;  	
	        for (String arg: args) { 
	        	
	        	String[] parts = arg.split("/");
	           
	            if (parts[0].equals("Apple")) {
	            	srt[i]=new Apple(parts[1]);
	                String size=parts[1];
	                t[i]=parts[1];
	                breakfast.add(new Apple(size));
	                Calories += breakfast.elementAt(i).calculateCalories();
	                i++;
	            }

	            if (parts[0].equals("Cheese")) {
	                srt[i] = new Cheese();
	                breakfast.add(new Cheese());
	                Calories += breakfast.elementAt(i).calculateCalories();
	                i++;
	            }

	            if (parts[0].equals("Pie")) {
	            	srt[i]=new Pie(parts[1]);
	            	String filling=parts[1];
	            	t[i]=parts[1];
	                breakfast.add(new Pie(filling));
	                Calories += breakfast.elementAt(i).calculateCalories();
	                i++;
	            }
	        }
	        CountFood(breakfast);

	        for ( i = 0; i < breakfast.size(); i++) {
	            breakfast.elementAt(i).consume();
	        }
	        System.out.println("\nEnter -calories, if you want to see total calories: ");
	        String seeCal;
	        seeCal = console.nextLine();
	        if (seeCal.equals("-calories")) {
	            System.out.println("\nCalories: " + String.valueOf(Calories));
	        }

	        System.out.print("Breakfast: ");
	        print(breakfast, t);

	        System.out.println("\nEnter -sort, if you want to sort: ");
	        String ifSorted;
	        ifSorted = console.nextLine();
	        if (ifSorted.equals("-sort")) {


	      
	        	Arrays.sort(srt, sd);
	            System.out.print("Sorted breakfast: ");
	            print1(srt);
	        }
	        System.out.println("\nSee ya!");
	    }

	    public static void CountFood(Vector<Food> f){
	        int numOfApples = 0;
	        int numOfCheese = 0;
	        int numOfPie = 0;
	        for (int i = 0; i < f.size(); i++){
	            if(f.elementAt(i).getName().equalsIgnoreCase("Apple")){
	                numOfApples++;
	            } else  if (f.elementAt(i).getName().equalsIgnoreCase("Cheese")){
	                numOfCheese++;
	            } else if (f.elementAt(i).getName().equalsIgnoreCase("Pie")){
	                numOfPie++;
	            }
	        }
	        System.out.println("Num of apples:  " + String.valueOf(numOfApples));
	        System.out.println("Num of cheese:  " + String.valueOf(numOfCheese));
	        System.out.println("Num of pies: " + String.valueOf(numOfPie));
	    }

	    public static void print(Vector<Food> breakfast, String[] t) {
	        System.out.print("[ ");
	        for (int i = 0; i < breakfast.size(); i++) {
				if(breakfast.elementAt(i).getName()=="Cheese")
					 System.out.print(breakfast.elementAt(i).getName());
				else
	            System.out.print(breakfast.elementAt(i).getName()+" "+t[i]);
	     
	            if (i < breakfast.size() - 1) {
	                System.out.print(", ");
	            }
	        }
	        System.out.println(" ] ");
	    }
	    public static void print1( Food[] s) { System.out.print("[ ");
        for (int i = 0; i <s.length; i++) {
				 System.out.print(s[i]+" ");

            
        }
        System.out.println(" ] ");}
	  

}
