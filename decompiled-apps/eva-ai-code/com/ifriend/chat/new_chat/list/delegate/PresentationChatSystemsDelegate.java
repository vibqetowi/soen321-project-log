package com.ifriend.chat.new_chat.list.delegate;

import com.ifriend.chat.new_chat.list.delegate.providers.PresentationChatSystemsProvider;
import com.ifriend.chat.new_chat.list.presentationSystems.audio.changeVoice.ChangeVoiceSystem;
import com.ifriend.chat.new_chat.list.presentationSystems.audio.decode.DecodingAudioEventsHandlingSystem;
import com.ifriend.chat.new_chat.list.presentationSystems.audio.decode.DecodingAudioInitialStateSystem;
import com.ifriend.chat.new_chat.list.presentationSystems.audio.playback.AudioPlaybackSystem;
import com.ifriend.chat.new_chat.list.presentationSystems.image.ImagesLockerSystem;
import com.ifriend.chat.new_chat.list.presentationSystems.levels.ExperienceMessageAnimationSystem;
import com.ifriend.chat.new_chat.list.presentationSystems.newMessagesAnimation.LiveMessagesAnimationSystem;
import com.ifriend.chat.new_chat.list.presentationSystems.scroll.ScrollControllingSystem;
import com.ifriend.chat.new_chat.list.presentationSystems.sextingRequest.ShowSextingRequestSystem;
import com.ifriend.common_entities_engine.System;
import com.ifriend.domain.logic.chat.ChatClientInteractor;
import com.ifriend.domain.newChat.chat.ChatClient;
import com.ifriend.domain.newChat.chat.systems.dateSeparator.DateSeparatorSystem;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: PresentationChatSystemsDelegate.kt */
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001Bg\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0013\u0012\u0006\u0010\u0014\u001a\u00020\u0015\u0012\u0006\u0010\u0016\u001a\u00020\u0017\u0012\u0006\u0010\u0018\u001a\u00020\u0019¢\u0006\u0002\u0010\u001aJ\u0019\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001eH\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\u001fR\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006 "}, d2 = {"Lcom/ifriend/chat/new_chat/list/delegate/PresentationChatSystemsDelegate;", "", "liveMessagesAnimationSystem", "Lcom/ifriend/chat/new_chat/list/presentationSystems/newMessagesAnimation/LiveMessagesAnimationSystem;", "scrollControllingSystem", "Lcom/ifriend/chat/new_chat/list/presentationSystems/scroll/ScrollControllingSystem;", "audioPlaybackSystem", "Lcom/ifriend/chat/new_chat/list/presentationSystems/audio/playback/AudioPlaybackSystem;", "changeVoiceSystem", "Lcom/ifriend/chat/new_chat/list/presentationSystems/audio/changeVoice/ChangeVoiceSystem;", "decodingAudioInitialStateSystem", "Lcom/ifriend/chat/new_chat/list/presentationSystems/audio/decode/DecodingAudioInitialStateSystem;", "decodingAudioEventsHandlingSystem", "Lcom/ifriend/chat/new_chat/list/presentationSystems/audio/decode/DecodingAudioEventsHandlingSystem;", "showSextingRequestSystem", "Lcom/ifriend/chat/new_chat/list/presentationSystems/sextingRequest/ShowSextingRequestSystem;", "imagesLockerSystem", "Lcom/ifriend/chat/new_chat/list/presentationSystems/image/ImagesLockerSystem;", "dateSeparatorSystem", "Lcom/ifriend/domain/newChat/chat/systems/dateSeparator/DateSeparatorSystem;", "experienceMessageAnimationSystem", "Lcom/ifriend/chat/new_chat/list/presentationSystems/levels/ExperienceMessageAnimationSystem;", "chatClientInteractor", "Lcom/ifriend/domain/logic/chat/ChatClientInteractor;", "presentationChatSystemsProvider", "Lcom/ifriend/chat/new_chat/list/delegate/providers/PresentationChatSystemsProvider;", "(Lcom/ifriend/chat/new_chat/list/presentationSystems/newMessagesAnimation/LiveMessagesAnimationSystem;Lcom/ifriend/chat/new_chat/list/presentationSystems/scroll/ScrollControllingSystem;Lcom/ifriend/chat/new_chat/list/presentationSystems/audio/playback/AudioPlaybackSystem;Lcom/ifriend/chat/new_chat/list/presentationSystems/audio/changeVoice/ChangeVoiceSystem;Lcom/ifriend/chat/new_chat/list/presentationSystems/audio/decode/DecodingAudioInitialStateSystem;Lcom/ifriend/chat/new_chat/list/presentationSystems/audio/decode/DecodingAudioEventsHandlingSystem;Lcom/ifriend/chat/new_chat/list/presentationSystems/sextingRequest/ShowSextingRequestSystem;Lcom/ifriend/chat/new_chat/list/presentationSystems/image/ImagesLockerSystem;Lcom/ifriend/domain/newChat/chat/systems/dateSeparator/DateSeparatorSystem;Lcom/ifriend/chat/new_chat/list/presentationSystems/levels/ExperienceMessageAnimationSystem;Lcom/ifriend/domain/logic/chat/ChatClientInteractor;Lcom/ifriend/chat/new_chat/list/delegate/providers/PresentationChatSystemsProvider;)V", "addPresentationSystems", "", "chatId", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "new_chat_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class PresentationChatSystemsDelegate {
    public static final int $stable = 8;
    private final AudioPlaybackSystem audioPlaybackSystem;
    private final ChangeVoiceSystem changeVoiceSystem;
    private final ChatClientInteractor chatClientInteractor;
    private final DateSeparatorSystem dateSeparatorSystem;
    private final DecodingAudioEventsHandlingSystem decodingAudioEventsHandlingSystem;
    private final DecodingAudioInitialStateSystem decodingAudioInitialStateSystem;
    private final ExperienceMessageAnimationSystem experienceMessageAnimationSystem;
    private final ImagesLockerSystem imagesLockerSystem;
    private final LiveMessagesAnimationSystem liveMessagesAnimationSystem;
    private final PresentationChatSystemsProvider presentationChatSystemsProvider;
    private final ScrollControllingSystem scrollControllingSystem;
    private final ShowSextingRequestSystem showSextingRequestSystem;

    @Inject
    public PresentationChatSystemsDelegate(LiveMessagesAnimationSystem liveMessagesAnimationSystem, ScrollControllingSystem scrollControllingSystem, AudioPlaybackSystem audioPlaybackSystem, ChangeVoiceSystem changeVoiceSystem, DecodingAudioInitialStateSystem decodingAudioInitialStateSystem, DecodingAudioEventsHandlingSystem decodingAudioEventsHandlingSystem, ShowSextingRequestSystem showSextingRequestSystem, ImagesLockerSystem imagesLockerSystem, DateSeparatorSystem dateSeparatorSystem, ExperienceMessageAnimationSystem experienceMessageAnimationSystem, ChatClientInteractor chatClientInteractor, PresentationChatSystemsProvider presentationChatSystemsProvider) {
        Intrinsics.checkNotNullParameter(liveMessagesAnimationSystem, "liveMessagesAnimationSystem");
        Intrinsics.checkNotNullParameter(scrollControllingSystem, "scrollControllingSystem");
        Intrinsics.checkNotNullParameter(audioPlaybackSystem, "audioPlaybackSystem");
        Intrinsics.checkNotNullParameter(changeVoiceSystem, "changeVoiceSystem");
        Intrinsics.checkNotNullParameter(decodingAudioInitialStateSystem, "decodingAudioInitialStateSystem");
        Intrinsics.checkNotNullParameter(decodingAudioEventsHandlingSystem, "decodingAudioEventsHandlingSystem");
        Intrinsics.checkNotNullParameter(showSextingRequestSystem, "showSextingRequestSystem");
        Intrinsics.checkNotNullParameter(imagesLockerSystem, "imagesLockerSystem");
        Intrinsics.checkNotNullParameter(dateSeparatorSystem, "dateSeparatorSystem");
        Intrinsics.checkNotNullParameter(experienceMessageAnimationSystem, "experienceMessageAnimationSystem");
        Intrinsics.checkNotNullParameter(chatClientInteractor, "chatClientInteractor");
        Intrinsics.checkNotNullParameter(presentationChatSystemsProvider, "presentationChatSystemsProvider");
        this.liveMessagesAnimationSystem = liveMessagesAnimationSystem;
        this.scrollControllingSystem = scrollControllingSystem;
        this.audioPlaybackSystem = audioPlaybackSystem;
        this.changeVoiceSystem = changeVoiceSystem;
        this.decodingAudioInitialStateSystem = decodingAudioInitialStateSystem;
        this.decodingAudioEventsHandlingSystem = decodingAudioEventsHandlingSystem;
        this.showSextingRequestSystem = showSextingRequestSystem;
        this.imagesLockerSystem = imagesLockerSystem;
        this.dateSeparatorSystem = dateSeparatorSystem;
        this.experienceMessageAnimationSystem = experienceMessageAnimationSystem;
        this.chatClientInteractor = chatClientInteractor;
        this.presentationChatSystemsProvider = presentationChatSystemsProvider;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object addPresentationSystems(String str, Continuation<? super Unit> continuation) {
        PresentationChatSystemsDelegate$addPresentationSystems$1 presentationChatSystemsDelegate$addPresentationSystems$1;
        int i;
        PresentationChatSystemsDelegate presentationChatSystemsDelegate;
        if (continuation instanceof PresentationChatSystemsDelegate$addPresentationSystems$1) {
            presentationChatSystemsDelegate$addPresentationSystems$1 = (PresentationChatSystemsDelegate$addPresentationSystems$1) continuation;
            if ((presentationChatSystemsDelegate$addPresentationSystems$1.label & Integer.MIN_VALUE) != 0) {
                presentationChatSystemsDelegate$addPresentationSystems$1.label -= Integer.MIN_VALUE;
                Object obj = presentationChatSystemsDelegate$addPresentationSystems$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = presentationChatSystemsDelegate$addPresentationSystems$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    ChatClientInteractor chatClientInteractor = this.chatClientInteractor;
                    presentationChatSystemsDelegate$addPresentationSystems$1.L$0 = this;
                    presentationChatSystemsDelegate$addPresentationSystems$1.L$1 = str;
                    presentationChatSystemsDelegate$addPresentationSystems$1.label = 1;
                    obj = chatClientInteractor.getChatsClient(str, presentationChatSystemsDelegate$addPresentationSystems$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    presentationChatSystemsDelegate = this;
                } else if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    str = (String) presentationChatSystemsDelegate$addPresentationSystems$1.L$1;
                    presentationChatSystemsDelegate = (PresentationChatSystemsDelegate) presentationChatSystemsDelegate$addPresentationSystems$1.L$0;
                    ResultKt.throwOnFailure(obj);
                }
                ((ChatClient) obj).expandWithSystemsChain(CollectionsKt.listOf((Object[]) new System[]{presentationChatSystemsDelegate.liveMessagesAnimationSystem, presentationChatSystemsDelegate.experienceMessageAnimationSystem, presentationChatSystemsDelegate.presentationChatSystemsProvider.getExperienceMessageAnalyticsSystem(str), presentationChatSystemsDelegate.scrollControllingSystem, presentationChatSystemsDelegate.audioPlaybackSystem, presentationChatSystemsDelegate.changeVoiceSystem, presentationChatSystemsDelegate.decodingAudioInitialStateSystem, presentationChatSystemsDelegate.decodingAudioEventsHandlingSystem, presentationChatSystemsDelegate.imagesLockerSystem, presentationChatSystemsDelegate.showSextingRequestSystem, presentationChatSystemsDelegate.dateSeparatorSystem}));
                return Unit.INSTANCE;
            }
        }
        presentationChatSystemsDelegate$addPresentationSystems$1 = new PresentationChatSystemsDelegate$addPresentationSystems$1(this, continuation);
        Object obj2 = presentationChatSystemsDelegate$addPresentationSystems$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = presentationChatSystemsDelegate$addPresentationSystems$1.label;
        if (i != 0) {
        }
        ((ChatClient) obj2).expandWithSystemsChain(CollectionsKt.listOf((Object[]) new System[]{presentationChatSystemsDelegate.liveMessagesAnimationSystem, presentationChatSystemsDelegate.experienceMessageAnimationSystem, presentationChatSystemsDelegate.presentationChatSystemsProvider.getExperienceMessageAnalyticsSystem(str), presentationChatSystemsDelegate.scrollControllingSystem, presentationChatSystemsDelegate.audioPlaybackSystem, presentationChatSystemsDelegate.changeVoiceSystem, presentationChatSystemsDelegate.decodingAudioInitialStateSystem, presentationChatSystemsDelegate.decodingAudioEventsHandlingSystem, presentationChatSystemsDelegate.imagesLockerSystem, presentationChatSystemsDelegate.showSextingRequestSystem, presentationChatSystemsDelegate.dateSeparatorSystem}));
        return Unit.INSTANCE;
    }
}
