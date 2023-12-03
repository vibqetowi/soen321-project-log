package r9;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.util.Log;
import java.util.List;
/* compiled from: com.google.android.gms:play-services-cloud-messaging@@17.0.0 */
/* loaded from: classes.dex */
public final class p {

    /* renamed from: a  reason: collision with root package name */
    public final Context f30643a;

    /* renamed from: b  reason: collision with root package name */
    public int f30644b;

    /* renamed from: c  reason: collision with root package name */
    public int f30645c = 0;

    public p(Context context) {
        this.f30643a = context;
    }

    public final synchronized int a() {
        int i6 = this.f30645c;
        if (i6 != 0) {
            return i6;
        }
        PackageManager packageManager = this.f30643a.getPackageManager();
        if (ca.c.a(this.f30643a).f5222a.getPackageManager().checkPermission("com.google.android.c2dm.permission.SEND", "com.google.android.gms") == -1) {
            Log.e("Metadata", "Google Play services missing or without correct permission.");
            return 0;
        }
        int i10 = 1;
        if (!aa.g.a()) {
            Intent intent = new Intent("com.google.android.c2dm.intent.REGISTER");
            intent.setPackage("com.google.android.gms");
            List<ResolveInfo> queryIntentServices = packageManager.queryIntentServices(intent, 0);
            if (queryIntentServices != null && queryIntentServices.size() > 0) {
                this.f30645c = 1;
                return 1;
            }
        }
        Intent intent2 = new Intent("com.google.iid.TOKEN_REQUEST");
        intent2.setPackage("com.google.android.gms");
        List<ResolveInfo> queryBroadcastReceivers = packageManager.queryBroadcastReceivers(intent2, 0);
        if (queryBroadcastReceivers != null && queryBroadcastReceivers.size() > 0) {
            this.f30645c = 2;
            return 2;
        }
        Log.w("Metadata", "Failed to resolve IID implementation package, falling back");
        if (aa.g.a()) {
            this.f30645c = 2;
            i10 = 2;
        } else {
            this.f30645c = 1;
        }
        return i10;
    }
}
