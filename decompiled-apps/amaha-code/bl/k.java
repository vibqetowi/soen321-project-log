package bl;

import android.app.Dialog;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import com.theinnerhour.b2b.persistence.ApplicationPersistence;
import com.theinnerhour.b2b.persistence.FirebasePersistence;
import com.theinnerhour.b2b.utils.Constants;
import com.theinnerhour.b2b.utils.LogHelper;
import java.util.Calendar;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class k implements View.OnClickListener {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ int f4370u = 1;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ Dialog f4371v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ p f4372w;

    public /* synthetic */ k(Dialog dialog, p pVar) {
        this.f4371v = dialog;
        this.f4372w = pVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i6 = this.f4370u;
        Dialog dialog = this.f4371v;
        p this$0 = this.f4372w;
        switch (i6) {
            case 0:
                int i10 = p.f4381k0;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                kotlin.jvm.internal.i.g(dialog, "$dialog");
                ApplicationPersistence.getInstance().setBooleanValue(Constants.PLAY_STORE_FEEDBACK_GIVEN, true);
                Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("market://details?id=" + this$0.requireActivity().getPackageName()));
                intent.addFlags(1208483840);
                try {
                    this$0.startActivity(intent);
                } catch (Exception unused) {
                    this$0.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("http://play.google.com/store/apps/details?id=" + this$0.requireActivity().getPackageName())));
                }
                dialog.dismiss();
                FirebasePersistence.getInstance().getUser().getAppFeedback().getLastFeedbackDate().setTime(Calendar.getInstance().getTimeInMillis());
                FirebasePersistence.getInstance().updateUserOnFirebase();
                Bundle bundle = new Bundle();
                defpackage.b.s(bundle, "course", bundle, "feedback_daily_task_playstore_positive");
                return;
            default:
                int i11 = p.f4381k0;
                kotlin.jvm.internal.i.g(dialog, "$dialog");
                kotlin.jvm.internal.i.g(this$0, "this$0");
                try {
                    FirebasePersistence.getInstance().getUser().getAppFeedback().getLastFeedbackDate().setTime(Calendar.getInstance().getTimeInMillis());
                    FirebasePersistence.getInstance().updateUserOnFirebase();
                    dialog.dismiss();
                    Bundle bundle2 = new Bundle();
                    bundle2.putString("course", FirebasePersistence.getInstance().getUser().getCurrentCourseName());
                    gk.a.b(bundle2, "feedback_daily_task_playstore_negative");
                    return;
                } catch (Exception e10) {
                    LogHelper.INSTANCE.e(this$0.f4390u, "error in creating intent for play store rating", e10);
                    return;
                }
        }
    }

    public /* synthetic */ k(p pVar, Dialog dialog) {
        this.f4372w = pVar;
        this.f4371v = dialog;
    }
}
