/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.appservice.v2019_08_01;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.management.appservice.v2019_08_01.implementation.VnetInfoInner;
import com.microsoft.azure.arm.model.Indexable;
import com.microsoft.azure.arm.model.Refreshable;
import com.microsoft.azure.arm.model.Updatable;
import com.microsoft.azure.arm.model.Appliable;
import com.microsoft.azure.arm.model.Creatable;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.appservice.v2019_08_01.implementation.AppServiceManager;
import java.util.List;

/**
 * Type representing SiteVnetInfo.
 */
public interface SiteVnetInfo extends HasInner<VnetInfoInner>, Indexable, Refreshable<SiteVnetInfo>, Updatable<SiteVnetInfo.Update>, HasManager<AppServiceManager> {
    /**
     * @return the certBlob value.
     */
    String certBlob();

    /**
     * @return the certThumbprint value.
     */
    String certThumbprint();

    /**
     * @return the dnsServers value.
     */
    String dnsServers();

    /**
     * @return the id value.
     */
    String id();

    /**
     * @return the isSwift value.
     */
    Boolean isSwift();

    /**
     * @return the kind value.
     */
    String kind();

    /**
     * @return the name value.
     */
    String name();

    /**
     * @return the resyncRequired value.
     */
    Boolean resyncRequired();

    /**
     * @return the routes value.
     */
    List<VnetRoute> routes();

    /**
     * @return the type value.
     */
    String type();

    /**
     * @return the vnetResourceId value.
     */
    String vnetResourceId();

    /**
     * The entirety of the SiteVnetInfo definition.
     */
    interface Definition extends DefinitionStages.Blank, DefinitionStages.WithSlot, DefinitionStages.WithCreate {
    }

    /**
     * Grouping of SiteVnetInfo definition stages.
     */
    interface DefinitionStages {
        /**
         * The first stage of a SiteVnetInfo definition.
         */
        interface Blank extends WithSlot {
        }

        /**
         * The stage of the sitevnetinfo definition allowing to specify Slot.
         */
        interface WithSlot {
           /**
            * Specifies resourceGroupName, name, slot.
            * @param resourceGroupName Name of the resource group to which the resource belongs
            * @param name Name of the app
            * @param slot Name of the deployment slot. If a slot is not specified, the API will add or update connections for the production slot
            * @return the next definition stage
            */
            WithCreate withExistingSlot(String resourceGroupName, String name, String slot);
        }

        /**
         * The stage of the sitevnetinfo definition allowing to specify CertBlob.
         */
        interface WithCertBlob {
            /**
             * Specifies certBlob.
             * @param certBlob A certificate file (.cer) blob containing the public key of the private key used to authenticate a
 Point-To-Site VPN connection
             * @return the next definition stage
             */
            WithCreate withCertBlob(String certBlob);
        }

        /**
         * The stage of the sitevnetinfo definition allowing to specify DnsServers.
         */
        interface WithDnsServers {
            /**
             * Specifies dnsServers.
             * @param dnsServers DNS servers to be used by this Virtual Network. This should be a comma-separated list of IP addresses
             * @return the next definition stage
             */
            WithCreate withDnsServers(String dnsServers);
        }

        /**
         * The stage of the sitevnetinfo definition allowing to specify IsSwift.
         */
        interface WithIsSwift {
            /**
             * Specifies isSwift.
             * @param isSwift Flag that is used to denote if this is VNET injection
             * @return the next definition stage
             */
            WithCreate withIsSwift(Boolean isSwift);
        }

        /**
         * The stage of the sitevnetinfo definition allowing to specify Kind.
         */
        interface WithKind {
            /**
             * Specifies kind.
             * @param kind Kind of resource
             * @return the next definition stage
             */
            WithCreate withKind(String kind);
        }

        /**
         * The stage of the sitevnetinfo definition allowing to specify VnetResourceId.
         */
        interface WithVnetResourceId {
            /**
             * Specifies vnetResourceId.
             * @param vnetResourceId The Virtual Network's resource ID
             * @return the next definition stage
             */
            WithCreate withVnetResourceId(String vnetResourceId);
        }

        /**
         * The stage of the definition which contains all the minimum required inputs for
         * the resource to be created (via {@link WithCreate#create()}), but also allows
         * for any other optional settings to be specified.
         */
        interface WithCreate extends Creatable<SiteVnetInfo>, DefinitionStages.WithCertBlob, DefinitionStages.WithDnsServers, DefinitionStages.WithIsSwift, DefinitionStages.WithKind, DefinitionStages.WithVnetResourceId {
        }
    }
    /**
     * The template for a SiteVnetInfo update operation, containing all the settings that can be modified.
     */
    interface Update extends Appliable<SiteVnetInfo>, UpdateStages.WithCertBlob, UpdateStages.WithDnsServers, UpdateStages.WithIsSwift, UpdateStages.WithKind, UpdateStages.WithVnetResourceId {
    }

    /**
     * Grouping of SiteVnetInfo update stages.
     */
    interface UpdateStages {
        /**
         * The stage of the sitevnetinfo update allowing to specify CertBlob.
         */
        interface WithCertBlob {
            /**
             * Specifies certBlob.
             * @param certBlob A certificate file (.cer) blob containing the public key of the private key used to authenticate a
 Point-To-Site VPN connection
             * @return the next update stage
             */
            Update withCertBlob(String certBlob);
        }

        /**
         * The stage of the sitevnetinfo update allowing to specify DnsServers.
         */
        interface WithDnsServers {
            /**
             * Specifies dnsServers.
             * @param dnsServers DNS servers to be used by this Virtual Network. This should be a comma-separated list of IP addresses
             * @return the next update stage
             */
            Update withDnsServers(String dnsServers);
        }

        /**
         * The stage of the sitevnetinfo update allowing to specify IsSwift.
         */
        interface WithIsSwift {
            /**
             * Specifies isSwift.
             * @param isSwift Flag that is used to denote if this is VNET injection
             * @return the next update stage
             */
            Update withIsSwift(Boolean isSwift);
        }

        /**
         * The stage of the sitevnetinfo update allowing to specify Kind.
         */
        interface WithKind {
            /**
             * Specifies kind.
             * @param kind Kind of resource
             * @return the next update stage
             */
            Update withKind(String kind);
        }

        /**
         * The stage of the sitevnetinfo update allowing to specify VnetResourceId.
         */
        interface WithVnetResourceId {
            /**
             * Specifies vnetResourceId.
             * @param vnetResourceId The Virtual Network's resource ID
             * @return the next update stage
             */
            Update withVnetResourceId(String vnetResourceId);
        }

    }
}
