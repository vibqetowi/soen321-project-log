package com.moengage.inapp.internal.exceptions;

import kotlin.Metadata;
import kotlin.jvm.internal.i;
/* compiled from: CouldNotCreateViewException.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00060\u0001j\u0002`\u0002¨\u0006\u0003"}, d2 = {"Lcom/moengage/inapp/internal/exceptions/CouldNotCreateViewException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "inapp_release"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes.dex */
public final class CouldNotCreateViewException extends Exception {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CouldNotCreateViewException(String errorMessage) {
        super(errorMessage);
        i.g(errorMessage, "errorMessage");
    }
}
