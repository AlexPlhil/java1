package bsu.rfe.java.group2.lab1.filipchyck.varB2;

public class Apple extends Food {
	 private String size;

	    @Override
	    public String GetSpecial() {
	        return size;
	    }

	    public Apple(String size) {

	        super("Apple");
	        this.size = size;
	    }

	    @Override
	    public void consume() {
	        System.out.println(this + " has been eaten.");
	    }

	    public String getSize() {
	        return size;
	    }

	    public void setSize(String size) {
	        this.size = size;
	    }

	    public boolean equals(Object arg) {
	        if (super.equals(arg)) { // Шаг 1
	            if (!(arg instanceof Apple)) return false; // Шаг 2
	            return size.equals(((Apple)arg).size); // Шаг 3
	        } else
	            return false;
	    }

	    public String toString() {
	        return size + " " + super.toString();
	    }

	        @Override
	        public int calculateCalories() {
	            if (size.equalsIgnoreCase("Big")) {
	                return 150;

	            } else if (size.equalsIgnoreCase("Medium")) {
	                return 100;

	            } else if (size.equalsIgnoreCase("Small")) {
	                return 50;
	            } else {
	                return 10;
	            }
	        }

}
