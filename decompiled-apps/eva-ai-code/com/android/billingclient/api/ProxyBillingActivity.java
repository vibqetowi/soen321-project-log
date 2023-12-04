package com.android.billingclient.api;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.os.ResultReceiver;
import com.android.billingclient.api.BillingResult;
/* compiled from: com.android.billingclient:billing@@6.0.1 */
/* loaded from: classes2.dex */
public class ProxyBillingActivity extends Activity {
    static final String KEY_IN_APP_MESSAGE_RESULT_RECEIVER = "in_app_message_result_receiver";
    static final String KEY_PRICE_CHANGE_RESULT_RECEIVER = "result_receiver";
    private static final String KEY_SEND_CANCELLED_BROADCAST_IF_FINISHED = "send_cancelled_broadcast_if_finished";
    private static final int REQUEST_CODE_FIRST_PARTY_PURCHASE_FLOW = 110;
    private static final int REQUEST_CODE_IN_APP_MESSAGE_FLOW = 101;
    private static final int REQUEST_CODE_LAUNCH_ACTIVITY = 100;
    private static final String TAG = "ProxyBillingActivity";
    private ResultReceiver inAppMessageResultReceiver;
    private boolean isFlowFromFirstPartyClient;
    private ResultReceiver priceChangeResultReceiver;
    private boolean sendCancelledBroadcastIfFinished;

    private Intent makeAlternativeBillingIntent(String str) {
        Intent intent = new Intent("com.android.vending.billing.ALTERNATIVE_BILLING");
        intent.setPackage(getApplicationContext().getPackageName());
        intent.putExtra("ALTERNATIVE_BILLING_USER_CHOICE_DATA", str);
        return intent;
    }

    private Intent makePurchasesUpdatedIntent() {
        Intent intent = new Intent("com.android.vending.billing.PURCHASES_UPDATED");
        intent.setPackage(getApplicationContext().getPackageName());
        return intent;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x007a  */
    @Override // android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected void onActivityResult(int i, int i2, Intent intent) {
        ResultReceiver resultReceiver;
        Intent makePurchasesUpdatedIntent;
        super.onActivityResult(i, i2, intent);
        if (i == 100 || i == REQUEST_CODE_FIRST_PARTY_PURCHASE_FLOW) {
            int responseCode = com.google.android.gms.internal.play_billing.zzb.zzd(intent, TAG).getResponseCode();
            if (i2 == -1) {
                if (responseCode != 0) {
                    i2 = -1;
                } else {
                    responseCode = 0;
                    resultReceiver = this.priceChangeResultReceiver;
                    if (resultReceiver == null) {
                        resultReceiver.send(responseCode, intent != null ? intent.getExtras() : null);
                    } else {
                        if (intent != null) {
                            if (intent.getExtras() != null) {
                                String string = intent.getExtras().getString("ALTERNATIVE_BILLING_USER_CHOICE_DATA");
                                if (string != null) {
                                    makePurchasesUpdatedIntent = makeAlternativeBillingIntent(string);
                                    makePurchasesUpdatedIntent.putExtra("INTENT_SOURCE", "LAUNCH_BILLING_FLOW");
                                } else {
                                    makePurchasesUpdatedIntent = makePurchasesUpdatedIntent();
                                    makePurchasesUpdatedIntent.putExtras(intent.getExtras());
                                    makePurchasesUpdatedIntent.putExtra("INTENT_SOURCE", "LAUNCH_BILLING_FLOW");
                                }
                            } else {
                                makePurchasesUpdatedIntent = makePurchasesUpdatedIntent();
                                com.google.android.gms.internal.play_billing.zzb.zzj(TAG, "Got null bundle!");
                                makePurchasesUpdatedIntent.putExtra("RESPONSE_CODE", 6);
                                makePurchasesUpdatedIntent.putExtra("DEBUG_MESSAGE", "An internal error occurred.");
                                BillingResult.Builder newBuilder = BillingResult.newBuilder();
                                newBuilder.setResponseCode(6);
                                newBuilder.setDebugMessage("An internal error occurred.");
                                makePurchasesUpdatedIntent.putExtra("FAILURE_LOGGING_PAYLOAD", zzaq.zza(22, 2, newBuilder.build()).zzc());
                                makePurchasesUpdatedIntent.putExtra("INTENT_SOURCE", "LAUNCH_BILLING_FLOW");
                            }
                        } else {
                            makePurchasesUpdatedIntent = makePurchasesUpdatedIntent();
                        }
                        if (i == REQUEST_CODE_FIRST_PARTY_PURCHASE_FLOW) {
                            makePurchasesUpdatedIntent.putExtra("IS_FIRST_PARTY_PURCHASE", true);
                        }
                        sendBroadcast(makePurchasesUpdatedIntent);
                    }
                }
            }
            com.google.android.gms.internal.play_billing.zzb.zzj(TAG, "Activity finished with resultCode " + i2 + " and billing's responseCode: " + responseCode);
            resultReceiver = this.priceChangeResultReceiver;
            if (resultReceiver == null) {
            }
        } else if (i == 101) {
            int zza = com.google.android.gms.internal.play_billing.zzb.zza(intent, TAG);
            ResultReceiver resultReceiver2 = this.inAppMessageResultReceiver;
            if (resultReceiver2 != null) {
                resultReceiver2.send(zza, intent != null ? intent.getExtras() : null);
            }
        } else {
            com.google.android.gms.internal.play_billing.zzb.zzj(TAG, "Got onActivityResult with wrong requestCode: " + i + "; skipping...");
        }
        this.sendCancelledBroadcastIfFinished = false;
        finish();
    }

    @Override // android.app.Activity
    protected void onCreate(Bundle bundle) {
        int i;
        PendingIntent pendingIntent;
        int i2;
        super.onCreate(bundle);
        if (bundle == null) {
            com.google.android.gms.internal.play_billing.zzb.zzi(TAG, "Launching Play Store billing flow");
            if (getIntent().hasExtra("BUY_INTENT")) {
                pendingIntent = (PendingIntent) getIntent().getParcelableExtra("BUY_INTENT");
                if (getIntent().hasExtra("IS_FLOW_FROM_FIRST_PARTY_CLIENT") && getIntent().getBooleanExtra("IS_FLOW_FROM_FIRST_PARTY_CLIENT", false)) {
                    this.isFlowFromFirstPartyClient = true;
                    i2 = REQUEST_CODE_FIRST_PARTY_PURCHASE_FLOW;
                    i = i2;
                }
                i = 100;
            } else if (getIntent().hasExtra("SUBS_MANAGEMENT_INTENT")) {
                pendingIntent = (PendingIntent) getIntent().getParcelableExtra("SUBS_MANAGEMENT_INTENT");
                this.priceChangeResultReceiver = (ResultReceiver) getIntent().getParcelableExtra(KEY_PRICE_CHANGE_RESULT_RECEIVER);
                i = 100;
            } else if (getIntent().hasExtra("IN_APP_MESSAGE_INTENT")) {
                pendingIntent = (PendingIntent) getIntent().getParcelableExtra("IN_APP_MESSAGE_INTENT");
                this.inAppMessageResultReceiver = (ResultReceiver) getIntent().getParcelableExtra(KEY_IN_APP_MESSAGE_RESULT_RECEIVER);
                i2 = 101;
                i = i2;
            } else {
                i = 100;
                pendingIntent = null;
            }
            try {
                this.sendCancelledBroadcastIfFinished = true;
                startIntentSenderForResult(pendingIntent.getIntentSender(), i, new Intent(), 0, 0, 0);
                return;
            } catch (IntentSender.SendIntentException e) {
                com.google.android.gms.internal.play_billing.zzb.zzk(TAG, "Got exception while trying to start a purchase flow.", e);
                ResultReceiver resultReceiver = this.priceChangeResultReceiver;
                if (resultReceiver != null) {
                    resultReceiver.send(6, null);
                } else {
                    ResultReceiver resultReceiver2 = this.inAppMessageResultReceiver;
                    if (resultReceiver2 != null) {
                        resultReceiver2.send(0, null);
                    } else {
                        Intent makePurchasesUpdatedIntent = makePurchasesUpdatedIntent();
                        if (this.isFlowFromFirstPartyClient) {
                            makePurchasesUpdatedIntent.putExtra("IS_FIRST_PARTY_PURCHASE", true);
                        }
                        makePurchasesUpdatedIntent.putExtra("RESPONSE_CODE", 6);
                        makePurchasesUpdatedIntent.putExtra("DEBUG_MESSAGE", "An internal error occurred.");
                        sendBroadcast(makePurchasesUpdatedIntent);
                    }
                }
                this.sendCancelledBroadcastIfFinished = false;
                finish();
                return;
            }
        }
        com.google.android.gms.internal.play_billing.zzb.zzi(TAG, "Launching Play Store billing flow from savedInstanceState");
        this.sendCancelledBroadcastIfFinished = bundle.getBoolean(KEY_SEND_CANCELLED_BROADCAST_IF_FINISHED, false);
        if (bundle.containsKey(KEY_PRICE_CHANGE_RESULT_RECEIVER)) {
            this.priceChangeResultReceiver = (ResultReceiver) bundle.getParcelable(KEY_PRICE_CHANGE_RESULT_RECEIVER);
        } else if (bundle.containsKey(KEY_IN_APP_MESSAGE_RESULT_RECEIVER)) {
            this.inAppMessageResultReceiver = (ResultReceiver) bundle.getParcelable(KEY_IN_APP_MESSAGE_RESULT_RECEIVER);
        }
        this.isFlowFromFirstPartyClient = bundle.getBoolean("IS_FLOW_FROM_FIRST_PARTY_CLIENT", false);
    }

    @Override // android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        if (isFinishing() && this.sendCancelledBroadcastIfFinished) {
            Intent makePurchasesUpdatedIntent = makePurchasesUpdatedIntent();
            makePurchasesUpdatedIntent.putExtra("RESPONSE_CODE", 1);
            makePurchasesUpdatedIntent.putExtra("DEBUG_MESSAGE", "Billing dialog closed.");
            sendBroadcast(makePurchasesUpdatedIntent);
        }
    }

    @Override // android.app.Activity
    protected void onSaveInstanceState(Bundle bundle) {
        ResultReceiver resultReceiver = this.priceChangeResultReceiver;
        if (resultReceiver != null) {
            bundle.putParcelable(KEY_PRICE_CHANGE_RESULT_RECEIVER, resultReceiver);
        }
        ResultReceiver resultReceiver2 = this.inAppMessageResultReceiver;
        if (resultReceiver2 != null) {
            bundle.putParcelable(KEY_IN_APP_MESSAGE_RESULT_RECEIVER, resultReceiver2);
        }
        bundle.putBoolean(KEY_SEND_CANCELLED_BROADCAST_IF_FINISHED, this.sendCancelledBroadcastIfFinished);
        bundle.putBoolean("IS_FLOW_FROM_FIRST_PARTY_CLIENT", this.isFlowFromFirstPartyClient);
    }
}
