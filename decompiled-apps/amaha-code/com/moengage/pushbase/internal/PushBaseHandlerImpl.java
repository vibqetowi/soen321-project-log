package com.moengage.pushbase.internal;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import androidx.annotation.Keep;
import com.moengage.core.internal.push.base.PushBaseHandler;
import com.moengage.pushbase.internal.activity.PermissionActivity;
import di.b;
import fj.d;
import fj.e;
import fj.h;
import fj.j;
import fj.k;
import hh.a;
import hh.g;
import ih.p;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
import nj.c;
import qg.g0;
/* compiled from: PushBaseHandlerImpl.kt */
@Keep
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0017J\u0018\u0010\t\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J$\u0010\r\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b0\nH\u0016J\u0010\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0011"}, d2 = {"Lcom/moengage/pushbase/internal/PushBaseHandlerImpl;", "Lcom/moengage/core/internal/push/base/PushBaseHandler;", "Landroid/content/Context;", "context", "Lhs/k;", "onAppOpen", "Lih/p;", "sdkInstance", "onLogout", "updateNotificationPermission", "", "", "payload", "requestPushPermission", "navigateToSettings", "<init>", "()V", "pushbase_release"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes.dex */
public final class PushBaseHandlerImpl implements PushBaseHandler {
    @Override // com.moengage.core.internal.push.base.PushBaseHandler
    public void navigateToSettings(Context context) {
        Intent intent;
        e eVar;
        i.g(context, "context");
        e eVar2 = e.f15075b;
        if (eVar2 == null) {
            synchronized (e.class) {
                eVar = e.f15075b;
                if (eVar == null) {
                    eVar = new e();
                }
                e.f15075b = eVar;
            }
            eVar2 = eVar;
        }
        try {
            if (Build.VERSION.SDK_INT >= 26) {
                intent = new Intent("android.settings.APP_NOTIFICATION_SETTINGS");
                intent.putExtra("android.provider.extra.APP_PACKAGE", context.getPackageName());
            } else {
                intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                intent.setData(Uri.fromParts("package", context.getPackageName(), ""));
            }
            if (!(context instanceof Activity)) {
                intent.addFlags(268435456);
            }
            context.startActivity(intent);
        } catch (Throwable th2) {
            a aVar = g.f17610d;
            g.a.a(1, th2, new fj.g(eVar2));
        }
    }

    @Override // com.moengage.core.internal.push.base.PushBaseHandler
    public void onAppOpen(Context context) {
        e eVar;
        i.g(context, "context");
        e eVar2 = e.f15075b;
        if (eVar2 == null) {
            synchronized (e.class) {
                eVar = e.f15075b;
                if (eVar == null) {
                    eVar = new e();
                }
                e.f15075b = eVar;
            }
            eVar2 = eVar;
        }
        try {
            if (Build.VERSION.SDK_INT < 33) {
                eVar2.b(context);
            } else if (b.q(context)) {
                eVar2.b(context);
            }
        } catch (Throwable th2) {
            a aVar = g.f17610d;
            g.a.a(1, th2, new j(eVar2));
        }
    }

    @Override // com.moengage.core.internal.push.base.PushBaseHandler
    public void onLogout(Context context, p sdkInstance) {
        i.g(context, "context");
        i.g(sdkInstance, "sdkInstance");
        nj.a aVar = c.f26377a;
        nj.a aVar2 = c.f26377a;
        if (aVar2 != null) {
            aVar2.onLogout(context, sdkInstance);
        }
    }

    @Override // com.moengage.core.internal.push.base.PushBaseHandler
    public void requestPushPermission(Context context, Map<String, String> payload) {
        e eVar;
        i.g(context, "context");
        i.g(payload, "payload");
        e eVar2 = e.f15075b;
        if (eVar2 == null) {
            synchronized (e.class) {
                eVar = e.f15075b;
                if (eVar == null) {
                    eVar = new e();
                }
                e.f15075b = eVar;
            }
            eVar2 = eVar;
        }
        if (Build.VERSION.SDK_INT >= 33) {
            if (b.q(context)) {
                a aVar = g.f17610d;
                g.a.b(0, new h(eVar2), 3);
                return;
            }
            Intent intent = new Intent(context, PermissionActivity.class);
            for (Map.Entry<String, String> entry : payload.entrySet()) {
                intent.putExtra(entry.getKey(), entry.getValue());
            }
            if (!(context instanceof Activity)) {
                intent.addFlags(268435456);
            }
            context.startActivity(intent);
            try {
                for (p pVar : g0.f29557b.values()) {
                    d.f15071a.getClass();
                    d.b(context, pVar).n();
                }
                return;
            } catch (Throwable th2) {
                a aVar2 = g.f17610d;
                g.a.a(1, th2, new k(eVar2));
                return;
            }
        }
        a aVar3 = g.f17610d;
        g.a.b(0, new fj.i(eVar2), 3);
    }

    @Override // com.moengage.core.internal.push.base.PushBaseHandler
    public void updateNotificationPermission(Context context, p sdkInstance) {
        i.g(context, "context");
        i.g(sdkInstance, "sdkInstance");
        new kj.a(sdkInstance).a(context);
    }
}
