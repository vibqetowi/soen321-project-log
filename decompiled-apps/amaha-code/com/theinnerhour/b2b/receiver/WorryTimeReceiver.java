package com.theinnerhour.b2b.receiver;

import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import com.theinnerhour.b2b.components.splash.activity.SplashScreenActivity;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.utils.NotificationUtil;
import java.util.Random;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
/* compiled from: WorryTimeReceiver.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f¨\u0006\u000f"}, d2 = {"Lcom/theinnerhour/b2b/receiver/WorryTimeReceiver;", "Landroid/content/BroadcastReceiver;", "Landroid/content/Context;", "context", "Landroid/content/Intent;", "intent", "Lhs/k;", "onReceive", "", "TAG", "Ljava/lang/String;", "getTAG", "()Ljava/lang/String;", "<init>", "()V", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class WorryTimeReceiver extends BroadcastReceiver {
    private final String TAG = LogHelper.INSTANCE.makeLogTag(WorryTimeReceiver.class);

    public final String getTAG() {
        return this.TAG;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        int i6;
        i.g(context, "context");
        try {
            LogHelper logHelper = LogHelper.INSTANCE;
            String str = this.TAG;
            StringBuilder sb2 = new StringBuilder("on receive ");
            i.d(intent);
            sb2.append(intent.getExtras());
            logHelper.i(str, sb2.toString());
            Intent intent2 = new Intent(context, SplashScreenActivity.class);
            Bundle extras = intent.getExtras();
            i.d(extras);
            intent2.putExtras(extras);
            intent2.addFlags(268435456);
            int nextInt = new Random().nextInt();
            int nextInt2 = new Random().nextInt();
            if (Build.VERSION.SDK_INT >= 23) {
                i6 = 201326592;
            } else {
                i6 = 134217728;
            }
            new NotificationUtil().showNotification(context, "Your worry time has arrived", "You have 20 minutes to worry. Take a look at our recommendations to see what you can do to feel better.", String.valueOf(nextInt), nextInt, "channel_activity", "Activities", 3, PendingIntent.getActivity(context, nextInt2, intent2, i6), 1, "reminder", true);
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.TAG, "exception in on receive", e10);
        }
    }
}
