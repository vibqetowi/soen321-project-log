package com.ifriend.chat.new_chat.list.presentationSystems.newMessagesAnimation;

import androidx.core.app.NotificationCompat;
import com.ifriend.common_entities_engine.Component;
import com.ifriend.common_entities_engine.ComponentsHolderKt;
import com.ifriend.common_entities_engine.EntitiesState;
import com.ifriend.common_entities_engine.Entity;
import com.ifriend.common_entities_engine.Event;
import com.ifriend.common_entities_engine.System;
import com.ifriend.domain.newChat.chat.systems.OnEntityShown;
import com.ifriend.domain.newChat.chat.systems.distinct.UniqueComponent;
import com.ifriend.domain.newChat.chat.systems.messages.live.LiveMessageComponent;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
/* compiled from: LiveMessagesAnimationSystem.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010#\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0015B\u0007\b\u0007¢\u0006\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u000bJ\u0019\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u0002H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u000eJ\f\u0010\u000f\u001a\u00020\u0010*\u00020\u0010H\u0002J\u0014\u0010\u0011\u001a\u00020\b*\u00020\u00102\u0006\u0010\u0012\u001a\u00020\bH\u0002J\u0014\u0010\u0013\u001a\u00020\b*\u00020\u00102\u0006\u0010\u0012\u001a\u00020\bH\u0002J\f\u0010\u0014\u001a\u00020\u0010*\u00020\u0010H\u0002R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0016"}, d2 = {"Lcom/ifriend/chat/new_chat/list/presentationSystems/newMessagesAnimation/LiveMessagesAnimationSystem;", "Lcom/ifriend/common_entities_engine/System;", "Lcom/ifriend/common_entities_engine/EntitiesState;", "()V", "justShownEntityIds", "", "", "onHandleEvent", "", NotificationCompat.CATEGORY_EVENT, "Lcom/ifriend/common_entities_engine/Event;", "(Lcom/ifriend/common_entities_engine/Event;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onUpdateState", "state", "(Lcom/ifriend/common_entities_engine/EntitiesState;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "addAnimationComponent", "Lcom/ifriend/common_entities_engine/Entity;", "isNeedAnimate", "isInJustShownList", "isNeedToRemoveAnimationComponent", "removeAnimationComponent", "AnimatedComponent", "new_chat_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class LiveMessagesAnimationSystem extends System<EntitiesState> {
    public static final int $stable = 8;
    private final Set<String> justShownEntityIds = new LinkedHashSet();

    @Override // com.ifriend.common_entities_engine.System
    public Object onUpdateState(EntitiesState entitiesState, Continuation<? super EntitiesState> continuation) {
        List<Entity> entities = entitiesState.getEntities();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(entities, 10));
        Iterator<T> it = entities.iterator();
        boolean z = false;
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Entity entity = (Entity) it.next();
            UniqueComponent uniqueComponent = (UniqueComponent) entity.get(Reflection.getOrCreateKotlinClass(UniqueComponent.class));
            boolean contains = CollectionsKt.contains(this.justShownEntityIds, uniqueComponent != null ? uniqueComponent.getId() : null);
            if (isNeedAnimate(entity, contains)) {
                entity = addAnimationComponent(entity);
            } else if (isNeedToRemoveAnimationComponent(entity, contains)) {
                entity = removeAnimationComponent(entity);
            } else {
                arrayList.add(entity);
            }
            z = true;
            arrayList.add(entity);
        }
        ArrayList arrayList2 = arrayList;
        this.justShownEntityIds.clear();
        return z ? EntitiesState.copy$default(entitiesState, arrayList2, null, 2, null) : entitiesState;
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x00af, code lost:
        if (r9 == true) goto L40;
     */
    @Override // com.ifriend.common_entities_engine.System
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object onHandleEvent(Event event, Continuation<? super Boolean> continuation) {
        boolean z;
        List<Entity> entities;
        boolean z2;
        boolean z3;
        if (event instanceof OnEntityShown) {
            EntitiesState currentState = currentState();
            if (currentState != null && (entities = currentState.getEntities()) != null) {
                ArrayList arrayList = new ArrayList();
                Iterator<T> it = entities.iterator();
                while (true) {
                    z = true;
                    if (!it.hasNext()) {
                        break;
                    }
                    Object next = it.next();
                    Entity entity = (Entity) next;
                    Set<Component> components = entity.getComponents();
                    if (!(components instanceof Collection) || !components.isEmpty()) {
                        for (Component component : components) {
                            if (entity.get(Reflection.getOrCreateKotlinClass(NeedToAnimateComponent.class)) != null) {
                                z3 = true;
                                continue;
                            } else {
                                z3 = false;
                                continue;
                            }
                            if (z3) {
                                break;
                            }
                        }
                    }
                    z = false;
                    if (z) {
                        arrayList.add(next);
                    }
                }
                ArrayList<Entity> arrayList2 = arrayList;
                if (!(arrayList2 instanceof Collection) || !arrayList2.isEmpty()) {
                    for (Entity entity2 : arrayList2) {
                        UniqueComponent uniqueComponent = (UniqueComponent) entity2.get(Reflection.getOrCreateKotlinClass(UniqueComponent.class));
                        if (Intrinsics.areEqual(uniqueComponent != null ? uniqueComponent.getId() : null, ((OnEntityShown) event).getId())) {
                            z2 = true;
                            break;
                        }
                    }
                }
                z2 = false;
            }
            z = false;
            if (z && this.justShownEntityIds.contains(((OnEntityShown) event).getId())) {
                reportUpdateState();
            }
            this.justShownEntityIds.add(((OnEntityShown) event).getId());
            return Boxing.boxBoolean(false);
        }
        return super.onHandleEvent(event, continuation);
    }

    private final Entity removeAnimationComponent(Entity entity) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : entity.getComponents()) {
            if (!(((Component) obj) instanceof NeedToAnimateComponent)) {
                arrayList.add(obj);
            }
        }
        return entity.copy(ComponentsHolderKt.add(CollectionsKt.toSet(arrayList), AnimatedComponent.INSTANCE));
    }

    private static final ChatItemAnimation addAnimationComponent$prepareAnimation() {
        return FadeInAnimation.INSTANCE;
    }

    private final Entity addAnimationComponent(Entity entity) {
        return entity.copy(ComponentsHolderKt.add(entity.getComponents(), new NeedToAnimateComponent(addAnimationComponent$prepareAnimation())));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: LiveMessagesAnimationSystem.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÂ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/ifriend/chat/new_chat/list/presentationSystems/newMessagesAnimation/LiveMessagesAnimationSystem$AnimatedComponent;", "Lcom/ifriend/common_entities_engine/Component;", "()V", "new_chat_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class AnimatedComponent implements Component {
        public static final AnimatedComponent INSTANCE = new AnimatedComponent();

        private AnimatedComponent() {
        }
    }

    private final boolean isNeedToRemoveAnimationComponent(Entity entity, boolean z) {
        boolean z2;
        boolean z3;
        if (z) {
            Set<Component> components = entity.getComponents();
            if (!(components instanceof Collection) || !components.isEmpty()) {
                for (Component component : components) {
                    if (entity.get(Reflection.getOrCreateKotlinClass(NeedToAnimateComponent.class)) != null) {
                        z2 = true;
                        continue;
                    } else {
                        z2 = false;
                        continue;
                    }
                    if (z2) {
                        z3 = true;
                        break;
                    }
                }
            }
            z3 = false;
            return z3;
        }
        return false;
    }

    private final boolean isNeedAnimate(Entity entity, boolean z) {
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        if (z) {
            return false;
        }
        Set<Component> components = entity.getComponents();
        if (!(components instanceof Collection) || !components.isEmpty()) {
            for (Component component : components) {
                if (entity.get(Reflection.getOrCreateKotlinClass(LiveMessageComponent.class)) != null) {
                    z2 = true;
                    continue;
                } else {
                    z2 = false;
                    continue;
                }
                if (z2) {
                    z3 = true;
                    break;
                }
            }
        }
        z3 = false;
        if (z3) {
            Set<Component> components2 = entity.getComponents();
            if (!(components2 instanceof Collection) || !components2.isEmpty()) {
                for (Component component2 : components2) {
                    if (entity.get(Reflection.getOrCreateKotlinClass(NeedToAnimateComponent.class)) != null) {
                        z4 = true;
                        continue;
                    } else {
                        z4 = false;
                        continue;
                    }
                    if (z4) {
                        z5 = true;
                        break;
                    }
                }
            }
            z5 = false;
            if (z5) {
                return false;
            }
            Set<Component> components3 = entity.getComponents();
            if (!(components3 instanceof Collection) || !components3.isEmpty()) {
                for (Component component3 : components3) {
                    if (entity.get(Reflection.getOrCreateKotlinClass(AnimatedComponent.class)) != null) {
                        z6 = true;
                        continue;
                    } else {
                        z6 = false;
                        continue;
                    }
                    if (z6) {
                        z7 = true;
                        break;
                    }
                }
            }
            z7 = false;
            return !z7;
        }
        return false;
    }
}
