package l4;

import java.util.ArrayDeque;
/* compiled from: BaseKeyPool.java */
/* loaded from: classes.dex */
public abstract class c {

    /* renamed from: a  reason: collision with root package name */
    public final ArrayDeque f24012a;

    public c() {
        char[] cArr = d5.j.f12201a;
        this.f24012a = new ArrayDeque(20);
    }

    public abstract k a();

    public final k b() {
        k kVar = (k) this.f24012a.poll();
        if (kVar == null) {
            return a();
        }
        return kVar;
    }

    public final void c(k kVar) {
        ArrayDeque arrayDeque = this.f24012a;
        if (arrayDeque.size() < 20) {
            arrayDeque.offer(kVar);
        }
    }
}
