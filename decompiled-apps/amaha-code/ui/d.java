package ui;
/* compiled from: ImageStyle.java */
/* loaded from: classes.dex */
public final class d extends e {
    public final pi.b f;

    /* renamed from: g  reason: collision with root package name */
    public final double f34170g;

    /* renamed from: h  reason: collision with root package name */
    public final double f34171h;

    public d(e eVar, pi.b bVar, double d10, double d11) {
        super(eVar);
        this.f = bVar;
        this.f34170g = d10;
        this.f34171h = d11;
    }

    @Override // ui.e
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ImageStyle{border=");
        sb2.append(this.f);
        sb2.append(", realHeight=");
        sb2.append(this.f34170g);
        sb2.append(", realWidth=");
        sb2.append(this.f34171h);
        sb2.append(", height=");
        sb2.append(this.f34172a);
        sb2.append(", width=");
        sb2.append(this.f34173b);
        sb2.append(", margin=");
        sb2.append(this.f34174c);
        sb2.append(", padding=");
        sb2.append(this.f34175d);
        sb2.append(", display=");
        return defpackage.c.t(sb2, this.f34176e, '}');
    }
}
