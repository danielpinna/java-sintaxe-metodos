
public class TestaComposicaoDeClasses {

	public static void main(String[] args) {		
		Conta contaGabi = new Conta(123, 456);
		contaGabi.setTitular(new Cliente());
		contaGabi.getTitular().setNome("Gabi");
		System.out.println(contaGabi.getTitular().getNome());
		
		Conta contaDaniel = new Conta(123, 456);
		contaDaniel.setTitular(new Cliente());
		contaDaniel.getTitular().setNome("Daniel");
		System.out.println(contaDaniel.getTitular().getNome());
		
		System.out.println(Conta.getTotal());
	}
}
