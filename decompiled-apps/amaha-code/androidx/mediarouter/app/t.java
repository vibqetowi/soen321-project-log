package androidx.mediarouter.app;

import android.view.View;
/* compiled from: MediaRouteExpandCollapseButton.java */
/* loaded from: classes.dex */
public final class t implements View.OnClickListener {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ MediaRouteExpandCollapseButton f2671u;

    public t(MediaRouteExpandCollapseButton mediaRouteExpandCollapseButton) {
        this.f2671u = mediaRouteExpandCollapseButton;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        MediaRouteExpandCollapseButton mediaRouteExpandCollapseButton = this.f2671u;
        boolean z10 = !mediaRouteExpandCollapseButton.B;
        mediaRouteExpandCollapseButton.B = z10;
        if (z10) {
            mediaRouteExpandCollapseButton.setImageDrawable(mediaRouteExpandCollapseButton.f2495x);
            mediaRouteExpandCollapseButton.f2495x.start();
            mediaRouteExpandCollapseButton.setContentDescription(mediaRouteExpandCollapseButton.A);
        } else {
            mediaRouteExpandCollapseButton.setImageDrawable(mediaRouteExpandCollapseButton.f2496y);
            mediaRouteExpandCollapseButton.f2496y.start();
            mediaRouteExpandCollapseButton.setContentDescription(mediaRouteExpandCollapseButton.f2497z);
        }
        View.OnClickListener onClickListener = mediaRouteExpandCollapseButton.C;
        if (onClickListener != null) {
            onClickListener.onClick(view);
        }
    }
}
