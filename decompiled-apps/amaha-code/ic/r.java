package ic;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IInterface;
import android.os.RemoteException;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicInteger;
/* compiled from: com.google.android.play:app-update@@2.0.1 */
/* loaded from: classes.dex */
public final class r {

    /* renamed from: n  reason: collision with root package name */
    public static final HashMap f19943n = new HashMap();

    /* renamed from: a  reason: collision with root package name */
    public final Context f19944a;

    /* renamed from: b  reason: collision with root package name */
    public final k f19945b;

    /* renamed from: g  reason: collision with root package name */
    public boolean f19949g;

    /* renamed from: h  reason: collision with root package name */
    public final Intent f19950h;

    /* renamed from: l  reason: collision with root package name */
    public q f19954l;

    /* renamed from: m  reason: collision with root package name */
    public IInterface f19955m;

    /* renamed from: d  reason: collision with root package name */
    public final ArrayList f19947d = new ArrayList();

    /* renamed from: e  reason: collision with root package name */
    public final HashSet f19948e = new HashSet();
    public final Object f = new Object();

    /* renamed from: j  reason: collision with root package name */
    public final m f19952j = new m(0, this);

    /* renamed from: k  reason: collision with root package name */
    public final AtomicInteger f19953k = new AtomicInteger(0);

    /* renamed from: c  reason: collision with root package name */
    public final String f19946c = "AppUpdateService";

    /* renamed from: i  reason: collision with root package name */
    public final WeakReference f19951i = new WeakReference(null);

    public r(Context context, k kVar, Intent intent) {
        this.f19944a = context;
        this.f19945b = kVar;
        this.f19950h = intent;
    }

    public final Handler a() {
        Handler handler;
        HashMap hashMap = f19943n;
        synchronized (hashMap) {
            if (!hashMap.containsKey(this.f19946c)) {
                HandlerThread handlerThread = new HandlerThread(this.f19946c, 10);
                handlerThread.start();
                hashMap.put(this.f19946c, new Handler(handlerThread.getLooper()));
            }
            handler = (Handler) hashMap.get(this.f19946c);
        }
        return handler;
    }

    public final void b(ya.i iVar) {
        synchronized (this.f) {
            this.f19948e.remove(iVar);
        }
        synchronized (this.f) {
            if (this.f19953k.get() > 0 && this.f19953k.decrementAndGet() > 0) {
                this.f19945b.a("Leaving the connection open for other ongoing calls.", new Object[0]);
                return;
            }
            a().post(new o(0, this));
        }
    }

    public final void c() {
        synchronized (this.f) {
            Iterator it = this.f19948e.iterator();
            while (it.hasNext()) {
                ((ya.i) it.next()).c(new RemoteException(String.valueOf(this.f19946c).concat(" : Binder has died.")));
            }
            this.f19948e.clear();
        }
    }
}
