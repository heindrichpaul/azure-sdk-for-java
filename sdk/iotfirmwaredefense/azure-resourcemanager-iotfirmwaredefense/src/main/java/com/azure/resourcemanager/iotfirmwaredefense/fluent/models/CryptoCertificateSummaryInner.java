// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.iotfirmwaredefense.fluent.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Cryptographic certificate summary values. */
@Fluent
public final class CryptoCertificateSummaryInner {
    /*
     * Total number of certificates found.
     */
    @JsonProperty(value = "totalCertificates")
    private Long totalCertificates;

    /*
     * Total number of paired private keys found for the certificates.
     */
    @JsonProperty(value = "pairedKeys")
    private Long pairedKeys;

    /*
     * Total number of expired certificates found.
     */
    @JsonProperty(value = "expired")
    private Long expired;

    /*
     * Total number of nearly expired certificates found.
     */
    @JsonProperty(value = "expiringSoon")
    private Long expiringSoon;

    /*
     * Total number of certificates found using a weak signature algorithm.
     */
    @JsonProperty(value = "weakSignature")
    private Long weakSignature;

    /*
     * Total number of certificates found that are self-signed.
     */
    @JsonProperty(value = "selfSigned")
    private Long selfSigned;

    /*
     * Total number of certificates found that have an insecure key size for the key algorithm.
     */
    @JsonProperty(value = "shortKeySize")
    private Long shortKeySize;

    /** Creates an instance of CryptoCertificateSummaryInner class. */
    public CryptoCertificateSummaryInner() {
    }

    /**
     * Get the totalCertificates property: Total number of certificates found.
     *
     * @return the totalCertificates value.
     */
    public Long totalCertificates() {
        return this.totalCertificates;
    }

    /**
     * Set the totalCertificates property: Total number of certificates found.
     *
     * @param totalCertificates the totalCertificates value to set.
     * @return the CryptoCertificateSummaryInner object itself.
     */
    public CryptoCertificateSummaryInner withTotalCertificates(Long totalCertificates) {
        this.totalCertificates = totalCertificates;
        return this;
    }

    /**
     * Get the pairedKeys property: Total number of paired private keys found for the certificates.
     *
     * @return the pairedKeys value.
     */
    public Long pairedKeys() {
        return this.pairedKeys;
    }

    /**
     * Set the pairedKeys property: Total number of paired private keys found for the certificates.
     *
     * @param pairedKeys the pairedKeys value to set.
     * @return the CryptoCertificateSummaryInner object itself.
     */
    public CryptoCertificateSummaryInner withPairedKeys(Long pairedKeys) {
        this.pairedKeys = pairedKeys;
        return this;
    }

    /**
     * Get the expired property: Total number of expired certificates found.
     *
     * @return the expired value.
     */
    public Long expired() {
        return this.expired;
    }

    /**
     * Set the expired property: Total number of expired certificates found.
     *
     * @param expired the expired value to set.
     * @return the CryptoCertificateSummaryInner object itself.
     */
    public CryptoCertificateSummaryInner withExpired(Long expired) {
        this.expired = expired;
        return this;
    }

    /**
     * Get the expiringSoon property: Total number of nearly expired certificates found.
     *
     * @return the expiringSoon value.
     */
    public Long expiringSoon() {
        return this.expiringSoon;
    }

    /**
     * Set the expiringSoon property: Total number of nearly expired certificates found.
     *
     * @param expiringSoon the expiringSoon value to set.
     * @return the CryptoCertificateSummaryInner object itself.
     */
    public CryptoCertificateSummaryInner withExpiringSoon(Long expiringSoon) {
        this.expiringSoon = expiringSoon;
        return this;
    }

    /**
     * Get the weakSignature property: Total number of certificates found using a weak signature algorithm.
     *
     * @return the weakSignature value.
     */
    public Long weakSignature() {
        return this.weakSignature;
    }

    /**
     * Set the weakSignature property: Total number of certificates found using a weak signature algorithm.
     *
     * @param weakSignature the weakSignature value to set.
     * @return the CryptoCertificateSummaryInner object itself.
     */
    public CryptoCertificateSummaryInner withWeakSignature(Long weakSignature) {
        this.weakSignature = weakSignature;
        return this;
    }

    /**
     * Get the selfSigned property: Total number of certificates found that are self-signed.
     *
     * @return the selfSigned value.
     */
    public Long selfSigned() {
        return this.selfSigned;
    }

    /**
     * Set the selfSigned property: Total number of certificates found that are self-signed.
     *
     * @param selfSigned the selfSigned value to set.
     * @return the CryptoCertificateSummaryInner object itself.
     */
    public CryptoCertificateSummaryInner withSelfSigned(Long selfSigned) {
        this.selfSigned = selfSigned;
        return this;
    }

    /**
     * Get the shortKeySize property: Total number of certificates found that have an insecure key size for the key
     * algorithm.
     *
     * @return the shortKeySize value.
     */
    public Long shortKeySize() {
        return this.shortKeySize;
    }

    /**
     * Set the shortKeySize property: Total number of certificates found that have an insecure key size for the key
     * algorithm.
     *
     * @param shortKeySize the shortKeySize value to set.
     * @return the CryptoCertificateSummaryInner object itself.
     */
    public CryptoCertificateSummaryInner withShortKeySize(Long shortKeySize) {
        this.shortKeySize = shortKeySize;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
