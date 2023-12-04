package com.ifriend.presentation.features.purchases.chatsubscription.subscription.viewmodel;

import com.ifriend.presentation.common.observers.FlowObserverEmitter;
import com.ifriend.presentation.common.uistate.UiStateDelegate;
import com.ifriend.presentation.features.purchases.chatsubscription.subscription.viewmodel.ChatBuySubscriptionViewModel;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ChatBuySubscriptionViewModel.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "throwable", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.ifriend.presentation.features.purchases.chatsubscription.subscription.viewmodel.ChatBuySubscriptionViewModel$onContinueClick$1", f = "ChatBuySubscriptionViewModel.kt", i = {0}, l = {307, 308}, m = "invokeSuspend", n = {"throwable"}, s = {"L$0"})
/* loaded from: classes6.dex */
public final class ChatBuySubscriptionViewModel$onContinueClick$1 extends SuspendLambda implements Function2<Throwable, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ ChatBuySubscriptionViewModel this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatBuySubscriptionViewModel$onContinueClick$1(ChatBuySubscriptionViewModel chatBuySubscriptionViewModel, Continuation<? super ChatBuySubscriptionViewModel$onContinueClick$1> continuation) {
        super(2, continuation);
        this.this$0 = chatBuySubscriptionViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        ChatBuySubscriptionViewModel$onContinueClick$1 chatBuySubscriptionViewModel$onContinueClick$1 = new ChatBuySubscriptionViewModel$onContinueClick$1(this.this$0, continuation);
        chatBuySubscriptionViewModel$onContinueClick$1.L$0 = obj;
        return chatBuySubscriptionViewModel$onContinueClick$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Throwable th, Continuation<? super Unit> continuation) {
        return ((ChatBuySubscriptionViewModel$onContinueClick$1) create(th, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ChatBuySubscriptionViewModel.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lcom/ifriend/presentation/features/purchases/chatsubscription/subscription/viewmodel/ChatBuySubscriptionViewModel$UiState;", "uiState", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.ifriend.presentation.features.purchases.chatsubscription.subscription.viewmodel.ChatBuySubscriptionViewModel$onContinueClick$1$1  reason: invalid class name */
    /* loaded from: classes6.dex */
    public static final class AnonymousClass1 extends Lambda implements Function1<ChatBuySubscriptionViewModel.UiState, ChatBuySubscriptionViewModel.UiState> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        AnonymousClass1() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final ChatBuySubscriptionViewModel.UiState invoke(ChatBuySubscriptionViewModel.UiState uiState) {
            ChatBuySubscriptionViewModel.UiState m6983copypAZo6Ak;
            Intrinsics.checkNotNullParameter(uiState, "uiState");
            m6983copypAZo6Ak = uiState.m6983copypAZo6Ak((r26 & 1) != 0 ? uiState.isLoading : false, (r26 & 2) != 0 ? uiState.isPurchased : false, (r26 & 4) != 0 ? uiState.gradientColor : 0L, (r26 & 8) != 0 ? uiState.gradientDarkerColor : 0L, (r26 & 16) != 0 ? uiState.interestsLabels : null, (r26 & 32) != 0 ? uiState.chatName : null, (r26 & 64) != 0 ? uiState.screenTitleLabel : null, (r26 & 128) != 0 ? uiState.screenDescriptionLabel : null, (r26 & 256) != 0 ? uiState.actionLabel : null, (r26 & 512) != 0 ? uiState.offers : null);
            return m6983copypAZo6Ak;
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Throwable th;
        FlowObserverEmitter flowObserverEmitter;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            th = (Throwable) this.L$0;
            UiStateDelegate<ChatBuySubscriptionViewModel.UiState, ChatBuySubscriptionViewModel.Event> uiStateDelegate = this.this$0;
            this.L$0 = th;
            this.label = 1;
            if (uiStateDelegate.updateUiState(uiStateDelegate, AnonymousClass1.INSTANCE, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else if (i != 1) {
            if (i == 2) {
                ResultKt.throwOnFailure(obj);
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            th = (Throwable) this.L$0;
            ResultKt.throwOnFailure(obj);
        }
        flowObserverEmitter = this.this$0.exceptionsEmitter;
        this.L$0 = null;
        this.label = 2;
        if (flowObserverEmitter.emit(th, this) == coroutine_suspended) {
            return coroutine_suspended;
        }
        return Unit.INSTANCE;
    }
}
