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

package com.google.api.services.reports.model;

/**
 * JSON template for a collection of usage reports.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Admin Reports API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class UsageReports extends com.google.api.client.json.GenericJson {

  /**
   * ETag of the resource.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String etag;

  /**
   * The kind of object.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String kind;

  /**
   * Token for retrieving the next page
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String nextPageToken;

  /**
   * Various application parameter records.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<UsageReport> usageReports;

  static {
    // hack to force ProGuard to consider UsageReport used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(UsageReport.class);
  }

  /**
   * Warnings if any.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<Warnings> warnings;

  static {
    // hack to force ProGuard to consider Warnings used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(Warnings.class);
  }

  /**
   * ETag of the resource.
   * @return value or {@code null} for none
   */
  public java.lang.String getEtag() {
    return etag;
  }

  /**
   * ETag of the resource.
   * @param etag etag or {@code null} for none
   */
  public UsageReports setEtag(java.lang.String etag) {
    this.etag = etag;
    return this;
  }

  /**
   * The kind of object.
   * @return value or {@code null} for none
   */
  public java.lang.String getKind() {
    return kind;
  }

  /**
   * The kind of object.
   * @param kind kind or {@code null} for none
   */
  public UsageReports setKind(java.lang.String kind) {
    this.kind = kind;
    return this;
  }

  /**
   * Token for retrieving the next page
   * @return value or {@code null} for none
   */
  public java.lang.String getNextPageToken() {
    return nextPageToken;
  }

  /**
   * Token for retrieving the next page
   * @param nextPageToken nextPageToken or {@code null} for none
   */
  public UsageReports setNextPageToken(java.lang.String nextPageToken) {
    this.nextPageToken = nextPageToken;
    return this;
  }

  /**
   * Various application parameter records.
   * @return value or {@code null} for none
   */
  public java.util.List<UsageReport> getUsageReports() {
    return usageReports;
  }

  /**
   * Various application parameter records.
   * @param usageReports usageReports or {@code null} for none
   */
  public UsageReports setUsageReports(java.util.List<UsageReport> usageReports) {
    this.usageReports = usageReports;
    return this;
  }

  /**
   * Warnings if any.
   * @return value or {@code null} for none
   */
  public java.util.List<Warnings> getWarnings() {
    return warnings;
  }

  /**
   * Warnings if any.
   * @param warnings warnings or {@code null} for none
   */
  public UsageReports setWarnings(java.util.List<Warnings> warnings) {
    this.warnings = warnings;
    return this;
  }

  @Override
  public UsageReports set(String fieldName, Object value) {
    return (UsageReports) super.set(fieldName, value);
  }

  @Override
  public UsageReports clone() {
    return (UsageReports) super.clone();
  }

  /**
   * Model definition for UsageReportsWarnings.
   */
  public static final class Warnings extends com.google.api.client.json.GenericJson {

    /**
     * Machine readable code / warning type.
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.String code;

    /**
     * Key-Value pairs to give detailed information on the warning.
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.util.List<Data> data;

    static {
      // hack to force ProGuard to consider Data used, since otherwise it would be stripped out
      // see https://github.com/google/google-api-java-client/issues/543
      com.google.api.client.util.Data.nullOf(Data.class);
    }

    /**
     * Human readable message for the warning.
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.String message;

    /**
     * Machine readable code / warning type.
     * @return value or {@code null} for none
     */
    public java.lang.String getCode() {
      return code;
    }

    /**
     * Machine readable code / warning type.
     * @param code code or {@code null} for none
     */
    public Warnings setCode(java.lang.String code) {
      this.code = code;
      return this;
    }

    /**
     * Key-Value pairs to give detailed information on the warning.
     * @return value or {@code null} for none
     */
    public java.util.List<Data> getData() {
      return data;
    }

    /**
     * Key-Value pairs to give detailed information on the warning.
     * @param data data or {@code null} for none
     */
    public Warnings setData(java.util.List<Data> data) {
      this.data = data;
      return this;
    }

    /**
     * Human readable message for the warning.
     * @return value or {@code null} for none
     */
    public java.lang.String getMessage() {
      return message;
    }

    /**
     * Human readable message for the warning.
     * @param message message or {@code null} for none
     */
    public Warnings setMessage(java.lang.String message) {
      this.message = message;
      return this;
    }

    @Override
    public Warnings set(String fieldName, Object value) {
      return (Warnings) super.set(fieldName, value);
    }

    @Override
    public Warnings clone() {
      return (Warnings) super.clone();
    }

    /**
     * Model definition for UsageReportsWarningsData.
     */
    public static final class Data extends com.google.api.client.json.GenericJson {

      /**
       * Key associated with a key-value pair to give detailed information on the warning.
       * The value may be {@code null}.
       */
      @com.google.api.client.util.Key
      private java.lang.String key;

      /**
       * Value associated with a key-value pair to give detailed information on the warning.
       * The value may be {@code null}.
       */
      @com.google.api.client.util.Key
      private java.lang.String value;

      /**
       * Key associated with a key-value pair to give detailed information on the warning.
       * @return value or {@code null} for none
       */
      public java.lang.String getKey() {
        return key;
      }

      /**
       * Key associated with a key-value pair to give detailed information on the warning.
       * @param key key or {@code null} for none
       */
      public Data setKey(java.lang.String key) {
        this.key = key;
        return this;
      }

      /**
       * Value associated with a key-value pair to give detailed information on the warning.
       * @return value or {@code null} for none
       */
      public java.lang.String getValue() {
        return value;
      }

      /**
       * Value associated with a key-value pair to give detailed information on the warning.
       * @param value value or {@code null} for none
       */
      public Data setValue(java.lang.String value) {
        this.value = value;
        return this;
      }

      @Override
      public Data set(String fieldName, Object value) {
        return (Data) super.set(fieldName, value);
      }

      @Override
      public Data clone() {
        return (Data) super.clone();
      }

    }
  }

}
