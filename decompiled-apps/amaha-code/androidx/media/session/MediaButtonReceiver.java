package androidx.media.session;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.media.session.MediaSession;
import android.os.Build;
import android.os.Messenger;
import android.os.RemoteException;
import android.support.v4.media.MediaBrowserCompat;
import android.support.v4.media.session.MediaControllerCompat;
import android.support.v4.media.session.MediaSessionCompat;
import android.util.Log;
import android.view.KeyEvent;
import g0.a;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.List;
/* loaded from: classes.dex */
public class MediaButtonReceiver extends BroadcastReceiver {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ int f2487a = 0;

    /* loaded from: classes.dex */
    public static class a extends MediaBrowserCompat.c {

        /* renamed from: c  reason: collision with root package name */
        public final Context f2488c;

        /* renamed from: d  reason: collision with root package name */
        public final Intent f2489d;

        /* renamed from: e  reason: collision with root package name */
        public final BroadcastReceiver.PendingResult f2490e;
        public MediaBrowserCompat f;

        public a(Context context, Intent intent, BroadcastReceiver.PendingResult pendingResult) {
            this.f2488c = context;
            this.f2489d = intent;
            this.f2490e = pendingResult;
        }

        @Override // android.support.v4.media.MediaBrowserCompat.c
        public final void a() {
            MediaBrowserCompat.e eVar = this.f.f820a;
            if (eVar.f835i == null) {
                MediaSession.Token sessionToken = eVar.f829b.getSessionToken();
                MediaSessionCompat.Token token = null;
                if (sessionToken != null) {
                    token = new MediaSessionCompat.Token(sessionToken, null);
                }
                eVar.f835i = token;
            }
            MediaSessionCompat.Token token2 = eVar.f835i;
            new ConcurrentHashMap();
            if (token2 != null) {
                MediaControllerCompat.MediaControllerImplApi21 mediaControllerImplApi21 = new MediaControllerCompat.MediaControllerImplApi21(this.f2488c, token2);
                KeyEvent keyEvent = (KeyEvent) this.f2489d.getParcelableExtra("android.intent.extra.KEY_EVENT");
                if (keyEvent != null) {
                    mediaControllerImplApi21.f863a.dispatchMediaButtonEvent(keyEvent);
                    d();
                    return;
                }
                throw new IllegalArgumentException("KeyEvent may not be null");
            }
            throw new IllegalArgumentException("sessionToken must not be null");
        }

        @Override // android.support.v4.media.MediaBrowserCompat.c
        public final void b() {
            d();
        }

        @Override // android.support.v4.media.MediaBrowserCompat.c
        public final void c() {
            d();
        }

        public final void d() {
            Messenger messenger;
            MediaBrowserCompat.e eVar = this.f.f820a;
            MediaBrowserCompat.i iVar = eVar.f833g;
            if (iVar != null && (messenger = eVar.f834h) != null) {
                try {
                    iVar.a(7, null, messenger);
                } catch (RemoteException unused) {
                    Log.i("MediaBrowserCompat", "Remote error unregistering client messenger.");
                }
            }
            eVar.f829b.disconnect();
            this.f2490e.finish();
        }
    }

    public static ComponentName a(Context context, String str) {
        PackageManager packageManager = context.getPackageManager();
        Intent intent = new Intent(str);
        intent.setPackage(context.getPackageName());
        List<ResolveInfo> queryIntentServices = packageManager.queryIntentServices(intent, 0);
        if (queryIntentServices.size() == 1) {
            ServiceInfo serviceInfo = queryIntentServices.get(0).serviceInfo;
            return new ComponentName(serviceInfo.packageName, serviceInfo.name);
        } else if (queryIntentServices.isEmpty()) {
            return null;
        } else {
            StringBuilder g5 = d.g("Expected 1 service that handles ", str, ", found ");
            g5.append(queryIntentServices.size());
            throw new IllegalStateException(g5.toString());
        }
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (intent != null && "android.intent.action.MEDIA_BUTTON".equals(intent.getAction()) && intent.hasExtra("android.intent.extra.KEY_EVENT")) {
            ComponentName a10 = a(context, "android.intent.action.MEDIA_BUTTON");
            if (a10 != null) {
                intent.setComponent(a10);
                Object obj = g0.a.f16164a;
                if (Build.VERSION.SDK_INT >= 26) {
                    a.f.b(context, intent);
                    return;
                } else {
                    context.startService(intent);
                    return;
                }
            }
            ComponentName a11 = a(context, "android.media.browse.MediaBrowserService");
            if (a11 != null) {
                BroadcastReceiver.PendingResult goAsync = goAsync();
                Context applicationContext = context.getApplicationContext();
                a aVar = new a(applicationContext, intent, goAsync);
                MediaBrowserCompat mediaBrowserCompat = new MediaBrowserCompat(applicationContext, a11, aVar);
                aVar.f = mediaBrowserCompat;
                Log.d("MediaBrowserCompat", "Connecting to a MediaBrowserService.");
                mediaBrowserCompat.f820a.f829b.connect();
                return;
            }
            throw new IllegalStateException("Could not find any Service that handles android.intent.action.MEDIA_BUTTON or implements a media browser service.");
        }
        Log.d("MediaButtonReceiver", "Ignore unsupported intent: " + intent);
    }
}
