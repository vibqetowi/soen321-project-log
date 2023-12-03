package com.facebook;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
/* compiled from: CustomTabActivity.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/facebook/CustomTabActivity;", "Landroid/app/Activity;", "<init>", "()V", "facebook-common_release"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes.dex */
public final class CustomTabActivity extends Activity {

    /* renamed from: v  reason: collision with root package name */
    public static final String f6093v = i.n(".action_customTabRedirect", "CustomTabActivity");

    /* renamed from: w  reason: collision with root package name */
    public static final String f6094w = i.n(".action_destroy", "CustomTabActivity");

    /* renamed from: u  reason: collision with root package name */
    public a f6095u;

    /* compiled from: CustomTabActivity.kt */
    /* loaded from: classes.dex */
    public static final class a extends BroadcastReceiver {
        public a() {
        }

        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            i.g(context, "context");
            i.g(intent, "intent");
            CustomTabActivity.this.finish();
        }
    }

    @Override // android.app.Activity
    public final void onActivityResult(int i6, int i10, Intent intent) {
        super.onActivityResult(i6, i10, intent);
        if (i10 == 0) {
            Intent intent2 = new Intent(f6093v);
            intent2.putExtra(CustomTabMainActivity.f6100z, getIntent().getDataString());
            n1.a.a(this).c(intent2);
            a aVar = new a();
            n1.a.a(this).b(aVar, new IntentFilter(f6094w));
            this.f6095u = aVar;
        }
    }

    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Intent intent = new Intent(this, CustomTabMainActivity.class);
        intent.setAction(f6093v);
        intent.putExtra(CustomTabMainActivity.f6100z, getIntent().getDataString());
        intent.addFlags(603979776);
        startActivityForResult(intent, 2);
    }

    @Override // android.app.Activity
    public final void onDestroy() {
        a aVar = this.f6095u;
        if (aVar != null) {
            n1.a.a(this).d(aVar);
        }
        super.onDestroy();
    }
}
