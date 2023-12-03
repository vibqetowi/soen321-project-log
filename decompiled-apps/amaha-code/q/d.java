package q;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.LocaleList;
import android.text.TextUtils;
import f0.j;
import g0.a;
import java.util.Locale;
import kotlin.jvm.internal.b0;
/* compiled from: CustomTabsIntent.java */
/* loaded from: classes.dex */
public final class d {

    /* renamed from: a  reason: collision with root package name */
    public final Intent f29097a;

    /* compiled from: CustomTabsIntent.java */
    /* loaded from: classes.dex */
    public static class a {
        public static String a() {
            LocaleList adjustedDefault;
            int size;
            Locale locale;
            adjustedDefault = LocaleList.getAdjustedDefault();
            size = adjustedDefault.size();
            if (size > 0) {
                locale = adjustedDefault.get(0);
                return locale.toLanguageTag();
            }
            return null;
        }
    }

    public d(Intent intent) {
        this.f29097a = intent;
    }

    public final void a(Context context, Uri uri) {
        Intent intent = this.f29097a;
        intent.setData(uri);
        Object obj = g0.a.f16164a;
        a.C0244a.b(context, intent, null);
    }

    /* compiled from: CustomTabsIntent.java */
    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public final Intent f29098a;

        /* renamed from: b  reason: collision with root package name */
        public final b0 f29099b;

        /* renamed from: c  reason: collision with root package name */
        public Bundle f29100c;

        /* renamed from: d  reason: collision with root package name */
        public final boolean f29101d;

        public b() {
            this.f29098a = new Intent("android.intent.action.VIEW");
            this.f29099b = new b0();
            this.f29101d = true;
        }

        public final d a() {
            Bundle bundle;
            Intent intent = this.f29098a;
            if (!intent.hasExtra("android.support.customtabs.extra.SESSION")) {
                Bundle bundle2 = new Bundle();
                j.b(bundle2, "android.support.customtabs.extra.SESSION", null);
                intent.putExtras(bundle2);
            }
            intent.putExtra("android.support.customtabs.extra.EXTRA_ENABLE_INSTANT_APPS", this.f29101d);
            this.f29099b.getClass();
            intent.putExtras(new Bundle());
            Bundle bundle3 = this.f29100c;
            if (bundle3 != null) {
                intent.putExtras(bundle3);
            }
            intent.putExtra("androidx.browser.customtabs.extra.SHARE_STATE", 0);
            if (Build.VERSION.SDK_INT >= 24) {
                String a10 = a.a();
                if (!TextUtils.isEmpty(a10)) {
                    if (intent.hasExtra("com.android.browser.headers")) {
                        bundle = intent.getBundleExtra("com.android.browser.headers");
                    } else {
                        bundle = new Bundle();
                    }
                    if (!bundle.containsKey("Accept-Language")) {
                        bundle.putString("Accept-Language", a10);
                        intent.putExtra("com.android.browser.headers", bundle);
                    }
                }
            }
            return new d(intent);
        }

        public b(f fVar) {
            Intent intent = new Intent("android.intent.action.VIEW");
            this.f29098a = intent;
            this.f29099b = new b0();
            this.f29101d = true;
            if (fVar != null) {
                intent.setPackage(((ComponentName) fVar.f29107y).getPackageName());
                IBinder asBinder = ((a.a) fVar.f29106x).asBinder();
                PendingIntent pendingIntent = (PendingIntent) fVar.f29108z;
                Bundle bundle = new Bundle();
                j.b(bundle, "android.support.customtabs.extra.SESSION", asBinder);
                if (pendingIntent != null) {
                    bundle.putParcelable("android.support.customtabs.extra.SESSION_ID", pendingIntent);
                }
                intent.putExtras(bundle);
            }
        }
    }
}
