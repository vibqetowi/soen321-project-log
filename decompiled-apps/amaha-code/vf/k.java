package vf;

import com.google.gson.reflect.TypeToken;
import sf.s;
import sf.v;
import sf.w;
/* compiled from: ObjectTypeAdapter.java */
/* loaded from: classes.dex */
public final class k implements w {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ sf.t f35013u;

    public k(s.a aVar) {
        this.f35013u = aVar;
    }

    @Override // sf.w
    public final <T> v<T> a(sf.i iVar, TypeToken<T> typeToken) {
        if (typeToken.getRawType() == Object.class) {
            return new l(iVar, this.f35013u);
        }
        return null;
    }
}
