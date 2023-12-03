package com.facebook;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.p;
import androidx.fragment.app.y;
import b6.a;
import com.theinnerhour.b2b.R;
import g6.r;
import gv.n;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
import w5.e0;
import w5.h;
import w5.w;
/* compiled from: FacebookActivity.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/facebook/FacebookActivity;", "Landroidx/fragment/app/p;", "<init>", "()V", "facebook-common_release"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes.dex */
public class FacebookActivity extends p {

    /* renamed from: u  reason: collision with root package name */
    public Fragment f6105u;

    @Override // androidx.fragment.app.p, android.app.Activity
    public final void dump(String prefix, FileDescriptor fileDescriptor, PrintWriter writer, String[] strArr) {
        if (a.b(this)) {
            return;
        }
        try {
            i.g(prefix, "prefix");
            i.g(writer, "writer");
            int i6 = e6.a.f13809a;
            if (i.b(null, Boolean.TRUE)) {
                return;
            }
            super.dump(prefix, fileDescriptor, writer, strArr);
        } catch (Throwable th2) {
            a.a(this, th2);
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration newConfig) {
        i.g(newConfig, "newConfig");
        super.onConfigurationChanged(newConfig);
        Fragment fragment = this.f6105u;
        if (fragment != null) {
            fragment.onConfigurationChanged(newConfig);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v9, types: [androidx.fragment.app.n, androidx.fragment.app.Fragment, w5.h] */
    @Override // androidx.fragment.app.p, androidx.activity.ComponentActivity, f0.k, android.app.Activity
    public final void onCreate(Bundle bundle) {
        r rVar;
        FacebookException facebookException;
        super.onCreate(bundle);
        Intent intent = getIntent();
        if (!h5.p.h()) {
            e0 e0Var = e0.f36453a;
            Context applicationContext = getApplicationContext();
            i.f(applicationContext, "applicationContext");
            synchronized (h5.p.class) {
                h5.p.l(applicationContext);
            }
        }
        setContentView(R.layout.com_facebook_activity_layout);
        if (i.b("PassThrough", intent.getAction())) {
            Intent requestIntent = getIntent();
            w wVar = w.f36549a;
            i.f(requestIntent, "requestIntent");
            Bundle h10 = w.h(requestIntent);
            if (!a.b(w.class) && h10 != null) {
                try {
                    String string = h10.getString("error_type");
                    if (string == null) {
                        string = h10.getString("com.facebook.platform.status.ERROR_TYPE");
                    }
                    String string2 = h10.getString("error_description");
                    if (string2 == null) {
                        string2 = h10.getString("com.facebook.platform.status.ERROR_DESCRIPTION");
                    }
                    if (string != null && n.A0(string, "UserCanceled", true)) {
                        facebookException = new FacebookOperationCanceledException(string2);
                    } else {
                        facebookException = new FacebookException(string2);
                    }
                } catch (Throwable th2) {
                    a.a(w.class, th2);
                }
                w wVar2 = w.f36549a;
                Intent intent2 = getIntent();
                i.f(intent2, "intent");
                setResult(0, w.e(intent2, null, facebookException));
                finish();
                return;
            }
            facebookException = null;
            w wVar22 = w.f36549a;
            Intent intent22 = getIntent();
            i.f(intent22, "intent");
            setResult(0, w.e(intent22, null, facebookException));
            finish();
            return;
        }
        Intent intent3 = getIntent();
        y supportFragmentManager = getSupportFragmentManager();
        i.f(supportFragmentManager, "supportFragmentManager");
        Fragment F = supportFragmentManager.F("SingleFragment");
        if (F == null) {
            if (i.b("FacebookDialogFragment", intent3.getAction())) {
                ?? hVar = new h();
                hVar.setRetainInstance(true);
                hVar.show(supportFragmentManager, "SingleFragment");
                rVar = hVar;
            } else {
                r rVar2 = new r();
                rVar2.setRetainInstance(true);
                androidx.fragment.app.a aVar = new androidx.fragment.app.a(supportFragmentManager);
                aVar.e(R.id.com_facebook_fragment_container, rVar2, "SingleFragment", 1);
                aVar.j();
                rVar = rVar2;
            }
            F = rVar;
        }
        this.f6105u = F;
    }
}
