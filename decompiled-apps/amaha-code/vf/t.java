package vf;

import com.google.gson.reflect.TypeToken;
import java.util.Calendar;
import java.util.GregorianCalendar;
import sf.v;
import sf.w;
import vf.q;
/* compiled from: TypeAdapters.java */
/* loaded from: classes.dex */
public final class t implements w {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ Class f35071u = Calendar.class;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ Class f35072v = GregorianCalendar.class;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ v f35073w;

    public t(q.r rVar) {
        this.f35073w = rVar;
    }

    @Override // sf.w
    public final <T> v<T> a(sf.i iVar, TypeToken<T> typeToken) {
        Class<? super T> rawType = typeToken.getRawType();
        if (rawType != this.f35071u && rawType != this.f35072v) {
            return null;
        }
        return this.f35073w;
    }

    public final String toString() {
        return "Factory[type=" + this.f35071u.getName() + "+" + this.f35072v.getName() + ",adapter=" + this.f35073w + "]";
    }
}
