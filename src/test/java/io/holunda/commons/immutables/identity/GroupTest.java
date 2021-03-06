package io.holunda.commons.immutables.identity;

import io.holunda.commons.immutables.CamundaImmutables;
import io.holunda.commons.immutables._BasicImmutableTest;

import static io.holunda.commons.immutables.Assertions.assertThat;
import static io.holunda.commons.immutables._Fixtures.GROUP;
import static io.holunda.commons.immutables._Fixtures.GROUP_ID;

@SuppressWarnings({"java:S2699","java:S2187"})
public class GroupTest extends _BasicImmutableTest<ImmutableGroup> {

  public GroupTest() {
    super(ImmutableGroup.class);
  }

  @Override
  public void factory_method() {
    final ImmutableGroup dto = createDto();

    assertThat(dto).hasId(GROUP_ID);
    assertThat(dto).hasName(GROUP.getName());
    assertThat(dto).hasType(GROUP.getType());
  }

  @Override
  public void create_minimal_dto() {
    ImmutableGroup.builder()
      .id(GROUP_ID)
      .name(GROUP.getName())
      .type(GROUP.getType())
      .build();
  }

  @Override
  protected ImmutableGroup createDto() {
    return CamundaImmutables.group(GROUP);
  }
}
