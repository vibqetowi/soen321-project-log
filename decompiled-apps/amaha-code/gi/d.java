package gi;
/* compiled from: MOEString.java */
/* loaded from: classes.dex */
public class d implements Comparable<d>, a {

    /* renamed from: u  reason: collision with root package name */
    public final Object f16516u;

    /* renamed from: v  reason: collision with root package name */
    public final boolean f16517v;

    public d(Object obj, boolean z10) {
        this.f16516u = obj;
        this.f16517v = z10;
    }

    @Override // java.lang.Comparable
    public final int compareTo(d dVar) {
        return d().compareTo(dVar.d());
    }

    public final String d() {
        Object obj = this.f16516u;
        if (obj == null) {
            return null;
        }
        boolean z10 = this.f16517v;
        String obj2 = obj.toString();
        if (!z10) {
            return obj2.toLowerCase();
        }
        return obj2;
    }

    @Override // gi.a
    public final Object getValue() {
        return d();
    }
}
