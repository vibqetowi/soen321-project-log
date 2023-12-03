package he;
/* compiled from: TargetIdGenerator.java */
/* loaded from: classes.dex */
public final class e0 {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f17479a;

    /* renamed from: b  reason: collision with root package name */
    public int f17480b;

    /* renamed from: c  reason: collision with root package name */
    public int f17481c;

    public e0(int i6, int i10, int i11) {
        boolean z10;
        this.f17479a = i11;
        if (i11 != 1) {
            if ((i6 & 1) == i6) {
                z10 = true;
            } else {
                z10 = false;
            }
            ca.a.u0(z10, "Generator ID %d contains more than %d reserved bits", Integer.valueOf(i6), 1);
            this.f17481c = i6;
            ca.a.u0((i10 & 1) == i6, "Cannot supply target ID from different generator ID", new Object[0]);
            this.f17480b = i10;
            return;
        }
        this.f17480b = i6;
        this.f17481c = i10;
    }

    public final String toString() {
        switch (this.f17479a) {
            case 1:
                StringBuilder sb2 = new StringBuilder("ViewDimension(width=");
                sb2.append(this.f17480b);
                sb2.append(", height=");
                return defpackage.c.s(sb2, this.f17481c, ')');
            default:
                return super.toString();
        }
    }
}
