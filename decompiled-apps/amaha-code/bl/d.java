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
public final /* synthetic */ class d implements View.OnClickListener {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ int f4345u = 1;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ Dialog f4346v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ i f4347w;

    public /* synthetic */ d(Dialog dialog, i iVar) {
        this.f4346v = dialog;
        this.f4347w = iVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i6 = this.f4345u;
        Dialog dialog = this.f4346v;
        i this$0 = this.f4347w;
        switch (i6) {
            case 0:
                int i10 = i.f4356f0;
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
                int i11 = i.f4356f0;
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
                    LogHelper.INSTANCE.e(this$0.f4360u, "error in creating intent for play store rating", e10);
                    return;
                }
        }
    }

    public /* synthetic */ d(i iVar, Dialog dialog) {
        this.f4347w = iVar;
        this.f4346v = dialog;
    }
}
