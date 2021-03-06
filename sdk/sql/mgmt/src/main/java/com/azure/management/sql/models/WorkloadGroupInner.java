// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.sql.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.management.ProxyResource;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The WorkloadGroup model. */
@JsonFlatten
@Fluent
public class WorkloadGroupInner extends ProxyResource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(WorkloadGroupInner.class);

    /*
     * The workload group minimum percentage resource.
     */
    @JsonProperty(value = "properties.minResourcePercent")
    private Integer minResourcePercent;

    /*
     * The workload group cap percentage resource.
     */
    @JsonProperty(value = "properties.maxResourcePercent")
    private Integer maxResourcePercent;

    /*
     * The workload group request minimum grant percentage.
     */
    @JsonProperty(value = "properties.minResourcePercentPerRequest")
    private Double minResourcePercentPerRequest;

    /*
     * The workload group request maximum grant percentage.
     */
    @JsonProperty(value = "properties.maxResourcePercentPerRequest")
    private Double maxResourcePercentPerRequest;

    /*
     * The workload group importance level.
     */
    @JsonProperty(value = "properties.importance")
    private String importance;

    /*
     * The workload group query execution timeout.
     */
    @JsonProperty(value = "properties.queryExecutionTimeout")
    private Integer queryExecutionTimeout;

    /**
     * Get the minResourcePercent property: The workload group minimum percentage resource.
     *
     * @return the minResourcePercent value.
     */
    public Integer minResourcePercent() {
        return this.minResourcePercent;
    }

    /**
     * Set the minResourcePercent property: The workload group minimum percentage resource.
     *
     * @param minResourcePercent the minResourcePercent value to set.
     * @return the WorkloadGroupInner object itself.
     */
    public WorkloadGroupInner withMinResourcePercent(Integer minResourcePercent) {
        this.minResourcePercent = minResourcePercent;
        return this;
    }

    /**
     * Get the maxResourcePercent property: The workload group cap percentage resource.
     *
     * @return the maxResourcePercent value.
     */
    public Integer maxResourcePercent() {
        return this.maxResourcePercent;
    }

    /**
     * Set the maxResourcePercent property: The workload group cap percentage resource.
     *
     * @param maxResourcePercent the maxResourcePercent value to set.
     * @return the WorkloadGroupInner object itself.
     */
    public WorkloadGroupInner withMaxResourcePercent(Integer maxResourcePercent) {
        this.maxResourcePercent = maxResourcePercent;
        return this;
    }

    /**
     * Get the minResourcePercentPerRequest property: The workload group request minimum grant percentage.
     *
     * @return the minResourcePercentPerRequest value.
     */
    public Double minResourcePercentPerRequest() {
        return this.minResourcePercentPerRequest;
    }

    /**
     * Set the minResourcePercentPerRequest property: The workload group request minimum grant percentage.
     *
     * @param minResourcePercentPerRequest the minResourcePercentPerRequest value to set.
     * @return the WorkloadGroupInner object itself.
     */
    public WorkloadGroupInner withMinResourcePercentPerRequest(Double minResourcePercentPerRequest) {
        this.minResourcePercentPerRequest = minResourcePercentPerRequest;
        return this;
    }

    /**
     * Get the maxResourcePercentPerRequest property: The workload group request maximum grant percentage.
     *
     * @return the maxResourcePercentPerRequest value.
     */
    public Double maxResourcePercentPerRequest() {
        return this.maxResourcePercentPerRequest;
    }

    /**
     * Set the maxResourcePercentPerRequest property: The workload group request maximum grant percentage.
     *
     * @param maxResourcePercentPerRequest the maxResourcePercentPerRequest value to set.
     * @return the WorkloadGroupInner object itself.
     */
    public WorkloadGroupInner withMaxResourcePercentPerRequest(Double maxResourcePercentPerRequest) {
        this.maxResourcePercentPerRequest = maxResourcePercentPerRequest;
        return this;
    }

    /**
     * Get the importance property: The workload group importance level.
     *
     * @return the importance value.
     */
    public String importance() {
        return this.importance;
    }

    /**
     * Set the importance property: The workload group importance level.
     *
     * @param importance the importance value to set.
     * @return the WorkloadGroupInner object itself.
     */
    public WorkloadGroupInner withImportance(String importance) {
        this.importance = importance;
        return this;
    }

    /**
     * Get the queryExecutionTimeout property: The workload group query execution timeout.
     *
     * @return the queryExecutionTimeout value.
     */
    public Integer queryExecutionTimeout() {
        return this.queryExecutionTimeout;
    }

    /**
     * Set the queryExecutionTimeout property: The workload group query execution timeout.
     *
     * @param queryExecutionTimeout the queryExecutionTimeout value to set.
     * @return the WorkloadGroupInner object itself.
     */
    public WorkloadGroupInner withQueryExecutionTimeout(Integer queryExecutionTimeout) {
        this.queryExecutionTimeout = queryExecutionTimeout;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
