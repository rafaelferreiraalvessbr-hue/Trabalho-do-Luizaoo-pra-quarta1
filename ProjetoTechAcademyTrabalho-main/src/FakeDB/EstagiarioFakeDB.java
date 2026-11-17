package FakeDB;

import java.util.ArrayList;

import Dominio.Estagiario;

public class EstagiarioFakeDB extends AbsGenericFakeDB<Estagiario> {

    public EstagiarioFakeDB() {
        this.dados = new ArrayList<>();
        this.autoPreencher();
    }

    @Override
    protected void autoPreencher() {
        this.dados.add(new Estagiario(401, "Pedro Sousa", "131234234566", "pedro@email.com", "67992220001", "Rua Goiás, 12", 1200.0, 20, "Suporte de TI"));
        this.dados.add(new Estagiario(402, "Maria Marta", "2334545656567", "maria@email.com", "67992220002", "Rua Pará, 78", 1400.0, 30, "Desenvolvimento"));
        this.dados.add(new Estagiario(403, "Paulo Teixeira", "344546567878", "paulo@email.com", "67992220003", "Av. Mato Grosso, 300", 1100.0, 20, "Biblioteca"));
    }
}
