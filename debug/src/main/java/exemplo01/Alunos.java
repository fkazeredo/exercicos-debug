package exemplo01;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

public class Alunos {

    List<Aluno> findAll() {
        return Arrays.asList(
                new Aluno("John", new BigDecimal(8), new BigDecimal(7)),
                new Aluno("Peter", new BigDecimal(5), new BigDecimal(4.9)),
                new Aluno("Mariah", new BigDecimal(8), new BigDecimal(9)),
                new Aluno("Josh", new BigDecimal(10), new BigDecimal(10)),
                new Aluno("Lisa", new BigDecimal(8), null),
                new Aluno("Margot", new BigDecimal(7), new BigDecimal(7)),
                new Aluno("Thalia", new BigDecimal(2), new BigDecimal(-7))
        );
    }

}
