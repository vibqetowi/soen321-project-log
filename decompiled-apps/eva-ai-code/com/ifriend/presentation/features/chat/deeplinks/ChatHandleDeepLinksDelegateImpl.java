package com.ifriend.presentation.features.chat.deeplinks;

import androidx.lifecycle.ViewModelKt;
import com.ifriend.core.utils.CoroutinesKt;
import com.ifriend.domain.data.deeplinks.DeepLink;
import com.ifriend.domain.data.deeplinks.DeepLinksRepository;
import com.ifriend.domain.logic.chat.info.ChatsInfoInteractor;
import com.ifriend.domain.logic.chat.models.ChatInfo;
import com.ifriend.presentation.common.observers.appevents.AppEventsEmitter;
import com.ifriend.presentation.common.uistate.UiStateDelegate;
import com.ifriend.presentation.features.chat.screen.viewmodel.ChatViewModel;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: ChatHandleDeepLinksDelegate.kt */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u001f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0019\u0010\t\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\rH\u0016R\u00020\u000b¢\u0006\u0002\u0010\u000eJ\u001d\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u0011H\u0082@R\u00020\u000bø\u0001\u0000¢\u0006\u0002\u0010\u0012J\u0015\u0010\u0013\u001a\u00020\nH\u0082@R\u00020\u000bø\u0001\u0000¢\u0006\u0002\u0010\u0014R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0015"}, d2 = {"Lcom/ifriend/presentation/features/chat/deeplinks/ChatHandleDeepLinksDelegateImpl;", "Lcom/ifriend/presentation/features/chat/deeplinks/ChatHandleDeepLinksDelegate;", "deepLinksRepository", "Lcom/ifriend/domain/data/deeplinks/DeepLinksRepository;", "appEventsEmitter", "Lcom/ifriend/presentation/common/observers/appevents/AppEventsEmitter;", "chatsInfoInteractor", "Lcom/ifriend/domain/logic/chat/info/ChatsInfoInteractor;", "(Lcom/ifriend/domain/data/deeplinks/DeepLinksRepository;Lcom/ifriend/presentation/common/observers/appevents/AppEventsEmitter;Lcom/ifriend/domain/logic/chat/info/ChatsInfoInteractor;)V", "handleDeepLinks", "", "Lcom/ifriend/presentation/features/chat/screen/viewmodel/ChatViewModel;", "chatId", "", "(Lcom/ifriend/presentation/features/chat/screen/viewmodel/ChatViewModel;Ljava/lang/String;)V", "handleMainChatDeepLinks", "deepLink", "Lcom/ifriend/domain/data/deeplinks/DeepLink;", "(Lcom/ifriend/presentation/features/chat/screen/viewmodel/ChatViewModel;Lcom/ifriend/domain/data/deeplinks/DeepLink;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "navigateToMainChat", "(Lcom/ifriend/presentation/features/chat/screen/viewmodel/ChatViewModel;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ChatHandleDeepLinksDelegateImpl implements ChatHandleDeepLinksDelegate {
    public static final int $stable = 8;
    private final AppEventsEmitter appEventsEmitter;
    private final ChatsInfoInteractor chatsInfoInteractor;
    private final DeepLinksRepository deepLinksRepository;

    @Inject
    public ChatHandleDeepLinksDelegateImpl(DeepLinksRepository deepLinksRepository, AppEventsEmitter appEventsEmitter, ChatsInfoInteractor chatsInfoInteractor) {
        Intrinsics.checkNotNullParameter(deepLinksRepository, "deepLinksRepository");
        Intrinsics.checkNotNullParameter(appEventsEmitter, "appEventsEmitter");
        Intrinsics.checkNotNullParameter(chatsInfoInteractor, "chatsInfoInteractor");
        this.deepLinksRepository = deepLinksRepository;
        this.appEventsEmitter = appEventsEmitter;
        this.chatsInfoInteractor = chatsInfoInteractor;
    }

    @Override // com.ifriend.presentation.features.chat.deeplinks.ChatHandleDeepLinksDelegate
    public void handleDeepLinks(ChatViewModel context_receiver_0, String chatId) {
        Intrinsics.checkNotNullParameter(context_receiver_0, "$context_receiver_0");
        Intrinsics.checkNotNullParameter(chatId, "chatId");
        CoroutinesKt.safeLaunch$default(ViewModelKt.getViewModelScope(context_receiver_0), new ChatHandleDeepLinksDelegateImpl$handleDeepLinks$1(null), null, new ChatHandleDeepLinksDelegateImpl$handleDeepLinks$2(this, chatId, context_receiver_0, null), 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object handleMainChatDeepLinks(ChatViewModel chatViewModel, DeepLink deepLink, Continuation<? super Unit> continuation) {
        if (deepLink instanceof DeepLink.OpenDiary) {
            Object sendEvent2 = chatViewModel.sendEvent2((UiStateDelegate<ChatViewModel.UiState, ChatViewModel.Event>) chatViewModel, (ChatViewModel.Event) new ChatViewModel.Event.OpenDiary(((DeepLink.OpenDiary) deepLink).getNodeId()), continuation);
            return sendEvent2 == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? sendEvent2 : Unit.INSTANCE;
        } else if (deepLink instanceof DeepLink.OpenGenerateAvatar) {
            Object sendEvent22 = chatViewModel.sendEvent2((UiStateDelegate<ChatViewModel.UiState, ChatViewModel.Event>) chatViewModel, (ChatViewModel.Event) ChatViewModel.Event.OpenGenerateAvatar.INSTANCE, continuation);
            return sendEvent22 == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? sendEvent22 : Unit.INSTANCE;
        } else {
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object navigateToMainChat(ChatViewModel chatViewModel, Continuation<? super Unit> continuation) {
        ChatHandleDeepLinksDelegateImpl$navigateToMainChat$1 chatHandleDeepLinksDelegateImpl$navigateToMainChat$1;
        int i;
        ChatInfo chatInfo;
        String chatId;
        if (continuation instanceof ChatHandleDeepLinksDelegateImpl$navigateToMainChat$1) {
            chatHandleDeepLinksDelegateImpl$navigateToMainChat$1 = (ChatHandleDeepLinksDelegateImpl$navigateToMainChat$1) continuation;
            if ((chatHandleDeepLinksDelegateImpl$navigateToMainChat$1.label & Integer.MIN_VALUE) != 0) {
                chatHandleDeepLinksDelegateImpl$navigateToMainChat$1.label -= Integer.MIN_VALUE;
                Object obj = chatHandleDeepLinksDelegateImpl$navigateToMainChat$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = chatHandleDeepLinksDelegateImpl$navigateToMainChat$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    ChatsInfoInteractor chatsInfoInteractor = this.chatsInfoInteractor;
                    chatHandleDeepLinksDelegateImpl$navigateToMainChat$1.L$0 = chatViewModel;
                    chatHandleDeepLinksDelegateImpl$navigateToMainChat$1.label = 1;
                    obj = chatsInfoInteractor.getDefaultChatInfo(chatHandleDeepLinksDelegateImpl$navigateToMainChat$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else if (i != 1) {
                    if (i == 2) {
                        ResultKt.throwOnFailure(obj);
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    chatViewModel = (ChatViewModel) chatHandleDeepLinksDelegateImpl$navigateToMainChat$1.L$0;
                    ResultKt.throwOnFailure(obj);
                }
                chatInfo = (ChatInfo) obj;
                if (chatInfo != null || (chatId = chatInfo.getChatId()) == null) {
                    return Unit.INSTANCE;
                }
                chatHandleDeepLinksDelegateImpl$navigateToMainChat$1.L$0 = null;
                chatHandleDeepLinksDelegateImpl$navigateToMainChat$1.label = 2;
                if (chatViewModel.sendEvent2((UiStateDelegate<ChatViewModel.UiState, ChatViewModel.Event>) chatViewModel, (ChatViewModel.Event) new ChatViewModel.Event.OpenChat(chatId), (Continuation<? super Unit>) chatHandleDeepLinksDelegateImpl$navigateToMainChat$1) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                return Unit.INSTANCE;
            }
        }
        chatHandleDeepLinksDelegateImpl$navigateToMainChat$1 = new ChatHandleDeepLinksDelegateImpl$navigateToMainChat$1(this, continuation);
        Object obj2 = chatHandleDeepLinksDelegateImpl$navigateToMainChat$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = chatHandleDeepLinksDelegateImpl$navigateToMainChat$1.label;
        if (i != 0) {
        }
        chatInfo = (ChatInfo) obj2;
        if (chatInfo != null) {
        }
        return Unit.INSTANCE;
    }
}
