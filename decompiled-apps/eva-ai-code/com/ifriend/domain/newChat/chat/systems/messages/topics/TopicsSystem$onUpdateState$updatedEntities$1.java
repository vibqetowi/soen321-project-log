package com.ifriend.domain.newChat.chat.systems.messages.topics;

import com.ifriend.common_entities_engine.Component;
import com.ifriend.common_entities_engine.Entity;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: TopicsSystem.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "", "Lcom/ifriend/common_entities_engine/Entity;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class TopicsSystem$onUpdateState$updatedEntities$1 extends Lambda implements Function1<List<Entity>, Unit> {
    final /* synthetic */ List<Entity> $topics;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TopicsSystem$onUpdateState$updatedEntities$1(List<Entity> list) {
        super(1);
        this.$topics = list;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(List<Entity> list) {
        invoke2(list);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(List<Entity> update) {
        Intrinsics.checkNotNullParameter(update, "$this$update");
        CollectionsKt.removeAll((List) update, (Function1) AnonymousClass1.INSTANCE);
        update.addAll(this.$topics);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: TopicsSystem.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/ifriend/common_entities_engine/Entity;", "invoke", "(Lcom/ifriend/common_entities_engine/Entity;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.ifriend.domain.newChat.chat.systems.messages.topics.TopicsSystem$onUpdateState$updatedEntities$1$1  reason: invalid class name */
    /* loaded from: classes6.dex */
    public static final class AnonymousClass1 extends Lambda implements Function1<Entity, Boolean> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        AnonymousClass1() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(Entity it) {
            boolean z;
            Intrinsics.checkNotNullParameter(it, "it");
            Set<Component> components = it.getComponents();
            boolean z2 = false;
            if (!(components instanceof Collection) || !components.isEmpty()) {
                Iterator<T> it2 = components.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    Component component = (Component) it2.next();
                    if (it.get(Reflection.getOrCreateKotlinClass(TopicComponent.class)) != null) {
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
            return Boolean.valueOf(z2);
        }
    }
}
