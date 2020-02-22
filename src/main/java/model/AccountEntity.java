package model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "AccountCredentials")
public class AccountCredentials {

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


    protected AccountCredentials() {
    }

    public AccountCredentials(int id, String email, String password, Date creationDate, String secretQuestion, String secretAnswer) {
        this.id = id;
        this.email = email;
        this.password = password;
        this.creationDate = creationDate;
        this.secretQuestion = secretQuestion;
        this.secretAnswer = secretAnswer;
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

    @Override
    public String toString() {
        return "AccountCredentials{" +
                "id=" + id +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", creationDate=" + creationDate +
                ", secretQuestion='" + secretQuestion + '\'' +
                ", secretAnswer='" + secretAnswer + '\'' +
                '}';
    }
}
