package a0;

import android.view.animation.Interpolator;
/* compiled from: MotionController.java */
/* loaded from: classes.dex */
public final class m implements Interpolator {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ w.c f96a;

    public m(w.c cVar) {
        this.f96a = cVar;
    }

    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f) {
        return (float) this.f96a.a(f);
    }
}
