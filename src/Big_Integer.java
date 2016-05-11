import java.math.BigInteger;
import java.util.Scanner;

public class Big_Integer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Geben sie ein für welche Zahl x sie x! berechnen moechten:");
		int x = Integer.parseInt(scanner.nextLine());
		BigInteger result = new BigInteger(String.valueOf(x));
		result = facultät(result);		
		System.out.println(result);
		
	}

	public static BigInteger facultät(BigInteger x){
		
		
		if(x.subtract(BigInteger.ONE).signum() != 1){
			return BigInteger.ONE;
		}else{
			return x.multiply(facultät(x.subtract(BigInteger.ONE)));
		}
	}
}


