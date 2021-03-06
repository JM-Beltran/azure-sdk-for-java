/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.cosmosdb.v2015_04_08.implementation;

import com.microsoft.azure.management.cosmosdb.v2015_04_08.CassandraKeyspace;
import com.microsoft.azure.arm.model.implementation.CreatableUpdatableImpl;
import rx.Observable;
import com.microsoft.azure.management.cosmosdb.v2015_04_08.CassandraKeyspaceCreateUpdateParameters;
import java.util.Map;
import com.microsoft.azure.management.cosmosdb.v2015_04_08.CassandraKeyspaceResource;
import rx.functions.Func1;

class CassandraKeyspaceImpl extends CreatableUpdatableImpl<CassandraKeyspace, CassandraKeyspaceInner, CassandraKeyspaceImpl> implements CassandraKeyspace, CassandraKeyspace.Definition, CassandraKeyspace.Update {
    private final CosmosDBManager manager;
    private String resourceGroupName;
    private String accountName;
    private String keyspaceName;
    private CassandraKeyspaceCreateUpdateParameters createOrUpdateParameter;

    CassandraKeyspaceImpl(String name, CosmosDBManager manager) {
        super(name, new CassandraKeyspaceInner());
        this.manager = manager;
        // Set resource name
        this.keyspaceName = name;
        //
        this.createOrUpdateParameter = new CassandraKeyspaceCreateUpdateParameters();
    }

    CassandraKeyspaceImpl(CassandraKeyspaceInner inner, CosmosDBManager manager) {
        super(inner.name(), inner);
        this.manager = manager;
        // Set resource name
        this.keyspaceName = inner.name();
        // set resource ancestor and positional variables
        this.resourceGroupName = IdParsingUtils.getValueFromIdByName(inner.id(), "resourceGroups");
        this.accountName = IdParsingUtils.getValueFromIdByName(inner.id(), "databaseAccounts");
        this.keyspaceName = IdParsingUtils.getValueFromIdByName(inner.id(), "keyspaces");
        //
        this.createOrUpdateParameter = new CassandraKeyspaceCreateUpdateParameters();
    }

    @Override
    public CosmosDBManager manager() {
        return this.manager;
    }

    @Override
    public Observable<CassandraKeyspace> createResourceAsync() {
        DatabaseAccountsInner client = this.manager().inner().databaseAccounts();
        return client.createUpdateCassandraKeyspaceAsync(this.resourceGroupName, this.accountName, this.keyspaceName, this.createOrUpdateParameter)
            .map(new Func1<CassandraKeyspaceInner, CassandraKeyspaceInner>() {
               @Override
               public CassandraKeyspaceInner call(CassandraKeyspaceInner resource) {
                   resetCreateUpdateParameters();
                   return resource;
               }
            })
            .map(innerToFluentMap(this));
    }

    @Override
    public Observable<CassandraKeyspace> updateResourceAsync() {
        DatabaseAccountsInner client = this.manager().inner().databaseAccounts();
        return client.createUpdateCassandraKeyspaceAsync(this.resourceGroupName, this.accountName, this.keyspaceName, this.createOrUpdateParameter)
            .map(new Func1<CassandraKeyspaceInner, CassandraKeyspaceInner>() {
               @Override
               public CassandraKeyspaceInner call(CassandraKeyspaceInner resource) {
                   resetCreateUpdateParameters();
                   return resource;
               }
            })
            .map(innerToFluentMap(this));
    }

    @Override
    protected Observable<CassandraKeyspaceInner> getInnerAsync() {
        DatabaseAccountsInner client = this.manager().inner().databaseAccounts();
        return null; // NOP getInnerAsync implementation as get is not supported
    }

    @Override
    public boolean isInCreateMode() {
        return this.inner().id() == null;
    }

    private void resetCreateUpdateParameters() {
        this.createOrUpdateParameter = new CassandraKeyspaceCreateUpdateParameters();
    }

    @Override
    public String cassandraKeyspaceId() {
        return this.inner().cassandraKeyspaceId();
    }

    @Override
    public String id() {
        return this.inner().id();
    }

    @Override
    public String location() {
        return this.inner().location();
    }

    @Override
    public String name() {
        return this.inner().name();
    }

    @Override
    public Map<String, String> tags() {
        return this.inner().getTags();
    }

    @Override
    public String type() {
        return this.inner().type();
    }

    @Override
    public CassandraKeyspaceImpl withExistingApi(String resourceGroupName, String accountName) {
        this.resourceGroupName = resourceGroupName;
        this.accountName = accountName;
        return this;
    }

    @Override
    public CassandraKeyspaceImpl withOptions(Map<String, String> options) {
        this.createOrUpdateParameter.withOptions(options);
        return this;
    }

    @Override
    public CassandraKeyspaceImpl withResource(CassandraKeyspaceResource resource) {
        this.createOrUpdateParameter.withResource(resource);
        return this;
    }

}
