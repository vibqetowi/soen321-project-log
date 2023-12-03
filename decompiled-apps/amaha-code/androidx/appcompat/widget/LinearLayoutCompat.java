package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.appsflyer.R;
import java.util.WeakHashMap;
import t0.d0;
/* loaded from: classes.dex */
public class LinearLayoutCompat extends ViewGroup {
    public float A;
    public boolean B;
    public int[] C;
    public int[] D;
    public Drawable E;
    public int F;
    public int G;
    public int H;
    public int I;

    /* renamed from: u  reason: collision with root package name */
    public boolean f1226u;

    /* renamed from: v  reason: collision with root package name */
    public int f1227v;

    /* renamed from: w  reason: collision with root package name */
    public int f1228w;

    /* renamed from: x  reason: collision with root package name */
    public int f1229x;

    /* renamed from: y  reason: collision with root package name */
    public int f1230y;

    /* renamed from: z  reason: collision with root package name */
    public int f1231z;

    /* loaded from: classes.dex */
    public static class a extends LinearLayout.LayoutParams {
        public a(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public a(int i6, int i10) {
            super(i6, i10);
        }

        public a(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }

    public LinearLayoutCompat(Context context) {
        this(context, null);
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof a;
    }

    public final void d(Canvas canvas, int i6) {
        this.E.setBounds(getPaddingLeft() + this.I, i6, (getWidth() - getPaddingRight()) - this.I, this.G + i6);
        this.E.draw(canvas);
    }

    public final void e(Canvas canvas, int i6) {
        this.E.setBounds(i6, getPaddingTop() + this.I, this.F + i6, (getHeight() - getPaddingBottom()) - this.I);
        this.E.draw(canvas);
    }

    @Override // android.view.ViewGroup
    /* renamed from: f */
    public a generateDefaultLayoutParams() {
        int i6 = this.f1229x;
        if (i6 == 0) {
            return new a(-2, -2);
        }
        if (i6 == 1) {
            return new a(-1, -2);
        }
        return null;
    }

    @Override // android.view.ViewGroup
    /* renamed from: g */
    public a generateLayoutParams(AttributeSet attributeSet) {
        return new a(getContext(), attributeSet);
    }

    @Override // android.view.View
    public int getBaseline() {
        int i6;
        if (this.f1227v < 0) {
            return super.getBaseline();
        }
        int childCount = getChildCount();
        int i10 = this.f1227v;
        if (childCount > i10) {
            View childAt = getChildAt(i10);
            int baseline = childAt.getBaseline();
            if (baseline == -1) {
                if (this.f1227v == 0) {
                    return -1;
                }
                throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout points to a View that doesn't know how to get its baseline.");
            }
            int i11 = this.f1228w;
            if (this.f1229x == 1 && (i6 = this.f1230y & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) != 48) {
                if (i6 != 16) {
                    if (i6 == 80) {
                        i11 = ((getBottom() - getTop()) - getPaddingBottom()) - this.f1231z;
                    }
                } else {
                    i11 += ((((getBottom() - getTop()) - getPaddingTop()) - getPaddingBottom()) - this.f1231z) / 2;
                }
            }
            return i11 + ((LinearLayout.LayoutParams) ((a) childAt.getLayoutParams())).topMargin + baseline;
        }
        throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout set to an index that is out of bounds.");
    }

    public int getBaselineAlignedChildIndex() {
        return this.f1227v;
    }

    public Drawable getDividerDrawable() {
        return this.E;
    }

    public int getDividerPadding() {
        return this.I;
    }

    public int getDividerWidth() {
        return this.F;
    }

    public int getGravity() {
        return this.f1230y;
    }

    public int getOrientation() {
        return this.f1229x;
    }

    public int getShowDividers() {
        return this.H;
    }

    public int getVirtualChildCount() {
        return getChildCount();
    }

    public float getWeightSum() {
        return this.A;
    }

    @Override // android.view.ViewGroup
    /* renamed from: h */
    public a generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new a(layoutParams);
    }

    public final boolean i(int i6) {
        if (i6 == 0) {
            if ((this.H & 1) == 0) {
                return false;
            }
            return true;
        } else if (i6 == getChildCount()) {
            if ((this.H & 4) == 0) {
                return false;
            }
            return true;
        } else if ((this.H & 2) == 0) {
            return false;
        } else {
            for (int i10 = i6 - 1; i10 >= 0; i10--) {
                if (getChildAt(i10).getVisibility() != 8) {
                    return true;
                }
            }
            return false;
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int right;
        int left;
        int i6;
        int left2;
        int bottom;
        if (this.E == null) {
            return;
        }
        int i10 = 0;
        if (this.f1229x == 1) {
            int virtualChildCount = getVirtualChildCount();
            while (i10 < virtualChildCount) {
                View childAt = getChildAt(i10);
                if (childAt != null && childAt.getVisibility() != 8 && i(i10)) {
                    d(canvas, (childAt.getTop() - ((LinearLayout.LayoutParams) ((a) childAt.getLayoutParams())).topMargin) - this.G);
                }
                i10++;
            }
            if (i(virtualChildCount)) {
                View childAt2 = getChildAt(virtualChildCount - 1);
                if (childAt2 == null) {
                    bottom = (getHeight() - getPaddingBottom()) - this.G;
                } else {
                    bottom = childAt2.getBottom() + ((LinearLayout.LayoutParams) ((a) childAt2.getLayoutParams())).bottomMargin;
                }
                d(canvas, bottom);
                return;
            }
            return;
        }
        int virtualChildCount2 = getVirtualChildCount();
        boolean a10 = u1.a(this);
        while (i10 < virtualChildCount2) {
            View childAt3 = getChildAt(i10);
            if (childAt3 != null && childAt3.getVisibility() != 8 && i(i10)) {
                a aVar = (a) childAt3.getLayoutParams();
                if (a10) {
                    left2 = childAt3.getRight() + ((LinearLayout.LayoutParams) aVar).rightMargin;
                } else {
                    left2 = (childAt3.getLeft() - ((LinearLayout.LayoutParams) aVar).leftMargin) - this.F;
                }
                e(canvas, left2);
            }
            i10++;
        }
        if (i(virtualChildCount2)) {
            View childAt4 = getChildAt(virtualChildCount2 - 1);
            if (childAt4 == null) {
                if (a10) {
                    right = getPaddingLeft();
                } else {
                    left = getWidth() - getPaddingRight();
                    i6 = this.F;
                    right = left - i6;
                }
            } else {
                a aVar2 = (a) childAt4.getLayoutParams();
                if (a10) {
                    left = childAt4.getLeft() - ((LinearLayout.LayoutParams) aVar2).leftMargin;
                    i6 = this.F;
                    right = left - i6;
                } else {
                    right = childAt4.getRight() + ((LinearLayout.LayoutParams) aVar2).rightMargin;
                }
            }
            e(canvas, right);
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("androidx.appcompat.widget.LinearLayoutCompat");
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("androidx.appcompat.widget.LinearLayoutCompat");
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01ab  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onLayout(boolean z10, int i6, int i10, int i11, int i12) {
        int paddingLeft;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int paddingTop;
        int i22;
        int i23;
        int i24;
        int i25 = 8;
        int i26 = 5;
        if (this.f1229x == 1) {
            int paddingLeft2 = getPaddingLeft();
            int i27 = i11 - i6;
            int paddingRight = i27 - getPaddingRight();
            int paddingRight2 = (i27 - paddingLeft2) - getPaddingRight();
            int virtualChildCount = getVirtualChildCount();
            int i28 = this.f1230y;
            int i29 = i28 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle;
            int i30 = 8388615 & i28;
            if (i29 != 16) {
                if (i29 != 80) {
                    paddingTop = getPaddingTop();
                } else {
                    paddingTop = ((getPaddingTop() + i12) - i10) - this.f1231z;
                }
            } else {
                paddingTop = getPaddingTop() + (((i12 - i10) - this.f1231z) / 2);
            }
            int i31 = 0;
            while (i31 < virtualChildCount) {
                View childAt = getChildAt(i31);
                if (childAt == null) {
                    paddingTop += 0;
                } else if (childAt.getVisibility() != i25) {
                    int measuredWidth = childAt.getMeasuredWidth();
                    int measuredHeight = childAt.getMeasuredHeight();
                    a aVar = (a) childAt.getLayoutParams();
                    int i32 = ((LinearLayout.LayoutParams) aVar).gravity;
                    if (i32 < 0) {
                        i32 = i30;
                    }
                    WeakHashMap<View, t0.o0> weakHashMap = t0.d0.f32288a;
                    int absoluteGravity = Gravity.getAbsoluteGravity(i32, d0.e.d(this)) & 7;
                    if (absoluteGravity != 1) {
                        if (absoluteGravity != i26) {
                            i24 = ((LinearLayout.LayoutParams) aVar).leftMargin + paddingLeft2;
                            if (i(i31)) {
                                paddingTop += this.G;
                            }
                            int i33 = paddingTop + ((LinearLayout.LayoutParams) aVar).topMargin;
                            int i34 = i33 + 0;
                            childAt.layout(i24, i34, measuredWidth + i24, measuredHeight + i34);
                            i31 += 0;
                            paddingTop = measuredHeight + ((LinearLayout.LayoutParams) aVar).bottomMargin + 0 + i33;
                        } else {
                            i22 = paddingRight - measuredWidth;
                            i23 = ((LinearLayout.LayoutParams) aVar).rightMargin;
                        }
                    } else {
                        i22 = ((paddingRight2 - measuredWidth) / 2) + paddingLeft2 + ((LinearLayout.LayoutParams) aVar).leftMargin;
                        i23 = ((LinearLayout.LayoutParams) aVar).rightMargin;
                    }
                    i24 = i22 - i23;
                    if (i(i31)) {
                    }
                    int i332 = paddingTop + ((LinearLayout.LayoutParams) aVar).topMargin;
                    int i342 = i332 + 0;
                    childAt.layout(i24, i342, measuredWidth + i24, measuredHeight + i342);
                    i31 += 0;
                    paddingTop = measuredHeight + ((LinearLayout.LayoutParams) aVar).bottomMargin + 0 + i332;
                }
                i31++;
                i25 = 8;
                i26 = 5;
            }
            return;
        }
        boolean a10 = u1.a(this);
        int paddingTop2 = getPaddingTop();
        int i35 = i12 - i10;
        int paddingBottom = i35 - getPaddingBottom();
        int paddingBottom2 = (i35 - paddingTop2) - getPaddingBottom();
        int virtualChildCount2 = getVirtualChildCount();
        int i36 = this.f1230y;
        int i37 = 8388615 & i36;
        int i38 = i36 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle;
        boolean z11 = this.f1226u;
        int[] iArr = this.C;
        int[] iArr2 = this.D;
        WeakHashMap<View, t0.o0> weakHashMap2 = t0.d0.f32288a;
        int absoluteGravity2 = Gravity.getAbsoluteGravity(i37, d0.e.d(this));
        if (absoluteGravity2 != 1) {
            if (absoluteGravity2 != 5) {
                paddingLeft = getPaddingLeft();
            } else {
                paddingLeft = ((getPaddingLeft() + i11) - i6) - this.f1231z;
            }
        } else {
            paddingLeft = getPaddingLeft() + (((i11 - i6) - this.f1231z) / 2);
        }
        if (a10) {
            i13 = virtualChildCount2 - 1;
            i14 = -1;
        } else {
            i13 = 0;
            i14 = 1;
        }
        int i39 = paddingLeft;
        int i40 = 0;
        while (i40 < virtualChildCount2) {
            int i41 = (i14 * i40) + i13;
            View childAt2 = getChildAt(i41);
            if (childAt2 == null) {
                i39 += 0;
            } else if (childAt2.getVisibility() != 8) {
                int measuredWidth2 = childAt2.getMeasuredWidth();
                int measuredHeight2 = childAt2.getMeasuredHeight();
                a aVar2 = (a) childAt2.getLayoutParams();
                if (z11) {
                    i15 = i13;
                    i16 = virtualChildCount2;
                    if (((LinearLayout.LayoutParams) aVar2).height != -1) {
                        i17 = childAt2.getBaseline();
                        i18 = ((LinearLayout.LayoutParams) aVar2).gravity;
                        if (i18 < 0) {
                            i18 = i38;
                        }
                        i19 = i18 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle;
                        i20 = i38;
                        if (i19 == 16) {
                            if (i19 != 48) {
                                if (i19 != 80) {
                                    i21 = paddingTop2;
                                } else {
                                    i21 = (paddingBottom - measuredHeight2) - ((LinearLayout.LayoutParams) aVar2).bottomMargin;
                                    if (i17 != -1) {
                                        i21 -= iArr2[2] - (childAt2.getMeasuredHeight() - i17);
                                    }
                                }
                            } else {
                                i21 = ((LinearLayout.LayoutParams) aVar2).topMargin + paddingTop2;
                                if (i17 != -1) {
                                    i21 = (iArr[1] - i17) + i21;
                                }
                            }
                        } else {
                            i21 = ((((paddingBottom2 - measuredHeight2) / 2) + paddingTop2) + ((LinearLayout.LayoutParams) aVar2).topMargin) - ((LinearLayout.LayoutParams) aVar2).bottomMargin;
                        }
                        if (i(i41)) {
                            i39 += this.F;
                        }
                        int i42 = i39 + ((LinearLayout.LayoutParams) aVar2).leftMargin;
                        int i43 = i42 + 0;
                        childAt2.layout(i43, i21, measuredWidth2 + i43, measuredHeight2 + i21);
                        i39 = measuredWidth2 + ((LinearLayout.LayoutParams) aVar2).rightMargin + 0 + i42;
                        i40 += 0;
                        i40++;
                        i13 = i15;
                        virtualChildCount2 = i16;
                        i38 = i20;
                    }
                } else {
                    i15 = i13;
                    i16 = virtualChildCount2;
                }
                i17 = -1;
                i18 = ((LinearLayout.LayoutParams) aVar2).gravity;
                if (i18 < 0) {
                }
                i19 = i18 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle;
                i20 = i38;
                if (i19 == 16) {
                }
                if (i(i41)) {
                }
                int i422 = i39 + ((LinearLayout.LayoutParams) aVar2).leftMargin;
                int i432 = i422 + 0;
                childAt2.layout(i432, i21, measuredWidth2 + i432, measuredHeight2 + i21);
                i39 = measuredWidth2 + ((LinearLayout.LayoutParams) aVar2).rightMargin + 0 + i422;
                i40 += 0;
                i40++;
                i13 = i15;
                virtualChildCount2 = i16;
                i38 = i20;
            }
            i15 = i13;
            i16 = virtualChildCount2;
            i20 = i38;
            i40++;
            i13 = i15;
            virtualChildCount2 = i16;
            i38 = i20;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:152:0x02f7  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x049a  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x049f  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x04c7  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x04cc  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x04d4  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x04e2  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x04f6  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x0569  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x0574  */
    /* JADX WARN: Removed duplicated region for block: B:286:0x0608  */
    /* JADX WARN: Removed duplicated region for block: B:321:0x06c4  */
    /* JADX WARN: Removed duplicated region for block: B:324:0x06e2  */
    /* JADX WARN: Removed duplicated region for block: B:392:0x0871  */
    /* JADX WARN: Removed duplicated region for block: B:398:0x0899  */
    /* JADX WARN: Removed duplicated region for block: B:448:? A[RETURN, SYNTHETIC] */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onMeasure(int i6, int i10) {
        boolean z10;
        char c10;
        int i11;
        int max;
        int i12;
        float f;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        char c11;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        float f2;
        boolean z11;
        int i23;
        boolean z12;
        int baseline;
        int i24;
        int i25;
        int i26;
        int i27;
        float f10;
        int i28;
        int i29;
        int i30;
        int i31;
        int i32;
        int i33;
        boolean z13;
        boolean z14;
        a aVar;
        boolean z15;
        int i34;
        boolean z16;
        int combineMeasuredStates;
        int i35;
        boolean z17;
        int baseline2;
        int i36;
        int i37;
        int i38;
        int i39;
        boolean z18;
        boolean z19;
        int i40;
        int i41;
        int i42;
        int i43;
        int i44;
        int i45;
        int i46;
        a aVar2;
        boolean z20;
        int i47;
        boolean z21;
        int combineMeasuredStates2;
        boolean z22;
        int i48 = this.f1229x;
        int i49 = -2;
        int i50 = LinearLayoutManager.INVALID_OFFSET;
        int i51 = 8;
        float f11 = 0.0f;
        int i52 = 1073741824;
        int i53 = 0;
        if (i48 == 1) {
            this.f1231z = 0;
            int virtualChildCount = getVirtualChildCount();
            int mode = View.MeasureSpec.getMode(i6);
            int mode2 = View.MeasureSpec.getMode(i10);
            int i54 = this.f1227v;
            boolean z23 = this.B;
            int i55 = 0;
            int i56 = 0;
            int i57 = 0;
            int i58 = 0;
            int i59 = 0;
            int i60 = 0;
            float f12 = 0.0f;
            boolean z24 = false;
            boolean z25 = true;
            boolean z26 = false;
            while (i55 < virtualChildCount) {
                View childAt = getChildAt(i55);
                if (childAt == null) {
                    this.f1231z += i53;
                } else if (childAt.getVisibility() == i51) {
                    i55 += 0;
                } else {
                    if (i(i55)) {
                        this.f1231z += this.G;
                    }
                    a aVar3 = (a) childAt.getLayoutParams();
                    float f13 = ((LinearLayout.LayoutParams) aVar3).weight;
                    f12 += f13;
                    if (mode2 == i52 && ((LinearLayout.LayoutParams) aVar3).height == 0 && f13 > f11) {
                        int i61 = this.f1231z;
                        this.f1231z = Math.max(i61, ((LinearLayout.LayoutParams) aVar3).topMargin + i61 + ((LinearLayout.LayoutParams) aVar3).bottomMargin);
                        i43 = i54;
                        i44 = mode2;
                        i45 = mode;
                        i46 = virtualChildCount;
                        aVar2 = aVar3;
                        z20 = true;
                    } else {
                        if (((LinearLayout.LayoutParams) aVar3).height == 0 && f13 > f11) {
                            ((LinearLayout.LayoutParams) aVar3).height = i49;
                            i41 = 0;
                        } else {
                            i41 = LinearLayoutManager.INVALID_OFFSET;
                        }
                        if (f12 == f11) {
                            i42 = this.f1231z;
                        } else {
                            i42 = 0;
                        }
                        i43 = i54;
                        i44 = mode2;
                        i45 = mode;
                        i46 = virtualChildCount;
                        aVar2 = aVar3;
                        measureChildWithMargins(childAt, i6, 0, i10, i42);
                        if (i41 != i50) {
                            ((LinearLayout.LayoutParams) aVar2).height = i41;
                        }
                        int measuredHeight = childAt.getMeasuredHeight();
                        int i62 = this.f1231z;
                        this.f1231z = Math.max(i62, i62 + measuredHeight + ((LinearLayout.LayoutParams) aVar2).topMargin + ((LinearLayout.LayoutParams) aVar2).bottomMargin + 0);
                        if (z23) {
                            i58 = Math.max(measuredHeight, i58);
                        }
                        z20 = z24;
                    }
                    if (i43 >= 0 && i43 == i55 + 1) {
                        this.f1228w = this.f1231z;
                    }
                    if (i55 < i43 && ((LinearLayout.LayoutParams) aVar2).weight > 0.0f) {
                        throw new RuntimeException("A child of LinearLayout with index less than mBaselineAlignedChildIndex has weight > 0, which won't work.  Either remove the weight, or don't set mBaselineAlignedChildIndex.");
                    }
                    i47 = i45;
                    if (i47 != 1073741824 && ((LinearLayout.LayoutParams) aVar2).width == -1) {
                        z21 = true;
                        z26 = true;
                    } else {
                        z21 = false;
                    }
                    int i63 = ((LinearLayout.LayoutParams) aVar2).leftMargin + ((LinearLayout.LayoutParams) aVar2).rightMargin;
                    int measuredWidth = childAt.getMeasuredWidth() + i63;
                    int max2 = Math.max(i60, measuredWidth);
                    combineMeasuredStates2 = View.combineMeasuredStates(i57, childAt.getMeasuredState());
                    if (z25 && ((LinearLayout.LayoutParams) aVar2).width == -1) {
                        z22 = true;
                    } else {
                        z22 = false;
                    }
                    if (((LinearLayout.LayoutParams) aVar2).weight > 0.0f) {
                        if (!z21) {
                            i63 = measuredWidth;
                        }
                        i59 = Math.max(i59, i63);
                    } else {
                        int i64 = i59;
                        if (!z21) {
                            i63 = measuredWidth;
                        }
                        i56 = Math.max(i56, i63);
                        i59 = i64;
                    }
                    i55 += 0;
                    i60 = max2;
                    z24 = z20;
                    z25 = z22;
                    i55++;
                    mode = i47;
                    i54 = i43;
                    i57 = combineMeasuredStates2;
                    mode2 = i44;
                    virtualChildCount = i46;
                    i53 = 0;
                    i49 = -2;
                    i50 = LinearLayoutManager.INVALID_OFFSET;
                    i51 = 8;
                    f11 = 0.0f;
                    i52 = 1073741824;
                }
                i43 = i54;
                i44 = mode2;
                i47 = mode;
                i46 = virtualChildCount;
                combineMeasuredStates2 = i57;
                i55++;
                mode = i47;
                i54 = i43;
                i57 = combineMeasuredStates2;
                mode2 = i44;
                virtualChildCount = i46;
                i53 = 0;
                i49 = -2;
                i50 = LinearLayoutManager.INVALID_OFFSET;
                i51 = 8;
                f11 = 0.0f;
                i52 = 1073741824;
            }
            int i65 = mode2;
            int i66 = mode;
            int i67 = virtualChildCount;
            int i68 = i56;
            int i69 = i57;
            int i70 = i58;
            int i71 = i59;
            int i72 = i60;
            if (this.f1231z > 0 && i(i67)) {
                this.f1231z += this.G;
            }
            int i73 = i65;
            if (z23 && (i73 == Integer.MIN_VALUE || i73 == 0)) {
                int i74 = 0;
                this.f1231z = 0;
                int i75 = 0;
                while (i75 < i67) {
                    View childAt2 = getChildAt(i75);
                    if (childAt2 == null) {
                        this.f1231z += i74;
                    } else if (childAt2.getVisibility() == 8) {
                        i75 += 0;
                    } else {
                        a aVar4 = (a) childAt2.getLayoutParams();
                        int i76 = this.f1231z;
                        this.f1231z = Math.max(i76, i76 + i70 + ((LinearLayout.LayoutParams) aVar4).topMargin + ((LinearLayout.LayoutParams) aVar4).bottomMargin + 0);
                    }
                    i75++;
                    i74 = 0;
                }
            }
            int paddingBottom = getPaddingBottom() + getPaddingTop() + this.f1231z;
            this.f1231z = paddingBottom;
            int resolveSizeAndState = View.resolveSizeAndState(Math.max(paddingBottom, getSuggestedMinimumHeight()), i10, 0);
            int i77 = (16777215 & resolveSizeAndState) - this.f1231z;
            if (!z24 && (i77 == 0 || f12 <= 0.0f)) {
                i68 = Math.max(i68, i71);
                if (z23 && i73 != 1073741824) {
                    for (int i78 = 0; i78 < i67; i78++) {
                        View childAt3 = getChildAt(i78);
                        if (childAt3 != null && childAt3.getVisibility() != 8 && ((LinearLayout.LayoutParams) ((a) childAt3.getLayoutParams())).weight > 0.0f) {
                            childAt3.measure(View.MeasureSpec.makeMeasureSpec(childAt3.getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(i70, 1073741824));
                        }
                    }
                }
            } else {
                float f14 = this.A;
                if (f14 > 0.0f) {
                    f12 = f14;
                }
                this.f1231z = 0;
                int i79 = 0;
                while (i79 < i67) {
                    View childAt4 = getChildAt(i79);
                    if (childAt4.getVisibility() == 8) {
                        i37 = i73;
                    } else {
                        a aVar5 = (a) childAt4.getLayoutParams();
                        float f15 = ((LinearLayout.LayoutParams) aVar5).weight;
                        if (f15 > 0.0f) {
                            int i80 = (int) ((i77 * f15) / f12);
                            f12 -= f15;
                            int i81 = i77 - i80;
                            int childMeasureSpec = ViewGroup.getChildMeasureSpec(i6, getPaddingRight() + getPaddingLeft() + ((LinearLayout.LayoutParams) aVar5).leftMargin + ((LinearLayout.LayoutParams) aVar5).rightMargin, ((LinearLayout.LayoutParams) aVar5).width);
                            if (((LinearLayout.LayoutParams) aVar5).height == 0) {
                                i40 = 1073741824;
                                if (i73 == 1073741824) {
                                    if (i80 <= 0) {
                                        i80 = 0;
                                    }
                                    childAt4.measure(childMeasureSpec, View.MeasureSpec.makeMeasureSpec(i80, 1073741824));
                                    i69 = View.combineMeasuredStates(i69, childAt4.getMeasuredState() & (-256));
                                    i77 = i81;
                                }
                            } else {
                                i40 = 1073741824;
                            }
                            int measuredHeight2 = childAt4.getMeasuredHeight() + i80;
                            if (measuredHeight2 < 0) {
                                measuredHeight2 = 0;
                            }
                            childAt4.measure(childMeasureSpec, View.MeasureSpec.makeMeasureSpec(measuredHeight2, i40));
                            i69 = View.combineMeasuredStates(i69, childAt4.getMeasuredState() & (-256));
                            i77 = i81;
                        }
                        int i82 = ((LinearLayout.LayoutParams) aVar5).leftMargin + ((LinearLayout.LayoutParams) aVar5).rightMargin;
                        int measuredWidth2 = childAt4.getMeasuredWidth() + i82;
                        int max3 = Math.max(i72, measuredWidth2);
                        i37 = i73;
                        if (i66 != 1073741824) {
                            i38 = max3;
                            i39 = -1;
                            if (((LinearLayout.LayoutParams) aVar5).width == -1) {
                                z18 = true;
                                if (!z18) {
                                    i82 = measuredWidth2;
                                }
                                int max4 = Math.max(i68, i82);
                                if (!z25 && ((LinearLayout.LayoutParams) aVar5).width == i39) {
                                    z19 = true;
                                } else {
                                    z19 = false;
                                }
                                int i83 = this.f1231z;
                                this.f1231z = Math.max(i83, childAt4.getMeasuredHeight() + i83 + ((LinearLayout.LayoutParams) aVar5).topMargin + ((LinearLayout.LayoutParams) aVar5).bottomMargin + 0);
                                z25 = z19;
                                i72 = i38;
                                i68 = max4;
                            }
                        } else {
                            i38 = max3;
                            i39 = -1;
                        }
                        z18 = false;
                        if (!z18) {
                        }
                        int max42 = Math.max(i68, i82);
                        if (!z25) {
                        }
                        z19 = false;
                        int i832 = this.f1231z;
                        this.f1231z = Math.max(i832, childAt4.getMeasuredHeight() + i832 + ((LinearLayout.LayoutParams) aVar5).topMargin + ((LinearLayout.LayoutParams) aVar5).bottomMargin + 0);
                        z25 = z19;
                        i72 = i38;
                        i68 = max42;
                    }
                    i79++;
                    i73 = i37;
                }
                this.f1231z = getPaddingBottom() + getPaddingTop() + this.f1231z;
            }
            int i84 = i72;
            if (z25 || i66 == 1073741824) {
                i68 = i84;
            }
            setMeasuredDimension(View.resolveSizeAndState(Math.max(getPaddingRight() + getPaddingLeft() + i68, getSuggestedMinimumWidth()), i6, i69), resolveSizeAndState);
            if (z26) {
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824);
                for (int i85 = 0; i85 < i67; i85++) {
                    View childAt5 = getChildAt(i85);
                    if (childAt5.getVisibility() != 8) {
                        a aVar6 = (a) childAt5.getLayoutParams();
                        if (((LinearLayout.LayoutParams) aVar6).width == -1) {
                            int i86 = ((LinearLayout.LayoutParams) aVar6).height;
                            ((LinearLayout.LayoutParams) aVar6).height = childAt5.getMeasuredHeight();
                            measureChildWithMargins(childAt5, makeMeasureSpec, 0, i10, 0);
                            ((LinearLayout.LayoutParams) aVar6).height = i86;
                        }
                    }
                }
                return;
            }
            return;
        }
        this.f1231z = 0;
        int virtualChildCount2 = getVirtualChildCount();
        int mode3 = View.MeasureSpec.getMode(i6);
        int mode4 = View.MeasureSpec.getMode(i10);
        if (this.C == null || this.D == null) {
            this.C = new int[4];
            this.D = new int[4];
        }
        int[] iArr = this.C;
        int[] iArr2 = this.D;
        iArr[3] = -1;
        iArr[2] = -1;
        iArr[1] = -1;
        iArr[0] = -1;
        iArr2[3] = -1;
        iArr2[2] = -1;
        iArr2[1] = -1;
        iArr2[0] = -1;
        boolean z27 = this.f1226u;
        boolean z28 = this.B;
        if (mode3 == 1073741824) {
            z10 = true;
        } else {
            z10 = false;
        }
        int i87 = 0;
        float f16 = 0.0f;
        int i88 = 0;
        int i89 = 0;
        int i90 = 0;
        int i91 = 0;
        boolean z29 = true;
        boolean z30 = false;
        boolean z31 = false;
        int i92 = 0;
        while (i89 < virtualChildCount2) {
            View childAt6 = getChildAt(i89);
            if (childAt6 == null) {
                this.f1231z += 0;
                i26 = i87;
                i27 = i88;
            } else {
                i26 = i87;
                i27 = i88;
                if (childAt6.getVisibility() == 8) {
                    i89 += 0;
                } else {
                    if (i(i89)) {
                        this.f1231z += this.F;
                    }
                    a aVar7 = (a) childAt6.getLayoutParams();
                    float f17 = ((LinearLayout.LayoutParams) aVar7).weight;
                    float f18 = f16 + f17;
                    if (mode3 == 1073741824 && ((LinearLayout.LayoutParams) aVar7).width == 0 && f17 > 0.0f) {
                        if (z10) {
                            i36 = i89;
                            this.f1231z = ((LinearLayout.LayoutParams) aVar7).leftMargin + ((LinearLayout.LayoutParams) aVar7).rightMargin + this.f1231z;
                        } else {
                            i36 = i89;
                            int i93 = this.f1231z;
                            this.f1231z = Math.max(i93, ((LinearLayout.LayoutParams) aVar7).leftMargin + i93 + ((LinearLayout.LayoutParams) aVar7).rightMargin);
                        }
                        if (z27) {
                            int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
                            childAt6.measure(makeMeasureSpec2, makeMeasureSpec2);
                            aVar = aVar7;
                            i30 = i26;
                            i31 = i27;
                            i33 = i36;
                            z13 = z28;
                            z14 = z27;
                        } else {
                            aVar = aVar7;
                            i30 = i26;
                            i31 = i27;
                            i33 = i36;
                            i34 = 1073741824;
                            z13 = z28;
                            z14 = z27;
                            z15 = true;
                            if (mode4 == i34 && ((LinearLayout.LayoutParams) aVar).height == -1) {
                                z16 = true;
                                z31 = true;
                            } else {
                                z16 = false;
                            }
                            int i94 = ((LinearLayout.LayoutParams) aVar).topMargin + ((LinearLayout.LayoutParams) aVar).bottomMargin;
                            int measuredHeight3 = childAt6.getMeasuredHeight() + i94;
                            combineMeasuredStates = View.combineMeasuredStates(i30, childAt6.getMeasuredState());
                            if (!z14 && (baseline2 = childAt6.getBaseline()) != -1) {
                                int i95 = ((LinearLayout.LayoutParams) aVar).gravity;
                                if (i95 < 0) {
                                    i95 = this.f1230y;
                                }
                                int i96 = (((i95 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) >> 4) & (-2)) >> 1;
                                i35 = combineMeasuredStates;
                                iArr[i96] = Math.max(iArr[i96], baseline2);
                                iArr2[i96] = Math.max(iArr2[i96], measuredHeight3 - baseline2);
                            } else {
                                i35 = combineMeasuredStates;
                            }
                            int max5 = Math.max(i92, measuredHeight3);
                            if (!z29 && ((LinearLayout.LayoutParams) aVar).height == -1) {
                                z17 = true;
                            } else {
                                z17 = false;
                            }
                            if (((LinearLayout.LayoutParams) aVar).weight <= 0.0f) {
                                if (z16) {
                                    measuredHeight3 = i94;
                                }
                                i88 = Math.max(i31, measuredHeight3);
                            } else {
                                int i97 = i31;
                                if (z16) {
                                    measuredHeight3 = i94;
                                }
                                i91 = Math.max(i91, measuredHeight3);
                                i88 = i97;
                            }
                            i92 = max5;
                            z29 = z17;
                            z30 = z15;
                            i87 = i35;
                            i89 = i33 + 0;
                            f16 = f18;
                            i89++;
                            z28 = z13;
                            z27 = z14;
                        }
                    } else {
                        int i98 = i89;
                        if (((LinearLayout.LayoutParams) aVar7).width == 0) {
                            f10 = 0.0f;
                            if (f17 > 0.0f) {
                                ((LinearLayout.LayoutParams) aVar7).width = -2;
                                i28 = 0;
                                if (f18 != f10) {
                                    i29 = this.f1231z;
                                } else {
                                    i29 = 0;
                                }
                                i30 = i26;
                                i31 = i27;
                                i32 = i28;
                                i33 = i98;
                                z13 = z28;
                                z14 = z27;
                                measureChildWithMargins(childAt6, i6, i29, i10, 0);
                                if (i32 == Integer.MIN_VALUE) {
                                    aVar = aVar7;
                                    ((LinearLayout.LayoutParams) aVar).width = i32;
                                } else {
                                    aVar = aVar7;
                                }
                                int measuredWidth3 = childAt6.getMeasuredWidth();
                                if (!z10) {
                                    this.f1231z = ((LinearLayout.LayoutParams) aVar).leftMargin + measuredWidth3 + ((LinearLayout.LayoutParams) aVar).rightMargin + 0 + this.f1231z;
                                } else {
                                    int i99 = this.f1231z;
                                    this.f1231z = Math.max(i99, i99 + measuredWidth3 + ((LinearLayout.LayoutParams) aVar).leftMargin + ((LinearLayout.LayoutParams) aVar).rightMargin + 0);
                                }
                                if (z13) {
                                    i90 = Math.max(measuredWidth3, i90);
                                }
                            }
                        } else {
                            f10 = 0.0f;
                        }
                        i28 = LinearLayoutManager.INVALID_OFFSET;
                        if (f18 != f10) {
                        }
                        i30 = i26;
                        i31 = i27;
                        i32 = i28;
                        i33 = i98;
                        z13 = z28;
                        z14 = z27;
                        measureChildWithMargins(childAt6, i6, i29, i10, 0);
                        if (i32 == Integer.MIN_VALUE) {
                        }
                        int measuredWidth32 = childAt6.getMeasuredWidth();
                        if (!z10) {
                        }
                        if (z13) {
                        }
                    }
                    z15 = z30;
                    i34 = 1073741824;
                    if (mode4 == i34) {
                    }
                    z16 = false;
                    int i942 = ((LinearLayout.LayoutParams) aVar).topMargin + ((LinearLayout.LayoutParams) aVar).bottomMargin;
                    int measuredHeight32 = childAt6.getMeasuredHeight() + i942;
                    combineMeasuredStates = View.combineMeasuredStates(i30, childAt6.getMeasuredState());
                    if (!z14) {
                    }
                    i35 = combineMeasuredStates;
                    int max52 = Math.max(i92, measuredHeight32);
                    if (!z29) {
                    }
                    z17 = false;
                    if (((LinearLayout.LayoutParams) aVar).weight <= 0.0f) {
                    }
                    i92 = max52;
                    z29 = z17;
                    z30 = z15;
                    i87 = i35;
                    i89 = i33 + 0;
                    f16 = f18;
                    i89++;
                    z28 = z13;
                    z27 = z14;
                }
            }
            z14 = z27;
            i87 = i26;
            i88 = i27;
            z13 = z28;
            i89++;
            z28 = z13;
            z27 = z14;
        }
        int i100 = i88;
        boolean z32 = z28;
        boolean z33 = z27;
        int i101 = i92;
        if (this.f1231z > 0 && i(virtualChildCount2)) {
            this.f1231z += this.F;
        }
        int i102 = iArr[1];
        int i103 = i87;
        if (i102 == -1 && iArr[0] == -1 && iArr[2] == -1) {
            c10 = 3;
            if (iArr[3] == -1) {
                max = i101;
                i11 = mode4;
                if (z32 && (mode3 == Integer.MIN_VALUE || mode3 == 0)) {
                    int i104 = 0;
                    this.f1231z = 0;
                    i25 = 0;
                    while (i25 < virtualChildCount2) {
                        View childAt7 = getChildAt(i25);
                        if (childAt7 == null) {
                            this.f1231z += i104;
                        } else if (childAt7.getVisibility() == 8) {
                            i25 += 0;
                        } else {
                            a aVar8 = (a) childAt7.getLayoutParams();
                            if (z10) {
                                this.f1231z = ((LinearLayout.LayoutParams) aVar8).leftMargin + i90 + ((LinearLayout.LayoutParams) aVar8).rightMargin + 0 + this.f1231z;
                            } else {
                                int i105 = this.f1231z;
                                this.f1231z = Math.max(i105, i105 + i90 + ((LinearLayout.LayoutParams) aVar8).leftMargin + ((LinearLayout.LayoutParams) aVar8).rightMargin + 0);
                            }
                        }
                        i25++;
                        i104 = 0;
                    }
                }
                int paddingRight = getPaddingRight() + getPaddingLeft() + this.f1231z;
                this.f1231z = paddingRight;
                int resolveSizeAndState2 = View.resolveSizeAndState(Math.max(paddingRight, getSuggestedMinimumWidth()), i6, 0);
                i12 = (16777215 & resolveSizeAndState2) - this.f1231z;
                if (z30 && (i12 == 0 || f16 <= 0.0f)) {
                    int max6 = Math.max(i91, i100);
                    if (z32 && mode3 != 1073741824) {
                        for (int i106 = 0; i106 < virtualChildCount2; i106++) {
                            View childAt8 = getChildAt(i106);
                            if (childAt8 != null && childAt8.getVisibility() != 8 && ((LinearLayout.LayoutParams) ((a) childAt8.getLayoutParams())).weight > 0.0f) {
                                childAt8.measure(View.MeasureSpec.makeMeasureSpec(i90, 1073741824), View.MeasureSpec.makeMeasureSpec(childAt8.getMeasuredHeight(), 1073741824));
                            }
                        }
                    }
                    i15 = i10;
                    i91 = max6;
                    i14 = i103;
                    i16 = i11;
                } else {
                    f = this.A;
                    if (f > 0.0f) {
                        f16 = f;
                    }
                    iArr[3] = -1;
                    iArr[2] = -1;
                    iArr[1] = -1;
                    iArr[0] = -1;
                    iArr2[3] = -1;
                    iArr2[2] = -1;
                    iArr2[1] = -1;
                    iArr2[0] = -1;
                    this.f1231z = 0;
                    int i107 = i12;
                    int i108 = -1;
                    i13 = 0;
                    float f19 = f16;
                    i14 = i103;
                    while (i13 < virtualChildCount2) {
                        View childAt9 = getChildAt(i13);
                        if (childAt9 != null && childAt9.getVisibility() != 8) {
                            a aVar9 = (a) childAt9.getLayoutParams();
                            float f20 = ((LinearLayout.LayoutParams) aVar9).weight;
                            if (f20 > 0.0f) {
                                int i109 = (int) ((i107 * f20) / f19);
                                float f21 = f19 - f20;
                                int i110 = i107 - i109;
                                int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i10, getPaddingBottom() + getPaddingTop() + ((LinearLayout.LayoutParams) aVar9).topMargin + ((LinearLayout.LayoutParams) aVar9).bottomMargin, ((LinearLayout.LayoutParams) aVar9).height);
                                if (((LinearLayout.LayoutParams) aVar9).width == 0) {
                                    i24 = 1073741824;
                                    if (mode3 == 1073741824) {
                                        if (i109 <= 0) {
                                            i109 = 0;
                                        }
                                        childAt9.measure(View.MeasureSpec.makeMeasureSpec(i109, 1073741824), childMeasureSpec2);
                                        i14 = View.combineMeasuredStates(i14, childAt9.getMeasuredState() & (-16777216));
                                        f19 = f21;
                                        i21 = i110;
                                    }
                                } else {
                                    i24 = 1073741824;
                                }
                                int measuredWidth4 = childAt9.getMeasuredWidth() + i109;
                                if (measuredWidth4 < 0) {
                                    measuredWidth4 = 0;
                                }
                                childAt9.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth4, i24), childMeasureSpec2);
                                i14 = View.combineMeasuredStates(i14, childAt9.getMeasuredState() & (-16777216));
                                f19 = f21;
                                i21 = i110;
                            } else {
                                i21 = i107;
                            }
                            if (z10) {
                                i22 = i14;
                                this.f1231z = childAt9.getMeasuredWidth() + ((LinearLayout.LayoutParams) aVar9).leftMargin + ((LinearLayout.LayoutParams) aVar9).rightMargin + 0 + this.f1231z;
                                f2 = f19;
                            } else {
                                i22 = i14;
                                int i111 = this.f1231z;
                                f2 = f19;
                                this.f1231z = Math.max(i111, childAt9.getMeasuredWidth() + i111 + ((LinearLayout.LayoutParams) aVar9).leftMargin + ((LinearLayout.LayoutParams) aVar9).rightMargin + 0);
                            }
                            i20 = i11;
                            if (i20 != 1073741824 && ((LinearLayout.LayoutParams) aVar9).height == -1) {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                            int i112 = i21;
                            int i113 = ((LinearLayout.LayoutParams) aVar9).topMargin + ((LinearLayout.LayoutParams) aVar9).bottomMargin;
                            int measuredHeight4 = childAt9.getMeasuredHeight() + i113;
                            i108 = Math.max(i108, measuredHeight4);
                            if (!z11) {
                                i113 = measuredHeight4;
                            }
                            int max7 = Math.max(i91, i113);
                            if (z29) {
                                i23 = -1;
                                if (((LinearLayout.LayoutParams) aVar9).height == -1) {
                                    z12 = true;
                                    if (!z33 && (baseline = childAt9.getBaseline()) != i23) {
                                        int i114 = ((LinearLayout.LayoutParams) aVar9).gravity;
                                        if (i114 < 0) {
                                            i114 = this.f1230y;
                                        }
                                        int i115 = (((i114 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) >> 4) & (-2)) >> 1;
                                        iArr[i115] = Math.max(iArr[i115], baseline);
                                        iArr2[i115] = Math.max(iArr2[i115], measuredHeight4 - baseline);
                                    }
                                    i91 = max7;
                                    z29 = z12;
                                    i19 = i112;
                                    i14 = i22;
                                    f19 = f2;
                                }
                            } else {
                                i23 = -1;
                            }
                            z12 = false;
                            if (!z33) {
                            }
                            i91 = max7;
                            z29 = z12;
                            i19 = i112;
                            i14 = i22;
                            f19 = f2;
                        } else {
                            i19 = i107;
                            i20 = i11;
                        }
                        i13++;
                        i107 = i19;
                        i11 = i20;
                    }
                    i15 = i10;
                    i16 = i11;
                    this.f1231z = getPaddingRight() + getPaddingLeft() + this.f1231z;
                    i17 = iArr[1];
                    if (i17 != -1 && iArr[0] == -1 && iArr[2] == -1) {
                        c11 = 3;
                        if (iArr[3] == -1) {
                            max = i108;
                        }
                    } else {
                        c11 = 3;
                    }
                    i18 = 0;
                    max = Math.max(i108, Math.max(iArr2[c11], Math.max(iArr2[0], Math.max(iArr2[1], iArr2[2]))) + Math.max(iArr[c11], Math.max(iArr[0], Math.max(i17, iArr[2]))));
                    if (!z29 || i16 == 1073741824) {
                        i91 = max;
                    }
                    setMeasuredDimension(resolveSizeAndState2 | ((-16777216) & i14), View.resolveSizeAndState(Math.max(getPaddingBottom() + getPaddingTop() + i91, getSuggestedMinimumHeight()), i15, i14 << 16));
                    if (z31) {
                        int makeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824);
                        while (i18 < virtualChildCount2) {
                            View childAt10 = getChildAt(i18);
                            if (childAt10.getVisibility() != 8) {
                                a aVar10 = (a) childAt10.getLayoutParams();
                                if (((LinearLayout.LayoutParams) aVar10).height == -1) {
                                    int i116 = ((LinearLayout.LayoutParams) aVar10).width;
                                    ((LinearLayout.LayoutParams) aVar10).width = childAt10.getMeasuredWidth();
                                    measureChildWithMargins(childAt10, i6, 0, makeMeasureSpec3, 0);
                                    ((LinearLayout.LayoutParams) aVar10).width = i116;
                                }
                            }
                            i18++;
                        }
                        return;
                    }
                    return;
                }
                i18 = 0;
                if (!z29) {
                }
                i91 = max;
                setMeasuredDimension(resolveSizeAndState2 | ((-16777216) & i14), View.resolveSizeAndState(Math.max(getPaddingBottom() + getPaddingTop() + i91, getSuggestedMinimumHeight()), i15, i14 << 16));
                if (z31) {
                }
            }
        } else {
            c10 = 3;
        }
        i11 = mode4;
        max = Math.max(i101, Math.max(iArr2[3], Math.max(iArr2[0], Math.max(iArr2[1], iArr2[2]))) + Math.max(iArr[c10], Math.max(iArr[0], Math.max(i102, iArr[2]))));
        if (z32) {
            int i1042 = 0;
            this.f1231z = 0;
            i25 = 0;
            while (i25 < virtualChildCount2) {
            }
        }
        int paddingRight2 = getPaddingRight() + getPaddingLeft() + this.f1231z;
        this.f1231z = paddingRight2;
        int resolveSizeAndState22 = View.resolveSizeAndState(Math.max(paddingRight2, getSuggestedMinimumWidth()), i6, 0);
        i12 = (16777215 & resolveSizeAndState22) - this.f1231z;
        if (z30) {
        }
        f = this.A;
        if (f > 0.0f) {
        }
        iArr[3] = -1;
        iArr[2] = -1;
        iArr[1] = -1;
        iArr[0] = -1;
        iArr2[3] = -1;
        iArr2[2] = -1;
        iArr2[1] = -1;
        iArr2[0] = -1;
        this.f1231z = 0;
        int i1072 = i12;
        int i1082 = -1;
        i13 = 0;
        float f192 = f16;
        i14 = i103;
        while (i13 < virtualChildCount2) {
        }
        i15 = i10;
        i16 = i11;
        this.f1231z = getPaddingRight() + getPaddingLeft() + this.f1231z;
        i17 = iArr[1];
        if (i17 != -1) {
        }
        c11 = 3;
        i18 = 0;
        max = Math.max(i1082, Math.max(iArr2[c11], Math.max(iArr2[0], Math.max(iArr2[1], iArr2[2]))) + Math.max(iArr[c11], Math.max(iArr[0], Math.max(i17, iArr[2]))));
        if (!z29) {
        }
        i91 = max;
        setMeasuredDimension(resolveSizeAndState22 | ((-16777216) & i14), View.resolveSizeAndState(Math.max(getPaddingBottom() + getPaddingTop() + i91, getSuggestedMinimumHeight()), i15, i14 << 16));
        if (z31) {
        }
    }

    public void setBaselineAligned(boolean z10) {
        this.f1226u = z10;
    }

    public void setBaselineAlignedChildIndex(int i6) {
        if (i6 >= 0 && i6 < getChildCount()) {
            this.f1227v = i6;
            return;
        }
        throw new IllegalArgumentException("base aligned child index out of range (0, " + getChildCount() + ")");
    }

    public void setDividerDrawable(Drawable drawable) {
        if (drawable == this.E) {
            return;
        }
        this.E = drawable;
        boolean z10 = false;
        if (drawable != null) {
            this.F = drawable.getIntrinsicWidth();
            this.G = drawable.getIntrinsicHeight();
        } else {
            this.F = 0;
            this.G = 0;
        }
        if (drawable == null) {
            z10 = true;
        }
        setWillNotDraw(z10);
        requestLayout();
    }

    public void setDividerPadding(int i6) {
        this.I = i6;
    }

    public void setGravity(int i6) {
        if (this.f1230y != i6) {
            if ((8388615 & i6) == 0) {
                i6 |= 8388611;
            }
            if ((i6 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) == 0) {
                i6 |= 48;
            }
            this.f1230y = i6;
            requestLayout();
        }
    }

    public void setHorizontalGravity(int i6) {
        int i10 = i6 & 8388615;
        int i11 = this.f1230y;
        if ((8388615 & i11) != i10) {
            this.f1230y = i10 | ((-8388616) & i11);
            requestLayout();
        }
    }

    public void setMeasureWithLargestChildEnabled(boolean z10) {
        this.B = z10;
    }

    public void setOrientation(int i6) {
        if (this.f1229x != i6) {
            this.f1229x = i6;
            requestLayout();
        }
    }

    public void setShowDividers(int i6) {
        if (i6 != this.H) {
            requestLayout();
        }
        this.H = i6;
    }

    public void setVerticalGravity(int i6) {
        int i10 = i6 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle;
        int i11 = this.f1230y;
        if ((i11 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) != i10) {
            this.f1230y = i10 | (i11 & (-113));
            requestLayout();
        }
    }

    public void setWeightSum(float f) {
        this.A = Math.max(0.0f, f);
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    public LinearLayoutCompat(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public LinearLayoutCompat(Context context, AttributeSet attributeSet, int i6) {
        super(context, attributeSet, i6);
        Drawable drawable;
        int resourceId;
        this.f1226u = true;
        this.f1227v = -1;
        this.f1228w = 0;
        this.f1230y = 8388659;
        int[] iArr = kc.f.M;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i6, 0);
        t0.d0.p(this, context, iArr, attributeSet, obtainStyledAttributes, i6);
        int i10 = obtainStyledAttributes.getInt(1, -1);
        if (i10 >= 0) {
            setOrientation(i10);
        }
        int i11 = obtainStyledAttributes.getInt(0, -1);
        if (i11 >= 0) {
            setGravity(i11);
        }
        boolean z10 = obtainStyledAttributes.getBoolean(2, true);
        if (!z10) {
            setBaselineAligned(z10);
        }
        this.A = obtainStyledAttributes.getFloat(4, -1.0f);
        this.f1227v = obtainStyledAttributes.getInt(3, -1);
        this.B = obtainStyledAttributes.getBoolean(7, false);
        if (obtainStyledAttributes.hasValue(5) && (resourceId = obtainStyledAttributes.getResourceId(5, 0)) != 0) {
            drawable = hc.d.H(context, resourceId);
        } else {
            drawable = obtainStyledAttributes.getDrawable(5);
        }
        setDividerDrawable(drawable);
        this.H = obtainStyledAttributes.getInt(8, 0);
        this.I = obtainStyledAttributes.getDimensionPixelSize(6, 0);
        obtainStyledAttributes.recycle();
    }
}
