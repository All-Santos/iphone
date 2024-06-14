package iphone;
import music.ReprodutorMusical;
import call.Telefone;
import internet.Internet;


public class Iphone {
	public static void main(String[] args) {
		
		
		
	ReprodutorMusical iphone =new ReprodutorMusical();
	iphone.tocar();
	iphone.selecionarMusica(null);
	iphone.pausar();
		
	Telefone iphoneTel = new Telefone();
	iphoneTel.atender();
	iphoneTel.ligar(null);
	iphoneTel.iniciarCorreioVoz();
	
	Internet iphonet = new Internet();
	
	iphonet.adicionarNovaAba();
	iphonet.exibirPagina(null);
	iphonet.atualizarPagina();
	
	
			
	}

}
