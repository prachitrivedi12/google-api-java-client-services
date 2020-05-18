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
 * Model definition for FileContentBuffer.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Compute Engine API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class FileContentBuffer extends com.google.api.client.json.GenericJson {

  /**
   * The raw content in the secure keys file.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String content;

  /**
   * The file type of source file.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String fileType;

  /**
   * The raw content in the secure keys file.
   * @see #decodeContent()
   * @return value or {@code null} for none
   */
  public java.lang.String getContent() {
    return content;
  }

  /**
   * The raw content in the secure keys file.
   * @see #getContent()
   * @return Base64 decoded value or {@code null} for none
   *
   * @since 1.14
   */
  public byte[] decodeContent() {
    return com.google.api.client.util.Base64.decodeBase64(content);
  }

  /**
   * The raw content in the secure keys file.
   * @see #encodeContent()
   * @param content content or {@code null} for none
   */
  public FileContentBuffer setContent(java.lang.String content) {
    this.content = content;
    return this;
  }

  /**
   * The raw content in the secure keys file.
   * @see #setContent()
   *
   * <p>
   * The value is encoded Base64 or {@code null} for none.
   * </p>
   *
   * @since 1.14
   */
  public FileContentBuffer encodeContent(byte[] content) {
    this.content = com.google.api.client.util.Base64.encodeBase64URLSafeString(content);
    return this;
  }

  /**
   * The file type of source file.
   * @return value or {@code null} for none
   */
  public java.lang.String getFileType() {
    return fileType;
  }

  /**
   * The file type of source file.
   * @param fileType fileType or {@code null} for none
   */
  public FileContentBuffer setFileType(java.lang.String fileType) {
    this.fileType = fileType;
    return this;
  }

  @Override
  public FileContentBuffer set(String fieldName, Object value) {
    return (FileContentBuffer) super.set(fieldName, value);
  }

  @Override
  public FileContentBuffer clone() {
    return (FileContentBuffer) super.clone();
  }

}
