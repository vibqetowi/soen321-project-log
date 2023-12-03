package vf;

import com.google.gson.reflect.TypeToken;
import sf.v;
import sf.w;
/* compiled from: TypeAdapters.java */
/* loaded from: classes.dex */
public final class s implements w {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ Class f35068u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ Class f35069v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ v f35070w;

    public s(Class cls, Class cls2, v vVar) {
        this.f35068u = cls;
        this.f35069v = cls2;
        this.f35070w = vVar;
    }

    @Override // sf.w
    public final <T> v<T> a(sf.i iVar, TypeToken<T> typeToken) {
        Class<? super T> rawType = typeToken.getRawType();
        if (rawType != this.f35068u && rawType != this.f35069v) {
            return null;
        }
        return this.f35070w;
    }

    public final String toString() {
        return "Factory[type=" + this.f35069v.getName() + "+" + this.f35068u.getName() + ",adapter=" + this.f35070w + "]";
    }
}
