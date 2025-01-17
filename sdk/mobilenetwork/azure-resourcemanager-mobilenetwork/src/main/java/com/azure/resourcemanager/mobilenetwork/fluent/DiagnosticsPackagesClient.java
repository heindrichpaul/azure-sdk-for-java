// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mobilenetwork.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.management.polling.PollResult;
import com.azure.core.util.Context;
import com.azure.core.util.polling.SyncPoller;
import com.azure.resourcemanager.mobilenetwork.fluent.models.DiagnosticsPackageInner;

/** An instance of this class provides access to all the operations defined in DiagnosticsPackagesClient. */
public interface DiagnosticsPackagesClient {
    /**
     * Creates or updates a diagnostics package.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param packetCoreControlPlaneName The name of the packet core control plane.
     * @param diagnosticsPackageName The name of the diagnostics package.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of diagnostics package resource.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<DiagnosticsPackageInner>, DiagnosticsPackageInner> beginCreateOrUpdate(
        String resourceGroupName, String packetCoreControlPlaneName, String diagnosticsPackageName);

    /**
     * Creates or updates a diagnostics package.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param packetCoreControlPlaneName The name of the packet core control plane.
     * @param diagnosticsPackageName The name of the diagnostics package.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of diagnostics package resource.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<DiagnosticsPackageInner>, DiagnosticsPackageInner> beginCreateOrUpdate(
        String resourceGroupName, String packetCoreControlPlaneName, String diagnosticsPackageName, Context context);

    /**
     * Creates or updates a diagnostics package.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param packetCoreControlPlaneName The name of the packet core control plane.
     * @param diagnosticsPackageName The name of the diagnostics package.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return diagnostics package resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    DiagnosticsPackageInner createOrUpdate(
        String resourceGroupName, String packetCoreControlPlaneName, String diagnosticsPackageName);

    /**
     * Creates or updates a diagnostics package.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param packetCoreControlPlaneName The name of the packet core control plane.
     * @param diagnosticsPackageName The name of the diagnostics package.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return diagnostics package resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    DiagnosticsPackageInner createOrUpdate(
        String resourceGroupName, String packetCoreControlPlaneName, String diagnosticsPackageName, Context context);

    /**
     * Gets information about the specified diagnostics package.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param packetCoreControlPlaneName The name of the packet core control plane.
     * @param diagnosticsPackageName The name of the diagnostics package.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return information about the specified diagnostics package along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<DiagnosticsPackageInner> getWithResponse(
        String resourceGroupName, String packetCoreControlPlaneName, String diagnosticsPackageName, Context context);

    /**
     * Gets information about the specified diagnostics package.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param packetCoreControlPlaneName The name of the packet core control plane.
     * @param diagnosticsPackageName The name of the diagnostics package.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return information about the specified diagnostics package.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    DiagnosticsPackageInner get(
        String resourceGroupName, String packetCoreControlPlaneName, String diagnosticsPackageName);

    /**
     * Deletes the specified diagnostics package.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param packetCoreControlPlaneName The name of the packet core control plane.
     * @param diagnosticsPackageName The name of the diagnostics package.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginDelete(
        String resourceGroupName, String packetCoreControlPlaneName, String diagnosticsPackageName);

    /**
     * Deletes the specified diagnostics package.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param packetCoreControlPlaneName The name of the packet core control plane.
     * @param diagnosticsPackageName The name of the diagnostics package.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginDelete(
        String resourceGroupName, String packetCoreControlPlaneName, String diagnosticsPackageName, Context context);

    /**
     * Deletes the specified diagnostics package.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param packetCoreControlPlaneName The name of the packet core control plane.
     * @param diagnosticsPackageName The name of the diagnostics package.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String packetCoreControlPlaneName, String diagnosticsPackageName);

    /**
     * Deletes the specified diagnostics package.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param packetCoreControlPlaneName The name of the packet core control plane.
     * @param diagnosticsPackageName The name of the diagnostics package.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(
        String resourceGroupName, String packetCoreControlPlaneName, String diagnosticsPackageName, Context context);

    /**
     * Lists all the diagnostics packages under a packet core control plane.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param packetCoreControlPlaneName The name of the packet core control plane.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return response for diagnostics package API service call as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<DiagnosticsPackageInner> listByPacketCoreControlPlane(
        String resourceGroupName, String packetCoreControlPlaneName);

    /**
     * Lists all the diagnostics packages under a packet core control plane.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param packetCoreControlPlaneName The name of the packet core control plane.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return response for diagnostics package API service call as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<DiagnosticsPackageInner> listByPacketCoreControlPlane(
        String resourceGroupName, String packetCoreControlPlaneName, Context context);
}
