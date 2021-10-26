package republicaExceptions;

public class DataInvalidaException extends Exception {
	
	/**
	 * Essa excessão será lançada sempre que o usuário informar uma data inválida
	 */
	
	private static final long serialVersionUID = 1L;

	public DataInvalidaException(String message) {
        super(message);
	}
}
