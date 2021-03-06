/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.appmesh.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appmesh-2019-01-25/CreateVirtualNode" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateVirtualNodeRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Unique, case-sensitive identifier that you provide to ensure the idempotency of the request. Up to 36 letters,
     * numbers, hyphens, and underscores are allowed.
     * </p>
     */
    private String clientToken;
    /**
     * <p>
     * The name of the service mesh to create the virtual node in.
     * </p>
     */
    private String meshName;
    /**
     * <p>
     * The virtual node specification to apply.
     * </p>
     */
    private VirtualNodeSpec spec;
    /**
     * <p>
     * Optional metadata that you can apply to the virtual node to assist with categorization and organization. Each tag
     * consists of a key and an optional value, both of which you define. Tag keys can have a maximum character length
     * of 128 characters, and tag values can have a maximum length of 256 characters.
     * </p>
     */
    private java.util.List<TagRef> tags;
    /**
     * <p>
     * The name to use for the virtual node.
     * </p>
     */
    private String virtualNodeName;

    /**
     * <p>
     * Unique, case-sensitive identifier that you provide to ensure the idempotency of the request. Up to 36 letters,
     * numbers, hyphens, and underscores are allowed.
     * </p>
     * 
     * @param clientToken
     *        Unique, case-sensitive identifier that you provide to ensure the idempotency of the request. Up to 36
     *        letters, numbers, hyphens, and underscores are allowed.
     */

    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }

    /**
     * <p>
     * Unique, case-sensitive identifier that you provide to ensure the idempotency of the request. Up to 36 letters,
     * numbers, hyphens, and underscores are allowed.
     * </p>
     * 
     * @return Unique, case-sensitive identifier that you provide to ensure the idempotency of the request. Up to 36
     *         letters, numbers, hyphens, and underscores are allowed.
     */

    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * <p>
     * Unique, case-sensitive identifier that you provide to ensure the idempotency of the request. Up to 36 letters,
     * numbers, hyphens, and underscores are allowed.
     * </p>
     * 
     * @param clientToken
     *        Unique, case-sensitive identifier that you provide to ensure the idempotency of the request. Up to 36
     *        letters, numbers, hyphens, and underscores are allowed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateVirtualNodeRequest withClientToken(String clientToken) {
        setClientToken(clientToken);
        return this;
    }

    /**
     * <p>
     * The name of the service mesh to create the virtual node in.
     * </p>
     * 
     * @param meshName
     *        The name of the service mesh to create the virtual node in.
     */

    public void setMeshName(String meshName) {
        this.meshName = meshName;
    }

    /**
     * <p>
     * The name of the service mesh to create the virtual node in.
     * </p>
     * 
     * @return The name of the service mesh to create the virtual node in.
     */

    public String getMeshName() {
        return this.meshName;
    }

    /**
     * <p>
     * The name of the service mesh to create the virtual node in.
     * </p>
     * 
     * @param meshName
     *        The name of the service mesh to create the virtual node in.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateVirtualNodeRequest withMeshName(String meshName) {
        setMeshName(meshName);
        return this;
    }

    /**
     * <p>
     * The virtual node specification to apply.
     * </p>
     * 
     * @param spec
     *        The virtual node specification to apply.
     */

    public void setSpec(VirtualNodeSpec spec) {
        this.spec = spec;
    }

    /**
     * <p>
     * The virtual node specification to apply.
     * </p>
     * 
     * @return The virtual node specification to apply.
     */

    public VirtualNodeSpec getSpec() {
        return this.spec;
    }

    /**
     * <p>
     * The virtual node specification to apply.
     * </p>
     * 
     * @param spec
     *        The virtual node specification to apply.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateVirtualNodeRequest withSpec(VirtualNodeSpec spec) {
        setSpec(spec);
        return this;
    }

    /**
     * <p>
     * Optional metadata that you can apply to the virtual node to assist with categorization and organization. Each tag
     * consists of a key and an optional value, both of which you define. Tag keys can have a maximum character length
     * of 128 characters, and tag values can have a maximum length of 256 characters.
     * </p>
     * 
     * @return Optional metadata that you can apply to the virtual node to assist with categorization and organization.
     *         Each tag consists of a key and an optional value, both of which you define. Tag keys can have a maximum
     *         character length of 128 characters, and tag values can have a maximum length of 256 characters.
     */

    public java.util.List<TagRef> getTags() {
        return tags;
    }

    /**
     * <p>
     * Optional metadata that you can apply to the virtual node to assist with categorization and organization. Each tag
     * consists of a key and an optional value, both of which you define. Tag keys can have a maximum character length
     * of 128 characters, and tag values can have a maximum length of 256 characters.
     * </p>
     * 
     * @param tags
     *        Optional metadata that you can apply to the virtual node to assist with categorization and organization.
     *        Each tag consists of a key and an optional value, both of which you define. Tag keys can have a maximum
     *        character length of 128 characters, and tag values can have a maximum length of 256 characters.
     */

    public void setTags(java.util.Collection<TagRef> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }

        this.tags = new java.util.ArrayList<TagRef>(tags);
    }

    /**
     * <p>
     * Optional metadata that you can apply to the virtual node to assist with categorization and organization. Each tag
     * consists of a key and an optional value, both of which you define. Tag keys can have a maximum character length
     * of 128 characters, and tag values can have a maximum length of 256 characters.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        Optional metadata that you can apply to the virtual node to assist with categorization and organization.
     *        Each tag consists of a key and an optional value, both of which you define. Tag keys can have a maximum
     *        character length of 128 characters, and tag values can have a maximum length of 256 characters.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateVirtualNodeRequest withTags(TagRef... tags) {
        if (this.tags == null) {
            setTags(new java.util.ArrayList<TagRef>(tags.length));
        }
        for (TagRef ele : tags) {
            this.tags.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Optional metadata that you can apply to the virtual node to assist with categorization and organization. Each tag
     * consists of a key and an optional value, both of which you define. Tag keys can have a maximum character length
     * of 128 characters, and tag values can have a maximum length of 256 characters.
     * </p>
     * 
     * @param tags
     *        Optional metadata that you can apply to the virtual node to assist with categorization and organization.
     *        Each tag consists of a key and an optional value, both of which you define. Tag keys can have a maximum
     *        character length of 128 characters, and tag values can have a maximum length of 256 characters.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateVirtualNodeRequest withTags(java.util.Collection<TagRef> tags) {
        setTags(tags);
        return this;
    }

    /**
     * <p>
     * The name to use for the virtual node.
     * </p>
     * 
     * @param virtualNodeName
     *        The name to use for the virtual node.
     */

    public void setVirtualNodeName(String virtualNodeName) {
        this.virtualNodeName = virtualNodeName;
    }

    /**
     * <p>
     * The name to use for the virtual node.
     * </p>
     * 
     * @return The name to use for the virtual node.
     */

    public String getVirtualNodeName() {
        return this.virtualNodeName;
    }

    /**
     * <p>
     * The name to use for the virtual node.
     * </p>
     * 
     * @param virtualNodeName
     *        The name to use for the virtual node.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateVirtualNodeRequest withVirtualNodeName(String virtualNodeName) {
        setVirtualNodeName(virtualNodeName);
        return this;
    }

    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getClientToken() != null)
            sb.append("ClientToken: ").append(getClientToken()).append(",");
        if (getMeshName() != null)
            sb.append("MeshName: ").append(getMeshName()).append(",");
        if (getSpec() != null)
            sb.append("Spec: ").append(getSpec()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags()).append(",");
        if (getVirtualNodeName() != null)
            sb.append("VirtualNodeName: ").append(getVirtualNodeName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateVirtualNodeRequest == false)
            return false;
        CreateVirtualNodeRequest other = (CreateVirtualNodeRequest) obj;
        if (other.getClientToken() == null ^ this.getClientToken() == null)
            return false;
        if (other.getClientToken() != null && other.getClientToken().equals(this.getClientToken()) == false)
            return false;
        if (other.getMeshName() == null ^ this.getMeshName() == null)
            return false;
        if (other.getMeshName() != null && other.getMeshName().equals(this.getMeshName()) == false)
            return false;
        if (other.getSpec() == null ^ this.getSpec() == null)
            return false;
        if (other.getSpec() != null && other.getSpec().equals(this.getSpec()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        if (other.getVirtualNodeName() == null ^ this.getVirtualNodeName() == null)
            return false;
        if (other.getVirtualNodeName() != null && other.getVirtualNodeName().equals(this.getVirtualNodeName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getClientToken() == null) ? 0 : getClientToken().hashCode());
        hashCode = prime * hashCode + ((getMeshName() == null) ? 0 : getMeshName().hashCode());
        hashCode = prime * hashCode + ((getSpec() == null) ? 0 : getSpec().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode + ((getVirtualNodeName() == null) ? 0 : getVirtualNodeName().hashCode());
        return hashCode;
    }

    @Override
    public CreateVirtualNodeRequest clone() {
        return (CreateVirtualNodeRequest) super.clone();
    }

}
