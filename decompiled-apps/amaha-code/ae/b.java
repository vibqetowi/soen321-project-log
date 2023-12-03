package ae;

import java.util.Collections;
import java.util.Map;
/* compiled from: FieldDescriptor.java */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final String f527a;

    /* renamed from: b  reason: collision with root package name */
    public final Map<Class<?>, Object> f528b;

    public b(String str, Map<Class<?>, Object> map) {
        this.f527a = str;
        this.f528b = map;
    }

    public static b a(String str) {
        return new b(str, Collections.emptyMap());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (this.f527a.equals(bVar.f527a) && this.f528b.equals(bVar.f528b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f528b.hashCode() + (this.f527a.hashCode() * 31);
    }

    public final String toString() {
        return "FieldDescriptor{name=" + this.f527a + ", properties=" + this.f528b.values() + "}";
    }
}
