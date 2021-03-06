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

package com.google.api.services.youtubeAnalytics.model;

/**
 * Model definition for GroupItem.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the YouTube Analytics API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GroupItem extends com.google.api.client.json.GenericJson {

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String etag;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String groupId;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String id;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String kind;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Resource resource;

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getEtag() {
    return etag;
  }

  /**
   * @param etag etag or {@code null} for none
   */
  public GroupItem setEtag(java.lang.String etag) {
    this.etag = etag;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getGroupId() {
    return groupId;
  }

  /**
   * @param groupId groupId or {@code null} for none
   */
  public GroupItem setGroupId(java.lang.String groupId) {
    this.groupId = groupId;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getId() {
    return id;
  }

  /**
   * @param id id or {@code null} for none
   */
  public GroupItem setId(java.lang.String id) {
    this.id = id;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getKind() {
    return kind;
  }

  /**
   * @param kind kind or {@code null} for none
   */
  public GroupItem setKind(java.lang.String kind) {
    this.kind = kind;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public Resource getResource() {
    return resource;
  }

  /**
   * @param resource resource or {@code null} for none
   */
  public GroupItem setResource(Resource resource) {
    this.resource = resource;
    return this;
  }

  @Override
  public GroupItem set(String fieldName, Object value) {
    return (GroupItem) super.set(fieldName, value);
  }

  @Override
  public GroupItem clone() {
    return (GroupItem) super.clone();
  }

  /**
   * Model definition for GroupItemResource.
   */
  public static final class Resource extends com.google.api.client.json.GenericJson {

    /**
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.String id;

    /**
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.String kind;

    /**
     * @return value or {@code null} for none
     */
    public java.lang.String getId() {
      return id;
    }

    /**
     * @param id id or {@code null} for none
     */
    public Resource setId(java.lang.String id) {
      this.id = id;
      return this;
    }

    /**
     * @return value or {@code null} for none
     */
    public java.lang.String getKind() {
      return kind;
    }

    /**
     * @param kind kind or {@code null} for none
     */
    public Resource setKind(java.lang.String kind) {
      this.kind = kind;
      return this;
    }

    @Override
    public Resource set(String fieldName, Object value) {
      return (Resource) super.set(fieldName, value);
    }

    @Override
    public Resource clone() {
      return (Resource) super.clone();
    }

  }
}
