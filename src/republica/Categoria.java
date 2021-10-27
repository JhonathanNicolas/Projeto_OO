package republica;
import republicaExceptions.*;

public class Categoria {

	String descricaoCategoria;
	Subcategoria subcategoria;

	public Categoria (String descricaoCategoria) throws DescricaoNaoInformadaException{
		this.setDescricao(descricaoCategoria);
		this.setSubcategoria(null);
	}
	
	public Categoria (String descricaoCategoria, Subcategoria subcategoria) throws DescricaoNaoInformadaException{
		this.setDescricao(descricaoCategoria);
		this.setSubcategoria(subcategoria);
	}
	
	// Deve retornar o valor da metodo subcategoria
    public Subcategoria getSubcategoria() { 
        return subcategoria;
    }

    // Deve setar o valor da metodo subcategoria
    public void setSubcategoria(Subcategoria subcategoria) { 
      this.subcategoria = subcategoria;
    }

    // Deve retornar o valor da metodo descricaoCategoria
    public String getDescricao() { 
    	return descricaoCategoria;
    }

    // Deve setar o valor da metodo descricaoCategoria
    public void setDescricao(String descricaoCategoria) throws DescricaoNaoInformadaException{ 
    	if (descricaoCategoria == null || descricaoCategoria == "") {
    		throw new DescricaoNaoInformadaException("Erro: Descrição da categoria não informada!");
    	} else {
    		this.descricaoCategoria = descricaoCategoria;
    	}
    }
    
}
