package codingg;

public class Datatypechecking {

	public static void main(String[] args) 
	{
		int a=128;
		int b=2;
		float z=(byte)a/b;
		float z2=(byte)(a/b);
		System.out.println(z);
		System.out.println(z2);
	}
}
