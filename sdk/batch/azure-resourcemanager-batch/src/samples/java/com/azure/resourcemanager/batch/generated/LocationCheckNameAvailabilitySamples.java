// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.batch.generated;

import com.azure.resourcemanager.batch.models.CheckNameAvailabilityParameters;

/** Samples for Location CheckNameAvailability. */
public final class LocationCheckNameAvailabilitySamples {
    /*
     * x-ms-original-file: specification/batch/resource-manager/Microsoft.Batch/stable/2023-05-01/examples/LocationCheckNameAvailability_AlreadyExists.json
     */
    /**
     * Sample code: LocationCheckNameAvailability_AlreadyExists.
     *
     * @param manager Entry point to BatchManager.
     */
    public static void locationCheckNameAvailabilityAlreadyExists(
        com.azure.resourcemanager.batch.BatchManager manager) {
        manager
            .locations()
            .checkNameAvailabilityWithResponse(
                "japaneast",
                new CheckNameAvailabilityParameters().withName("existingaccountname"),
                com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file: specification/batch/resource-manager/Microsoft.Batch/stable/2023-05-01/examples/LocationCheckNameAvailability_Available.json
     */
    /**
     * Sample code: LocationCheckNameAvailability_Available.
     *
     * @param manager Entry point to BatchManager.
     */
    public static void locationCheckNameAvailabilityAvailable(com.azure.resourcemanager.batch.BatchManager manager) {
        manager
            .locations()
            .checkNameAvailabilityWithResponse(
                "japaneast",
                new CheckNameAvailabilityParameters().withName("newaccountname"),
                com.azure.core.util.Context.NONE);
    }
}
