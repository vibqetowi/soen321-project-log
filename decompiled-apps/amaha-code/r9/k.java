package r9;

import android.content.Context;
import android.os.Bundle;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
/* compiled from: com.google.android.gms:play-services-cloud-messaging@@17.0.0 */
/* loaded from: classes.dex */
public final /* synthetic */ class k implements Runnable {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ int f30625u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ l f30626v;

    public /* synthetic */ k(l lVar, int i6) {
        this.f30625u = i6;
        this.f30626v = lVar;
    }

    private final void a() {
        l lVar = this.f30626v;
        synchronized (lVar) {
            if (lVar.f30627u == 1) {
                lVar.a(1, "Timed out while binding");
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f30625u) {
            case 0:
                this.f30626v.a(2, "Service disconnected");
                return;
            case 1:
                l lVar = this.f30626v;
                while (true) {
                    synchronized (lVar) {
                        if (lVar.f30627u == 2) {
                            if (lVar.f30630x.isEmpty()) {
                                lVar.c();
                                return;
                            }
                            n<?> nVar = (n) lVar.f30630x.poll();
                            lVar.f30631y.put(nVar.f30634a, nVar);
                            ((ScheduledExecutorService) lVar.f30632z.f30641d).schedule(new androidx.work.n(lVar, 8, nVar), 30L, TimeUnit.SECONDS);
                            if (Log.isLoggable("MessengerIpcClient", 3)) {
                                String valueOf = String.valueOf(nVar);
                                StringBuilder sb2 = new StringBuilder(valueOf.length() + 8);
                                sb2.append("Sending ");
                                sb2.append(valueOf);
                                Log.d("MessengerIpcClient", sb2.toString());
                            }
                            Messenger messenger = lVar.f30628v;
                            Message obtain = Message.obtain();
                            obtain.what = nVar.f30636c;
                            obtain.arg1 = nVar.f30634a;
                            obtain.replyTo = messenger;
                            Bundle bundle = new Bundle();
                            bundle.putBoolean("oneWay", nVar.b());
                            bundle.putString("pkg", ((Context) lVar.f30632z.f30640c).getPackageName());
                            bundle.putBundle("data", nVar.f30637d);
                            obtain.setData(bundle);
                            try {
                                androidx.appcompat.widget.l lVar2 = lVar.f30629w;
                                Messenger messenger2 = (Messenger) lVar2.f1471v;
                                if (messenger2 != null) {
                                    messenger2.send(obtain);
                                } else {
                                    h hVar = (h) lVar2.f1472w;
                                    if (hVar != null) {
                                        Messenger messenger3 = hVar.f30617u;
                                        messenger3.getClass();
                                        messenger3.send(obtain);
                                    } else {
                                        throw new IllegalStateException("Both messengers are null");
                                        break;
                                    }
                                }
                            } catch (RemoteException e10) {
                                lVar.a(2, e10.getMessage());
                            }
                        } else {
                            return;
                        }
                    }
                }
            default:
                a();
                return;
        }
    }
}
