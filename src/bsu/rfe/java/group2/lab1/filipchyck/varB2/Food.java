package bsu.rfe.java.group2.lab1.filipchyck.varB2;

public abstract class Food implements Consumable,Nutritions {

	  String name = null;

	    public Food (String name) {
	        this.name = name;
	    }

	    public boolean equals(Object arg) {
	        if (!(arg instanceof Food)) return false;
	        if (name == null || ((Food)arg).name == null) return false;
	        return name.equals(((Food)arg).name);
	    }

	    public String toString() {
	        return "Очень вкусное молоко";
	    }
	    public String getName() {
	        return name;
	    }
	    public void setName(String name) {
	        this.name = name;
	    }

	    public String GetSpecial(){
	        return "";
	    }

		

}
