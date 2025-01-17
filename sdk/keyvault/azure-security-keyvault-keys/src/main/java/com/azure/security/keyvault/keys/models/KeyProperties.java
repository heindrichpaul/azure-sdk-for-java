// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.security.keyvault.keys.models;

import com.azure.core.annotation.Fluent;
import com.azure.security.keyvault.keys.KeyAsyncClient;
import com.azure.security.keyvault.keys.KeyClient;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Instant;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;
import java.util.ArrayList;
import java.util.Base64;
import java.util.List;
import java.util.Map;

/**
 * {@link KeyProperties} is the resource containing all the properties of the key except its {@link JsonWebKey}
 * material. It is managed by the Key Service.
 *
 * @see KeyClient
 * @see KeyAsyncClient
 */
@Fluent
public class KeyProperties {
    /**
     * Determines whether the object is enabled.
     */
    Boolean enabled;

    /**
     * Indicates if the private key can be exported.
     */
    Boolean exportable;

    /**
     * Not before date in UTC.
     */
    OffsetDateTime notBefore;

    /**
     * The key version.
     */
    String version;

    /**
     * Expiry date in UTC.
     */
    OffsetDateTime expiresOn;

    /**
     * Creation time in UTC.
     */
    private OffsetDateTime createdOn;

    /**
     * Last updated time in UTC.
     */
    private OffsetDateTime updatedOn;

    /**
     * Reflects the deletion recovery level currently in effect for keys in the current vault. If it contains
     * 'Purgeable', the key can be permanently deleted by a privileged user; otherwise, only the system can purge the
     * key, at the end of the retention interval. Possible values include: 'Purgeable', 'Recoverable+Purgeable',
     * 'Recoverable', 'Recoverable+ProtectedSubscription'.
     */
    private String recoveryLevel;

    /**
     * The key name.
     */
    String name;

    /**
     * Key identifier.
     */
    @JsonProperty(value = "kid")
    String id;

    /**
     * Application specific metadata in the form of key-value pairs.
     */
    @JsonProperty(value = "tags")
    private Map<String, String> tags;

    /**
     * True if the key's lifetime is managed by key vault. If this is a key backing a certificate, then managed will
     * be true.
     */
    @JsonProperty(value = "managed", access = JsonProperty.Access.WRITE_ONLY)
    private Boolean managed;

    /**
     * The number of days a key is retained before being deleted for a soft delete-enabled Key Vault.
     */
    @JsonProperty(value = "recoverableDays", access = JsonProperty.Access.WRITE_ONLY)
    private Integer recoverableDays;

    /**
     * The policy rules under which the key can be exported.
     */
    @JsonProperty(value = "release_policy", access = JsonProperty.Access.WRITE_ONLY)
    private KeyReleasePolicy releasePolicy;

    /**
     * The underlying HSM Platform the key was generated with.
     */
    @JsonProperty(value = "hsmPlatform")
    private String hsmPlatform;

    /**
     * Gets the number of days a key is retained before being deleted for a soft delete-enabled Key Vault.
     *
     * @return The recoverable days.
     */
    public Integer getRecoverableDays() {
        return recoverableDays;
    }

    /**
     * Get the policy rules under which the key can be exported.
     *
     * @return The policy rules under which the key can be exported.
     */
    public KeyReleasePolicy getReleasePolicy() {
        return this.releasePolicy;
    }

    /**
     * Set the policy rules under which the key can be exported.
     *
     * @param releasePolicy The policy rules to set.
     *
     * @return The updated {@link KeyProperties} object.
     */
    public KeyProperties setReleasePolicy(KeyReleasePolicy releasePolicy) {
        this.releasePolicy = releasePolicy;

        return this;
    }

    /**
     * Get the key recovery level.
     *
     * @return The key recovery level.
     */
    public String getRecoveryLevel() {
        return this.recoveryLevel;
    }

    /**
     * Get the key name.
     *
     * @return The name of the key.
     */
    public String getName() {
        return this.name;
    }


    /**
     * Get the enabled value.
     *
     * @return The enabled value.
     */
    public Boolean isEnabled() {
        return this.enabled;
    }

    /**
     * Set a value that indicates if the key is enabled.
     *
     * @param enabled The enabled value to set.
     *
     * @return The updated {@link KeyProperties} object.
     */
    public KeyProperties setEnabled(Boolean enabled) {
        this.enabled = enabled;

        return this;
    }

    /**
     * Get a flag that indicates if the private key can be exported.
     *
     * @return A flag that indicates if the private key can be exported.
     */
    public Boolean isExportable() {
        return this.exportable;
    }

    /**
     * Set a flag that indicates if the private key can be exported.
     *
     * @param exportable A flag that indicates if the private key can be exported.
     *
     * @return The updated {@link KeyProperties} object.
     */
    public KeyProperties setExportable(Boolean exportable) {
        this.exportable = exportable;

        return this;
    }

    /**
     * Get the {@link OffsetDateTime key's notBefore time} in UTC.
     *
     * @return The {@link OffsetDateTime key's notBefore time} in UTC.
     */
    public OffsetDateTime getNotBefore() {
        return notBefore;
    }

    /**
     * Set the {@link OffsetDateTime key's notBefore time} in UTC.
     *
     * @param notBefore The {@link OffsetDateTime key's notBefore time} in UTC.
     *
     * @return The updated {@link KeyProperties} object.
     */
    public KeyProperties setNotBefore(OffsetDateTime notBefore) {
        this.notBefore = notBefore;

        return this;
    }

    /**
     * Get the {@link OffsetDateTime key expiration time} in UTC.
     *
     * @return The {@link OffsetDateTime key expiration time} in UTC.
     */
    public OffsetDateTime getExpiresOn() {
        return this.expiresOn;
    }

    /**
     * Set the {@link OffsetDateTime key expiration time} in UTC.
     *
     * @param expiresOn The {@link OffsetDateTime key expiration time} in UTC.
     *
     * @return The updated {@link KeyProperties} object.
     */
    public KeyProperties setExpiresOn(OffsetDateTime expiresOn) {
        this.expiresOn = expiresOn;

        return this;
    }

    /**
     * Get the {@link OffsetDateTime time at which key was created} in UTC.
     *
     * @return The {@link OffsetDateTime time at which key was created} in UTC.
     */
    public OffsetDateTime getCreatedOn() {
        return createdOn;
    }

    /**
     * Get the {@link OffsetDateTime time at which key was last updated} in UTC.
     *
     * @return The {@link OffsetDateTime time at which key was last updated} in UTC.
     */
    public OffsetDateTime getUpdatedOn() {
        return updatedOn;
    }

    /**
     * Get the key identifier.
     *
     * @return The key identifier.
     */
    public String getId() {
        return this.id;
    }


    /**
     * Get the tags associated with the key.
     *
     * @return The tag names and values.
     */
    public Map<String, String> getTags() {
        return this.tags;
    }

    /**
     * Set the tags to be associated with the key.
     *
     * @param tags The tags to set.
     *
     * @return The updated {@link KeyProperties} object.
     */
    public KeyProperties setTags(Map<String, String> tags) {
        this.tags = tags;

        return this;
    }

    /**
     * Get the managed value.
     *
     * @return The managed value.
     */
    public Boolean isManaged() {
        return this.managed;
    }

    /**
     * Get the version of the key.
     *
     * @return The version of the key.
     */
    public String getVersion() {
        return this.version;
    }

    /**
     * Get the underlying HSM Platform the key was generated with.
     *
     * @return The key's underlying HSM Platform.
     */
    public String getHsmPlatform() {
        return hsmPlatform;
    }

    /**
     * Unpacks the attributes JSON response and updates the variables in the Key Attributes object. Uses Lazy Update to
     * set values for variables id, contentType, and id as these variables are part of main JSON body and not attributes
     * JSON body when the key response comes from list keys operations.
     *
     * @param attributes The key value mapping of the key attributes.
     */
    @JsonProperty("attributes")
    @SuppressWarnings("unchecked")
    void unpackAttributes(Map<String, Object> attributes) {
        this.enabled = (Boolean) attributes.get("enabled");
        this.exportable = (Boolean) attributes.get("exportable");
        this.notBefore = epochToOffsetDateTime(attributes.get("nbf"));
        this.expiresOn = epochToOffsetDateTime(attributes.get("exp"));
        this.createdOn = epochToOffsetDateTime(attributes.get("created"));
        this.updatedOn = epochToOffsetDateTime(attributes.get("updated"));
        this.recoveryLevel = (String) attributes.get("recoveryLevel");
        this.recoverableDays = (Integer) attributes.get("recoverableDays");
        this.hsmPlatform = (String) attributes.get("hsmPlatform");
    }

    private OffsetDateTime epochToOffsetDateTime(Object epochValue) {
        if (epochValue != null) {
            Instant instant = Instant.ofEpochMilli(((Number) epochValue).longValue() * 1000L);

            return OffsetDateTime.ofInstant(instant, ZoneOffset.UTC);
        }

        return null;
    }

    Object lazyValueSelection(Object input1, Object input2) {
        if (input1 == null) {
            return input2;
        }

        return input1;
    }

    @JsonProperty(value = "kid")
    void unpackId(String keyId) {
        if (keyId != null && keyId.length() > 0) {
            this.id = keyId;

            try {
                URL url = new URL(keyId);
                String[] tokens = url.getPath().split("/");
                this.name = (tokens.length >= 3 ? tokens[2] : null);
                this.version = (tokens.length >= 4 ? tokens[3] : null);
            } catch (MalformedURLException e) {
                e.printStackTrace();
            }
        }
    }

    List<KeyOperation> getKeyOperations(List<String> jsonWebKeyOps) {
        List<KeyOperation> output = new ArrayList<>();

        for (String keyOp : jsonWebKeyOps) {
            output.add(KeyOperation.fromString(keyOp));
        }

        return output;
    }

    @SuppressWarnings("unchecked")
    JsonWebKey createKeyMaterialFromJson(Map<String, Object> key) {
        JsonWebKey outputKey = new JsonWebKey()
            .setY(decode((String) key.get("y")))
            .setX(decode((String) key.get("x")))
            .setCurveName(KeyCurveName.fromString((String) key.get("crv")))
            .setKeyOps(getKeyOperations((List<String>) key.get("key_ops")))
            .setT(decode((String) key.get("key_hsm")))
            .setK(decode((String) key.get("k")))
            .setQ(decode((String) key.get("q")))
            .setP(decode((String) key.get("p")))
            .setQi(decode((String) key.get("qi")))
            .setDq(decode((String) key.get("dq")))
            .setDp(decode((String) key.get("dp")))
            .setD(decode((String) key.get("d")))
            .setE(decode((String) key.get("e")))
            .setN(decode((String) key.get("n")))
            .setKeyType(KeyType.fromString((String) key.get("kty")))
            .setId((String) key.get("kid"));
        unpackId((String) key.get("kid"));

        return outputKey;
    }

    void setManaged(boolean managed) {
        this.managed = managed;
    }

    private byte[] decode(String in) {
        if (in != null) {
            return Base64.getUrlDecoder().decode(in);
        }

        return null;
    }
}
