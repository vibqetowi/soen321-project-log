package c8;

import c8.h;
import c9.q;
import com.google.android.exoplayer2.n;
import com.theinnerhour.b2b.utils.Constants;
import java.util.ArrayList;
import java.util.Arrays;
/* compiled from: OpusReader.java */
/* loaded from: classes.dex */
public final class g extends h {

    /* renamed from: o  reason: collision with root package name */
    public static final byte[] f5102o = {79, 112, 117, 115, 72, 101, 97, 100};

    /* renamed from: n  reason: collision with root package name */
    public boolean f5103n;

    @Override // c8.h
    public final long b(q qVar) {
        int i6;
        int i10;
        byte[] bArr = qVar.f5186a;
        int i11 = bArr[0] & 255;
        int i12 = i11 & 3;
        if (i12 != 0) {
            i6 = 2;
            if (i12 != 1 && i12 != 2) {
                i6 = bArr[1] & 63;
            }
        } else {
            i6 = 1;
        }
        int i13 = i11 >> 3;
        int i14 = i13 & 3;
        if (i13 >= 16) {
            i10 = 2500 << i14;
        } else if (i13 >= 12) {
            i10 = Constants.TIMEOUT_MS << (i14 & 1);
        } else if (i14 == 3) {
            i10 = 60000;
        } else {
            i10 = Constants.TIMEOUT_MS << i14;
        }
        return (this.f5111i * (i6 * i10)) / 1000000;
    }

    @Override // c8.h
    public final boolean c(q qVar, long j10, h.a aVar) {
        boolean z10 = true;
        if (!this.f5103n) {
            byte[] copyOf = Arrays.copyOf(qVar.f5186a, qVar.f5188c);
            ArrayList l2 = sc.b.l(copyOf);
            n.a aVar2 = new n.a();
            aVar2.f6665k = "audio/opus";
            aVar2.f6677x = copyOf[9] & 255;
            aVar2.f6678y = 48000;
            aVar2.f6667m = l2;
            aVar.f5116a = new n(aVar2);
            this.f5103n = true;
            return true;
        }
        aVar.f5116a.getClass();
        if (qVar.c() != 1332770163) {
            z10 = false;
        }
        qVar.A(0);
        return z10;
    }

    @Override // c8.h
    public final void d(boolean z10) {
        super.d(z10);
        if (z10) {
            this.f5103n = false;
        }
    }
}
