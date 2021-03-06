/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.frontdoor.v2020_05_01;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for LatencyScorecardAggregationInterval.
 */
public final class LatencyScorecardAggregationInterval extends ExpandableStringEnum<LatencyScorecardAggregationInterval> {
    /** Static value Daily for LatencyScorecardAggregationInterval. */
    public static final LatencyScorecardAggregationInterval DAILY = fromString("Daily");

    /** Static value Weekly for LatencyScorecardAggregationInterval. */
    public static final LatencyScorecardAggregationInterval WEEKLY = fromString("Weekly");

    /** Static value Monthly for LatencyScorecardAggregationInterval. */
    public static final LatencyScorecardAggregationInterval MONTHLY = fromString("Monthly");

    /**
     * Creates or finds a LatencyScorecardAggregationInterval from its string representation.
     * @param name a name to look for
     * @return the corresponding LatencyScorecardAggregationInterval
     */
    @JsonCreator
    public static LatencyScorecardAggregationInterval fromString(String name) {
        return fromString(name, LatencyScorecardAggregationInterval.class);
    }

    /**
     * @return known LatencyScorecardAggregationInterval values
     */
    public static Collection<LatencyScorecardAggregationInterval> values() {
        return values(LatencyScorecardAggregationInterval.class);
    }
}
