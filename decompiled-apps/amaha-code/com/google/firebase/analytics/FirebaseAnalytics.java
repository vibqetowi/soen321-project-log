package com.google.firebase.analytics;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import androidx.annotation.Keep;
import com.google.android.gms.internal.measurement.j1;
import com.google.android.gms.internal.measurement.w0;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import sc.e;
import se.c;
import se.d;
import ta.u4;
import v9.o;
import vc.a;
import ya.k;
/* compiled from: com.google.android.gms:play-services-measurement-api@@21.2.0 */
/* loaded from: classes.dex */
public final class FirebaseAnalytics {

    /* renamed from: b  reason: collision with root package name */
    public static volatile FirebaseAnalytics f9534b;

    /* renamed from: a  reason: collision with root package name */
    public final j1 f9535a;

    public FirebaseAnalytics(j1 j1Var) {
        o.h(j1Var);
        this.f9535a = j1Var;
    }

    @Keep
    public static FirebaseAnalytics getInstance(Context context) {
        if (f9534b == null) {
            synchronized (FirebaseAnalytics.class) {
                if (f9534b == null) {
                    f9534b = new FirebaseAnalytics(j1.d(context, null));
                }
            }
        }
        return f9534b;
    }

    @Keep
    public static u4 getScionFrontendApiImplementation(Context context, Bundle bundle) {
        j1 d10 = j1.d(context, bundle);
        if (d10 == null) {
            return null;
        }
        return new a(d10);
    }

    @Keep
    public String getFirebaseInstanceId() {
        try {
            Object obj = c.f31470m;
            return (String) k.b(((c) e.e().c(d.class)).getId(), 30000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e10) {
            throw new IllegalStateException(e10);
        } catch (ExecutionException e11) {
            throw new IllegalStateException(e11.getCause());
        } catch (TimeoutException unused) {
            throw new IllegalThreadStateException("Firebase Installations getId Task has timed out.");
        }
    }

    @Keep
    @Deprecated
    public void setCurrentScreen(Activity activity, String str, String str2) {
        j1 j1Var = this.f9535a;
        j1Var.getClass();
        j1Var.b(new w0(j1Var, activity, str, str2));
    }
}
