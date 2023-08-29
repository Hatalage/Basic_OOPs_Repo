package assign12july;

public class ThisDemo {
	    private int num;

	    public ThisDemo(int num) {
	        this.num = num; // using "this" to refer to the instance variable
	    }

	    public void printNum() {
	        System.out.println("The value of num is: " + this.num); // using "this" to refer to the instance variable
	    }

	    public void setNum(int num) {
	        this.num = num; // using "this" to refer to the instance variable
	    }

	    public int getNum() {
	        return this.num; // using "this" to refer to the instance variable
	    }

	    public static void main(String[] args) {
	    	ThisDemo obj = new ThisDemo(42);
	        obj.printNum(); // calling a method that uses "this" to refer to the instance variable
	        obj.setNum(99); // calling a method that uses "this" to refer to the instance variable
	        System.out.println("The new value of num is: " + obj.getNum()); // calling a method that uses "this" to refer to the instance variable
	    }
	}

