package com.ifriend.presentation.common.exception;

import com.ifriend.core.common.exception.CoreException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import retrofit2.HttpException;
/* compiled from: throwables.kt */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000b\n\u0002\u0010\u0003\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, d2 = {"isUnauthorized", "", "", "presentation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ThrowablesKt {
    public static final boolean isUnauthorized(Throwable th) {
        Intrinsics.checkNotNullParameter(th, "<this>");
        if (th instanceof CoreException.NetworkException.Unauthorized) {
            return true;
        }
        HttpException httpException = th instanceof HttpException ? (HttpException) th : null;
        return httpException != null && httpException.code() == 401;
    }
}
