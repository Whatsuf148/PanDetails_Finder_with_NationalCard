public class PAN {

    private String PANNumber;
    private String nationalNumber;
    private String  bankDetails;
    private String investment;

    public PAN(String PANNumber, String nationalNumber, String bankDetails, String investment) {
        this.PANNumber = PANNumber;
        this.nationalNumber = nationalNumber;
        this.bankDetails = bankDetails;
        this.investment = investment;
    }

    public String getPANNumber() {
        return PANNumber;
    }

    public void setPANNumber(String PANNumber) {
        this.PANNumber = PANNumber;
    }

    public String getNationalNumber() {
        return nationalNumber;
    }

    public void setNationalNumber(String nationalNumber) {
        this.nationalNumber = nationalNumber;
    }

    public String getBankDetails() {
        return bankDetails;
    }

    public void setBankDetails(String bankDetails) {
        this.bankDetails = bankDetails;
    }

    public String getInvestment() {
        return investment;
    }

    public void setInvestment(String investment) {
        this.investment = investment;
    }

    @Override
    public String toString() {
        return "PAN{" +
                "PANNumber='" + PANNumber + '\'' +
                ", nationalNumber='" + nationalNumber + '\'' +
                ", bankDetails='" + bankDetails + '\'' +
                ", investment='" + investment + '\'' +
                '}';
    }
}
