package com.ifriend.core.utils;

import io.grpc.netty.shaded.io.netty.internal.tcnative.SSL;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: coroutines.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.ifriend.core.utils.CoroutinesKt$launchPeriodAsync$1", f = "coroutines.kt", i = {0, 1, 2}, l = {58, LockFreeTaskQueueCore.CLOSED_SHIFT, SSL.SSL_PROTOCOL_TLS, 65}, m = "invokeSuspend", n = {"$this$launch", "$this$launch", "$this$launch"}, s = {"L$0", "L$0", "L$0"})
/* loaded from: classes6.dex */
public final class CoroutinesKt$launchPeriodAsync$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Function1<Continuation<? super Unit>, Object> $action;
    final /* synthetic */ long $repeatDelayMillis;
    final /* synthetic */ long $startDelayMillis;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public CoroutinesKt$launchPeriodAsync$1(long j, long j2, Function1<? super Continuation<? super Unit>, ? extends Object> function1, Continuation<? super CoroutinesKt$launchPeriodAsync$1> continuation) {
        super(2, continuation);
        this.$startDelayMillis = j;
        this.$repeatDelayMillis = j2;
        this.$action = function1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        CoroutinesKt$launchPeriodAsync$1 coroutinesKt$launchPeriodAsync$1 = new CoroutinesKt$launchPeriodAsync$1(this.$startDelayMillis, this.$repeatDelayMillis, this.$action, continuation);
        coroutinesKt$launchPeriodAsync$1.L$0 = obj;
        return coroutinesKt$launchPeriodAsync$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((CoroutinesKt$launchPeriodAsync$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x007d A[RETURN] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x007b -> B:20:0x005b). Please submit an issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        CoroutineScope coroutineScope;
        CoroutinesKt$launchPeriodAsync$1 coroutinesKt$launchPeriodAsync$1;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            coroutineScope = (CoroutineScope) this.L$0;
            this.L$0 = coroutineScope;
            this.label = 1;
            if (DelayKt.delay(this.$startDelayMillis, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else if (i != 1) {
            if (i == 2) {
                coroutineScope = (CoroutineScope) this.L$0;
                ResultKt.throwOnFailure(obj);
                coroutinesKt$launchPeriodAsync$1 = this;
                coroutinesKt$launchPeriodAsync$1.L$0 = coroutineScope;
                coroutinesKt$launchPeriodAsync$1.label = 3;
                if (DelayKt.delay(coroutinesKt$launchPeriodAsync$1.$repeatDelayMillis, coroutinesKt$launchPeriodAsync$1) == coroutine_suspended) {
                }
                if (CoroutineScopeKt.isActive(coroutineScope)) {
                }
                return Unit.INSTANCE;
            } else if (i != 3) {
                if (i == 4) {
                    ResultKt.throwOnFailure(obj);
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                coroutineScope = (CoroutineScope) this.L$0;
                ResultKt.throwOnFailure(obj);
                coroutinesKt$launchPeriodAsync$1 = this;
                if (CoroutineScopeKt.isActive(coroutineScope)) {
                    Function1<Continuation<? super Unit>, Object> function1 = coroutinesKt$launchPeriodAsync$1.$action;
                    coroutinesKt$launchPeriodAsync$1.L$0 = coroutineScope;
                    coroutinesKt$launchPeriodAsync$1.label = 2;
                    if (function1.invoke(coroutinesKt$launchPeriodAsync$1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    coroutinesKt$launchPeriodAsync$1.L$0 = coroutineScope;
                    coroutinesKt$launchPeriodAsync$1.label = 3;
                    if (DelayKt.delay(coroutinesKt$launchPeriodAsync$1.$repeatDelayMillis, coroutinesKt$launchPeriodAsync$1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    if (CoroutineScopeKt.isActive(coroutineScope)) {
                    }
                }
                return Unit.INSTANCE;
            }
        } else {
            coroutineScope = (CoroutineScope) this.L$0;
            ResultKt.throwOnFailure(obj);
        }
        if (this.$repeatDelayMillis <= 0) {
            Function1<Continuation<? super Unit>, Object> function12 = this.$action;
            this.L$0 = null;
            this.label = 4;
            if (function12.invoke(this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }
        coroutinesKt$launchPeriodAsync$1 = this;
        if (CoroutineScopeKt.isActive(coroutineScope)) {
        }
        return Unit.INSTANCE;
    }
}
