package t4;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import g0.a;
import i0.f;
/* compiled from: DrawableDecoderCompat.java */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static volatile boolean f32405a = true;

    public static Drawable a(Context context, Context context2, int i6, Resources.Theme theme) {
        Context context3;
        try {
            if (f32405a) {
                if (theme != null) {
                    context3 = new k.c(context2, theme);
                } else {
                    context3 = context2;
                }
                return hc.d.H(context3, i6);
            }
        } catch (Resources.NotFoundException unused) {
        } catch (IllegalStateException e10) {
            if (!context.getPackageName().equals(context2.getPackageName())) {
                Object obj = g0.a.f16164a;
                return a.c.b(context2, i6);
            }
            throw e10;
        } catch (NoClassDefFoundError unused2) {
            f32405a = false;
        }
        if (theme == null) {
            theme = context2.getTheme();
        }
        Resources resources = context2.getResources();
        ThreadLocal<TypedValue> threadLocal = f.f19628a;
        return f.a.a(resources, i6, theme);
    }
}
