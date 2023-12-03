package com.theinnerhour.b2b.receiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.work.r;
import com.google.firebase.auth.FirebaseAuth;
import com.theinnerhour.b2b.MyApplication;
import com.theinnerhour.b2b.service.BootReceiverNotificationWorkManager;
import com.theinnerhour.b2b.utils.LogHelper;
import fd.f;
import gv.n;
import java.util.Collections;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
import n2.a0;
/* compiled from: BootReceiver.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\r"}, d2 = {"Lcom/theinnerhour/b2b/receiver/BootReceiver;", "Landroid/content/BroadcastReceiver;", "Landroid/content/Context;", "context", "Landroid/content/Intent;", "intent", "Lhs/k;", "onReceive", "", "TAG", "Ljava/lang/String;", "<init>", "()V", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class BootReceiver extends BroadcastReceiver {
    private final String TAG = LogHelper.INSTANCE.makeLogTag("BootReceiver");

    /* JADX WARN: Removed duplicated region for block: B:16:0x002c A[Catch: Exception -> 0x0050, TRY_LEAVE, TryCatch #0 {Exception -> 0x0050, blocks: (B:3:0x000a, B:5:0x0010, B:7:0x0018, B:10:0x0020, B:16:0x002c), top: B:21:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    @Override // android.content.BroadcastReceiver
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onReceive(Context context, Intent intent) {
        String str;
        boolean z10;
        i.g(context, "context");
        i.g(intent, "intent");
        try {
            if (intent.getAction() != null) {
                f fVar = FirebaseAuth.getInstance().f;
                if (fVar != null) {
                    str = fVar.j0();
                } else {
                    str = null;
                }
                if (str != null && !n.B0(str)) {
                    z10 = false;
                    if (z10) {
                        a0 e10 = a0.e(MyApplication.V.a());
                        e10.getClass();
                        e10.a("boot_notification", Collections.singletonList(new r.a(BootReceiverNotificationWorkManager.class).a()));
                        return;
                    }
                    return;
                }
                z10 = true;
                if (z10) {
                }
            }
        } catch (Exception e11) {
            LogHelper.INSTANCE.e(this.TAG, e11);
        }
    }
}
