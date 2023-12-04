package com.google.api.gax.rpc;

import com.google.api.core.AbstractApiFuture;
import com.google.api.core.InternalApi;
@InternalApi
/* loaded from: classes7.dex */
public class BatchedFuture<ResponseT> extends AbstractApiFuture<ResponseT> {
    public static <T> BatchedFuture<T> create() {
        return new BatchedFuture<>();
    }

    @Override // com.google.api.core.AbstractApiFuture
    public boolean set(ResponseT responset) {
        return super.set(responset);
    }

    @Override // com.google.api.core.AbstractApiFuture
    public boolean setException(Throwable th) {
        return super.setException(th);
    }
}
