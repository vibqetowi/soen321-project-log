package e4;

import com.android.volley.VolleyError;
/* compiled from: DefaultRetryPolicy.java */
/* loaded from: classes.dex */
public final class d implements n {

    /* renamed from: a  reason: collision with root package name */
    public int f13753a;

    /* renamed from: b  reason: collision with root package name */
    public int f13754b;

    /* renamed from: c  reason: collision with root package name */
    public final int f13755c;

    public d(int i6, int i10) {
        this.f13753a = i6;
        this.f13755c = i10;
    }

    @Override // e4.n
    public final void a(VolleyError volleyError) {
        boolean z10 = true;
        int i6 = this.f13754b + 1;
        this.f13754b = i6;
        int i10 = this.f13753a;
        this.f13753a = i10 + ((int) (i10 * 1.0f));
        if (i6 > this.f13755c) {
            z10 = false;
        }
        if (z10) {
            return;
        }
        throw volleyError;
    }

    @Override // e4.n
    public final int b() {
        return this.f13753a;
    }

    @Override // e4.n
    public final int c() {
        return this.f13754b;
    }
}
