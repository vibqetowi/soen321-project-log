package com.ifriend.presentation.features.app.delegates;

import com.ifriend.analytics.api.logic.AnalyticsInteractor;
import com.ifriend.domain.logic.chat.refresh.ChatsRefreshConfigurationUseCase;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: AppChatEventsDelegate.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.ifriend.presentation.features.app.delegates.AppChatEventsDelegateImpl$refreshConfiguration$1", f = "AppChatEventsDelegate.kt", i = {}, l = {32}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes6.dex */
public final class AppChatEventsDelegateImpl$refreshConfiguration$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ AppChatEventsDelegateImpl this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppChatEventsDelegateImpl$refreshConfiguration$1(AppChatEventsDelegateImpl appChatEventsDelegateImpl, Continuation<? super AppChatEventsDelegateImpl$refreshConfiguration$1> continuation) {
        super(2, continuation);
        this.this$0 = appChatEventsDelegateImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new AppChatEventsDelegateImpl$refreshConfiguration$1(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((AppChatEventsDelegateImpl$refreshConfiguration$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        ChatsRefreshConfigurationUseCase chatsRefreshConfigurationUseCase;
        Object mo6875invokegIAlus;
        AnalyticsInteractor analyticsInteractor;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            chatsRefreshConfigurationUseCase = this.this$0.refreshConfigurationUseCase;
            this.label = 1;
            mo6875invokegIAlus = chatsRefreshConfigurationUseCase.mo6875invokegIAlus(Unit.INSTANCE, (Continuation<? super Result<? extends Unit>>) this);
            if (mo6875invokegIAlus == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            ResultKt.throwOnFailure(obj);
            mo6875invokegIAlus = ((Result) obj).m7280unboximpl();
        }
        AppChatEventsDelegateImpl appChatEventsDelegateImpl = this.this$0;
        Throwable m7274exceptionOrNullimpl = Result.m7274exceptionOrNullimpl(mo6875invokegIAlus);
        if (m7274exceptionOrNullimpl != null) {
            analyticsInteractor = appChatEventsDelegateImpl.analyticsInteractor;
            analyticsInteractor.trackException("refresh chat configuration", m7274exceptionOrNullimpl);
        }
        return Unit.INSTANCE;
    }
}
