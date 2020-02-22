package model;

import javax.persistence.*;
import java.io.File;
@Entity
@Table(name = "OrderDetails")
public class OrderEntity {
    @ManyToOne(cascade = {CascadeType.ALL})     //is this relation properly set?
    private AccountEntity email;                // does email needs to be in constr and have getters and setters ?

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private int id;
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
    private boolean foreignCurrency;            //can boolean be used?
    @Column(name = "currencyChosen")
    private String currencyChosen;
    @Column(name = "priceInForeignCurrency")
    private double priceInForeignCurrency;
    @Column(name = "FvNumber")
    private String FvNumber;
    @Column(name = "FV")
    private File FV;                            // obsługa pliku ?
                                                // powinienem stworzyc @Embeddable FV class?
                                                // jezeli chciałbym tam tylko wgrywać plik ?
                                                // czy to raczej byłby string ze ścieżką ?

    protected OrderEntity() {}

    public OrderEntity(int id, String format, int pages, String paperType, int numberOfCopies, double priceInPLN, boolean foreignCurrency, String currencyChosen, double priceInForeignCurrency, String fvNumber, File FV) {
        this.id = id;
        this.format = format;
        this.pages = pages;
        this.paperType = paperType;
        this.numberOfCopies = numberOfCopies;
        this.priceInPLN = priceInPLN;
        this.foreignCurrency = foreignCurrency;
        this.currencyChosen = currencyChosen;
        this.priceInForeignCurrency = priceInForeignCurrency;
        FvNumber = fvNumber;
        this.FV = FV;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public File getFV() {
        return FV;
    }

    public void setFV(File FV) {
        this.FV = FV;
    }
}
