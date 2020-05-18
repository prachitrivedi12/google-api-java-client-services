/*
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */
/*
 * This code was generated by https://github.com/googleapis/google-api-java-client-services/
 * Modify at your own risk.
 */

package com.google.api.services.compute.model;

/**
 * Model definition for NetworkEndpointGroupsListEndpointsRequest.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Compute Engine API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class NetworkEndpointGroupsListEndpointsRequest extends com.google.api.client.json.GenericJson {

  /**
   * Optional list of endpoints to query. This is a more efficient but also limited version of
   * filter parameter. Endpoints in the filter must have ip_address and port fields populated, other
   * fields are not supported.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<NetworkEndpointGroupsListEndpointsRequestNetworkEndpointFilter> endpointFilters;

  /**
   * Optional query parameter for showing the health status of each network endpoint. Valid options
   * are SKIP or SHOW. If you don't specify this parameter, the health status of network endpoints
   * will not be provided.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String healthStatus;

  /**
   * Optional list of endpoints to query. This is a more efficient but also limited version of
   * filter parameter. Endpoints in the filter must have ip_address and port fields populated, other
   * fields are not supported.
   * @return value or {@code null} for none
   */
  public java.util.List<NetworkEndpointGroupsListEndpointsRequestNetworkEndpointFilter> getEndpointFilters() {
    return endpointFilters;
  }

  /**
   * Optional list of endpoints to query. This is a more efficient but also limited version of
   * filter parameter. Endpoints in the filter must have ip_address and port fields populated, other
   * fields are not supported.
   * @param endpointFilters endpointFilters or {@code null} for none
   */
  public NetworkEndpointGroupsListEndpointsRequest setEndpointFilters(java.util.List<NetworkEndpointGroupsListEndpointsRequestNetworkEndpointFilter> endpointFilters) {
    this.endpointFilters = endpointFilters;
    return this;
  }

  /**
   * Optional query parameter for showing the health status of each network endpoint. Valid options
   * are SKIP or SHOW. If you don't specify this parameter, the health status of network endpoints
   * will not be provided.
   * @return value or {@code null} for none
   */
  public java.lang.String getHealthStatus() {
    return healthStatus;
  }

  /**
   * Optional query parameter for showing the health status of each network endpoint. Valid options
   * are SKIP or SHOW. If you don't specify this parameter, the health status of network endpoints
   * will not be provided.
   * @param healthStatus healthStatus or {@code null} for none
   */
  public NetworkEndpointGroupsListEndpointsRequest setHealthStatus(java.lang.String healthStatus) {
    this.healthStatus = healthStatus;
    return this;
  }

  @Override
  public NetworkEndpointGroupsListEndpointsRequest set(String fieldName, Object value) {
    return (NetworkEndpointGroupsListEndpointsRequest) super.set(fieldName, value);
  }

  @Override
  public NetworkEndpointGroupsListEndpointsRequest clone() {
    return (NetworkEndpointGroupsListEndpointsRequest) super.clone();
  }

}
