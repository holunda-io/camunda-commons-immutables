package io.holunda.commons.immutables.batch;

import io.holunda.commons.immutables.CamundaImmutables;
import io.holunda.commons.immutables._BasicImmutableTest;
import io.holunda.commons.immutables._Fixtures;

import static io.holunda.commons.immutables.Assertions.assertThat;
import static io.holunda.commons.immutables._Fixtures.uuid;

@SuppressWarnings({"java:S2699", "java:S2187"})
public class BatchTest extends _BasicImmutableTest<ImmutableBatch> {

  public BatchTest() {
    super(ImmutableBatch.class);
  }

  @Override
  public void factory_method() {
    ImmutableBatch dto = createDto();

    assertThat(dto).hasId(_Fixtures.BATCH.getId());
    assertThat(dto).hasType(_Fixtures.BATCH.getType());
    assertThat(dto).hasTotalJobs(_Fixtures.BATCH.getTotalJobs());
    assertThat(dto).hasJobsCreated(_Fixtures.BATCH.getJobsCreated());
    assertThat(dto).hasBatchJobsPerSeed(_Fixtures.BATCH.getBatchJobsPerSeed());
    assertThat(dto).hasInvocationsPerBatchJob(_Fixtures.BATCH.getInvocationsPerBatchJob());
    assertThat(dto).hasSeedJobDefinitionId(_Fixtures.BATCH.getSeedJobDefinitionId());
    assertThat(dto).hasMonitorJobDefinitionId(_Fixtures.BATCH.getMonitorJobDefinitionId());
    assertThat(dto).hasBatchJobDefinitionId(_Fixtures.BATCH.getBatchJobDefinitionId());
    assertThat(dto).hasTenantId(_Fixtures.BATCH.getTenantId());
    assertThat(dto).hasCreateUserId(_Fixtures.BATCH.getCreateUserId());
    assertThat(dto).isSuspended();
  }

  @Override
  public void create_minimal_dto() {
    ImmutableBatch dto = ImmutableBatch.builder()
      .id(uuid())
      .type("type")
      .totalJobs(10)
      .jobsCreated(0)
      .batchJobsPerSeed(1)
      .invocationsPerBatchJob(1)
      .seedJobDefinitionId("jobDefinition")
      .monitorJobDefinitionId("monitorJob")
      .batchJobDefinitionId("batchJobDefinition")
      .build();
  }


  @Override
  protected ImmutableBatch createDto() {
    return CamundaImmutables.batch(_Fixtures.BATCH);
  }
}
