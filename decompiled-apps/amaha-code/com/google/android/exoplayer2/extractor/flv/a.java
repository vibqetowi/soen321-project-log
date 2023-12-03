package com.google.android.exoplayer2.extractor.flv;

import c9.q;
import com.google.android.exoplayer2.extractor.flv.TagPayloadReader;
import com.google.android.exoplayer2.n;
import java.util.Collections;
import q7.a;
import u7.v;
/* compiled from: AudioTagPayloadReader.java */
/* loaded from: classes.dex */
public final class a extends TagPayloadReader {

    /* renamed from: e  reason: collision with root package name */
    public static final int[] f6478e = {5512, 11025, 22050, 44100};

    /* renamed from: b  reason: collision with root package name */
    public boolean f6479b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f6480c;

    /* renamed from: d  reason: collision with root package name */
    public int f6481d;

    public a(v vVar) {
        super(vVar);
    }

    public final boolean a(q qVar) {
        String str;
        if (!this.f6479b) {
            int q10 = qVar.q();
            int i6 = (q10 >> 4) & 15;
            this.f6481d = i6;
            v vVar = this.f6477a;
            if (i6 == 2) {
                int i10 = f6478e[(q10 >> 2) & 3];
                n.a aVar = new n.a();
                aVar.f6665k = "audio/mpeg";
                aVar.f6677x = 1;
                aVar.f6678y = i10;
                vVar.e(aVar.a());
                this.f6480c = true;
            } else if (i6 != 7 && i6 != 8) {
                if (i6 != 10) {
                    throw new TagPayloadReader.UnsupportedFormatException(defpackage.b.h(39, "Audio format not supported: ", this.f6481d));
                }
            } else {
                if (i6 == 7) {
                    str = "audio/g711-alaw";
                } else {
                    str = "audio/g711-mlaw";
                }
                n.a aVar2 = new n.a();
                aVar2.f6665k = str;
                aVar2.f6677x = 1;
                aVar2.f6678y = 8000;
                vVar.e(aVar2.a());
                this.f6480c = true;
            }
            this.f6479b = true;
        } else {
            qVar.B(1);
        }
        return true;
    }

    public final boolean b(long j10, q qVar) {
        int i6 = this.f6481d;
        v vVar = this.f6477a;
        if (i6 == 2) {
            int i10 = qVar.f5188c - qVar.f5187b;
            vVar.a(i10, qVar);
            this.f6477a.d(j10, 1, i10, 0, null);
            return true;
        }
        int q10 = qVar.q();
        if (q10 == 0 && !this.f6480c) {
            int i11 = qVar.f5188c - qVar.f5187b;
            byte[] bArr = new byte[i11];
            qVar.b(0, bArr, i11);
            a.C0493a c10 = q7.a.c(bArr);
            n.a aVar = new n.a();
            aVar.f6665k = "audio/mp4a-latm";
            aVar.f6662h = c10.f29232c;
            aVar.f6677x = c10.f29231b;
            aVar.f6678y = c10.f29230a;
            aVar.f6667m = Collections.singletonList(bArr);
            vVar.e(aVar.a());
            this.f6480c = true;
            return false;
        } else if (this.f6481d == 10 && q10 != 1) {
            return false;
        } else {
            int i12 = qVar.f5188c - qVar.f5187b;
            vVar.a(i12, qVar);
            this.f6477a.d(j10, 1, i12, 0, null);
            return true;
        }
    }
}
