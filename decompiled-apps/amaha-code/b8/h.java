package b8;

import android.util.Log;
import c9.q;
import java.util.UUID;
/* compiled from: PsshAtomUtil.java */
/* loaded from: classes.dex */
public final class h {

    /* compiled from: PsshAtomUtil.java */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public final UUID f4061a;

        /* renamed from: b  reason: collision with root package name */
        public final int f4062b;

        /* renamed from: c  reason: collision with root package name */
        public final byte[] f4063c;

        public a(UUID uuid, int i6, byte[] bArr) {
            this.f4061a = uuid;
            this.f4062b = i6;
            this.f4063c = bArr;
        }
    }

    public static a a(byte[] bArr) {
        q qVar = new q(bArr);
        if (qVar.f5188c < 32) {
            return null;
        }
        qVar.A(0);
        if (qVar.c() != (qVar.f5188c - qVar.f5187b) + 4 || qVar.c() != 1886614376) {
            return null;
        }
        int c10 = (qVar.c() >> 24) & 255;
        if (c10 > 1) {
            defpackage.d.k(37, "Unsupported pssh version: ", c10, "PsshAtomUtil");
            return null;
        }
        UUID uuid = new UUID(qVar.j(), qVar.j());
        if (c10 == 1) {
            qVar.B(qVar.t() * 16);
        }
        int t3 = qVar.t();
        if (t3 != qVar.f5188c - qVar.f5187b) {
            return null;
        }
        byte[] bArr2 = new byte[t3];
        qVar.b(0, bArr2, t3);
        return new a(uuid, c10, bArr2);
    }

    public static byte[] b(UUID uuid, byte[] bArr) {
        a a10 = a(bArr);
        if (a10 == null) {
            return null;
        }
        UUID uuid2 = a10.f4061a;
        if (!uuid.equals(uuid2)) {
            String valueOf = String.valueOf(uuid);
            String valueOf2 = String.valueOf(uuid2);
            StringBuilder n10 = defpackage.e.n(valueOf2.length() + valueOf.length() + 33, "UUID mismatch. Expected: ", valueOf, ", got: ", valueOf2);
            n10.append(".");
            Log.w("PsshAtomUtil", n10.toString());
            return null;
        }
        return a10.f4063c;
    }
}
