// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.workspace;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

@Generated
public class ListCredentialsResponse {
  /** List of credentials. */
  @JsonProperty("credentials")
  private Collection<CredentialInfo> credentials;

  public ListCredentialsResponse setCredentials(Collection<CredentialInfo> credentials) {
    this.credentials = credentials;
    return this;
  }

  public Collection<CredentialInfo> getCredentials() {
    return credentials;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ListCredentialsResponse that = (ListCredentialsResponse) o;
    return Objects.equals(credentials, that.credentials);
  }

  @Override
  public int hashCode() {
    return Objects.hash(credentials);
  }

  @Override
  public String toString() {
    return new ToStringer(ListCredentialsResponse.class).add("credentials", credentials).toString();
  }
}
