package io.holunda.commons.immutables.runtime;

import io.holunda.commons.immutables.CamundaImmutables;
import io.holunda.commons.immutables._BasicImmutableTest;

import static io.holunda.commons.immutables.Assertions.assertThat;
import static io.holunda.commons.immutables._Fixtures.EXECUTION;
import static io.holunda.commons.immutables._Fixtures.EXECUTION_ID;
import static io.holunda.commons.immutables._Fixtures.PROCESS_INSTANCE_ID;
import static io.holunda.commons.immutables._Fixtures.TENANT_ID;

@SuppressWarnings({"java:S2699","java:S2187"})
public class ExecutionTest extends _BasicImmutableTest<ImmutableExecution> {

  public ExecutionTest() {
    super(ImmutableExecution.class);
  }

  @Override
  public void factory_method() {
    final ImmutableExecution dto = createDto();

    assertThat(dto).hasId(EXECUTION_ID);
    assertThat(dto).hasProcessInstanceId(PROCESS_INSTANCE_ID);
    assertThat(dto).hasTenantId(TENANT_ID);
    assertThat(dto).isSuspended();
    assertThat(dto).isEnded();
  }

  @Override
  public void create_minimal_dto() {
    ImmutableExecution.builder()
      .id(EXECUTION_ID)
      .processInstanceId(PROCESS_INSTANCE_ID)
      .build();
  }

  @Override
  protected ImmutableExecution createDto() {
    return CamundaImmutables.execution(EXECUTION);
  }
}
