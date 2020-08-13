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

package com.google.api.services.servicemanagement.model;

/**
 * Logging configuration of the service. The following example shows how to configure logs to be
 * sent to the producer and consumer projects. In the example, the `activity_history` log is sent to
 * both the producer and consumer projects, whereas the `purchase_history` log is only sent to the
 * producer project. monitored_resources: - type: library.googleapis.com/branch labels: - key: /city
 * description: The city where the library branch is located in. - key: /name description: The name
 * of the branch. logs: - name: activity_history labels: - key: /customer_id - name:
 * purchase_history logging: producer_destinations: - monitored_resource:
 * library.googleapis.com/branch logs: - activity_history - purchase_history consumer_destinations:
 * - monitored_resource: library.googleapis.com/branch logs: - activity_history
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Service Management API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Logging extends com.google.api.client.json.GenericJson {

  /**
   * Logging configurations for sending logs to the consumer project. There can be multiple consumer
   * destinations, each one must have a different monitored resource type. A log can be used in at
   * most one consumer destination.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<LoggingDestination> consumerDestinations;

  /**
   * Logging configurations for sending logs to the producer project. There can be multiple producer
   * destinations, each one must have a different monitored resource type. A log can be used in at
   * most one producer destination.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<LoggingDestination> producerDestinations;

  /**
   * Logging configurations for sending logs to the consumer project. There can be multiple consumer
   * destinations, each one must have a different monitored resource type. A log can be used in at
   * most one consumer destination.
   * @return value or {@code null} for none
   */
  public java.util.List<LoggingDestination> getConsumerDestinations() {
    return consumerDestinations;
  }

  /**
   * Logging configurations for sending logs to the consumer project. There can be multiple consumer
   * destinations, each one must have a different monitored resource type. A log can be used in at
   * most one consumer destination.
   * @param consumerDestinations consumerDestinations or {@code null} for none
   */
  public Logging setConsumerDestinations(java.util.List<LoggingDestination> consumerDestinations) {
    this.consumerDestinations = consumerDestinations;
    return this;
  }

  /**
   * Logging configurations for sending logs to the producer project. There can be multiple producer
   * destinations, each one must have a different monitored resource type. A log can be used in at
   * most one producer destination.
   * @return value or {@code null} for none
   */
  public java.util.List<LoggingDestination> getProducerDestinations() {
    return producerDestinations;
  }

  /**
   * Logging configurations for sending logs to the producer project. There can be multiple producer
   * destinations, each one must have a different monitored resource type. A log can be used in at
   * most one producer destination.
   * @param producerDestinations producerDestinations or {@code null} for none
   */
  public Logging setProducerDestinations(java.util.List<LoggingDestination> producerDestinations) {
    this.producerDestinations = producerDestinations;
    return this;
  }

  @Override
  public Logging set(String fieldName, Object value) {
    return (Logging) super.set(fieldName, value);
  }

  @Override
  public Logging clone() {
    return (Logging) super.clone();
  }

}
