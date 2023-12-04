package com.ifriend.chat.new_chat.list.presentationSystems.audio.decode;

import android.util.Log;
import androidx.core.app.NotificationCompat;
import com.facebook.share.internal.ShareConstants;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.ifriend.chat.new_chat.ChatCoroutineScopeQualifier;
import com.ifriend.chat.new_chat.list.presentationSystems.audio.decode.AudioDecodingStatusComponent;
import com.ifriend.common_entities_engine.Component;
import com.ifriend.common_entities_engine.ComponentsHolderKt;
import com.ifriend.common_entities_engine.CoroutineScopeSystem;
import com.ifriend.common_entities_engine.EntitiesState;
import com.ifriend.common_entities_engine.Entity;
import com.ifriend.common_entities_engine.Event;
import com.ifriend.common_entities_engine.State;
import com.ifriend.domain.data.DecodedAudioMessagesRepository;
import com.ifriend.domain.newChat.chat.models.ChatMessage;
import com.ifriend.domain.newChat.chat.models.ChatMessageKt;
import com.ifriend.domain.newChat.chat.models.MessageContent;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
/* compiled from: DecodingAudioEventsHandlingSystem.kt */
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010#\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\"\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0019\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u0014J\u0019\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u0002H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u0017J!\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001dH\u0082@ø\u0001\u0000¢\u0006\u0002\u0010\u001eJ\u001f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020!0 2\u0006\u0010\u0016\u001a\u00020\u0002H\u0082@ø\u0001\u0000¢\u0006\u0002\u0010\u0017J\u001c\u0010\"\u001a\u00020!*\u00020!2\u0006\u0010#\u001a\u00020\n2\u0006\u0010\u001a\u001a\u00020\u001bH\u0002J%\u0010$\u001a\u00020!*\u00020!2\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001dH\u0082@ø\u0001\u0000¢\u0006\u0002\u0010%R2\u0010\b\u001a&\u0012\f\u0012\n \u000b*\u0004\u0018\u00010\n0\n \u000b*\u0012\u0012\f\u0012\n \u000b*\u0004\u0018\u00010\n0\n\u0018\u00010\f0\tX\u0082\u000e¢\u0006\u0002\n\u0000R2\u0010\r\u001a&\u0012\f\u0012\n \u000b*\u0004\u0018\u00010\n0\n \u000b*\u0012\u0012\f\u0012\n \u000b*\u0004\u0018\u00010\n0\n\u0018\u00010\f0\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006&"}, d2 = {"Lcom/ifriend/chat/new_chat/list/presentationSystems/audio/decode/DecodingAudioEventsHandlingSystem;", "Lcom/ifriend/common_entities_engine/CoroutineScopeSystem;", "Lcom/ifriend/common_entities_engine/EntitiesState;", "repository", "Lcom/ifriend/domain/data/DecodedAudioMessagesRepository;", "coroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "(Lcom/ifriend/domain/data/DecodedAudioMessagesRepository;Lkotlinx/coroutines/CoroutineScope;)V", "audioIdsToFinishDecoding", "", "", "kotlin.jvm.PlatformType", "", "audioIdsToStartDecoding", "durationCalculator", "Lcom/ifriend/chat/new_chat/list/presentationSystems/audio/decode/DecodingAudioDurationCalculator;", "onHandleEvent", "", NotificationCompat.CATEGORY_EVENT, "Lcom/ifriend/common_entities_engine/Event;", "(Lcom/ifriend/common_entities_engine/Event;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onUpdateState", "state", "(Lcom/ifriend/common_entities_engine/EntitiesState;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "scheduleDecodingFinish", "", FirebaseAnalytics.Param.CONTENT, "Lcom/ifriend/domain/newChat/chat/models/MessageContent$Audio;", ShareConstants.WEB_DIALOG_PARAM_MESSAGE, "Lcom/ifriend/domain/newChat/chat/models/ChatMessage;", "(Lcom/ifriend/domain/newChat/chat/models/MessageContent$Audio;Lcom/ifriend/domain/newChat/chat/models/ChatMessage;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateEntities", "", "Lcom/ifriend/common_entities_engine/Entity;", "finishDecoding", "id", "startDecoding", "(Lcom/ifriend/common_entities_engine/Entity;Lcom/ifriend/domain/newChat/chat/models/MessageContent$Audio;Lcom/ifriend/domain/newChat/chat/models/ChatMessage;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "new_chat_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class DecodingAudioEventsHandlingSystem extends CoroutineScopeSystem<EntitiesState> {
    public static final int $stable = 8;
    private Set<String> audioIdsToFinishDecoding;
    private Set<String> audioIdsToStartDecoding;
    private final DecodingAudioDurationCalculator durationCalculator;
    private final DecodedAudioMessagesRepository repository;

    @Override // com.ifriend.common_entities_engine.System
    public /* bridge */ /* synthetic */ Object onUpdateState(State state, Continuation continuation) {
        return onUpdateState((EntitiesState) state, (Continuation<? super EntitiesState>) continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @Inject
    public DecodingAudioEventsHandlingSystem(DecodedAudioMessagesRepository repository, @ChatCoroutineScopeQualifier CoroutineScope coroutineScope) {
        super(coroutineScope);
        Intrinsics.checkNotNullParameter(repository, "repository");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        this.repository = repository;
        this.durationCalculator = new DecodingAudioDurationCalculator();
        this.audioIdsToStartDecoding = Collections.synchronizedSet(new LinkedHashSet());
        this.audioIdsToFinishDecoding = Collections.synchronizedSet(new LinkedHashSet());
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object onUpdateState(EntitiesState entitiesState, Continuation<? super EntitiesState> continuation) {
        DecodingAudioEventsHandlingSystem$onUpdateState$1 decodingAudioEventsHandlingSystem$onUpdateState$1;
        int i;
        DecodingAudioEventsHandlingSystem decodingAudioEventsHandlingSystem;
        if (continuation instanceof DecodingAudioEventsHandlingSystem$onUpdateState$1) {
            decodingAudioEventsHandlingSystem$onUpdateState$1 = (DecodingAudioEventsHandlingSystem$onUpdateState$1) continuation;
            if ((decodingAudioEventsHandlingSystem$onUpdateState$1.label & Integer.MIN_VALUE) != 0) {
                decodingAudioEventsHandlingSystem$onUpdateState$1.label -= Integer.MIN_VALUE;
                Object obj = decodingAudioEventsHandlingSystem$onUpdateState$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = decodingAudioEventsHandlingSystem$onUpdateState$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    if (this.audioIdsToStartDecoding.isEmpty() && this.audioIdsToFinishDecoding.isEmpty()) {
                        return entitiesState;
                    }
                    Log.i("Decoding", "Update");
                    decodingAudioEventsHandlingSystem$onUpdateState$1.L$0 = this;
                    decodingAudioEventsHandlingSystem$onUpdateState$1.L$1 = entitiesState;
                    decodingAudioEventsHandlingSystem$onUpdateState$1.label = 1;
                    obj = updateEntities(entitiesState, decodingAudioEventsHandlingSystem$onUpdateState$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    decodingAudioEventsHandlingSystem = this;
                } else if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    entitiesState = (EntitiesState) decodingAudioEventsHandlingSystem$onUpdateState$1.L$1;
                    decodingAudioEventsHandlingSystem = (DecodingAudioEventsHandlingSystem) decodingAudioEventsHandlingSystem$onUpdateState$1.L$0;
                    ResultKt.throwOnFailure(obj);
                }
                decodingAudioEventsHandlingSystem.audioIdsToStartDecoding.clear();
                return EntitiesState.copy$default(entitiesState, (List) obj, null, 2, null);
            }
        }
        decodingAudioEventsHandlingSystem$onUpdateState$1 = new DecodingAudioEventsHandlingSystem$onUpdateState$1(this, continuation);
        Object obj2 = decodingAudioEventsHandlingSystem$onUpdateState$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = decodingAudioEventsHandlingSystem$onUpdateState$1.label;
        if (i != 0) {
        }
        decodingAudioEventsHandlingSystem.audioIdsToStartDecoding.clear();
        return EntitiesState.copy$default(entitiesState, (List) obj2, null, 2, null);
    }

    @Override // com.ifriend.common_entities_engine.System
    public Object onHandleEvent(Event event, Continuation<? super Boolean> continuation) {
        if (event instanceof DecodeAudioClickEvent) {
            this.audioIdsToStartDecoding.add(((DecodeAudioClickEvent) event).getMessageId());
            reportUpdateState();
            return Boxing.boxBoolean(true);
        }
        return super.onHandleEvent(event, continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0108  */
    /* JADX WARN: Type inference failed for: r12v12, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v13, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0083 -> B:34:0x0102). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x00e7 -> B:32:0x00e8). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object updateEntities(EntitiesState entitiesState, Continuation<? super List<Entity>> continuation) {
        DecodingAudioEventsHandlingSystem$updateEntities$1 decodingAudioEventsHandlingSystem$updateEntities$1;
        int i;
        DecodingAudioEventsHandlingSystem decodingAudioEventsHandlingSystem;
        Iterator it;
        ArrayList arrayList;
        if (continuation instanceof DecodingAudioEventsHandlingSystem$updateEntities$1) {
            decodingAudioEventsHandlingSystem$updateEntities$1 = (DecodingAudioEventsHandlingSystem$updateEntities$1) continuation;
            if ((decodingAudioEventsHandlingSystem$updateEntities$1.label & Integer.MIN_VALUE) != 0) {
                decodingAudioEventsHandlingSystem$updateEntities$1.label -= Integer.MIN_VALUE;
                Object obj = decodingAudioEventsHandlingSystem$updateEntities$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = decodingAudioEventsHandlingSystem$updateEntities$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    List<Entity> entities = entitiesState.getEntities();
                    decodingAudioEventsHandlingSystem = this;
                    it = entities.iterator();
                    arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(entities, 10));
                    if (!it.hasNext()) {
                    }
                } else if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    it = (Iterator) decodingAudioEventsHandlingSystem$updateEntities$1.L$2;
                    ArrayList arrayList2 = (Collection) decodingAudioEventsHandlingSystem$updateEntities$1.L$1;
                    decodingAudioEventsHandlingSystem = (DecodingAudioEventsHandlingSystem) decodingAudioEventsHandlingSystem$updateEntities$1.L$0;
                    ResultKt.throwOnFailure(obj);
                    ArrayList arrayList3 = (Collection) decodingAudioEventsHandlingSystem$updateEntities$1.L$3;
                    Entity entity = (Entity) obj;
                    ArrayList arrayList4 = arrayList3;
                    arrayList4.add(entity);
                    arrayList = arrayList2;
                    if (!it.hasNext()) {
                        entity = (Entity) it.next();
                        ChatMessage chatMessage = (ChatMessage) entity.get(Reflection.getOrCreateKotlinClass(ChatMessage.class));
                        if (chatMessage != null) {
                            MessageContent content = chatMessage.getContent();
                            if (content instanceof MessageContent.Audio) {
                                MessageContent.Audio audio = (MessageContent.Audio) content;
                                String id = ChatMessageKt.getId(chatMessage);
                                Log.i("Decoding", "Looking for: " + id);
                                if (decodingAudioEventsHandlingSystem.audioIdsToFinishDecoding.contains(id)) {
                                    Log.i("Decoding", "Finish " + id);
                                    entity = decodingAudioEventsHandlingSystem.finishDecoding(entity, id, audio);
                                } else if (decodingAudioEventsHandlingSystem.audioIdsToStartDecoding.contains(id)) {
                                    Log.i("Decoding", "Start " + id);
                                    decodingAudioEventsHandlingSystem$updateEntities$1.L$0 = decodingAudioEventsHandlingSystem;
                                    decodingAudioEventsHandlingSystem$updateEntities$1.L$1 = arrayList;
                                    decodingAudioEventsHandlingSystem$updateEntities$1.L$2 = it;
                                    decodingAudioEventsHandlingSystem$updateEntities$1.L$3 = arrayList;
                                    decodingAudioEventsHandlingSystem$updateEntities$1.label = 1;
                                    obj = decodingAudioEventsHandlingSystem.startDecoding(entity, audio, chatMessage, decodingAudioEventsHandlingSystem$updateEntities$1);
                                    if (obj == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                    arrayList2 = arrayList;
                                    arrayList3 = arrayList;
                                    Entity entity2 = (Entity) obj;
                                    ArrayList arrayList42 = arrayList3;
                                    arrayList42.add(entity2);
                                    arrayList = arrayList2;
                                    if (!it.hasNext()) {
                                        return arrayList;
                                    }
                                } else {
                                    Log.i("Decoding", "None " + id + " ");
                                }
                            }
                        }
                        arrayList2 = arrayList;
                        arrayList42 = arrayList;
                        arrayList42.add(entity2);
                        arrayList = arrayList2;
                        if (!it.hasNext()) {
                        }
                    }
                }
            }
        }
        decodingAudioEventsHandlingSystem$updateEntities$1 = new DecodingAudioEventsHandlingSystem$updateEntities$1(this, continuation);
        Object obj2 = decodingAudioEventsHandlingSystem$updateEntities$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = decodingAudioEventsHandlingSystem$updateEntities$1.label;
        if (i != 0) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x006b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object startDecoding(Entity entity, MessageContent.Audio audio, ChatMessage chatMessage, Continuation<? super Entity> continuation) {
        DecodingAudioEventsHandlingSystem$startDecoding$1 decodingAudioEventsHandlingSystem$startDecoding$1;
        int i;
        AudioDecodingStatusComponent component;
        if (continuation instanceof DecodingAudioEventsHandlingSystem$startDecoding$1) {
            decodingAudioEventsHandlingSystem$startDecoding$1 = (DecodingAudioEventsHandlingSystem$startDecoding$1) continuation;
            if ((decodingAudioEventsHandlingSystem$startDecoding$1.label & Integer.MIN_VALUE) != 0) {
                decodingAudioEventsHandlingSystem$startDecoding$1.label -= Integer.MIN_VALUE;
                Object obj = decodingAudioEventsHandlingSystem$startDecoding$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = decodingAudioEventsHandlingSystem$startDecoding$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    component = AudioDecodingStatusComponentKt.toComponent(AudioDecodingStatusComponent.DecodingStatus.DecodingInProgress.INSTANCE);
                    decodingAudioEventsHandlingSystem$startDecoding$1.L$0 = entity;
                    decodingAudioEventsHandlingSystem$startDecoding$1.L$1 = component;
                    decodingAudioEventsHandlingSystem$startDecoding$1.label = 1;
                    if (scheduleDecodingFinish(audio, chatMessage, decodingAudioEventsHandlingSystem$startDecoding$1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    ResultKt.throwOnFailure(obj);
                    component = (AudioDecodingStatusComponent) decodingAudioEventsHandlingSystem$startDecoding$1.L$1;
                    entity = (Entity) decodingAudioEventsHandlingSystem$startDecoding$1.L$0;
                }
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : entity.getComponents()) {
                    if (!(((Component) obj2) instanceof AudioDecodingStatusComponent)) {
                        arrayList.add(obj2);
                    }
                }
                return entity.copy(ComponentsHolderKt.add(CollectionsKt.toSet(arrayList), component));
            }
        }
        decodingAudioEventsHandlingSystem$startDecoding$1 = new DecodingAudioEventsHandlingSystem$startDecoding$1(this, continuation);
        Object obj3 = decodingAudioEventsHandlingSystem$startDecoding$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = decodingAudioEventsHandlingSystem$startDecoding$1.label;
        if (i != 0) {
        }
        ArrayList arrayList2 = new ArrayList();
        while (r6.hasNext()) {
        }
        return entity.copy(ComponentsHolderKt.add(CollectionsKt.toSet(arrayList2), component));
    }

    private final Entity finishDecoding(Entity entity, String str, MessageContent.Audio audio) {
        this.audioIdsToFinishDecoding.remove(str);
        AudioDecodingStatusComponent component = AudioDecodingStatusComponentKt.toComponent(new AudioDecodingStatusComponent.DecodingStatus.Decoded(audio.getText()));
        ArrayList arrayList = new ArrayList();
        for (Object obj : entity.getComponents()) {
            if (!(((Component) obj) instanceof AudioDecodingStatusComponent)) {
                arrayList.add(obj);
            }
        }
        return entity.copy(ComponentsHolderKt.add(CollectionsKt.toSet(arrayList), component));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object scheduleDecodingFinish(MessageContent.Audio audio, ChatMessage chatMessage, Continuation<? super Unit> continuation) {
        BuildersKt__Builders_commonKt.launch$default(this, null, null, new DecodingAudioEventsHandlingSystem$scheduleDecodingFinish$2(this, audio, chatMessage, null), 3, null);
        return Unit.INSTANCE;
    }
}
