// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.batch.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.batch.models.EndpointDependency;

public final class EndpointDependencyTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        EndpointDependency model =
            BinaryData
                .fromString(
                    "{\"domainName\":\"frao\",\"description\":\"koowtl\",\"endpointDetails\":[{\"port\":1523878268},{\"port\":1953532777},{\"port\":1275486297},{\"port\":1506529335}]}")
                .toObject(EndpointDependency.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        EndpointDependency model = new EndpointDependency();
        model = BinaryData.fromObject(model).toObject(EndpointDependency.class);
    }
}
