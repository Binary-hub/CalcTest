public class Calculator {

	public int add(int a, int b){
           return a + b;
	}

	public int sub(int a, int b){
	   return a - b;
	}

	public int mul(int a, int b){
	   return a * b;
	}

	public int div(int a, int b){
	   if(b == 0) throw new ArithmeticException("Div by Zero!");
	   return a / b;
	}

	public static void main(String args[]){
	   Calculator cal = new Calculator();
	   System.out.println("Addition: " + cal.add(10, 5));
           System.out.println("Subtraction: " + cal.sub(10, 5));
	   //System.out.println("Multiplication: " + cal.mul(10, 5));
	   //System.out.println("Division: " + cal.div(10, 5));
	}

}