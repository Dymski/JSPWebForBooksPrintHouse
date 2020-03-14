package model;

import javax.persistence.*;
import javax.servlet.http.HttpSessionBindingListener;
import java.time.LocalDateTime;
import java.util.*;

@Entity
@Table(name = "account_entity")
public class AccountEntity implements HttpSessionBindingListener {

    @OneToMany(mappedBy = "accountEntity", fetch = FetchType.EAGER)
    private List<OrderEntity> orderEntities = new LinkedList<>();

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int accountID;
    @Column(name = "email")
    private String email;
    @Column(name = "password")
    private String password;
    @Column(name = "creationDate")
    private LocalDateTime creationDate;
    @Column(name = "secretQuestion")
    private String secretQuestion;
    @Column(name = "secretAnswer")
    private String secretAnswer;
    @Column(name = "companyName")
    private String companyName;
    @Column(name = "TaxIdentificationNumber")
    private String taxIdentificationNumber;
    @Column(name = "newsletterAgreement")
    private String newsletterAgreement;



    public AccountEntity() {
    }

    public AccountEntity(int accountID, String email, String password, LocalDateTime creationDate, String secretQuestion, String secretAnswer, String companyName, String taxIdentificationNumber, String newsletterAgreement) {
        this.accountID = accountID;
        this.email = email;
        this.password = password;
        this.creationDate = creationDate;
        this.secretQuestion = secretQuestion;
        this.secretAnswer = secretAnswer;
        this.companyName = companyName;
        this.taxIdentificationNumber = taxIdentificationNumber;
        this.newsletterAgreement = newsletterAgreement;

    }

    public List<OrderEntity> getOrderEntities() {
        return orderEntities;
    }

    public void setOrderEntities(LinkedList<OrderEntity> orderEntities) {
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

    public LocalDateTime getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(LocalDateTime creationDate) {
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

    public String getTaxIdentificationNumber() {
        return taxIdentificationNumber;
    }

    public void setTaxIdentificationNumber(String taxIdentificationNumber) {
        this.taxIdentificationNumber = taxIdentificationNumber;
    }

    public String getNewsletterAgreement() {
        return newsletterAgreement;
    }

    public void setNewsletterAgreement(String newsletterAgreement) {
        this.newsletterAgreement = newsletterAgreement;
    }

    public void addOrderEntityToAccountEntity(OrderEntity orderEntity){
        orderEntities.add(orderEntity);
    }

}
