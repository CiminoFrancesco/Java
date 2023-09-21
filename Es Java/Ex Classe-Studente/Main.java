import java.time.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        // creo degli studenti statici
        Studente s1= new Studente("Francesco", "Cimino", LocalDate.of(2005, 11, 25), 'M', "Torrile");
        //s1.calcoloEta(s1); //calcolo eta di uno studente        
        Studente s2= new Studente("Antonio", "Pereira", LocalDate.of(2005, 6, 18), 'M', "Parma");
        //s2.calcoloEta(s2);        
        Studente s3= new Studente("Marco", "Rossi", LocalDate.of(2005, 1, 4), 'M', "Borgotaro");
        //s3.calcoloEta(s3);        
        Studente s4= new Studente("Anna", "Verdi", LocalDate.of(2005, 4, 7), 'F', "Noceto");
        //s4.calcoloEta(s4);

        // creo delle classi
        Classe sez_A = new Classe(2023, 'A', "Informatica");
        //sez_A.AggiungiStudenti(s1); //inserisco uno studente nell'arraylist
        //sez_A.AggiungiStudenti(s2);
        //sez_A.StampaStudenti(); //stampa studenti di una classe
        //sez_A.cercaStudentiRes("Parma"); //stampa studenti di un certo comune
        //sez_A.cercaStudentiSesso('M'); //stampa studenti di un sesso


        Classe sez_B = new Classe(2023, 'B', "Informatica");
        //sez_B.AggiungiStudenti(s3);
        //sez_B.AggiungiStudenti(s4);
        //sez_B.StampaStudenti();
        //sez_B.cercaStudentiRes("Noceto");
        //sez_B.cercaStudentiSesso('F');
        
    }
}
