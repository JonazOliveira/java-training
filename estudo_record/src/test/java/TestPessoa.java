public class TestPessoa {

    public TestPessoa() {
    }

     public void testGetNome() {
        Pessoa pessoa = new Pessoa("Java");

        assert pessoa.getNome().equals("Java");
    }

    public void testSetNome() {
         Pessoa pessoa = new Pessoa();
         pessoa.setNome("Java");

         assert pessoa.getNome().equals("Java");
    }

    public void testGetIdade() {
         Pessoa pessoa = new Pessoa( 29);

         assert pessoa.getIdade() == 29;
    }

    public void testSetIdade() {
         Pessoa pessoa = new Pessoa();
         pessoa.setIdade(29);

         assert pessoa.getIdade() == 29;
    }

    public void testHashCode() {
        Pessoa pessoa1 = new Pessoa("Java", 29);
        Pessoa pessoa2 = new Pessoa("Java", 29);

        assert pessoa1.hashCode() == pessoa2.hashCode();
    }

    public void testEqualsObject() {
         Pessoa pessoa1 = new Pessoa("Java", 29);
         Pessoa pessoa2 = new Pessoa("Java", 29);

         assert pessoa1.equals(pessoa2);
    }

    public void testToString() {
         Pessoa pessoa = new Pessoa("Java", 29);

         assert pessoa.toString().equals("Pessoa[nome=Java, idade=29]");
    }
}
