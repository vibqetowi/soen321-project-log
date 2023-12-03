package com.bumptech.glide;

import a5.h;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Looper;
import android.util.Log;
import android.widget.ImageView;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.theinnerhour.b2b.utils.Constants;
import d5.j;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Executor;
import k4.l;
import r4.m;
/* compiled from: RequestBuilder.java */
/* loaded from: classes.dex */
public final class e<TranscodeType> extends z4.a<e<TranscodeType>> {
    public final Context U;
    public final f V;
    public final Class<TranscodeType> W;
    public final c X;
    public g<?, ? super TranscodeType> Y;
    public Object Z;

    /* renamed from: a0  reason: collision with root package name */
    public ArrayList f5952a0;

    /* renamed from: b0  reason: collision with root package name */
    public boolean f5953b0;

    /* compiled from: RequestBuilder.java */
    /* loaded from: classes.dex */
    public static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f5954a;

        /* renamed from: b  reason: collision with root package name */
        public static final /* synthetic */ int[] f5955b;

        static {
            int[] iArr = new int[d.values().length];
            f5955b = iArr;
            try {
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f5955b[2] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f5955b[1] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f5955b[0] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr2 = new int[ImageView.ScaleType.values().length];
            f5954a = iArr2;
            try {
                iArr2[ImageView.ScaleType.CENTER_CROP.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f5954a[ImageView.ScaleType.CENTER_INSIDE.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f5954a[ImageView.ScaleType.FIT_CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f5954a[ImageView.ScaleType.FIT_START.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f5954a[ImageView.ScaleType.FIT_END.ordinal()] = 5;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f5954a[ImageView.ScaleType.FIT_XY.ordinal()] = 6;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f5954a[ImageView.ScaleType.CENTER.ordinal()] = 7;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f5954a[ImageView.ScaleType.MATRIX.ordinal()] = 8;
            } catch (NoSuchFieldError unused12) {
            }
        }
    }

    static {
        ((z4.f) new z4.f().d(l.f22879b).l()).q(true);
    }

    public e(Glide glide, f fVar, Class<TranscodeType> cls, Context context) {
        z4.f fVar2;
        this.V = fVar;
        this.W = cls;
        this.U = context;
        Map<Class<?>, g<?, ?>> map = fVar.f5956u.f5926w.f;
        com.bumptech.glide.a aVar = map.get(cls);
        if (aVar == null) {
            for (Map.Entry<Class<?>, g<?, ?>> entry : map.entrySet()) {
                if (entry.getKey().isAssignableFrom(cls)) {
                    aVar = (g<?, ? super TranscodeType>) entry.getValue();
                }
            }
        }
        this.Y = (g<?, ? super TranscodeType>) (aVar == null ? c.f5939k : aVar);
        this.X = glide.f5926w;
        Iterator<z4.e<Object>> it = fVar.D.iterator();
        while (it.hasNext()) {
            w(it.next());
        }
        synchronized (fVar) {
            fVar2 = fVar.E;
        }
        x(fVar2);
    }

    public final void A(h hVar, z4.d dVar, z4.a aVar, Executor executor) {
        boolean z10;
        kc.f.p(hVar);
        if (this.f5953b0) {
            Object obj = new Object();
            g<?, ? super TranscodeType> gVar = this.Y;
            z4.h D = D(aVar.E, aVar.D, aVar.f39157x, gVar, aVar, dVar, hVar, obj, executor);
            z4.b l2 = hVar.l();
            if (D.g(l2)) {
                if (!aVar.C && l2.d()) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (!z10) {
                    kc.f.p(l2);
                    if (!l2.isRunning()) {
                        l2.c();
                        return;
                    }
                    return;
                }
            }
            this.V.b(hVar);
            hVar.c(D);
            f fVar = this.V;
            synchronized (fVar) {
                fVar.f5961z.f36425u.add(hVar);
                w4.l lVar = fVar.f5959x;
                ((Set) lVar.f36416c).add(D);
                if (!lVar.f36415b) {
                    D.c();
                } else {
                    D.clear();
                    if (Log.isLoggable("RequestTracker", 2)) {
                        Log.v("RequestTracker", "Paused, delaying request");
                    }
                    ((List) lVar.f36417d).add(D);
                }
            }
            return;
        }
        throw new IllegalArgumentException("You must call #load() before calling #into()");
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0098  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void B(ImageView imageView) {
        boolean z10;
        z4.a aVar;
        Class<TranscodeType> cls;
        a5.b bVar;
        char[] cArr = j.f12201a;
        if (Looper.myLooper() == Looper.getMainLooper()) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            kc.f.p(imageView);
            if (!z4.a.h(this.f39154u, Constants.PROFILE_ASSET_DOWNLOAD_JOB_ID) && this.H && imageView.getScaleType() != null) {
                switch (a.f5954a[imageView.getScaleType().ordinal()]) {
                    case 1:
                        aVar = clone().i(r4.h.f30398c, new r4.f());
                        break;
                    case 2:
                        aVar = clone().i(r4.h.f30397b, new r4.g());
                        aVar.S = true;
                        break;
                    case 3:
                    case 4:
                    case 5:
                        aVar = clone().i(r4.h.f30396a, new m());
                        aVar.S = true;
                        break;
                    case 6:
                        aVar = clone().i(r4.h.f30397b, new r4.g());
                        aVar.S = true;
                        break;
                }
                this.X.f5942c.getClass();
                cls = this.W;
                if (!Bitmap.class.equals(cls)) {
                    bVar = new a5.b(imageView, 0);
                } else if (Drawable.class.isAssignableFrom(cls)) {
                    bVar = new a5.b(imageView, 1);
                } else {
                    throw new IllegalArgumentException("Unhandled class: " + cls + ", try .as*(Class).transcode(ResourceTranscoder)");
                }
                A(bVar, null, aVar, d5.e.f12189a);
                return;
            }
            aVar = this;
            this.X.f5942c.getClass();
            cls = this.W;
            if (!Bitmap.class.equals(cls)) {
            }
            A(bVar, null, aVar, d5.e.f12189a);
            return;
        }
        throw new IllegalArgumentException("You must call this method on the main thread");
    }

    public final e<TranscodeType> C(Integer num) {
        PackageInfo packageInfo;
        String uuid;
        this.Z = num;
        this.f5953b0 = true;
        ConcurrentHashMap concurrentHashMap = c5.b.f4986a;
        Context context = this.U;
        String packageName = context.getPackageName();
        ConcurrentHashMap concurrentHashMap2 = c5.b.f4986a;
        h4.e eVar = (h4.e) concurrentHashMap2.get(packageName);
        if (eVar == null) {
            try {
                packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
            } catch (PackageManager.NameNotFoundException e10) {
                Log.e("AppVersionSignature", "Cannot resolve info for" + context.getPackageName(), e10);
                packageInfo = null;
            }
            if (packageInfo != null) {
                uuid = String.valueOf(packageInfo.versionCode);
            } else {
                uuid = UUID.randomUUID().toString();
            }
            c5.d dVar = new c5.d(uuid);
            eVar = (h4.e) concurrentHashMap2.putIfAbsent(packageName, dVar);
            if (eVar == null) {
                eVar = dVar;
            }
        }
        return x(new z4.f().p(new c5.a(context.getResources().getConfiguration().uiMode & 48, eVar)));
    }

    public final z4.h D(int i6, int i10, d dVar, g gVar, z4.a aVar, z4.d dVar2, h hVar, Object obj, Executor executor) {
        Context context = this.U;
        Object obj2 = this.Z;
        Class<TranscodeType> cls = this.W;
        ArrayList arrayList = this.f5952a0;
        c cVar = this.X;
        return new z4.h(context, cVar, obj, obj2, cls, aVar, i6, i10, dVar, hVar, dVar2, arrayList, cVar.f5945g, gVar.f5965u, executor);
    }

    public final z4.d E() {
        z4.d dVar = new z4.d(LinearLayoutManager.INVALID_OFFSET, LinearLayoutManager.INVALID_OFFSET);
        A(dVar, dVar, this, d5.e.f12190b);
        return dVar;
    }

    @Override // z4.a
    public final z4.a a(z4.a aVar) {
        kc.f.p(aVar);
        return (e) super.a(aVar);
    }

    public final void w(z4.e eVar) {
        if (eVar != null) {
            if (this.f5952a0 == null) {
                this.f5952a0 = new ArrayList();
            }
            this.f5952a0.add(eVar);
        }
    }

    public final e<TranscodeType> x(z4.a<?> aVar) {
        kc.f.p(aVar);
        return (e) super.a(aVar);
    }

    @Override // z4.a
    /* renamed from: y */
    public final e<TranscodeType> clone() {
        e<TranscodeType> eVar = (e) super.clone();
        eVar.Y = (g<?, ? super TranscodeType>) eVar.Y.clone();
        return eVar;
    }

    public final void z(h hVar) {
        A(hVar, null, this, d5.e.f12189a);
    }
}
