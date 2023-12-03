package qg;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
/* compiled from: CouponCodeHandler.kt */
/* loaded from: classes.dex */
public final class y {

    /* compiled from: CouponCodeHandler.kt */
    /* loaded from: classes.dex */
    public static final class a extends kotlin.jvm.internal.k implements ss.a<String> {

        /* renamed from: u  reason: collision with root package name */
        public static final a f29587u = new a();

        public a() {
            super(0);
        }

        @Override // ss.a
        public final /* bridge */ /* synthetic */ String invoke() {
            return "Core_CouponCodeHandler showDialogIfRequired() : ";
        }
    }

    public static final void a(final Context context, final ih.p sdkInstance, String str, final String str2) {
        kotlin.jvm.internal.i.g(context, "context");
        kotlin.jvm.internal.i.g(sdkInstance, "sdkInstance");
        AlertDialog.Builder builder = new AlertDialog.Builder(context);
        builder.setMessage(str).setPositiveButton("Copy Code", new DialogInterface.OnClickListener() { // from class: qg.x
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i6) {
                Context context2 = context;
                kotlin.jvm.internal.i.g(context2, "$context");
                String couponCode = str2;
                kotlin.jvm.internal.i.g(couponCode, "$couponCode");
                ih.p sdkInstance2 = sdkInstance;
                kotlin.jvm.internal.i.g(sdkInstance2, "$sdkInstance");
                di.b.d(context2, couponCode);
                di.b.x(context2, "Coupon code copied to clipboard");
                ng.c cVar = new ng.c();
                cVar.a(couponCode, "coupon_code");
                String appId = (String) sdkInstance2.f20102a.f5133c;
                kotlin.jvm.internal.i.g(appId, "appId");
                ih.p b10 = g0.b(appId);
                if (b10 != null) {
                    w.f29578a.getClass();
                    w.d(b10).c(context2, "EVENT_ACTION_COUPON_CODE_COPY", cVar);
                }
            }
        });
        builder.create().show();
    }

    public static final void b(Activity activity, ih.p sdkInstance) {
        Bundle extras;
        String a10;
        Intent intent;
        Bundle extras2;
        String string;
        String string2;
        kotlin.jvm.internal.i.g(activity, "activity");
        kotlin.jvm.internal.i.g(sdkInstance, "sdkInstance");
        try {
            Intent intent2 = activity.getIntent();
            if (intent2 != null && (extras = intent2.getExtras()) != null) {
                ng.a.f26311a.getClass();
                a10 = ng.a.a(extras);
                if (a10 != null || (intent = activity.getIntent()) == null || (extras2 = intent.getExtras()) == null || !kotlin.jvm.internal.i.b(a10, (String) sdkInstance.f20102a.f5133c) || !extras2.containsKey("gcm_show_dialog")) {
                    return;
                }
                intent.removeExtra("gcm_show_dialog");
                if (extras2.containsKey("gcm_coupon_code") || (string = extras2.getString("gcm_alert")) == null || (string2 = extras2.getString("gcm_coupon_code")) == null) {
                    return;
                }
                intent.removeExtra("gcm_alert");
                intent.removeExtra("gcm_coupon_code");
                a(activity, sdkInstance, string, string2);
            }
            a10 = null;
            if (a10 != null) {
                return;
            }
            intent.removeExtra("gcm_show_dialog");
            if (extras2.containsKey("gcm_coupon_code")) {
                return;
            }
            intent.removeExtra("gcm_alert");
            intent.removeExtra("gcm_coupon_code");
            a(activity, sdkInstance, string, string2);
        } catch (Exception e10) {
            sdkInstance.f20105d.a(1, e10, a.f29587u);
        }
    }
}
