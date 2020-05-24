package teste;

import java.util.ArrayList;
import java.util.List;

import helpers.GENERO;
//import main.AlunoFatecSJC;
import main.Sapato;
import main.Instrumento;
import main.Lugar;
import main.Pessoa;
import main.Profissional;

public class Teste {

	public static void main(String[] args) {
		
		List<Pessoa> pessoas = new ArrayList<Pessoa>();
		pessoas.add(new Pessoa("Abner", 21, 1234567, GENERO.MASCULINO));
		pessoas.add(new Pessoa("Vitoria", 20, 7654321, GENERO.FEMININO));
		pessoas.add(new Pessoa("Davi", 34, 1122334, GENERO.MASCULINO));
		pessoas.add(new Pessoa("Roberta", 35, 4455667, GENERO.FEMININO));
		pessoas.add(new Pessoa("Mariana", 36, 9988776, GENERO.FEMININO));
		
		//List<AlunoFatecSJC> alunos = new ArrayList<AlunoFatecSJC>();
		//alunos.add(new AlunoFatecSJC("Abner", 123456, ADS, GENERO.MASCULINO));
		//alunos.add(new AlunoFatecSJC("Vitoria", 654321, BD, GENERO.FEMININO));
		//alunos.add(new AlunoFatecSJC("Davi", 112233, ADS, GENERO.MASCULINO));
		//alunos.add(new AlunoFatecSJC("Roberta", 556677, Logistica, GENERO.FEMININO));
		//alunos.add(new AlunoFatecSJC("Mariana", 998877, BD, GENERO.FEMININO));
		
		List<Lugar> lugares = new ArrayList<Lugar>();
		lugares.add(new Lugar("Central Park", "Manhatan", "New York", "USA"));
		lugares.add(new Lugar("Torre Eiffel", "Champ de Mars", "Paris", "França"));
		lugares.add(new Lugar("Coliseu", "Centro", "Roma", "Italia"));
		lugares.add(new Lugar("Palácio Buckinghan", "Westminster", "Londres", "Reino Unido"));
		lugares.add(new Lugar("Disney", "Bay Lake", "Orlando", "Florida"));
		
		List<Sapato> calcados = new ArrayList<Sapato>();
		calcados.add(new Sapato ("Tênis", "Adidas", 35));
		calcados.add(new Sapato ("Sapatilha", "Moleca", 37));
		calcados.add(new Sapato ("Sandália", "ViaUno", 35));
		calcados.add(new Sapato ("Chinelo", "Havaianas", 44));
		calcados.add(new Sapato ("Bota", "Democrata", 38));
		
		List<Instrumento> instrumentos = new ArrayList<Instrumento>();
		instrumentos.add(new Instrumento("Violino", Double.valueOf(10200)));
		instrumentos.add(new Instrumento("Saxofone", Double.valueOf(1500)));
		instrumentos.add(new Instrumento("Harpa", Double.valueOf(37500)));
		instrumentos.add(new Instrumento("Violão", Double.valueOf(1510)));
		instrumentos.add(new Instrumento("Flauta", Double.valueOf(500)));
		
		List<Profissional> profissionais = new ArrayList<Profissional>();
		profissionais.add(new Profissional("Arquiteto", Double.valueOf(5000), 43));
		profissionais.add(new Profissional("Programador", Double.valueOf(5000), 23));
		profissionais.add(new Profissional("Administrador", Double.valueOf(2000), 33));
		profissionais.add(new Profissional("Engenheiro", Double.valueOf(3200), 27));
		profissionais.add(new Profissional("Enfermeiro", Double.valueOf(3000), 36));
		
			
		//System.out.println("\n");
		//alunos.forEach(aluno -> {
			//System.out.println(aluno);
			//aluno.dormir();
			//aluno.estudar();
		//});
		
		System.out.println("\n");
		lugares.forEach(lugar -> {
			lugar.receberVisita(pessoas);
			System.out.println(lugar);
		});
		
		System.out.println("\n");
		calcados.forEach(sapato -> {
			sapato.serVestido(pessoas.get(sapato.indexOf(sapato)));
			System.out.println(sapato);
		});
		
		System.out.println("\n");
		instrumentos.forEach(instrumento -> {
			instrumento.avaliarPreco();
			System.out.println(instrumento);
		});
		
		System.out.println("\n");
		profissionais.forEach(profissional -> {
			profissional.perguntarSalario();
			System.out.println(profissional);
		});
	}
	

}