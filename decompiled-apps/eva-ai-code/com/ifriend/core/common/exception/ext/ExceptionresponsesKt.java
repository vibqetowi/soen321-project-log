package com.ifriend.core.common.exception.ext;

import com.ifriend.core.common.exception.CoreException;
import com.ifriend.core.common.exception.HttpErrorCode;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: exceptionresponses.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010\u0003\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010\u0004\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0005"}, d2 = {"isBadRequest", "", "Lcom/ifriend/core/common/exception/CoreException$NetworkException$ResponseException;", "isForbidden", "isPageNotFound", "common"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ExceptionresponsesKt {
    public static final boolean isForbidden(CoreException.NetworkException.ResponseException responseException) {
        Intrinsics.checkNotNullParameter(responseException, "<this>");
        return responseException.getHttpStatus() == HttpErrorCode.FORBIDDEN.getCode();
    }

    public static final boolean isPageNotFound(CoreException.NetworkException.ResponseException responseException) {
        Intrinsics.checkNotNullParameter(responseException, "<this>");
        return responseException.getHttpStatus() == HttpErrorCode.PAGE_NOT_FOUND.getCode();
    }

    public static final boolean isBadRequest(CoreException.NetworkException.ResponseException responseException) {
        Intrinsics.checkNotNullParameter(responseException, "<this>");
        return responseException.getHttpStatus() == HttpErrorCode.BAD_REQUEST.getCode();
    }
}
