package model;

import org.hibernate.criterion.Order;

import javax.persistence.*;
import java.util.*;

@Entity
@Table(name = "Account_Entity")
public class AccountEntity {

    @OneToMany(mappedBy = "accountEntity", fetch = FetchType.LAZY)
    private Set<OrderEntity> orderEntities = new HashSet<>();

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int accountID;
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



    public AccountEntity() {
    }

    public AccountEntity(int accountID, String email, String password, Date creationDate, String secretQuestion, String secretAnswer, String companyName, int taxIdentificationNumber) {
        this.accountID = accountID;
        this.email = email;
        this.password = password;
        this.creationDate = creationDate;
        this.secretQuestion = secretQuestion;
        this.secretAnswer = secretAnswer;
        this.companyName = companyName;
        this.taxIdentificationNumber = taxIdentificationNumber;

    }

    public Set<OrderEntity> getOrderEntities() {
        return orderEntities;
    }

    public void setOrderEntities(Set<OrderEntity> orderEntities) {
        this.orderEntities = orderEntities;
    }

    public int getAccountID() {
        return accountID;
    }

    public void setAccountID(int accountID) {
        this.accountID = accountID;
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
