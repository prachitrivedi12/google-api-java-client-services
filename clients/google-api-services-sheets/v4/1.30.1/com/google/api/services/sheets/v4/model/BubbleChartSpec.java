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
 * A bubble chart.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Google Sheets API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class BubbleChartSpec extends com.google.api.client.json.GenericJson {

  /**
   * The bubble border color.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Color bubbleBorderColor;

  /**
   * The bubble border color. If bubble_border_color is also set, this field takes precedence.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private ColorStyle bubbleBorderColorStyle;

  /**
   * The data containing the bubble labels. These do not need to be unique.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private ChartData bubbleLabels;

  /**
   * The max radius size of the bubbles, in pixels. If specified, the field must be a positive
   * value.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer bubbleMaxRadiusSize;

  /**
   * The minimum radius size of the bubbles, in pixels. If specific, the field must be a positive
   * value.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer bubbleMinRadiusSize;

  /**
   * The opacity of the bubbles between 0 and 1.0. 0 is fully transparent and 1 is fully opaque.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Float bubbleOpacity;

  /**
   * The data contianing the bubble sizes. Bubble sizes are used to draw the bubbles at different
   * sizes relative to each other. If specified, group_ids must also be specified. This field is
   * optional.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private ChartData bubbleSizes;

  /**
   * The format of the text inside the bubbles. Strikethrough and underline are not supported.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private TextFormat bubbleTextStyle;

  /**
   * The data containing the bubble x-values. These values locate the bubbles in the chart
   * horizontally.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private ChartData domain;

  /**
   * The data containing the bubble group IDs. All bubbles with the same group ID are drawn in the
   * same color. If bubble_sizes is specified then this field must also be specified but may contain
   * blank values. This field is optional.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private ChartData groupIds;

  /**
   * Where the legend of the chart should be drawn.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String legendPosition;

  /**
   * The data contianing the bubble y-values. These values locate the bubbles in the chart
   * vertically.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private ChartData series;

  /**
   * The bubble border color.
   * @return value or {@code null} for none
   */
  public Color getBubbleBorderColor() {
    return bubbleBorderColor;
  }

  /**
   * The bubble border color.
   * @param bubbleBorderColor bubbleBorderColor or {@code null} for none
   */
  public BubbleChartSpec setBubbleBorderColor(Color bubbleBorderColor) {
    this.bubbleBorderColor = bubbleBorderColor;
    return this;
  }

  /**
   * The bubble border color. If bubble_border_color is also set, this field takes precedence.
   * @return value or {@code null} for none
   */
  public ColorStyle getBubbleBorderColorStyle() {
    return bubbleBorderColorStyle;
  }

  /**
   * The bubble border color. If bubble_border_color is also set, this field takes precedence.
   * @param bubbleBorderColorStyle bubbleBorderColorStyle or {@code null} for none
   */
  public BubbleChartSpec setBubbleBorderColorStyle(ColorStyle bubbleBorderColorStyle) {
    this.bubbleBorderColorStyle = bubbleBorderColorStyle;
    return this;
  }

  /**
   * The data containing the bubble labels. These do not need to be unique.
   * @return value or {@code null} for none
   */
  public ChartData getBubbleLabels() {
    return bubbleLabels;
  }

  /**
   * The data containing the bubble labels. These do not need to be unique.
   * @param bubbleLabels bubbleLabels or {@code null} for none
   */
  public BubbleChartSpec setBubbleLabels(ChartData bubbleLabels) {
    this.bubbleLabels = bubbleLabels;
    return this;
  }

  /**
   * The max radius size of the bubbles, in pixels. If specified, the field must be a positive
   * value.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getBubbleMaxRadiusSize() {
    return bubbleMaxRadiusSize;
  }

  /**
   * The max radius size of the bubbles, in pixels. If specified, the field must be a positive
   * value.
   * @param bubbleMaxRadiusSize bubbleMaxRadiusSize or {@code null} for none
   */
  public BubbleChartSpec setBubbleMaxRadiusSize(java.lang.Integer bubbleMaxRadiusSize) {
    this.bubbleMaxRadiusSize = bubbleMaxRadiusSize;
    return this;
  }

  /**
   * The minimum radius size of the bubbles, in pixels. If specific, the field must be a positive
   * value.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getBubbleMinRadiusSize() {
    return bubbleMinRadiusSize;
  }

  /**
   * The minimum radius size of the bubbles, in pixels. If specific, the field must be a positive
   * value.
   * @param bubbleMinRadiusSize bubbleMinRadiusSize or {@code null} for none
   */
  public BubbleChartSpec setBubbleMinRadiusSize(java.lang.Integer bubbleMinRadiusSize) {
    this.bubbleMinRadiusSize = bubbleMinRadiusSize;
    return this;
  }

  /**
   * The opacity of the bubbles between 0 and 1.0. 0 is fully transparent and 1 is fully opaque.
   * @return value or {@code null} for none
   */
  public java.lang.Float getBubbleOpacity() {
    return bubbleOpacity;
  }

  /**
   * The opacity of the bubbles between 0 and 1.0. 0 is fully transparent and 1 is fully opaque.
   * @param bubbleOpacity bubbleOpacity or {@code null} for none
   */
  public BubbleChartSpec setBubbleOpacity(java.lang.Float bubbleOpacity) {
    this.bubbleOpacity = bubbleOpacity;
    return this;
  }

  /**
   * The data contianing the bubble sizes. Bubble sizes are used to draw the bubbles at different
   * sizes relative to each other. If specified, group_ids must also be specified. This field is
   * optional.
   * @return value or {@code null} for none
   */
  public ChartData getBubbleSizes() {
    return bubbleSizes;
  }

  /**
   * The data contianing the bubble sizes. Bubble sizes are used to draw the bubbles at different
   * sizes relative to each other. If specified, group_ids must also be specified. This field is
   * optional.
   * @param bubbleSizes bubbleSizes or {@code null} for none
   */
  public BubbleChartSpec setBubbleSizes(ChartData bubbleSizes) {
    this.bubbleSizes = bubbleSizes;
    return this;
  }

  /**
   * The format of the text inside the bubbles. Strikethrough and underline are not supported.
   * @return value or {@code null} for none
   */
  public TextFormat getBubbleTextStyle() {
    return bubbleTextStyle;
  }

  /**
   * The format of the text inside the bubbles. Strikethrough and underline are not supported.
   * @param bubbleTextStyle bubbleTextStyle or {@code null} for none
   */
  public BubbleChartSpec setBubbleTextStyle(TextFormat bubbleTextStyle) {
    this.bubbleTextStyle = bubbleTextStyle;
    return this;
  }

  /**
   * The data containing the bubble x-values. These values locate the bubbles in the chart
   * horizontally.
   * @return value or {@code null} for none
   */
  public ChartData getDomain() {
    return domain;
  }

  /**
   * The data containing the bubble x-values. These values locate the bubbles in the chart
   * horizontally.
   * @param domain domain or {@code null} for none
   */
  public BubbleChartSpec setDomain(ChartData domain) {
    this.domain = domain;
    return this;
  }

  /**
   * The data containing the bubble group IDs. All bubbles with the same group ID are drawn in the
   * same color. If bubble_sizes is specified then this field must also be specified but may contain
   * blank values. This field is optional.
   * @return value or {@code null} for none
   */
  public ChartData getGroupIds() {
    return groupIds;
  }

  /**
   * The data containing the bubble group IDs. All bubbles with the same group ID are drawn in the
   * same color. If bubble_sizes is specified then this field must also be specified but may contain
   * blank values. This field is optional.
   * @param groupIds groupIds or {@code null} for none
   */
  public BubbleChartSpec setGroupIds(ChartData groupIds) {
    this.groupIds = groupIds;
    return this;
  }

  /**
   * Where the legend of the chart should be drawn.
   * @return value or {@code null} for none
   */
  public java.lang.String getLegendPosition() {
    return legendPosition;
  }

  /**
   * Where the legend of the chart should be drawn.
   * @param legendPosition legendPosition or {@code null} for none
   */
  public BubbleChartSpec setLegendPosition(java.lang.String legendPosition) {
    this.legendPosition = legendPosition;
    return this;
  }

  /**
   * The data contianing the bubble y-values. These values locate the bubbles in the chart
   * vertically.
   * @return value or {@code null} for none
   */
  public ChartData getSeries() {
    return series;
  }

  /**
   * The data contianing the bubble y-values. These values locate the bubbles in the chart
   * vertically.
   * @param series series or {@code null} for none
   */
  public BubbleChartSpec setSeries(ChartData series) {
    this.series = series;
    return this;
  }

  @Override
  public BubbleChartSpec set(String fieldName, Object value) {
    return (BubbleChartSpec) super.set(fieldName, value);
  }

  @Override
  public BubbleChartSpec clone() {
    return (BubbleChartSpec) super.clone();
  }

}
