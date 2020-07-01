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

package com.google.api.services.run.v1alpha1.model;

/**
 * ServiceCondition defines a readiness condition for a Service.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Run Admin API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ServiceCondition extends com.google.api.client.json.GenericJson {

  /**
   * Last time the condition transitioned from one status to another. +optional
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String lastTransitionTime;

  /**
   * Human-readable message indicating details about last transition. +optional
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String message;

  /**
   * One-word CamelCase reason for the condition's last transition. +optional
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String reason;

  /**
   * How to interpret failures of this condition, one of Error, Warning, Info +optional
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String severity;

  /**
   * Status of the condition, one of True, False, Unknown.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String status;

  /**
   * ServiceConditionType is used to communicate the status of the reconciliation process. See also:
   * https://github.com/knative/serving/blob/master/docs/spec/errors.md#error-conditions-and-
   * reporting
   *
   * Types include: "Ready", "ConfigurationsReady", and "RoutesReady". "Ready" will be true when the
   * underlying Route and Configuration are ready.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String type;

  /**
   * Last time the condition transitioned from one status to another. +optional
   * @return value or {@code null} for none
   */
  public String getLastTransitionTime() {
    return lastTransitionTime;
  }

  /**
   * Last time the condition transitioned from one status to another. +optional
   * @param lastTransitionTime lastTransitionTime or {@code null} for none
   */
  public ServiceCondition setLastTransitionTime(String lastTransitionTime) {
    this.lastTransitionTime = lastTransitionTime;
    return this;
  }

  /**
   * Human-readable message indicating details about last transition. +optional
   * @return value or {@code null} for none
   */
  public java.lang.String getMessage() {
    return message;
  }

  /**
   * Human-readable message indicating details about last transition. +optional
   * @param message message or {@code null} for none
   */
  public ServiceCondition setMessage(java.lang.String message) {
    this.message = message;
    return this;
  }

  /**
   * One-word CamelCase reason for the condition's last transition. +optional
   * @return value or {@code null} for none
   */
  public java.lang.String getReason() {
    return reason;
  }

  /**
   * One-word CamelCase reason for the condition's last transition. +optional
   * @param reason reason or {@code null} for none
   */
  public ServiceCondition setReason(java.lang.String reason) {
    this.reason = reason;
    return this;
  }

  /**
   * How to interpret failures of this condition, one of Error, Warning, Info +optional
   * @return value or {@code null} for none
   */
  public java.lang.String getSeverity() {
    return severity;
  }

  /**
   * How to interpret failures of this condition, one of Error, Warning, Info +optional
   * @param severity severity or {@code null} for none
   */
  public ServiceCondition setSeverity(java.lang.String severity) {
    this.severity = severity;
    return this;
  }

  /**
   * Status of the condition, one of True, False, Unknown.
   * @return value or {@code null} for none
   */
  public java.lang.String getStatus() {
    return status;
  }

  /**
   * Status of the condition, one of True, False, Unknown.
   * @param status status or {@code null} for none
   */
  public ServiceCondition setStatus(java.lang.String status) {
    this.status = status;
    return this;
  }

  /**
   * ServiceConditionType is used to communicate the status of the reconciliation process. See also:
   * https://github.com/knative/serving/blob/master/docs/spec/errors.md#error-conditions-and-
   * reporting
   *
   * Types include: "Ready", "ConfigurationsReady", and "RoutesReady". "Ready" will be true when the
   * underlying Route and Configuration are ready.
   * @return value or {@code null} for none
   */
  public java.lang.String getType() {
    return type;
  }

  /**
   * ServiceConditionType is used to communicate the status of the reconciliation process. See also:
   * https://github.com/knative/serving/blob/master/docs/spec/errors.md#error-conditions-and-
   * reporting
   *
   * Types include: "Ready", "ConfigurationsReady", and "RoutesReady". "Ready" will be true when the
   * underlying Route and Configuration are ready.
   * @param type type or {@code null} for none
   */
  public ServiceCondition setType(java.lang.String type) {
    this.type = type;
    return this;
  }

  @Override
  public ServiceCondition set(String fieldName, Object value) {
    return (ServiceCondition) super.set(fieldName, value);
  }

  @Override
  public ServiceCondition clone() {
    return (ServiceCondition) super.clone();
  }

}
