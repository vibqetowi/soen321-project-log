package u7;

import java.util.Arrays;
import u7.o;
/* compiled from: FlacMetadataReader.java */
/* loaded from: classes.dex */
public final class m {
    public static o.a a(c9.q qVar) {
        qVar.B(1);
        int s10 = qVar.s();
        long j10 = qVar.f5187b + s10;
        int i6 = s10 / 18;
        long[] jArr = new long[i6];
        long[] jArr2 = new long[i6];
        int i10 = 0;
        while (true) {
            if (i10 >= i6) {
                break;
            }
            long j11 = qVar.j();
            if (j11 == -1) {
                jArr = Arrays.copyOf(jArr, i10);
                jArr2 = Arrays.copyOf(jArr2, i10);
                break;
            }
            jArr[i10] = j11;
            jArr2[i10] = qVar.j();
            qVar.B(2);
            i10++;
        }
        qVar.B((int) (j10 - qVar.f5187b));
        return new o.a(jArr, jArr2);
    }
}
