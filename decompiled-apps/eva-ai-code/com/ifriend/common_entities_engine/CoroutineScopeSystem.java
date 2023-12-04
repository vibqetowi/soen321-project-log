package com.ifriend.common_entities_engine;

import androidx.exifinterface.media.ExifInterface;
import com.ifriend.common_entities_engine.State;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlinx.coroutines.CoroutineExceptionHandler;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.SupervisorKt;
/* compiled from: CoroutineScopeSystem.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\b&\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\b\u0012\u0004\u0012\u0002H\u00010\u00032\u00020\u0004:\u0001\rB\r\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0002\u0010\u0006J\b\u0010\u000b\u001a\u00020\fH\u0016R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u000e"}, d2 = {"Lcom/ifriend/common_entities_engine/CoroutineScopeSystem;", ExifInterface.LATITUDE_SOUTH, "Lcom/ifriend/common_entities_engine/State;", "Lcom/ifriend/common_entities_engine/System;", "Lkotlinx/coroutines/CoroutineScope;", "parentScope", "(Lkotlinx/coroutines/CoroutineScope;)V", "coroutineContext", "Lkotlin/coroutines/CoroutineContext;", "getCoroutineContext", "()Lkotlin/coroutines/CoroutineContext;", "onStop", "", "CoroutineSystemStoppedCancellationException", "common_entities_engine"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public abstract class CoroutineScopeSystem<S extends State> extends System<S> implements CoroutineScope {
    private final CoroutineContext coroutineContext;

    public CoroutineScopeSystem(CoroutineScope parentScope) {
        Intrinsics.checkNotNullParameter(parentScope, "parentScope");
        this.coroutineContext = parentScope.getCoroutineContext().plus(SupervisorKt.SupervisorJob(JobKt.getJob(parentScope.getCoroutineContext()))).plus(new CoroutineScopeSystem$special$$inlined$CoroutineExceptionHandler$1(CoroutineExceptionHandler.Key, this));
    }

    @Override // kotlinx.coroutines.CoroutineScope
    public CoroutineContext getCoroutineContext() {
        return this.coroutineContext;
    }

    @Override // com.ifriend.common_entities_engine.System
    public void onStop() {
        super.onStop();
        JobKt.cancelChildren(JobKt.getJob(getCoroutineContext()), (CancellationException) new CoroutineSystemStoppedCancellationException(Reflection.getOrCreateKotlinClass(getClass()).getSimpleName()));
    }

    /* compiled from: CoroutineScopeSystem.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00060\u0001j\u0002`\u0002B\u000f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004¢\u0006\u0002\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/ifriend/common_entities_engine/CoroutineScopeSystem$CoroutineSystemStoppedCancellationException;", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/CancellationException;", "systemName", "", "(Ljava/lang/String;)V", "common_entities_engine"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class CoroutineSystemStoppedCancellationException extends CancellationException {
        public CoroutineSystemStoppedCancellationException(String str) {
            super("CoroutineScopeSystem " + str + " is stopped");
        }
    }
}
