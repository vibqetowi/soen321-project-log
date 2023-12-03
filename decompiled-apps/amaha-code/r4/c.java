package r4;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
/* compiled from: BitmapResource.java */
/* loaded from: classes.dex */
public final class c implements k4.v, k4.r {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ int f30389u = 1;

    /* renamed from: v  reason: collision with root package name */
    public final Object f30390v;

    /* renamed from: w  reason: collision with root package name */
    public final Object f30391w;

    public c(Bitmap bitmap, l4.d dVar) {
        if (bitmap != null) {
            this.f30390v = bitmap;
            if (dVar != null) {
                this.f30391w = dVar;
                return;
            }
            throw new NullPointerException("BitmapPool must not be null");
        }
        throw new NullPointerException("Bitmap must not be null");
    }

    public static c c(Bitmap bitmap, l4.d dVar) {
        if (bitmap == null) {
            return null;
        }
        return new c(bitmap, dVar);
    }

    @Override // k4.v
    public final int a() {
        switch (this.f30389u) {
            case 0:
                return d5.j.c((Bitmap) this.f30390v);
            default:
                return ((k4.v) this.f30391w).a();
        }
    }

    @Override // k4.v
    public final Class b() {
        switch (this.f30389u) {
            case 0:
                return Bitmap.class;
            default:
                return BitmapDrawable.class;
        }
    }

    @Override // k4.v
    public final Object get() {
        int i6 = this.f30389u;
        Object obj = this.f30390v;
        switch (i6) {
            case 0:
                return (Bitmap) obj;
            default:
                return new BitmapDrawable((Resources) obj, (Bitmap) ((k4.v) this.f30391w).get());
        }
    }

    @Override // k4.r
    public final void initialize() {
        switch (this.f30389u) {
            case 0:
                ((Bitmap) this.f30390v).prepareToDraw();
                return;
            default:
                k4.v vVar = (k4.v) this.f30391w;
                if (vVar instanceof k4.r) {
                    ((k4.r) vVar).initialize();
                    return;
                }
                return;
        }
    }

    @Override // k4.v
    public final void recycle() {
        int i6 = this.f30389u;
        Object obj = this.f30391w;
        switch (i6) {
            case 0:
                ((l4.d) obj).d((Bitmap) this.f30390v);
                return;
            default:
                ((k4.v) obj).recycle();
                return;
        }
    }

    public c(Resources resources, k4.v vVar) {
        kc.f.p(resources);
        this.f30390v = resources;
        kc.f.p(vVar);
        this.f30391w = vVar;
    }
}
