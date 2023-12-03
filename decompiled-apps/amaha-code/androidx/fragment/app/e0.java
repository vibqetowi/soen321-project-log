package androidx.fragment.app;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.fragment.app.strictmode.WrongFragmentContainerViolation;
import androidx.fragment.app.t0;
import com.theinnerhour.b2b.R;
import h1.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;
import t0.d0;
/* compiled from: FragmentStateManager.java */
/* loaded from: classes.dex */
public final class e0 {

    /* renamed from: a  reason: collision with root package name */
    public final w f2164a;

    /* renamed from: b  reason: collision with root package name */
    public final g0 f2165b;

    /* renamed from: c  reason: collision with root package name */
    public final Fragment f2166c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f2167d = false;

    /* renamed from: e  reason: collision with root package name */
    public int f2168e = -1;

    public e0(w wVar, g0 g0Var, Fragment fragment) {
        this.f2164a = wVar;
        this.f2165b = g0Var;
        this.f2166c = fragment;
    }

    public final void a() {
        View view;
        View view2;
        g0 g0Var = this.f2165b;
        g0Var.getClass();
        Fragment fragment = this.f2166c;
        ViewGroup viewGroup = fragment.mContainer;
        int i6 = -1;
        if (viewGroup != null) {
            ArrayList<Fragment> arrayList = g0Var.f2183a;
            int indexOf = arrayList.indexOf(fragment);
            int i10 = indexOf - 1;
            while (true) {
                if (i10 < 0) {
                    while (true) {
                        indexOf++;
                        if (indexOf >= arrayList.size()) {
                            break;
                        }
                        Fragment fragment2 = arrayList.get(indexOf);
                        if (fragment2.mContainer == viewGroup && (view = fragment2.mView) != null) {
                            i6 = viewGroup.indexOfChild(view);
                            break;
                        }
                    }
                } else {
                    Fragment fragment3 = arrayList.get(i10);
                    if (fragment3.mContainer == viewGroup && (view2 = fragment3.mView) != null) {
                        i6 = viewGroup.indexOfChild(view2) + 1;
                        break;
                    }
                    i10--;
                }
            }
        }
        fragment.mContainer.addView(fragment.mView, i6);
    }

    public final void b() {
        boolean P = y.P(3);
        Fragment fragment = this.f2166c;
        if (P) {
            Log.d("FragmentManager", "moveto ATTACHED: " + fragment);
        }
        Fragment fragment2 = fragment.mTarget;
        e0 e0Var = null;
        g0 g0Var = this.f2165b;
        if (fragment2 != null) {
            e0 e0Var2 = g0Var.f2184b.get(fragment2.mWho);
            if (e0Var2 != null) {
                fragment.mTargetWho = fragment.mTarget.mWho;
                fragment.mTarget = null;
                e0Var = e0Var2;
            } else {
                throw new IllegalStateException("Fragment " + fragment + " declared target fragment " + fragment.mTarget + " that does not belong to this FragmentManager!");
            }
        } else {
            String str = fragment.mTargetWho;
            if (str != null && (e0Var = g0Var.f2184b.get(str)) == null) {
                StringBuilder sb2 = new StringBuilder("Fragment ");
                sb2.append(fragment);
                sb2.append(" declared target fragment ");
                throw new IllegalStateException(r1.b0.b(sb2, fragment.mTargetWho, " that does not belong to this FragmentManager!"));
            }
        }
        if (e0Var != null) {
            e0Var.j();
        }
        y yVar = fragment.mFragmentManager;
        fragment.mHost = yVar.f2324v;
        fragment.mParentFragment = yVar.f2326x;
        w wVar = this.f2164a;
        wVar.g(false);
        fragment.performAttach();
        wVar.b(false);
    }

    public final int c() {
        t0.b bVar;
        Fragment fragment = this.f2166c;
        if (fragment.mFragmentManager == null) {
            return fragment.mState;
        }
        int i6 = this.f2168e;
        int ordinal = fragment.mMaxState.ordinal();
        int i10 = 0;
        if (ordinal != 1) {
            if (ordinal != 2) {
                if (ordinal != 3) {
                    if (ordinal != 4) {
                        i6 = Math.min(i6, -1);
                    }
                } else {
                    i6 = Math.min(i6, 5);
                }
            } else {
                i6 = Math.min(i6, 1);
            }
        } else {
            i6 = Math.min(i6, 0);
        }
        if (fragment.mFromLayout) {
            if (fragment.mInLayout) {
                i6 = Math.max(this.f2168e, 2);
                View view = fragment.mView;
                if (view != null && view.getParent() == null) {
                    i6 = Math.min(i6, 2);
                }
            } else {
                i6 = this.f2168e < 4 ? Math.min(i6, fragment.mState) : Math.min(i6, 1);
            }
        }
        if (!fragment.mAdded) {
            i6 = Math.min(i6, 1);
        }
        ViewGroup viewGroup = fragment.mContainer;
        if (viewGroup != null) {
            t0 f = t0.f(viewGroup, fragment.getParentFragmentManager());
            f.getClass();
            t0.b d10 = f.d(fragment);
            if (d10 != null) {
                i10 = d10.f2286b;
            }
            Iterator<t0.b> it = f.f2281c.iterator();
            while (true) {
                if (it.hasNext()) {
                    bVar = it.next();
                    if (bVar.f2287c.equals(fragment) && !bVar.f) {
                        break;
                    }
                } else {
                    bVar = null;
                    break;
                }
            }
            if (bVar != null && (i10 == 0 || i10 == 1)) {
                i10 = bVar.f2286b;
            }
        }
        if (i10 == 2) {
            i6 = Math.min(i6, 6);
        } else if (i10 == 3) {
            i6 = Math.max(i6, 3);
        } else if (fragment.mRemoving) {
            if (fragment.isInBackStack()) {
                i6 = Math.min(i6, 1);
            } else {
                i6 = Math.min(i6, -1);
            }
        }
        if (fragment.mDeferStart && fragment.mState < 5) {
            i6 = Math.min(i6, 4);
        }
        if (y.P(2)) {
            Log.v("FragmentManager", "computeExpectedState() of " + i6 + " for " + fragment);
        }
        return i6;
    }

    public final void d() {
        boolean P = y.P(3);
        Fragment fragment = this.f2166c;
        if (P) {
            Log.d("FragmentManager", "moveto CREATED: " + fragment);
        }
        if (!fragment.mIsCreated) {
            w wVar = this.f2164a;
            wVar.h(false);
            fragment.performCreate(fragment.mSavedFragmentState);
            wVar.c(false);
            return;
        }
        fragment.restoreChildFragmentState(fragment.mSavedFragmentState);
        fragment.mState = 1;
    }

    public final void e() {
        String str;
        Fragment fragment = this.f2166c;
        if (fragment.mFromLayout) {
            return;
        }
        if (y.P(3)) {
            Log.d("FragmentManager", "moveto CREATE_VIEW: " + fragment);
        }
        LayoutInflater performGetLayoutInflater = fragment.performGetLayoutInflater(fragment.mSavedFragmentState);
        ViewGroup viewGroup = fragment.mContainer;
        if (viewGroup == null) {
            int i6 = fragment.mContainerId;
            if (i6 != 0) {
                if (i6 != -1) {
                    viewGroup = (ViewGroup) fragment.mFragmentManager.f2325w.b(i6);
                    if (viewGroup == null) {
                        if (!fragment.mRestored) {
                            try {
                                str = fragment.getResources().getResourceName(fragment.mContainerId);
                            } catch (Resources.NotFoundException unused) {
                                str = "unknown";
                            }
                            throw new IllegalArgumentException("No view found for id 0x" + Integer.toHexString(fragment.mContainerId) + " (" + str + ") for fragment " + fragment);
                        }
                    } else if (!(viewGroup instanceof FragmentContainerView)) {
                        a.b bVar = h1.a.f16999a;
                        WrongFragmentContainerViolation wrongFragmentContainerViolation = new WrongFragmentContainerViolation(fragment, viewGroup);
                        h1.a.c(wrongFragmentContainerViolation);
                        a.b a10 = h1.a.a(fragment);
                        if (a10.f17007a.contains(a.EnumC0268a.DETECT_WRONG_FRAGMENT_CONTAINER) && h1.a.e(a10, fragment.getClass(), WrongFragmentContainerViolation.class)) {
                            h1.a.b(a10, wrongFragmentContainerViolation);
                        }
                    }
                } else {
                    throw new IllegalArgumentException(defpackage.b.k("Cannot create fragment ", fragment, " for a container view with no id"));
                }
            } else {
                viewGroup = null;
            }
        }
        fragment.mContainer = viewGroup;
        fragment.performCreateView(performGetLayoutInflater, viewGroup, fragment.mSavedFragmentState);
        View view = fragment.mView;
        if (view != null) {
            view.setSaveFromParentEnabled(false);
            fragment.mView.setTag(R.id.fragment_container_view_tag, fragment);
            if (viewGroup != null) {
                a();
            }
            if (fragment.mHidden) {
                fragment.mView.setVisibility(8);
            }
            View view2 = fragment.mView;
            WeakHashMap<View, t0.o0> weakHashMap = t0.d0.f32288a;
            if (d0.g.b(view2)) {
                d0.h.c(fragment.mView);
            } else {
                View view3 = fragment.mView;
                view3.addOnAttachStateChangeListener(new a(view3));
            }
            fragment.performViewCreated();
            this.f2164a.m(fragment, fragment.mView, fragment.mSavedFragmentState, false);
            int visibility = fragment.mView.getVisibility();
            fragment.setPostOnViewCreatedAlpha(fragment.mView.getAlpha());
            if (fragment.mContainer != null && visibility == 0) {
                View findFocus = fragment.mView.findFocus();
                if (findFocus != null) {
                    fragment.setFocusedView(findFocus);
                    if (y.P(2)) {
                        Log.v("FragmentManager", "requestFocus: Saved focused view " + findFocus + " for Fragment " + fragment);
                    }
                }
                fragment.mView.setAlpha(0.0f);
            }
        }
        fragment.mState = 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00b9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void f() {
        boolean z10;
        boolean z11;
        Fragment b10;
        boolean z12;
        boolean P = y.P(3);
        Fragment fragment = this.f2166c;
        if (P) {
            Log.d("FragmentManager", "movefrom CREATED: " + fragment);
        }
        boolean z13 = true;
        if (fragment.mRemoving && !fragment.isInBackStack()) {
            z10 = true;
        } else {
            z10 = false;
        }
        g0 g0Var = this.f2165b;
        if (z10 && !fragment.mBeingSaved) {
            g0Var.i(fragment.mWho, null);
        }
        if (!z10) {
            b0 b0Var = g0Var.f2186d;
            if (!b0Var.f2145x.containsKey(fragment.mWho) || !b0Var.A) {
                z12 = true;
            } else {
                z12 = b0Var.B;
            }
            if (!z12) {
                z11 = false;
                if (!z11) {
                    u<?> uVar = fragment.mHost;
                    if (uVar instanceof androidx.lifecycle.r0) {
                        z13 = g0Var.f2186d.B;
                    } else {
                        Context context = uVar.f2292v;
                        if (context instanceof Activity) {
                            z13 = true ^ ((Activity) context).isChangingConfigurations();
                        }
                    }
                    if ((z10 && !fragment.mBeingSaved) || z13) {
                        g0Var.f2186d.f(fragment);
                    }
                    fragment.performDestroy();
                    this.f2164a.d(false);
                    Iterator it = g0Var.d().iterator();
                    while (it.hasNext()) {
                        e0 e0Var = (e0) it.next();
                        if (e0Var != null) {
                            String str = fragment.mWho;
                            Fragment fragment2 = e0Var.f2166c;
                            if (str.equals(fragment2.mTargetWho)) {
                                fragment2.mTarget = fragment;
                                fragment2.mTargetWho = null;
                            }
                        }
                    }
                    String str2 = fragment.mTargetWho;
                    if (str2 != null) {
                        fragment.mTarget = g0Var.b(str2);
                    }
                    g0Var.h(this);
                    return;
                }
                String str3 = fragment.mTargetWho;
                if (str3 != null && (b10 = g0Var.b(str3)) != null && b10.mRetainInstance) {
                    fragment.mTarget = b10;
                }
                fragment.mState = 0;
                return;
            }
        }
        z11 = true;
        if (!z11) {
        }
    }

    public final void g() {
        View view;
        boolean P = y.P(3);
        Fragment fragment = this.f2166c;
        if (P) {
            Log.d("FragmentManager", "movefrom CREATE_VIEW: " + fragment);
        }
        ViewGroup viewGroup = fragment.mContainer;
        if (viewGroup != null && (view = fragment.mView) != null) {
            viewGroup.removeView(view);
        }
        fragment.performDestroyView();
        this.f2164a.n(false);
        fragment.mContainer = null;
        fragment.mView = null;
        fragment.mViewLifecycleOwner = null;
        fragment.mViewLifecycleOwnerLiveData.l(null);
        fragment.mInLayout = false;
    }

    public final void h() {
        boolean P = y.P(3);
        Fragment fragment = this.f2166c;
        if (P) {
            Log.d("FragmentManager", "movefrom ATTACHED: " + fragment);
        }
        fragment.performDetach();
        boolean z10 = false;
        this.f2164a.e(false);
        fragment.mState = -1;
        fragment.mHost = null;
        fragment.mParentFragment = null;
        fragment.mFragmentManager = null;
        boolean z11 = true;
        if (fragment.mRemoving && !fragment.isInBackStack()) {
            z10 = true;
        }
        if (!z10) {
            b0 b0Var = this.f2165b.f2186d;
            if (b0Var.f2145x.containsKey(fragment.mWho) && b0Var.A) {
                z11 = b0Var.B;
            }
            if (!z11) {
                return;
            }
        }
        if (y.P(3)) {
            Log.d("FragmentManager", "initState called for fragment: " + fragment);
        }
        fragment.initState();
    }

    public final void i() {
        Fragment fragment = this.f2166c;
        if (fragment.mFromLayout && fragment.mInLayout && !fragment.mPerformedCreateView) {
            if (y.P(3)) {
                Log.d("FragmentManager", "moveto CREATE_VIEW: " + fragment);
            }
            fragment.performCreateView(fragment.performGetLayoutInflater(fragment.mSavedFragmentState), null, fragment.mSavedFragmentState);
            View view = fragment.mView;
            if (view != null) {
                view.setSaveFromParentEnabled(false);
                fragment.mView.setTag(R.id.fragment_container_view_tag, fragment);
                if (fragment.mHidden) {
                    fragment.mView.setVisibility(8);
                }
                fragment.performViewCreated();
                this.f2164a.m(fragment, fragment.mView, fragment.mSavedFragmentState, false);
                fragment.mState = 2;
            }
        }
    }

    public final void j() {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        ViewGroup viewGroup3;
        boolean z10 = this.f2167d;
        Fragment fragment = this.f2166c;
        if (z10) {
            if (y.P(2)) {
                Log.v("FragmentManager", "Ignoring re-entrant call to moveToExpectedState() for " + fragment);
                return;
            }
            return;
        }
        try {
            this.f2167d = true;
            boolean z11 = false;
            while (true) {
                int c10 = c();
                int i6 = fragment.mState;
                g0 g0Var = this.f2165b;
                if (c10 != i6) {
                    w wVar = this.f2164a;
                    if (c10 > i6) {
                        switch (i6 + 1) {
                            case 0:
                                b();
                                continue;
                            case 1:
                                d();
                                continue;
                            case 2:
                                i();
                                e();
                                continue;
                            case 3:
                                if (y.P(3)) {
                                    Log.d("FragmentManager", "moveto ACTIVITY_CREATED: " + fragment);
                                }
                                fragment.performActivityCreated(fragment.mSavedFragmentState);
                                wVar.a(false);
                                continue;
                            case 4:
                                if (fragment.mView != null && (viewGroup3 = fragment.mContainer) != null) {
                                    t0 f = t0.f(viewGroup3, fragment.getParentFragmentManager());
                                    int b10 = defpackage.c.b(fragment.mView.getVisibility());
                                    f.getClass();
                                    if (y.P(2)) {
                                        Log.v("FragmentManager", "SpecialEffectsController: Enqueuing add operation for fragment " + fragment);
                                    }
                                    f.a(b10, 2, this);
                                }
                                fragment.mState = 4;
                                continue;
                            case 5:
                                if (y.P(3)) {
                                    Log.d("FragmentManager", "moveto STARTED: " + fragment);
                                }
                                fragment.performStart();
                                wVar.k(false);
                                continue;
                            case 6:
                                fragment.mState = 6;
                                continue;
                            case 7:
                                l();
                                continue;
                        }
                    } else {
                        switch (i6 - 1) {
                            case -1:
                                h();
                                continue;
                            case 0:
                                if (fragment.mBeingSaved) {
                                    if (g0Var.f2185c.get(fragment.mWho) == null) {
                                        n();
                                    }
                                }
                                f();
                                continue;
                            case 1:
                                g();
                                fragment.mState = 1;
                                continue;
                            case 2:
                                fragment.mInLayout = false;
                                fragment.mState = 2;
                                continue;
                            case 3:
                                if (y.P(3)) {
                                    Log.d("FragmentManager", "movefrom ACTIVITY_CREATED: " + fragment);
                                }
                                if (fragment.mBeingSaved) {
                                    n();
                                } else if (fragment.mView != null && fragment.mSavedViewState == null) {
                                    o();
                                }
                                if (fragment.mView != null && (viewGroup2 = fragment.mContainer) != null) {
                                    t0 f2 = t0.f(viewGroup2, fragment.getParentFragmentManager());
                                    f2.getClass();
                                    if (y.P(2)) {
                                        Log.v("FragmentManager", "SpecialEffectsController: Enqueuing remove operation for fragment " + fragment);
                                    }
                                    f2.a(1, 3, this);
                                }
                                fragment.mState = 3;
                                continue;
                            case 4:
                                if (y.P(3)) {
                                    Log.d("FragmentManager", "movefrom STARTED: " + fragment);
                                }
                                fragment.performStop();
                                wVar.l(false);
                                continue;
                            case 5:
                                fragment.mState = 5;
                                continue;
                            case 6:
                                if (y.P(3)) {
                                    Log.d("FragmentManager", "movefrom RESUMED: " + fragment);
                                }
                                fragment.performPause();
                                wVar.f(fragment, false);
                                continue;
                            default:
                                continue;
                        }
                    }
                    z11 = true;
                } else {
                    if (!z11 && i6 == -1 && fragment.mRemoving && !fragment.isInBackStack() && !fragment.mBeingSaved) {
                        if (y.P(3)) {
                            Log.d("FragmentManager", "Cleaning up state of never attached fragment: " + fragment);
                        }
                        g0Var.f2186d.f(fragment);
                        g0Var.h(this);
                        if (y.P(3)) {
                            Log.d("FragmentManager", "initState called for fragment: " + fragment);
                        }
                        fragment.initState();
                    }
                    if (fragment.mHiddenChanged) {
                        if (fragment.mView != null && (viewGroup = fragment.mContainer) != null) {
                            t0 f10 = t0.f(viewGroup, fragment.getParentFragmentManager());
                            if (fragment.mHidden) {
                                f10.getClass();
                                if (y.P(2)) {
                                    Log.v("FragmentManager", "SpecialEffectsController: Enqueuing hide operation for fragment " + fragment);
                                }
                                f10.a(3, 1, this);
                            } else {
                                f10.getClass();
                                if (y.P(2)) {
                                    Log.v("FragmentManager", "SpecialEffectsController: Enqueuing show operation for fragment " + fragment);
                                }
                                f10.a(2, 1, this);
                            }
                        }
                        y yVar = fragment.mFragmentManager;
                        if (yVar != null && fragment.mAdded && y.Q(fragment)) {
                            yVar.F = true;
                        }
                        fragment.mHiddenChanged = false;
                        fragment.onHiddenChanged(fragment.mHidden);
                        fragment.mChildFragmentManager.o();
                    }
                    return;
                }
            }
        } finally {
            this.f2167d = false;
        }
    }

    public final void k(ClassLoader classLoader) {
        Fragment fragment = this.f2166c;
        Bundle bundle = fragment.mSavedFragmentState;
        if (bundle == null) {
            return;
        }
        bundle.setClassLoader(classLoader);
        fragment.mSavedViewState = fragment.mSavedFragmentState.getSparseParcelableArray("android:view_state");
        fragment.mSavedViewRegistryState = fragment.mSavedFragmentState.getBundle("android:view_registry_state");
        fragment.mTargetWho = fragment.mSavedFragmentState.getString("android:target_state");
        if (fragment.mTargetWho != null) {
            fragment.mTargetRequestCode = fragment.mSavedFragmentState.getInt("android:target_req_state", 0);
        }
        Boolean bool = fragment.mSavedUserVisibleHint;
        if (bool != null) {
            fragment.mUserVisibleHint = bool.booleanValue();
            fragment.mSavedUserVisibleHint = null;
        } else {
            fragment.mUserVisibleHint = fragment.mSavedFragmentState.getBoolean("android:user_visible_hint", true);
        }
        if (!fragment.mUserVisibleHint) {
            fragment.mDeferStart = true;
        }
    }

    public final void l() {
        String str;
        boolean P = y.P(3);
        Fragment fragment = this.f2166c;
        if (P) {
            Log.d("FragmentManager", "moveto RESUMED: " + fragment);
        }
        View focusedView = fragment.getFocusedView();
        if (focusedView != null) {
            boolean z10 = true;
            if (focusedView != fragment.mView) {
                ViewParent parent = focusedView.getParent();
                while (true) {
                    if (parent != null) {
                        if (parent == fragment.mView) {
                            break;
                        }
                        parent = parent.getParent();
                    } else {
                        z10 = false;
                        break;
                    }
                }
            }
            if (z10) {
                boolean requestFocus = focusedView.requestFocus();
                if (y.P(2)) {
                    StringBuilder sb2 = new StringBuilder("requestFocus: Restoring focused view ");
                    sb2.append(focusedView);
                    sb2.append(" ");
                    if (requestFocus) {
                        str = "succeeded";
                    } else {
                        str = "failed";
                    }
                    sb2.append(str);
                    sb2.append(" on Fragment ");
                    sb2.append(fragment);
                    sb2.append(" resulting in focused view ");
                    sb2.append(fragment.mView.findFocus());
                    Log.v("FragmentManager", sb2.toString());
                }
            }
        }
        fragment.setFocusedView(null);
        fragment.performResume();
        this.f2164a.i(fragment, false);
        fragment.mSavedFragmentState = null;
        fragment.mSavedViewState = null;
        fragment.mSavedViewRegistryState = null;
    }

    public final Bundle m() {
        Bundle bundle = new Bundle();
        Fragment fragment = this.f2166c;
        fragment.performSaveInstanceState(bundle);
        this.f2164a.j(false);
        if (bundle.isEmpty()) {
            bundle = null;
        }
        if (fragment.mView != null) {
            o();
        }
        if (fragment.mSavedViewState != null) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putSparseParcelableArray("android:view_state", fragment.mSavedViewState);
        }
        if (fragment.mSavedViewRegistryState != null) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putBundle("android:view_registry_state", fragment.mSavedViewRegistryState);
        }
        if (!fragment.mUserVisibleHint) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putBoolean("android:user_visible_hint", fragment.mUserVisibleHint);
        }
        return bundle;
    }

    public final void n() {
        Fragment fragment = this.f2166c;
        d0 d0Var = new d0(fragment);
        if (fragment.mState > -1 && d0Var.G == null) {
            Bundle m10 = m();
            d0Var.G = m10;
            if (fragment.mTargetWho != null) {
                if (m10 == null) {
                    d0Var.G = new Bundle();
                }
                d0Var.G.putString("android:target_state", fragment.mTargetWho);
                int i6 = fragment.mTargetRequestCode;
                if (i6 != 0) {
                    d0Var.G.putInt("android:target_req_state", i6);
                }
            }
        } else {
            d0Var.G = fragment.mSavedFragmentState;
        }
        this.f2165b.i(fragment.mWho, d0Var);
    }

    public final void o() {
        Fragment fragment = this.f2166c;
        if (fragment.mView == null) {
            return;
        }
        if (y.P(2)) {
            Log.v("FragmentManager", "Saving view state for fragment " + fragment + " with view " + fragment.mView);
        }
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        fragment.mView.saveHierarchyState(sparseArray);
        if (sparseArray.size() > 0) {
            fragment.mSavedViewState = sparseArray;
        }
        Bundle bundle = new Bundle();
        fragment.mViewLifecycleOwner.f2262y.c(bundle);
        if (!bundle.isEmpty()) {
            fragment.mSavedViewRegistryState = bundle;
        }
    }

    public e0(w wVar, g0 g0Var, ClassLoader classLoader, t tVar, d0 d0Var) {
        this.f2164a = wVar;
        this.f2165b = g0Var;
        Fragment a10 = d0Var.a(tVar, classLoader);
        this.f2166c = a10;
        if (y.P(2)) {
            Log.v("FragmentManager", "Instantiated fragment " + a10);
        }
    }

    public e0(w wVar, g0 g0Var, Fragment fragment, d0 d0Var) {
        this.f2164a = wVar;
        this.f2165b = g0Var;
        this.f2166c = fragment;
        fragment.mSavedViewState = null;
        fragment.mSavedViewRegistryState = null;
        fragment.mBackStackNesting = 0;
        fragment.mInLayout = false;
        fragment.mAdded = false;
        Fragment fragment2 = fragment.mTarget;
        fragment.mTargetWho = fragment2 != null ? fragment2.mWho : null;
        fragment.mTarget = null;
        Bundle bundle = d0Var.G;
        if (bundle != null) {
            fragment.mSavedFragmentState = bundle;
        } else {
            fragment.mSavedFragmentState = new Bundle();
        }
    }

    /* compiled from: FragmentStateManager.java */
    /* loaded from: classes.dex */
    public class a implements View.OnAttachStateChangeListener {

        /* renamed from: u  reason: collision with root package name */
        public final /* synthetic */ View f2169u;

        public a(View view) {
            this.f2169u = view;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewAttachedToWindow(View view) {
            View view2 = this.f2169u;
            view2.removeOnAttachStateChangeListener(this);
            WeakHashMap<View, t0.o0> weakHashMap = t0.d0.f32288a;
            d0.h.c(view2);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewDetachedFromWindow(View view) {
        }
    }
}
