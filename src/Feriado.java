public class Feriado {
private String data;
private String nome;

    public Feriado(String nome, String data){
        this.nome = nome;
        this.data = data;
    }

public String getNome(){
    return this.nome;
}

void setNome(String nome){
    this.nome = nome;
}

public String getData(){
    return this.data;
}

void setData(String data){
    this.data = data;
}
}