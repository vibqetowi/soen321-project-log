package com.ifriend.presentation.features.app.viewmodel;

import com.ifriend.presentation.common.exception.mappers.FeatureExceptionMapper;
import com.ifriend.presentation.common.internalnotification.DefaultErrorMessage;
import com.ifriend.presentation.common.uistate.UiStateDelegate;
import com.ifriend.presentation.features.app.viewmodel.AppViewModel;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: AppViewModel.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "throwable", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.ifriend.presentation.features.app.viewmodel.AppViewModel$logout$1", f = "AppViewModel.kt", i = {}, l = {157, 159}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes6.dex */
public final class AppViewModel$logout$1 extends SuspendLambda implements Function2<Throwable, Continuation<? super Unit>, Object> {
    final /* synthetic */ boolean $hard;
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ AppViewModel this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppViewModel$logout$1(boolean z, AppViewModel appViewModel, Continuation<? super AppViewModel$logout$1> continuation) {
        super(2, continuation);
        this.$hard = z;
        this.this$0 = appViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        AppViewModel$logout$1 appViewModel$logout$1 = new AppViewModel$logout$1(this.$hard, this.this$0, continuation);
        appViewModel$logout$1.L$0 = obj;
        return appViewModel$logout$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Throwable th, Continuation<? super Unit> continuation) {
        return ((AppViewModel$logout$1) create(th, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        FeatureExceptionMapper featureExceptionMapper;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            Throwable th = (Throwable) this.L$0;
            if (!this.$hard) {
                featureExceptionMapper = this.this$0.featureExceptionMapper;
                String map = featureExceptionMapper.map(th);
                UiStateDelegate<AppViewModel.UiState, AppViewModel.Event> uiStateDelegate = this.this$0;
                this.label = 1;
                if (uiStateDelegate.sendEvent2(uiStateDelegate, (AppViewModel.Event) new AppViewModel.Event.ShowInternalNotification(new DefaultErrorMessage(map)), (Continuation<? super Unit>) this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                UiStateDelegate<AppViewModel.UiState, AppViewModel.Event> uiStateDelegate2 = this.this$0;
                this.label = 2;
                if (uiStateDelegate2.sendEvent2(uiStateDelegate2, (AppViewModel.Event) AppViewModel.Event.RestartAppFlow.INSTANCE, (Continuation<? super Unit>) this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
        } else if (i != 1 && i != 2) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            ResultKt.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }
}
