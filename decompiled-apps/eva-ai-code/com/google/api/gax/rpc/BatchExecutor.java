package com.google.api.gax.rpc;

import com.google.api.core.ApiFuture;
import com.google.api.core.ApiFutureCallback;
import com.google.api.core.ApiFutures;
import com.google.api.gax.batching.PartitionKey;
import com.google.api.gax.batching.ThresholdBatchReceiver;
import com.google.common.base.Preconditions;
import com.google.common.util.concurrent.MoreExecutors;
import java.util.List;
/* loaded from: classes7.dex */
class BatchExecutor<RequestT, ResponseT> implements ThresholdBatchReceiver<Batch<RequestT, ResponseT>> {
    private final BatchingDescriptor<RequestT, ResponseT> batchingDescriptor;
    private final PartitionKey partitionKey;

    @Override // com.google.api.gax.batching.ThresholdBatchReceiver
    public /* bridge */ /* synthetic */ ApiFuture processBatch(Object obj) {
        return processBatch((Batch) ((Batch) obj));
    }

    @Override // com.google.api.gax.batching.ThresholdBatchReceiver
    public /* bridge */ /* synthetic */ void validateBatch(Object obj) {
        validateBatch((Batch) ((Batch) obj));
    }

    public BatchExecutor(BatchingDescriptor<RequestT, ResponseT> batchingDescriptor, PartitionKey partitionKey) {
        this.batchingDescriptor = (BatchingDescriptor) Preconditions.checkNotNull(batchingDescriptor);
        this.partitionKey = (PartitionKey) Preconditions.checkNotNull(partitionKey);
    }

    public void validateBatch(Batch<RequestT, ResponseT> batch) {
        PartitionKey batchPartitionKey = this.batchingDescriptor.getBatchPartitionKey(batch.getRequest());
        if (!batchPartitionKey.equals(this.partitionKey)) {
            throw new IllegalArgumentException(String.format("For type %s, invalid partition key: %s, should be: %s", batch.getRequest().getClass().getSimpleName(), batchPartitionKey, this.partitionKey));
        }
    }

    public ApiFuture<ResponseT> processBatch(Batch<RequestT, ResponseT> batch) {
        UnaryCallable<RequestT, ResponseT> callable = batch.getCallable();
        RequestT request = batch.getRequest();
        final List<BatchedRequestIssuer<ResponseT>> requestIssuerList = batch.getRequestIssuerList();
        ApiFuture<ResponseT> futureCall = callable.futureCall(request);
        ApiFutures.addCallback(futureCall, new ApiFutureCallback<ResponseT>() { // from class: com.google.api.gax.rpc.BatchExecutor.1
            @Override // com.google.api.core.ApiFutureCallback
            public void onSuccess(ResponseT responset) {
                BatchExecutor.this.batchingDescriptor.splitResponse(responset, requestIssuerList);
                for (BatchedRequestIssuer batchedRequestIssuer : requestIssuerList) {
                    batchedRequestIssuer.sendResult();
                }
            }

            @Override // com.google.api.core.ApiFutureCallback
            public void onFailure(Throwable th) {
                BatchExecutor.this.batchingDescriptor.splitException(th, requestIssuerList);
                for (BatchedRequestIssuer batchedRequestIssuer : requestIssuerList) {
                    batchedRequestIssuer.sendResult();
                }
            }
        }, MoreExecutors.directExecutor());
        return futureCall;
    }
}
