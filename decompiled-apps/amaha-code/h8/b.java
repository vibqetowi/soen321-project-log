package h8;

import androidx.work.k;
import g8.d;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import nc.c;
import u7.x;
/* compiled from: AppInfoTableDecoder.java */
/* loaded from: classes.dex */
public final class b extends k {
    @Override // androidx.work.k
    public final g8.a k(d dVar, ByteBuffer byteBuffer) {
        String str;
        if (byteBuffer.get() != 116) {
            return null;
        }
        x xVar = new x(byteBuffer.array(), byteBuffer.limit());
        xVar.r(12);
        int f = (xVar.f() + xVar.i(12)) - 4;
        xVar.r(44);
        xVar.s(xVar.i(12));
        xVar.r(16);
        ArrayList arrayList = new ArrayList();
        while (xVar.f() < f) {
            xVar.r(48);
            int i6 = xVar.i(8);
            xVar.r(4);
            int f2 = xVar.f() + xVar.i(12);
            String str2 = null;
            String str3 = null;
            while (xVar.f() < f2) {
                int i10 = xVar.i(8);
                int i11 = xVar.i(8);
                int f10 = xVar.f() + i11;
                if (i10 == 2) {
                    int i12 = xVar.i(16);
                    xVar.r(8);
                    if (i12 != 3) {
                    }
                    while (xVar.f() < f10) {
                        int i13 = xVar.i(8);
                        Charset charset = c.f25986a;
                        byte[] bArr = new byte[i13];
                        xVar.k(bArr, i13);
                        str2 = new String(bArr, charset);
                        int i14 = xVar.i(8);
                        for (int i15 = 0; i15 < i14; i15++) {
                            xVar.s(xVar.i(8));
                        }
                    }
                } else if (i10 == 21) {
                    Charset charset2 = c.f25986a;
                    byte[] bArr2 = new byte[i11];
                    xVar.k(bArr2, i11);
                    str3 = new String(bArr2, charset2);
                }
                xVar.o(f10 * 8);
            }
            xVar.o(f2 * 8);
            if (str2 != null && str3 != null) {
                if (str3.length() != 0) {
                    str = str2.concat(str3);
                } else {
                    str = new String(str2);
                }
                arrayList.add(new a(i6, str));
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new g8.a(arrayList);
    }
}
