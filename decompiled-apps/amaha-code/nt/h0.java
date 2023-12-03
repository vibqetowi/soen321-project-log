package nt;

import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;
import java.util.Collection;
import nt.h;
/* compiled from: ReflectJavaTypeParameter.kt */
/* loaded from: classes2.dex */
public final class h0 extends w implements h, wt.x {

    /* renamed from: a  reason: collision with root package name */
    public final TypeVariable<?> f26808a;

    public h0(TypeVariable<?> typeVariable) {
        kotlin.jvm.internal.i.g(typeVariable, "typeVariable");
        this.f26808a = typeVariable;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof h0) {
            if (kotlin.jvm.internal.i.b(this.f26808a, ((h0) obj).f26808a)) {
                return true;
            }
        }
        return false;
    }

    @Override // wt.d
    public final Collection getAnnotations() {
        return h.a.b(this);
    }

    @Override // wt.s
    public final fu.e getName() {
        return fu.e.j(this.f26808a.getName());
    }

    @Override // wt.x
    public final Collection getUpperBounds() {
        Type type;
        Type[] bounds = this.f26808a.getBounds();
        kotlin.jvm.internal.i.f(bounds, "typeVariable.bounds");
        ArrayList arrayList = new ArrayList(bounds.length);
        for (Type type2 : bounds) {
            arrayList.add(new u(type2));
        }
        u uVar = (u) is.u.A2(arrayList);
        if (uVar != null) {
            type = uVar.f26829a;
        } else {
            type = null;
        }
        if (kotlin.jvm.internal.i.b(type, Object.class)) {
            return is.w.f20676u;
        }
        return arrayList;
    }

    public final int hashCode() {
        return this.f26808a.hashCode();
    }

    @Override // wt.d
    public final wt.a l(fu.c cVar) {
        return h.a.a(this, cVar);
    }

    public final String toString() {
        return h0.class.getName() + ": " + this.f26808a;
    }

    @Override // nt.h
    public final AnnotatedElement z() {
        TypeVariable<?> typeVariable = this.f26808a;
        if (typeVariable instanceof AnnotatedElement) {
            return (AnnotatedElement) typeVariable;
        }
        return null;
    }

    @Override // wt.d
    public final void o() {
    }
}
