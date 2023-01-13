import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        Feriado feriado1 = new Feriado("Confraternização mundial", "01/01/2023");
        Feriado feriado2 = new Feriado("Carnaval", "21/02/2023");
        Feriado feriado3 = new Feriado("Páscoa", "17/04/2023");
        Feriado feriado4 = new Feriado("Tiradentes", "21/04/2023");
        Feriado feriado5 = new Feriado("Dia do trabalho", "01/05/2023");
        Feriado feriado6 = new Feriado("Corpus Christi", "08/06/2023");
        Feriado feriado7 = new Feriado("Independência do Brasil", "07/09/2023");
        Feriado feriado8 = new Feriado("Nossa Senhora Aparecida", "12/10/2023");
        Feriado feriado9 = new Feriado("Finados", "02/11/2023");
        Feriado feriado10 = new Feriado("Proclamação da República", "15/11/2023");
        Feriado feriado11 = new Feriado("Natal", "25/12/2023");
        Feriado[] feriados = new Feriado[]{feriado1,feriado2,feriado3, feriado4, feriado5, feriado6, feriado7, feriado8, feriado9, feriado10, feriado11};
        Calendario calendario = new Calendario(feriados);

        System.out.println(calendario.achaFeriado("01/01/2023"));

    }
}
