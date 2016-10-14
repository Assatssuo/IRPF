package irpf.nogocio;
public class PessoaFisica {

	private String nome;
	private String cpf;
	private int idade;
	private int nDependentes;
	private double contPrev;
	private double totalRendimento;

	public PessoaFisica(String n, String c, int i, int d, double p, double r){
		nome = n;
		cpf = c;
		idade = 1;
		nDependentes = d;
		contPrev = p;
		totalRendimento = r;
	}

	public String getNome() {
		return nome;
	}

	public String getCpf() {
		return cpf;
	}

	public int getnDependentes() {
		return nDependentes;
	}

	public double getContPrev() {
		return contPrev;
	}

	public double getTotalRendimento() {
		return totalRendimento;
	}

	public double getIdade(){
		return idade;
	}
}