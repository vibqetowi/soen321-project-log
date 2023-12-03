package ca;

import aa.g;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Binder;
import android.os.Process;
/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final Context f5222a;

    public b(Context context) {
        this.f5222a = context;
    }

    public final ApplicationInfo a(int i6, String str) {
        return this.f5222a.getPackageManager().getApplicationInfo(str, i6);
    }

    public final PackageInfo b(int i6, String str) {
        return this.f5222a.getPackageManager().getPackageInfo(str, i6);
    }

    public final boolean c() {
        String nameForUid;
        boolean isInstantApp;
        int callingUid = Binder.getCallingUid();
        int myUid = Process.myUid();
        Context context = this.f5222a;
        if (callingUid == myUid) {
            return a.K0(context);
        }
        if (g.a() && (nameForUid = context.getPackageManager().getNameForUid(Binder.getCallingUid())) != null) {
            isInstantApp = context.getPackageManager().isInstantApp(nameForUid);
            return isInstantApp;
        }
        return false;
    }
}
