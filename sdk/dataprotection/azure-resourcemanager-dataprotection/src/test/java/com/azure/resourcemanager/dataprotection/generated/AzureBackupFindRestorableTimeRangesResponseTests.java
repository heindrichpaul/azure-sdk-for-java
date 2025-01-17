// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.dataprotection.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.dataprotection.models.AzureBackupFindRestorableTimeRangesResponse;
import com.azure.resourcemanager.dataprotection.models.RestorableTimeRange;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class AzureBackupFindRestorableTimeRangesResponseTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        AzureBackupFindRestorableTimeRangesResponse model =
            BinaryData
                .fromString(
                    "{\"restorableTimeRanges\":[{\"startTime\":\"ucerscdntnevfi\",\"endTime\":\"jmygtdsslswtmwer\",\"objectType\":\"fzp\"},{\"startTime\":\"qsemwabne\",\"endTime\":\"shhszhedplvwiw\",\"objectType\":\"mwmbes\"},{\"startTime\":\"dnkwwtppjflcxog\",\"endTime\":\"okonzmnsikvmkqz\",\"objectType\":\"qkdltfz\"},{\"startTime\":\"mhhv\",\"endTime\":\"gureodkwobdag\",\"objectType\":\"ibqdxbxwakbogqx\"}],\"objectType\":\"lkzgxhuriplbp\"}")
                .toObject(AzureBackupFindRestorableTimeRangesResponse.class);
        Assertions.assertEquals("ucerscdntnevfi", model.restorableTimeRanges().get(0).startTime());
        Assertions.assertEquals("jmygtdsslswtmwer", model.restorableTimeRanges().get(0).endTime());
        Assertions.assertEquals("fzp", model.restorableTimeRanges().get(0).objectType());
        Assertions.assertEquals("lkzgxhuriplbp", model.objectType());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        AzureBackupFindRestorableTimeRangesResponse model =
            new AzureBackupFindRestorableTimeRangesResponse()
                .withRestorableTimeRanges(
                    Arrays
                        .asList(
                            new RestorableTimeRange()
                                .withStartTime("ucerscdntnevfi")
                                .withEndTime("jmygtdsslswtmwer")
                                .withObjectType("fzp"),
                            new RestorableTimeRange()
                                .withStartTime("qsemwabne")
                                .withEndTime("shhszhedplvwiw")
                                .withObjectType("mwmbes"),
                            new RestorableTimeRange()
                                .withStartTime("dnkwwtppjflcxog")
                                .withEndTime("okonzmnsikvmkqz")
                                .withObjectType("qkdltfz"),
                            new RestorableTimeRange()
                                .withStartTime("mhhv")
                                .withEndTime("gureodkwobdag")
                                .withObjectType("ibqdxbxwakbogqx")))
                .withObjectType("lkzgxhuriplbp");
        model = BinaryData.fromObject(model).toObject(AzureBackupFindRestorableTimeRangesResponse.class);
        Assertions.assertEquals("ucerscdntnevfi", model.restorableTimeRanges().get(0).startTime());
        Assertions.assertEquals("jmygtdsslswtmwer", model.restorableTimeRanges().get(0).endTime());
        Assertions.assertEquals("fzp", model.restorableTimeRanges().get(0).objectType());
        Assertions.assertEquals("lkzgxhuriplbp", model.objectType());
    }
}
