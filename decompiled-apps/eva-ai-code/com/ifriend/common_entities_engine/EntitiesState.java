package com.ifriend.common_entities_engine;

import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: EntitiesState.kt */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0002\u0010\bJ\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003J)\u0010\u000f\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001R\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0018"}, d2 = {"Lcom/ifriend/common_entities_engine/EntitiesState;", "Lcom/ifriend/common_entities_engine/State;", "entities", "", "Lcom/ifriend/common_entities_engine/Entity;", "components", "", "Lcom/ifriend/common_entities_engine/Component;", "(Ljava/util/List;Ljava/util/Set;)V", "getComponents", "()Ljava/util/Set;", "getEntities", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "common_entities_engine"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class EntitiesState extends State {
    private final Set<Component> components;
    private final List<Entity> entities;

    public EntitiesState() {
        this(null, null, 3, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ EntitiesState copy$default(EntitiesState entitiesState, List list, Set set, int i, Object obj) {
        if ((i & 1) != 0) {
            list = entitiesState.entities;
        }
        if ((i & 2) != 0) {
            set = entitiesState.components;
        }
        return entitiesState.copy(list, set);
    }

    public final List<Entity> component1() {
        return this.entities;
    }

    public final Set<Component> component2() {
        return this.components;
    }

    public final EntitiesState copy(List<Entity> entities, Set<? extends Component> components) {
        Intrinsics.checkNotNullParameter(entities, "entities");
        Intrinsics.checkNotNullParameter(components, "components");
        return new EntitiesState(entities, components);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof EntitiesState) {
            EntitiesState entitiesState = (EntitiesState) obj;
            return Intrinsics.areEqual(this.entities, entitiesState.entities) && Intrinsics.areEqual(this.components, entitiesState.components);
        }
        return false;
    }

    public int hashCode() {
        return (this.entities.hashCode() * 31) + this.components.hashCode();
    }

    public String toString() {
        List<Entity> list = this.entities;
        Set<Component> set = this.components;
        return "EntitiesState(entities=" + list + ", components=" + set + ")";
    }

    public /* synthetic */ EntitiesState(List list, Set set, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? CollectionsKt.emptyList() : list, (i & 2) != 0 ? SetsKt.emptySet() : set);
    }

    public final List<Entity> getEntities() {
        return this.entities;
    }

    @Override // com.ifriend.common_entities_engine.ComponentsHolder
    public Set<Component> getComponents() {
        return this.components;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public EntitiesState(List<Entity> entities, Set<? extends Component> components) {
        Intrinsics.checkNotNullParameter(entities, "entities");
        Intrinsics.checkNotNullParameter(components, "components");
        this.entities = entities;
        this.components = components;
    }
}
