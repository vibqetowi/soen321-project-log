package com.google.api.gax.retrying;

import com.google.api.gax.tracing.ApiTracer;
import com.google.api.gax.tracing.NoopApiTracer;
import javax.annotation.Nonnull;
/* loaded from: classes7.dex */
class NoopRetryingContext implements RetryingContext {
    NoopRetryingContext() {
    }

    public static RetryingContext create() {
        return new NoopRetryingContext();
    }

    @Override // com.google.api.gax.retrying.RetryingContext
    @Nonnull
    public ApiTracer getTracer() {
        return NoopApiTracer.getInstance();
    }
}
