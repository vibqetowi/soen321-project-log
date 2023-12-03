package o4;

import java.util.ArrayDeque;
import o4.m;
/* compiled from: ModelCache.java */
/* loaded from: classes.dex */
public final class l extends d5.g<m.a<Object>, Object> {
    public l() {
        super(500L);
    }

    @Override // d5.g
    public final void c(m.a<Object> aVar, Object obj) {
        m.a<Object> aVar2 = aVar;
        aVar2.getClass();
        ArrayDeque arrayDeque = m.a.f27075d;
        synchronized (arrayDeque) {
            arrayDeque.offer(aVar2);
        }
    }
}
