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

package com.google.api.services.sheets.v4.model;

/**
 * A color value.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Google Sheets API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ColorStyle extends com.google.api.client.json.GenericJson {

  /**
   * RGB color.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Color rgbColor;

  /**
   * Theme color.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String themeColor;

  /**
   * RGB color.
   * @return value or {@code null} for none
   */
  public Color getRgbColor() {
    return rgbColor;
  }

  /**
   * RGB color.
   * @param rgbColor rgbColor or {@code null} for none
   */
  public ColorStyle setRgbColor(Color rgbColor) {
    this.rgbColor = rgbColor;
    return this;
  }

  /**
   * Theme color.
   * @return value or {@code null} for none
   */
  public java.lang.String getThemeColor() {
    return themeColor;
  }

  /**
   * Theme color.
   * @param themeColor themeColor or {@code null} for none
   */
  public ColorStyle setThemeColor(java.lang.String themeColor) {
    this.themeColor = themeColor;
    return this;
  }

  @Override
  public ColorStyle set(String fieldName, Object value) {
    return (ColorStyle) super.set(fieldName, value);
  }

  @Override
  public ColorStyle clone() {
    return (ColorStyle) super.clone();
  }

}