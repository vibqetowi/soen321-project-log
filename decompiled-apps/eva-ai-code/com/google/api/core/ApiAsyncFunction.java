package com.google.api.core;
/* loaded from: classes7.dex */
public interface ApiAsyncFunction<I, O> {
    ApiFuture<O> apply(I i) throws Exception;
}
