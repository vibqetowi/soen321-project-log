package w5;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.text.TextUtils;
import g6.p;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
/* compiled from: PlatformServiceClient.kt */
/* loaded from: classes.dex */
public abstract class y implements ServiceConnection {
    public final int A;
    public final String B;
    public final int C;
    public final String D;

    /* renamed from: u  reason: collision with root package name */
    public final Context f36557u;

    /* renamed from: v  reason: collision with root package name */
    public final x f36558v;

    /* renamed from: w  reason: collision with root package name */
    public a f36559w;

    /* renamed from: x  reason: collision with root package name */
    public boolean f36560x;

    /* renamed from: y  reason: collision with root package name */
    public Messenger f36561y;

    /* renamed from: z  reason: collision with root package name */
    public final int f36562z;

    /* compiled from: PlatformServiceClient.kt */
    /* loaded from: classes.dex */
    public interface a {
    }

    public y(Context context, String applicationId, String str) {
        kotlin.jvm.internal.i.g(applicationId, "applicationId");
        Context applicationContext = context.getApplicationContext();
        this.f36557u = applicationContext != null ? applicationContext : context;
        this.f36562z = 65536;
        this.A = 65537;
        this.B = applicationId;
        this.C = 20121101;
        this.D = str;
        this.f36558v = new x(this);
    }

    public final void a(Bundle bundle) {
        boolean z10;
        if (!this.f36560x) {
            return;
        }
        boolean z11 = false;
        this.f36560x = false;
        a aVar = this.f36559w;
        if (aVar != null) {
            dd.a aVar2 = (dd.a) aVar;
            g6.k this$0 = (g6.k) aVar2.f12813v;
            p.d request = (p.d) aVar2.f12814w;
            kotlin.jvm.internal.i.g(this$0, "this$0");
            kotlin.jvm.internal.i.g(request, "$request");
            g6.j jVar = this$0.f16282w;
            if (jVar != null) {
                jVar.f36559w = null;
            }
            this$0.f16282w = null;
            p.a aVar3 = this$0.d().f16300y;
            if (aVar3 != null) {
                aVar3.b();
            }
            if (bundle != null) {
                List stringArrayList = bundle.getStringArrayList("com.facebook.platform.extra.PERMISSIONS");
                if (stringArrayList == null) {
                    stringArrayList = is.w.f20676u;
                }
                Set<String> set = request.f16303v;
                if (set == null) {
                    set = is.y.f20678u;
                }
                String string = bundle.getString("com.facebook.platform.extra.ID_TOKEN");
                if (set.contains("openid")) {
                    if (string != null && string.length() != 0) {
                        z10 = false;
                    } else {
                        z10 = true;
                    }
                    if (z10) {
                        this$0.d().j();
                        return;
                    }
                }
                if (stringArrayList.containsAll(set)) {
                    String string2 = bundle.getString("com.facebook.platform.extra.USER_ID");
                    if ((string2 == null || string2.length() == 0) ? true : true) {
                        p.a aVar4 = this$0.d().f16300y;
                        if (aVar4 != null) {
                            aVar4.a();
                        }
                        String string3 = bundle.getString("com.facebook.platform.extra.ACCESS_TOKEN");
                        if (string3 != null) {
                            e0.p(new g6.l(bundle, this$0, request), string3);
                            return;
                        }
                        throw new IllegalStateException("Required value was null.".toString());
                    }
                    this$0.l(bundle, request);
                    return;
                }
                HashSet hashSet = new HashSet();
                for (String str : set) {
                    if (!stringArrayList.contains(str)) {
                        hashSet.add(str);
                    }
                }
                if (!hashSet.isEmpty()) {
                    this$0.a(TextUtils.join(",", hashSet), "new_permissions");
                }
                request.f16303v = hashSet;
            }
            this$0.d().j();
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName name, IBinder service) {
        kotlin.jvm.internal.i.g(name, "name");
        kotlin.jvm.internal.i.g(service, "service");
        this.f36561y = new Messenger(service);
        Bundle bundle = new Bundle();
        bundle.putString("com.facebook.platform.extra.APPLICATION_ID", this.B);
        String str = this.D;
        if (str != null) {
            bundle.putString("com.facebook.platform.extra.NONCE", str);
        }
        Message obtain = Message.obtain((Handler) null, this.f36562z);
        obtain.arg1 = this.C;
        obtain.setData(bundle);
        obtain.replyTo = new Messenger(this.f36558v);
        try {
            Messenger messenger = this.f36561y;
            if (messenger != null) {
                messenger.send(obtain);
            }
        } catch (RemoteException unused) {
            a(null);
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName name) {
        kotlin.jvm.internal.i.g(name, "name");
        this.f36561y = null;
        try {
            this.f36557u.unbindService(this);
        } catch (IllegalArgumentException unused) {
        }
        a(null);
    }
}
