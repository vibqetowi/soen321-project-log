package ps;

import kotlin.jvm.internal.i;
/* compiled from: JDK7PlatformImplementations.kt */
/* loaded from: classes2.dex */
public class a extends os.a {

    /* compiled from: JDK7PlatformImplementations.kt */
    /* renamed from: ps.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0487a {

        /* renamed from: a  reason: collision with root package name */
        public static final Integer f28845a;

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
                f28845a = num2;
            }
            num = null;
            if (num != null) {
            }
            f28845a = num2;
        }
    }

    @Override // os.a
    public final void a(Throwable cause, Throwable exception) {
        boolean z10;
        i.g(cause, "cause");
        i.g(exception, "exception");
        Integer num = C0487a.f28845a;
        if (num != null && num.intValue() < 19) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (z10) {
            cause.addSuppressed(exception);
        } else {
            super.a(cause, exception);
        }
    }
}
