package ql;

import android.graphics.Bitmap;
import android.net.Uri;
import com.theinnerhour.b2b.utils.LogHelper;
/* compiled from: NewDynamicActivityViewModel.kt */
/* loaded from: classes2.dex */
public final class b0 extends kotlin.jvm.internal.k implements ss.l<Uri, hs.k> {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ ls.d<hs.f<String, String>> f29682u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ hs.f<String, Bitmap> f29683v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ t f29684w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public b0(ls.d<? super hs.f<String, String>> dVar, hs.f<String, Bitmap> fVar, t tVar) {
        super(1);
        this.f29682u = dVar;
        this.f29683v = fVar;
        this.f29684w = tVar;
    }

    @Override // ss.l
    public final hs.k invoke(Uri uri) {
        Uri uri2 = uri;
        ls.d<hs.f<String, String>> dVar = this.f29682u;
        try {
            String uri3 = uri2.toString();
            kotlin.jvm.internal.i.f(uri3, "tt.toString()");
            dVar.resumeWith(new hs.f(this.f29683v.f19464u, uri3));
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f29684w.f29789y, e10);
            dVar.resumeWith(null);
        }
        return hs.k.f19476a;
    }
}
