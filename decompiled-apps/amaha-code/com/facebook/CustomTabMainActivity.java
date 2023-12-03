package com.facebook;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Bundle;
import g6.a0;
import g6.c;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
import q.d;
import q.f;
import w5.e;
import w5.e0;
import w5.r;
import w5.w;
/* compiled from: CustomTabMainActivity.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/facebook/CustomTabMainActivity;", "Landroid/app/Activity;", "<init>", "()V", "facebook-common_release"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes.dex */
public final class CustomTabMainActivity extends Activity {

    /* renamed from: u  reason: collision with root package name */
    public boolean f6101u = true;

    /* renamed from: v  reason: collision with root package name */
    public b f6102v;

    /* renamed from: w  reason: collision with root package name */
    public static final String f6097w = i.n(".extra_action", "CustomTabMainActivity");

    /* renamed from: x  reason: collision with root package name */
    public static final String f6098x = i.n(".extra_params", "CustomTabMainActivity");

    /* renamed from: y  reason: collision with root package name */
    public static final String f6099y = i.n(".extra_chromePackage", "CustomTabMainActivity");

    /* renamed from: z  reason: collision with root package name */
    public static final String f6100z = i.n(".extra_url", "CustomTabMainActivity");
    public static final String A = i.n(".extra_targetApp", "CustomTabMainActivity");
    public static final String B = i.n(".action_refresh", "CustomTabMainActivity");
    public static final String C = i.n(".no_activity_exception", "CustomTabMainActivity");

    /* compiled from: CustomTabMainActivity.kt */
    /* loaded from: classes.dex */
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f6103a;

        static {
            int[] iArr = new int[a0.valuesCustom().length];
            iArr[1] = 1;
            f6103a = iArr;
        }
    }

    /* compiled from: CustomTabMainActivity.kt */
    /* loaded from: classes.dex */
    public static final class b extends BroadcastReceiver {
        public b() {
        }

        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            i.g(context, "context");
            i.g(intent, "intent");
            CustomTabMainActivity customTabMainActivity = CustomTabMainActivity.this;
            Intent intent2 = new Intent(customTabMainActivity, CustomTabMainActivity.class);
            intent2.setAction(CustomTabMainActivity.B);
            String str = CustomTabMainActivity.f6100z;
            intent2.putExtra(str, intent.getStringExtra(str));
            intent2.addFlags(603979776);
            customTabMainActivity.startActivity(intent2);
        }
    }

    public final void a(Intent intent, int i6) {
        Bundle bundle;
        b bVar = this.f6102v;
        if (bVar != null) {
            n1.a.a(this).d(bVar);
        }
        if (intent != null) {
            String stringExtra = intent.getStringExtra(f6100z);
            if (stringExtra != null) {
                Uri parse = Uri.parse(stringExtra);
                e0 e0Var = e0.f36453a;
                bundle = e0.F(parse.getQuery());
                bundle.putAll(e0.F(parse.getFragment()));
            } else {
                bundle = new Bundle();
            }
            w wVar = w.f36549a;
            Intent intent2 = getIntent();
            i.f(intent2, "intent");
            Intent e10 = w.e(intent2, bundle, null);
            if (e10 != null) {
                intent = e10;
            }
            setResult(i6, intent);
        } else {
            w wVar2 = w.f36549a;
            Intent intent3 = getIntent();
            i.f(intent3, "intent");
            setResult(i6, w.e(intent3, null, null));
        }
        finish();
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00ba  */
    @Override // android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onCreate(Bundle bundle) {
        String stringExtra;
        a0 a0Var;
        e eVar;
        boolean z10;
        super.onCreate(bundle);
        if (i.b(CustomTabActivity.f6093v, getIntent().getAction())) {
            setResult(0);
            finish();
        } else if (bundle != null || (stringExtra = getIntent().getStringExtra(f6097w)) == null) {
        } else {
            Bundle bundleExtra = getIntent().getBundleExtra(f6098x);
            String stringExtra2 = getIntent().getStringExtra(f6099y);
            String stringExtra3 = getIntent().getStringExtra(A);
            a0[] valuesCustom = a0.valuesCustom();
            int length = valuesCustom.length;
            int i6 = 0;
            while (true) {
                if (i6 < length) {
                    a0Var = valuesCustom[i6];
                    i6++;
                    if (i.b(a0Var.f16230u, stringExtra3)) {
                        break;
                    }
                } else {
                    a0Var = a0.FACEBOOK;
                    break;
                }
            }
            if (a.f6103a[a0Var.ordinal()] == 1) {
                eVar = new r(bundleExtra, stringExtra);
            } else {
                eVar = new e(bundleExtra, stringExtra);
            }
            if (!b6.a.b(eVar)) {
                try {
                    ReentrantLock reentrantLock = c.f16237x;
                    reentrantLock.lock();
                    f fVar = c.f16236w;
                    c.f16236w = null;
                    reentrantLock.unlock();
                    d a10 = new d.b(fVar).a();
                    a10.f29097a.setPackage(stringExtra2);
                    try {
                        a10.a(this, eVar.f36452a);
                        z10 = true;
                    } catch (ActivityNotFoundException unused) {
                    }
                } catch (Throwable th2) {
                    b6.a.a(eVar, th2);
                }
                this.f6101u = false;
                if (z10) {
                    setResult(0, getIntent().putExtra(C, true));
                    finish();
                    return;
                }
                b bVar = new b();
                this.f6102v = bVar;
                n1.a.a(this).b(bVar, new IntentFilter(CustomTabActivity.f6093v));
                return;
            }
            z10 = false;
            this.f6101u = false;
            if (z10) {
            }
        }
    }

    @Override // android.app.Activity
    public final void onNewIntent(Intent intent) {
        i.g(intent, "intent");
        super.onNewIntent(intent);
        if (i.b(B, intent.getAction())) {
            n1.a.a(this).c(new Intent(CustomTabActivity.f6094w));
            a(intent, -1);
        } else if (i.b(CustomTabActivity.f6093v, intent.getAction())) {
            a(intent, -1);
        }
    }

    @Override // android.app.Activity
    public final void onResume() {
        super.onResume();
        if (this.f6101u) {
            a(null, 0);
        }
        this.f6101u = true;
    }
}
