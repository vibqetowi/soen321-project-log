package com.ifriend.presentation.features.update.delegate;

import com.google.android.play.core.appupdate.AppUpdateInfo;
import com.google.android.play.core.appupdate.AppUpdateManager;
import com.google.android.play.core.appupdate.AppUpdateOptions;
import com.ifriend.presentation.common.uistate.UiStateDelegate;
import com.ifriend.presentation.features.update.model.InAppUpdateEvent;
import com.ifriend.presentation.features.update.model.InAppUpdateState;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: InAppUpdateDelegate.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.ifriend.presentation.features.update.delegate.InAppUpdateDelegateImpl$continueImmediateUpdate$1", f = "InAppUpdateDelegate.kt", i = {}, l = {151}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes6.dex */
public final class InAppUpdateDelegateImpl$continueImmediateUpdate$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ AppUpdateInfo $info;
    int label;
    final /* synthetic */ InAppUpdateDelegateImpl this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InAppUpdateDelegateImpl$continueImmediateUpdate$1(InAppUpdateDelegateImpl inAppUpdateDelegateImpl, AppUpdateInfo appUpdateInfo, Continuation<? super InAppUpdateDelegateImpl$continueImmediateUpdate$1> continuation) {
        super(2, continuation);
        this.this$0 = inAppUpdateDelegateImpl;
        this.$info = appUpdateInfo;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new InAppUpdateDelegateImpl$continueImmediateUpdate$1(this.this$0, this.$info, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((InAppUpdateDelegateImpl$continueImmediateUpdate$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        AppUpdateManager appUpdateManager;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            UiStateDelegate<InAppUpdateState, InAppUpdateEvent> uiStateDelegate = this.this$0;
            AppUpdateInfo appUpdateInfo = this.$info;
            AppUpdateOptions defaultOptions = AppUpdateOptions.defaultOptions(1);
            Intrinsics.checkNotNullExpressionValue(defaultOptions, "defaultOptions(...)");
            appUpdateManager = this.this$0.appUpdateManager;
            this.label = 1;
            if (uiStateDelegate.sendEvent2(uiStateDelegate, (InAppUpdateEvent) new InAppUpdateEvent.StartUpdateEvent(appUpdateInfo, defaultOptions, appUpdateManager), (Continuation<? super Unit>) this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            ResultKt.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }
}
