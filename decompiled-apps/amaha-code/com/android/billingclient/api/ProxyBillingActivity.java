package com.android.billingclient.api;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.os.ResultReceiver;
import com.appsflyer.R;
import com.google.android.apps.common.proguard.UsedByReflection;
import oa.i;
/* compiled from: com.android.billingclient:billing@@5.0.0 */
@UsedByReflection("PlatformActivityProxy")
/* loaded from: classes.dex */
public class ProxyBillingActivity extends Activity {

    /* renamed from: u  reason: collision with root package name */
    public ResultReceiver f5855u;

    /* renamed from: v  reason: collision with root package name */
    public ResultReceiver f5856v;

    /* renamed from: w  reason: collision with root package name */
    public boolean f5857w;

    public final Intent a() {
        Intent intent = new Intent("com.android.vending.billing.PURCHASES_UPDATED");
        intent.setPackage(getApplicationContext().getPackageName());
        return intent;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00be  */
    @Override // android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onActivityResult(int i6, int i10, Intent intent) {
        int i11;
        ResultReceiver resultReceiver;
        ResultReceiver resultReceiver2;
        Intent a10;
        super.onActivityResult(i6, i10, intent);
        Bundle bundle = null;
        if (i6 == 100) {
            int i12 = i.c(intent, "ProxyBillingActivity").f4918a;
            if (i10 == -1) {
                if (i12 != 0) {
                    i10 = -1;
                } else {
                    i12 = 0;
                    resultReceiver2 = this.f5855u;
                    if (resultReceiver2 == null) {
                        if (intent != null) {
                            bundle = intent.getExtras();
                        }
                        resultReceiver2.send(i12, bundle);
                    } else {
                        if (intent != null) {
                            if (intent.getExtras() != null) {
                                String string = intent.getExtras().getString("ALTERNATIVE_BILLING_USER_CHOICE_DATA");
                                if (string != null) {
                                    a10 = new Intent("com.android.vending.billing.ALTERNATIVE_BILLING");
                                    a10.setPackage(getApplicationContext().getPackageName());
                                    a10.putExtra("ALTERNATIVE_BILLING_USER_CHOICE_DATA", string);
                                } else {
                                    Intent a11 = a();
                                    a11.putExtras(intent.getExtras());
                                    a10 = a11;
                                }
                            } else {
                                a10 = a();
                                i.f("ProxyBillingActivity", "Got null bundle!");
                                a10.putExtra("RESPONSE_CODE", 6);
                                a10.putExtra("DEBUG_MESSAGE", "An internal error occurred.");
                            }
                        } else {
                            a10 = a();
                        }
                        sendBroadcast(a10);
                    }
                }
            }
            i.f("ProxyBillingActivity", "Activity finished with resultCode " + i10 + " and billing's responseCode: " + i12);
            resultReceiver2 = this.f5855u;
            if (resultReceiver2 == null) {
            }
        } else if (i6 == 101) {
            if (intent == null) {
                i.f("ProxyBillingActivity", "Got null intent!");
            } else {
                int i13 = i.f27330a;
                Bundle extras = intent.getExtras();
                if (extras == null) {
                    i.f("ProxyBillingActivity", "Unexpected null bundle received!");
                } else {
                    i11 = extras.getInt("IN_APP_MESSAGE_RESPONSE_CODE", 0);
                    resultReceiver = this.f5856v;
                    if (resultReceiver != null) {
                        if (intent != null) {
                            bundle = intent.getExtras();
                        }
                        resultReceiver.send(i11, bundle);
                    }
                }
            }
            i11 = 0;
            resultReceiver = this.f5856v;
            if (resultReceiver != null) {
            }
        } else {
            i.f("ProxyBillingActivity", "Got onActivityResult with wrong requestCode: " + i6 + "; skipping...");
        }
        this.f5857w = false;
        finish();
    }

    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) {
        PendingIntent pendingIntent;
        int i6;
        super.onCreate(bundle);
        if (bundle == null) {
            i.e("ProxyBillingActivity", "Launching Play Store billing flow");
            try {
                if (getIntent().hasExtra("BUY_INTENT")) {
                    pendingIntent = (PendingIntent) getIntent().getParcelableExtra("BUY_INTENT");
                } else if (getIntent().hasExtra("SUBS_MANAGEMENT_INTENT")) {
                    pendingIntent = (PendingIntent) getIntent().getParcelableExtra("SUBS_MANAGEMENT_INTENT");
                    this.f5855u = (ResultReceiver) getIntent().getParcelableExtra("result_receiver");
                } else if (getIntent().hasExtra("IN_APP_MESSAGE_INTENT")) {
                    pendingIntent = (PendingIntent) getIntent().getParcelableExtra("IN_APP_MESSAGE_INTENT");
                    this.f5856v = (ResultReceiver) getIntent().getParcelableExtra("in_app_message_result_receiver");
                    i6 = R.styleable.AppCompatTheme_switchStyle;
                    this.f5857w = true;
                    startIntentSenderForResult(pendingIntent.getIntentSender(), i6, new Intent(), 0, 0, 0);
                    return;
                } else {
                    pendingIntent = null;
                }
                this.f5857w = true;
                startIntentSenderForResult(pendingIntent.getIntentSender(), i6, new Intent(), 0, 0, 0);
                return;
            } catch (IntentSender.SendIntentException e10) {
                i.g("ProxyBillingActivity", "Got exception while trying to start a purchase flow.", e10);
                ResultReceiver resultReceiver = this.f5855u;
                if (resultReceiver != null) {
                    resultReceiver.send(6, null);
                } else {
                    ResultReceiver resultReceiver2 = this.f5856v;
                    if (resultReceiver2 != null) {
                        resultReceiver2.send(0, null);
                    } else {
                        Intent a10 = a();
                        a10.putExtra("RESPONSE_CODE", 6);
                        a10.putExtra("DEBUG_MESSAGE", "An internal error occurred.");
                        sendBroadcast(a10);
                    }
                }
                this.f5857w = false;
                finish();
                return;
            }
            i6 = 100;
        } else {
            i.e("ProxyBillingActivity", "Launching Play Store billing flow from savedInstanceState");
            this.f5857w = bundle.getBoolean("send_cancelled_broadcast_if_finished", false);
            if (bundle.containsKey("result_receiver")) {
                this.f5855u = (ResultReceiver) bundle.getParcelable("result_receiver");
            } else if (bundle.containsKey("in_app_message_result_receiver")) {
                this.f5856v = (ResultReceiver) bundle.getParcelable("in_app_message_result_receiver");
            }
        }
    }

    @Override // android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        if (!isFinishing() || !this.f5857w) {
            return;
        }
        Intent a10 = a();
        a10.putExtra("RESPONSE_CODE", 1);
        a10.putExtra("DEBUG_MESSAGE", "Billing dialog closed.");
        sendBroadcast(a10);
    }

    @Override // android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        ResultReceiver resultReceiver = this.f5855u;
        if (resultReceiver != null) {
            bundle.putParcelable("result_receiver", resultReceiver);
        }
        ResultReceiver resultReceiver2 = this.f5856v;
        if (resultReceiver2 != null) {
            bundle.putParcelable("in_app_message_result_receiver", resultReceiver2);
        }
        bundle.putBoolean("send_cancelled_broadcast_if_finished", this.f5857w);
    }
}
