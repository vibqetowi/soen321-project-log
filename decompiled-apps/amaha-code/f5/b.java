package f5;

import android.graphics.Bitmap;
import com.canhub.cropper.CropImageView;
import com.canhub.cropper.b;
import hs.k;
import kotlinx.coroutines.d0;
import ns.i;
import ss.p;
/* compiled from: BitmapLoadingWorkerJob.kt */
@ns.e(c = "com.canhub.cropper.BitmapLoadingWorkerJob$onPostExecute$2", f = "BitmapLoadingWorkerJob.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class b extends i implements p<d0, ls.d<? super k>, Object> {

    /* renamed from: u  reason: collision with root package name */
    public /* synthetic */ Object f14810u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ com.canhub.cropper.b f14811v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ b.a f14812w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(com.canhub.cropper.b bVar, b.a aVar, ls.d dVar) {
        super(2, dVar);
        this.f14811v = bVar;
        this.f14812w = aVar;
    }

    @Override // ns.a
    public final ls.d<k> create(Object obj, ls.d<?> completion) {
        kotlin.jvm.internal.i.g(completion, "completion");
        b bVar = new b(this.f14811v, this.f14812w, completion);
        bVar.f14810u = obj;
        return bVar;
    }

    @Override // ss.p
    public final Object invoke(d0 d0Var, ls.d<? super k> dVar) {
        return ((b) create(d0Var, dVar)).invokeSuspend(k.f19476a);
    }

    @Override // ns.a
    public final Object invokeSuspend(Object obj) {
        boolean z10;
        Bitmap bitmap;
        CropImageView cropImageView;
        sp.b.d0(obj);
        boolean E = kotlin.jvm.internal.h.E((d0) this.f14810u);
        b.a aVar = this.f14812w;
        if (E && (cropImageView = this.f14811v.f6070c.get()) != null) {
            cropImageView.e0 = null;
            cropImageView.h();
            if (aVar.f6077e == null) {
                int i6 = aVar.f6076d;
                cropImageView.D = i6;
                cropImageView.f(aVar.f6074b, 0, aVar.f6073a, aVar.f6075c, i6);
            }
            CropImageView.h hVar = cropImageView.Q;
            if (hVar != null) {
                hVar.G(cropImageView, aVar.f6073a, aVar.f6077e);
            }
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10 && (bitmap = aVar.f6074b) != null) {
            bitmap.recycle();
        }
        return k.f19476a;
    }
}
