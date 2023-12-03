package androidx.fragment.app;

import android.animation.LayoutTransition;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import com.theinnerhour.b2b.R;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
/* compiled from: FragmentContainerView.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0010\u0010\u000b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tH\u0001J\u0019\u0010\u000e\u001a\u00028\u0000\"\n\b\u0000\u0010\r*\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Landroidx/fragment/app/FragmentContainerView;", "Landroid/widget/FrameLayout;", "Landroid/animation/LayoutTransition;", "transition", "Lhs/k;", "setLayoutTransition", "Landroid/view/View$OnApplyWindowInsetsListener;", "listener", "setOnApplyWindowInsetsListener", "", "drawDisappearingViewsFirst", "setDrawDisappearingViewsLast", "Landroidx/fragment/app/Fragment;", "F", "getFragment", "()Landroidx/fragment/app/Fragment;", "fragment_release"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes.dex */
public final class FragmentContainerView extends FrameLayout {

    /* renamed from: u  reason: collision with root package name */
    public final ArrayList f2126u;

    /* renamed from: v  reason: collision with root package name */
    public final ArrayList f2127v;

    /* renamed from: w  reason: collision with root package name */
    public View.OnApplyWindowInsetsListener f2128w;

    /* renamed from: x  reason: collision with root package name */
    public boolean f2129x;

    public FragmentContainerView(Context context) {
        super(context);
        this.f2126u = new ArrayList();
        this.f2127v = new ArrayList();
        this.f2129x = true;
    }

    public final void a(View view) {
        if (this.f2127v.contains(view)) {
            this.f2126u.add(view);
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View child, int i6, ViewGroup.LayoutParams layoutParams) {
        Fragment fragment;
        kotlin.jvm.internal.i.g(child, "child");
        Object tag = child.getTag(R.id.fragment_container_view_tag);
        if (tag instanceof Fragment) {
            fragment = (Fragment) tag;
        } else {
            fragment = null;
        }
        if (fragment != null) {
            super.addView(child, i6, layoutParams);
            return;
        }
        throw new IllegalStateException(("Views added to a FragmentContainerView must be associated with a Fragment. View " + child + " is not associated with a Fragment.").toString());
    }

    @Override // android.view.ViewGroup, android.view.View
    public final WindowInsets dispatchApplyWindowInsets(WindowInsets insets) {
        t0.s0 l2;
        kotlin.jvm.internal.i.g(insets, "insets");
        t0.s0 h10 = t0.s0.h(insets, null);
        View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = this.f2128w;
        if (onApplyWindowInsetsListener != null) {
            WindowInsets onApplyWindowInsets = onApplyWindowInsetsListener.onApplyWindowInsets(this, insets);
            kotlin.jvm.internal.i.f(onApplyWindowInsets, "onApplyWindowInsetsListe…lyWindowInsets(v, insets)");
            l2 = t0.s0.h(onApplyWindowInsets, null);
        } else {
            l2 = t0.d0.l(this, h10);
        }
        kotlin.jvm.internal.i.f(l2, "if (applyWindowInsetsLis…, insetsCompat)\n        }");
        if (!l2.f32351a.m()) {
            int childCount = getChildCount();
            for (int i6 = 0; i6 < childCount; i6++) {
                t0.d0.b(getChildAt(i6), l2);
            }
        }
        return insets;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        kotlin.jvm.internal.i.g(canvas, "canvas");
        if (this.f2129x) {
            Iterator it = this.f2126u.iterator();
            while (it.hasNext()) {
                super.drawChild(canvas, (View) it.next(), getDrawingTime());
            }
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View child, long j10) {
        kotlin.jvm.internal.i.g(canvas, "canvas");
        kotlin.jvm.internal.i.g(child, "child");
        if (this.f2129x) {
            ArrayList arrayList = this.f2126u;
            if ((!arrayList.isEmpty()) && arrayList.contains(child)) {
                return false;
            }
        }
        return super.drawChild(canvas, child, j10);
    }

    @Override // android.view.ViewGroup
    public final void endViewTransition(View view) {
        kotlin.jvm.internal.i.g(view, "view");
        this.f2127v.remove(view);
        if (this.f2126u.remove(view)) {
            this.f2129x = true;
        }
        super.endViewTransition(view);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r0v14, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v16 */
    public final <F extends Fragment> F getFragment() {
        p pVar;
        Fragment fragment;
        y supportFragmentManager;
        FragmentContainerView fragmentContainerView = this;
        while (true) {
            pVar = null;
            if (fragmentContainerView != 0) {
                Object tag = fragmentContainerView.getTag(R.id.fragment_container_view_tag);
                if (tag instanceof Fragment) {
                    fragment = (Fragment) tag;
                } else {
                    fragment = null;
                }
                if (fragment != null) {
                    break;
                }
                ViewParent parent = fragmentContainerView.getParent();
                if (parent instanceof View) {
                    fragmentContainerView = (View) parent;
                } else {
                    fragmentContainerView = 0;
                }
            } else {
                fragment = null;
                break;
            }
        }
        if (fragment != null) {
            if (fragment.isAdded()) {
                supportFragmentManager = fragment.getChildFragmentManager();
            } else {
                throw new IllegalStateException("The Fragment " + fragment + " that owns View " + this + " has already been destroyed. Nested fragments should always use the child FragmentManager.");
            }
        } else {
            Context context = getContext();
            while (true) {
                if (!(context instanceof ContextWrapper)) {
                    break;
                } else if (context instanceof p) {
                    pVar = (p) context;
                    break;
                } else {
                    context = ((ContextWrapper) context).getBaseContext();
                }
            }
            if (pVar != null) {
                supportFragmentManager = pVar.getSupportFragmentManager();
            } else {
                throw new IllegalStateException("View " + this + " is not within a subclass of FragmentActivity.");
            }
        }
        return (F) supportFragmentManager.E(getId());
    }

    @Override // android.view.View
    public final WindowInsets onApplyWindowInsets(WindowInsets insets) {
        kotlin.jvm.internal.i.g(insets, "insets");
        return insets;
    }

    @Override // android.view.ViewGroup
    public final void removeAllViewsInLayout() {
        int childCount = getChildCount();
        while (true) {
            childCount--;
            if (-1 < childCount) {
                View view = getChildAt(childCount);
                kotlin.jvm.internal.i.f(view, "view");
                a(view);
            } else {
                super.removeAllViewsInLayout();
                return;
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void removeView(View view) {
        kotlin.jvm.internal.i.g(view, "view");
        a(view);
        super.removeView(view);
    }

    @Override // android.view.ViewGroup
    public final void removeViewAt(int i6) {
        View view = getChildAt(i6);
        kotlin.jvm.internal.i.f(view, "view");
        a(view);
        super.removeViewAt(i6);
    }

    @Override // android.view.ViewGroup
    public final void removeViewInLayout(View view) {
        kotlin.jvm.internal.i.g(view, "view");
        a(view);
        super.removeViewInLayout(view);
    }

    @Override // android.view.ViewGroup
    public final void removeViews(int i6, int i10) {
        int i11 = i6 + i10;
        for (int i12 = i6; i12 < i11; i12++) {
            View view = getChildAt(i12);
            kotlin.jvm.internal.i.f(view, "view");
            a(view);
        }
        super.removeViews(i6, i10);
    }

    @Override // android.view.ViewGroup
    public final void removeViewsInLayout(int i6, int i10) {
        int i11 = i6 + i10;
        for (int i12 = i6; i12 < i11; i12++) {
            View view = getChildAt(i12);
            kotlin.jvm.internal.i.f(view, "view");
            a(view);
        }
        super.removeViewsInLayout(i6, i10);
    }

    public final void setDrawDisappearingViewsLast(boolean z10) {
        this.f2129x = z10;
    }

    @Override // android.view.ViewGroup
    public void setLayoutTransition(LayoutTransition layoutTransition) {
        throw new UnsupportedOperationException("FragmentContainerView does not support Layout Transitions or animateLayoutChanges=\"true\".");
    }

    @Override // android.view.View
    public void setOnApplyWindowInsetsListener(View.OnApplyWindowInsetsListener listener) {
        kotlin.jvm.internal.i.g(listener, "listener");
        this.f2128w = listener;
    }

    @Override // android.view.ViewGroup
    public final void startViewTransition(View view) {
        kotlin.jvm.internal.i.g(view, "view");
        if (view.getParent() == this) {
            this.f2127v.add(view);
        }
        super.startViewTransition(view);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FragmentContainerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        String str;
        kotlin.jvm.internal.i.g(context, "context");
        this.f2126u = new ArrayList();
        this.f2127v = new ArrayList();
        this.f2129x = true;
        if (attributeSet != null) {
            String classAttribute = attributeSet.getClassAttribute();
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, tr.r.c0, 0, 0);
            if (classAttribute == null) {
                classAttribute = obtainStyledAttributes.getString(0);
                str = "android:name";
            } else {
                str = "class";
            }
            obtainStyledAttributes.recycle();
            if (classAttribute == null || isInEditMode()) {
                return;
            }
            throw new UnsupportedOperationException("FragmentContainerView must be within a FragmentActivity to use " + str + "=\"" + classAttribute + '\"');
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FragmentContainerView(Context context, AttributeSet attrs, y fm2) {
        super(context, attrs);
        View view;
        kotlin.jvm.internal.i.g(context, "context");
        kotlin.jvm.internal.i.g(attrs, "attrs");
        kotlin.jvm.internal.i.g(fm2, "fm");
        this.f2126u = new ArrayList();
        this.f2127v = new ArrayList();
        this.f2129x = true;
        String classAttribute = attrs.getClassAttribute();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attrs, tr.r.c0, 0, 0);
        classAttribute = classAttribute == null ? obtainStyledAttributes.getString(0) : classAttribute;
        String string = obtainStyledAttributes.getString(1);
        obtainStyledAttributes.recycle();
        int id2 = getId();
        Fragment E = fm2.E(id2);
        if (classAttribute != null && E == null) {
            if (id2 == -1) {
                throw new IllegalStateException(defpackage.b.m("FragmentContainerView must have an android:id to add Fragment ", classAttribute, string != null ? " with tag ".concat(string) : ""));
            }
            t K = fm2.K();
            context.getClassLoader();
            Fragment a10 = K.a(classAttribute);
            kotlin.jvm.internal.i.f(a10, "fm.fragmentFactory.insta…ontext.classLoader, name)");
            a10.onInflate(context, attrs, (Bundle) null);
            a aVar = new a(fm2);
            aVar.f2205p = true;
            a10.mContainer = this;
            aVar.e(getId(), a10, string, 1);
            if (!aVar.f2196g) {
                aVar.f2197h = false;
                aVar.f2130q.z(aVar, true);
            } else {
                throw new IllegalStateException("This transaction is already being added to the back stack");
            }
        }
        Iterator it = fm2.f2307c.d().iterator();
        while (it.hasNext()) {
            e0 e0Var = (e0) it.next();
            Fragment fragment = e0Var.f2166c;
            if (fragment.mContainerId == getId() && (view = fragment.mView) != null && view.getParent() == null) {
                fragment.mContainer = this;
                e0Var.a();
            }
        }
    }
}
