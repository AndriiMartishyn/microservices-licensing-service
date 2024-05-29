package com.martishyn.licensing.service;

import com.martishyn.licensing.controller.LicenseController;
import com.martishyn.licensing.model.License;
import org.springframework.stereotype.Service;

import java.util.concurrent.ThreadLocalRandom;

@Service
public class LicenseService {

    public License getLicense(String licenseId, String organizationId) {
        return License.builder()
                .id(ThreadLocalRandom.current().nextLong(1000))
                .licenseId(licenseId)
                .organizationId(organizationId)
                .description("Software Product")
                .productName("Ostock")
                .licenseType("full")
                .build();
    }

    public String createLicense(License license, String organizationId) {
        String responseMessage = null;
        if (license != null) {
            license.setOrganizationId(organizationId);
            responseMessage = String.format("This is the post and the object is : %s", license);
        }
        return responseMessage;
    }

    public String updateLicense(License license, String organizationId){
        String responseMessage = null;
        if (license != null) {
            license.setOrganizationId(organizationId);
            responseMessage = String.format("This is the put and the object is : %s", license);
        }
        return responseMessage;
    }

    public String deleteLicense(String licenseId, String organizationId){
        return String.format("This is the delete and the object is : %s", licenseId);
    }
}
