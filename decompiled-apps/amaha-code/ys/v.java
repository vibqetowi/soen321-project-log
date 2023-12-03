package ys;

import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.Arrays;
/* compiled from: TypesJVM.kt */
/* loaded from: classes2.dex */
public final class v implements WildcardType, Type {

    /* renamed from: w  reason: collision with root package name */
    public static final v f38990w = new v(null, null);

    /* renamed from: u  reason: collision with root package name */
    public final Type f38991u;

    /* renamed from: v  reason: collision with root package name */
    public final Type f38992v;

    public v(Type type, Type type2) {
        this.f38991u = type;
        this.f38992v = type2;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof WildcardType) {
            WildcardType wildcardType = (WildcardType) obj;
            if (Arrays.equals(getUpperBounds(), wildcardType.getUpperBounds()) && Arrays.equals(getLowerBounds(), wildcardType.getLowerBounds())) {
                return true;
            }
        }
        return false;
    }

    @Override // java.lang.reflect.WildcardType
    public final Type[] getLowerBounds() {
        Type type = this.f38992v;
        return type == null ? new Type[0] : new Type[]{type};
    }

    @Override // java.lang.reflect.Type
    public final String getTypeName() {
        Type type = this.f38992v;
        if (type != null) {
            return "? super " + t.a(type);
        }
        Type type2 = this.f38991u;
        if (type2 != null && !kotlin.jvm.internal.i.b(type2, Object.class)) {
            return "? extends " + t.a(type2);
        }
        return "?";
    }

    @Override // java.lang.reflect.WildcardType
    public final Type[] getUpperBounds() {
        Type[] typeArr = new Type[1];
        Type type = this.f38991u;
        if (type == null) {
            type = Object.class;
        }
        typeArr[0] = type;
        return typeArr;
    }

    public final int hashCode() {
        return Arrays.hashCode(getUpperBounds()) ^ Arrays.hashCode(getLowerBounds());
    }

    public final String toString() {
        return getTypeName();
    }
}
