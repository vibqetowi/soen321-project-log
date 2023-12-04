package com.ifriend.presentation.features.chat.panel.delegate;

import com.ifriend.core.tools.api.AppIdentityConverter;
import com.ifriend.domain.logic.topics.ChatPanelActionsInteractor;
import com.ifriend.domain.logic.topics.models.PremiumTopicPopup;
import com.ifriend.presentation.analytics.ChatTopicsAnalytics;
import com.ifriend.presentation.common.uistate.UiStateDelegate;
import com.ifriend.presentation.features.chat.actions.delegate.ChatPanelActionsEvent;
import com.ifriend.presentation.features.chat.panel.mappers.TopicPopupDataMapperUi;
import com.ifriend.presentation.features.chat.panel.models.ChatPremiumTopicUi;
import com.ifriend.presentation.features.chat.panel.models.ChatTopicsUiState;
import com.ifriend.presentation.features.chat.panel.models.TopicPopupDataUi;
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
import kotlinx.coroutines.CoroutineScope;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ChatPanelActionsDelegate.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.ifriend.presentation.features.chat.panel.delegate.ChatPanelActionsDelegateImpl$premiumTopicClick$2", f = "ChatPanelActionsDelegate.kt", i = {}, l = {242, 246, 255}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes6.dex */
public final class ChatPanelActionsDelegateImpl$premiumTopicClick$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $chatId;
    final /* synthetic */ ChatPremiumTopicUi $topic;
    int label;
    final /* synthetic */ ChatPanelActionsDelegateImpl this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatPanelActionsDelegateImpl$premiumTopicClick$2(ChatPanelActionsDelegateImpl chatPanelActionsDelegateImpl, ChatPremiumTopicUi chatPremiumTopicUi, String str, Continuation<? super ChatPanelActionsDelegateImpl$premiumTopicClick$2> continuation) {
        super(2, continuation);
        this.this$0 = chatPanelActionsDelegateImpl;
        this.$topic = chatPremiumTopicUi;
        this.$chatId = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ChatPanelActionsDelegateImpl$premiumTopicClick$2(this.this$0, this.$topic, this.$chatId, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((ChatPanelActionsDelegateImpl$premiumTopicClick$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ChatPanelActionsDelegate.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lcom/ifriend/presentation/features/chat/panel/models/ChatTopicsUiState;", "state", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.ifriend.presentation.features.chat.panel.delegate.ChatPanelActionsDelegateImpl$premiumTopicClick$2$1  reason: invalid class name */
    /* loaded from: classes6.dex */
    public static final class AnonymousClass1 extends Lambda implements Function1<ChatTopicsUiState, ChatTopicsUiState> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        AnonymousClass1() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final ChatTopicsUiState invoke(ChatTopicsUiState state) {
            Intrinsics.checkNotNullParameter(state, "state");
            return ChatTopicsUiState.copy$default(state, null, false, null, false, false, false, 61, null);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0082  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        TopicPopupDataUi popupData;
        ChatPanelActionsInteractor chatPanelActionsInteractor;
        ChatTopicsAnalytics chatTopicsAnalytics;
        AppIdentityConverter appIdentityConverter;
        Object showPopup;
        PremiumTopicPopup premiumTopicPopup;
        TopicPopupDataMapperUi topicPopupDataMapperUi;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            UiStateDelegate<ChatTopicsUiState, ChatPanelActionsEvent> uiStateDelegate = this.this$0;
            this.label = 1;
            if (uiStateDelegate.updateUiState(uiStateDelegate, AnonymousClass1.INSTANCE, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    ResultKt.throwOnFailure(obj);
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            premiumTopicPopup = (PremiumTopicPopup) obj;
            if (premiumTopicPopup == null) {
                topicPopupDataMapperUi = this.this$0.topicPopupDataMapperUi;
                popupData = topicPopupDataMapperUi.map(premiumTopicPopup);
            } else {
                popupData = null;
            }
            if (popupData != null) {
                chatTopicsAnalytics = this.this$0.chatTopicsAnalytics;
                appIdentityConverter = this.this$0.appIdentityConverter;
                chatTopicsAnalytics.sendClickPremiumTopicShowTunedPopup(appIdentityConverter.convertToDbId(this.$chatId));
                this.label = 3;
                showPopup = this.this$0.showPopup(popupData, this);
                if (showPopup == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return Unit.INSTANCE;
        } else {
            ResultKt.throwOnFailure(obj);
        }
        this.this$0.trackPremiumTopicClick(this.$topic, this.$chatId);
        UiStateDelegate<ChatTopicsUiState, ChatPanelActionsEvent> uiStateDelegate2 = this.this$0;
        popupData = uiStateDelegate2.getUiState(uiStateDelegate2).getPopupData();
        if (popupData == null) {
            chatPanelActionsInteractor = this.this$0.chatPanelActionsInteractor;
            this.label = 2;
            obj = chatPanelActionsInteractor.activatePremiumTopic(this.$topic.getId(), this.$chatId, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            premiumTopicPopup = (PremiumTopicPopup) obj;
            if (premiumTopicPopup == null) {
            }
        }
        if (popupData != null) {
        }
        return Unit.INSTANCE;
    }
}
