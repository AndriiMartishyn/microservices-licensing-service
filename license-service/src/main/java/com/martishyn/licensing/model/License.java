package com.martishyn.licensing.model;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@Builder
public class License {

    private Long id;

    private String licenseId;

    private String description;

    private String organizationId;

    private String productName;

    private String licenseType;
}
