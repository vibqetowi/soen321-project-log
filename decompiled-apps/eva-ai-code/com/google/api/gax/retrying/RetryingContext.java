package com.google.api.gax.retrying;

import com.google.api.core.BetaApi;
import com.google.api.gax.tracing.ApiTracer;
import javax.annotation.Nonnull;
@BetaApi("The surface for passing per operation state is not yet stable")
/* loaded from: classes7.dex */
public interface RetryingContext {
    @Nonnull
    ApiTracer getTracer();
}
