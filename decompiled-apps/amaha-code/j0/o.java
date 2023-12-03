package j0;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView;
import i0.d;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.File;
import java.io.InputStream;
/* compiled from: TypefaceCompatBaseImpl.java */
/* loaded from: classes.dex */
public class o {

    /* compiled from: TypefaceCompatBaseImpl.java */
    /* loaded from: classes.dex */
    public interface a<T> {
        int a(T t3);

        boolean b(T t3);
    }

    public o() {
        new ConcurrentHashMap();
    }

    public static <T> T e(T[] tArr, int i6, a<T> aVar) {
        int i10;
        boolean z10;
        int i11;
        if ((i6 & 1) == 0) {
            i10 = 400;
        } else {
            i10 = 700;
        }
        if ((i6 & 2) != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        T t3 = null;
        int i12 = SubsamplingScaleImageView.TILE_SIZE_AUTO;
        for (T t10 : tArr) {
            int abs = Math.abs(aVar.a(t10) - i10) * 2;
            if (aVar.b(t10) == z10) {
                i11 = 0;
            } else {
                i11 = 1;
            }
            int i13 = abs + i11;
            if (t3 == null || i12 > i13) {
                t3 = t10;
                i12 = i13;
            }
        }
        return t3;
    }

    public Typeface a(Context context, d.c cVar, Resources resources, int i6) {
        throw null;
    }

    public Typeface b(Context context, p0.m[] mVarArr, int i6) {
        throw null;
    }

    public Typeface c(Context context, InputStream inputStream) {
        File d10 = p.d(context);
        if (d10 == null) {
            return null;
        }
        try {
            if (!p.c(d10, inputStream)) {
                return null;
            }
            return Typeface.createFromFile(d10.getPath());
        } catch (RuntimeException unused) {
            return null;
        } finally {
            d10.delete();
        }
    }

    public Typeface d(Context context, Resources resources, int i6, String str, int i10) {
        File d10 = p.d(context);
        if (d10 == null) {
            return null;
        }
        try {
            if (!p.b(d10, resources, i6)) {
                return null;
            }
            return Typeface.createFromFile(d10.getPath());
        } catch (RuntimeException unused) {
            return null;
        } finally {
            d10.delete();
        }
    }

    public p0.m f(int i6, p0.m[] mVarArr) {
        return (p0.m) e(mVarArr, i6, new n());
    }
}
