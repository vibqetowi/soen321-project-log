package io.opencensus.tags.propagation;
/* loaded from: classes4.dex */
public abstract class TagPropagationComponent {
    public abstract TagContextBinarySerializer getBinarySerializer();

    public abstract TagContextTextFormat getCorrelationContextFormat();
}
