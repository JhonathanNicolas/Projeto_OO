package republica;
import republicaExceptions.*;
public class Subcategoria {
	    
	    	String descricaoSubcategoria;

	    public Subcategoria (String descricao) throws DescricaoNaoInformadaException {
	        this.setDescricao(descricao);
	    }

	    // Deve retornar o valor da metodo descricaoSubcategoria
	    public String getDescricao() { 
	    	
	        return descricaoSubcategoria;
	    }

	    // Deve setar o valor da metodo descricaoSubcategoria
	    public void setDescricao(String descricao) throws DescricaoNaoInformadaException { 
		  if (descricao.length() <  1)
	    	  {
			  throw new DescricaoNaoInformadaException("O tamanho da decrição deve ser maior ou igual a 1 caractere");
	    	  }
		  else
			  this.descricaoSubcategoria = descricao;
	    	  }
	      
	    }
