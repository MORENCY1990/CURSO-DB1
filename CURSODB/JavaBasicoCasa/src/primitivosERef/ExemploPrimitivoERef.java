package primitivosERef;
import java.awt.Point;
import java.util.Arrays;
import java.lang.StringBuilder;
public class ExemploPrimitivoERef {



	public static void main(String[] args) {
		int in =10;
		System.out.println(String.format("primitive int: %d", in));
		
		float flo = 20.535f;
		System.out.println(String.format("primitive float: %.2f", flo) );
		
		char cha = 'X';
		System.out.println(String.format("primitive char (antes): %c", cha));
		changePrimitive(cha);
		System.out.println(String.format("primitive char (depois): %c", cha));
		
		boolean boo = true;
		System.out.println(String.format("primitive boolean: %b", boo));
		
		StringBuilder builder = new StringBuilder ("Johhny John");
		System.out.println(String.format("Object String (antes): %s", builder.toString()));
		changeObject(builder);
		System.out.println(String.format("Object String (depois): %s", builder.toString()));
		
		int[] numeros = {1,2,3,4,5};
		System.out.println(String.format("Object int[]: %s", Arrays.toString(numeros)));
		
		Point point = new Point(1,1);
		System.out.println(String.format("Object Poin (antes): %s", point));
		changeObject(point);
		System.out.println(String.format("Object Poin (depois): %s", point));
		
		int val1 = 5;
		int val2 = val1; // COPIA DE VALOR
		
		Point point1 = new Point(1,1);
		Point point2 = point1;  //COPIA DE REFERENCIA
		
	}
	
	public static void changePrimitive(char value) {
		value = 'Y';
	}
	
	public static void changeObject(Point value) {
		value.x = 2;
		value.y = 2;
	}
	
	public static void changeObject(StringBuilder value) {
		value.append("Jones");
	}
	
	public static String changeObject(String value) {
		return value.concat("Jones");

	}

}
