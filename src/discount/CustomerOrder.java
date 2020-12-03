package discount;

public class CustomerOrder {

    private String customerName;
    private double billAmount;
    private char discountType;

    public Discount discountAmmount;

    public CustomerOrder(String customerName, double billAmount, char discountType) {
        this.customerName = customerName;
        this.billAmount = billAmount;
        this.discountType = discountType;
        setDiscountAmmount();
    }

    public double getBillAmount() {
        return billAmount - (billAmount * getDiscountAmmount());
    }

    public void setBillAmount(double billAmount) {
        this.billAmount = billAmount;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public double getDiscountAmmount() {

        return discountAmmount.discount();
    }

    public void setDiscountAmmount() {

        switch (discountType) {
            case 'S':
            case 's':
                this.discountAmmount = new SDiscount();
                break;
            case 'D':
            case 'd':
                this.discountAmmount = new DDiscount();
                break;
            case 'L':
            case 'l':
                this.discountAmmount = new LDiscount();
                break;
            default:
                this.discountAmmount = new NDiscount();
        }
    }

    @Override
    public String toString() {
        return "Customer{"
                + "customerName='" + customerName + '\''
                + ", billAmount=" + billAmount
                + ", discountType=" + discountType
                + '}';
    }
}
