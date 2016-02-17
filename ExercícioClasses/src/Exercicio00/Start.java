/**
 * Ciência da Computação Exercício 1    
 * 1. Identifique as classes, a relação entre as classes, os atributos das classe e seus  métodos com base no texto abaixo  a. 
 * Os felídeos (latim científico: Felidae) constituem uma família de animais  mamíferos digitígrados, da ordem dos carnívoros. 
 * A espécie mais comum no  mundo hoje é o gato doméstico, que já convive com os seres humanos por cerca  de 10 mil anos, no entanto, 
 * existem muitas outras espécies selvagens, como os  grandes felinos. Existem duas subfamílias de felídeos: 
 * Pantherinae (que inclui  tigres, leões, onças­pintadas e leopardos) e 
 * Felinae (que inclui  guepardos,suçuaranas, linces, jaguatiricas e gatos domésticos). 
 * Os primeiros  exemplares da família surgiram durante o oligoceno, cerca de 25 milhões de  anos atrás. 
 * Na pré­história, também existia uma terceira subfamília denominada  Machairodontinae, em que faziam parte os felídeos dentes­de­sabre 
 * como o  Smilodon. Apesar dassemelhanças superficiais, os também extintos  Thylacosmilus e Nimravidae não estão incluídos na família 
 * Felidae. (fonte:  https://pt.wikipedia.org/wiki/Felidae​.
 */

package Exercicio00;

public class Start {
	public static void main(String[] args) {
		
		Pantherinae p1 = new Pantherinae();
		p1.andarSobreOsDedos();
		p1.comerCarne();
		p1.conviverComHumano();
		
		Felinae f1 = new Felinae();
		f1.andarSobreOsDedos();
		f1.comerCarne();
		f1.conviverComHumano();
		
		Machairodontinae m1 = new Machairodontinae();
		m1.andarSobreOsDedos();
		m1.comerCarne();
		m1.conviverComHumano();
		
	}
}
