package r1;

import android.content.Context;
import android.media.MediaRoute2Info;
import android.media.MediaRouter2;
import android.media.RouteDiscoveryPreference;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.ArrayMap;
import android.util.Log;
import android.util.SparseArray;
import com.theinnerhour.b2b.R;
import j$.util.Collection$EL;
import j$.util.stream.Collectors;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import r1.e;
import r1.g;
import r1.k;
import r1.l;
/* compiled from: MediaRoute2Provider.java */
/* loaded from: classes.dex */
public final class d extends g {
    public static final /* synthetic */ int L = 0;
    public final MediaRouter2 C;
    public final a D;
    public final ArrayMap E;
    public final e F;
    public final f G;
    public final b H;
    public final r1.a I;
    public List<MediaRoute2Info> J;
    public final ArrayMap K;

    /* compiled from: MediaRoute2Provider.java */
    /* loaded from: classes.dex */
    public static abstract class a {
    }

    /* compiled from: MediaRoute2Provider.java */
    /* loaded from: classes.dex */
    public class b extends MediaRouter2.ControllerCallback {
        public b() {
        }

        @Override // android.media.MediaRouter2.ControllerCallback
        public final void onControllerUpdated(MediaRouter2.RoutingController routingController) {
            d.this.t(routingController);
        }
    }

    /* compiled from: MediaRoute2Provider.java */
    /* loaded from: classes.dex */
    public class c extends g.b {
        public final String f;

        /* renamed from: g  reason: collision with root package name */
        public final MediaRouter2.RoutingController f30225g;

        /* renamed from: h  reason: collision with root package name */
        public final Messenger f30226h;

        /* renamed from: i  reason: collision with root package name */
        public final Messenger f30227i;

        /* renamed from: k  reason: collision with root package name */
        public final Handler f30229k;

        /* renamed from: j  reason: collision with root package name */
        public final SparseArray<l.c> f30228j = new SparseArray<>();

        /* renamed from: l  reason: collision with root package name */
        public final AtomicInteger f30230l = new AtomicInteger(1);

        /* renamed from: m  reason: collision with root package name */
        public final androidx.activity.b f30231m = new androidx.activity.b(4, this);

        /* renamed from: n  reason: collision with root package name */
        public int f30232n = -1;

        /* compiled from: MediaRoute2Provider.java */
        /* loaded from: classes.dex */
        public class a extends Handler {
            public a() {
                super(Looper.getMainLooper());
            }

            @Override // android.os.Handler
            public final void handleMessage(Message message) {
                String string;
                int i6 = message.what;
                int i10 = message.arg1;
                Object obj = message.obj;
                Bundle peekData = message.peekData();
                c cVar = c.this;
                l.c cVar2 = cVar.f30228j.get(i10);
                if (cVar2 == null) {
                    Log.w("MR2Provider", "Pending callback not found for control request.");
                    return;
                }
                cVar.f30228j.remove(i10);
                if (i6 != 3) {
                    if (i6 == 4) {
                        if (peekData == null) {
                            string = null;
                        } else {
                            string = peekData.getString("error");
                        }
                        cVar2.a(string, (Bundle) obj);
                        return;
                    }
                    return;
                }
                cVar2.b((Bundle) obj);
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:5:0x0029, code lost:
            r3 = r3.getControlHints();
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public c(MediaRouter2.RoutingController routingController, String str) {
            Messenger messenger;
            Bundle controlHints;
            this.f30225g = routingController;
            this.f = str;
            int i6 = d.L;
            if (routingController == null || controlHints == null) {
                messenger = null;
            } else {
                messenger = (Messenger) controlHints.getParcelable("androidx.mediarouter.media.KEY_MESSENGER");
            }
            this.f30226h = messenger;
            this.f30227i = messenger != null ? new Messenger(new a()) : null;
            this.f30229k = new Handler(Looper.getMainLooper());
        }

        @Override // r1.g.e
        public final void d() {
            this.f30225g.release();
        }

        @Override // r1.g.e
        public final void f(int i6) {
            MediaRouter2.RoutingController routingController = this.f30225g;
            if (routingController != null) {
                routingController.setVolume(i6);
                this.f30232n = i6;
                Handler handler = this.f30229k;
                androidx.activity.b bVar = this.f30231m;
                handler.removeCallbacks(bVar);
                handler.postDelayed(bVar, 1000L);
            }
        }

        @Override // r1.g.e
        public final void i(int i6) {
            int volumeMax;
            MediaRouter2.RoutingController routingController = this.f30225g;
            if (routingController == null) {
                return;
            }
            int i10 = this.f30232n;
            if (i10 < 0) {
                i10 = routingController.getVolume();
            }
            int i11 = i10 + i6;
            volumeMax = routingController.getVolumeMax();
            int max = Math.max(0, Math.min(i11, volumeMax));
            this.f30232n = max;
            routingController.setVolume(max);
            Handler handler = this.f30229k;
            androidx.activity.b bVar = this.f30231m;
            handler.removeCallbacks(bVar);
            handler.postDelayed(bVar, 1000L);
        }

        @Override // r1.g.b
        public final void m(String str) {
            if (str != null && !str.isEmpty()) {
                MediaRoute2Info r = d.this.r(str);
                if (r != null) {
                    this.f30225g.selectRoute(r);
                    return;
                } else {
                    Log.w("MR2Provider", "onAddMemberRoute: Specified route not found. routeId=".concat(str));
                    return;
                }
            }
            Log.w("MR2Provider", "onAddMemberRoute: Ignoring null or empty routeId.");
        }

        @Override // r1.g.b
        public final void n(String str) {
            if (str != null && !str.isEmpty()) {
                MediaRoute2Info r = d.this.r(str);
                if (r != null) {
                    this.f30225g.deselectRoute(r);
                    return;
                } else {
                    Log.w("MR2Provider", "onRemoveMemberRoute: Specified route not found. routeId=".concat(str));
                    return;
                }
            }
            Log.w("MR2Provider", "onRemoveMemberRoute: Ignoring null or empty routeId.");
        }

        @Override // r1.g.b
        public final void o(List<String> list) {
            if (list != null && !list.isEmpty()) {
                String str = list.get(0);
                d dVar = d.this;
                MediaRoute2Info r = dVar.r(str);
                if (r != null) {
                    dVar.C.transferTo(r);
                    return;
                }
                Log.w("MR2Provider", "onUpdateMemberRoutes: Specified route not found. routeId=" + str);
                return;
            }
            Log.w("MR2Provider", "onUpdateMemberRoutes: Ignoring null or empty routeIds.");
        }
    }

    /* compiled from: MediaRoute2Provider.java */
    /* renamed from: r1.d$d  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class C0513d extends g.e {

        /* renamed from: a  reason: collision with root package name */
        public final String f30235a;

        /* renamed from: b  reason: collision with root package name */
        public final c f30236b;

        public C0513d(String str, c cVar) {
            this.f30235a = str;
            this.f30236b = cVar;
        }

        @Override // r1.g.e
        public final void f(int i6) {
            c cVar;
            String str = this.f30235a;
            if (str != null && (cVar = this.f30236b) != null) {
                int andIncrement = cVar.f30230l.getAndIncrement();
                Message obtain = Message.obtain();
                obtain.what = 7;
                obtain.arg1 = andIncrement;
                Bundle bundle = new Bundle();
                bundle.putInt("volume", i6);
                bundle.putString("routeId", str);
                obtain.setData(bundle);
                obtain.replyTo = cVar.f30227i;
                try {
                    cVar.f30226h.send(obtain);
                } catch (DeadObjectException unused) {
                } catch (RemoteException e10) {
                    Log.e("MR2Provider", "Could not send control request to service.", e10);
                }
            }
        }

        @Override // r1.g.e
        public final void i(int i6) {
            c cVar;
            String str = this.f30235a;
            if (str != null && (cVar = this.f30236b) != null) {
                int andIncrement = cVar.f30230l.getAndIncrement();
                Message obtain = Message.obtain();
                obtain.what = 8;
                obtain.arg1 = andIncrement;
                Bundle bundle = new Bundle();
                bundle.putInt("volume", i6);
                bundle.putString("routeId", str);
                obtain.setData(bundle);
                obtain.replyTo = cVar.f30227i;
                try {
                    cVar.f30226h.send(obtain);
                } catch (DeadObjectException unused) {
                } catch (RemoteException e10) {
                    Log.e("MR2Provider", "Could not send control request to service.", e10);
                }
            }
        }
    }

    /* compiled from: MediaRoute2Provider.java */
    /* loaded from: classes.dex */
    public class e extends MediaRouter2.RouteCallback {
        public e() {
        }

        @Override // android.media.MediaRouter2.RouteCallback
        public final void onRoutesAdded(List<MediaRoute2Info> list) {
            d.this.s();
        }

        @Override // android.media.MediaRouter2.RouteCallback
        public final void onRoutesChanged(List<MediaRoute2Info> list) {
            d.this.s();
        }

        @Override // android.media.MediaRouter2.RouteCallback
        public final void onRoutesRemoved(List<MediaRoute2Info> list) {
            d.this.s();
        }
    }

    /* compiled from: MediaRoute2Provider.java */
    /* loaded from: classes.dex */
    public class f extends MediaRouter2.TransferCallback {
        public f() {
        }

        @Override // android.media.MediaRouter2.TransferCallback
        public final void onStop(MediaRouter2.RoutingController routingController) {
            g.e eVar = (g.e) d.this.E.remove(routingController);
            if (eVar != null) {
                l.d dVar = l.d.this;
                if (eVar == dVar.r) {
                    l.g c10 = dVar.c();
                    if (dVar.g() != c10) {
                        dVar.k(c10, 2);
                        return;
                    }
                    return;
                } else if (l.f30290c) {
                    Log.d("MediaRouter", "A RouteController unrelated to the selected route is released. controller=" + eVar);
                    return;
                } else {
                    return;
                }
            }
            Log.w("MR2Provider", "onStop: No matching routeController found. routingController=" + routingController);
        }

        @Override // android.media.MediaRouter2.TransferCallback
        public final void onTransfer(MediaRouter2.RoutingController routingController, MediaRouter2.RoutingController routingController2) {
            MediaRouter2.RoutingController systemController;
            List selectedRoutes;
            String id2;
            l.g gVar;
            d.this.E.remove(routingController);
            systemController = d.this.C.getSystemController();
            if (routingController2 != systemController) {
                selectedRoutes = routingController2.getSelectedRoutes();
                if (!selectedRoutes.isEmpty()) {
                    id2 = ((MediaRoute2Info) selectedRoutes.get(0)).getId();
                    d.this.E.put(routingController2, new c(routingController2, id2));
                    l.d dVar = l.d.this;
                    Iterator<l.g> it = dVar.f30302e.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            gVar = it.next();
                            if (gVar.c() == dVar.f30300c && TextUtils.equals(id2, gVar.f30342b)) {
                                break;
                            }
                        } else {
                            gVar = null;
                            break;
                        }
                    }
                    if (gVar == null) {
                        Log.w("MediaRouter", "onSelectRoute: The target RouteInfo is not found for descriptorId=" + id2);
                    } else {
                        dVar.k(gVar, 3);
                    }
                    d.this.t(routingController2);
                    return;
                }
                Log.w("MR2Provider", "Selected routes are empty. This shouldn't happen.");
                return;
            }
            l.d dVar2 = l.d.this;
            l.g c10 = dVar2.c();
            if (dVar2.g() != c10) {
                dVar2.k(c10, 3);
            }
        }

        @Override // android.media.MediaRouter2.TransferCallback
        public final void onTransferFailure(MediaRoute2Info mediaRoute2Info) {
            Log.w("MR2Provider", "Transfer failed. requestedRoute=" + mediaRoute2Info);
        }
    }

    static {
        Log.isLoggable("MR2Provider", 3);
    }

    public d(Context context, l.d.e eVar) {
        super(context, null);
        MediaRouter2 mediaRouter2;
        this.E = new ArrayMap();
        this.F = new e();
        this.G = new f();
        this.H = new b();
        this.J = new ArrayList();
        this.K = new ArrayMap();
        mediaRouter2 = MediaRouter2.getInstance(context);
        this.C = mediaRouter2;
        this.D = eVar;
        this.I = new r1.a(0, new Handler(Looper.getMainLooper()));
    }

    @Override // r1.g
    public final g.b l(String str) {
        for (Map.Entry entry : this.E.entrySet()) {
            c cVar = (c) entry.getValue();
            if (TextUtils.equals(str, cVar.f)) {
                return cVar;
            }
        }
        return null;
    }

    @Override // r1.g
    public final g.e m(String str) {
        return new C0513d((String) this.K.get(str), null);
    }

    @Override // r1.g
    public final g.e n(String str, String str2) {
        String id2;
        String str3 = (String) this.K.get(str);
        for (c cVar : this.E.values()) {
            id2 = cVar.f30225g.getId();
            if (TextUtils.equals(str2, id2)) {
                return new C0513d(str3, cVar);
            }
        }
        Log.w("MR2Provider", "Could not find the matching GroupRouteController. routeId=" + str + ", routeGroupId=" + str2);
        return new C0513d(str3, null);
    }

    @Override // r1.g
    public final void o(r1.f fVar) {
        int i6;
        boolean z10;
        x xVar;
        l.d dVar = l.f30291d;
        if (dVar == null) {
            i6 = 0;
        } else {
            i6 = dVar.f30319x;
        }
        b bVar = this.H;
        f fVar2 = this.G;
        e eVar = this.F;
        MediaRouter2 mediaRouter2 = this.C;
        if (i6 <= 0) {
            mediaRouter2.unregisterRouteCallback(eVar);
            mediaRouter2.unregisterTransferCallback(fVar2);
            mediaRouter2.unregisterControllerCallback(bVar);
            return;
        }
        if (dVar == null || (xVar = dVar.f30310n) == null) {
            z10 = false;
        } else {
            z10 = xVar.f30370b;
        }
        if (fVar == null) {
            fVar = new r1.f(k.f30286c, false);
        }
        fVar.a();
        k kVar = fVar.f30257b;
        kVar.a();
        List<String> list = kVar.f30288b;
        if (z10) {
            if (!list.contains("android.media.intent.category.LIVE_AUDIO")) {
                list.add("android.media.intent.category.LIVE_AUDIO");
            }
        } else {
            list.remove("android.media.intent.category.LIVE_AUDIO");
        }
        k.a aVar = new k.a();
        aVar.a(list);
        RouteDiscoveryPreference b10 = q.b(new r1.f(aVar.b(), fVar.b()));
        r1.a aVar2 = this.I;
        mediaRouter2.registerRouteCallback(aVar2, eVar, b10);
        mediaRouter2.registerTransferCallback(aVar2, fVar2);
        mediaRouter2.registerControllerCallback(aVar2, bVar);
    }

    public final MediaRoute2Info r(String str) {
        String id2;
        if (str == null) {
            return null;
        }
        for (MediaRoute2Info mediaRoute2Info : this.J) {
            id2 = mediaRoute2Info.getId();
            if (TextUtils.equals(id2, str)) {
                return mediaRoute2Info;
            }
        }
        return null;
    }

    public final void s() {
        List routes;
        Bundle extras;
        String id2;
        routes = this.C.getRoutes();
        List<MediaRoute2Info> list = (List) Collection$EL.stream(routes).distinct().filter(new r1.b(0)).collect(Collectors.toList());
        if (list.equals(this.J)) {
            return;
        }
        this.J = list;
        ArrayMap arrayMap = this.K;
        arrayMap.clear();
        for (MediaRoute2Info mediaRoute2Info : this.J) {
            extras = mediaRoute2Info.getExtras();
            if (extras != null && extras.getString("androidx.mediarouter.media.KEY_ORIGINAL_ROUTE_ID") != null) {
                id2 = mediaRoute2Info.getId();
                arrayMap.put(id2, extras.getString("androidx.mediarouter.media.KEY_ORIGINAL_ROUTE_ID"));
            } else {
                Log.w("MR2Provider", "Cannot find the original route Id. route=" + mediaRoute2Info);
            }
        }
        List<r1.e> list2 = (List) Collection$EL.stream(this.J).map(new r1.c(0)).filter(new r1.b(1)).collect(Collectors.toList());
        if (list2 != null) {
            ArrayList arrayList = null;
            if (!list2.isEmpty()) {
                for (r1.e eVar : list2) {
                    if (eVar != null) {
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                        } else if (arrayList.contains(eVar)) {
                            throw new IllegalArgumentException("route descriptor already added");
                        }
                        arrayList.add(eVar);
                    } else {
                        throw new IllegalArgumentException("route must not be null");
                    }
                }
            }
            p(new j(arrayList, true));
            return;
        }
        throw new IllegalArgumentException("routes must not be null");
    }

    public final void t(MediaRouter2.RoutingController routingController) {
        List selectedRoutes;
        List selectedRoutes2;
        Bundle controlHints;
        List selectableRoutes;
        List deselectableRoutes;
        int i6;
        String id2;
        int volume;
        int volumeMax;
        int volumeHandling;
        c cVar = (c) this.E.get(routingController);
        if (cVar != null) {
            selectedRoutes = routingController.getSelectedRoutes();
            List<String> a10 = q.a(selectedRoutes);
            selectedRoutes2 = routingController.getSelectedRoutes();
            r1.e c10 = q.c((MediaRoute2Info) selectedRoutes2.get(0));
            controlHints = routingController.getControlHints();
            String string = this.f30258u.getString(R.string.mr_dialog_default_group_name);
            r1.e eVar = null;
            if (controlHints != null) {
                try {
                    String string2 = controlHints.getString("androidx.mediarouter.media.KEY_SESSION_NAME");
                    if (!TextUtils.isEmpty(string2)) {
                        string = string2;
                    }
                    Bundle bundle = controlHints.getBundle("androidx.mediarouter.media.KEY_GROUP_ROUTE");
                    if (bundle != null) {
                        eVar = new r1.e(bundle);
                    }
                } catch (Exception e10) {
                    Log.w("MR2Provider", "Exception while unparceling control hints.", e10);
                }
            }
            if (eVar == null) {
                id2 = routingController.getId();
                e.a aVar = new e.a(id2, string);
                Bundle bundle2 = aVar.f30247a;
                bundle2.putInt("connectionState", 2);
                bundle2.putInt("playbackType", 1);
                volume = routingController.getVolume();
                bundle2.putInt("volume", volume);
                volumeMax = routingController.getVolumeMax();
                bundle2.putInt("volumeMax", volumeMax);
                volumeHandling = routingController.getVolumeHandling();
                bundle2.putInt("volumeHandling", volumeHandling);
                c10.a();
                aVar.a(c10.f30246c);
                if (a10 != null) {
                    if (!a10.isEmpty()) {
                        for (String str : a10) {
                            if (!TextUtils.isEmpty(str)) {
                                if (aVar.f30248b == null) {
                                    aVar.f30248b = new ArrayList<>();
                                }
                                if (!aVar.f30248b.contains(str)) {
                                    aVar.f30248b.add(str);
                                }
                            } else {
                                throw new IllegalArgumentException("groupMemberId must not be empty");
                            }
                        }
                    }
                    eVar = aVar.b();
                } else {
                    throw new IllegalArgumentException("groupMemberIds must not be null");
                }
            }
            selectableRoutes = routingController.getSelectableRoutes();
            List<String> a11 = q.a(selectableRoutes);
            deselectableRoutes = routingController.getDeselectableRoutes();
            List<String> a12 = q.a(deselectableRoutes);
            j jVar = this.A;
            if (jVar == null) {
                Log.w("MR2Provider", "setDynamicRouteDescriptors: providerDescriptor is not set.");
                return;
            }
            ArrayList arrayList = new ArrayList();
            List<r1.e> list = jVar.f30284a;
            if (!list.isEmpty()) {
                for (r1.e eVar2 : list) {
                    String d10 = eVar2.d();
                    if (a10.contains(d10)) {
                        i6 = 3;
                    } else {
                        i6 = 1;
                    }
                    arrayList.add(new g.b.a(eVar2, i6, a12.contains(d10), a11.contains(d10), true));
                }
            }
            cVar.l(eVar, arrayList);
            return;
        }
        Log.w("MR2Provider", "setDynamicRouteDescriptors: No matching routeController found. routingController=" + routingController);
    }
}
