public class TestaMetodos {

    public static void main(String[] args) {
    	
        Conta contaGabi = new Conta();
        contaGabi.deposita(1000);
        System.out.println("Gabi Saldo = " + contaGabi.getSaldo());
        contaGabi.saca(250);
        System.out.println("Gabi Saldo = " + contaGabi.getSaldo());
        
        Conta contaDaniel = new Conta();
        contaDaniel.deposita(500);
        System.out.println("Daniel Saldo = " + contaDaniel.getSaldo());
        contaDaniel.saca(125);
        System.out.println("Daniel Saldo = " + contaDaniel.getSaldo());
        
        contaGabi.transfere(250, contaDaniel);
        System.out.println("Gabi Saldo = " + contaGabi.getSaldo());
        System.out.println("Daniel Saldo = " + contaDaniel.getSaldo());
        
        System.out.println(Conta.getTotal());
    }
}