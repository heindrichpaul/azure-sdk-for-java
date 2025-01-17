// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hdinsight.containers.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Flink cluster catalog options. */
@Fluent
public final class FlinkCatalogOptions {
    /*
     * Hive Catalog Option for Flink cluster.
     */
    @JsonProperty(value = "hive")
    private FlinkHiveCatalogOption hive;

    /** Creates an instance of FlinkCatalogOptions class. */
    public FlinkCatalogOptions() {
    }

    /**
     * Get the hive property: Hive Catalog Option for Flink cluster.
     *
     * @return the hive value.
     */
    public FlinkHiveCatalogOption hive() {
        return this.hive;
    }

    /**
     * Set the hive property: Hive Catalog Option for Flink cluster.
     *
     * @param hive the hive value to set.
     * @return the FlinkCatalogOptions object itself.
     */
    public FlinkCatalogOptions withHive(FlinkHiveCatalogOption hive) {
        this.hive = hive;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (hive() != null) {
            hive().validate();
        }
    }
}
