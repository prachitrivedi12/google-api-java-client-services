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
 * Data about a specific cell.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Google Sheets API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class CellData extends com.google.api.client.json.GenericJson {

  /**
   * Output only. Information about a data source formula on the cell. The field is set if
   * user_entered_value is a formula referencing some DATA_SOURCE sheet, e.g
   * `=SUM(DataSheet!Column)`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private DataSourceFormula dataSourceFormula;

  /**
   * A data source table anchored at this cell. The size of data source table itself is computed
   * dynamically based on its configuration. Only the first cell of the data source table contains
   * the data source table definition. The other cells will contain the display values of the data
   * source table result in their effective_value fields.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private DataSourceTable dataSourceTable;

  /**
   * A data validation rule on the cell, if any. When writing, the new data validation rule will
   * overwrite any prior rule.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private DataValidationRule dataValidation;

  /**
   * The effective format being used by the cell. This includes the results of applying any
   * conditional formatting and, if the cell contains a formula, the computed number format. If the
   * effective format is the default format, effective format will not be written. This field is
   * read-only.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private CellFormat effectiveFormat;

  /**
   * The effective value of the cell. For cells with formulas, this is the calculated value. For
   * cells with literals, this is the same as the user_entered_value. This field is read-only.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private ExtendedValue effectiveValue;

  /**
   * The formatted value of the cell. This is the value as it's shown to the user. This field is
   * read-only.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String formattedValue;

  /**
   * A hyperlink this cell points to, if any. If the cell contains multiple hyperlinks, this field
   * will be empty. This field is read-only. To set it, use a `=HYPERLINK` formula in the
   * userEnteredValue.formulaValue field.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String hyperlink;

  /**
   * Any note on the cell.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String note;

  /**
   * A pivot table anchored at this cell. The size of pivot table itself is computed dynamically
   * based on its data, grouping, filters, values, etc. Only the top-left cell of the pivot table
   * contains the pivot table definition. The other cells will contain the calculated values of the
   * results of the pivot in their effective_value fields.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private PivotTable pivotTable;

  /**
   * Runs of rich text applied to subsections of the cell. Runs are only valid on user entered
   * strings, not formulas, bools, or numbers. Properties of a run start at a specific index in the
   * text and continue until the next run. Runs will inherit the properties of the cell unless
   * explicitly changed. When writing, the new runs will overwrite any prior runs. When writing a
   * new user_entered_value, previous runs are erased.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<TextFormatRun> textFormatRuns;

  /**
   * The format the user entered for the cell. When writing, the new format will be merged with the
   * existing format.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private CellFormat userEnteredFormat;

  /**
   * The value the user entered in the cell. e.g, `1234`, `'Hello'`, or `=NOW()` Note: Dates, Times
   * and DateTimes are represented as doubles in serial number format.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private ExtendedValue userEnteredValue;

  /**
   * Output only. Information about a data source formula on the cell. The field is set if
   * user_entered_value is a formula referencing some DATA_SOURCE sheet, e.g
   * `=SUM(DataSheet!Column)`.
   * @return value or {@code null} for none
   */
  public DataSourceFormula getDataSourceFormula() {
    return dataSourceFormula;
  }

  /**
   * Output only. Information about a data source formula on the cell. The field is set if
   * user_entered_value is a formula referencing some DATA_SOURCE sheet, e.g
   * `=SUM(DataSheet!Column)`.
   * @param dataSourceFormula dataSourceFormula or {@code null} for none
   */
  public CellData setDataSourceFormula(DataSourceFormula dataSourceFormula) {
    this.dataSourceFormula = dataSourceFormula;
    return this;
  }

  /**
   * A data source table anchored at this cell. The size of data source table itself is computed
   * dynamically based on its configuration. Only the first cell of the data source table contains
   * the data source table definition. The other cells will contain the display values of the data
   * source table result in their effective_value fields.
   * @return value or {@code null} for none
   */
  public DataSourceTable getDataSourceTable() {
    return dataSourceTable;
  }

  /**
   * A data source table anchored at this cell. The size of data source table itself is computed
   * dynamically based on its configuration. Only the first cell of the data source table contains
   * the data source table definition. The other cells will contain the display values of the data
   * source table result in their effective_value fields.
   * @param dataSourceTable dataSourceTable or {@code null} for none
   */
  public CellData setDataSourceTable(DataSourceTable dataSourceTable) {
    this.dataSourceTable = dataSourceTable;
    return this;
  }

  /**
   * A data validation rule on the cell, if any. When writing, the new data validation rule will
   * overwrite any prior rule.
   * @return value or {@code null} for none
   */
  public DataValidationRule getDataValidation() {
    return dataValidation;
  }

  /**
   * A data validation rule on the cell, if any. When writing, the new data validation rule will
   * overwrite any prior rule.
   * @param dataValidation dataValidation or {@code null} for none
   */
  public CellData setDataValidation(DataValidationRule dataValidation) {
    this.dataValidation = dataValidation;
    return this;
  }

  /**
   * The effective format being used by the cell. This includes the results of applying any
   * conditional formatting and, if the cell contains a formula, the computed number format. If the
   * effective format is the default format, effective format will not be written. This field is
   * read-only.
   * @return value or {@code null} for none
   */
  public CellFormat getEffectiveFormat() {
    return effectiveFormat;
  }

  /**
   * The effective format being used by the cell. This includes the results of applying any
   * conditional formatting and, if the cell contains a formula, the computed number format. If the
   * effective format is the default format, effective format will not be written. This field is
   * read-only.
   * @param effectiveFormat effectiveFormat or {@code null} for none
   */
  public CellData setEffectiveFormat(CellFormat effectiveFormat) {
    this.effectiveFormat = effectiveFormat;
    return this;
  }

  /**
   * The effective value of the cell. For cells with formulas, this is the calculated value. For
   * cells with literals, this is the same as the user_entered_value. This field is read-only.
   * @return value or {@code null} for none
   */
  public ExtendedValue getEffectiveValue() {
    return effectiveValue;
  }

  /**
   * The effective value of the cell. For cells with formulas, this is the calculated value. For
   * cells with literals, this is the same as the user_entered_value. This field is read-only.
   * @param effectiveValue effectiveValue or {@code null} for none
   */
  public CellData setEffectiveValue(ExtendedValue effectiveValue) {
    this.effectiveValue = effectiveValue;
    return this;
  }

  /**
   * The formatted value of the cell. This is the value as it's shown to the user. This field is
   * read-only.
   * @return value or {@code null} for none
   */
  public java.lang.String getFormattedValue() {
    return formattedValue;
  }

  /**
   * The formatted value of the cell. This is the value as it's shown to the user. This field is
   * read-only.
   * @param formattedValue formattedValue or {@code null} for none
   */
  public CellData setFormattedValue(java.lang.String formattedValue) {
    this.formattedValue = formattedValue;
    return this;
  }

  /**
   * A hyperlink this cell points to, if any. If the cell contains multiple hyperlinks, this field
   * will be empty. This field is read-only. To set it, use a `=HYPERLINK` formula in the
   * userEnteredValue.formulaValue field.
   * @return value or {@code null} for none
   */
  public java.lang.String getHyperlink() {
    return hyperlink;
  }

  /**
   * A hyperlink this cell points to, if any. If the cell contains multiple hyperlinks, this field
   * will be empty. This field is read-only. To set it, use a `=HYPERLINK` formula in the
   * userEnteredValue.formulaValue field.
   * @param hyperlink hyperlink or {@code null} for none
   */
  public CellData setHyperlink(java.lang.String hyperlink) {
    this.hyperlink = hyperlink;
    return this;
  }

  /**
   * Any note on the cell.
   * @return value or {@code null} for none
   */
  public java.lang.String getNote() {
    return note;
  }

  /**
   * Any note on the cell.
   * @param note note or {@code null} for none
   */
  public CellData setNote(java.lang.String note) {
    this.note = note;
    return this;
  }

  /**
   * A pivot table anchored at this cell. The size of pivot table itself is computed dynamically
   * based on its data, grouping, filters, values, etc. Only the top-left cell of the pivot table
   * contains the pivot table definition. The other cells will contain the calculated values of the
   * results of the pivot in their effective_value fields.
   * @return value or {@code null} for none
   */
  public PivotTable getPivotTable() {
    return pivotTable;
  }

  /**
   * A pivot table anchored at this cell. The size of pivot table itself is computed dynamically
   * based on its data, grouping, filters, values, etc. Only the top-left cell of the pivot table
   * contains the pivot table definition. The other cells will contain the calculated values of the
   * results of the pivot in their effective_value fields.
   * @param pivotTable pivotTable or {@code null} for none
   */
  public CellData setPivotTable(PivotTable pivotTable) {
    this.pivotTable = pivotTable;
    return this;
  }

  /**
   * Runs of rich text applied to subsections of the cell. Runs are only valid on user entered
   * strings, not formulas, bools, or numbers. Properties of a run start at a specific index in the
   * text and continue until the next run. Runs will inherit the properties of the cell unless
   * explicitly changed. When writing, the new runs will overwrite any prior runs. When writing a
   * new user_entered_value, previous runs are erased.
   * @return value or {@code null} for none
   */
  public java.util.List<TextFormatRun> getTextFormatRuns() {
    return textFormatRuns;
  }

  /**
   * Runs of rich text applied to subsections of the cell. Runs are only valid on user entered
   * strings, not formulas, bools, or numbers. Properties of a run start at a specific index in the
   * text and continue until the next run. Runs will inherit the properties of the cell unless
   * explicitly changed. When writing, the new runs will overwrite any prior runs. When writing a
   * new user_entered_value, previous runs are erased.
   * @param textFormatRuns textFormatRuns or {@code null} for none
   */
  public CellData setTextFormatRuns(java.util.List<TextFormatRun> textFormatRuns) {
    this.textFormatRuns = textFormatRuns;
    return this;
  }

  /**
   * The format the user entered for the cell. When writing, the new format will be merged with the
   * existing format.
   * @return value or {@code null} for none
   */
  public CellFormat getUserEnteredFormat() {
    return userEnteredFormat;
  }

  /**
   * The format the user entered for the cell. When writing, the new format will be merged with the
   * existing format.
   * @param userEnteredFormat userEnteredFormat or {@code null} for none
   */
  public CellData setUserEnteredFormat(CellFormat userEnteredFormat) {
    this.userEnteredFormat = userEnteredFormat;
    return this;
  }

  /**
   * The value the user entered in the cell. e.g, `1234`, `'Hello'`, or `=NOW()` Note: Dates, Times
   * and DateTimes are represented as doubles in serial number format.
   * @return value or {@code null} for none
   */
  public ExtendedValue getUserEnteredValue() {
    return userEnteredValue;
  }

  /**
   * The value the user entered in the cell. e.g, `1234`, `'Hello'`, or `=NOW()` Note: Dates, Times
   * and DateTimes are represented as doubles in serial number format.
   * @param userEnteredValue userEnteredValue or {@code null} for none
   */
  public CellData setUserEnteredValue(ExtendedValue userEnteredValue) {
    this.userEnteredValue = userEnteredValue;
    return this;
  }

  @Override
  public CellData set(String fieldName, Object value) {
    return (CellData) super.set(fieldName, value);
  }

  @Override
  public CellData clone() {
    return (CellData) super.clone();
  }

}
