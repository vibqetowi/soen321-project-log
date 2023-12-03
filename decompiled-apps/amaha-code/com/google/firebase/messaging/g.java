package com.google.firebase.messaging;

import android.app.ActivityManager;
import android.app.KeyguardManager;
import android.app.NotificationManager;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Process;
import android.text.TextUtils;
import android.util.Log;
import androidx.core.graphics.drawable.IconCompat;
import com.google.firebase.messaging.e;
import com.theinnerhour.b2b.utils.Constants;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
/* compiled from: DisplayNotification.java */
/* loaded from: classes.dex */
public final class g {

    /* renamed from: a  reason: collision with root package name */
    public final ExecutorService f9710a;

    /* renamed from: b  reason: collision with root package name */
    public final Context f9711b;

    /* renamed from: c  reason: collision with root package name */
    public final v f9712c;

    public g(Context context, v vVar, ExecutorService executorService) {
        this.f9710a = executorService;
        this.f9711b = context;
        this.f9712c = vVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00a5 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean a() {
        boolean z10;
        s sVar;
        IconCompat iconCompat;
        if (this.f9712c.a("gcm.n.noui")) {
            return true;
        }
        Context context = this.f9711b;
        if (!((KeyguardManager) context.getSystemService("keyguard")).inKeyguardRestrictedInputMode()) {
            int myPid = Process.myPid();
            List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) context.getSystemService(Constants.SCREEN_ACTIVITY)).getRunningAppProcesses();
            if (runningAppProcesses != null) {
                Iterator<ActivityManager.RunningAppProcessInfo> it = runningAppProcesses.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    ActivityManager.RunningAppProcessInfo next = it.next();
                    if (next.pid == myPid) {
                        if (next.importance == 100) {
                            z10 = true;
                        }
                    }
                }
            }
        }
        z10 = false;
        if (z10) {
            return false;
        }
        String e10 = this.f9712c.e("gcm.n.image");
        if (!TextUtils.isEmpty(e10)) {
            try {
                sVar = new s(new URL(e10));
            } catch (MalformedURLException unused) {
                Log.w("FirebaseMessaging", "Not downloading image, bad URL: " + e10);
            }
            if (sVar != null) {
                ExecutorService executorService = this.f9710a;
                ya.i iVar = new ya.i();
                sVar.f9777v = executorService.submit(new ne.u(sVar, 6, iVar));
                sVar.f9778w = iVar.f38392a;
            }
            e.a a10 = e.a(this.f9711b, this.f9712c);
            f0.t tVar = a10.f9699a;
            if (sVar != null) {
                try {
                    ya.v vVar = sVar.f9778w;
                    v9.o.h(vVar);
                    Bitmap bitmap = (Bitmap) ya.k.b(vVar, 5L, TimeUnit.SECONDS);
                    tVar.h(bitmap);
                    f0.p pVar = new f0.p();
                    if (bitmap == null) {
                        iconCompat = null;
                    } else {
                        iconCompat = new IconCompat(1);
                        iconCompat.f1960b = bitmap;
                    }
                    pVar.f14654e = iconCompat;
                    pVar.f = null;
                    pVar.f14655g = true;
                    tVar.j(pVar);
                } catch (InterruptedException unused2) {
                    Log.w("FirebaseMessaging", "Interrupted while downloading image, showing notification without it");
                    sVar.close();
                    Thread.currentThread().interrupt();
                } catch (ExecutionException e11) {
                    Log.w("FirebaseMessaging", "Failed to download image: " + e11.getCause());
                } catch (TimeoutException unused3) {
                    Log.w("FirebaseMessaging", "Failed to download image in time, showing notification without it");
                    sVar.close();
                }
            }
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Showing notification");
            }
            ((NotificationManager) this.f9711b.getSystemService("notification")).notify(a10.f9700b, 0, a10.f9699a.b());
            return true;
        }
        sVar = null;
        if (sVar != null) {
        }
        e.a a102 = e.a(this.f9711b, this.f9712c);
        f0.t tVar2 = a102.f9699a;
        if (sVar != null) {
        }
        if (Log.isLoggable("FirebaseMessaging", 3)) {
        }
        ((NotificationManager) this.f9711b.getSystemService("notification")).notify(a102.f9700b, 0, a102.f9699a.b());
        return true;
    }
}
