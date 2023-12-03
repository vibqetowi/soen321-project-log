package d7;

import android.util.Base64;
import com.google.auto.value.AutoValue;
import d7.j;
/* compiled from: TransportContext.java */
@AutoValue
/* loaded from: classes.dex */
public abstract class s {

    /* compiled from: TransportContext.java */
    @AutoValue.Builder
    /* loaded from: classes.dex */
    public static abstract class a {
    }

    public static j.a a() {
        j.a aVar = new j.a();
        aVar.c(a7.d.DEFAULT);
        return aVar;
    }

    public abstract String b();

    public abstract byte[] c();

    public abstract a7.d d();

    public final j e(a7.d dVar) {
        j.a a10 = a();
        a10.b(b());
        a10.c(dVar);
        a10.f12245b = c();
        return a10.a();
    }

    public final String toString() {
        String encodeToString;
        Object[] objArr = new Object[3];
        objArr[0] = b();
        objArr[1] = d();
        if (c() == null) {
            encodeToString = "";
        } else {
            encodeToString = Base64.encodeToString(c(), 2);
        }
        objArr[2] = encodeToString;
        return String.format("TransportContext(%s, %s, %s)", objArr);
    }
}
