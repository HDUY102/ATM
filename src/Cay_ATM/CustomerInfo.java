
package Cay_ATM;

import java.util.Date;

public class CustomerInfo {
    private long customerId;
    private String customerName;
    private String customerAddres;
    private String customerNumber;
    private boolean customerNumberVerified;
    private String customerCitizenId;
    private Date DOB;
    private boolean gender;

    public CustomerInfo() {
    }
    public CustomerInfo(long customerId, String customerName, String customerAddres, String customerNumber, boolean customerNumberVerified, String customerCitizenId, Date DOB, boolean gender) {
        this.customerId = customerId;
        this.customerName = customerName;
        this.customerAddres = customerAddres;
        this.customerNumber = customerNumber;
        this.customerNumberVerified = customerNumberVerified;
        this.customerCitizenId = customerCitizenId;
        this.DOB = DOB;
        this.gender = gender;
    }

    public long getCustomerId() {
        return customerId;
    }
    public void setCustomerId(long customerId) {
        this.customerId = customerId;
    }
    public String getCustomerName() {
        return customerName;
    }
    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }
    public String getCustomerAddres() {
        return customerAddres;
    }
    public void setCustomerAddres(String customerAddres) {
        this.customerAddres = customerAddres;
    }
    public String getCustomerNumber() {
        return customerNumber;
    }
    public void setCustomerNumber(String customerNumber) {
        this.customerNumber = customerNumber;
    }
    public boolean isCustomerNumberVerified() {
        return customerNumberVerified;
    }
    public void setCustomerNumberVerified(boolean customerNumberVerified) {
        this.customerNumberVerified = customerNumberVerified;
    }
    public String getCustomerCitizenId() {
        return customerCitizenId;
    }
    public void setCustomerCitizenId(String customerCitizenId) {
        this.customerCitizenId = customerCitizenId;
    }
    public Date getDOB() {
        return DOB;
    }
    public void setDOB(Date DOB) {
        this.DOB = DOB;
    }
    public boolean isGender() {
        return gender;
    }
    public void setGender(boolean gender) {
        this.gender = gender;
    }
    
}
