package io.grpc.okhttp;

import com.google.common.base.Preconditions;
import com.google.common.io.BaseEncoding;
import com.google.firebase.sessions.settings.RemoteSettings;
import io.grpc.Attributes;
import io.grpc.CallOptions;
import io.grpc.Metadata;
import io.grpc.MethodDescriptor;
import io.grpc.Status;
import io.grpc.internal.AbstractClientStream;
import io.grpc.internal.ClientStreamListener;
import io.grpc.internal.Http2ClientStreamTransportState;
import io.grpc.internal.StatsTraceContext;
import io.grpc.internal.TransportTracer;
import io.grpc.internal.WritableBuffer;
import io.grpc.okhttp.internal.framed.ErrorCode;
import io.grpc.okhttp.internal.framed.Header;
import io.perfmark.PerfMark;
import io.perfmark.Tag;
import java.util.List;
import okio.Buffer;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public class OkHttpClientStream extends AbstractClientStream {
    public static final int ABSENT_ID = -1;
    private static final Buffer EMPTY_BUFFER = new Buffer();
    private final Attributes attributes;
    private String authority;
    private volatile int id;
    private final MethodDescriptor<?, ?> method;
    private Object outboundFlowState;
    private final Sink sink;
    private final TransportState state;
    private final StatsTraceContext statsTraceCtx;
    private boolean useGet;
    private final String userAgent;

    /* JADX INFO: Access modifiers changed from: package-private */
    public OkHttpClientStream(MethodDescriptor<?, ?> methodDescriptor, Metadata metadata, ExceptionHandlingFrameWriter exceptionHandlingFrameWriter, OkHttpClientTransport okHttpClientTransport, OutboundFlowController outboundFlowController, Object obj, int i, int i2, String str, String str2, StatsTraceContext statsTraceContext, TransportTracer transportTracer, CallOptions callOptions, boolean z) {
        super(new OkHttpWritableBufferAllocator(), statsTraceContext, transportTracer, metadata, callOptions, z && methodDescriptor.isSafe());
        this.id = -1;
        this.sink = new Sink();
        this.useGet = false;
        this.statsTraceCtx = (StatsTraceContext) Preconditions.checkNotNull(statsTraceContext, "statsTraceCtx");
        this.method = methodDescriptor;
        this.authority = str;
        this.userAgent = str2;
        this.attributes = okHttpClientTransport.getAttributes();
        this.state = new TransportState(i, statsTraceContext, obj, exceptionHandlingFrameWriter, outboundFlowController, okHttpClientTransport, i2, methodDescriptor.getFullMethodName());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // io.grpc.internal.AbstractClientStream, io.grpc.internal.AbstractStream
    public TransportState transportState() {
        return this.state;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // io.grpc.internal.AbstractClientStream
    public Sink abstractClientStreamSink() {
        return this.sink;
    }

    public MethodDescriptor.MethodType getType() {
        return this.method.getType();
    }

    public int id() {
        return this.id;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean useGet() {
        return this.useGet;
    }

    @Override // io.grpc.internal.ClientStream
    public void setAuthority(String str) {
        this.authority = (String) Preconditions.checkNotNull(str, "authority");
    }

    @Override // io.grpc.internal.ClientStream
    public Attributes getAttributes() {
        return this.attributes;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class Sink implements AbstractClientStream.Sink {
        Sink() {
        }

        @Override // io.grpc.internal.AbstractClientStream.Sink
        public void writeHeaders(Metadata metadata, byte[] bArr) {
            PerfMark.startTask("OkHttpClientStream$Sink.writeHeaders");
            String str = RemoteSettings.FORWARD_SLASH_STRING + OkHttpClientStream.this.method.getFullMethodName();
            if (bArr != null) {
                OkHttpClientStream.this.useGet = true;
                str = str + "?" + BaseEncoding.base64().encode(bArr);
            }
            try {
                synchronized (OkHttpClientStream.this.state.lock) {
                    OkHttpClientStream.this.state.streamReady(metadata, str);
                }
            } finally {
                PerfMark.stopTask("OkHttpClientStream$Sink.writeHeaders");
            }
        }

        @Override // io.grpc.internal.AbstractClientStream.Sink
        public void writeFrame(WritableBuffer writableBuffer, boolean z, boolean z2, int i) {
            Buffer buffer;
            PerfMark.startTask("OkHttpClientStream$Sink.writeFrame");
            if (writableBuffer == null) {
                buffer = OkHttpClientStream.EMPTY_BUFFER;
            } else {
                buffer = ((OkHttpWritableBuffer) writableBuffer).buffer();
                int size = (int) buffer.size();
                if (size > 0) {
                    OkHttpClientStream.this.onSendingBytes(size);
                }
            }
            try {
                synchronized (OkHttpClientStream.this.state.lock) {
                    OkHttpClientStream.this.state.sendBuffer(buffer, z, z2);
                    OkHttpClientStream.this.getTransportTracer().reportMessageSent(i);
                }
            } finally {
                PerfMark.stopTask("OkHttpClientStream$Sink.writeFrame");
            }
        }

        @Override // io.grpc.internal.AbstractClientStream.Sink
        public void cancel(Status status) {
            PerfMark.startTask("OkHttpClientStream$Sink.cancel");
            try {
                synchronized (OkHttpClientStream.this.state.lock) {
                    OkHttpClientStream.this.state.cancel(status, true, null);
                }
            } finally {
                PerfMark.stopTask("OkHttpClientStream$Sink.cancel");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class TransportState extends Http2ClientStreamTransportState {
        private boolean canStart;
        private boolean cancelSent;
        private boolean flushPendingData;
        private final ExceptionHandlingFrameWriter frameWriter;
        private final int initialWindowSize;
        private final Object lock;
        private final OutboundFlowController outboundFlow;
        private Buffer pendingData;
        private boolean pendingDataHasEndOfStream;
        private int processedWindow;
        private List<Header> requestHeaders;
        private final Tag tag;
        private final OkHttpClientTransport transport;
        private int window;

        public TransportState(int i, StatsTraceContext statsTraceContext, Object obj, ExceptionHandlingFrameWriter exceptionHandlingFrameWriter, OutboundFlowController outboundFlowController, OkHttpClientTransport okHttpClientTransport, int i2, String str) {
            super(i, statsTraceContext, OkHttpClientStream.this.getTransportTracer());
            this.pendingData = new Buffer();
            this.pendingDataHasEndOfStream = false;
            this.flushPendingData = false;
            this.cancelSent = false;
            this.canStart = true;
            this.lock = Preconditions.checkNotNull(obj, "lock");
            this.frameWriter = exceptionHandlingFrameWriter;
            this.outboundFlow = outboundFlowController;
            this.transport = okHttpClientTransport;
            this.window = i2;
            this.processedWindow = i2;
            this.initialWindowSize = i2;
            this.tag = PerfMark.createTag(str);
        }

        public void start(int i) {
            Preconditions.checkState(OkHttpClientStream.this.id == -1, "the stream has been started with id %s", i);
            OkHttpClientStream.this.id = i;
            OkHttpClientStream.this.state.onStreamAllocated();
            if (this.canStart) {
                this.frameWriter.synStream(OkHttpClientStream.this.useGet, false, OkHttpClientStream.this.id, 0, this.requestHeaders);
                OkHttpClientStream.this.statsTraceCtx.clientOutboundHeaders();
                this.requestHeaders = null;
                if (this.pendingData.size() > 0) {
                    this.outboundFlow.data(this.pendingDataHasEndOfStream, OkHttpClientStream.this.id, this.pendingData, this.flushPendingData);
                }
                this.canStart = false;
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // io.grpc.internal.AbstractStream.TransportState
        public void onStreamAllocated() {
            super.onStreamAllocated();
            getTransportTracer().reportLocalStreamStarted();
        }

        @Override // io.grpc.internal.Http2ClientStreamTransportState
        protected void http2ProcessingFailed(Status status, boolean z, Metadata metadata) {
            cancel(status, z, metadata);
        }

        @Override // io.grpc.internal.MessageDeframer.Listener
        public void deframeFailed(Throwable th) {
            http2ProcessingFailed(Status.fromThrowable(th), true, new Metadata());
        }

        @Override // io.grpc.internal.MessageDeframer.Listener
        public void bytesRead(int i) {
            int i2 = this.processedWindow - i;
            this.processedWindow = i2;
            int i3 = this.initialWindowSize;
            if (i2 <= i3 * 0.5f) {
                int i4 = i3 - i2;
                this.window += i4;
                this.processedWindow = i2 + i4;
                this.frameWriter.windowUpdate(OkHttpClientStream.this.id(), i4);
            }
        }

        @Override // io.grpc.internal.Http2ClientStreamTransportState, io.grpc.internal.AbstractClientStream.TransportState, io.grpc.internal.MessageDeframer.Listener
        public void deframerClosed(boolean z) {
            onEndOfStream();
            super.deframerClosed(z);
        }

        @Override // io.grpc.internal.ApplicationThreadDeframerListener.TransportExecutor
        public void runOnTransportThread(Runnable runnable) {
            synchronized (this.lock) {
                runnable.run();
            }
        }

        public void transportHeadersReceived(List<Header> list, boolean z) {
            if (z) {
                transportTrailersReceived(Utils.convertTrailers(list));
            } else {
                transportHeadersReceived(Utils.convertHeaders(list));
            }
        }

        public void transportDataReceived(Buffer buffer, boolean z) {
            int size = this.window - ((int) buffer.size());
            this.window = size;
            if (size < 0) {
                this.frameWriter.rstStream(OkHttpClientStream.this.id(), ErrorCode.FLOW_CONTROL_ERROR);
                this.transport.finishStream(OkHttpClientStream.this.id(), Status.INTERNAL.withDescription("Received data size exceeded our receiving window size"), ClientStreamListener.RpcProgress.PROCESSED, false, null, null);
                return;
            }
            super.transportDataReceived(new OkHttpReadableBuffer(buffer), z);
        }

        private void onEndOfStream() {
            if (!isOutboundClosed()) {
                this.transport.finishStream(OkHttpClientStream.this.id(), null, ClientStreamListener.RpcProgress.PROCESSED, false, ErrorCode.CANCEL, null);
            } else {
                this.transport.finishStream(OkHttpClientStream.this.id(), null, ClientStreamListener.RpcProgress.PROCESSED, false, null, null);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void cancel(Status status, boolean z, Metadata metadata) {
            if (this.cancelSent) {
                return;
            }
            this.cancelSent = true;
            if (this.canStart) {
                this.transport.removePendingStream(OkHttpClientStream.this);
                this.requestHeaders = null;
                this.pendingData.clear();
                this.canStart = false;
                if (metadata == null) {
                    metadata = new Metadata();
                }
                transportReportStatus(status, true, metadata);
                return;
            }
            this.transport.finishStream(OkHttpClientStream.this.id(), status, ClientStreamListener.RpcProgress.PROCESSED, z, ErrorCode.CANCEL, metadata);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void sendBuffer(Buffer buffer, boolean z, boolean z2) {
            if (this.cancelSent) {
                return;
            }
            if (this.canStart) {
                this.pendingData.write(buffer, (int) buffer.size());
                this.pendingDataHasEndOfStream |= z;
                this.flushPendingData |= z2;
                return;
            }
            Preconditions.checkState(OkHttpClientStream.this.id() != -1, "streamId should be set");
            this.outboundFlow.data(z, OkHttpClientStream.this.id(), buffer, z2);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void streamReady(Metadata metadata, String str) {
            this.requestHeaders = Headers.createRequestHeaders(metadata, str, OkHttpClientStream.this.authority, OkHttpClientStream.this.userAgent, OkHttpClientStream.this.useGet, this.transport.isUsingPlaintext());
            this.transport.streamReadyToStart(OkHttpClientStream.this);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public Tag tag() {
            return this.tag;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setOutboundFlowState(Object obj) {
        this.outboundFlowState = obj;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Object getOutboundFlowState() {
        return this.outboundFlowState;
    }
}
