package m4;

import e5.a;
import e5.d;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
/* compiled from: SafeKeyGenerator.java */
/* loaded from: classes.dex */
public final class j {

    /* renamed from: a  reason: collision with root package name */
    public final d5.g<h4.e, String> f24828a = new d5.g<>(1000);

    /* renamed from: b  reason: collision with root package name */
    public final a.c f24829b = e5.a.a(10, new a());

    /* compiled from: SafeKeyGenerator.java */
    /* loaded from: classes.dex */
    public class a implements a.b<b> {
        @Override // e5.a.b
        public final b a() {
            try {
                return new b(MessageDigest.getInstance("SHA-256"));
            } catch (NoSuchAlgorithmException e10) {
                throw new RuntimeException(e10);
            }
        }
    }

    /* compiled from: SafeKeyGenerator.java */
    /* loaded from: classes.dex */
    public static final class b implements a.d {

        /* renamed from: u  reason: collision with root package name */
        public final MessageDigest f24830u;

        /* renamed from: v  reason: collision with root package name */
        public final d.a f24831v = new d.a();

        public b(MessageDigest messageDigest) {
            this.f24830u = messageDigest;
        }

        @Override // e5.a.d
        public final d.a i() {
            return this.f24831v;
        }
    }

    public final String a(h4.e eVar) {
        String str;
        Object b10 = this.f24829b.b();
        kc.f.p(b10);
        b bVar = (b) b10;
        try {
            eVar.a(bVar.f24830u);
            byte[] digest = bVar.f24830u.digest();
            char[] cArr = d5.j.f12202b;
            synchronized (cArr) {
                for (int i6 = 0; i6 < digest.length; i6++) {
                    int i10 = digest[i6] & 255;
                    int i11 = i6 * 2;
                    char[] cArr2 = d5.j.f12201a;
                    cArr[i11] = cArr2[i10 >>> 4];
                    cArr[i11 + 1] = cArr2[i10 & 15];
                }
                str = new String(cArr);
            }
            return str;
        } finally {
            this.f24829b.a(bVar);
        }
    }

    public final String b(h4.e eVar) {
        String a10;
        synchronized (this.f24828a) {
            a10 = this.f24828a.a(eVar);
        }
        if (a10 == null) {
            a10 = a(eVar);
        }
        synchronized (this.f24828a) {
            this.f24828a.d(eVar, a10);
        }
        return a10;
    }
}
