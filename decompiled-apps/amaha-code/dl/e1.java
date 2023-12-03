package dl;

import android.content.Intent;
import android.os.Bundle;
import com.theinnerhour.b2b.components.dashboard.activity.V3DashboardActivity;
import com.theinnerhour.b2b.components.telecommunications.activity.TelecommunicationsPWAActivity;
import com.theinnerhour.b2b.model.User;
import com.theinnerhour.b2b.network.model.ProviderDetailHolderModel;
import com.theinnerhour.b2b.utils.Constants;
import com.theinnerhour.b2b.utils.SessionManager;
/* compiled from: V3DashboardActivity.kt */
/* loaded from: classes2.dex */
public final class e1 extends kotlin.jvm.internal.k implements ss.l<Boolean, hs.k> {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ V3DashboardActivity f13008u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ ProviderDetailHolderModel f13009v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ hs.f<String, String> f13010w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e1(V3DashboardActivity v3DashboardActivity, ProviderDetailHolderModel providerDetailHolderModel, hs.f<String, String> fVar) {
        super(1);
        this.f13008u = v3DashboardActivity;
        this.f13009v = providerDetailHolderModel;
        this.f13010w = fVar;
    }

    @Override // ss.l
    public final hs.k invoke(Boolean bool) {
        pp.c cVar;
        String str;
        String str2;
        String str3;
        String str4;
        boolean booleanValue = bool.booleanValue();
        V3DashboardActivity v3DashboardActivity = this.f13008u;
        Intent intent = new Intent(v3DashboardActivity, TelecommunicationsPWAActivity.class);
        ProviderDetailHolderModel providerDetailHolderModel = this.f13009v;
        Intent putExtra = intent.putExtra(SessionManager.KEY_UUID, providerDetailHolderModel.getUuid());
        String providerType = providerDetailHolderModel.getProviderType();
        if (kotlin.jvm.internal.i.b(providerType, "therapist")) {
            cVar = pp.c.PROFILE;
        } else if (kotlin.jvm.internal.i.b(providerType, "psychiatrist")) {
            cVar = pp.c.PROFILE_PSYCHIATRIST;
        } else {
            cVar = pp.c.PROFILE_COUPLES_THERAPIST;
        }
        v3DashboardActivity.startActivity(putExtra.putExtra(Constants.TELECOMMUNICATION_REDIRECT, cVar).putExtra("is_prevent_recording", true));
        String str5 = gk.a.f16573a;
        Bundle bundle = new Bundle();
        String providerType2 = providerDetailHolderModel.getProviderType();
        if (kotlin.jvm.internal.i.b(providerType2, "couplestherapist")) {
            str = "couples";
        } else if (kotlin.jvm.internal.i.b(providerType2, "therapist")) {
            str = "therapy";
        } else {
            str = "psychiatry";
        }
        bundle.putString("flow", str);
        if (kotlin.jvm.internal.i.b(providerDetailHolderModel.getProviderType(), "psychiatrist")) {
            bundle.putString("psychiatrist_name", providerDetailHolderModel.getFirstName() + ' ' + providerDetailHolderModel.getLastName());
            bundle.putString("psychiatrist_uuid", providerDetailHolderModel.getUuid());
        } else {
            bundle.putString("therapist_name", providerDetailHolderModel.getFirstName() + ' ' + providerDetailHolderModel.getLastName());
            bundle.putString("therapist_uuid", providerDetailHolderModel.getUuid());
        }
        if (booleanValue) {
            str2 = "in_app_testimonial";
        } else {
            str2 = "in_app_video_testimonial_fallback";
        }
        User f = defpackage.b.f(bundle, "source", str2);
        String str6 = null;
        if (f != null) {
            str3 = f.getCurrentCourseName();
        } else {
            str3 = null;
        }
        bundle.putString("domain", str3);
        bundle.putString("platform", "android_app");
        hs.f<String, String> fVar = this.f13010w;
        if (fVar != null) {
            str4 = fVar.f19464u;
        } else {
            str4 = null;
        }
        bundle.putString("next_available_slot_shown", str4);
        if (fVar != null) {
            str6 = fVar.f19465v;
        }
        bundle.putString("next_available_slot_shown_local", str6);
        bundle.putBoolean("provider_inhouse", providerDetailHolderModel.isInHouse());
        hs.k kVar = hs.k.f19476a;
        gk.a.b(bundle, "therapy_psychiatry_profile_card_click");
        v3DashboardActivity.H0(providerDetailHolderModel, false);
        return hs.k.f19476a;
    }
}
