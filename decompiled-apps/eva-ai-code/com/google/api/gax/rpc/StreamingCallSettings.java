package com.google.api.gax.rpc;

import com.google.api.core.BetaApi;
import com.google.api.core.InternalExtensionOnly;
@InternalExtensionOnly
@BetaApi("The surface for streaming is not stable yet and may change in the future.")
/* loaded from: classes7.dex */
public class StreamingCallSettings<RequestT, ResponseT> {
    public static <RequestT, ResponseT> Builder<RequestT, ResponseT> newBuilder() {
        return new Builder<>();
    }

    public Builder<RequestT, ResponseT> toBuilder() {
        return new Builder<>(this);
    }

    /* loaded from: classes7.dex */
    public static class Builder<RequestT, ResponseT> {
        public Builder() {
        }

        public Builder(StreamingCallSettings<RequestT, ResponseT> streamingCallSettings) {
        }

        public StreamingCallSettings<RequestT, ResponseT> build() {
            return new StreamingCallSettings<>();
        }
    }
}
