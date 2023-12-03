package d7;

import com.google.auto.value.AutoValue;
import d7.h;
import java.util.HashMap;
import java.util.Map;
/* compiled from: EventInternal.java */
@AutoValue
/* loaded from: classes.dex */
public abstract class n {

    /* compiled from: EventInternal.java */
    @AutoValue.Builder
    /* loaded from: classes.dex */
    public static abstract class a {
        public final void a(String str, String str2) {
            Map<String, String> map = ((h.a) this).f;
            if (map != null) {
                map.put(str, str2);
                return;
            }
            throw new IllegalStateException("Property \"autoMetadata\" has not been set");
        }
    }

    public final String a(String str) {
        String str2 = b().get(str);
        if (str2 == null) {
            return "";
        }
        return str2;
    }

    public abstract Map<String, String> b();

    public abstract Integer c();

    public abstract m d();

    public abstract long e();

    public final int f(String str) {
        String str2 = b().get(str);
        if (str2 == null) {
            return 0;
        }
        return Integer.valueOf(str2).intValue();
    }

    public abstract String g();

    public abstract long h();

    public final h.a i() {
        h.a aVar = new h.a();
        aVar.d(g());
        aVar.f12232b = c();
        aVar.c(d());
        aVar.f12234d = Long.valueOf(e());
        aVar.f12235e = Long.valueOf(h());
        aVar.f = new HashMap(b());
        return aVar;
    }
}
