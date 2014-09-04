import java.util.ArrayList;
import java.util.Scanner;


class Registro
{
	String nombre;
	int numero;
	Registro(String nombre, int numero)
	{
		this.nombre=nombre;
		this.numero=numero;
	}
}

public class PruebaArrayList {
	public static void main(String args[])
	{
		ArrayList<Registro> registros = new ArrayList<Registro>();
		
		Scanner s = new Scanner (System.in);
		
		int opcion;
		do
		{
			System.out.println("Agenda");
			System.out.println("1 Agregar");
			System.out.println("2 Imprimir");
			System.out.println("3 Salir");
			System.out.print("Opcion: ");
			opcion = s.nextInt();
			
			if(opcion == 1)
			{
				System.out.print("Nombre: ");
				String nombre = s.next();
				System.out.print("Numero: ");
				int numero = s.nextInt();
				registros.add(new Registro(nombre,numero));
			}
			if(opcion == 2)
			{
				for(int i = 0; i<registros.size(); i++)
				{
					System.out.print(registros.get(i).nombre);
					System.out.print(" - ");
					System.out.print(registros.get(i).numero);
					System.out.print("\n");
				}
			}
			
		}while(opcion != 3);
	}
}
