package d3;

import java.util.Collections;
import s1.s;
/* compiled from: ValueCallbackKeyframeAnimation.java */
/* loaded from: classes.dex */
public final class m<K, A> extends a<K, A> {

    /* renamed from: i  reason: collision with root package name */
    public final A f12177i;

    public m(s sVar, A a10) {
        super(Collections.emptyList());
        j(sVar);
        this.f12177i = a10;
    }

    @Override // d3.a
    public final float c() {
        return 1.0f;
    }

    @Override // d3.a
    public final A f() {
        s sVar = this.f12142e;
        A a10 = this.f12177i;
        return (A) sVar.z(a10, a10);
    }

    @Override // d3.a
    public final A g(n3.a<K> aVar, float f) {
        return f();
    }

    @Override // d3.a
    public final void h() {
        if (this.f12142e != null) {
            super.h();
        }
    }
}
