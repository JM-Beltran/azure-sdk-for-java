/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.eventgrid.v2020_04_01_preview;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * BoolEquals Advanced Filter.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "operatorType", defaultImpl = BoolEqualsAdvancedFilter.class)
@JsonTypeName("BoolEquals")
public class BoolEqualsAdvancedFilter extends AdvancedFilter {
    /**
     * The boolean filter value.
     */
    @JsonProperty(value = "value")
    private Boolean value;

    /**
     * Get the boolean filter value.
     *
     * @return the value value
     */
    public Boolean value() {
        return this.value;
    }

    /**
     * Set the boolean filter value.
     *
     * @param value the value value to set
     * @return the BoolEqualsAdvancedFilter object itself.
     */
    public BoolEqualsAdvancedFilter withValue(Boolean value) {
        this.value = value;
        return this;
    }

}
