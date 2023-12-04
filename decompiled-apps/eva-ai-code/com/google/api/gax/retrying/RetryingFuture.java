package com.google.api.gax.retrying;

import com.google.api.core.ApiFuture;
import java.util.concurrent.Callable;
/* loaded from: classes7.dex */
public interface RetryingFuture<ResponseT> extends ApiFuture<ResponseT> {
    ApiFuture<ResponseT> getAttemptResult();

    TimedAttemptSettings getAttemptSettings();

    Callable<ResponseT> getCallable();

    ApiFuture<ResponseT> peekAttemptResult();

    void setAttemptFuture(ApiFuture<ResponseT> apiFuture);
}
