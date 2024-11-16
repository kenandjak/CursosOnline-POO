package model;
// ALT + SHIFT + S

public abstract class Usuario {
	private String nome;
	protected String email; //modificador alterado para equals em Estudante
	private String senha;
	
	public Usuario (String nome, String email, String senha) {
		this.nome = nome;
		this.email = email;
		this.senha = senha;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
            public void setSenha(String senha) {
                        this.senha = senha;
            }
            
            
            
        // Controller
//	public boolean validarSenha(String senha) {
//                        if(this.senha != null) {
//                            return this.senha.equals(senha);
//                        }
//                        return false;
//            }

}
