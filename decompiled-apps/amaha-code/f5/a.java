package f5;

import android.graphics.Bitmap;
import android.net.Uri;
import com.canhub.cropper.a;
import com.canhub.cropper.c;
import hs.k;
import kotlinx.coroutines.d0;
import ns.i;
import ss.p;
/* compiled from: BitmapCroppingWorkerJob.kt */
@ns.e(c = "com.canhub.cropper.BitmapCroppingWorkerJob$start$1", f = "BitmapCroppingWorkerJob.kt", l = {155, 164, 179, 187}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class a extends i implements p<d0, ls.d<? super k>, Object> {

    /* renamed from: u  reason: collision with root package name */
    public /* synthetic */ Object f14807u;

    /* renamed from: v  reason: collision with root package name */
    public int f14808v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ com.canhub.cropper.a f14809w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(com.canhub.cropper.a aVar, ls.d dVar) {
        super(2, dVar);
        this.f14809w = aVar;
    }

    @Override // ns.a
    public final ls.d<k> create(Object obj, ls.d<?> completion) {
        kotlin.jvm.internal.i.g(completion, "completion");
        a aVar = new a(this.f14809w, completion);
        aVar.f14807u = obj;
        return aVar;
    }

    @Override // ss.p
    public final Object invoke(d0 d0Var, ls.d<? super k> dVar) {
        return ((a) create(d0Var, dVar)).invokeSuspend(k.f19476a);
    }

    @Override // ns.a
    public final Object invokeSuspend(Object obj) {
        c.a f;
        ms.a aVar = ms.a.COROUTINE_SUSPENDED;
        int i6 = this.f14808v;
        com.canhub.cropper.a aVar2 = this.f14809w;
        try {
        } catch (Exception e10) {
            Uri uri = aVar2.r;
            a.C0128a c0128a = new a.C0128a(e10);
            this.f14808v = 4;
            if (aVar2.a(c0128a, this) == aVar) {
                return aVar;
            }
        }
        if (i6 != 0) {
            if (i6 != 1) {
                if (i6 != 2 && i6 != 3) {
                    if (i6 == 4) {
                        sp.b.d0(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    sp.b.d0(obj);
                }
                return k.f19476a;
            }
            sp.b.d0(obj);
        } else {
            sp.b.d0(obj);
            if (kotlin.jvm.internal.h.E((d0) this.f14807u)) {
                Uri uri2 = aVar2.f6046d;
                if (uri2 != null) {
                    f = com.canhub.cropper.c.d(aVar2.f6044b, uri2, aVar2.f, aVar2.f6048g, aVar2.f6049h, aVar2.f6050i, aVar2.f6051j, aVar2.f6052k, aVar2.f6053l, aVar2.f6054m, aVar2.f6055n, aVar2.f6056o, aVar2.f6057p);
                } else {
                    Bitmap bitmap = aVar2.f6047e;
                    if (bitmap != null) {
                        f = com.canhub.cropper.c.f(bitmap, aVar2.f, aVar2.f6048g, aVar2.f6051j, aVar2.f6052k, aVar2.f6053l, aVar2.f6056o, aVar2.f6057p);
                    } else {
                        a.C0128a c0128a2 = new a.C0128a(1, (Bitmap) null);
                        this.f14808v = 1;
                        if (aVar2.a(c0128a2, this) == aVar) {
                            return aVar;
                        }
                    }
                }
                Bitmap r = com.canhub.cropper.c.r(f.f6084a, aVar2.f6054m, aVar2.f6055n, aVar2.f6058q);
                Uri uri3 = aVar2.r;
                int i10 = f.f6085b;
                if (uri3 == null) {
                    a.C0128a c0128a3 = new a.C0128a(i10, r);
                    this.f14808v = 2;
                    if (aVar2.a(c0128a3, this) == aVar) {
                        return aVar;
                    }
                } else {
                    androidx.fragment.app.p pVar = aVar2.f6044b;
                    Bitmap.CompressFormat compressFormat = aVar2.f6059s;
                    if (compressFormat == null) {
                        compressFormat = Bitmap.CompressFormat.JPEG;
                    }
                    com.canhub.cropper.c.s(pVar, r, uri3, compressFormat, aVar2.f6060t);
                    r.recycle();
                    a.C0128a c0128a4 = new a.C0128a(uri3, i10);
                    this.f14808v = 3;
                    if (aVar2.a(c0128a4, this) == aVar) {
                        return aVar;
                    }
                }
            }
            return k.f19476a;
        }
        return k.f19476a;
    }
}
