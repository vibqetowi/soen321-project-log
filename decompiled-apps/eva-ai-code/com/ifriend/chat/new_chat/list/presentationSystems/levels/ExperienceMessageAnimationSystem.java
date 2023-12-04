package com.ifriend.chat.new_chat.list.presentationSystems.levels;

import com.facebook.AuthenticationTokenClaims;
import com.ifriend.common_entities_engine.ComponentsHolderKt;
import com.ifriend.common_entities_engine.CoroutineScopeSystem;
import com.ifriend.common_entities_engine.EntitiesState;
import com.ifriend.common_entities_engine.Entity;
import com.ifriend.common_entities_engine.State;
import com.ifriend.domain.newChat.chat.systems.distinct.UniqueComponent;
import com.ifriend.domain.socket.MessagesSource;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
/* compiled from: ExperienceMessageAnimationSystem.kt */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0014B\u0017\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\b\u0010\u000b\u001a\u00020\fH\u0016J\u0019\u0010\r\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u0002H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u000fJ\u0014\u0010\u0010\u001a\u00020\u0011*\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0015"}, d2 = {"Lcom/ifriend/chat/new_chat/list/presentationSystems/levels/ExperienceMessageAnimationSystem;", "Lcom/ifriend/common_entities_engine/CoroutineScopeSystem;", "Lcom/ifriend/common_entities_engine/EntitiesState;", "messagesSource", "Lcom/ifriend/domain/socket/MessagesSource;", "coroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "(Lcom/ifriend/domain/socket/MessagesSource;Lkotlinx/coroutines/CoroutineScope;)V", "messagesToAnimate", "", "Lcom/ifriend/chat/new_chat/list/presentationSystems/levels/ExperienceMessageAnimationSystem$MessageToAnimate;", "onStart", "", "onUpdateState", "state", "(Lcom/ifriend/common_entities_engine/EntitiesState;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "addAnimationComponent", "Lcom/ifriend/common_entities_engine/Entity;", "experienceChange", "", "MessageToAnimate", "new_chat_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ExperienceMessageAnimationSystem extends CoroutineScopeSystem<EntitiesState> {
    public static final int $stable = 8;
    private final MessagesSource messagesSource;
    private final Set<MessageToAnimate> messagesToAnimate;

    @Override // com.ifriend.common_entities_engine.System
    public /* bridge */ /* synthetic */ Object onUpdateState(State state, Continuation continuation) {
        return onUpdateState((EntitiesState) state, (Continuation<? super EntitiesState>) continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @Inject
    public ExperienceMessageAnimationSystem(MessagesSource messagesSource, CoroutineScope coroutineScope) {
        super(coroutineScope);
        Intrinsics.checkNotNullParameter(messagesSource, "messagesSource");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        this.messagesSource = messagesSource;
        this.messagesToAnimate = new LinkedHashSet();
    }

    @Override // com.ifriend.common_entities_engine.System
    public void onStart() {
        super.onStart();
        BuildersKt__Builders_commonKt.launch$default(this, null, null, new ExperienceMessageAnimationSystem$onStart$1(this, null), 3, null);
    }

    public Object onUpdateState(EntitiesState entitiesState, Continuation<? super EntitiesState> continuation) {
        if (this.messagesToAnimate.isEmpty()) {
            return entitiesState;
        }
        List<Entity> entities = entitiesState.getEntities();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(entities, 10));
        Iterator<T> it = entities.iterator();
        boolean z = false;
        while (true) {
            Object obj = null;
            if (!it.hasNext()) {
                break;
            }
            Entity entity = (Entity) it.next();
            UniqueComponent uniqueComponent = (UniqueComponent) entity.get(Reflection.getOrCreateKotlinClass(UniqueComponent.class));
            String id = uniqueComponent != null ? uniqueComponent.getId() : null;
            Iterator<T> it2 = this.messagesToAnimate.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Object next = it2.next();
                if (Intrinsics.areEqual(((MessageToAnimate) next).getMessageTag(), id)) {
                    obj = next;
                    break;
                }
            }
            MessageToAnimate messageToAnimate = (MessageToAnimate) obj;
            if (messageToAnimate != null) {
                entity = addAnimationComponent(entity, messageToAnimate.getExp());
                z = true;
            }
            arrayList.add(entity);
        }
        ArrayList arrayList2 = arrayList;
        this.messagesToAnimate.clear();
        return z ? EntitiesState.copy$default(entitiesState, arrayList2, null, 2, null) : entitiesState;
    }

    private final Entity addAnimationComponent(Entity entity, int i) {
        return entity.copy(ComponentsHolderKt.add(entity.getComponents(), new ExperienceMessageAnimationComponent(i)));
    }

    /* compiled from: ExperienceMessageAnimationSystem.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, d2 = {"Lcom/ifriend/chat/new_chat/list/presentationSystems/levels/ExperienceMessageAnimationSystem$MessageToAnimate;", "", "messageTag", "", AuthenticationTokenClaims.JSON_KEY_EXP, "", "(Ljava/lang/String;I)V", "getExp", "()I", "getMessageTag", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "new_chat_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class MessageToAnimate {
        public static final int $stable = 0;
        private final int exp;
        private final String messageTag;

        public static /* synthetic */ MessageToAnimate copy$default(MessageToAnimate messageToAnimate, String str, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                str = messageToAnimate.messageTag;
            }
            if ((i2 & 2) != 0) {
                i = messageToAnimate.exp;
            }
            return messageToAnimate.copy(str, i);
        }

        public final String component1() {
            return this.messageTag;
        }

        public final int component2() {
            return this.exp;
        }

        public final MessageToAnimate copy(String messageTag, int i) {
            Intrinsics.checkNotNullParameter(messageTag, "messageTag");
            return new MessageToAnimate(messageTag, i);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof MessageToAnimate) {
                MessageToAnimate messageToAnimate = (MessageToAnimate) obj;
                return Intrinsics.areEqual(this.messageTag, messageToAnimate.messageTag) && this.exp == messageToAnimate.exp;
            }
            return false;
        }

        public int hashCode() {
            return (this.messageTag.hashCode() * 31) + this.exp;
        }

        public String toString() {
            String str = this.messageTag;
            int i = this.exp;
            return "MessageToAnimate(messageTag=" + str + ", exp=" + i + ")";
        }

        public MessageToAnimate(String messageTag, int i) {
            Intrinsics.checkNotNullParameter(messageTag, "messageTag");
            this.messageTag = messageTag;
            this.exp = i;
        }

        public final String getMessageTag() {
            return this.messageTag;
        }

        public final int getExp() {
            return this.exp;
        }
    }
}
