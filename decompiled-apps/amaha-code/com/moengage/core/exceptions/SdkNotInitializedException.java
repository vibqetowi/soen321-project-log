package com.moengage.core.exceptions;

import kotlin.Metadata;
/* compiled from: SdkNotInitializedException.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00060\u0001j\u0002`\u0002B\t\b\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/moengage/core/exceptions/SdkNotInitializedException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "<init>", "()V", "core_release"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes.dex */
public final class SdkNotInitializedException extends Exception {
    public SdkNotInitializedException() {
        super("SDK is not initialized");
    }

    public SdkNotInitializedException(String str) {
        super(str);
    }
}
