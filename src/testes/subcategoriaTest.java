package testes;
import republica.Subcategoria;

// Static block
class  DemoSubcategoria
{
private static Subcategoria luz;
static                  
{

// Static method
}
public static void main(String args[]) throws Exception  
{
	 // Testando criação da classe
	 luz = new Subcategoria("Conta de luz");
	 System.out.println(luz.getDescricao());

	 // Testando setar descrição
	 luz.setDescricao("agua");
	 System.out.println(luz.getDescricao());


	 // Testando execeção
	 luz.setDescricao("");
	 System.out.println(luz.getDescricao());
}
}
