package tk;

import android.os.Bundle;
import android.view.View;
import com.theinnerhour.b2b.model.User;
import com.theinnerhour.b2b.persistence.FirebasePersistence;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class e implements View.OnClickListener {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ int f33182u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ c f33183v;

    public /* synthetic */ e(c cVar, int i6) {
        this.f33182u = i6;
        this.f33183v = cVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8 = null;
        int i6 = this.f33182u;
        c this$0 = this.f33183v;
        switch (i6) {
            case 0:
                kotlin.jvm.internal.i.g(this$0, "this$0");
                String str9 = gk.a.f16573a;
                Bundle bundle = new Bundle();
                bundle.putString("variant", this$0.B);
                bundle.putString("experiment", "comm_acquisition");
                bundle.putString("platform", "android_app");
                User user = FirebasePersistence.getInstance().getUser();
                if (user != null) {
                    str2 = user.getCurrentCourseName();
                } else {
                    str2 = null;
                }
                User f = defpackage.b.f(bundle, "domain", str2);
                if (f != null) {
                    str3 = f.getCurrentCourseName();
                } else {
                    str3 = null;
                }
                bundle.putString("course", str3);
                bundle.putBoolean("group_joined", !this$0.D.isEmpty());
                if (!this$0.D.isEmpty()) {
                    bundle.putStringArray("channel_joined_name", (String[]) this$0.D.toArray(new String[0]));
                }
                Boolean bool = this$0.C;
                if (bool != null) {
                    bundle.putBoolean("onboarding_completed", bool.booleanValue());
                }
                hs.k kVar = hs.k.f19476a;
                gk.a.b(bundle, "communities_db_card_click");
                xk.a aVar = this$0.H;
                if (aVar != null) {
                    aVar.E(null, null);
                    return;
                }
                return;
            case 1:
                kotlin.jvm.internal.i.g(this$0, "this$0");
                String str10 = gk.a.f16573a;
                Bundle f2 = defpackage.e.f("variant", "variant_a", "experiment", "comm_acquisition");
                User f10 = defpackage.b.f(f2, "platform", "android_app");
                if (f10 != null) {
                    str4 = f10.getCurrentCourseName();
                } else {
                    str4 = null;
                }
                User f11 = defpackage.b.f(f2, "domain", str4);
                if (f11 != null) {
                    str5 = f11.getCurrentCourseName();
                } else {
                    str5 = null;
                }
                f2.putString("course", str5);
                f2.putBoolean("group_joined", !this$0.D.isEmpty());
                Boolean bool2 = this$0.C;
                if (bool2 != null) {
                    f2.putBoolean("onboarding_completed", bool2.booleanValue());
                }
                hs.k kVar2 = hs.k.f19476a;
                gk.a.b(f2, "communities_db_card_click");
                xk.a aVar2 = this$0.H;
                if (aVar2 != null) {
                    aVar2.E(null, null);
                    return;
                }
                return;
            case 2:
                kotlin.jvm.internal.i.g(this$0, "this$0");
                String str11 = gk.a.f16573a;
                Bundle bundle2 = new Bundle();
                bundle2.putString("variant", this$0.B);
                bundle2.putString("experiment", "comm_acquisition");
                bundle2.putString("platform", "android_app");
                User user2 = FirebasePersistence.getInstance().getUser();
                if (user2 != null) {
                    str6 = user2.getCurrentCourseName();
                } else {
                    str6 = null;
                }
                User f12 = defpackage.b.f(bundle2, "domain", str6);
                if (f12 != null) {
                    str7 = f12.getCurrentCourseName();
                } else {
                    str7 = null;
                }
                bundle2.putString("course", str7);
                bundle2.putBoolean("group_joined", !this$0.D.isEmpty());
                bundle2.putInt("carousel_view_card", this$0.f33173w + 1);
                Boolean bool3 = this$0.C;
                if (bool3 != null) {
                    bundle2.putBoolean("onboarding_completed", bool3.booleanValue());
                }
                hs.k kVar3 = hs.k.f19476a;
                gk.a.b(bundle2, "communities_db_card_click");
                xk.a aVar3 = this$0.H;
                if (aVar3 != null) {
                    aVar3.E(null, null);
                    return;
                }
                return;
            default:
                kotlin.jvm.internal.i.g(this$0, "this$0");
                xk.a aVar4 = this$0.H;
                if (aVar4 != null) {
                    aVar4.E(null, null);
                }
                String str12 = gk.a.f16573a;
                Bundle f13 = defpackage.e.f("variant", "variant_c", "experiment", "comm_acquisition");
                User f14 = defpackage.b.f(f13, "platform", "android_app");
                if (f14 != null) {
                    str = f14.getCurrentCourseName();
                } else {
                    str = null;
                }
                User f15 = defpackage.b.f(f13, "domain", str);
                if (f15 != null) {
                    str8 = f15.getCurrentCourseName();
                }
                f13.putString("course", str8);
                f13.putBoolean("group_joined", !this$0.D.isEmpty());
                f13.putInt("carousel_view_card", this$0.f33173w + 1);
                Boolean bool4 = this$0.C;
                if (bool4 != null) {
                    f13.putBoolean("onboarding_completed", bool4.booleanValue());
                }
                hs.k kVar4 = hs.k.f19476a;
                gk.a.b(f13, "communities_db_card_click");
                return;
        }
    }
}
