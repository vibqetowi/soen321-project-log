package so;

import com.hbb20.CountryCodePicker;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.components.profile.experiment.activities.ExperimentEditProfileActivity;
import com.theinnerhour.b2b.components.profile.experiment.model.EditProfileModel;
import com.theinnerhour.b2b.persistence.LocationPersistence;
import com.theinnerhour.b2b.utils.SessionManager;
import com.theinnerhour.b2b.widgets.RobertoEditText;
import com.theinnerhour.b2b.widgets.RobertoTextView;
/* compiled from: ExperimentEditProfileActivity.kt */
/* loaded from: classes2.dex */
public final class m extends kotlin.jvm.internal.k implements ss.l<EditProfileModel, hs.k> {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ ExperimentEditProfileActivity f31832u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(ExperimentEditProfileActivity experimentEditProfileActivity) {
        super(1);
        this.f31832u = experimentEditProfileActivity;
    }

    @Override // ss.l
    public final hs.k invoke(EditProfileModel editProfileModel) {
        String str;
        String str2;
        boolean z10;
        String str3;
        String str4;
        String str5;
        String str6;
        boolean z11;
        String str7;
        boolean z12;
        String mobile;
        String mobile2;
        String email;
        EditProfileModel editProfileModel2 = editProfileModel;
        ExperimentEditProfileActivity experimentEditProfileActivity = this.f31832u;
        RobertoEditText robertoEditText = (RobertoEditText) experimentEditProfileActivity.o0(R.id.etEditProfileFirstName);
        String str8 = null;
        if (editProfileModel2 != null) {
            str = editProfileModel2.getFirstName();
        } else {
            str = null;
        }
        robertoEditText.setText(str);
        RobertoEditText robertoEditText2 = (RobertoEditText) experimentEditProfileActivity.o0(R.id.etEditProfileLastName);
        if (editProfileModel2 != null) {
            str2 = editProfileModel2.getLastName();
        } else {
            str2 = null;
        }
        robertoEditText2.setText(str2);
        RobertoEditText robertoEditText3 = (RobertoEditText) experimentEditProfileActivity.o0(R.id.etEditProfileEmail);
        boolean z13 = true;
        if (editProfileModel2 != null && (email = editProfileModel2.getEmail()) != null && gv.r.J0(email, "@inhr.in")) {
            z10 = true;
        } else {
            z10 = false;
        }
        String str9 = "";
        if (z10) {
            str3 = "";
        } else if (editProfileModel2 != null) {
            str3 = editProfileModel2.getEmail();
        } else {
            str3 = null;
        }
        robertoEditText3.setText(str3);
        if (editProfileModel2 != null) {
            str4 = editProfileModel2.getEmail();
        } else {
            str4 = null;
        }
        experimentEditProfileActivity.M = String.valueOf(str4);
        RobertoEditText robertoEditText4 = (RobertoEditText) experimentEditProfileActivity.o0(R.id.etEditProfilePhone);
        if (editProfileModel2 != null) {
            str5 = editProfileModel2.getMobile();
        } else {
            str5 = null;
        }
        robertoEditText4.setText(str5);
        if (editProfileModel2 != null && (mobile2 = editProfileModel2.getMobile()) != null) {
            str9 = mobile2;
        }
        experimentEditProfileActivity.J = str9;
        if (experimentEditProfileActivity.K) {
            if (editProfileModel2 != null && (mobile = editProfileModel2.getMobile()) != null && (!gv.n.B0(mobile))) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (z12 && !SessionManager.getInstance().getBooleanValue(SessionManager.KEY_MOBILE_VERIFIED).booleanValue()) {
                experimentEditProfileActivity.L = false;
                ((RobertoTextView) experimentEditProfileActivity.o0(R.id.tvEditProfileVerify)).setVisibility(0);
            } else {
                experimentEditProfileActivity.L = true;
            }
            RobertoEditText etEditProfilePhone = (RobertoEditText) experimentEditProfileActivity.o0(R.id.etEditProfilePhone);
            kotlin.jvm.internal.i.f(etEditProfilePhone, "etEditProfilePhone");
            etEditProfilePhone.addTextChangedListener(new l(experimentEditProfileActivity));
            ((RobertoTextView) experimentEditProfileActivity.o0(R.id.tvEditProfileVerify)).setOnClickListener(new g(experimentEditProfileActivity, 1));
            ((CountryCodePicker) experimentEditProfileActivity.o0(R.id.ccpEditProfile)).setCcpClickable(false);
        }
        if (editProfileModel2 != null) {
            str6 = editProfileModel2.getCountryCode();
        } else {
            str6 = null;
        }
        if (str6 != null && str6.length() != 0) {
            z11 = false;
        } else {
            z11 = true;
        }
        if (!z11) {
            if (editProfileModel2 != null) {
                str7 = editProfileModel2.getCountryCode();
            } else {
                str7 = null;
            }
            if (!kotlin.jvm.internal.i.b(str7, "null")) {
                CountryCodePicker countryCodePicker = (CountryCodePicker) experimentEditProfileActivity.o0(R.id.ccpEditProfile);
                if (editProfileModel2 != null) {
                    str8 = editProfileModel2.getCountryCode();
                }
                kotlin.jvm.internal.i.d(str8);
                countryCodePicker.setCountryForPhoneCode(Integer.parseInt(str8));
                return hs.k.f19476a;
            }
        }
        LocationPersistence locationPersistence = LocationPersistence.INSTANCE;
        String currentCountry = locationPersistence.getCurrentCountry();
        if (currentCountry != null && !gv.n.B0(currentCountry)) {
            z13 = false;
        }
        if (!z13) {
            ((CountryCodePicker) experimentEditProfileActivity.o0(R.id.ccpEditProfile)).setCountryForNameCode(locationPersistence.getCurrentCountry());
        }
        return hs.k.f19476a;
    }
}
