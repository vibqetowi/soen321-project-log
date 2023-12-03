package androidx.mediarouter.app;

import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.Transformation;
/* compiled from: MediaRouteControllerDialog.java */
/* loaded from: classes.dex */
public final class h extends Animation {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ int f2591u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ int f2592v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ View f2593w;

    public h(int i6, int i10, ViewGroup viewGroup) {
        this.f2591u = i6;
        this.f2592v = i10;
        this.f2593w = viewGroup;
    }

    @Override // android.view.animation.Animation
    public final void applyTransformation(float f, Transformation transformation) {
        int i6 = this.f2592v;
        int i10 = this.f2591u;
        g.k(i10 - ((int) ((i10 - i6) * f)), this.f2593w);
    }
}
