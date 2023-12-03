package androidx.mediarouter.app;

import android.content.Context;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import java.lang.ref.WeakReference;
import r1.l;
import t0.b;
/* loaded from: classes.dex */
public class MediaRouteActionProvider extends t0.b {

    /* renamed from: c  reason: collision with root package name */
    public final r1.l f2491c;

    /* renamed from: d  reason: collision with root package name */
    public final r1.k f2492d;

    /* renamed from: e  reason: collision with root package name */
    public final l f2493e;
    public androidx.mediarouter.app.a f;

    /* loaded from: classes.dex */
    public static final class a extends l.a {

        /* renamed from: a  reason: collision with root package name */
        public final WeakReference<MediaRouteActionProvider> f2494a;

        public a(MediaRouteActionProvider mediaRouteActionProvider) {
            this.f2494a = new WeakReference<>(mediaRouteActionProvider);
        }

        @Override // r1.l.a
        public final void a(r1.l lVar) {
            k(lVar);
        }

        @Override // r1.l.a
        public final void b(r1.l lVar) {
            k(lVar);
        }

        @Override // r1.l.a
        public final void c(r1.l lVar) {
            k(lVar);
        }

        @Override // r1.l.a
        public final void d(r1.l lVar, l.g gVar) {
            k(lVar);
        }

        @Override // r1.l.a
        public final void e(r1.l lVar, l.g gVar) {
            k(lVar);
        }

        @Override // r1.l.a
        public final void f(r1.l lVar, l.g gVar) {
            k(lVar);
        }

        public final void k(r1.l lVar) {
            MediaRouteActionProvider mediaRouteActionProvider = this.f2494a.get();
            if (mediaRouteActionProvider != null) {
                b.a aVar = mediaRouteActionProvider.f32273b;
                if (aVar != null) {
                    mediaRouteActionProvider.b();
                    androidx.appcompat.view.menu.f fVar = androidx.appcompat.view.menu.h.this.f1130n;
                    fVar.f1099h = true;
                    fVar.p(true);
                    return;
                }
                return;
            }
            lVar.g(this);
        }
    }

    public MediaRouteActionProvider(Context context) {
        super(context);
        this.f2492d = r1.k.f30286c;
        this.f2493e = l.f2601a;
        this.f2491c = r1.l.c(context);
        new a(this);
    }

    @Override // t0.b
    public final boolean b() {
        this.f2491c.getClass();
        return r1.l.f(this.f2492d, 1);
    }

    @Override // t0.b
    public final View c() {
        if (this.f != null) {
            Log.e("MRActionProvider", "onCreateActionView: this ActionProvider is already associated with a menu item. Don't reuse MediaRouteActionProvider instances! Abandoning the old menu item...");
        }
        androidx.mediarouter.app.a aVar = new androidx.mediarouter.app.a(this.f32272a);
        this.f = aVar;
        aVar.setCheatSheetEnabled(true);
        this.f.setRouteSelector(this.f2492d);
        this.f.setAlwaysVisible(false);
        this.f.setDialogFactory(this.f2493e);
        this.f.setLayoutParams(new ViewGroup.LayoutParams(-2, -1));
        return this.f;
    }

    @Override // t0.b
    public final boolean e() {
        androidx.mediarouter.app.a aVar = this.f;
        if (aVar != null) {
            return aVar.d();
        }
        return false;
    }
}
