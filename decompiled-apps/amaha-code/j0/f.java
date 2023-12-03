package j0;

import android.graphics.Paint;
import android.graphics.Rect;
/* compiled from: PaintCompat.java */
/* loaded from: classes.dex */
public final class f {

    /* renamed from: a  reason: collision with root package name */
    public static final ThreadLocal<s0.c<Rect, Rect>> f21627a = new ThreadLocal<>();

    /* compiled from: PaintCompat.java */
    /* loaded from: classes.dex */
    public static class a {
        public static boolean a(Paint paint, String str) {
            boolean hasGlyph;
            hasGlyph = paint.hasGlyph(str);
            return hasGlyph;
        }
    }
}
