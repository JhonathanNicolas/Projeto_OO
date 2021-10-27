package testes;
import republica.Subcategoria;
import republica.Categoria;

// Static block
class  categoriaTest
{
private static Subcategoria luz;
private static Subcategoria internet;
private static Categoria residencia;
static                  
{




}
// Static method
public static void main(String args[]) throws Exception  
{
	 // Criação da classe Subcategoria
	 luz = new Subcategoria("Conta de luz");
	 internet = new Subcategoria("Conta de internet");

	 
	 // Testando criação da classe Categoria
	 residencia = new Categoria("Residência", luz);
	 System.out.println(residencia.getDescricao());
	 System.out.println(residencia.getSubcategoria().getDescricao());
	 
	// Testando setar descrição
	residencia.setDescricao("Telecomunicações");
	System.out.println(residencia.getDescricao());
	
	// Testando setar subcategoria
	residencia.setSubcategoria(internet);
	System.out.println(residencia.getSubcategoria().getDescricao());


	// Testando execeção
	residencia.setDescricao("");
	 
}
}