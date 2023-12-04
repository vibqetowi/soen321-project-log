package com.google.api.gax.rpc;
/* loaded from: classes7.dex */
public interface PagedListDescriptor<RequestT, ResponseT, ResourceT> {
    String emptyToken();

    String extractNextToken(ResponseT responset);

    Integer extractPageSize(RequestT requestt);

    Iterable<ResourceT> extractResources(ResponseT responset);

    RequestT injectPageSize(RequestT requestt, int i);

    RequestT injectToken(RequestT requestt, String str);
}
