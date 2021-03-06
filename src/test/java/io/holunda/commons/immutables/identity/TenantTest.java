package io.holunda.commons.immutables.identity;

import io.holunda.commons.immutables.CamundaImmutables;
import io.holunda.commons.immutables._BasicImmutableTest;

import static io.holunda.commons.immutables.Assertions.assertThat;
import static io.holunda.commons.immutables._Fixtures.TENANT;
import static io.holunda.commons.immutables._Fixtures.TENANT_ID;

@SuppressWarnings({"java:S2699","java:S2187"})
public class TenantTest extends _BasicImmutableTest<ImmutableTenant> {

  public TenantTest() {
    super(ImmutableTenant.class);
  }

  @Override
  public void factory_method() {
    final ImmutableTenant dto = createDto();

    assertThat(dto).hasId(TENANT_ID);
    assertThat(dto).hasName(TENANT.getName());
  }

  @Override
  public void create_minimal_dto() {
    ImmutableTenant.builder()
      .id(TENANT_ID)
      .name("name")
      .build();
  }

  @Override
  protected ImmutableTenant createDto() {
    return CamundaImmutables.tenant(TENANT);
  }
}
