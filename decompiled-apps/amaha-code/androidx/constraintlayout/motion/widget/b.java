package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.RectF;
import android.util.Xml;
import android.view.View;
import android.view.ViewGroup;
import tr.r;
/* compiled from: TouchResponse.java */
/* loaded from: classes.dex */
public final class b {
    public static final float[][] E = {new float[]{0.5f, 0.0f}, new float[]{0.0f, 0.5f}, new float[]{1.0f, 0.5f}, new float[]{0.5f, 1.0f}, new float[]{0.5f, 0.5f}, new float[]{0.0f, 0.5f}, new float[]{1.0f, 0.5f}};
    public static final float[][] F = {new float[]{0.0f, -1.0f}, new float[]{0.0f, 1.0f}, new float[]{-1.0f, 0.0f}, new float[]{1.0f, 0.0f}, new float[]{-1.0f, 0.0f}, new float[]{1.0f, 0.0f}};
    public float A;
    public float B;
    public int C;
    public int D;

    /* renamed from: a  reason: collision with root package name */
    public int f1691a;

    /* renamed from: b  reason: collision with root package name */
    public int f1692b;

    /* renamed from: c  reason: collision with root package name */
    public int f1693c;

    /* renamed from: d  reason: collision with root package name */
    public int f1694d;

    /* renamed from: e  reason: collision with root package name */
    public int f1695e;
    public int f;

    /* renamed from: g  reason: collision with root package name */
    public float f1696g;

    /* renamed from: h  reason: collision with root package name */
    public float f1697h;

    /* renamed from: i  reason: collision with root package name */
    public int f1698i;

    /* renamed from: j  reason: collision with root package name */
    public boolean f1699j;

    /* renamed from: k  reason: collision with root package name */
    public float f1700k;

    /* renamed from: l  reason: collision with root package name */
    public float f1701l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f1702m = false;

    /* renamed from: n  reason: collision with root package name */
    public final float[] f1703n = new float[2];

    /* renamed from: o  reason: collision with root package name */
    public final int[] f1704o = new int[2];

    /* renamed from: p  reason: collision with root package name */
    public float f1705p;

    /* renamed from: q  reason: collision with root package name */
    public float f1706q;
    public final MotionLayout r;

    /* renamed from: s  reason: collision with root package name */
    public float f1707s;

    /* renamed from: t  reason: collision with root package name */
    public float f1708t;

    /* renamed from: u  reason: collision with root package name */
    public boolean f1709u;

    /* renamed from: v  reason: collision with root package name */
    public float f1710v;

    /* renamed from: w  reason: collision with root package name */
    public int f1711w;

    /* renamed from: x  reason: collision with root package name */
    public float f1712x;

    /* renamed from: y  reason: collision with root package name */
    public float f1713y;

    /* renamed from: z  reason: collision with root package name */
    public float f1714z;

    public b(Context context, MotionLayout motionLayout, XmlResourceParser xmlResourceParser) {
        this.f1691a = 0;
        this.f1692b = 0;
        this.f1693c = 0;
        this.f1694d = -1;
        this.f1695e = -1;
        this.f = -1;
        this.f1696g = 0.5f;
        this.f1697h = 0.5f;
        this.f1698i = -1;
        this.f1699j = false;
        this.f1700k = 0.0f;
        this.f1701l = 1.0f;
        this.f1707s = 4.0f;
        this.f1708t = 1.2f;
        this.f1709u = true;
        this.f1710v = 1.0f;
        this.f1711w = 0;
        this.f1712x = 10.0f;
        this.f1713y = 10.0f;
        this.f1714z = 1.0f;
        this.A = Float.NaN;
        this.B = Float.NaN;
        this.C = 0;
        this.D = 0;
        this.r = motionLayout;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), r.N);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i6 = 0; i6 < indexCount; i6++) {
            int index = obtainStyledAttributes.getIndex(i6);
            if (index == 16) {
                this.f1694d = obtainStyledAttributes.getResourceId(index, this.f1694d);
            } else if (index == 17) {
                int i10 = obtainStyledAttributes.getInt(index, this.f1691a);
                this.f1691a = i10;
                float[] fArr = E[i10];
                this.f1697h = fArr[0];
                this.f1696g = fArr[1];
            } else if (index == 1) {
                int i11 = obtainStyledAttributes.getInt(index, this.f1692b);
                this.f1692b = i11;
                if (i11 < 6) {
                    float[] fArr2 = F[i11];
                    this.f1700k = fArr2[0];
                    this.f1701l = fArr2[1];
                } else {
                    this.f1701l = Float.NaN;
                    this.f1700k = Float.NaN;
                    this.f1699j = true;
                }
            } else if (index == 6) {
                this.f1707s = obtainStyledAttributes.getFloat(index, this.f1707s);
            } else if (index == 5) {
                this.f1708t = obtainStyledAttributes.getFloat(index, this.f1708t);
            } else if (index == 7) {
                this.f1709u = obtainStyledAttributes.getBoolean(index, this.f1709u);
            } else if (index == 2) {
                this.f1710v = obtainStyledAttributes.getFloat(index, this.f1710v);
            } else if (index == 3) {
                this.f1712x = obtainStyledAttributes.getFloat(index, this.f1712x);
            } else if (index == 18) {
                this.f1695e = obtainStyledAttributes.getResourceId(index, this.f1695e);
            } else if (index == 9) {
                this.f1693c = obtainStyledAttributes.getInt(index, this.f1693c);
            } else if (index == 8) {
                this.f1711w = obtainStyledAttributes.getInteger(index, 0);
            } else if (index == 4) {
                this.f = obtainStyledAttributes.getResourceId(index, 0);
            } else if (index == 10) {
                this.f1698i = obtainStyledAttributes.getResourceId(index, this.f1698i);
            } else if (index == 12) {
                this.f1713y = obtainStyledAttributes.getFloat(index, this.f1713y);
            } else if (index == 13) {
                this.f1714z = obtainStyledAttributes.getFloat(index, this.f1714z);
            } else if (index == 14) {
                this.A = obtainStyledAttributes.getFloat(index, this.A);
            } else if (index == 15) {
                this.B = obtainStyledAttributes.getFloat(index, this.B);
            } else if (index == 11) {
                this.C = obtainStyledAttributes.getInt(index, this.C);
            } else if (index == 0) {
                this.D = obtainStyledAttributes.getInt(index, this.D);
            }
        }
        obtainStyledAttributes.recycle();
    }

    public final RectF a(MotionLayout motionLayout, RectF rectF) {
        View findViewById;
        int i6 = this.f;
        if (i6 == -1 || (findViewById = motionLayout.findViewById(i6)) == null) {
            return null;
        }
        rectF.set(findViewById.getLeft(), findViewById.getTop(), findViewById.getRight(), findViewById.getBottom());
        return rectF;
    }

    public final RectF b(ViewGroup viewGroup, RectF rectF) {
        View findViewById;
        int i6 = this.f1695e;
        if (i6 == -1 || (findViewById = viewGroup.findViewById(i6)) == null) {
            return null;
        }
        rectF.set(findViewById.getLeft(), findViewById.getTop(), findViewById.getRight(), findViewById.getBottom());
        return rectF;
    }

    public final void c(boolean z10) {
        float[][] fArr = E;
        float[][] fArr2 = F;
        if (z10) {
            fArr2[4] = fArr2[3];
            fArr2[5] = fArr2[2];
            fArr[5] = fArr[2];
            fArr[6] = fArr[1];
        } else {
            fArr2[4] = fArr2[2];
            fArr2[5] = fArr2[3];
            fArr[5] = fArr[1];
            fArr[6] = fArr[2];
        }
        float[] fArr3 = fArr[this.f1691a];
        this.f1697h = fArr3[0];
        this.f1696g = fArr3[1];
        int i6 = this.f1692b;
        if (i6 >= 6) {
            return;
        }
        float[] fArr4 = fArr2[i6];
        this.f1700k = fArr4[0];
        this.f1701l = fArr4[1];
    }

    public final String toString() {
        if (Float.isNaN(this.f1700k)) {
            return "rotation";
        }
        return this.f1700k + " , " + this.f1701l;
    }
}
