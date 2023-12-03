package mc;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IInterface;
import android.os.RemoteException;
import ic.q;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicInteger;
/* compiled from: com.google.android.play:integrity@@1.0.1 */
/* loaded from: classes.dex */
public final class l {

    /* renamed from: n  reason: collision with root package name */
    public static final HashMap f25022n = new HashMap();

    /* renamed from: a  reason: collision with root package name */
    public final Context f25023a;

    /* renamed from: b  reason: collision with root package name */
    public final g f25024b;

    /* renamed from: g  reason: collision with root package name */
    public boolean f25028g;

    /* renamed from: h  reason: collision with root package name */
    public final Intent f25029h;

    /* renamed from: l  reason: collision with root package name */
    public q f25033l;

    /* renamed from: m  reason: collision with root package name */
    public IInterface f25034m;

    /* renamed from: d  reason: collision with root package name */
    public final ArrayList f25026d = new ArrayList();

    /* renamed from: e  reason: collision with root package name */
    public final HashSet f25027e = new HashSet();
    public final Object f = new Object();

    /* renamed from: j  reason: collision with root package name */
    public final ic.m f25031j = new ic.m(1, this);

    /* renamed from: k  reason: collision with root package name */
    public final AtomicInteger f25032k = new AtomicInteger(0);

    /* renamed from: c  reason: collision with root package name */
    public final String f25025c = "IntegrityService";

    /* renamed from: i  reason: collision with root package name */
    public final WeakReference f25030i = new WeakReference(null);

    public l(Context context, g gVar, Intent intent) {
        this.f25023a = context;
        this.f25024b = gVar;
        this.f25029h = intent;
    }

    public final Handler a() {
        Handler handler;
        HashMap hashMap = f25022n;
        synchronized (hashMap) {
            if (!hashMap.containsKey(this.f25025c)) {
                HandlerThread handlerThread = new HandlerThread(this.f25025c, 10);
                handlerThread.start();
                hashMap.put(this.f25025c, new Handler(handlerThread.getLooper()));
            }
            handler = (Handler) hashMap.get(this.f25025c);
        }
        return handler;
    }

    public final void b() {
        synchronized (this.f) {
            Iterator it = this.f25027e.iterator();
            while (it.hasNext()) {
                ((ya.i) it.next()).c(new RemoteException(String.valueOf(this.f25025c).concat(" : Binder has died.")));
            }
            this.f25027e.clear();
        }
    }
}
