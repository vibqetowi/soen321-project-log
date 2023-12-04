package com.google.api.gax.rpc;

import com.google.api.core.BetaApi;
import com.google.api.core.InternalExtensionOnly;
import com.google.api.gax.retrying.RetryingContext;
import com.google.api.gax.tracing.ApiTracer;
import com.google.auth.Credentials;
import java.util.List;
import java.util.Map;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import org.threeten.bp.Duration;
@InternalExtensionOnly
/* loaded from: classes7.dex */
public interface ApiCallContext extends RetryingContext {
    @BetaApi("The surface for extra headers is not stable yet and may change in the future.")
    Map<String, List<String>> getExtraHeaders();

    @BetaApi("The surface for streaming is not stable yet and may change in the future.")
    @Nullable
    Duration getStreamIdleTimeout();

    @BetaApi("The surface for streaming is not stable yet and may change in the future.")
    @Nullable
    Duration getStreamWaitTimeout();

    @Nullable
    Duration getTimeout();

    @Override // com.google.api.gax.retrying.RetryingContext
    @Nonnull
    @BetaApi("The surface for tracing is not stable yet and may change in the future")
    ApiTracer getTracer();

    ApiCallContext merge(ApiCallContext apiCallContext);

    ApiCallContext nullToSelf(ApiCallContext apiCallContext);

    ApiCallContext withCredentials(Credentials credentials);

    @BetaApi("The surface for extra headers is not stable yet and may change in the future.")
    ApiCallContext withExtraHeaders(Map<String, List<String>> map);

    @BetaApi("The surface for streaming is not stable yet and may change in the future.")
    ApiCallContext withStreamIdleTimeout(@Nullable Duration duration);

    @BetaApi("The surface for streaming is not stable yet and may change in the future.")
    ApiCallContext withStreamWaitTimeout(@Nullable Duration duration);

    ApiCallContext withTimeout(@Nullable Duration duration);

    @BetaApi("The surface for tracing is not stable yet and may change in the future")
    ApiCallContext withTracer(@Nonnull ApiTracer apiTracer);

    ApiCallContext withTransportChannel(TransportChannel transportChannel);
}
