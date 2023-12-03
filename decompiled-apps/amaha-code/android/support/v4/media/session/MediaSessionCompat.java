package android.support.v4.media.session;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import android.media.MediaDescription;
import android.media.MediaMetadata;
import android.media.Rating;
import android.media.session.MediaSession;
import android.media.session.MediaSessionManager;
import android.media.session.PlaybackState;
import android.net.Uri;
import android.os.BadParcelableException;
import android.os.Binder;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteCallbackList;
import android.os.RemoteException;
import android.os.ResultReceiver;
import android.os.SystemClock;
import android.support.v4.media.MediaDescriptionCompat;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.RatingCompat;
import android.support.v4.media.session.PlaybackStateCompat;
import android.support.v4.media.session.b;
import android.text.TextUtils;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import androidx.media.session.MediaButtonReceiver;
import androidx.versionedparcelable.ParcelImpl;
import f0.j;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import o1.p;
/* loaded from: classes.dex */
public final class MediaSessionCompat {

    /* renamed from: d  reason: collision with root package name */
    public static final int f877d;

    /* renamed from: e  reason: collision with root package name */
    public static int f878e;

    /* renamed from: a  reason: collision with root package name */
    public final c f879a;

    /* renamed from: b  reason: collision with root package name */
    public final MediaControllerCompat f880b;

    /* renamed from: c  reason: collision with root package name */
    public final ArrayList<g> f881c;

    /* loaded from: classes.dex */
    public static final class ResultReceiverWrapper implements Parcelable {
        public static final Parcelable.Creator<ResultReceiverWrapper> CREATOR = new a();

        /* renamed from: u  reason: collision with root package name */
        public final ResultReceiver f885u;

        /* loaded from: classes.dex */
        public class a implements Parcelable.Creator<ResultReceiverWrapper> {
            @Override // android.os.Parcelable.Creator
            public final ResultReceiverWrapper createFromParcel(Parcel parcel) {
                return new ResultReceiverWrapper(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public final ResultReceiverWrapper[] newArray(int i6) {
                return new ResultReceiverWrapper[i6];
            }
        }

        public ResultReceiverWrapper(Parcel parcel) {
            this.f885u = (ResultReceiver) ResultReceiver.CREATOR.createFromParcel(parcel);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i6) {
            this.f885u.writeToParcel(parcel, i6);
        }
    }

    /* loaded from: classes.dex */
    public static final class Token implements Parcelable {
        public static final Parcelable.Creator<Token> CREATOR = new a();

        /* renamed from: v  reason: collision with root package name */
        public final Object f887v;

        /* renamed from: w  reason: collision with root package name */
        public android.support.v4.media.session.b f888w;

        /* renamed from: u  reason: collision with root package name */
        public final Object f886u = new Object();

        /* renamed from: x  reason: collision with root package name */
        public j2.c f889x = null;

        /* loaded from: classes.dex */
        public class a implements Parcelable.Creator<Token> {
            @Override // android.os.Parcelable.Creator
            public final Token createFromParcel(Parcel parcel) {
                return new Token(parcel.readParcelable(null), null);
            }

            @Override // android.os.Parcelable.Creator
            public final Token[] newArray(int i6) {
                return new Token[i6];
            }
        }

        public Token(Object obj, android.support.v4.media.session.b bVar) {
            this.f887v = obj;
            this.f888w = bVar;
        }

        public final android.support.v4.media.session.b a() {
            android.support.v4.media.session.b bVar;
            synchronized (this.f886u) {
                bVar = this.f888w;
            }
            return bVar;
        }

        public final void b(android.support.v4.media.session.b bVar) {
            synchronized (this.f886u) {
                this.f888w = bVar;
            }
        }

        public final void c(j2.c cVar) {
            synchronized (this.f886u) {
                this.f889x = cVar;
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Token)) {
                return false;
            }
            Token token = (Token) obj;
            Object obj2 = this.f887v;
            if (obj2 == null) {
                if (token.f887v == null) {
                    return true;
                }
                return false;
            }
            Object obj3 = token.f887v;
            if (obj3 == null) {
                return false;
            }
            return obj2.equals(obj3);
        }

        public final int hashCode() {
            Object obj = this.f887v;
            if (obj == null) {
                return 0;
            }
            return obj.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i6) {
            parcel.writeParcelable((Parcelable) this.f887v, i6);
        }
    }

    /* loaded from: classes.dex */
    public interface b {
        a a();

        void b(p pVar);

        p c();

        PlaybackStateCompat p();
    }

    /* loaded from: classes.dex */
    public static class d extends c {
        public d(Context context, String str) {
            super(context, str);
        }
    }

    /* loaded from: classes.dex */
    public static class f extends e {
        public f(Context context, String str) {
            super(context, str);
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.c
        public final MediaSession d(Context context, String str) {
            return new MediaSession(context, str, null);
        }
    }

    /* loaded from: classes.dex */
    public interface g {
        void a();
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x002c, code lost:
        if (r0 == false) goto L12;
     */
    static {
        boolean z10;
        int i6 = Build.VERSION.SDK_INT;
        boolean z11 = true;
        int i10 = 0;
        if (i6 < 31) {
            if (i6 >= 30) {
                String str = Build.VERSION.CODENAME;
                if (!"REL".equals(str)) {
                    Locale locale = Locale.ROOT;
                    if (str.toUpperCase(locale).compareTo("S".toUpperCase(locale)) >= 0) {
                        z10 = true;
                    }
                }
                z10 = false;
            }
            z11 = false;
        }
        if (z11) {
            i10 = 33554432;
        }
        f877d = i10;
    }

    public MediaSessionCompat() {
        throw null;
    }

    public MediaSessionCompat(Context context, String str, ComponentName componentName, PendingIntent pendingIntent) {
        this.f881c = new ArrayList<>();
        if (context != null) {
            if (!TextUtils.isEmpty(str)) {
                if (componentName == null) {
                    int i6 = MediaButtonReceiver.f2487a;
                    Intent intent = new Intent("android.intent.action.MEDIA_BUTTON");
                    intent.setPackage(context.getPackageName());
                    List<ResolveInfo> queryBroadcastReceivers = context.getPackageManager().queryBroadcastReceivers(intent, 0);
                    if (queryBroadcastReceivers.size() == 1) {
                        ActivityInfo activityInfo = queryBroadcastReceivers.get(0).activityInfo;
                        componentName = new ComponentName(activityInfo.packageName, activityInfo.name);
                    } else {
                        if (queryBroadcastReceivers.size() > 1) {
                            Log.w("MediaButtonReceiver", "More than one BroadcastReceiver that handles android.intent.action.MEDIA_BUTTON was found, returning null.");
                        }
                        componentName = null;
                    }
                    if (componentName == null) {
                        Log.w("MediaSessionCompat", "Couldn't find a unique registered media button receiver in the given context.");
                    }
                }
                if (componentName != null && pendingIntent == null) {
                    Intent intent2 = new Intent("android.intent.action.MEDIA_BUTTON");
                    intent2.setComponent(componentName);
                    pendingIntent = PendingIntent.getBroadcast(context, 0, intent2, f877d);
                }
                int i10 = Build.VERSION.SDK_INT;
                if (i10 >= 29) {
                    this.f879a = new f(context, str);
                } else if (i10 >= 28) {
                    this.f879a = new e(context, str);
                } else if (i10 >= 22) {
                    this.f879a = new d(context, str);
                } else {
                    this.f879a = new c(context, str);
                }
                f(new android.support.v4.media.session.c(), new Handler(Looper.myLooper() != null ? Looper.myLooper() : Looper.getMainLooper()));
                this.f879a.g(pendingIntent);
                this.f880b = new MediaControllerCompat(context, this);
                if (f878e == 0) {
                    f878e = (int) (TypedValue.applyDimension(1, 320.0f, context.getResources().getDisplayMetrics()) + 0.5f);
                    return;
                }
                return;
            }
            throw new IllegalArgumentException("tag must not be null or empty");
        }
        throw new IllegalArgumentException("context must not be null");
    }

    public static void a(Bundle bundle) {
        if (bundle != null) {
            bundle.setClassLoader(MediaSessionCompat.class.getClassLoader());
        }
    }

    public static PlaybackStateCompat b(PlaybackStateCompat playbackStateCompat, MediaMetadataCompat mediaMetadataCompat) {
        long j10;
        long j11;
        if (playbackStateCompat == null) {
            return playbackStateCompat;
        }
        long j12 = -1;
        long j13 = playbackStateCompat.f916v;
        if (j13 == -1) {
            return playbackStateCompat;
        }
        int i6 = playbackStateCompat.f915u;
        if (i6 != 3 && i6 != 4 && i6 != 5) {
            return playbackStateCompat;
        }
        if (playbackStateCompat.B <= 0) {
            return playbackStateCompat;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j14 = (playbackStateCompat.f918x * ((float) (elapsedRealtime - j10))) + j13;
        if (mediaMetadataCompat != null && mediaMetadataCompat.f854u.containsKey("android.media.metadata.DURATION")) {
            j12 = mediaMetadataCompat.c("android.media.metadata.DURATION");
        }
        if (j12 >= 0 && j14 > j12) {
            j11 = j12;
        } else if (j14 < 0) {
            j11 = 0;
        } else {
            j11 = j14;
        }
        ArrayList arrayList = new ArrayList();
        long j15 = playbackStateCompat.f917w;
        long j16 = playbackStateCompat.f919y;
        int i10 = playbackStateCompat.f920z;
        CharSequence charSequence = playbackStateCompat.A;
        ArrayList arrayList2 = playbackStateCompat.C;
        if (arrayList2 != null) {
            arrayList.addAll(arrayList2);
        }
        return new PlaybackStateCompat(playbackStateCompat.f915u, j11, j15, playbackStateCompat.f918x, j16, i10, charSequence, elapsedRealtime, arrayList, playbackStateCompat.D, playbackStateCompat.E);
    }

    public static Bundle l(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        a(bundle);
        try {
            bundle.isEmpty();
            return bundle;
        } catch (BadParcelableException unused) {
            Log.e("MediaSessionCompat", "Could not unparcel the data.");
            return null;
        }
    }

    public final void c() {
        c cVar = this.f879a;
        cVar.f901e = true;
        cVar.f.kill();
        int i6 = Build.VERSION.SDK_INT;
        MediaSession mediaSession = cVar.f897a;
        if (i6 == 27) {
            try {
                Field declaredField = mediaSession.getClass().getDeclaredField("mCallback");
                declaredField.setAccessible(true);
                Handler handler = (Handler) declaredField.get(mediaSession);
                if (handler != null) {
                    handler.removeCallbacksAndMessages(null);
                }
            } catch (Exception e10) {
                Log.w("MediaSessionCompat", "Exception happened while accessing MediaSession.mCallback.", e10);
            }
        }
        mediaSession.setCallback(null);
        mediaSession.release();
    }

    public final void d(String str) {
        if (!TextUtils.isEmpty(str)) {
            c cVar = this.f879a;
            if (Build.VERSION.SDK_INT < 23) {
                RemoteCallbackList<android.support.v4.media.session.a> remoteCallbackList = cVar.f;
                int beginBroadcast = remoteCallbackList.beginBroadcast();
                while (true) {
                    beginBroadcast--;
                    if (beginBroadcast < 0) {
                        break;
                    }
                    try {
                        remoteCallbackList.getBroadcastItem(beginBroadcast).A(null, str);
                    } catch (RemoteException unused) {
                    }
                }
                remoteCallbackList.finishBroadcast();
            }
            cVar.f897a.sendSessionEvent(str, null);
            return;
        }
        throw new IllegalArgumentException("event cannot be null or empty");
    }

    public final void e(boolean z10) {
        this.f879a.f897a.setActive(z10);
        Iterator<g> it = this.f881c.iterator();
        while (it.hasNext()) {
            it.next().a();
        }
    }

    public final void f(a aVar, Handler handler) {
        c cVar = this.f879a;
        if (aVar == null) {
            cVar.f(null, null);
            return;
        }
        if (handler == null) {
            handler = new Handler();
        }
        cVar.f(aVar, handler);
    }

    public final void g(MediaMetadataCompat mediaMetadataCompat) {
        MediaMetadata mediaMetadata;
        c cVar = this.f879a;
        cVar.f904i = mediaMetadataCompat;
        if (mediaMetadataCompat == null) {
            mediaMetadata = null;
        } else {
            if (mediaMetadataCompat.f855v == null) {
                Parcel obtain = Parcel.obtain();
                mediaMetadataCompat.writeToParcel(obtain, 0);
                obtain.setDataPosition(0);
                mediaMetadataCompat.f855v = (MediaMetadata) MediaMetadata.CREATOR.createFromParcel(obtain);
                obtain.recycle();
            }
            mediaMetadata = mediaMetadataCompat.f855v;
        }
        cVar.f897a.setMetadata(mediaMetadata);
    }

    public final void h(PlaybackStateCompat playbackStateCompat) {
        c cVar = this.f879a;
        cVar.f902g = playbackStateCompat;
        RemoteCallbackList<android.support.v4.media.session.a> remoteCallbackList = cVar.f;
        int beginBroadcast = remoteCallbackList.beginBroadcast();
        while (true) {
            beginBroadcast--;
            if (beginBroadcast < 0) {
                break;
            }
            try {
                remoteCallbackList.getBroadcastItem(beginBroadcast).M1(playbackStateCompat);
            } catch (RemoteException unused) {
            }
        }
        remoteCallbackList.finishBroadcast();
        if (playbackStateCompat.F == null) {
            PlaybackState.Builder d10 = PlaybackStateCompat.b.d();
            PlaybackStateCompat.b.x(d10, playbackStateCompat.f915u, playbackStateCompat.f916v, playbackStateCompat.f918x, playbackStateCompat.B);
            PlaybackStateCompat.b.u(d10, playbackStateCompat.f917w);
            PlaybackStateCompat.b.s(d10, playbackStateCompat.f919y);
            PlaybackStateCompat.b.v(d10, playbackStateCompat.A);
            for (PlaybackStateCompat.CustomAction customAction : playbackStateCompat.C) {
                PlaybackState.CustomAction customAction2 = customAction.f925y;
                if (customAction2 == null) {
                    PlaybackState.CustomAction.Builder e10 = PlaybackStateCompat.b.e(customAction.f921u, customAction.f922v, customAction.f923w);
                    PlaybackStateCompat.b.w(e10, customAction.f924x);
                    customAction2 = PlaybackStateCompat.b.b(e10);
                }
                PlaybackStateCompat.b.a(d10, customAction2);
            }
            PlaybackStateCompat.b.t(d10, playbackStateCompat.D);
            if (Build.VERSION.SDK_INT >= 22) {
                PlaybackStateCompat.c.b(d10, playbackStateCompat.E);
            }
            playbackStateCompat.F = PlaybackStateCompat.b.c(d10);
        }
        cVar.f897a.setPlaybackState(playbackStateCompat.F);
    }

    public final void i(List<QueueItem> list) {
        if (list != null) {
            HashSet hashSet = new HashSet();
            for (QueueItem queueItem : list) {
                if (queueItem != null) {
                    long j10 = queueItem.f883v;
                    if (hashSet.contains(Long.valueOf(j10))) {
                        Log.e("MediaSessionCompat", "Found duplicate queue id: " + j10, new IllegalArgumentException("id of each queue item should be unique"));
                    }
                    hashSet.add(Long.valueOf(j10));
                } else {
                    throw new IllegalArgumentException("queue shouldn't have null items");
                }
            }
        }
        c cVar = this.f879a;
        cVar.f903h = list;
        MediaSession mediaSession = cVar.f897a;
        if (list == null) {
            mediaSession.setQueue(null);
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (QueueItem queueItem2 : list) {
            MediaSession.QueueItem queueItem3 = queueItem2.f884w;
            if (queueItem3 == null) {
                queueItem3 = QueueItem.b.a(queueItem2.f882u.b(), queueItem2.f883v);
                queueItem2.f884w = queueItem3;
            }
            arrayList.add(queueItem3);
        }
        mediaSession.setQueue(arrayList);
    }

    public final void j(int i6) {
        c cVar = this.f879a;
        if (cVar.f905j != i6) {
            cVar.f905j = i6;
            RemoteCallbackList<android.support.v4.media.session.a> remoteCallbackList = cVar.f;
            int beginBroadcast = remoteCallbackList.beginBroadcast();
            while (true) {
                beginBroadcast--;
                if (beginBroadcast >= 0) {
                    try {
                        remoteCallbackList.getBroadcastItem(beginBroadcast).y(i6);
                    } catch (RemoteException unused) {
                    }
                } else {
                    remoteCallbackList.finishBroadcast();
                    return;
                }
            }
        }
    }

    public final void k(int i6) {
        c cVar = this.f879a;
        if (cVar.f906k != i6) {
            cVar.f906k = i6;
            RemoteCallbackList<android.support.v4.media.session.a> remoteCallbackList = cVar.f;
            int beginBroadcast = remoteCallbackList.beginBroadcast();
            while (true) {
                beginBroadcast--;
                if (beginBroadcast >= 0) {
                    try {
                        remoteCallbackList.getBroadcastItem(beginBroadcast).h1(i6);
                    } catch (RemoteException unused) {
                    }
                } else {
                    remoteCallbackList.finishBroadcast();
                    return;
                }
            }
        }
    }

    /* loaded from: classes.dex */
    public static final class QueueItem implements Parcelable {
        public static final Parcelable.Creator<QueueItem> CREATOR = new a();

        /* renamed from: u  reason: collision with root package name */
        public final MediaDescriptionCompat f882u;

        /* renamed from: v  reason: collision with root package name */
        public final long f883v;

        /* renamed from: w  reason: collision with root package name */
        public MediaSession.QueueItem f884w;

        /* loaded from: classes.dex */
        public class a implements Parcelable.Creator<QueueItem> {
            @Override // android.os.Parcelable.Creator
            public final QueueItem createFromParcel(Parcel parcel) {
                return new QueueItem(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public final QueueItem[] newArray(int i6) {
                return new QueueItem[i6];
            }
        }

        /* loaded from: classes.dex */
        public static class b {
            public static MediaSession.QueueItem a(MediaDescription mediaDescription, long j10) {
                return new MediaSession.QueueItem(mediaDescription, j10);
            }

            public static MediaDescription b(MediaSession.QueueItem queueItem) {
                return queueItem.getDescription();
            }

            public static long c(MediaSession.QueueItem queueItem) {
                return queueItem.getQueueId();
            }
        }

        public QueueItem() {
            throw null;
        }

        public QueueItem(MediaSession.QueueItem queueItem, MediaDescriptionCompat mediaDescriptionCompat, long j10) {
            if (mediaDescriptionCompat == null) {
                throw new IllegalArgumentException("Description cannot be null");
            }
            if (j10 != -1) {
                this.f882u = mediaDescriptionCompat;
                this.f883v = j10;
                this.f884w = queueItem;
                return;
            }
            throw new IllegalArgumentException("Id cannot be QueueItem.UNKNOWN_ID");
        }

        public static ArrayList a(List list) {
            QueueItem queueItem;
            if (list == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                if (obj != null) {
                    MediaSession.QueueItem queueItem2 = (MediaSession.QueueItem) obj;
                    queueItem = new QueueItem(queueItem2, MediaDescriptionCompat.a(b.b(queueItem2)), b.c(queueItem2));
                } else {
                    queueItem = null;
                }
                arrayList.add(queueItem);
            }
            return arrayList;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final String toString() {
            return "MediaSession.QueueItem {Description=" + this.f882u + ", Id=" + this.f883v + " }";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i6) {
            this.f882u.writeToParcel(parcel, i6);
            parcel.writeLong(this.f883v);
        }

        public QueueItem(Parcel parcel) {
            this.f882u = MediaDescriptionCompat.CREATOR.createFromParcel(parcel);
            this.f883v = parcel.readLong();
        }
    }

    /* loaded from: classes.dex */
    public static class c implements b {

        /* renamed from: a  reason: collision with root package name */
        public final MediaSession f897a;

        /* renamed from: b  reason: collision with root package name */
        public final Token f898b;

        /* renamed from: d  reason: collision with root package name */
        public final Bundle f900d;

        /* renamed from: g  reason: collision with root package name */
        public PlaybackStateCompat f902g;

        /* renamed from: h  reason: collision with root package name */
        public List<QueueItem> f903h;

        /* renamed from: i  reason: collision with root package name */
        public MediaMetadataCompat f904i;

        /* renamed from: j  reason: collision with root package name */
        public int f905j;

        /* renamed from: k  reason: collision with root package name */
        public int f906k;

        /* renamed from: l  reason: collision with root package name */
        public a f907l;

        /* renamed from: m  reason: collision with root package name */
        public p f908m;

        /* renamed from: c  reason: collision with root package name */
        public final Object f899c = new Object();

        /* renamed from: e  reason: collision with root package name */
        public boolean f901e = false;
        public final RemoteCallbackList<android.support.v4.media.session.a> f = new RemoteCallbackList<>();

        public c(Context context, String str) {
            MediaSession d10 = d(context, str);
            this.f897a = d10;
            this.f898b = new Token(d10.getSessionToken(), new a());
            this.f900d = null;
            d10.setFlags(3);
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.b
        public final a a() {
            a aVar;
            synchronized (this.f899c) {
                aVar = this.f907l;
            }
            return aVar;
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.b
        public void b(p pVar) {
            synchronized (this.f899c) {
                this.f908m = pVar;
            }
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.b
        public p c() {
            p pVar;
            synchronized (this.f899c) {
                pVar = this.f908m;
            }
            return pVar;
        }

        public MediaSession d(Context context, String str) {
            return new MediaSession(context, str);
        }

        public final String e() {
            MediaSession mediaSession = this.f897a;
            if (Build.VERSION.SDK_INT < 24) {
                return null;
            }
            try {
                return (String) mediaSession.getClass().getMethod("getCallingPackage", new Class[0]).invoke(mediaSession, new Object[0]);
            } catch (Exception e10) {
                Log.e("MediaSessionCompat", "Cannot execute MediaSession.getCallingPackage()", e10);
                return null;
            }
        }

        public final void f(a aVar, Handler handler) {
            a.b bVar;
            synchronized (this.f899c) {
                this.f907l = aVar;
                MediaSession mediaSession = this.f897a;
                if (aVar == null) {
                    bVar = null;
                } else {
                    bVar = aVar.f891v;
                }
                mediaSession.setCallback(bVar, handler);
                if (aVar != null) {
                    aVar.h0(this, handler);
                }
            }
        }

        public final void g(PendingIntent pendingIntent) {
            this.f897a.setMediaButtonReceiver(pendingIntent);
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.b
        public final PlaybackStateCompat p() {
            return this.f902g;
        }

        /* loaded from: classes.dex */
        public class a extends b.a {
            public a() {
            }

            @Override // android.support.v4.media.session.b
            public final void A0() {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public final void B(int i6) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public final void B1(int i6) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public final long C() {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public final void C0(Uri uri, Bundle bundle) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public final void E0(long j10) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public final void H(android.support.v4.media.session.a aVar) {
                c cVar = c.this;
                if (!cVar.f901e) {
                    cVar.f.register(aVar, new p("android.media.session.MediaController", Binder.getCallingPid(), Binder.getCallingUid()));
                }
            }

            @Override // android.support.v4.media.session.b
            public final void I0(float f) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public final String J1() {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public final boolean L0(KeyEvent keyEvent) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public final void L1(Bundle bundle, String str) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public final void N(RatingCompat ratingCompat) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public final void O(Bundle bundle, String str) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public final void P(Uri uri, Bundle bundle) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public final void P0(RatingCompat ratingCompat, Bundle bundle) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public final void R0(MediaDescriptionCompat mediaDescriptionCompat, int i6) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public final void T(MediaDescriptionCompat mediaDescriptionCompat) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public final boolean U() {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public final void U0(boolean z10) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public final void X(MediaDescriptionCompat mediaDescriptionCompat) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public final PendingIntent Y() {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public final void a0() {
                c.this.getClass();
            }

            @Override // android.support.v4.media.session.b
            public final int a1() {
                return c.this.f906k;
            }

            @Override // android.support.v4.media.session.b
            public final void b1(int i6) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public final void d1() {
                c.this.getClass();
            }

            @Override // android.support.v4.media.session.b
            public final Bundle getExtras() {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public final void h0(int i6, int i10) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public final void j1(Bundle bundle, String str) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public final void l() {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public final void l1(String str, Bundle bundle, ResultReceiverWrapper resultReceiverWrapper) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public final List<QueueItem> m1() {
                return null;
            }

            @Override // android.support.v4.media.session.b
            public final CharSequence n0() {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public final void n1() {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public final void next() {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public final PlaybackStateCompat p() {
                c cVar = c.this;
                return MediaSessionCompat.b(cVar.f902g, cVar.f904i);
            }

            @Override // android.support.v4.media.session.b
            public final void p1(Bundle bundle, String str) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public final void pause() {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public final void previous() {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public final void q() {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public final void q0(Bundle bundle, String str) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public final int r() {
                return c.this.f905j;
            }

            @Override // android.support.v4.media.session.b
            public final MediaMetadataCompat r0() {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public final void stop() {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public final Bundle t0() {
                c cVar = c.this;
                if (cVar.f900d == null) {
                    return null;
                }
                return new Bundle(cVar.f900d);
            }

            @Override // android.support.v4.media.session.b
            public final void u0(android.support.v4.media.session.a aVar) {
                c.this.f.unregister(aVar);
            }

            @Override // android.support.v4.media.session.b
            public final void u1(long j10) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public final ParcelableVolumeInfo v1() {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public final String w() {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public final void z0(int i6, int i10) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public final void M() {
            }

            @Override // android.support.v4.media.session.b
            public final void V() {
            }
        }
    }

    /* loaded from: classes.dex */
    public static abstract class a {

        /* renamed from: w  reason: collision with root package name */
        public boolean f892w;

        /* renamed from: y  reason: collision with root package name */
        public HandlerC0015a f894y;

        /* renamed from: u  reason: collision with root package name */
        public final Object f890u = new Object();

        /* renamed from: v  reason: collision with root package name */
        public final b f891v = new b();

        /* renamed from: x  reason: collision with root package name */
        public WeakReference<b> f893x = new WeakReference<>(null);

        /* renamed from: android.support.v4.media.session.MediaSessionCompat$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public class HandlerC0015a extends Handler {
            public HandlerC0015a(Looper looper) {
                super(looper);
            }

            @Override // android.os.Handler
            public final void handleMessage(Message message) {
                b bVar;
                a aVar;
                HandlerC0015a handlerC0015a;
                if (message.what == 1) {
                    synchronized (a.this.f890u) {
                        bVar = a.this.f893x.get();
                        aVar = a.this;
                        handlerC0015a = aVar.f894y;
                    }
                    if (bVar != null && aVar == bVar.a() && handlerC0015a != null) {
                        bVar.b((p) message.obj);
                        a.this.d(bVar, handlerC0015a);
                        bVar.b(null);
                    }
                }
            }
        }

        /* loaded from: classes.dex */
        public class b extends MediaSession.Callback {
            public b() {
            }

            public static void b(c cVar) {
                if (Build.VERSION.SDK_INT >= 28) {
                    return;
                }
                String e10 = cVar.e();
                if (TextUtils.isEmpty(e10)) {
                    e10 = "android.media.session.MediaController";
                }
                cVar.b(new p(e10, -1, -1));
            }

            public final c a() {
                c cVar;
                synchronized (a.this.f890u) {
                    cVar = (c) a.this.f893x.get();
                }
                if (cVar == null || a.this != cVar.a()) {
                    return null;
                }
                return cVar;
            }

            @Override // android.media.session.MediaSession.Callback
            public final void onCommand(String str, Bundle bundle, ResultReceiver resultReceiver) {
                QueueItem queueItem;
                IBinder asBinder;
                j2.c cVar;
                c a10 = a();
                if (a10 == null) {
                    return;
                }
                MediaSessionCompat.a(bundle);
                b(a10);
                try {
                    if (str.equals("android.support.v4.media.session.command.GET_EXTRA_BINDER")) {
                        Bundle bundle2 = new Bundle();
                        Token token = a10.f898b;
                        android.support.v4.media.session.b a11 = token.a();
                        if (a11 == null) {
                            asBinder = null;
                        } else {
                            asBinder = a11.asBinder();
                        }
                        j.b(bundle2, "android.support.v4.media.session.EXTRA_BINDER", asBinder);
                        synchronized (token.f886u) {
                            cVar = token.f889x;
                        }
                        if (cVar != null) {
                            Bundle bundle3 = new Bundle();
                            bundle3.putParcelable("a", new ParcelImpl(cVar));
                            bundle2.putParcelable("android.support.v4.media.session.SESSION_TOKEN2", bundle3);
                        }
                        resultReceiver.send(0, bundle2);
                    } else if (str.equals("android.support.v4.media.session.command.ADD_QUEUE_ITEM")) {
                        a aVar = a.this;
                        MediaDescriptionCompat mediaDescriptionCompat = (MediaDescriptionCompat) bundle.getParcelable("android.support.v4.media.session.command.ARGUMENT_MEDIA_DESCRIPTION");
                        aVar.j();
                    } else if (str.equals("android.support.v4.media.session.command.ADD_QUEUE_ITEM_AT")) {
                        a aVar2 = a.this;
                        MediaDescriptionCompat mediaDescriptionCompat2 = (MediaDescriptionCompat) bundle.getParcelable("android.support.v4.media.session.command.ARGUMENT_MEDIA_DESCRIPTION");
                        bundle.getInt("android.support.v4.media.session.command.ARGUMENT_INDEX");
                        aVar2.k();
                    } else if (str.equals("android.support.v4.media.session.command.REMOVE_QUEUE_ITEM")) {
                        a aVar3 = a.this;
                        MediaDescriptionCompat mediaDescriptionCompat3 = (MediaDescriptionCompat) bundle.getParcelable("android.support.v4.media.session.command.ARGUMENT_MEDIA_DESCRIPTION");
                        aVar3.O();
                    } else if (str.equals("android.support.v4.media.session.command.REMOVE_QUEUE_ITEM_AT")) {
                        if (a10.f903h != null) {
                            int i6 = bundle.getInt("android.support.v4.media.session.command.ARGUMENT_INDEX", -1);
                            if (i6 >= 0 && i6 < a10.f903h.size()) {
                                queueItem = a10.f903h.get(i6);
                            } else {
                                queueItem = null;
                            }
                            if (queueItem != null) {
                                a.this.O();
                            }
                        }
                    } else {
                        a.this.m(str, bundle, resultReceiver);
                    }
                } catch (BadParcelableException unused) {
                    Log.e("MediaSessionCompat", "Could not unparcel the extra data.");
                }
                a10.b(null);
            }

            @Override // android.media.session.MediaSession.Callback
            public final void onCustomAction(String str, Bundle bundle) {
                c a10 = a();
                if (a10 == null) {
                    return;
                }
                MediaSessionCompat.a(bundle);
                b(a10);
                try {
                    boolean equals = str.equals("android.support.v4.media.session.action.PLAY_FROM_URI");
                    a aVar = a.this;
                    if (equals) {
                        Bundle bundle2 = bundle.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS");
                        MediaSessionCompat.a(bundle2);
                        aVar.H((Uri) bundle.getParcelable("android.support.v4.media.session.action.ARGUMENT_URI"), bundle2);
                    } else if (str.equals("android.support.v4.media.session.action.PREPARE")) {
                        aVar.I();
                    } else if (str.equals("android.support.v4.media.session.action.PREPARE_FROM_MEDIA_ID")) {
                        String string = bundle.getString("android.support.v4.media.session.action.ARGUMENT_MEDIA_ID");
                        Bundle bundle3 = bundle.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS");
                        MediaSessionCompat.a(bundle3);
                        aVar.J(string, bundle3);
                    } else if (str.equals("android.support.v4.media.session.action.PREPARE_FROM_SEARCH")) {
                        String string2 = bundle.getString("android.support.v4.media.session.action.ARGUMENT_QUERY");
                        Bundle bundle4 = bundle.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS");
                        MediaSessionCompat.a(bundle4);
                        aVar.K(string2, bundle4);
                    } else if (str.equals("android.support.v4.media.session.action.PREPARE_FROM_URI")) {
                        Bundle bundle5 = bundle.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS");
                        MediaSessionCompat.a(bundle5);
                        aVar.M((Uri) bundle.getParcelable("android.support.v4.media.session.action.ARGUMENT_URI"), bundle5);
                    } else if (str.equals("android.support.v4.media.session.action.SET_CAPTIONING_ENABLED")) {
                        bundle.getBoolean("android.support.v4.media.session.action.ARGUMENT_CAPTIONING_ENABLED");
                        aVar.S();
                    } else if (str.equals("android.support.v4.media.session.action.SET_REPEAT_MODE")) {
                        aVar.Y(bundle.getInt("android.support.v4.media.session.action.ARGUMENT_REPEAT_MODE"));
                    } else if (str.equals("android.support.v4.media.session.action.SET_SHUFFLE_MODE")) {
                        aVar.Z(bundle.getInt("android.support.v4.media.session.action.ARGUMENT_SHUFFLE_MODE"));
                    } else if (str.equals("android.support.v4.media.session.action.SET_RATING")) {
                        RatingCompat ratingCompat = (RatingCompat) bundle.getParcelable("android.support.v4.media.session.action.ARGUMENT_RATING");
                        MediaSessionCompat.a(bundle.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS"));
                        aVar.X();
                    } else if (str.equals("android.support.v4.media.session.action.SET_PLAYBACK_SPEED")) {
                        aVar.U(bundle.getFloat("android.support.v4.media.session.action.ARGUMENT_PLAYBACK_SPEED", 1.0f));
                    } else {
                        aVar.n(str, bundle);
                    }
                } catch (BadParcelableException unused) {
                    Log.e("MediaSessionCompat", "Could not unparcel the data.");
                }
                a10.b(null);
            }

            @Override // android.media.session.MediaSession.Callback
            public final void onFastForward() {
                c a10 = a();
                if (a10 == null) {
                    return;
                }
                b(a10);
                a.this.o();
                a10.b(null);
            }

            @Override // android.media.session.MediaSession.Callback
            public final boolean onMediaButtonEvent(Intent intent) {
                c a10 = a();
                if (a10 == null) {
                    return false;
                }
                b(a10);
                boolean p10 = a.this.p(intent);
                a10.b(null);
                if (!p10 && !super.onMediaButtonEvent(intent)) {
                    return false;
                }
                return true;
            }

            @Override // android.media.session.MediaSession.Callback
            public final void onPause() {
                c a10 = a();
                if (a10 == null) {
                    return;
                }
                b(a10);
                a.this.u();
                a10.b(null);
            }

            @Override // android.media.session.MediaSession.Callback
            public final void onPlay() {
                c a10 = a();
                if (a10 == null) {
                    return;
                }
                b(a10);
                a.this.B();
                a10.b(null);
            }

            @Override // android.media.session.MediaSession.Callback
            public final void onPlayFromMediaId(String str, Bundle bundle) {
                c a10 = a();
                if (a10 == null) {
                    return;
                }
                MediaSessionCompat.a(bundle);
                b(a10);
                a.this.E(str, bundle);
                a10.b(null);
            }

            @Override // android.media.session.MediaSession.Callback
            public final void onPlayFromSearch(String str, Bundle bundle) {
                c a10 = a();
                if (a10 == null) {
                    return;
                }
                MediaSessionCompat.a(bundle);
                b(a10);
                a.this.F(str, bundle);
                a10.b(null);
            }

            @Override // android.media.session.MediaSession.Callback
            public final void onPlayFromUri(Uri uri, Bundle bundle) {
                c a10 = a();
                if (a10 == null) {
                    return;
                }
                MediaSessionCompat.a(bundle);
                b(a10);
                a.this.H(uri, bundle);
                a10.b(null);
            }

            @Override // android.media.session.MediaSession.Callback
            public final void onPrepare() {
                c a10 = a();
                if (a10 == null) {
                    return;
                }
                b(a10);
                a.this.I();
                a10.b(null);
            }

            @Override // android.media.session.MediaSession.Callback
            public final void onPrepareFromMediaId(String str, Bundle bundle) {
                c a10 = a();
                if (a10 == null) {
                    return;
                }
                MediaSessionCompat.a(bundle);
                b(a10);
                a.this.J(str, bundle);
                a10.b(null);
            }

            @Override // android.media.session.MediaSession.Callback
            public final void onPrepareFromSearch(String str, Bundle bundle) {
                c a10 = a();
                if (a10 == null) {
                    return;
                }
                MediaSessionCompat.a(bundle);
                b(a10);
                a.this.K(str, bundle);
                a10.b(null);
            }

            @Override // android.media.session.MediaSession.Callback
            public final void onPrepareFromUri(Uri uri, Bundle bundle) {
                c a10 = a();
                if (a10 == null) {
                    return;
                }
                MediaSessionCompat.a(bundle);
                b(a10);
                a.this.M(uri, bundle);
                a10.b(null);
            }

            @Override // android.media.session.MediaSession.Callback
            public final void onRewind() {
                c a10 = a();
                if (a10 == null) {
                    return;
                }
                b(a10);
                a.this.P();
                a10.b(null);
            }

            @Override // android.media.session.MediaSession.Callback
            public final void onSeekTo(long j10) {
                c a10 = a();
                if (a10 == null) {
                    return;
                }
                b(a10);
                a.this.Q(j10);
                a10.b(null);
            }

            @Override // android.media.session.MediaSession.Callback
            public final void onSetPlaybackSpeed(float f) {
                c a10 = a();
                if (a10 == null) {
                    return;
                }
                b(a10);
                a.this.U(f);
                a10.b(null);
            }

            @Override // android.media.session.MediaSession.Callback
            public final void onSetRating(Rating rating) {
                c a10 = a();
                if (a10 == null) {
                    return;
                }
                b(a10);
                RatingCompat.a(rating);
                a.this.W();
                a10.b(null);
            }

            @Override // android.media.session.MediaSession.Callback
            public final void onSkipToNext() {
                c a10 = a();
                if (a10 == null) {
                    return;
                }
                b(a10);
                a.this.a0();
                a10.b(null);
            }

            @Override // android.media.session.MediaSession.Callback
            public final void onSkipToPrevious() {
                c a10 = a();
                if (a10 == null) {
                    return;
                }
                b(a10);
                a.this.b0();
                a10.b(null);
            }

            @Override // android.media.session.MediaSession.Callback
            public final void onSkipToQueueItem(long j10) {
                c a10 = a();
                if (a10 == null) {
                    return;
                }
                b(a10);
                a.this.c0(j10);
                a10.b(null);
            }

            @Override // android.media.session.MediaSession.Callback
            public final void onStop() {
                c a10 = a();
                if (a10 == null) {
                    return;
                }
                b(a10);
                a.this.g0();
                a10.b(null);
            }
        }

        public final void d(b bVar, HandlerC0015a handlerC0015a) {
            long j10;
            boolean z10;
            boolean z11;
            if (!this.f892w) {
                return;
            }
            boolean z12 = false;
            this.f892w = false;
            handlerC0015a.removeMessages(1);
            PlaybackStateCompat p10 = bVar.p();
            if (p10 == null) {
                j10 = 0;
            } else {
                j10 = p10.f919y;
            }
            if (p10 != null && p10.f915u == 3) {
                z10 = true;
            } else {
                z10 = false;
            }
            if ((516 & j10) != 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            if ((j10 & 514) != 0) {
                z12 = true;
            }
            if (z10 && z12) {
                u();
            } else if (!z10 && z11) {
                B();
            }
        }

        public final void h0(b bVar, Handler handler) {
            synchronized (this.f890u) {
                this.f893x = new WeakReference<>(bVar);
                HandlerC0015a handlerC0015a = this.f894y;
                HandlerC0015a handlerC0015a2 = null;
                if (handlerC0015a != null) {
                    handlerC0015a.removeCallbacksAndMessages(null);
                }
                if (bVar != null && handler != null) {
                    handlerC0015a2 = new HandlerC0015a(handler.getLooper());
                }
                this.f894y = handlerC0015a2;
            }
        }

        public boolean p(Intent intent) {
            b bVar;
            HandlerC0015a handlerC0015a;
            KeyEvent keyEvent;
            long j10;
            if (Build.VERSION.SDK_INT >= 27) {
                return false;
            }
            synchronized (this.f890u) {
                bVar = this.f893x.get();
                handlerC0015a = this.f894y;
            }
            if (bVar == null || handlerC0015a == null || (keyEvent = (KeyEvent) intent.getParcelableExtra("android.intent.extra.KEY_EVENT")) == null || keyEvent.getAction() != 0) {
                return false;
            }
            p c10 = bVar.c();
            int keyCode = keyEvent.getKeyCode();
            if (keyCode != 79 && keyCode != 85) {
                d(bVar, handlerC0015a);
                return false;
            }
            if (keyEvent.getRepeatCount() == 0) {
                if (this.f892w) {
                    handlerC0015a.removeMessages(1);
                    this.f892w = false;
                    PlaybackStateCompat p10 = bVar.p();
                    if (p10 == null) {
                        j10 = 0;
                    } else {
                        j10 = p10.f919y;
                    }
                    if ((j10 & 32) != 0) {
                        a0();
                    }
                } else {
                    this.f892w = true;
                    handlerC0015a.sendMessageDelayed(handlerC0015a.obtainMessage(1, c10), ViewConfiguration.getDoubleTapTimeout());
                }
            } else {
                d(bVar, handlerC0015a);
            }
            return true;
        }

        public void B() {
        }

        public void I() {
        }

        public void O() {
        }

        public void P() {
        }

        public void S() {
        }

        public void W() {
        }

        public void X() {
        }

        public void a0() {
        }

        public void b0() {
        }

        public void g0() {
        }

        public void j() {
        }

        public void k() {
        }

        public void o() {
        }

        public void u() {
        }

        public void Q(long j10) {
        }

        public void U(float f) {
        }

        public void Y(int i6) {
        }

        public void Z(int i6) {
        }

        public void c0(long j10) {
        }

        public void E(String str, Bundle bundle) {
        }

        public void F(String str, Bundle bundle) {
        }

        public void H(Uri uri, Bundle bundle) {
        }

        public void J(String str, Bundle bundle) {
        }

        public void K(String str, Bundle bundle) {
        }

        public void M(Uri uri, Bundle bundle) {
        }

        public void n(String str, Bundle bundle) {
        }

        public void m(String str, Bundle bundle, ResultReceiver resultReceiver) {
        }
    }

    /* loaded from: classes.dex */
    public static class e extends d {
        public e(Context context, String str) {
            super(context, str);
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.c, android.support.v4.media.session.MediaSessionCompat.b
        public final p c() {
            MediaSessionManager.RemoteUserInfo currentControllerInfo;
            currentControllerInfo = this.f897a.getCurrentControllerInfo();
            return new p(currentControllerInfo);
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.c, android.support.v4.media.session.MediaSessionCompat.b
        public final void b(p pVar) {
        }
    }
}
