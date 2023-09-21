import java.time.*;
import java.util.*;

public class Studente {
    private String nome;
    private String cognome;
    private LocalDate data_nascita;
    private char sesso;
    private String residenza;

    public Studente() {
    }

    public Studente(String nome, String cognome, LocalDate data_nascita, char sesso, String residenza) {
        this.nome = nome;
        this.cognome = cognome;
        this.data_nascita = data_nascita;
        this.sesso = sesso;
        this.residenza = residenza;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getCognome() {
        return cognome;
    }
    public void setCognome(String cognome) {
        this.cognome = cognome;
    }
    public LocalDate getData_nascita() {
        return data_nascita;
    }
    public void setData_nascita(LocalDate data_nascita) {
        this.data_nascita = data_nascita;
    }
    public char getSesso() {
        return sesso;
    }
    public void setSesso(char sesso) {
        this.sesso = sesso;
    }
    public String getResidenza() {
        return residenza;
    }
    public void setResidenza(String residenza) {
        this.residenza = residenza;
    }

    public void calcoloEta(Studente s){
        Period differenza;
        LocalDate data_oggi = LocalDate.now();
        differenza = Period.between(s.getData_nascita(), data_oggi);
        System.out.println("Lo studente " + s.getNome() + " " + s.getCognome() +" ha " + differenza.getYears() + " anni");
    }

    @Override
    public String toString() {
        return "Studente Nome: " + nome + "\ncognome: " + cognome + "\nsesso: " + sesso + "Residenza: "+ residenza;
    }

    
}
