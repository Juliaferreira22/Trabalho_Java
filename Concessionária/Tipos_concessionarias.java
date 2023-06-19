public enum Tipos_concessionarias {

    MULTIMARCAS("Diversas", "Curitiba"),
    IMPORTADOS("Import", "Londrina"),
    NACIONAIS("Brasileira", "São Paulo");

    String nome, cidade;

    private Tipos_concessionarias(String nome, String cidade){
        this.nome = nome;
        this.cidade = cidade; 
    }
    
}
