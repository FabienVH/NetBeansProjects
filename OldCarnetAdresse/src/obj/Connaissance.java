package obj;

public class Connaissance implements Comparable<Connaissance>
{
    private String nom;
    private String prenom;
    private String rue;
    private String cp;
    private String ville;
    private String telephone;
    private String email;

    public Connaissance() {
    }

    public Connaissance(String nom, String prenom, String rue, String cp, String ville, String telephone, String email) {
        this.nom = nom;
        this.prenom = prenom;
        this.rue = rue;
        this.cp = cp;
        this.ville = ville;
        this.telephone = telephone;
        this.email = email;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getRue() {
        return rue;
    }

    public void setRue(String rue) {
        this.rue = rue;
    }

    public String getCp() {
        return cp;
    }

    public void setCp(String cp) {
        this.cp = cp;
    }

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "\nConnaissance{" + "nom:" + nom + ", prenom:" + prenom + ", rue:" + rue + ", cp:" + cp + ", ville:" + ville + ", telephone:" + telephone + ", email:" + email + '}';
    }
    
    @Override
    public int compareTo(Connaissance cible) {
        String nom01 = this.getNom();
        if(nom01 == null){
            return -1;
        }
        String nom02 = cible.getNom();
        if(nom02 == null){
            return 1;
        }
        int res = nom01.compareToIgnoreCase(nom02);
        return res;
    }
}
