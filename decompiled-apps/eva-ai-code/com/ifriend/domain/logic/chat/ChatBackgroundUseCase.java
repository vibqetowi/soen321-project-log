package com.ifriend.domain.logic.chat;

import com.ifriend.domain.data.BotRepository;
import com.ifriend.domain.data.chat.ChatBackgroundRepository;
import com.ifriend.domain.featuretoggles.ChatVideoBackgroundFeatureToggle;
import com.ifriend.domain.logic.chat.info.ChatsInfoInteractor;
import com.ifriend.domain.models.profile.bot.Bot;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import org.apache.http.cookie.ClientCookie;
/* compiled from: ChatBackgroundUseCase.kt */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ!\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u000fH\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\u0010J\u001f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\u0006\u0010\r\u001a\u00020\fH\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\u0014J\u0019\u0010\u0015\u001a\u00020\u00162\u0006\u0010\r\u001a\u00020\fH\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\u0014R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0017"}, d2 = {"Lcom/ifriend/domain/logic/chat/ChatBackgroundUseCase;", "", "chatBackgroundRepository", "Lcom/ifriend/domain/data/chat/ChatBackgroundRepository;", "chatsInfoInteractor", "Lcom/ifriend/domain/logic/chat/info/ChatsInfoInteractor;", "videoFeatureToggle", "Lcom/ifriend/domain/featuretoggles/ChatVideoBackgroundFeatureToggle;", "botDataRepository", "Lcom/ifriend/domain/data/BotRepository;", "(Lcom/ifriend/domain/data/chat/ChatBackgroundRepository;Lcom/ifriend/domain/logic/chat/info/ChatsInfoInteractor;Lcom/ifriend/domain/featuretoggles/ChatVideoBackgroundFeatureToggle;Lcom/ifriend/domain/data/BotRepository;)V", "getTriggerVideoBackground", "", "chatId", "backgroundTrigger", "Lcom/ifriend/domain/logic/chat/ChatBackgroundTrigger;", "(Ljava/lang/String;Lcom/ifriend/domain/logic/chat/ChatBackgroundTrigger;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "isAvailableVideoBackgroundFlow", "Lkotlinx/coroutines/flow/Flow;", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "preloadVideos", "", ClientCookie.DOMAIN_ATTR}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ChatBackgroundUseCase {
    private final BotRepository botDataRepository;
    private final ChatBackgroundRepository chatBackgroundRepository;
    private final ChatsInfoInteractor chatsInfoInteractor;
    private final ChatVideoBackgroundFeatureToggle videoFeatureToggle;

    @Inject
    public ChatBackgroundUseCase(ChatBackgroundRepository chatBackgroundRepository, ChatsInfoInteractor chatsInfoInteractor, ChatVideoBackgroundFeatureToggle videoFeatureToggle, BotRepository botDataRepository) {
        Intrinsics.checkNotNullParameter(chatBackgroundRepository, "chatBackgroundRepository");
        Intrinsics.checkNotNullParameter(chatsInfoInteractor, "chatsInfoInteractor");
        Intrinsics.checkNotNullParameter(videoFeatureToggle, "videoFeatureToggle");
        Intrinsics.checkNotNullParameter(botDataRepository, "botDataRepository");
        this.chatBackgroundRepository = chatBackgroundRepository;
        this.chatsInfoInteractor = chatsInfoInteractor;
        this.videoFeatureToggle = videoFeatureToggle;
        this.botDataRepository = botDataRepository;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x006f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object preloadVideos(String str, Continuation<? super Unit> continuation) {
        ChatBackgroundUseCase$preloadVideos$1 chatBackgroundUseCase$preloadVideos$1;
        Object obj;
        int i;
        ChatBackgroundUseCase chatBackgroundUseCase;
        if (continuation instanceof ChatBackgroundUseCase$preloadVideos$1) {
            chatBackgroundUseCase$preloadVideos$1 = (ChatBackgroundUseCase$preloadVideos$1) continuation;
            if ((chatBackgroundUseCase$preloadVideos$1.label & Integer.MIN_VALUE) != 0) {
                chatBackgroundUseCase$preloadVideos$1.label -= Integer.MIN_VALUE;
                obj = chatBackgroundUseCase$preloadVideos$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = chatBackgroundUseCase$preloadVideos$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    ChatBackgroundRepository chatBackgroundRepository = this.chatBackgroundRepository;
                    chatBackgroundUseCase$preloadVideos$1.L$0 = this;
                    chatBackgroundUseCase$preloadVideos$1.L$1 = str;
                    chatBackgroundUseCase$preloadVideos$1.label = 1;
                    obj = chatBackgroundRepository.isPreloadVideos(str, chatBackgroundUseCase$preloadVideos$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    chatBackgroundUseCase = this;
                } else if (i != 1) {
                    if (i == 2) {
                        ResultKt.throwOnFailure(obj);
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    str = (String) chatBackgroundUseCase$preloadVideos$1.L$1;
                    chatBackgroundUseCase = (ChatBackgroundUseCase) chatBackgroundUseCase$preloadVideos$1.L$0;
                    ResultKt.throwOnFailure(obj);
                }
                if (((Boolean) obj).booleanValue()) {
                    ChatBackgroundRepository chatBackgroundRepository2 = chatBackgroundUseCase.chatBackgroundRepository;
                    chatBackgroundUseCase$preloadVideos$1.L$0 = null;
                    chatBackgroundUseCase$preloadVideos$1.L$1 = null;
                    chatBackgroundUseCase$preloadVideos$1.label = 2;
                    if (chatBackgroundRepository2.preloadVideos(str, chatBackgroundUseCase$preloadVideos$1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    return Unit.INSTANCE;
                }
                return Unit.INSTANCE;
            }
        }
        chatBackgroundUseCase$preloadVideos$1 = new ChatBackgroundUseCase$preloadVideos$1(this, continuation);
        obj = chatBackgroundUseCase$preloadVideos$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = chatBackgroundUseCase$preloadVideos$1.label;
        if (i != 0) {
        }
        if (((Boolean) obj).booleanValue()) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x008a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x008b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object isAvailableVideoBackgroundFlow(String str, Continuation<? super Flow<Boolean>> continuation) {
        ChatBackgroundUseCase$isAvailableVideoBackgroundFlow$1 chatBackgroundUseCase$isAvailableVideoBackgroundFlow$1;
        Object coroutine_suspended;
        int i;
        ChatBackgroundUseCase chatBackgroundUseCase;
        Flow<Bot> flow;
        Object isPreloadVideosFlow;
        Flow<Bot> flow2;
        String str2;
        Flow flow3;
        ChatBackgroundUseCase chatBackgroundUseCase2;
        if (continuation instanceof ChatBackgroundUseCase$isAvailableVideoBackgroundFlow$1) {
            chatBackgroundUseCase$isAvailableVideoBackgroundFlow$1 = (ChatBackgroundUseCase$isAvailableVideoBackgroundFlow$1) continuation;
            if ((chatBackgroundUseCase$isAvailableVideoBackgroundFlow$1.label & Integer.MIN_VALUE) != 0) {
                chatBackgroundUseCase$isAvailableVideoBackgroundFlow$1.label -= Integer.MIN_VALUE;
                Object obj = chatBackgroundUseCase$isAvailableVideoBackgroundFlow$1.result;
                coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = chatBackgroundUseCase$isAvailableVideoBackgroundFlow$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    Flow<Bot> bot = this.botDataRepository.getBot();
                    ChatVideoBackgroundFeatureToggle chatVideoBackgroundFeatureToggle = this.videoFeatureToggle;
                    chatBackgroundUseCase$isAvailableVideoBackgroundFlow$1.L$0 = this;
                    chatBackgroundUseCase$isAvailableVideoBackgroundFlow$1.L$1 = str;
                    chatBackgroundUseCase$isAvailableVideoBackgroundFlow$1.L$2 = bot;
                    chatBackgroundUseCase$isAvailableVideoBackgroundFlow$1.label = 1;
                    Object isEnabled = chatVideoBackgroundFeatureToggle.isEnabled(chatBackgroundUseCase$isAvailableVideoBackgroundFlow$1);
                    if (isEnabled == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    chatBackgroundUseCase = this;
                    flow = bot;
                    obj = isEnabled;
                } else if (i != 1) {
                    if (i == 2) {
                        flow3 = (Flow) chatBackgroundUseCase$isAvailableVideoBackgroundFlow$1.L$3;
                        flow2 = (Flow) chatBackgroundUseCase$isAvailableVideoBackgroundFlow$1.L$2;
                        str2 = (String) chatBackgroundUseCase$isAvailableVideoBackgroundFlow$1.L$1;
                        chatBackgroundUseCase2 = (ChatBackgroundUseCase) chatBackgroundUseCase$isAvailableVideoBackgroundFlow$1.L$0;
                        ResultKt.throwOnFailure(obj);
                        return FlowKt.combine(flow2, flow3, (Flow) obj, chatBackgroundUseCase2.chatsInfoInteractor.getChatsInfoFlow(str2), new ChatBackgroundUseCase$isAvailableVideoBackgroundFlow$2(null));
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    String str3 = (String) chatBackgroundUseCase$isAvailableVideoBackgroundFlow$1.L$1;
                    chatBackgroundUseCase = (ChatBackgroundUseCase) chatBackgroundUseCase$isAvailableVideoBackgroundFlow$1.L$0;
                    ResultKt.throwOnFailure(obj);
                    flow = (Flow) chatBackgroundUseCase$isAvailableVideoBackgroundFlow$1.L$2;
                    str = str3;
                }
                Flow flow4 = (Flow) obj;
                ChatBackgroundRepository chatBackgroundRepository = chatBackgroundUseCase.chatBackgroundRepository;
                chatBackgroundUseCase$isAvailableVideoBackgroundFlow$1.L$0 = chatBackgroundUseCase;
                chatBackgroundUseCase$isAvailableVideoBackgroundFlow$1.L$1 = str;
                chatBackgroundUseCase$isAvailableVideoBackgroundFlow$1.L$2 = flow;
                chatBackgroundUseCase$isAvailableVideoBackgroundFlow$1.L$3 = flow4;
                chatBackgroundUseCase$isAvailableVideoBackgroundFlow$1.label = 2;
                isPreloadVideosFlow = chatBackgroundRepository.isPreloadVideosFlow(str, chatBackgroundUseCase$isAvailableVideoBackgroundFlow$1);
                if (isPreloadVideosFlow != coroutine_suspended) {
                    return coroutine_suspended;
                }
                flow2 = flow;
                str2 = str;
                flow3 = flow4;
                obj = isPreloadVideosFlow;
                chatBackgroundUseCase2 = chatBackgroundUseCase;
                return FlowKt.combine(flow2, flow3, (Flow) obj, chatBackgroundUseCase2.chatsInfoInteractor.getChatsInfoFlow(str2), new ChatBackgroundUseCase$isAvailableVideoBackgroundFlow$2(null));
            }
        }
        chatBackgroundUseCase$isAvailableVideoBackgroundFlow$1 = new ChatBackgroundUseCase$isAvailableVideoBackgroundFlow$1(this, continuation);
        Object obj2 = chatBackgroundUseCase$isAvailableVideoBackgroundFlow$1.result;
        coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = chatBackgroundUseCase$isAvailableVideoBackgroundFlow$1.label;
        if (i != 0) {
        }
        Flow flow42 = (Flow) obj2;
        ChatBackgroundRepository chatBackgroundRepository2 = chatBackgroundUseCase.chatBackgroundRepository;
        chatBackgroundUseCase$isAvailableVideoBackgroundFlow$1.L$0 = chatBackgroundUseCase;
        chatBackgroundUseCase$isAvailableVideoBackgroundFlow$1.L$1 = str;
        chatBackgroundUseCase$isAvailableVideoBackgroundFlow$1.L$2 = flow;
        chatBackgroundUseCase$isAvailableVideoBackgroundFlow$1.L$3 = flow42;
        chatBackgroundUseCase$isAvailableVideoBackgroundFlow$1.label = 2;
        isPreloadVideosFlow = chatBackgroundRepository2.isPreloadVideosFlow(str, chatBackgroundUseCase$isAvailableVideoBackgroundFlow$1);
        if (isPreloadVideosFlow != coroutine_suspended) {
        }
    }

    public final Object getTriggerVideoBackground(String str, ChatBackgroundTrigger chatBackgroundTrigger, Continuation<? super String> continuation) {
        return this.chatBackgroundRepository.getTriggerVideoUri(str, chatBackgroundTrigger, continuation);
    }
}
