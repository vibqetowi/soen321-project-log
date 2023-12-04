package com.ifriend.chat.new_chat.list.presentationSystems.audio.decode;

import com.ifriend.chat.new_chat.list.presentationSystems.audio.decode.AudioDecodingStatusComponent;
import com.ifriend.common_entities_engine.EntitiesState;
import com.ifriend.common_entities_engine.Entity;
import com.ifriend.common_entities_engine.System;
import com.ifriend.domain.data.DecodedAudioMessagesRepository;
import com.ifriend.domain.newChat.chat.models.ChatMessage;
import com.ifriend.domain.newChat.chat.models.ChatMessageKt;
import com.ifriend.domain.newChat.chat.models.MessageContent;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.Reflection;
/* compiled from: DecodingAudioInitialStateSystem.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0019\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\bR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\t"}, d2 = {"Lcom/ifriend/chat/new_chat/list/presentationSystems/audio/decode/DecodingAudioInitialStateSystem;", "Lcom/ifriend/common_entities_engine/System;", "Lcom/ifriend/common_entities_engine/EntitiesState;", "repository", "Lcom/ifriend/domain/data/DecodedAudioMessagesRepository;", "(Lcom/ifriend/domain/data/DecodedAudioMessagesRepository;)V", "onUpdateState", "state", "(Lcom/ifriend/common_entities_engine/EntitiesState;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "new_chat_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class DecodingAudioInitialStateSystem extends System<EntitiesState> {
    public static final int $stable = 8;
    private final DecodedAudioMessagesRepository repository;

    @Inject
    public DecodingAudioInitialStateSystem(DecodedAudioMessagesRepository repository) {
        Intrinsics.checkNotNullParameter(repository, "repository");
        this.repository = repository;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0116  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x00a0 -> B:40:0x0110). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x00e0 -> B:35:0x00e5). Please submit an issue!!! */
    @Override // com.ifriend.common_entities_engine.System
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object onUpdateState(EntitiesState entitiesState, Continuation<? super EntitiesState> continuation) {
        DecodingAudioInitialStateSystem$onUpdateState$1 decodingAudioInitialStateSystem$onUpdateState$1;
        int i;
        ArrayList arrayList;
        DecodingAudioInitialStateSystem decodingAudioInitialStateSystem;
        Ref.BooleanRef booleanRef;
        Iterator it;
        AudioDecodingStatusComponent.DecodingStatus.ReadyToDecode readyToDecode;
        if (continuation instanceof DecodingAudioInitialStateSystem$onUpdateState$1) {
            decodingAudioInitialStateSystem$onUpdateState$1 = (DecodingAudioInitialStateSystem$onUpdateState$1) continuation;
            if ((decodingAudioInitialStateSystem$onUpdateState$1.label & Integer.MIN_VALUE) != 0) {
                decodingAudioInitialStateSystem$onUpdateState$1.label -= Integer.MIN_VALUE;
                Object obj = decodingAudioInitialStateSystem$onUpdateState$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = decodingAudioInitialStateSystem$onUpdateState$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    Ref.BooleanRef booleanRef2 = new Ref.BooleanRef();
                    List<Entity> entities = entitiesState.getEntities();
                    arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(entities, 10));
                    decodingAudioInitialStateSystem = this;
                    booleanRef = booleanRef2;
                    it = entities.iterator();
                    if (!it.hasNext()) {
                    }
                } else if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                } else {
                    Entity entity = (Entity) decodingAudioInitialStateSystem$onUpdateState$1.L$7;
                    MessageContent.Audio audio = (MessageContent.Audio) decodingAudioInitialStateSystem$onUpdateState$1.L$6;
                    arrayList = (Collection) decodingAudioInitialStateSystem$onUpdateState$1.L$5;
                    it = (Iterator) decodingAudioInitialStateSystem$onUpdateState$1.L$4;
                    Collection collection = (Collection) decodingAudioInitialStateSystem$onUpdateState$1.L$3;
                    booleanRef = (Ref.BooleanRef) decodingAudioInitialStateSystem$onUpdateState$1.L$2;
                    EntitiesState entitiesState2 = (EntitiesState) decodingAudioInitialStateSystem$onUpdateState$1.L$1;
                    decodingAudioInitialStateSystem = (DecodingAudioInitialStateSystem) decodingAudioInitialStateSystem$onUpdateState$1.L$0;
                    ResultKt.throwOnFailure(obj);
                    if (!((Boolean) obj).booleanValue()) {
                        readyToDecode = new AudioDecodingStatusComponent.DecodingStatus.Decoded(audio.getText());
                    } else {
                        readyToDecode = AudioDecodingStatusComponent.DecodingStatus.ReadyToDecode.INSTANCE;
                    }
                    Entity entity2 = entity.copy(SetsKt.plus(entity.getComponents(), new AudioDecodingStatusComponent(readyToDecode)));
                    entitiesState = entitiesState2;
                    arrayList.add(entity2);
                    arrayList = collection;
                    if (!it.hasNext()) {
                        entity2 = (Entity) it.next();
                        ChatMessage chatMessage = (ChatMessage) entity2.get(Reflection.getOrCreateKotlinClass(ChatMessage.class));
                        if (chatMessage != null) {
                            MessageContent content = chatMessage.getContent();
                            if (content instanceof MessageContent.Audio) {
                                MessageContent.Audio audio2 = (MessageContent.Audio) content;
                                if (((AudioDecodingStatusComponent) entity2.get(Reflection.getOrCreateKotlinClass(AudioDecodingStatusComponent.class))) == null && ChatMessageKt.isFromBot(chatMessage) && !audio2.isPremium()) {
                                    booleanRef.element = true;
                                    DecodedAudioMessagesRepository decodedAudioMessagesRepository = decodingAudioInitialStateSystem.repository;
                                    String id = ChatMessageKt.getId(chatMessage);
                                    decodingAudioInitialStateSystem$onUpdateState$1.L$0 = decodingAudioInitialStateSystem;
                                    decodingAudioInitialStateSystem$onUpdateState$1.L$1 = entitiesState;
                                    decodingAudioInitialStateSystem$onUpdateState$1.L$2 = booleanRef;
                                    decodingAudioInitialStateSystem$onUpdateState$1.L$3 = arrayList;
                                    decodingAudioInitialStateSystem$onUpdateState$1.L$4 = it;
                                    decodingAudioInitialStateSystem$onUpdateState$1.L$5 = arrayList;
                                    decodingAudioInitialStateSystem$onUpdateState$1.L$6 = audio2;
                                    decodingAudioInitialStateSystem$onUpdateState$1.L$7 = entity2;
                                    decodingAudioInitialStateSystem$onUpdateState$1.label = 1;
                                    Object isAudioMessageTextShowed = decodedAudioMessagesRepository.isAudioMessageTextShowed(id, decodingAudioInitialStateSystem$onUpdateState$1);
                                    if (isAudioMessageTextShowed == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                    entitiesState2 = entitiesState;
                                    entity = entity2;
                                    obj = isAudioMessageTextShowed;
                                    audio = audio2;
                                    collection = arrayList;
                                    if (!((Boolean) obj).booleanValue()) {
                                    }
                                    Entity entity22 = entity.copy(SetsKt.plus(entity.getComponents(), new AudioDecodingStatusComponent(readyToDecode)));
                                    entitiesState = entitiesState2;
                                    arrayList.add(entity22);
                                    arrayList = collection;
                                    if (!it.hasNext()) {
                                        List list = (List) arrayList;
                                        if (booleanRef.element) {
                                            return EntitiesState.copy$default(entitiesState, list, null, 2, null);
                                        }
                                        decodingAudioInitialStateSystem$onUpdateState$1.L$0 = null;
                                        decodingAudioInitialStateSystem$onUpdateState$1.L$1 = null;
                                        decodingAudioInitialStateSystem$onUpdateState$1.L$2 = null;
                                        decodingAudioInitialStateSystem$onUpdateState$1.L$3 = null;
                                        decodingAudioInitialStateSystem$onUpdateState$1.L$4 = null;
                                        decodingAudioInitialStateSystem$onUpdateState$1.L$5 = null;
                                        decodingAudioInitialStateSystem$onUpdateState$1.L$6 = null;
                                        decodingAudioInitialStateSystem$onUpdateState$1.L$7 = null;
                                        decodingAudioInitialStateSystem$onUpdateState$1.label = 2;
                                        obj = super.onUpdateState((DecodingAudioInitialStateSystem) entitiesState, (Continuation<? super DecodingAudioInitialStateSystem>) decodingAudioInitialStateSystem$onUpdateState$1);
                                        return obj == coroutine_suspended ? coroutine_suspended : obj;
                                    }
                                }
                            }
                        }
                        collection = arrayList;
                        arrayList.add(entity22);
                        arrayList = collection;
                        if (!it.hasNext()) {
                        }
                    }
                }
            }
        }
        decodingAudioInitialStateSystem$onUpdateState$1 = new DecodingAudioInitialStateSystem$onUpdateState$1(this, continuation);
        Object obj2 = decodingAudioInitialStateSystem$onUpdateState$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = decodingAudioInitialStateSystem$onUpdateState$1.label;
        if (i != 0) {
        }
    }
}
