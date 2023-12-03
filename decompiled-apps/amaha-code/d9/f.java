package d9;

import c9.m;
import com.google.android.exoplayer2.ParserException;
import java.util.Collections;
import java.util.List;
/* compiled from: HevcConfig.java */
/* loaded from: classes.dex */
public final class f {

    /* renamed from: a  reason: collision with root package name */
    public final List<byte[]> f12640a;

    /* renamed from: b  reason: collision with root package name */
    public final int f12641b;

    /* renamed from: c  reason: collision with root package name */
    public final float f12642c;

    /* renamed from: d  reason: collision with root package name */
    public final String f12643d;

    public f(List list, int i6, float f, String str) {
        this.f12640a = list;
        this.f12641b = i6;
        this.f12642c = f;
        this.f12643d = str;
    }

    public static f a(c9.q qVar) {
        List singletonList;
        int i6;
        try {
            qVar.B(21);
            int q10 = qVar.q() & 3;
            int q11 = qVar.q();
            int i10 = qVar.f5187b;
            int i11 = 0;
            int i12 = 0;
            for (int i13 = 0; i13 < q11; i13++) {
                qVar.B(1);
                int v10 = qVar.v();
                for (int i14 = 0; i14 < v10; i14++) {
                    int v11 = qVar.v();
                    i12 += v11 + 4;
                    qVar.B(v11);
                }
            }
            qVar.A(i10);
            byte[] bArr = new byte[i12];
            String str = null;
            float f = 1.0f;
            int i15 = 0;
            int i16 = 0;
            while (i15 < q11) {
                int q12 = qVar.q() & 127;
                int v12 = qVar.v();
                int i17 = 0;
                while (i17 < v12) {
                    int v13 = qVar.v();
                    System.arraycopy(c9.m.f5155a, i11, bArr, i16, 4);
                    int i18 = i16 + 4;
                    System.arraycopy(qVar.f5186a, qVar.f5187b, bArr, i18, v13);
                    if (q12 == 33 && i17 == 0) {
                        m.a c10 = c9.m.c(i18, bArr, i18 + v13);
                        float f2 = c10.f5164g;
                        i6 = q11;
                        str = kotlin.jvm.internal.h.h(c10.f5159a, c10.f5160b, c10.f5161c, c10.f5162d, c10.f5163e, c10.f);
                        f = f2;
                    } else {
                        i6 = q11;
                    }
                    i16 = i18 + v13;
                    qVar.B(v13);
                    i17++;
                    q11 = i6;
                    i11 = 0;
                }
                i15++;
                i11 = 0;
            }
            if (i12 == 0) {
                singletonList = Collections.emptyList();
            } else {
                singletonList = Collections.singletonList(bArr);
            }
            return new f(singletonList, q10 + 1, f, str);
        } catch (ArrayIndexOutOfBoundsException e10) {
            throw ParserException.a("Error parsing HEVC config", e10);
        }
    }
}
