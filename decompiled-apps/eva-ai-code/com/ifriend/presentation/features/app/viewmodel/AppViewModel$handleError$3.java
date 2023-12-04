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
import kotlinx.coroutines.CoroutineScope;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: AppViewModel.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.ifriend.presentation.features.app.viewmodel.AppViewModel$handleError$3", f = "AppViewModel.kt", i = {}, l = {148}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes6.dex */
public final class AppViewModel$handleError$3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Throwable $throwable;
    int label;
    final /* synthetic */ AppViewModel this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppViewModel$handleError$3(AppViewModel appViewModel, Throwable th, Continuation<? super AppViewModel$handleError$3> continuation) {
        super(2, continuation);
        this.this$0 = appViewModel;
        this.$throwable = th;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new AppViewModel$handleError$3(this.this$0, this.$throwable, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((AppViewModel$handleError$3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        FeatureExceptionMapper featureExceptionMapper;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            featureExceptionMapper = this.this$0.featureExceptionMapper;
            String map = featureExceptionMapper.map(this.$throwable);
            UiStateDelegate<AppViewModel.UiState, AppViewModel.Event> uiStateDelegate = this.this$0;
            this.label = 1;
            if (uiStateDelegate.sendEvent2(uiStateDelegate, (AppViewModel.Event) new AppViewModel.Event.ShowInternalNotification(new DefaultErrorMessage(map)), (Continuation<? super Unit>) this) == coroutine_suspended) {
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
