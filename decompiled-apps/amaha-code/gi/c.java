package gi;
/* compiled from: MOEDouble.java */
/* loaded from: classes.dex */
public class c implements Comparable<c>, a {

    /* renamed from: u  reason: collision with root package name */
    public final Object f16515u;

    public c(Object obj) {
        this.f16515u = obj;
    }

    @Override // java.lang.Comparable
    public final int compareTo(c cVar) {
        return d().compareTo(cVar.getValue());
    }

    public Double d() {
        Object obj = this.f16515u;
        if (obj == null) {
            return null;
        }
        try {
            return Double.valueOf(Double.parseDouble(obj.toString()));
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    @Override // gi.a
    /* renamed from: f */
    public Double getValue() {
        return d();
    }
}
