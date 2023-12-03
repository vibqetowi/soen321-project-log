package i3;

import a3.j;
import a3.l;
import a3.o;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.PathMeasure;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import android.view.View;
import d3.m;
import java.io.IOException;
import java.util.HashSet;
import s1.s;
/* compiled from: ImageLayer.java */
/* loaded from: classes.dex */
public final class d extends b {

    /* renamed from: v  reason: collision with root package name */
    public final b3.a f19767v;

    /* renamed from: w  reason: collision with root package name */
    public final Rect f19768w;

    /* renamed from: x  reason: collision with root package name */
    public final Rect f19769x;

    /* renamed from: y  reason: collision with root package name */
    public m f19770y;

    public d(j jVar, e eVar) {
        super(jVar, eVar);
        this.f19767v = new b3.a(3);
        this.f19768w = new Rect();
        this.f19769x = new Rect();
    }

    @Override // i3.b, f3.f
    public final void d(s sVar, Object obj) {
        super.d(sVar, obj);
        if (obj == o.C) {
            if (sVar == null) {
                this.f19770y = null;
            } else {
                this.f19770y = new m(sVar, null);
            }
        }
    }

    @Override // i3.b, c3.d
    public final void e(RectF rectF, Matrix matrix, boolean z10) {
        super.e(rectF, matrix, z10);
        Bitmap p10 = p();
        if (p10 != null) {
            rectF.set(0.0f, 0.0f, m3.g.c() * p10.getWidth(), m3.g.c() * p10.getHeight());
            this.f19753l.mapRect(rectF);
        }
    }

    @Override // i3.b
    public final void j(Canvas canvas, Matrix matrix, int i6) {
        Bitmap p10 = p();
        if (p10 != null && !p10.isRecycled()) {
            float c10 = m3.g.c();
            b3.a aVar = this.f19767v;
            aVar.setAlpha(i6);
            m mVar = this.f19770y;
            if (mVar != null) {
                aVar.setColorFilter((ColorFilter) mVar.f());
            }
            canvas.save();
            canvas.concat(matrix);
            int width = p10.getWidth();
            int height = p10.getHeight();
            Rect rect = this.f19768w;
            rect.set(0, 0, width, height);
            Rect rect2 = this.f19769x;
            rect2.set(0, 0, (int) (p10.getWidth() * c10), (int) (p10.getHeight() * c10));
            canvas.drawBitmap(p10, rect, rect2, aVar);
            canvas.restore();
        }
    }

    public final Bitmap p() {
        e3.b bVar;
        Context context;
        boolean z10;
        Bitmap bitmap;
        String str = this.f19755n.f19776g;
        j jVar = this.f19754m;
        if (jVar.getCallback() == null) {
            bVar = null;
        } else {
            e3.b bVar2 = jVar.C;
            if (bVar2 != null) {
                Drawable.Callback callback = jVar.getCallback();
                if (callback != null && (callback instanceof View)) {
                    context = ((View) callback).getContext();
                } else {
                    context = null;
                }
                Context context2 = bVar2.f13735a;
                if ((context == null && context2 == null) || context2.equals(context)) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (!z10) {
                    jVar.C = null;
                }
            }
            if (jVar.C == null) {
                jVar.C = new e3.b(jVar.getCallback(), jVar.D, jVar.f207v.f179d);
            }
            bVar = jVar.C;
        }
        if (bVar == null) {
            return null;
        }
        String str2 = bVar.f13736b;
        l lVar = bVar.f13737c.get(str);
        if (lVar == null) {
            return null;
        }
        Bitmap bitmap2 = lVar.f243d;
        if (bitmap2 != null) {
            return bitmap2;
        }
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inScaled = true;
        options.inDensity = 160;
        String str3 = lVar.f242c;
        if (str3.startsWith("data:") && str3.indexOf("base64,") > 0) {
            try {
                byte[] decode = Base64.decode(str3.substring(str3.indexOf(44) + 1), 0);
                Bitmap decodeByteArray = BitmapFactory.decodeByteArray(decode, 0, decode.length, options);
                synchronized (e3.b.f13734d) {
                    bVar.f13737c.get(str).f243d = decodeByteArray;
                }
                return decodeByteArray;
            } catch (IllegalArgumentException e10) {
                m3.c.f24792a.getClass();
                HashSet hashSet = m3.b.f24791a;
                if (hashSet.contains("data URL did not have correct base64 format.")) {
                    return null;
                }
                Log.w("LOTTIE", "data URL did not have correct base64 format.", e10);
                hashSet.add("data URL did not have correct base64 format.");
                return null;
            }
        }
        try {
            if (!TextUtils.isEmpty(str2)) {
                Bitmap decodeStream = BitmapFactory.decodeStream(bVar.f13735a.getAssets().open(str2 + str3), null, options);
                int i6 = lVar.f240a;
                int i10 = lVar.f241b;
                PathMeasure pathMeasure = m3.g.f24799a;
                if (decodeStream.getWidth() == i6 && decodeStream.getHeight() == i10) {
                    bitmap = decodeStream;
                } else {
                    Bitmap createScaledBitmap = Bitmap.createScaledBitmap(decodeStream, i6, i10, true);
                    decodeStream.recycle();
                    bitmap = createScaledBitmap;
                }
                bVar.a(str, bitmap);
                return bitmap;
            }
            throw new IllegalStateException("You must set an images folder before loading an image. Set it with LottieComposition#setImagesFolder or LottieDrawable#setImagesFolder");
        } catch (IOException e11) {
            m3.c.f24792a.getClass();
            HashSet hashSet2 = m3.b.f24791a;
            if (hashSet2.contains("Unable to open asset.")) {
                return null;
            }
            Log.w("LOTTIE", "Unable to open asset.", e11);
            hashSet2.add("Unable to open asset.");
            return null;
        }
    }
}
