package i8;

import androidx.work.k;
import c9.q;
import g8.d;
import java.nio.ByteBuffer;
import java.util.Arrays;
/* compiled from: EventMessageDecoder.java */
/* loaded from: classes.dex */
public final class b extends k {
    @Override // androidx.work.k
    public final g8.a k(d dVar, ByteBuffer byteBuffer) {
        q qVar = new q(byteBuffer.array(), byteBuffer.limit());
        String k10 = qVar.k();
        k10.getClass();
        String k11 = qVar.k();
        k11.getClass();
        return new g8.a(new a(k10, k11, qVar.j(), qVar.j(), Arrays.copyOfRange(qVar.f5186a, qVar.f5187b, qVar.f5188c)));
    }
}
