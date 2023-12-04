package io.grpc.netty.shaded.io.netty.handler.codec.http.websocketx;

import io.grpc.netty.shaded.io.netty.util.internal.ObjectUtil;
/* loaded from: classes4.dex */
public final class WebSocketDecoderConfig {
    static final WebSocketDecoderConfig DEFAULT = new WebSocketDecoderConfig(65536, true, false, false, true, true);
    private final boolean allowExtensions;
    private final boolean allowMaskMismatch;
    private final boolean closeOnProtocolViolation;
    private final boolean expectMaskedFrames;
    private final int maxFramePayloadLength;
    private final boolean withUTF8Validator;

    private WebSocketDecoderConfig(int i, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        this.maxFramePayloadLength = i;
        this.expectMaskedFrames = z;
        this.allowMaskMismatch = z2;
        this.allowExtensions = z3;
        this.closeOnProtocolViolation = z4;
        this.withUTF8Validator = z5;
    }

    public int maxFramePayloadLength() {
        return this.maxFramePayloadLength;
    }

    public boolean expectMaskedFrames() {
        return this.expectMaskedFrames;
    }

    public boolean allowMaskMismatch() {
        return this.allowMaskMismatch;
    }

    public boolean allowExtensions() {
        return this.allowExtensions;
    }

    public boolean closeOnProtocolViolation() {
        return this.closeOnProtocolViolation;
    }

    public boolean withUTF8Validator() {
        return this.withUTF8Validator;
    }

    public String toString() {
        return "WebSocketDecoderConfig [maxFramePayloadLength=" + this.maxFramePayloadLength + ", expectMaskedFrames=" + this.expectMaskedFrames + ", allowMaskMismatch=" + this.allowMaskMismatch + ", allowExtensions=" + this.allowExtensions + ", closeOnProtocolViolation=" + this.closeOnProtocolViolation + ", withUTF8Validator=" + this.withUTF8Validator + "]";
    }

    public Builder toBuilder() {
        return new Builder();
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    /* loaded from: classes4.dex */
    public static final class Builder {
        private boolean allowExtensions;
        private boolean allowMaskMismatch;
        private boolean closeOnProtocolViolation;
        private boolean expectMaskedFrames;
        private int maxFramePayloadLength;
        private boolean withUTF8Validator;

        private Builder(WebSocketDecoderConfig webSocketDecoderConfig) {
            ObjectUtil.checkNotNull(webSocketDecoderConfig, "decoderConfig");
            this.maxFramePayloadLength = webSocketDecoderConfig.maxFramePayloadLength();
            this.expectMaskedFrames = webSocketDecoderConfig.expectMaskedFrames();
            this.allowMaskMismatch = webSocketDecoderConfig.allowMaskMismatch();
            this.allowExtensions = webSocketDecoderConfig.allowExtensions();
            this.closeOnProtocolViolation = webSocketDecoderConfig.closeOnProtocolViolation();
            this.withUTF8Validator = webSocketDecoderConfig.withUTF8Validator();
        }

        public Builder maxFramePayloadLength(int i) {
            this.maxFramePayloadLength = i;
            return this;
        }

        public Builder expectMaskedFrames(boolean z) {
            this.expectMaskedFrames = z;
            return this;
        }

        public Builder allowMaskMismatch(boolean z) {
            this.allowMaskMismatch = z;
            return this;
        }

        public Builder allowExtensions(boolean z) {
            this.allowExtensions = z;
            return this;
        }

        public Builder closeOnProtocolViolation(boolean z) {
            this.closeOnProtocolViolation = z;
            return this;
        }

        public Builder withUTF8Validator(boolean z) {
            this.withUTF8Validator = z;
            return this;
        }

        public WebSocketDecoderConfig build() {
            return new WebSocketDecoderConfig(this.maxFramePayloadLength, this.expectMaskedFrames, this.allowMaskMismatch, this.allowExtensions, this.closeOnProtocolViolation, this.withUTF8Validator);
        }
    }
}
