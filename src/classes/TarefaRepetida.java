package classes;
import java.util.TimerTask;
import javax.swing.JOptionPane;

/*
 * Utilizada para gerar uma temporiza��o. Ao fim do tempo exibe a mensagem 
 * passada
 */
public class TarefaRepetida extends TimerTask {
	int vezes = 1;
	String mensagem;
	int tipo;
	
	public TarefaRepetida(String mensagem, int tipo) {
		this.mensagem = mensagem;
		this.tipo = tipo;
	}
	
	public void run() {
		if(vezes == 0) {
			JOptionPane.showMessageDialog(null, mensagem, "Resultado", tipo);
			this.cancel();
		}
	}

}