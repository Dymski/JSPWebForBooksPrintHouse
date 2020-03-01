package model;

import javax.persistence.*;

@Entity
@Table(name = "OrderEntity")
public class OrderEntity {

    @ManyToOne(cascade = {CascadeType.ALL})
    @JoinColumn(name = "accountID", nullable = false)
    private AccountEntity accountEntity;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int orderID;
    @Column(name = "bookFormat")
    private String bookFormat;
    @Column(name = "paperType")
    private String paperType;
    @Column(name = "numberOfCopies")
    private int numberOfCopies;
    @Column(name = "blackAndWhitePages")
    private int blackAndWhitePages;
    @Column(name = "colorPages")
    private int colorPages;
    @Column(name = "invoice")
    private String invoice;
    @Column(name = "paymentCurrency")
    private String paymentCurrency;
    @Column(name = "priceInPLN")
    private double priceInPLN;
    @Column(name = "forexRate")
    private double forexRate;
    @Column(name = "priceInForeignCurrency")
    private double priceInForeignCurrency;
    @Column(name = "fvNumber")
    private String fvNumber;
    @Column(name = "fvPath")
    private String fvPath;

    public OrderEntity() {
    }

    public OrderEntity(AccountEntity accountEntity, int orderID, String bookFormat, String paperType, int numberOfCopies, int blackAndWhitePages, int colorPages, String invoice, String paymentCurrency, double priceInPLN, double forexRate, double priceInForeignCurrency, String fvNumber, String fvPath) {
        this.accountEntity = accountEntity;
        this.orderID = orderID;
        this.bookFormat = bookFormat;
        this.paperType = paperType;
        this.numberOfCopies = numberOfCopies;
        this.blackAndWhitePages = blackAndWhitePages;
        this.colorPages = colorPages;
        this.invoice = invoice;
        this.paymentCurrency = paymentCurrency;
        this.priceInPLN = priceInPLN;
        this.forexRate = forexRate;
        this.priceInForeignCurrency = priceInForeignCurrency;
        this.fvNumber = fvNumber;
        this.fvPath = fvPath;
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

    public String getBookFormat() {
        return bookFormat;
    }

    public void setBookFormat(String bookFormat) {
        this.bookFormat = bookFormat;
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

    public int getBlackAndWhitePages() {
        return blackAndWhitePages;
    }

    public void setBlackAndWhitePages(int blackAndWhitePages) {
        this.blackAndWhitePages = blackAndWhitePages;
    }

    public int getColorPages() {
        return colorPages;
    }

    public void setColorPages(int colorPages) {
        this.colorPages = colorPages;
    }

    public String getInvoice() {
        return invoice;
    }

    public void setInvoice(String invoice) {
        this.invoice = invoice;
    }

    public String getPaymentCurrency() {
        return paymentCurrency;
    }

    public void setPaymentCurrency(String paymentCurrency) {
        this.paymentCurrency = paymentCurrency;
    }

    public double getPriceInPLN() {
        return priceInPLN;
    }

    public void setPriceInPLN(double priceInPLN) {
        this.priceInPLN = priceInPLN;
    }

    public double getForexRate() {
        return forexRate;
    }

    public void setForexRate(double forexRate) {
        this.forexRate = forexRate;
    }

    public double getPriceInForeignCurrency() {
        return priceInForeignCurrency;
    }

    public void setPriceInForeignCurrency(double priceInForeignCurrency) {
        this.priceInForeignCurrency = priceInForeignCurrency;
    }

    public String getFvNumber() {
        return fvNumber;
    }

    public void setFvNumber(String fvNumber) {
        this.fvNumber = fvNumber;
    }

    public String getFvPath() {
        return fvPath;
    }

    public void setFvPath(String fvPath) {
        this.fvPath = fvPath;
    }
}
