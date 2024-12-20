import java.util.Objects;

public record PessoaRecord(String nome, int idade) {

    public PessoaRecord {
        Objects.requireNonNull(nome);
    }

    public PessoaRecord(String nome) {
        this(nome, 0);
    }

    public PessoaRecord() {
        this("Indefinido");
    }
}
