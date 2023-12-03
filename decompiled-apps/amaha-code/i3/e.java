package i3;

import java.util.List;
import java.util.Locale;
/* compiled from: Layer.java */
/* loaded from: classes.dex */
public final class e {

    /* renamed from: a  reason: collision with root package name */
    public final List<h3.b> f19771a;

    /* renamed from: b  reason: collision with root package name */
    public final a3.c f19772b;

    /* renamed from: c  reason: collision with root package name */
    public final String f19773c;

    /* renamed from: d  reason: collision with root package name */
    public final long f19774d;

    /* renamed from: e  reason: collision with root package name */
    public final int f19775e;
    public final long f;

    /* renamed from: g  reason: collision with root package name */
    public final String f19776g;

    /* renamed from: h  reason: collision with root package name */
    public final List<h3.f> f19777h;

    /* renamed from: i  reason: collision with root package name */
    public final g3.d f19778i;

    /* renamed from: j  reason: collision with root package name */
    public final int f19779j;

    /* renamed from: k  reason: collision with root package name */
    public final int f19780k;

    /* renamed from: l  reason: collision with root package name */
    public final int f19781l;

    /* renamed from: m  reason: collision with root package name */
    public final float f19782m;

    /* renamed from: n  reason: collision with root package name */
    public final float f19783n;

    /* renamed from: o  reason: collision with root package name */
    public final int f19784o;

    /* renamed from: p  reason: collision with root package name */
    public final int f19785p;

    /* renamed from: q  reason: collision with root package name */
    public final g3.a f19786q;
    public final v.c r;

    /* renamed from: s  reason: collision with root package name */
    public final g3.b f19787s;

    /* renamed from: t  reason: collision with root package name */
    public final List<n3.a<Float>> f19788t;

    /* renamed from: u  reason: collision with root package name */
    public final int f19789u;

    /* renamed from: v  reason: collision with root package name */
    public final boolean f19790v;

    /* JADX WARN: Incorrect types in method signature: (Ljava/util/List<Lh3/b;>;La3/c;Ljava/lang/String;JLjava/lang/Object;JLjava/lang/String;Ljava/util/List<Lh3/f;>;Lg3/d;IIIFFIILg3/a;Lv/c;Ljava/util/List<Ln3/a<Ljava/lang/Float;>;>;Ljava/lang/Object;Lg3/b;Z)V */
    public e(List list, a3.c cVar, String str, long j10, int i6, long j11, String str2, List list2, g3.d dVar, int i10, int i11, int i12, float f, float f2, int i13, int i14, g3.a aVar, v.c cVar2, List list3, int i15, g3.b bVar, boolean z10) {
        this.f19771a = list;
        this.f19772b = cVar;
        this.f19773c = str;
        this.f19774d = j10;
        this.f19775e = i6;
        this.f = j11;
        this.f19776g = str2;
        this.f19777h = list2;
        this.f19778i = dVar;
        this.f19779j = i10;
        this.f19780k = i11;
        this.f19781l = i12;
        this.f19782m = f;
        this.f19783n = f2;
        this.f19784o = i13;
        this.f19785p = i14;
        this.f19786q = aVar;
        this.r = cVar2;
        this.f19788t = list3;
        this.f19789u = i15;
        this.f19787s = bVar;
        this.f19790v = z10;
    }

    public final String a(String str) {
        int i6;
        StringBuilder c10 = v.h.c(str);
        c10.append(this.f19773c);
        c10.append("\n");
        a3.c cVar = this.f19772b;
        e eVar = (e) cVar.f182h.e(this.f, null);
        if (eVar != null) {
            c10.append("\t\tParents: ");
            c10.append(eVar.f19773c);
            for (e eVar2 = (e) cVar.f182h.e(eVar.f, null); eVar2 != null; eVar2 = (e) cVar.f182h.e(eVar2.f, null)) {
                c10.append("->");
                c10.append(eVar2.f19773c);
            }
            c10.append(str);
            c10.append("\n");
        }
        List<h3.f> list = this.f19777h;
        if (!list.isEmpty()) {
            c10.append(str);
            c10.append("\tMasks: ");
            c10.append(list.size());
            c10.append("\n");
        }
        int i10 = this.f19779j;
        if (i10 != 0 && (i6 = this.f19780k) != 0) {
            c10.append(str);
            c10.append("\tBackground: ");
            c10.append(String.format(Locale.US, "%dx%d %X\n", Integer.valueOf(i10), Integer.valueOf(i6), Integer.valueOf(this.f19781l)));
        }
        List<h3.b> list2 = this.f19771a;
        if (!list2.isEmpty()) {
            c10.append(str);
            c10.append("\tShapes:\n");
            for (h3.b bVar : list2) {
                c10.append(str);
                c10.append("\t\t");
                c10.append(bVar);
                c10.append("\n");
            }
        }
        return c10.toString();
    }

    public final String toString() {
        return a("");
    }
}
