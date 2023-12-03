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
public final class d1 extends kotlin.jvm.internal.k implements ss.l<Boolean, hs.k> {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ V3DashboardActivity f12999u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ ProviderDetailHolderModel f13000v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ hs.f<String, String> f13001w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d1(V3DashboardActivity v3DashboardActivity, ProviderDetailHolderModel providerDetailHolderModel, hs.f<String, String> fVar) {
        super(1);
        this.f12999u = v3DashboardActivity;
        this.f13000v = providerDetailHolderModel;
        this.f13001w = fVar;
    }

    @Override // ss.l
    public final hs.k invoke(Boolean bool) {
        pp.c cVar;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        boolean booleanValue = bool.booleanValue();
        V3DashboardActivity v3DashboardActivity = this.f12999u;
        Intent intent = new Intent(v3DashboardActivity, TelecommunicationsPWAActivity.class);
        ProviderDetailHolderModel providerDetailHolderModel = this.f13000v;
        Intent putExtra = intent.putExtra(SessionManager.KEY_UUID, providerDetailHolderModel.getUuid());
        if (kotlin.jvm.internal.i.b(providerDetailHolderModel.getProviderType(), "couplestherapist")) {
            cVar = pp.c.PROVIDER_PACKAGE_COUPLES;
        } else {
            cVar = pp.c.PROVIDER_PACKAGE;
        }
        v3DashboardActivity.startActivity(putExtra.putExtra(Constants.TELECOMMUNICATION_REDIRECT, cVar).putExtra("type", providerDetailHolderModel.getProviderType()).putExtra("is_prevent_recording", true));
        String str6 = gk.a.f16573a;
        if (kotlin.jvm.internal.i.b(providerDetailHolderModel.getProviderType(), "therapist")) {
            str = "therapist_list_book";
        } else {
            str = "psychiatrist_list_book";
        }
        Bundle bundle = new Bundle();
        String providerType = providerDetailHolderModel.getProviderType();
        if (kotlin.jvm.internal.i.b(providerType, "couplestherapist")) {
            str2 = "couples";
        } else if (kotlin.jvm.internal.i.b(providerType, "therapist")) {
            str2 = "therapy";
        } else {
            str2 = "psychiatry";
        }
        bundle.putString("flow", str2);
        if (kotlin.jvm.internal.i.b(providerDetailHolderModel.getProviderType(), "psychiatrist")) {
            bundle.putString("psychiatrist_name", providerDetailHolderModel.getFirstName() + ' ' + providerDetailHolderModel.getLastName());
            bundle.putString("psychiatrist_uuid", providerDetailHolderModel.getUuid());
        } else {
            bundle.putString("therapist_name", providerDetailHolderModel.getFirstName() + ' ' + providerDetailHolderModel.getLastName());
            bundle.putString("therapist_uuid", providerDetailHolderModel.getUuid());
        }
        if (booleanValue) {
            str3 = "in_app_testimonial";
        } else {
            str3 = "in_app_video_testimonial_fallback";
        }
        User f = defpackage.b.f(bundle, "source", str3);
        String str7 = null;
        if (f != null) {
            str4 = f.getCurrentCourseName();
        } else {
            str4 = null;
        }
        bundle.putString("domain", str4);
        bundle.putString("platform", "android_app");
        hs.f<String, String> fVar = this.f13001w;
        if (fVar != null) {
            str5 = fVar.f19464u;
        } else {
            str5 = null;
        }
        bundle.putString("next_available_slot_shown", str5);
        if (fVar != null) {
            str7 = fVar.f19465v;
        }
        bundle.putString("next_available_slot_shown_local", str7);
        bundle.putBoolean("provider_inhouse", providerDetailHolderModel.isInHouse());
        hs.k kVar = hs.k.f19476a;
        gk.a.b(bundle, str);
        v3DashboardActivity.H0(providerDetailHolderModel, false);
        return hs.k.f19476a;
    }
}
