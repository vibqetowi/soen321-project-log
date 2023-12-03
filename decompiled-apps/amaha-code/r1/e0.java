package r1;

import android.content.ComponentName;
import android.content.Context;
import android.content.IntentFilter;
import android.media.MediaRouter;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.view.Display;
import com.theinnerhour.b2b.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import r1.e;
import r1.g;
import r1.l;
/* compiled from: SystemMediaRouteProvider.java */
/* loaded from: classes.dex */
public abstract class e0 extends g {

    /* compiled from: SystemMediaRouteProvider.java */
    /* loaded from: classes.dex */
    public static class a extends d {
        public a(Context context, e eVar) {
            super(context, eVar);
        }

        @Override // r1.e0.d, r1.e0.c, r1.e0.b
        public final void x(b.C0514b c0514b, e.a aVar) {
            int deviceType;
            super.x(c0514b, aVar);
            deviceType = ((MediaRouter.RouteInfo) c0514b.f30251a).getDeviceType();
            aVar.f30247a.putInt("deviceType", deviceType);
        }
    }

    /* compiled from: SystemMediaRouteProvider.java */
    /* loaded from: classes.dex */
    public static class c extends b implements v {
        public c(Context context, e eVar) {
            super(context, eVar);
        }

        public boolean G(b.C0514b c0514b) {
            throw null;
        }

        @Override // r1.v
        public final void f(Object obj) {
            Display display;
            int i6;
            ArrayList<String> arrayList;
            int s10 = s(obj);
            if (s10 >= 0) {
                b.C0514b c0514b = this.K.get(s10);
                ArrayList<? extends Parcelable> arrayList2 = null;
                try {
                    display = ((MediaRouter.RouteInfo) obj).getPresentationDisplay();
                } catch (NoSuchMethodError e10) {
                    Log.w("MediaRouterJellybeanMr1", "Cannot get presentation display for the route.", e10);
                    display = null;
                }
                if (display != null) {
                    i6 = display.getDisplayId();
                } else {
                    i6 = -1;
                }
                if (i6 != c0514b.f30253c.f30244a.getInt("presentationDisplayId", -1)) {
                    r1.e eVar = c0514b.f30253c;
                    if (eVar != null) {
                        Bundle bundle = new Bundle(eVar.f30244a);
                        if (!eVar.b().isEmpty()) {
                            arrayList = new ArrayList<>(eVar.b());
                        } else {
                            arrayList = null;
                        }
                        eVar.a();
                        if (!eVar.f30246c.isEmpty()) {
                            arrayList2 = new ArrayList<>(eVar.f30246c);
                        }
                        bundle.putInt("presentationDisplayId", i6);
                        if (arrayList2 != null) {
                            bundle.putParcelableArrayList("controlFilters", arrayList2);
                        }
                        if (arrayList != null) {
                            bundle.putStringArrayList("groupMemberIds", arrayList);
                        }
                        c0514b.f30253c = new r1.e(bundle);
                        B();
                        return;
                    }
                    throw new IllegalArgumentException("descriptor must not be null");
                }
            }
        }

        @Override // r1.e0.b
        public void x(b.C0514b c0514b, e.a aVar) {
            Display display;
            super.x(c0514b, aVar);
            Object obj = c0514b.f30251a;
            boolean isEnabled = ((MediaRouter.RouteInfo) obj).isEnabled();
            Bundle bundle = aVar.f30247a;
            if (!isEnabled) {
                bundle.putBoolean("enabled", false);
            }
            if (G(c0514b)) {
                bundle.putInt("connectionState", 1);
            }
            try {
                display = ((MediaRouter.RouteInfo) obj).getPresentationDisplay();
            } catch (NoSuchMethodError e10) {
                Log.w("MediaRouterJellybeanMr1", "Cannot get presentation display for the route.", e10);
                display = null;
            }
            if (display != null) {
                bundle.putInt("presentationDisplayId", display.getDisplayId());
            }
        }
    }

    /* compiled from: SystemMediaRouteProvider.java */
    /* loaded from: classes.dex */
    public static class d extends c {
        public d(Context context, e eVar) {
            super(context, eVar);
        }

        @Override // r1.e0.b
        public final void C(Object obj) {
            ((MediaRouter) this.D).selectRoute(8388611, (MediaRouter.RouteInfo) obj);
        }

        @Override // r1.e0.b
        public final void D() {
            boolean z10 = this.J;
            Object obj = this.E;
            Object obj2 = this.D;
            if (z10) {
                ((MediaRouter) obj2).removeCallback((MediaRouter.Callback) obj);
            }
            this.J = true;
            ((MediaRouter) obj2).addCallback(this.H, (MediaRouter.Callback) obj, (this.I ? 1 : 0) | 2);
        }

        @Override // r1.e0.b
        public final void F(b.c cVar) {
            super.F(cVar);
            ((MediaRouter.UserRouteInfo) cVar.f30255b).setDescription(cVar.f30254a.f30345e);
        }

        @Override // r1.e0.c
        public final boolean G(b.C0514b c0514b) {
            return ((MediaRouter.RouteInfo) c0514b.f30251a).isConnecting();
        }

        @Override // r1.e0.b
        public final MediaRouter.RouteInfo v() {
            return ((MediaRouter) this.D).getDefaultRoute();
        }

        @Override // r1.e0.c, r1.e0.b
        public void x(b.C0514b c0514b, e.a aVar) {
            super.x(c0514b, aVar);
            CharSequence description = ((MediaRouter.RouteInfo) c0514b.f30251a).getDescription();
            if (description != null) {
                aVar.f30247a.putString("status", description.toString());
            }
        }
    }

    /* compiled from: SystemMediaRouteProvider.java */
    /* loaded from: classes.dex */
    public interface e {
    }

    public e0(Context context) {
        super(context, new g.d(new ComponentName("android", e0.class.getName())));
    }

    /* compiled from: SystemMediaRouteProvider.java */
    /* loaded from: classes.dex */
    public static class b extends e0 implements r, t {
        public static final ArrayList<IntentFilter> M;
        public static final ArrayList<IntentFilter> N;
        public final e C;
        public final Object D;
        public final Object E;
        public final u F;
        public final MediaRouter.RouteCategory G;
        public int H;
        public boolean I;
        public boolean J;
        public final ArrayList<C0514b> K;
        public final ArrayList<c> L;

        /* compiled from: SystemMediaRouteProvider.java */
        /* loaded from: classes.dex */
        public static final class a extends g.e {

            /* renamed from: a  reason: collision with root package name */
            public final Object f30250a;

            public a(Object obj) {
                this.f30250a = obj;
            }

            @Override // r1.g.e
            public final void f(int i6) {
                ((MediaRouter.RouteInfo) this.f30250a).requestSetVolume(i6);
            }

            @Override // r1.g.e
            public final void i(int i6) {
                ((MediaRouter.RouteInfo) this.f30250a).requestUpdateVolume(i6);
            }
        }

        /* compiled from: SystemMediaRouteProvider.java */
        /* renamed from: r1.e0$b$b  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0514b {

            /* renamed from: a  reason: collision with root package name */
            public final Object f30251a;

            /* renamed from: b  reason: collision with root package name */
            public final String f30252b;

            /* renamed from: c  reason: collision with root package name */
            public r1.e f30253c;

            public C0514b(Object obj, String str) {
                this.f30251a = obj;
                this.f30252b = str;
            }
        }

        /* compiled from: SystemMediaRouteProvider.java */
        /* loaded from: classes.dex */
        public static final class c {

            /* renamed from: a  reason: collision with root package name */
            public final l.g f30254a;

            /* renamed from: b  reason: collision with root package name */
            public final Object f30255b;

            public c(l.g gVar, MediaRouter.UserRouteInfo userRouteInfo) {
                this.f30254a = gVar;
                this.f30255b = userRouteInfo;
            }
        }

        static {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addCategory("android.media.intent.category.LIVE_AUDIO");
            ArrayList<IntentFilter> arrayList = new ArrayList<>();
            M = arrayList;
            arrayList.add(intentFilter);
            IntentFilter intentFilter2 = new IntentFilter();
            intentFilter2.addCategory("android.media.intent.category.LIVE_VIDEO");
            ArrayList<IntentFilter> arrayList2 = new ArrayList<>();
            N = arrayList2;
            arrayList2.add(intentFilter2);
        }

        public b(Context context, e eVar) {
            super(context);
            this.K = new ArrayList<>();
            this.L = new ArrayList<>();
            this.C = eVar;
            Object systemService = context.getSystemService("media_router");
            this.D = systemService;
            this.E = new w((c) this);
            this.F = new u(this);
            this.G = ((MediaRouter) systemService).createRouteCategory((CharSequence) context.getResources().getString(R.string.mr_user_route_category_name), false);
            E();
        }

        public static c w(Object obj) {
            Object tag = ((MediaRouter.RouteInfo) obj).getTag();
            if (tag instanceof c) {
                return (c) tag;
            }
            return null;
        }

        public final void A(l.g gVar) {
            if (!gVar.g()) {
                return;
            }
            if (gVar.c() != this) {
                int u10 = u(gVar);
                if (u10 >= 0) {
                    C(this.L.get(u10).f30255b);
                    return;
                }
                return;
            }
            int t3 = t(gVar.f30342b);
            if (t3 >= 0) {
                C(this.K.get(t3).f30251a);
            }
        }

        public final void B() {
            ArrayList<C0514b> arrayList = this.K;
            int size = arrayList.size();
            ArrayList arrayList2 = null;
            for (int i6 = 0; i6 < size; i6++) {
                r1.e eVar = arrayList.get(i6).f30253c;
                if (eVar != null) {
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList();
                    } else if (arrayList2.contains(eVar)) {
                        throw new IllegalArgumentException("route descriptor already added");
                    }
                    arrayList2.add(eVar);
                } else {
                    throw new IllegalArgumentException("route must not be null");
                }
            }
            p(new j(arrayList2, false));
        }

        public void C(Object obj) {
            throw null;
        }

        public void D() {
            throw null;
        }

        public final void E() {
            D();
            MediaRouter mediaRouter = (MediaRouter) this.D;
            int routeCount = mediaRouter.getRouteCount();
            ArrayList arrayList = new ArrayList(routeCount);
            boolean z10 = false;
            for (int i6 = 0; i6 < routeCount; i6++) {
                arrayList.add(mediaRouter.getRouteAt(i6));
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                z10 |= r(it.next());
            }
            if (z10) {
                B();
            }
        }

        public void F(c cVar) {
            Object obj = cVar.f30255b;
            l.g gVar = cVar.f30254a;
            ((MediaRouter.UserRouteInfo) obj).setName(gVar.f30344d);
            int i6 = gVar.f30350k;
            MediaRouter.UserRouteInfo userRouteInfo = (MediaRouter.UserRouteInfo) cVar.f30255b;
            userRouteInfo.setPlaybackType(i6);
            userRouteInfo.setPlaybackStream(gVar.f30351l);
            userRouteInfo.setVolume(gVar.f30354o);
            userRouteInfo.setVolumeMax(gVar.f30355p);
            userRouteInfo.setVolumeHandling(gVar.f30353n);
        }

        @Override // r1.r
        public final void b(Object obj) {
            int s10;
            String str;
            if (w(obj) == null && (s10 = s(obj)) >= 0) {
                C0514b c0514b = this.K.get(s10);
                String str2 = c0514b.f30252b;
                CharSequence name = ((MediaRouter.RouteInfo) c0514b.f30251a).getName(this.f30258u);
                if (name != null) {
                    str = name.toString();
                } else {
                    str = "";
                }
                e.a aVar = new e.a(str2, str);
                x(c0514b, aVar);
                c0514b.f30253c = aVar.b();
                B();
            }
        }

        @Override // r1.t
        public final void c(int i6, Object obj) {
            c w10 = w(obj);
            if (w10 != null) {
                w10.f30254a.k(i6);
            }
        }

        @Override // r1.r
        public final void d(Object obj) {
            int s10;
            if (w(obj) == null && (s10 = s(obj)) >= 0) {
                this.K.remove(s10);
                B();
            }
        }

        @Override // r1.r
        public final void e(Object obj) {
            l.g a10;
            if (obj != ((MediaRouter) this.D).getSelectedRoute(8388611)) {
                return;
            }
            c w10 = w(obj);
            if (w10 != null) {
                l.g gVar = w10.f30254a;
                gVar.getClass();
                l.b();
                l.f30291d.j(gVar, 3);
                return;
            }
            int s10 = s(obj);
            if (s10 >= 0) {
                String str = this.K.get(s10).f30252b;
                l.d dVar = (l.d) this.C;
                dVar.f30307k.removeMessages(262);
                l.f d10 = dVar.d(dVar.f30308l);
                if (d10 != null && (a10 = d10.a(str)) != null) {
                    l.b();
                    l.f30291d.j(a10, 3);
                }
            }
        }

        @Override // r1.t
        public final void i(int i6, Object obj) {
            c w10 = w(obj);
            if (w10 != null) {
                w10.f30254a.j(i6);
            }
        }

        @Override // r1.r
        public final void j(Object obj) {
            if (r(obj)) {
                B();
            }
        }

        @Override // r1.r
        public final void k(Object obj) {
            int s10;
            ArrayList<String> arrayList;
            if (w(obj) == null && (s10 = s(obj)) >= 0) {
                C0514b c0514b = this.K.get(s10);
                int volume = ((MediaRouter.RouteInfo) obj).getVolume();
                if (volume != c0514b.f30253c.f30244a.getInt("volume")) {
                    r1.e eVar = c0514b.f30253c;
                    if (eVar != null) {
                        Bundle bundle = new Bundle(eVar.f30244a);
                        ArrayList<? extends Parcelable> arrayList2 = null;
                        if (!eVar.b().isEmpty()) {
                            arrayList = new ArrayList<>(eVar.b());
                        } else {
                            arrayList = null;
                        }
                        eVar.a();
                        if (!eVar.f30246c.isEmpty()) {
                            arrayList2 = new ArrayList<>(eVar.f30246c);
                        }
                        bundle.putInt("volume", volume);
                        if (arrayList2 != null) {
                            bundle.putParcelableArrayList("controlFilters", arrayList2);
                        }
                        if (arrayList != null) {
                            bundle.putStringArrayList("groupMemberIds", arrayList);
                        }
                        c0514b.f30253c = new r1.e(bundle);
                        B();
                        return;
                    }
                    throw new IllegalArgumentException("descriptor must not be null");
                }
            }
        }

        @Override // r1.g
        public final g.e m(String str) {
            int t3 = t(str);
            if (t3 >= 0) {
                return new a(this.K.get(t3).f30251a);
            }
            return null;
        }

        @Override // r1.g
        public final void o(f fVar) {
            boolean z10;
            int i6 = 0;
            if (fVar != null) {
                fVar.a();
                k kVar = fVar.f30257b;
                kVar.a();
                List<String> list = kVar.f30288b;
                int size = list.size();
                int i10 = 0;
                while (i6 < size) {
                    String str = list.get(i6);
                    if (str.equals("android.media.intent.category.LIVE_AUDIO")) {
                        i10 |= 1;
                    } else if (str.equals("android.media.intent.category.LIVE_VIDEO")) {
                        i10 |= 2;
                    } else {
                        i10 |= 8388608;
                    }
                    i6++;
                }
                z10 = fVar.b();
                i6 = i10;
            } else {
                z10 = false;
            }
            if (this.H != i6 || this.I != z10) {
                this.H = i6;
                this.I = z10;
                E();
            }
        }

        public final boolean r(Object obj) {
            boolean z10;
            String str;
            String format;
            String format2;
            if (w(obj) != null || s(obj) >= 0) {
                return false;
            }
            if (v() == obj) {
                z10 = true;
            } else {
                z10 = false;
            }
            String str2 = "";
            Context context = this.f30258u;
            if (z10) {
                format = "DEFAULT_ROUTE";
            } else {
                Locale locale = Locale.US;
                Object[] objArr = new Object[1];
                CharSequence name = ((MediaRouter.RouteInfo) obj).getName(context);
                if (name == null) {
                    str = "";
                } else {
                    str = name.toString();
                }
                objArr[0] = Integer.valueOf(str.hashCode());
                format = String.format(locale, "ROUTE_%08x", objArr);
            }
            if (t(format) >= 0) {
                int i6 = 2;
                while (true) {
                    format2 = String.format(Locale.US, "%s_%d", format, Integer.valueOf(i6));
                    if (t(format2) < 0) {
                        break;
                    }
                    i6++;
                }
                format = format2;
            }
            C0514b c0514b = new C0514b(obj, format);
            CharSequence name2 = ((MediaRouter.RouteInfo) obj).getName(context);
            if (name2 != null) {
                str2 = name2.toString();
            }
            e.a aVar = new e.a(format, str2);
            x(c0514b, aVar);
            c0514b.f30253c = aVar.b();
            this.K.add(c0514b);
            return true;
        }

        public final int s(Object obj) {
            ArrayList<C0514b> arrayList = this.K;
            int size = arrayList.size();
            for (int i6 = 0; i6 < size; i6++) {
                if (arrayList.get(i6).f30251a == obj) {
                    return i6;
                }
            }
            return -1;
        }

        public final int t(String str) {
            ArrayList<C0514b> arrayList = this.K;
            int size = arrayList.size();
            for (int i6 = 0; i6 < size; i6++) {
                if (arrayList.get(i6).f30252b.equals(str)) {
                    return i6;
                }
            }
            return -1;
        }

        public final int u(l.g gVar) {
            ArrayList<c> arrayList = this.L;
            int size = arrayList.size();
            for (int i6 = 0; i6 < size; i6++) {
                if (arrayList.get(i6).f30254a == gVar) {
                    return i6;
                }
            }
            return -1;
        }

        public MediaRouter.RouteInfo v() {
            throw null;
        }

        public void x(C0514b c0514b, e.a aVar) {
            int supportedTypes = ((MediaRouter.RouteInfo) c0514b.f30251a).getSupportedTypes();
            if ((supportedTypes & 1) != 0) {
                aVar.a(M);
            }
            if ((supportedTypes & 2) != 0) {
                aVar.a(N);
            }
            MediaRouter.RouteInfo routeInfo = (MediaRouter.RouteInfo) c0514b.f30251a;
            int playbackType = routeInfo.getPlaybackType();
            Bundle bundle = aVar.f30247a;
            bundle.putInt("playbackType", playbackType);
            bundle.putInt("playbackStream", routeInfo.getPlaybackStream());
            bundle.putInt("volume", routeInfo.getVolume());
            bundle.putInt("volumeMax", routeInfo.getVolumeMax());
            bundle.putInt("volumeHandling", routeInfo.getVolumeHandling());
        }

        public final void y(l.g gVar) {
            g c10 = gVar.c();
            Object obj = this.D;
            if (c10 != this) {
                MediaRouter mediaRouter = (MediaRouter) obj;
                MediaRouter.UserRouteInfo createUserRoute = mediaRouter.createUserRoute(this.G);
                c cVar = new c(gVar, createUserRoute);
                createUserRoute.setTag(cVar);
                createUserRoute.setVolumeCallback(this.F);
                F(cVar);
                this.L.add(cVar);
                mediaRouter.addUserRoute(createUserRoute);
                return;
            }
            int s10 = s(((MediaRouter) obj).getSelectedRoute(8388611));
            if (s10 >= 0 && this.K.get(s10).f30252b.equals(gVar.f30342b)) {
                l.b();
                l.f30291d.j(gVar, 3);
            }
        }

        public final void z(l.g gVar) {
            int u10;
            if (gVar.c() != this && (u10 = u(gVar)) >= 0) {
                c remove = this.L.remove(u10);
                ((MediaRouter.RouteInfo) remove.f30255b).setTag(null);
                MediaRouter.UserRouteInfo userRouteInfo = (MediaRouter.UserRouteInfo) remove.f30255b;
                userRouteInfo.setVolumeCallback(null);
                ((MediaRouter) this.D).removeUserRoute(userRouteInfo);
            }
        }

        @Override // r1.r
        public final void a() {
        }

        @Override // r1.r
        public final void g() {
        }

        @Override // r1.r
        public final void h() {
        }
    }
}
