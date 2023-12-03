package androidx.fragment.app;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.strictmode.FragmentTagUsageViolation;
import h1.a;
/* compiled from: FragmentLayoutInflaterFactory.java */
/* loaded from: classes.dex */
public final class v implements LayoutInflater.Factory2 {

    /* renamed from: u  reason: collision with root package name */
    public final y f2296u;

    public v(y yVar) {
        this.f2296u = yVar;
    }

    @Override // android.view.LayoutInflater.Factory
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }

    @Override // android.view.LayoutInflater.Factory2
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        boolean z10;
        e0 g5;
        boolean equals = FragmentContainerView.class.getName().equals(str);
        y yVar = this.f2296u;
        if (equals) {
            return new FragmentContainerView(context, attributeSet, yVar);
        }
        if ("fragment".equals(str)) {
            String attributeValue = attributeSet.getAttributeValue(null, "class");
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, tr.r.f33545b0);
            if (attributeValue == null) {
                attributeValue = obtainStyledAttributes.getString(0);
            }
            int resourceId = obtainStyledAttributes.getResourceId(1, -1);
            String string = obtainStyledAttributes.getString(2);
            obtainStyledAttributes.recycle();
            if (attributeValue != null) {
                try {
                    z10 = Fragment.class.isAssignableFrom(t.b(context.getClassLoader(), attributeValue));
                } catch (ClassNotFoundException unused) {
                    z10 = false;
                }
                if (z10) {
                    int id2 = view != null ? view.getId() : 0;
                    if (id2 == -1 && resourceId == -1 && string == null) {
                        throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Must specify unique android:id, android:tag, or have a parent with an id for " + attributeValue);
                    }
                    Fragment E = resourceId != -1 ? yVar.E(resourceId) : null;
                    if (E == null && string != null) {
                        E = yVar.F(string);
                    }
                    if (E == null && id2 != -1) {
                        E = yVar.E(id2);
                    }
                    if (E == null) {
                        t K = yVar.K();
                        context.getClassLoader();
                        E = K.a(attributeValue);
                        E.mFromLayout = true;
                        E.mFragmentId = resourceId != 0 ? resourceId : id2;
                        E.mContainerId = id2;
                        E.mTag = string;
                        E.mInLayout = true;
                        E.mFragmentManager = yVar;
                        u<?> uVar = yVar.f2324v;
                        E.mHost = uVar;
                        E.onInflate(uVar.f2292v, attributeSet, E.mSavedFragmentState);
                        g5 = yVar.a(E);
                        if (y.P(2)) {
                            Log.v("FragmentManager", "Fragment " + E + " has been inflated via the <fragment> tag: id=0x" + Integer.toHexString(resourceId));
                        }
                    } else if (!E.mInLayout) {
                        E.mInLayout = true;
                        E.mFragmentManager = yVar;
                        u<?> uVar2 = yVar.f2324v;
                        E.mHost = uVar2;
                        E.onInflate(uVar2.f2292v, attributeSet, E.mSavedFragmentState);
                        g5 = yVar.g(E);
                        if (y.P(2)) {
                            Log.v("FragmentManager", "Retained Fragment " + E + " has been re-attached via the <fragment> tag: id=0x" + Integer.toHexString(resourceId));
                        }
                    } else {
                        throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Duplicate id 0x" + Integer.toHexString(resourceId) + ", tag " + string + ", or parent id 0x" + Integer.toHexString(id2) + " with another fragment for " + attributeValue);
                    }
                    ViewGroup viewGroup = (ViewGroup) view;
                    a.b bVar = h1.a.f16999a;
                    FragmentTagUsageViolation fragmentTagUsageViolation = new FragmentTagUsageViolation(E, viewGroup);
                    h1.a.c(fragmentTagUsageViolation);
                    a.b a10 = h1.a.a(E);
                    if (a10.f17007a.contains(a.EnumC0268a.DETECT_FRAGMENT_TAG_USAGE) && h1.a.e(a10, E.getClass(), FragmentTagUsageViolation.class)) {
                        h1.a.b(a10, fragmentTagUsageViolation);
                    }
                    E.mContainer = viewGroup;
                    g5.j();
                    g5.i();
                    View view2 = E.mView;
                    if (view2 != null) {
                        if (resourceId != 0) {
                            view2.setId(resourceId);
                        }
                        if (E.mView.getTag() == null) {
                            E.mView.setTag(string);
                        }
                        E.mView.addOnAttachStateChangeListener(new a(g5));
                        return E.mView;
                    }
                    throw new IllegalStateException(defpackage.b.m("Fragment ", attributeValue, " did not create a view."));
                }
            }
            return null;
        }
        return null;
    }

    /* compiled from: FragmentLayoutInflaterFactory.java */
    /* loaded from: classes.dex */
    public class a implements View.OnAttachStateChangeListener {

        /* renamed from: u  reason: collision with root package name */
        public final /* synthetic */ e0 f2297u;

        public a(e0 e0Var) {
            this.f2297u = e0Var;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewAttachedToWindow(View view) {
            e0 e0Var = this.f2297u;
            Fragment fragment = e0Var.f2166c;
            e0Var.j();
            t0.f((ViewGroup) fragment.mView.getParent(), v.this.f2296u).e();
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewDetachedFromWindow(View view) {
        }
    }
}
