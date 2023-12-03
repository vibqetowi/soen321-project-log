package ql;

import android.graphics.Bitmap;
import android.net.Uri;
import com.bumptech.glide.Glide;
/* compiled from: AudioNotificationManager.kt */
@ns.e(c = "com.theinnerhour.b2b.components.dynamicActivities.utils.AudioNotificationManager$DescriptionAdapter$resolveUriAsBitmap$2", f = "AudioNotificationManager.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class f extends ns.i implements ss.p<kotlinx.coroutines.d0, ls.d<? super Bitmap>, Object> {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ d f29710u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ Uri f29711v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(d dVar, Uri uri, ls.d<? super f> dVar2) {
        super(2, dVar2);
        this.f29710u = dVar;
        this.f29711v = uri;
    }

    @Override // ns.a
    public final ls.d<hs.k> create(Object obj, ls.d<?> dVar) {
        return new f(this.f29710u, this.f29711v, dVar);
    }

    @Override // ss.p
    public final Object invoke(kotlinx.coroutines.d0 d0Var, ls.d<? super Bitmap> dVar) {
        return ((f) create(d0Var, dVar)).invokeSuspend(hs.k.f19476a);
    }

    @Override // ns.a
    public final Object invokeSuspend(Object obj) {
        sp.b.d0(obj);
        com.bumptech.glide.f g5 = Glide.g(this.f29710u.f29687a);
        z4.f fVar = g.f29715a;
        synchronized (g5) {
            g5.u(fVar);
        }
        com.bumptech.glide.e<Bitmap> a10 = g5.a();
        a10.Z = this.f29711v;
        a10.f5953b0 = true;
        z4.d dVar = new z4.d(144, 144);
        a10.A(dVar, dVar, a10, d5.e.f12190b);
        return dVar.get();
    }
}
