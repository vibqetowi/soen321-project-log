package com.ifriend.infrastructure.connectivity;

import android.util.Log;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: InternetConnectionImpl.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.ifriend.infrastructure.connectivity.InternetConnectionImpl$isInternetAvailable$2", f = "InternetConnectionImpl.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes6.dex */
public final class InternetConnectionImpl$isInternetAvailable$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Boolean>, Object> {
    int label;
    final /* synthetic */ InternetConnectionImpl this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InternetConnectionImpl$isInternetAvailable$2(InternetConnectionImpl internetConnectionImpl, Continuation<? super InternetConnectionImpl$isInternetAvailable$2> continuation) {
        super(2, continuation);
        this.this$0 = internetConnectionImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new InternetConnectionImpl$isInternetAvailable$2(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Boolean> continuation) {
        return ((InternetConnectionImpl$isInternetAvailable$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0042, code lost:
        if (r4 != false) goto L15;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        String backendDomain;
        boolean tryPing;
        boolean tryHttpRequest;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            backendDomain = this.this$0.getBackendDomain();
            boolean z = false;
            boolean tryPing2 = backendDomain != null ? this.this$0.tryPing(backendDomain) : false;
            Log.i("InternetConnection", "backendPing=" + tryPing2);
            if (!tryPing2) {
                tryPing = this.this$0.tryPing("google.com");
                if (!tryPing) {
                    tryHttpRequest = this.this$0.tryHttpRequest("https://www.google.com");
                }
            }
            z = true;
            return Boxing.boxBoolean(z);
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
