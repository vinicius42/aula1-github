package busca_binaria;

import java.util.ArrayList;

public class Exemplo_3 {

	public static void main(String[] args) {
		String text = "Davi,Arthur,Pedro,Gabriel,Bernardo,Lucas,Matheus,Rafael,Heitor,Enzo,Guilherme,Nicolas,Lorenzo,Gustavo,Felipe,Samuel,Jo�o Pedro,Daniel,Vitor,Leonardo,Henrique,Theo,Murilo,Eduardo,Pedro Henrique,Pietro,Cau�,Isaac,Caio,Vinicius,Benjamin,Jo�o,Lucca,Jo�o Miguel,Bryan,Joaquim,Jo�o Vitor,Thiago,Ant�nio,Davi Lucas,Francisco,Enzo Gabriel,Bruno,Emanuel,Jo�o Gabriel,Ian,Davi Luiz,Rodrigo,Ot�vio,Alice,Julia,Isabella,Manuela,Laura,Luiza,Valentina,Giovanna,Maria Eduarda,Helena,Beatriz,Maria Luiza,Lara,Mariana,Nicole,Rafaela,Helo�sa,Isadora,L�via,Maria Clara,Ana Clara,Lorena,Gabriela,Yasmin,Isabelly,Sarah,Ana Julia,Let�cia,Ana Luiza,Melissa,Marina,Clara,Cec�lia,Esther,Emanuelly,Rebeca,Ana Beatriz,Lav�nia,Vit�ria,Bianca,Catarina,Larissa,Maria Fernanda,Fernanda,Amanda,Al�cia,Carolina,Agatha,Gabrielly";
		String[] v = text.split(",");
		text = text.replaceAll(",","-");
		String chave = "    Escobar    ";
		chave = chave.trim();
		ArrayList<String> l_text = new ArrayList<String>();
		for(String s : v) {
			l_text.add(s);
		}
		System.out.println(l_text.size());
	}

}
