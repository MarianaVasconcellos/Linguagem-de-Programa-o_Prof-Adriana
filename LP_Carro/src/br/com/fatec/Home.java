package br.com.fatec;

import java.util.UUID;

import br.com.fatec.enums.Cor;
import br.com.fatec.enums.TipoConta;
import br.com.fatec.model.Carro;
import br.com.fatec.model.Conta;
import br.com.fatec.model.Lugar;
import br.com.fatec.model.Pessoa;
import br.com.fatec.service.AgenciaBancaria;
import br.com.fatec.service.AgenciaViagens;
import br.com.fatec.service.Concessionaria;

public class Home {

	public static void main(String[] args) {
		
		System.out.println("\nEx: 1");
		Carro carro1 = new Carro("123sdf", "Renault Kwid", Cor.VERMELHO, Double.valueOf(522000));
		Carro carro2 = new Carro("abc1234", "Troller", Cor.PRETO, Double.valueOf(22000));
		
		Concessionaria concess = new Concessionaria();
		concess.adicionarCarro(carro1);
		concess.adicionarCarro(carro2);
		
		concess.listarCarros();
		concess.imprimirTabelapreco();
		concess.listarDadosCarro("abc1234");
		concess.listarDadosCarro("abcdefgh");
		
		System.out.println("\nEx: 2");
		AgenciaBancaria agencia = new AgenciaBancaria();
		
		Pessoa pessoa = new Pessoa("123.456.789-00", "Abner", 22);
		Pessoa pessoa2 = new Pessoa("456.123.987-11", "Roberta", 30);
		Conta conta = new Conta(UUID.randomUUID().toString(), pessoa, TipoConta.GOLD, Double.valueOf(5370d));
		Conta conta2 = new Conta(UUID.randomUUID().toString(), pessoa2, TipoConta.ESTUDANTE, Double.valueOf(514d));
		
		agencia.adicionarConta(conta);
		agencia.adicionarConta(conta2);
		agencia.listarDadosPessoa("123.456.789-00");
		agencia.listarDadosPessoa("123.456.789-00");
		agencia.listarDadosPessoa("456.123.987-11");
		agencia.removerConta("123.456.789-00");
		agencia.removerConta("456.123.987-11");
		agencia.listarDadosPessoa("456.123.987-11");
		
		System.out.println("\nEx: 3");
		Lugar lugar = new Lugar("Central Park", "Manhatan", "New York", "USA");
		Lugar lugar2 = new Lugar("Disney", "Bay Lake", "Orlando", "Florida");
		
		AgenciaViagens viagens = new AgenciaViagens();
		
		viagens.adicionarViagem(pessoa, lugar2);
		viagens.adicionarViagem(pessoa2, lugar);
		viagens.listarDadosDestino("123.456.789-00");
		viagens.listarDadosDestino("433.ads96.74sd-777");
		viagens.listarDadosPessoa("123.456.789-00abcdefgh");
		viagens.listarDadosPessoa("456.123.987-11");
	}

}