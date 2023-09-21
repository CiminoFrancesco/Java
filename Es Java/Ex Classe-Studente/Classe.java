import java.net.http.WebSocketHandshakeException;
import java.time.*;
import java.util.*;

public class Classe{
    private int anno;
    private char sezione;
    private String indirizzo;
    private ArrayList<Studente> arrStudenti = new ArrayList<>();

    public Classe() {}

    public Classe(int anno, char sezione, String indirizzo) {
        this.anno = anno;
        this.sezione = sezione;
        this.indirizzo = indirizzo;
    }

    public int getAnno() {
        return anno;
    }
    public void setAnno(int anno) {
        this.anno = anno;
    }
    public char getSezione() {
        return sezione;
    }
    public void setSezione(char sezione) {
        this.sezione = sezione;
    }
    public String getIndirizzo() {
        return indirizzo;
    }
    public void setIndirizzo(String indirizzo) {
        this.indirizzo = indirizzo;
    }
    public ArrayList<Studente> getArrStudenti() {
        return arrStudenti;
    }
    public void setN_studenti(ArrayList<Studente> arrStudenti) {
        this.arrStudenti = arrStudenti;
    }

    public void AggiungiStudenti(Studente s){
        if(arrStudenti.size() < 30){
            arrStudenti.add(s);
        }
        else{
            System.out.println("Questa classe ha raggiunto il limite massimo di studenti, cambiare classe");
        }
    }

    public void StampaStudenti(){
        int cont = 1; 
        for(int i = 0; i < arrStudenti.size(); i++){
            System.out.print("Studente " + cont + " ----> ");
            System.out.println(arrStudenti.get(i).toString());
        }
    }

    public void cercaStudentiRes(String residenza){
        int cont = 0;
        for(int i = 0; i < arrStudenti.size(); i++){
            if(arrStudenti.get(i).getResidenza().equals(residenza)){
                cont++;
                System.out.println(arrStudenti.get(i).toString());
            }
        }
        System.out.println("Gli studenti totali provenienti da " + residenza + " sono " + i);
    }

    public void cercaStudentiSesso(char sesso){
        itn cont = 0;
        for(int i = 0; i < arrStudenti.size(); i++){
            if(arrStudenti.get(i).getSesso() == sesso){
                cont++;
                System.out.println(arrStudenti.get(i).toString());
            }
        }
        System.out.println("Gli studenti " + sesso + " sono " + cont);
    } 
}