package il;

import android.app.Activity;
import android.app.Dialog;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Toast;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.persistence.ApplicationPersistence;
import com.theinnerhour.b2b.utils.Constants;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.utils.Utils;
import com.theinnerhour.b2b.widgets.RobertoEditText;
import kotlin.jvm.internal.u;
import r1.b0;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class o implements View.OnClickListener {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ int f20376u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ u f20377v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ q f20378w;

    /* renamed from: x  reason: collision with root package name */
    public final /* synthetic */ Dialog f20379x;

    /* renamed from: y  reason: collision with root package name */
    public final /* synthetic */ String f20380y;

    public /* synthetic */ o(Dialog dialog, q qVar, u uVar, String str) {
        this.f20376u = 6;
        this.f20379x = dialog;
        this.f20378w = qVar;
        this.f20377v = uVar;
        this.f20380y = str;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        boolean z10;
        int i6 = this.f20376u;
        String feedbackSource = this.f20380y;
        Dialog dialog = this.f20379x;
        q this$0 = this.f20378w;
        u clicked = this.f20377v;
        switch (i6) {
            case 0:
                kotlin.jvm.internal.i.g(clicked, "$clicked");
                kotlin.jvm.internal.i.g(this$0, "this$0");
                kotlin.jvm.internal.i.g(dialog, "$dialog");
                kotlin.jvm.internal.i.g(feedbackSource, "$feedbackSource");
                clicked.f23466u = true;
                this$0.a(1, dialog, feedbackSource);
                return;
            case 1:
                kotlin.jvm.internal.i.g(clicked, "$clicked");
                kotlin.jvm.internal.i.g(this$0, "this$0");
                kotlin.jvm.internal.i.g(dialog, "$dialog");
                kotlin.jvm.internal.i.g(feedbackSource, "$feedbackSource");
                clicked.f23466u = true;
                this$0.a(2, dialog, feedbackSource);
                return;
            case 2:
                kotlin.jvm.internal.i.g(clicked, "$clicked");
                kotlin.jvm.internal.i.g(this$0, "this$0");
                kotlin.jvm.internal.i.g(dialog, "$dialog");
                kotlin.jvm.internal.i.g(feedbackSource, "$feedbackSource");
                clicked.f23466u = true;
                this$0.a(3, dialog, feedbackSource);
                return;
            case 3:
                kotlin.jvm.internal.i.g(clicked, "$clicked");
                kotlin.jvm.internal.i.g(this$0, "this$0");
                kotlin.jvm.internal.i.g(dialog, "$dialog");
                kotlin.jvm.internal.i.g(feedbackSource, "$feedbackSource");
                clicked.f23466u = true;
                this$0.a(4, dialog, feedbackSource);
                return;
            case 4:
                kotlin.jvm.internal.i.g(clicked, "$clicked");
                kotlin.jvm.internal.i.g(this$0, "this$0");
                kotlin.jvm.internal.i.g(dialog, "$dialog");
                kotlin.jvm.internal.i.g(feedbackSource, "$feedbackSource");
                clicked.f23466u = true;
                this$0.a(5, dialog, feedbackSource);
                return;
            case 5:
                kotlin.jvm.internal.i.g(this$0, "this$0");
                String str = this$0.f20386c;
                Activity activity = this$0.f20384a;
                kotlin.jvm.internal.i.g(clicked, "$clicked");
                kotlin.jvm.internal.i.g(dialog, "$dialog");
                kotlin.jvm.internal.i.g(feedbackSource, "$feedbackSource");
                try {
                    ApplicationPersistence.getInstance().setBooleanValue(Constants.PLAY_STORE_FEEDBACK_GIVEN, true);
                    Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("market://details?id=" + activity.getPackageName()));
                    intent.addFlags(1208483840);
                    try {
                        activity.startActivity(intent);
                    } catch (Exception e10) {
                        LogHelper.INSTANCE.e(str, "error in showing play store ", e10);
                        activity.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("http://play.google.com/store/apps/details?id=" + activity.getPackageName())));
                    }
                    clicked.f23466u = true;
                    dialog.dismiss();
                    String str2 = gk.a.f16573a;
                    Bundle bundle = new Bundle();
                    bundle.putString("trigger_reason", feedbackSource);
                    hs.k kVar = hs.k.f19476a;
                    gk.a.b(bundle, "rating_playstore_popup_proceed");
                    return;
                } catch (Exception e11) {
                    LogHelper.INSTANCE.e(str, "error in creating intent for play store rating", e11);
                    return;
                }
            default:
                kotlin.jvm.internal.i.g(dialog, "$dialog");
                kotlin.jvm.internal.i.g(this$0, "this$0");
                kotlin.jvm.internal.i.g(clicked, "$clicked");
                kotlin.jvm.internal.i.g(feedbackSource, "$feedbackSource");
                View findViewById = dialog.findViewById(R.id.feedback);
                kotlin.jvm.internal.i.e(findViewById, "null cannot be cast to non-null type com.theinnerhour.b2b.widgets.RobertoEditText");
                Editable text = ((RobertoEditText) findViewById).getText();
                kotlin.jvm.internal.i.d(text);
                String obj = text.toString();
                if (gv.n.F0(obj, " ", "").length() > 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                Activity activity2 = this$0.f20384a;
                if (z10) {
                    if (Utils.INSTANCE.checkConnectivity(activity2)) {
                        this$0.f20385b.k(obj);
                        new Bundle();
                        String str3 = gk.a.f16573a;
                        Bundle a10 = b0.a("trigger_reason", feedbackSource);
                        hs.k kVar2 = hs.k.f19476a;
                        gk.a.b(a10, "rating_low_feedback_popup_submit");
                    }
                    clicked.f23466u = true;
                    dialog.dismiss();
                    return;
                }
                Toast.makeText(activity2, activity2.getString(R.string.feedback_input_error), 0).show();
                return;
        }
    }

    public /* synthetic */ o(q qVar, u uVar, Dialog dialog, String str) {
        this.f20376u = 5;
        this.f20378w = qVar;
        this.f20377v = uVar;
        this.f20379x = dialog;
        this.f20380y = str;
    }

    public /* synthetic */ o(u uVar, q qVar, Dialog dialog, String str, int i6) {
        this.f20376u = i6;
        this.f20377v = uVar;
        this.f20378w = qVar;
        this.f20379x = dialog;
        this.f20380y = str;
    }
}
