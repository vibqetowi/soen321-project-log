package com.google.api.gax.rpc;

import com.google.api.core.ApiFuture;
import com.google.common.util.concurrent.Futures;
import com.google.common.util.concurrent.UncheckedExecutionException;
/* loaded from: classes7.dex */
public class ApiExceptions {
    private ApiExceptions() {
    }

    public static <ResponseT> ResponseT callAndTranslateApiException(ApiFuture<ResponseT> apiFuture) {
        try {
            return (ResponseT) Futures.getUnchecked(apiFuture);
        } catch (UncheckedExecutionException e) {
            if (e.getCause() instanceof RuntimeException) {
                RuntimeException runtimeException = (RuntimeException) e.getCause();
                runtimeException.addSuppressed(new AsyncTaskException());
                throw runtimeException;
            }
            throw e;
        }
    }
}
