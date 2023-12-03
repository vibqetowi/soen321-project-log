package tk;

import android.content.DialogInterface;
import android.os.Bundle;
import com.theinnerhour.b2b.components.dashboard.activity.V3DashboardActivity;
import com.theinnerhour.b2b.model.User;
import com.theinnerhour.b2b.network.model.ProviderDetailHolderModel;
import com.theinnerhour.b2b.persistence.FirebasePersistence;
import com.theinnerhour.b2b.utils.Constants;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class a implements DialogInterface.OnDismissListener {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ int f33165u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ Object f33166v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ Object f33167w;

    public /* synthetic */ a(Object obj, int i6, Object obj2) {
        this.f33165u = i6;
        this.f33166v = obj;
        this.f33167w = obj2;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        String str;
        String str2;
        km.d dVar;
        String str3;
        String str4;
        int i6 = this.f33165u;
        String str5 = null;
        Object obj = this.f33167w;
        Object obj2 = this.f33166v;
        switch (i6) {
            case 0:
                kotlin.jvm.internal.u clicked = (kotlin.jvm.internal.u) obj2;
                c this$0 = (c) obj;
                int i10 = c.J;
                kotlin.jvm.internal.i.g(clicked, "$clicked");
                kotlin.jvm.internal.i.g(this$0, "this$0");
                if (!clicked.f23466u) {
                    String str6 = gk.a.f16573a;
                    Bundle f = defpackage.e.f("variant", "variant_d", "experiment", "comm_acquisition");
                    User f2 = defpackage.b.f(f, "platform", "android_app");
                    if (f2 != null) {
                        str3 = f2.getCurrentCourseName();
                    } else {
                        str3 = null;
                    }
                    User f10 = defpackage.b.f(f, "domain", str3);
                    if (f10 != null) {
                        str5 = f10.getCurrentCourseName();
                    }
                    f.putString("course", str5);
                    f.putString("channel_name", this$0.f33176z);
                    f.putBoolean("group_joined", !this$0.D.isEmpty());
                    Boolean bool = this$0.C;
                    if (bool != null) {
                        f.putBoolean("onboarding_completed", bool.booleanValue());
                    }
                    hs.k kVar = hs.k.f19476a;
                    gk.a.b(f, "comm_db_channel_modal_close");
                    return;
                }
                clicked.f23466u = false;
                return;
            case 1:
                V3DashboardActivity this$02 = (V3DashboardActivity) obj2;
                ProviderDetailHolderModel providerDetailHolderModel = (ProviderDetailHolderModel) obj;
                int i11 = V3DashboardActivity.f10714r1;
                kotlin.jvm.internal.i.g(this$02, "this$0");
                if (this$02.f10740o1) {
                    String str7 = gk.a.f16573a;
                    Bundle bundle = new Bundle();
                    if (kotlin.jvm.internal.i.b(providerDetailHolderModel.getProviderType(), "psychiatrist")) {
                        bundle.putString("psychiatrist_name", providerDetailHolderModel.getName());
                        bundle.putString("psychiatrist_uuid", providerDetailHolderModel.getUuid());
                    } else {
                        bundle.putString("therapist_name", providerDetailHolderModel.getName());
                        bundle.putString("therapist_uuid", providerDetailHolderModel.getUuid());
                    }
                    bundle.putString("source", "in_app_provider_video");
                    String providerType = providerDetailHolderModel.getProviderType();
                    if (kotlin.jvm.internal.i.b(providerType, "couplestherapist")) {
                        str4 = "couples";
                    } else if (kotlin.jvm.internal.i.b(providerType, "therapist")) {
                        str4 = "therapy";
                    } else {
                        str4 = "psychiatry";
                    }
                    User f11 = defpackage.b.f(bundle, "flow", str4);
                    if (f11 != null) {
                        str5 = f11.getCurrentCourseName();
                    }
                    bundle.putString("domain", str5);
                    bundle.putString("platform", "android_app");
                    hs.k kVar2 = hs.k.f19476a;
                    gk.a.b(bundle, "in_app_provider_video_dialog_dismiss");
                    this$02.f10740o1 = true;
                    return;
                }
                return;
            default:
                V3DashboardActivity this$03 = (V3DashboardActivity) obj2;
                String str8 = (String) obj;
                int i12 = V3DashboardActivity.f10714r1;
                kotlin.jvm.internal.i.g(this$03, "this$0");
                if (this$03.f10738n1 != null) {
                    String str9 = gk.a.f16573a;
                    Bundle bundle2 = new Bundle();
                    User user = FirebasePersistence.getInstance().getUser();
                    if (user != null) {
                        str = user.getCurrentCourseName();
                    } else {
                        str = null;
                    }
                    bundle2.putString("domain", str);
                    bundle2.putString("variant_reason", str8);
                    if (kotlin.jvm.internal.i.b(this$03.f10738n1, Boolean.TRUE)) {
                        str2 = "dialog";
                    } else {
                        str2 = "tap_oustide";
                    }
                    bundle2.putString("action_source", str2);
                    hs.k kVar3 = hs.k.f19476a;
                    gk.a.b(bundle2, "in_app_matching_dialog_dismiss");
                    if (kotlin.jvm.internal.i.b(this$03.f10738n1, Boolean.FALSE) && (dVar = this$03.Y0) != null) {
                        ta.v.H(kc.f.H(dVar), null, 0, new km.h(dVar, Constants.SUBSCRIPTION_NONE, str8, null), 3);
                    }
                }
                this$03.f10738n1 = Boolean.FALSE;
                return;
        }
    }
}
