package WS;

import jakarta.xml.bind.annotation.*;

import java.lang.reflect.Field;
import java.util.Date;
//la conversion nous donnera un element qui s appelle compte=> c est une annotation jaxb
@XmlRootElement(name = "compte")
//cette annotaion pour indiquer a jaxb qu on va appliquer les annotations sur les champs
//et pas sur les getters et setters (par defaut)
@XmlAccessorType(XmlAccessType.FIELD)
public class Compte {
    private int code;
    private double solde;
    //cette annotation indique à JaxB d ignirer l attribut dateCreation lors du transformation
    //de l'objet compte en xml
    @XmlTransient
    private Date dateCreation;

    public Compte() {
    }

    public Compte(int code,double solde,Date dateCreation) {
        this.code = code;
        this.solde=solde;
        this.dateCreation=dateCreation;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public double getSolde() {
        return solde;
    }

    public void setSolde(double solde) {
        this.solde = solde;
    }

    public Date getDateCreation() {
        return dateCreation;
    }

    public void setDateCreation(Date dateCreation) {
        this.dateCreation = dateCreation;
    }
}
