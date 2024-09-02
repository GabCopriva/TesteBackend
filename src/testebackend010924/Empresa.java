package testebackend010924;

public class Empresa extends Usuario implements CallbackEmpresa {
    private double saldo;
    private double taxaDeSistema;

    public Empresa(String nome, String id, double taxaDeSistema) {
        super(nome, id);
        this.saldo = 0.0;
        this.taxaDeSistema = taxaDeSistema;
    }

    public double getSaldo() {
        return saldo;
    }

    public void receberDeposito(double valor) {
        double valorFinal = valor - (valor * taxaDeSistema);
        this.saldo += valorFinal;
        notificarTransacao("Depósito de " + valor + " realizado. Saldo atualizado: " + this.saldo);
    }

    public void realizarSaque(double valor) {
        double valorComTaxa = valor + (valor * taxaDeSistema);
        if (this.saldo >= valorComTaxa) {
            this.saldo -= valorComTaxa;
            notificarTransacao("Saque de " + valor + " realizado. Saldo atualizado: " + this.saldo);
        } else {
            notificarTransacao("Tentativa de saque de " + valor + " falhou. Saldo insuficiente.");
        }
    }

    @Override
    public void notificarTransacao(String mensagem) {
        System.out.println("Callback para Empresa: " + mensagem);
    }
}
