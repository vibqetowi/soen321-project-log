package vf;

import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import sf.v;
import sf.w;
/* compiled from: ArrayTypeAdapter.java */
/* loaded from: classes.dex */
public final class a<E> extends v<Object> {

    /* renamed from: c  reason: collision with root package name */
    public static final C0592a f34995c = new C0592a();

    /* renamed from: a  reason: collision with root package name */
    public final Class<E> f34996a;

    /* renamed from: b  reason: collision with root package name */
    public final p f34997b;

    /* compiled from: ArrayTypeAdapter.java */
    /* renamed from: vf.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class C0592a implements w {
        @Override // sf.w
        public final <T> v<T> a(sf.i iVar, TypeToken<T> typeToken) {
            Type componentType;
            Type type = typeToken.getType();
            boolean z10 = type instanceof GenericArrayType;
            if (!z10 && (!(type instanceof Class) || !((Class) type).isArray())) {
                return null;
            }
            if (z10) {
                componentType = ((GenericArrayType) type).getGenericComponentType();
            } else {
                componentType = ((Class) type).getComponentType();
            }
            return new a(iVar, iVar.d(TypeToken.get(componentType)), uf.a.f(componentType));
        }
    }

    public a(sf.i iVar, v<E> vVar, Class<E> cls) {
        this.f34997b = new p(iVar, vVar, cls);
        this.f34996a = cls;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // sf.v
    public final Object a(yf.a aVar) {
        if (aVar.y0() == 9) {
            aVar.p0();
            return null;
        }
        ArrayList arrayList = new ArrayList();
        aVar.a();
        while (aVar.J()) {
            arrayList.add(this.f34997b.a(aVar));
        }
        aVar.j();
        int size = arrayList.size();
        Object newInstance = Array.newInstance((Class<?>) this.f34996a, size);
        for (int i6 = 0; i6 < size; i6++) {
            Array.set(newInstance, i6, arrayList.get(i6));
        }
        return newInstance;
    }

    @Override // sf.v
    public final void b(yf.b bVar, Object obj) {
        if (obj == null) {
            bVar.G();
            return;
        }
        bVar.e();
        int length = Array.getLength(obj);
        for (int i6 = 0; i6 < length; i6++) {
            this.f34997b.b(bVar, Array.get(obj, i6));
        }
        bVar.j();
    }
}
