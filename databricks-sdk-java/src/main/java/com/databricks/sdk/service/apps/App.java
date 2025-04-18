// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.apps;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

@Generated
public class App {
  /**
   * The active deployment of the app. A deployment is considered active when it has been deployed
   * to the app compute.
   */
  @JsonProperty("active_deployment")
  private AppDeployment activeDeployment;

  /** */
  @JsonProperty("app_status")
  private ApplicationStatus appStatus;

  /** */
  @JsonProperty("budget_policy_id")
  private String budgetPolicyId;

  /** */
  @JsonProperty("compute_status")
  private ComputeStatus computeStatus;

  /** The creation time of the app. Formatted timestamp in ISO 6801. */
  @JsonProperty("create_time")
  private String createTime;

  /** The email of the user that created the app. */
  @JsonProperty("creator")
  private String creator;

  /**
   * The default workspace file system path of the source code from which app deployment are
   * created. This field tracks the workspace source code path of the last active deployment.
   */
  @JsonProperty("default_source_code_path")
  private String defaultSourceCodePath;

  /** The description of the app. */
  @JsonProperty("description")
  private String description;

  /** */
  @JsonProperty("effective_budget_policy_id")
  private String effectiveBudgetPolicyId;

  /** The effective api scopes granted to the user access token. */
  @JsonProperty("effective_user_api_scopes")
  private Collection<String> effectiveUserApiScopes;

  /** The unique identifier of the app. */
  @JsonProperty("id")
  private String id;

  /**
   * The name of the app. The name must contain only lowercase alphanumeric characters and hyphens.
   * It must be unique within the workspace.
   */
  @JsonProperty("name")
  private String name;

  /** */
  @JsonProperty("oauth2_app_client_id")
  private String oauth2AppClientId;

  /** */
  @JsonProperty("oauth2_app_integration_id")
  private String oauth2AppIntegrationId;

  /**
   * The pending deployment of the app. A deployment is considered pending when it is being prepared
   * for deployment to the app compute.
   */
  @JsonProperty("pending_deployment")
  private AppDeployment pendingDeployment;

  /** Resources for the app. */
  @JsonProperty("resources")
  private Collection<AppResource> resources;

  /** */
  @JsonProperty("service_principal_client_id")
  private String servicePrincipalClientId;

  /** */
  @JsonProperty("service_principal_id")
  private Long servicePrincipalId;

  /** */
  @JsonProperty("service_principal_name")
  private String servicePrincipalName;

  /** The update time of the app. Formatted timestamp in ISO 6801. */
  @JsonProperty("update_time")
  private String updateTime;

  /** The email of the user that last updated the app. */
  @JsonProperty("updater")
  private String updater;

  /** The URL of the app once it is deployed. */
  @JsonProperty("url")
  private String url;

  /** */
  @JsonProperty("user_api_scopes")
  private Collection<String> userApiScopes;

  public App setActiveDeployment(AppDeployment activeDeployment) {
    this.activeDeployment = activeDeployment;
    return this;
  }

  public AppDeployment getActiveDeployment() {
    return activeDeployment;
  }

  public App setAppStatus(ApplicationStatus appStatus) {
    this.appStatus = appStatus;
    return this;
  }

  public ApplicationStatus getAppStatus() {
    return appStatus;
  }

  public App setBudgetPolicyId(String budgetPolicyId) {
    this.budgetPolicyId = budgetPolicyId;
    return this;
  }

  public String getBudgetPolicyId() {
    return budgetPolicyId;
  }

  public App setComputeStatus(ComputeStatus computeStatus) {
    this.computeStatus = computeStatus;
    return this;
  }

  public ComputeStatus getComputeStatus() {
    return computeStatus;
  }

  public App setCreateTime(String createTime) {
    this.createTime = createTime;
    return this;
  }

  public String getCreateTime() {
    return createTime;
  }

  public App setCreator(String creator) {
    this.creator = creator;
    return this;
  }

  public String getCreator() {
    return creator;
  }

  public App setDefaultSourceCodePath(String defaultSourceCodePath) {
    this.defaultSourceCodePath = defaultSourceCodePath;
    return this;
  }

  public String getDefaultSourceCodePath() {
    return defaultSourceCodePath;
  }

  public App setDescription(String description) {
    this.description = description;
    return this;
  }

  public String getDescription() {
    return description;
  }

  public App setEffectiveBudgetPolicyId(String effectiveBudgetPolicyId) {
    this.effectiveBudgetPolicyId = effectiveBudgetPolicyId;
    return this;
  }

  public String getEffectiveBudgetPolicyId() {
    return effectiveBudgetPolicyId;
  }

  public App setEffectiveUserApiScopes(Collection<String> effectiveUserApiScopes) {
    this.effectiveUserApiScopes = effectiveUserApiScopes;
    return this;
  }

  public Collection<String> getEffectiveUserApiScopes() {
    return effectiveUserApiScopes;
  }

  public App setId(String id) {
    this.id = id;
    return this;
  }

  public String getId() {
    return id;
  }

  public App setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public App setOauth2AppClientId(String oauth2AppClientId) {
    this.oauth2AppClientId = oauth2AppClientId;
    return this;
  }

  public String getOauth2AppClientId() {
    return oauth2AppClientId;
  }

  public App setOauth2AppIntegrationId(String oauth2AppIntegrationId) {
    this.oauth2AppIntegrationId = oauth2AppIntegrationId;
    return this;
  }

  public String getOauth2AppIntegrationId() {
    return oauth2AppIntegrationId;
  }

  public App setPendingDeployment(AppDeployment pendingDeployment) {
    this.pendingDeployment = pendingDeployment;
    return this;
  }

  public AppDeployment getPendingDeployment() {
    return pendingDeployment;
  }

  public App setResources(Collection<AppResource> resources) {
    this.resources = resources;
    return this;
  }

  public Collection<AppResource> getResources() {
    return resources;
  }

  public App setServicePrincipalClientId(String servicePrincipalClientId) {
    this.servicePrincipalClientId = servicePrincipalClientId;
    return this;
  }

  public String getServicePrincipalClientId() {
    return servicePrincipalClientId;
  }

  public App setServicePrincipalId(Long servicePrincipalId) {
    this.servicePrincipalId = servicePrincipalId;
    return this;
  }

  public Long getServicePrincipalId() {
    return servicePrincipalId;
  }

  public App setServicePrincipalName(String servicePrincipalName) {
    this.servicePrincipalName = servicePrincipalName;
    return this;
  }

  public String getServicePrincipalName() {
    return servicePrincipalName;
  }

  public App setUpdateTime(String updateTime) {
    this.updateTime = updateTime;
    return this;
  }

  public String getUpdateTime() {
    return updateTime;
  }

  public App setUpdater(String updater) {
    this.updater = updater;
    return this;
  }

  public String getUpdater() {
    return updater;
  }

  public App setUrl(String url) {
    this.url = url;
    return this;
  }

  public String getUrl() {
    return url;
  }

  public App setUserApiScopes(Collection<String> userApiScopes) {
    this.userApiScopes = userApiScopes;
    return this;
  }

  public Collection<String> getUserApiScopes() {
    return userApiScopes;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    App that = (App) o;
    return Objects.equals(activeDeployment, that.activeDeployment)
        && Objects.equals(appStatus, that.appStatus)
        && Objects.equals(budgetPolicyId, that.budgetPolicyId)
        && Objects.equals(computeStatus, that.computeStatus)
        && Objects.equals(createTime, that.createTime)
        && Objects.equals(creator, that.creator)
        && Objects.equals(defaultSourceCodePath, that.defaultSourceCodePath)
        && Objects.equals(description, that.description)
        && Objects.equals(effectiveBudgetPolicyId, that.effectiveBudgetPolicyId)
        && Objects.equals(effectiveUserApiScopes, that.effectiveUserApiScopes)
        && Objects.equals(id, that.id)
        && Objects.equals(name, that.name)
        && Objects.equals(oauth2AppClientId, that.oauth2AppClientId)
        && Objects.equals(oauth2AppIntegrationId, that.oauth2AppIntegrationId)
        && Objects.equals(pendingDeployment, that.pendingDeployment)
        && Objects.equals(resources, that.resources)
        && Objects.equals(servicePrincipalClientId, that.servicePrincipalClientId)
        && Objects.equals(servicePrincipalId, that.servicePrincipalId)
        && Objects.equals(servicePrincipalName, that.servicePrincipalName)
        && Objects.equals(updateTime, that.updateTime)
        && Objects.equals(updater, that.updater)
        && Objects.equals(url, that.url)
        && Objects.equals(userApiScopes, that.userApiScopes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        activeDeployment,
        appStatus,
        budgetPolicyId,
        computeStatus,
        createTime,
        creator,
        defaultSourceCodePath,
        description,
        effectiveBudgetPolicyId,
        effectiveUserApiScopes,
        id,
        name,
        oauth2AppClientId,
        oauth2AppIntegrationId,
        pendingDeployment,
        resources,
        servicePrincipalClientId,
        servicePrincipalId,
        servicePrincipalName,
        updateTime,
        updater,
        url,
        userApiScopes);
  }

  @Override
  public String toString() {
    return new ToStringer(App.class)
        .add("activeDeployment", activeDeployment)
        .add("appStatus", appStatus)
        .add("budgetPolicyId", budgetPolicyId)
        .add("computeStatus", computeStatus)
        .add("createTime", createTime)
        .add("creator", creator)
        .add("defaultSourceCodePath", defaultSourceCodePath)
        .add("description", description)
        .add("effectiveBudgetPolicyId", effectiveBudgetPolicyId)
        .add("effectiveUserApiScopes", effectiveUserApiScopes)
        .add("id", id)
        .add("name", name)
        .add("oauth2AppClientId", oauth2AppClientId)
        .add("oauth2AppIntegrationId", oauth2AppIntegrationId)
        .add("pendingDeployment", pendingDeployment)
        .add("resources", resources)
        .add("servicePrincipalClientId", servicePrincipalClientId)
        .add("servicePrincipalId", servicePrincipalId)
        .add("servicePrincipalName", servicePrincipalName)
        .add("updateTime", updateTime)
        .add("updater", updater)
        .add("url", url)
        .add("userApiScopes", userApiScopes)
        .toString();
  }
}
