package vf;

import com.google.gson.reflect.TypeToken;
import sf.v;
import sf.w;
/* compiled from: NumberTypeAdapter.java */
/* loaded from: classes.dex */
public final class i implements w {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ j f35010u;

    public i(j jVar) {
        this.f35010u = jVar;
    }

    @Override // sf.w
    public final <T> v<T> a(sf.i iVar, TypeToken<T> typeToken) {
        if (typeToken.getRawType() == Number.class) {
            return this.f35010u;
        }
        return null;
    }
}
