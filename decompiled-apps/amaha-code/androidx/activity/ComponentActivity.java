package androidx.activity;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Trace;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.window.OnBackInvokedDispatcher;
import androidx.lifecycle.b0;
import androidx.lifecycle.e0;
import androidx.lifecycle.h0;
import androidx.lifecycle.j;
import androidx.lifecycle.n;
import androidx.lifecycle.n0;
import androidx.lifecycle.o0;
import androidx.lifecycle.p;
import androidx.lifecycle.q;
import androidx.lifecycle.q0;
import androidx.lifecycle.r0;
import com.theinnerhour.b2b.R;
import e.a;
import f0.a;
import f0.a0;
import f0.c0;
import f0.k;
import f0.m;
import f0.z;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Random;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import t0.l;
/* loaded from: classes.dex */
public class ComponentActivity extends k implements r0, androidx.lifecycle.h, a2.c, j, androidx.activity.result.g, g0.b, g0.c, z, a0, t0.i {
    private static final String ACTIVITY_RESULT_TAG = "android:support:activity-result";
    private final androidx.activity.result.f mActivityResultRegistry;
    private int mContentLayoutId;
    final d.a mContextAwareHelper;
    private o0.b mDefaultFactory;
    private boolean mDispatchingOnMultiWindowModeChanged;
    private boolean mDispatchingOnPictureInPictureModeChanged;
    private final q mLifecycleRegistry;
    private final l mMenuHostHelper;
    private final AtomicInteger mNextLocalRequestCode;
    private final OnBackPressedDispatcher mOnBackPressedDispatcher;
    private final CopyOnWriteArrayList<s0.a<Configuration>> mOnConfigurationChangedListeners;
    private final CopyOnWriteArrayList<s0.a<m>> mOnMultiWindowModeChangedListeners;
    private final CopyOnWriteArrayList<s0.a<Intent>> mOnNewIntentListeners;
    private final CopyOnWriteArrayList<s0.a<c0>> mOnPictureInPictureModeChangedListeners;
    private final CopyOnWriteArrayList<s0.a<Integer>> mOnTrimMemoryListeners;
    final a2.b mSavedStateRegistryController;
    private q0 mViewModelStore;

    /* loaded from: classes.dex */
    public class a implements Runnable {
        public a() {
            ComponentActivity.this = r1;
        }

        @Override // java.lang.Runnable
        public final void run() {
            try {
                ComponentActivity.super.onBackPressed();
            } catch (IllegalStateException e10) {
                if (TextUtils.equals(e10.getMessage(), "Can not perform this action after onSaveInstanceState")) {
                    return;
                }
                throw e10;
            }
        }
    }

    /* loaded from: classes.dex */
    public class b extends androidx.activity.result.f {
        public b() {
            ComponentActivity.this = r1;
        }

        @Override // androidx.activity.result.f
        public final void b(int i6, e.a aVar, Object obj) {
            Bundle bundle;
            ComponentActivity componentActivity = ComponentActivity.this;
            a.C0212a b10 = aVar.b(componentActivity, obj);
            if (b10 != null) {
                new Handler(Looper.getMainLooper()).post(new e(this, i6, b10));
                return;
            }
            Intent a10 = aVar.a(componentActivity, obj);
            if (a10.getExtras() != null && a10.getExtras().getClassLoader() == null) {
                a10.setExtrasClassLoader(componentActivity.getClassLoader());
            }
            if (a10.hasExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) {
                Bundle bundleExtra = a10.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
                a10.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
                bundle = bundleExtra;
            } else {
                bundle = null;
            }
            if ("androidx.activity.result.contract.action.REQUEST_PERMISSIONS".equals(a10.getAction())) {
                String[] stringArrayExtra = a10.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
                if (stringArrayExtra == null) {
                    stringArrayExtra = new String[0];
                }
                f0.a.e(componentActivity, stringArrayExtra, i6);
            } else if ("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST".equals(a10.getAction())) {
                androidx.activity.result.h hVar = (androidx.activity.result.h) a10.getParcelableExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST");
                try {
                    IntentSender intentSender = hVar.f995u;
                    Intent intent = hVar.f996v;
                    int i10 = hVar.f997w;
                    int i11 = hVar.f998x;
                    int i12 = f0.a.f14598c;
                    a.b.c(componentActivity, intentSender, i6, intent, i10, i11, 0, bundle);
                } catch (IntentSender.SendIntentException e10) {
                    new Handler(Looper.getMainLooper()).post(new f(this, i6, e10));
                }
            } else {
                int i13 = f0.a.f14598c;
                a.b.b(componentActivity, a10, i6, bundle);
            }
        }
    }

    /* loaded from: classes.dex */
    public static class c {
        public static OnBackInvokedDispatcher a(Activity activity) {
            return activity.getOnBackInvokedDispatcher();
        }
    }

    /* loaded from: classes.dex */
    public static final class d {

        /* renamed from: a */
        public Object f935a;

        /* renamed from: b */
        public q0 f936b;
    }

    public ComponentActivity() {
        this.mContextAwareHelper = new d.a();
        this.mMenuHostHelper = new l(new androidx.activity.b(0, this));
        this.mLifecycleRegistry = new q(this);
        a2.b bVar = new a2.b(this);
        this.mSavedStateRegistryController = bVar;
        this.mOnBackPressedDispatcher = new OnBackPressedDispatcher(new a());
        this.mNextLocalRequestCode = new AtomicInteger();
        this.mActivityResultRegistry = new b();
        this.mOnConfigurationChangedListeners = new CopyOnWriteArrayList<>();
        this.mOnTrimMemoryListeners = new CopyOnWriteArrayList<>();
        this.mOnNewIntentListeners = new CopyOnWriteArrayList<>();
        this.mOnMultiWindowModeChangedListeners = new CopyOnWriteArrayList<>();
        this.mOnPictureInPictureModeChangedListeners = new CopyOnWriteArrayList<>();
        this.mDispatchingOnMultiWindowModeChanged = false;
        this.mDispatchingOnPictureInPictureModeChanged = false;
        if (getLifecycle() != null) {
            int i6 = Build.VERSION.SDK_INT;
            getLifecycle().a(new n() { // from class: androidx.activity.ComponentActivity.3
                {
                    ComponentActivity.this = this;
                }

                @Override // androidx.lifecycle.n
                public final void c(p pVar, j.b bVar2) {
                    View view;
                    if (bVar2 == j.b.ON_STOP) {
                        Window window = ComponentActivity.this.getWindow();
                        if (window != null) {
                            view = window.peekDecorView();
                        } else {
                            view = null;
                        }
                        if (view != null) {
                            view.cancelPendingInputEvents();
                        }
                    }
                }
            });
            getLifecycle().a(new n() { // from class: androidx.activity.ComponentActivity.4
                {
                    ComponentActivity.this = this;
                }

                @Override // androidx.lifecycle.n
                public final void c(p pVar, j.b bVar2) {
                    if (bVar2 == j.b.ON_DESTROY) {
                        ComponentActivity.this.mContextAwareHelper.f12126b = null;
                        if (!ComponentActivity.this.isChangingConfigurations()) {
                            ComponentActivity.this.getViewModelStore().a();
                        }
                    }
                }
            });
            getLifecycle().a(new n() { // from class: androidx.activity.ComponentActivity.5
                {
                    ComponentActivity.this = this;
                }

                @Override // androidx.lifecycle.n
                public final void c(p pVar, j.b bVar2) {
                    ComponentActivity componentActivity = ComponentActivity.this;
                    componentActivity.ensureViewModelStore();
                    componentActivity.getLifecycle().c(this);
                }
            });
            bVar.a();
            e0.b(this);
            if (i6 <= 23) {
                getLifecycle().a(new ImmLeaksCleaner(this));
            }
            getSavedStateRegistry().c(ACTIVITY_RESULT_TAG, new androidx.activity.c(0, this));
            addOnContextAvailableListener(new androidx.activity.d(this, 0));
            return;
        }
        throw new IllegalStateException("getLifecycle() returned null in ComponentActivity's constructor. Please make sure you are lazily constructing your Lifecycle in the first call to getLifecycle() rather than relying on field initialization.");
    }

    private void initViewTreeOwners() {
        getWindow().getDecorView().setTag(R.id.view_tree_lifecycle_owner, this);
        getWindow().getDecorView().setTag(R.id.view_tree_view_model_store_owner, this);
        View decorView = getWindow().getDecorView();
        kotlin.jvm.internal.i.g(decorView, "<this>");
        decorView.setTag(R.id.view_tree_saved_state_registry_owner, this);
        kc.f.V(getWindow().getDecorView(), this);
    }

    public Bundle lambda$new$0() {
        Bundle bundle = new Bundle();
        androidx.activity.result.f fVar = this.mActivityResultRegistry;
        fVar.getClass();
        HashMap hashMap = fVar.f986c;
        bundle.putIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS", new ArrayList<>(hashMap.values()));
        bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS", new ArrayList<>(hashMap.keySet()));
        bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS", new ArrayList<>(fVar.f988e));
        bundle.putBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT", (Bundle) fVar.f990h.clone());
        bundle.putSerializable("KEY_COMPONENT_ACTIVITY_RANDOM_OBJECT", fVar.f984a);
        return bundle;
    }

    public void lambda$new$1(Context context) {
        Bundle a10 = getSavedStateRegistry().a(ACTIVITY_RESULT_TAG);
        if (a10 != null) {
            androidx.activity.result.f fVar = this.mActivityResultRegistry;
            fVar.getClass();
            ArrayList<Integer> integerArrayList = a10.getIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS");
            ArrayList<String> stringArrayList = a10.getStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS");
            if (stringArrayList != null && integerArrayList != null) {
                fVar.f988e = a10.getStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS");
                fVar.f984a = (Random) a10.getSerializable("KEY_COMPONENT_ACTIVITY_RANDOM_OBJECT");
                Bundle bundle = a10.getBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT");
                Bundle bundle2 = fVar.f990h;
                bundle2.putAll(bundle);
                for (int i6 = 0; i6 < stringArrayList.size(); i6++) {
                    String str = stringArrayList.get(i6);
                    HashMap hashMap = fVar.f986c;
                    boolean containsKey = hashMap.containsKey(str);
                    HashMap hashMap2 = fVar.f985b;
                    if (containsKey) {
                        Integer num = (Integer) hashMap.remove(str);
                        if (!bundle2.containsKey(str)) {
                            hashMap2.remove(num);
                        }
                    }
                    int intValue = integerArrayList.get(i6).intValue();
                    String str2 = stringArrayList.get(i6);
                    hashMap2.put(Integer.valueOf(intValue), str2);
                    hashMap.put(str2, Integer.valueOf(intValue));
                }
            }
        }
    }

    @Override // android.app.Activity
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        initViewTreeOwners();
        super.addContentView(view, layoutParams);
    }

    @Override // t0.i
    public void addMenuProvider(t0.n nVar) {
        l lVar = this.mMenuHostHelper;
        lVar.f32332b.add(nVar);
        lVar.f32331a.run();
    }

    @Override // g0.b
    public final void addOnConfigurationChangedListener(s0.a<Configuration> aVar) {
        this.mOnConfigurationChangedListeners.add(aVar);
    }

    public final void addOnContextAvailableListener(d.b bVar) {
        d.a aVar = this.mContextAwareHelper;
        if (aVar.f12126b != null) {
            bVar.a(aVar.f12126b);
        }
        aVar.f12125a.add(bVar);
    }

    @Override // f0.z
    public final void addOnMultiWindowModeChangedListener(s0.a<m> aVar) {
        this.mOnMultiWindowModeChangedListeners.add(aVar);
    }

    public final void addOnNewIntentListener(s0.a<Intent> aVar) {
        this.mOnNewIntentListeners.add(aVar);
    }

    @Override // f0.a0
    public final void addOnPictureInPictureModeChangedListener(s0.a<c0> aVar) {
        this.mOnPictureInPictureModeChangedListeners.add(aVar);
    }

    @Override // g0.c
    public final void addOnTrimMemoryListener(s0.a<Integer> aVar) {
        this.mOnTrimMemoryListeners.add(aVar);
    }

    public void ensureViewModelStore() {
        if (this.mViewModelStore == null) {
            d dVar = (d) getLastNonConfigurationInstance();
            if (dVar != null) {
                this.mViewModelStore = dVar.f936b;
            }
            if (this.mViewModelStore == null) {
                this.mViewModelStore = new q0();
            }
        }
    }

    @Override // androidx.activity.result.g
    public final androidx.activity.result.f getActivityResultRegistry() {
        return this.mActivityResultRegistry;
    }

    @Override // androidx.lifecycle.h
    public k1.a getDefaultViewModelCreationExtras() {
        k1.d dVar = new k1.d(0);
        Application application = getApplication();
        LinkedHashMap linkedHashMap = dVar.f22765a;
        if (application != null) {
            linkedHashMap.put(n0.f2445a, getApplication());
        }
        linkedHashMap.put(e0.f2400a, this);
        linkedHashMap.put(e0.f2401b, this);
        if (getIntent() != null && getIntent().getExtras() != null) {
            linkedHashMap.put(e0.f2402c, getIntent().getExtras());
        }
        return dVar;
    }

    @Override // androidx.lifecycle.h
    public o0.b getDefaultViewModelProviderFactory() {
        Bundle bundle;
        if (this.mDefaultFactory == null) {
            Application application = getApplication();
            if (getIntent() != null) {
                bundle = getIntent().getExtras();
            } else {
                bundle = null;
            }
            this.mDefaultFactory = new h0(application, this, bundle);
        }
        return this.mDefaultFactory;
    }

    @Deprecated
    public Object getLastCustomNonConfigurationInstance() {
        d dVar = (d) getLastNonConfigurationInstance();
        if (dVar != null) {
            return dVar.f935a;
        }
        return null;
    }

    @Override // f0.k, androidx.lifecycle.p
    public androidx.lifecycle.j getLifecycle() {
        return this.mLifecycleRegistry;
    }

    @Override // androidx.activity.j
    public final OnBackPressedDispatcher getOnBackPressedDispatcher() {
        return this.mOnBackPressedDispatcher;
    }

    @Override // a2.c
    public final a2.a getSavedStateRegistry() {
        return this.mSavedStateRegistryController.f174b;
    }

    @Override // androidx.lifecycle.r0
    public q0 getViewModelStore() {
        if (getApplication() != null) {
            ensureViewModelStore();
            return this.mViewModelStore;
        }
        throw new IllegalStateException("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
    }

    public void invalidateMenu() {
        invalidateOptionsMenu();
    }

    @Override // android.app.Activity
    @Deprecated
    public void onActivityResult(int i6, int i10, Intent intent) {
        if (!this.mActivityResultRegistry.a(i6, i10, intent)) {
            super.onActivityResult(i6, i10, intent);
        }
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        this.mOnBackPressedDispatcher.b();
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        Iterator<s0.a<Configuration>> it = this.mOnConfigurationChangedListeners.iterator();
        while (it.hasNext()) {
            it.next().accept(configuration);
        }
    }

    @Override // f0.k, android.app.Activity
    public void onCreate(Bundle bundle) {
        this.mSavedStateRegistryController.b(bundle);
        d.a aVar = this.mContextAwareHelper;
        aVar.f12126b = this;
        Iterator it = aVar.f12125a.iterator();
        while (it.hasNext()) {
            ((d.b) it.next()).a(this);
        }
        super.onCreate(bundle);
        b0.c(this);
        if (o0.a.a()) {
            OnBackPressedDispatcher onBackPressedDispatcher = this.mOnBackPressedDispatcher;
            onBackPressedDispatcher.f946e = c.a(this);
            onBackPressedDispatcher.c();
        }
        int i6 = this.mContentLayoutId;
        if (i6 != 0) {
            setContentView(i6);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onCreatePanelMenu(int i6, Menu menu) {
        if (i6 == 0) {
            super.onCreatePanelMenu(i6, menu);
            l lVar = this.mMenuHostHelper;
            MenuInflater menuInflater = getMenuInflater();
            Iterator<t0.n> it = lVar.f32332b.iterator();
            while (it.hasNext()) {
                it.next().c(menu, menuInflater);
            }
            return true;
        }
        return true;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int i6, MenuItem menuItem) {
        if (super.onMenuItemSelected(i6, menuItem)) {
            return true;
        }
        if (i6 != 0) {
            return false;
        }
        Iterator<t0.n> it = this.mMenuHostHelper.f32332b.iterator();
        while (it.hasNext()) {
            if (it.next().a(menuItem)) {
                return true;
            }
        }
        return false;
    }

    @Override // android.app.Activity
    public void onMultiWindowModeChanged(boolean z10) {
        if (this.mDispatchingOnMultiWindowModeChanged) {
            return;
        }
        Iterator<s0.a<m>> it = this.mOnMultiWindowModeChangedListeners.iterator();
        while (it.hasNext()) {
            it.next().accept(new m(z10));
        }
    }

    @Override // android.app.Activity
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        Iterator<s0.a<Intent>> it = this.mOnNewIntentListeners.iterator();
        while (it.hasNext()) {
            it.next().accept(intent);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onPanelClosed(int i6, Menu menu) {
        Iterator<t0.n> it = this.mMenuHostHelper.f32332b.iterator();
        while (it.hasNext()) {
            it.next().b(menu);
        }
        super.onPanelClosed(i6, menu);
    }

    @Override // android.app.Activity
    public void onPictureInPictureModeChanged(boolean z10) {
        if (this.mDispatchingOnPictureInPictureModeChanged) {
            return;
        }
        Iterator<s0.a<c0>> it = this.mOnPictureInPictureModeChangedListeners.iterator();
        while (it.hasNext()) {
            it.next().accept(new c0(z10));
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onPreparePanel(int i6, View view, Menu menu) {
        if (i6 == 0) {
            super.onPreparePanel(i6, view, menu);
            Iterator<t0.n> it = this.mMenuHostHelper.f32332b.iterator();
            while (it.hasNext()) {
                it.next().d(menu);
            }
            return true;
        }
        return true;
    }

    @Override // android.app.Activity
    @Deprecated
    public void onRequestPermissionsResult(int i6, String[] strArr, int[] iArr) {
        if (!this.mActivityResultRegistry.a(i6, -1, new Intent().putExtra("androidx.activity.result.contract.extra.PERMISSIONS", strArr).putExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS", iArr)) && Build.VERSION.SDK_INT >= 23) {
            super.onRequestPermissionsResult(i6, strArr, iArr);
        }
    }

    @Deprecated
    public Object onRetainCustomNonConfigurationInstance() {
        return null;
    }

    @Override // android.app.Activity
    public final Object onRetainNonConfigurationInstance() {
        d dVar;
        Object onRetainCustomNonConfigurationInstance = onRetainCustomNonConfigurationInstance();
        q0 q0Var = this.mViewModelStore;
        if (q0Var == null && (dVar = (d) getLastNonConfigurationInstance()) != null) {
            q0Var = dVar.f936b;
        }
        if (q0Var == null && onRetainCustomNonConfigurationInstance == null) {
            return null;
        }
        d dVar2 = new d();
        dVar2.f935a = onRetainCustomNonConfigurationInstance;
        dVar2.f936b = q0Var;
        return dVar2;
    }

    @Override // f0.k, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        androidx.lifecycle.j lifecycle = getLifecycle();
        if (lifecycle instanceof q) {
            ((q) lifecycle).h(j.c.CREATED);
        }
        super.onSaveInstanceState(bundle);
        this.mSavedStateRegistryController.c(bundle);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks2
    public void onTrimMemory(int i6) {
        super.onTrimMemory(i6);
        Iterator<s0.a<Integer>> it = this.mOnTrimMemoryListeners.iterator();
        while (it.hasNext()) {
            it.next().accept(Integer.valueOf(i6));
        }
    }

    public Context peekAvailableContext() {
        return this.mContextAwareHelper.f12126b;
    }

    public final <I, O> androidx.activity.result.c<I> registerForActivityResult(e.a<I, O> aVar, androidx.activity.result.f fVar, androidx.activity.result.b<O> bVar) {
        return fVar.c("activity_rq#" + this.mNextLocalRequestCode.getAndIncrement(), this, aVar, bVar);
    }

    @Override // t0.i
    public void removeMenuProvider(t0.n nVar) {
        this.mMenuHostHelper.a(nVar);
    }

    @Override // g0.b
    public final void removeOnConfigurationChangedListener(s0.a<Configuration> aVar) {
        this.mOnConfigurationChangedListeners.remove(aVar);
    }

    public final void removeOnContextAvailableListener(d.b bVar) {
        this.mContextAwareHelper.f12125a.remove(bVar);
    }

    @Override // f0.z
    public final void removeOnMultiWindowModeChangedListener(s0.a<m> aVar) {
        this.mOnMultiWindowModeChangedListeners.remove(aVar);
    }

    public final void removeOnNewIntentListener(s0.a<Intent> aVar) {
        this.mOnNewIntentListeners.remove(aVar);
    }

    @Override // f0.a0
    public final void removeOnPictureInPictureModeChangedListener(s0.a<c0> aVar) {
        this.mOnPictureInPictureModeChangedListeners.remove(aVar);
    }

    @Override // g0.c
    public final void removeOnTrimMemoryListener(s0.a<Integer> aVar) {
        this.mOnTrimMemoryListeners.remove(aVar);
    }

    @Override // android.app.Activity
    public void reportFullyDrawn() {
        try {
            if (g2.a.a()) {
                Trace.beginSection("reportFullyDrawn() for ComponentActivity");
            }
            super.reportFullyDrawn();
            Trace.endSection();
        } catch (Throwable th2) {
            Trace.endSection();
            throw th2;
        }
    }

    @Override // android.app.Activity
    public void setContentView(int i6) {
        initViewTreeOwners();
        super.setContentView(i6);
    }

    @Override // android.app.Activity
    @Deprecated
    public void startActivityForResult(Intent intent, int i6) {
        super.startActivityForResult(intent, i6);
    }

    @Override // android.app.Activity
    @Deprecated
    public void startIntentSenderForResult(IntentSender intentSender, int i6, Intent intent, int i10, int i11, int i12) {
        super.startIntentSenderForResult(intentSender, i6, intent, i10, i11, i12);
    }

    @Override // android.app.Activity
    @Deprecated
    public void startActivityForResult(Intent intent, int i6, Bundle bundle) {
        super.startActivityForResult(intent, i6, bundle);
    }

    @Override // android.app.Activity
    @Deprecated
    public void startIntentSenderForResult(IntentSender intentSender, int i6, Intent intent, int i10, int i11, int i12, Bundle bundle) {
        super.startIntentSenderForResult(intentSender, i6, intent, i10, i11, i12, bundle);
    }

    @Override // android.app.Activity
    public void setContentView(View view) {
        initViewTreeOwners();
        super.setContentView(view);
    }

    @Override // android.app.Activity
    public void onMultiWindowModeChanged(boolean z10, Configuration configuration) {
        this.mDispatchingOnMultiWindowModeChanged = true;
        try {
            super.onMultiWindowModeChanged(z10, configuration);
            this.mDispatchingOnMultiWindowModeChanged = false;
            Iterator<s0.a<m>> it = this.mOnMultiWindowModeChangedListeners.iterator();
            while (it.hasNext()) {
                it.next().accept(new m(z10, 0));
            }
        } catch (Throwable th2) {
            this.mDispatchingOnMultiWindowModeChanged = false;
            throw th2;
        }
    }

    @Override // android.app.Activity
    public void onPictureInPictureModeChanged(boolean z10, Configuration configuration) {
        this.mDispatchingOnPictureInPictureModeChanged = true;
        try {
            super.onPictureInPictureModeChanged(z10, configuration);
            this.mDispatchingOnPictureInPictureModeChanged = false;
            Iterator<s0.a<c0>> it = this.mOnPictureInPictureModeChangedListeners.iterator();
            while (it.hasNext()) {
                it.next().accept(new c0(z10, 0));
            }
        } catch (Throwable th2) {
            this.mDispatchingOnPictureInPictureModeChanged = false;
            throw th2;
        }
    }

    public final <I, O> androidx.activity.result.c<I> registerForActivityResult(e.a<I, O> aVar, androidx.activity.result.b<O> bVar) {
        return registerForActivityResult(aVar, this.mActivityResultRegistry, bVar);
    }

    public void addMenuProvider(final t0.n nVar, p pVar) {
        final l lVar = this.mMenuHostHelper;
        lVar.f32332b.add(nVar);
        lVar.f32331a.run();
        androidx.lifecycle.j lifecycle = pVar.getLifecycle();
        HashMap hashMap = lVar.f32333c;
        l.a aVar = (l.a) hashMap.remove(nVar);
        if (aVar != null) {
            aVar.f32334a.c(aVar.f32335b);
            aVar.f32335b = null;
        }
        hashMap.put(nVar, new l.a(lifecycle, new n() { // from class: t0.j
            @Override // androidx.lifecycle.n
            public final void c(androidx.lifecycle.p pVar2, j.b bVar) {
                j.b bVar2 = j.b.ON_DESTROY;
                l lVar2 = l.this;
                if (bVar == bVar2) {
                    lVar2.a(nVar);
                } else {
                    lVar2.getClass();
                }
            }
        }));
    }

    @Override // android.app.Activity
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        initViewTreeOwners();
        super.setContentView(view, layoutParams);
    }

    public void addMenuProvider(final t0.n nVar, p pVar, final j.c cVar) {
        final l lVar = this.mMenuHostHelper;
        lVar.getClass();
        androidx.lifecycle.j lifecycle = pVar.getLifecycle();
        HashMap hashMap = lVar.f32333c;
        l.a aVar = (l.a) hashMap.remove(nVar);
        if (aVar != null) {
            aVar.f32334a.c(aVar.f32335b);
            aVar.f32335b = null;
        }
        hashMap.put(nVar, new l.a(lifecycle, new n() { // from class: t0.k
            @Override // androidx.lifecycle.n
            public final void c(androidx.lifecycle.p pVar2, j.b bVar) {
                j.b bVar2;
                l lVar2 = l.this;
                lVar2.getClass();
                j.c cVar2 = cVar;
                int ordinal = cVar2.ordinal();
                j.b bVar3 = null;
                if (ordinal != 2) {
                    if (ordinal != 3) {
                        if (ordinal != 4) {
                            bVar2 = null;
                        } else {
                            bVar2 = j.b.ON_RESUME;
                        }
                    } else {
                        bVar2 = j.b.ON_START;
                    }
                } else {
                    bVar2 = j.b.ON_CREATE;
                }
                Runnable runnable = lVar2.f32331a;
                CopyOnWriteArrayList<n> copyOnWriteArrayList = lVar2.f32332b;
                n nVar2 = nVar;
                if (bVar == bVar2) {
                    copyOnWriteArrayList.add(nVar2);
                    runnable.run();
                    return;
                }
                j.b bVar4 = j.b.ON_DESTROY;
                if (bVar == bVar4) {
                    lVar2.a(nVar2);
                    return;
                }
                int ordinal2 = cVar2.ordinal();
                if (ordinal2 != 2) {
                    if (ordinal2 != 3) {
                        if (ordinal2 == 4) {
                            bVar3 = j.b.ON_PAUSE;
                        }
                    } else {
                        bVar3 = j.b.ON_STOP;
                    }
                } else {
                    bVar3 = bVar4;
                }
                if (bVar == bVar3) {
                    copyOnWriteArrayList.remove(nVar2);
                    runnable.run();
                }
            }
        }));
    }

    public ComponentActivity(int i6) {
        this();
        this.mContentLayoutId = i6;
    }
}
