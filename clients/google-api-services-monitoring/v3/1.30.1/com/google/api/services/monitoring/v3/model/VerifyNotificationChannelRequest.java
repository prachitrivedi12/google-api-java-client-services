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

package com.google.api.services.monitoring.v3.model;

/**
 * The VerifyNotificationChannel request.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Monitoring API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class VerifyNotificationChannelRequest extends com.google.api.client.json.GenericJson {

  /**
   * Required. The verification code that was delivered to the channel as a result of invoking the
   * SendNotificationChannelVerificationCode API method or that was retrieved from a verified
   * channel via GetNotificationChannelVerificationCode. For example, one might have "G-123456" or
   * "TKNZGhhd2EyN3I1MnRnMjRv" (in general, one is only guaranteed that the code is valid UTF-8; one
   * should not make any assumptions regarding the structure or format of the code).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String code;

  /**
   * Required. The verification code that was delivered to the channel as a result of invoking the
   * SendNotificationChannelVerificationCode API method or that was retrieved from a verified
   * channel via GetNotificationChannelVerificationCode. For example, one might have "G-123456" or
   * "TKNZGhhd2EyN3I1MnRnMjRv" (in general, one is only guaranteed that the code is valid UTF-8; one
   * should not make any assumptions regarding the structure or format of the code).
   * @return value or {@code null} for none
   */
  public java.lang.String getCode() {
    return code;
  }

  /**
   * Required. The verification code that was delivered to the channel as a result of invoking the
   * SendNotificationChannelVerificationCode API method or that was retrieved from a verified
   * channel via GetNotificationChannelVerificationCode. For example, one might have "G-123456" or
   * "TKNZGhhd2EyN3I1MnRnMjRv" (in general, one is only guaranteed that the code is valid UTF-8; one
   * should not make any assumptions regarding the structure or format of the code).
   * @param code code or {@code null} for none
   */
  public VerifyNotificationChannelRequest setCode(java.lang.String code) {
    this.code = code;
    return this;
  }

  @Override
  public VerifyNotificationChannelRequest set(String fieldName, Object value) {
    return (VerifyNotificationChannelRequest) super.set(fieldName, value);
  }

  @Override
  public VerifyNotificationChannelRequest clone() {
    return (VerifyNotificationChannelRequest) super.clone();
  }

}
