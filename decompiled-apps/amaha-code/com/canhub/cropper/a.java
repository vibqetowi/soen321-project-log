package com.canhub.cropper;

import android.graphics.Bitmap;
import android.net.Uri;
import androidx.fragment.app.p;
import com.canhub.cropper.CropImageView;
import hs.k;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.h;
import kotlinx.coroutines.d0;
import kotlinx.coroutines.o0;
import kotlinx.coroutines.q1;
import ns.e;
import ns.i;
import ta.v;
/* compiled from: BitmapCroppingWorkerJob.kt */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public q1 f6043a;

    /* renamed from: b  reason: collision with root package name */
    public final p f6044b;

    /* renamed from: c  reason: collision with root package name */
    public final WeakReference<CropImageView> f6045c;

    /* renamed from: d  reason: collision with root package name */
    public final Uri f6046d;

    /* renamed from: e  reason: collision with root package name */
    public final Bitmap f6047e;
    public final float[] f;

    /* renamed from: g  reason: collision with root package name */
    public final int f6048g;

    /* renamed from: h  reason: collision with root package name */
    public final int f6049h;

    /* renamed from: i  reason: collision with root package name */
    public final int f6050i;

    /* renamed from: j  reason: collision with root package name */
    public final boolean f6051j;

    /* renamed from: k  reason: collision with root package name */
    public final int f6052k;

    /* renamed from: l  reason: collision with root package name */
    public final int f6053l;

    /* renamed from: m  reason: collision with root package name */
    public final int f6054m;

    /* renamed from: n  reason: collision with root package name */
    public final int f6055n;

    /* renamed from: o  reason: collision with root package name */
    public final boolean f6056o;

    /* renamed from: p  reason: collision with root package name */
    public final boolean f6057p;

    /* renamed from: q  reason: collision with root package name */
    public final int f6058q;
    public final Uri r;

    /* renamed from: s  reason: collision with root package name */
    public final Bitmap.CompressFormat f6059s;

    /* renamed from: t  reason: collision with root package name */
    public final int f6060t;

    /* compiled from: BitmapCroppingWorkerJob.kt */
    @e(c = "com.canhub.cropper.BitmapCroppingWorkerJob$onPostExecute$2", f = "BitmapCroppingWorkerJob.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class b extends i implements ss.p<d0, ls.d<? super k>, Object> {

        /* renamed from: u  reason: collision with root package name */
        public /* synthetic */ Object f6065u;

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ C0128a f6067w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(C0128a c0128a, ls.d dVar) {
            super(2, dVar);
            this.f6067w = c0128a;
        }

        @Override // ns.a
        public final ls.d<k> create(Object obj, ls.d<?> completion) {
            kotlin.jvm.internal.i.g(completion, "completion");
            b bVar = new b(this.f6067w, completion);
            bVar.f6065u = obj;
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
            boolean E = h.E((d0) this.f6065u);
            C0128a c0128a = this.f6067w;
            if (E && (cropImageView = a.this.f6045c.get()) != null) {
                cropImageView.f6015f0 = null;
                cropImageView.h();
                CropImageView.d dVar = cropImageView.R;
                if (dVar != null) {
                    Uri uri = cropImageView.S;
                    Bitmap bitmap2 = c0128a.f6061a;
                    dVar.c0(cropImageView, new CropImageView.a(uri, c0128a.f6062b, c0128a.f6063c, cropImageView.getCropPoints(), cropImageView.getCropRect(), cropImageView.getWholeImageRect(), cropImageView.getRotatedDegrees(), c0128a.f6064d));
                }
                z10 = true;
            } else {
                z10 = false;
            }
            if (!z10 && (bitmap = c0128a.f6061a) != null) {
                bitmap.recycle();
            }
            return k.f19476a;
        }
    }

    /* JADX WARN: Incorrect types in method signature: (Landroidx/fragment/app/p;Ljava/lang/ref/WeakReference<Lcom/canhub/cropper/CropImageView;>;Landroid/net/Uri;Landroid/graphics/Bitmap;[FIIIZIIIIZZLjava/lang/Object;Landroid/net/Uri;Landroid/graphics/Bitmap$CompressFormat;I)V */
    public a(p pVar, WeakReference weakReference, Uri uri, Bitmap bitmap, float[] fArr, int i6, int i10, int i11, boolean z10, int i12, int i13, int i14, int i15, boolean z11, boolean z12, int i16, Uri uri2, Bitmap.CompressFormat compressFormat, int i17) {
        defpackage.d.j(i16, "options");
        this.f6044b = pVar;
        this.f6045c = weakReference;
        this.f6046d = uri;
        this.f6047e = bitmap;
        this.f = fArr;
        this.f6048g = i6;
        this.f6049h = i10;
        this.f6050i = i11;
        this.f6051j = z10;
        this.f6052k = i12;
        this.f6053l = i13;
        this.f6054m = i14;
        this.f6055n = i15;
        this.f6056o = z11;
        this.f6057p = z12;
        this.f6058q = i16;
        this.r = uri2;
        this.f6059s = compressFormat;
        this.f6060t = i17;
    }

    public final Object a(C0128a c0128a, ls.d<? super k> dVar) {
        kotlinx.coroutines.scheduling.c cVar = o0.f23640a;
        Object S = v.S(kotlinx.coroutines.internal.k.f23608a, new b(c0128a, null), dVar);
        if (S == ms.a.COROUTINE_SUSPENDED) {
            return S;
        }
        return k.f19476a;
    }

    /* compiled from: BitmapCroppingWorkerJob.kt */
    /* renamed from: com.canhub.cropper.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0128a {

        /* renamed from: a  reason: collision with root package name */
        public final Bitmap f6061a;

        /* renamed from: b  reason: collision with root package name */
        public final Uri f6062b;

        /* renamed from: c  reason: collision with root package name */
        public final Exception f6063c;

        /* renamed from: d  reason: collision with root package name */
        public final int f6064d;

        public C0128a(int i6, Bitmap bitmap) {
            this.f6061a = bitmap;
            this.f6062b = null;
            this.f6063c = null;
            this.f6064d = i6;
        }

        public C0128a(Uri uri, int i6) {
            this.f6061a = null;
            this.f6062b = uri;
            this.f6063c = null;
            this.f6064d = i6;
        }

        public C0128a(Exception exc) {
            this.f6061a = null;
            this.f6062b = null;
            this.f6063c = exc;
            this.f6064d = 1;
        }
    }
}
