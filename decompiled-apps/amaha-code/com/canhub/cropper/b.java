package com.canhub.cropper;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.net.Uri;
import android.util.DisplayMetrics;
import androidx.fragment.app.p;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.i;
import kotlinx.coroutines.q1;
/* compiled from: BitmapLoadingWorkerJob.kt */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final int f6068a;

    /* renamed from: b  reason: collision with root package name */
    public final int f6069b;

    /* renamed from: c  reason: collision with root package name */
    public final WeakReference<CropImageView> f6070c;

    /* renamed from: d  reason: collision with root package name */
    public q1 f6071d;

    /* renamed from: e  reason: collision with root package name */
    public final p f6072e;
    public final Uri f;

    public b(p activity, CropImageView cropImageView, Uri uri) {
        i.g(activity, "activity");
        i.g(cropImageView, "cropImageView");
        i.g(uri, "uri");
        this.f6072e = activity;
        this.f = uri;
        this.f6070c = new WeakReference<>(cropImageView);
        Resources resources = cropImageView.getResources();
        i.f(resources, "cropImageView.resources");
        DisplayMetrics displayMetrics = resources.getDisplayMetrics();
        float f = displayMetrics.density;
        double d10 = f > ((float) 1) ? 1.0d / f : 1.0d;
        this.f6068a = (int) (displayMetrics.widthPixels * d10);
        this.f6069b = (int) (displayMetrics.heightPixels * d10);
    }

    /* compiled from: BitmapLoadingWorkerJob.kt */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final Uri f6073a;

        /* renamed from: b  reason: collision with root package name */
        public final Bitmap f6074b;

        /* renamed from: c  reason: collision with root package name */
        public final int f6075c;

        /* renamed from: d  reason: collision with root package name */
        public final int f6076d;

        /* renamed from: e  reason: collision with root package name */
        public final Exception f6077e;

        public a(Uri uri, Bitmap bitmap, int i6, int i10) {
            i.g(uri, "uri");
            this.f6073a = uri;
            this.f6074b = bitmap;
            this.f6075c = i6;
            this.f6076d = i10;
            this.f6077e = null;
        }

        public a(Uri uri, Exception exc) {
            i.g(uri, "uri");
            this.f6073a = uri;
            this.f6074b = null;
            this.f6075c = 0;
            this.f6076d = 0;
            this.f6077e = exc;
        }
    }
}
