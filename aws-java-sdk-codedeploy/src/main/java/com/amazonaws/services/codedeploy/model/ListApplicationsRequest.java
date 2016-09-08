/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not
 * use this file except in compliance with the License. A copy of the License is
 * located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.codedeploy.model;

import java.io.Serializable;
import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Represents the input of a list applications operation.
 * </p>
 */
public class ListApplicationsRequest extends
        com.amazonaws.AmazonWebServiceRequest implements Serializable,
        Cloneable {

    /**
     * <p>
     * An identifier returned from the previous list applications call. It can
     * be used to return the next set of applications in the list.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * An identifier returned from the previous list applications call. It can
     * be used to return the next set of applications in the list.
     * </p>
     * 
     * @param nextToken
     *        An identifier returned from the previous list applications call.
     *        It can be used to return the next set of applications in the list.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * An identifier returned from the previous list applications call. It can
     * be used to return the next set of applications in the list.
     * </p>
     * 
     * @return An identifier returned from the previous list applications call.
     *         It can be used to return the next set of applications in the
     *         list.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * An identifier returned from the previous list applications call. It can
     * be used to return the next set of applications in the list.
     * </p>
     * 
     * @param nextToken
     *        An identifier returned from the previous list applications call.
     *        It can be used to return the next set of applications in the list.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public ListApplicationsRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getNextToken() != null)
            sb.append("NextToken: " + getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListApplicationsRequest == false)
            return false;
        ListApplicationsRequest other = (ListApplicationsRequest) obj;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListApplicationsRequest clone() {
        return (ListApplicationsRequest) super.clone();
    }
}
