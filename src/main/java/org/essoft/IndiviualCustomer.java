package org.essoft;

public class IndiviualCustomer extends Customer {
    private String identityNo;

    public String getIdentityNo() {
        return identityNo;
    }

    public void setIdentityNo(String identityNo) {
        this.identityNo = identityNo;
    }

    @Override // annotation
    public void buy() {
        //super.buy();
        System.out.println("IndiviualCustomer.buy");
    }
}