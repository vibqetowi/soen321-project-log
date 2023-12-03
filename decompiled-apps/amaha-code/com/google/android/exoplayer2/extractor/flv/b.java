package com.google.android.exoplayer2.extractor.flv;

import c9.m;
import c9.q;
import com.google.android.exoplayer2.extractor.flv.TagPayloadReader;
import com.google.android.exoplayer2.n;
import u7.v;
/* compiled from: VideoTagPayloadReader.java */
/* loaded from: classes.dex */
public final class b extends TagPayloadReader {

    /* renamed from: b  reason: collision with root package name */
    public final q f6482b;

    /* renamed from: c  reason: collision with root package name */
    public final q f6483c;

    /* renamed from: d  reason: collision with root package name */
    public int f6484d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f6485e;
    public boolean f;

    /* renamed from: g  reason: collision with root package name */
    public int f6486g;

    public b(v vVar) {
        super(vVar);
        this.f6482b = new q(m.f5155a);
        this.f6483c = new q(4);
    }

    public final boolean a(q qVar) {
        int q10 = qVar.q();
        int i6 = (q10 >> 4) & 15;
        int i10 = q10 & 15;
        if (i10 == 7) {
            this.f6486g = i6;
            if (i6 != 5) {
                return true;
            }
            return false;
        }
        throw new TagPayloadReader.UnsupportedFormatException(defpackage.b.h(39, "Video format not supported: ", i10));
    }

    public final boolean b(long j10, q qVar) {
        int i6;
        int q10 = qVar.q();
        byte[] bArr = qVar.f5186a;
        int i10 = qVar.f5187b;
        int i11 = i10 + 1;
        int i12 = i11 + 1;
        int i13 = (((bArr[i10] & 255) << 24) >> 8) | ((bArr[i11] & 255) << 8);
        int i14 = i12 + 1;
        qVar.f5187b = i14;
        long j11 = (((bArr[i12] & 255) | i13) * 1000) + j10;
        v vVar = this.f6477a;
        if (q10 == 0 && !this.f6485e) {
            q qVar2 = new q(new byte[qVar.f5188c - i14]);
            qVar.b(0, qVar2.f5186a, qVar.f5188c - qVar.f5187b);
            d9.a a10 = d9.a.a(qVar2);
            this.f6484d = a10.f12604b;
            n.a aVar = new n.a();
            aVar.f6665k = "video/avc";
            aVar.f6662h = a10.f;
            aVar.f6670p = a10.f12605c;
            aVar.f6671q = a10.f12606d;
            aVar.f6673t = a10.f12607e;
            aVar.f6667m = a10.f12603a;
            vVar.e(aVar.a());
            this.f6485e = true;
            return false;
        } else if (q10 != 1 || !this.f6485e) {
            return false;
        } else {
            if (this.f6486g == 1) {
                i6 = 1;
            } else {
                i6 = 0;
            }
            if (!this.f && i6 == 0) {
                return false;
            }
            q qVar3 = this.f6483c;
            byte[] bArr2 = qVar3.f5186a;
            bArr2[0] = 0;
            bArr2[1] = 0;
            bArr2[2] = 0;
            int i15 = 4 - this.f6484d;
            int i16 = 0;
            while (qVar.f5188c - qVar.f5187b > 0) {
                qVar.b(i15, qVar3.f5186a, this.f6484d);
                qVar3.A(0);
                int t3 = qVar3.t();
                q qVar4 = this.f6482b;
                qVar4.A(0);
                vVar.a(4, qVar4);
                vVar.a(t3, qVar);
                i16 = i16 + 4 + t3;
            }
            this.f6477a.d(j11, i6, i16, 0, null);
            this.f = true;
            return true;
        }
    }
}
