package androidx.work;

import androidx.work.d;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import kotlin.Metadata;
/* compiled from: ArrayCreatingInputMerger.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/work/ArrayCreatingInputMerger;", "Landroidx/work/i;", "<init>", "()V", "work-runtime_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes.dex */
public final class ArrayCreatingInputMerger extends i {
    @Override // androidx.work.i
    public final d a(ArrayList arrayList) {
        Class<?> cls;
        Object newArray;
        d.a aVar = new d.a();
        HashMap hashMap = new HashMap();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Map unmodifiableMap = Collections.unmodifiableMap(((d) it.next()).f3236a);
            kotlin.jvm.internal.i.f(unmodifiableMap, "input.keyValueMap");
            for (Map.Entry entry : unmodifiableMap.entrySet()) {
                String key = (String) entry.getKey();
                Object value = entry.getValue();
                if (value != null) {
                    cls = value.getClass();
                } else {
                    cls = String.class;
                }
                Object obj = hashMap.get(key);
                kotlin.jvm.internal.i.f(key, "key");
                if (obj == null) {
                    if (!cls.isArray()) {
                        newArray = Array.newInstance(cls, 1);
                        Array.set(newArray, 0, value);
                        kotlin.jvm.internal.i.f(newArray, "newArray");
                        value = newArray;
                        kotlin.jvm.internal.i.f(value, "if (existingValue == nul…      }\n                }");
                        hashMap.put(key, value);
                    } else {
                        kotlin.jvm.internal.i.f(value, "if (existingValue == nul…      }\n                }");
                        hashMap.put(key, value);
                    }
                } else {
                    Class<?> cls2 = obj.getClass();
                    if (kotlin.jvm.internal.i.b(cls2, cls)) {
                        kotlin.jvm.internal.i.f(value, "value");
                        int length = Array.getLength(obj);
                        int length2 = Array.getLength(value);
                        Class<?> componentType = obj.getClass().getComponentType();
                        kotlin.jvm.internal.i.d(componentType);
                        Object newArray2 = Array.newInstance(componentType, length + length2);
                        System.arraycopy(obj, 0, newArray2, 0, length);
                        System.arraycopy(value, 0, newArray2, length, length2);
                        kotlin.jvm.internal.i.f(newArray2, "newArray");
                        value = newArray2;
                        kotlin.jvm.internal.i.f(value, "if (existingValue == nul…      }\n                }");
                        hashMap.put(key, value);
                    } else if (kotlin.jvm.internal.i.b(cls2.getComponentType(), cls)) {
                        int length3 = Array.getLength(obj);
                        newArray = Array.newInstance(cls, length3 + 1);
                        System.arraycopy(obj, 0, newArray, 0, length3);
                        Array.set(newArray, length3, value);
                        kotlin.jvm.internal.i.f(newArray, "newArray");
                        value = newArray;
                        kotlin.jvm.internal.i.f(value, "if (existingValue == nul…      }\n                }");
                        hashMap.put(key, value);
                    } else {
                        throw new IllegalArgumentException();
                    }
                }
            }
        }
        aVar.a(hashMap);
        d dVar = new d(aVar.f3237a);
        d.b(dVar);
        return dVar;
    }
}
