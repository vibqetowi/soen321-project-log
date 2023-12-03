package c4;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import c4.f;
import com.android.billingclient.api.ProxyBillingActivity;
import com.android.billingclient.api.SkuDetails;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
/* compiled from: com.android.billingclient:billing@@5.0.0 */
/* loaded from: classes.dex */
public final class a extends androidx.work.k {

    /* renamed from: b  reason: collision with root package name */
    public volatile int f4880b;

    /* renamed from: c  reason: collision with root package name */
    public final String f4881c;

    /* renamed from: d  reason: collision with root package name */
    public final Handler f4882d;

    /* renamed from: e  reason: collision with root package name */
    public volatile androidx.appcompat.widget.l f4883e;
    public Context f;

    /* renamed from: g  reason: collision with root package name */
    public volatile oa.l f4884g;

    /* renamed from: h  reason: collision with root package name */
    public volatile x f4885h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f4886i;

    /* renamed from: j  reason: collision with root package name */
    public int f4887j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f4888k;

    /* renamed from: l  reason: collision with root package name */
    public boolean f4889l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f4890m;

    /* renamed from: n  reason: collision with root package name */
    public boolean f4891n;

    /* renamed from: o  reason: collision with root package name */
    public boolean f4892o;

    /* renamed from: p  reason: collision with root package name */
    public boolean f4893p;

    /* renamed from: q  reason: collision with root package name */
    public boolean f4894q;
    public boolean r;

    /* renamed from: s  reason: collision with root package name */
    public ExecutorService f4895s;

    public a(boolean z10, Context context, o oVar) {
        String str;
        try {
            str = (String) d4.a.class.getField("VERSION_NAME").get(null);
        } catch (Exception unused) {
            str = "5.0.0";
        }
        this.f4880b = 0;
        this.f4882d = new Handler(Looper.getMainLooper());
        this.f4887j = 0;
        this.f4881c = str;
        Context applicationContext = context.getApplicationContext();
        this.f = applicationContext;
        this.f4883e = new androidx.appcompat.widget.l(applicationContext, oVar);
        this.f4894q = z10;
        this.r = false;
    }

    @Override // androidx.work.k
    public final void C(e eVar) {
        ServiceInfo serviceInfo;
        if (D()) {
            oa.i.e("BillingClient", "Service connection is valid. No need to re-initialize.");
            eVar.a(z.f4976g);
        } else if (this.f4880b == 1) {
            oa.i.f("BillingClient", "Client is already in the process of connecting to billing service.");
            eVar.a(z.f4973c);
        } else if (this.f4880b == 3) {
            oa.i.f("BillingClient", "Client was already closed and can't be reused. Please create another instance.");
            eVar.a(z.f4977h);
        } else {
            this.f4880b = 1;
            androidx.appcompat.widget.l lVar = this.f4883e;
            lVar.getClass();
            IntentFilter intentFilter = new IntentFilter("com.android.vending.billing.PURCHASES_UPDATED");
            intentFilter.addAction("com.android.vending.billing.ALTERNATIVE_BILLING");
            b0 b0Var = (b0) lVar.f1472w;
            Context context = (Context) lVar.f1471v;
            if (!b0Var.f4899b) {
                context.registerReceiver((b0) b0Var.f4900c.f1472w, intentFilter);
                b0Var.f4899b = true;
            }
            oa.i.e("BillingClient", "Starting in-app billing setup.");
            this.f4885h = new x(this, eVar);
            Intent intent = new Intent("com.android.vending.billing.InAppBillingService.BIND");
            intent.setPackage("com.android.vending");
            List<ResolveInfo> queryIntentServices = this.f.getPackageManager().queryIntentServices(intent, 0);
            if (queryIntentServices != null && !queryIntentServices.isEmpty() && (serviceInfo = queryIntentServices.get(0).serviceInfo) != null) {
                String str = serviceInfo.packageName;
                String str2 = serviceInfo.name;
                if ("com.android.vending".equals(str) && str2 != null) {
                    ComponentName componentName = new ComponentName(str, str2);
                    Intent intent2 = new Intent(intent);
                    intent2.setComponent(componentName);
                    intent2.putExtra("playBillingLibraryVersion", this.f4881c);
                    if (this.f.bindService(intent2, this.f4885h, 1)) {
                        oa.i.e("BillingClient", "Service was bonded successfully.");
                        return;
                    }
                    oa.i.f("BillingClient", "Connection to Billing service is blocked.");
                } else {
                    oa.i.f("BillingClient", "The device doesn't have valid Play Store.");
                }
            }
            this.f4880b = 0;
            oa.i.e("BillingClient", "Billing service unavailable on device.");
            eVar.a(z.f4972b);
        }
    }

    public final boolean D() {
        if (this.f4880b == 2 && this.f4884g != null && this.f4885h != null) {
            return true;
        }
        return false;
    }

    public final Handler E() {
        if (Looper.myLooper() == null) {
            return this.f4882d;
        }
        return new Handler(Looper.myLooper());
    }

    public final void F(g gVar) {
        if (Thread.interrupted()) {
            return;
        }
        this.f4882d.post(new androidx.work.n(this, 2, gVar));
    }

    public final g G() {
        if (this.f4880b != 0 && this.f4880b != 3) {
            return z.f;
        }
        return z.f4977h;
    }

    public final Future H(Callable callable, long j10, u uVar, Handler handler) {
        long j11 = (long) (j10 * 0.95d);
        if (this.f4895s == null) {
            this.f4895s = Executors.newFixedThreadPool(oa.i.f27330a, new v());
        }
        try {
            Future submit = this.f4895s.submit(callable);
            handler.postDelayed(new androidx.work.n(submit, 1, uVar), j11);
            return submit;
        } catch (Exception e10) {
            oa.i.g("BillingClient", "Async task throws exception!", e10);
            return null;
        }
    }

    @Override // androidx.work.k
    public final void l() {
        try {
            this.f4883e.B();
            if (this.f4885h != null) {
                x xVar = this.f4885h;
                synchronized (xVar.f4965u) {
                    xVar.f4967w = null;
                    xVar.f4966v = true;
                }
            }
            if (this.f4885h != null && this.f4884g != null) {
                oa.i.e("BillingClient", "Unbinding from service.");
                this.f.unbindService(this.f4885h);
                this.f4885h = null;
            }
            this.f4884g = null;
            ExecutorService executorService = this.f4895s;
            if (executorService != null) {
                executorService.shutdownNow();
                this.f4895s = null;
            }
        } catch (Exception e10) {
            oa.i.g("BillingClient", "There was an exception while ending connection!", e10);
        } finally {
            this.f4880b = 3;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:161:0x036e  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0379  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0381  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x03b6  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x03c5 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:185:0x03d0  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x03d5  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0423 A[Catch: CancellationException -> 0x0444, TimeoutException -> 0x0446, Exception -> 0x0462, TryCatch #4 {CancellationException -> 0x0444, TimeoutException -> 0x0446, Exception -> 0x0462, blocks: (B:189:0x040f, B:191:0x0423, B:197:0x0448), top: B:210:0x040f }] */
    /* JADX WARN: Removed duplicated region for block: B:197:0x0448 A[Catch: CancellationException -> 0x0444, TimeoutException -> 0x0446, Exception -> 0x0462, TRY_LEAVE, TryCatch #4 {CancellationException -> 0x0444, TimeoutException -> 0x0446, Exception -> 0x0462, blocks: (B:189:0x040f, B:191:0x0423, B:197:0x0448), top: B:210:0x040f }] */
    @Override // androidx.work.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final g v(androidx.appcompat.app.c cVar, final f fVar) {
        Object obj;
        Object obj2;
        String str;
        String str2;
        boolean z10;
        String str3;
        String str4;
        Future H;
        int a10;
        boolean z11;
        String str5;
        SkuDetails skuDetails;
        f.b bVar;
        String str6;
        String str7;
        String str8;
        String str9;
        boolean z12;
        Intent intent;
        String str10;
        final int i6;
        String str11;
        boolean z13;
        if (!D()) {
            g gVar = z.f4977h;
            F(gVar);
            return gVar;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(fVar.f);
        oa.q qVar = fVar.f4907e;
        Iterator it = arrayList.iterator();
        if (it.hasNext()) {
            obj = it.next();
        } else {
            obj = null;
        }
        SkuDetails skuDetails2 = (SkuDetails) obj;
        Iterator<E> it2 = qVar.iterator();
        if (it2.hasNext()) {
            obj2 = it2.next();
        } else {
            obj2 = null;
        }
        f.b bVar2 = (f.b) obj2;
        if (skuDetails2 != null) {
            str2 = skuDetails2.getSku();
            str = skuDetails2.getType();
        } else {
            h hVar = bVar2.f4911a;
            String str12 = hVar.f4924c;
            str = hVar.f4925d;
            str2 = str12;
        }
        String str13 = "BillingClient";
        if (str.equals("subs") && !this.f4886i) {
            oa.i.f("BillingClient", "Current client doesn't support subscriptions.");
            g gVar2 = z.f4979j;
            F(gVar2);
            return gVar2;
        }
        if (fVar.f4904b == null && fVar.f4905c == null && fVar.f4906d.f4916b == 0 && !fVar.f4903a && !fVar.f4908g) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (z10 && !this.f4888k) {
            oa.i.f("BillingClient", "Current client doesn't support extra params for buy intent.");
            g gVar3 = z.f4975e;
            F(gVar3);
            return gVar3;
        } else if (arrayList.size() > 1 && !this.f4892o) {
            oa.i.f("BillingClient", "Current client doesn't support multi-item purchases.");
            g gVar4 = z.f4981l;
            F(gVar4);
            return gVar4;
        } else if (!qVar.isEmpty() && !this.f4893p) {
            oa.i.f("BillingClient", "Current client doesn't support purchases with ProductDetails.");
            g gVar5 = z.f4983n;
            F(gVar5);
            return gVar5;
        } else {
            boolean z14 = this.f4888k;
            Handler handler = this.f4882d;
            if (!z14) {
                str3 = "BUY_INTENT";
                String str14 = str2;
                str4 = "BillingClient";
                H = H(new t(0, this, str14, str), 5000L, null, handler);
            } else {
                boolean z15 = this.f4889l;
                boolean z16 = this.f4894q;
                boolean z17 = this.r;
                int i10 = oa.i.f27330a;
                str3 = "BUY_INTENT";
                final Bundle bundle = new Bundle();
                bundle.putString("playBillingLibraryVersion", this.f4881c);
                int i11 = fVar.f4906d.f4916b;
                if (i11 != 0) {
                    bundle.putInt("prorationMode", i11);
                }
                if (!TextUtils.isEmpty(fVar.f4904b)) {
                    bundle.putString("accountId", fVar.f4904b);
                }
                if (!TextUtils.isEmpty(fVar.f4905c)) {
                    bundle.putString("obfuscatedProfileId", fVar.f4905c);
                }
                if (fVar.f4908g) {
                    bundle.putBoolean("isOfferPersonalizedByDeveloper", true);
                }
                if (!TextUtils.isEmpty(null)) {
                    bundle.putStringArrayList("skusToReplace", new ArrayList<>(Arrays.asList(null)));
                }
                if (!TextUtils.isEmpty(fVar.f4906d.f4915a)) {
                    bundle.putString("oldSkuPurchaseToken", fVar.f4906d.f4915a);
                }
                if (!TextUtils.isEmpty(null)) {
                    bundle.putString("oldSkuPurchaseId", null);
                }
                if (!TextUtils.isEmpty(null)) {
                    bundle.putString("originalExternalTransactionId", null);
                }
                if (!TextUtils.isEmpty(null)) {
                    bundle.putString("paymentsPurchaseParams", null);
                }
                if (z15 && z16) {
                    z11 = true;
                    bundle.putBoolean("enablePendingPurchases", true);
                } else {
                    z11 = true;
                }
                if (z17) {
                    bundle.putBoolean("enableAlternativeBilling", z11);
                }
                if (arrayList.isEmpty()) {
                    str5 = "proxyPackageVersion";
                    skuDetails = skuDetails2;
                    bVar = bVar2;
                    str6 = str2;
                    str7 = str;
                    str8 = "BillingClient";
                    ArrayList<String> arrayList2 = new ArrayList<>(qVar.size() - 1);
                    ArrayList<String> arrayList3 = new ArrayList<>(qVar.size() - 1);
                    ArrayList<String> arrayList4 = new ArrayList<>();
                    ArrayList<String> arrayList5 = new ArrayList<>();
                    for (int i12 = 0; i12 < qVar.size(); i12++) {
                        f.b bVar3 = (f.b) qVar.get(i12);
                        h hVar2 = bVar3.f4911a;
                        if (!hVar2.f.isEmpty()) {
                            arrayList4.add(hVar2.f);
                        }
                        arrayList5.add(bVar3.f4912b);
                        if (i12 > 0) {
                            arrayList2.add(((f.b) qVar.get(i12)).f4911a.f4924c);
                            arrayList3.add(((f.b) qVar.get(i12)).f4911a.f4925d);
                        }
                    }
                    bundle.putStringArrayList("SKU_OFFER_ID_TOKEN_LIST", arrayList5);
                    if (!arrayList4.isEmpty()) {
                        bundle.putStringArrayList("skuDetailsTokens", arrayList4);
                    }
                    if (!arrayList2.isEmpty()) {
                        bundle.putStringArrayList("additionalSkus", arrayList2);
                        bundle.putStringArrayList("additionalSkuTypes", arrayList3);
                    }
                } else {
                    ArrayList<String> arrayList6 = new ArrayList<>();
                    ArrayList<String> arrayList7 = new ArrayList<>();
                    str7 = str;
                    ArrayList<String> arrayList8 = new ArrayList<>();
                    str6 = str2;
                    ArrayList<Integer> arrayList9 = new ArrayList<>();
                    str5 = "proxyPackageVersion";
                    ArrayList<String> arrayList10 = new ArrayList<>();
                    Iterator it3 = arrayList.iterator();
                    boolean z18 = false;
                    boolean z19 = false;
                    boolean z20 = false;
                    boolean z21 = false;
                    while (it3.hasNext()) {
                        SkuDetails skuDetails3 = (SkuDetails) it3.next();
                        if (!skuDetails3.zzf().isEmpty()) {
                            str11 = str13;
                            arrayList6.add(skuDetails3.zzf());
                        } else {
                            str11 = str13;
                        }
                        String zzc = skuDetails3.zzc();
                        f.b bVar4 = bVar2;
                        String zzb = skuDetails3.zzb();
                        int zza = skuDetails3.zza();
                        SkuDetails skuDetails4 = skuDetails2;
                        String zze = skuDetails3.zze();
                        arrayList7.add(zzc);
                        z18 |= !TextUtils.isEmpty(zzc);
                        arrayList8.add(zzb);
                        z19 |= !TextUtils.isEmpty(zzb);
                        arrayList9.add(Integer.valueOf(zza));
                        if (zza != 0) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        z20 |= z13;
                        z21 |= !TextUtils.isEmpty(zze);
                        arrayList10.add(zze);
                        str13 = str11;
                        bVar2 = bVar4;
                        skuDetails2 = skuDetails4;
                    }
                    skuDetails = skuDetails2;
                    bVar = bVar2;
                    str8 = str13;
                    if (!arrayList6.isEmpty()) {
                        bundle.putStringArrayList("skuDetailsTokens", arrayList6);
                    }
                    if (z18) {
                        bundle.putStringArrayList("SKU_OFFER_ID_TOKEN_LIST", arrayList7);
                    }
                    if (z19) {
                        bundle.putStringArrayList("SKU_OFFER_ID_LIST", arrayList8);
                    }
                    if (z20) {
                        bundle.putIntegerArrayList("SKU_OFFER_TYPE_LIST", arrayList9);
                    }
                    if (z21) {
                        bundle.putStringArrayList("SKU_SERIALIZED_DOCID_LIST", arrayList10);
                    }
                    if (arrayList.size() > 1) {
                        ArrayList<String> arrayList11 = new ArrayList<>(arrayList.size() - 1);
                        ArrayList<String> arrayList12 = new ArrayList<>(arrayList.size() - 1);
                        for (int i13 = 1; i13 < arrayList.size(); i13++) {
                            arrayList11.add(((SkuDetails) arrayList.get(i13)).getSku());
                            arrayList12.add(((SkuDetails) arrayList.get(i13)).getType());
                        }
                        bundle.putStringArrayList("additionalSkus", arrayList11);
                        bundle.putStringArrayList("additionalSkuTypes", arrayList12);
                    }
                }
                if (bundle.containsKey("SKU_OFFER_ID_TOKEN_LIST") && !this.f4890m) {
                    g gVar6 = z.f4982m;
                    F(gVar6);
                    return gVar6;
                }
                if (skuDetails != null && !TextUtils.isEmpty(skuDetails.zzd())) {
                    bundle.putString("skuPackageName", skuDetails.zzd());
                } else {
                    if (bVar != null) {
                        h hVar3 = bVar.f4911a;
                        if (!TextUtils.isEmpty(hVar3.f4923b.optString("packageName"))) {
                            bundle.putString("skuPackageName", hVar3.f4923b.optString("packageName"));
                        }
                    }
                    str9 = null;
                    z12 = false;
                    if (!TextUtils.isEmpty(str9)) {
                        bundle.putString("accountName", str9);
                    }
                    intent = cVar.getIntent();
                    if (intent != null) {
                        str4 = str8;
                        oa.i.f(str4, "Activity's intent is null.");
                    } else {
                        str4 = str8;
                        if (!TextUtils.isEmpty(intent.getStringExtra("PROXY_PACKAGE"))) {
                            String stringExtra = intent.getStringExtra("PROXY_PACKAGE");
                            bundle.putString("proxyPackage", stringExtra);
                            try {
                                str10 = str5;
                                try {
                                    bundle.putString(str10, this.f.getPackageManager().getPackageInfo(stringExtra, 0).versionName);
                                } catch (PackageManager.NameNotFoundException unused) {
                                    bundle.putString(str10, "package not found");
                                    if (!this.f4893p) {
                                    }
                                    if (!this.f4891n) {
                                    }
                                    if (this.f4889l) {
                                    }
                                    final String str15 = str6;
                                    final String str16 = str7;
                                    H = H(new Callable(i6, str15, str16, fVar, bundle) { // from class: c4.s

                                        /* renamed from: v  reason: collision with root package name */
                                        public final /* synthetic */ int f4951v;

                                        /* renamed from: w  reason: collision with root package name */
                                        public final /* synthetic */ String f4952w;

                                        /* renamed from: x  reason: collision with root package name */
                                        public final /* synthetic */ String f4953x;

                                        /* renamed from: y  reason: collision with root package name */
                                        public final /* synthetic */ Bundle f4954y;

                                        {
                                            this.f4954y = bundle;
                                        }

                                        @Override // java.util.concurrent.Callable
                                        public final Object call() {
                                            a aVar = a.this;
                                            return aVar.f4884g.I(this.f4951v, aVar.f.getPackageName(), this.f4952w, this.f4953x, this.f4954y);
                                        }
                                    }, 5000L, null, handler);
                                    Bundle bundle2 = (Bundle) H.get(5000L, TimeUnit.MILLISECONDS);
                                    a10 = oa.i.a(bundle2, str4);
                                    String d10 = oa.i.d(bundle2, str4);
                                    if (a10 == 0) {
                                    }
                                }
                            } catch (PackageManager.NameNotFoundException unused2) {
                                str10 = str5;
                            }
                        }
                    }
                    if (!this.f4893p && !qVar.isEmpty()) {
                        i6 = 17;
                    } else if (!this.f4891n && z12) {
                        i6 = 15;
                    } else if (this.f4889l) {
                        i6 = 9;
                    } else {
                        i6 = 6;
                    }
                    final String str152 = str6;
                    final String str162 = str7;
                    H = H(new Callable(i6, str152, str162, fVar, bundle) { // from class: c4.s

                        /* renamed from: v  reason: collision with root package name */
                        public final /* synthetic */ int f4951v;

                        /* renamed from: w  reason: collision with root package name */
                        public final /* synthetic */ String f4952w;

                        /* renamed from: x  reason: collision with root package name */
                        public final /* synthetic */ String f4953x;

                        /* renamed from: y  reason: collision with root package name */
                        public final /* synthetic */ Bundle f4954y;

                        {
                            this.f4954y = bundle;
                        }

                        @Override // java.util.concurrent.Callable
                        public final Object call() {
                            a aVar = a.this;
                            return aVar.f4884g.I(this.f4951v, aVar.f.getPackageName(), this.f4952w, this.f4953x, this.f4954y);
                        }
                    }, 5000L, null, handler);
                }
                str9 = null;
                z12 = true;
                if (!TextUtils.isEmpty(str9)) {
                }
                intent = cVar.getIntent();
                if (intent != null) {
                }
                if (!this.f4893p) {
                }
                if (!this.f4891n) {
                }
                if (this.f4889l) {
                }
                final String str1522 = str6;
                final String str1622 = str7;
                H = H(new Callable(i6, str1522, str1622, fVar, bundle) { // from class: c4.s

                    /* renamed from: v  reason: collision with root package name */
                    public final /* synthetic */ int f4951v;

                    /* renamed from: w  reason: collision with root package name */
                    public final /* synthetic */ String f4952w;

                    /* renamed from: x  reason: collision with root package name */
                    public final /* synthetic */ String f4953x;

                    /* renamed from: y  reason: collision with root package name */
                    public final /* synthetic */ Bundle f4954y;

                    {
                        this.f4954y = bundle;
                    }

                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        a aVar = a.this;
                        return aVar.f4884g.I(this.f4951v, aVar.f.getPackageName(), this.f4952w, this.f4953x, this.f4954y);
                    }
                }, 5000L, null, handler);
            }
            try {
                Bundle bundle22 = (Bundle) H.get(5000L, TimeUnit.MILLISECONDS);
                a10 = oa.i.a(bundle22, str4);
                String d102 = oa.i.d(bundle22, str4);
                if (a10 == 0) {
                    oa.i.f(str4, "Unable to buy item, Error response code: " + a10);
                    g gVar7 = new g();
                    gVar7.f4918a = a10;
                    gVar7.f4919b = d102;
                    F(gVar7);
                    return gVar7;
                }
                Intent intent2 = new Intent(cVar, ProxyBillingActivity.class);
                String str17 = str3;
                intent2.putExtra(str17, (PendingIntent) bundle22.getParcelable(str17));
                cVar.startActivity(intent2);
                return z.f4976g;
            } catch (CancellationException e10) {
                e = e10;
                oa.i.g(str4, "Time out while launching billing flow. Try to reconnect", e);
                g gVar8 = z.f4978i;
                F(gVar8);
                return gVar8;
            } catch (TimeoutException e11) {
                e = e11;
                oa.i.g(str4, "Time out while launching billing flow. Try to reconnect", e);
                g gVar82 = z.f4978i;
                F(gVar82);
                return gVar82;
            } catch (Exception e12) {
                oa.i.g(str4, "Exception while launching billing flow. Try to reconnect", e12);
                g gVar9 = z.f4977h;
                F(gVar9);
                return gVar9;
            }
        }
    }
}
