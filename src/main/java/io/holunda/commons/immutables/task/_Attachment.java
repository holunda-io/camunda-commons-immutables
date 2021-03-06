package io.holunda.commons.immutables.task;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import io.holunda.commons.immutables._config.CamundaPojoStyle;
import org.camunda.bpm.engine.identity.Group;
import org.camunda.bpm.engine.impl.util.ClockUtil;
import org.camunda.bpm.engine.task.Attachment;
import org.immutables.value.Value;
import org.jetbrains.annotations.Nullable;

import java.util.Date;

import static io.holunda.commons.immutables.CamundaImmutables.UNMODIFIABLE;

/**
 * @see io.holunda.commons.immutables.CamundaImmutables#attachment(Attachment)
 */
@Value.Immutable
@CamundaPojoStyle
@JsonDeserialize(as = ImmutableAttachment.class)
@JsonSerialize(as = ImmutableAttachment.class)
@SuppressWarnings("java:S114")
interface _Attachment extends _AttachmentWithoutSetters {

  @Override
  String getId();

  @Override
  @Nullable
  String getName();

  @Override
  @Nullable
  String getDescription();

  @Override
  @Nullable
  String getType();

  @Override
  @Nullable
  String getTaskId();

  @Override
  String getProcessInstanceId();

  @Override
  @Nullable
  String getUrl();

  @Override
  default Date getCreateTime() {
    return ClockUtil.getCurrentTime();
  }

  @Override
  @Nullable
  default String getRootProcessInstanceId() {
    return getProcessInstanceId();
  }

  @Override
  @Nullable
  Date getRemovalTime();

}

/**
 * Throwing {@link UnsupportedOperationException} for all setters to keep
 * the {@link _Task} clean.
 */
@SuppressWarnings({"java:S114", "java:S1133"})
interface _AttachmentWithoutSetters extends Attachment {

  /**
   * @deprecated setter has to be implemented to fulfill the interface but will throw {@link UnsupportedOperationException}.
   */
  @Override
  @Deprecated(since = "0.13.0")
  default void setName(String name) {
    throw UNMODIFIABLE;
  }

  /**
   * @deprecated setter has to be implemented to fulfill the interface but will throw {@link UnsupportedOperationException}.
   */
  @Override
  @Deprecated(since = "0.13.0")
  default void setDescription(String description) {
    throw UNMODIFIABLE;
  }
}

