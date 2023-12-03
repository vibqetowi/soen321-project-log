package r9;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import c4.u;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import ya.v;
/* compiled from: com.google.android.gms:play-services-cloud-messaging@@17.0.0 */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: h  reason: collision with root package name */
    public static int f30607h;

    /* renamed from: i  reason: collision with root package name */
    public static PendingIntent f30608i;

    /* renamed from: j  reason: collision with root package name */
    public static final Pattern f30609j = Pattern.compile("\\|ID\\|([^|]+)\\|:?+(.*)");

    /* renamed from: b  reason: collision with root package name */
    public final Context f30611b;

    /* renamed from: c  reason: collision with root package name */
    public final p f30612c;

    /* renamed from: d  reason: collision with root package name */
    public final ScheduledThreadPoolExecutor f30613d;
    public Messenger f;

    /* renamed from: g  reason: collision with root package name */
    public h f30615g;

    /* renamed from: a  reason: collision with root package name */
    public final t.h<String, ya.i<Bundle>> f30610a = new t.h<>();

    /* renamed from: e  reason: collision with root package name */
    public final Messenger f30614e = new Messenger(new e(this, Looper.getMainLooper()));

    public c(Context context) {
        this.f30611b = context;
        this.f30612c = new p(context);
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1);
        scheduledThreadPoolExecutor.setKeepAliveTime(60L, TimeUnit.SECONDS);
        scheduledThreadPoolExecutor.allowCoreThreadTimeOut(true);
        this.f30613d = scheduledThreadPoolExecutor;
    }

    public static synchronized String b() {
        String num;
        synchronized (c.class) {
            int i6 = f30607h;
            f30607h = i6 + 1;
            num = Integer.toString(i6);
        }
        return num;
    }

    public static synchronized void c(Context context, Intent intent) {
        synchronized (c.class) {
            if (f30608i == null) {
                Intent intent2 = new Intent();
                intent2.setPackage("com.google.example.invalidpackage");
                f30608i = PendingIntent.getBroadcast(context, 0, intent2, la.a.f24197a);
            }
            intent.putExtra("app", f30608i);
        }
    }

    public final v a(Bundle bundle) {
        final String b10 = b();
        ya.i<Bundle> iVar = new ya.i<>();
        synchronized (this.f30610a) {
            this.f30610a.put(b10, iVar);
        }
        Intent intent = new Intent();
        intent.setPackage("com.google.android.gms");
        if (this.f30612c.a() == 2) {
            intent.setAction("com.google.iid.TOKEN_REQUEST");
        } else {
            intent.setAction("com.google.android.c2dm.intent.REGISTER");
        }
        intent.putExtras(bundle);
        c(this.f30611b, intent);
        StringBuilder sb2 = new StringBuilder(String.valueOf(b10).length() + 5);
        sb2.append("|ID|");
        sb2.append(b10);
        sb2.append("|");
        intent.putExtra("kid", sb2.toString());
        if (Log.isLoggable("Rpc", 3)) {
            String valueOf = String.valueOf(intent.getExtras());
            StringBuilder sb3 = new StringBuilder(valueOf.length() + 8);
            sb3.append("Sending ");
            sb3.append(valueOf);
            Log.d("Rpc", sb3.toString());
        }
        intent.putExtra("google.messenger", this.f30614e);
        if (this.f != null || this.f30615g != null) {
            Message obtain = Message.obtain();
            obtain.obj = intent;
            try {
                Messenger messenger = this.f;
                if (messenger != null) {
                    messenger.send(obtain);
                } else {
                    Messenger messenger2 = this.f30615g.f30617u;
                    messenger2.getClass();
                    messenger2.send(obtain);
                }
            } catch (RemoteException unused) {
                if (Log.isLoggable("Rpc", 3)) {
                    Log.d("Rpc", "Messenger failed, fallback to startService");
                }
            }
            final ScheduledFuture<?> schedule = this.f30613d.schedule(new u(7, iVar), 30L, TimeUnit.SECONDS);
            iVar.f38392a.addOnCompleteListener(r.f30649u, new ya.d() { // from class: r9.q
                @Override // ya.d
                public final void a(ya.h hVar) {
                    c cVar = c.this;
                    String str = b10;
                    ScheduledFuture scheduledFuture = schedule;
                    synchronized (cVar.f30610a) {
                        cVar.f30610a.remove(str);
                    }
                    scheduledFuture.cancel(false);
                }
            });
            return iVar.f38392a;
        }
        if (this.f30612c.a() == 2) {
            this.f30611b.sendBroadcast(intent);
        } else {
            this.f30611b.startService(intent);
        }
        final ScheduledFuture schedule2 = this.f30613d.schedule(new u(7, iVar), 30L, TimeUnit.SECONDS);
        iVar.f38392a.addOnCompleteListener(r.f30649u, new ya.d() { // from class: r9.q
            @Override // ya.d
            public final void a(ya.h hVar) {
                c cVar = c.this;
                String str = b10;
                ScheduledFuture scheduledFuture = schedule2;
                synchronized (cVar.f30610a) {
                    cVar.f30610a.remove(str);
                }
                scheduledFuture.cancel(false);
            }
        });
        return iVar.f38392a;
    }

    public final void d(Bundle bundle, String str) {
        String str2;
        synchronized (this.f30610a) {
            ya.i<Bundle> remove = this.f30610a.remove(str);
            if (remove == null) {
                String valueOf = String.valueOf(str);
                if (valueOf.length() != 0) {
                    str2 = "Missing callback for ".concat(valueOf);
                } else {
                    str2 = new String("Missing callback for ");
                }
                Log.w("Rpc", str2);
                return;
            }
            remove.b(bundle);
        }
    }
}
