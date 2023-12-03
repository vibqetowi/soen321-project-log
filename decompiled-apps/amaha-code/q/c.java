package q;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
/* compiled from: CustomTabsClient.java */
/* loaded from: classes.dex */
public class c {

    /* renamed from: a  reason: collision with root package name */
    public final a.b f29095a;

    /* renamed from: b  reason: collision with root package name */
    public final ComponentName f29096b;

    public c(a.b bVar, ComponentName componentName) {
        this.f29095a = bVar;
        this.f29096b = componentName;
    }

    public static boolean a(Context context, String str, e eVar) {
        eVar.f29102u = context.getApplicationContext();
        Intent intent = new Intent("android.support.customtabs.action.CustomTabsService");
        if (!TextUtils.isEmpty(str)) {
            intent.setPackage(str);
        }
        return context.bindService(intent, eVar, 33);
    }
}
