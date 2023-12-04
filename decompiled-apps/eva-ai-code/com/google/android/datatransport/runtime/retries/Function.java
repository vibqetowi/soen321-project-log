package com.google.android.datatransport.runtime.retries;

import java.lang.Throwable;
/* loaded from: classes2.dex */
public interface Function<TInput, TResult, TException extends Throwable> {
    TResult apply(TInput tinput) throws Throwable;
}
