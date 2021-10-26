package republica;
import republicaExceptions.*;

public class Data {

	int mes;
	int ano;

    public Data (int mes, int ano) throws DataInvalidaException {
        this.setMes(mes);
        this.setAno(ano);
    }

    public void setMes(int mes) throws DataInvalidaException { //Deve setar um valor valido para o metedo mes
    	if(mes <= 0 || mes > 12)
    		throw new DataInvalidaException("Insira um mes valido");
    	else
    		this.mes = mes;
    }

    public void setAno(int ano) throws DataInvalidaException { // Deve setar um valor valido para o metodo ano
    	if(ano < 1000 || ano >= 10000)
    		throw new DataInvalidaException("Insira um ano valido");	
    	else	
    		this.ano = ano;
    }
    
    public int getMes() { // Deve retornar o valor do metodo mes
        return mes;
    }
    public int getAno() { // Deve retornar o valor do metedo ano
        return ano;
    }
}
