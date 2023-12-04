package com.ifriend.core.common.exception.ext;

import com.ifriend.core.common.exception.CoreException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: throwables.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\u0010\u0003\n\u0002\b\u0002\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010\u0003\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0004"}, d2 = {"isConnectionError", "", "", "isForbidden", "common"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ThrowablesKt {
    public static final boolean isForbidden(Throwable th) {
        Intrinsics.checkNotNullParameter(th, "<this>");
        CoreException.NetworkException.ResponseException responseException = th instanceof CoreException.NetworkException.ResponseException ? (CoreException.NetworkException.ResponseException) th : null;
        if (responseException != null) {
            return ExceptionresponsesKt.isForbidden(responseException);
        }
        return false;
    }

    public static final boolean isConnectionError(Throwable th) {
        Intrinsics.checkNotNullParameter(th, "<this>");
        return (th instanceof CoreException.NetworkException.NetworkConnection) || (th instanceof CoreException.NetworkException.TimeoutException);
    }
}
