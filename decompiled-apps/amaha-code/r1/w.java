package r1;

import android.media.MediaRouter;
import r1.v;
/* compiled from: MediaRouterJellybeanMr1.java */
/* loaded from: classes.dex */
public final class w<T extends v> extends s<T> {
    public w(T t3) {
        super(t3);
    }

    @Override // android.media.MediaRouter.Callback
    public final void onRoutePresentationDisplayChanged(MediaRouter mediaRouter, MediaRouter.RouteInfo routeInfo) {
        ((v) this.f30367a).f(routeInfo);
    }
}
