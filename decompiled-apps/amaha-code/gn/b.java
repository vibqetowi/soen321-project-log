package gn;

import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.components.login.fragment.ReworkLoginFragment;
import com.theinnerhour.b2b.components.login.model.LoginSignupFlow;
import com.theinnerhour.b2b.components.login.model.ReworkSignupEvents;
import com.theinnerhour.b2b.widgets.RobertoEditText;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import r1.b0;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class b implements View.OnClickListener {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ int f16624u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ ReworkLoginFragment f16625v;

    public /* synthetic */ b(ReworkLoginFragment reworkLoginFragment, int i6) {
        this.f16624u = i6;
        this.f16625v = reworkLoginFragment;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        ReworkSignupEvents.ResendOTP resendOTP;
        String str;
        yp.m mVar;
        RobertoEditText robertoEditText;
        Editable text;
        yp.m mVar2;
        RobertoEditText robertoEditText2;
        Editable text2;
        String str2;
        yp.m mVar3;
        RobertoEditText robertoEditText3;
        Editable text3;
        yp.m mVar4;
        RobertoEditText robertoEditText4;
        Editable text4;
        String str3;
        yp.m mVar5;
        RobertoEditText robertoEditText5;
        Editable text5;
        String str4;
        yp.m mVar6;
        RobertoEditText robertoEditText6;
        Editable text6;
        String str5;
        String str6;
        yp.l lVar;
        RobertoEditText robertoEditText7;
        Editable text7;
        yp.l lVar2;
        RobertoEditText robertoEditText8;
        Editable text8;
        yp.l lVar3;
        RobertoEditText robertoEditText9;
        Editable text9;
        String str7;
        String str8;
        yp.l lVar4;
        RobertoEditText robertoEditText10;
        Editable text10;
        yp.l lVar5;
        RobertoEditText robertoEditText11;
        Editable text11;
        yp.l lVar6;
        RobertoEditText robertoEditText12;
        Editable text12;
        String str9;
        String str10;
        yp.l lVar7;
        RobertoEditText robertoEditText13;
        Editable text13;
        yp.l lVar8;
        RobertoEditText robertoEditText14;
        Editable text14;
        yp.l lVar9;
        RobertoEditText robertoEditText15;
        Editable text15;
        int i6 = this.f16624u;
        String str11 = null;
        ReworkLoginFragment this$0 = this.f16625v;
        switch (i6) {
            case 0:
                int i10 = ReworkLoginFragment.C;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                hn.q J = this$0.J();
                yp.f fVar = this$0.f11327w;
                if (fVar != null && (mVar5 = (yp.m) fVar.f38775j) != null && (robertoEditText5 = mVar5.f38866c) != null && (text5 = robertoEditText5.getText()) != null) {
                    str3 = text5.toString();
                } else {
                    str3 = null;
                }
                J.o(new ReworkSignupEvents.PhoneMainCtaClick(str3, null));
                return;
            case 1:
                int i11 = ReworkLoginFragment.C;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                hn.q J2 = this$0.J();
                yp.f fVar2 = this$0.f11328x;
                if (fVar2 != null && (mVar6 = (yp.m) fVar2.f38775j) != null && (robertoEditText6 = mVar6.f38866c) != null && (text6 = robertoEditText6.getText()) != null) {
                    str4 = text6.toString();
                } else {
                    str4 = null;
                }
                J2.o(new ReworkSignupEvents.PhoneMainCtaClick(str4, null));
                return;
            case 2:
                int i12 = ReworkLoginFragment.C;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                this$0.J().o(ReworkSignupEvents.PhoneSecondaryCtaClick.INSTANCE);
                return;
            case 3:
                int i13 = ReworkLoginFragment.C;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                hn.q J3 = this$0.J();
                yp.f fVar3 = this$0.f11328x;
                if (fVar3 != null && (lVar2 = (yp.l) fVar3.f38774i) != null && (robertoEditText8 = lVar2.f38848b) != null && (text8 = robertoEditText8.getText()) != null) {
                    str5 = text8.toString();
                } else {
                    str5 = null;
                }
                yp.f fVar4 = this$0.f11328x;
                if (fVar4 != null && (lVar = (yp.l) fVar4.f38774i) != null && (robertoEditText7 = lVar.f38850d) != null && (text7 = robertoEditText7.getText()) != null) {
                    str6 = text7.toString();
                } else {
                    str6 = null;
                }
                J3.o(new ReworkSignupEvents.EmailMainCtaClick(str5, str6, null, this$0.f11330z));
                return;
            case 4:
                int i14 = ReworkLoginFragment.C;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                this$0.J().o(ReworkSignupEvents.EmailSecondaryCtaClick.INSTANCE);
                return;
            case 5:
                int i15 = ReworkLoginFragment.C;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                this$0.J().o(new ReworkSignupEvents.GoogleCtaClick(LoginSignupFlow.SIGN_IN_GOOGLE));
                return;
            case 6:
                int i16 = ReworkLoginFragment.C;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                this$0.J().o(new ReworkSignupEvents.FacebookCtaClick(LoginSignupFlow.SIGN_IN_FACEBOOK));
                return;
            case 7:
                int i17 = ReworkLoginFragment.C;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                this$0.J().o(ReworkSignupEvents.SSOCtaClick.INSTANCE);
                return;
            case 8:
                int i18 = ReworkLoginFragment.C;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                this$0.J().o(ReworkSignupEvents.SwitchFlow.INSTANCE);
                return;
            case 9:
                int i19 = ReworkLoginFragment.C;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                this$0.J().o(ReworkSignupEvents.SwitchFlow.INSTANCE);
                return;
            case 10:
                int i20 = ReworkLoginFragment.C;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                hn.q J4 = this$0.J();
                yp.f fVar5 = this$0.f11328x;
                if (fVar5 != null && (lVar3 = (yp.l) fVar5.f38774i) != null && (robertoEditText9 = lVar3.f38848b) != null && (text9 = robertoEditText9.getText()) != null) {
                    str11 = text9.toString();
                }
                J4.o(new ReworkSignupEvents.ForgotPassword(str11));
                return;
            case 11:
                int i21 = ReworkLoginFragment.C;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                this$0.J().o(ReworkSignupEvents.PhoneSecondaryCtaClick.INSTANCE);
                return;
            case 12:
                int i22 = ReworkLoginFragment.C;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                hn.q J5 = this$0.J();
                yp.g gVar = this$0.f11329y;
                if (gVar != null && (lVar5 = gVar.f38789h) != null && (robertoEditText11 = lVar5.f38848b) != null && (text11 = robertoEditText11.getText()) != null) {
                    str7 = text11.toString();
                } else {
                    str7 = null;
                }
                yp.g gVar2 = this$0.f11329y;
                if (gVar2 != null && (lVar4 = gVar2.f38789h) != null && (robertoEditText10 = lVar4.f38850d) != null && (text10 = robertoEditText10.getText()) != null) {
                    str8 = text10.toString();
                } else {
                    str8 = null;
                }
                J5.o(new ReworkSignupEvents.EmailMainCtaClick(str7, str8, null, this$0.f11330z));
                return;
            case 13:
                int i23 = ReworkLoginFragment.C;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                this$0.J().o(new ReworkSignupEvents.GoogleCtaClick(LoginSignupFlow.SIGN_IN_GOOGLE));
                return;
            case 14:
                int i24 = ReworkLoginFragment.C;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                this$0.J().o(new ReworkSignupEvents.FacebookCtaClick(LoginSignupFlow.SIGN_IN_FACEBOOK));
                return;
            case 15:
                int i25 = ReworkLoginFragment.C;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                this$0.J().o(ReworkSignupEvents.SSOCtaClick.INSTANCE);
                return;
            case 16:
                int i26 = ReworkLoginFragment.C;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                this$0.J().o(ReworkSignupEvents.SwitchFlow.INSTANCE);
                return;
            case 17:
                int i27 = ReworkLoginFragment.C;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                this$0.J().o(ReworkSignupEvents.SwitchFlow.INSTANCE);
                return;
            case 18:
                int i28 = ReworkLoginFragment.C;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                hn.q J6 = this$0.J();
                yp.g gVar3 = this$0.f11329y;
                if (gVar3 != null && (lVar6 = gVar3.f38789h) != null && (robertoEditText12 = lVar6.f38848b) != null && (text12 = robertoEditText12.getText()) != null) {
                    str11 = text12.toString();
                }
                J6.o(new ReworkSignupEvents.ForgotPassword(str11));
                return;
            case 19:
                int i29 = ReworkLoginFragment.C;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                hn.q J7 = this$0.J();
                yp.f fVar6 = this$0.f11327w;
                if (fVar6 != null && (lVar8 = (yp.l) fVar6.f38774i) != null && (robertoEditText14 = lVar8.f38848b) != null && (text14 = robertoEditText14.getText()) != null) {
                    str9 = text14.toString();
                } else {
                    str9 = null;
                }
                yp.f fVar7 = this$0.f11327w;
                if (fVar7 != null && (lVar7 = (yp.l) fVar7.f38774i) != null && (robertoEditText13 = lVar7.f38850d) != null && (text13 = robertoEditText13.getText()) != null) {
                    str10 = text13.toString();
                } else {
                    str10 = null;
                }
                J7.o(new ReworkSignupEvents.EmailMainCtaClick(str9, str10, null, this$0.f11330z));
                return;
            case 20:
                int i30 = ReworkLoginFragment.C;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                this$0.J().o(ReworkSignupEvents.EmailSecondaryCtaClick.INSTANCE);
                return;
            case 21:
                int i31 = ReworkLoginFragment.C;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                this$0.J().o(new ReworkSignupEvents.GoogleCtaClick(LoginSignupFlow.SIGN_IN_GOOGLE));
                return;
            case 22:
                int i32 = ReworkLoginFragment.C;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                this$0.J().o(new ReworkSignupEvents.FacebookCtaClick(LoginSignupFlow.SIGN_IN_FACEBOOK));
                return;
            case 23:
                int i33 = ReworkLoginFragment.C;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                this$0.J().o(ReworkSignupEvents.SSOCtaClick.INSTANCE);
                return;
            case 24:
                int i34 = ReworkLoginFragment.C;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                this$0.J().o(ReworkSignupEvents.SwitchFlow.INSTANCE);
                return;
            case 25:
                int i35 = ReworkLoginFragment.C;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                this$0.J().o(ReworkSignupEvents.SwitchFlow.INSTANCE);
                return;
            case 26:
                int i36 = ReworkLoginFragment.C;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                hn.q J8 = this$0.J();
                yp.f fVar8 = this$0.f11327w;
                if (fVar8 != null && (lVar9 = (yp.l) fVar8.f38774i) != null && (robertoEditText15 = lVar9.f38848b) != null && (text15 = robertoEditText15.getText()) != null) {
                    str11 = text15.toString();
                }
                J8.o(new ReworkSignupEvents.ForgotPassword(str11));
                return;
            case 27:
                int i37 = ReworkLoginFragment.C;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                this$0.I().dismiss();
                return;
            default:
                int i38 = ReworkLoginFragment.C;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                if (kotlin.jvm.internal.i.b(((RobertoTextView) this$0.I().findViewById(R.id.tvOTPDialogTimer)).getText(), "00:00")) {
                    hn.q J9 = this$0.J();
                    if (kotlin.jvm.internal.i.b(this$0.J().f17890b0, "variant_a")) {
                        yp.f fVar9 = this$0.f11327w;
                        if (fVar9 != null && (mVar4 = (yp.m) fVar9.f38775j) != null && (robertoEditText4 = mVar4.f38866c) != null && (text4 = robertoEditText4.getText()) != null) {
                            str2 = text4.toString();
                        } else {
                            str2 = null;
                        }
                        yp.f fVar10 = this$0.f11327w;
                        if (fVar10 != null && (mVar3 = (yp.m) fVar10.f38775j) != null && (robertoEditText3 = mVar3.f38865b) != null && (text3 = robertoEditText3.getText()) != null) {
                            str11 = text3.toString();
                        }
                        resendOTP = new ReworkSignupEvents.ResendOTP(str2, str11);
                    } else {
                        yp.f fVar11 = this$0.f11328x;
                        if (fVar11 != null && (mVar2 = (yp.m) fVar11.f38775j) != null && (robertoEditText2 = mVar2.f38866c) != null && (text2 = robertoEditText2.getText()) != null) {
                            str = text2.toString();
                        } else {
                            str = null;
                        }
                        yp.f fVar12 = this$0.f11328x;
                        if (fVar12 != null && (mVar = (yp.m) fVar12.f38775j) != null && (robertoEditText = mVar.f38865b) != null && (text = robertoEditText.getText()) != null) {
                            str11 = text.toString();
                        }
                        resendOTP = new ReworkSignupEvents.ResendOTP(str, str11);
                    }
                    J9.o(resendOTP);
                    RobertoTextView robertoTextView = (RobertoTextView) this$0.I().findViewById(R.id.tvOTPDialogResend);
                    if (robertoTextView != null) {
                        robertoTextView.setAlpha(0.2f);
                    }
                    String str12 = gk.a.f16573a;
                    Bundle a10 = b0.a("source", "auth_screen");
                    hs.k kVar = hs.k.f19476a;
                    gk.a.b(a10, "auth_verify_otp_resend");
                    return;
                }
                return;
        }
    }
}
