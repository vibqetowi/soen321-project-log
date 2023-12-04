package com.ifriend.core;

import com.ifriend.common_utils.Logger;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineExceptionHandler;
import kotlinx.coroutines.CoroutineName;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.SupervisorKt;
/* compiled from: AppCoroutineScope.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/ifriend/core/AppCoroutineScope;", "Lkotlinx/coroutines/CoroutineScope;", "logger", "Lcom/ifriend/common_utils/Logger;", "(Lcom/ifriend/common_utils/Logger;)V", "coroutineContext", "Lkotlin/coroutines/CoroutineContext;", "getCoroutineContext", "()Lkotlin/coroutines/CoroutineContext;", "exceptionHandler", "Lkotlinx/coroutines/CoroutineExceptionHandler;", "name", "Lkotlinx/coroutines/CoroutineName;", "core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AppCoroutineScope implements CoroutineScope {
    private final CoroutineContext coroutineContext;
    private final CoroutineExceptionHandler exceptionHandler;
    private final Logger logger;
    private final CoroutineName name;

    public AppCoroutineScope(Logger logger) {
        Intrinsics.checkNotNullParameter(logger, "logger");
        this.logger = logger;
        CoroutineName coroutineName = new CoroutineName("iFriendCoroutine");
        this.name = coroutineName;
        AppCoroutineScope$special$$inlined$CoroutineExceptionHandler$1 appCoroutineScope$special$$inlined$CoroutineExceptionHandler$1 = new AppCoroutineScope$special$$inlined$CoroutineExceptionHandler$1(CoroutineExceptionHandler.Key, this);
        this.exceptionHandler = appCoroutineScope$special$$inlined$CoroutineExceptionHandler$1;
        this.coroutineContext = appCoroutineScope$special$$inlined$CoroutineExceptionHandler$1.plus(coroutineName).plus(SupervisorKt.SupervisorJob$default((Job) null, 1, (Object) null));
    }

    @Override // kotlinx.coroutines.CoroutineScope
    public CoroutineContext getCoroutineContext() {
        return this.coroutineContext;
    }
}
