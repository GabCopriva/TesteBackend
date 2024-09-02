package testebackend010924;

public class NotEmail implements Notificacoes{
        private String email;
        
        public NotEmail(String email){
            this.email = email;
        }
        
    @Override
    public void enviarNotificacao(String mensagem) {
        System.out.println("Enviando e-mail para " + email + " - " + mensagem);
    }
    
}
