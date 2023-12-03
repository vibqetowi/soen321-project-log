package mt;

import kotlin.jvm.internal.i;
import nt.w;
import wt.l;
/* compiled from: RuntimeSourceElementFactory.kt */
/* loaded from: classes2.dex */
public final class g implements vt.b {

    /* renamed from: a  reason: collision with root package name */
    public static final g f25744a = new g();

    @Override // vt.b
    public final a a(l javaElement) {
        i.g(javaElement, "javaElement");
        return new a((w) javaElement);
    }

    /* compiled from: RuntimeSourceElementFactory.kt */
    /* loaded from: classes2.dex */
    public static final class a implements vt.a {

        /* renamed from: b  reason: collision with root package name */
        public final w f25745b;

        public a(w javaElement) {
            i.g(javaElement, "javaElement");
            this.f25745b = javaElement;
        }

        @Override // vt.a
        public final w b() {
            return this.f25745b;
        }

        public final String toString() {
            return a.class.getName() + ": " + this.f25745b;
        }

        @Override // gt.q0
        public final void a() {
        }
    }
}
