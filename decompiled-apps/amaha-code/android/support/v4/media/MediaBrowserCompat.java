package android.support.v4.media;

import android.content.ComponentName;
import android.content.Context;
import android.media.MediaDescription;
import android.media.browse.MediaBrowser;
import android.media.session.MediaSession;
import android.os.BadParcelableException;
import android.os.Binder;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Process;
import android.os.RemoteException;
import android.support.v4.media.session.MediaSessionCompat;
import android.support.v4.media.session.b;
import android.text.TextUtils;
import android.util.Log;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import ql.n;
/* loaded from: classes.dex */
public final class MediaBrowserCompat {

    /* renamed from: b  reason: collision with root package name */
    public static final boolean f819b = Log.isLoggable("MediaBrowserCompat", 3);

    /* renamed from: a  reason: collision with root package name */
    public final e f820a;

    /* loaded from: classes.dex */
    public static class ItemReceiver extends c.b {
        @Override // c.b
        public final void a(int i6, Bundle bundle) {
            if (bundle != null) {
                bundle = MediaSessionCompat.l(bundle);
            }
            if (i6 == 0 && bundle != null && bundle.containsKey("media_item")) {
                Parcelable parcelable = bundle.getParcelable("media_item");
                if (parcelable != null && !(parcelable instanceof MediaItem)) {
                    throw null;
                }
                MediaItem mediaItem = (MediaItem) parcelable;
                throw null;
            }
            throw null;
        }
    }

    /* loaded from: classes.dex */
    public static class SearchResultReceiver extends c.b {
        @Override // c.b
        public final void a(int i6, Bundle bundle) {
            if (bundle != null) {
                bundle = MediaSessionCompat.l(bundle);
            }
            if (i6 == 0 && bundle != null && bundle.containsKey("search_results")) {
                Parcelable[] parcelableArray = bundle.getParcelableArray("search_results");
                parcelableArray.getClass();
                ArrayList arrayList = new ArrayList();
                for (Parcelable parcelable : parcelableArray) {
                    arrayList.add((MediaItem) parcelable);
                }
                throw null;
            }
            throw null;
        }
    }

    /* loaded from: classes.dex */
    public static class a {
        public static MediaDescription a(MediaBrowser.MediaItem mediaItem) {
            return mediaItem.getDescription();
        }

        public static int b(MediaBrowser.MediaItem mediaItem) {
            return mediaItem.getFlags();
        }
    }

    /* loaded from: classes.dex */
    public static class b extends Handler {

        /* renamed from: a  reason: collision with root package name */
        public final WeakReference<h> f823a;

        /* renamed from: b  reason: collision with root package name */
        public WeakReference<Messenger> f824b;

        public b(h hVar) {
            this.f823a = new WeakReference<>(hVar);
        }

        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            WeakReference<Messenger> weakReference = this.f824b;
            if (weakReference != null && weakReference.get() != null) {
                WeakReference<h> weakReference2 = this.f823a;
                if (weakReference2.get() != null) {
                    Bundle data = message.getData();
                    MediaSessionCompat.a(data);
                    h hVar = weakReference2.get();
                    Messenger messenger = this.f824b.get();
                    try {
                        int i6 = message.what;
                        if (i6 != 1) {
                            if (i6 != 2) {
                                if (i6 != 3) {
                                    Log.w("MediaBrowserCompat", "Unhandled message: " + message + "\n  Client version: 1\n  Service version: " + message.arg1);
                                } else {
                                    Bundle bundle = data.getBundle("data_options");
                                    MediaSessionCompat.a(bundle);
                                    MediaSessionCompat.a(data.getBundle("data_notify_children_changed_options"));
                                    hVar.b(messenger, data.getString("data_media_item_id"), data.getParcelableArrayList("data_media_item_list"), bundle);
                                }
                            } else {
                                hVar.a();
                            }
                        } else {
                            MediaSessionCompat.a(data.getBundle("data_root_hints"));
                            data.getString("data_media_item_id");
                            MediaSessionCompat.Token token = (MediaSessionCompat.Token) data.getParcelable("data_media_session_token");
                            hVar.c();
                        }
                    } catch (BadParcelableException unused) {
                        Log.e("MediaBrowserCompat", "Could not unparcel the data.");
                        if (message.what == 1) {
                            hVar.a();
                        }
                    }
                }
            }
        }
    }

    /* loaded from: classes.dex */
    public static class c {

        /* renamed from: a  reason: collision with root package name */
        public final a f825a = new a();

        /* renamed from: b  reason: collision with root package name */
        public b f826b;

        /* loaded from: classes.dex */
        public class a extends MediaBrowser.ConnectionCallback {
            public a() {
            }

            @Override // android.media.browse.MediaBrowser.ConnectionCallback
            public final void onConnected() {
                MediaSessionCompat.Token token;
                c cVar = c.this;
                b bVar = cVar.f826b;
                if (bVar != null) {
                    e eVar = (e) bVar;
                    MediaBrowser mediaBrowser = eVar.f829b;
                    try {
                        Bundle extras = mediaBrowser.getExtras();
                        if (extras != null) {
                            eVar.f = extras.getInt("extra_service_version", 0);
                            IBinder a10 = f0.j.a(extras, "extra_messenger");
                            if (a10 != null) {
                                eVar.f833g = new i(a10, eVar.f830c);
                                b bVar2 = eVar.f831d;
                                Messenger messenger = new Messenger(bVar2);
                                eVar.f834h = messenger;
                                bVar2.getClass();
                                bVar2.f824b = new WeakReference<>(messenger);
                                try {
                                    i iVar = eVar.f833g;
                                    Context context = eVar.f828a;
                                    Messenger messenger2 = eVar.f834h;
                                    iVar.getClass();
                                    Bundle bundle = new Bundle();
                                    bundle.putString("data_package_name", context.getPackageName());
                                    bundle.putInt("data_calling_pid", Process.myPid());
                                    bundle.putBundle("data_root_hints", iVar.f837b);
                                    iVar.a(6, bundle, messenger2);
                                } catch (RemoteException unused) {
                                    Log.i("MediaBrowserCompat", "Remote error registering client messenger.");
                                }
                            }
                            android.support.v4.media.session.b v10 = b.a.v(f0.j.a(extras, "extra_session_binder"));
                            if (v10 != null) {
                                MediaSession.Token sessionToken = mediaBrowser.getSessionToken();
                                if (sessionToken != null) {
                                    token = new MediaSessionCompat.Token(sessionToken, v10);
                                } else {
                                    token = null;
                                }
                                eVar.f835i = token;
                            }
                        }
                    } catch (IllegalStateException e10) {
                        Log.e("MediaBrowserCompat", "Unexpected IllegalStateException", e10);
                    }
                }
                cVar.a();
            }

            @Override // android.media.browse.MediaBrowser.ConnectionCallback
            public final void onConnectionFailed() {
                c cVar = c.this;
                b bVar = cVar.f826b;
                if (bVar != null) {
                    bVar.getClass();
                }
                cVar.b();
            }

            @Override // android.media.browse.MediaBrowser.ConnectionCallback
            public final void onConnectionSuspended() {
                c cVar = c.this;
                b bVar = cVar.f826b;
                if (bVar != null) {
                    e eVar = (e) bVar;
                    eVar.f833g = null;
                    eVar.f834h = null;
                    eVar.f835i = null;
                    b bVar2 = eVar.f831d;
                    bVar2.getClass();
                    bVar2.f824b = new WeakReference<>(null);
                }
                cVar.c();
            }
        }

        /* loaded from: classes.dex */
        public interface b {
        }

        public void a() {
            throw null;
        }

        public void b() {
            throw null;
        }

        public void c() {
            throw null;
        }
    }

    /* loaded from: classes.dex */
    public interface d {
        void d(String str, k kVar);

        void e(String str, k kVar);
    }

    /* loaded from: classes.dex */
    public static class f extends e {
        public f(Context context, ComponentName componentName, c cVar) {
            super(context, componentName, cVar);
        }
    }

    /* loaded from: classes.dex */
    public static class g extends f {
        public g(Context context, ComponentName componentName, c cVar) {
            super(context, componentName, cVar);
        }

        @Override // android.support.v4.media.MediaBrowserCompat.e, android.support.v4.media.MediaBrowserCompat.d
        public final void d(String str, k kVar) {
            if (this.f833g != null && this.f >= 2) {
                super.d(str, kVar);
                return;
            }
            this.f829b.subscribe(str, kVar.f840a);
        }

        @Override // android.support.v4.media.MediaBrowserCompat.e, android.support.v4.media.MediaBrowserCompat.d
        public final void e(String str, k kVar) {
            if (this.f833g != null && this.f >= 2) {
                super.e(str, kVar);
                return;
            }
            this.f829b.unsubscribe(str, kVar.f840a);
        }
    }

    /* loaded from: classes.dex */
    public interface h {
        void a();

        void b(Messenger messenger, String str, ArrayList arrayList, Bundle bundle);

        void c();
    }

    /* loaded from: classes.dex */
    public static class i {

        /* renamed from: a  reason: collision with root package name */
        public final Messenger f836a;

        /* renamed from: b  reason: collision with root package name */
        public final Bundle f837b;

        public i(IBinder iBinder, Bundle bundle) {
            this.f836a = new Messenger(iBinder);
            this.f837b = bundle;
        }

        public final void a(int i6, Bundle bundle, Messenger messenger) {
            Message obtain = Message.obtain();
            obtain.what = i6;
            obtain.arg1 = 1;
            obtain.setData(bundle);
            obtain.replyTo = messenger;
            this.f836a.send(obtain);
        }
    }

    /* loaded from: classes.dex */
    public static class j {

        /* renamed from: a  reason: collision with root package name */
        public final ArrayList f838a = new ArrayList();

        /* renamed from: b  reason: collision with root package name */
        public final ArrayList f839b = new ArrayList();
    }

    public MediaBrowserCompat(Context context, ComponentName componentName, c cVar) {
        int i6 = Build.VERSION.SDK_INT;
        if (i6 >= 26) {
            this.f820a = new g(context, componentName, cVar);
        } else if (i6 >= 23) {
            this.f820a = new f(context, componentName, cVar);
        } else {
            this.f820a = new e(context, componentName, cVar);
        }
    }

    /* loaded from: classes.dex */
    public static class MediaItem implements Parcelable {
        public static final Parcelable.Creator<MediaItem> CREATOR = new a();

        /* renamed from: u  reason: collision with root package name */
        public final int f821u;

        /* renamed from: v  reason: collision with root package name */
        public final MediaDescriptionCompat f822v;

        /* loaded from: classes.dex */
        public class a implements Parcelable.Creator<MediaItem> {
            @Override // android.os.Parcelable.Creator
            public final MediaItem createFromParcel(Parcel parcel) {
                return new MediaItem(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public final MediaItem[] newArray(int i6) {
                return new MediaItem[i6];
            }
        }

        public MediaItem(MediaDescriptionCompat mediaDescriptionCompat, int i6) {
            if (mediaDescriptionCompat != null) {
                if (!TextUtils.isEmpty(mediaDescriptionCompat.f845u)) {
                    this.f821u = i6;
                    this.f822v = mediaDescriptionCompat;
                    return;
                }
                throw new IllegalArgumentException("description must have a non-empty media id");
            }
            throw new IllegalArgumentException("description cannot be null");
        }

        public static ArrayList a(List list) {
            MediaItem mediaItem;
            if (list == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList(list.size());
            for (Object obj : list) {
                if (obj != null) {
                    MediaBrowser.MediaItem mediaItem2 = (MediaBrowser.MediaItem) obj;
                    mediaItem = new MediaItem(MediaDescriptionCompat.a(a.a(mediaItem2)), a.b(mediaItem2));
                } else {
                    mediaItem = null;
                }
                arrayList.add(mediaItem);
            }
            return arrayList;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final String toString() {
            return "MediaItem{mFlags=" + this.f821u + ", mDescription=" + this.f822v + '}';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i6) {
            parcel.writeInt(this.f821u);
            this.f822v.writeToParcel(parcel, i6);
        }

        public MediaItem(Parcel parcel) {
            this.f821u = parcel.readInt();
            this.f822v = MediaDescriptionCompat.CREATOR.createFromParcel(parcel);
        }
    }

    /* loaded from: classes.dex */
    public static class e implements d, h, c.b {

        /* renamed from: a  reason: collision with root package name */
        public final Context f828a;

        /* renamed from: b  reason: collision with root package name */
        public final MediaBrowser f829b;

        /* renamed from: c  reason: collision with root package name */
        public final Bundle f830c;

        /* renamed from: d  reason: collision with root package name */
        public final b f831d = new b(this);

        /* renamed from: e  reason: collision with root package name */
        public final t.b<String, j> f832e = new t.b<>();
        public int f;

        /* renamed from: g  reason: collision with root package name */
        public i f833g;

        /* renamed from: h  reason: collision with root package name */
        public Messenger f834h;

        /* renamed from: i  reason: collision with root package name */
        public MediaSessionCompat.Token f835i;

        public e(Context context, ComponentName componentName, c cVar) {
            this.f828a = context;
            Bundle bundle = new Bundle();
            this.f830c = bundle;
            bundle.putInt("extra_client_version", 1);
            bundle.putInt("extra_calling_pid", Process.myPid());
            cVar.f826b = this;
            this.f829b = new MediaBrowser(context, componentName, cVar.f825a, bundle);
        }

        @Override // android.support.v4.media.MediaBrowserCompat.h
        public final void b(Messenger messenger, String str, ArrayList arrayList, Bundle bundle) {
            if (this.f834h != messenger) {
                return;
            }
            k kVar = null;
            j orDefault = this.f832e.getOrDefault(str, null);
            if (orDefault == null) {
                if (MediaBrowserCompat.f819b) {
                    Log.d("MediaBrowserCompat", "onLoadChildren for id that isn't subscribed id=" + str);
                    return;
                }
                return;
            }
            int i6 = 0;
            while (true) {
                ArrayList arrayList2 = orDefault.f839b;
                if (i6 >= arrayList2.size()) {
                    break;
                } else if (kc.f.h((Bundle) arrayList2.get(i6), bundle)) {
                    kVar = (k) orDefault.f838a.get(i6);
                    break;
                } else {
                    i6++;
                }
            }
            if (kVar != null && bundle == null && arrayList != null) {
                kVar.a(str, arrayList);
            }
        }

        @Override // android.support.v4.media.MediaBrowserCompat.d
        public void d(String str, k kVar) {
            t.b<String, j> bVar = this.f832e;
            j orDefault = bVar.getOrDefault(str, null);
            if (orDefault == null) {
                orDefault = new j();
                bVar.put(str, orDefault);
            }
            kVar.f842c = new WeakReference<>(orDefault);
            n.b bVar2 = (n.b) kVar;
            int i6 = 0;
            while (true) {
                ArrayList arrayList = orDefault.f839b;
                int size = arrayList.size();
                ArrayList arrayList2 = orDefault.f838a;
                if (i6 < size) {
                    if (kc.f.h((Bundle) arrayList.get(i6), null)) {
                        arrayList2.set(i6, bVar2);
                        break;
                    }
                    i6++;
                } else {
                    arrayList2.add(bVar2);
                    arrayList.add(null);
                    break;
                }
            }
            i iVar = this.f833g;
            if (iVar == null) {
                this.f829b.subscribe(str, kVar.f840a);
                return;
            }
            try {
                Binder binder = kVar.f841b;
                Messenger messenger = this.f834h;
                Bundle bundle = new Bundle();
                bundle.putString("data_media_item_id", str);
                f0.j.b(bundle, "data_callback_token", binder);
                bundle.putBundle("data_options", null);
                iVar.a(3, bundle, messenger);
            } catch (RemoteException unused) {
                Log.i("MediaBrowserCompat", "Remote error subscribing media item: ".concat(str));
            }
        }

        @Override // android.support.v4.media.MediaBrowserCompat.d
        public void e(String str, k kVar) {
            t.b<String, j> bVar = this.f832e;
            j orDefault = bVar.getOrDefault(str, null);
            if (orDefault == null) {
                return;
            }
            i iVar = this.f833g;
            ArrayList arrayList = orDefault.f839b;
            ArrayList arrayList2 = orDefault.f838a;
            if (iVar == null) {
                int size = arrayList2.size();
                while (true) {
                    size--;
                    if (size < 0) {
                        break;
                    } else if (arrayList2.get(size) == kVar) {
                        arrayList2.remove(size);
                        arrayList.remove(size);
                    }
                }
                if (arrayList2.size() == 0) {
                    this.f829b.unsubscribe(str);
                }
            } else {
                try {
                    int size2 = arrayList2.size();
                    while (true) {
                        size2--;
                        if (size2 < 0) {
                            break;
                        } else if (arrayList2.get(size2) == kVar) {
                            i iVar2 = this.f833g;
                            Binder binder = kVar.f841b;
                            Messenger messenger = this.f834h;
                            iVar2.getClass();
                            Bundle bundle = new Bundle();
                            bundle.putString("data_media_item_id", str);
                            f0.j.b(bundle, "data_callback_token", binder);
                            iVar2.a(4, bundle, messenger);
                            arrayList2.remove(size2);
                            arrayList.remove(size2);
                        }
                    }
                } catch (RemoteException unused) {
                    Log.d("MediaBrowserCompat", "removeSubscription failed with RemoteException parentId=".concat(str));
                }
            }
            if (arrayList2.isEmpty()) {
                bVar.remove(str);
            }
        }

        @Override // android.support.v4.media.MediaBrowserCompat.h
        public final void a() {
        }

        @Override // android.support.v4.media.MediaBrowserCompat.h
        public final void c() {
        }
    }

    /* loaded from: classes.dex */
    public static class CustomActionResultReceiver extends c.b {
        @Override // c.b
        public final void a(int i6, Bundle bundle) {
        }
    }

    /* loaded from: classes.dex */
    public static abstract class k {

        /* renamed from: a  reason: collision with root package name */
        public final a f840a;

        /* renamed from: b  reason: collision with root package name */
        public final Binder f841b = new Binder();

        /* renamed from: c  reason: collision with root package name */
        public WeakReference<j> f842c;

        /* loaded from: classes.dex */
        public class a extends MediaBrowser.SubscriptionCallback {
            public a() {
            }

            @Override // android.media.browse.MediaBrowser.SubscriptionCallback
            public final void onChildrenLoaded(String str, List<MediaBrowser.MediaItem> list) {
                j jVar;
                k kVar = k.this;
                WeakReference<j> weakReference = kVar.f842c;
                if (weakReference == null) {
                    jVar = null;
                } else {
                    jVar = weakReference.get();
                }
                if (jVar == null) {
                    kVar.a(str, MediaItem.a(list));
                    return;
                }
                ArrayList a10 = MediaItem.a(list);
                ArrayList arrayList = jVar.f838a;
                ArrayList arrayList2 = jVar.f839b;
                for (int i6 = 0; i6 < arrayList.size(); i6++) {
                    Bundle bundle = (Bundle) arrayList2.get(i6);
                    if (bundle == null) {
                        kVar.a(str, a10);
                    } else if (a10 != null) {
                        int i10 = bundle.getInt("android.media.browse.extra.PAGE", -1);
                        int i11 = bundle.getInt("android.media.browse.extra.PAGE_SIZE", -1);
                        if (i10 != -1 || i11 != -1) {
                            int i12 = i11 * i10;
                            int i13 = i12 + i11;
                            if (i10 >= 0 && i11 >= 1 && i12 < a10.size()) {
                                if (i13 > a10.size()) {
                                    i13 = a10.size();
                                }
                                a10.subList(i12, i13);
                            } else {
                                Collections.emptyList();
                            }
                        }
                    }
                }
            }

            @Override // android.media.browse.MediaBrowser.SubscriptionCallback
            public final void onError(String str) {
                k.this.getClass();
            }
        }

        /* loaded from: classes.dex */
        public class b extends a {
            public b() {
                super();
            }

            @Override // android.media.browse.MediaBrowser.SubscriptionCallback
            public final void onChildrenLoaded(String str, List<MediaBrowser.MediaItem> list, Bundle bundle) {
                MediaSessionCompat.a(bundle);
                MediaItem.a(list);
                k.this.getClass();
            }

            @Override // android.media.browse.MediaBrowser.SubscriptionCallback
            public final void onError(String str, Bundle bundle) {
                MediaSessionCompat.a(bundle);
                k.this.getClass();
            }
        }

        public k() {
            if (Build.VERSION.SDK_INT >= 26) {
                this.f840a = new b();
            } else {
                this.f840a = new a();
            }
        }

        public void a(String str, ArrayList arrayList) {
        }
    }
}
