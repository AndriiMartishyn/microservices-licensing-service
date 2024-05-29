package com.martishyn.licensing.controller;

import com.martishyn.licensing.model.License;
import com.martishyn.licensing.service.LicenseService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "v1/organization/" +
        "{organizationId}/license")
@RequiredArgsConstructor
public class LicenseController {

    private final LicenseService licenseService;

    @GetMapping("/{licenseId}")
    public ResponseEntity<License> getLicense(@PathVariable String organizationId,
                                              @PathVariable String licenseId) {
        License license = licenseService.getLicense(licenseId, organizationId);
        return ResponseEntity.ok(license);
    }

    @PutMapping
    public ResponseEntity<?> updateLicense(@PathVariable String organizationId,
                                           @RequestBody License license) {
        String response = licenseService.updateLicense(license, organizationId);
        return ResponseEntity.ok(response);
    }

    @PostMapping
    public ResponseEntity<?> createLicense(@PathVariable String organizationId,
                                           @RequestBody License license) {
        String response = licenseService.createLicense(license, organizationId);
        return ResponseEntity.ok(response);
    }

    @DeleteMapping("/{licenseId}")
    public ResponseEntity<?> deleteLicense(@PathVariable String organizationId,
                                           @PathVariable String licenseId) {
        String response = licenseService.deleteLicense(licenseId, organizationId);
        return ResponseEntity.ok(response);
    }
}
