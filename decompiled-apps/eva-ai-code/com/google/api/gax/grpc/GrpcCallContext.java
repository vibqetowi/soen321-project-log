package com.google.api.gax.grpc;

import com.google.api.core.BetaApi;
import com.google.api.core.InternalExtensionOnly;
import com.google.api.gax.rpc.ApiCallContext;
import com.google.api.gax.rpc.TransportChannel;
import com.google.api.gax.rpc.internal.Headers;
import com.google.api.gax.tracing.ApiTracer;
import com.google.api.gax.tracing.NoopApiTracer;
import com.google.auth.Credentials;
import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.UnmodifiableIterator;
import io.grpc.CallCredentials;
import io.grpc.CallOptions;
import io.grpc.Channel;
import io.grpc.Deadline;
import io.grpc.Metadata;
import io.grpc.auth.MoreCallCredentials;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import org.threeten.bp.Duration;
@InternalExtensionOnly
@BetaApi("Reference ApiCallContext instead - this class is likely to experience breaking changes")
/* loaded from: classes7.dex */
public final class GrpcCallContext implements ApiCallContext {
    static final CallOptions.Key<ApiTracer> TRACER_KEY = CallOptions.Key.create("gax.tracer");
    private final CallOptions callOptions;
    private final Channel channel;
    @Nullable
    private final Integer channelAffinity;
    private final ImmutableMap<String, List<String>> extraHeaders;
    @Nullable
    private final Duration streamIdleTimeout;
    @Nullable
    private final Duration streamWaitTimeout;
    @Nullable
    private final Duration timeout;

    @Override // com.google.api.gax.rpc.ApiCallContext
    @BetaApi("The surface for extra headers is not stable yet and may change in the future.")
    public /* bridge */ /* synthetic */ ApiCallContext withExtraHeaders(Map map) {
        return withExtraHeaders((Map<String, List<String>>) map);
    }

    public static GrpcCallContext createDefault() {
        return new GrpcCallContext(null, CallOptions.DEFAULT, null, null, null, null, ImmutableMap.of());
    }

    public static GrpcCallContext of(Channel channel, CallOptions callOptions) {
        return new GrpcCallContext(channel, callOptions, null, null, null, null, ImmutableMap.of());
    }

    private GrpcCallContext(Channel channel, CallOptions callOptions, @Nullable Duration duration, @Nullable Duration duration2, @Nullable Duration duration3, @Nullable Integer num, ImmutableMap<String, List<String>> immutableMap) {
        this.channel = channel;
        this.callOptions = (CallOptions) Preconditions.checkNotNull(callOptions);
        this.timeout = duration;
        this.streamWaitTimeout = duration2;
        this.streamIdleTimeout = duration3;
        this.channelAffinity = num;
        this.extraHeaders = (ImmutableMap) Preconditions.checkNotNull(immutableMap);
    }

    @Override // com.google.api.gax.rpc.ApiCallContext
    public GrpcCallContext nullToSelf(ApiCallContext apiCallContext) {
        if (apiCallContext == null) {
            return this;
        }
        if (!(apiCallContext instanceof GrpcCallContext)) {
            throw new IllegalArgumentException("context must be an instance of GrpcCallContext, but found " + apiCallContext.getClass().getName());
        }
        return (GrpcCallContext) apiCallContext;
    }

    @Override // com.google.api.gax.rpc.ApiCallContext
    public GrpcCallContext withCredentials(Credentials credentials) {
        Preconditions.checkNotNull(credentials);
        return withCallOptions(this.callOptions.withCallCredentials(MoreCallCredentials.from(credentials)));
    }

    @Override // com.google.api.gax.rpc.ApiCallContext
    public GrpcCallContext withTransportChannel(TransportChannel transportChannel) {
        Preconditions.checkNotNull(transportChannel);
        if (!(transportChannel instanceof GrpcTransportChannel)) {
            throw new IllegalArgumentException("Expected GrpcTransportChannel, got " + transportChannel.getClass().getName());
        }
        return withChannel(((GrpcTransportChannel) transportChannel).getChannel());
    }

    @Override // com.google.api.gax.rpc.ApiCallContext
    public GrpcCallContext withTimeout(@Nullable Duration duration) {
        Duration duration2;
        if (duration != null && (duration.isZero() || duration.isNegative())) {
            duration = null;
        }
        Duration duration3 = duration;
        return (duration3 == null || (duration2 = this.timeout) == null || duration2.compareTo(duration3) > 0) ? new GrpcCallContext(this.channel, this.callOptions, duration3, this.streamWaitTimeout, this.streamIdleTimeout, this.channelAffinity, this.extraHeaders) : this;
    }

    @Override // com.google.api.gax.rpc.ApiCallContext
    @Nullable
    public Duration getTimeout() {
        return this.timeout;
    }

    @Override // com.google.api.gax.rpc.ApiCallContext
    public GrpcCallContext withStreamWaitTimeout(@Nullable Duration duration) {
        if (duration != null) {
            Preconditions.checkArgument(duration.compareTo(Duration.ZERO) >= 0, "Invalid timeout: < 0 s");
        }
        return new GrpcCallContext(this.channel, this.callOptions, this.timeout, duration, this.streamIdleTimeout, this.channelAffinity, this.extraHeaders);
    }

    @Override // com.google.api.gax.rpc.ApiCallContext
    public GrpcCallContext withStreamIdleTimeout(@Nullable Duration duration) {
        if (duration != null) {
            Preconditions.checkArgument(duration.compareTo(Duration.ZERO) >= 0, "Invalid timeout: < 0 s");
        }
        return new GrpcCallContext(this.channel, this.callOptions, this.timeout, this.streamWaitTimeout, duration, this.channelAffinity, this.extraHeaders);
    }

    @BetaApi("The surface for channel affinity is not stable yet and may change in the future.")
    public GrpcCallContext withChannelAffinity(@Nullable Integer num) {
        return new GrpcCallContext(this.channel, this.callOptions, this.timeout, this.streamWaitTimeout, this.streamIdleTimeout, num, this.extraHeaders);
    }

    @Override // com.google.api.gax.rpc.ApiCallContext
    @BetaApi("The surface for extra headers is not stable yet and may change in the future.")
    public GrpcCallContext withExtraHeaders(Map<String, List<String>> map) {
        Preconditions.checkNotNull(map);
        return new GrpcCallContext(this.channel, this.callOptions, this.timeout, this.streamWaitTimeout, this.streamIdleTimeout, this.channelAffinity, Headers.mergeHeaders(this.extraHeaders, map));
    }

    @Override // com.google.api.gax.rpc.ApiCallContext
    public ApiCallContext merge(ApiCallContext apiCallContext) {
        if (apiCallContext == null) {
            return this;
        }
        if (!(apiCallContext instanceof GrpcCallContext)) {
            throw new IllegalArgumentException("context must be an instance of GrpcCallContext, but found " + apiCallContext.getClass().getName());
        }
        GrpcCallContext grpcCallContext = (GrpcCallContext) apiCallContext;
        Channel channel = grpcCallContext.channel;
        if (channel == null) {
            channel = this.channel;
        }
        Channel channel2 = channel;
        Deadline deadline = grpcCallContext.callOptions.getDeadline();
        if (deadline == null) {
            deadline = this.callOptions.getDeadline();
        }
        CallCredentials credentials = grpcCallContext.callOptions.getCredentials();
        if (credentials == null) {
            credentials = this.callOptions.getCredentials();
        }
        CallOptions callOptions = grpcCallContext.callOptions;
        CallOptions.Key<ApiTracer> key = TRACER_KEY;
        ApiTracer apiTracer = (ApiTracer) callOptions.getOption(key);
        if (apiTracer == null) {
            apiTracer = (ApiTracer) this.callOptions.getOption(key);
        }
        Duration duration = grpcCallContext.timeout;
        if (duration == null) {
            duration = this.timeout;
        }
        Duration duration2 = grpcCallContext.streamWaitTimeout;
        if (duration2 == null) {
            duration2 = this.streamWaitTimeout;
        }
        Duration duration3 = grpcCallContext.streamIdleTimeout;
        if (duration3 == null) {
            duration3 = this.streamIdleTimeout;
        }
        Integer num = grpcCallContext.channelAffinity;
        if (num == null) {
            num = this.channelAffinity;
        }
        ImmutableMap<String, List<String>> mergeHeaders = Headers.mergeHeaders(this.extraHeaders, grpcCallContext.extraHeaders);
        CallOptions withDeadline = grpcCallContext.callOptions.withCallCredentials(credentials).withDeadline(deadline);
        if (apiTracer != null) {
            withDeadline = withDeadline.withOption(key, apiTracer);
        }
        return new GrpcCallContext(channel2, withDeadline, duration, duration2, duration3, num, mergeHeaders);
    }

    public Channel getChannel() {
        return this.channel;
    }

    public CallOptions getCallOptions() {
        return this.callOptions;
    }

    @Override // com.google.api.gax.rpc.ApiCallContext
    @BetaApi("The surface for streaming is not stable yet and may change in the future.")
    @Nullable
    public Duration getStreamWaitTimeout() {
        return this.streamWaitTimeout;
    }

    @Override // com.google.api.gax.rpc.ApiCallContext
    @BetaApi("The surface for streaming is not stable yet and may change in the future.")
    @Nullable
    public Duration getStreamIdleTimeout() {
        return this.streamIdleTimeout;
    }

    @BetaApi("The surface for channel affinity is not stable yet and may change in the future.")
    @Nullable
    public Integer getChannelAffinity() {
        return this.channelAffinity;
    }

    @Override // com.google.api.gax.rpc.ApiCallContext
    @BetaApi("The surface for extra headers is not stable yet and may change in the future.")
    public Map<String, List<String>> getExtraHeaders() {
        return this.extraHeaders;
    }

    public GrpcCallContext withChannel(Channel channel) {
        return new GrpcCallContext(channel, this.callOptions, this.timeout, this.streamWaitTimeout, this.streamIdleTimeout, this.channelAffinity, this.extraHeaders);
    }

    public GrpcCallContext withCallOptions(CallOptions callOptions) {
        return new GrpcCallContext(this.channel, callOptions, this.timeout, this.streamWaitTimeout, this.streamIdleTimeout, this.channelAffinity, this.extraHeaders);
    }

    public GrpcCallContext withRequestParamsDynamicHeaderOption(String str) {
        return withCallOptions(CallOptionsUtil.putRequestParamsDynamicHeaderOption(this.callOptions, str));
    }

    @Override // com.google.api.gax.rpc.ApiCallContext, com.google.api.gax.retrying.RetryingContext
    @Nonnull
    public ApiTracer getTracer() {
        ApiTracer apiTracer = (ApiTracer) this.callOptions.getOption(TRACER_KEY);
        return apiTracer == null ? NoopApiTracer.getInstance() : apiTracer;
    }

    @Override // com.google.api.gax.rpc.ApiCallContext
    public GrpcCallContext withTracer(@Nonnull ApiTracer apiTracer) {
        Preconditions.checkNotNull(apiTracer);
        return withCallOptions(this.callOptions.withOption(TRACER_KEY, apiTracer));
    }

    public int hashCode() {
        return Objects.hash(this.channel, this.callOptions, this.timeout, this.streamWaitTimeout, this.streamIdleTimeout, this.channelAffinity, this.extraHeaders);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        GrpcCallContext grpcCallContext = (GrpcCallContext) obj;
        return Objects.equals(this.channel, grpcCallContext.channel) && Objects.equals(this.callOptions, grpcCallContext.callOptions) && Objects.equals(this.timeout, grpcCallContext.timeout) && Objects.equals(this.streamWaitTimeout, grpcCallContext.streamWaitTimeout) && Objects.equals(this.streamIdleTimeout, grpcCallContext.streamIdleTimeout) && Objects.equals(this.channelAffinity, grpcCallContext.channelAffinity) && Objects.equals(this.extraHeaders, grpcCallContext.extraHeaders);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Metadata getMetadata() {
        Metadata metadata = new Metadata();
        UnmodifiableIterator<Map.Entry<String, List<String>>> it = this.extraHeaders.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<String, List<String>> next = it.next();
            String key = next.getKey();
            for (String str : next.getValue()) {
                metadata.put(Metadata.Key.of(key, Metadata.ASCII_STRING_MARSHALLER), str);
            }
        }
        return metadata;
    }
}
