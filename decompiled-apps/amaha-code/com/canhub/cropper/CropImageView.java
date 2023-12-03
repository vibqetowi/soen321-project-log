package com.canhub.cropper;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import androidx.core.content.FileProvider;
import androidx.fragment.app.p;
import com.theinnerhour.b2b.R;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.UUID;
import kotlinx.coroutines.o0;
import kotlinx.coroutines.q1;
import ta.v;
/* loaded from: classes.dex */
public class CropImageView extends FrameLayout {

    /* renamed from: g0  reason: collision with root package name */
    public static final /* synthetic */ int f6011g0 = 0;
    public final float[] A;
    public f5.e B;
    public Bitmap C;
    public int D;
    public int E;
    public boolean F;
    public boolean G;
    public int H;
    public int I;
    public int J;
    public i K;
    public boolean L;
    public boolean M;
    public boolean N;
    public boolean O;
    public int P;
    public h Q;
    public d R;
    public Uri S;
    public int T;
    public float U;
    public float V;
    public float W;

    /* renamed from: a0  reason: collision with root package name */
    public RectF f6012a0;

    /* renamed from: b0  reason: collision with root package name */
    public int f6013b0;
    public boolean c0;

    /* renamed from: d0  reason: collision with root package name */
    public Uri f6014d0;
    public WeakReference<com.canhub.cropper.b> e0;

    /* renamed from: f0  reason: collision with root package name */
    public WeakReference<com.canhub.cropper.a> f6015f0;

    /* renamed from: u  reason: collision with root package name */
    public final ImageView f6016u;

    /* renamed from: v  reason: collision with root package name */
    public final CropOverlayView f6017v;

    /* renamed from: w  reason: collision with root package name */
    public final Matrix f6018w;

    /* renamed from: x  reason: collision with root package name */
    public final Matrix f6019x;

    /* renamed from: y  reason: collision with root package name */
    public final ProgressBar f6020y;

    /* renamed from: z  reason: collision with root package name */
    public final float[] f6021z;

    /* loaded from: classes.dex */
    public static class a {
        public final int A;
        public final int B;

        /* renamed from: u  reason: collision with root package name */
        public final Uri f6022u;

        /* renamed from: v  reason: collision with root package name */
        public final Uri f6023v;

        /* renamed from: w  reason: collision with root package name */
        public final Exception f6024w;

        /* renamed from: x  reason: collision with root package name */
        public final float[] f6025x;

        /* renamed from: y  reason: collision with root package name */
        public final Rect f6026y;

        /* renamed from: z  reason: collision with root package name */
        public final Rect f6027z;

        public a(Uri uri, Uri uri2, Exception exc, float[] fArr, Rect rect, Rect rect2, int i6, int i10) {
            this.f6022u = uri;
            this.f6023v = uri2;
            this.f6024w = exc;
            this.f6025x = fArr;
            this.f6026y = rect;
            this.f6027z = rect2;
            this.A = i6;
            this.B = i10;
        }
    }

    /* loaded from: classes.dex */
    public enum b {
        RECTANGLE,
        /* JADX INFO: Fake field, exist only in values array */
        OVAL,
        /* JADX INFO: Fake field, exist only in values array */
        RECTANGLE_VERTICAL_ONLY,
        /* JADX INFO: Fake field, exist only in values array */
        RECTANGLE_HORIZONTAL_ONLY
    }

    /* loaded from: classes.dex */
    public enum c {
        /* JADX INFO: Fake field, exist only in values array */
        OFF,
        ON_TOUCH,
        ON
    }

    /* loaded from: classes.dex */
    public interface d {
        void c0(CropImageView cropImageView, a aVar);
    }

    /* loaded from: classes.dex */
    public interface e {
    }

    /* loaded from: classes.dex */
    public interface f {
    }

    /* loaded from: classes.dex */
    public interface g {
    }

    /* loaded from: classes.dex */
    public interface h {
        void G(CropImageView cropImageView, Uri uri, Exception exc);
    }

    /* loaded from: classes.dex */
    public enum i {
        FIT_CENTER,
        /* JADX INFO: Fake field, exist only in values array */
        CENTER,
        /* JADX INFO: Fake field, exist only in values array */
        CENTER_CROP,
        CENTER_INSIDE
    }

    public CropImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intent intent;
        Bundle bundleExtra;
        this.f6018w = new Matrix();
        this.f6019x = new Matrix();
        this.f6021z = new float[8];
        this.A = new float[8];
        this.L = false;
        this.M = true;
        this.N = true;
        this.O = true;
        this.T = 1;
        this.U = 1.0f;
        f5.f fVar = null;
        if (context instanceof Activity) {
            intent = ((Activity) context).getIntent();
        } else {
            intent = null;
        }
        if (intent != null && (bundleExtra = intent.getBundleExtra("CROP_IMAGE_EXTRA_BUNDLE")) != null) {
            fVar = (f5.f) bundleExtra.getParcelable("CROP_IMAGE_EXTRA_OPTIONS");
        }
        if (fVar == null) {
            fVar = new f5.f();
            if (attributeSet != null) {
                TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, kotlin.jvm.internal.h.H, 0, 0);
                try {
                    fVar.G = obtainStyledAttributes.getBoolean(11, fVar.G);
                    fVar.H = obtainStyledAttributes.getInteger(0, fVar.H);
                    fVar.I = obtainStyledAttributes.getInteger(1, fVar.I);
                    fVar.f14842y = i.values()[obtainStyledAttributes.getInt(27, fVar.f14842y.ordinal())];
                    fVar.B = obtainStyledAttributes.getBoolean(2, fVar.B);
                    fVar.C = obtainStyledAttributes.getBoolean(25, fVar.C);
                    fVar.D = obtainStyledAttributes.getBoolean(10, fVar.D);
                    fVar.E = obtainStyledAttributes.getInteger(20, fVar.E);
                    fVar.f14838u = b.values()[obtainStyledAttributes.getInt(28, fVar.f14838u.ordinal())];
                    fVar.f14841x = c.values()[obtainStyledAttributes.getInt(14, fVar.f14841x.ordinal())];
                    fVar.f14839v = obtainStyledAttributes.getDimension(31, fVar.f14839v);
                    fVar.f14840w = obtainStyledAttributes.getDimension(32, fVar.f14840w);
                    fVar.F = obtainStyledAttributes.getFloat(17, fVar.F);
                    fVar.J = obtainStyledAttributes.getDimension(9, fVar.J);
                    fVar.K = obtainStyledAttributes.getInteger(8, fVar.K);
                    fVar.L = obtainStyledAttributes.getDimension(7, fVar.L);
                    fVar.M = obtainStyledAttributes.getDimension(6, fVar.M);
                    fVar.N = obtainStyledAttributes.getDimension(5, fVar.N);
                    fVar.O = obtainStyledAttributes.getInteger(4, fVar.O);
                    fVar.P = obtainStyledAttributes.getDimension(16, fVar.P);
                    fVar.Q = obtainStyledAttributes.getInteger(15, fVar.Q);
                    fVar.R = obtainStyledAttributes.getInteger(3, fVar.R);
                    fVar.f14843z = obtainStyledAttributes.getBoolean(29, this.M);
                    fVar.A = obtainStyledAttributes.getBoolean(30, this.N);
                    fVar.L = obtainStyledAttributes.getDimension(7, fVar.L);
                    fVar.S = (int) obtainStyledAttributes.getDimension(24, fVar.S);
                    fVar.T = (int) obtainStyledAttributes.getDimension(23, fVar.T);
                    fVar.U = (int) obtainStyledAttributes.getFloat(22, fVar.U);
                    fVar.V = (int) obtainStyledAttributes.getFloat(21, fVar.V);
                    fVar.W = (int) obtainStyledAttributes.getFloat(19, fVar.W);
                    fVar.X = (int) obtainStyledAttributes.getFloat(18, fVar.X);
                    fVar.f14834n0 = obtainStyledAttributes.getBoolean(12, fVar.f14834n0);
                    fVar.f14835o0 = obtainStyledAttributes.getBoolean(12, fVar.f14835o0);
                    this.L = obtainStyledAttributes.getBoolean(26, this.L);
                    if (obtainStyledAttributes.hasValue(0) && obtainStyledAttributes.hasValue(0) && !obtainStyledAttributes.hasValue(11)) {
                        fVar.G = true;
                    }
                } finally {
                    obtainStyledAttributes.recycle();
                }
            }
        }
        fVar.a();
        this.K = fVar.f14842y;
        this.O = fVar.B;
        this.P = fVar.E;
        this.M = fVar.f14843z;
        this.N = fVar.A;
        this.F = fVar.f14834n0;
        this.G = fVar.f14835o0;
        View inflate = LayoutInflater.from(context).inflate(R.layout.crop_image_view, (ViewGroup) this, true);
        ImageView imageView = (ImageView) inflate.findViewById(R.id.ImageView_image);
        this.f6016u = imageView;
        imageView.setScaleType(ImageView.ScaleType.MATRIX);
        CropOverlayView cropOverlayView = (CropOverlayView) inflate.findViewById(R.id.CropOverlayView);
        this.f6017v = cropOverlayView;
        cropOverlayView.setCropWindowChangeListener(new f0.b(2, this));
        cropOverlayView.setInitialAttributeValues(fVar);
        this.f6020y = (ProgressBar) inflate.findViewById(R.id.CropProgressBar);
        h();
    }

    public final void a(float f2, float f10, boolean z10, boolean z11) {
        float f11;
        float f12;
        float max;
        if (this.C != null) {
            float f13 = 0.0f;
            if (f2 > 0.0f && f10 > 0.0f) {
                Matrix matrix = this.f6018w;
                Matrix matrix2 = this.f6019x;
                matrix.invert(matrix2);
                CropOverlayView cropOverlayView = this.f6017v;
                RectF cropWindowRect = cropOverlayView.getCropWindowRect();
                matrix2.mapRect(cropWindowRect);
                matrix.reset();
                matrix.postTranslate((f2 - this.C.getWidth()) / 2.0f, (f10 - this.C.getHeight()) / 2.0f);
                d();
                int i6 = this.E;
                float[] fArr = this.f6021z;
                if (i6 > 0) {
                    matrix.postRotate(i6, (com.canhub.cropper.c.o(fArr) + com.canhub.cropper.c.p(fArr)) / 2.0f, (com.canhub.cropper.c.q(fArr) + com.canhub.cropper.c.m(fArr)) / 2.0f);
                    d();
                }
                float min = Math.min(f2 / (com.canhub.cropper.c.p(fArr) - com.canhub.cropper.c.o(fArr)), f10 / (com.canhub.cropper.c.m(fArr) - com.canhub.cropper.c.q(fArr)));
                i iVar = this.K;
                if (iVar == i.FIT_CENTER || ((iVar == i.CENTER_INSIDE && min < 1.0f) || (min > 1.0f && this.O))) {
                    matrix.postScale(min, min, (com.canhub.cropper.c.o(fArr) + com.canhub.cropper.c.p(fArr)) / 2.0f, (com.canhub.cropper.c.q(fArr) + com.canhub.cropper.c.m(fArr)) / 2.0f);
                    d();
                }
                if (this.F) {
                    f11 = -this.U;
                } else {
                    f11 = this.U;
                }
                if (this.G) {
                    f12 = -this.U;
                } else {
                    f12 = this.U;
                }
                matrix.postScale(f11, f12, (com.canhub.cropper.c.o(fArr) + com.canhub.cropper.c.p(fArr)) / 2.0f, (com.canhub.cropper.c.q(fArr) + com.canhub.cropper.c.m(fArr)) / 2.0f);
                d();
                matrix.mapRect(cropWindowRect);
                if (z10) {
                    if (f2 > com.canhub.cropper.c.p(fArr) - com.canhub.cropper.c.o(fArr)) {
                        max = 0.0f;
                    } else {
                        max = Math.max(Math.min((f2 / 2.0f) - cropWindowRect.centerX(), -com.canhub.cropper.c.o(fArr)), getWidth() - com.canhub.cropper.c.p(fArr)) / f11;
                    }
                    this.V = max;
                    if (f10 <= com.canhub.cropper.c.m(fArr) - com.canhub.cropper.c.q(fArr)) {
                        f13 = Math.max(Math.min((f10 / 2.0f) - cropWindowRect.centerY(), -com.canhub.cropper.c.q(fArr)), getHeight() - com.canhub.cropper.c.m(fArr)) / f12;
                    }
                    this.W = f13;
                } else {
                    this.V = Math.min(Math.max(this.V * f11, -cropWindowRect.left), (-cropWindowRect.right) + f2) / f11;
                    this.W = Math.min(Math.max(this.W * f12, -cropWindowRect.top), (-cropWindowRect.bottom) + f10) / f12;
                }
                matrix.postTranslate(this.V * f11, this.W * f12);
                cropWindowRect.offset(this.V * f11, this.W * f12);
                cropOverlayView.setCropWindowRect(cropWindowRect);
                d();
                cropOverlayView.invalidate();
                ImageView imageView = this.f6016u;
                if (z11) {
                    f5.e eVar = this.B;
                    eVar.getClass();
                    System.arraycopy(fArr, 0, eVar.f14818v, 0, 8);
                    eVar.f14820x.set(eVar.B.getCropWindowRect());
                    matrix.getValues(eVar.f14822z);
                    imageView.startAnimation(this.B);
                } else {
                    imageView.setImageMatrix(matrix);
                }
                j(false);
            }
        }
    }

    public final void b() {
        Bitmap bitmap = this.C;
        if (bitmap != null && (this.J > 0 || this.S != null)) {
            bitmap.recycle();
        }
        this.C = null;
        this.J = 0;
        this.S = null;
        this.T = 1;
        this.E = 0;
        this.U = 1.0f;
        this.V = 0.0f;
        this.W = 0.0f;
        this.f6018w.reset();
        this.f6014d0 = null;
        this.f6012a0 = null;
        this.f6013b0 = 0;
        this.f6016u.setImageBitmap(null);
        g();
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00cc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(boolean z10, boolean z11) {
        float f2;
        int width = getWidth();
        int height = getHeight();
        if (this.C != null && width > 0 && height > 0) {
            CropOverlayView cropOverlayView = this.f6017v;
            RectF cropWindowRect = cropOverlayView.getCropWindowRect();
            if (z10) {
                if (cropWindowRect.left < 0.0f || cropWindowRect.top < 0.0f || cropWindowRect.right > width || cropWindowRect.bottom > height) {
                    a(width, height, false, false);
                    return;
                }
                return;
            }
            float f10 = 1.0f;
            if (this.O || this.U > 1.0f) {
                if (this.U < this.P) {
                    float f11 = width;
                    if (cropWindowRect.width() < f11 * 0.5f) {
                        float f12 = height;
                        if (cropWindowRect.height() < 0.5f * f12) {
                            f2 = Math.min(this.P, Math.min(f11 / ((cropWindowRect.width() / this.U) / 0.64f), f12 / ((cropWindowRect.height() / this.U) / 0.64f)));
                            if (this.U > 1.0f) {
                                float f13 = width;
                                if (cropWindowRect.width() > f13 * 0.65f || cropWindowRect.height() > height * 0.65f) {
                                    f2 = Math.max(1.0f, Math.min(f13 / ((cropWindowRect.width() / this.U) / 0.51f), height / ((cropWindowRect.height() / this.U) / 0.51f)));
                                }
                            }
                            if (this.O) {
                                f10 = f2;
                            }
                            if (f10 <= 0.0f && f10 != this.U) {
                                if (z11) {
                                    if (this.B == null) {
                                        this.B = new f5.e(this.f6016u, cropOverlayView);
                                    }
                                    f5.e eVar = this.B;
                                    Matrix imageMatrix = this.f6018w;
                                    eVar.getClass();
                                    float[] boundPoints = this.f6021z;
                                    kotlin.jvm.internal.i.g(boundPoints, "boundPoints");
                                    kotlin.jvm.internal.i.g(imageMatrix, "imageMatrix");
                                    eVar.reset();
                                    System.arraycopy(boundPoints, 0, eVar.f14817u, 0, 8);
                                    eVar.f14819w.set(eVar.B.getCropWindowRect());
                                    imageMatrix.getValues(eVar.f14821y);
                                }
                                this.U = f10;
                                a(width, height, true, z11);
                                return;
                            }
                        }
                    }
                }
                f2 = 0.0f;
                if (this.U > 1.0f) {
                }
                if (this.O) {
                }
                if (f10 <= 0.0f) {
                }
            }
        }
    }

    public final void d() {
        float[] fArr = this.f6021z;
        fArr[0] = 0.0f;
        fArr[1] = 0.0f;
        fArr[2] = this.C.getWidth();
        fArr[3] = 0.0f;
        fArr[4] = this.C.getWidth();
        fArr[5] = this.C.getHeight();
        fArr[6] = 0.0f;
        fArr[7] = this.C.getHeight();
        Matrix matrix = this.f6018w;
        matrix.mapPoints(fArr);
        float[] fArr2 = this.A;
        fArr2[0] = 0.0f;
        fArr2[1] = 0.0f;
        fArr2[2] = 100.0f;
        fArr2[3] = 0.0f;
        fArr2[4] = 100.0f;
        fArr2[5] = 100.0f;
        fArr2[6] = 0.0f;
        fArr2[7] = 100.0f;
        matrix.mapPoints(fArr2);
    }

    public final void e(int i6) {
        int i10;
        boolean z10;
        float width;
        float height;
        if (this.C != null) {
            if (i6 < 0) {
                i10 = (i6 % 360) + 360;
            } else {
                i10 = i6 % 360;
            }
            CropOverlayView cropOverlayView = this.f6017v;
            if (!cropOverlayView.P && ((i10 > 45 && i10 < 135) || (i10 > 215 && i10 < 305))) {
                z10 = true;
            } else {
                z10 = false;
            }
            RectF rectF = com.canhub.cropper.c.f6080c;
            rectF.set(cropOverlayView.getCropWindowRect());
            if (z10) {
                width = rectF.height();
            } else {
                width = rectF.width();
            }
            float f2 = width / 2.0f;
            if (z10) {
                height = rectF.width();
            } else {
                height = rectF.height();
            }
            float f10 = height / 2.0f;
            if (z10) {
                boolean z11 = this.F;
                this.F = this.G;
                this.G = z11;
            }
            Matrix matrix = this.f6018w;
            Matrix matrix2 = this.f6019x;
            matrix.invert(matrix2);
            float[] fArr = com.canhub.cropper.c.f6081d;
            fArr[0] = rectF.centerX();
            fArr[1] = rectF.centerY();
            fArr[2] = 0.0f;
            fArr[3] = 0.0f;
            fArr[4] = 1.0f;
            fArr[5] = 0.0f;
            matrix2.mapPoints(fArr);
            this.E = (this.E + i10) % 360;
            a(getWidth(), getHeight(), true, false);
            float[] fArr2 = com.canhub.cropper.c.f6082e;
            matrix.mapPoints(fArr2, fArr);
            float sqrt = (float) (this.U / Math.sqrt(Math.pow(fArr2[5] - fArr2[3], 2.0d) + Math.pow(fArr2[4] - fArr2[2], 2.0d)));
            this.U = sqrt;
            this.U = Math.max(sqrt, 1.0f);
            a(getWidth(), getHeight(), true, false);
            matrix.mapPoints(fArr2, fArr);
            double sqrt2 = Math.sqrt(Math.pow(fArr2[5] - fArr2[3], 2.0d) + Math.pow(fArr2[4] - fArr2[2], 2.0d));
            float f11 = (float) (f2 * sqrt2);
            float f12 = (float) (f10 * sqrt2);
            float f13 = fArr2[0];
            float f14 = fArr2[1];
            rectF.set(f13 - f11, f14 - f12, f13 + f11, f14 + f12);
            if (cropOverlayView.W) {
                cropOverlayView.setCropWindowRect(com.canhub.cropper.c.f6079b);
                cropOverlayView.f();
                cropOverlayView.invalidate();
            }
            cropOverlayView.setCropWindowRect(rectF);
            a(getWidth(), getHeight(), true, false);
            c(false, false);
            RectF cropWindowRect = cropOverlayView.getCropWindowRect();
            cropOverlayView.d(cropWindowRect);
            cropOverlayView.f6039x.h(cropWindowRect);
        }
    }

    public final void f(Bitmap bitmap, int i6, Uri uri, int i10, int i11) {
        Bitmap bitmap2 = this.C;
        if (bitmap2 == null || !bitmap2.equals(bitmap)) {
            ImageView imageView = this.f6016u;
            imageView.clearAnimation();
            b();
            this.C = bitmap;
            imageView.setImageBitmap(bitmap);
            this.S = uri;
            this.J = i6;
            this.T = i10;
            this.E = i11;
            a(getWidth(), getHeight(), true, false);
            CropOverlayView cropOverlayView = this.f6017v;
            if (cropOverlayView != null) {
                if (cropOverlayView.W) {
                    cropOverlayView.setCropWindowRect(com.canhub.cropper.c.f6079b);
                    cropOverlayView.f();
                    cropOverlayView.invalidate();
                }
                g();
            }
        }
    }

    public final void g() {
        int i6;
        CropOverlayView cropOverlayView = this.f6017v;
        if (cropOverlayView != null) {
            if (this.M && this.C != null) {
                i6 = 0;
            } else {
                i6 = 4;
            }
            cropOverlayView.setVisibility(i6);
        }
    }

    public Pair<Integer, Integer> getAspectRatio() {
        CropOverlayView cropOverlayView = this.f6017v;
        return new Pair<>(Integer.valueOf(cropOverlayView.getAspectRatioX()), Integer.valueOf(cropOverlayView.getAspectRatioY()));
    }

    public float[] getCropPoints() {
        RectF cropWindowRect = this.f6017v.getCropWindowRect();
        float[] fArr = new float[8];
        float f2 = cropWindowRect.left;
        fArr[0] = f2;
        float f10 = cropWindowRect.top;
        fArr[1] = f10;
        float f11 = cropWindowRect.right;
        fArr[2] = f11;
        fArr[3] = f10;
        fArr[4] = f11;
        float f12 = cropWindowRect.bottom;
        fArr[5] = f12;
        fArr[6] = f2;
        fArr[7] = f12;
        Matrix matrix = this.f6018w;
        Matrix matrix2 = this.f6019x;
        matrix.invert(matrix2);
        matrix2.mapPoints(fArr);
        for (int i6 = 0; i6 < 8; i6++) {
            fArr[i6] = fArr[i6] * this.T;
        }
        return fArr;
    }

    public Rect getCropRect() {
        int i6 = this.T;
        Bitmap bitmap = this.C;
        if (bitmap == null) {
            return null;
        }
        float[] cropPoints = getCropPoints();
        int width = bitmap.getWidth() * i6;
        int height = i6 * bitmap.getHeight();
        CropOverlayView cropOverlayView = this.f6017v;
        return com.canhub.cropper.c.n(cropPoints, width, height, cropOverlayView.P, cropOverlayView.getAspectRatioX(), cropOverlayView.getAspectRatioY());
    }

    public b getCropShape() {
        return this.f6017v.getCropShape();
    }

    public RectF getCropWindowRect() {
        CropOverlayView cropOverlayView = this.f6017v;
        if (cropOverlayView == null) {
            return null;
        }
        return cropOverlayView.getCropWindowRect();
    }

    public Bitmap getCroppedImage() {
        Bitmap bitmap;
        if (this.C != null) {
            this.f6016u.clearAnimation();
            Uri uri = this.S;
            CropOverlayView cropOverlayView = this.f6017v;
            if (uri != null && this.T > 1) {
                bitmap = com.canhub.cropper.c.d(getContext(), this.S, getCropPoints(), this.E, this.C.getWidth() * this.T, this.C.getHeight() * this.T, cropOverlayView.P, cropOverlayView.getAspectRatioX(), cropOverlayView.getAspectRatioY(), 0, 0, this.F, this.G).f6084a;
            } else {
                bitmap = com.canhub.cropper.c.f(this.C, getCropPoints(), this.E, cropOverlayView.P, cropOverlayView.getAspectRatioX(), cropOverlayView.getAspectRatioY(), this.F, this.G).f6084a;
            }
            return com.canhub.cropper.c.r(bitmap, 0, 0, 1);
        }
        return null;
    }

    public void getCroppedImageAsync() {
        if (this.R != null) {
            i(0, 0, 0, Bitmap.CompressFormat.JPEG, null, 1);
            return;
        }
        throw new IllegalArgumentException("mOnCropImageCompleteListener is not set");
    }

    public c getGuidelines() {
        return this.f6017v.getGuidelines();
    }

    public int getImageResource() {
        return this.J;
    }

    public Uri getImageUri() {
        return this.S;
    }

    public int getMaxZoom() {
        return this.P;
    }

    public int getRotatedDegrees() {
        return this.E;
    }

    public i getScaleType() {
        return this.K;
    }

    public Rect getWholeImageRect() {
        int i6 = this.T;
        Bitmap bitmap = this.C;
        if (bitmap == null) {
            return null;
        }
        return new Rect(0, 0, bitmap.getWidth() * i6, bitmap.getHeight() * i6);
    }

    public final void h() {
        boolean z10;
        int i6 = 0;
        if (this.N && ((this.C == null && this.e0 != null) || this.f6015f0 != null)) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            i6 = 4;
        }
        this.f6020y.setVisibility(i6);
    }

    public final void i(int i6, int i10, int i11, Bitmap.CompressFormat saveCompressFormat, Uri uri, int i12) {
        com.canhub.cropper.a aVar;
        int i13;
        int i14;
        Bitmap.CompressFormat compressFormat;
        q1 q1Var;
        CropImageView cropImageView = this;
        Bitmap bitmap = cropImageView.C;
        if (bitmap != null) {
            cropImageView.f6016u.clearAnimation();
            WeakReference<com.canhub.cropper.a> weakReference = cropImageView.f6015f0;
            if (weakReference != null) {
                aVar = weakReference.get();
            } else {
                aVar = null;
            }
            if (aVar != null && (q1Var = aVar.f6043a) != null) {
                q1Var.g(null);
            }
            if (i12 != 1) {
                i13 = i6;
            } else {
                i13 = 0;
            }
            if (i12 != 1) {
                i14 = i10;
            } else {
                i14 = 0;
            }
            int width = bitmap.getWidth() * cropImageView.T;
            int height = bitmap.getHeight();
            int i15 = cropImageView.T;
            int i16 = height * i15;
            Uri uri2 = cropImageView.S;
            CropOverlayView cropOverlayView = cropImageView.f6017v;
            if (uri2 != null && (i15 > 1 || i12 == 2)) {
                p activity = (p) getContext();
                Uri uri3 = cropImageView.S;
                float[] cropPoints = getCropPoints();
                int i17 = cropImageView.E;
                boolean z10 = cropOverlayView.P;
                int aspectRatioX = cropOverlayView.getAspectRatioX();
                int aspectRatioY = cropOverlayView.getAspectRatioY();
                boolean z11 = cropImageView.F;
                boolean z12 = cropImageView.G;
                kotlin.jvm.internal.i.g(activity, "activity");
                kotlin.jvm.internal.i.g(cropPoints, "cropPoints");
                defpackage.d.j(i12, "options");
                kotlin.jvm.internal.i.g(saveCompressFormat, "saveCompressFormat");
                cropImageView = this;
                cropImageView.f6015f0 = new WeakReference<>(new com.canhub.cropper.a(activity, new WeakReference(cropImageView), uri3, null, cropPoints, i17, width, i16, z10, aspectRatioX, aspectRatioY, i13, i14, z11, z12, i12, uri, saveCompressFormat, i11));
            } else {
                p activity2 = (p) getContext();
                float[] cropPoints2 = getCropPoints();
                int i18 = cropImageView.E;
                boolean z13 = cropOverlayView.P;
                int aspectRatioX2 = cropOverlayView.getAspectRatioX();
                int aspectRatioY2 = cropOverlayView.getAspectRatioY();
                boolean z14 = cropImageView.F;
                boolean z15 = cropImageView.G;
                kotlin.jvm.internal.i.g(activity2, "activity");
                kotlin.jvm.internal.i.g(cropPoints2, "cropPoints");
                defpackage.d.j(i12, "options");
                WeakReference weakReference2 = new WeakReference(cropImageView);
                if (saveCompressFormat != null) {
                    compressFormat = saveCompressFormat;
                } else {
                    compressFormat = Bitmap.CompressFormat.JPEG;
                }
                cropImageView.f6015f0 = new WeakReference<>(new com.canhub.cropper.a(activity2, weakReference2, null, bitmap, cropPoints2, i18, 0, 0, z13, aspectRatioX2, aspectRatioY2, i13, i14, z14, z15, i12, uri, compressFormat, i11));
            }
            com.canhub.cropper.a aVar2 = cropImageView.f6015f0.get();
            aVar2.f6043a = v.H(ca.a.m0(aVar2.f6044b), o0.f23640a, 0, new f5.a(aVar2, null), 2);
            h();
        }
    }

    public final void j(boolean z10) {
        float[] fArr;
        Bitmap bitmap = this.C;
        CropOverlayView cropOverlayView = this.f6017v;
        if (bitmap != null && !z10) {
            float[] fArr2 = this.A;
            float p10 = (this.T * 100.0f) / (com.canhub.cropper.c.p(fArr2) - com.canhub.cropper.c.o(fArr2));
            float m10 = (this.T * 100.0f) / (com.canhub.cropper.c.m(fArr2) - com.canhub.cropper.c.q(fArr2));
            f5.g gVar = cropOverlayView.f6039x;
            gVar.f14848e = getWidth();
            gVar.f = getHeight();
            gVar.f14853k = p10;
            gVar.f14854l = m10;
        }
        if (z10) {
            fArr = null;
        } else {
            fArr = this.f6021z;
        }
        cropOverlayView.g(fArr, getWidth(), getHeight());
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i6, int i10, int i11, int i12) {
        super.onLayout(z10, i6, i10, i11, i12);
        if (this.H > 0 && this.I > 0) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            layoutParams.width = this.H;
            layoutParams.height = this.I;
            setLayoutParams(layoutParams);
            if (this.C != null) {
                float f2 = i11 - i6;
                float f10 = i12 - i10;
                a(f2, f10, true, false);
                if (this.f6012a0 != null) {
                    int i13 = this.f6013b0;
                    if (i13 != this.D) {
                        this.E = i13;
                        a(f2, f10, true, false);
                        this.f6013b0 = 0;
                    }
                    this.f6018w.mapRect(this.f6012a0);
                    RectF rectF = this.f6012a0;
                    CropOverlayView cropOverlayView = this.f6017v;
                    cropOverlayView.setCropWindowRect(rectF);
                    c(false, false);
                    RectF cropWindowRect = cropOverlayView.getCropWindowRect();
                    cropOverlayView.d(cropWindowRect);
                    cropOverlayView.f6039x.h(cropWindowRect);
                    this.f6012a0 = null;
                    return;
                } else if (this.c0) {
                    this.c0 = false;
                    c(false, false);
                    return;
                } else {
                    return;
                }
            }
            j(true);
            return;
        }
        j(true);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i6, int i10) {
        double d10;
        double d11;
        int width;
        int i11;
        super.onMeasure(i6, i10);
        int mode = View.MeasureSpec.getMode(i6);
        int size = View.MeasureSpec.getSize(i6);
        int mode2 = View.MeasureSpec.getMode(i10);
        int size2 = View.MeasureSpec.getSize(i10);
        Bitmap bitmap = this.C;
        if (bitmap != null) {
            if (size2 == 0) {
                size2 = bitmap.getHeight();
            }
            if (size < this.C.getWidth()) {
                d10 = size / this.C.getWidth();
            } else {
                d10 = Double.POSITIVE_INFINITY;
            }
            if (size2 < this.C.getHeight()) {
                d11 = size2 / this.C.getHeight();
            } else {
                d11 = Double.POSITIVE_INFINITY;
            }
            if (d10 == Double.POSITIVE_INFINITY && d11 == Double.POSITIVE_INFINITY) {
                width = this.C.getWidth();
                i11 = this.C.getHeight();
            } else if (d10 <= d11) {
                i11 = (int) (this.C.getHeight() * d10);
                width = size;
            } else {
                width = (int) (this.C.getWidth() * d11);
                i11 = size2;
            }
            if (mode != 1073741824) {
                if (mode == Integer.MIN_VALUE) {
                    size = Math.min(width, size);
                } else {
                    size = width;
                }
            }
            if (mode2 != 1073741824) {
                if (mode2 == Integer.MIN_VALUE) {
                    size2 = Math.min(i11, size2);
                } else {
                    size2 = i11;
                }
            }
            this.H = size;
            this.I = size2;
            setMeasuredDimension(size, size2);
            return;
        }
        setMeasuredDimension(size, size2);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        Bitmap bitmap;
        if (parcelable instanceof Bundle) {
            Bundle bundle = (Bundle) parcelable;
            if (this.e0 == null && this.S == null && this.C == null && this.J == 0) {
                Uri uri = (Uri) bundle.getParcelable("LOADED_IMAGE_URI");
                if (uri != null) {
                    String string = bundle.getString("LOADED_IMAGE_STATE_BITMAP_KEY");
                    if (string != null) {
                        Pair<String, WeakReference<Bitmap>> pair = com.canhub.cropper.c.f6083g;
                        if (pair != null && ((String) pair.first).equals(string)) {
                            bitmap = (Bitmap) ((WeakReference) com.canhub.cropper.c.f6083g.second).get();
                        } else {
                            bitmap = null;
                        }
                        com.canhub.cropper.c.f6083g = null;
                        if (bitmap != null && !bitmap.isRecycled()) {
                            f(bitmap, 0, uri, bundle.getInt("LOADED_SAMPLE_SIZE"), 0);
                        }
                    }
                    if (this.S == null) {
                        setImageUriAsync(uri);
                    }
                } else {
                    int i6 = bundle.getInt("LOADED_IMAGE_RESOURCE");
                    if (i6 > 0) {
                        setImageResource(i6);
                    } else {
                        Uri uri2 = (Uri) bundle.getParcelable("LOADING_IMAGE_URI");
                        if (uri2 != null) {
                            setImageUriAsync(uri2);
                        }
                    }
                }
                int i10 = bundle.getInt("DEGREES_ROTATED");
                this.f6013b0 = i10;
                this.E = i10;
                Rect rect = (Rect) bundle.getParcelable("INITIAL_CROP_RECT");
                CropOverlayView cropOverlayView = this.f6017v;
                if (rect != null && (rect.width() > 0 || rect.height() > 0)) {
                    cropOverlayView.setInitialCropWindowRect(rect);
                }
                RectF rectF = (RectF) bundle.getParcelable("CROP_WINDOW_RECT");
                if (rectF != null && (rectF.width() > 0.0f || rectF.height() > 0.0f)) {
                    this.f6012a0 = rectF;
                }
                cropOverlayView.setCropShape(b.valueOf(bundle.getString("CROP_SHAPE")));
                this.O = bundle.getBoolean("CROP_AUTO_ZOOM_ENABLED");
                this.P = bundle.getInt("CROP_MAX_ZOOM");
                this.F = bundle.getBoolean("CROP_FLIP_HORIZONTALLY");
                this.G = bundle.getBoolean("CROP_FLIP_VERTICALLY");
            }
            super.onRestoreInstanceState(bundle.getParcelable("instanceState"));
            return;
        }
        super.onRestoreInstanceState(parcelable);
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        com.canhub.cropper.b bVar;
        boolean z10 = true;
        if (this.S == null && this.C == null && this.J < 1) {
            return super.onSaveInstanceState();
        }
        Bundle bundle = new Bundle();
        Uri uri = this.S;
        if (this.L && uri == null && this.J < 1) {
            Context context = getContext();
            Bitmap bitmap = this.C;
            Uri uri2 = this.f6014d0;
            Rect rect = com.canhub.cropper.c.f6078a;
            boolean z11 = false;
            try {
                if (uri2 == null) {
                    if (Build.VERSION.SDK_INT >= 29) {
                        z11 = true;
                    }
                    if (z11) {
                        uri2 = FileProvider.b(context, context.getPackageName() + ".cropper.fileprovider", File.createTempFile("aic_state_store_temp", ".jpg", context.getCacheDir()));
                    } else {
                        uri2 = Uri.fromFile(File.createTempFile("aic_state_store_temp", ".jpg", context.getCacheDir()));
                    }
                } else if (new File(uri2.getPath()).exists()) {
                    z10 = false;
                }
                if (z10) {
                    com.canhub.cropper.c.s(context, bitmap, uri2, Bitmap.CompressFormat.JPEG, 95);
                }
                uri = uri2;
            } catch (Exception e10) {
                Log.w("AIC", "Failed to write bitmap to temp file for image-cropper save instance state", e10);
                uri = null;
            }
            this.f6014d0 = uri;
        }
        if (uri != null && this.C != null) {
            String uuid = UUID.randomUUID().toString();
            com.canhub.cropper.c.f6083g = new Pair<>(uuid, new WeakReference(this.C));
            bundle.putString("LOADED_IMAGE_STATE_BITMAP_KEY", uuid);
        }
        WeakReference<com.canhub.cropper.b> weakReference = this.e0;
        if (weakReference != null && (bVar = weakReference.get()) != null) {
            bundle.putParcelable("LOADING_IMAGE_URI", bVar.f);
        }
        bundle.putParcelable("instanceState", super.onSaveInstanceState());
        bundle.putParcelable("LOADED_IMAGE_URI", uri);
        bundle.putInt("LOADED_IMAGE_RESOURCE", this.J);
        bundle.putInt("LOADED_SAMPLE_SIZE", this.T);
        bundle.putInt("DEGREES_ROTATED", this.E);
        CropOverlayView cropOverlayView = this.f6017v;
        bundle.putParcelable("INITIAL_CROP_RECT", cropOverlayView.getInitialCropWindowRect());
        RectF rectF = com.canhub.cropper.c.f6080c;
        rectF.set(cropOverlayView.getCropWindowRect());
        Matrix matrix = this.f6018w;
        Matrix matrix2 = this.f6019x;
        matrix.invert(matrix2);
        matrix2.mapRect(rectF);
        bundle.putParcelable("CROP_WINDOW_RECT", rectF);
        bundle.putString("CROP_SHAPE", cropOverlayView.getCropShape().name());
        bundle.putBoolean("CROP_AUTO_ZOOM_ENABLED", this.O);
        bundle.putInt("CROP_MAX_ZOOM", this.P);
        bundle.putBoolean("CROP_FLIP_HORIZONTALLY", this.F);
        bundle.putBoolean("CROP_FLIP_VERTICALLY", this.G);
        return bundle;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i6, int i10, int i11, int i12) {
        boolean z10;
        super.onSizeChanged(i6, i10, i11, i12);
        if (i11 > 0 && i12 > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.c0 = z10;
    }

    public void setAutoZoomEnabled(boolean z10) {
        if (this.O != z10) {
            this.O = z10;
            c(false, false);
            this.f6017v.invalidate();
        }
    }

    public void setCenterMoveEnabled(boolean z10) {
        boolean z11;
        CropOverlayView cropOverlayView = this.f6017v;
        if (cropOverlayView.f6038w != z10) {
            cropOverlayView.f6038w = z10;
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11) {
            c(false, false);
            cropOverlayView.invalidate();
        }
    }

    public void setCropRect(Rect rect) {
        this.f6017v.setInitialCropWindowRect(rect);
    }

    public void setCropShape(b bVar) {
        this.f6017v.setCropShape(bVar);
    }

    public void setFixedAspectRatio(boolean z10) {
        this.f6017v.setFixedAspectRatio(z10);
    }

    public void setFlippedHorizontally(boolean z10) {
        if (this.F != z10) {
            this.F = z10;
            a(getWidth(), getHeight(), true, false);
        }
    }

    public void setFlippedVertically(boolean z10) {
        if (this.G != z10) {
            this.G = z10;
            a(getWidth(), getHeight(), true, false);
        }
    }

    public void setGuidelines(c cVar) {
        this.f6017v.setGuidelines(cVar);
    }

    public void setImageBitmap(Bitmap bitmap) {
        this.f6017v.setInitialCropWindowRect(null);
        f(bitmap, 0, null, 1, 0);
    }

    public void setImageResource(int i6) {
        if (i6 != 0) {
            this.f6017v.setInitialCropWindowRect(null);
            f(BitmapFactory.decodeResource(getResources(), i6), i6, null, 1, 0);
        }
    }

    public void setImageUriAsync(Uri uri) {
        com.canhub.cropper.b bVar;
        q1 q1Var;
        if (uri != null) {
            WeakReference<com.canhub.cropper.b> weakReference = this.e0;
            if (weakReference != null) {
                bVar = weakReference.get();
            } else {
                bVar = null;
            }
            if (bVar != null && (q1Var = bVar.f6071d) != null) {
                q1Var.g(null);
            }
            b();
            this.f6017v.setInitialCropWindowRect(null);
            WeakReference<com.canhub.cropper.b> weakReference2 = new WeakReference<>(new com.canhub.cropper.b((p) getContext(), this, uri));
            this.e0 = weakReference2;
            com.canhub.cropper.b bVar2 = weakReference2.get();
            bVar2.f6071d = v.H(ca.a.m0(bVar2.f6072e), o0.f23640a, 0, new f5.c(bVar2, null), 2);
            h();
        }
    }

    public void setMaxZoom(int i6) {
        if (this.P != i6 && i6 > 0) {
            this.P = i6;
            c(false, false);
            this.f6017v.invalidate();
        }
    }

    public void setMultiTouchEnabled(boolean z10) {
        CropOverlayView cropOverlayView = this.f6017v;
        if (cropOverlayView.h(z10)) {
            c(false, false);
            cropOverlayView.invalidate();
        }
    }

    public void setOnCropImageCompleteListener(d dVar) {
        this.R = dVar;
    }

    public void setOnSetImageUriCompleteListener(h hVar) {
        this.Q = hVar;
    }

    public void setRotatedDegrees(int i6) {
        int i10 = this.E;
        if (i10 != i6) {
            e(i6 - i10);
        }
    }

    public void setSaveBitmapToInstanceState(boolean z10) {
        this.L = z10;
    }

    public void setScaleType(i iVar) {
        if (iVar != this.K) {
            this.K = iVar;
            this.U = 1.0f;
            this.W = 0.0f;
            this.V = 0.0f;
            CropOverlayView cropOverlayView = this.f6017v;
            if (cropOverlayView.W) {
                cropOverlayView.setCropWindowRect(com.canhub.cropper.c.f6079b);
                cropOverlayView.f();
                cropOverlayView.invalidate();
            }
            requestLayout();
        }
    }

    public void setShowCropOverlay(boolean z10) {
        if (this.M != z10) {
            this.M = z10;
            g();
        }
    }

    public void setShowProgressBar(boolean z10) {
        if (this.N != z10) {
            this.N = z10;
            h();
        }
    }

    public void setSnapRadius(float f2) {
        if (f2 >= 0.0f) {
            this.f6017v.setSnapRadius(f2);
        }
    }

    public void setOnCropWindowChangedListener(g gVar) {
    }

    public void setOnSetCropOverlayMovedListener(e eVar) {
    }

    public void setOnSetCropOverlayReleasedListener(f fVar) {
    }
}
