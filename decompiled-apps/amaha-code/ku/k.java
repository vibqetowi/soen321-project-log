package ku;

import gt.a0;
import wu.b0;
/* compiled from: constantValues.kt */
/* loaded from: classes2.dex */
public abstract class k extends g<hs.k> {

    /* compiled from: constantValues.kt */
    /* loaded from: classes2.dex */
    public static final class a extends k {

        /* renamed from: b  reason: collision with root package name */
        public final String f23946b;

        public a(String str) {
            this.f23946b = str;
        }

        @Override // ku.g
        public final b0 a(a0 module) {
            kotlin.jvm.internal.i.g(module, "module");
            return yu.i.c(yu.h.N, this.f23946b);
        }

        @Override // ku.g
        public final String toString() {
            return this.f23946b;
        }
    }

    public k() {
        super(hs.k.f19476a);
    }

    @Override // ku.g
    public final hs.k b() {
        throw new UnsupportedOperationException();
    }
}
