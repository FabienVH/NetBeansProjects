package obj;

public class Ami extends Connaissance {

    private String mobile;

    public Ami() {
    }

    public Ami(String mobile, int numeroFiche, String nom, String prenom, String rue, String cp, String ville, String telephone, String email) {
        super(numeroFiche, nom, prenom, rue, cp, ville, telephone, email);
        this.mobile = mobile;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getType() {
        return "Ami";
    }
    
    @Override
    public String toString() {
        return "\n" + getNumeroFiche() + "> " + getNom() + "," + getPrenom();
    }

    
//    @Override
//    public String toString() {
//        return "\n" + getNumeroFiche() + "> " + getNom() + "," + getPrenom() + "\n" + getRue() + "\n" + getCp() + " " + getVille() + "\ntelephone:" + getTelephone() + "\nmobile:" + mobile + "\nemail:" + getEmail() + "\n----------------------------------";
//    }

}
