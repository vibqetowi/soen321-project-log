package nc;

import java.util.Arrays;
/* compiled from: MoreObjects.java */
/* loaded from: classes.dex */
public final class f {

    /* compiled from: MoreObjects.java */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final String f25993a;

        /* renamed from: b  reason: collision with root package name */
        public final b f25994b;

        /* renamed from: c  reason: collision with root package name */
        public b f25995c;

        /* renamed from: d  reason: collision with root package name */
        public boolean f25996d;

        /* compiled from: MoreObjects.java */
        /* renamed from: nc.f$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0428a extends b {
        }

        /* compiled from: MoreObjects.java */
        /* loaded from: classes.dex */
        public static class b {

            /* renamed from: a  reason: collision with root package name */
            public String f25997a;

            /* renamed from: b  reason: collision with root package name */
            public Object f25998b;

            /* renamed from: c  reason: collision with root package name */
            public b f25999c;
        }

        public a(String str) {
            b bVar = new b();
            this.f25994b = bVar;
            this.f25995c = bVar;
            this.f25996d = false;
            this.f25993a = str;
        }

        public final void a(int i6, String str) {
            e(String.valueOf(i6), str);
        }

        public final void b(long j10, String str) {
            e(String.valueOf(j10), str);
        }

        public final void c(Object obj, String str) {
            b bVar = new b();
            this.f25995c.f25999c = bVar;
            this.f25995c = bVar;
            bVar.f25998b = obj;
            bVar.f25997a = str;
        }

        public final void d(String str, boolean z10) {
            e(String.valueOf(z10), str);
        }

        public final void e(String str, String str2) {
            C0428a c0428a = new C0428a();
            this.f25995c.f25999c = c0428a;
            this.f25995c = c0428a;
            c0428a.f25998b = str;
            c0428a.f25997a = str2;
        }

        public final String toString() {
            boolean z10 = this.f25996d;
            StringBuilder sb2 = new StringBuilder(32);
            sb2.append(this.f25993a);
            sb2.append('{');
            String str = "";
            for (b bVar = this.f25994b.f25999c; bVar != null; bVar = bVar.f25999c) {
                Object obj = bVar.f25998b;
                if ((bVar instanceof C0428a) || obj != null || !z10) {
                    sb2.append(str);
                    String str2 = bVar.f25997a;
                    if (str2 != null) {
                        sb2.append(str2);
                        sb2.append('=');
                    }
                    if (obj != null && obj.getClass().isArray()) {
                        String deepToString = Arrays.deepToString(new Object[]{obj});
                        sb2.append((CharSequence) deepToString, 1, deepToString.length() - 1);
                    } else {
                        sb2.append(obj);
                    }
                    str = ", ";
                }
            }
            sb2.append('}');
            return sb2.toString();
        }
    }

    public static <T> T a(T t3, T t10) {
        if (t3 != null) {
            return t3;
        }
        if (t10 != null) {
            return t10;
        }
        throw new NullPointerException("Both parameters are null");
    }

    public static a b(Class<?> cls) {
        return new a(cls.getSimpleName());
    }

    public static a c(Object obj) {
        return new a(obj.getClass().getSimpleName());
    }
}
