package com.ifriend.domain.newChat.chat.systems.events.processing;

import com.ifriend.common_entities_engine.Component;
import com.ifriend.common_entities_engine.CoroutineScopeSystem;
import com.ifriend.common_entities_engine.EntitiesState;
import com.ifriend.common_entities_engine.Entity;
import com.ifriend.common_entities_engine.State;
import com.ifriend.domain.newChat.chat.models.MessageTag;
import com.ifriend.domain.newChat.chat.models.MessageToSend;
import com.ifriend.domain.newChat.chat.systems.messages.sending.send.result.GlobalSendingMessageResultPublisher;
import com.ifriend.domain.newChat.chat.systems.messages.sending.send.result.SendingMessageResultObserver;
import com.ifriend.domain.newChat.chat.systems.sorting.SortComponent;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import org.apache.http.cookie.ClientCookie;
/* compiled from: BotProcessingSystem.kt */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u001f2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001\u001fB\u001d\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\b\u0010\u0012\u001a\u00020\u0013H\u0016J\b\u0010\u0014\u001a\u00020\u0013H\u0016J\u0010\u0010\u0015\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0017H\u0016J\u0019\u0010\u0018\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u0002H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u001aJ\b\u0010\u001b\u001a\u00020\u0013H\u0002J\u0012\u0010\u001c\u001a\u00020\u0013*\b\u0012\u0004\u0012\u00020\u001e0\u001dH\u0002R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006 "}, d2 = {"Lcom/ifriend/domain/newChat/chat/systems/events/processing/BotProcessingSystem;", "Lcom/ifriend/common_entities_engine/CoroutineScopeSystem;", "Lcom/ifriend/common_entities_engine/EntitiesState;", "Lcom/ifriend/domain/newChat/chat/systems/messages/sending/send/result/SendingMessageResultObserver;", "scope", "Lkotlinx/coroutines/CoroutineScope;", "publisher", "Lcom/ifriend/domain/newChat/chat/systems/messages/sending/send/result/GlobalSendingMessageResultPublisher;", "chatId", "", "(Lkotlinx/coroutines/CoroutineScope;Lcom/ifriend/domain/newChat/chat/systems/messages/sending/send/result/GlobalSendingMessageResultPublisher;Ljava/lang/String;)V", "isNeedToAddProcessing", "Ljava/util/concurrent/atomic/AtomicBoolean;", "lastScheduledJob", "Lkotlinx/coroutines/Job;", "lastSentUserMessageTag", "Ljava/util/concurrent/atomic/AtomicReference;", "Lcom/ifriend/domain/newChat/chat/models/MessageTag;", "onStart", "", "onStop", "onSuccess", "result", "Lcom/ifriend/domain/newChat/chat/models/MessageToSend$SendingResult$Success;", "onUpdateState", "state", "(Lcom/ifriend/common_entities_engine/EntitiesState;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "scheduleAddingProcessing", "addProcessingItem", "", "Lcom/ifriend/common_entities_engine/Entity;", "Companion", ClientCookie.DOMAIN_ATTR}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class BotProcessingSystem extends CoroutineScopeSystem<EntitiesState> implements SendingMessageResultObserver {
    private static final Companion Companion = new Companion(null);
    @Deprecated
    public static final long TIME_AFTER_NEED_SHOW_PROCESSING = 5000;
    private final String chatId;
    private AtomicBoolean isNeedToAddProcessing;
    private Job lastScheduledJob;
    private AtomicReference<MessageTag> lastSentUserMessageTag;
    private final GlobalSendingMessageResultPublisher publisher;

    public static final /* synthetic */ EntitiesState access$currentState(BotProcessingSystem botProcessingSystem) {
        return (EntitiesState) botProcessingSystem.currentState();
    }

    @Override // com.ifriend.domain.newChat.chat.systems.messages.sending.send.result.SendingMessageResultObserver
    public void onError(MessageToSend.SendingResult.Error error) {
        SendingMessageResultObserver.DefaultImpls.onError(this, error);
    }

    @Override // com.ifriend.common_entities_engine.System
    public /* bridge */ /* synthetic */ Object onUpdateState(State state, Continuation continuation) {
        return onUpdateState((EntitiesState) state, (Continuation<? super EntitiesState>) continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BotProcessingSystem(CoroutineScope scope, GlobalSendingMessageResultPublisher publisher, String chatId) {
        super(scope);
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(publisher, "publisher");
        Intrinsics.checkNotNullParameter(chatId, "chatId");
        this.publisher = publisher;
        this.chatId = chatId;
        this.lastSentUserMessageTag = new AtomicReference<>(null);
        this.isNeedToAddProcessing = new AtomicBoolean(false);
    }

    /* compiled from: BotProcessingSystem.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ifriend/domain/newChat/chat/systems/events/processing/BotProcessingSystem$Companion;", "", "()V", "TIME_AFTER_NEED_SHOW_PROCESSING", "", ClientCookie.DOMAIN_ATTR}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    @Override // com.ifriend.common_entities_engine.System
    public void onStart() {
        super.onStart();
        this.publisher.addObserver(this);
    }

    @Override // com.ifriend.common_entities_engine.CoroutineScopeSystem, com.ifriend.common_entities_engine.System
    public void onStop() {
        super.onStop();
        this.publisher.removeObserver(this);
    }

    @Override // com.ifriend.domain.newChat.chat.systems.messages.sending.send.result.SendingMessageResultObserver
    public void onSuccess(MessageToSend.SendingResult.Success result) {
        Intrinsics.checkNotNullParameter(result, "result");
        SendingMessageResultObserver.DefaultImpls.onSuccess(this, result);
        if (Intrinsics.areEqual(result.getChatId(), this.chatId)) {
            this.lastSentUserMessageTag.set(result.getTag());
            scheduleAddingProcessing();
        }
    }

    public Object onUpdateState(EntitiesState entitiesState, Continuation<? super EntitiesState> continuation) {
        boolean z;
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = entitiesState.getEntities().iterator();
        while (true) {
            boolean z2 = false;
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            Entity entity = (Entity) next;
            Set<Component> components = entity.getComponents();
            if (!(components instanceof Collection) || !components.isEmpty()) {
                Iterator<T> it2 = components.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    Component component = (Component) it2.next();
                    if (entity.get(Reflection.getOrCreateKotlinClass(ProcessingComponent.class)) != null) {
                        z = true;
                        continue;
                    } else {
                        z = false;
                        continue;
                    }
                    if (z) {
                        z2 = true;
                        break;
                    }
                }
            }
            if (!z2) {
                arrayList.add(next);
            }
        }
        List<Entity> mutableList = CollectionsKt.toMutableList((Collection) arrayList);
        if (this.isNeedToAddProcessing.get()) {
            addProcessingItem(mutableList);
            this.isNeedToAddProcessing.set(false);
        }
        return EntitiesState.copy$default(entitiesState, mutableList, null, 2, null);
    }

    private final void scheduleAddingProcessing() {
        Job launch$default;
        Job job = this.lastScheduledJob;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        launch$default = BuildersKt__Builders_commonKt.launch$default(this, null, null, new BotProcessingSystem$scheduleAddingProcessing$1(this, null), 3, null);
        this.lastScheduledJob = launch$default;
    }

    private final void addProcessingItem(List<Entity> list) {
        Entity createProcessingEntity;
        createProcessingEntity = BotProcessingSystemKt.createProcessingEntity(SortComponent.ProcessingOrTyping.INSTANCE);
        list.add(createProcessingEntity);
    }
}
