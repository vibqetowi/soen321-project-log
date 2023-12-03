package wr;

import com.google.common.io.BaseEncoding;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.logging.Logger;
import vr.k3;
/* compiled from: Utils.java */
/* loaded from: classes2.dex */
public final class p {
    static {
        Logger.getLogger(p.class.getName());
    }

    public static byte[][] a(ArrayList arrayList) {
        int size = arrayList.size() * 2;
        byte[][] bArr = new byte[size];
        Iterator it = arrayList.iterator();
        int i6 = 0;
        while (it.hasNext()) {
            yr.d dVar = (yr.d) it.next();
            int i10 = i6 + 1;
            bArr[i6] = dVar.f38928a.t();
            i6 = i10 + 1;
            bArr[i10] = dVar.f38929b.t();
        }
        Logger logger = k3.f35747a;
        int i11 = 0;
        while (i11 < size) {
            byte[] bArr2 = bArr[i11];
            int i12 = i11 + 1;
            byte[] bArr3 = bArr[i12];
            byte[] bArr4 = k3.f35748b;
            if (k3.a(bArr2, bArr4)) {
                for (byte b10 : bArr3) {
                    if (b10 == 44) {
                        ArrayList arrayList2 = new ArrayList(size + 10);
                        for (int i13 = 0; i13 < i11; i13++) {
                            arrayList2.add(bArr[i13]);
                        }
                        while (i11 < size) {
                            byte[] bArr5 = bArr[i11];
                            byte[] bArr6 = bArr[i11 + 1];
                            if (!k3.a(bArr5, bArr4)) {
                                arrayList2.add(bArr5);
                                arrayList2.add(bArr6);
                            } else {
                                int i14 = 0;
                                for (int i15 = 0; i15 <= bArr6.length; i15++) {
                                    if (i15 == bArr6.length || bArr6[i15] == 44) {
                                        byte[] a10 = BaseEncoding.f9523a.a(new String(bArr6, i14, i15 - i14, nc.c.f25986a));
                                        arrayList2.add(bArr5);
                                        arrayList2.add(a10);
                                        i14 = i15 + 1;
                                    }
                                }
                            }
                            i11 += 2;
                        }
                        return (byte[][]) arrayList2.toArray(new byte[0]);
                    }
                }
                bArr[i12] = BaseEncoding.f9523a.a(new String(bArr3, nc.c.f25986a));
            }
            i11 += 2;
        }
        return bArr;
    }
}
