package testebackend010924;

public class Cliente extends Usuario {
    private Notificacoes notificacao;

    public Cliente(String nome, String id, Notificacoes notificacao) {
        super(nome, id);
        this.notificacao = notificacao;
    }

    public void depositar(Empresa empresa, double valor) {
        empresa.receberDeposito(valor);
        notificacao.enviarNotificacao("Você realizou um depósito de " + valor + " na empresa " + empresa.getNome());
    }

    public void sacar(Empresa empresa, double valor) {
        empresa.realizarSaque(valor);
        notificacao.enviarNotificacao("Você realizou um saque de " + valor + " da empresa " + empresa.getNome());
    }
}



