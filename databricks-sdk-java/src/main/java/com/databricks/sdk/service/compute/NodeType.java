// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.compute;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/**
 * A description of a Spark node type including both the dimensions of the node and the instance
 * type on which it will be hosted.
 */
@Generated
public class NodeType {
  /**
   * A descriptive category for this node type. Examples include "Memory Optimized" and "Compute
   * Optimized".
   */
  @JsonProperty("category")
  private String category;

  /** A string description associated with this node type, e.g., "r3.xlarge". */
  @JsonProperty("description")
  private String description;

  /**
   * An optional hint at the display order of node types in the UI. Within a node type category,
   * lowest numbers come first.
   */
  @JsonProperty("display_order")
  private Long displayOrder;

  /** An identifier for the type of hardware that this node runs on, e.g., "r3.2xlarge" in AWS. */
  @JsonProperty("instance_type_id")
  private String instanceTypeId;

  /** Whether the node type is deprecated. Non-deprecated node types offer greater performance. */
  @JsonProperty("is_deprecated")
  private Boolean isDeprecated;

  /**
   * AWS specific, whether this instance supports encryption in transit, used for hipaa and pci
   * workloads.
   */
  @JsonProperty("is_encrypted_in_transit")
  private Boolean isEncryptedInTransit;

  /** Whether this is an Arm-based instance. */
  @JsonProperty("is_graviton")
  private Boolean isGraviton;

  /** Whether this node is hidden from presentation in the UI. */
  @JsonProperty("is_hidden")
  private Boolean isHidden;

  /** Whether this node comes with IO cache enabled by default. */
  @JsonProperty("is_io_cache_enabled")
  private Boolean isIoCacheEnabled;

  /** Memory (in MB) available for this node type. */
  @JsonProperty("memory_mb")
  private Long memoryMb;

  /** A collection of node type info reported by the cloud provider */
  @JsonProperty("node_info")
  private CloudProviderNodeInfo nodeInfo;

  /** The NodeInstanceType object corresponding to instance_type_id */
  @JsonProperty("node_instance_type")
  private NodeInstanceType nodeInstanceType;

  /** Unique identifier for this node type. */
  @JsonProperty("node_type_id")
  private String nodeTypeId;

  /**
   * Number of CPU cores available for this node type. Note that this can be fractional, e.g., 2.5
   * cores, if the the number of cores on a machine instance is not divisible by the number of Spark
   * nodes on that machine.
   */
  @JsonProperty("num_cores")
  private Double numCores;

  /** Number of GPUs available for this node type. */
  @JsonProperty("num_gpus")
  private Long numGpus;

  /** */
  @JsonProperty("photon_driver_capable")
  private Boolean photonDriverCapable;

  /** */
  @JsonProperty("photon_worker_capable")
  private Boolean photonWorkerCapable;

  /** Whether this node type support cluster tags. */
  @JsonProperty("support_cluster_tags")
  private Boolean supportClusterTags;

  /**
   * Whether this node type support EBS volumes. EBS volumes is disabled for node types that we
   * could place multiple corresponding containers on the same hosting instance.
   */
  @JsonProperty("support_ebs_volumes")
  private Boolean supportEbsVolumes;

  /** Whether this node type supports port forwarding. */
  @JsonProperty("support_port_forwarding")
  private Boolean supportPortForwarding;

  public NodeType setCategory(String category) {
    this.category = category;
    return this;
  }

  public String getCategory() {
    return category;
  }

  public NodeType setDescription(String description) {
    this.description = description;
    return this;
  }

  public String getDescription() {
    return description;
  }

  public NodeType setDisplayOrder(Long displayOrder) {
    this.displayOrder = displayOrder;
    return this;
  }

  public Long getDisplayOrder() {
    return displayOrder;
  }

  public NodeType setInstanceTypeId(String instanceTypeId) {
    this.instanceTypeId = instanceTypeId;
    return this;
  }

  public String getInstanceTypeId() {
    return instanceTypeId;
  }

  public NodeType setIsDeprecated(Boolean isDeprecated) {
    this.isDeprecated = isDeprecated;
    return this;
  }

  public Boolean getIsDeprecated() {
    return isDeprecated;
  }

  public NodeType setIsEncryptedInTransit(Boolean isEncryptedInTransit) {
    this.isEncryptedInTransit = isEncryptedInTransit;
    return this;
  }

  public Boolean getIsEncryptedInTransit() {
    return isEncryptedInTransit;
  }

  public NodeType setIsGraviton(Boolean isGraviton) {
    this.isGraviton = isGraviton;
    return this;
  }

  public Boolean getIsGraviton() {
    return isGraviton;
  }

  public NodeType setIsHidden(Boolean isHidden) {
    this.isHidden = isHidden;
    return this;
  }

  public Boolean getIsHidden() {
    return isHidden;
  }

  public NodeType setIsIoCacheEnabled(Boolean isIoCacheEnabled) {
    this.isIoCacheEnabled = isIoCacheEnabled;
    return this;
  }

  public Boolean getIsIoCacheEnabled() {
    return isIoCacheEnabled;
  }

  public NodeType setMemoryMb(Long memoryMb) {
    this.memoryMb = memoryMb;
    return this;
  }

  public Long getMemoryMb() {
    return memoryMb;
  }

  public NodeType setNodeInfo(CloudProviderNodeInfo nodeInfo) {
    this.nodeInfo = nodeInfo;
    return this;
  }

  public CloudProviderNodeInfo getNodeInfo() {
    return nodeInfo;
  }

  public NodeType setNodeInstanceType(NodeInstanceType nodeInstanceType) {
    this.nodeInstanceType = nodeInstanceType;
    return this;
  }

  public NodeInstanceType getNodeInstanceType() {
    return nodeInstanceType;
  }

  public NodeType setNodeTypeId(String nodeTypeId) {
    this.nodeTypeId = nodeTypeId;
    return this;
  }

  public String getNodeTypeId() {
    return nodeTypeId;
  }

  public NodeType setNumCores(Double numCores) {
    this.numCores = numCores;
    return this;
  }

  public Double getNumCores() {
    return numCores;
  }

  public NodeType setNumGpus(Long numGpus) {
    this.numGpus = numGpus;
    return this;
  }

  public Long getNumGpus() {
    return numGpus;
  }

  public NodeType setPhotonDriverCapable(Boolean photonDriverCapable) {
    this.photonDriverCapable = photonDriverCapable;
    return this;
  }

  public Boolean getPhotonDriverCapable() {
    return photonDriverCapable;
  }

  public NodeType setPhotonWorkerCapable(Boolean photonWorkerCapable) {
    this.photonWorkerCapable = photonWorkerCapable;
    return this;
  }

  public Boolean getPhotonWorkerCapable() {
    return photonWorkerCapable;
  }

  public NodeType setSupportClusterTags(Boolean supportClusterTags) {
    this.supportClusterTags = supportClusterTags;
    return this;
  }

  public Boolean getSupportClusterTags() {
    return supportClusterTags;
  }

  public NodeType setSupportEbsVolumes(Boolean supportEbsVolumes) {
    this.supportEbsVolumes = supportEbsVolumes;
    return this;
  }

  public Boolean getSupportEbsVolumes() {
    return supportEbsVolumes;
  }

  public NodeType setSupportPortForwarding(Boolean supportPortForwarding) {
    this.supportPortForwarding = supportPortForwarding;
    return this;
  }

  public Boolean getSupportPortForwarding() {
    return supportPortForwarding;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    NodeType that = (NodeType) o;
    return Objects.equals(category, that.category)
        && Objects.equals(description, that.description)
        && Objects.equals(displayOrder, that.displayOrder)
        && Objects.equals(instanceTypeId, that.instanceTypeId)
        && Objects.equals(isDeprecated, that.isDeprecated)
        && Objects.equals(isEncryptedInTransit, that.isEncryptedInTransit)
        && Objects.equals(isGraviton, that.isGraviton)
        && Objects.equals(isHidden, that.isHidden)
        && Objects.equals(isIoCacheEnabled, that.isIoCacheEnabled)
        && Objects.equals(memoryMb, that.memoryMb)
        && Objects.equals(nodeInfo, that.nodeInfo)
        && Objects.equals(nodeInstanceType, that.nodeInstanceType)
        && Objects.equals(nodeTypeId, that.nodeTypeId)
        && Objects.equals(numCores, that.numCores)
        && Objects.equals(numGpus, that.numGpus)
        && Objects.equals(photonDriverCapable, that.photonDriverCapable)
        && Objects.equals(photonWorkerCapable, that.photonWorkerCapable)
        && Objects.equals(supportClusterTags, that.supportClusterTags)
        && Objects.equals(supportEbsVolumes, that.supportEbsVolumes)
        && Objects.equals(supportPortForwarding, that.supportPortForwarding);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        category,
        description,
        displayOrder,
        instanceTypeId,
        isDeprecated,
        isEncryptedInTransit,
        isGraviton,
        isHidden,
        isIoCacheEnabled,
        memoryMb,
        nodeInfo,
        nodeInstanceType,
        nodeTypeId,
        numCores,
        numGpus,
        photonDriverCapable,
        photonWorkerCapable,
        supportClusterTags,
        supportEbsVolumes,
        supportPortForwarding);
  }

  @Override
  public String toString() {
    return new ToStringer(NodeType.class)
        .add("category", category)
        .add("description", description)
        .add("displayOrder", displayOrder)
        .add("instanceTypeId", instanceTypeId)
        .add("isDeprecated", isDeprecated)
        .add("isEncryptedInTransit", isEncryptedInTransit)
        .add("isGraviton", isGraviton)
        .add("isHidden", isHidden)
        .add("isIoCacheEnabled", isIoCacheEnabled)
        .add("memoryMb", memoryMb)
        .add("nodeInfo", nodeInfo)
        .add("nodeInstanceType", nodeInstanceType)
        .add("nodeTypeId", nodeTypeId)
        .add("numCores", numCores)
        .add("numGpus", numGpus)
        .add("photonDriverCapable", photonDriverCapable)
        .add("photonWorkerCapable", photonWorkerCapable)
        .add("supportClusterTags", supportClusterTags)
        .add("supportEbsVolumes", supportEbsVolumes)
        .add("supportPortForwarding", supportPortForwarding)
        .toString();
  }
}
