import br.com.dio.Desafio.dominio.Curso;
import br.com.dio.Desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        Curso curso1 = new Curso();

        curso1.setTitulo("Java");
        curso1.setDescricao("OO");
        curso1.setCargaHoraria(30);

        Mentoria mentoria1 = new Mentoria();

        mentoria1.setTitulo("Mentoria 1");
        mentoria1.setDescricao("Mentoria de Java");
        mentoria1.setData(LocalDate.now());



    }
}
