package republica;
import republicaExceptions.*;

public class Despesa {

	float valor;
	Data data;
	String descricao;
	Categoria categoria;

	public Despesa (float valor, Data data, String descricao, Categoria categoria) throws ValorNaoInformadoException, DescricaoNaoInformadaException, DataNaoInformadaException, CategoriaNaoInformadaException {
        this.setValor(valor);
        this.setData (data);
        this.setDescricao(descricao);
        this.setCategoria (categoria);
    }

	// Deve retornar o valor do metodo valor
    public float getValor() { 
        return valor;
    }

    // Deve setar o valor do metodo valor
    public void setValor(float valor) throws ValorNaoInformadoException{ 
      if (valor == 0.0f) {
    	  throw new ValorNaoInformadoException("Erro: Valor da despesa não informado!");
      } else {
    	  this.valor = valor;
      }
    }

    // Deve retornar o valor da metodo data
    public Data getData() { 
    	return data;
    }

    // Deve setar o valor da metodo data
    public void setData(Data data) throws DataNaoInformadaException { 
    	if (data == null) {
    		throw new DataNaoInformadaException("Erro: Data da despesa não informada!");
    	}else {
    		this.data = data;
    	}
	}
    
    // Deve retornar o valor da metodo descri��o
    public String getDescricao() { 
        return descricao;
    }

    // Deve setar o valor da metodo descri��o
    public void setDescricao(String descricao) throws DescricaoNaoInformadaException { 
    	if (descricao == null || descricao == "") {
    		throw new DescricaoNaoInformadaException("Erro: Descrição da categoria não informada!");
    	} else {
    		this.descricao = descricao;
    	}
    }

    // Deve retornar o valor da metodo categoria
    public Categoria getCategoria() { 
    	return categoria;
    }

    // Deve setar o valor da metodo categoria
    public void setCategoria(Categoria categoria) throws CategoriaNaoInformadaException { 
    	if (categoria == null) {
    		throw new CategoriaNaoInformadaException("Erro: Categoria da despesa não informada!");
    	} else {
    		this.categoria = categoria;
    	}
    }
    
    
}
