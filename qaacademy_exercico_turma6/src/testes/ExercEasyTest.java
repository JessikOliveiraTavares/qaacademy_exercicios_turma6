package testes;

import exercicio_easy.Exec3;
import exercicio_easy.Exec4;
import exercicio_easy.Exerc5;
import exercicio_easy.Exerc6;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ExercEasyTest {
    @Test
    public void testeDeJuncaoPalavra(){
        Exec3 exec3 =new Exec3();
        String qualeonome     =exec3.inverterNomes("jessika","Oliveira");

        assertEquals("qual é o nome:","jessika"+"Oliveira",exec3.inverterNomes("jessika","Oliveira"));


    }
    @Test
    public void  testeDobro(){
        Exec4 exec4 = new Exec4();
        String  odobro = exec4.calcularumnumero(10);
        assertEquals("o dobro é 20.0",odobro);

    }
    @Test
    public void somandoosnumeros(){
        Exerc5 exerc5 =new Exerc5();
        String somando = exerc5.somando(10,5,8);
        assertEquals("a soma dos numeros é 23.0",somando);


    }
    @Test
    public void multiplicandoosnumero(){
        Exerc5 exerc5 = new Exerc5();
        String multiplicando =exerc5.multiplicando(10,20,30);
        assertEquals(" a multiplicacao dos numeros é 6000.0",multiplicando);

    }
    @Test
    public void subtraindo (){
        Exerc5 exerc5 = new Exerc5();
        String subtraindo = exerc5.subtracao(100,80,20);
        assertEquals(" a subtracao dos numeros é0.0",subtraindo);
    }
    @Test
    public void media (){
        Exerc5 exerc5 = new Exerc5();
        String media =exerc5.amedia(60,30,15);
        assertEquals( " a media dos valores é35.0",media);


    }
@Test
    public void somandoasnotas(){
        Exerc6 exerc6 = new Exerc6();
        String asomadasnotas = exerc6.digiteumanota(10,20);
        assertEquals("a soma das notas é30.0",asomadasnotas);

    }
    @Test
    public void amedia(){
        Exerc6 exerc6 = new Exerc6();
        String amedia =  exerc6.amedia(10,20);
        assertEquals(" a media das notas é 20.0",amedia);
    }

    public void

}
