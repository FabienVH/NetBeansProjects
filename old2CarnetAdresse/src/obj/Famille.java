package obj;

import java.util.Calendar;

public class Famille extends Connaissance {

    private String mobile;
    private String DateNaissance;

    public Famille() {
    }

    public Famille(String mobile, String DateNaissance, int numeroFiche, String nom, String prenom, String rue, String cp, String ville, String telephone, String email) {
        super(numeroFiche, nom, prenom, rue, cp, ville, telephone, email);
        this.mobile = mobile;
        this.DateNaissance = DateNaissance;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getDateNaissance() {
        return DateNaissance;
    }

    public void setDateNaissance(String DateNaissance) {
        this.DateNaissance = DateNaissance;
    }

    @Override
    public String toString() {
        return "\n " + getNumeroFiche() + "> " + getNom() + "," + getPrenom() + "\n" + getRue() + "\n" + getCp() + " " + getVille() + "\ntelephone:" + getTelephone() + ",\nmobile:" + mobile + "\nemail:" + getEmail() + ",\nné le " + DateNaissance + "\n----------------------------------";
    }

}
