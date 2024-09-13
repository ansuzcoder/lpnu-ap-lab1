public class Customer {
    private final int customerId;
    private String lastName;
    private String firstName;
    private String patronym;
    private String address;
    private String cardNumber;
    private double balance;

    public Customer(
            int customerId,
            String lastName,
            String firstName,
            String patronym,
            String address,
            String cardNumber,
            double balance
    ) {
        this.customerId = customerId;
        this.lastName = lastName;
        this.firstName = firstName;
        this.patronym = patronym;
        this.address = address;
        this.cardNumber = cardNumber;
        this.balance = balance;
    }

    // class getters
    public int getCustomerId() { return this.customerId; }
    public String getLastName() { return this.lastName; }
    public String getFirstName() { return this.firstName; }
    public String getPatronym() { return this.patronym; }
    public String getAddress() { return this.address; }
    public String getCardNumber() { return this.cardNumber; }
    public double getBalance() { return this.balance; }

    // class setters
    private void setLastName(String lastName) { this.lastName = lastName; }
    private void setFirstName(String firstName) { this.firstName = firstName; }
    private void setPatronym(String patronym) { this.patronym = patronym; }
    private void setAddress(String address) { this.address = address; }
    private void setCardNumber(String cardNumber) { this.cardNumber = cardNumber; }
    private void setBalance(double balance) { this.balance = balance; }


    /**
     * Update customer balance according to expenses
     * @param expenses amount of money earned/spent
     */
    public void updateCardBalance(double expenses) {
        double currentBalance = this.getBalance();
        double newBalance = currentBalance + expenses;
        this.setBalance(newBalance);
    }

    @Override
    public String toString() {
        return "";
    }
}
