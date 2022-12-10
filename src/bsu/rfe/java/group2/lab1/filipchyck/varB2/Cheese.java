package bsu.rfe.java.group2.lab1.filipchyck.varB2;

public class Cheese extends Food {
	 public Cheese() {
	        super("Cheese");
	    }

	    @Override
	    public void consume() {
	        System.out.println(this + " has been eaten.");
	    }

	    @Override
	    public String GetSpecial() {
	        return super.GetSpecial();
	    }
	    @Override
	    public int calculateCalories() {
	        return 300;
	    }


}
