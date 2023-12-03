package r5;

import android.text.TextUtils;
import h5.p;
import java.io.File;
import java.nio.charset.Charset;
import kotlin.jvm.internal.i;
/* compiled from: Utils.kt */
/* loaded from: classes.dex */
public final class e {

    /* renamed from: a  reason: collision with root package name */
    public static final e f30482a = new e();

    public static final File a() {
        if (b6.a.b(e.class)) {
            return null;
        }
        try {
            File file = new File(p.a().getFilesDir(), "facebook_ml/");
            if (!file.exists()) {
                if (!file.mkdirs()) {
                    return null;
                }
            }
            return file;
        } catch (Throwable th2) {
            b6.a.a(e.class, th2);
            return null;
        }
    }

    public final String b(String str) {
        int i6;
        boolean z10;
        if (b6.a.b(this)) {
            return null;
        }
        try {
            i.g(str, "str");
            int length = str.length() - 1;
            int i10 = 0;
            boolean z11 = false;
            while (i10 <= length) {
                if (!z11) {
                    i6 = i10;
                } else {
                    i6 = length;
                }
                if (i.i(str.charAt(i6), 32) <= 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (!z11) {
                    if (!z10) {
                        z11 = true;
                    } else {
                        i10++;
                    }
                } else if (!z10) {
                    break;
                } else {
                    length--;
                }
            }
            Object[] array = new gv.e("\\s+").c(str.subSequence(i10, length + 1).toString()).toArray(new String[0]);
            if (array != null) {
                String join = TextUtils.join(" ", (String[]) array);
                i.f(join, "join(\" \", strArray)");
                return join;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
        } catch (Throwable th2) {
            b6.a.a(this, th2);
            return null;
        }
    }

    public final int[] c(String texts) {
        if (b6.a.b(this)) {
            return null;
        }
        try {
            i.g(texts, "texts");
            int[] iArr = new int[128];
            String b10 = b(texts);
            Charset forName = Charset.forName("UTF-8");
            i.f(forName, "forName(\"UTF-8\")");
            if (b10 != null) {
                byte[] bytes = b10.getBytes(forName);
                i.f(bytes, "(this as java.lang.String).getBytes(charset)");
                int i6 = 0;
                while (true) {
                    int i10 = i6 + 1;
                    if (i6 < bytes.length) {
                        iArr[i6] = bytes[i6] & 255;
                    } else {
                        iArr[i6] = 0;
                    }
                    if (i10 >= 128) {
                        return iArr;
                    }
                    i6 = i10;
                }
            } else {
                throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
            }
        } catch (Throwable th2) {
            b6.a.a(this, th2);
            return null;
        }
    }
}
