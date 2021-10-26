package republicaExceptions;

public class DadosPessoaisIncompletosException extends Exception{
	
	/**
	 * Essa excessão será lançada sempre que o usuário informar um dado
	 * pessoal incompleto
	 */
	
	private static final long serialVersionUID =  1L ;

	public  DadosPessoaisIncompletosException ( String  mensagem ) {
        super (mensagem);
    }
}