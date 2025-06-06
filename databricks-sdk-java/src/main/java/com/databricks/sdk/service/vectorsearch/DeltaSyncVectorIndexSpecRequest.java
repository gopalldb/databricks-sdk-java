// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.vectorsearch;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

@Generated
public class DeltaSyncVectorIndexSpecRequest {
  /**
   * [Optional] Select the columns to sync with the vector index. If you leave this field blank, all
   * columns from the source table are synced with the index. The primary key column and embedding
   * source column or embedding vector column are always synced.
   */
  @JsonProperty("columns_to_sync")
  private Collection<String> columnsToSync;

  /** The columns that contain the embedding source. */
  @JsonProperty("embedding_source_columns")
  private Collection<EmbeddingSourceColumn> embeddingSourceColumns;

  /** The columns that contain the embedding vectors. */
  @JsonProperty("embedding_vector_columns")
  private Collection<EmbeddingVectorColumn> embeddingVectorColumns;

  /**
   * [Optional] Name of the Delta table to sync the vector index contents and computed embeddings
   * to.
   */
  @JsonProperty("embedding_writeback_table")
  private String embeddingWritebackTable;

  /**
   * Pipeline execution mode. - `TRIGGERED`: If the pipeline uses the triggered execution mode, the
   * system stops processing after successfully refreshing the source table in the pipeline once,
   * ensuring the table is updated based on the data available when the update started. -
   * `CONTINUOUS`: If the pipeline uses continuous execution, the pipeline processes new data as it
   * arrives in the source table to keep vector index fresh.
   */
  @JsonProperty("pipeline_type")
  private PipelineType pipelineType;

  /** The name of the source table. */
  @JsonProperty("source_table")
  private String sourceTable;

  public DeltaSyncVectorIndexSpecRequest setColumnsToSync(Collection<String> columnsToSync) {
    this.columnsToSync = columnsToSync;
    return this;
  }

  public Collection<String> getColumnsToSync() {
    return columnsToSync;
  }

  public DeltaSyncVectorIndexSpecRequest setEmbeddingSourceColumns(
      Collection<EmbeddingSourceColumn> embeddingSourceColumns) {
    this.embeddingSourceColumns = embeddingSourceColumns;
    return this;
  }

  public Collection<EmbeddingSourceColumn> getEmbeddingSourceColumns() {
    return embeddingSourceColumns;
  }

  public DeltaSyncVectorIndexSpecRequest setEmbeddingVectorColumns(
      Collection<EmbeddingVectorColumn> embeddingVectorColumns) {
    this.embeddingVectorColumns = embeddingVectorColumns;
    return this;
  }

  public Collection<EmbeddingVectorColumn> getEmbeddingVectorColumns() {
    return embeddingVectorColumns;
  }

  public DeltaSyncVectorIndexSpecRequest setEmbeddingWritebackTable(
      String embeddingWritebackTable) {
    this.embeddingWritebackTable = embeddingWritebackTable;
    return this;
  }

  public String getEmbeddingWritebackTable() {
    return embeddingWritebackTable;
  }

  public DeltaSyncVectorIndexSpecRequest setPipelineType(PipelineType pipelineType) {
    this.pipelineType = pipelineType;
    return this;
  }

  public PipelineType getPipelineType() {
    return pipelineType;
  }

  public DeltaSyncVectorIndexSpecRequest setSourceTable(String sourceTable) {
    this.sourceTable = sourceTable;
    return this;
  }

  public String getSourceTable() {
    return sourceTable;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    DeltaSyncVectorIndexSpecRequest that = (DeltaSyncVectorIndexSpecRequest) o;
    return Objects.equals(columnsToSync, that.columnsToSync)
        && Objects.equals(embeddingSourceColumns, that.embeddingSourceColumns)
        && Objects.equals(embeddingVectorColumns, that.embeddingVectorColumns)
        && Objects.equals(embeddingWritebackTable, that.embeddingWritebackTable)
        && Objects.equals(pipelineType, that.pipelineType)
        && Objects.equals(sourceTable, that.sourceTable);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        columnsToSync,
        embeddingSourceColumns,
        embeddingVectorColumns,
        embeddingWritebackTable,
        pipelineType,
        sourceTable);
  }

  @Override
  public String toString() {
    return new ToStringer(DeltaSyncVectorIndexSpecRequest.class)
        .add("columnsToSync", columnsToSync)
        .add("embeddingSourceColumns", embeddingSourceColumns)
        .add("embeddingVectorColumns", embeddingVectorColumns)
        .add("embeddingWritebackTable", embeddingWritebackTable)
        .add("pipelineType", pipelineType)
        .add("sourceTable", sourceTable)
        .toString();
  }
}
