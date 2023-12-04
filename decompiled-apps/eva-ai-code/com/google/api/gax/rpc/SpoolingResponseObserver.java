package com.google.api.gax.rpc;

import com.google.api.core.AbstractApiFuture;
import com.google.api.core.ApiFuture;
import com.google.common.collect.Lists;
import java.util.List;
/* loaded from: classes7.dex */
class SpoolingResponseObserver<ResponseT> extends StateCheckingResponseObserver<ResponseT> {
    private StreamController controller;
    private final SpoolingResponseObserver<ResponseT>.MyFuture future = new MyFuture();
    private final List<ResponseT> buffer = Lists.newArrayList();

    /* JADX INFO: Access modifiers changed from: package-private */
    public ApiFuture<List<ResponseT>> getFuture() {
        return this.future;
    }

    @Override // com.google.api.gax.rpc.StateCheckingResponseObserver
    protected void onStartImpl(StreamController streamController) {
        this.controller = streamController;
    }

    @Override // com.google.api.gax.rpc.StateCheckingResponseObserver
    protected void onResponseImpl(ResponseT responset) {
        this.buffer.add(responset);
    }

    @Override // com.google.api.gax.rpc.StateCheckingResponseObserver
    protected void onErrorImpl(Throwable th) {
        this.future.setException(th);
    }

    @Override // com.google.api.gax.rpc.StateCheckingResponseObserver
    protected void onCompleteImpl() {
        this.future.set((List) this.buffer);
    }

    /* loaded from: classes7.dex */
    class MyFuture extends AbstractApiFuture<List<ResponseT>> {
        MyFuture() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.api.core.AbstractApiFuture
        public /* bridge */ /* synthetic */ boolean set(Object obj) {
            return set((List) ((List) obj));
        }

        @Override // com.google.api.core.AbstractApiFuture
        protected void interruptTask() {
            SpoolingResponseObserver.this.controller.cancel();
        }

        protected boolean set(List<ResponseT> list) {
            return super.set((MyFuture) list);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.api.core.AbstractApiFuture
        public boolean setException(Throwable th) {
            return super.setException(th);
        }
    }
}
