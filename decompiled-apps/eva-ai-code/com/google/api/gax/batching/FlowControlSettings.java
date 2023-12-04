package com.google.api.gax.batching;

import com.google.api.gax.batching.AutoValue_FlowControlSettings;
import com.google.api.gax.batching.FlowController;
import com.google.common.base.Preconditions;
import javax.annotation.Nullable;
/* loaded from: classes7.dex */
public abstract class FlowControlSettings {
    public abstract FlowController.LimitExceededBehavior getLimitExceededBehavior();

    @Nullable
    public abstract Long getMaxOutstandingElementCount();

    @Nullable
    public abstract Long getMaxOutstandingRequestBytes();

    public abstract Builder toBuilder();

    public static FlowControlSettings getDefaultInstance() {
        return newBuilder().build();
    }

    public static Builder newBuilder() {
        return new AutoValue_FlowControlSettings.Builder().setLimitExceededBehavior(FlowController.LimitExceededBehavior.Block);
    }

    /* loaded from: classes7.dex */
    public static abstract class Builder {
        abstract FlowControlSettings autoBuild();

        public abstract Builder setLimitExceededBehavior(FlowController.LimitExceededBehavior limitExceededBehavior);

        public abstract Builder setMaxOutstandingElementCount(Long l);

        public abstract Builder setMaxOutstandingRequestBytes(Long l);

        public FlowControlSettings build() {
            FlowControlSettings autoBuild = autoBuild();
            boolean z = false;
            Preconditions.checkArgument(autoBuild.getMaxOutstandingElementCount() == null || autoBuild.getMaxOutstandingElementCount().longValue() > 0, "maxOutstandingElementCount limit is disabled by default, but if set it must be set to a value greater than 0.");
            if (autoBuild.getMaxOutstandingRequestBytes() == null || autoBuild.getMaxOutstandingRequestBytes().longValue() > 0) {
                z = true;
            }
            Preconditions.checkArgument(z, "maxOutstandingRequestBytes limit is disabled by default, but if set it must be set to a value greater than 0.");
            return autoBuild;
        }
    }
}
