// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.monitor.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for KnownDataFlowStreams. */
public final class KnownDataFlowStreams extends ExpandableStringEnum<KnownDataFlowStreams> {
    /** Static value Microsoft-Event for KnownDataFlowStreams. */
    public static final KnownDataFlowStreams MICROSOFT_EVENT = fromString("Microsoft-Event");

    /** Static value Microsoft-InsightsMetrics for KnownDataFlowStreams. */
    public static final KnownDataFlowStreams MICROSOFT_INSIGHTS_METRICS = fromString("Microsoft-InsightsMetrics");

    /** Static value Microsoft-Perf for KnownDataFlowStreams. */
    public static final KnownDataFlowStreams MICROSOFT_PERF = fromString("Microsoft-Perf");

    /** Static value Microsoft-Syslog for KnownDataFlowStreams. */
    public static final KnownDataFlowStreams MICROSOFT_SYSLOG = fromString("Microsoft-Syslog");

    /** Static value Microsoft-WindowsEvent for KnownDataFlowStreams. */
    public static final KnownDataFlowStreams MICROSOFT_WINDOWS_EVENT = fromString("Microsoft-WindowsEvent");

    /**
     * Creates or finds a KnownDataFlowStreams from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding KnownDataFlowStreams.
     */
    @JsonCreator
    public static KnownDataFlowStreams fromString(String name) {
        return fromString(name, KnownDataFlowStreams.class);
    }

    /**
     * Gets known KnownDataFlowStreams values.
     *
     * @return known KnownDataFlowStreams values.
     */
    public static Collection<KnownDataFlowStreams> values() {
        return values(KnownDataFlowStreams.class);
    }
}
