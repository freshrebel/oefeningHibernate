package BO;
// Generated 3-dec-2014 14:44:59 by Hibernate Tools 4.3.1



/**
 * TblDocent generated by hbm2java
 */
public class Docent  implements java.io.Serializable {


     private Integer id;
     private String naam;
     private String adres;
     private String email;

    public Docent() {
    }

    public Docent(String naam, String adres, String email) {
       this.naam = naam;
       this.adres = adres;
       this.email = email;
    }
   
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    public String getNaam() {
        return this.naam;
    }
    
    public void setNaam(String naam) {
        this.naam = naam;
    }
    public String getAdres() {
        return this.adres;
    }
    
    public void setAdres(String adres) {
        this.adres = adres;
    }
    public String getEmail() {
        return this.email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }




}


