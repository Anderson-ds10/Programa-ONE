package sintaxeVariaveis;

public class lacosEncadeados {
	 public static void main(String[] args) {
		 int linha = 0;
		 int coluna = 0;
		 for(linha = 0; linha <= 10; linha++) {
			 
			 for(coluna = 0; coluna <= 10; coluna++) {
				 System.out.print(linha * coluna);
				 System.out.print(" ");
			 }
			 System.out.println();
		 }
	}
}
