package br.com.xti.refinado;

import java.io.Serializable;

/*
 *  Instituição:        Universidade XTI
 *  Projeto:            Sistema de availiações
 *  Data de Criação:    08/10/2011
 *  Criador:            Luís Felipe
 *  Revisão:            2
 */

@Cabeçalho(
		instituicao = "Universidade XTI",
        projeto = "Sistema de Avaliaçoes",
        dataCriacao = "06/02/2023",
        criador = "Luís Felipe",
	    revisao = 2
)

@ErrosCorrigidos(erros = {"0001", "0002"})
@SuppressWarnings("serial")
public class Anotacao implements Serializable {

	@SuppressWarnings("unused")
	private int x;
	
	@Deprecated
	public void anotar() {}
	
	@Override
	public String toString() {
		return null;
	}
}
