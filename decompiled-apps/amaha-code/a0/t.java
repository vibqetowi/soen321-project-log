package a0;

import android.view.animation.Interpolator;
/* compiled from: ViewTransition.java */
/* loaded from: classes.dex */
public final class t implements Interpolator {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ w.c f127a;

    public t(w.c cVar) {
        this.f127a = cVar;
    }

    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f) {
        return (float) this.f127a.a(f);
    }
}
