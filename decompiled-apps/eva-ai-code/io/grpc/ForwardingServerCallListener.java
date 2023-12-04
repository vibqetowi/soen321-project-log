package io.grpc;

import io.grpc.ServerCall;
/* loaded from: classes4.dex */
public abstract class ForwardingServerCallListener<ReqT> extends PartialForwardingServerCallListener<ReqT> {
    @Override // io.grpc.PartialForwardingServerCallListener
    protected abstract ServerCall.Listener<ReqT> delegate();

    @Override // io.grpc.PartialForwardingServerCallListener, io.grpc.ServerCall.Listener
    public /* bridge */ /* synthetic */ void onCancel() {
        super.onCancel();
    }

    @Override // io.grpc.PartialForwardingServerCallListener, io.grpc.ServerCall.Listener
    public /* bridge */ /* synthetic */ void onComplete() {
        super.onComplete();
    }

    @Override // io.grpc.PartialForwardingServerCallListener, io.grpc.ServerCall.Listener
    public /* bridge */ /* synthetic */ void onHalfClose() {
        super.onHalfClose();
    }

    @Override // io.grpc.PartialForwardingServerCallListener, io.grpc.ServerCall.Listener
    public /* bridge */ /* synthetic */ void onReady() {
        super.onReady();
    }

    @Override // io.grpc.PartialForwardingServerCallListener
    public /* bridge */ /* synthetic */ String toString() {
        return super.toString();
    }

    @Override // io.grpc.ServerCall.Listener
    public void onMessage(ReqT reqt) {
        delegate().onMessage(reqt);
    }

    /* loaded from: classes4.dex */
    public static abstract class SimpleForwardingServerCallListener<ReqT> extends ForwardingServerCallListener<ReqT> {
        private final ServerCall.Listener<ReqT> delegate;

        @Override // io.grpc.ForwardingServerCallListener, io.grpc.PartialForwardingServerCallListener, io.grpc.ServerCall.Listener
        public /* bridge */ /* synthetic */ void onCancel() {
            super.onCancel();
        }

        @Override // io.grpc.ForwardingServerCallListener, io.grpc.PartialForwardingServerCallListener, io.grpc.ServerCall.Listener
        public /* bridge */ /* synthetic */ void onComplete() {
            super.onComplete();
        }

        @Override // io.grpc.ForwardingServerCallListener, io.grpc.PartialForwardingServerCallListener, io.grpc.ServerCall.Listener
        public /* bridge */ /* synthetic */ void onHalfClose() {
            super.onHalfClose();
        }

        @Override // io.grpc.ForwardingServerCallListener, io.grpc.PartialForwardingServerCallListener, io.grpc.ServerCall.Listener
        public /* bridge */ /* synthetic */ void onReady() {
            super.onReady();
        }

        @Override // io.grpc.ForwardingServerCallListener, io.grpc.PartialForwardingServerCallListener
        public /* bridge */ /* synthetic */ String toString() {
            return super.toString();
        }

        /* JADX INFO: Access modifiers changed from: protected */
        public SimpleForwardingServerCallListener(ServerCall.Listener<ReqT> listener) {
            this.delegate = listener;
        }

        @Override // io.grpc.ForwardingServerCallListener, io.grpc.PartialForwardingServerCallListener
        protected ServerCall.Listener<ReqT> delegate() {
            return this.delegate;
        }
    }
}
