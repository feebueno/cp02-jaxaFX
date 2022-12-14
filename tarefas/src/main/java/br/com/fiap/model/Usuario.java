package br.com.fiap.model;

public class Cadastro {

    private String titulo;
    private String descricao;
    private String categoria;
    private int data;

    public Cadastro(String titulo, String descricao, String categoria, int data){
        this.titulo = titulo;
        this.descricao = descricao;
        this.categoria = categoria;
        this.data = data;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Cadastro [categoria=" + categoria + ", data=" + data + ", descricao=" + descricao + ", titulo=" + titulo
                + "]";
    }
}
