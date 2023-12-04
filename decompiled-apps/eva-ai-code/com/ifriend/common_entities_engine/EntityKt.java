package com.ifriend.common_entities_engine;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: Entity.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003¨\u0006\u0004"}, d2 = {"newWithComponent", "Lcom/ifriend/common_entities_engine/Entity;", "component", "Lcom/ifriend/common_entities_engine/Component;", "common_entities_engine"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class EntityKt {
    public static final Entity newWithComponent(Entity entity, Component component) {
        Intrinsics.checkNotNullParameter(entity, "<this>");
        Intrinsics.checkNotNullParameter(component, "component");
        return entity.copy(ComponentsHolderKt.add(entity.getComponents(), component));
    }
}
