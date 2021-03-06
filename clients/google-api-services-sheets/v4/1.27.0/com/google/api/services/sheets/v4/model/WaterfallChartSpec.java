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
 * A waterfall chart.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Google Sheets API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class WaterfallChartSpec extends com.google.api.client.json.GenericJson {

  /**
   * The line style for the connector lines.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private LineStyle connectorLineStyle;

  /**
   * The domain data (horizontal axis) for the waterfall chart.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private WaterfallChartDomain domain;

  /**
   * True to interpret the first value as a total.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean firstValueIsTotal;

  /**
   * True to hide connector lines between columns.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean hideConnectorLines;

  /**
   * The data this waterfall chart is visualizing.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<WaterfallChartSeries> series;

  static {
    // hack to force ProGuard to consider WaterfallChartSeries used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(WaterfallChartSeries.class);
  }

  /**
   * The stacked type.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String stackedType;

  /**
   * The line style for the connector lines.
   * @return value or {@code null} for none
   */
  public LineStyle getConnectorLineStyle() {
    return connectorLineStyle;
  }

  /**
   * The line style for the connector lines.
   * @param connectorLineStyle connectorLineStyle or {@code null} for none
   */
  public WaterfallChartSpec setConnectorLineStyle(LineStyle connectorLineStyle) {
    this.connectorLineStyle = connectorLineStyle;
    return this;
  }

  /**
   * The domain data (horizontal axis) for the waterfall chart.
   * @return value or {@code null} for none
   */
  public WaterfallChartDomain getDomain() {
    return domain;
  }

  /**
   * The domain data (horizontal axis) for the waterfall chart.
   * @param domain domain or {@code null} for none
   */
  public WaterfallChartSpec setDomain(WaterfallChartDomain domain) {
    this.domain = domain;
    return this;
  }

  /**
   * True to interpret the first value as a total.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getFirstValueIsTotal() {
    return firstValueIsTotal;
  }

  /**
   * True to interpret the first value as a total.
   * @param firstValueIsTotal firstValueIsTotal or {@code null} for none
   */
  public WaterfallChartSpec setFirstValueIsTotal(java.lang.Boolean firstValueIsTotal) {
    this.firstValueIsTotal = firstValueIsTotal;
    return this;
  }

  /**
   * True to hide connector lines between columns.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getHideConnectorLines() {
    return hideConnectorLines;
  }

  /**
   * True to hide connector lines between columns.
   * @param hideConnectorLines hideConnectorLines or {@code null} for none
   */
  public WaterfallChartSpec setHideConnectorLines(java.lang.Boolean hideConnectorLines) {
    this.hideConnectorLines = hideConnectorLines;
    return this;
  }

  /**
   * The data this waterfall chart is visualizing.
   * @return value or {@code null} for none
   */
  public java.util.List<WaterfallChartSeries> getSeries() {
    return series;
  }

  /**
   * The data this waterfall chart is visualizing.
   * @param series series or {@code null} for none
   */
  public WaterfallChartSpec setSeries(java.util.List<WaterfallChartSeries> series) {
    this.series = series;
    return this;
  }

  /**
   * The stacked type.
   * @return value or {@code null} for none
   */
  public java.lang.String getStackedType() {
    return stackedType;
  }

  /**
   * The stacked type.
   * @param stackedType stackedType or {@code null} for none
   */
  public WaterfallChartSpec setStackedType(java.lang.String stackedType) {
    this.stackedType = stackedType;
    return this;
  }

  @Override
  public WaterfallChartSpec set(String fieldName, Object value) {
    return (WaterfallChartSpec) super.set(fieldName, value);
  }

  @Override
  public WaterfallChartSpec clone() {
    return (WaterfallChartSpec) super.clone();
  }

}
