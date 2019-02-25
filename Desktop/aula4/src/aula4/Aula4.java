package aula4;

public class Aula4 {

	public static void main(String[] args) {
		//11
		int b = 25;
		
		if (b >=15) {
			System.out.println("Valor maior que 15");
		}
		else if (b <= 100) {
			System.out.println("Valor menor que 100");
		}
	
		// 12
		
		double d = 2.54;
		if(d >= 1.99 && d  <= 5.99) {
			System.out.println("O valor da variável está entre 1.99 e 5.99");
		}
	
		
		//13
		
		if(b == d){
			System.out.println("Os valores das variáveis são iguais");
		}
		else if(b != d) {
			System.out.println("Os valores das variáveis não são iguais");
		}
		
		//14
		
	int t = 2;
	double r = 5.75;
	r = r * t;
	int m = (int) r;
	System.out.println(m);
		
		}
		
		
		
	}
