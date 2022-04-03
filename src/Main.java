import br.com.dio.Desafio.dominio.Bootcamp;
import br.com.dio.Desafio.dominio.Curso;
import br.com.dio.Desafio.dominio.Dev;
import br.com.dio.Desafio.dominio.Mentoria;
import jdk.swing.interop.SwingInterOpUtils;

import java.security.spec.RSAOtherPrimeInfo;
import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        Curso curso1 = new Curso();

        curso1.setTitulo("Java");
        curso1.setDescricao("Java - OO");
        curso1.setCargaHoraria(30);

        Curso curso2 = new Curso();

        curso2.setTitulo("Springboot");
        curso2.setDescricao("Java - Springboot");
        curso2.setCargaHoraria(40);

        Mentoria mentoria1 = new Mentoria();

        mentoria1.setTitulo("Mentoria 1");
        mentoria1.setDescricao("Mentoria de Java");
        mentoria1.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Java Developer");
        bootcamp.setDescricao("Descrição do Curso Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria1);

        Dev dev1 = new Dev();
        dev1.setNome("Vitor");
        dev1.inscreverBootcamp(bootcamp);
        dev1.progredir();
        dev1.progredir();
        System.out.println("Dev: " + dev1.getNome());
        System.out.println("Conteúdos inscritos: " + dev1.getConteudosIncritos());
        System.out.println("Conteúdos concluídos: " + dev1.getConteudosConcluidos());
        System.out.println("Total Xp: " + dev1.calcularTotalXP());

        Dev dev2 = new Dev();
        dev2.setNome("Alan");
        dev2.progredir();
        System.out.println("Dev: " + dev2.getNome());
        System.out.println("Conteúdos inscritos: " + dev2.getConteudosIncritos());
        System.out.println("Conteúdos concluídos: " + dev2.getConteudosConcluidos());
        System.out.println("Total Xp: " + dev2.calcularTotalXP());

    }
}
