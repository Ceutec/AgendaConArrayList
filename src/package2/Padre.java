package package2;

public class Padre
{
	protected int protegida;
}

class Hijo extends Padre
{
	void f()
	{
		this.protegida = 20;
	}
}