// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.dashboards;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class MigrateDashboardRequest {
  /** Display name for the new Lakeview dashboard. */
  @JsonProperty("display_name")
  private String displayName;

  /** The workspace path of the folder to contain the migrated Lakeview dashboard. */
  @JsonProperty("parent_path")
  private String parentPath;

  /** UUID of the dashboard to be migrated. */
  @JsonProperty("source_dashboard_id")
  private String sourceDashboardId;

  /**
   * Flag to indicate if mustache parameter syntax ({{ param }}) should be auto-updated to named
   * syntax (:param) when converting datasets in the dashboard.
   */
  @JsonProperty("update_parameter_syntax")
  private Boolean updateParameterSyntax;

  public MigrateDashboardRequest setDisplayName(String displayName) {
    this.displayName = displayName;
    return this;
  }

  public String getDisplayName() {
    return displayName;
  }

  public MigrateDashboardRequest setParentPath(String parentPath) {
    this.parentPath = parentPath;
    return this;
  }

  public String getParentPath() {
    return parentPath;
  }

  public MigrateDashboardRequest setSourceDashboardId(String sourceDashboardId) {
    this.sourceDashboardId = sourceDashboardId;
    return this;
  }

  public String getSourceDashboardId() {
    return sourceDashboardId;
  }

  public MigrateDashboardRequest setUpdateParameterSyntax(Boolean updateParameterSyntax) {
    this.updateParameterSyntax = updateParameterSyntax;
    return this;
  }

  public Boolean getUpdateParameterSyntax() {
    return updateParameterSyntax;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    MigrateDashboardRequest that = (MigrateDashboardRequest) o;
    return Objects.equals(displayName, that.displayName)
        && Objects.equals(parentPath, that.parentPath)
        && Objects.equals(sourceDashboardId, that.sourceDashboardId)
        && Objects.equals(updateParameterSyntax, that.updateParameterSyntax);
  }

  @Override
  public int hashCode() {
    return Objects.hash(displayName, parentPath, sourceDashboardId, updateParameterSyntax);
  }

  @Override
  public String toString() {
    return new ToStringer(MigrateDashboardRequest.class)
        .add("displayName", displayName)
        .add("parentPath", parentPath)
        .add("sourceDashboardId", sourceDashboardId)
        .add("updateParameterSyntax", updateParameterSyntax)
        .toString();
  }
}
