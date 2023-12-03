package w5;

import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ProviderInfo;
import android.content.pm.ResolveInfo;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.facebook.FacebookException;
import com.facebook.FacebookOperationCanceledException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
/* compiled from: NativeProtocol.kt */
/* loaded from: classes.dex */
public final class w {

    /* renamed from: a  reason: collision with root package name */
    public static final w f36549a;

    /* renamed from: b  reason: collision with root package name */
    public static final String f36550b;

    /* renamed from: c  reason: collision with root package name */
    public static final ArrayList f36551c;

    /* renamed from: d  reason: collision with root package name */
    public static final AtomicBoolean f36552d;

    /* renamed from: e  reason: collision with root package name */
    public static final Integer[] f36553e;

    /* compiled from: NativeProtocol.kt */
    /* loaded from: classes.dex */
    public static final class a extends e {
        @Override // w5.w.e
        public final /* bridge */ /* synthetic */ String b() {
            return null;
        }

        @Override // w5.w.e
        public final String c() {
            return "com.facebook.arstudio.player";
        }
    }

    /* compiled from: NativeProtocol.kt */
    /* loaded from: classes.dex */
    public static final class b extends e {
        @Override // w5.w.e
        public final String b() {
            return "com.instagram.platform.AppAuthorizeActivity";
        }

        @Override // w5.w.e
        public final String c() {
            return "com.instagram.android";
        }

        @Override // w5.w.e
        public final String d() {
            return "token,signed_request,graph_domain,granted_scopes";
        }
    }

    /* compiled from: NativeProtocol.kt */
    /* loaded from: classes.dex */
    public static final class c extends e {
        @Override // w5.w.e
        public final String b() {
            return "com.facebook.katana.ProxyAuth";
        }

        @Override // w5.w.e
        public final String c() {
            return "com.facebook.katana";
        }

        @Override // w5.w.e
        public final void e() {
            boolean z10;
            if (h5.p.a().getApplicationInfo().targetSdkVersion >= 30) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                String str = null;
                if (!b6.a.b(w.class)) {
                    try {
                        str = w.f36550b;
                    } catch (Throwable th2) {
                        b6.a.a(w.class, th2);
                    }
                }
                Log.w(str, "Apps that target Android API 30+ (Android 11+) cannot call Facebook native apps unless the package visibility needs are declared. Please follow https://developers.facebook.com/docs/android/troubleshooting/#faq_267321845055988 to make the declaration.");
            }
        }
    }

    /* compiled from: NativeProtocol.kt */
    /* loaded from: classes.dex */
    public static final class d extends e {
        @Override // w5.w.e
        public final /* bridge */ /* synthetic */ String b() {
            return null;
        }

        @Override // w5.w.e
        public final String c() {
            return "com.facebook.orca";
        }
    }

    /* compiled from: NativeProtocol.kt */
    /* loaded from: classes.dex */
    public static final class f {

        /* renamed from: a  reason: collision with root package name */
        public int f36555a;
    }

    /* compiled from: NativeProtocol.kt */
    /* loaded from: classes.dex */
    public static final class g extends e {
        @Override // w5.w.e
        public final String b() {
            return "com.facebook.katana.ProxyAuth";
        }

        @Override // w5.w.e
        public final String c() {
            return "com.facebook.wakizashi";
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0044 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    static {
        ArrayList k10;
        w wVar;
        w wVar2 = new w();
        f36549a = wVar2;
        f36550b = w.class.getName();
        f36551c = wVar2.a();
        if (!b6.a.b(wVar2)) {
            try {
                k10 = ca.a.k(new a());
                k10.addAll(wVar2.a());
            } catch (Throwable th2) {
                b6.a.a(wVar2, th2);
            }
            wVar = f36549a;
            wVar.getClass();
            if (!b6.a.b(wVar)) {
                try {
                    HashMap hashMap = new HashMap();
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(new d());
                    ArrayList arrayList2 = f36551c;
                    hashMap.put("com.facebook.platform.action.request.OGACTIONPUBLISH_DIALOG", arrayList2);
                    hashMap.put("com.facebook.platform.action.request.FEED_DIALOG", arrayList2);
                    hashMap.put("com.facebook.platform.action.request.LIKE_DIALOG", arrayList2);
                    hashMap.put("com.facebook.platform.action.request.APPINVITES_DIALOG", arrayList2);
                    hashMap.put("com.facebook.platform.action.request.MESSAGE_DIALOG", arrayList);
                    hashMap.put("com.facebook.platform.action.request.OGMESSAGEPUBLISH_DIALOG", arrayList);
                    hashMap.put("com.facebook.platform.action.request.CAMERA_EFFECT", k10);
                    hashMap.put("com.facebook.platform.action.request.SHARE_STORY", arrayList2);
                } catch (Throwable th3) {
                    b6.a.a(wVar, th3);
                }
            }
            f36552d = new AtomicBoolean(false);
            f36553e = new Integer[]{20210906, 20171115, 20170417, 20170411, 20170213, 20161017, 20160327, 20150702, 20150401, 20141218, 20141107, 20141028, 20141001, 20140701, 20140324, 20140313, 20140204, 20131107, 20131024, 20130618, 20130502, 20121101};
        }
        k10 = null;
        wVar = f36549a;
        wVar.getClass();
        if (!b6.a.b(wVar)) {
        }
        f36552d = new AtomicBoolean(false);
        f36553e = new Integer[]{20210906, 20171115, 20170417, 20170411, 20170213, 20161017, 20160327, 20150702, 20150401, 20141218, 20141107, 20141028, 20141001, 20140701, 20140324, 20140313, 20140204, 20131107, 20131024, 20130618, 20130502, 20121101};
    }

    public static final int b(TreeSet<Integer> treeSet, int i6, int[] iArr) {
        if (b6.a.b(w.class)) {
            return 0;
        }
        if (treeSet == null) {
            return -1;
        }
        try {
            int length = iArr.length - 1;
            Iterator<Integer> descendingIterator = treeSet.descendingIterator();
            int i10 = -1;
            while (descendingIterator.hasNext()) {
                Integer fbAppVersion = descendingIterator.next();
                kotlin.jvm.internal.i.f(fbAppVersion, "fbAppVersion");
                i10 = Math.max(i10, fbAppVersion.intValue());
                while (length >= 0 && iArr[length] > fbAppVersion.intValue()) {
                    length--;
                }
                if (length < 0) {
                    return -1;
                }
                if (iArr[length] == fbAppVersion.intValue()) {
                    if (length % 2 != 0) {
                        return -1;
                    }
                    return Math.min(i10, i6);
                }
            }
            return -1;
        } catch (Throwable th2) {
            b6.a.a(w.class, th2);
            return 0;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0065 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Intent d(Context context) {
        ResolveInfo resolveService;
        if (b6.a.b(w.class)) {
            return null;
        }
        try {
            kotlin.jvm.internal.i.g(context, "context");
            for (e eVar : f36551c) {
                Intent addCategory = new Intent("com.facebook.platform.PLATFORM_SERVICE").setPackage(eVar.c()).addCategory("android.intent.category.DEFAULT");
                if (!b6.a.b(w.class) && addCategory != null && (resolveService = context.getPackageManager().resolveService(addCategory, 0)) != null) {
                    HashSet<String> hashSet = j.f36476a;
                    String str = resolveService.serviceInfo.packageName;
                    kotlin.jvm.internal.i.f(str, "resolveInfo.serviceInfo.packageName");
                    if (j.a(context, str)) {
                        continue;
                        if (addCategory != null) {
                            return addCategory;
                        }
                    }
                }
                addCategory = null;
                if (addCategory != null) {
                }
            }
            return null;
        } catch (Throwable th2) {
            b6.a.a(w.class, th2);
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0042 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0043 A[Catch: all -> 0x0095, TryCatch #3 {all -> 0x0095, blocks: (B:5:0x000a, B:25:0x0043, B:27:0x005f, B:37:0x0087, B:38:0x008a, B:40:0x008f, B:30:0x0068, B:32:0x007a, B:9:0x0015, B:11:0x001f, B:13:0x0025, B:17:0x0034, B:15:0x002c), top: B:47:0x000a }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Intent e(Intent intent, Bundle bundle, FacebookException facebookException) {
        UUID uuid;
        Bundle bundle2;
        String stringExtra;
        if (b6.a.b(w.class)) {
            return null;
        }
        try {
            if (!b6.a.b(w.class)) {
                if (j(i(intent))) {
                    Bundle bundleExtra = intent.getBundleExtra("com.facebook.platform.protocol.BRIDGE_ARGS");
                    if (bundleExtra != null) {
                        stringExtra = bundleExtra.getString("action_id");
                    } else {
                        stringExtra = null;
                    }
                } else {
                    stringExtra = intent.getStringExtra("com.facebook.platform.protocol.CALL_ID");
                }
                if (stringExtra != null) {
                    try {
                        uuid = UUID.fromString(stringExtra);
                    } catch (IllegalArgumentException unused) {
                    }
                    if (uuid != null) {
                        return null;
                    }
                    Intent intent2 = new Intent();
                    intent2.putExtra("com.facebook.platform.protocol.PROTOCOL_VERSION", i(intent));
                    Bundle bundle3 = new Bundle();
                    bundle3.putString("action_id", uuid.toString());
                    if (facebookException != null) {
                        if (!b6.a.b(w.class)) {
                            bundle2 = new Bundle();
                            bundle2.putString("error_description", facebookException.toString());
                            if (facebookException instanceof FacebookOperationCanceledException) {
                                bundle2.putString("error_type", "UserCanceled");
                            }
                        } else {
                            bundle2 = null;
                        }
                        bundle3.putBundle("error", bundle2);
                    }
                    intent2.putExtra("com.facebook.platform.protocol.BRIDGE_ARGS", bundle3);
                    if (bundle != null) {
                        intent2.putExtra("com.facebook.platform.protocol.RESULT_ARGS", bundle);
                    }
                    return intent2;
                }
            }
            uuid = null;
            if (uuid != null) {
            }
        } catch (Throwable th2) {
            b6.a.a(w.class, th2);
            return null;
        }
    }

    public static final Bundle h(Intent intent) {
        if (b6.a.b(w.class)) {
            return null;
        }
        try {
            if (!j(i(intent))) {
                return intent.getExtras();
            }
            return intent.getBundleExtra("com.facebook.platform.protocol.METHOD_ARGS");
        } catch (Throwable th2) {
            b6.a.a(w.class, th2);
            return null;
        }
    }

    public static final int i(Intent intent) {
        if (b6.a.b(w.class)) {
            return 0;
        }
        try {
            return intent.getIntExtra("com.facebook.platform.protocol.PROTOCOL_VERSION", 0);
        } catch (Throwable th2) {
            b6.a.a(w.class, th2);
            return 0;
        }
    }

    public static final boolean j(int i6) {
        if (b6.a.b(w.class)) {
            return false;
        }
        try {
            if (!is.k.Q1(Integer.valueOf(i6), f36553e) || i6 < 20140701) {
                return false;
            }
            return true;
        } catch (Throwable th2) {
            b6.a.a(w.class, th2);
            return false;
        }
    }

    public static final void k() {
        if (b6.a.b(w.class)) {
            return;
        }
        try {
            if (!f36552d.compareAndSet(false, true)) {
                return;
            }
            h5.p.c().execute(new i5.b(14));
        } catch (Throwable th2) {
            b6.a.a(w.class, th2);
        }
    }

    public final ArrayList a() {
        if (b6.a.b(this)) {
            return null;
        }
        try {
            return ca.a.k(new c(), new g());
        } catch (Throwable th2) {
            b6.a.a(this, th2);
            return null;
        }
    }

    public final Intent c(e eVar, String str, Set set, String str2, boolean z10, g6.d dVar, String str3, String str4, boolean z11, String str5, boolean z12, g6.a0 a0Var, boolean z13, boolean z14, String str6) {
        if (b6.a.b(this)) {
            return null;
        }
        try {
            String b10 = eVar.b();
            if (b10 == null) {
                return null;
            }
            Intent putExtra = new Intent().setClassName(eVar.c(), b10).putExtra("client_id", str);
            kotlin.jvm.internal.i.f(putExtra, "Intent()\n            .setClassName(appInfo.getPackage(), activityName)\n            .putExtra(FACEBOOK_PROXY_AUTH_APP_ID_KEY, applicationId)");
            h5.p pVar = h5.p.f17269a;
            putExtra.putExtra("facebook_sdk_version", "16.0.1");
            e0 e0Var = e0.f36453a;
            if (!(set.isEmpty())) {
                putExtra.putExtra("scope", TextUtils.join(",", set));
            }
            if (!e0.A(str2)) {
                putExtra.putExtra("e2e", str2);
            }
            putExtra.putExtra("state", str3);
            putExtra.putExtra("response_type", eVar.d());
            putExtra.putExtra("nonce", str6);
            putExtra.putExtra("return_scopes", "true");
            if (z10) {
                putExtra.putExtra("default_audience", dVar.f16242u);
            }
            putExtra.putExtra("legacy_override", h5.p.d());
            putExtra.putExtra("auth_type", str4);
            if (z11) {
                putExtra.putExtra("fail_on_logged_out", true);
            }
            putExtra.putExtra("messenger_page_id", str5);
            putExtra.putExtra("reset_messenger_state", z12);
            if (z13) {
                putExtra.putExtra("fx_app", a0Var.f16230u);
            }
            if (z14) {
                putExtra.putExtra("skip_dedupe", true);
            }
            return putExtra;
        } catch (Throwable th2) {
            b6.a.a(this, th2);
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00a2 A[Catch: all -> 0x00af, TRY_ENTER, TryCatch #7 {all -> 0x00af, blocks: (B:5:0x000e, B:45:0x00ae, B:44:0x00ab, B:38:0x00a2, B:8:0x0029), top: B:56:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00ab A[Catch: all -> 0x00af, TryCatch #7 {all -> 0x00af, blocks: (B:5:0x000e, B:45:0x00ae, B:44:0x00ab, B:38:0x00a2, B:8:0x0029), top: B:56:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0083 A[EXC_TOP_SPLITTER, LOOP:0: B:54:0x0083->B:31:0x0089, LOOP_START, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final TreeSet<Integer> f(e eVar) {
        Uri uri;
        Cursor cursor;
        ProviderInfo providerInfo;
        Cursor cursor2;
        String str = f36550b;
        if (b6.a.b(this)) {
            return null;
        }
        try {
            TreeSet<Integer> treeSet = new TreeSet<>();
            ContentResolver contentResolver = h5.p.a().getContentResolver();
            String[] strArr = {"version"};
            if (b6.a.b(this)) {
                uri = null;
            } else {
                Uri parse = Uri.parse("content://" + eVar.c() + ".provider.PlatformProvider/versions");
                kotlin.jvm.internal.i.f(parse, "parse(CONTENT_SCHEME + appInfo.getPackage() + PLATFORM_PROVIDER_VERSIONS)");
                uri = parse;
            }
            try {
                try {
                    providerInfo = h5.p.a().getPackageManager().resolveContentProvider(kotlin.jvm.internal.i.n(".provider.PlatformProvider", eVar.c()), 0);
                } catch (RuntimeException e10) {
                    Log.e(str, "Failed to query content resolver.", e10);
                    providerInfo = null;
                }
                if (providerInfo != null) {
                    try {
                        try {
                            cursor2 = contentResolver.query(uri, strArr, null, null, null);
                        } catch (SecurityException unused) {
                            Log.e(str, "Failed to query content resolver.");
                            cursor2 = null;
                            if (cursor2 != null) {
                            }
                            if (cursor2 != null) {
                            }
                            return treeSet;
                        }
                    } catch (IllegalArgumentException unused2) {
                        Log.e(str, "Failed to query content resolver.");
                        cursor2 = null;
                        if (cursor2 != null) {
                        }
                        if (cursor2 != null) {
                        }
                        return treeSet;
                    } catch (NullPointerException unused3) {
                        Log.e(str, "Failed to query content resolver.");
                        cursor2 = null;
                        if (cursor2 != null) {
                        }
                        if (cursor2 != null) {
                        }
                        return treeSet;
                    }
                    if (cursor2 != null) {
                        while (cursor2.moveToNext()) {
                            try {
                                treeSet.add(Integer.valueOf(cursor2.getInt(cursor2.getColumnIndex("version"))));
                            } catch (Throwable th2) {
                                cursor = cursor2;
                                th = th2;
                                if (cursor == null) {
                                }
                                throw th;
                            }
                        }
                    }
                } else {
                    cursor2 = null;
                }
                if (cursor2 != null) {
                    cursor2.close();
                }
                return treeSet;
            } catch (Throwable th3) {
                th = th3;
                cursor = null;
                if (cursor == null) {
                    cursor.close();
                }
                throw th;
            }
        } catch (Throwable th4) {
            b6.a.a(this, th4);
            return null;
        }
    }

    public final f g(ArrayList arrayList, int[] iArr) {
        if (b6.a.b(this)) {
            return null;
        }
        try {
            k();
            if (arrayList == null) {
                f fVar = new f();
                fVar.f36555a = -1;
                return fVar;
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                e eVar = (e) it.next();
                TreeSet<Integer> treeSet = eVar.f36554a;
                int i6 = 0;
                if (treeSet == null || !kotlin.jvm.internal.i.b(Boolean.valueOf(treeSet.isEmpty()), Boolean.FALSE)) {
                    eVar.a(false);
                }
                TreeSet<Integer> treeSet2 = eVar.f36554a;
                if (!b6.a.b(w.class)) {
                    i6 = f36553e[0].intValue();
                }
                int b10 = b(treeSet2, i6, iArr);
                if (b10 != -1) {
                    f fVar2 = new f();
                    fVar2.f36555a = b10;
                    return fVar2;
                }
            }
            f fVar3 = new f();
            fVar3.f36555a = -1;
            return fVar3;
        } catch (Throwable th2) {
            b6.a.a(this, th2);
            return null;
        }
    }

    /* compiled from: NativeProtocol.kt */
    /* loaded from: classes.dex */
    public static abstract class e {

        /* renamed from: a  reason: collision with root package name */
        public TreeSet<Integer> f36554a;

        /* JADX WARN: Code restructure failed: missing block: B:11:0x001a, code lost:
            if (kotlin.jvm.internal.i.b(r4, java.lang.Boolean.FALSE) == false) goto L4;
         */
        /* JADX WARN: Removed duplicated region for block: B:28:0x0042 A[Catch: all -> 0x0047, TRY_LEAVE, TryCatch #2 {, blocks: (B:5:0x0004, B:10:0x0014, B:20:0x0032, B:22:0x0036, B:28:0x0042, B:9:0x000c, B:12:0x001c, B:19:0x0030, B:15:0x0027), top: B:34:0x0004 }] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final synchronized void a(boolean z10) {
            Boolean valueOf;
            boolean z11;
            TreeSet<Integer> treeSet = null;
            if (!z10) {
                TreeSet<Integer> treeSet2 = this.f36554a;
                if (treeSet2 != null) {
                    if (treeSet2 == null) {
                        valueOf = null;
                    } else {
                        valueOf = Boolean.valueOf(treeSet2.isEmpty());
                    }
                }
            }
            w wVar = w.f36549a;
            if (!b6.a.b(w.class)) {
                treeSet = wVar.f(this);
            }
            this.f36554a = treeSet;
            TreeSet<Integer> treeSet3 = this.f36554a;
            if (treeSet3 != null && !treeSet3.isEmpty()) {
                z11 = false;
                if (z11) {
                    e();
                }
            }
            z11 = true;
            if (z11) {
            }
        }

        public abstract String b();

        public abstract String c();

        public String d() {
            return "id_token,token,signed_request,graph_domain";
        }

        public void e() {
        }
    }
}
