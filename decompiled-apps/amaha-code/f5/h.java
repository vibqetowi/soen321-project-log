package f5;

import android.graphics.PointF;
import android.graphics.RectF;
/* compiled from: CropWindowMoveHandler.kt */
/* loaded from: classes.dex */
public final class h {

    /* renamed from: a  reason: collision with root package name */
    public final float f14855a;

    /* renamed from: b  reason: collision with root package name */
    public final float f14856b;

    /* renamed from: c  reason: collision with root package name */
    public final float f14857c;

    /* renamed from: d  reason: collision with root package name */
    public final float f14858d;

    /* renamed from: e  reason: collision with root package name */
    public final PointF f14859e;
    public final int f;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public h(int i6, g gVar, float f, float f2) {
        float f10;
        float f11;
        float f12;
        defpackage.d.j(i6, "type");
        this.f = i6;
        this.f14855a = gVar.e();
        this.f14856b = gVar.d();
        this.f14857c = gVar.c();
        this.f14858d = gVar.b();
        float f13 = 0.0f;
        PointF pointF = new PointF(0.0f, 0.0f);
        this.f14859e = pointF;
        RectF f14 = gVar.f();
        if (i6 != 0) {
            switch (i6 - 1) {
                case 0:
                    f13 = f14.left - f;
                    f11 = f14.top;
                    f10 = f11 - f2;
                    break;
                case 1:
                    f13 = f14.right - f;
                    f11 = f14.top;
                    f10 = f11 - f2;
                    break;
                case 2:
                    f13 = f14.left - f;
                    f11 = f14.bottom;
                    f10 = f11 - f2;
                    break;
                case 3:
                    f13 = f14.right - f;
                    f11 = f14.bottom;
                    f10 = f11 - f2;
                    break;
                case 4:
                    f12 = f14.left;
                    f13 = f12 - f;
                    f10 = 0.0f;
                    break;
                case 5:
                    f11 = f14.top;
                    f10 = f11 - f2;
                    break;
                case 6:
                    f12 = f14.right;
                    f13 = f12 - f;
                    f10 = 0.0f;
                    break;
                case 7:
                    f11 = f14.bottom;
                    f10 = f11 - f2;
                    break;
                case 8:
                    f13 = f14.centerX() - f;
                    f11 = f14.centerY();
                    f10 = f11 - f2;
                    break;
                default:
                    f10 = 0.0f;
                    break;
            }
            pointF.x = f13;
            pointF.y = f10;
            return;
        }
        throw null;
    }

    public static void c(RectF rectF, RectF rectF2, float f) {
        rectF.inset((rectF.width() - (rectF.height() * f)) / 2, 0.0f);
        float f2 = rectF.left;
        float f10 = rectF2.left;
        if (f2 < f10) {
            rectF.offset(f10 - f2, 0.0f);
        }
        float f11 = rectF.right;
        float f12 = rectF2.right;
        if (f11 > f12) {
            rectF.offset(f12 - f11, 0.0f);
        }
    }

    public static void f(RectF rectF, RectF rectF2, float f) {
        rectF.inset(0.0f, (rectF.height() - (rectF.width() / f)) / 2);
        float f2 = rectF.top;
        float f10 = rectF2.top;
        if (f2 < f10) {
            rectF.offset(0.0f, f10 - f2);
        }
        float f11 = rectF.bottom;
        float f12 = rectF2.bottom;
        if (f11 > f12) {
            rectF.offset(0.0f, f12 - f11);
        }
    }

    public final void a(RectF rectF, float f, RectF rectF2, int i6, float f2, float f10, boolean z10, boolean z11) {
        float f11 = i6;
        PointF pointF = this.f14859e;
        if (f > f11) {
            f = ((f - f11) / 1.05f) + f11;
            pointF.y -= (f - f11) / 1.1f;
        }
        float f12 = rectF2.bottom;
        if (f > f12) {
            pointF.y -= (f - f12) / 2.0f;
        }
        if (f12 - f < f2) {
            f = f12;
        }
        float f13 = rectF.top;
        float f14 = this.f14856b;
        if (f - f13 < f14) {
            f = f13 + f14;
        }
        float f15 = this.f14858d;
        if (f - f13 > f15) {
            f = f13 + f15;
        }
        if (f12 - f < f2) {
            f = f12;
        }
        if (f10 > 0) {
            float f16 = (f - f13) * f10;
            float f17 = this.f14855a;
            if (f16 < f17) {
                f = Math.min(f12, (f17 / f10) + f13);
                f16 = (f - rectF.top) * f10;
            }
            float f18 = this.f14857c;
            if (f16 > f18) {
                f = Math.min(rectF2.bottom, (f18 / f10) + rectF.top);
                f16 = (f - rectF.top) * f10;
            }
            if (z10 && z11) {
                f = Math.min(f, Math.min(rectF2.bottom, (rectF2.width() / f10) + rectF.top));
            } else {
                if (z10) {
                    float f19 = rectF.right;
                    float f20 = rectF2.left;
                    if (f19 - f16 < f20) {
                        f = Math.min(rectF2.bottom, ((f19 - f20) / f10) + rectF.top);
                        f16 = (f - rectF.top) * f10;
                    }
                }
                if (z11) {
                    float f21 = rectF.left;
                    float f22 = rectF2.right;
                    if (f16 + f21 > f22) {
                        f = Math.min(f, Math.min(rectF2.bottom, ((f22 - f21) / f10) + rectF.top));
                    }
                }
            }
        }
        rectF.bottom = f;
    }

    public final void b(RectF rectF, float f, RectF rectF2, float f2, float f10, boolean z10, boolean z11) {
        float f11 = 0;
        PointF pointF = this.f14859e;
        if (f < f11) {
            f /= 1.05f;
            pointF.x -= f / 1.1f;
        }
        float f12 = rectF2.left;
        if (f < f12) {
            pointF.x -= (f - f12) / 2.0f;
        }
        if (f - f12 < f2) {
            f = f12;
        }
        float f13 = rectF.right;
        float f14 = this.f14855a;
        if (f13 - f < f14) {
            f = f13 - f14;
        }
        float f15 = this.f14857c;
        if (f13 - f > f15) {
            f = f13 - f15;
        }
        if (f - f12 < f2) {
            f = f12;
        }
        if (f10 > f11) {
            float f16 = (f13 - f) / f10;
            float f17 = this.f14856b;
            if (f16 < f17) {
                f = Math.max(f12, f13 - (f17 * f10));
                f16 = (rectF.right - f) / f10;
            }
            float f18 = this.f14858d;
            if (f16 > f18) {
                f = Math.max(rectF2.left, rectF.right - (f18 * f10));
                f16 = (rectF.right - f) / f10;
            }
            if (z10 && z11) {
                f = Math.max(f, Math.max(rectF2.left, rectF.right - (rectF2.height() * f10)));
            } else {
                if (z10) {
                    float f19 = rectF.bottom;
                    float f20 = rectF2.top;
                    if (f19 - f16 < f20) {
                        f = Math.max(rectF2.left, rectF.right - ((f19 - f20) * f10));
                        f16 = (rectF.right - f) / f10;
                    }
                }
                if (z11) {
                    float f21 = rectF.top;
                    float f22 = rectF2.bottom;
                    if (f16 + f21 > f22) {
                        f = Math.max(f, Math.max(rectF2.left, rectF.right - ((f22 - f21) * f10)));
                    }
                }
            }
        }
        rectF.left = f;
    }

    public final void d(RectF rectF, float f, RectF rectF2, int i6, float f2, float f10, boolean z10, boolean z11) {
        float f11 = i6;
        PointF pointF = this.f14859e;
        if (f > f11) {
            f = ((f - f11) / 1.05f) + f11;
            pointF.x -= (f - f11) / 1.1f;
        }
        float f12 = rectF2.right;
        if (f > f12) {
            pointF.x -= (f - f12) / 2.0f;
        }
        if (f12 - f < f2) {
            f = f12;
        }
        float f13 = rectF.left;
        float f14 = this.f14855a;
        if (f - f13 < f14) {
            f = f13 + f14;
        }
        float f15 = this.f14857c;
        if (f - f13 > f15) {
            f = f13 + f15;
        }
        if (f12 - f < f2) {
            f = f12;
        }
        if (f10 > 0) {
            float f16 = (f - f13) / f10;
            float f17 = this.f14856b;
            if (f16 < f17) {
                f = Math.min(f12, (f17 * f10) + f13);
                f16 = (f - rectF.left) / f10;
            }
            float f18 = this.f14858d;
            if (f16 > f18) {
                f = Math.min(rectF2.right, (f18 * f10) + rectF.left);
                f16 = (f - rectF.left) / f10;
            }
            if (z10 && z11) {
                f = Math.min(f, Math.min(rectF2.right, (rectF2.height() * f10) + rectF.left));
            } else {
                if (z10) {
                    float f19 = rectF.bottom;
                    float f20 = rectF2.top;
                    if (f19 - f16 < f20) {
                        f = Math.min(rectF2.right, ((f19 - f20) * f10) + rectF.left);
                        f16 = (f - rectF.left) / f10;
                    }
                }
                if (z11) {
                    float f21 = rectF.top;
                    float f22 = rectF2.bottom;
                    if (f16 + f21 > f22) {
                        f = Math.min(f, Math.min(rectF2.right, ((f22 - f21) * f10) + rectF.left));
                    }
                }
            }
        }
        rectF.right = f;
    }

    public final void e(RectF rectF, float f, RectF rectF2, float f2, float f10, boolean z10, boolean z11) {
        float f11 = 0;
        PointF pointF = this.f14859e;
        if (f < f11) {
            f /= 1.05f;
            pointF.y -= f / 1.1f;
        }
        float f12 = rectF2.top;
        if (f < f12) {
            pointF.y -= (f - f12) / 2.0f;
        }
        if (f - f12 < f2) {
            f = f12;
        }
        float f13 = rectF.bottom;
        float f14 = this.f14856b;
        if (f13 - f < f14) {
            f = f13 - f14;
        }
        float f15 = this.f14858d;
        if (f13 - f > f15) {
            f = f13 - f15;
        }
        if (f - f12 < f2) {
            f = f12;
        }
        if (f10 > f11) {
            float f16 = (f13 - f) * f10;
            float f17 = this.f14855a;
            if (f16 < f17) {
                f = Math.max(f12, f13 - (f17 / f10));
                f16 = (rectF.bottom - f) * f10;
            }
            float f18 = this.f14857c;
            if (f16 > f18) {
                f = Math.max(rectF2.top, rectF.bottom - (f18 / f10));
                f16 = (rectF.bottom - f) * f10;
            }
            if (z10 && z11) {
                f = Math.max(f, Math.max(rectF2.top, rectF.bottom - (rectF2.width() / f10)));
            } else {
                if (z10) {
                    float f19 = rectF.right;
                    float f20 = rectF2.left;
                    if (f19 - f16 < f20) {
                        f = Math.max(rectF2.top, rectF.bottom - ((f19 - f20) / f10));
                        f16 = (rectF.bottom - f) * f10;
                    }
                }
                if (z11) {
                    float f21 = rectF.left;
                    float f22 = rectF2.right;
                    if (f16 + f21 > f22) {
                        f = Math.max(f, Math.max(rectF2.top, rectF.bottom - ((f22 - f21) / f10)));
                    }
                }
            }
        }
        rectF.top = f;
    }
}
