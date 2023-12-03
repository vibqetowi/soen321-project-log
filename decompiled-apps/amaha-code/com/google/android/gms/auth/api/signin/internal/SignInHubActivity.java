package com.google.android.gms.auth.api.signin.internal;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.util.Log;
import android.view.accessibility.AccessibilityEvent;
import androidx.fragment.app.p;
import androidx.lifecycle.x;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.SignInAccount;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.c;
import j9.f;
import j9.m;
import j9.s;
import java.lang.reflect.Modifier;
import l1.a;
import l1.b;
import t.i;
/* compiled from: com.google.android.gms:play-services-auth@@20.4.1 */
@KeepName
/* loaded from: classes.dex */
public class SignInHubActivity extends p {

    /* renamed from: z  reason: collision with root package name */
    public static boolean f7241z = false;

    /* renamed from: u  reason: collision with root package name */
    public boolean f7242u = false;

    /* renamed from: v  reason: collision with root package name */
    public SignInConfiguration f7243v;

    /* renamed from: w  reason: collision with root package name */
    public boolean f7244w;

    /* renamed from: x  reason: collision with root package name */
    public int f7245x;

    /* renamed from: y  reason: collision with root package name */
    public Intent f7246y;

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return true;
    }

    public final void k0() {
        a supportLoaderManager = getSupportLoaderManager();
        s sVar = new s(this);
        b bVar = (b) supportLoaderManager;
        b.c cVar = bVar.f23992b;
        if (!cVar.f24003y) {
            if (Looper.getMainLooper() == Looper.myLooper()) {
                i<b.a> iVar = cVar.f24002x;
                b.a aVar = (b.a) iVar.d(0, null);
                androidx.lifecycle.p pVar = bVar.f23991a;
                if (aVar == null) {
                    try {
                        cVar.f24003y = true;
                        f fVar = new f(this, c.a());
                        if (f.class.isMemberClass() && !Modifier.isStatic(f.class.getModifiers())) {
                            throw new IllegalArgumentException("Object returned from onCreateLoader must not be a non-static inner member class: " + fVar);
                        }
                        b.a aVar2 = new b.a(fVar);
                        iVar.e(0, aVar2);
                        cVar.f24003y = false;
                        b.C0374b<D> c0374b = new b.C0374b<>(aVar2.f23995n, sVar);
                        aVar2.e(pVar, c0374b);
                        x xVar = aVar2.f23997p;
                        if (xVar != null) {
                            aVar2.j(xVar);
                        }
                        aVar2.f23996o = pVar;
                        aVar2.f23997p = c0374b;
                    } catch (Throwable th2) {
                        cVar.f24003y = false;
                        throw th2;
                    }
                } else {
                    b.C0374b<D> c0374b2 = new b.C0374b<>(aVar.f23995n, sVar);
                    aVar.e(pVar, c0374b2);
                    x xVar2 = aVar.f23997p;
                    if (xVar2 != null) {
                        aVar.j(xVar2);
                    }
                    aVar.f23996o = pVar;
                    aVar.f23997p = c0374b2;
                }
                f7241z = false;
                return;
            }
            throw new IllegalStateException("initLoader must be called on the main thread");
        }
        throw new IllegalStateException("Called while creating a loader");
    }

    public final void l0(int i6) {
        Status status = new Status(i6, null);
        Intent intent = new Intent();
        intent.putExtra("googleSignInStatus", status);
        setResult(0, intent);
        finish();
        f7241z = false;
    }

    @Override // androidx.fragment.app.p, androidx.activity.ComponentActivity, android.app.Activity
    public final void onActivityResult(int i6, int i10, Intent intent) {
        GoogleSignInAccount googleSignInAccount;
        if (this.f7242u) {
            return;
        }
        setResult(0);
        if (i6 != 40962) {
            return;
        }
        if (intent != null) {
            SignInAccount signInAccount = (SignInAccount) intent.getParcelableExtra("signInAccount");
            if (signInAccount != null && (googleSignInAccount = signInAccount.f7237v) != null) {
                m a10 = m.a(this);
                GoogleSignInOptions googleSignInOptions = this.f7243v.f7240v;
                googleSignInAccount.getClass();
                synchronized (a10) {
                    a10.f21766a.d(googleSignInAccount, googleSignInOptions);
                }
                intent.removeExtra("signInAccount");
                intent.putExtra("googleSignInAccount", googleSignInAccount);
                this.f7244w = true;
                this.f7245x = i10;
                this.f7246y = intent;
                k0();
                return;
            } else if (intent.hasExtra("errorCode")) {
                int intExtra = intent.getIntExtra("errorCode", 8);
                if (intExtra == 13) {
                    intExtra = 12501;
                }
                l0(intExtra);
                return;
            }
        }
        l0(8);
    }

    @Override // androidx.fragment.app.p, androidx.activity.ComponentActivity, f0.k, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Intent intent = getIntent();
        String action = intent.getAction();
        action.getClass();
        if ("com.google.android.gms.auth.NO_IMPL".equals(action)) {
            l0(12500);
        } else if (!action.equals("com.google.android.gms.auth.GOOGLE_SIGN_IN") && !action.equals("com.google.android.gms.auth.APPAUTH_SIGN_IN")) {
            Log.e("AuthSignInClient", "Unknown action: ".concat(String.valueOf(intent.getAction())));
            finish();
        } else {
            Bundle bundleExtra = intent.getBundleExtra("config");
            bundleExtra.getClass();
            SignInConfiguration signInConfiguration = (SignInConfiguration) bundleExtra.getParcelable("config");
            if (signInConfiguration == null) {
                Log.e("AuthSignInClient", "Activity started with invalid configuration.");
                setResult(0);
                finish();
                return;
            }
            this.f7243v = signInConfiguration;
            if (bundle == null) {
                if (f7241z) {
                    setResult(0);
                    l0(12502);
                    return;
                }
                f7241z = true;
                Intent intent2 = new Intent(action);
                if (action.equals("com.google.android.gms.auth.GOOGLE_SIGN_IN")) {
                    intent2.setPackage("com.google.android.gms");
                } else {
                    intent2.setPackage(getPackageName());
                }
                intent2.putExtra("config", this.f7243v);
                try {
                    startActivityForResult(intent2, 40962);
                    return;
                } catch (ActivityNotFoundException unused) {
                    this.f7242u = true;
                    Log.w("AuthSignInClient", "Could not launch sign in Intent. Google Play Service is probably being updated...");
                    l0(17);
                    return;
                }
            }
            boolean z10 = bundle.getBoolean("signingInGoogleApiClients");
            this.f7244w = z10;
            if (z10) {
                this.f7245x = bundle.getInt("signInResultCode");
                Intent intent3 = (Intent) bundle.getParcelable("signInResultData");
                intent3.getClass();
                this.f7246y = intent3;
                k0();
            }
        }
    }

    @Override // androidx.fragment.app.p, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        f7241z = false;
    }

    @Override // androidx.activity.ComponentActivity, f0.k, android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("signingInGoogleApiClients", this.f7244w);
        if (this.f7244w) {
            bundle.putInt("signInResultCode", this.f7245x);
            bundle.putParcelable("signInResultData", this.f7246y);
        }
    }
}
