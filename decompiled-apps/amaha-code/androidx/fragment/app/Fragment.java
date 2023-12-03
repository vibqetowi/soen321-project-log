package androidx.fragment.app;

import android.animation.Animator;
import android.app.Activity;
import android.app.Application;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import androidx.fragment.app.strictmode.GetRetainInstanceUsageViolation;
import androidx.fragment.app.strictmode.GetTargetFragmentRequestCodeUsageViolation;
import androidx.fragment.app.strictmode.GetTargetFragmentUsageViolation;
import androidx.fragment.app.strictmode.SetRetainInstanceUsageViolation;
import androidx.fragment.app.strictmode.SetTargetFragmentUsageViolation;
import androidx.fragment.app.strictmode.SetUserVisibleHintViolation;
import androidx.fragment.app.y;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.j;
import androidx.lifecycle.o0;
import com.theinnerhour.b2b.R;
import f0.a;
import g0.a;
import h1.a;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import l1.b;
/* loaded from: classes.dex */
public class Fragment implements ComponentCallbacks, View.OnCreateContextMenuListener, androidx.lifecycle.p, androidx.lifecycle.r0, androidx.lifecycle.h, a2.c {
    static final int ACTIVITY_CREATED = 4;
    static final int ATTACHED = 0;
    static final int AWAITING_ENTER_EFFECTS = 6;
    static final int AWAITING_EXIT_EFFECTS = 3;
    static final int CREATED = 1;
    static final int INITIALIZING = -1;
    static final int RESUMED = 7;
    static final int STARTED = 5;
    static final Object USE_DEFAULT_TRANSITION = new Object();
    static final int VIEW_CREATED = 2;
    boolean mAdded;
    j mAnimationInfo;
    Bundle mArguments;
    int mBackStackNesting;
    boolean mBeingSaved;
    private boolean mCalled;
    y mChildFragmentManager;
    ViewGroup mContainer;
    int mContainerId;
    private int mContentLayoutId;
    o0.b mDefaultFactory;
    boolean mDeferStart;
    boolean mDetached;
    int mFragmentId;
    y mFragmentManager;
    boolean mFromLayout;
    boolean mHasMenu;
    boolean mHidden;
    boolean mHiddenChanged;
    u<?> mHost;
    boolean mInLayout;
    boolean mIsCreated;
    private Boolean mIsPrimaryNavigationFragment;
    LayoutInflater mLayoutInflater;
    androidx.lifecycle.q mLifecycleRegistry;
    j.c mMaxState;
    boolean mMenuVisible;
    private final AtomicInteger mNextLocalRequestCode;
    private final ArrayList<k> mOnPreAttachedListeners;
    Fragment mParentFragment;
    boolean mPerformedCreateView;
    Runnable mPostponedDurationRunnable;
    public String mPreviousWho;
    boolean mRemoving;
    boolean mRestored;
    boolean mRetainInstance;
    boolean mRetainInstanceChangedWhileDetached;
    Bundle mSavedFragmentState;
    private final k mSavedStateAttachListener;
    a2.b mSavedStateRegistryController;
    Boolean mSavedUserVisibleHint;
    Bundle mSavedViewRegistryState;
    SparseArray<Parcelable> mSavedViewState;
    int mState;
    String mTag;
    Fragment mTarget;
    int mTargetRequestCode;
    String mTargetWho;
    boolean mUserVisibleHint;
    View mView;
    p0 mViewLifecycleOwner;
    androidx.lifecycle.w<androidx.lifecycle.p> mViewLifecycleOwnerLiveData;
    String mWho;

    /* loaded from: classes.dex */
    public static class InstantiationException extends RuntimeException {
        public InstantiationException(String str, Exception exc) {
            super(str, exc);
        }
    }

    /* loaded from: classes.dex */
    public class a extends androidx.activity.result.c<I> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ AtomicReference f2095a;

        public a(AtomicReference atomicReference) {
            this.f2095a = atomicReference;
        }

        @Override // androidx.activity.result.c
        public final void a(Object obj) {
            androidx.activity.result.c cVar = (androidx.activity.result.c) this.f2095a.get();
            if (cVar != null) {
                cVar.a(obj);
                return;
            }
            throw new IllegalStateException("Operation cannot be started before fragment is in created state");
        }

        @Override // androidx.activity.result.c
        public final void b() {
            androidx.activity.result.c cVar = (androidx.activity.result.c) this.f2095a.getAndSet(null);
            if (cVar != null) {
                cVar.b();
            }
        }
    }

    /* loaded from: classes.dex */
    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            Fragment.this.startPostponedEnterTransition();
        }
    }

    /* loaded from: classes.dex */
    public class c extends k {
        public c() {
        }

        @Override // androidx.fragment.app.Fragment.k
        public final void a() {
            Fragment fragment = Fragment.this;
            fragment.mSavedStateRegistryController.a();
            androidx.lifecycle.e0.b(fragment);
        }
    }

    /* loaded from: classes.dex */
    public class d implements Runnable {
        public d() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            Fragment.this.callStartTransitionListener(false);
        }
    }

    /* loaded from: classes.dex */
    public class e implements Runnable {

        /* renamed from: u  reason: collision with root package name */
        public final /* synthetic */ t0 f2099u;

        public e(t0 t0Var) {
            this.f2099u = t0Var;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f2099u.c();
        }
    }

    /* loaded from: classes.dex */
    public class f extends r {
        public f() {
        }

        @Override // androidx.fragment.app.r
        public final View b(int i6) {
            Fragment fragment = Fragment.this;
            View view = fragment.mView;
            if (view != null) {
                return view.findViewById(i6);
            }
            throw new IllegalStateException(defpackage.b.k("Fragment ", fragment, " does not have a view"));
        }

        @Override // androidx.fragment.app.r
        public final boolean c() {
            if (Fragment.this.mView != null) {
                return true;
            }
            return false;
        }
    }

    /* loaded from: classes.dex */
    public class g implements o.a<Void, androidx.activity.result.f> {
        public g() {
        }

        @Override // o.a
        public final androidx.activity.result.f apply(Void r32) {
            Fragment fragment = Fragment.this;
            u<?> uVar = fragment.mHost;
            if (uVar instanceof androidx.activity.result.g) {
                return ((androidx.activity.result.g) uVar).getActivityResultRegistry();
            }
            return fragment.requireActivity().getActivityResultRegistry();
        }
    }

    /* loaded from: classes.dex */
    public class h implements o.a<Void, androidx.activity.result.f> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ androidx.activity.result.f f2102a;

        public h(androidx.activity.result.f fVar) {
            this.f2102a = fVar;
        }

        @Override // o.a
        public final androidx.activity.result.f apply(Void r12) {
            return this.f2102a;
        }
    }

    /* loaded from: classes.dex */
    public class i extends k {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ o.a f2103a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ AtomicReference f2104b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ e.a f2105c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ androidx.activity.result.b f2106d;

        public i(o.a aVar, AtomicReference atomicReference, e.a aVar2, androidx.activity.result.b bVar) {
            this.f2103a = aVar;
            this.f2104b = atomicReference;
            this.f2105c = aVar2;
            this.f2106d = bVar;
        }

        @Override // androidx.fragment.app.Fragment.k
        public final void a() {
            Fragment fragment = Fragment.this;
            this.f2104b.set(((androidx.activity.result.f) this.f2103a.apply(null)).c(fragment.generateActivityResultKey(), fragment, this.f2105c, this.f2106d));
        }
    }

    /* loaded from: classes.dex */
    public static class j {

        /* renamed from: a  reason: collision with root package name */
        public boolean f2108a;

        /* renamed from: b  reason: collision with root package name */
        public int f2109b;

        /* renamed from: c  reason: collision with root package name */
        public int f2110c;

        /* renamed from: d  reason: collision with root package name */
        public int f2111d;

        /* renamed from: e  reason: collision with root package name */
        public int f2112e;
        public int f;

        /* renamed from: g  reason: collision with root package name */
        public ArrayList<String> f2113g;

        /* renamed from: h  reason: collision with root package name */
        public ArrayList<String> f2114h;

        /* renamed from: i  reason: collision with root package name */
        public Object f2115i = null;

        /* renamed from: j  reason: collision with root package name */
        public Object f2116j;

        /* renamed from: k  reason: collision with root package name */
        public Object f2117k;

        /* renamed from: l  reason: collision with root package name */
        public Object f2118l;

        /* renamed from: m  reason: collision with root package name */
        public Object f2119m;

        /* renamed from: n  reason: collision with root package name */
        public Object f2120n;

        /* renamed from: o  reason: collision with root package name */
        public Boolean f2121o;

        /* renamed from: p  reason: collision with root package name */
        public Boolean f2122p;

        /* renamed from: q  reason: collision with root package name */
        public float f2123q;
        public View r;

        /* renamed from: s  reason: collision with root package name */
        public boolean f2124s;

        public j() {
            Object obj = Fragment.USE_DEFAULT_TRANSITION;
            this.f2116j = obj;
            this.f2117k = null;
            this.f2118l = obj;
            this.f2119m = null;
            this.f2120n = obj;
            this.f2123q = 1.0f;
            this.r = null;
        }
    }

    /* loaded from: classes.dex */
    public static abstract class k {
        public abstract void a();
    }

    public Fragment() {
        this.mState = -1;
        this.mWho = UUID.randomUUID().toString();
        this.mTargetWho = null;
        this.mIsPrimaryNavigationFragment = null;
        this.mChildFragmentManager = new z();
        this.mMenuVisible = true;
        this.mUserVisibleHint = true;
        this.mPostponedDurationRunnable = new b();
        this.mMaxState = j.c.RESUMED;
        this.mViewLifecycleOwnerLiveData = new androidx.lifecycle.w<>();
        this.mNextLocalRequestCode = new AtomicInteger();
        this.mOnPreAttachedListeners = new ArrayList<>();
        this.mSavedStateAttachListener = new c();
        initLifecycle();
    }

    private j ensureAnimationInfo() {
        if (this.mAnimationInfo == null) {
            this.mAnimationInfo = new j();
        }
        return this.mAnimationInfo;
    }

    private int getMinimumMaxLifecycleState() {
        j.c cVar = this.mMaxState;
        if (cVar != j.c.INITIALIZED && this.mParentFragment != null) {
            return Math.min(cVar.ordinal(), this.mParentFragment.getMinimumMaxLifecycleState());
        }
        return cVar.ordinal();
    }

    private void initLifecycle() {
        this.mLifecycleRegistry = new androidx.lifecycle.q(this);
        this.mSavedStateRegistryController = new a2.b(this);
        this.mDefaultFactory = null;
        if (!this.mOnPreAttachedListeners.contains(this.mSavedStateAttachListener)) {
            registerOnPreAttachListener(this.mSavedStateAttachListener);
        }
    }

    @Deprecated
    public static Fragment instantiate(Context context, String str) {
        return instantiate(context, str, null);
    }

    private <I, O> androidx.activity.result.c<I> prepareCallInternal(e.a<I, O> aVar, o.a<Void, androidx.activity.result.f> aVar2, androidx.activity.result.b<O> bVar) {
        if (this.mState <= 1) {
            AtomicReference atomicReference = new AtomicReference();
            registerOnPreAttachListener(new i(aVar2, atomicReference, aVar, bVar));
            return new a(atomicReference);
        }
        throw new IllegalStateException(defpackage.b.k("Fragment ", this, " is attempting to registerForActivityResult after being created. Fragments must call registerForActivityResult() before they are created (i.e. initialization, onAttach(), or onCreate())."));
    }

    private void registerOnPreAttachListener(k kVar) {
        if (this.mState >= 0) {
            kVar.a();
        } else {
            this.mOnPreAttachedListeners.add(kVar);
        }
    }

    public void callStartTransitionListener(boolean z10) {
        ViewGroup viewGroup;
        y yVar;
        j jVar = this.mAnimationInfo;
        if (jVar != null) {
            jVar.f2124s = false;
        }
        if (this.mView != null && (viewGroup = this.mContainer) != null && (yVar = this.mFragmentManager) != null) {
            t0 g5 = t0.g(viewGroup, yVar.M());
            g5.h();
            if (z10) {
                this.mHost.f2293w.post(new e(g5));
            } else {
                g5.c();
            }
        }
    }

    public r createFragmentContainer() {
        return new f();
    }

    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.print(str);
        printWriter.print("mFragmentId=#");
        printWriter.print(Integer.toHexString(this.mFragmentId));
        printWriter.print(" mContainerId=#");
        printWriter.print(Integer.toHexString(this.mContainerId));
        printWriter.print(" mTag=");
        printWriter.println(this.mTag);
        printWriter.print(str);
        printWriter.print("mState=");
        printWriter.print(this.mState);
        printWriter.print(" mWho=");
        printWriter.print(this.mWho);
        printWriter.print(" mBackStackNesting=");
        printWriter.println(this.mBackStackNesting);
        printWriter.print(str);
        printWriter.print("mAdded=");
        printWriter.print(this.mAdded);
        printWriter.print(" mRemoving=");
        printWriter.print(this.mRemoving);
        printWriter.print(" mFromLayout=");
        printWriter.print(this.mFromLayout);
        printWriter.print(" mInLayout=");
        printWriter.println(this.mInLayout);
        printWriter.print(str);
        printWriter.print("mHidden=");
        printWriter.print(this.mHidden);
        printWriter.print(" mDetached=");
        printWriter.print(this.mDetached);
        printWriter.print(" mMenuVisible=");
        printWriter.print(this.mMenuVisible);
        printWriter.print(" mHasMenu=");
        printWriter.println(this.mHasMenu);
        printWriter.print(str);
        printWriter.print("mRetainInstance=");
        printWriter.print(this.mRetainInstance);
        printWriter.print(" mUserVisibleHint=");
        printWriter.println(this.mUserVisibleHint);
        if (this.mFragmentManager != null) {
            printWriter.print(str);
            printWriter.print("mFragmentManager=");
            printWriter.println(this.mFragmentManager);
        }
        if (this.mHost != null) {
            printWriter.print(str);
            printWriter.print("mHost=");
            printWriter.println(this.mHost);
        }
        if (this.mParentFragment != null) {
            printWriter.print(str);
            printWriter.print("mParentFragment=");
            printWriter.println(this.mParentFragment);
        }
        if (this.mArguments != null) {
            printWriter.print(str);
            printWriter.print("mArguments=");
            printWriter.println(this.mArguments);
        }
        if (this.mSavedFragmentState != null) {
            printWriter.print(str);
            printWriter.print("mSavedFragmentState=");
            printWriter.println(this.mSavedFragmentState);
        }
        if (this.mSavedViewState != null) {
            printWriter.print(str);
            printWriter.print("mSavedViewState=");
            printWriter.println(this.mSavedViewState);
        }
        if (this.mSavedViewRegistryState != null) {
            printWriter.print(str);
            printWriter.print("mSavedViewRegistryState=");
            printWriter.println(this.mSavedViewRegistryState);
        }
        Fragment targetFragment = getTargetFragment(false);
        if (targetFragment != null) {
            printWriter.print(str);
            printWriter.print("mTarget=");
            printWriter.print(targetFragment);
            printWriter.print(" mTargetRequestCode=");
            printWriter.println(this.mTargetRequestCode);
        }
        printWriter.print(str);
        printWriter.print("mPopDirection=");
        printWriter.println(getPopDirection());
        if (getEnterAnim() != 0) {
            printWriter.print(str);
            printWriter.print("getEnterAnim=");
            printWriter.println(getEnterAnim());
        }
        if (getExitAnim() != 0) {
            printWriter.print(str);
            printWriter.print("getExitAnim=");
            printWriter.println(getExitAnim());
        }
        if (getPopEnterAnim() != 0) {
            printWriter.print(str);
            printWriter.print("getPopEnterAnim=");
            printWriter.println(getPopEnterAnim());
        }
        if (getPopExitAnim() != 0) {
            printWriter.print(str);
            printWriter.print("getPopExitAnim=");
            printWriter.println(getPopExitAnim());
        }
        if (this.mContainer != null) {
            printWriter.print(str);
            printWriter.print("mContainer=");
            printWriter.println(this.mContainer);
        }
        if (this.mView != null) {
            printWriter.print(str);
            printWriter.print("mView=");
            printWriter.println(this.mView);
        }
        if (getAnimatingAway() != null) {
            printWriter.print(str);
            printWriter.print("mAnimatingAway=");
            printWriter.println(getAnimatingAway());
        }
        if (getContext() != null) {
            l1.a.a(this).b(str, printWriter);
        }
        printWriter.print(str);
        printWriter.println("Child " + this.mChildFragmentManager + ":");
        this.mChildFragmentManager.v(pl.a.f(str, "  "), fileDescriptor, printWriter, strArr);
    }

    public final boolean equals(Object obj) {
        return super.equals(obj);
    }

    public Fragment findFragmentByWho(String str) {
        if (str.equals(this.mWho)) {
            return this;
        }
        return this.mChildFragmentManager.f2307c.c(str);
    }

    public String generateActivityResultKey() {
        return "fragment_" + this.mWho + "_rq#" + this.mNextLocalRequestCode.getAndIncrement();
    }

    public final p getActivity() {
        u<?> uVar = this.mHost;
        if (uVar == null) {
            return null;
        }
        return (p) uVar.f2291u;
    }

    public boolean getAllowEnterTransitionOverlap() {
        Boolean bool;
        j jVar = this.mAnimationInfo;
        if (jVar != null && (bool = jVar.f2122p) != null) {
            return bool.booleanValue();
        }
        return true;
    }

    public boolean getAllowReturnTransitionOverlap() {
        Boolean bool;
        j jVar = this.mAnimationInfo;
        if (jVar != null && (bool = jVar.f2121o) != null) {
            return bool.booleanValue();
        }
        return true;
    }

    public View getAnimatingAway() {
        j jVar = this.mAnimationInfo;
        if (jVar == null) {
            return null;
        }
        jVar.getClass();
        return null;
    }

    public final Bundle getArguments() {
        return this.mArguments;
    }

    public final y getChildFragmentManager() {
        if (this.mHost != null) {
            return this.mChildFragmentManager;
        }
        throw new IllegalStateException(defpackage.b.k("Fragment ", this, " has not been attached yet."));
    }

    public Context getContext() {
        u<?> uVar = this.mHost;
        if (uVar == null) {
            return null;
        }
        return uVar.f2292v;
    }

    @Override // androidx.lifecycle.h
    public k1.a getDefaultViewModelCreationExtras() {
        Application application;
        Context applicationContext = requireContext().getApplicationContext();
        while (true) {
            if (applicationContext instanceof ContextWrapper) {
                if (applicationContext instanceof Application) {
                    application = (Application) applicationContext;
                    break;
                }
                applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
            } else {
                application = null;
                break;
            }
        }
        if (application == null && y.P(3)) {
            Log.d("FragmentManager", "Could not find Application instance from Context " + requireContext().getApplicationContext() + ", you will not be able to use AndroidViewModel with the default ViewModelProvider.Factory");
        }
        k1.d dVar = new k1.d(0);
        LinkedHashMap linkedHashMap = dVar.f22765a;
        if (application != null) {
            linkedHashMap.put(androidx.lifecycle.n0.f2445a, application);
        }
        linkedHashMap.put(androidx.lifecycle.e0.f2400a, this);
        linkedHashMap.put(androidx.lifecycle.e0.f2401b, this);
        if (getArguments() != null) {
            linkedHashMap.put(androidx.lifecycle.e0.f2402c, getArguments());
        }
        return dVar;
    }

    @Override // androidx.lifecycle.h
    public o0.b getDefaultViewModelProviderFactory() {
        Application application;
        if (this.mFragmentManager != null) {
            if (this.mDefaultFactory == null) {
                Context applicationContext = requireContext().getApplicationContext();
                while (true) {
                    if (applicationContext instanceof ContextWrapper) {
                        if (applicationContext instanceof Application) {
                            application = (Application) applicationContext;
                            break;
                        }
                        applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
                    } else {
                        application = null;
                        break;
                    }
                }
                if (application == null && y.P(3)) {
                    Log.d("FragmentManager", "Could not find Application instance from Context " + requireContext().getApplicationContext() + ", you will need CreationExtras to use AndroidViewModel with the default ViewModelProvider.Factory");
                }
                this.mDefaultFactory = new androidx.lifecycle.h0(application, this, getArguments());
            }
            return this.mDefaultFactory;
        }
        throw new IllegalStateException("Can't access ViewModels from detached fragment");
    }

    public int getEnterAnim() {
        j jVar = this.mAnimationInfo;
        if (jVar == null) {
            return 0;
        }
        return jVar.f2109b;
    }

    public Object getEnterTransition() {
        j jVar = this.mAnimationInfo;
        if (jVar == null) {
            return null;
        }
        return jVar.f2115i;
    }

    public f0.e0 getEnterTransitionCallback() {
        j jVar = this.mAnimationInfo;
        if (jVar == null) {
            return null;
        }
        jVar.getClass();
        return null;
    }

    public int getExitAnim() {
        j jVar = this.mAnimationInfo;
        if (jVar == null) {
            return 0;
        }
        return jVar.f2110c;
    }

    public Object getExitTransition() {
        j jVar = this.mAnimationInfo;
        if (jVar == null) {
            return null;
        }
        return jVar.f2117k;
    }

    public f0.e0 getExitTransitionCallback() {
        j jVar = this.mAnimationInfo;
        if (jVar == null) {
            return null;
        }
        jVar.getClass();
        return null;
    }

    public View getFocusedView() {
        j jVar = this.mAnimationInfo;
        if (jVar == null) {
            return null;
        }
        return jVar.r;
    }

    @Deprecated
    public final y getFragmentManager() {
        return this.mFragmentManager;
    }

    public final Object getHost() {
        u<?> uVar = this.mHost;
        if (uVar == null) {
            return null;
        }
        return uVar.e();
    }

    public final int getId() {
        return this.mFragmentId;
    }

    public final LayoutInflater getLayoutInflater() {
        LayoutInflater layoutInflater = this.mLayoutInflater;
        return layoutInflater == null ? performGetLayoutInflater(null) : layoutInflater;
    }

    @Override // androidx.lifecycle.p
    public androidx.lifecycle.j getLifecycle() {
        return this.mLifecycleRegistry;
    }

    @Deprecated
    public l1.a getLoaderManager() {
        return l1.a.a(this);
    }

    public int getNextTransition() {
        j jVar = this.mAnimationInfo;
        if (jVar == null) {
            return 0;
        }
        return jVar.f;
    }

    public final Fragment getParentFragment() {
        return this.mParentFragment;
    }

    public final y getParentFragmentManager() {
        y yVar = this.mFragmentManager;
        if (yVar != null) {
            return yVar;
        }
        throw new IllegalStateException(defpackage.b.k("Fragment ", this, " not associated with a fragment manager."));
    }

    public boolean getPopDirection() {
        j jVar = this.mAnimationInfo;
        if (jVar == null) {
            return false;
        }
        return jVar.f2108a;
    }

    public int getPopEnterAnim() {
        j jVar = this.mAnimationInfo;
        if (jVar == null) {
            return 0;
        }
        return jVar.f2111d;
    }

    public int getPopExitAnim() {
        j jVar = this.mAnimationInfo;
        if (jVar == null) {
            return 0;
        }
        return jVar.f2112e;
    }

    public float getPostOnViewCreatedAlpha() {
        j jVar = this.mAnimationInfo;
        if (jVar == null) {
            return 1.0f;
        }
        return jVar.f2123q;
    }

    public Object getReenterTransition() {
        j jVar = this.mAnimationInfo;
        if (jVar == null) {
            return null;
        }
        Object obj = jVar.f2118l;
        if (obj == USE_DEFAULT_TRANSITION) {
            return getExitTransition();
        }
        return obj;
    }

    public final Resources getResources() {
        return requireContext().getResources();
    }

    @Deprecated
    public final boolean getRetainInstance() {
        a.b bVar = h1.a.f16999a;
        GetRetainInstanceUsageViolation getRetainInstanceUsageViolation = new GetRetainInstanceUsageViolation(this);
        h1.a.c(getRetainInstanceUsageViolation);
        a.b a10 = h1.a.a(this);
        if (a10.f17007a.contains(a.EnumC0268a.DETECT_RETAIN_INSTANCE_USAGE) && h1.a.e(a10, getClass(), GetRetainInstanceUsageViolation.class)) {
            h1.a.b(a10, getRetainInstanceUsageViolation);
        }
        return this.mRetainInstance;
    }

    public Object getReturnTransition() {
        j jVar = this.mAnimationInfo;
        if (jVar == null) {
            return null;
        }
        Object obj = jVar.f2116j;
        if (obj == USE_DEFAULT_TRANSITION) {
            return getEnterTransition();
        }
        return obj;
    }

    @Override // a2.c
    public final a2.a getSavedStateRegistry() {
        return this.mSavedStateRegistryController.f174b;
    }

    public Object getSharedElementEnterTransition() {
        j jVar = this.mAnimationInfo;
        if (jVar == null) {
            return null;
        }
        return jVar.f2119m;
    }

    public Object getSharedElementReturnTransition() {
        j jVar = this.mAnimationInfo;
        if (jVar == null) {
            return null;
        }
        Object obj = jVar.f2120n;
        if (obj == USE_DEFAULT_TRANSITION) {
            return getSharedElementEnterTransition();
        }
        return obj;
    }

    public ArrayList<String> getSharedElementSourceNames() {
        ArrayList<String> arrayList;
        j jVar = this.mAnimationInfo;
        if (jVar != null && (arrayList = jVar.f2113g) != null) {
            return arrayList;
        }
        return new ArrayList<>();
    }

    public ArrayList<String> getSharedElementTargetNames() {
        ArrayList<String> arrayList;
        j jVar = this.mAnimationInfo;
        if (jVar != null && (arrayList = jVar.f2114h) != null) {
            return arrayList;
        }
        return new ArrayList<>();
    }

    public final String getString(int i6) {
        return getResources().getString(i6);
    }

    public final String getTag() {
        return this.mTag;
    }

    @Deprecated
    public final Fragment getTargetFragment() {
        return getTargetFragment(true);
    }

    @Deprecated
    public final int getTargetRequestCode() {
        a.b bVar = h1.a.f16999a;
        GetTargetFragmentRequestCodeUsageViolation getTargetFragmentRequestCodeUsageViolation = new GetTargetFragmentRequestCodeUsageViolation(this);
        h1.a.c(getTargetFragmentRequestCodeUsageViolation);
        a.b a10 = h1.a.a(this);
        if (a10.f17007a.contains(a.EnumC0268a.DETECT_TARGET_FRAGMENT_USAGE) && h1.a.e(a10, getClass(), GetTargetFragmentRequestCodeUsageViolation.class)) {
            h1.a.b(a10, getTargetFragmentRequestCodeUsageViolation);
        }
        return this.mTargetRequestCode;
    }

    public final CharSequence getText(int i6) {
        return getResources().getText(i6);
    }

    @Deprecated
    public boolean getUserVisibleHint() {
        return this.mUserVisibleHint;
    }

    public View getView() {
        return this.mView;
    }

    public androidx.lifecycle.p getViewLifecycleOwner() {
        p0 p0Var = this.mViewLifecycleOwner;
        if (p0Var != null) {
            return p0Var;
        }
        throw new IllegalStateException("Can't access the Fragment View's LifecycleOwner when getView() is null i.e., before onCreateView() or after onDestroyView()");
    }

    public LiveData<androidx.lifecycle.p> getViewLifecycleOwnerLiveData() {
        return this.mViewLifecycleOwnerLiveData;
    }

    @Override // androidx.lifecycle.r0
    public androidx.lifecycle.q0 getViewModelStore() {
        if (this.mFragmentManager != null) {
            if (getMinimumMaxLifecycleState() != 1) {
                HashMap<String, androidx.lifecycle.q0> hashMap = this.mFragmentManager.N.f2147z;
                androidx.lifecycle.q0 q0Var = hashMap.get(this.mWho);
                if (q0Var == null) {
                    androidx.lifecycle.q0 q0Var2 = new androidx.lifecycle.q0();
                    hashMap.put(this.mWho, q0Var2);
                    return q0Var2;
                }
                return q0Var;
            }
            throw new IllegalStateException("Calling getViewModelStore() before a Fragment reaches onCreate() when using setMaxLifecycle(INITIALIZED) is not supported");
        }
        throw new IllegalStateException("Can't access ViewModels from detached fragment");
    }

    public final boolean hasOptionsMenu() {
        return this.mHasMenu;
    }

    public final int hashCode() {
        return super.hashCode();
    }

    public void initState() {
        initLifecycle();
        this.mPreviousWho = this.mWho;
        this.mWho = UUID.randomUUID().toString();
        this.mAdded = false;
        this.mRemoving = false;
        this.mFromLayout = false;
        this.mInLayout = false;
        this.mRestored = false;
        this.mBackStackNesting = 0;
        this.mFragmentManager = null;
        this.mChildFragmentManager = new z();
        this.mHost = null;
        this.mFragmentId = 0;
        this.mContainerId = 0;
        this.mTag = null;
        this.mHidden = false;
        this.mDetached = false;
    }

    public final boolean isAdded() {
        if (this.mHost != null && this.mAdded) {
            return true;
        }
        return false;
    }

    public final boolean isDetached() {
        return this.mDetached;
    }

    public final boolean isHidden() {
        boolean isHidden;
        if (!this.mHidden) {
            y yVar = this.mFragmentManager;
            if (yVar == null) {
                return false;
            }
            Fragment fragment = this.mParentFragment;
            yVar.getClass();
            if (fragment == null) {
                isHidden = false;
            } else {
                isHidden = fragment.isHidden();
            }
            if (!isHidden) {
                return false;
            }
        }
        return true;
    }

    public final boolean isInBackStack() {
        if (this.mBackStackNesting > 0) {
            return true;
        }
        return false;
    }

    public final boolean isInLayout() {
        return this.mInLayout;
    }

    public final boolean isMenuVisible() {
        boolean isMenuVisible;
        if (this.mMenuVisible) {
            if (this.mFragmentManager == null) {
                return true;
            }
            Fragment fragment = this.mParentFragment;
            if (fragment == null) {
                isMenuVisible = true;
            } else {
                isMenuVisible = fragment.isMenuVisible();
            }
            if (isMenuVisible) {
                return true;
            }
        }
        return false;
    }

    public boolean isPostponed() {
        j jVar = this.mAnimationInfo;
        if (jVar == null) {
            return false;
        }
        return jVar.f2124s;
    }

    public final boolean isRemoving() {
        return this.mRemoving;
    }

    public final boolean isResumed() {
        if (this.mState >= 7) {
            return true;
        }
        return false;
    }

    public final boolean isStateSaved() {
        y yVar = this.mFragmentManager;
        if (yVar == null) {
            return false;
        }
        return yVar.T();
    }

    public final boolean isVisible() {
        View view;
        if (isAdded() && !isHidden() && (view = this.mView) != null && view.getWindowToken() != null && this.mView.getVisibility() == 0) {
            return true;
        }
        return false;
    }

    public void noteStateNotSaved() {
        this.mChildFragmentManager.V();
    }

    @Deprecated
    public void onActivityCreated(Bundle bundle) {
        this.mCalled = true;
    }

    @Deprecated
    public void onActivityResult(int i6, int i10, Intent intent) {
        if (y.P(2)) {
            Log.v("FragmentManager", "Fragment " + this + " received the following in onActivityResult(): requestCode: " + i6 + " resultCode: " + i10 + " data: " + intent);
        }
    }

    public void onAttach(Context context) {
        this.mCalled = true;
        u<?> uVar = this.mHost;
        Activity activity = uVar == null ? null : uVar.f2291u;
        if (activity != null) {
            this.mCalled = false;
            onAttach(activity);
        }
    }

    @Override // android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        this.mCalled = true;
    }

    public boolean onContextItemSelected(MenuItem menuItem) {
        return false;
    }

    public void onCreate(Bundle bundle) {
        boolean z10;
        this.mCalled = true;
        restoreChildFragmentState(bundle);
        y yVar = this.mChildFragmentManager;
        if (yVar.f2323u >= 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            yVar.G = false;
            yVar.H = false;
            yVar.N.C = false;
            yVar.u(1);
        }
    }

    public Animation onCreateAnimation(int i6, boolean z10, int i10) {
        return null;
    }

    public Animator onCreateAnimator(int i6, boolean z10, int i10) {
        return null;
    }

    @Override // android.view.View.OnCreateContextMenuListener
    public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        requireActivity().onCreateContextMenu(contextMenu, view, contextMenuInfo);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i6 = this.mContentLayoutId;
        if (i6 != 0) {
            return layoutInflater.inflate(i6, viewGroup, false);
        }
        return null;
    }

    public void onDestroy() {
        this.mCalled = true;
    }

    public void onDestroyView() {
        this.mCalled = true;
    }

    public void onDetach() {
        this.mCalled = true;
    }

    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        return getLayoutInflater(bundle);
    }

    public void onInflate(Context context, AttributeSet attributeSet, Bundle bundle) {
        this.mCalled = true;
        u<?> uVar = this.mHost;
        Activity activity = uVar == null ? null : uVar.f2291u;
        if (activity != null) {
            this.mCalled = false;
            onInflate(activity, attributeSet, bundle);
        }
    }

    @Override // android.content.ComponentCallbacks
    public void onLowMemory() {
        this.mCalled = true;
    }

    @Deprecated
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        return false;
    }

    public void onPause() {
        this.mCalled = true;
    }

    public void onResume() {
        this.mCalled = true;
    }

    public void onStart() {
        this.mCalled = true;
    }

    public void onStop() {
        this.mCalled = true;
    }

    public void onViewStateRestored(Bundle bundle) {
        this.mCalled = true;
    }

    public void performActivityCreated(Bundle bundle) {
        this.mChildFragmentManager.V();
        this.mState = 3;
        this.mCalled = false;
        onActivityCreated(bundle);
        if (this.mCalled) {
            restoreViewState();
            y yVar = this.mChildFragmentManager;
            yVar.G = false;
            yVar.H = false;
            yVar.N.C = false;
            yVar.u(4);
            return;
        }
        throw new w0(defpackage.b.k("Fragment ", this, " did not call through to super.onActivityCreated()"));
    }

    public void performAttach() {
        Iterator<k> it = this.mOnPreAttachedListeners.iterator();
        while (it.hasNext()) {
            it.next().a();
        }
        this.mOnPreAttachedListeners.clear();
        this.mChildFragmentManager.b(this.mHost, createFragmentContainer(), this);
        this.mState = 0;
        this.mCalled = false;
        onAttach(this.mHost.f2292v);
        if (this.mCalled) {
            y yVar = this.mFragmentManager;
            Iterator<c0> it2 = yVar.f2318o.iterator();
            while (it2.hasNext()) {
                it2.next().a(yVar, this);
            }
            y yVar2 = this.mChildFragmentManager;
            yVar2.G = false;
            yVar2.H = false;
            yVar2.N.C = false;
            yVar2.u(0);
            return;
        }
        throw new w0(defpackage.b.k("Fragment ", this, " did not call through to super.onAttach()"));
    }

    public void performConfigurationChanged(Configuration configuration) {
        onConfigurationChanged(configuration);
    }

    public boolean performContextItemSelected(MenuItem menuItem) {
        if (!this.mHidden) {
            if (onContextItemSelected(menuItem)) {
                return true;
            }
            return this.mChildFragmentManager.j(menuItem);
        }
        return false;
    }

    public void performCreate(Bundle bundle) {
        this.mChildFragmentManager.V();
        this.mState = 1;
        this.mCalled = false;
        this.mLifecycleRegistry.a(new androidx.lifecycle.n() { // from class: androidx.fragment.app.Fragment.6
            @Override // androidx.lifecycle.n
            public final void c(androidx.lifecycle.p pVar, j.b bVar) {
                View view;
                if (bVar == j.b.ON_STOP && (view = Fragment.this.mView) != null) {
                    view.cancelPendingInputEvents();
                }
            }
        });
        this.mSavedStateRegistryController.b(bundle);
        onCreate(bundle);
        this.mIsCreated = true;
        if (this.mCalled) {
            this.mLifecycleRegistry.f(j.b.ON_CREATE);
            return;
        }
        throw new w0(defpackage.b.k("Fragment ", this, " did not call through to super.onCreate()"));
    }

    public boolean performCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
        boolean z10 = false;
        if (this.mHidden) {
            return false;
        }
        if (this.mHasMenu && this.mMenuVisible) {
            onCreateOptionsMenu(menu, menuInflater);
            z10 = true;
        }
        return z10 | this.mChildFragmentManager.k(menu, menuInflater);
    }

    public void performCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.mChildFragmentManager.V();
        boolean z10 = true;
        this.mPerformedCreateView = true;
        this.mViewLifecycleOwner = new p0(this, getViewModelStore());
        View onCreateView = onCreateView(layoutInflater, viewGroup, bundle);
        this.mView = onCreateView;
        if (onCreateView != null) {
            this.mViewLifecycleOwner.b();
            this.mView.setTag(R.id.view_tree_lifecycle_owner, this.mViewLifecycleOwner);
            this.mView.setTag(R.id.view_tree_view_model_store_owner, this.mViewLifecycleOwner);
            View view = this.mView;
            p0 p0Var = this.mViewLifecycleOwner;
            kotlin.jvm.internal.i.g(view, "<this>");
            view.setTag(R.id.view_tree_saved_state_registry_owner, p0Var);
            this.mViewLifecycleOwnerLiveData.l(this.mViewLifecycleOwner);
            return;
        }
        if (this.mViewLifecycleOwner.f2261x == null) {
            z10 = false;
        }
        if (!z10) {
            this.mViewLifecycleOwner = null;
            return;
        }
        throw new IllegalStateException("Called getViewLifecycleOwner() but onCreateView() returned null");
    }

    public void performDestroy() {
        this.mChildFragmentManager.l();
        this.mLifecycleRegistry.f(j.b.ON_DESTROY);
        this.mState = 0;
        this.mCalled = false;
        this.mIsCreated = false;
        onDestroy();
        if (this.mCalled) {
            return;
        }
        throw new w0(defpackage.b.k("Fragment ", this, " did not call through to super.onDestroy()"));
    }

    public void performDestroyView() {
        this.mChildFragmentManager.u(1);
        if (this.mView != null) {
            p0 p0Var = this.mViewLifecycleOwner;
            p0Var.b();
            if (p0Var.f2261x.f2454c.d(j.c.CREATED)) {
                this.mViewLifecycleOwner.a(j.b.ON_DESTROY);
            }
        }
        this.mState = 1;
        this.mCalled = false;
        onDestroyView();
        if (this.mCalled) {
            t.i<b.a> iVar = l1.a.a(this).f23992b.f24002x;
            int f2 = iVar.f();
            for (int i6 = 0; i6 < f2; i6++) {
                iVar.h(i6).m();
            }
            this.mPerformedCreateView = false;
            return;
        }
        throw new w0(defpackage.b.k("Fragment ", this, " did not call through to super.onDestroyView()"));
    }

    public void performDetach() {
        this.mState = -1;
        this.mCalled = false;
        onDetach();
        this.mLayoutInflater = null;
        if (this.mCalled) {
            y yVar = this.mChildFragmentManager;
            if (!yVar.I) {
                yVar.l();
                this.mChildFragmentManager = new z();
                return;
            }
            return;
        }
        throw new w0(defpackage.b.k("Fragment ", this, " did not call through to super.onDetach()"));
    }

    public LayoutInflater performGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = onGetLayoutInflater(bundle);
        this.mLayoutInflater = onGetLayoutInflater;
        return onGetLayoutInflater;
    }

    public void performLowMemory() {
        onLowMemory();
    }

    public void performMultiWindowModeChanged(boolean z10) {
        onMultiWindowModeChanged(z10);
    }

    public boolean performOptionsItemSelected(MenuItem menuItem) {
        if (!this.mHidden) {
            if (this.mHasMenu && this.mMenuVisible && onOptionsItemSelected(menuItem)) {
                return true;
            }
            return this.mChildFragmentManager.p(menuItem);
        }
        return false;
    }

    public void performOptionsMenuClosed(Menu menu) {
        if (!this.mHidden) {
            if (this.mHasMenu && this.mMenuVisible) {
                onOptionsMenuClosed(menu);
            }
            this.mChildFragmentManager.q(menu);
        }
    }

    public void performPause() {
        this.mChildFragmentManager.u(5);
        if (this.mView != null) {
            this.mViewLifecycleOwner.a(j.b.ON_PAUSE);
        }
        this.mLifecycleRegistry.f(j.b.ON_PAUSE);
        this.mState = 6;
        this.mCalled = false;
        onPause();
        if (this.mCalled) {
            return;
        }
        throw new w0(defpackage.b.k("Fragment ", this, " did not call through to super.onPause()"));
    }

    public void performPictureInPictureModeChanged(boolean z10) {
        onPictureInPictureModeChanged(z10);
    }

    public boolean performPrepareOptionsMenu(Menu menu) {
        boolean z10 = false;
        if (this.mHidden) {
            return false;
        }
        if (this.mHasMenu && this.mMenuVisible) {
            onPrepareOptionsMenu(menu);
            z10 = true;
        }
        return z10 | this.mChildFragmentManager.t(menu);
    }

    public void performPrimaryNavigationFragmentChanged() {
        this.mFragmentManager.getClass();
        boolean S = y.S(this);
        Boolean bool = this.mIsPrimaryNavigationFragment;
        if (bool == null || bool.booleanValue() != S) {
            this.mIsPrimaryNavigationFragment = Boolean.valueOf(S);
            onPrimaryNavigationFragmentChanged(S);
            y yVar = this.mChildFragmentManager;
            yVar.q0();
            yVar.r(yVar.f2327y);
        }
    }

    public void performResume() {
        this.mChildFragmentManager.V();
        this.mChildFragmentManager.y(true);
        this.mState = 7;
        this.mCalled = false;
        onResume();
        if (this.mCalled) {
            androidx.lifecycle.q qVar = this.mLifecycleRegistry;
            j.b bVar = j.b.ON_RESUME;
            qVar.f(bVar);
            if (this.mView != null) {
                this.mViewLifecycleOwner.a(bVar);
            }
            y yVar = this.mChildFragmentManager;
            yVar.G = false;
            yVar.H = false;
            yVar.N.C = false;
            yVar.u(7);
            return;
        }
        throw new w0(defpackage.b.k("Fragment ", this, " did not call through to super.onResume()"));
    }

    public void performSaveInstanceState(Bundle bundle) {
        onSaveInstanceState(bundle);
        this.mSavedStateRegistryController.c(bundle);
        bundle.putParcelable("android:support:fragments", this.mChildFragmentManager.f0());
    }

    public void performStart() {
        this.mChildFragmentManager.V();
        this.mChildFragmentManager.y(true);
        this.mState = 5;
        this.mCalled = false;
        onStart();
        if (this.mCalled) {
            androidx.lifecycle.q qVar = this.mLifecycleRegistry;
            j.b bVar = j.b.ON_START;
            qVar.f(bVar);
            if (this.mView != null) {
                this.mViewLifecycleOwner.a(bVar);
            }
            y yVar = this.mChildFragmentManager;
            yVar.G = false;
            yVar.H = false;
            yVar.N.C = false;
            yVar.u(5);
            return;
        }
        throw new w0(defpackage.b.k("Fragment ", this, " did not call through to super.onStart()"));
    }

    public void performStop() {
        y yVar = this.mChildFragmentManager;
        yVar.H = true;
        yVar.N.C = true;
        yVar.u(4);
        if (this.mView != null) {
            this.mViewLifecycleOwner.a(j.b.ON_STOP);
        }
        this.mLifecycleRegistry.f(j.b.ON_STOP);
        this.mState = 4;
        this.mCalled = false;
        onStop();
        if (this.mCalled) {
            return;
        }
        throw new w0(defpackage.b.k("Fragment ", this, " did not call through to super.onStop()"));
    }

    public void performViewCreated() {
        onViewCreated(this.mView, this.mSavedFragmentState);
        this.mChildFragmentManager.u(2);
    }

    public void postponeEnterTransition() {
        ensureAnimationInfo().f2124s = true;
    }

    public final <I, O> androidx.activity.result.c<I> registerForActivityResult(e.a<I, O> aVar, androidx.activity.result.b<O> bVar) {
        return prepareCallInternal(aVar, new g(), bVar);
    }

    public void registerForContextMenu(View view) {
        view.setOnCreateContextMenuListener(this);
    }

    @Deprecated
    public final void requestPermissions(String[] strArr, int i6) {
        if (this.mHost != null) {
            y parentFragmentManager = getParentFragmentManager();
            if (parentFragmentManager.D != null) {
                parentFragmentManager.E.addLast(new y.l(this.mWho, i6));
                parentFragmentManager.D.a(strArr);
                return;
            }
            parentFragmentManager.f2324v.getClass();
            return;
        }
        throw new IllegalStateException(defpackage.b.k("Fragment ", this, " not attached to Activity"));
    }

    public final p requireActivity() {
        p activity = getActivity();
        if (activity != null) {
            return activity;
        }
        throw new IllegalStateException(defpackage.b.k("Fragment ", this, " not attached to an activity."));
    }

    public final Bundle requireArguments() {
        Bundle arguments = getArguments();
        if (arguments != null) {
            return arguments;
        }
        throw new IllegalStateException(defpackage.b.k("Fragment ", this, " does not have any arguments."));
    }

    public final Context requireContext() {
        Context context = getContext();
        if (context != null) {
            return context;
        }
        throw new IllegalStateException(defpackage.b.k("Fragment ", this, " not attached to a context."));
    }

    @Deprecated
    public final y requireFragmentManager() {
        return getParentFragmentManager();
    }

    public final Object requireHost() {
        Object host = getHost();
        if (host != null) {
            return host;
        }
        throw new IllegalStateException(defpackage.b.k("Fragment ", this, " not attached to a host."));
    }

    public final Fragment requireParentFragment() {
        Fragment parentFragment = getParentFragment();
        if (parentFragment == null) {
            if (getContext() == null) {
                throw new IllegalStateException(defpackage.b.k("Fragment ", this, " is not attached to any Fragment or host"));
            }
            throw new IllegalStateException("Fragment " + this + " is not a child Fragment, it is directly attached to " + getContext());
        }
        return parentFragment;
    }

    public final View requireView() {
        View view = getView();
        if (view != null) {
            return view;
        }
        throw new IllegalStateException(defpackage.b.k("Fragment ", this, " did not return a View from onCreateView() or this was called before onCreateView()."));
    }

    public void restoreChildFragmentState(Bundle bundle) {
        Parcelable parcelable;
        if (bundle != null && (parcelable = bundle.getParcelable("android:support:fragments")) != null) {
            this.mChildFragmentManager.e0(parcelable);
            y yVar = this.mChildFragmentManager;
            yVar.G = false;
            yVar.H = false;
            yVar.N.C = false;
            yVar.u(1);
        }
    }

    public final void restoreViewState(Bundle bundle) {
        SparseArray<Parcelable> sparseArray = this.mSavedViewState;
        if (sparseArray != null) {
            this.mView.restoreHierarchyState(sparseArray);
            this.mSavedViewState = null;
        }
        if (this.mView != null) {
            p0 p0Var = this.mViewLifecycleOwner;
            p0Var.f2262y.b(this.mSavedViewRegistryState);
            this.mSavedViewRegistryState = null;
        }
        this.mCalled = false;
        onViewStateRestored(bundle);
        if (this.mCalled) {
            if (this.mView != null) {
                this.mViewLifecycleOwner.a(j.b.ON_CREATE);
                return;
            }
            return;
        }
        throw new w0(defpackage.b.k("Fragment ", this, " did not call through to super.onViewStateRestored()"));
    }

    public void setAllowEnterTransitionOverlap(boolean z10) {
        ensureAnimationInfo().f2122p = Boolean.valueOf(z10);
    }

    public void setAllowReturnTransitionOverlap(boolean z10) {
        ensureAnimationInfo().f2121o = Boolean.valueOf(z10);
    }

    public void setAnimations(int i6, int i10, int i11, int i12) {
        if (this.mAnimationInfo == null && i6 == 0 && i10 == 0 && i11 == 0 && i12 == 0) {
            return;
        }
        ensureAnimationInfo().f2109b = i6;
        ensureAnimationInfo().f2110c = i10;
        ensureAnimationInfo().f2111d = i11;
        ensureAnimationInfo().f2112e = i12;
    }

    public void setArguments(Bundle bundle) {
        if (this.mFragmentManager != null && isStateSaved()) {
            throw new IllegalStateException("Fragment already added and state has been saved");
        }
        this.mArguments = bundle;
    }

    public void setEnterSharedElementCallback(f0.e0 e0Var) {
        ensureAnimationInfo().getClass();
    }

    public void setEnterTransition(Object obj) {
        ensureAnimationInfo().f2115i = obj;
    }

    public void setExitSharedElementCallback(f0.e0 e0Var) {
        ensureAnimationInfo().getClass();
    }

    public void setExitTransition(Object obj) {
        ensureAnimationInfo().f2117k = obj;
    }

    public void setFocusedView(View view) {
        ensureAnimationInfo().r = view;
    }

    @Deprecated
    public void setHasOptionsMenu(boolean z10) {
        if (this.mHasMenu != z10) {
            this.mHasMenu = z10;
            if (isAdded() && !isHidden()) {
                this.mHost.h();
            }
        }
    }

    public void setInitialSavedState(l lVar) {
        if (this.mFragmentManager == null) {
            this.mSavedFragmentState = (lVar == null || (r2 = lVar.f2125u) == null) ? null : null;
            return;
        }
        throw new IllegalStateException("Fragment already added");
    }

    public void setMenuVisibility(boolean z10) {
        if (this.mMenuVisible != z10) {
            this.mMenuVisible = z10;
            if (this.mHasMenu && isAdded() && !isHidden()) {
                this.mHost.h();
            }
        }
    }

    public void setNextTransition(int i6) {
        if (this.mAnimationInfo == null && i6 == 0) {
            return;
        }
        ensureAnimationInfo();
        this.mAnimationInfo.f = i6;
    }

    public void setPopDirection(boolean z10) {
        if (this.mAnimationInfo == null) {
            return;
        }
        ensureAnimationInfo().f2108a = z10;
    }

    public void setPostOnViewCreatedAlpha(float f2) {
        ensureAnimationInfo().f2123q = f2;
    }

    public void setReenterTransition(Object obj) {
        ensureAnimationInfo().f2118l = obj;
    }

    @Deprecated
    public void setRetainInstance(boolean z10) {
        a.b bVar = h1.a.f16999a;
        SetRetainInstanceUsageViolation setRetainInstanceUsageViolation = new SetRetainInstanceUsageViolation(this);
        h1.a.c(setRetainInstanceUsageViolation);
        a.b a10 = h1.a.a(this);
        if (a10.f17007a.contains(a.EnumC0268a.DETECT_RETAIN_INSTANCE_USAGE) && h1.a.e(a10, getClass(), SetRetainInstanceUsageViolation.class)) {
            h1.a.b(a10, setRetainInstanceUsageViolation);
        }
        this.mRetainInstance = z10;
        y yVar = this.mFragmentManager;
        if (yVar != null) {
            if (z10) {
                yVar.N.e(this);
                return;
            } else {
                yVar.N.h(this);
                return;
            }
        }
        this.mRetainInstanceChangedWhileDetached = true;
    }

    public void setReturnTransition(Object obj) {
        ensureAnimationInfo().f2116j = obj;
    }

    public void setSharedElementEnterTransition(Object obj) {
        ensureAnimationInfo().f2119m = obj;
    }

    public void setSharedElementNames(ArrayList<String> arrayList, ArrayList<String> arrayList2) {
        ensureAnimationInfo();
        j jVar = this.mAnimationInfo;
        jVar.f2113g = arrayList;
        jVar.f2114h = arrayList2;
    }

    public void setSharedElementReturnTransition(Object obj) {
        ensureAnimationInfo().f2120n = obj;
    }

    @Deprecated
    public void setTargetFragment(Fragment fragment, int i6) {
        y yVar;
        if (fragment != null) {
            a.b bVar = h1.a.f16999a;
            SetTargetFragmentUsageViolation setTargetFragmentUsageViolation = new SetTargetFragmentUsageViolation(this, fragment, i6);
            h1.a.c(setTargetFragmentUsageViolation);
            a.b a10 = h1.a.a(this);
            if (a10.f17007a.contains(a.EnumC0268a.DETECT_TARGET_FRAGMENT_USAGE) && h1.a.e(a10, getClass(), SetTargetFragmentUsageViolation.class)) {
                h1.a.b(a10, setTargetFragmentUsageViolation);
            }
        }
        y yVar2 = this.mFragmentManager;
        if (fragment != null) {
            yVar = fragment.mFragmentManager;
        } else {
            yVar = null;
        }
        if (yVar2 != null && yVar != null && yVar2 != yVar) {
            throw new IllegalArgumentException(defpackage.b.k("Fragment ", fragment, " must share the same FragmentManager to be set as a target fragment"));
        }
        for (Fragment fragment2 = fragment; fragment2 != null; fragment2 = fragment2.getTargetFragment(false)) {
            if (fragment2.equals(this)) {
                throw new IllegalArgumentException("Setting " + fragment + " as the target of " + this + " would create a target cycle");
            }
        }
        if (fragment == null) {
            this.mTargetWho = null;
            this.mTarget = null;
        } else if (this.mFragmentManager != null && fragment.mFragmentManager != null) {
            this.mTargetWho = fragment.mWho;
            this.mTarget = null;
        } else {
            this.mTargetWho = null;
            this.mTarget = fragment;
        }
        this.mTargetRequestCode = i6;
    }

    @Deprecated
    public void setUserVisibleHint(boolean z10) {
        a.b bVar = h1.a.f16999a;
        SetUserVisibleHintViolation setUserVisibleHintViolation = new SetUserVisibleHintViolation(this, z10);
        h1.a.c(setUserVisibleHintViolation);
        a.b a10 = h1.a.a(this);
        if (a10.f17007a.contains(a.EnumC0268a.DETECT_SET_USER_VISIBLE_HINT) && h1.a.e(a10, getClass(), SetUserVisibleHintViolation.class)) {
            h1.a.b(a10, setUserVisibleHintViolation);
        }
        boolean z11 = true;
        if (!this.mUserVisibleHint && z10 && this.mState < 5 && this.mFragmentManager != null && isAdded() && this.mIsCreated) {
            y yVar = this.mFragmentManager;
            e0 g5 = yVar.g(this);
            Fragment fragment = g5.f2166c;
            if (fragment.mDeferStart) {
                if (yVar.f2306b) {
                    yVar.J = true;
                } else {
                    fragment.mDeferStart = false;
                    g5.j();
                }
            }
        }
        this.mUserVisibleHint = z10;
        this.mDeferStart = (this.mState >= 5 || z10) ? false : false;
        if (this.mSavedFragmentState != null) {
            this.mSavedUserVisibleHint = Boolean.valueOf(z10);
        }
    }

    public boolean shouldShowRequestPermissionRationale(String str) {
        u<?> uVar = this.mHost;
        if (uVar != null) {
            return uVar.g(str);
        }
        return false;
    }

    public void startActivity(Intent intent) {
        startActivity(intent, null);
    }

    @Deprecated
    public void startActivityForResult(Intent intent, int i6) {
        startActivityForResult(intent, i6, null);
    }

    @Deprecated
    public void startIntentSenderForResult(IntentSender intentSender, int i6, Intent intent, int i10, int i11, int i12, Bundle bundle) {
        Intent intent2 = intent;
        if (this.mHost != null) {
            if (y.P(2)) {
                Log.v("FragmentManager", "Fragment " + this + " received the following in startIntentSenderForResult() requestCode: " + i6 + " IntentSender: " + intentSender + " fillInIntent: " + intent + " options: " + bundle);
            }
            y parentFragmentManager = getParentFragmentManager();
            if (parentFragmentManager.C != null) {
                if (bundle != null) {
                    if (intent2 == null) {
                        intent2 = new Intent();
                        intent2.putExtra("androidx.fragment.extra.ACTIVITY_OPTIONS_BUNDLE", true);
                    }
                    if (y.P(2)) {
                        Log.v("FragmentManager", "ActivityOptions " + bundle + " were added to fillInIntent " + intent2 + " for fragment " + this);
                    }
                    intent2.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundle);
                }
                androidx.activity.result.h hVar = new androidx.activity.result.h(intentSender, intent2, i10, i11);
                parentFragmentManager.E.addLast(new y.l(this.mWho, i6));
                if (y.P(2)) {
                    Log.v("FragmentManager", "Fragment " + this + "is launching an IntentSender for result ");
                }
                parentFragmentManager.C.a(hVar);
                return;
            }
            u<?> uVar = parentFragmentManager.f2324v;
            if (i6 == -1) {
                Activity activity = uVar.f2291u;
                int i13 = f0.a.f14598c;
                a.b.c(activity, intentSender, i6, intent, i10, i11, i12, bundle);
                return;
            }
            uVar.getClass();
            throw new IllegalStateException("Starting intent sender with a requestCode requires a FragmentActivity host");
        }
        throw new IllegalStateException(defpackage.b.k("Fragment ", this, " not attached to Activity"));
    }

    public void startPostponedEnterTransition() {
        if (this.mAnimationInfo != null && ensureAnimationInfo().f2124s) {
            if (this.mHost == null) {
                ensureAnimationInfo().f2124s = false;
            } else if (Looper.myLooper() != this.mHost.f2293w.getLooper()) {
                this.mHost.f2293w.postAtFrontOfQueue(new d());
            } else {
                callStartTransitionListener(true);
            }
        }
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(128);
        sb2.append(getClass().getSimpleName());
        sb2.append("{");
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append("} (");
        sb2.append(this.mWho);
        if (this.mFragmentId != 0) {
            sb2.append(" id=0x");
            sb2.append(Integer.toHexString(this.mFragmentId));
        }
        if (this.mTag != null) {
            sb2.append(" tag=");
            sb2.append(this.mTag);
        }
        sb2.append(")");
        return sb2.toString();
    }

    public void unregisterForContextMenu(View view) {
        view.setOnCreateContextMenuListener(null);
    }

    /* loaded from: classes.dex */
    public static class l implements Parcelable {
        public static final Parcelable.Creator<l> CREATOR = new a();

        /* renamed from: u  reason: collision with root package name */
        public final Bundle f2125u;

        /* loaded from: classes.dex */
        public class a implements Parcelable.ClassLoaderCreator<l> {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                return new l(parcel, null);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i6) {
                return new l[i6];
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            public final l createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new l(parcel, classLoader);
            }
        }

        public l(Bundle bundle) {
            this.f2125u = bundle;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i6) {
            parcel.writeBundle(this.f2125u);
        }

        public l(Parcel parcel, ClassLoader classLoader) {
            Bundle readBundle = parcel.readBundle();
            this.f2125u = readBundle;
            if (classLoader == null || readBundle == null) {
                return;
            }
            readBundle.setClassLoader(classLoader);
        }
    }

    private Fragment getTargetFragment(boolean z10) {
        String str;
        if (z10) {
            a.b bVar = h1.a.f16999a;
            GetTargetFragmentUsageViolation getTargetFragmentUsageViolation = new GetTargetFragmentUsageViolation(this);
            h1.a.c(getTargetFragmentUsageViolation);
            a.b a10 = h1.a.a(this);
            if (a10.f17007a.contains(a.EnumC0268a.DETECT_TARGET_FRAGMENT_USAGE) && h1.a.e(a10, getClass(), GetTargetFragmentUsageViolation.class)) {
                h1.a.b(a10, getTargetFragmentUsageViolation);
            }
        }
        Fragment fragment = this.mTarget;
        if (fragment != null) {
            return fragment;
        }
        y yVar = this.mFragmentManager;
        if (yVar == null || (str = this.mTargetWho) == null) {
            return null;
        }
        return yVar.C(str);
    }

    @Deprecated
    public static Fragment instantiate(Context context, String str, Bundle bundle) {
        try {
            Fragment newInstance = t.c(context.getClassLoader(), str).getConstructor(new Class[0]).newInstance(new Object[0]);
            if (bundle != null) {
                bundle.setClassLoader(newInstance.getClass().getClassLoader());
                newInstance.setArguments(bundle);
            }
            return newInstance;
        } catch (IllegalAccessException e10) {
            throw new InstantiationException(defpackage.b.m("Unable to instantiate fragment ", str, ": make sure class name exists, is public, and has an empty constructor that is public"), e10);
        } catch (java.lang.InstantiationException e11) {
            throw new InstantiationException(defpackage.b.m("Unable to instantiate fragment ", str, ": make sure class name exists, is public, and has an empty constructor that is public"), e11);
        } catch (NoSuchMethodException e12) {
            throw new InstantiationException(defpackage.b.m("Unable to instantiate fragment ", str, ": could not find Fragment constructor"), e12);
        } catch (InvocationTargetException e13) {
            throw new InstantiationException(defpackage.b.m("Unable to instantiate fragment ", str, ": calling Fragment constructor caused an exception"), e13);
        }
    }

    public final String getString(int i6, Object... objArr) {
        return getResources().getString(i6, objArr);
    }

    public final void postponeEnterTransition(long j10, TimeUnit timeUnit) {
        Handler handler;
        ensureAnimationInfo().f2124s = true;
        y yVar = this.mFragmentManager;
        if (yVar != null) {
            handler = yVar.f2324v.f2293w;
        } else {
            handler = new Handler(Looper.getMainLooper());
        }
        handler.removeCallbacks(this.mPostponedDurationRunnable);
        handler.postDelayed(this.mPostponedDurationRunnable, timeUnit.toMillis(j10));
    }

    public final <I, O> androidx.activity.result.c<I> registerForActivityResult(e.a<I, O> aVar, androidx.activity.result.f fVar, androidx.activity.result.b<O> bVar) {
        return prepareCallInternal(aVar, new h(fVar), bVar);
    }

    public void startActivity(Intent intent, Bundle bundle) {
        u<?> uVar = this.mHost;
        if (uVar != null) {
            Object obj = g0.a.f16164a;
            a.C0244a.b(uVar.f2292v, intent, bundle);
            return;
        }
        throw new IllegalStateException(defpackage.b.k("Fragment ", this, " not attached to Activity"));
    }

    @Deprecated
    public void startActivityForResult(Intent intent, int i6, Bundle bundle) {
        if (this.mHost != null) {
            y parentFragmentManager = getParentFragmentManager();
            if (parentFragmentManager.B != null) {
                parentFragmentManager.E.addLast(new y.l(this.mWho, i6));
                if (intent != null && bundle != null) {
                    intent.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundle);
                }
                parentFragmentManager.B.a(intent);
                return;
            }
            u<?> uVar = parentFragmentManager.f2324v;
            uVar.getClass();
            if (i6 == -1) {
                Object obj = g0.a.f16164a;
                a.C0244a.b(uVar.f2292v, intent, bundle);
                return;
            }
            throw new IllegalStateException("Starting activity with a requestCode requires a FragmentActivity host");
        }
        throw new IllegalStateException(defpackage.b.k("Fragment ", this, " not attached to Activity"));
    }

    @Deprecated
    public LayoutInflater getLayoutInflater(Bundle bundle) {
        u<?> uVar = this.mHost;
        if (uVar != null) {
            LayoutInflater f2 = uVar.f();
            f2.setFactory2(this.mChildFragmentManager.f);
            return f2;
        }
        throw new IllegalStateException("onGetLayoutInflater() cannot be executed until the Fragment is attached to the FragmentManager.");
    }

    @Deprecated
    public void onAttach(Activity activity) {
        this.mCalled = true;
    }

    @Deprecated
    public void onInflate(Activity activity, AttributeSet attributeSet, Bundle bundle) {
        this.mCalled = true;
    }

    public Fragment(int i6) {
        this();
        this.mContentLayoutId = i6;
    }

    @Deprecated
    public void onDestroyOptionsMenu() {
    }

    private void restoreViewState() {
        if (y.P(3)) {
            Log.d("FragmentManager", "moveto RESTORE_VIEW_STATE: " + this);
        }
        if (this.mView != null) {
            restoreViewState(this.mSavedFragmentState);
        }
        this.mSavedFragmentState = null;
    }

    @Deprecated
    public void onAttachFragment(Fragment fragment) {
    }

    public void onHiddenChanged(boolean z10) {
    }

    public void onMultiWindowModeChanged(boolean z10) {
    }

    @Deprecated
    public void onOptionsMenuClosed(Menu menu) {
    }

    public void onPictureInPictureModeChanged(boolean z10) {
    }

    @Deprecated
    public void onPrepareOptionsMenu(Menu menu) {
    }

    public void onPrimaryNavigationFragmentChanged(boolean z10) {
    }

    public void onSaveInstanceState(Bundle bundle) {
    }

    @Deprecated
    public void onCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
    }

    public void onViewCreated(View view, Bundle bundle) {
    }

    @Deprecated
    public void onRequestPermissionsResult(int i6, String[] strArr, int[] iArr) {
    }
}
