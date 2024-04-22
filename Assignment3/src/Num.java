package  javaprograms;
class Num {
	    private double number;

	    public Num(double number) {
	        this.number = number;
	    }

	    public boolean isZero() {
	        return number == 0;
	    }

	    public boolean isPositive() {
	        return number > 0;
	    }

	    public boolean isNegative() {
	        return number < 0;
	    }

	    public boolean isOdd() {
	        return number % 2 != 0;
	    }

	    public boolean isEven() {
	        return number % 2 == 0;
	    }

	    public boolean isPrime() {
	        if (number <= 1) return false;
	        for (int i = 2; i <= Math.sqrt(number); i++) {
	            if (number % i == 0) return false;
	        }
	        return true;
	    }

	    public boolean isArmstrong() {
	        int temp = (int) number;
	        int digits = 0;
	        int result = 0;
	        int original = temp;

	        while (original != 0) {
	            original /= 10;
	            ++digits;
	        }

	        original = temp;

	        while (original != 0) {
	            int remainder = original % 10;
	            result += Math.pow(remainder, digits);
	            original /= 10;
	        }

	        return result == number;
	    }

	    public static void main(String[] args) {
	        Num num = new Num(5);

	        System.out.println("Is Zero: " + num.isZero());
	        System.out.println("Is Positive: " + num.isPositive());
	        System.out.println("Is Negative: " + num.isNegative());
	        System.out.println("Is Odd: " + num.isOdd());
	        System.out.println("Is Even: " + num.isEven());
	        System.out.println("Is Prime: " + num.isPrime());
	        System.out.println("Is Armstrong: " + num.isArmstrong());
	    }
}
