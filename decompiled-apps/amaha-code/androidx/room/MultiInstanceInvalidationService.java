package androidx.room;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteCallbackList;
import android.os.RemoteException;
import android.util.Log;
import hs.k;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
import x1.f;
import x1.g;
/* compiled from: MultiInstanceInvalidationService.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/room/MultiInstanceInvalidationService;", "Landroid/app/Service;", "<init>", "()V", "room-runtime_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes.dex */
public final class MultiInstanceInvalidationService extends Service {

    /* renamed from: u  reason: collision with root package name */
    public int f3067u;

    /* renamed from: v  reason: collision with root package name */
    public final LinkedHashMap f3068v = new LinkedHashMap();

    /* renamed from: w  reason: collision with root package name */
    public final b f3069w = new b();

    /* renamed from: x  reason: collision with root package name */
    public final a f3070x = new a();

    /* compiled from: MultiInstanceInvalidationService.kt */
    /* loaded from: classes.dex */
    public static final class a extends g.a {
        public a() {
        }

        @Override // x1.g
        public final int N1(f callback, String str) {
            i.g(callback, "callback");
            int i6 = 0;
            if (str == null) {
                return 0;
            }
            MultiInstanceInvalidationService multiInstanceInvalidationService = MultiInstanceInvalidationService.this;
            synchronized (multiInstanceInvalidationService.f3069w) {
                int i10 = multiInstanceInvalidationService.f3067u + 1;
                multiInstanceInvalidationService.f3067u = i10;
                if (multiInstanceInvalidationService.f3069w.register(callback, Integer.valueOf(i10))) {
                    multiInstanceInvalidationService.f3068v.put(Integer.valueOf(i10), str);
                    i6 = i10;
                } else {
                    multiInstanceInvalidationService.f3067u--;
                }
            }
            return i6;
        }

        @Override // x1.g
        public final void o1(String[] tables, int i6) {
            i.g(tables, "tables");
            MultiInstanceInvalidationService multiInstanceInvalidationService = MultiInstanceInvalidationService.this;
            synchronized (multiInstanceInvalidationService.f3069w) {
                String str = (String) multiInstanceInvalidationService.f3068v.get(Integer.valueOf(i6));
                if (str == null) {
                    Log.w("ROOM", "Remote invalidation client ID not registered");
                    return;
                }
                int beginBroadcast = multiInstanceInvalidationService.f3069w.beginBroadcast();
                for (int i10 = 0; i10 < beginBroadcast; i10++) {
                    Object broadcastCookie = multiInstanceInvalidationService.f3069w.getBroadcastCookie(i10);
                    i.e(broadcastCookie, "null cannot be cast to non-null type kotlin.Int");
                    int intValue = ((Integer) broadcastCookie).intValue();
                    String str2 = (String) multiInstanceInvalidationService.f3068v.get(Integer.valueOf(intValue));
                    if (i6 != intValue && i.b(str, str2)) {
                        try {
                            multiInstanceInvalidationService.f3069w.getBroadcastItem(i10).c0(tables);
                        } catch (RemoteException e10) {
                            Log.w("ROOM", "Error invoking a remote callback", e10);
                        }
                    }
                }
                multiInstanceInvalidationService.f3069w.finishBroadcast();
                k kVar = k.f19476a;
            }
        }
    }

    /* compiled from: MultiInstanceInvalidationService.kt */
    /* loaded from: classes.dex */
    public static final class b extends RemoteCallbackList<f> {
        public b() {
        }

        @Override // android.os.RemoteCallbackList
        public final void onCallbackDied(f fVar, Object cookie) {
            f callback = fVar;
            i.g(callback, "callback");
            i.g(cookie, "cookie");
            MultiInstanceInvalidationService.this.f3068v.remove((Integer) cookie);
        }
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        i.g(intent, "intent");
        return this.f3070x;
    }
}
