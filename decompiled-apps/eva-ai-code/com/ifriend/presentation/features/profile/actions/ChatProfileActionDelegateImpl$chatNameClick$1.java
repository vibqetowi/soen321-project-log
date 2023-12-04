package com.ifriend.presentation.features.profile.actions;

import com.ifriend.analytics.usecase.chat.ChatScreenAnalyticsUseCase;
import com.ifriend.domain.logic.chat.models.ChatInfo;
import com.ifriend.domain.logic.chat.models.ChatType;
import com.ifriend.presentation.common.uistate.UiStateDelegate;
import com.ifriend.presentation.features.chat.screen.viewmodel.ChatViewModel;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
/* compiled from: ChatProfileActionDelegate.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.ifriend.presentation.features.profile.actions.ChatProfileActionDelegateImpl$chatNameClick$1", f = "ChatProfileActionDelegate.kt", i = {}, l = {56}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes6.dex */
final class ChatProfileActionDelegateImpl$chatNameClick$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ ChatViewModel $$context_receiver_0;
    int label;
    final /* synthetic */ ChatProfileActionDelegateImpl this$0;

    /* compiled from: ChatProfileActionDelegate.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ChatType.values().length];
            try {
                iArr[ChatType.INFLUENCER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ChatType.MAIN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ChatType.COMMON.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatProfileActionDelegateImpl$chatNameClick$1(ChatViewModel chatViewModel, ChatProfileActionDelegateImpl chatProfileActionDelegateImpl, Continuation<? super ChatProfileActionDelegateImpl$chatNameClick$1> continuation) {
        super(2, continuation);
        this.$$context_receiver_0 = chatViewModel;
        this.this$0 = chatProfileActionDelegateImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ChatProfileActionDelegateImpl$chatNameClick$1(this.$$context_receiver_0, this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((ChatProfileActionDelegateImpl$chatNameClick$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        ChatScreenAnalyticsUseCase chatScreenAnalyticsUseCase;
        ChatScreenAnalyticsUseCase chatScreenAnalyticsUseCase2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            UiStateDelegate<ChatViewModel.UiState, ChatViewModel.Event> uiStateDelegate = this.$$context_receiver_0;
            ChatInfo chatInfo = uiStateDelegate.getUiState(uiStateDelegate).getChatInfo();
            if (chatInfo == null) {
                return Unit.INSTANCE;
            }
            int i2 = WhenMappings.$EnumSwitchMapping$0[chatInfo.getChatType().ordinal()];
            if (i2 == 1) {
                chatScreenAnalyticsUseCase = this.this$0.chatScreenAnalyticsUseCase;
                chatScreenAnalyticsUseCase.trackClickAvatarName();
                UiStateDelegate<ChatViewModel.UiState, ChatViewModel.Event> uiStateDelegate2 = this.$$context_receiver_0;
                this.label = 1;
                if (uiStateDelegate2.sendEvent2(uiStateDelegate2, (ChatViewModel.Event) new ChatViewModel.Event.OpenChatSettings(chatInfo.getChatId()), (Continuation<? super Unit>) this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else if (i2 == 2) {
                chatScreenAnalyticsUseCase2 = this.this$0.chatScreenAnalyticsUseCase;
                chatScreenAnalyticsUseCase2.trackClickAvatarName();
                this.this$0.navigateToBotProfile(this.$$context_receiver_0);
            }
        } else if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            ResultKt.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }
}
