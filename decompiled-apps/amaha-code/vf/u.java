package vf;

import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import sf.v;
import sf.w;
/* compiled from: TypeAdapters.java */
/* loaded from: classes.dex */
public final class u implements w {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ Class f35074u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ v f35075v;

    /* compiled from: TypeAdapters.java */
    /* loaded from: classes.dex */
    public class a extends v<Object> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Class f35076a;

        public a(Class cls) {
            this.f35076a = cls;
        }

        @Override // sf.v
        public final Object a(yf.a aVar) {
            Object a10 = u.this.f35075v.a(aVar);
            if (a10 != null) {
                Class cls = this.f35076a;
                if (!cls.isInstance(a10)) {
                    throw new JsonSyntaxException("Expected a " + cls.getName() + " but was " + a10.getClass().getName() + "; at path " + aVar.I());
                }
            }
            return a10;
        }

        @Override // sf.v
        public final void b(yf.b bVar, Object obj) {
            u.this.f35075v.b(bVar, obj);
        }
    }

    public u(Class cls, v vVar) {
        this.f35074u = cls;
        this.f35075v = vVar;
    }

    @Override // sf.w
    public final <T2> v<T2> a(sf.i iVar, TypeToken<T2> typeToken) {
        Class<? super T2> rawType = typeToken.getRawType();
        if (!this.f35074u.isAssignableFrom(rawType)) {
            return null;
        }
        return new a(rawType);
    }

    public final String toString() {
        return "Factory[typeHierarchy=" + this.f35074u.getName() + ",adapter=" + this.f35075v + "]";
    }
}
