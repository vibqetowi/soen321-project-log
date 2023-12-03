package w2;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import androidx.work.impl.WorkDatabase;
import bs.a;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesRepairableException;
import h5.a;
import h5.g0;
import h5.x;
import h5.z;
import io.grpc.ManagedChannelProvider;
import io.grpc.ManagedChannelRegistry;
import io.grpc.b;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.util.Date;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;
import oe.a;
import org.json.JSONException;
import org.json.JSONObject;
import tr.b0;
import ur.a;
import w5.e0;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class f implements Callable {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ int f36293u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ Object f36294v;

    public /* synthetic */ f(int i6, Object obj) {
        this.f36293u = i6;
        this.f36294v = obj;
    }

    private final a.C0582a a() {
        ManagedChannelRegistry managedChannelRegistry;
        ne.p pVar = (ne.p) this.f36294v;
        Context context = pVar.f26260e;
        e9.c cVar = pVar.f;
        try {
            ua.a.a(context);
        } catch (GooglePlayServicesNotAvailableException | GooglePlayServicesRepairableException | IllegalStateException e10) {
            kc.f.A(2, "GrpcCallProvider", "Failed to update ssl context: %s", e10);
        }
        String str = (String) cVar.f13871e;
        Logger logger = ManagedChannelRegistry.f20418c;
        synchronized (ManagedChannelRegistry.class) {
            if (ManagedChannelRegistry.f20419d == null) {
                List<ManagedChannelProvider> a10 = io.grpc.p.a(ManagedChannelProvider.class, ManagedChannelRegistry.b(), ManagedChannelProvider.class.getClassLoader(), new ManagedChannelRegistry.b());
                ManagedChannelRegistry.f20419d = new ManagedChannelRegistry();
                for (ManagedChannelProvider managedChannelProvider : a10) {
                    Logger logger2 = ManagedChannelRegistry.f20418c;
                    logger2.fine("Service loader found " + managedChannelProvider);
                    ManagedChannelRegistry.f20419d.a(managedChannelProvider);
                }
                ManagedChannelRegistry.f20419d.d();
            }
            managedChannelRegistry = ManagedChannelRegistry.f20419d;
        }
        ManagedChannelProvider c10 = managedChannelRegistry.c();
        if (c10 != null) {
            io.grpc.k<?> a11 = c10.a(str);
            if (!cVar.f13868b) {
                a11.c();
            }
            a11.b(TimeUnit.SECONDS);
            ur.a aVar = new ur.a(a11);
            aVar.f34494b = context;
            b0 a12 = aVar.a();
            pVar.f26257b.b(new ne.o(pVar, a12, 0));
            io.grpc.b c11 = io.grpc.b.f20431k.c(bs.a.f4670a, a.EnumC0093a.ASYNC);
            tr.a aVar2 = pVar.f26261g;
            b.a b10 = io.grpc.b.b(c11);
            b10.f20444d = aVar2;
            io.grpc.b bVar = new io.grpc.b(b10);
            a.b bVar2 = pVar.f26257b.f27381a;
            b.a b11 = io.grpc.b.b(bVar);
            b11.f20442b = bVar2;
            pVar.f26258c = new io.grpc.b(b11);
            kc.f.A(1, "GrpcCallProvider", "Channel successfully reset.", new Object[0]);
            return (a.C0582a) a12;
        }
        throw new ManagedChannelProvider.ProviderNotFoundException();
    }

    private final of.c b() {
        FileInputStream fileInputStream;
        of.c cVar;
        of.e eVar = (of.e) this.f36294v;
        synchronized (eVar) {
            FileInputStream fileInputStream2 = null;
            cVar = null;
            try {
                fileInputStream = eVar.f27454a.openFileInput(eVar.f27455b);
                try {
                    int available = fileInputStream.available();
                    byte[] bArr = new byte[available];
                    fileInputStream.read(bArr, 0, available);
                    cVar = of.c.a(new JSONObject(new String(bArr, "UTF-8")));
                    fileInputStream.close();
                } catch (FileNotFoundException | JSONException unused) {
                    if (fileInputStream != null) {
                        fileInputStream.close();
                    }
                    return cVar;
                } catch (Throwable th2) {
                    th = th2;
                    fileInputStream2 = fileInputStream;
                    if (fileInputStream2 != null) {
                        fileInputStream2.close();
                    }
                    throw th;
                }
            } catch (FileNotFoundException | JSONException unused2) {
                fileInputStream = null;
            } catch (Throwable th3) {
                th = th3;
            }
        }
        return cVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x00d7 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0193 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:111:0x012d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x010d  */
    @Override // java.util.concurrent.Callable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object call() {
        h5.a aVar;
        String string;
        h5.x xVar;
        i5.i iVar;
        String string2;
        String str;
        BufferedWriter bufferedWriter;
        boolean z10 = false;
        BufferedWriter bufferedWriter2 = null;
        switch (this.f36293u) {
            case 0:
                g.x this$0 = (g.x) this.f36294v;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                return Integer.valueOf(hc.d.f((WorkDatabase) this$0.f16143v, "next_alarm_manager_id"));
            case 1:
                defpackage.e.t(this.f36294v);
                h5.p pVar = h5.p.f17269a;
                h5.f a10 = h5.f.f.a();
                SharedPreferences sharedPreferences = a10.f17215b.f17187a;
                if (sharedPreferences.contains("com.facebook.AccessTokenManager.CachedAccessToken") && (string2 = sharedPreferences.getString("com.facebook.AccessTokenManager.CachedAccessToken", null)) != null) {
                    try {
                        JSONObject jSONObject = new JSONObject(string2);
                        Date date = h5.a.F;
                        aVar = a.b.a(jSONObject);
                    } catch (JSONException unused) {
                    }
                    if (aVar != null) {
                        a10.c(aVar, false);
                    }
                    z.a aVar2 = h5.z.f17336d;
                    h5.z a11 = aVar2.a();
                    string = a11.f17339b.f17335a.getString("com.facebook.ProfileManager.CachedProfile", null);
                    if (string != null) {
                        try {
                            xVar = new h5.x(new JSONObject(string));
                        } catch (JSONException unused2) {
                        }
                        if (xVar != null) {
                            a11.a(xVar, false);
                        }
                        Date date2 = h5.a.F;
                        if (a.b.c()) {
                            Parcelable.Creator<h5.x> creator = h5.x.CREATOR;
                            if (aVar2.a().f17340c == null) {
                                x.b.a();
                            }
                        }
                        Context a12 = h5.p.a();
                        String str2 = h5.p.f17272d;
                        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = i5.i.f19861c;
                        if (g0.b()) {
                            i5.i iVar2 = new i5.i(a12, str2);
                            ScheduledThreadPoolExecutor b10 = i5.i.b();
                            if (b10 != null) {
                                b10.execute(new g.v(a12, 17, iVar2));
                            } else {
                                throw new IllegalStateException("Required value was null.".toString());
                            }
                        }
                        if (!b6.a.b(g0.class)) {
                            try {
                                Context a13 = h5.p.a();
                                ApplicationInfo applicationInfo = a13.getPackageManager().getApplicationInfo(a13.getPackageName(), 128);
                                kotlin.jvm.internal.i.f(applicationInfo, "ctx.packageManager.getApplicationInfo(ctx.packageName, PackageManager.GET_META_DATA)");
                                Bundle bundle = applicationInfo.metaData;
                                if (bundle != null && bundle.getBoolean("com.facebook.sdk.AutoAppLinkEnabled", false)) {
                                    i5.i iVar3 = new i5.i(a13, (String) null);
                                    Bundle bundle2 = new Bundle();
                                    if (!e0.w()) {
                                        bundle2.putString("SchemeWarning", "You haven't set the Auto App Link URL scheme: fb<YOUR APP ID> in AndroidManifest");
                                        Log.w(g0.f17232b, "You haven't set the Auto App Link URL scheme: fb<YOUR APP ID> in AndroidManifest");
                                    }
                                    if (g0.b()) {
                                        iVar3.d(bundle2, "fb_auto_applink");
                                    }
                                }
                            } catch (PackageManager.NameNotFoundException unused3) {
                            } catch (Throwable th2) {
                                b6.a.a(g0.class, th2);
                            }
                        }
                        Context applicationContext = h5.p.a().getApplicationContext();
                        kotlin.jvm.internal.i.f(applicationContext, "getApplicationContext().applicationContext");
                        iVar = new i5.i(applicationContext, (String) null);
                        if (!b6.a.b(iVar)) {
                            try {
                                String str3 = i5.f.f19852a;
                                i5.f.c(i5.l.EXPLICIT);
                            } catch (Throwable th3) {
                                b6.a.a(iVar, th3);
                            }
                        }
                        return null;
                    }
                    xVar = null;
                    if (xVar != null) {
                    }
                    Date date22 = h5.a.F;
                    if (a.b.c()) {
                    }
                    Context a122 = h5.p.a();
                    String str22 = h5.p.f17272d;
                    ScheduledThreadPoolExecutor scheduledThreadPoolExecutor2 = i5.i.f19861c;
                    if (g0.b()) {
                    }
                    if (!b6.a.b(g0.class)) {
                    }
                    Context applicationContext2 = h5.p.a().getApplicationContext();
                    kotlin.jvm.internal.i.f(applicationContext2, "getApplicationContext().applicationContext");
                    iVar = new i5.i(applicationContext2, (String) null);
                    if (!b6.a.b(iVar)) {
                    }
                    return null;
                }
                aVar = null;
                if (aVar != null) {
                }
                z.a aVar22 = h5.z.f17336d;
                h5.z a112 = aVar22.a();
                string = a112.f17339b.f17335a.getString("com.facebook.ProfileManager.CachedProfile", null);
                if (string != null) {
                }
                xVar = null;
                if (xVar != null) {
                }
                Date date222 = h5.a.F;
                if (a.b.c()) {
                }
                Context a1222 = h5.p.a();
                String str222 = h5.p.f17272d;
                ScheduledThreadPoolExecutor scheduledThreadPoolExecutor22 = i5.i.f19861c;
                if (g0.b()) {
                }
                if (!b6.a.b(g0.class)) {
                }
                Context applicationContext22 = h5.p.a().getApplicationContext();
                kotlin.jvm.internal.i.f(applicationContext22, "getApplicationContext().applicationContext");
                iVar = new i5.i(applicationContext22, (String) null);
                if (!b6.a.b(iVar)) {
                }
                return null;
            case 2:
                od.h hVar = (od.h) this.f36294v;
                synchronized (hVar.f) {
                    if (hVar.f.isMarked()) {
                        str = hVar.f.getReference();
                        hVar.f.set(str, false);
                        z10 = true;
                    } else {
                        str = null;
                    }
                }
                if (z10) {
                    File b11 = hVar.f27375a.f27356a.b(hVar.f27377c, "user-data");
                    try {
                        String obj = new od.d(str).toString();
                        bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(b11), od.e.f27355b));
                        try {
                            bufferedWriter.write(obj);
                            bufferedWriter.flush();
                        } catch (Exception e10) {
                            e = e10;
                            try {
                                Log.w("FirebaseCrashlytics", "Error serializing user metadata.", e);
                                nd.f.a(bufferedWriter, "Failed to close user metadata file.");
                                return null;
                            } catch (Throwable th4) {
                                th = th4;
                                bufferedWriter2 = bufferedWriter;
                                bufferedWriter = bufferedWriter2;
                                nd.f.a(bufferedWriter, "Failed to close user metadata file.");
                                throw th;
                            }
                        } catch (Throwable th5) {
                            th = th5;
                            nd.f.a(bufferedWriter, "Failed to close user metadata file.");
                            throw th;
                        }
                    } catch (Exception e11) {
                        e = e11;
                        bufferedWriter = null;
                    } catch (Throwable th6) {
                        th = th6;
                        bufferedWriter = bufferedWriter2;
                        nd.f.a(bufferedWriter, "Failed to close user metadata file.");
                        throw th;
                    }
                    nd.f.a(bufferedWriter, "Failed to close user metadata file.");
                }
                return null;
            case 3:
                return a();
            case 4:
                ((Runnable) this.f36294v).run();
                return null;
            case 5:
                return ((nf.f) this.f36294v).a("firebase");
            default:
                return b();
        }
    }
}
