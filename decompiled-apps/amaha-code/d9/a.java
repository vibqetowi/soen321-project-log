package d9;

import c9.m;
import com.google.android.exoplayer2.ParserException;
import java.util.ArrayList;
import java.util.List;
/* compiled from: AvcConfig.java */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final List<byte[]> f12603a;

    /* renamed from: b  reason: collision with root package name */
    public final int f12604b;

    /* renamed from: c  reason: collision with root package name */
    public final int f12605c;

    /* renamed from: d  reason: collision with root package name */
    public final int f12606d;

    /* renamed from: e  reason: collision with root package name */
    public final float f12607e;
    public final String f;

    public a(ArrayList arrayList, int i6, int i10, int i11, float f, String str) {
        this.f12603a = arrayList;
        this.f12604b = i6;
        this.f12605c = i10;
        this.f12606d = i11;
        this.f12607e = f;
        this.f = str;
    }

    public static a a(c9.q qVar) {
        byte[] bArr;
        String str;
        int i6;
        int i10;
        float f;
        try {
            qVar.B(4);
            int q10 = (qVar.q() & 3) + 1;
            if (q10 != 3) {
                ArrayList arrayList = new ArrayList();
                int q11 = qVar.q() & 31;
                int i11 = 0;
                while (true) {
                    bArr = kotlin.jvm.internal.h.f23460v;
                    if (i11 >= q11) {
                        break;
                    }
                    int v10 = qVar.v();
                    int i12 = qVar.f5187b;
                    qVar.B(v10);
                    byte[] bArr2 = qVar.f5186a;
                    byte[] bArr3 = new byte[v10 + 4];
                    System.arraycopy(bArr, 0, bArr3, 0, 4);
                    System.arraycopy(bArr2, i12, bArr3, 4, v10);
                    arrayList.add(bArr3);
                    i11++;
                }
                int q12 = qVar.q();
                for (int i13 = 0; i13 < q12; i13++) {
                    int v11 = qVar.v();
                    int i14 = qVar.f5187b;
                    qVar.B(v11);
                    byte[] bArr4 = qVar.f5186a;
                    byte[] bArr5 = new byte[v11 + 4];
                    System.arraycopy(bArr, 0, bArr5, 0, 4);
                    System.arraycopy(bArr4, i14, bArr5, 4, v11);
                    arrayList.add(bArr5);
                }
                if (q11 > 0) {
                    m.c d10 = c9.m.d(q10, (byte[]) arrayList.get(0), ((byte[]) arrayList.get(0)).length);
                    int i15 = d10.f5171e;
                    int i16 = d10.f;
                    float f2 = d10.f5172g;
                    str = kotlin.jvm.internal.h.g(d10.f5167a, d10.f5168b, d10.f5169c);
                    i6 = i15;
                    i10 = i16;
                    f = f2;
                } else {
                    str = null;
                    i6 = -1;
                    i10 = -1;
                    f = 1.0f;
                }
                return new a(arrayList, q10, i6, i10, f, str);
            }
            throw new IllegalStateException();
        } catch (ArrayIndexOutOfBoundsException e10) {
            throw ParserException.a("Error parsing AVC config", e10);
        }
    }
}
