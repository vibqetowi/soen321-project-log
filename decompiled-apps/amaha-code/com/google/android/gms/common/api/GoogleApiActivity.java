package com.google.android.gms.common.api;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.api.internal.f;
import com.theinnerhour.b2b.utils.Constants;
import ka.d;
import s9.e;
import v9.o;
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
@KeepName
/* loaded from: classes.dex */
public class GoogleApiActivity extends Activity implements DialogInterface.OnCancelListener {

    /* renamed from: v  reason: collision with root package name */
    public static final /* synthetic */ int f7292v = 0;

    /* renamed from: u  reason: collision with root package name */
    public int f7293u = 0;

    @Override // android.app.Activity
    public final void onActivityResult(int i6, int i10, Intent intent) {
        super.onActivityResult(i6, i10, intent);
        if (i6 == 1) {
            boolean booleanExtra = getIntent().getBooleanExtra("notify_manager", true);
            this.f7293u = 0;
            setResult(i10, intent);
            if (booleanExtra) {
                f f = f.f(this);
                if (i10 != -1) {
                    if (i10 == 0) {
                        f.g(new s9.b(13, null), getIntent().getIntExtra("failing_client_id", -1));
                    }
                } else {
                    d dVar = f.G;
                    dVar.sendMessage(dVar.obtainMessage(3));
                }
            }
        } else if (i6 == 2) {
            this.f7293u = 0;
            setResult(i10, intent);
        }
        finish();
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        this.f7293u = 0;
        setResult(0);
        finish();
    }

    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle != null) {
            this.f7293u = bundle.getInt("resolution");
        }
        if (this.f7293u != 1) {
            Bundle extras = getIntent().getExtras();
            if (extras == null) {
                Log.e("GoogleApiActivity", "Activity started without extras");
                finish();
                return;
            }
            PendingIntent pendingIntent = (PendingIntent) extras.get("pending_intent");
            Integer num = (Integer) extras.get("error_code");
            if (pendingIntent == null && num == null) {
                Log.e("GoogleApiActivity", "Activity started without resolution");
                finish();
            } else if (pendingIntent != null) {
                try {
                    startIntentSenderForResult(pendingIntent.getIntentSender(), 1, null, 0, 0, 0);
                    this.f7293u = 1;
                } catch (ActivityNotFoundException e10) {
                    if (extras.getBoolean("notify_manager", true)) {
                        f.f(this).g(new s9.b(22, null), getIntent().getIntExtra("failing_client_id", -1));
                    } else {
                        String obj = pendingIntent.toString();
                        StringBuilder sb2 = new StringBuilder(obj.length() + 36);
                        sb2.append("Activity not found while launching ");
                        sb2.append(obj);
                        sb2.append(".");
                        String sb3 = sb2.toString();
                        if (Build.FINGERPRINT.contains(Constants.COURSE_GENERIC)) {
                            sb3 = sb3.concat(" This may occur when resolving Google Play services connection issues on emulators with Google APIs but not Google Play Store.");
                        }
                        Log.e("GoogleApiActivity", sb3, e10);
                    }
                    this.f7293u = 1;
                    finish();
                } catch (IntentSender.SendIntentException e11) {
                    Log.e("GoogleApiActivity", "Failed to launch pendingIntent", e11);
                    finish();
                }
            } else {
                o.h(num);
                e.f31337d.d(this, num.intValue(), this);
                this.f7293u = 1;
            }
        }
    }

    @Override // android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        bundle.putInt("resolution", this.f7293u);
        super.onSaveInstanceState(bundle);
    }
}
