package androidx.mediarouter.app;

import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.Transformation;
/* compiled from: MediaRouteDynamicControllerDialog.java */
/* loaded from: classes.dex */
public final class q extends Animation {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ int f2666u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ int f2667v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ View f2668w;

    public q(int i6, int i10, View view) {
        this.f2666u = i6;
        this.f2667v = i10;
        this.f2668w = view;
    }

    @Override // android.view.animation.Animation
    public final void applyTransformation(float f, Transformation transformation) {
        int i6 = this.f2666u;
        int i10 = this.f2667v;
        int i11 = i10 + ((int) ((i6 - i10) * f));
        boolean z10 = p.f2621l0;
        View view = this.f2668w;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        layoutParams.height = i11;
        view.setLayoutParams(layoutParams);
    }
}
