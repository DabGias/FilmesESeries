import java.util.ArrayList;
import javax.swing.JOptionPane;

public class FilmesESeries {

	public static void main(String[] args) {
		ArrayList<Filme> filmes = new ArrayList<Filme>();
		ArrayList<Serie> series = new ArrayList<Serie>();
		int indexDel = 0;
		int indexNota = 0;
		int indexAss = 0;
		int indexBuscar = 0;
		
		int opc = Integer.valueOf(JOptionPane.showInputDialog("----- Menu -----"
				+ "\n1 - Cadastrar mÃ­dia;"
				+ "\n2 - Apagar mÃ­dia;"
				+ "\n3 - Avaliar;"
				+ "\n4 - Marcar como assistido;"
				+ "\n5 - Ordenar por nota;"
				+ "\n6 - Buscar ðŸ”�;"
				+ "\n7 - Sair."
				+ "\n"
				+ "\nEscolha uma opÃ§Ã£o: "));
		
		while (opc != 7) {
			while (opc > 7 || opc < 1) {
				System.out.println("OpÃ§Ã£o invÃ¡lida!");
				opc = Integer.valueOf(JOptionPane.showInputDialog("----- Menu -----"
						+ "\n1 - Cadastrar mÃ­dia;"
						+ "\n2 - Apagar mÃ­dia;"
						+ "\n3 - Avaliar;"
						+ "\n4 - Marcar como assistido;"
						+ "\n5 - Ordenar por nota;"
						+ "\n6 - Buscar ðŸ”�;"
						+ "\n7 - Sair."
						+ "\n"
						+ "\nEscolha uma opÃ§Ã£o: "));
			}
			
			if (opc == 1) {
				int escolhaCad = Integer.valueOf(JOptionPane.showInputDialog("Deseja cadastrar sÃ©rie (1) ou filme (2)? "));
				
				while (escolhaCad != 1 && escolhaCad != 2) {
					System.out.println("OpÃ§Ã£o invÃ¡lida!");
					escolhaCad = Integer.valueOf(JOptionPane.showInputDialog("Deseja cadastrar sÃ©rie (1) ou filme (2)? "));
				}
				
				if (escolhaCad == 1) {
					String titulo = JOptionPane.showInputDialog("Qual o tÃ­tulo da sÃ©rie? ");
					String sinopse = JOptionPane.showInputDialog("Qual a sinopse? ");
					int ano = Integer.valueOf(JOptionPane.showInputDialog("Qual o ano da sÃ©rie? "));
					int temps = Integer.valueOf(JOptionPane.showInputDialog("Quantas temporadas? "));
					
					Serie novaSerie = new Serie(titulo, ano, sinopse, temps);
					series.add(novaSerie);
					System.out.println("SÃ©ries cadastradas: " + series);
				}
				
				if (escolhaCad == 2) {
					String titulo = JOptionPane.showInputDialog("Qual o tÃ­tulo do filme? ");
					String sinopse = JOptionPane.showInputDialog("Qual a sinopse? ");
					int ano = Integer.valueOf(JOptionPane.showInputDialog("Qual o ano do filme? "));
					
					Filme novoFilme = new Filme(titulo, ano, sinopse);
					filmes.add(novoFilme);
					System.out.println("Filmes cadastrados: " + filmes);
				}
			}
			
			if (opc == 2 && filmes.size() > 0 || opc == 2 && series.size() > 0) {
				int escolhaDel = Integer.valueOf(JOptionPane.showInputDialog("Deseja apagar sÃ©rie (1) ou filme (2)? "));
				
				while (escolhaDel != 1 && escolhaDel != 2) {
					System.out.println("OpÃ§Ã£o invÃ¡lida!");
					escolhaDel = Integer.valueOf(JOptionPane.showInputDialog("Deseja apagar sÃ©rie (1) ou filme (2)? "));
				}
				
				if (escolhaDel == 1 ) {
					String tituloDelSerie = JOptionPane.showInputDialog("Qual o tÃ­tulo da sÃ©rie que deseja apagar? ");
					
					for (Serie serie : series) {
						if (serie.getTitulo() == tituloDelSerie) {
							indexDel = series.indexOf(serie);
						}
					}
					
					series.remove(indexDel);
				}
				
				if (escolhaDel == 2) {
					String tituloDelFilme = JOptionPane.showInputDialog("Qual o tÃ­tulo do filme que deseja apagar? ");
					
					for (Filme filme : filmes) {
						if (filme.getTitulo() == tituloDelFilme) {
							indexDel = filmes.indexOf(filme);
						}
					}
					
					filmes.remove(indexDel);
				}
			}
			
			if (opc == 3 && filmes.size() > 0 || opc == 3 && series.size() > 0) {
				int escolhaNota = Integer.valueOf(JOptionPane.showInputDialog("Deseja avaliar série (1) ou filme (2)? "));
				
				while (escolhaNota != 1 && escolhaNota != 2) {
					System.out.println("OpÃ§Ã£o invÃ¡lida!");
					escolhaNota = Integer.valueOf(JOptionPane.showInputDialog("Deseja avaliar sÃ©rie (1) ou filme (2)? "));
				}
				
				if (escolhaNota == 1) {
					String tituloSerieNota = JOptionPane.showInputDialog("Qual o nome da série que deseja avaliar? ");
					
					for (Serie serie : series) {
						if (serie.getTitulo() == tituloSerieNota) {
							indexNota = series.indexOf(serie);
						}
					}
					
					double nota = Double.valueOf("Que nota deseja dar para " + series.get(indexNota).getTitulo() + " ? ");
					
					while (nota < 0 || nota > 5) {
						System.out.println("Opção inválida! A nota deve ser entre 0 e 5!");
						nota = Double.valueOf("Que nota deseja dar para " + series.get(indexNota).getTitulo() + " ? ");
					}
					
					series.get(indexNota).setNota(nota);
					System.out.println(series.get(indexNota));
				}
				
				if (escolhaNota == 2) {
					String tituloFilmeNota = JOptionPane.showInputDialog("Qual o nome do filme que deseja avaliar? ");
					
					for (Filme filme : filmes) {
						if (filme.getTitulo() == tituloFilmeNota) {
							indexNota = filmes.indexOf(filme);
						}
					}
					
					double nota = Double.valueOf("Que nota deseja dar para " + filmes.get(indexNota).getTitulo() + " ? ");
					
					while (nota < 0 || nota > 5) {
						System.out.println("Opção inválida! A nota deve ser entre 0 e 5!");
						nota = Double.valueOf("Que nota deseja dar para " + filmes.get(indexNota).getTitulo() + " ? ");
					}
					
					filmes.get(indexNota).setNota(nota);
					System.out.println(filmes.get(indexNota));
				}
			}
			
			if (opc == 4 && filmes.size() > 0 || opc == 4 && series.size() > 0) {
				int escolhaAss = Integer.valueOf(JOptionPane.showInputDialog("Deseja marcar como assistido série (1) ou filme (2)? "));
				
				while (escolhaAss != 1 && escolhaAss != 2) {
					System.out.println("OpÃ§Ã£o invÃ¡lida!");
					escolhaAss = Integer.valueOf(JOptionPane.showInputDialog("Deseja marcar como assitido sÃ©rie (1) ou filme (2)? "));
				}
				
				if (escolhaAss == 1) {
					String tituloSerieAss = JOptionPane.showInputDialog("Qual o nome da série que deseja marcar como assistido? ");
					
					for (Serie serie : series) {
						if (serie.getTitulo() == tituloSerieAss) {
							indexAss = series.indexOf(serie);
						}
					}
					
					series.get(indexAss).setAssistido(true);
				}
				
				if (escolhaAss == 2) {
					String tituloFilmeAss = JOptionPane.showInputDialog("Qual o nome do filme que deseja marcar como assistido? ");
					
					for (Filme filme : filmes) {
						if (filme.getTitulo() == tituloFilmeAss) {
							indexAss = filmes.indexOf(filme);
						}
					}
					
					filmes.get(indexAss).setAssistido(true);
				}
				
			}
			
			if (opc == 5 && filmes.size() > 0 || opc == 5 && series.size() > 0) {
				int escolhaOrd = Integer.valueOf(JOptionPane.showInputDialog("O que deseja ordenar? Séries (1) ou filmes (2)? "));
				
				while (escolhaOrd != 1 && escolhaOrd != 2) {
					System.out.println("Opção inválida!");
					escolhaOrd = Integer.valueOf(JOptionPane.showInputDialog("O que deseja ordenar? Séries (1) ou filmes (2)? "));
				}
				
				if (escolhaOrd == 1) {
					for (Serie serie : series) {
						for (Serie serieCompar : series) {
							if (serie.getNota() < serieCompar.getNota()) {
								int aux = series.indexOf(serie);
								
								series.set(series.indexOf(serie), series.get(series.indexOf(serieCompar)));
								series.set(series.indexOf(serieCompar), series.get(aux));
							}
						}
					}
					
					System.out.println(series);
				}
				
				if (escolhaOrd == 2) {
					for (Filme filme : filmes) {
						for (Filme filmeCompar : filmes) {
							if (filme.getNota() < filmeCompar.getNota()) {
								int aux = filmes.indexOf(filme);
								
								filmes.set(filmes.indexOf(filme), filmes.get(filmes.indexOf(filmeCompar)));
								filmes.set(filmes.indexOf(filmeCompar), filmes.get(aux));
							}
						}
					}
					
					System.out.println(filmes);
				}
			}
			
			if (opc == 6 && filmes.size() > 0 || opc == 6 && series.size() > 0) {
				String tituloBuscar = JOptionPane.showInputDialog("Qual o nome da mídia que deseja buscar? ");
				
				System.out.println("Séries: ");
				for (Serie serie : series) {
					if (serie.getTitulo() == tituloBuscar) {
						System.out.println(serie.getTitulo());
					}
				}
				
				System.out.println("Filmes: ");
				for (Filme filme : filmes) {
					if (filme.getTitulo() == tituloBuscar) {
						System.out.println(filme.getTitulo());
					}
				}
			} 
			
			opc = Integer.valueOf(JOptionPane.showInputDialog("----- Menu -----"
					+ "\n1 - Cadastrar mÃ­dia;"
					+ "\n2 - Apagar mÃ­dia;"
					+ "\n3 - Avaliar;"
					+ "\n4 - Marcar como assistido;"
					+ "\n5 - Ordenar por nota;"
					+ "\n6 - Buscar ðŸ”�;"
					+ "\n7 - Sair."
					+ "\n"
					+ "\nEscolha uma opÃ§Ã£o: ")); 
		}

	}

}
