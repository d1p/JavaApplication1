/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.io.File;
import java.io.IOException;

/**
 *
 * @author nihan
 */
public class utility {

    String BASE_URL;
    String charset = "UTF-8";

    public utility(String BASEURL) {
        this.BASE_URL = BASEURL;
    }

    public String createUser(String name, String email, String password,
            File picture,
            String address, String country, String city, String bankName,
            String bankAccountName, String bankAccountNumber, String userType) {
        String requestUrl = BASE_URL + "api/v1/user/?format=json";
        try {
            MultipartUtility multipart = new MultipartUtility(requestUrl, charset, "POST", "");

            multipart.addHeaderField("Content-Type", "application/json");

            multipart.addFormField("name", name);
            multipart.addFormField("email", email);
            multipart.addFormField("password", password);
            multipart.addFilePart("picture", picture);
            multipart.addFormField("city", city);
            multipart.addFormField("country", country);
            multipart.addFormField("bank_name", bankName);
            multipart.addFormField("bank_account_name", bankAccountName);
            multipart.addFormField("bank_account_number", bankAccountNumber);
            multipart.addFormField("user_type", userType);
            multipart.addFormField("address", address);
            return multipart.finish();
        } catch (IOException ex) {
            return "IOException";
        }
    }

    public String editUser(String id, String name, String email,
            File picture,
            String address, String country, String city, String bankName,
            String bankAccountName, String bankAccountNumber, String accessToken) {
        String requestUrl = BASE_URL + "api/v1/user/" + id + "/?format=json";
        try {
            MultipartUtility multipart = new MultipartUtility(requestUrl, charset, "PUT", accessToken);

            multipart.addHeaderField("Content-Type", "application/json");

            multipart.addFormField("name", name);
            multipart.addFormField("email", email);
            multipart.addFilePart("picture", picture);
            multipart.addFormField("city", city);
            multipart.addFormField("country", country);
            multipart.addFormField("bank_name", bankName);
            multipart.addFormField("bank_account_name", bankAccountName);
            multipart.addFormField("bank_account_number", bankAccountNumber);
            multipart.addFormField("address", address);

            return multipart.finish();

        } catch (IOException ex) {
            System.out.println(ex);
            return "IOException";
        }
    }
            
}
