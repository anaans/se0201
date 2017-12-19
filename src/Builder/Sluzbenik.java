/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Builder;

/**
 *
 * @author ana
 */
public class Sluzbenik {
    
   
    
    
    private final String ime; // glavna inf
    private final String prezime; // glavna inf
    private final String email; // ostale inf
    private final String telefon; // ostale inf
    private final String adresa; // ostale inf
 
    private Sluzbenik(SluzbenikBuilder builder) {
        this.ime = builder.ime;
        this.prezime = builder.prezime;
        this.email = builder.email;
        this.telefon = builder.telefon;
        this.adresa = builder.adresa;
    }
 
    
    public String getIme() {
        return ime;
    }
    public String getPrezime() {
        return prezime;
    }
    public String getEmail() {
        return email;
    }
    public String getTelefon() {
        return telefon;
    }
    public String getAdresa() {
        return adresa;
    }
 
    @Override
    public String toString() {
        return "Sluzbenik: "+this.ime+", "+this.prezime+ ", "+this.email+", "+this.telefon+", "+this.adresa;
 
    }
    //Ugnjezdena klasa
    public static class SluzbenikBuilder
    {
        private final String ime;
        private final String prezime;
        private String email;
        private String telefon;
        private String adresa;
 
        public SluzbenikBuilder(String ime, String prezime) {
            this.ime = ime;
            this.prezime = prezime;
        }
        public SluzbenikBuilder email(String email) {
            this.email = email;
            return this;
        }
        public SluzbenikBuilder telefon(String telefon) {
            this.telefon = telefon;
            return this;
        }
        public SluzbenikBuilder adresa(String adresa) {
            this.adresa = adresa;
            return this;
        }
        
        public Sluzbenik build() {
            Sluzbenik sluzbenik =  new Sluzbenik(this);
            validateSluzbenikObject(sluzbenik);
            return sluzbenik;
        }
        private void validateSluzbenikObject(Sluzbenik sluzbenik) {
           
        }
    }
    
}
