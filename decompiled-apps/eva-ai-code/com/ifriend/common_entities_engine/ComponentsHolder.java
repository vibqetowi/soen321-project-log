package com.ifriend.common_entities_engine;

import androidx.exifinterface.media.ExifInterface;
import java.util.Iterator;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
/* compiled from: ComponentsHolder.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J(\u0010\b\u001a\u0004\u0018\u0001H\t\"\b\b\u0000\u0010\t*\u00020\u00052\f\u0010\n\u001a\b\u0012\u0004\u0012\u0002H\t0\u000bH\u0086\u0002¢\u0006\u0002\u0010\fJ#\u0010\r\u001a\u0002H\t\"\b\b\u0000\u0010\t*\u00020\u00052\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u0002H\t0\u000b¢\u0006\u0002\u0010\fR\u0018\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000f"}, d2 = {"Lcom/ifriend/common_entities_engine/ComponentsHolder;", "", "()V", "components", "", "Lcom/ifriend/common_entities_engine/Component;", "getComponents", "()Ljava/util/Set;", "get", ExifInterface.GPS_DIRECTION_TRUE, "componentClass", "Lkotlin/reflect/KClass;", "(Lkotlin/reflect/KClass;)Lcom/ifriend/common_entities_engine/Component;", "require", "kClass", "common_entities_engine"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public abstract class ComponentsHolder {
    public abstract Set<Component> getComponents();

    public final <T extends Component> T get(KClass<T> componentClass) {
        Object obj;
        Intrinsics.checkNotNullParameter(componentClass, "componentClass");
        Iterator<T> it = getComponents().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (componentClass.isInstance((Component) obj)) {
                break;
            }
        }
        if (obj instanceof Component) {
            return (T) obj;
        }
        return null;
    }

    public final <T extends Component> T require(KClass<T> kClass) {
        Intrinsics.checkNotNullParameter(kClass, "kClass");
        T t = (T) get(kClass);
        if (t != null) {
            return t;
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }
}
