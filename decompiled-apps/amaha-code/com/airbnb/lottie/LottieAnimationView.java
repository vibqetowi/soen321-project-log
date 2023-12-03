package com.airbnb.lottie;

import a3.f;
import a3.h;
import a3.j;
import a3.m;
import a3.n;
import a3.o;
import a3.r;
import a3.t;
import a3.u;
import a3.v;
import android.animation.Animator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.PathMeasure;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.provider.Settings;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;
import f3.e;
import java.io.ByteArrayInputStream;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.net.UnknownServiceException;
import java.nio.channels.ClosedChannelException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.WeakHashMap;
import javax.net.ssl.SSLException;
import m3.g;
import s1.s;
import t0.d0;
import t0.o0;
/* loaded from: classes.dex */
public class LottieAnimationView extends AppCompatImageView {
    public static final a O = new a();
    public int A;
    public final j B;
    public boolean C;
    public String D;
    public int E;
    public boolean F;
    public boolean G;
    public boolean H;
    public boolean I;
    public t J;
    public final HashSet K;
    public int L;
    public r<a3.c> M;
    public a3.c N;

    /* renamed from: x  reason: collision with root package name */
    public final b f5844x;

    /* renamed from: y  reason: collision with root package name */
    public final c f5845y;

    /* renamed from: z  reason: collision with root package name */
    public m<Throwable> f5846z;

    /* loaded from: classes.dex */
    public class a implements m<Throwable> {
        @Override // a3.m
        public final void onResult(Throwable th2) {
            boolean z10;
            Throwable th3 = th2;
            PathMeasure pathMeasure = g.f24799a;
            if (!(th3 instanceof SocketException) && !(th3 instanceof ClosedChannelException) && !(th3 instanceof InterruptedIOException) && !(th3 instanceof ProtocolException) && !(th3 instanceof SSLException) && !(th3 instanceof UnknownHostException) && !(th3 instanceof UnknownServiceException)) {
                z10 = false;
            } else {
                z10 = true;
            }
            if (z10) {
                m3.c.f24792a.getClass();
                HashSet hashSet = m3.b.f24791a;
                if (!hashSet.contains("Unable to load composition.")) {
                    Log.w("LOTTIE", "Unable to load composition.", th3);
                    hashSet.add("Unable to load composition.");
                    return;
                }
                return;
            }
            throw new IllegalStateException("Unable to parse composition", th3);
        }
    }

    /* loaded from: classes.dex */
    public class b implements m<a3.c> {
        public b() {
        }

        @Override // a3.m
        public final void onResult(a3.c cVar) {
            LottieAnimationView.this.setComposition(cVar);
        }
    }

    /* loaded from: classes.dex */
    public class c implements m<Throwable> {
        public c() {
        }

        @Override // a3.m
        public final void onResult(Throwable th2) {
            Throwable th3 = th2;
            LottieAnimationView lottieAnimationView = LottieAnimationView.this;
            int i6 = lottieAnimationView.A;
            if (i6 != 0) {
                lottieAnimationView.setImageResource(i6);
            }
            m mVar = lottieAnimationView.f5846z;
            if (mVar == null) {
                mVar = LottieAnimationView.O;
            }
            mVar.onResult(th3);
        }
    }

    /* loaded from: classes.dex */
    public static class d extends View.BaseSavedState {
        public static final Parcelable.Creator<d> CREATOR = new a();
        public int A;

        /* renamed from: u  reason: collision with root package name */
        public String f5849u;

        /* renamed from: v  reason: collision with root package name */
        public int f5850v;

        /* renamed from: w  reason: collision with root package name */
        public float f5851w;

        /* renamed from: x  reason: collision with root package name */
        public boolean f5852x;

        /* renamed from: y  reason: collision with root package name */
        public String f5853y;

        /* renamed from: z  reason: collision with root package name */
        public int f5854z;

        /* loaded from: classes.dex */
        public class a implements Parcelable.Creator<d> {
            @Override // android.os.Parcelable.Creator
            public final d createFromParcel(Parcel parcel) {
                return new d(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public final d[] newArray(int i6) {
                return new d[i6];
            }
        }

        public d(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i6) {
            super.writeToParcel(parcel, i6);
            parcel.writeString(this.f5849u);
            parcel.writeFloat(this.f5851w);
            parcel.writeInt(this.f5852x ? 1 : 0);
            parcel.writeString(this.f5853y);
            parcel.writeInt(this.f5854z);
            parcel.writeInt(this.A);
        }

        public d(Parcel parcel) {
            super(parcel);
            this.f5849u = parcel.readString();
            this.f5851w = parcel.readFloat();
            this.f5852x = parcel.readInt() == 1;
            this.f5853y = parcel.readString();
            this.f5854z = parcel.readInt();
            this.A = parcel.readInt();
        }
    }

    public LottieAnimationView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        String string;
        this.f5844x = new b();
        this.f5845y = new c();
        this.A = 0;
        j jVar = new j();
        this.B = jVar;
        this.F = false;
        this.G = false;
        this.H = false;
        this.I = true;
        this.J = t.AUTOMATIC;
        this.K = new HashSet();
        this.L = 0;
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, ca.a.f5218w);
        if (!isInEditMode()) {
            this.I = obtainStyledAttributes.getBoolean(1, true);
            boolean hasValue = obtainStyledAttributes.hasValue(9);
            boolean hasValue2 = obtainStyledAttributes.hasValue(5);
            boolean hasValue3 = obtainStyledAttributes.hasValue(15);
            if (hasValue && hasValue2) {
                throw new IllegalArgumentException("lottie_rawRes and lottie_fileName cannot be used at the same time. Please use only one at once.");
            }
            if (hasValue) {
                int resourceId = obtainStyledAttributes.getResourceId(9, 0);
                if (resourceId != 0) {
                    setAnimation(resourceId);
                }
            } else if (hasValue2) {
                String string2 = obtainStyledAttributes.getString(5);
                if (string2 != null) {
                    setAnimation(string2);
                }
            } else if (hasValue3 && (string = obtainStyledAttributes.getString(15)) != null) {
                setAnimationFromUrl(string);
            }
            setFallbackResource(obtainStyledAttributes.getResourceId(4, 0));
        }
        if (obtainStyledAttributes.getBoolean(0, false)) {
            this.G = true;
            this.H = true;
        }
        if (obtainStyledAttributes.getBoolean(7, false)) {
            jVar.f208w.setRepeatCount(-1);
        }
        if (obtainStyledAttributes.hasValue(12)) {
            setRepeatMode(obtainStyledAttributes.getInt(12, 1));
        }
        if (obtainStyledAttributes.hasValue(11)) {
            setRepeatCount(obtainStyledAttributes.getInt(11, -1));
        }
        if (obtainStyledAttributes.hasValue(14)) {
            setSpeed(obtainStyledAttributes.getFloat(14, 1.0f));
        }
        setImageAssetsFolder(obtainStyledAttributes.getString(6));
        setProgress(obtainStyledAttributes.getFloat(8, 0.0f));
        boolean z10 = obtainStyledAttributes.getBoolean(3, false);
        if (jVar.F != z10) {
            jVar.F = z10;
            if (jVar.f207v != null) {
                jVar.b();
            }
        }
        if (obtainStyledAttributes.hasValue(2)) {
            jVar.a(new e("**"), o.C, new s(new u(obtainStyledAttributes.getColor(2, 0))));
        }
        if (obtainStyledAttributes.hasValue(13)) {
            jVar.f209x = obtainStyledAttributes.getFloat(13, 1.0f);
            jVar.p();
        }
        if (obtainStyledAttributes.hasValue(10)) {
            int i6 = obtainStyledAttributes.getInt(10, 0);
            setRenderMode(t.values()[i6 >= t.values().length ? 0 : i6]);
        }
        if (getScaleType() != null) {
            jVar.B = getScaleType();
        }
        obtainStyledAttributes.recycle();
        Context context2 = getContext();
        PathMeasure pathMeasure = g.f24799a;
        jVar.f210y = Boolean.valueOf(Settings.Global.getFloat(context2.getContentResolver(), "animator_duration_scale", 1.0f) != 0.0f).booleanValue();
        f();
        this.C = true;
    }

    private void setCompositionTask(r<a3.c> rVar) {
        this.N = null;
        this.B.c();
        e();
        rVar.b(this.f5844x);
        c cVar = this.f5845y;
        synchronized (rVar) {
            if (rVar.f275d != null && rVar.f275d.f269b != null) {
                cVar.onResult(rVar.f275d.f269b);
            }
            rVar.f273b.add(cVar);
        }
        this.M = rVar;
    }

    @Override // android.view.View
    public final void buildDrawingCache(boolean z10) {
        this.L++;
        super.buildDrawingCache(z10);
        if (this.L == 1 && getWidth() > 0 && getHeight() > 0 && getLayerType() == 1 && getDrawingCache(z10) == null) {
            setRenderMode(t.HARDWARE);
        }
        this.L--;
        hc.d.s();
    }

    public final void c(Animator.AnimatorListener animatorListener) {
        this.B.f208w.addListener(animatorListener);
    }

    public final void d() {
        this.F = false;
        j jVar = this.B;
        jVar.A.clear();
        jVar.f208w.cancel();
        f();
    }

    public final void e() {
        r<a3.c> rVar = this.M;
        if (rVar != null) {
            b bVar = this.f5844x;
            synchronized (rVar) {
                rVar.f272a.remove(bVar);
            }
            this.M.c(this.f5845y);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0027, code lost:
        if (r3 != false) goto L5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x000a, code lost:
        if (r0 != 1) goto L4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x000c, code lost:
        r1 = 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void f() {
        int ordinal = this.J.ordinal();
        int i6 = 2;
        if (ordinal == 0) {
            a3.c cVar = this.N;
            boolean z10 = false;
            if ((cVar == null || !cVar.f188n || Build.VERSION.SDK_INT >= 28) && (cVar == null || cVar.f189o <= 4)) {
                z10 = true;
            }
        }
        if (i6 != getLayerType()) {
            setLayerType(i6, null);
        }
    }

    public final void g() {
        this.H = false;
        this.G = false;
        this.F = false;
        j jVar = this.B;
        jVar.A.clear();
        jVar.f208w.e(true);
        f();
    }

    public a3.c getComposition() {
        return this.N;
    }

    public long getDuration() {
        a3.c cVar = this.N;
        if (cVar != null) {
            return cVar.b();
        }
        return 0L;
    }

    public int getFrame() {
        return (int) this.B.f208w.f24796z;
    }

    public String getImageAssetsFolder() {
        return this.B.D;
    }

    public float getMaxFrame() {
        return this.B.f208w.b();
    }

    public float getMinFrame() {
        return this.B.f208w.c();
    }

    public a3.s getPerformanceTracker() {
        a3.c cVar = this.B.f207v;
        if (cVar != null) {
            return cVar.f176a;
        }
        return null;
    }

    public float getProgress() {
        m3.d dVar = this.B.f208w;
        a3.c cVar = dVar.D;
        if (cVar == null) {
            return 0.0f;
        }
        float f = dVar.f24796z;
        float f2 = cVar.f185k;
        return (f - f2) / (cVar.f186l - f2);
    }

    public int getRepeatCount() {
        return this.B.f208w.getRepeatCount();
    }

    public int getRepeatMode() {
        return this.B.f208w.getRepeatMode();
    }

    public float getScale() {
        return this.B.f209x;
    }

    public float getSpeed() {
        return this.B.f208w.f24793w;
    }

    public final void h() {
        if (isShown()) {
            this.B.e();
            f();
            return;
        }
        this.F = true;
    }

    public final void i() {
        this.B.f208w.removeAllListeners();
    }

    @Override // android.widget.ImageView, android.view.View, android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        Drawable drawable2 = getDrawable();
        j jVar = this.B;
        if (drawable2 == jVar) {
            super.invalidateDrawable(jVar);
        } else {
            super.invalidateDrawable(drawable);
        }
    }

    public final void j() {
        if (isShown()) {
            this.B.f();
            f();
            return;
        }
        this.F = true;
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.H || this.G) {
            h();
            this.H = false;
            this.G = false;
        }
        if (Build.VERSION.SDK_INT < 23) {
            onVisibilityChanged(this, getVisibility());
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onDetachedFromWindow() {
        boolean z10;
        m3.d dVar = this.B.f208w;
        if (dVar == null) {
            z10 = false;
        } else {
            z10 = dVar.E;
        }
        if (z10) {
            d();
            this.G = true;
        }
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof d)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        d dVar = (d) parcelable;
        super.onRestoreInstanceState(dVar.getSuperState());
        String str = dVar.f5849u;
        this.D = str;
        if (!TextUtils.isEmpty(str)) {
            setAnimation(this.D);
        }
        int i6 = dVar.f5850v;
        this.E = i6;
        if (i6 != 0) {
            setAnimation(i6);
        }
        setProgress(dVar.f5851w);
        if (dVar.f5852x) {
            h();
        }
        this.B.D = dVar.f5853y;
        setRepeatMode(dVar.f5854z);
        setRepeatCount(dVar.A);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x003a, code lost:
        if (r6.G != false) goto L15;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Parcelable onSaveInstanceState() {
        float f;
        boolean z10;
        d dVar = new d(super.onSaveInstanceState());
        dVar.f5849u = this.D;
        dVar.f5850v = this.E;
        j jVar = this.B;
        m3.d dVar2 = jVar.f208w;
        a3.c cVar = dVar2.D;
        if (cVar == null) {
            f = 0.0f;
        } else {
            float f2 = dVar2.f24796z;
            float f10 = cVar.f185k;
            f = (f2 - f10) / (cVar.f186l - f10);
        }
        dVar.f5851w = f;
        boolean z11 = false;
        if (dVar2 == null) {
            z10 = false;
        } else {
            z10 = dVar2.E;
        }
        if (!z10) {
            WeakHashMap<View, o0> weakHashMap = d0.f32288a;
            if (!d0.g.b(this)) {
            }
            dVar.f5852x = z11;
            dVar.f5853y = jVar.D;
            m3.d dVar3 = jVar.f208w;
            dVar.f5854z = dVar3.getRepeatMode();
            dVar.A = dVar3.getRepeatCount();
            return dVar;
        }
        z11 = true;
        dVar.f5852x = z11;
        dVar.f5853y = jVar.D;
        m3.d dVar32 = jVar.f208w;
        dVar.f5854z = dVar32.getRepeatMode();
        dVar.A = dVar32.getRepeatCount();
        return dVar;
    }

    @Override // android.view.View
    public final void onVisibilityChanged(View view, int i6) {
        if (!this.C) {
            return;
        }
        boolean z10 = false;
        if (isShown()) {
            if (this.F) {
                j();
                this.F = false;
                return;
            }
            return;
        }
        m3.d dVar = this.B.f208w;
        if (dVar != null) {
            z10 = dVar.E;
        }
        if (z10) {
            g();
            this.F = true;
        }
    }

    public void setAnimation(int i6) {
        this.E = i6;
        this.D = null;
        setCompositionTask(this.I ? a3.d.e(i6, getContext()) : a3.d.f(getContext(), null, i6));
    }

    @Deprecated
    public void setAnimationFromJson(String str) {
        setCompositionTask(a3.d.a(null, new h(new ByteArrayInputStream(str.getBytes()))));
    }

    public void setAnimationFromUrl(String str) {
        r<a3.c> a10;
        if (this.I) {
            Context context = getContext();
            HashMap hashMap = a3.d.f190a;
            a10 = a3.d.a(defpackage.c.r("url_", str), new a3.e(context, str));
        } else {
            a10 = a3.d.a(null, new a3.e(getContext(), str));
        }
        setCompositionTask(a10);
    }

    public void setApplyingOpacityToLayersEnabled(boolean z10) {
        this.B.J = z10;
    }

    public void setCacheComposition(boolean z10) {
        this.I = z10;
    }

    public void setComposition(a3.c cVar) {
        j jVar = this.B;
        jVar.setCallback(this);
        this.N = cVar;
        boolean z10 = false;
        if (jVar.f207v != cVar) {
            jVar.L = false;
            jVar.c();
            jVar.f207v = cVar;
            jVar.b();
            m3.d dVar = jVar.f208w;
            if (dVar.D == null) {
                z10 = true;
            }
            dVar.D = cVar;
            if (z10) {
                dVar.h((int) Math.max(dVar.B, cVar.f185k), (int) Math.min(dVar.C, cVar.f186l));
            } else {
                dVar.h((int) cVar.f185k, (int) cVar.f186l);
            }
            float f = dVar.f24796z;
            dVar.f24796z = 0.0f;
            dVar.f((int) f);
            jVar.o(dVar.getAnimatedFraction());
            jVar.f209x = jVar.f209x;
            jVar.p();
            jVar.p();
            ArrayList<j.n> arrayList = jVar.A;
            Iterator it = new ArrayList(arrayList).iterator();
            while (it.hasNext()) {
                ((j.n) it.next()).run();
                it.remove();
            }
            arrayList.clear();
            cVar.f176a.f277a = jVar.I;
            z10 = true;
        }
        f();
        if (getDrawable() == jVar && !z10) {
            return;
        }
        setImageDrawable(null);
        setImageDrawable(jVar);
        onVisibilityChanged(this, getVisibility());
        requestLayout();
        Iterator it2 = this.K.iterator();
        while (it2.hasNext()) {
            ((n) it2.next()).a();
        }
    }

    public void setFailureListener(m<Throwable> mVar) {
        this.f5846z = mVar;
    }

    public void setFallbackResource(int i6) {
        this.A = i6;
    }

    public void setFontAssetDelegate(a3.a aVar) {
        e3.a aVar2 = this.B.E;
    }

    public void setFrame(int i6) {
        this.B.g(i6);
    }

    public void setImageAssetDelegate(a3.b bVar) {
        e3.b bVar2 = this.B.C;
    }

    public void setImageAssetsFolder(String str) {
        this.B.D = str;
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        e();
        super.setImageBitmap(bitmap);
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        e();
        super.setImageDrawable(drawable);
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageResource(int i6) {
        e();
        super.setImageResource(i6);
    }

    public void setMaxFrame(int i6) {
        this.B.h(i6);
    }

    public void setMaxProgress(float f) {
        this.B.j(f);
    }

    public void setMinAndMaxFrame(String str) {
        this.B.k(str);
    }

    public void setMinFrame(int i6) {
        this.B.l(i6);
    }

    public void setMinProgress(float f) {
        this.B.n(f);
    }

    public void setPerformanceTrackingEnabled(boolean z10) {
        j jVar = this.B;
        jVar.I = z10;
        a3.c cVar = jVar.f207v;
        if (cVar != null) {
            cVar.f176a.f277a = z10;
        }
    }

    public void setProgress(float f) {
        this.B.o(f);
    }

    public void setRenderMode(t tVar) {
        this.J = tVar;
        f();
    }

    public void setRepeatCount(int i6) {
        this.B.f208w.setRepeatCount(i6);
    }

    public void setRepeatMode(int i6) {
        this.B.f208w.setRepeatMode(i6);
    }

    public void setSafeMode(boolean z10) {
        this.B.f211z = z10;
    }

    public void setScale(float f) {
        j jVar = this.B;
        jVar.f209x = f;
        jVar.p();
        if (getDrawable() == jVar) {
            setImageDrawable(null);
            setImageDrawable(jVar);
        }
    }

    @Override // android.widget.ImageView
    public void setScaleType(ImageView.ScaleType scaleType) {
        super.setScaleType(scaleType);
        j jVar = this.B;
        if (jVar != null) {
            jVar.B = scaleType;
        }
    }

    public void setSpeed(float f) {
        this.B.f208w.f24793w = f;
    }

    public void setTextDelegate(v vVar) {
        this.B.getClass();
    }

    public void setMaxFrame(String str) {
        this.B.i(str);
    }

    public void setMinFrame(String str) {
        this.B.m(str);
    }

    public void setAnimation(String str) {
        r<a3.c> a10;
        this.D = str;
        this.E = 0;
        if (this.I) {
            Context context = getContext();
            HashMap hashMap = a3.d.f190a;
            String r = defpackage.c.r("asset_", str);
            a10 = a3.d.a(r, new f(context.getApplicationContext(), str, r));
        } else {
            Context context2 = getContext();
            HashMap hashMap2 = a3.d.f190a;
            a10 = a3.d.a(null, new f(context2.getApplicationContext(), str, null));
        }
        setCompositionTask(a10);
    }
}
