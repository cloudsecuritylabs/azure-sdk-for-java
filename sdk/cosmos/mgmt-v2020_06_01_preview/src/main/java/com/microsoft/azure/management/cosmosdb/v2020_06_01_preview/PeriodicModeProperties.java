/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.cosmosdb.v2020_06_01_preview;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Configuration values for periodic mode backup.
 */
public class PeriodicModeProperties {
    /**
     * An integer representing the interval in minutes between two backups.
     */
    @JsonProperty(value = "backupIntervalInMinutes")
    private Integer backupIntervalInMinutes;

    /**
     * An integer representing the time (in hours) that each backup is
     * retained.
     */
    @JsonProperty(value = "backupRetentionIntervalInHours")
    private Integer backupRetentionIntervalInHours;

    /**
     * Get an integer representing the interval in minutes between two backups.
     *
     * @return the backupIntervalInMinutes value
     */
    public Integer backupIntervalInMinutes() {
        return this.backupIntervalInMinutes;
    }

    /**
     * Set an integer representing the interval in minutes between two backups.
     *
     * @param backupIntervalInMinutes the backupIntervalInMinutes value to set
     * @return the PeriodicModeProperties object itself.
     */
    public PeriodicModeProperties withBackupIntervalInMinutes(Integer backupIntervalInMinutes) {
        this.backupIntervalInMinutes = backupIntervalInMinutes;
        return this;
    }

    /**
     * Get an integer representing the time (in hours) that each backup is retained.
     *
     * @return the backupRetentionIntervalInHours value
     */
    public Integer backupRetentionIntervalInHours() {
        return this.backupRetentionIntervalInHours;
    }

    /**
     * Set an integer representing the time (in hours) that each backup is retained.
     *
     * @param backupRetentionIntervalInHours the backupRetentionIntervalInHours value to set
     * @return the PeriodicModeProperties object itself.
     */
    public PeriodicModeProperties withBackupRetentionIntervalInHours(Integer backupRetentionIntervalInHours) {
        this.backupRetentionIntervalInHours = backupRetentionIntervalInHours;
        return this;
    }

}