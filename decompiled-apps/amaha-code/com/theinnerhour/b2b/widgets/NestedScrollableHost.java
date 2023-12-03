package com.theinnerhour.b2b.widgets;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.viewpager2.widget.ViewPager2;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
/* compiled from: NestedScrollableHost.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0016\u0010\n\u001a\u0004\u0018\u00010\u00078BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\u0011"}, d2 = {"Lcom/theinnerhour/b2b/widgets/NestedScrollableHost;", "Landroid/widget/FrameLayout;", "", "Landroidx/viewpager2/widget/ViewPager2;", "getAncestorViewPagers", "()Ljava/util/List;", "ancestorViewPagers", "Landroid/view/View;", "getChild", "()Landroid/view/View;", "child", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class NestedScrollableHost extends FrameLayout {

    /* renamed from: u  reason: collision with root package name */
    public final int f11845u;

    /* renamed from: v  reason: collision with root package name */
    public float f11846v;

    /* renamed from: w  reason: collision with root package name */
    public float f11847w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NestedScrollableHost(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        i.g(context, "context");
        new LinkedHashMap();
        this.f11845u = ViewConfiguration.get(getContext()).getScaledTouchSlop();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:5:0x0011 -> B:6:0x0012). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final List<ViewPager2> getAncestorViewPagers() {
        View view;
        ArrayList arrayList = new ArrayList();
        ViewParent parent = getParent();
        if (parent instanceof View) {
            view = (View) parent;
            while (view != null) {
                if (view instanceof ViewPager2) {
                    arrayList.add(view);
                }
                ViewParent parent2 = view.getParent();
                if (parent2 instanceof View) {
                    view = (View) parent2;
                }
            }
            return arrayList;
        }
        view = null;
        while (view != null) {
        }
        return arrayList;
    }

    private final View getChild() {
        if (getChildCount() > 0) {
            return getChildAt(0);
        }
        return null;
    }

    public final boolean a(float f, int i6) {
        int i10 = -((int) Math.signum(f));
        if (i6 != 0) {
            if (i6 == 1) {
                View child = getChild();
                if (child == null) {
                    return false;
                }
                return child.canScrollVertically(i10);
            }
            throw new IllegalArgumentException("Unknown scroll orientation");
        }
        View child2 = getChild();
        if (child2 == null) {
            return false;
        }
        return child2.canScrollHorizontally(i10);
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent e10) {
        boolean z10;
        float f;
        boolean z11;
        i.g(e10, "e");
        for (ViewPager2 viewPager2 : getAncestorViewPagers()) {
            int orientation = viewPager2.getOrientation();
            float f2 = 1.0f;
            if (a(-1.0f, orientation) || a(1.0f, orientation)) {
                if (e10.getAction() == 0) {
                    this.f11846v = e10.getX();
                    this.f11847w = e10.getY();
                    getParent().requestDisallowInterceptTouchEvent(true);
                } else if (e10.getAction() == 2) {
                    float x10 = e10.getX() - this.f11846v;
                    float y10 = e10.getY() - this.f11847w;
                    if (orientation == 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    float abs = Math.abs(x10);
                    if (z10) {
                        f = 0.5f;
                    } else {
                        f = 1.0f;
                    }
                    float f10 = abs * f;
                    float abs2 = Math.abs(y10);
                    if (!z10) {
                        f2 = 0.5f;
                    }
                    float f11 = abs2 * f2;
                    float f12 = this.f11845u;
                    if (f10 > f12 || f11 > f12) {
                        if (f11 > f10) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        if (z10 == z11) {
                            getParent().requestDisallowInterceptTouchEvent(false);
                        } else {
                            if (!z10) {
                                x10 = y10;
                            }
                            if (a(x10, orientation)) {
                                getParent().requestDisallowInterceptTouchEvent(true);
                            } else {
                                getParent().requestDisallowInterceptTouchEvent(false);
                            }
                        }
                    }
                }
            }
        }
        return super.onInterceptTouchEvent(e10);
    }
}
