package bsu.rfe.java.group2.lab1.filipchyck.varB2;

public class Pie extends Food {
	private String filling;
        public Pie(String filling) {
            super("Pie");
            this.filling = filling;
        }
        @Override
        public void consume() {
            System.out.println(this + " has been consumed.");
        }

        public String getFilling() {
            return filling;
        }

        public void setFilling(String filling) {
            this.filling = filling;
        }

        public boolean equals(Object arg) {
            if (super.equals(arg)) { // Шаг 1
                if (!(arg instanceof Pie)) return false; // Шаг 2
                return filling.equals(((Pie) arg).filling); // Шаг 3
            } else
                return false;
        }

        public String toString() {
            return super.toString() + " (" + filling + ") ";
        }

        @Override
        public int calculateCalories() {

            if (filling.equalsIgnoreCase("Вишневый")) {
                return 250;

            } else if (filling.equalsIgnoreCase("Яблочный")) {
               return 200;

            } else if (filling.equalsIgnoreCase("Клубничный")) {
                return 225;
            } else {
                return 5;
            }
        }
    }

    



