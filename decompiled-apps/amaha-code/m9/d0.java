package m9;

import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.cast.framework.media.MediaNotificationService;
import f0.f0;
import java.util.ArrayList;
/* compiled from: com.google.android.gms:play-services-cast-framework@@20.0.0 */
/* loaded from: classes.dex */
public final class d0 extends BroadcastReceiver {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ MediaNotificationService f24964a;

    public d0(MediaNotificationService mediaNotificationService) {
        this.f24964a = mediaNotificationService;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        boolean z10;
        PendingIntent a10;
        ComponentName componentName = (ComponentName) intent.getParcelableExtra("targetActivity");
        v9.o.h(componentName);
        Intent intent2 = new Intent();
        intent2.setComponent(componentName);
        MediaNotificationService mediaNotificationService = this.f24964a;
        l9.a aVar = mediaNotificationService.I;
        aVar.getClass();
        v9.o.d("Must be called from the main thread.");
        try {
            z10 = aVar.f24149b.g();
        } catch (RemoteException e10) {
            l9.a.f24145h.a("Unable to call %s on %s.", e10, "hasActivityInRecents", l9.h0.class.getSimpleName());
            z10 = false;
        }
        if (z10) {
            intent2.setFlags(603979776);
            a10 = PendingIntent.getActivity(context, 1, intent2, com.google.android.gms.internal.cast.e.f7516a | 134217728);
        } else {
            ArrayList arrayList = new ArrayList();
            int size = arrayList.size();
            try {
                for (Intent b10 = f0.n.b(mediaNotificationService, componentName); b10 != null; b10 = f0.n.b(mediaNotificationService, b10.getComponent())) {
                    arrayList.add(size, b10);
                }
                arrayList.add(intent2);
                int i6 = com.google.android.gms.internal.cast.e.f7516a | 134217728;
                if (!arrayList.isEmpty()) {
                    Intent[] intentArr = (Intent[]) arrayList.toArray(new Intent[0]);
                    intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
                    a10 = f0.a.a(mediaNotificationService, 1, intentArr, i6, null);
                } else {
                    throw new IllegalStateException("No intents added to TaskStackBuilder; cannot getPendingIntent");
                }
            } catch (PackageManager.NameNotFoundException e11) {
                Log.e("TaskStackBuilder", "Bad ComponentName while traversing activity parent metadata");
                throw new IllegalArgumentException(e11);
            }
        }
        try {
            v9.o.h(a10);
            a10.send(context, 1, new Intent().setFlags(268435456));
        } catch (PendingIntent.CanceledException e12) {
            MediaNotificationService.K.a("Sending PendingIntent failed", e12, new Object[0]);
        }
    }
}
