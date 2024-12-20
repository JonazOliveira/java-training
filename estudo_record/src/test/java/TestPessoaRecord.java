public class TestPessoaRecord {

    public TestPessoaRecord() {
    }

    public void testGetNome() {
        PessoaRecord pessoaRecord = new PessoaRecord("Java", 29);

        assert pessoaRecord.nome().equals("Java");
    }

    public void testGetIdade() {
        PessoaRecord pessoaRecord = new PessoaRecord( "Java",29);

        assert pessoaRecord.idade() == 29;
    }

    public void testHashCode() {
        PessoaRecord pessoaRecord1 = new PessoaRecord("Java", 29);
        PessoaRecord pessoaRecord2 = new PessoaRecord("Java", 29);

        assert pessoaRecord1.hashCode() == pessoaRecord2.hashCode();
    }

    public void testEqualsObject() {
        PessoaRecord pessoaRecord1 = new PessoaRecord("Java", 29);
        PessoaRecord pessoaRecord2 = new PessoaRecord("Java", 29);

        assert pessoaRecord1.equals(pessoaRecord2);
    }

    public void testToString() {
        PessoaRecord pessoaRecord = new PessoaRecord("Java", 29);

        assert pessoaRecord.toString().equals("PessoaRecord[nome=Java, idade=29]");
    }

    public void testNonParameters() {
        PessoaRecord pessoaRecord = new PessoaRecord();

        assert pessoaRecord.nome().equals("Indefinido");
        assert pessoaRecord.idade() == 0;
    }
}
