package FakeDB;

import java.util.ArrayList;

import Dominio.Egresso;

public class EgressoFakeDB extends AbsGenericFakeDB<Egresso> {

    public EgressoFakeDB() {
        this.dados = new ArrayList<>();
        this.autoPreencher();
    }

    @Override
    protected void autoPreencher() {
        this.dados.add(new Egresso(201, "Paula Nunes", "12232433454565", 2019, "Ciência da Computação", "Desenvolvimento Web"));
        this.dados.add(new Egresso(202, "Rafael Ferreira", "12233454556", 2021, "Sistemas de Informação", "Banco de Dados"));
        this.dados.add(new Egresso(203, "Joao Prado", "122434567789", 2020, "Engenharia de Software", "Qualidade de Software"));
        this.dados.add(new Egresso(204, "Tiago Ramos", "11122233304", 2022, "Ciência da Computação", "Redes e Segurança"));
    }
}
