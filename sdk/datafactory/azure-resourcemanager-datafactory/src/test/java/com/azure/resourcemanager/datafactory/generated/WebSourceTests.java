// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.WebSource;

public final class WebSourceTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        WebSource model = BinaryData.fromString(
            "{\"type\":\"WebSource\",\"additionalColumns\":\"dataifktnxugi\",\"sourceRetryCount\":\"databwyeyrnbuby\",\"sourceRetryWait\":\"datatowbuuhlwbgvzuxf\",\"maxConcurrentConnections\":\"datafpdzuoqp\",\"disableMetricsCollection\":\"datafv\",\"\":{\"jtswemot\":\"datalmfjylhvpljzrq\"}}")
            .toObject(WebSource.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        WebSource model = new WebSource().withSourceRetryCount("databwyeyrnbuby")
            .withSourceRetryWait("datatowbuuhlwbgvzuxf").withMaxConcurrentConnections("datafpdzuoqp")
            .withDisableMetricsCollection("datafv").withAdditionalColumns("dataifktnxugi");
        model = BinaryData.fromObject(model).toObject(WebSource.class);
    }
}
