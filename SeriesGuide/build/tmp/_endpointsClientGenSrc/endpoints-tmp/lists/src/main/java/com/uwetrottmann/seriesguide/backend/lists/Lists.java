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
 * This code was generated by https://github.com/google/apis-client-generator/
 * (build: 2017-02-15 17:18:02 UTC)
 * on 2017-06-20 at 07:36:13 UTC 
 * Modify at your own risk.
 */

package com.uwetrottmann.seriesguide.backend.lists;

/**
 * Service definition for Lists (v2).
 *
 * <p>
 * Store and retrieve a users lists.
 * </p>
 *
 * <p>
 * For more information about this service, see the
 * <a href="" target="_blank">API Documentation</a>
 * </p>
 *
 * <p>
 * This service uses {@link ListsRequestInitializer} to initialize global parameters via its
 * {@link Builder}.
 * </p>
 *
 * @since 1.3
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public class Lists extends com.google.api.client.googleapis.services.json.AbstractGoogleJsonClient {

  // Note: Leave this static initializer at the top of the file.
  static {
    com.google.api.client.util.Preconditions.checkState(
        com.google.api.client.googleapis.GoogleUtils.MAJOR_VERSION == 1 &&
        com.google.api.client.googleapis.GoogleUtils.MINOR_VERSION >= 15,
        "You are currently running with version %s of google-api-client. " +
        "You need at least version 1.15 of google-api-client to run version " +
        "1.22.0 of the lists library.", com.google.api.client.googleapis.GoogleUtils.VERSION);
  }

  /**
   * The default encoded root URL of the service. This is determined when the library is generated
   * and normally should not be changed.
   *
   * @since 1.7
   */
  public static final String DEFAULT_ROOT_URL = "https://optical-hexagon-364.appspot.com/_ah/api/";

  /**
   * The default encoded service path of the service. This is determined when the library is
   * generated and normally should not be changed.
   *
   * @since 1.7
   */
  public static final String DEFAULT_SERVICE_PATH = "lists/v2/";

  /**
   * The default encoded base URL of the service. This is determined when the library is generated
   * and normally should not be changed.
   */
  public static final String DEFAULT_BASE_URL = DEFAULT_ROOT_URL + DEFAULT_SERVICE_PATH;

  /**
   * Constructor.
   *
   * <p>
   * Use {@link Builder} if you need to specify any of the optional parameters.
   * </p>
   *
   * @param transport HTTP transport, which should normally be:
   *        <ul>
   *        <li>Google App Engine:
   *        {@code com.google.api.client.extensions.appengine.http.UrlFetchTransport}</li>
   *        <li>Android: {@code newCompatibleTransport} from
   *        {@code com.google.api.client.extensions.android.http.AndroidHttp}</li>
   *        <li>Java: {@link com.google.api.client.googleapis.javanet.GoogleNetHttpTransport#newTrustedTransport()}
   *        </li>
   *        </ul>
   * @param jsonFactory JSON factory, which may be:
   *        <ul>
   *        <li>Jackson: {@code com.google.api.client.json.jackson2.JacksonFactory}</li>
   *        <li>Google GSON: {@code com.google.api.client.json.gson.GsonFactory}</li>
   *        <li>Android Honeycomb or higher:
   *        {@code com.google.api.client.extensions.android.json.AndroidJsonFactory}</li>
   *        </ul>
   * @param httpRequestInitializer HTTP request initializer or {@code null} for none
   * @since 1.7
   */
  public Lists(com.google.api.client.http.HttpTransport transport, com.google.api.client.json.JsonFactory jsonFactory,
      com.google.api.client.http.HttpRequestInitializer httpRequestInitializer) {
    this(new Builder(transport, jsonFactory, httpRequestInitializer));
  }

  /**
   * @param builder builder
   */
  Lists(Builder builder) {
    super(builder);
  }

  @Override
  protected void initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest<?> httpClientRequest) throws java.io.IOException {
    super.initialize(httpClientRequest);
  }

  /**
   * Create a request for the method "get".
   *
   * This request holds the parameters needed by the lists server.  After setting any optional
   * parameters, call the {@link Get#execute()} method to invoke the remote operation.
   *
   * @return the request
   */
  public Get get() throws java.io.IOException {
    Get result = new Get();
    initialize(result);
    return result;
  }

  public class Get extends ListsRequest<com.uwetrottmann.seriesguide.backend.lists.model.SgListList> {

    private static final String REST_PATH = "get";

    /**
     * Create a request for the method "get".
     *
     * This request holds the parameters needed by the the lists server.  After setting any optional
     * parameters, call the {@link Get#execute()} method to invoke the remote operation. <p> {@link
     * Get#initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest)} must be
     * called to initialize this instance immediately after invoking the constructor. </p>
     *
     * @since 1.13
     */
    protected Get() {
      super(Lists.this, "GET", REST_PATH, null, com.uwetrottmann.seriesguide.backend.lists.model.SgListList.class);
    }

    @Override
    public com.google.api.client.http.HttpResponse executeUsingHead() throws java.io.IOException {
      return super.executeUsingHead();
    }

    @Override
    public com.google.api.client.http.HttpRequest buildHttpRequestUsingHead() throws java.io.IOException {
      return super.buildHttpRequestUsingHead();
    }

    @Override
    public Get setAlt(java.lang.String alt) {
      return (Get) super.setAlt(alt);
    }

    @Override
    public Get setFields(java.lang.String fields) {
      return (Get) super.setFields(fields);
    }

    @Override
    public Get setKey(java.lang.String key) {
      return (Get) super.setKey(key);
    }

    @Override
    public Get setOauthToken(java.lang.String oauthToken) {
      return (Get) super.setOauthToken(oauthToken);
    }

    @Override
    public Get setPrettyPrint(java.lang.Boolean prettyPrint) {
      return (Get) super.setPrettyPrint(prettyPrint);
    }

    @Override
    public Get setQuotaUser(java.lang.String quotaUser) {
      return (Get) super.setQuotaUser(quotaUser);
    }

    @Override
    public Get setUserIp(java.lang.String userIp) {
      return (Get) super.setUserIp(userIp);
    }

    @com.google.api.client.util.Key
    private java.lang.String cursor;

    /**

     */
    public java.lang.String getCursor() {
      return cursor;
    }

    public Get setCursor(java.lang.String cursor) {
      this.cursor = cursor;
      return this;
    }

    @com.google.api.client.util.Key
    private com.google.api.client.util.DateTime updatedSince;

    /**

     */
    public com.google.api.client.util.DateTime getUpdatedSince() {
      return updatedSince;
    }

    public Get setUpdatedSince(com.google.api.client.util.DateTime updatedSince) {
      this.updatedSince = updatedSince;
      return this;
    }

    @com.google.api.client.util.Key
    private java.lang.Integer limit;

    /**

     */
    public java.lang.Integer getLimit() {
      return limit;
    }

    public Get setLimit(java.lang.Integer limit) {
      this.limit = limit;
      return this;
    }

    @Override
    public Get set(String parameterName, Object value) {
      return (Get) super.set(parameterName, value);
    }
  }

  /**
   * Create a request for the method "getIds".
   *
   * This request holds the parameters needed by the lists server.  After setting any optional
   * parameters, call the {@link GetIds#execute()} method to invoke the remote operation.
   *
   * @return the request
   */
  public GetIds getIds() throws java.io.IOException {
    GetIds result = new GetIds();
    initialize(result);
    return result;
  }

  public class GetIds extends ListsRequest<com.uwetrottmann.seriesguide.backend.lists.model.SgListIds> {

    private static final String REST_PATH = "getIds";

    /**
     * Create a request for the method "getIds".
     *
     * This request holds the parameters needed by the the lists server.  After setting any optional
     * parameters, call the {@link GetIds#execute()} method to invoke the remote operation. <p> {@link
     * GetIds#initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest)} must
     * be called to initialize this instance immediately after invoking the constructor. </p>
     *
     * @since 1.13
     */
    protected GetIds() {
      super(Lists.this, "GET", REST_PATH, null, com.uwetrottmann.seriesguide.backend.lists.model.SgListIds.class);
    }

    @Override
    public com.google.api.client.http.HttpResponse executeUsingHead() throws java.io.IOException {
      return super.executeUsingHead();
    }

    @Override
    public com.google.api.client.http.HttpRequest buildHttpRequestUsingHead() throws java.io.IOException {
      return super.buildHttpRequestUsingHead();
    }

    @Override
    public GetIds setAlt(java.lang.String alt) {
      return (GetIds) super.setAlt(alt);
    }

    @Override
    public GetIds setFields(java.lang.String fields) {
      return (GetIds) super.setFields(fields);
    }

    @Override
    public GetIds setKey(java.lang.String key) {
      return (GetIds) super.setKey(key);
    }

    @Override
    public GetIds setOauthToken(java.lang.String oauthToken) {
      return (GetIds) super.setOauthToken(oauthToken);
    }

    @Override
    public GetIds setPrettyPrint(java.lang.Boolean prettyPrint) {
      return (GetIds) super.setPrettyPrint(prettyPrint);
    }

    @Override
    public GetIds setQuotaUser(java.lang.String quotaUser) {
      return (GetIds) super.setQuotaUser(quotaUser);
    }

    @Override
    public GetIds setUserIp(java.lang.String userIp) {
      return (GetIds) super.setUserIp(userIp);
    }

    @com.google.api.client.util.Key
    private java.lang.String cursor;

    /**

     */
    public java.lang.String getCursor() {
      return cursor;
    }

    public GetIds setCursor(java.lang.String cursor) {
      this.cursor = cursor;
      return this;
    }

    @com.google.api.client.util.Key
    private java.lang.Integer limit;

    /**

     */
    public java.lang.Integer getLimit() {
      return limit;
    }

    public GetIds setLimit(java.lang.Integer limit) {
      this.limit = limit;
      return this;
    }

    @Override
    public GetIds set(String parameterName, Object value) {
      return (GetIds) super.set(parameterName, value);
    }
  }

  /**
   * Create a request for the method "remove".
   *
   * This request holds the parameters needed by the lists server.  After setting any optional
   * parameters, call the {@link Remove#execute()} method to invoke the remote operation.
   *
   * @param listId
   * @return the request
   */
  public Remove remove(java.lang.String listId) throws java.io.IOException {
    Remove result = new Remove(listId);
    initialize(result);
    return result;
  }

  public class Remove extends ListsRequest<Void> {

    private static final String REST_PATH = "remove";

    /**
     * Create a request for the method "remove".
     *
     * This request holds the parameters needed by the the lists server.  After setting any optional
     * parameters, call the {@link Remove#execute()} method to invoke the remote operation. <p> {@link
     * Remove#initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest)} must
     * be called to initialize this instance immediately after invoking the constructor. </p>
     *
     * @param listId
     * @since 1.13
     */
    protected Remove(java.lang.String listId) {
      super(Lists.this, "DELETE", REST_PATH, null, Void.class);
      this.listId = com.google.api.client.util.Preconditions.checkNotNull(listId, "Required parameter listId must be specified.");
    }

    @Override
    public Remove setAlt(java.lang.String alt) {
      return (Remove) super.setAlt(alt);
    }

    @Override
    public Remove setFields(java.lang.String fields) {
      return (Remove) super.setFields(fields);
    }

    @Override
    public Remove setKey(java.lang.String key) {
      return (Remove) super.setKey(key);
    }

    @Override
    public Remove setOauthToken(java.lang.String oauthToken) {
      return (Remove) super.setOauthToken(oauthToken);
    }

    @Override
    public Remove setPrettyPrint(java.lang.Boolean prettyPrint) {
      return (Remove) super.setPrettyPrint(prettyPrint);
    }

    @Override
    public Remove setQuotaUser(java.lang.String quotaUser) {
      return (Remove) super.setQuotaUser(quotaUser);
    }

    @Override
    public Remove setUserIp(java.lang.String userIp) {
      return (Remove) super.setUserIp(userIp);
    }

    @com.google.api.client.util.Key
    private java.lang.String listId;

    /**

     */
    public java.lang.String getListId() {
      return listId;
    }

    public Remove setListId(java.lang.String listId) {
      this.listId = listId;
      return this;
    }

    @Override
    public Remove set(String parameterName, Object value) {
      return (Remove) super.set(parameterName, value);
    }
  }

  /**
   * Create a request for the method "removeItems".
   *
   * This request holds the parameters needed by the lists server.  After setting any optional
   * parameters, call the {@link RemoveItems#execute()} method to invoke the remote operation.
   *
   * @param content the {@link com.uwetrottmann.seriesguide.backend.lists.model.SgListList}
   * @return the request
   */
  public RemoveItems removeItems(com.uwetrottmann.seriesguide.backend.lists.model.SgListList content) throws java.io.IOException {
    RemoveItems result = new RemoveItems(content);
    initialize(result);
    return result;
  }

  public class RemoveItems extends ListsRequest<Void> {

    private static final String REST_PATH = "removeItems";

    /**
     * Create a request for the method "removeItems".
     *
     * This request holds the parameters needed by the the lists server.  After setting any optional
     * parameters, call the {@link RemoveItems#execute()} method to invoke the remote operation. <p>
     * {@link
     * RemoveItems#initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest)}
     * must be called to initialize this instance immediately after invoking the constructor. </p>
     *
     * @param content the {@link com.uwetrottmann.seriesguide.backend.lists.model.SgListList}
     * @since 1.13
     */
    protected RemoveItems(com.uwetrottmann.seriesguide.backend.lists.model.SgListList content) {
      super(Lists.this, "PUT", REST_PATH, content, Void.class);
    }

    @Override
    public RemoveItems setAlt(java.lang.String alt) {
      return (RemoveItems) super.setAlt(alt);
    }

    @Override
    public RemoveItems setFields(java.lang.String fields) {
      return (RemoveItems) super.setFields(fields);
    }

    @Override
    public RemoveItems setKey(java.lang.String key) {
      return (RemoveItems) super.setKey(key);
    }

    @Override
    public RemoveItems setOauthToken(java.lang.String oauthToken) {
      return (RemoveItems) super.setOauthToken(oauthToken);
    }

    @Override
    public RemoveItems setPrettyPrint(java.lang.Boolean prettyPrint) {
      return (RemoveItems) super.setPrettyPrint(prettyPrint);
    }

    @Override
    public RemoveItems setQuotaUser(java.lang.String quotaUser) {
      return (RemoveItems) super.setQuotaUser(quotaUser);
    }

    @Override
    public RemoveItems setUserIp(java.lang.String userIp) {
      return (RemoveItems) super.setUserIp(userIp);
    }

    @Override
    public RemoveItems set(String parameterName, Object value) {
      return (RemoveItems) super.set(parameterName, value);
    }
  }

  /**
   * Create a request for the method "save".
   *
   * This request holds the parameters needed by the lists server.  After setting any optional
   * parameters, call the {@link Save#execute()} method to invoke the remote operation.
   *
   * @param content the {@link com.uwetrottmann.seriesguide.backend.lists.model.SgListList}
   * @return the request
   */
  public Save save(com.uwetrottmann.seriesguide.backend.lists.model.SgListList content) throws java.io.IOException {
    Save result = new Save(content);
    initialize(result);
    return result;
  }

  public class Save extends ListsRequest<Void> {

    private static final String REST_PATH = "save";

    /**
     * Create a request for the method "save".
     *
     * This request holds the parameters needed by the the lists server.  After setting any optional
     * parameters, call the {@link Save#execute()} method to invoke the remote operation. <p> {@link
     * Save#initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest)} must be
     * called to initialize this instance immediately after invoking the constructor. </p>
     *
     * @param content the {@link com.uwetrottmann.seriesguide.backend.lists.model.SgListList}
     * @since 1.13
     */
    protected Save(com.uwetrottmann.seriesguide.backend.lists.model.SgListList content) {
      super(Lists.this, "PUT", REST_PATH, content, Void.class);
    }

    @Override
    public Save setAlt(java.lang.String alt) {
      return (Save) super.setAlt(alt);
    }

    @Override
    public Save setFields(java.lang.String fields) {
      return (Save) super.setFields(fields);
    }

    @Override
    public Save setKey(java.lang.String key) {
      return (Save) super.setKey(key);
    }

    @Override
    public Save setOauthToken(java.lang.String oauthToken) {
      return (Save) super.setOauthToken(oauthToken);
    }

    @Override
    public Save setPrettyPrint(java.lang.Boolean prettyPrint) {
      return (Save) super.setPrettyPrint(prettyPrint);
    }

    @Override
    public Save setQuotaUser(java.lang.String quotaUser) {
      return (Save) super.setQuotaUser(quotaUser);
    }

    @Override
    public Save setUserIp(java.lang.String userIp) {
      return (Save) super.setUserIp(userIp);
    }

    @Override
    public Save set(String parameterName, Object value) {
      return (Save) super.set(parameterName, value);
    }
  }

  /**
   * Builder for {@link Lists}.
   *
   * <p>
   * Implementation is not thread-safe.
   * </p>
   *
   * @since 1.3.0
   */
  public static final class Builder extends com.google.api.client.googleapis.services.json.AbstractGoogleJsonClient.Builder {

    /**
     * Returns an instance of a new builder.
     *
     * @param transport HTTP transport, which should normally be:
     *        <ul>
     *        <li>Google App Engine:
     *        {@code com.google.api.client.extensions.appengine.http.UrlFetchTransport}</li>
     *        <li>Android: {@code newCompatibleTransport} from
     *        {@code com.google.api.client.extensions.android.http.AndroidHttp}</li>
     *        <li>Java: {@link com.google.api.client.googleapis.javanet.GoogleNetHttpTransport#newTrustedTransport()}
     *        </li>
     *        </ul>
     * @param jsonFactory JSON factory, which may be:
     *        <ul>
     *        <li>Jackson: {@code com.google.api.client.json.jackson2.JacksonFactory}</li>
     *        <li>Google GSON: {@code com.google.api.client.json.gson.GsonFactory}</li>
     *        <li>Android Honeycomb or higher:
     *        {@code com.google.api.client.extensions.android.json.AndroidJsonFactory}</li>
     *        </ul>
     * @param httpRequestInitializer HTTP request initializer or {@code null} for none
     * @since 1.7
     */
    public Builder(com.google.api.client.http.HttpTransport transport, com.google.api.client.json.JsonFactory jsonFactory,
        com.google.api.client.http.HttpRequestInitializer httpRequestInitializer) {
      super(
          transport,
          jsonFactory,
          DEFAULT_ROOT_URL,
          DEFAULT_SERVICE_PATH,
          httpRequestInitializer,
          false);
    }

    /** Builds a new instance of {@link Lists}. */
    @Override
    public Lists build() {
      return new Lists(this);
    }

    @Override
    public Builder setRootUrl(String rootUrl) {
      return (Builder) super.setRootUrl(rootUrl);
    }

    @Override
    public Builder setServicePath(String servicePath) {
      return (Builder) super.setServicePath(servicePath);
    }

    @Override
    public Builder setHttpRequestInitializer(com.google.api.client.http.HttpRequestInitializer httpRequestInitializer) {
      return (Builder) super.setHttpRequestInitializer(httpRequestInitializer);
    }

    @Override
    public Builder setApplicationName(String applicationName) {
      return (Builder) super.setApplicationName(applicationName);
    }

    @Override
    public Builder setSuppressPatternChecks(boolean suppressPatternChecks) {
      return (Builder) super.setSuppressPatternChecks(suppressPatternChecks);
    }

    @Override
    public Builder setSuppressRequiredParameterChecks(boolean suppressRequiredParameterChecks) {
      return (Builder) super.setSuppressRequiredParameterChecks(suppressRequiredParameterChecks);
    }

    @Override
    public Builder setSuppressAllChecks(boolean suppressAllChecks) {
      return (Builder) super.setSuppressAllChecks(suppressAllChecks);
    }

    /**
     * Set the {@link ListsRequestInitializer}.
     *
     * @since 1.12
     */
    public Builder setListsRequestInitializer(
        ListsRequestInitializer listsRequestInitializer) {
      return (Builder) super.setGoogleClientRequestInitializer(listsRequestInitializer);
    }

    @Override
    public Builder setGoogleClientRequestInitializer(
        com.google.api.client.googleapis.services.GoogleClientRequestInitializer googleClientRequestInitializer) {
      return (Builder) super.setGoogleClientRequestInitializer(googleClientRequestInitializer);
    }
  }
}
