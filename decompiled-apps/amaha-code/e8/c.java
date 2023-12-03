package e8;

import android.util.Log;
import c9.q;
import u7.i;
/* compiled from: WavHeaderReader.java */
/* loaded from: classes.dex */
public final class c {

    /* compiled from: WavHeaderReader.java */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final int f13860a;

        /* renamed from: b  reason: collision with root package name */
        public final long f13861b;

        public a(int i6, long j10) {
            this.f13860a = i6;
            this.f13861b = j10;
        }

        public static a a(i iVar, q qVar) {
            iVar.b(0, qVar.f5186a, 8);
            qVar.A(0);
            return new a(qVar.c(), qVar.g());
        }
    }

    public static boolean a(i iVar) {
        q qVar = new q(8);
        if (a.a(iVar, qVar).f13860a != 1380533830) {
            return false;
        }
        iVar.b(0, qVar.f5186a, 4);
        qVar.A(0);
        int c10 = qVar.c();
        if (c10 != 1463899717) {
            StringBuilder sb2 = new StringBuilder(34);
            sb2.append("Unsupported form type: ");
            sb2.append(c10);
            Log.e("WavHeaderReader", sb2.toString());
            return false;
        }
        return true;
    }
}
