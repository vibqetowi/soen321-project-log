package ql;

import android.graphics.Bitmap;
import android.view.View;
import java.util.Locale;
import t0.l0;
/* compiled from: NewDynamicActivityViewModel.kt */
@ns.e(c = "com.theinnerhour.b2b.components.dynamicActivities.utils.NewDynamicActivityViewModel$compressBitmap$job$1", f = "NewDynamicActivityViewModel.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class u extends ns.i implements ss.p<kotlinx.coroutines.d0, ls.d<? super hs.f<? extends String, ? extends Bitmap>>, Object> {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ View f29821u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ pl.c0 f29822v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ t f29823w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(View view, pl.c0 c0Var, t tVar, ls.d<? super u> dVar) {
        super(2, dVar);
        this.f29821u = view;
        this.f29822v = c0Var;
        this.f29823w = tVar;
    }

    @Override // ns.a
    public final ls.d<hs.k> create(Object obj, ls.d<?> dVar) {
        return new u(this.f29821u, this.f29822v, this.f29823w, dVar);
    }

    @Override // ss.p
    public final Object invoke(kotlinx.coroutines.d0 d0Var, ls.d<? super hs.f<? extends String, ? extends Bitmap>> dVar) {
        return ((u) create(d0Var, dVar)).invokeSuspend(hs.k.f19476a);
    }

    @Override // ns.a
    public final Object invokeSuspend(Object obj) {
        sp.b.d0(obj);
        Bitmap h10 = l0.h(this.f29821u);
        String str = this.f29822v.f28555b;
        if (str != null) {
            Locale locale = Locale.ENGLISH;
            String e10 = ri.e.e(locale, "ENGLISH", str, locale, "this as java.lang.String).toLowerCase(locale)");
            this.f29823w.getClass();
            Bitmap createScaledBitmap = Bitmap.createScaledBitmap(h10, 640, 640, true);
            kotlin.jvm.internal.i.f(createScaledBitmap, "createScaledBitmap(image, 640, 640, true)");
            return new hs.f(e10, createScaledBitmap);
        }
        return null;
    }
}
