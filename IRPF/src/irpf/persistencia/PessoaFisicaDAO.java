package irpf.persistencia;

import java.util.List;

import irpf.negocio.Cadastro;
import irpf.negocio.PessoaFisica;

public class PessoaFisicaDAO implements Cadastro {

	private List<PessoaFisica> pessoas;
	
	public PessoaFisicaDAO(){
		
	}
	
	public void Add(PessoaFisica pessoa){
		pessoas.add(pessoa);
	}
	
	public void update(){
		
	}
	
	public void delete(){
		
	}
	
	public PessoaFisica get(){
		
	}
	
	public List<PessoaFisica> get(String n){
		
	}
	
	
}
