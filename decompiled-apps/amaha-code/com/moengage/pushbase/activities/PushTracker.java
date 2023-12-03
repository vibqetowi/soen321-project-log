package com.moengage.pushbase.activities;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.annotation.Keep;
import androidx.fragment.app.p;
import com.moengage.core.exceptions.SdkNotInitializedException;
import fj.e;
import hh.a;
import hh.g;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
import yg.n;
/* compiled from: PushTracker.kt */
@Keep
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0014R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\u000b"}, d2 = {"Lcom/moengage/pushbase/activities/PushTracker;", "Landroidx/fragment/app/p;", "Landroid/os/Bundle;", "savedInstanceState", "Lhs/k;", "onCreate", "", "tag", "Ljava/lang/String;", "<init>", "()V", "pushbase_release"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes.dex */
public final class PushTracker extends p {
    private final String tag = "PushBase_6.6.0_PushTracker";

    @Override // androidx.fragment.app.p, androidx.activity.ComponentActivity, f0.k, android.app.Activity
    public void onCreate(Bundle bundle) {
        Intent intent;
        try {
            super.onCreate(bundle);
            a aVar = g.f17610d;
            g.a.b(0, new PushTracker$onCreate$1(this), 3);
            intent = getIntent();
        } catch (Exception e10) {
            a aVar2 = g.f17610d;
            g.a.a(1, e10, new PushTracker$onCreate$3(this));
        }
        if (intent != null) {
            Bundle extras = intent.getExtras();
            if (extras != null) {
                ca.a.Z0(extras);
                if (e.f15075b == null) {
                    synchronized (e.class) {
                        e eVar = e.f15075b;
                        if (eVar == null) {
                            eVar = new e();
                        }
                        e.f15075b = eVar;
                    }
                }
                ih.p c10 = e.c(extras);
                if (c10 != null) {
                    boolean containsKey = extras.containsKey("gcm_webUrl");
                    gj.g gVar = new gj.g(c10);
                    gVar.b(this);
                    Context applicationContext = getApplicationContext();
                    i.f(applicationContext, "applicationContext");
                    gVar.c(applicationContext, extras);
                    gVar.a(this, extras);
                    if (containsKey) {
                        Context applicationContext2 = getApplicationContext();
                        i.f(applicationContext2, "applicationContext");
                        n.b(applicationContext2, c10);
                    }
                    finish();
                    g.b(c10.f20105d, 0, new PushTracker$onCreate$2(this), 3);
                    finish();
                    return;
                }
                throw new SdkNotInitializedException("Instance not initialised.");
            }
            throw new IllegalStateException("Intent extras cannot be empty");
        }
        throw new IllegalStateException("Intent cannot be null");
    }
}
