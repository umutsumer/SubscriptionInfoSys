package informationsystem;

public abstract class Customer {
    
    
    private String citizenshipNr;
    private String name,tel,mail;

    public Customer(String citizenshipNr) {
        this.citizenshipNr = citizenshipNr;
    }

    public String getCitizenshipNr() {
        return citizenshipNr;
    }

    public void setCitizenshipNr(String citizenshipNr) {
        this.citizenshipNr = citizenshipNr;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }
    
    
    
    
}
