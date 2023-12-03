package xb;

import android.graphics.Paint;
import android.graphics.Path;
import j0.d;
/* compiled from: ShadowRenderer.java */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: i  reason: collision with root package name */
    public static final int[] f37710i = new int[3];

    /* renamed from: j  reason: collision with root package name */
    public static final float[] f37711j = {0.0f, 0.5f, 1.0f};

    /* renamed from: k  reason: collision with root package name */
    public static final int[] f37712k = new int[4];

    /* renamed from: l  reason: collision with root package name */
    public static final float[] f37713l = {0.0f, 0.0f, 0.5f, 1.0f};

    /* renamed from: a  reason: collision with root package name */
    public final Paint f37714a;

    /* renamed from: b  reason: collision with root package name */
    public final Paint f37715b;

    /* renamed from: c  reason: collision with root package name */
    public final Paint f37716c;

    /* renamed from: d  reason: collision with root package name */
    public int f37717d;

    /* renamed from: e  reason: collision with root package name */
    public int f37718e;
    public int f;

    /* renamed from: g  reason: collision with root package name */
    public final Path f37719g = new Path();

    /* renamed from: h  reason: collision with root package name */
    public final Paint f37720h;

    public a() {
        Paint paint = new Paint();
        this.f37720h = paint;
        this.f37714a = new Paint();
        a(-16777216);
        paint.setColor(0);
        Paint paint2 = new Paint(4);
        this.f37715b = paint2;
        paint2.setStyle(Paint.Style.FILL);
        this.f37716c = new Paint(paint2);
    }

    public final void a(int i6) {
        this.f37717d = d.h(i6, 68);
        this.f37718e = d.h(i6, 20);
        this.f = d.h(i6, 0);
        this.f37714a.setColor(this.f37717d);
    }
}
