package w8;

import android.text.Layout;
/* compiled from: TtmlStyle.java */
/* loaded from: classes.dex */
public final class f {

    /* renamed from: a  reason: collision with root package name */
    public String f36633a;

    /* renamed from: b  reason: collision with root package name */
    public int f36634b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f36635c;

    /* renamed from: d  reason: collision with root package name */
    public int f36636d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f36637e;

    /* renamed from: k  reason: collision with root package name */
    public float f36642k;

    /* renamed from: l  reason: collision with root package name */
    public String f36643l;

    /* renamed from: o  reason: collision with root package name */
    public Layout.Alignment f36646o;

    /* renamed from: p  reason: collision with root package name */
    public Layout.Alignment f36647p;
    public b r;
    public int f = -1;

    /* renamed from: g  reason: collision with root package name */
    public int f36638g = -1;

    /* renamed from: h  reason: collision with root package name */
    public int f36639h = -1;

    /* renamed from: i  reason: collision with root package name */
    public int f36640i = -1;

    /* renamed from: j  reason: collision with root package name */
    public int f36641j = -1;

    /* renamed from: m  reason: collision with root package name */
    public int f36644m = -1;

    /* renamed from: n  reason: collision with root package name */
    public int f36645n = -1;

    /* renamed from: q  reason: collision with root package name */
    public int f36648q = -1;

    /* renamed from: s  reason: collision with root package name */
    public float f36649s = Float.MAX_VALUE;

    public final void a(f fVar) {
        int i6;
        Layout.Alignment alignment;
        Layout.Alignment alignment2;
        String str;
        if (fVar != null) {
            if (!this.f36635c && fVar.f36635c) {
                this.f36634b = fVar.f36634b;
                this.f36635c = true;
            }
            if (this.f36639h == -1) {
                this.f36639h = fVar.f36639h;
            }
            if (this.f36640i == -1) {
                this.f36640i = fVar.f36640i;
            }
            if (this.f36633a == null && (str = fVar.f36633a) != null) {
                this.f36633a = str;
            }
            if (this.f == -1) {
                this.f = fVar.f;
            }
            if (this.f36638g == -1) {
                this.f36638g = fVar.f36638g;
            }
            if (this.f36645n == -1) {
                this.f36645n = fVar.f36645n;
            }
            if (this.f36646o == null && (alignment2 = fVar.f36646o) != null) {
                this.f36646o = alignment2;
            }
            if (this.f36647p == null && (alignment = fVar.f36647p) != null) {
                this.f36647p = alignment;
            }
            if (this.f36648q == -1) {
                this.f36648q = fVar.f36648q;
            }
            if (this.f36641j == -1) {
                this.f36641j = fVar.f36641j;
                this.f36642k = fVar.f36642k;
            }
            if (this.r == null) {
                this.r = fVar.r;
            }
            if (this.f36649s == Float.MAX_VALUE) {
                this.f36649s = fVar.f36649s;
            }
            if (!this.f36637e && fVar.f36637e) {
                this.f36636d = fVar.f36636d;
                this.f36637e = true;
            }
            if (this.f36644m == -1 && (i6 = fVar.f36644m) != -1) {
                this.f36644m = i6;
            }
        }
    }
}
