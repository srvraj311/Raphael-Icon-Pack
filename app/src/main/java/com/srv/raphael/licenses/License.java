package com.srv.raphael.licenses;

import candybar.lib.items.InAppBilling;

public class License {

    /*
     * License Checker
     * private static final boolean ENABLE_LICENSE_CHECKER = true; --> enabled
     * Change to private static final boolean ENABLE_LICENSE_CHECKER = false; if you want to disable it
     *
     * NOTE: If you disable license checker you need to remove LICENSE_CHECK permission inside AndroidManifest.xml
     */
    private static final boolean ENABLE_LICENSE_CHECKER = false;

    /*
     * NOTE: If license checker is disabled (above), just ignore this
     *
     * Generate 20 random bytes
     * For easy way, go to https://www.random.org/strings/
     * Set generate 20 random strings
     * Each string should be 2 character long
     * Check numeric digit (0-9)
     * Choose each string should be unique
     * Get string
     */
    private static final byte[] SALT = new byte[]{
            //Put generated random bytes below, separate with comma, ex: 14, 23, 58, 85, ...

    };

    /*
     * Your license key
     * If your app hasn't published at play store, publish it first as beta, get license key
     */
    private static final String LICENSE_KEY = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAqBMBkRlNmNBzntmF+m0dInlXwz7PwEzpnKFdGM/GyK7Hk+eWb+3ekWfjxDXSnsLzetkfUVXLsjZr2xiYyPY3Xmla4ivyxVwAcIOxNyBUSZ3CdXFzpPtif+oIvU7mXCRMwkN3Zx+eT4kOVJqWd3FjkLeGB5WtDDV69A6y4xxPMuWVFJK0g72Km+QHXYTVFWoYE9mmRfKUNrSTMEavBlbME+bP2OOa5pfcERP7bAAw2mCkS6od87L5yf7y0cT+EDDaS1eWkwB+9+YzELSIHjg1BwiSN37XvEjgv1nGvmgvVS/7bu1RXHxi/t3RJYa25BD8JY3HCkNJF9rLTs25WgqxgwIDAQAB";

    /*
     * NOTE: Make sure your app name in project same as app name at play store listing
     * NOTE: Your InApp Purchase will works only after the apk published
     */

    /*
     * NOTE: If premium request disabled, just ignored this
     *
     * InApp product id for premium request
     * Product name displayed the same as product name displayed at play store
     * So make sure to name it properly, like include number of icons
     * Format: new InAppBilling("premium request product id", number of icons)
     */
    private static final InAppBilling[] PREMIUM_REQUEST_PRODUCTS = new InAppBilling[]{
            new InAppBilling("your.product.id", 1),
            new InAppBilling("your.product.id", 2),
            new InAppBilling("your.product.id", 3),
            new InAppBilling("your.product.id", 4)
    };

    /*
     * NOTE: If donation disabled, just ignored this
     *
     * InApp product id for donation
     * Product name displayed the same as product name displayed at play store
     * So make sure to name it properly
     * Format: new InAppBilling("donation product id")
     */
    private static final InAppBilling[] DONATION_PRODUCT = new InAppBilling[]{
            new InAppBilling("com.srv.raphael.tea"),
            new InAppBilling("com.srv.raphael.coffee"),
            new InAppBilling("com.srv.raphael.pizza"),
            new InAppBilling("com.srv.raphael.phone")
    };

    public static boolean isLicenseCheckerEnabled() {
        return ENABLE_LICENSE_CHECKER;
    }

    public static String getLicenseKey() {
        return LICENSE_KEY;
    }

    public static byte[] getRandomString() {
        return SALT;
    }

    public static String[] getPremiumRequestProductsId() {
        String[] productId = new String[PREMIUM_REQUEST_PRODUCTS.length];
        for (int i = 0; i < PREMIUM_REQUEST_PRODUCTS.length; i++) {
            productId[i] = PREMIUM_REQUEST_PRODUCTS[i].getProductId();
        }
        return productId;
    }

    public static int[] getPremiumRequestProductsCount() {
        int[] productCount = new int[PREMIUM_REQUEST_PRODUCTS.length];
        for (int i = 0; i < PREMIUM_REQUEST_PRODUCTS.length; i++) {
            productCount[i] = PREMIUM_REQUEST_PRODUCTS[i].getProductCount();
        }
        return productCount;
    }

    public static String[] getDonationProductsId() {
        String[] productId = new String[DONATION_PRODUCT.length];
        for (int i = 0; i < DONATION_PRODUCT.length; i++) {
            productId[i] = DONATION_PRODUCT[i].getProductId();
        }
        return productId;
    }

}
