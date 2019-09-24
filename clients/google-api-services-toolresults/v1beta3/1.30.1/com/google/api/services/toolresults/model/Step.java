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

package com.google.api.services.toolresults.model;

/**
 * A Step represents a single operation performed as part of Execution. A step can be used to
 * represent the execution of a tool ( for example a test runner execution or an execution of a
 * compiler).
 *
 * Steps can overlap (for instance two steps might have the same start time if some operations are
 * done in parallel).
 *
 * Here is an example, let's consider that we have a continuous build is executing a test runner for
 * each iteration. The workflow would look like: - user creates a Execution with id 1 - user creates
 * an TestExecutionStep with id 100 for Execution 1 - user update TestExecutionStep with id 100 to
 * add a raw xml log + the service parses the xml logs and returns a TestExecutionStep with updated
 * TestResult(s). - user update the status of TestExecutionStep with id 100 to COMPLETE
 *
 * A Step can be updated until its state is set to COMPLETE at which points it becomes immutable.
 *
 * Next tag: 25
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Tool Results API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Step extends com.google.api.client.json.GenericJson {

  /**
   * The time when the step status was set to complete.
   *
   * This value will be set automatically when state transitions to COMPLETE.
   *
   * - In response: set if the execution state is COMPLETE. - In create/update request: never set
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Timestamp completionTime;

  /**
   * The time when the step was created.
   *
   * - In response: always set - In create/update request: never set
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Timestamp creationTime;

  /**
   * A description of this tool For example: mvn clean package -D skipTests=true
   *
   * - In response: present if set by create/update request - In create/update request: optional
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String description;

  /**
   * How much the device resource is used to perform the test.
   *
   * This is the device usage used for billing purpose, which is different from the run_duration,
   * for example, infrastructure failure won't be charged for device usage.
   *
   * PRECONDITION_FAILED will be returned if one attempts to set a device_usage on a step which
   * already has this field set.
   *
   * - In response: present if previously set. - In create request: optional - In update request:
   * optional
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Duration deviceUsageDuration;

  /**
   * If the execution containing this step has any dimension_definition set, then this field allows
   * the child to specify the values of the dimensions.
   *
   * The keys must exactly match the dimension_definition of the execution.
   *
   * For example, if the execution has `dimension_definition = ['attempt', 'device']` then a step
   * must define values for those dimensions, eg. `dimension_value = ['attempt': '1', 'device':
   * 'Nexus 6']`
   *
   * If a step does not participate in one dimension of the matrix, the value for that dimension
   * should be empty string. For example, if one of the tests is executed by a runner which does not
   * support retries, the step could have `dimension_value = ['attempt': '', 'device': 'Nexus 6']`
   *
   * If the step does not participate in any dimensions of the matrix, it may leave dimension_value
   * unset.
   *
   * A PRECONDITION_FAILED will be returned if any of the keys do not exist in the
   * dimension_definition of the execution.
   *
   * A PRECONDITION_FAILED will be returned if another step in this execution already has the same
   * name and dimension_value, but differs on other data fields, for example, step field is
   * different.
   *
   * A PRECONDITION_FAILED will be returned if dimension_value is set, and there is a
   * dimension_definition in the execution which is not specified as one of the keys.
   *
   * - In response: present if set by create - In create request: optional - In update request:
   * never set
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<StepDimensionValueEntry> dimensionValue;

  /**
   * Whether any of the outputs of this step are images whose thumbnails can be fetched with
   * ListThumbnails.
   *
   * - In response: always set - In create/update request: never set
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean hasImages;

  /**
   * Arbitrary user-supplied key/value pairs that are associated with the step.
   *
   * Users are responsible for managing the key namespace such that keys don't accidentally collide.
   *
   * An INVALID_ARGUMENT will be returned if the number of labels exceeds 100 or if the length of
   * any of the keys or values exceeds 100 characters.
   *
   * - In response: always set - In create request: optional - In update request: optional; any new
   * key/value pair will be added to the map, and any new value for an existing key will update that
   * key's value
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<StepLabelsEntry> labels;

  /**
   * Details when multiple steps are run with the same configuration as a group. These details can
   * be used identify which group this step is part of. It also identifies the groups 'primary step'
   * which indexes all the group members.
   *
   * - In response: present if previously set. - In create request: optional, set iff this step was
   * performed more than once. - In update request: optional
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private MultiStep multiStep;

  /**
   * A short human-readable name to display in the UI. Maximum of 100 characters. For example: Clean
   * build
   *
   * A PRECONDITION_FAILED will be returned upon creating a new step if it shares its name and
   * dimension_value with an existing step. If two steps represent a similar action, but have
   * different dimension values, they should share the same name. For instance, if the same set of
   * tests is run on two different platforms, the two steps should have the same name.
   *
   * - In response: always set - In create request: always set - In update request: never set
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * Classification of the result, for example into SUCCESS or FAILURE
   *
   * - In response: present if set by create/update request - In create/update request: optional
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Outcome outcome;

  /**
   * How long it took for this step to run.
   *
   * If unset, this is set to the difference between creation_time and completion_time when the step
   * is set to the COMPLETE state. In some cases, it is appropriate to set this value separately:
   * For instance, if a step is created, but the operation it represents is queued for a few minutes
   * before it executes, it would be appropriate not to include the time spent queued in its
   * run_duration.
   *
   * PRECONDITION_FAILED will be returned if one attempts to set a run_duration on a step which
   * already has this field set.
   *
   * - In response: present if previously set; always present on COMPLETE step - In create request:
   * optional - In update request: optional
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Duration runDuration;

  /**
   * The initial state is IN_PROGRESS. The only legal state transitions are * IN_PROGRESS ->
   * COMPLETE
   *
   * A PRECONDITION_FAILED will be returned if an invalid transition is requested.
   *
   * It is valid to create Step with a state set to COMPLETE. The state can only be set to COMPLETE
   * once. A PRECONDITION_FAILED will be returned if the state is set to COMPLETE multiple times.
   *
   * - In response: always set - In create/update request: optional
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String state;

  /**
   * A unique identifier within a Execution for this Step.
   *
   * Returns INVALID_ARGUMENT if this field is set or overwritten by the caller.
   *
   * - In response: always set - In create/update request: never set
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String stepId;

  /**
   * An execution of a test runner.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private TestExecutionStep testExecutionStep;

  /**
   * An execution of a tool (used for steps we don't explicitly support).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private ToolExecutionStep toolExecutionStep;

  /**
   * The time when the step status was set to complete.
   *
   * This value will be set automatically when state transitions to COMPLETE.
   *
   * - In response: set if the execution state is COMPLETE. - In create/update request: never set
   * @return value or {@code null} for none
   */
  public Timestamp getCompletionTime() {
    return completionTime;
  }

  /**
   * The time when the step status was set to complete.
   *
   * This value will be set automatically when state transitions to COMPLETE.
   *
   * - In response: set if the execution state is COMPLETE. - In create/update request: never set
   * @param completionTime completionTime or {@code null} for none
   */
  public Step setCompletionTime(Timestamp completionTime) {
    this.completionTime = completionTime;
    return this;
  }

  /**
   * The time when the step was created.
   *
   * - In response: always set - In create/update request: never set
   * @return value or {@code null} for none
   */
  public Timestamp getCreationTime() {
    return creationTime;
  }

  /**
   * The time when the step was created.
   *
   * - In response: always set - In create/update request: never set
   * @param creationTime creationTime or {@code null} for none
   */
  public Step setCreationTime(Timestamp creationTime) {
    this.creationTime = creationTime;
    return this;
  }

  /**
   * A description of this tool For example: mvn clean package -D skipTests=true
   *
   * - In response: present if set by create/update request - In create/update request: optional
   * @return value or {@code null} for none
   */
  public java.lang.String getDescription() {
    return description;
  }

  /**
   * A description of this tool For example: mvn clean package -D skipTests=true
   *
   * - In response: present if set by create/update request - In create/update request: optional
   * @param description description or {@code null} for none
   */
  public Step setDescription(java.lang.String description) {
    this.description = description;
    return this;
  }

  /**
   * How much the device resource is used to perform the test.
   *
   * This is the device usage used for billing purpose, which is different from the run_duration,
   * for example, infrastructure failure won't be charged for device usage.
   *
   * PRECONDITION_FAILED will be returned if one attempts to set a device_usage on a step which
   * already has this field set.
   *
   * - In response: present if previously set. - In create request: optional - In update request:
   * optional
   * @return value or {@code null} for none
   */
  public Duration getDeviceUsageDuration() {
    return deviceUsageDuration;
  }

  /**
   * How much the device resource is used to perform the test.
   *
   * This is the device usage used for billing purpose, which is different from the run_duration,
   * for example, infrastructure failure won't be charged for device usage.
   *
   * PRECONDITION_FAILED will be returned if one attempts to set a device_usage on a step which
   * already has this field set.
   *
   * - In response: present if previously set. - In create request: optional - In update request:
   * optional
   * @param deviceUsageDuration deviceUsageDuration or {@code null} for none
   */
  public Step setDeviceUsageDuration(Duration deviceUsageDuration) {
    this.deviceUsageDuration = deviceUsageDuration;
    return this;
  }

  /**
   * If the execution containing this step has any dimension_definition set, then this field allows
   * the child to specify the values of the dimensions.
   *
   * The keys must exactly match the dimension_definition of the execution.
   *
   * For example, if the execution has `dimension_definition = ['attempt', 'device']` then a step
   * must define values for those dimensions, eg. `dimension_value = ['attempt': '1', 'device':
   * 'Nexus 6']`
   *
   * If a step does not participate in one dimension of the matrix, the value for that dimension
   * should be empty string. For example, if one of the tests is executed by a runner which does not
   * support retries, the step could have `dimension_value = ['attempt': '', 'device': 'Nexus 6']`
   *
   * If the step does not participate in any dimensions of the matrix, it may leave dimension_value
   * unset.
   *
   * A PRECONDITION_FAILED will be returned if any of the keys do not exist in the
   * dimension_definition of the execution.
   *
   * A PRECONDITION_FAILED will be returned if another step in this execution already has the same
   * name and dimension_value, but differs on other data fields, for example, step field is
   * different.
   *
   * A PRECONDITION_FAILED will be returned if dimension_value is set, and there is a
   * dimension_definition in the execution which is not specified as one of the keys.
   *
   * - In response: present if set by create - In create request: optional - In update request:
   * never set
   * @return value or {@code null} for none
   */
  public java.util.List<StepDimensionValueEntry> getDimensionValue() {
    return dimensionValue;
  }

  /**
   * If the execution containing this step has any dimension_definition set, then this field allows
   * the child to specify the values of the dimensions.
   *
   * The keys must exactly match the dimension_definition of the execution.
   *
   * For example, if the execution has `dimension_definition = ['attempt', 'device']` then a step
   * must define values for those dimensions, eg. `dimension_value = ['attempt': '1', 'device':
   * 'Nexus 6']`
   *
   * If a step does not participate in one dimension of the matrix, the value for that dimension
   * should be empty string. For example, if one of the tests is executed by a runner which does not
   * support retries, the step could have `dimension_value = ['attempt': '', 'device': 'Nexus 6']`
   *
   * If the step does not participate in any dimensions of the matrix, it may leave dimension_value
   * unset.
   *
   * A PRECONDITION_FAILED will be returned if any of the keys do not exist in the
   * dimension_definition of the execution.
   *
   * A PRECONDITION_FAILED will be returned if another step in this execution already has the same
   * name and dimension_value, but differs on other data fields, for example, step field is
   * different.
   *
   * A PRECONDITION_FAILED will be returned if dimension_value is set, and there is a
   * dimension_definition in the execution which is not specified as one of the keys.
   *
   * - In response: present if set by create - In create request: optional - In update request:
   * never set
   * @param dimensionValue dimensionValue or {@code null} for none
   */
  public Step setDimensionValue(java.util.List<StepDimensionValueEntry> dimensionValue) {
    this.dimensionValue = dimensionValue;
    return this;
  }

  /**
   * Whether any of the outputs of this step are images whose thumbnails can be fetched with
   * ListThumbnails.
   *
   * - In response: always set - In create/update request: never set
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getHasImages() {
    return hasImages;
  }

  /**
   * Whether any of the outputs of this step are images whose thumbnails can be fetched with
   * ListThumbnails.
   *
   * - In response: always set - In create/update request: never set
   * @param hasImages hasImages or {@code null} for none
   */
  public Step setHasImages(java.lang.Boolean hasImages) {
    this.hasImages = hasImages;
    return this;
  }

  /**
   * Arbitrary user-supplied key/value pairs that are associated with the step.
   *
   * Users are responsible for managing the key namespace such that keys don't accidentally collide.
   *
   * An INVALID_ARGUMENT will be returned if the number of labels exceeds 100 or if the length of
   * any of the keys or values exceeds 100 characters.
   *
   * - In response: always set - In create request: optional - In update request: optional; any new
   * key/value pair will be added to the map, and any new value for an existing key will update that
   * key's value
   * @return value or {@code null} for none
   */
  public java.util.List<StepLabelsEntry> getLabels() {
    return labels;
  }

  /**
   * Arbitrary user-supplied key/value pairs that are associated with the step.
   *
   * Users are responsible for managing the key namespace such that keys don't accidentally collide.
   *
   * An INVALID_ARGUMENT will be returned if the number of labels exceeds 100 or if the length of
   * any of the keys or values exceeds 100 characters.
   *
   * - In response: always set - In create request: optional - In update request: optional; any new
   * key/value pair will be added to the map, and any new value for an existing key will update that
   * key's value
   * @param labels labels or {@code null} for none
   */
  public Step setLabels(java.util.List<StepLabelsEntry> labels) {
    this.labels = labels;
    return this;
  }

  /**
   * Details when multiple steps are run with the same configuration as a group. These details can
   * be used identify which group this step is part of. It also identifies the groups 'primary step'
   * which indexes all the group members.
   *
   * - In response: present if previously set. - In create request: optional, set iff this step was
   * performed more than once. - In update request: optional
   * @return value or {@code null} for none
   */
  public MultiStep getMultiStep() {
    return multiStep;
  }

  /**
   * Details when multiple steps are run with the same configuration as a group. These details can
   * be used identify which group this step is part of. It also identifies the groups 'primary step'
   * which indexes all the group members.
   *
   * - In response: present if previously set. - In create request: optional, set iff this step was
   * performed more than once. - In update request: optional
   * @param multiStep multiStep or {@code null} for none
   */
  public Step setMultiStep(MultiStep multiStep) {
    this.multiStep = multiStep;
    return this;
  }

  /**
   * A short human-readable name to display in the UI. Maximum of 100 characters. For example: Clean
   * build
   *
   * A PRECONDITION_FAILED will be returned upon creating a new step if it shares its name and
   * dimension_value with an existing step. If two steps represent a similar action, but have
   * different dimension values, they should share the same name. For instance, if the same set of
   * tests is run on two different platforms, the two steps should have the same name.
   *
   * - In response: always set - In create request: always set - In update request: never set
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * A short human-readable name to display in the UI. Maximum of 100 characters. For example: Clean
   * build
   *
   * A PRECONDITION_FAILED will be returned upon creating a new step if it shares its name and
   * dimension_value with an existing step. If two steps represent a similar action, but have
   * different dimension values, they should share the same name. For instance, if the same set of
   * tests is run on two different platforms, the two steps should have the same name.
   *
   * - In response: always set - In create request: always set - In update request: never set
   * @param name name or {@code null} for none
   */
  public Step setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * Classification of the result, for example into SUCCESS or FAILURE
   *
   * - In response: present if set by create/update request - In create/update request: optional
   * @return value or {@code null} for none
   */
  public Outcome getOutcome() {
    return outcome;
  }

  /**
   * Classification of the result, for example into SUCCESS or FAILURE
   *
   * - In response: present if set by create/update request - In create/update request: optional
   * @param outcome outcome or {@code null} for none
   */
  public Step setOutcome(Outcome outcome) {
    this.outcome = outcome;
    return this;
  }

  /**
   * How long it took for this step to run.
   *
   * If unset, this is set to the difference between creation_time and completion_time when the step
   * is set to the COMPLETE state. In some cases, it is appropriate to set this value separately:
   * For instance, if a step is created, but the operation it represents is queued for a few minutes
   * before it executes, it would be appropriate not to include the time spent queued in its
   * run_duration.
   *
   * PRECONDITION_FAILED will be returned if one attempts to set a run_duration on a step which
   * already has this field set.
   *
   * - In response: present if previously set; always present on COMPLETE step - In create request:
   * optional - In update request: optional
   * @return value or {@code null} for none
   */
  public Duration getRunDuration() {
    return runDuration;
  }

  /**
   * How long it took for this step to run.
   *
   * If unset, this is set to the difference between creation_time and completion_time when the step
   * is set to the COMPLETE state. In some cases, it is appropriate to set this value separately:
   * For instance, if a step is created, but the operation it represents is queued for a few minutes
   * before it executes, it would be appropriate not to include the time spent queued in its
   * run_duration.
   *
   * PRECONDITION_FAILED will be returned if one attempts to set a run_duration on a step which
   * already has this field set.
   *
   * - In response: present if previously set; always present on COMPLETE step - In create request:
   * optional - In update request: optional
   * @param runDuration runDuration or {@code null} for none
   */
  public Step setRunDuration(Duration runDuration) {
    this.runDuration = runDuration;
    return this;
  }

  /**
   * The initial state is IN_PROGRESS. The only legal state transitions are * IN_PROGRESS ->
   * COMPLETE
   *
   * A PRECONDITION_FAILED will be returned if an invalid transition is requested.
   *
   * It is valid to create Step with a state set to COMPLETE. The state can only be set to COMPLETE
   * once. A PRECONDITION_FAILED will be returned if the state is set to COMPLETE multiple times.
   *
   * - In response: always set - In create/update request: optional
   * @return value or {@code null} for none
   */
  public java.lang.String getState() {
    return state;
  }

  /**
   * The initial state is IN_PROGRESS. The only legal state transitions are * IN_PROGRESS ->
   * COMPLETE
   *
   * A PRECONDITION_FAILED will be returned if an invalid transition is requested.
   *
   * It is valid to create Step with a state set to COMPLETE. The state can only be set to COMPLETE
   * once. A PRECONDITION_FAILED will be returned if the state is set to COMPLETE multiple times.
   *
   * - In response: always set - In create/update request: optional
   * @param state state or {@code null} for none
   */
  public Step setState(java.lang.String state) {
    this.state = state;
    return this;
  }

  /**
   * A unique identifier within a Execution for this Step.
   *
   * Returns INVALID_ARGUMENT if this field is set or overwritten by the caller.
   *
   * - In response: always set - In create/update request: never set
   * @return value or {@code null} for none
   */
  public java.lang.String getStepId() {
    return stepId;
  }

  /**
   * A unique identifier within a Execution for this Step.
   *
   * Returns INVALID_ARGUMENT if this field is set or overwritten by the caller.
   *
   * - In response: always set - In create/update request: never set
   * @param stepId stepId or {@code null} for none
   */
  public Step setStepId(java.lang.String stepId) {
    this.stepId = stepId;
    return this;
  }

  /**
   * An execution of a test runner.
   * @return value or {@code null} for none
   */
  public TestExecutionStep getTestExecutionStep() {
    return testExecutionStep;
  }

  /**
   * An execution of a test runner.
   * @param testExecutionStep testExecutionStep or {@code null} for none
   */
  public Step setTestExecutionStep(TestExecutionStep testExecutionStep) {
    this.testExecutionStep = testExecutionStep;
    return this;
  }

  /**
   * An execution of a tool (used for steps we don't explicitly support).
   * @return value or {@code null} for none
   */
  public ToolExecutionStep getToolExecutionStep() {
    return toolExecutionStep;
  }

  /**
   * An execution of a tool (used for steps we don't explicitly support).
   * @param toolExecutionStep toolExecutionStep or {@code null} for none
   */
  public Step setToolExecutionStep(ToolExecutionStep toolExecutionStep) {
    this.toolExecutionStep = toolExecutionStep;
    return this;
  }

  @Override
  public Step set(String fieldName, Object value) {
    return (Step) super.set(fieldName, value);
  }

  @Override
  public Step clone() {
    return (Step) super.clone();
  }

}
