/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.implementation;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.azure.SubResource;
import com.microsoft.rest.serializer.JsonFlatten;

import java.util.List;

/**
 * Subnet in a virtual network resource.
 */
@JsonFlatten
public class SubnetInner extends SubResource {
    /**
     * The address prefix for the subnet.
     */
    @JsonProperty(value = "properties.addressPrefix")
    private String addressPrefix;

    /**
     * The reference of the NetworkSecurityGroup resource.
     */
    @JsonProperty(value = "properties.networkSecurityGroup")
    private SubResource networkSecurityGroup;

    /**
     * The reference of the RouteTable resource.
     */
    @JsonProperty(value = "properties.routeTable")
    private SubResource routeTable;

    /**
     * Gets an array of references to the network interface IP configurations
     * using subnet.
     */
    @JsonProperty(value = "properties.ipConfigurations", access = JsonProperty.Access.WRITE_ONLY)
    private List<IPConfigurationInner> ipConfigurations;

    /**
     * Gets an array of references to the external resources using subnet.
     */
    @JsonProperty(value = "properties.resourceNavigationLinks")
    private List<ResourceNavigationLinkInner> resourceNavigationLinks;

    /**
     * The provisioning state of the resource.
     */
    @JsonProperty(value = "properties.provisioningState")
    private String provisioningState;

    /**
     * The name of the resource that is unique within a resource group. This
     * name can be used to access the resource.
     */
    private String name;

    /**
     * A unique read-only string that changes whenever the resource is updated.
     */
    private String etag;

    /**
     * Get the addressPrefix value.
     *
     * @return the addressPrefix value
     */
    public String addressPrefix() {
        return this.addressPrefix;
    }

    /**
     * Set the addressPrefix value.
     *
     * @param addressPrefix the addressPrefix value to set
     * @return the SubnetInner object itself.
     */
    public SubnetInner withAddressPrefix(String addressPrefix) {
        this.addressPrefix = addressPrefix;
        return this;
    }

    /**
     * Get the networkSecurityGroup value.
     *
     * @return the networkSecurityGroup value
     */
    public SubResource networkSecurityGroup() {
        return this.networkSecurityGroup;
    }

    /**
     * Set the networkSecurityGroup value.
     *
     * @param networkSecurityGroup the networkSecurityGroup value to set
     * @return the SubnetInner object itself.
     */
    public SubnetInner withNetworkSecurityGroup(SubResource networkSecurityGroup) {
        this.networkSecurityGroup = networkSecurityGroup;
        return this;
    }

    /**
     * Get the routeTable value.
     *
     * @return the routeTable value
     */
    public SubResource routeTable() {
        return this.routeTable;
    }

    /**
     * Set the routeTable value.
     *
     * @param routeTable the routeTable value to set
     * @return the SubnetInner object itself.
     */
    public SubnetInner withRouteTable(SubResource routeTable) {
        this.routeTable = routeTable;
        return this;
    }

    /**
     * Get the ipConfigurations value.
     *
     * @return the ipConfigurations value
     */
    public List<IPConfigurationInner> ipConfigurations() {
        return this.ipConfigurations;
    }

    /**
     * Get the resourceNavigationLinks value.
     *
     * @return the resourceNavigationLinks value
     */
    public List<ResourceNavigationLinkInner> resourceNavigationLinks() {
        return this.resourceNavigationLinks;
    }

    /**
     * Set the resourceNavigationLinks value.
     *
     * @param resourceNavigationLinks the resourceNavigationLinks value to set
     * @return the SubnetInner object itself.
     */
    public SubnetInner withResourceNavigationLinks(List<ResourceNavigationLinkInner> resourceNavigationLinks) {
        this.resourceNavigationLinks = resourceNavigationLinks;
        return this;
    }

    /**
     * Get the provisioningState value.
     *
     * @return the provisioningState value
     */
    public String provisioningState() {
        return this.provisioningState;
    }

    /**
     * Set the provisioningState value.
     *
     * @param provisioningState the provisioningState value to set
     * @return the SubnetInner object itself.
     */
    public SubnetInner withProvisioningState(String provisioningState) {
        this.provisioningState = provisioningState;
        return this;
    }

    /**
     * Get the name value.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name value.
     *
     * @param name the name value to set
     * @return the SubnetInner object itself.
     */
    public SubnetInner withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the etag value.
     *
     * @return the etag value
     */
    public String etag() {
        return this.etag;
    }

    /**
     * Set the etag value.
     *
     * @param etag the etag value to set
     * @return the SubnetInner object itself.
     */
    public SubnetInner withEtag(String etag) {
        this.etag = etag;
        return this;
    }

}
