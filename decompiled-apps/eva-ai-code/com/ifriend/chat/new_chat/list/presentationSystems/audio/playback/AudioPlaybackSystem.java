package com.ifriend.chat.new_chat.list.presentationSystems.audio.playback;

import android.net.Uri;
import androidx.core.app.NotificationCompat;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.ifriend.chat.new_chat.ChatCoroutineScopeQualifier;
import com.ifriend.chat.new_chat.list.player.AudioMessage;
import com.ifriend.chat.new_chat.list.player.AudioPlayer;
import com.ifriend.chat.new_chat.list.player.AudioPlayerState;
import com.ifriend.chat.new_chat.list.player.AudioPlayerStateBox;
import com.ifriend.chat.new_chat.list.presentationSystems.audio.playback.AudioStatusComponent;
import com.ifriend.common_entities_engine.Component;
import com.ifriend.common_entities_engine.ComponentsHolderKt;
import com.ifriend.common_entities_engine.CoroutineScopeSystem;
import com.ifriend.common_entities_engine.EntitiesState;
import com.ifriend.common_entities_engine.Entity;
import com.ifriend.common_entities_engine.Event;
import com.ifriend.common_entities_engine.State;
import com.ifriend.domain.newChat.chat.models.ChatMessage;
import com.ifriend.domain.newChat.chat.models.MessageContent;
import com.ifriend.domain.newChat.chat.models.MessageInfo;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
/* compiled from: AudioPlaybackSystem.kt */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\b\u0010\f\u001a\u00020\rH\u0002J!\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0082@ø\u0001\u0000¢\u0006\u0002\u0010\u0014J\u0019\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\u0016\u001a\u00020\u0017H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u0018J\b\u0010\u0019\u001a\u00020\u000fH\u0016J\u0019\u0010\u001a\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u0002H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u001cJ\u0016\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001f0\u001e2\u0006\u0010\u001b\u001a\u00020\u0002H\u0002R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006 "}, d2 = {"Lcom/ifriend/chat/new_chat/list/presentationSystems/audio/playback/AudioPlaybackSystem;", "Lcom/ifriend/common_entities_engine/CoroutineScopeSystem;", "Lcom/ifriend/common_entities_engine/EntitiesState;", "player", "Lcom/ifriend/chat/new_chat/list/player/AudioPlayer;", "coroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "(Lcom/ifriend/chat/new_chat/list/player/AudioPlayer;Lkotlinx/coroutines/CoroutineScope;)V", "lastPlayerState", "Lcom/ifriend/chat/new_chat/list/player/AudioPlayerStateBox;", "needToUpdateState", "", "currentPlayerStatus", "Lcom/ifriend/chat/new_chat/list/presentationSystems/audio/playback/AudioStatusComponent$PlaybackStatus;", "nextAudioState", "", "info", "Lcom/ifriend/domain/newChat/chat/models/MessageInfo;", FirebaseAnalytics.Param.CONTENT, "Lcom/ifriend/domain/newChat/chat/models/MessageContent$Audio;", "(Lcom/ifriend/domain/newChat/chat/models/MessageInfo;Lcom/ifriend/domain/newChat/chat/models/MessageContent$Audio;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onHandleEvent", NotificationCompat.CATEGORY_EVENT, "Lcom/ifriend/common_entities_engine/Event;", "(Lcom/ifriend/common_entities_engine/Event;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onStart", "onUpdateState", "state", "(Lcom/ifriend/common_entities_engine/EntitiesState;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateEntities", "", "Lcom/ifriend/common_entities_engine/Entity;", "new_chat_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AudioPlaybackSystem extends CoroutineScopeSystem<EntitiesState> {
    public static final int $stable = 8;
    private AudioPlayerStateBox lastPlayerState;
    private boolean needToUpdateState;
    private final AudioPlayer player;

    @Override // com.ifriend.common_entities_engine.System
    public /* bridge */ /* synthetic */ Object onUpdateState(State state, Continuation continuation) {
        return onUpdateState((EntitiesState) state, (Continuation<? super EntitiesState>) continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @Inject
    public AudioPlaybackSystem(AudioPlayer player, @ChatCoroutineScopeQualifier CoroutineScope coroutineScope) {
        super(coroutineScope);
        Intrinsics.checkNotNullParameter(player, "player");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        this.player = player;
    }

    @Override // com.ifriend.common_entities_engine.System
    public void onStart() {
        super.onStart();
        FlowKt.launchIn(FlowKt.m8846catch(FlowKt.onEach(this.player.playerState(), new AudioPlaybackSystem$onStart$1(this, null)), new AudioPlaybackSystem$onStart$2(this, null)), this);
    }

    public Object onUpdateState(EntitiesState entitiesState, Continuation<? super EntitiesState> continuation) {
        if (this.needToUpdateState) {
            this.needToUpdateState = false;
            return EntitiesState.copy$default(entitiesState, updateEntities(entitiesState), null, 2, null);
        }
        return entitiesState;
    }

    private final List<Entity> updateEntities(EntitiesState entitiesState) {
        AudioStatusComponent.PlaybackStatus currentPlayerStatus = currentPlayerStatus();
        List<Entity> entities = entitiesState.getEntities();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(entities, 10));
        for (Entity entity : entities) {
            ChatMessage chatMessage = (ChatMessage) entity.get(Reflection.getOrCreateKotlinClass(ChatMessage.class));
            if (chatMessage != null) {
                MessageContent content = chatMessage.getContent();
                if (content instanceof MessageContent.Audio) {
                    MessageContent.Audio audio = (MessageContent.Audio) content;
                    AudioPlayerStateBox audioPlayerStateBox = this.lastPlayerState;
                    AudioStatusComponent.PlaybackStatus.Idle idle = Intrinsics.areEqual(String.valueOf(audioPlayerStateBox != null ? audioPlayerStateBox.getUri() : null), audio.getAudioUri()) ? currentPlayerStatus : AudioStatusComponent.PlaybackStatus.Idle.INSTANCE;
                    AudioStatusComponent audioStatusComponent = (AudioStatusComponent) entity.get(Reflection.getOrCreateKotlinClass(AudioStatusComponent.class));
                    if (!Intrinsics.areEqual(audioStatusComponent != null ? audioStatusComponent.getPlaybackStatus() : null, idle)) {
                        Set<Component> components = entity.getComponents();
                        AudioStatusComponent audioStatusComponent2 = new AudioStatusComponent(idle);
                        ArrayList arrayList2 = new ArrayList();
                        for (Object obj : components) {
                            if (!(((Component) obj) instanceof AudioStatusComponent)) {
                                arrayList2.add(obj);
                            }
                        }
                        entity = entity.copy(ComponentsHolderKt.add(CollectionsKt.toSet(arrayList2), audioStatusComponent2));
                    }
                }
            }
            arrayList.add(entity);
        }
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0039  */
    @Override // com.ifriend.common_entities_engine.System
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object onHandleEvent(Event event, Continuation<? super Boolean> continuation) {
        AudioPlaybackSystem$onHandleEvent$1 audioPlaybackSystem$onHandleEvent$1;
        int i;
        if (continuation instanceof AudioPlaybackSystem$onHandleEvent$1) {
            audioPlaybackSystem$onHandleEvent$1 = (AudioPlaybackSystem$onHandleEvent$1) continuation;
            if ((audioPlaybackSystem$onHandleEvent$1.label & Integer.MIN_VALUE) != 0) {
                audioPlaybackSystem$onHandleEvent$1.label -= Integer.MIN_VALUE;
                Object obj = audioPlaybackSystem$onHandleEvent$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = audioPlaybackSystem$onHandleEvent$1.label;
                if (i == 0) {
                    if (i == 1) {
                        ResultKt.throwOnFailure(obj);
                        return Boxing.boxBoolean(true);
                    } else if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        ResultKt.throwOnFailure(obj);
                    }
                }
                ResultKt.throwOnFailure(obj);
                if (event instanceof AudioClickEvent) {
                    AudioClickEvent audioClickEvent = (AudioClickEvent) event;
                    MessageInfo info = audioClickEvent.getInfo();
                    MessageContent.Audio content = audioClickEvent.getContent();
                    audioPlaybackSystem$onHandleEvent$1.label = 1;
                    if (nextAudioState(info, content, audioPlaybackSystem$onHandleEvent$1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    return Boxing.boxBoolean(true);
                }
                audioPlaybackSystem$onHandleEvent$1.label = 2;
                obj = super.onHandleEvent(event, audioPlaybackSystem$onHandleEvent$1);
                return obj == coroutine_suspended ? coroutine_suspended : obj;
            }
        }
        audioPlaybackSystem$onHandleEvent$1 = new AudioPlaybackSystem$onHandleEvent$1(this, continuation);
        Object obj2 = audioPlaybackSystem$onHandleEvent$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = audioPlaybackSystem$onHandleEvent$1.label;
        if (i == 0) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object nextAudioState(MessageInfo messageInfo, MessageContent.Audio audio, Continuation<? super Unit> continuation) {
        Uri parse = Uri.parse(audio.getAudioUri());
        Intrinsics.checkNotNullExpressionValue(parse, "parse(this)");
        AudioPlayerStateBox audioPlayerStateBox = this.lastPlayerState;
        boolean areEqual = Intrinsics.areEqual(audioPlayerStateBox != null ? audioPlayerStateBox.getUri() : null, parse);
        AudioMessage audioMessage = new AudioMessage(parse, messageInfo.getIds().getMessageId(), messageInfo.isFromUser(), audio.getText());
        if (areEqual) {
            AudioStatusComponent.PlaybackStatus currentPlayerStatus = currentPlayerStatus();
            if (Intrinsics.areEqual(currentPlayerStatus, AudioStatusComponent.PlaybackStatus.Idle.INSTANCE)) {
                Object loadAndPlayAudio = this.player.loadAndPlayAudio(audioMessage, continuation);
                return loadAndPlayAudio == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? loadAndPlayAudio : Unit.INSTANCE;
            }
            if (!Intrinsics.areEqual(currentPlayerStatus, AudioStatusComponent.PlaybackStatus.Loading.INSTANCE)) {
                if (currentPlayerStatus instanceof AudioStatusComponent.PlaybackStatus.Paused) {
                    Object play = this.player.play(continuation);
                    return play == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? play : Unit.INSTANCE;
                } else if (currentPlayerStatus instanceof AudioStatusComponent.PlaybackStatus.Playing) {
                    Object pause = this.player.pause(continuation);
                    return pause == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? pause : Unit.INSTANCE;
                }
            }
            return Unit.INSTANCE;
        }
        Object loadAndPlayAudio2 = this.player.loadAndPlayAudio(audioMessage, continuation);
        return loadAndPlayAudio2 == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? loadAndPlayAudio2 : Unit.INSTANCE;
    }

    private final AudioStatusComponent.PlaybackStatus currentPlayerStatus() {
        AudioPlayerStateBox audioPlayerStateBox = this.lastPlayerState;
        AudioPlayerState state = audioPlayerStateBox != null ? audioPlayerStateBox.getState() : null;
        if (state instanceof AudioPlayerState.Empty ? true : Intrinsics.areEqual(state, AudioPlayerState.Idle.INSTANCE)) {
            return AudioStatusComponent.PlaybackStatus.Idle.INSTANCE;
        }
        if (Intrinsics.areEqual(state, AudioPlayerState.Buffering.INSTANCE)) {
            return AudioStatusComponent.PlaybackStatus.Loading.INSTANCE;
        }
        if (Intrinsics.areEqual(state, AudioPlayerState.Ended.INSTANCE)) {
            return AudioStatusComponent.PlaybackStatus.Idle.INSTANCE;
        }
        if (state instanceof AudioPlayerState.Pause) {
            AudioPlayerState.Pause pause = (AudioPlayerState.Pause) state;
            return new AudioStatusComponent.PlaybackStatus.Paused(pause.getPosition(), pause.getDuration());
        } else if (state instanceof AudioPlayerState.Playing) {
            AudioPlayerState.Playing playing = (AudioPlayerState.Playing) state;
            return new AudioStatusComponent.PlaybackStatus.Playing(playing.getPosition(), playing.getDuration());
        } else if (state == null) {
            return AudioStatusComponent.PlaybackStatus.Idle.INSTANCE;
        } else {
            throw new NoWhenBranchMatchedException();
        }
    }
}
