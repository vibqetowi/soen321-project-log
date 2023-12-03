package f0;

import android.app.AppOpsManager;
import android.app.Notification;
import android.app.NotificationManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.ApplicationInfo;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Build;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Message;
import android.os.RemoteException;
import android.provider.Settings;
import android.util.Log;
import b.a;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
/* compiled from: NotificationManagerCompat.java */
/* loaded from: classes.dex */
public final class y {

    /* renamed from: d  reason: collision with root package name */
    public static String f14693d;

    /* renamed from: g  reason: collision with root package name */
    public static c f14695g;

    /* renamed from: a  reason: collision with root package name */
    public final Context f14696a;

    /* renamed from: b  reason: collision with root package name */
    public final NotificationManager f14697b;

    /* renamed from: c  reason: collision with root package name */
    public static final Object f14692c = new Object();

    /* renamed from: e  reason: collision with root package name */
    public static HashSet f14694e = new HashSet();
    public static final Object f = new Object();

    /* compiled from: NotificationManagerCompat.java */
    /* loaded from: classes.dex */
    public static class a implements d {

        /* renamed from: a  reason: collision with root package name */
        public final String f14698a;

        /* renamed from: b  reason: collision with root package name */
        public final int f14699b;

        /* renamed from: c  reason: collision with root package name */
        public final String f14700c = null;

        /* renamed from: d  reason: collision with root package name */
        public final Notification f14701d;

        public a(String str, int i6, Notification notification) {
            this.f14698a = str;
            this.f14699b = i6;
            this.f14701d = notification;
        }

        @Override // f0.y.d
        public final void a(b.a aVar) {
            aVar.D1(this.f14698a, this.f14699b, this.f14700c, this.f14701d);
        }

        public final String toString() {
            StringBuilder sb2 = new StringBuilder("NotifyTask[packageName:");
            sb2.append(this.f14698a);
            sb2.append(", id:");
            sb2.append(this.f14699b);
            sb2.append(", tag:");
            return r1.b0.b(sb2, this.f14700c, "]");
        }
    }

    /* compiled from: NotificationManagerCompat.java */
    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public final ComponentName f14702a;

        /* renamed from: b  reason: collision with root package name */
        public final IBinder f14703b;

        public b(ComponentName componentName, IBinder iBinder) {
            this.f14702a = componentName;
            this.f14703b = iBinder;
        }
    }

    /* compiled from: NotificationManagerCompat.java */
    /* loaded from: classes.dex */
    public static class c implements Handler.Callback, ServiceConnection {

        /* renamed from: u  reason: collision with root package name */
        public final Context f14704u;

        /* renamed from: v  reason: collision with root package name */
        public final Handler f14705v;

        /* renamed from: w  reason: collision with root package name */
        public final HashMap f14706w = new HashMap();

        /* renamed from: x  reason: collision with root package name */
        public HashSet f14707x = new HashSet();

        /* compiled from: NotificationManagerCompat.java */
        /* loaded from: classes.dex */
        public static class a {

            /* renamed from: a  reason: collision with root package name */
            public final ComponentName f14708a;

            /* renamed from: c  reason: collision with root package name */
            public b.a f14710c;

            /* renamed from: b  reason: collision with root package name */
            public boolean f14709b = false;

            /* renamed from: d  reason: collision with root package name */
            public final ArrayDeque<d> f14711d = new ArrayDeque<>();

            /* renamed from: e  reason: collision with root package name */
            public int f14712e = 0;

            public a(ComponentName componentName) {
                this.f14708a = componentName;
            }
        }

        public c(Context context) {
            this.f14704u = context;
            HandlerThread handlerThread = new HandlerThread("NotificationManagerCompat");
            handlerThread.start();
            this.f14705v = new Handler(handlerThread.getLooper(), this);
        }

        public final void a(a aVar) {
            boolean z10;
            boolean isLoggable = Log.isLoggable("NotifManCompat", 3);
            ComponentName componentName = aVar.f14708a;
            ArrayDeque<d> arrayDeque = aVar.f14711d;
            if (isLoggable) {
                Log.d("NotifManCompat", "Processing component " + componentName + ", " + arrayDeque.size() + " queued tasks");
            }
            if (arrayDeque.isEmpty()) {
                return;
            }
            if (aVar.f14709b) {
                z10 = true;
            } else {
                Intent component = new Intent("android.support.BIND_NOTIFICATION_SIDE_CHANNEL").setComponent(componentName);
                Context context = this.f14704u;
                boolean bindService = context.bindService(component, this, 33);
                aVar.f14709b = bindService;
                if (bindService) {
                    aVar.f14712e = 0;
                } else {
                    Log.w("NotifManCompat", "Unable to bind to listener " + componentName);
                    context.unbindService(this);
                }
                z10 = aVar.f14709b;
            }
            if (z10 && aVar.f14710c != null) {
                while (true) {
                    d peek = arrayDeque.peek();
                    if (peek == null) {
                        break;
                    }
                    try {
                        if (Log.isLoggable("NotifManCompat", 3)) {
                            Log.d("NotifManCompat", "Sending task " + peek);
                        }
                        peek.a(aVar.f14710c);
                        arrayDeque.remove();
                    } catch (DeadObjectException unused) {
                        if (Log.isLoggable("NotifManCompat", 3)) {
                            Log.d("NotifManCompat", "Remote service has died: " + componentName);
                        }
                    } catch (RemoteException e10) {
                        Log.w("NotifManCompat", "RemoteException communicating with " + componentName, e10);
                    }
                }
                if (!arrayDeque.isEmpty()) {
                    b(aVar);
                    return;
                }
                return;
            }
            b(aVar);
        }

        public final void b(a aVar) {
            Handler handler = this.f14705v;
            ComponentName componentName = aVar.f14708a;
            if (handler.hasMessages(3, componentName)) {
                return;
            }
            int i6 = aVar.f14712e + 1;
            aVar.f14712e = i6;
            if (i6 > 6) {
                StringBuilder sb2 = new StringBuilder("Giving up on delivering ");
                ArrayDeque<d> arrayDeque = aVar.f14711d;
                sb2.append(arrayDeque.size());
                sb2.append(" tasks to ");
                sb2.append(componentName);
                sb2.append(" after ");
                sb2.append(aVar.f14712e);
                sb2.append(" retries");
                Log.w("NotifManCompat", sb2.toString());
                arrayDeque.clear();
                return;
            }
            int i10 = (1 << (i6 - 1)) * 1000;
            if (Log.isLoggable("NotifManCompat", 3)) {
                Log.d("NotifManCompat", "Scheduling retry for " + i10 + " ms");
            }
            handler.sendMessageDelayed(handler.obtainMessage(3, componentName), i10);
        }

        @Override // android.os.Handler.Callback
        public final boolean handleMessage(Message message) {
            HashSet hashSet;
            int i6 = message.what;
            b.a aVar = null;
            if (i6 != 0) {
                if (i6 != 1) {
                    if (i6 != 2) {
                        if (i6 != 3) {
                            return false;
                        }
                        a aVar2 = (a) this.f14706w.get((ComponentName) message.obj);
                        if (aVar2 != null) {
                            a(aVar2);
                        }
                        return true;
                    }
                    a aVar3 = (a) this.f14706w.get((ComponentName) message.obj);
                    if (aVar3 != null) {
                        if (aVar3.f14709b) {
                            this.f14704u.unbindService(this);
                            aVar3.f14709b = false;
                        }
                        aVar3.f14710c = null;
                    }
                    return true;
                }
                b bVar = (b) message.obj;
                ComponentName componentName = bVar.f14702a;
                IBinder iBinder = bVar.f14703b;
                a aVar4 = (a) this.f14706w.get(componentName);
                if (aVar4 != null) {
                    int i10 = a.AbstractBinderC0070a.f3902a;
                    if (iBinder != null) {
                        IInterface queryLocalInterface = iBinder.queryLocalInterface("android.support.v4.app.INotificationSideChannel");
                        if (queryLocalInterface != null && (queryLocalInterface instanceof b.a)) {
                            aVar = (b.a) queryLocalInterface;
                        } else {
                            aVar = new a.AbstractBinderC0070a.C0071a(iBinder);
                        }
                    }
                    aVar4.f14710c = aVar;
                    aVar4.f14712e = 0;
                    a(aVar4);
                }
                return true;
            }
            d dVar = (d) message.obj;
            String string = Settings.Secure.getString(this.f14704u.getContentResolver(), "enabled_notification_listeners");
            synchronized (y.f14692c) {
                if (string != null) {
                    try {
                        if (!string.equals(y.f14693d)) {
                            String[] split = string.split(":", -1);
                            HashSet hashSet2 = new HashSet(split.length);
                            for (String str : split) {
                                ComponentName unflattenFromString = ComponentName.unflattenFromString(str);
                                if (unflattenFromString != null) {
                                    hashSet2.add(unflattenFromString.getPackageName());
                                }
                            }
                            y.f14694e = hashSet2;
                            y.f14693d = string;
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                hashSet = y.f14694e;
            }
            if (!hashSet.equals(this.f14707x)) {
                this.f14707x = hashSet;
                List<ResolveInfo> queryIntentServices = this.f14704u.getPackageManager().queryIntentServices(new Intent().setAction("android.support.BIND_NOTIFICATION_SIDE_CHANNEL"), 0);
                HashSet hashSet3 = new HashSet();
                for (ResolveInfo resolveInfo : queryIntentServices) {
                    if (hashSet.contains(resolveInfo.serviceInfo.packageName)) {
                        ServiceInfo serviceInfo = resolveInfo.serviceInfo;
                        ComponentName componentName2 = new ComponentName(serviceInfo.packageName, serviceInfo.name);
                        if (resolveInfo.serviceInfo.permission != null) {
                            Log.w("NotifManCompat", "Permission present on component " + componentName2 + ", not adding listener record.");
                        } else {
                            hashSet3.add(componentName2);
                        }
                    }
                }
                Iterator it = hashSet3.iterator();
                while (it.hasNext()) {
                    ComponentName componentName3 = (ComponentName) it.next();
                    if (!this.f14706w.containsKey(componentName3)) {
                        if (Log.isLoggable("NotifManCompat", 3)) {
                            Log.d("NotifManCompat", "Adding listener record for " + componentName3);
                        }
                        this.f14706w.put(componentName3, new a(componentName3));
                    }
                }
                Iterator it2 = this.f14706w.entrySet().iterator();
                while (it2.hasNext()) {
                    Map.Entry entry = (Map.Entry) it2.next();
                    if (!hashSet3.contains(entry.getKey())) {
                        if (Log.isLoggable("NotifManCompat", 3)) {
                            Log.d("NotifManCompat", "Removing listener record for " + entry.getKey());
                        }
                        a aVar5 = (a) entry.getValue();
                        if (aVar5.f14709b) {
                            this.f14704u.unbindService(this);
                            aVar5.f14709b = false;
                        }
                        aVar5.f14710c = null;
                        it2.remove();
                    }
                }
            }
            for (a aVar6 : this.f14706w.values()) {
                aVar6.f14711d.add(dVar);
                a(aVar6);
            }
            return true;
        }

        @Override // android.content.ServiceConnection
        public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            if (Log.isLoggable("NotifManCompat", 3)) {
                Log.d("NotifManCompat", "Connected to service " + componentName);
            }
            this.f14705v.obtainMessage(1, new b(componentName, iBinder)).sendToTarget();
        }

        @Override // android.content.ServiceConnection
        public final void onServiceDisconnected(ComponentName componentName) {
            if (Log.isLoggable("NotifManCompat", 3)) {
                Log.d("NotifManCompat", "Disconnected from service " + componentName);
            }
            this.f14705v.obtainMessage(2, componentName).sendToTarget();
        }
    }

    /* compiled from: NotificationManagerCompat.java */
    /* loaded from: classes.dex */
    public interface d {
        void a(b.a aVar);
    }

    public y(Context context) {
        this.f14696a = context;
        this.f14697b = (NotificationManager) context.getSystemService("notification");
    }

    public final boolean a() {
        boolean areNotificationsEnabled;
        if (Build.VERSION.SDK_INT >= 24) {
            areNotificationsEnabled = this.f14697b.areNotificationsEnabled();
            return areNotificationsEnabled;
        }
        Context context = this.f14696a;
        AppOpsManager appOpsManager = (AppOpsManager) context.getSystemService("appops");
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        String packageName = context.getApplicationContext().getPackageName();
        int i6 = applicationInfo.uid;
        try {
            Class<?> cls = Class.forName(AppOpsManager.class.getName());
            Class<?> cls2 = Integer.TYPE;
            if (((Integer) cls.getMethod("checkOpNoThrow", cls2, cls2, String.class).invoke(appOpsManager, Integer.valueOf(((Integer) cls.getDeclaredField("OP_POST_NOTIFICATION").get(Integer.class)).intValue()), Integer.valueOf(i6), packageName)).intValue() == 0) {
                return true;
            }
            return false;
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchFieldException | NoSuchMethodException | RuntimeException | InvocationTargetException unused) {
            return true;
        }
    }
}
