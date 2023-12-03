package androidx.fragment.app;

import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import androidx.activity.ComponentActivity;
import androidx.activity.OnBackPressedDispatcher;
import androidx.lifecycle.j;
import f0.a;
import java.io.FileDescriptor;
import java.io.PrintWriter;
/* compiled from: FragmentActivity.java */
/* loaded from: classes.dex */
public class p extends ComponentActivity implements a.f, a.g {
    static final String LIFECYCLE_TAG = "android:support:lifecycle";
    boolean mCreated;
    final androidx.lifecycle.q mFragmentLifecycleRegistry;
    final s mFragments;
    boolean mResumed;
    boolean mStopped;

    /* compiled from: FragmentActivity.java */
    /* loaded from: classes.dex */
    public class a extends u<p> implements g0.b, g0.c, f0.z, f0.a0, androidx.lifecycle.r0, androidx.activity.j, androidx.activity.result.g, a2.c, c0, t0.i {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a() {
            super(r1);
            p.this = r1;
        }

        @Override // androidx.fragment.app.c0
        public final void a(y yVar, Fragment fragment) {
            p.this.onAttachFragment(fragment);
        }

        @Override // t0.i
        public final void addMenuProvider(t0.n nVar) {
            p.this.addMenuProvider(nVar);
        }

        @Override // g0.b
        public final void addOnConfigurationChangedListener(s0.a<Configuration> aVar) {
            p.this.addOnConfigurationChangedListener(aVar);
        }

        @Override // f0.z
        public final void addOnMultiWindowModeChangedListener(s0.a<f0.m> aVar) {
            p.this.addOnMultiWindowModeChangedListener(aVar);
        }

        @Override // f0.a0
        public final void addOnPictureInPictureModeChangedListener(s0.a<f0.c0> aVar) {
            p.this.addOnPictureInPictureModeChangedListener(aVar);
        }

        @Override // g0.c
        public final void addOnTrimMemoryListener(s0.a<Integer> aVar) {
            p.this.addOnTrimMemoryListener(aVar);
        }

        @Override // androidx.fragment.app.r
        public final View b(int i6) {
            return p.this.findViewById(i6);
        }

        @Override // androidx.fragment.app.r
        public final boolean c() {
            Window window = p.this.getWindow();
            if (window != null && window.peekDecorView() != null) {
                return true;
            }
            return false;
        }

        @Override // androidx.fragment.app.u
        public final void d(PrintWriter printWriter, String[] strArr) {
            p.this.dump("  ", null, printWriter, strArr);
        }

        @Override // androidx.fragment.app.u
        public final p e() {
            return p.this;
        }

        @Override // androidx.fragment.app.u
        public final LayoutInflater f() {
            p pVar = p.this;
            return pVar.getLayoutInflater().cloneInContext(pVar);
        }

        @Override // androidx.fragment.app.u
        public final boolean g(String str) {
            return f0.a.f(p.this, str);
        }

        @Override // androidx.activity.result.g
        public final androidx.activity.result.f getActivityResultRegistry() {
            return p.this.getActivityResultRegistry();
        }

        @Override // androidx.lifecycle.p
        public final androidx.lifecycle.j getLifecycle() {
            return p.this.mFragmentLifecycleRegistry;
        }

        @Override // androidx.activity.j
        public final OnBackPressedDispatcher getOnBackPressedDispatcher() {
            return p.this.getOnBackPressedDispatcher();
        }

        @Override // a2.c
        public final a2.a getSavedStateRegistry() {
            return p.this.getSavedStateRegistry();
        }

        @Override // androidx.lifecycle.r0
        public final androidx.lifecycle.q0 getViewModelStore() {
            return p.this.getViewModelStore();
        }

        @Override // androidx.fragment.app.u
        public final void h() {
            p.this.invalidateMenu();
        }

        @Override // t0.i
        public final void removeMenuProvider(t0.n nVar) {
            p.this.removeMenuProvider(nVar);
        }

        @Override // g0.b
        public final void removeOnConfigurationChangedListener(s0.a<Configuration> aVar) {
            p.this.removeOnConfigurationChangedListener(aVar);
        }

        @Override // f0.z
        public final void removeOnMultiWindowModeChangedListener(s0.a<f0.m> aVar) {
            p.this.removeOnMultiWindowModeChangedListener(aVar);
        }

        @Override // f0.a0
        public final void removeOnPictureInPictureModeChangedListener(s0.a<f0.c0> aVar) {
            p.this.removeOnPictureInPictureModeChangedListener(aVar);
        }

        @Override // g0.c
        public final void removeOnTrimMemoryListener(s0.a<Integer> aVar) {
            p.this.removeOnTrimMemoryListener(aVar);
        }
    }

    public p() {
        this.mFragments = new s(new a());
        this.mFragmentLifecycleRegistry = new androidx.lifecycle.q(this);
        this.mStopped = true;
        init();
    }

    private void init() {
        getSavedStateRegistry().c(LIFECYCLE_TAG, new androidx.activity.c(1, this));
        addOnConfigurationChangedListener(new o(0, this));
        addOnNewIntentListener(new o(1, this));
        addOnContextAvailableListener(new androidx.activity.d(this, 1));
    }

    public /* synthetic */ Bundle lambda$init$0() {
        markFragmentsCreated();
        this.mFragmentLifecycleRegistry.f(j.b.ON_STOP);
        return new Bundle();
    }

    public /* synthetic */ void lambda$init$1(Configuration configuration) {
        this.mFragments.a();
    }

    public /* synthetic */ void lambda$init$2(Intent intent) {
        this.mFragments.a();
    }

    public void lambda$init$3(Context context) {
        u<?> uVar = this.mFragments.f2274a;
        uVar.f2294x.b(uVar, uVar, null);
    }

    private static boolean markState(y yVar, j.c cVar) {
        boolean z10 = false;
        for (Fragment fragment : yVar.L()) {
            if (fragment != null) {
                if (fragment.getHost() != null) {
                    z10 |= markState(fragment.getChildFragmentManager(), cVar);
                }
                p0 p0Var = fragment.mViewLifecycleOwner;
                j.c cVar2 = j.c.STARTED;
                if (p0Var != null) {
                    p0Var.b();
                    if (p0Var.f2261x.f2454c.d(cVar2)) {
                        fragment.mViewLifecycleOwner.f2261x.h(cVar);
                        z10 = true;
                    }
                }
                if (fragment.mLifecycleRegistry.f2454c.d(cVar2)) {
                    fragment.mLifecycleRegistry.h(cVar);
                    z10 = true;
                }
            }
        }
        return z10;
    }

    public final View dispatchFragmentsOnCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        return this.mFragments.f2274a.f2294x.f.onCreateView(view, str, context, attributeSet);
    }

    @Override // android.app.Activity
    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        if (!shouldDumpInternalState(strArr)) {
            return;
        }
        printWriter.print(str);
        printWriter.print("Local FragmentActivity ");
        printWriter.print(Integer.toHexString(System.identityHashCode(this)));
        printWriter.println(" State:");
        String str2 = str + "  ";
        printWriter.print(str2);
        printWriter.print("mCreated=");
        printWriter.print(this.mCreated);
        printWriter.print(" mResumed=");
        printWriter.print(this.mResumed);
        printWriter.print(" mStopped=");
        printWriter.print(this.mStopped);
        if (getApplication() != null) {
            l1.a.a(this).b(str2, printWriter);
        }
        this.mFragments.f2274a.f2294x.v(str, fileDescriptor, printWriter, strArr);
    }

    public y getSupportFragmentManager() {
        return this.mFragments.f2274a.f2294x;
    }

    @Deprecated
    public l1.a getSupportLoaderManager() {
        return l1.a.a(this);
    }

    public void markFragmentsCreated() {
        do {
        } while (markState(getSupportFragmentManager(), j.c.CREATED));
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i6, int i10, Intent intent) {
        this.mFragments.a();
        super.onActivityResult(i6, i10, intent);
    }

    @Override // androidx.activity.ComponentActivity, f0.k, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.mFragmentLifecycleRegistry.f(j.b.ON_CREATE);
        z zVar = this.mFragments.f2274a.f2294x;
        zVar.G = false;
        zVar.H = false;
        zVar.N.C = false;
        zVar.u(1);
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory2
    public View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        View dispatchFragmentsOnCreateView = dispatchFragmentsOnCreateView(view, str, context, attributeSet);
        return dispatchFragmentsOnCreateView == null ? super.onCreateView(view, str, context, attributeSet) : dispatchFragmentsOnCreateView;
    }

    @Override // android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        this.mFragments.f2274a.f2294x.l();
        this.mFragmentLifecycleRegistry.f(j.b.ON_DESTROY);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int i6, MenuItem menuItem) {
        if (super.onMenuItemSelected(i6, menuItem)) {
            return true;
        }
        if (i6 == 6) {
            return this.mFragments.f2274a.f2294x.j(menuItem);
        }
        return false;
    }

    @Override // android.app.Activity
    public void onPause() {
        super.onPause();
        this.mResumed = false;
        this.mFragments.f2274a.f2294x.u(5);
        this.mFragmentLifecycleRegistry.f(j.b.ON_PAUSE);
    }

    @Override // android.app.Activity
    public void onPostResume() {
        super.onPostResume();
        onResumeFragments();
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onRequestPermissionsResult(int i6, String[] strArr, int[] iArr) {
        this.mFragments.a();
        super.onRequestPermissionsResult(i6, strArr, iArr);
    }

    @Override // android.app.Activity
    public void onResume() {
        this.mFragments.a();
        super.onResume();
        this.mResumed = true;
        this.mFragments.f2274a.f2294x.y(true);
    }

    public void onResumeFragments() {
        this.mFragmentLifecycleRegistry.f(j.b.ON_RESUME);
        z zVar = this.mFragments.f2274a.f2294x;
        zVar.G = false;
        zVar.H = false;
        zVar.N.C = false;
        zVar.u(7);
    }

    @Override // android.app.Activity
    public void onStart() {
        this.mFragments.a();
        super.onStart();
        this.mStopped = false;
        if (!this.mCreated) {
            this.mCreated = true;
            z zVar = this.mFragments.f2274a.f2294x;
            zVar.G = false;
            zVar.H = false;
            zVar.N.C = false;
            zVar.u(4);
        }
        this.mFragments.f2274a.f2294x.y(true);
        this.mFragmentLifecycleRegistry.f(j.b.ON_START);
        z zVar2 = this.mFragments.f2274a.f2294x;
        zVar2.G = false;
        zVar2.H = false;
        zVar2.N.C = false;
        zVar2.u(5);
    }

    @Override // android.app.Activity
    public void onStateNotSaved() {
        this.mFragments.a();
    }

    @Override // android.app.Activity
    public void onStop() {
        super.onStop();
        this.mStopped = true;
        markFragmentsCreated();
        z zVar = this.mFragments.f2274a.f2294x;
        zVar.H = true;
        zVar.N.C = true;
        zVar.u(4);
        this.mFragmentLifecycleRegistry.f(j.b.ON_STOP);
    }

    public void setEnterSharedElementCallback(f0.e0 e0Var) {
        int i6 = f0.a.f14598c;
        a.c.c(this, null);
    }

    public void setExitSharedElementCallback(f0.e0 e0Var) {
        int i6 = f0.a.f14598c;
        a.c.d(this, null);
    }

    public void startActivityFromFragment(Fragment fragment, Intent intent, int i6) {
        startActivityFromFragment(fragment, intent, i6, (Bundle) null);
    }

    @Deprecated
    public void startIntentSenderFromFragment(Fragment fragment, IntentSender intentSender, int i6, Intent intent, int i10, int i11, int i12, Bundle bundle) {
        if (i6 == -1) {
            int i13 = f0.a.f14598c;
            a.b.c(this, intentSender, i6, intent, i10, i11, i12, bundle);
            return;
        }
        fragment.startIntentSenderForResult(intentSender, i6, intent, i10, i11, i12, bundle);
    }

    public void supportFinishAfterTransition() {
        int i6 = f0.a.f14598c;
        a.c.a(this);
    }

    @Deprecated
    public void supportInvalidateOptionsMenu() {
        invalidateMenu();
    }

    public void supportPostponeEnterTransition() {
        int i6 = f0.a.f14598c;
        a.c.b(this);
    }

    public void supportStartPostponedEnterTransition() {
        int i6 = f0.a.f14598c;
        a.c.e(this);
    }

    public void startActivityFromFragment(Fragment fragment, Intent intent, int i6, Bundle bundle) {
        if (i6 == -1) {
            int i10 = f0.a.f14598c;
            a.b.b(this, intent, -1, bundle);
            return;
        }
        fragment.startActivityForResult(intent, i6, bundle);
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory
    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        View dispatchFragmentsOnCreateView = dispatchFragmentsOnCreateView(null, str, context, attributeSet);
        return dispatchFragmentsOnCreateView == null ? super.onCreateView(str, context, attributeSet) : dispatchFragmentsOnCreateView;
    }

    public p(int i6) {
        super(i6);
        this.mFragments = new s(new a());
        this.mFragmentLifecycleRegistry = new androidx.lifecycle.q(this);
        this.mStopped = true;
        init();
    }

    @Deprecated
    public void onAttachFragment(Fragment fragment) {
    }

    @Override // f0.a.g
    @Deprecated
    public final void validateRequestPermissionsRequestCode(int i6) {
    }
}
