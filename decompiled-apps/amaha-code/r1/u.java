package r1;

import android.media.MediaRouter;
import r1.t;
/* compiled from: MediaRouterJellybean.java */
/* loaded from: classes.dex */
public final class u<T extends t> extends MediaRouter.VolumeCallback {

    /* renamed from: a  reason: collision with root package name */
    public final T f30368a;

    public u(T t3) {
        this.f30368a = t3;
    }

    @Override // android.media.MediaRouter.VolumeCallback
    public final void onVolumeSetRequest(MediaRouter.RouteInfo routeInfo, int i6) {
        this.f30368a.i(i6, routeInfo);
    }

    @Override // android.media.MediaRouter.VolumeCallback
    public final void onVolumeUpdateRequest(MediaRouter.RouteInfo routeInfo, int i6) {
        this.f30368a.c(i6, routeInfo);
    }
}
