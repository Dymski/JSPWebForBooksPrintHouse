package model;

import model.AccountEntity;

import javax.persistence.*;

@Entity
@Table(name = "OrderEntity")
public class OrderEntity {

    @ManyToOne(cascade = {CascadeType.ALL})
    @JoinColumn(name="accountID", nullable=false)
    private AccountEntity accountEntity;


    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private int orderID;
    @Column(name = "format")
    private String format;
    @Column(name = "pages")
    private int pages;
    @Column(name = "paperType")
    private String paperType;
    @Column(name = "numberOfCopies")
    private int numberOfCopies;
    @Column(name = "priceInPLN")
    private double priceInPLN;
    @Column(name = "foreignCurrency")
    private boolean foreignCurrency;                    //can boolean be used?
    @Column(name = "currencyChosen")
    private String currencyChosen;
    @Column(name = "priceInForeignCurrency")
    private double priceInForeignCurrency;
    @Column(name = "FvNumber")
    private String FvNumber;
    @Column(name = "FV")
    private String FvPath;                              //ścieżka do pliku

    public OrderEntity() {}

    public OrderEntity(AccountEntity accountEntity, int orderID, String format, int pages, String paperType, int numberOfCopies, double priceInPLN, boolean foreignCurrency, String currencyChosen, double priceInForeignCurrency, String fvNumber, String FvPath) {
        this.accountEntity = accountEntity;
        this.orderID = orderID;
        this.format = format;
        this.pages = pages;
        this.paperType = paperType;
        this.numberOfCopies = numberOfCopies;
        this.priceInPLN = priceInPLN;
        this.foreignCurrency = foreignCurrency;
        this.currencyChosen = currencyChosen;
        this.priceInForeignCurrency = priceInForeignCurrency;
        FvNumber = fvNumber;
        this.FvPath = FvPath;

    }

    public AccountEntity getAccountEntity() {
        return accountEntity;
    }

    public void setAccountEntity(AccountEntity accountEntity) {
        this.accountEntity = accountEntity;
    }

    public int getOrderID() {
        return orderID;
    }

    public void setOrderID(int orderID) {
        this.orderID = orderID;
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public String getPaperType() {
        return paperType;
    }

    public void setPaperType(String paperType) {
        this.paperType = paperType;
    }

    public int getNumberOfCopies() {
        return numberOfCopies;
    }

    public void setNumberOfCopies(int numberOfCopies) {
        this.numberOfCopies = numberOfCopies;
    }

    public double getPriceInPLN() {
        return priceInPLN;
    }

    public void setPriceInPLN(double priceInPLN) {
        this.priceInPLN = priceInPLN;
    }

    public boolean isForeignCurrency() {
        return foreignCurrency;
    }

    public void setForeignCurrency(boolean foreignCurrency) {
        this.foreignCurrency = foreignCurrency;
    }

    public String getCurrencyChosen() {
        return currencyChosen;
    }

    public void setCurrencyChosen(String currencyChosen) {
        this.currencyChosen = currencyChosen;
    }

    public double getPriceInForeignCurrency() {
        return priceInForeignCurrency;
    }

    public void setPriceInForeignCurrency(double priceInForeignCurrency) {
        this.priceInForeignCurrency = priceInForeignCurrency;
    }

    public String getFvNumber() {
        return FvNumber;
    }

    public void setFvNumber(String fvNumber) {
        FvNumber = fvNumber;
    }

    public String getFvPath() {
        return FvPath;
    }

    public void setFvPath(String fvPath) {
        FvPath = fvPath;
    }

}
