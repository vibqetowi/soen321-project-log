package f0;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import g0.a;
import java.util.ArrayList;
import java.util.Iterator;
/* compiled from: TaskStackBuilder.java */
/* loaded from: classes.dex */
public final class f0 implements Iterable<Intent> {

    /* renamed from: u  reason: collision with root package name */
    public final ArrayList<Intent> f14622u = new ArrayList<>();

    /* renamed from: v  reason: collision with root package name */
    public final Context f14623v;

    /* compiled from: TaskStackBuilder.java */
    /* loaded from: classes.dex */
    public static class a {
        public static PendingIntent a(Context context, int i6, Intent[] intentArr, int i10, Bundle bundle) {
            return PendingIntent.getActivities(context, i6, intentArr, i10, bundle);
        }
    }

    public f0(Context context) {
        this.f14623v = context;
    }

    public final void e(Intent intent) {
        ComponentName component = intent.getComponent();
        if (component == null) {
            component = intent.resolveActivity(this.f14623v.getPackageManager());
        }
        if (component != null) {
            g(component);
        }
        this.f14622u.add(intent);
    }

    public final void g(ComponentName componentName) {
        Context context = this.f14623v;
        ArrayList<Intent> arrayList = this.f14622u;
        int size = arrayList.size();
        try {
            for (Intent b10 = n.b(context, componentName); b10 != null; b10 = n.b(context, b10.getComponent())) {
                arrayList.add(size, b10);
            }
        } catch (PackageManager.NameNotFoundException e10) {
            Log.e("TaskStackBuilder", "Bad ComponentName while traversing activity parent metadata");
            throw new IllegalArgumentException(e10);
        }
    }

    @Override // java.lang.Iterable
    @Deprecated
    public final Iterator<Intent> iterator() {
        return this.f14622u.iterator();
    }

    public final void m() {
        ArrayList<Intent> arrayList = this.f14622u;
        if (!arrayList.isEmpty()) {
            Intent[] intentArr = (Intent[]) arrayList.toArray(new Intent[0]);
            intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
            Object obj = g0.a.f16164a;
            a.C0244a.a(this.f14623v, intentArr, null);
            return;
        }
        throw new IllegalStateException("No intents added to TaskStackBuilder; cannot startActivities");
    }
}
