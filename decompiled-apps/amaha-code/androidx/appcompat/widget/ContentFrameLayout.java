package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;
import android.widget.FrameLayout;
/* loaded from: classes.dex */
public class ContentFrameLayout extends FrameLayout {
    public final Rect A;
    public a B;

    /* renamed from: u  reason: collision with root package name */
    public TypedValue f1220u;

    /* renamed from: v  reason: collision with root package name */
    public TypedValue f1221v;

    /* renamed from: w  reason: collision with root package name */
    public TypedValue f1222w;

    /* renamed from: x  reason: collision with root package name */
    public TypedValue f1223x;

    /* renamed from: y  reason: collision with root package name */
    public TypedValue f1224y;

    /* renamed from: z  reason: collision with root package name */
    public TypedValue f1225z;

    /* loaded from: classes.dex */
    public interface a {
    }

    public ContentFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.A = new Rect();
    }

    public TypedValue getFixedHeightMajor() {
        if (this.f1224y == null) {
            this.f1224y = new TypedValue();
        }
        return this.f1224y;
    }

    public TypedValue getFixedHeightMinor() {
        if (this.f1225z == null) {
            this.f1225z = new TypedValue();
        }
        return this.f1225z;
    }

    public TypedValue getFixedWidthMajor() {
        if (this.f1222w == null) {
            this.f1222w = new TypedValue();
        }
        return this.f1222w;
    }

    public TypedValue getFixedWidthMinor() {
        if (this.f1223x == null) {
            this.f1223x = new TypedValue();
        }
        return this.f1223x;
    }

    public TypedValue getMinWidthMajor() {
        if (this.f1220u == null) {
            this.f1220u = new TypedValue();
        }
        return this.f1220u;
    }

    public TypedValue getMinWidthMinor() {
        if (this.f1221v == null) {
            this.f1221v = new TypedValue();
        }
        return this.f1221v;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        a aVar = this.B;
        if (aVar != null) {
            aVar.getClass();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        a aVar = this.B;
        if (aVar != null) {
            g.k kVar = ((g.m) aVar).f16117a;
            n0 n0Var = kVar.L;
            if (n0Var != null) {
                n0Var.i();
            }
            if (kVar.Q != null) {
                kVar.F.getDecorView().removeCallbacks(kVar.R);
                if (kVar.Q.isShowing()) {
                    try {
                        kVar.Q.dismiss();
                    } catch (IllegalArgumentException unused) {
                    }
                }
                kVar.Q = null;
            }
            t0.o0 o0Var = kVar.S;
            if (o0Var != null) {
                o0Var.b();
            }
            androidx.appcompat.view.menu.f fVar = kVar.N(0).f16106h;
            if (fVar != null) {
                fVar.c(true);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00ac A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:62:? A[RETURN, SYNTHETIC] */
    @Override // android.widget.FrameLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onMeasure(int i6, int i10) {
        boolean z10;
        int i11;
        boolean z11;
        int i12;
        int measuredWidth;
        TypedValue typedValue;
        int i13;
        int i14;
        float fraction;
        TypedValue typedValue2;
        int i15;
        int i16;
        float fraction2;
        TypedValue typedValue3;
        int i17;
        int i18;
        float fraction3;
        DisplayMetrics displayMetrics = getContext().getResources().getDisplayMetrics();
        boolean z12 = true;
        if (displayMetrics.widthPixels < displayMetrics.heightPixels) {
            z10 = true;
        } else {
            z10 = false;
        }
        int mode = View.MeasureSpec.getMode(i6);
        int mode2 = View.MeasureSpec.getMode(i10);
        Rect rect = this.A;
        if (mode == Integer.MIN_VALUE) {
            if (z10) {
                typedValue3 = this.f1223x;
            } else {
                typedValue3 = this.f1222w;
            }
            if (typedValue3 != null && (i17 = typedValue3.type) != 0) {
                if (i17 == 5) {
                    fraction3 = typedValue3.getDimension(displayMetrics);
                } else if (i17 == 6) {
                    int i19 = displayMetrics.widthPixels;
                    fraction3 = typedValue3.getFraction(i19, i19);
                } else {
                    i18 = 0;
                    if (i18 > 0) {
                        i11 = View.MeasureSpec.makeMeasureSpec(Math.min(i18 - (rect.left + rect.right), View.MeasureSpec.getSize(i6)), 1073741824);
                        z11 = true;
                        if (mode2 == Integer.MIN_VALUE) {
                            if (z10) {
                                typedValue2 = this.f1224y;
                            } else {
                                typedValue2 = this.f1225z;
                            }
                            if (typedValue2 != null && (i15 = typedValue2.type) != 0) {
                                if (i15 == 5) {
                                    fraction2 = typedValue2.getDimension(displayMetrics);
                                } else if (i15 == 6) {
                                    int i20 = displayMetrics.heightPixels;
                                    fraction2 = typedValue2.getFraction(i20, i20);
                                } else {
                                    i16 = 0;
                                    if (i16 > 0) {
                                        i12 = View.MeasureSpec.makeMeasureSpec(Math.min(i16 - (rect.top + rect.bottom), View.MeasureSpec.getSize(i10)), 1073741824);
                                        super.onMeasure(i11, i12);
                                        measuredWidth = getMeasuredWidth();
                                        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824);
                                        if (!z11 && mode == Integer.MIN_VALUE) {
                                            if (!z10) {
                                                typedValue = this.f1221v;
                                            } else {
                                                typedValue = this.f1220u;
                                            }
                                            if (typedValue != null && (i13 = typedValue.type) != 0) {
                                                if (i13 != 5) {
                                                    fraction = typedValue.getDimension(displayMetrics);
                                                } else if (i13 == 6) {
                                                    int i21 = displayMetrics.widthPixels;
                                                    fraction = typedValue.getFraction(i21, i21);
                                                } else {
                                                    i14 = 0;
                                                    if (i14 > 0) {
                                                        i14 -= rect.left + rect.right;
                                                    }
                                                    if (measuredWidth < i14) {
                                                        makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i14, 1073741824);
                                                        if (!z12) {
                                                            super.onMeasure(makeMeasureSpec, i12);
                                                            return;
                                                        }
                                                        return;
                                                    }
                                                }
                                                i14 = (int) fraction;
                                                if (i14 > 0) {
                                                }
                                                if (measuredWidth < i14) {
                                                }
                                            }
                                        }
                                        z12 = false;
                                        if (!z12) {
                                        }
                                    }
                                }
                                i16 = (int) fraction2;
                                if (i16 > 0) {
                                }
                            }
                        }
                        i12 = i10;
                        super.onMeasure(i11, i12);
                        measuredWidth = getMeasuredWidth();
                        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824);
                        if (!z11) {
                            if (!z10) {
                            }
                            if (typedValue != null) {
                                if (i13 != 5) {
                                }
                                i14 = (int) fraction;
                                if (i14 > 0) {
                                }
                                if (measuredWidth < i14) {
                                }
                            }
                        }
                        z12 = false;
                        if (!z12) {
                        }
                    }
                }
                i18 = (int) fraction3;
                if (i18 > 0) {
                }
            }
        }
        i11 = i6;
        z11 = false;
        if (mode2 == Integer.MIN_VALUE) {
        }
        i12 = i10;
        super.onMeasure(i11, i12);
        measuredWidth = getMeasuredWidth();
        int makeMeasureSpec22 = View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824);
        if (!z11) {
        }
        z12 = false;
        if (!z12) {
        }
    }

    public void setAttachListener(a aVar) {
        this.B = aVar;
    }
}
