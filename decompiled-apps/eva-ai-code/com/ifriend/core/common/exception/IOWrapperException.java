package com.ifriend.core.common.exception;

import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: IOWrapperException.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/ifriend/core/common/exception/IOWrapperException;", "Ljava/io/IOException;", "cause", "", "(Ljava/lang/Throwable;)V", "common"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class IOWrapperException extends IOException {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IOWrapperException(Throwable cause) {
        super(cause);
        Intrinsics.checkNotNullParameter(cause, "cause");
    }
}
