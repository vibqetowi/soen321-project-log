package c9;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Handler;
import android.os.Looper;
import android.telephony.PhoneStateListener;
import android.telephony.ServiceState;
import android.telephony.TelephonyDisplayInfo;
import android.telephony.TelephonyManager;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
/* compiled from: NetworkTypeObserver.java */
/* loaded from: classes.dex */
public final class n {

    /* renamed from: e  reason: collision with root package name */
    public static n f5179e;

    /* renamed from: a  reason: collision with root package name */
    public final Handler f5180a = new Handler(Looper.getMainLooper());

    /* renamed from: b  reason: collision with root package name */
    public final CopyOnWriteArrayList<WeakReference<a>> f5181b = new CopyOnWriteArrayList<>();

    /* renamed from: c  reason: collision with root package name */
    public final Object f5182c = new Object();

    /* renamed from: d  reason: collision with root package name */
    public int f5183d = 0;

    /* compiled from: NetworkTypeObserver.java */
    /* loaded from: classes.dex */
    public interface a {
        void a(int i6);
    }

    /* compiled from: NetworkTypeObserver.java */
    /* loaded from: classes.dex */
    public final class b extends BroadcastReceiver {
        public b() {
        }

        /* JADX WARN: Removed duplicated region for block: B:36:0x006c A[Catch: RuntimeException -> 0x0079, TryCatch #0 {RuntimeException -> 0x0079, blocks: (B:34:0x0058, B:36:0x006c, B:38:0x0075, B:37:0x0070), top: B:43:0x0058 }] */
        /* JADX WARN: Removed duplicated region for block: B:37:0x0070 A[Catch: RuntimeException -> 0x0079, TryCatch #0 {RuntimeException -> 0x0079, blocks: (B:34:0x0058, B:36:0x006c, B:38:0x0075, B:37:0x0070), top: B:43:0x0058 }] */
        @Override // android.content.BroadcastReceiver
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void onReceive(Context context, Intent intent) {
            int i6;
            int i10;
            n nVar;
            ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
            if (connectivityManager != null) {
                try {
                    NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
                    if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
                        int type = activeNetworkInfo.getType();
                        i6 = 4;
                        if (type != 0) {
                            if (type != 1) {
                                if (type != 4 && type != 5) {
                                    if (type != 6) {
                                        if (type != 9) {
                                            i6 = 8;
                                        } else {
                                            i6 = 7;
                                        }
                                    }
                                    i6 = 5;
                                }
                            }
                            i6 = 2;
                        }
                        switch (activeNetworkInfo.getSubtype()) {
                            case 1:
                            case 2:
                                i6 = 3;
                                break;
                            case 3:
                            case 4:
                            case 5:
                            case 6:
                            case 7:
                            case 8:
                            case 9:
                            case 10:
                            case 11:
                            case 12:
                            case 14:
                            case 15:
                            case 17:
                                break;
                            case 13:
                                i6 = 5;
                                break;
                            case 16:
                            case 19:
                            default:
                                i6 = 6;
                                break;
                            case 18:
                                i6 = 2;
                                break;
                            case 20:
                                if (w.f5205a >= 29) {
                                    i6 = 9;
                                    break;
                                }
                                break;
                        }
                    } else {
                        i6 = 1;
                    }
                } catch (SecurityException unused) {
                }
                i10 = w.f5205a;
                nVar = n.this;
                if (i10 >= 29 && i6 == 5) {
                    try {
                        TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
                        telephonyManager.getClass();
                        c cVar = new c();
                        if (i10 >= 31) {
                            telephonyManager.listen(cVar, 1);
                        } else {
                            telephonyManager.listen(cVar, 1048576);
                        }
                        telephonyManager.listen(cVar, 0);
                        return;
                    } catch (RuntimeException unused2) {
                    }
                }
                n.a(nVar, i6);
            }
            i6 = 0;
            i10 = w.f5205a;
            nVar = n.this;
            if (i10 >= 29) {
                TelephonyManager telephonyManager2 = (TelephonyManager) context.getSystemService("phone");
                telephonyManager2.getClass();
                c cVar2 = new c();
                if (i10 >= 31) {
                }
                telephonyManager2.listen(cVar2, 0);
                return;
            }
            n.a(nVar, i6);
        }
    }

    /* compiled from: NetworkTypeObserver.java */
    /* loaded from: classes.dex */
    public class c extends PhoneStateListener {
        public c() {
        }

        @Override // android.telephony.PhoneStateListener
        public final void onDisplayInfoChanged(TelephonyDisplayInfo telephonyDisplayInfo) {
            int overrideNetworkType;
            boolean z10;
            int i6;
            overrideNetworkType = telephonyDisplayInfo.getOverrideNetworkType();
            if (overrideNetworkType != 3 && overrideNetworkType != 4) {
                z10 = false;
            } else {
                z10 = true;
            }
            if (z10) {
                i6 = 10;
            } else {
                i6 = 5;
            }
            n.a(n.this, i6);
        }

        @Override // android.telephony.PhoneStateListener
        public final void onServiceStateChanged(ServiceState serviceState) {
            String serviceState2;
            boolean z10;
            int i6;
            if (serviceState == null) {
                serviceState2 = "";
            } else {
                serviceState2 = serviceState.toString();
            }
            if (!serviceState2.contains("nrState=CONNECTED") && !serviceState2.contains("nrState=NOT_RESTRICTED")) {
                z10 = false;
            } else {
                z10 = true;
            }
            if (z10) {
                i6 = 10;
            } else {
                i6 = 5;
            }
            n.a(n.this, i6);
        }
    }

    public n(Context context) {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        context.registerReceiver(new b(), intentFilter);
    }

    public static void a(n nVar, int i6) {
        synchronized (nVar.f5182c) {
            if (nVar.f5183d != i6) {
                nVar.f5183d = i6;
                Iterator<WeakReference<a>> it = nVar.f5181b.iterator();
                while (it.hasNext()) {
                    WeakReference<a> next = it.next();
                    a aVar = next.get();
                    if (aVar != null) {
                        aVar.a(i6);
                    } else {
                        nVar.f5181b.remove(next);
                    }
                }
            }
        }
    }

    public final int b() {
        int i6;
        synchronized (this.f5182c) {
            i6 = this.f5183d;
        }
        return i6;
    }
}
