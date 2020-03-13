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

package com.google.api.services.osconfig.v1.model;

/**
 * Represents a group of VMs that can be identified as having all these labels, for example
 * "env=prod and app=web".
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud OS Config API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class PatchInstanceFilterGroupLabel extends com.google.api.client.json.GenericJson {

  /**
   * Google Compute Engine instance labels that must be present for a VM instance to be targeted by
   * this filter.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.Map<String, java.lang.String> labels;

  /**
   * Google Compute Engine instance labels that must be present for a VM instance to be targeted by
   * this filter.
   * @return value or {@code null} for none
   */
  public java.util.Map<String, java.lang.String> getLabels() {
    return labels;
  }

  /**
   * Google Compute Engine instance labels that must be present for a VM instance to be targeted by
   * this filter.
   * @param labels labels or {@code null} for none
   */
  public PatchInstanceFilterGroupLabel setLabels(java.util.Map<String, java.lang.String> labels) {
    this.labels = labels;
    return this;
  }

  @Override
  public PatchInstanceFilterGroupLabel set(String fieldName, Object value) {
    return (PatchInstanceFilterGroupLabel) super.set(fieldName, value);
  }

  @Override
  public PatchInstanceFilterGroupLabel clone() {
    return (PatchInstanceFilterGroupLabel) super.clone();
  }

}
