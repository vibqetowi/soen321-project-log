package t6;

import java.util.ArrayList;
import p6.d;
/* compiled from: PieRadarHighlighter.java */
/* loaded from: classes.dex */
public abstract class f<T extends p6.d> implements d {

    /* renamed from: a  reason: collision with root package name */
    public final T f32426a;

    /* renamed from: b  reason: collision with root package name */
    public final ArrayList f32427b = new ArrayList();

    public f(T t3) {
        this.f32426a = t3;
    }

    @Override // t6.d
    public final c a(float f, float f2) {
        T t3 = this.f32426a;
        if (t3.o(f, f2) > t3.getRadius()) {
            return null;
        }
        float p10 = t3.p(f, f2);
        if (t3 instanceof p6.c) {
            t3.getAnimator().getClass();
            p10 /= 1.0f;
        }
        int q10 = t3.q(p10);
        if (q10 < 0 || q10 >= t3.getData().f().c0()) {
            return null;
        }
        return b(f, f2, q10);
    }

    public abstract c b(float f, float f2, int i6);
}
