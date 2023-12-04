package com.google.api.gax.rpc;

import com.google.api.core.ApiFuture;
/* loaded from: classes7.dex */
public interface PagedListResponseFactory<RequestT, ResponseT, PagedListResponseT> {
    ApiFuture<PagedListResponseT> getFuturePagedResponse(UnaryCallable<RequestT, ResponseT> unaryCallable, RequestT requestt, ApiCallContext apiCallContext, ApiFuture<ResponseT> apiFuture);
}
