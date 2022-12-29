package com.maniatis.demo.mikedemosspringcassandra;

import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;

@Table
public class Subscription {
    @PrimaryKey
    public String accountHash;

    public String subscriptionName;

    public String phoneNumber;

    public String emailAddress;

    public Subscription(String accountHash, String subscriptionName, String phoneNumber, String emailAddress) {
        this.accountHash = accountHash;
        this.subscriptionName = subscriptionName;
        this.phoneNumber = phoneNumber;
        this.emailAddress = emailAddress;
    }

    public String getAccountHash() {
        return accountHash;
    }

    public void setAccountHash(String accountHash) {
        this.accountHash = accountHash;
    }

    public String getSubscriptionName() {
        return subscriptionName;
    }

    public void setSubscriptionName(String subscriptionName) {
        this.subscriptionName = subscriptionName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }
}
