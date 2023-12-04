package com.ifriend.common_entities_engine;

import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: Entity.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0013\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0005J\u000f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\t\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u001a\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/ifriend/common_entities_engine/Entity;", "Lcom/ifriend/common_entities_engine/ComponentsHolder;", "components", "", "Lcom/ifriend/common_entities_engine/Component;", "(Ljava/util/Set;)V", "getComponents", "()Ljava/util/Set;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "common_entities_engine"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class Entity extends ComponentsHolder {
    private final Set<Component> components;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Entity copy$default(Entity entity, Set set, int i, Object obj) {
        if ((i & 1) != 0) {
            set = entity.components;
        }
        return entity.copy(set);
    }

    public final Set<Component> component1() {
        return this.components;
    }

    public final Entity copy(Set<? extends Component> components) {
        Intrinsics.checkNotNullParameter(components, "components");
        return new Entity(components);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof Entity) && Intrinsics.areEqual(this.components, ((Entity) obj).components);
    }

    public int hashCode() {
        return this.components.hashCode();
    }

    public String toString() {
        Set<Component> set = this.components;
        return "Entity(components=" + set + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Entity(Set<? extends Component> components) {
        Intrinsics.checkNotNullParameter(components, "components");
        this.components = components;
    }

    @Override // com.ifriend.common_entities_engine.ComponentsHolder
    public Set<Component> getComponents() {
        return this.components;
    }
}
