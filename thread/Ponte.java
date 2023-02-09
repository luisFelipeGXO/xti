package br.com.xti.thread;

/**
 * Uma <code>Ponte</code> representa o elo 
 * de ligação entre objetos Produtores e 
 * Consumidores de informações. Os  <i>/Produtores</i> utilizam as pontes 
 * para gravar informações e compartilhas essas informações com os 
 * Consumidores que lêem esses dados da Ponte 
 * para fazer o processamento
 * 
 * @author Luis Felipe
 * @version 1.3
 * @since 1.0
 * 
 * @see PonteNaoSincronizadad
 * @see PonteSincronizada
 */

public interface Ponte {

	/**
	 * Armazena o valor informado na ponte. Geralmente
	 * sera chamado pelas classes Produtoras de dados.
	 * 
	 * @param valor
	 * @throws InterruptedException
	 */
	public void set(int valor) throws InterruptedException;
	/**
	 * Recupera a informação armazenada na Ponte. Esse
	 * método será chamado pelas Consumidoras de dados.
	 * 
	 * @return
	 * @throws InterruptedException
	 */
	public int get() throws InterruptedException;
	
}
