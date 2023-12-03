package ab;

import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
/* compiled from: AnimationUtils.java */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final LinearInterpolator f449a = new LinearInterpolator();

    /* renamed from: b  reason: collision with root package name */
    public static final i1.b f450b = new i1.b();

    /* renamed from: c  reason: collision with root package name */
    public static final i1.a f451c = new i1.a();

    /* renamed from: d  reason: collision with root package name */
    public static final i1.c f452d = new i1.c();

    /* renamed from: e  reason: collision with root package name */
    public static final DecelerateInterpolator f453e = new DecelerateInterpolator();

    public static float a(float f, float f2, float f10, float f11, float f12) {
        if (f12 <= f10) {
            return f;
        }
        if (f12 >= f11) {
            return f2;
        }
        return defpackage.e.e(f2, f, (f12 - f10) / (f11 - f10), f);
    }

    public static int b(float f, int i6, int i10) {
        return Math.round(f * (i10 - i6)) + i6;
    }
}
