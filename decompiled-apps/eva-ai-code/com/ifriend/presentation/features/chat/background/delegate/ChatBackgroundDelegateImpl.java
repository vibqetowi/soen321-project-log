package com.ifriend.presentation.features.chat.background.delegate;

import android.net.Uri;
import androidx.lifecycle.ViewModelKt;
import com.ifriend.analytics.AnalyticsConstants;
import com.ifriend.analytics.AnalyticsEngine;
import com.ifriend.analytics.AnalyticsSender;
import com.ifriend.analytics.annalsTracker.AnnalsTrackerAnalyticsSender;
import com.ifriend.core.utils.CoroutinesKt;
import com.ifriend.domain.data.UserRepository;
import com.ifriend.domain.logic.chat.ChatBackgroundTrigger;
import com.ifriend.domain.logic.chat.ChatBackgroundUseCase;
import com.ifriend.domain.logic.chat.configuration.ChatsConfigurationInteractor;
import com.ifriend.domain.logic.chat.permissions.CheckChatPermissionsUseCase;
import com.ifriend.domain.newChat.chat.systems.messages.live.LiveChatMessagesFlow;
import com.ifriend.domain.useCases.diary.DiaryNoteReplier;
import com.ifriend.presentation.features.chat.screen.viewmodel.ChatViewModel;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
/* compiled from: ChatBackgroundDelegate.kt */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B7\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r¢\u0006\u0002\u0010\u000eJ#\u0010\u0011\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u0015H\u0082@ø\u0001\u0000¢\u0006\u0002\u0010\u0016J\u0019\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0013\u001a\u00020\u0010H\u0016R\u00020\u0019¢\u0006\u0002\u0010\u001aJ\u0019\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u0013\u001a\u00020\u0010H\u0002R\u00020\u0019¢\u0006\u0002\u0010\u001aJ\u001d\u0010\u001c\u001a\u00020\u00182\u0006\u0010\u001d\u001a\u00020\u0012H\u0082@R\u00020\u0019ø\u0001\u0000¢\u0006\u0002\u0010\u001eR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001f"}, d2 = {"Lcom/ifriend/presentation/features/chat/background/delegate/ChatBackgroundDelegateImpl;", "Lcom/ifriend/presentation/features/chat/background/delegate/ChatBackgroundDelegate;", "chatBackgroundUseCase", "Lcom/ifriend/domain/logic/chat/ChatBackgroundUseCase;", "liveChatMessagesFlow", "Lcom/ifriend/domain/newChat/chat/systems/messages/live/LiveChatMessagesFlow;", "diaryReplier", "Lcom/ifriend/domain/useCases/diary/DiaryNoteReplier;", "userRepository", "Lcom/ifriend/domain/data/UserRepository;", "checkChatPermissionsUseCase", "Lcom/ifriend/domain/logic/chat/permissions/CheckChatPermissionsUseCase;", "chatsConfigurationInteractor", "Lcom/ifriend/domain/logic/chat/configuration/ChatsConfigurationInteractor;", "(Lcom/ifriend/domain/logic/chat/ChatBackgroundUseCase;Lcom/ifriend/domain/newChat/chat/systems/messages/live/LiveChatMessagesFlow;Lcom/ifriend/domain/useCases/diary/DiaryNoteReplier;Lcom/ifriend/domain/data/UserRepository;Lcom/ifriend/domain/logic/chat/permissions/CheckChatPermissionsUseCase;Lcom/ifriend/domain/logic/chat/configuration/ChatsConfigurationInteractor;)V", "lastTriggeredUserId", "", "getTriggerVideoBackground", "Lcom/ifriend/presentation/features/chat/background/delegate/ChatBackground;", "chatId", "trigger", "Lcom/ifriend/domain/logic/chat/ChatBackgroundTrigger;", "(Ljava/lang/String;Lcom/ifriend/domain/logic/chat/ChatBackgroundTrigger;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "initChatBackground", "", "Lcom/ifriend/presentation/features/chat/screen/viewmodel/ChatViewModel;", "(Lcom/ifriend/presentation/features/chat/screen/viewmodel/ChatViewModel;Ljava/lang/String;)V", "subscribeOnVideoTrigger", "updateChatBackground", "background", "(Lcom/ifriend/presentation/features/chat/screen/viewmodel/ChatViewModel;Lcom/ifriend/presentation/features/chat/background/delegate/ChatBackground;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ChatBackgroundDelegateImpl implements ChatBackgroundDelegate {
    public static final int $stable = 8;
    private final ChatBackgroundUseCase chatBackgroundUseCase;
    private final ChatsConfigurationInteractor chatsConfigurationInteractor;
    private final CheckChatPermissionsUseCase checkChatPermissionsUseCase;
    private final DiaryNoteReplier diaryReplier;
    private String lastTriggeredUserId;
    private final LiveChatMessagesFlow liveChatMessagesFlow;
    private final UserRepository userRepository;

    @Inject
    public ChatBackgroundDelegateImpl(ChatBackgroundUseCase chatBackgroundUseCase, LiveChatMessagesFlow liveChatMessagesFlow, DiaryNoteReplier diaryReplier, UserRepository userRepository, CheckChatPermissionsUseCase checkChatPermissionsUseCase, ChatsConfigurationInteractor chatsConfigurationInteractor) {
        Intrinsics.checkNotNullParameter(chatBackgroundUseCase, "chatBackgroundUseCase");
        Intrinsics.checkNotNullParameter(liveChatMessagesFlow, "liveChatMessagesFlow");
        Intrinsics.checkNotNullParameter(diaryReplier, "diaryReplier");
        Intrinsics.checkNotNullParameter(userRepository, "userRepository");
        Intrinsics.checkNotNullParameter(checkChatPermissionsUseCase, "checkChatPermissionsUseCase");
        Intrinsics.checkNotNullParameter(chatsConfigurationInteractor, "chatsConfigurationInteractor");
        this.chatBackgroundUseCase = chatBackgroundUseCase;
        this.liveChatMessagesFlow = liveChatMessagesFlow;
        this.diaryReplier = diaryReplier;
        this.userRepository = userRepository;
        this.checkChatPermissionsUseCase = checkChatPermissionsUseCase;
        this.chatsConfigurationInteractor = chatsConfigurationInteractor;
    }

    @Override // com.ifriend.presentation.features.chat.background.delegate.ChatBackgroundDelegate
    public void initChatBackground(ChatViewModel context_receiver_0, String chatId) {
        Intrinsics.checkNotNullParameter(context_receiver_0, "$context_receiver_0");
        Intrinsics.checkNotNullParameter(chatId, "chatId");
        CoroutinesKt.safeLaunch$default(ViewModelKt.getViewModelScope(context_receiver_0), null, null, new ChatBackgroundDelegateImpl$initChatBackground$1(this, chatId, context_receiver_0, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void subscribeOnVideoTrigger(ChatViewModel chatViewModel, String str) {
        ChatViewModel chatViewModel2 = chatViewModel;
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(chatViewModel2), null, null, new ChatBackgroundDelegateImpl$subscribeOnVideoTrigger$1(this, str, chatViewModel, null), 3, null);
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(chatViewModel2), null, null, new ChatBackgroundDelegateImpl$subscribeOnVideoTrigger$2(this, str, chatViewModel, null), 3, null);
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(chatViewModel2), null, null, new ChatBackgroundDelegateImpl$subscribeOnVideoTrigger$3(this, str, chatViewModel, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object updateChatBackground(ChatViewModel chatViewModel, ChatBackground chatBackground, Continuation<? super Unit> continuation) {
        Object updateUiState = chatViewModel.updateUiState(chatViewModel, new ChatBackgroundDelegateImpl$updateChatBackground$2(chatBackground), continuation);
        return updateUiState == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? updateUiState : Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00af A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object getTriggerVideoBackground(String str, ChatBackgroundTrigger chatBackgroundTrigger, Continuation<? super ChatBackground> continuation) {
        ChatBackgroundDelegateImpl$getTriggerVideoBackground$1 chatBackgroundDelegateImpl$getTriggerVideoBackground$1;
        int i;
        String str2;
        if (continuation instanceof ChatBackgroundDelegateImpl$getTriggerVideoBackground$1) {
            chatBackgroundDelegateImpl$getTriggerVideoBackground$1 = (ChatBackgroundDelegateImpl$getTriggerVideoBackground$1) continuation;
            if ((chatBackgroundDelegateImpl$getTriggerVideoBackground$1.label & Integer.MIN_VALUE) != 0) {
                chatBackgroundDelegateImpl$getTriggerVideoBackground$1.label -= Integer.MIN_VALUE;
                Object obj = chatBackgroundDelegateImpl$getTriggerVideoBackground$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = chatBackgroundDelegateImpl$getTriggerVideoBackground$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    ChatBackgroundUseCase chatBackgroundUseCase = this.chatBackgroundUseCase;
                    chatBackgroundDelegateImpl$getTriggerVideoBackground$1.L$0 = chatBackgroundTrigger;
                    chatBackgroundDelegateImpl$getTriggerVideoBackground$1.label = 1;
                    obj = chatBackgroundUseCase.getTriggerVideoBackground(str, chatBackgroundTrigger, chatBackgroundDelegateImpl$getTriggerVideoBackground$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    chatBackgroundTrigger = (ChatBackgroundTrigger) chatBackgroundDelegateImpl$getTriggerVideoBackground$1.L$0;
                    ResultKt.throwOnFailure(obj);
                }
                str2 = (String) obj;
                AnnalsTrackerAnalyticsSender annalsTrackerAnalyticsSender = null;
                if (str2.length() <= 0) {
                    return null;
                }
                AnalyticsSender[] analyticsSenders = AnalyticsEngine.Companion.getInstance().getAnalyticsSenders();
                int length = analyticsSenders.length;
                int i2 = 0;
                while (true) {
                    if (i2 >= length) {
                        break;
                    }
                    AnalyticsSender analyticsSender = analyticsSenders[i2];
                    if (analyticsSender instanceof AnnalsTrackerAnalyticsSender) {
                        annalsTrackerAnalyticsSender = analyticsSender;
                        break;
                    }
                    i2++;
                }
                AnnalsTrackerAnalyticsSender annalsTrackerAnalyticsSender2 = annalsTrackerAnalyticsSender;
                if (annalsTrackerAnalyticsSender2 != null) {
                    annalsTrackerAnalyticsSender2.sendEvent("ai-idol-video-start", MapsKt.mapOf(TuplesKt.to("video-name", chatBackgroundTrigger.getVideoName()), AnalyticsConstants.INSTANCE.getTimestamp()));
                }
                Uri parse = Uri.parse(str2);
                Intrinsics.checkNotNullExpressionValue(parse, "parse(this)");
                return new ChatBackground(parse, chatBackgroundTrigger == ChatBackgroundTrigger.IDLE);
            }
        }
        chatBackgroundDelegateImpl$getTriggerVideoBackground$1 = new ChatBackgroundDelegateImpl$getTriggerVideoBackground$1(this, continuation);
        Object obj2 = chatBackgroundDelegateImpl$getTriggerVideoBackground$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = chatBackgroundDelegateImpl$getTriggerVideoBackground$1.label;
        if (i != 0) {
        }
        str2 = (String) obj2;
        AnnalsTrackerAnalyticsSender annalsTrackerAnalyticsSender3 = null;
        if (str2.length() <= 0) {
        }
    }
}
