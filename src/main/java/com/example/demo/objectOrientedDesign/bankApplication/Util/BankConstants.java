/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2020 All Rights Reserved.
 */
package com.example.demo.objectOrientedDesign.bankApplication.Util;

/**
 * @author rahul.jaiman
 * @version $Id: BankConstants.java, v 0.1 2020-05-19 13:15 rahul.jaiman Exp $$
 */
public class BankConstants {
    public static final long CURRENT_ACCOUNT_MINIMUM_BALANCE = 20000;
    public static final long SAVING_ACCOUNT_MINIMUM_BALANCE = 10000;
    public static final double CURRENT_ACCOUNT_INTEREST_RATE = 0.0;
    public static final double SAVING_ACCOUNT_INTEREST_RATE = 4.5;
    public static final String ZETA_BANK_ACCOUNT_NUMBER_PREFIX = "ZBAN";
    public static final String WITHDRAW_OPERATION = "ZB_CR_";
    public static final String DEPOSIT_OPERATION = "ZB_DE_";
    public static final int MINI_STATEMENT_COUNT = 10;
}