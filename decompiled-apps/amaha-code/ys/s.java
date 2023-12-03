package ys;

import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;
import java.util.List;
/* compiled from: TypesJVM.kt */
/* loaded from: classes2.dex */
public final class s implements TypeVariable<GenericDeclaration>, Type {

    /* renamed from: u  reason: collision with root package name */
    public final o f38987u;

    public s(o typeParameter) {
        kotlin.jvm.internal.i.g(typeParameter, "typeParameter");
        this.f38987u = typeParameter;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof TypeVariable) && kotlin.jvm.internal.i.b(getName(), ((TypeVariable) obj).getName())) {
            getGenericDeclaration();
            throw null;
        }
        return false;
    }

    @Override // java.lang.reflect.TypeVariable
    public final Type[] getBounds() {
        List<n> upperBounds = this.f38987u.getUpperBounds();
        ArrayList arrayList = new ArrayList(is.i.H1(upperBounds, 10));
        for (n nVar : upperBounds) {
            arrayList.add(t.b(nVar, true));
        }
        return (Type[]) arrayList.toArray(new Type[0]);
    }

    @Override // java.lang.reflect.TypeVariable
    public final GenericDeclaration getGenericDeclaration() {
        throw new hs.e(defpackage.c.r("An operation is not implemented: ", "getGenericDeclaration() is not yet supported for type variables created from KType: " + this.f38987u), 0);
    }

    @Override // java.lang.reflect.TypeVariable
    public final String getName() {
        return this.f38987u.getName();
    }

    @Override // java.lang.reflect.Type
    public final String getTypeName() {
        return getName();
    }

    public final int hashCode() {
        getName().hashCode();
        getGenericDeclaration();
        throw null;
    }

    public final String toString() {
        return getName();
    }
}
