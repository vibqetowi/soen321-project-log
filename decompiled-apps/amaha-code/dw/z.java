package dw;

import lv.f0;
/* compiled from: Response.java */
/* loaded from: classes2.dex */
public final class z<T> {

    /* renamed from: a  reason: collision with root package name */
    public final lv.d0 f13695a;

    /* renamed from: b  reason: collision with root package name */
    public final T f13696b;

    /* renamed from: c  reason: collision with root package name */
    public final lv.e0 f13697c;

    /* JADX WARN: Multi-variable type inference failed */
    public z(lv.d0 d0Var, Object obj, f0 f0Var) {
        this.f13695a = d0Var;
        this.f13696b = obj;
        this.f13697c = f0Var;
    }

    public final boolean a() {
        int i6 = this.f13695a.f24586x;
        if (200 <= i6 && i6 < 300) {
            return true;
        }
        return false;
    }

    public final String toString() {
        return this.f13695a.toString();
    }
}
