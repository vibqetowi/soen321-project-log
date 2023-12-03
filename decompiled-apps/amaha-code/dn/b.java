package dn;

import android.content.DialogInterface;
import android.os.Bundle;
import com.theinnerhour.b2b.components.lock.activity.LockScreenActivity;
import com.theinnerhour.b2b.persistence.ApplicationPersistence;
import com.theinnerhour.b2b.utils.Utils;
import com.theinnerhour.b2b.utils.UtilsKt;
import hs.k;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class b implements DialogInterface.OnClickListener {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ int f13163u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ LockScreenActivity f13164v;

    public /* synthetic */ b(LockScreenActivity lockScreenActivity, int i6) {
        this.f13163u = i6;
        this.f13164v = lockScreenActivity;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i6) {
        int i10 = this.f13163u;
        LockScreenActivity this$0 = this.f13164v;
        switch (i10) {
            case 0:
                int i11 = LockScreenActivity.E;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                ApplicationPersistence.getInstance().deleteKey("user_lock_code");
                Utils.INSTANCE.showCustomToast(this$0, "Your security pin has been removed!");
                UtilsKt.fireAnalytics("lock_remove_yes", UtilsKt.getAnalyticsBundle());
                this$0.finish();
                return;
            case 1:
                int i12 = LockScreenActivity.E;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                UtilsKt.fireAnalytics("lock_remove_no", UtilsKt.getAnalyticsBundle());
                this$0.finish();
                return;
            default:
                int i13 = LockScreenActivity.E;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                LockScreenActivity.a.b(true);
                ApplicationPersistence.getInstance().deleteKey("user_lock_code");
                Utils utils = Utils.INSTANCE;
                Bundle bundle = new Bundle();
                bundle.putBoolean("show_login", true);
                k kVar = k.f19476a;
                utils.logout(this$0, bundle, null);
                return;
        }
    }
}
