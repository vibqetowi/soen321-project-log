package ys;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
/* compiled from: TypesJVM.kt */
/* loaded from: classes2.dex */
public final class a implements GenericArrayType, Type {

    /* renamed from: u  reason: collision with root package name */
    public final Type f38973u;

    public a(Type elementType) {
        kotlin.jvm.internal.i.g(elementType, "elementType");
        this.f38973u = elementType;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof GenericArrayType) {
            if (kotlin.jvm.internal.i.b(this.f38973u, ((GenericArrayType) obj).getGenericComponentType())) {
                return true;
            }
        }
        return false;
    }

    @Override // java.lang.reflect.GenericArrayType
    public final Type getGenericComponentType() {
        return this.f38973u;
    }

    @Override // java.lang.reflect.Type
    public final String getTypeName() {
        return t.a(this.f38973u) + "[]";
    }

    public final int hashCode() {
        return this.f38973u.hashCode();
    }

    public final String toString() {
        return getTypeName();
    }
}
