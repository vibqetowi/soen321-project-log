package com.facebook.shimmer;

import android.content.res.TypedArray;
import android.graphics.RectF;
/* compiled from: Shimmer.java */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final float[] f6114a = new float[4];

    /* renamed from: b  reason: collision with root package name */
    public final int[] f6115b = new int[4];

    /* renamed from: c  reason: collision with root package name */
    public int f6116c;

    /* renamed from: d  reason: collision with root package name */
    public int f6117d;

    /* renamed from: e  reason: collision with root package name */
    public int f6118e;
    public int f;

    /* renamed from: g  reason: collision with root package name */
    public int f6119g;

    /* renamed from: h  reason: collision with root package name */
    public int f6120h;

    /* renamed from: i  reason: collision with root package name */
    public float f6121i;

    /* renamed from: j  reason: collision with root package name */
    public float f6122j;

    /* renamed from: k  reason: collision with root package name */
    public float f6123k;

    /* renamed from: l  reason: collision with root package name */
    public float f6124l;

    /* renamed from: m  reason: collision with root package name */
    public float f6125m;

    /* renamed from: n  reason: collision with root package name */
    public boolean f6126n;

    /* renamed from: o  reason: collision with root package name */
    public boolean f6127o;

    /* renamed from: p  reason: collision with root package name */
    public boolean f6128p;

    /* renamed from: q  reason: collision with root package name */
    public int f6129q;
    public int r;

    /* renamed from: s  reason: collision with root package name */
    public long f6130s;

    /* renamed from: t  reason: collision with root package name */
    public long f6131t;

    /* compiled from: Shimmer.java */
    /* loaded from: classes.dex */
    public static abstract class b<T extends b<T>> {

        /* renamed from: a  reason: collision with root package name */
        public final a f6132a = new a();

        public final a a() {
            a aVar = this.f6132a;
            int i6 = aVar.f;
            int[] iArr = aVar.f6115b;
            if (i6 != 1) {
                int i10 = aVar.f6118e;
                iArr[0] = i10;
                int i11 = aVar.f6117d;
                iArr[1] = i11;
                iArr[2] = i11;
                iArr[3] = i10;
            } else {
                int i12 = aVar.f6117d;
                iArr[0] = i12;
                iArr[1] = i12;
                int i13 = aVar.f6118e;
                iArr[2] = i13;
                iArr[3] = i13;
            }
            float[] fArr = aVar.f6114a;
            if (i6 != 1) {
                fArr[0] = Math.max(((1.0f - aVar.f6123k) - aVar.f6124l) / 2.0f, 0.0f);
                fArr[1] = Math.max(((1.0f - aVar.f6123k) - 0.001f) / 2.0f, 0.0f);
                fArr[2] = Math.min(((aVar.f6123k + 1.0f) + 0.001f) / 2.0f, 1.0f);
                fArr[3] = Math.min(((aVar.f6123k + 1.0f) + aVar.f6124l) / 2.0f, 1.0f);
            } else {
                fArr[0] = 0.0f;
                fArr[1] = Math.min(aVar.f6123k, 1.0f);
                fArr[2] = Math.min(aVar.f6123k + aVar.f6124l, 1.0f);
                fArr[3] = 1.0f;
            }
            return aVar;
        }

        public T b(TypedArray typedArray) {
            boolean hasValue = typedArray.hasValue(3);
            a aVar = this.f6132a;
            if (hasValue) {
                aVar.f6126n = typedArray.getBoolean(3, aVar.f6126n);
                c();
            }
            if (typedArray.hasValue(0)) {
                aVar.f6127o = typedArray.getBoolean(0, aVar.f6127o);
                c();
            }
            if (typedArray.hasValue(1)) {
                aVar.f6118e = (((int) (Math.min(1.0f, Math.max(0.0f, typedArray.getFloat(1, 0.3f))) * 255.0f)) << 24) | (aVar.f6118e & 16777215);
                c();
            }
            if (typedArray.hasValue(11)) {
                aVar.f6117d = (((int) (Math.min(1.0f, Math.max(0.0f, typedArray.getFloat(11, 1.0f))) * 255.0f)) << 24) | (aVar.f6117d & 16777215);
                c();
            }
            if (typedArray.hasValue(7)) {
                long j10 = typedArray.getInt(7, (int) aVar.f6130s);
                if (j10 >= 0) {
                    aVar.f6130s = j10;
                    c();
                } else {
                    throw new IllegalArgumentException("Given a negative duration: " + j10);
                }
            }
            if (typedArray.hasValue(14)) {
                aVar.f6129q = typedArray.getInt(14, aVar.f6129q);
                c();
            }
            if (typedArray.hasValue(15)) {
                long j11 = typedArray.getInt(15, (int) aVar.f6131t);
                if (j11 >= 0) {
                    aVar.f6131t = j11;
                    c();
                } else {
                    throw new IllegalArgumentException("Given a negative repeat delay: " + j11);
                }
            }
            if (typedArray.hasValue(16)) {
                aVar.r = typedArray.getInt(16, aVar.r);
                c();
            }
            if (typedArray.hasValue(5)) {
                int i6 = typedArray.getInt(5, aVar.f6116c);
                if (i6 != 1) {
                    if (i6 != 2) {
                        if (i6 != 3) {
                            aVar.f6116c = 0;
                            c();
                        } else {
                            aVar.f6116c = 3;
                            c();
                        }
                    } else {
                        aVar.f6116c = 2;
                        c();
                    }
                } else {
                    aVar.f6116c = 1;
                    c();
                }
            }
            if (typedArray.hasValue(17)) {
                if (typedArray.getInt(17, aVar.f) != 1) {
                    aVar.f = 0;
                    c();
                } else {
                    aVar.f = 1;
                    c();
                }
            }
            if (typedArray.hasValue(6)) {
                float f = typedArray.getFloat(6, aVar.f6124l);
                if (f >= 0.0f) {
                    aVar.f6124l = f;
                    c();
                } else {
                    throw new IllegalArgumentException("Given invalid dropoff value: " + f);
                }
            }
            if (typedArray.hasValue(9)) {
                int dimensionPixelSize = typedArray.getDimensionPixelSize(9, aVar.f6119g);
                if (dimensionPixelSize >= 0) {
                    aVar.f6119g = dimensionPixelSize;
                    c();
                } else {
                    throw new IllegalArgumentException(defpackage.c.p("Given invalid width: ", dimensionPixelSize));
                }
            }
            if (typedArray.hasValue(8)) {
                int dimensionPixelSize2 = typedArray.getDimensionPixelSize(8, aVar.f6120h);
                if (dimensionPixelSize2 >= 0) {
                    aVar.f6120h = dimensionPixelSize2;
                    c();
                } else {
                    throw new IllegalArgumentException(defpackage.c.p("Given invalid height: ", dimensionPixelSize2));
                }
            }
            if (typedArray.hasValue(13)) {
                float f2 = typedArray.getFloat(13, aVar.f6123k);
                if (f2 >= 0.0f) {
                    aVar.f6123k = f2;
                    c();
                } else {
                    throw new IllegalArgumentException("Given invalid intensity value: " + f2);
                }
            }
            if (typedArray.hasValue(19)) {
                float f10 = typedArray.getFloat(19, aVar.f6121i);
                if (f10 >= 0.0f) {
                    aVar.f6121i = f10;
                    c();
                } else {
                    throw new IllegalArgumentException("Given invalid width ratio: " + f10);
                }
            }
            if (typedArray.hasValue(10)) {
                float f11 = typedArray.getFloat(10, aVar.f6122j);
                if (f11 >= 0.0f) {
                    aVar.f6122j = f11;
                    c();
                } else {
                    throw new IllegalArgumentException("Given invalid height ratio: " + f11);
                }
            }
            if (typedArray.hasValue(18)) {
                aVar.f6125m = typedArray.getFloat(18, aVar.f6125m);
                c();
            }
            return c();
        }

        public abstract T c();
    }

    public a() {
        new RectF();
        this.f6116c = 0;
        this.f6117d = -1;
        this.f6118e = 1291845631;
        this.f = 0;
        this.f6119g = 0;
        this.f6120h = 0;
        this.f6121i = 1.0f;
        this.f6122j = 1.0f;
        this.f6123k = 0.0f;
        this.f6124l = 0.5f;
        this.f6125m = 20.0f;
        this.f6126n = true;
        this.f6127o = true;
        this.f6128p = true;
        this.f6129q = -1;
        this.r = 1;
        this.f6130s = 1000L;
    }

    /* compiled from: Shimmer.java */
    /* renamed from: com.facebook.shimmer.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0130a extends b<C0130a> {
        public C0130a() {
            this.f6132a.f6128p = true;
        }

        @Override // com.facebook.shimmer.a.b
        public final C0130a c() {
            return this;
        }
    }

    /* compiled from: Shimmer.java */
    /* loaded from: classes.dex */
    public static class c extends b<c> {
        public c() {
            this.f6132a.f6128p = false;
        }

        @Override // com.facebook.shimmer.a.b
        public final c b(TypedArray typedArray) {
            super.b(typedArray);
            boolean hasValue = typedArray.hasValue(2);
            a aVar = this.f6132a;
            if (hasValue) {
                aVar.f6118e = (typedArray.getColor(2, aVar.f6118e) & 16777215) | (aVar.f6118e & (-16777216));
            }
            if (typedArray.hasValue(12)) {
                aVar.f6117d = typedArray.getColor(12, aVar.f6117d);
            }
            return this;
        }

        @Override // com.facebook.shimmer.a.b
        public final c c() {
            return this;
        }
    }
}
