package uj;
/* compiled from: CollapsedBannerTemplate.kt */
/* loaded from: classes.dex */
public final class e extends f {

    /* renamed from: d  reason: collision with root package name */
    public final boolean f34191d;

    public e(f fVar, boolean z10) {
        super(fVar.f34192a, fVar.f34193b, fVar.f34194c);
        this.f34191d = z10;
    }

    @Override // uj.f
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CollapsedBannerTemplate(template=");
        sb2.append(super.toString());
        sb2.append(", isHeaderEnabled=");
        return defpackage.c.t(sb2, this.f34191d, ')');
    }
}
