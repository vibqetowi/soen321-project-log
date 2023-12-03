package vf;

import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import sf.v;
import vf.n;
/* compiled from: TypeAdapterRuntimeTypeWrapper.java */
/* loaded from: classes.dex */
public final class p<T> extends v<T> {

    /* renamed from: a  reason: collision with root package name */
    public final sf.i f35036a;

    /* renamed from: b  reason: collision with root package name */
    public final v<T> f35037b;

    /* renamed from: c  reason: collision with root package name */
    public final Type f35038c;

    public p(sf.i iVar, v<T> vVar, Type type) {
        this.f35036a = iVar;
        this.f35037b = vVar;
        this.f35038c = type;
    }

    @Override // sf.v
    public final T a(yf.a aVar) {
        return this.f35037b.a(aVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.reflect.Type] */
    @Override // sf.v
    public final void b(yf.b bVar, T t3) {
        Class<?> cls;
        ?? r02 = this.f35038c;
        if (t3 != null && (r02 == Object.class || (r02 instanceof TypeVariable) || (r02 instanceof Class))) {
            cls = t3.getClass();
        } else {
            cls = r02;
        }
        v<T> vVar = this.f35037b;
        if (cls != r02) {
            v<T> d10 = this.f35036a.d(TypeToken.get((Type) cls));
            if (!(d10 instanceof n.a) || (vVar instanceof n.a)) {
                vVar = d10;
            }
        }
        vVar.b(bVar, t3);
    }
}
