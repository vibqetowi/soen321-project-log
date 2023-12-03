package lv;

import java.nio.charset.Charset;
import java.util.regex.Pattern;
import lv.v;
/* compiled from: RequestBody.kt */
/* loaded from: classes2.dex */
public abstract class c0 {

    /* compiled from: RequestBody.kt */
    /* loaded from: classes2.dex */
    public static final class a {
        public static b0 a(String str, v vVar) {
            Charset charset = gv.a.f16927b;
            if (vVar != null) {
                Pattern pattern = v.f24702d;
                Charset a10 = vVar.a(null);
                if (a10 == null) {
                    vVar = v.a.b(vVar + "; charset=utf-8");
                } else {
                    charset = a10;
                }
            }
            byte[] bytes = str.getBytes(charset);
            kotlin.jvm.internal.i.f(bytes, "this as java.lang.String).getBytes(charset)");
            int length = bytes.length;
            mv.b.c(bytes.length, 0, length);
            return new b0(vVar, bytes, length, 0);
        }
    }

    public long a() {
        return -1L;
    }

    public abstract v b();

    public abstract void c(zv.g gVar);
}
