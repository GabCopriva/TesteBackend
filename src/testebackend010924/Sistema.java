package testebackend010924;

public class Sistema {
    public static void main(String[] args) {
        
        Notificacoes notEmail = new NotEmail("cliente@example.com");
        Cliente cliente1 = new Cliente("João", "002", notEmail);

        Empresa empresa1 = new Empresa("TechCorp", "001", 0.02);
        
        cliente1.depositar(empresa1, 1000.00);

        
        cliente1.sacar(empresa1, 200.00);

        System.out.println("Saldo final da empresa " + empresa1.getNome() + ": " + empresa1.getSaldo());
    }
}
