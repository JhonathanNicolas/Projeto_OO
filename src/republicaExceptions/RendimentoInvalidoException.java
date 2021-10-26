package republicaExceptions;

	public class RendimentoInvalidoException extends Exception {
		/**
		 * Essa excessão será lançada sempre que o usuário informar um rendimento inválido
		 */ 
		
		private static final long serialVersionUID = 1L;

		public RendimentoInvalidoException(String message) {
	        super(message);
		}
}
