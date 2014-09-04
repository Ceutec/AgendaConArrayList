import java.util.InputMismatchException;
import java.util.Scanner;

class NumeroNegativoException extends Exception
{
	@Override
	public void printStackTrace()
	{
		System.out.print("Error: Se ingreso un numero negativo.");
	}
}

class NumeroPositivo
{
	int num;
	public NumeroPositivo(int num) throws NumeroNegativoException
	{
		if(num < 0)
		{
			NumeroNegativoException me = new NumeroNegativoException();
			throw me;
		}
		this.num = num;
	}
}
public class Prinicipal
{
	public static void main(String[] args)
	{
		ArrayIndexOutOfBoundsException e;
		try {
			NumeroPositivo n = new NumeroPositivo(-10);
			System.out.print(n.num);
		} catch (NumeroNegativoException e) {
			System.out.print("Error prueba: Se ha ingreseado un numero negativo.");
		}
	}
}






