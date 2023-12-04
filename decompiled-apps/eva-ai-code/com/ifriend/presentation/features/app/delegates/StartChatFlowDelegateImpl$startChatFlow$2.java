package com.ifriend.presentation.features.app.delegates;

import com.ifriend.presentation.common.observers.appevents.AppEvents;
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
/* compiled from: StartChatFlowDelegate.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.ifriend.presentation.features.app.delegates.StartChatFlowDelegateImpl$startChatFlow$2", f = "StartChatFlowDelegate.kt", i = {}, l = {38, 39}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes6.dex */
public final class StartChatFlowDelegateImpl$startChatFlow$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ AppViewModel $$context_receiver_0;
    final /* synthetic */ AppEvents.StartChatFlow.NavigationMode $navigationMode;
    int label;
    final /* synthetic */ StartChatFlowDelegateImpl this$0;

    /* compiled from: StartChatFlowDelegate.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[AppEvents.StartChatFlow.NavigationMode.values().length];
            try {
                iArr[AppEvents.StartChatFlow.NavigationMode.FINISHED_ONBOARDING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AppEvents.StartChatFlow.NavigationMode.START_APP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StartChatFlowDelegateImpl$startChatFlow$2(AppEvents.StartChatFlow.NavigationMode navigationMode, StartChatFlowDelegateImpl startChatFlowDelegateImpl, AppViewModel appViewModel, Continuation<? super StartChatFlowDelegateImpl$startChatFlow$2> continuation) {
        super(2, continuation);
        this.$navigationMode = navigationMode;
        this.this$0 = startChatFlowDelegateImpl;
        this.$$context_receiver_0 = appViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new StartChatFlowDelegateImpl$startChatFlow$2(this.$navigationMode, this.this$0, this.$$context_receiver_0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((StartChatFlowDelegateImpl$startChatFlow$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object startFinishOnboardingChatFlow;
        Object startAppChatFlow;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            int i2 = WhenMappings.$EnumSwitchMapping$0[this.$navigationMode.ordinal()];
            if (i2 == 1) {
                this.label = 1;
                startFinishOnboardingChatFlow = this.this$0.startFinishOnboardingChatFlow(this.$$context_receiver_0, this);
                if (startFinishOnboardingChatFlow == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else if (i2 == 2) {
                this.label = 2;
                startAppChatFlow = this.this$0.startAppChatFlow(this.$$context_receiver_0, this);
                if (startAppChatFlow == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
        } else if (i != 1 && i != 2) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            ResultKt.throwOnFailure(obj);
        }
        this.this$0.checkNeedToShowInfoOnboarding(this.$$context_receiver_0);
        return Unit.INSTANCE;
    }
}
