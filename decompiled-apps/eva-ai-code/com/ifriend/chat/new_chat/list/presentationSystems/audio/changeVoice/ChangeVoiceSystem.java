package com.ifriend.chat.new_chat.list.presentationSystems.audio.changeVoice;

import com.ifriend.analytics.usecase.audioAi.AnalyticsAudioAiShowModalUseCase;
import com.ifriend.base.navigation.api.RouterProvider;
import com.ifriend.chat.new_chat.list.player.AudioPlayer;
import com.ifriend.chat.new_chat.list.player.AudioPlayerState;
import com.ifriend.chat.new_chat.list.player.AudioPlayerStateBox;
import com.ifriend.common_entities_engine.EntitiesState;
import com.ifriend.common_entities_engine.Entity;
import com.ifriend.common_entities_engine.System;
import com.ifriend.domain.models.profile.bot.Bot;
import com.ifriend.domain.newChat.chat.models.ChatMessage;
import com.ifriend.domain.newChat.chat.models.MessageContent;
import com.ifriend.domain.useCases.bot.get.GetBotUseCase;
import com.ifriend.presentation.temp.ChangeVoiceScreenFactory;
import com.ifriend.ui.base.modalMessage.ChooseVoicePopupDelegate;
import java.util.Iterator;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
/* compiled from: ChangeVoiceSystem.kt */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B?\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010¢\u0006\u0002\u0010\u0011J\u0019\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0002H\u0082@ø\u0001\u0000¢\u0006\u0002\u0010\u0015J\u0019\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u0002H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u0015R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0017"}, d2 = {"Lcom/ifriend/chat/new_chat/list/presentationSystems/audio/changeVoice/ChangeVoiceSystem;", "Lcom/ifriend/common_entities_engine/System;", "Lcom/ifriend/common_entities_engine/EntitiesState;", "player", "Lcom/ifriend/chat/new_chat/list/player/AudioPlayer;", "audioMessageFacade", "Lcom/ifriend/chat/new_chat/list/presentationSystems/audio/changeVoice/ChatAudioMessageFacade;", "analytics", "Lcom/ifriend/analytics/usecase/audioAi/AnalyticsAudioAiShowModalUseCase;", "popupDelegate", "Lcom/ifriend/ui/base/modalMessage/ChooseVoicePopupDelegate;", "screenFactory", "Lcom/ifriend/presentation/temp/ChangeVoiceScreenFactory;", "router", "Lcom/ifriend/base/navigation/api/RouterProvider;", "getBotUseCase", "Lcom/ifriend/domain/useCases/bot/get/GetBotUseCase;", "(Lcom/ifriend/chat/new_chat/list/player/AudioPlayer;Lcom/ifriend/chat/new_chat/list/presentationSystems/audio/changeVoice/ChatAudioMessageFacade;Lcom/ifriend/analytics/usecase/audioAi/AnalyticsAudioAiShowModalUseCase;Lcom/ifriend/ui/base/modalMessage/ChooseVoicePopupDelegate;Lcom/ifriend/presentation/temp/ChangeVoiceScreenFactory;Lcom/ifriend/base/navigation/api/RouterProvider;Lcom/ifriend/domain/useCases/bot/get/GetBotUseCase;)V", "checkAudioMessage", "", "state", "(Lcom/ifriend/common_entities_engine/EntitiesState;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onUpdateState", "new_chat_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ChangeVoiceSystem extends System<EntitiesState> {
    public static final int $stable = 8;
    private final AnalyticsAudioAiShowModalUseCase analytics;
    private final ChatAudioMessageFacade audioMessageFacade;
    private final GetBotUseCase getBotUseCase;
    private final AudioPlayer player;
    private final ChooseVoicePopupDelegate popupDelegate;
    private final RouterProvider router;
    private final ChangeVoiceScreenFactory screenFactory;

    @Inject
    public ChangeVoiceSystem(AudioPlayer player, ChatAudioMessageFacade audioMessageFacade, AnalyticsAudioAiShowModalUseCase analytics, ChooseVoicePopupDelegate popupDelegate, ChangeVoiceScreenFactory screenFactory, RouterProvider router, GetBotUseCase getBotUseCase) {
        Intrinsics.checkNotNullParameter(player, "player");
        Intrinsics.checkNotNullParameter(audioMessageFacade, "audioMessageFacade");
        Intrinsics.checkNotNullParameter(analytics, "analytics");
        Intrinsics.checkNotNullParameter(popupDelegate, "popupDelegate");
        Intrinsics.checkNotNullParameter(screenFactory, "screenFactory");
        Intrinsics.checkNotNullParameter(router, "router");
        Intrinsics.checkNotNullParameter(getBotUseCase, "getBotUseCase");
        this.player = player;
        this.audioMessageFacade = audioMessageFacade;
        this.analytics = analytics;
        this.popupDelegate = popupDelegate;
        this.screenFactory = screenFactory;
        this.router = router;
        this.getBotUseCase = getBotUseCase;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0061 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0062 A[PHI: r7 
      PHI: (r7v5 java.lang.Object) = (r7v4 java.lang.Object), (r7v1 java.lang.Object) binds: [B:21:0x005f, B:12:0x0029] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    @Override // com.ifriend.common_entities_engine.System
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object onUpdateState(EntitiesState entitiesState, Continuation<? super EntitiesState> continuation) {
        ChangeVoiceSystem$onUpdateState$1 changeVoiceSystem$onUpdateState$1;
        int i;
        ChangeVoiceSystem changeVoiceSystem;
        if (continuation instanceof ChangeVoiceSystem$onUpdateState$1) {
            changeVoiceSystem$onUpdateState$1 = (ChangeVoiceSystem$onUpdateState$1) continuation;
            if ((changeVoiceSystem$onUpdateState$1.label & Integer.MIN_VALUE) != 0) {
                changeVoiceSystem$onUpdateState$1.label -= Integer.MIN_VALUE;
                Object obj = changeVoiceSystem$onUpdateState$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = changeVoiceSystem$onUpdateState$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    changeVoiceSystem$onUpdateState$1.L$0 = this;
                    changeVoiceSystem$onUpdateState$1.L$1 = entitiesState;
                    changeVoiceSystem$onUpdateState$1.label = 1;
                    if (checkAudioMessage(entitiesState, changeVoiceSystem$onUpdateState$1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    changeVoiceSystem = this;
                } else if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                } else {
                    entitiesState = (EntitiesState) changeVoiceSystem$onUpdateState$1.L$1;
                    changeVoiceSystem = (ChangeVoiceSystem) changeVoiceSystem$onUpdateState$1.L$0;
                    ResultKt.throwOnFailure(obj);
                }
                changeVoiceSystem$onUpdateState$1.L$0 = null;
                changeVoiceSystem$onUpdateState$1.L$1 = null;
                changeVoiceSystem$onUpdateState$1.label = 2;
                obj = super.onUpdateState((ChangeVoiceSystem) entitiesState, (Continuation<? super ChangeVoiceSystem>) changeVoiceSystem$onUpdateState$1);
                return obj != coroutine_suspended ? coroutine_suspended : obj;
            }
        }
        changeVoiceSystem$onUpdateState$1 = new ChangeVoiceSystem$onUpdateState$1(this, continuation);
        Object obj2 = changeVoiceSystem$onUpdateState$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = changeVoiceSystem$onUpdateState$1.label;
        if (i != 0) {
        }
        changeVoiceSystem$onUpdateState$1.L$0 = null;
        changeVoiceSystem$onUpdateState$1.L$1 = null;
        changeVoiceSystem$onUpdateState$1.label = 2;
        obj2 = super.onUpdateState((ChangeVoiceSystem) entitiesState, (Continuation<? super ChangeVoiceSystem>) changeVoiceSystem$onUpdateState$1);
        if (obj2 != coroutine_suspended2) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x010c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0119  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x00b5 -> B:20:0x006e). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:37:0x00ca -> B:20:0x006e). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:41:0x00d6 -> B:20:0x006e). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:43:0x00de -> B:20:0x006e). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:45:0x00e4 -> B:20:0x006e). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:51:0x010a -> B:53:0x010d). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object checkAudioMessage(EntitiesState entitiesState, Continuation<? super Unit> continuation) {
        ChangeVoiceSystem$checkAudioMessage$1 changeVoiceSystem$checkAudioMessage$1;
        int i;
        Iterator it;
        ChangeVoiceSystem changeVoiceSystem;
        ChangeVoiceSystem changeVoiceSystem2;
        MessageContent messageContent;
        Iterator it2;
        AudioPlayerStateBox audioPlayerStateBox;
        String name;
        if (continuation instanceof ChangeVoiceSystem$checkAudioMessage$1) {
            changeVoiceSystem$checkAudioMessage$1 = (ChangeVoiceSystem$checkAudioMessage$1) continuation;
            if ((changeVoiceSystem$checkAudioMessage$1.label & Integer.MIN_VALUE) != 0) {
                changeVoiceSystem$checkAudioMessage$1.label -= Integer.MIN_VALUE;
                Object obj = changeVoiceSystem$checkAudioMessage$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = changeVoiceSystem$checkAudioMessage$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    it = entitiesState.getEntities().iterator();
                    changeVoiceSystem = this;
                    it2 = it;
                    while (it2.hasNext()) {
                    }
                    return Unit.INSTANCE;
                } else if (i == 1) {
                    messageContent = (MessageContent) changeVoiceSystem$checkAudioMessage$1.L$2;
                    it2 = (Iterator) changeVoiceSystem$checkAudioMessage$1.L$1;
                    changeVoiceSystem = (ChangeVoiceSystem) changeVoiceSystem$checkAudioMessage$1.L$0;
                    ResultKt.throwOnFailure(obj);
                    audioPlayerStateBox = (AudioPlayerStateBox) obj;
                    if (audioPlayerStateBox != null) {
                    }
                    while (it2.hasNext()) {
                    }
                    return Unit.INSTANCE;
                } else if (i == 2) {
                    it = (Iterator) changeVoiceSystem$checkAudioMessage$1.L$1;
                    changeVoiceSystem2 = (ChangeVoiceSystem) changeVoiceSystem$checkAudioMessage$1.L$0;
                    ResultKt.throwOnFailure(obj);
                    changeVoiceSystem$checkAudioMessage$1.L$0 = changeVoiceSystem2;
                    changeVoiceSystem$checkAudioMessage$1.L$1 = it;
                    changeVoiceSystem$checkAudioMessage$1.label = 3;
                    obj = FlowKt.firstOrNull((Flow) obj, changeVoiceSystem$checkAudioMessage$1);
                    if (obj == coroutine_suspended) {
                    }
                    Bot bot = (Bot) obj;
                    if (bot != null) {
                    }
                    if (name == null) {
                    }
                    changeVoiceSystem2.audioMessageFacade.setAudioPopUpShowed();
                    ChooseVoicePopupDelegate.setOnResultListeners$default(changeVoiceSystem2.popupDelegate, new ChangeVoiceSystem$checkAudioMessage$2$1(changeVoiceSystem2), null, 2, null);
                    changeVoiceSystem2.popupDelegate.show(name);
                    changeVoiceSystem = changeVoiceSystem2;
                    it2 = it;
                    while (it2.hasNext()) {
                    }
                    return Unit.INSTANCE;
                } else if (i == 3) {
                    it = (Iterator) changeVoiceSystem$checkAudioMessage$1.L$1;
                    changeVoiceSystem2 = (ChangeVoiceSystem) changeVoiceSystem$checkAudioMessage$1.L$0;
                    ResultKt.throwOnFailure(obj);
                    Bot bot2 = (Bot) obj;
                    name = bot2 != null ? bot2.getName() : null;
                    if (name == null) {
                        name = "";
                    }
                    changeVoiceSystem2.audioMessageFacade.setAudioPopUpShowed();
                    ChooseVoicePopupDelegate.setOnResultListeners$default(changeVoiceSystem2.popupDelegate, new ChangeVoiceSystem$checkAudioMessage$2$1(changeVoiceSystem2), null, 2, null);
                    changeVoiceSystem2.popupDelegate.show(name);
                    changeVoiceSystem = changeVoiceSystem2;
                    it2 = it;
                    while (it2.hasNext()) {
                        ChatMessage chatMessage = (ChatMessage) ((Entity) it2.next()).get(Reflection.getOrCreateKotlinClass(ChatMessage.class));
                        if (chatMessage != null) {
                            MessageContent content = chatMessage.getContent();
                            if ((content instanceof MessageContent.Audio) && !chatMessage.getInfo().isFromUser()) {
                                Flow<AudioPlayerStateBox> playerState = changeVoiceSystem.player.playerState();
                                changeVoiceSystem$checkAudioMessage$1.L$0 = changeVoiceSystem;
                                changeVoiceSystem$checkAudioMessage$1.L$1 = it2;
                                changeVoiceSystem$checkAudioMessage$1.L$2 = content;
                                changeVoiceSystem$checkAudioMessage$1.label = 1;
                                Object firstOrNull = FlowKt.firstOrNull(playerState, changeVoiceSystem$checkAudioMessage$1);
                                if (firstOrNull == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                obj = firstOrNull;
                                messageContent = content;
                                audioPlayerStateBox = (AudioPlayerStateBox) obj;
                                if (audioPlayerStateBox != null) {
                                    MessageContent.Audio audio = (MessageContent.Audio) messageContent;
                                    if (Intrinsics.areEqual(audioPlayerStateBox.getUri().toString(), audio.getAudioUri())) {
                                        AudioPlayerState state = audioPlayerStateBox.getState();
                                        if (((state instanceof AudioPlayerState.Pause) || (state instanceof AudioPlayerState.Ended)) && !changeVoiceSystem.audioMessageFacade.isAudioPopUpShowed() && !audio.isPremium()) {
                                            changeVoiceSystem.analytics.handle();
                                            GetBotUseCase getBotUseCase = changeVoiceSystem.getBotUseCase;
                                            changeVoiceSystem$checkAudioMessage$1.L$0 = changeVoiceSystem;
                                            changeVoiceSystem$checkAudioMessage$1.L$1 = it2;
                                            changeVoiceSystem$checkAudioMessage$1.L$2 = null;
                                            changeVoiceSystem$checkAudioMessage$1.label = 2;
                                            obj = getBotUseCase.flow(changeVoiceSystem$checkAudioMessage$1);
                                            if (obj == coroutine_suspended) {
                                                return coroutine_suspended;
                                            }
                                            it = it2;
                                            changeVoiceSystem2 = changeVoiceSystem;
                                            changeVoiceSystem$checkAudioMessage$1.L$0 = changeVoiceSystem2;
                                            changeVoiceSystem$checkAudioMessage$1.L$1 = it;
                                            changeVoiceSystem$checkAudioMessage$1.label = 3;
                                            obj = FlowKt.firstOrNull((Flow) obj, changeVoiceSystem$checkAudioMessage$1);
                                            if (obj == coroutine_suspended) {
                                                return coroutine_suspended;
                                            }
                                            Bot bot22 = (Bot) obj;
                                            if (bot22 != null) {
                                            }
                                            if (name == null) {
                                            }
                                            changeVoiceSystem2.audioMessageFacade.setAudioPopUpShowed();
                                            ChooseVoicePopupDelegate.setOnResultListeners$default(changeVoiceSystem2.popupDelegate, new ChangeVoiceSystem$checkAudioMessage$2$1(changeVoiceSystem2), null, 2, null);
                                            changeVoiceSystem2.popupDelegate.show(name);
                                            changeVoiceSystem = changeVoiceSystem2;
                                            it2 = it;
                                        }
                                    }
                                }
                                while (it2.hasNext()) {
                                }
                            }
                        }
                    }
                    return Unit.INSTANCE;
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }
        changeVoiceSystem$checkAudioMessage$1 = new ChangeVoiceSystem$checkAudioMessage$1(this, continuation);
        Object obj2 = changeVoiceSystem$checkAudioMessage$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = changeVoiceSystem$checkAudioMessage$1.label;
        if (i != 0) {
        }
    }
}
