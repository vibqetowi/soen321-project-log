package vf;

import com.google.gson.reflect.TypeToken;
import sf.v;
import sf.w;
/* compiled from: TypeAdapters.java */
/* loaded from: classes.dex */
public final class r implements w {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ Class f35066u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ v f35067v;

    public r(Class cls, v vVar) {
        this.f35066u = cls;
        this.f35067v = vVar;
    }

    @Override // sf.w
    public final <T> v<T> a(sf.i iVar, TypeToken<T> typeToken) {
        if (typeToken.getRawType() == this.f35066u) {
            return this.f35067v;
        }
        return null;
    }

    public final String toString() {
        return "Factory[type=" + this.f35066u.getName() + ",adapter=" + this.f35067v + "]";
    }
}
