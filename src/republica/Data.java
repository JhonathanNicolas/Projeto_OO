package republica;
import republicaExceptions.*;

public class Data {

	int mes;
	int ano;

    public Data (int mes, int ano) throws DataInvalidaException {
        this.setMes(mes);
        this.setAno(ano);
    }

    // Deve setar um valor valido para o metedo mês
    public void setMes(int mes) throws DataInvalidaException { 
    	if(mes <= 0 || mes > 12)
    		throw new DataInvalidaException("Insira um mes valido");
    	else
    		this.mes = mes;
    }

    // Deve setar um valor valido para o metodo ano
    public void setAno(int ano) throws DataInvalidaException { 
    	if(ano < 1000 || ano >= 10000)	
    		throw new DataInvalidaException("Insira um ano valido");	
    	else	
    		this.ano = ano;
    }
    
    // Deve retornar o valor do metodo mês
    public int getMes() { 
        return mes;
    }
    
    // Deve retornar o valor do metedo ano
    public int getAno() { 
        return ano;
    }
}
