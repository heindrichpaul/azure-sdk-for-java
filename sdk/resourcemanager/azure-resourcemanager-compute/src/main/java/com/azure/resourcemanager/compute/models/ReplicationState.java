// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** This is the regional replication state. */
public final class ReplicationState extends ExpandableStringEnum<ReplicationState> {
    /** Static value Unknown for ReplicationState. */
    public static final ReplicationState UNKNOWN = fromString("Unknown");

    /** Static value Replicating for ReplicationState. */
    public static final ReplicationState REPLICATING = fromString("Replicating");

    /** Static value Completed for ReplicationState. */
    public static final ReplicationState COMPLETED = fromString("Completed");

    /** Static value Failed for ReplicationState. */
    public static final ReplicationState FAILED = fromString("Failed");

    /**
     * Creates a new instance of ReplicationState value.
     *
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public ReplicationState() {
    }

    /**
     * Creates or finds a ReplicationState from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding ReplicationState.
     */
    @JsonCreator
    public static ReplicationState fromString(String name) {
        return fromString(name, ReplicationState.class);
    }

    /**
     * Gets known ReplicationState values.
     *
     * @return known ReplicationState values.
     */
    public static Collection<ReplicationState> values() {
        return values(ReplicationState.class);
    }
}
