package iu;

import gt.v0;
import kotlin.jvm.internal.b0;
import wu.x0;
import xu.c;
/* compiled from: DescriptorEquivalenceForOverrides.kt */
/* loaded from: classes2.dex */
public final class d implements c.a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ boolean f20682a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ gt.a f20683b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ gt.a f20684c;

    /* compiled from: DescriptorEquivalenceForOverrides.kt */
    /* loaded from: classes2.dex */
    public static final class a extends kotlin.jvm.internal.k implements ss.p<gt.j, gt.j, Boolean> {

        /* renamed from: u  reason: collision with root package name */
        public final /* synthetic */ gt.a f20685u;

        /* renamed from: v  reason: collision with root package name */
        public final /* synthetic */ gt.a f20686v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(gt.a aVar, gt.a aVar2) {
            super(2);
            this.f20685u = aVar;
            this.f20686v = aVar2;
        }

        @Override // ss.p
        public final Boolean invoke(gt.j jVar, gt.j jVar2) {
            boolean z10;
            gt.j jVar3 = jVar2;
            if (kotlin.jvm.internal.i.b(jVar, this.f20685u) && kotlin.jvm.internal.i.b(jVar3, this.f20686v)) {
                z10 = true;
            } else {
                z10 = false;
            }
            return Boolean.valueOf(z10);
        }
    }

    public d(gt.a aVar, gt.a aVar2, boolean z10) {
        this.f20682a = z10;
        this.f20683b = aVar;
        this.f20684c = aVar2;
    }

    @Override // xu.c.a
    public final boolean a(x0 c12, x0 c22) {
        kotlin.jvm.internal.i.g(c12, "c1");
        kotlin.jvm.internal.i.g(c22, "c2");
        if (kotlin.jvm.internal.i.b(c12, c22)) {
            return true;
        }
        gt.g a10 = c12.a();
        gt.g a11 = c22.a();
        if ((a10 instanceof v0) && (a11 instanceof v0)) {
            return b0.J.g((v0) a10, (v0) a11, this.f20682a, new a(this.f20683b, this.f20684c));
        }
        return false;
    }
}
