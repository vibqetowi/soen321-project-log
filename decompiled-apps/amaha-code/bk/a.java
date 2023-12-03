package bk;

import ak.b;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.k;
/* compiled from: DotsIndicatorAttacher.kt */
/* loaded from: classes.dex */
public abstract class a<Attachable, Adapter> {

    /* compiled from: DotsIndicatorAttacher.kt */
    /* renamed from: bk.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0083a extends k implements ss.a<hs.k> {

        /* renamed from: u  reason: collision with root package name */
        public final /* synthetic */ ak.b f4329u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0083a(ak.b bVar) {
            super(0);
            this.f4329u = bVar;
        }

        @Override // ss.a
        public final hs.k invoke() {
            ak.b bVar = this.f4329u;
            bVar.post(new ak.a(bVar, 3));
            return hs.k.f19476a;
        }
    }

    public abstract b.a a(Attachable attachable, Adapter adapter);

    public abstract Adapter b(Attachable attachable);

    public abstract void c(Object obj, Object obj2, C0083a c0083a);

    public final void d(ak.b baseDotsIndicator, Attachable attachable) {
        i.g(baseDotsIndicator, "baseDotsIndicator");
        Adapter b10 = b(attachable);
        if (b10 != null) {
            c(attachable, b10, new C0083a(baseDotsIndicator));
            baseDotsIndicator.setPager(a(attachable, b10));
            baseDotsIndicator.d();
            return;
        }
        throw new IllegalStateException("Please set an adapter to the view pager (1 or 2) or the recycler before initializing the dots indicator");
    }
}
