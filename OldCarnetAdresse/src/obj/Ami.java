
package obj;


public class Ami extends Connaissance{
    private String mobile;

    public Ami() {
    }

    public Ami(String mobile, String nom, String prenom, String rue, String cp, String ville, String telephone, String email) {
        super(nom, prenom, rue, cp, ville, telephone, email);
        this.mobile = mobile;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    @Override
    public String toString() {
        return "\nAmi{nom:" + getNom() + ", prenom:" + getPrenom() + ", rue:" + getRue() + ", cp:" + getCp() + ", ville:" + getVille() + ", telephone:" + getTelephone() + ", email:" + getEmail() + ", mobile=" + mobile + '}';
    }
    
    
}
