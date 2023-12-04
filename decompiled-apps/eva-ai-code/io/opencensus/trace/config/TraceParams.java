package io.opencensus.trace.config;

import io.opencensus.internal.Utils;
import io.opencensus.trace.Sampler;
import io.opencensus.trace.config.AutoValue_TraceParams;
import io.opencensus.trace.samplers.Samplers;
/* loaded from: classes4.dex */
public abstract class TraceParams {
    public static final TraceParams DEFAULT;
    private static final double DEFAULT_PROBABILITY = 1.0E-4d;
    private static final Sampler DEFAULT_SAMPLER;
    private static final int DEFAULT_SPAN_MAX_NUM_ANNOTATIONS = 32;
    private static final int DEFAULT_SPAN_MAX_NUM_ATTRIBUTES = 32;
    private static final int DEFAULT_SPAN_MAX_NUM_LINKS = 32;
    private static final int DEFAULT_SPAN_MAX_NUM_MESSAGE_EVENTS = 128;

    public abstract int getMaxNumberOfAnnotations();

    public abstract int getMaxNumberOfAttributes();

    public abstract int getMaxNumberOfLinks();

    public abstract int getMaxNumberOfMessageEvents();

    public abstract Sampler getSampler();

    public abstract Builder toBuilder();

    static {
        Sampler probabilitySampler = Samplers.probabilitySampler(DEFAULT_PROBABILITY);
        DEFAULT_SAMPLER = probabilitySampler;
        DEFAULT = builder().setSampler(probabilitySampler).setMaxNumberOfAttributes(32).setMaxNumberOfAnnotations(32).setMaxNumberOfMessageEvents(128).setMaxNumberOfLinks(32).build();
    }

    @Deprecated
    public int getMaxNumberOfNetworkEvents() {
        return getMaxNumberOfMessageEvents();
    }

    private static Builder builder() {
        return new AutoValue_TraceParams.Builder();
    }

    /* loaded from: classes4.dex */
    public static abstract class Builder {
        abstract TraceParams autoBuild();

        public abstract Builder setMaxNumberOfAnnotations(int i);

        public abstract Builder setMaxNumberOfAttributes(int i);

        public abstract Builder setMaxNumberOfLinks(int i);

        public abstract Builder setMaxNumberOfMessageEvents(int i);

        public abstract Builder setSampler(Sampler sampler);

        @Deprecated
        public Builder setMaxNumberOfNetworkEvents(int i) {
            return setMaxNumberOfMessageEvents(i);
        }

        public TraceParams build() {
            TraceParams autoBuild = autoBuild();
            Utils.checkArgument(autoBuild.getMaxNumberOfAttributes() > 0, "maxNumberOfAttributes");
            Utils.checkArgument(autoBuild.getMaxNumberOfAnnotations() > 0, "maxNumberOfAnnotations");
            Utils.checkArgument(autoBuild.getMaxNumberOfMessageEvents() > 0, "maxNumberOfMessageEvents");
            Utils.checkArgument(autoBuild.getMaxNumberOfLinks() > 0, "maxNumberOfLinks");
            return autoBuild;
        }
    }
}
