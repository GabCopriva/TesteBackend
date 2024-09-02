
package testebackend010924;

public class NotSMS implements Notificacoes {
         private String num;
        
        public NotSMS(String num){
            this.num = num;
        }
        
    @Override
    public void enviarNotificacao(String mensagem) {
        System.out.println("Enviando SMS para o número " + num + " - " + mensagem);
    }
    
}
