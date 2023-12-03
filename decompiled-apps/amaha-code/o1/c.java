package o1;

import android.app.Service;
import android.content.Intent;
import android.media.browse.MediaBrowser;
import android.os.Binder;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcel;
import android.os.Parcelable;
import android.service.media.MediaBrowserService;
import android.support.v4.media.MediaBrowserCompat;
import android.support.v4.media.session.MediaSessionCompat;
import android.text.TextUtils;
import android.util.Log;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
/* compiled from: MediaBrowserServiceCompat.java */
/* loaded from: classes.dex */
public abstract class c extends Service {
    public static final boolean A = Log.isLoggable("MBServiceCompat", 3);

    /* renamed from: u  reason: collision with root package name */
    public d f26903u;

    /* renamed from: v  reason: collision with root package name */
    public final b f26904v = new b("android.media.session.MediaController", -1, -1, null);

    /* renamed from: w  reason: collision with root package name */
    public final ArrayList<b> f26905w = new ArrayList<>();

    /* renamed from: x  reason: collision with root package name */
    public final t.b<IBinder, b> f26906x = new t.b<>();

    /* renamed from: y  reason: collision with root package name */
    public final m f26907y = new m(this);

    /* renamed from: z  reason: collision with root package name */
    public MediaSessionCompat.Token f26908z;

    /* compiled from: MediaBrowserServiceCompat.java */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final String f26909a;

        /* renamed from: b  reason: collision with root package name */
        public final Bundle f26910b;

        public a(Bundle bundle, String str) {
            if (str != null) {
                this.f26909a = str;
                this.f26910b = bundle;
                return;
            }
            throw new IllegalArgumentException("The root id in BrowserRoot cannot be null. Use null for BrowserRoot instead");
        }
    }

    /* compiled from: MediaBrowserServiceCompat.java */
    /* loaded from: classes.dex */
    public class b implements IBinder.DeathRecipient {

        /* renamed from: a  reason: collision with root package name */
        public final String f26911a;

        /* renamed from: b  reason: collision with root package name */
        public final int f26912b;

        /* renamed from: c  reason: collision with root package name */
        public final int f26913c;

        /* renamed from: d  reason: collision with root package name */
        public final k f26914d;

        /* renamed from: e  reason: collision with root package name */
        public final HashMap<String, List<s0.c<IBinder, Bundle>>> f26915e = new HashMap<>();
        public a f;

        /* compiled from: MediaBrowserServiceCompat.java */
        /* loaded from: classes.dex */
        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                b bVar = b.this;
                c.this.f26906x.remove(((l) bVar.f26914d).a());
            }
        }

        public b(String str, int i6, int i10, k kVar) {
            this.f26911a = str;
            this.f26912b = i6;
            this.f26913c = i10;
            if (str != null) {
                if (!TextUtils.isEmpty(str)) {
                    if (Build.VERSION.SDK_INT >= 28) {
                        new q(str, i6, i10);
                    }
                    this.f26914d = kVar;
                    return;
                }
                throw new IllegalArgumentException("packageName should be nonempty");
            }
            throw new NullPointerException("package shouldn't be null");
        }

        @Override // android.os.IBinder.DeathRecipient
        public final void binderDied() {
            c.this.f26907y.post(new a());
        }
    }

    /* compiled from: MediaBrowserServiceCompat.java */
    /* renamed from: o1.c$c  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public interface InterfaceC0443c {
        void a();
    }

    /* compiled from: MediaBrowserServiceCompat.java */
    /* loaded from: classes.dex */
    public class d implements InterfaceC0443c {

        /* renamed from: a  reason: collision with root package name */
        public final ArrayList f26918a = new ArrayList();

        /* renamed from: b  reason: collision with root package name */
        public a f26919b;

        /* renamed from: c  reason: collision with root package name */
        public Messenger f26920c;

        /* compiled from: MediaBrowserServiceCompat.java */
        /* loaded from: classes.dex */
        public class a extends MediaBrowserService {
            public a(c cVar) {
                attachBaseContext(cVar);
            }

            @Override // android.service.media.MediaBrowserService
            public final MediaBrowserService.BrowserRoot onGetRoot(String str, int i6, Bundle bundle) {
                Bundle bundle2;
                Bundle bundle3;
                int i10;
                a aVar;
                IBinder asBinder;
                MediaSessionCompat.a(bundle);
                if (bundle == null) {
                    bundle2 = null;
                } else {
                    bundle2 = new Bundle(bundle);
                }
                d dVar = d.this;
                c cVar = c.this;
                if (bundle2 != null && bundle2.getInt("extra_client_version", 0) != 0) {
                    bundle2.remove("extra_client_version");
                    dVar.f26920c = new Messenger(cVar.f26907y);
                    Bundle k10 = defpackage.c.k("extra_service_version", 2);
                    f0.j.b(k10, "extra_messenger", dVar.f26920c.getBinder());
                    MediaSessionCompat.Token token = cVar.f26908z;
                    if (token != null) {
                        android.support.v4.media.session.b a10 = token.a();
                        if (a10 == null) {
                            asBinder = null;
                        } else {
                            asBinder = a10.asBinder();
                        }
                        f0.j.b(k10, "extra_session_binder", asBinder);
                    } else {
                        dVar.f26918a.add(k10);
                    }
                    int i11 = bundle2.getInt("extra_calling_pid", -1);
                    bundle2.remove("extra_calling_pid");
                    i10 = i11;
                    bundle3 = k10;
                } else {
                    bundle3 = null;
                    i10 = -1;
                }
                b bVar = new b(str, i10, i6, null);
                cVar.getClass();
                a b10 = cVar.b(str);
                if (b10 == null) {
                    aVar = null;
                } else {
                    if (dVar.f26920c != null) {
                        cVar.f26905w.add(bVar);
                    }
                    Bundle bundle4 = b10.f26910b;
                    if (bundle3 == null) {
                        bundle3 = bundle4;
                    } else if (bundle4 != null) {
                        bundle3.putAll(bundle4);
                    }
                    aVar = new a(bundle3, b10.f26909a);
                }
                if (aVar == null) {
                    return null;
                }
                return new MediaBrowserService.BrowserRoot(aVar.f26909a, aVar.f26910b);
            }

            @Override // android.service.media.MediaBrowserService
            public final void onLoadChildren(String str, MediaBrowserService.Result<List<MediaBrowser.MediaItem>> result) {
                i iVar = new i(result);
                d dVar = d.this;
                dVar.getClass();
                o1.e eVar = new o1.e(str, iVar);
                c cVar = c.this;
                b bVar = cVar.f26904v;
                cVar.c(str, eVar);
            }
        }

        public d() {
        }

        @Override // o1.c.InterfaceC0443c
        public void a() {
            a aVar = new a(c.this);
            this.f26919b = aVar;
            aVar.onCreate();
        }
    }

    /* compiled from: MediaBrowserServiceCompat.java */
    /* loaded from: classes.dex */
    public class e extends d {

        /* compiled from: MediaBrowserServiceCompat.java */
        /* loaded from: classes.dex */
        public class a extends d.a {
            public a(c cVar) {
                super(cVar);
            }

            @Override // android.service.media.MediaBrowserService
            public final void onLoadItem(String str, MediaBrowserService.Result<MediaBrowser.MediaItem> result) {
                i iVar = new i(result);
                b bVar = c.this.f26904v;
                iVar.a(null);
            }
        }

        public e() {
            super();
        }

        @Override // o1.c.d, o1.c.InterfaceC0443c
        public void a() {
            a aVar = new a(c.this);
            this.f26919b = aVar;
            aVar.onCreate();
        }
    }

    /* compiled from: MediaBrowserServiceCompat.java */
    /* loaded from: classes.dex */
    public class f extends e {

        /* compiled from: MediaBrowserServiceCompat.java */
        /* loaded from: classes.dex */
        public class a extends e.a {
            public a(c cVar) {
                super(cVar);
            }

            @Override // android.service.media.MediaBrowserService
            public final void onLoadChildren(String str, MediaBrowserService.Result<List<MediaBrowser.MediaItem>> result, Bundle bundle) {
                MediaSessionCompat.a(bundle);
                f fVar = f.this;
                c cVar = c.this;
                b bVar = cVar.f26904v;
                cVar.getClass();
                i iVar = new i(result);
                fVar.getClass();
                o1.f fVar2 = new o1.f(fVar, str, iVar, bundle);
                c cVar2 = c.this;
                b bVar2 = cVar2.f26904v;
                fVar2.f26928c = 1;
                cVar2.c(str, fVar2);
                c.this.getClass();
            }
        }

        public f() {
            super();
        }

        @Override // o1.c.e, o1.c.d, o1.c.InterfaceC0443c
        public final void a() {
            a aVar = new a(c.this);
            this.f26919b = aVar;
            aVar.onCreate();
        }
    }

    /* compiled from: MediaBrowserServiceCompat.java */
    /* loaded from: classes.dex */
    public class g extends f {
        public g(c cVar) {
            super();
        }
    }

    /* compiled from: MediaBrowserServiceCompat.java */
    /* loaded from: classes.dex */
    public static class h<T> {

        /* renamed from: a  reason: collision with root package name */
        public final Object f26926a;

        /* renamed from: b  reason: collision with root package name */
        public boolean f26927b;

        /* renamed from: c  reason: collision with root package name */
        public int f26928c;

        public h(Object obj) {
            this.f26926a = obj;
        }

        public void a(ArrayList arrayList) {
            throw null;
        }

        public final void b(ArrayList arrayList) {
            if (!this.f26927b) {
                this.f26927b = true;
                a(arrayList);
                return;
            }
            throw new IllegalStateException("sendResult() called when either sendResult() or sendError() had already been called for: " + this.f26926a);
        }
    }

    /* compiled from: MediaBrowserServiceCompat.java */
    /* loaded from: classes.dex */
    public static class i<T> {

        /* renamed from: a  reason: collision with root package name */
        public final MediaBrowserService.Result f26929a;

        public i(MediaBrowserService.Result result) {
            this.f26929a = result;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final void a(T t3) {
            boolean z10 = t3 instanceof List;
            ArrayList arrayList = null;
            MediaBrowserService.Result result = this.f26929a;
            if (z10) {
                List<Parcel> list = (List) t3;
                if (list != null) {
                    arrayList = new ArrayList();
                    for (Parcel parcel : list) {
                        parcel.setDataPosition(0);
                        arrayList.add((MediaBrowser.MediaItem) MediaBrowser.MediaItem.CREATOR.createFromParcel(parcel));
                        parcel.recycle();
                    }
                }
                result.sendResult(arrayList);
            } else if (t3 instanceof Parcel) {
                Parcel parcel2 = (Parcel) t3;
                parcel2.setDataPosition(0);
                result.sendResult(MediaBrowser.MediaItem.CREATOR.createFromParcel(parcel2));
                parcel2.recycle();
            } else {
                result.sendResult(null);
            }
        }
    }

    /* compiled from: MediaBrowserServiceCompat.java */
    /* loaded from: classes.dex */
    public class j {
        public j() {
        }
    }

    /* compiled from: MediaBrowserServiceCompat.java */
    /* loaded from: classes.dex */
    public interface k {
    }

    /* compiled from: MediaBrowserServiceCompat.java */
    /* loaded from: classes.dex */
    public static class l implements k {

        /* renamed from: a  reason: collision with root package name */
        public final Messenger f26931a;

        public l(Messenger messenger) {
            this.f26931a = messenger;
        }

        public final IBinder a() {
            return this.f26931a.getBinder();
        }

        public final void b(String str, List<MediaBrowserCompat.MediaItem> list, Bundle bundle, Bundle bundle2) {
            ArrayList<? extends Parcelable> arrayList;
            Bundle bundle3 = new Bundle();
            bundle3.putString("data_media_item_id", str);
            bundle3.putBundle("data_options", bundle);
            bundle3.putBundle("data_notify_children_changed_options", bundle2);
            if (list != null) {
                if (list instanceof ArrayList) {
                    arrayList = (ArrayList) list;
                } else {
                    arrayList = new ArrayList<>(list);
                }
                bundle3.putParcelableArrayList("data_media_item_list", arrayList);
            }
            c(3, bundle3);
        }

        public final void c(int i6, Bundle bundle) {
            Message obtain = Message.obtain();
            obtain.what = i6;
            obtain.arg1 = 2;
            obtain.setData(bundle);
            this.f26931a.send(obtain);
        }
    }

    /* compiled from: MediaBrowserServiceCompat.java */
    /* loaded from: classes.dex */
    public final class m extends Handler {

        /* renamed from: a  reason: collision with root package name */
        public final j f26932a;

        public m(c cVar) {
            this.f26932a = new j();
        }

        public final void a(Runnable runnable) {
            if (Thread.currentThread() == getLooper().getThread()) {
                runnable.run();
            } else {
                post(runnable);
            }
        }

        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            Bundle data = message.getData();
            int i6 = message.what;
            j jVar = this.f26932a;
            switch (i6) {
                case 1:
                    Bundle bundle = data.getBundle("data_root_hints");
                    MediaSessionCompat.a(bundle);
                    String string = data.getString("data_package_name");
                    int i10 = data.getInt("data_calling_pid");
                    int i11 = data.getInt("data_calling_uid");
                    l lVar = new l(message.replyTo);
                    c cVar = c.this;
                    boolean z10 = false;
                    if (string == null) {
                        cVar.getClass();
                    } else {
                        String[] packagesForUid = cVar.getPackageManager().getPackagesForUid(i11);
                        int length = packagesForUid.length;
                        int i12 = 0;
                        while (true) {
                            if (i12 < length) {
                                if (packagesForUid[i12].equals(string)) {
                                    z10 = true;
                                } else {
                                    i12++;
                                }
                            }
                        }
                    }
                    if (z10) {
                        cVar.f26907y.a(new o1.g(i10, i11, bundle, jVar, lVar, string));
                        return;
                    }
                    throw new IllegalArgumentException("Package/uid mismatch: uid=" + i11 + " package=" + string);
                case 2:
                    c.this.f26907y.a(new o1.h(jVar, new l(message.replyTo)));
                    return;
                case 3:
                    Bundle bundle2 = data.getBundle("data_options");
                    MediaSessionCompat.a(bundle2);
                    String string2 = data.getString("data_media_item_id");
                    IBinder a10 = f0.j.a(data, "data_callback_token");
                    c.this.f26907y.a(new o1.i(jVar, new l(message.replyTo), string2, a10, bundle2));
                    return;
                case 4:
                    String string3 = data.getString("data_media_item_id");
                    IBinder a11 = f0.j.a(data, "data_callback_token");
                    c.this.f26907y.a(new o1.j(jVar, new l(message.replyTo), string3, a11));
                    return;
                case 5:
                    String string4 = data.getString("data_media_item_id");
                    c.b bVar = (c.b) data.getParcelable("data_result_receiver");
                    l lVar2 = new l(message.replyTo);
                    jVar.getClass();
                    if (!TextUtils.isEmpty(string4) && bVar != null) {
                        c.this.f26907y.a(new o1.k(jVar, lVar2, string4, bVar));
                        return;
                    }
                    return;
                case 6:
                    Bundle bundle3 = data.getBundle("data_root_hints");
                    MediaSessionCompat.a(bundle3);
                    l lVar3 = new l(message.replyTo);
                    String string5 = data.getString("data_package_name");
                    int i13 = data.getInt("data_calling_pid");
                    c.this.f26907y.a(new o1.l(data.getInt("data_calling_uid"), i13, bundle3, jVar, lVar3, string5));
                    return;
                case 7:
                    c.this.f26907y.a(new o1.m(jVar, new l(message.replyTo)));
                    return;
                case 8:
                    Bundle bundle4 = data.getBundle("data_search_extras");
                    MediaSessionCompat.a(bundle4);
                    String string6 = data.getString("data_search_query");
                    c.b bVar2 = (c.b) data.getParcelable("data_result_receiver");
                    l lVar4 = new l(message.replyTo);
                    jVar.getClass();
                    if (!TextUtils.isEmpty(string6) && bVar2 != null) {
                        c.this.f26907y.a(new n(jVar, lVar4, string6, bundle4, bVar2));
                        return;
                    }
                    return;
                case 9:
                    Bundle bundle5 = data.getBundle("data_custom_action_extras");
                    MediaSessionCompat.a(bundle5);
                    String string7 = data.getString("data_custom_action");
                    c.b bVar3 = (c.b) data.getParcelable("data_result_receiver");
                    l lVar5 = new l(message.replyTo);
                    jVar.getClass();
                    if (!TextUtils.isEmpty(string7) && bVar3 != null) {
                        c.this.f26907y.a(new o(jVar, lVar5, string7, bundle5, bVar3));
                        return;
                    }
                    return;
                default:
                    Log.w("MBServiceCompat", "Unhandled message: " + message + "\n  Service version: 2\n  Client version: " + message.arg1);
                    return;
            }
        }

        @Override // android.os.Handler
        public final boolean sendMessageAtTime(Message message, long j10) {
            Bundle data = message.getData();
            data.setClassLoader(MediaBrowserCompat.class.getClassLoader());
            data.putInt("data_calling_uid", Binder.getCallingUid());
            int callingPid = Binder.getCallingPid();
            if (callingPid > 0) {
                data.putInt("data_calling_pid", callingPid);
            } else if (!data.containsKey("data_calling_pid")) {
                data.putInt("data_calling_pid", -1);
            }
            return super.sendMessageAtTime(message, j10);
        }
    }

    public static List a(Bundle bundle, ArrayList arrayList) {
        if (arrayList == null) {
            return null;
        }
        int i6 = bundle.getInt("android.media.browse.extra.PAGE", -1);
        int i10 = bundle.getInt("android.media.browse.extra.PAGE_SIZE", -1);
        if (i6 == -1 && i10 == -1) {
            return arrayList;
        }
        int i11 = i10 * i6;
        int i12 = i11 + i10;
        if (i6 >= 0 && i10 >= 1 && i11 < arrayList.size()) {
            if (i12 > arrayList.size()) {
                i12 = arrayList.size();
            }
            return arrayList.subList(i11, i12);
        }
        return Collections.emptyList();
    }

    public abstract a b(String str);

    public abstract void c(String str, h<List<MediaBrowserCompat.MediaItem>> hVar);

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        return this.f26903u.f26919b.onBind(intent);
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        int i6 = Build.VERSION.SDK_INT;
        if (i6 >= 28) {
            this.f26903u = new g(this);
        } else if (i6 >= 26) {
            this.f26903u = new f();
        } else if (i6 >= 23) {
            this.f26903u = new e();
        } else {
            this.f26903u = new d();
        }
        this.f26903u.a();
    }

    @Override // android.app.Service
    public final void dump(FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
    }
}
