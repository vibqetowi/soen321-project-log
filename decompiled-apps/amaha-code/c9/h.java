package c9;

import android.util.SparseBooleanArray;
/* compiled from: FlagSet.java */
/* loaded from: classes.dex */
public final class h {

    /* renamed from: a  reason: collision with root package name */
    public final SparseBooleanArray f5138a;

    /* compiled from: FlagSet.java */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final SparseBooleanArray f5139a = new SparseBooleanArray();

        /* renamed from: b  reason: collision with root package name */
        public boolean f5140b;

        public final void a(int i6) {
            sc.b.C(!this.f5140b);
            this.f5139a.append(i6, true);
        }

        public final h b() {
            sc.b.C(!this.f5140b);
            this.f5140b = true;
            return new h(this.f5139a);
        }
    }

    public h(SparseBooleanArray sparseBooleanArray) {
        this.f5138a = sparseBooleanArray;
    }

    public final int a(int i6) {
        sc.b.v(i6, b());
        return this.f5138a.keyAt(i6);
    }

    public final int b() {
        return this.f5138a.size();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        if (w.f5205a < 24) {
            if (b() != hVar.b()) {
                return false;
            }
            for (int i6 = 0; i6 < b(); i6++) {
                if (a(i6) != hVar.a(i6)) {
                    return false;
                }
            }
            return true;
        }
        return this.f5138a.equals(hVar.f5138a);
    }

    public final int hashCode() {
        if (w.f5205a < 24) {
            int b10 = b();
            for (int i6 = 0; i6 < b(); i6++) {
                b10 = (b10 * 31) + a(i6);
            }
            return b10;
        }
        return this.f5138a.hashCode();
    }
}
