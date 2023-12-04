package com.ifriend.common_entities_engine;

import androidx.exifinterface.media.ExifInterface;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
/* compiled from: ComponentsHolder.kt */
@Metadata(d1 = {"\u0000>\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\u001a\u001e\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0002\u001a\u0010\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u0005*\u00020\u0006\u001a\u0019\u0010\u0007\u001a\u00020\b\"\n\b\u0000\u0010\t\u0018\u0001*\u00020\u0002*\u00020\nH\u0086\b\u001a\u001f\u0010\u000b\u001a\u00020\f\"\n\b\u0000\u0010\t\u0018\u0001*\u00020\u0002*\b\u0012\u0004\u0012\u00020\n0\u0005H\u0086\b\u001a`\u0010\r\u001a\b\u0012\u0004\u0012\u00020\n0\u0005\"\n\b\u0000\u0010\t\u0018\u0001*\u00020\u0002*\b\u0012\u0004\u0012\u00020\n0\u000526\u0010\u000e\u001a2\u0012\u0013\u0012\u00110\n¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0012\u0012\u0013\u0012\u0011H\t¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0003\u0012\u0004\u0012\u00020\n0\u000fH\u0086\bø\u0001\u0000\u001a\u001f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001\"\n\b\u0000\u0010\t\u0018\u0001*\u00020\u0002*\u00020\nH\u0086\b\u001a%\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001\"\n\b\u0000\u0010\t\u0018\u0001*\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00020\u0001H\u0086\b\u001a%\u0010\u0014\u001a\b\u0012\u0004\u0012\u0002H\t0\u0005\"\n\b\u0000\u0010\t\u0018\u0001*\u00020\u0002*\b\u0012\u0004\u0012\u00020\n0\u0005H\u0086\b\u001a,\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001\"\n\b\u0000\u0010\t\u0018\u0001*\u00020\u0002*\u00020\n2\u0006\u0010\u0003\u001a\u0002H\tH\u0086\b¢\u0006\u0002\u0010\u0016\u001a2\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001\"\n\b\u0000\u0010\t\u0018\u0001*\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u0002H\tH\u0086\b¢\u0006\u0002\u0010\u0017\u001a1\u0010\u0018\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u0002H\t0\u00190\u0005\"\n\b\u0000\u0010\t\u0018\u0001*\u00020\u0002*\b\u0012\u0004\u0012\u00020\n0\u0005H\u0086\b\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u001a"}, d2 = {"add", "", "Lcom/ifriend/common_entities_engine/Component;", "component", "consumableComponents", "", "Lcom/ifriend/common_entities_engine/ComponentsHolder;", "contains", "", ExifInterface.GPS_DIRECTION_TRUE, "Lcom/ifriend/common_entities_engine/Entity;", "countWithComponent", "", "mapEntitiesComponent", "mapper", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "entity", "remove", "toComponents", "update", "(Lcom/ifriend/common_entities_engine/Entity;Lcom/ifriend/common_entities_engine/Component;)Ljava/util/Set;", "(Ljava/util/Set;Lcom/ifriend/common_entities_engine/Component;)Ljava/util/Set;", "withComponent", "Lkotlin/Pair;", "common_entities_engine"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ComponentsHolderKt {
    public static final List<Component> consumableComponents(ComponentsHolder componentsHolder) {
        Intrinsics.checkNotNullParameter(componentsHolder, "<this>");
        ArrayList arrayList = new ArrayList();
        for (Object obj : componentsHolder.getComponents()) {
            if (obj instanceof ConsumableComponent) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static final /* synthetic */ <T extends Component> List<Pair<Entity, T>> withComponent(List<Entity> list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        ArrayList arrayList = new ArrayList();
        for (Entity entity : list) {
            Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
            Component component = entity.get(Reflection.getOrCreateKotlinClass(Component.class));
            Pair pair = component == null ? null : TuplesKt.to(entity, component);
            if (pair != null) {
                arrayList.add(pair);
            }
        }
        return arrayList;
    }

    public static final /* synthetic */ <T extends Component> List<Entity> mapEntitiesComponent(List<Entity> list, Function2<? super Entity, ? super T, Entity> mapper) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        List<Entity> list2 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
        for (Entity entity : list2) {
            Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
            Component component = entity.get(Reflection.getOrCreateKotlinClass(Component.class));
            if (component != null) {
                entity = mapper.invoke(entity, component);
            }
            arrayList.add(entity);
        }
        return arrayList;
    }

    public static final /* synthetic */ <T extends Component> List<T> toComponents(List<Entity> list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        ArrayList arrayList = new ArrayList();
        for (Entity entity : list) {
            Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
            Component component = entity.get(Reflection.getOrCreateKotlinClass(Component.class));
            if (component != null) {
                arrayList.add(component);
            }
        }
        return arrayList;
    }

    public static final /* synthetic */ <T extends Component> boolean contains(Entity entity) {
        boolean z;
        Intrinsics.checkNotNullParameter(entity, "<this>");
        Set<Component> components = entity.getComponents();
        if ((components instanceof Collection) && components.isEmpty()) {
            return false;
        }
        for (Component component : components) {
            Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
            if (entity.get(Reflection.getOrCreateKotlinClass(Component.class)) != null) {
                z = true;
                continue;
            } else {
                z = false;
                continue;
            }
            if (z) {
                return true;
            }
        }
        return false;
    }

    public static final /* synthetic */ <T extends Component> Set<Component> remove(Entity entity) {
        Intrinsics.checkNotNullParameter(entity, "<this>");
        ArrayList arrayList = new ArrayList();
        for (Object obj : entity.getComponents()) {
            Intrinsics.reifiedOperationMarker(3, ExifInterface.GPS_DIRECTION_TRUE);
            if (!(((Component) obj) instanceof Component)) {
                arrayList.add(obj);
            }
        }
        return CollectionsKt.toSet(arrayList);
    }

    public static final /* synthetic */ <T extends Component> Set<Component> remove(Set<? extends Component> set) {
        Intrinsics.checkNotNullParameter(set, "<this>");
        ArrayList arrayList = new ArrayList();
        for (Object obj : set) {
            Intrinsics.reifiedOperationMarker(3, ExifInterface.GPS_DIRECTION_TRUE);
            if (!(((Component) obj) instanceof Component)) {
                arrayList.add(obj);
            }
        }
        return CollectionsKt.toSet(arrayList);
    }

    public static final /* synthetic */ <T extends Component> Set<Component> update(Entity entity, T component) {
        Intrinsics.checkNotNullParameter(entity, "<this>");
        Intrinsics.checkNotNullParameter(component, "component");
        ArrayList arrayList = new ArrayList();
        for (Object obj : entity.getComponents()) {
            Intrinsics.reifiedOperationMarker(3, ExifInterface.GPS_DIRECTION_TRUE);
            if (!(((Component) obj) instanceof Component)) {
                arrayList.add(obj);
            }
        }
        return add(CollectionsKt.toSet(arrayList), component);
    }

    public static final Set<Component> add(Set<? extends Component> set, Component component) {
        Intrinsics.checkNotNullParameter(set, "<this>");
        Intrinsics.checkNotNullParameter(component, "component");
        return SetsKt.plus(set, component);
    }

    public static final /* synthetic */ <T extends Component> int countWithComponent(List<Entity> list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        ArrayList arrayList = new ArrayList();
        for (Entity entity : list) {
            Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
            Component component = entity.get(Reflection.getOrCreateKotlinClass(Component.class));
            Pair pair = component == null ? null : TuplesKt.to(entity, component);
            if (pair != null) {
                arrayList.add(pair);
            }
        }
        return arrayList.size();
    }

    public static final /* synthetic */ <T extends Component> Set<Component> update(Set<? extends Component> set, T component) {
        Intrinsics.checkNotNullParameter(set, "<this>");
        Intrinsics.checkNotNullParameter(component, "component");
        ArrayList arrayList = new ArrayList();
        for (Object obj : set) {
            Intrinsics.reifiedOperationMarker(3, ExifInterface.GPS_DIRECTION_TRUE);
            if (!(((Component) obj) instanceof Component)) {
                arrayList.add(obj);
            }
        }
        return add(CollectionsKt.toSet(arrayList), component);
    }
}
