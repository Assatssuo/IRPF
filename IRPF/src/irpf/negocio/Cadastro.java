package irpf.negocio;

import java.util.List;

public interface Cadastro {
	
	public void Add();
	
	public void update();
	
	public void delete();
	
	public PessoaFisica get();
	
	public List<PessoaFisica> get(String n);
	
}
