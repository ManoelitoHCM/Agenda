
public interface TabelaHashProjeto {

	public int hash(int id);
	/**
	* Gera um identificador a partir de um valor de entrada (nome do contato)
	* @return o identificador calculado pela função hash.
	*/

	public boolean verificaSeCheia();
    /**
	 * Verifica se a agenda está cheia ou se há espaço.
	 * @return true se estiver cheia.
	 */
	
	public void adicionar(Contato pessoa) throws Exception;
    /**
     * Adiciona contato na agenda. 
     * @param objeto pessoa que deseja registrar.
	 * @throws exceção se tabela estiver cheia ou não for informado nome ou numero corretamente
	 */
	
	public void remover(int id) throws Exception;
	/**
	 * Remove contato na agenda.
	 * @param o id do objeto pessoa que deseja remover.
	 * @throws exceção se não houver contato registrado na agenda/não foi encontrado.
	 */
	
	public void pesquisar() throws Exception;
	/**
	 * Pesquisa contato na agenda.
	 * @return o contato com identificador igual ao fornecido.
	 * @throws exceção se não houver contato registrado na agenda/não foi encontrado.
	 */
	
	public void exibirLista();
	/**
	 * Exibe toda a lista de contatos.
	 * @return listagem com todos os contatos cadastrados.
	 */
}