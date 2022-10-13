
public class TestaCarro {

	public static void main(String[] args) {
		Carro carro = new Carro("Siena", 40000);
		System.out.println(carro.getAno());
		System.out.println(carro.getModelo());
		System.out.println(carro.getPreco());
		
		System.out.println();
		
		Carro carro2 = new Carro(2022, "BMW", 100000);
		System.out.println(carro2.getAno());
		System.out.println(carro2.getModelo());
		System.out.println(carro2.getPreco());
	}
}
