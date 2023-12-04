package com.ifriend.common_entities_engine;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: BaseEngine.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0006\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0019\u0012\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0015\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/ifriend/common_entities_engine/ExceptionInSystem;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "system", "Lcom/ifriend/common_entities_engine/System;", "exception", "", "(Lcom/ifriend/common_entities_engine/System;Ljava/lang/Throwable;)V", "getException", "()Ljava/lang/Throwable;", "getSystem", "()Lcom/ifriend/common_entities_engine/System;", "common_entities_engine"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ExceptionInSystem extends Exception {
    private final Throwable exception;
    private final System<?> system;

    public final System<?> getSystem() {
        return this.system;
    }

    public final Throwable getException() {
        return this.exception;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ExceptionInSystem(System<?> system, Throwable exception) {
        super("Exception in system " + r0, exception);
        Intrinsics.checkNotNullParameter(system, "system");
        Intrinsics.checkNotNullParameter(exception, "exception");
        String simpleName = system.getClass().getSimpleName();
        this.system = system;
        this.exception = exception;
    }
}
