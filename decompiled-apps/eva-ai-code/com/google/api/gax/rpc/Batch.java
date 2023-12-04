package com.google.api.gax.rpc;

import com.google.api.core.InternalApi;
import com.google.api.gax.batching.BatchMerger;
import com.google.api.gax.batching.ElementCounter;
import com.google.api.gax.batching.RequestBuilder;
import java.util.ArrayList;
import java.util.List;
@InternalApi
/* loaded from: classes7.dex */
public class Batch<RequestT, ResponseT> {
    private long byteCount;
    private UnaryCallable<RequestT, ResponseT> callable;
    private final RequestBuilder<RequestT> requestBuilder;
    private final List<BatchedRequestIssuer<ResponseT>> requestIssuerList;

    public Batch(BatchingDescriptor<RequestT, ResponseT> batchingDescriptor, RequestT requestt, UnaryCallable<RequestT, ResponseT> unaryCallable, BatchedFuture<ResponseT> batchedFuture) {
        RequestBuilder<RequestT> requestBuilder = batchingDescriptor.getRequestBuilder();
        this.requestBuilder = requestBuilder;
        ArrayList arrayList = new ArrayList();
        this.requestIssuerList = arrayList;
        requestBuilder.appendRequest(requestt);
        this.callable = unaryCallable;
        arrayList.add(new BatchedRequestIssuer(batchedFuture, batchingDescriptor.countElements(requestt)));
        this.byteCount = batchingDescriptor.countBytes(requestt);
    }

    public RequestT getRequest() {
        return this.requestBuilder.build();
    }

    public UnaryCallable<RequestT, ResponseT> getCallable() {
        return this.callable;
    }

    public List<BatchedRequestIssuer<ResponseT>> getRequestIssuerList() {
        return this.requestIssuerList;
    }

    public long getByteCount() {
        return this.byteCount;
    }

    public void merge(Batch<RequestT, ResponseT> batch) {
        this.requestBuilder.appendRequest(batch.getRequest());
        this.requestIssuerList.addAll(batch.requestIssuerList);
        if (this.callable == null) {
            this.callable = batch.callable;
        }
        this.byteCount += batch.byteCount;
    }

    /* loaded from: classes7.dex */
    static class BatchElementCounter<RequestT, ResponseT> implements ElementCounter<Batch<RequestT, ResponseT>> {
        private final BatchingDescriptor<RequestT, ResponseT> batchingDescriptor;

        @Override // com.google.api.gax.batching.ElementCounter
        public /* bridge */ /* synthetic */ long count(Object obj) {
            return count((Batch) ((Batch) obj));
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public BatchElementCounter(BatchingDescriptor<RequestT, ResponseT> batchingDescriptor) {
            this.batchingDescriptor = batchingDescriptor;
        }

        public long count(Batch<RequestT, ResponseT> batch) {
            return this.batchingDescriptor.countElements(batch.getRequest());
        }
    }

    /* loaded from: classes7.dex */
    static class BatchByteCounter<RequestT, ResponseT> implements ElementCounter<Batch<RequestT, ResponseT>> {
        @Override // com.google.api.gax.batching.ElementCounter
        public /* bridge */ /* synthetic */ long count(Object obj) {
            return count((Batch) ((Batch) obj));
        }

        public long count(Batch<RequestT, ResponseT> batch) {
            return batch.getByteCount();
        }
    }

    /* loaded from: classes7.dex */
    static class BatchMergerImpl<RequestT, ResponseT> implements BatchMerger<Batch<RequestT, ResponseT>> {
        @Override // com.google.api.gax.batching.BatchMerger
        public /* bridge */ /* synthetic */ void merge(Object obj, Object obj2) {
            merge((Batch) ((Batch) obj), (Batch) ((Batch) obj2));
        }

        public void merge(Batch<RequestT, ResponseT> batch, Batch<RequestT, ResponseT> batch2) {
            batch.merge(batch2);
        }
    }
}
