package model;

import javax.persistence.*;
import java.util.*;

@Entity
@Table(name = "AccountEntity")
public class AccountEntity {

    @OneToMany(mappedBy = "email", fetch = FetchType.LAZY)
    private ArrayList<OrderEntity> orders = new ArrayList<>();      // i dont get this one
                                                                    // will it get all orders for same email as list ?
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "email")
    private String email;
    @Column(name = "password")
    private String password;
    @Column(name = "creationDate")
    private Date creationDate;
    @Column(name = "secretQuestion")
    private String secretQuestion;
    @Column(name = "secretAnswer")
    private String secretAnswer;
    @Column(name = "companyName")
    private String companyName;
    @Column(name = "TaxIdentificationNumber")
    private int taxIdentificationNumber;



    protected AccountEntity() {
    }

    public AccountEntity(int id, String email, String password, Date creationDate, String secretQuestion, String secretAnswer, String companyName, int taxIdentificationNumber) {
        this.id = id;
        this.email = email;
        this.password = password;
        this.creationDate = creationDate;
        this.secretQuestion = secretQuestion;
        this.secretAnswer = secretAnswer;
        this.companyName = companyName;
        this.taxIdentificationNumber = taxIdentificationNumber;
    }

    public ArrayList<OrderEntity> getOrders() {
        return orders;
    }

    public void setOrders(ArrayList<OrderEntity> orders) {
        this.orders = orders;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public String getSecretQuestion() {
        return secretQuestion;
    }

    public void setSecretQuestion(String secretQuestion) {
        this.secretQuestion = secretQuestion;
    }

    public String getSecretAnswer() {
        return secretAnswer;
    }

    public void setSecretAnswer(String secretAnswer) {
        this.secretAnswer = secretAnswer;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public int getTaxIdentificationNumber() {
        return taxIdentificationNumber;
    }

    public void setTaxIdentificationNumber(int taxIdentificationNumber) {
        this.taxIdentificationNumber = taxIdentificationNumber;
    }

}
