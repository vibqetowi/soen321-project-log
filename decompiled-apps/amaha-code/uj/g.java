package uj;
/* compiled from: ExpandedBannerTemplate.kt */
/* loaded from: classes.dex */
public final class g extends h {
    public final boolean f;

    public g(h hVar, boolean z10) {
        super(hVar.f34195a, hVar.f34196b, hVar.f34197c, hVar.f34198d, hVar.f34199e);
        this.f = z10;
    }

    @Override // uj.h
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ExpandedBannerTemplate(template=");
        sb2.append(super.toString());
        sb2.append(", isHeaderEnabled=");
        return defpackage.c.t(sb2, this.f, ')');
    }
}
