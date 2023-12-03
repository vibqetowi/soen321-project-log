package hd;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import android.view.MenuItem;
import androidx.appcompat.widget.AppCompatSeekBar;
import androidx.appcompat.widget.a1;
import androidx.viewpager.widget.ViewPager;
import com.google.firebase.crashlytics.CrashlyticsRegistrar;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.activity.TemplateActivity;
import com.theinnerhour.b2b.model.ScreenResult10Model;
import com.theinnerhour.b2b.widgets.RobertoEditText;
import hr.aa;
import hr.b9;
import hr.c7;
import hr.c8;
import hr.h6;
import hr.j8;
import hr.ka;
import hr.l7;
import hr.o8;
import hr.q9;
import hr.s7;
import hr.s8;
import hr.u;
import hr.w;
import hr.w8;
import hr.x6;
import hr.y8;
import hr.z6;
import hr.z7;
import java.io.File;
import java.lang.Thread;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicReference;
import nd.c0;
import nd.d0;
import nd.g0;
import nd.h0;
import nd.l0;
import nd.m0;
import nd.o0;
import nd.t;
import nd.x;
import nd.y;
import nd.z;
import s1.s;
import tr.r;
import ya.v;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class a implements e, a1.a {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ int f17395u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ Object f17396v;

    public /* synthetic */ a(int i6, Object obj) {
        this.f17395u = i6;
        this.f17396v = obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x03d3  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x04d9  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0523  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0365  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0375  */
    @Override // hd.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object e(p pVar) {
        x xVar;
        int i6;
        Throwable th2;
        String str;
        int i10;
        v vVar;
        ya.h onSuccessTask;
        boolean z10;
        nd.a aVar;
        boolean z11;
        ExecutorService executorService;
        String str2;
        boolean z12;
        od.h hVar;
        od.c cVar;
        boolean exists;
        boolean z13;
        boolean z14;
        Resources resources;
        ud.b a10;
        int i11 = this.f17395u;
        Object obj = this.f17396v;
        switch (i11) {
            case 0:
            case 1:
                return obj;
            default:
                ((CrashlyticsRegistrar) obj).getClass();
                sc.e eVar = (sc.e) pVar.a(sc.e.class);
                re.a g5 = pVar.g(kd.a.class);
                re.a g10 = pVar.g(wc.a.class);
                eVar.b();
                Context context = eVar.f31432a;
                String packageName = context.getPackageName();
                Log.i("FirebaseCrashlytics", "Initializing Firebase Crashlytics 18.3.5 for " + packageName, null);
                sd.b bVar = new sd.b(context);
                d0 d0Var = new d0(eVar);
                h0 h0Var = new h0(context, packageName, (se.d) pVar.a(se.d.class), d0Var);
                kd.b bVar2 = new kd.b(g5);
                jd.b bVar3 = new jd.b(g10);
                x xVar2 = r10;
                x xVar3 = new x(eVar, h0Var, bVar2, d0Var, new jd.a(bVar3), new jd.a(bVar3), bVar, g0.a("Crashlytics Exception Handler"));
                eVar.b();
                String str3 = eVar.f31434c.f31445b;
                String e10 = nd.f.e(context);
                ArrayList arrayList = new ArrayList();
                int f = nd.f.f(context, "com.google.firebase.crashlytics.build_ids_lib", "array");
                int f2 = nd.f.f(context, "com.google.firebase.crashlytics.build_ids_arch", "array");
                int f10 = nd.f.f(context, "com.google.firebase.crashlytics.build_ids_build_id", "array");
                if (f != 0 && f2 != 0 && f10 != 0) {
                    String[] stringArray = context.getResources().getStringArray(f);
                    String[] stringArray2 = context.getResources().getStringArray(f2);
                    String[] stringArray3 = context.getResources().getStringArray(f10);
                    if (stringArray.length == stringArray3.length && stringArray2.length == stringArray3.length) {
                        int i12 = 0;
                        while (i12 < stringArray3.length) {
                            arrayList.add(new nd.d(stringArray[i12], stringArray2[i12], stringArray3[i12]));
                            i12++;
                            xVar2 = xVar2;
                        }
                        xVar = xVar2;
                        th2 = null;
                        i6 = 3;
                    } else {
                        xVar = xVar2;
                        String format = String.format("Lengths did not match: %d %d %d", Integer.valueOf(stringArray.length), Integer.valueOf(stringArray2.length), Integer.valueOf(stringArray3.length));
                        i6 = 3;
                        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                            Log.d("FirebaseCrashlytics", format, null);
                        }
                        th2 = null;
                    }
                } else {
                    xVar = xVar2;
                    String format2 = String.format("Could not find resources: %d %d %d", Integer.valueOf(f), Integer.valueOf(f2), Integer.valueOf(f10));
                    if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                        Log.d("FirebaseCrashlytics", format2, null);
                        th2 = null;
                        i6 = 3;
                    } else {
                        i6 = 3;
                        th2 = null;
                    }
                }
                String r = defpackage.c.r("Mapping file ID is: ", e10);
                if (Log.isLoggable("FirebaseCrashlytics", i6)) {
                    Log.d("FirebaseCrashlytics", r, th2);
                }
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    nd.d dVar = (nd.d) it.next();
                    Object[] objArr = new Object[i6];
                    objArr[0] = dVar.f26037a;
                    objArr[1] = dVar.f26038b;
                    objArr[2] = dVar.f26039c;
                    String format3 = String.format("Build id for %s on %s: %s", objArr);
                    if (Log.isLoggable("FirebaseCrashlytics", i6)) {
                        Log.d("FirebaseCrashlytics", format3, null);
                    }
                }
                kd.c cVar2 = new kd.c(context);
                try {
                    String packageName2 = context.getPackageName();
                    String d10 = h0Var.d();
                    PackageInfo packageInfo = context.getPackageManager().getPackageInfo(packageName2, 0);
                    String num = Integer.toString(packageInfo.versionCode);
                    String str4 = packageInfo.versionName;
                    if (str4 == null) {
                        str4 = "0.0";
                    }
                    String str5 = str4;
                    nd.a aVar2 = new nd.a(str3, e10, arrayList, d10, packageName2, num, str5, cVar2);
                    String r10 = defpackage.c.r("Installer package name is: ", d10);
                    if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                        Log.v("FirebaseCrashlytics", r10, null);
                    }
                    ExecutorService a11 = g0.a("com.google.firebase.crashlytics.startup");
                    df.b bVar4 = new df.b(15);
                    String d11 = h0Var.d();
                    r rVar = new r();
                    gd.d dVar2 = new gd.d(4, rVar);
                    gd.d dVar3 = new gd.d(bVar);
                    Locale locale = Locale.US;
                    s sVar = new s(String.format(locale, "https://firebase-settings.crashlytics.com/spi/v2/platforms/android/gmp/%s/settings", str3), bVar4);
                    String str6 = Build.MANUFACTURER;
                    String str7 = h0.f26066h;
                    String format4 = String.format(locale, "%s/%s", str6.replaceAll(str7, ""), Build.MODEL.replaceAll(str7, ""));
                    String replaceAll = Build.VERSION.INCREMENTAL.replaceAll(str7, "");
                    String replaceAll2 = Build.VERSION.RELEASE.replaceAll(str7, "");
                    int i13 = 0;
                    String[] strArr = {nd.f.e(context), str3, str5, num};
                    ArrayList arrayList2 = new ArrayList();
                    for (int i14 = 4; i13 < i14; i14 = 4) {
                        String str8 = strArr[i13];
                        if (str8 != null) {
                            arrayList2.add(str8.replace("-", "").toLowerCase(Locale.US));
                        }
                        i13++;
                    }
                    Collections.sort(arrayList2);
                    StringBuilder sb2 = new StringBuilder();
                    Iterator it2 = arrayList2.iterator();
                    while (it2.hasNext()) {
                        sb2.append((String) it2.next());
                    }
                    String sb3 = sb2.toString();
                    if (sb3.length() > 0) {
                        str = nd.f.k(sb3);
                    } else {
                        str = null;
                    }
                    String str9 = str;
                    if (d11 != null) {
                        i10 = 4;
                    } else {
                        i10 = 1;
                    }
                    ud.d dVar4 = new ud.d(context, new ud.g(str3, format4, replaceAll, replaceAll2, h0Var, str9, str5, num, defpackage.e.c(i10)), rVar, dVar2, dVar3, sVar, d0Var);
                    boolean z15 = !dVar4.f34010a.getSharedPreferences("com.google.firebase.crashlytics", 0).getString("existing_instance_identifier", "").equals(dVar4.f34011b.f);
                    AtomicReference<ya.i<ud.b>> atomicReference = dVar4.f34017i;
                    AtomicReference<ud.b> atomicReference2 = dVar4.f34016h;
                    if (!z15 && (a10 = dVar4.a(1)) != null) {
                        atomicReference2.set(a10);
                        atomicReference.get().d(a10);
                        onSuccessTask = ya.k.e(null);
                    } else {
                        ud.b a12 = dVar4.a(3);
                        if (a12 != null) {
                            atomicReference2.set(a12);
                            atomicReference.get().d(a12);
                        }
                        d0 d0Var2 = dVar4.f34015g;
                        v vVar2 = d0Var2.f.f38392a;
                        synchronized (d0Var2.f26041b) {
                            vVar = d0Var2.f26042c.f38392a;
                        }
                        ExecutorService executorService2 = o0.f26099a;
                        ya.i iVar = new ya.i();
                        m0 m0Var = new m0(0, iVar);
                        vVar2.continueWith(a11, m0Var);
                        vVar.continueWith(a11, m0Var);
                        onSuccessTask = iVar.f38392a.onSuccessTask(a11, new ud.c(dVar4));
                    }
                    onSuccessTask.continueWith(a11, new hc.d());
                    x xVar4 = xVar;
                    nd.g gVar = xVar4.f26143m;
                    sd.b bVar5 = xVar4.f26139i;
                    Context context2 = xVar4.f26132a;
                    if (context2 != null && (resources = context2.getResources()) != null) {
                        int f11 = nd.f.f(context2, "com.crashlytics.RequireBuildId", "bool");
                        if (f11 > 0) {
                            z10 = resources.getBoolean(f11);
                        } else {
                            int f12 = nd.f.f(context2, "com.crashlytics.RequireBuildId", "string");
                            if (f12 > 0) {
                                z10 = Boolean.parseBoolean(context2.getString(f12));
                            }
                        }
                        if (z10) {
                            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                                Log.v("FirebaseCrashlytics", "Configured not to require a build ID.", null);
                            }
                            aVar = aVar2;
                        } else {
                            aVar = aVar2;
                            if (TextUtils.isEmpty(aVar.f26017b)) {
                                Log.e("FirebaseCrashlytics", ".");
                                Log.e("FirebaseCrashlytics", ".     |  | ");
                                Log.e("FirebaseCrashlytics", ".     |  |");
                                Log.e("FirebaseCrashlytics", ".     |  |");
                                Log.e("FirebaseCrashlytics", ".   \\ |  | /");
                                Log.e("FirebaseCrashlytics", ".    \\    /");
                                Log.e("FirebaseCrashlytics", ".     \\  /");
                                Log.e("FirebaseCrashlytics", ".      \\/");
                                Log.e("FirebaseCrashlytics", ".");
                                Log.e("FirebaseCrashlytics", "The Crashlytics build ID is missing. This occurs when Crashlytics tooling is absent from your app's build configuration. Please review Crashlytics onboarding instructions and ensure you have a valid Crashlytics account.");
                                Log.e("FirebaseCrashlytics", ".");
                                Log.e("FirebaseCrashlytics", ".      /\\");
                                Log.e("FirebaseCrashlytics", ".     /  \\");
                                Log.e("FirebaseCrashlytics", ".    /    \\");
                                Log.e("FirebaseCrashlytics", ".   / |  | \\");
                                Log.e("FirebaseCrashlytics", ".     |  |");
                                Log.e("FirebaseCrashlytics", ".     |  |");
                                Log.e("FirebaseCrashlytics", ".     |  |");
                                Log.e("FirebaseCrashlytics", ".");
                                z11 = false;
                                if (z11) {
                                    new nd.e(xVar4.f26138h);
                                    String str10 = nd.e.f26046b;
                                    try {
                                        xVar4.f = new z("crash_marker", 0, bVar5);
                                        xVar4.f26136e = new z("initialization_marker", 0, bVar5);
                                        hVar = new od.h(str10, bVar5, gVar);
                                        cVar = new od.c(bVar5);
                                        executorService = a11;
                                    } catch (Exception e11) {
                                        e = e11;
                                        executorService = a11;
                                    }
                                    try {
                                        try {
                                            xVar4.f26137g = new t(xVar4.f26132a, xVar4.f26143m, xVar4.f26138h, xVar4.f26133b, xVar4.f26139i, xVar4.f, aVar, hVar, cVar, l0.b(xVar4.f26132a, xVar4.f26138h, xVar4.f26139i, aVar, cVar, hVar, new a9.a(new vd.b[]{new vd.a(10, 1)}), dVar4, xVar4.f26134c), xVar4.f26144n, xVar4.f26141k);
                                            z zVar = xVar4.f26136e;
                                            sd.b bVar6 = (sd.b) zVar.f26149c;
                                            bVar6.getClass();
                                            exists = new File(bVar6.f31460b, (String) zVar.f26148b).exists();
                                            try {
                                                Boolean.TRUE.equals((Boolean) o0.a(gVar.a(new y(xVar4))));
                                            } catch (Exception unused) {
                                            }
                                            t tVar = xVar4.f26137g;
                                            Thread.UncaughtExceptionHandler defaultUncaughtExceptionHandler = Thread.getDefaultUncaughtExceptionHandler();
                                            tVar.getClass();
                                            tVar.f26116e.a(new nd.r(tVar, str10));
                                            c0 c0Var = new c0(new nd.j(tVar), dVar4, defaultUncaughtExceptionHandler, tVar.f26120j);
                                            tVar.f26123m = c0Var;
                                            Thread.setDefaultUncaughtExceptionHandler(c0Var);
                                        } catch (Exception e12) {
                                            e = e12;
                                            str2 = "FirebaseCrashlytics";
                                        }
                                    } catch (Exception e13) {
                                        e = e13;
                                        str2 = "FirebaseCrashlytics";
                                        Log.e(str2, "Crashlytics was not started due to an exception during initialization", e);
                                        xVar4.f26137g = null;
                                        z12 = false;
                                        ya.k.c(executorService, new jd.d(z12, xVar4, dVar4));
                                        return new jd.e(xVar4);
                                    }
                                    if (exists) {
                                        if (context2.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") == 0) {
                                            z13 = true;
                                        } else {
                                            z13 = false;
                                        }
                                        if (z13) {
                                            NetworkInfo activeNetworkInfo = ((ConnectivityManager) context2.getSystemService("connectivity")).getActiveNetworkInfo();
                                            if (activeNetworkInfo != null) {
                                                if (activeNetworkInfo.isConnectedOrConnecting()) {
                                                }
                                            }
                                            z14 = false;
                                            if (z14) {
                                                str2 = "FirebaseCrashlytics";
                                                try {
                                                    if (Log.isLoggable(str2, 3)) {
                                                        Log.d(str2, "Crashlytics did not finish previous background initialization. Initializing synchronously.", null);
                                                    }
                                                    xVar4.b(dVar4);
                                                } catch (Exception e14) {
                                                    e = e14;
                                                    Log.e(str2, "Crashlytics was not started due to an exception during initialization", e);
                                                    xVar4.f26137g = null;
                                                    z12 = false;
                                                    ya.k.c(executorService, new jd.d(z12, xVar4, dVar4));
                                                    return new jd.e(xVar4);
                                                }
                                                z12 = false;
                                                ya.k.c(executorService, new jd.d(z12, xVar4, dVar4));
                                                return new jd.e(xVar4);
                                            }
                                        }
                                        z14 = true;
                                        if (z14) {
                                        }
                                    }
                                    if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                                        Log.d("FirebaseCrashlytics", "Successfully configured exception handler.", null);
                                    }
                                    z12 = true;
                                    ya.k.c(executorService, new jd.d(z12, xVar4, dVar4));
                                    return new jd.e(xVar4);
                                }
                                throw new IllegalStateException("The Crashlytics build ID is missing. This occurs when Crashlytics tooling is absent from your app's build configuration. Please review Crashlytics onboarding instructions and ensure you have a valid Crashlytics account.");
                            }
                        }
                        z11 = true;
                        if (z11) {
                        }
                    }
                    z10 = true;
                    if (z10) {
                    }
                    z11 = true;
                    if (z11) {
                    }
                } catch (PackageManager.NameNotFoundException e15) {
                    Log.e("FirebaseCrashlytics", "Error retrieving app package info.", e15);
                    return null;
                }
                break;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x02f2, code lost:
        if (r13.equals("s139") == false) goto L123;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x02fc, code lost:
        if (r13.equals("s138") == false) goto L123;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x0331, code lost:
        if (r13.equals("s56") == false) goto L123;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x033a, code lost:
        if (r13.equals("s55") == false) goto L123;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x0343, code lost:
        if (r13.equals("s51") == false) goto L123;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x034c, code lost:
        if (r13.equals("s45") == false) goto L123;
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x034f, code lost:
        r9.a0();
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x0359, code lost:
        if (r13.equals("s37") == false) goto L123;
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x035e, code lost:
        if (r9.f19452z != 1) goto L94;
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x0360, code lost:
        r9.P();
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x0364, code lost:
        r9.a0();
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x029f, code lost:
        if (r13.equals("s154") == false) goto L123;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x02a9, code lost:
        if (r13.equals("s152") == false) goto L123;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x02cc, code lost:
        if (r13.equals("s150") == false) goto L123;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x02d4, code lost:
        if (r13.equals("s142") == false) goto L123;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x02de, code lost:
        if (r13.equals("s141") == false) goto L123;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x02e8, code lost:
        if (r13.equals("s140") == false) goto L123;
     */
    @Override // androidx.appcompat.widget.a1.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean onMenuItemClick(MenuItem menuItem) {
        int i6 = this.f17395u;
        Object obj = this.f17396v;
        switch (i6) {
            case 0:
                h6 this$0 = (h6) obj;
                int i10 = h6.f18533w;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                kotlin.jvm.internal.i.d(menuItem);
                if (menuItem.getItemId() == R.id.action_show_logs) {
                    androidx.fragment.app.p activity = this$0.getActivity();
                    kotlin.jvm.internal.i.e(activity, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
                    ((TemplateActivity) activity).s0(new u());
                    return true;
                }
                return false;
            case 1:
                x6 this$02 = (x6) obj;
                int i11 = x6.f19390w;
                kotlin.jvm.internal.i.g(this$02, "this$0");
                kotlin.jvm.internal.i.d(menuItem);
                if (menuItem.getItemId() == R.id.action_show_logs) {
                    this$02.K();
                    this$02.J();
                    androidx.fragment.app.p activity2 = this$02.getActivity();
                    kotlin.jvm.internal.i.e(activity2, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
                    ((TemplateActivity) activity2).s0(new hr.n());
                    return true;
                }
                return false;
            case 2:
                z6 this$03 = (z6) obj;
                int i12 = z6.f19444w;
                kotlin.jvm.internal.i.g(this$03, "this$0");
                kotlin.jvm.internal.i.d(menuItem);
                if (menuItem.getItemId() == R.id.action_show_logs) {
                    androidx.fragment.app.p activity3 = this$03.getActivity();
                    kotlin.jvm.internal.i.e(activity3, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
                    ((TemplateActivity) activity3).s0(new hr.s());
                    return true;
                }
                return false;
            case 3:
                c7 this$04 = (c7) obj;
                int i13 = c7.D;
                kotlin.jvm.internal.i.g(this$04, "this$0");
                kotlin.jvm.internal.i.d(menuItem);
                if (menuItem.getItemId() == R.id.action_show_logs) {
                    this$04.Q();
                    androidx.fragment.app.p activity4 = this$04.getActivity();
                    kotlin.jvm.internal.i.e(activity4, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
                    ((TemplateActivity) activity4).s0(new hr.v());
                    return true;
                }
                return false;
            case 4:
                l7 this$05 = (l7) obj;
                int i14 = l7.H;
                kotlin.jvm.internal.i.g(this$05, "this$0");
                kotlin.jvm.internal.i.d(menuItem);
                if (menuItem.getItemId() == R.id.action_show_logs) {
                    androidx.fragment.app.p activity5 = this$05.getActivity();
                    kotlin.jvm.internal.i.e(activity5, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
                    ((TemplateActivity) activity5).s0(new hr.k());
                    return true;
                }
                return false;
            case 5:
                s7 this$06 = (s7) obj;
                int i15 = s7.M;
                kotlin.jvm.internal.i.g(this$06, "this$0");
                kotlin.jvm.internal.i.d(menuItem);
                if (menuItem.getItemId() == R.id.action_show_logs) {
                    String valueOf = String.valueOf(((RobertoEditText) this$06._$_findCachedViewById(R.id.llEditText)).getText());
                    ScreenResult10Model screenResult10Model = this$06.F;
                    screenResult10Model.setText(valueOf);
                    screenResult10Model.setDate(this$06.C.getTimeInMillis() / 1000);
                    this$06.J().F.put("s38_time", Long.valueOf(screenResult10Model.getDate()));
                    this$06.J().F.put("s38_text", String.valueOf(((RobertoEditText) this$06._$_findCachedViewById(R.id.llEditText)).getText()));
                    this$06.J().F.put("s39_text", String.valueOf(((RobertoEditText) this$06._$_findCachedViewById(R.id.llEditText)).getText()));
                    if (((RobertoEditText) this$06._$_findCachedViewById(R.id.llEditText)).hasFocus()) {
                        androidx.fragment.app.p activity6 = this$06.getActivity();
                        kotlin.jvm.internal.i.e(activity6, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
                        Context requireContext = this$06.requireContext();
                        kotlin.jvm.internal.i.f(requireContext, "requireContext()");
                        RobertoEditText llEditText = (RobertoEditText) this$06._$_findCachedViewById(R.id.llEditText);
                        kotlin.jvm.internal.i.f(llEditText, "llEditText");
                        ((TemplateActivity) activity6).D0(requireContext, llEditText);
                    }
                    this$06.f19165z = 0;
                    ((ViewPager) this$06._$_findCachedViewById(R.id.stepsViewPager)).setCurrentItem(this$06.f19165z);
                    androidx.fragment.app.p activity7 = this$06.getActivity();
                    kotlin.jvm.internal.i.e(activity7, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
                    ((TemplateActivity) activity7).s0(new hr.j());
                    return true;
                }
                return false;
            case 6:
                z7 this$07 = (z7) obj;
                int i16 = z7.K;
                kotlin.jvm.internal.i.g(this$07, "this$0");
                kotlin.jvm.internal.i.d(menuItem);
                if (menuItem.getItemId() == R.id.action_show_logs) {
                    String str = this$07.A;
                    switch (str.hashCode()) {
                        case 112151:
                            break;
                        case 112180:
                            break;
                        case 112207:
                            break;
                        case 112211:
                            break;
                        case 112212:
                            break;
                        case 3474660:
                            if (str.equals("s128")) {
                                if (this$07.f19452z == 0) {
                                    this$07.M();
                                    break;
                                } else {
                                    this$07.a0();
                                    break;
                                }
                            }
                            break;
                        case 3474661:
                            if (str.equals("s129")) {
                                if (this$07.f19452z == 0) {
                                    this$07.P();
                                    break;
                                } else {
                                    this$07.a0();
                                    break;
                                }
                            }
                            break;
                        case 3474691:
                            break;
                        case 3474692:
                            break;
                        case 3474714:
                            break;
                        case 3474715:
                            break;
                        case 3474716:
                            break;
                        case 3474745:
                            break;
                        case 3474746:
                            if (str.equals("s151")) {
                                if (this$07.f19452z == 2) {
                                    this$07.P();
                                    break;
                                } else {
                                    this$07.a0();
                                    break;
                                }
                            }
                            break;
                        case 3474747:
                            break;
                        case 3474749:
                            break;
                    }
                    androidx.fragment.app.p activity8 = this$07.getActivity();
                    kotlin.jvm.internal.i.e(activity8, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
                    HashMap<String, Object> hashMap = ((TemplateActivity) activity8).F;
                    hashMap.put("headings", this$07.f19449w);
                    hashMap.put("list", this$07.f19450x);
                    hashMap.put("s45_37_user_list", this$07.f19450x);
                    this$07.S();
                    if (kotlin.jvm.internal.i.b(this$07.Q().B0(), "s142")) {
                        androidx.fragment.app.p activity9 = this$07.getActivity();
                        kotlin.jvm.internal.i.e(activity9, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
                        ((TemplateActivity) activity9).s0(new hr.t());
                        return true;
                    }
                    androidx.fragment.app.p activity10 = this$07.getActivity();
                    kotlin.jvm.internal.i.e(activity10, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
                    ((TemplateActivity) activity10).s0(new hr.v());
                    return true;
                }
                return false;
            case 7:
                c8 this$08 = (c8) obj;
                int i17 = c8.f18261w;
                kotlin.jvm.internal.i.g(this$08, "this$0");
                kotlin.jvm.internal.i.d(menuItem);
                if (menuItem.getItemId() == R.id.action_show_logs) {
                    androidx.fragment.app.p activity11 = this$08.getActivity();
                    kotlin.jvm.internal.i.e(activity11, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
                    if (kotlin.jvm.internal.i.b(((TemplateActivity) activity11).B0(), "s59-c")) {
                        androidx.fragment.app.p activity12 = this$08.getActivity();
                        kotlin.jvm.internal.i.e(activity12, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
                        ((TemplateActivity) activity12).s0(new hr.s());
                        return true;
                    }
                    androidx.fragment.app.p activity13 = this$08.getActivity();
                    kotlin.jvm.internal.i.e(activity13, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
                    ((TemplateActivity) activity13).s0(new hr.l());
                    return true;
                }
                return false;
            case 8:
                j8 this$09 = (j8) obj;
                int i18 = j8.A;
                kotlin.jvm.internal.i.g(this$09, "this$0");
                kotlin.jvm.internal.i.d(menuItem);
                if (menuItem.getItemId() == R.id.action_show_logs) {
                    androidx.fragment.app.p activity14 = this$09.getActivity();
                    kotlin.jvm.internal.i.e(activity14, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
                    ((TemplateActivity) activity14).s0(new hr.l());
                    return true;
                }
                return false;
            case 9:
                o8 this$010 = (o8) obj;
                int i19 = o8.H;
                kotlin.jvm.internal.i.g(this$010, "this$0");
                kotlin.jvm.internal.i.d(menuItem);
                if (menuItem.getItemId() == R.id.action_show_logs) {
                    this$010.f18925x = 0;
                    ((ViewPager) this$010._$_findCachedViewById(R.id.stepsViewPager)).setCurrentItem(this$010.f18925x);
                    androidx.fragment.app.p activity15 = this$010.getActivity();
                    kotlin.jvm.internal.i.e(activity15, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
                    ((TemplateActivity) activity15).F.put("s66_user_data", this$010.K());
                    this$010.M();
                    androidx.fragment.app.p activity16 = this$010.getActivity();
                    kotlin.jvm.internal.i.e(activity16, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
                    ((TemplateActivity) activity16).s0(new hr.m());
                    return true;
                }
                return false;
            case 10:
                s8 this$011 = (s8) obj;
                int i20 = s8.C;
                kotlin.jvm.internal.i.g(this$011, "this$0");
                kotlin.jvm.internal.i.d(menuItem);
                if (menuItem.getItemId() == R.id.action_show_logs) {
                    if (((RobertoEditText) this$011._$_findCachedViewById(R.id.editText)).hasFocus()) {
                        androidx.fragment.app.p activity17 = this$011.getActivity();
                        kotlin.jvm.internal.i.e(activity17, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
                        Context context = this$011.getContext();
                        kotlin.jvm.internal.i.d(context);
                        RobertoEditText editText = (RobertoEditText) this$011._$_findCachedViewById(R.id.editText);
                        kotlin.jvm.internal.i.f(editText, "editText");
                        ((TemplateActivity) activity17).D0(context, editText);
                    }
                    int i21 = this$011.f19173y;
                    if (i21 == 1) {
                        if (this$011.f19171w.size() > 1) {
                            this$011.f19171w.set(1, String.valueOf(((AppCompatSeekBar) this$011._$_findCachedViewById(R.id.seekBar1)).getProgress()));
                        } else {
                            this$011.f19171w.add(String.valueOf(((AppCompatSeekBar) this$011._$_findCachedViewById(R.id.seekBar1)).getProgress()));
                        }
                    } else if (i21 < this$011.f19171w.size()) {
                        this$011.f19171w.set(this$011.f19173y, String.valueOf(((RobertoEditText) this$011._$_findCachedViewById(R.id.editText)).getText()));
                    } else {
                        this$011.f19171w.add(String.valueOf(((RobertoEditText) this$011._$_findCachedViewById(R.id.editText)).getText()));
                    }
                    androidx.fragment.app.p activity18 = this$011.getActivity();
                    kotlin.jvm.internal.i.e(activity18, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
                    HashMap<String, Object> hashMap2 = ((TemplateActivity) activity18).F;
                    hashMap2.put("headings", this$011.f19170v);
                    hashMap2.put("list", this$011.f19171w);
                    androidx.fragment.app.p activity19 = this$011.getActivity();
                    kotlin.jvm.internal.i.e(activity19, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
                    if (kotlin.jvm.internal.i.b(((TemplateActivity) activity19).B0(), "s144")) {
                        androidx.fragment.app.p activity20 = this$011.getActivity();
                        kotlin.jvm.internal.i.e(activity20, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
                        ((TemplateActivity) activity20).s0(new w());
                        return true;
                    }
                    androidx.fragment.app.p activity21 = this$011.getActivity();
                    kotlin.jvm.internal.i.e(activity21, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
                    ((TemplateActivity) activity21).s0(new hr.v());
                    return true;
                }
                return false;
            case 11:
                w8 this$012 = (w8) obj;
                int i22 = w8.f19358y;
                kotlin.jvm.internal.i.g(this$012, "this$0");
                kotlin.jvm.internal.i.d(menuItem);
                if (menuItem.getItemId() == R.id.action_show_logs) {
                    this$012.M();
                    androidx.fragment.app.p activity22 = this$012.getActivity();
                    kotlin.jvm.internal.i.e(activity22, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
                    ((TemplateActivity) activity22).s0(new hr.o());
                    return true;
                }
                return false;
            case 12:
                y8 this$013 = (y8) obj;
                int i23 = y8.f19422w;
                kotlin.jvm.internal.i.g(this$013, "this$0");
                kotlin.jvm.internal.i.d(menuItem);
                if (menuItem.getItemId() == R.id.action_show_logs) {
                    androidx.fragment.app.p activity23 = this$013.getActivity();
                    kotlin.jvm.internal.i.e(activity23, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
                    ((TemplateActivity) activity23).s0(new hr.o());
                    return true;
                }
                return false;
            case 13:
                b9 this$014 = (b9) obj;
                int i24 = b9.f18209w;
                kotlin.jvm.internal.i.g(this$014, "this$0");
                kotlin.jvm.internal.i.d(menuItem);
                if (menuItem.getItemId() == R.id.action_show_logs) {
                    androidx.fragment.app.p activity24 = this$014.getActivity();
                    kotlin.jvm.internal.i.e(activity24, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
                    ((TemplateActivity) activity24).s0(new hr.p());
                    return true;
                }
                return false;
            case 14:
                q9 this$015 = (q9) obj;
                int i25 = q9.f19040z;
                kotlin.jvm.internal.i.g(this$015, "this$0");
                kotlin.jvm.internal.i.d(menuItem);
                if (menuItem.getItemId() == R.id.action_show_logs) {
                    androidx.fragment.app.p activity25 = this$015.getActivity();
                    kotlin.jvm.internal.i.e(activity25, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
                    ((TemplateActivity) activity25).s0(new hr.k());
                    return true;
                }
                return false;
            case 15:
                aa this$016 = (aa) obj;
                int i26 = aa.A;
                kotlin.jvm.internal.i.g(this$016, "this$0");
                kotlin.jvm.internal.i.d(menuItem);
                if (menuItem.getItemId() == R.id.action_show_logs) {
                    androidx.fragment.app.p activity26 = this$016.getActivity();
                    kotlin.jvm.internal.i.e(activity26, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
                    ((TemplateActivity) activity26).s0(new hr.s());
                    return true;
                }
                return false;
            default:
                ka this$017 = (ka) obj;
                int i27 = ka.A;
                kotlin.jvm.internal.i.g(this$017, "this$0");
                kotlin.jvm.internal.i.d(menuItem);
                if (menuItem.getItemId() == R.id.action_show_logs) {
                    androidx.fragment.app.p activity27 = this$017.getActivity();
                    kotlin.jvm.internal.i.e(activity27, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
                    ((TemplateActivity) activity27).s0(new hr.n());
                    return true;
                }
                return false;
        }
    }
}
