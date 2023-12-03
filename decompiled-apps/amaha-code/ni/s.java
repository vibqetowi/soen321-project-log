package ni;

import android.widget.ImageView;
import com.bumptech.glide.Glide;
import com.bumptech.glide.load.resource.gif.GifDrawable;
import java.io.File;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class s implements Runnable {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ int f26352u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ x f26353v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ File f26354w;

    /* renamed from: x  reason: collision with root package name */
    public final /* synthetic */ ImageView f26355x;

    public /* synthetic */ s(x xVar, File file, ImageView imageView, int i6) {
        this.f26352u = i6;
        this.f26353v = xVar;
        this.f26354w = file;
        this.f26355x = imageView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i6 = this.f26352u;
        x xVar = this.f26353v;
        ImageView imageView = this.f26355x;
        File file = this.f26354w;
        switch (i6) {
            case 0:
                xVar.getClass();
                try {
                    com.bumptech.glide.f g5 = Glide.g(xVar.f26364d);
                    g5.getClass();
                    com.bumptech.glide.e x10 = new com.bumptech.glide.e(g5.f5956u, g5, GifDrawable.class, g5.f5957v).x(com.bumptech.glide.f.G);
                    x10.Z = file;
                    x10.f5953b0 = true;
                    ((com.bumptech.glide.e) x10.u(r4.h.f30398c, new r4.f())).B(imageView);
                    return;
                } catch (Exception e10) {
                    xVar.f26372m.f20105d.a(1, e10, new r(3));
                    return;
                }
            default:
                xVar.getClass();
                try {
                    com.bumptech.glide.f g10 = Glide.g(xVar.f26364d);
                    g10.getClass();
                    com.bumptech.glide.e x11 = new com.bumptech.glide.e(g10.f5956u, g10, GifDrawable.class, g10.f5957v).x(com.bumptech.glide.f.G);
                    x11.Z = file;
                    x11.f5953b0 = true;
                    x11.B(imageView);
                    return;
                } catch (Exception e11) {
                    xVar.f26372m.f20105d.a(1, e11, new r(6));
                    return;
                }
        }
    }
}
