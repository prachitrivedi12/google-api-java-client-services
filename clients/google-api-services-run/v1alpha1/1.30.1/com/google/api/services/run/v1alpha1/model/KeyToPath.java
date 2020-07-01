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
 * Maps a string key to a path within a volume.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Run Admin API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class KeyToPath extends com.google.api.client.json.GenericJson {

  /**
   * The key to project.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String key;

  /**
   * Mode bits to use on this file, must be a value between 0 and 0777. If not specified, the volume
   * defaultMode will be used. This might be in conflict with other options that affect the file
   * mode, like fsGroup, and the result can be other mode bits set. +optional
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer mode;

  /**
   * The relative path of the file to map the key to. May not be an absolute path. May not contain
   * the path element '..'. May not start with the string '..'.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String path;

  /**
   * The key to project.
   * @return value or {@code null} for none
   */
  public java.lang.String getKey() {
    return key;
  }

  /**
   * The key to project.
   * @param key key or {@code null} for none
   */
  public KeyToPath setKey(java.lang.String key) {
    this.key = key;
    return this;
  }

  /**
   * Mode bits to use on this file, must be a value between 0 and 0777. If not specified, the volume
   * defaultMode will be used. This might be in conflict with other options that affect the file
   * mode, like fsGroup, and the result can be other mode bits set. +optional
   * @return value or {@code null} for none
   */
  public java.lang.Integer getMode() {
    return mode;
  }

  /**
   * Mode bits to use on this file, must be a value between 0 and 0777. If not specified, the volume
   * defaultMode will be used. This might be in conflict with other options that affect the file
   * mode, like fsGroup, and the result can be other mode bits set. +optional
   * @param mode mode or {@code null} for none
   */
  public KeyToPath setMode(java.lang.Integer mode) {
    this.mode = mode;
    return this;
  }

  /**
   * The relative path of the file to map the key to. May not be an absolute path. May not contain
   * the path element '..'. May not start with the string '..'.
   * @return value or {@code null} for none
   */
  public java.lang.String getPath() {
    return path;
  }

  /**
   * The relative path of the file to map the key to. May not be an absolute path. May not contain
   * the path element '..'. May not start with the string '..'.
   * @param path path or {@code null} for none
   */
  public KeyToPath setPath(java.lang.String path) {
    this.path = path;
    return this;
  }

  @Override
  public KeyToPath set(String fieldName, Object value) {
    return (KeyToPath) super.set(fieldName, value);
  }

  @Override
  public KeyToPath clone() {
    return (KeyToPath) super.clone();
  }

}
