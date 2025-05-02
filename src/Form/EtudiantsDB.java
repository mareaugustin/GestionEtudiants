/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Form;

/**
 *
 * @author HP
 */
public class EtudiantsDB {
    private int ID;
    private String Nom;
    private String Prenom;
    private String Email;
    private String Telephone;
    
    public EtudiantsDB(int id, String Nom, String Prenom, String Email, String Telephone){
        this.ID = id;
        this.Nom = Nom;
        this.Prenom = Prenom;
        this.Email = Email;
        this.Telephone = Telephone;
    }
    
    //Gettters
    public int getID(){return ID;}
    public String getNom(){return Nom;}
    public String getPrenom(){return Prenom;}
    public String getEmail(){return Email;}
    public String getTelephone(){return Telephone;}
    
    //Setters
    public void setID(int id){this.ID = id;}
    public void setNom(String Nom){this.Nom = Nom;}
    public void setPrenom(String Prenom){this.Prenom = Prenom;}
    public void setEmail(String Email){this.Email = Email;}
    public void setTelephone(String Telephone){this.Telephone = Telephone;}
}
