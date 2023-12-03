package qs;

import vs.b;
import vs.c;
/* compiled from: JDK8PlatformImplementations.kt */
/* loaded from: classes2.dex */
public class a extends ps.a {

    /* compiled from: JDK8PlatformImplementations.kt */
    /* renamed from: qs.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0509a {

        /* renamed from: a  reason: collision with root package name */
        public static final Integer f30104a;

        /* JADX WARN: Removed duplicated region for block: B:10:0x001c  */
        static {
            Integer num;
            boolean z10;
            Object obj;
            Integer num2 = null;
            try {
                obj = Class.forName("android.os.Build$VERSION").getField("SDK_INT").get(null);
            } catch (Throwable unused) {
            }
            if (obj instanceof Integer) {
                num = (Integer) obj;
                if (num != null) {
                    if (num.intValue() > 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (z10) {
                        num2 = num;
                    }
                }
                f30104a = num2;
            }
            num = null;
            if (num != null) {
            }
            f30104a = num2;
        }
    }

    @Override // os.a
    public final c b() {
        boolean z10;
        Integer num = C0509a.f30104a;
        if (num != null && num.intValue() < 34) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (z10) {
            return new ws.a();
        }
        return new b();
    }
}
