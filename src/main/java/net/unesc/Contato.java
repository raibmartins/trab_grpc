package net.unesc;

public class Contato {
    private String nomePessoa;
    private String numero;


    public Contato(String nomePessoa, String numero) {
        this.nomePessoa = nomePessoa;
        this.numero = numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public void setNomePessoa(String nomePessoa) {
        this.nomePessoa = nomePessoa;
    }

    public String getNumero() {
        return numero;
    }

    public String getNomePessoa() {
        return nomePessoa;
    }

    @Override
    public String toString() {
        return "{" +
                "nomePessoa='" + nomePessoa + '\'' +
                ", numero='" + numero + '\'' +
                '}';
    }
}
