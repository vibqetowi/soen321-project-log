package dl;

import android.os.IBinder;
import android.view.KeyEvent;
import android.view.inputmethod.InputMethodManager;
import android.widget.ImageButton;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.components.dashboard.activity.V3DashboardActivity;
import com.theinnerhour.b2b.components.dashboard.experiment.activity.CustomDashboardActivity;
import com.theinnerhour.b2b.components.dashboard.experiment.activity.NotV4Activity;
import com.theinnerhour.b2b.components.lock.activity.LockScreenActivity;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.utils.UtilFunKt;
import com.theinnerhour.b2b.utils.Utils;
import com.theinnerhour.b2b.widgets.RobertoButton;
import com.theinnerhour.b2b.widgets.RobertoEditText;
import hr.c7;
import hr.f8;
import hr.f9;
import hr.i5;
import hr.o8;
import hr.s5;
import hr.w8;
import hr.z7;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class w implements TextView.OnEditorActionListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f13119a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f13120b;

    public /* synthetic */ w(int i6, Object obj) {
        this.f13119a = i6;
        this.f13120b = obj;
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public final boolean onEditorAction(TextView textView, int i6, KeyEvent keyEvent) {
        int i10;
        IBinder iBinder;
        yp.c cVar;
        RobertoEditText robertoEditText;
        int i11;
        IBinder iBinder2;
        yp.c cVar2;
        RobertoEditText robertoEditText2;
        AppCompatImageView appCompatImageView;
        RobertoButton robertoButton;
        int i12 = this.f13119a;
        Object obj = this.f13120b;
        switch (i12) {
            case 0:
                V3DashboardActivity this$0 = (V3DashboardActivity) obj;
                int i13 = V3DashboardActivity.f10714r1;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                if (keyEvent.getKeyCode() == 66) {
                    Object systemService = this$0.getSystemService("input_method");
                    kotlin.jvm.internal.i.e(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
                    InputMethodManager inputMethodManager = (InputMethodManager) systemService;
                    RobertoEditText robertoEditText3 = (RobertoEditText) this$0.n0(R.id.etNPSBottomSheetFeedback);
                    inputMethodManager.hideSoftInputFromWindow(robertoEditText3 != null ? robertoEditText3.getWindowToken() : null, 0);
                    return true;
                }
                return false;
            case 1:
                CustomDashboardActivity this$02 = (CustomDashboardActivity) obj;
                int i14 = CustomDashboardActivity.C;
                kotlin.jvm.internal.i.g(this$02, "this$0");
                if (keyEvent.getKeyCode() == 66) {
                    Object systemService2 = this$02.getSystemService("input_method");
                    kotlin.jvm.internal.i.e(systemService2, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
                    InputMethodManager inputMethodManager2 = (InputMethodManager) systemService2;
                    v.c cVar3 = this$02.A;
                    if (cVar3 == null || (cVar = (yp.c) cVar3.f34632w) == null || (robertoEditText = cVar.f38737d) == null) {
                        i10 = 0;
                        iBinder = null;
                    } else {
                        iBinder = robertoEditText.getWindowToken();
                        i10 = 0;
                    }
                    inputMethodManager2.hideSoftInputFromWindow(iBinder, i10);
                    return true;
                }
                return false;
            case 2:
                NotV4Activity this$03 = (NotV4Activity) obj;
                int i15 = NotV4Activity.G;
                kotlin.jvm.internal.i.g(this$03, "this$0");
                if (keyEvent.getKeyCode() == 66) {
                    Object systemService3 = this$03.getSystemService("input_method");
                    kotlin.jvm.internal.i.e(systemService3, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
                    InputMethodManager inputMethodManager3 = (InputMethodManager) systemService3;
                    v.c cVar4 = this$03.F;
                    if (cVar4 == null || (cVar2 = (yp.c) cVar4.f34633x) == null || (robertoEditText2 = cVar2.f38737d) == null) {
                        i11 = 0;
                        iBinder2 = null;
                    } else {
                        iBinder2 = robertoEditText2.getWindowToken();
                        i11 = 0;
                    }
                    inputMethodManager3.hideSoftInputFromWindow(iBinder2, i11);
                    return true;
                }
                return false;
            case 3:
                LockScreenActivity this$04 = (LockScreenActivity) obj;
                int i16 = LockScreenActivity.E;
                kotlin.jvm.internal.i.g(this$04, "this$0");
                LogHelper.INSTANCE.i(this$04.f11301v, defpackage.c.p("on editor listener ", i6));
                if (i6 == 6) {
                    this$04.s0();
                    return true;
                }
                return false;
            case 4:
                ho.d this$05 = (ho.d) obj;
                int i17 = ho.d.f17986w;
                kotlin.jvm.internal.i.g(this$05, "this$0");
                if (i6 == 6 && (appCompatImageView = (AppCompatImageView) this$05._$_findCachedViewById(R.id.paAssessmentAgeCta)) != null) {
                    appCompatImageView.performClick();
                }
                return true;
            case 5:
                ho.k this$06 = (ho.k) obj;
                int i18 = ho.k.f18013w;
                kotlin.jvm.internal.i.g(this$06, "this$0");
                if (i6 == 6 && (robertoButton = (RobertoButton) this$06._$_findCachedViewById(R.id.paAssessmentNameCta)) != null) {
                    robertoButton.performClick();
                }
                return true;
            case 6:
                fq.b0 this$07 = (fq.b0) obj;
                int i19 = fq.b0.f15662z;
                kotlin.jvm.internal.i.g(this$07, "this$0");
                if (i6 == 6) {
                    String valueOf = String.valueOf(((RobertoEditText) this$07._$_findCachedViewById(R.id.etS12Edit)).getText());
                    if (valueOf.length() == 0) {
                        Utils.INSTANCE.showCustomToast(this$07.getActivity(), "Please enter text to proceed");
                    } else {
                        ((RobertoEditText) this$07._$_findCachedViewById(R.id.etS12Edit)).setText("");
                        this$07.K(valueOf);
                    }
                    return true;
                }
                return false;
            case 7:
                fq.y0 this$08 = (fq.y0) obj;
                int i20 = fq.y0.O;
                kotlin.jvm.internal.i.g(this$08, "this$0");
                if (i6 == 6) {
                    String valueOf2 = String.valueOf(((RobertoEditText) this$08._$_findCachedViewById(R.id.editTextAdd)).getText());
                    if (valueOf2.length() == 0) {
                        Utils utils = Utils.INSTANCE;
                        androidx.fragment.app.p activity = this$08.getActivity();
                        kotlin.jvm.internal.i.d(activity);
                        String string = this$08.getString(R.string.enter_text);
                        kotlin.jvm.internal.i.f(string, "getString(R.string.enter_text)");
                        utils.showCustomToast(activity, string);
                    } else if (this$08.f15827v.contains(valueOf2)) {
                        Utils.INSTANCE.showCustomToast(this$08.P(), "Item Already Exists");
                        ((RobertoEditText) this$08._$_findCachedViewById(R.id.editTextAdd)).setText("");
                        this$08.I();
                        ((ImageButton) this$08._$_findCachedViewById(R.id.textAdd)).setVisibility(8);
                    } else {
                        this$08.f15827v.add(valueOf2);
                        ((RobertoEditText) this$08._$_findCachedViewById(R.id.editTextAdd)).setText("");
                        this$08.J(valueOf2);
                    }
                    return true;
                }
                return false;
            case 8:
                fq.a1 this$09 = (fq.a1) obj;
                int i21 = fq.a1.f15652z;
                kotlin.jvm.internal.i.g(this$09, "this$0");
                if (i6 == 6) {
                    String valueOf3 = String.valueOf(((RobertoEditText) this$09._$_findCachedViewById(R.id.etAddNew)).getText());
                    if (valueOf3.length() == 0) {
                        Utils.INSTANCE.showCustomToast(this$09.getActivity(), "Enter Text");
                    } else {
                        ((RobertoEditText) this$09._$_findCachedViewById(R.id.etAddNew)).setText("");
                        this$09.J(valueOf3);
                    }
                    return true;
                }
                return false;
            case 9:
                i5 this$010 = (i5) obj;
                int i22 = i5.A;
                kotlin.jvm.internal.i.g(this$010, "this$0");
                if (i6 == 6) {
                    String valueOf4 = String.valueOf(((RobertoEditText) this$010._$_findCachedViewById(R.id.etS12Edit)).getText());
                    if (valueOf4.length() == 0) {
                        Utils.INSTANCE.showCustomToast(this$010.getActivity(), "Enter Text");
                    } else {
                        ((RobertoEditText) this$010._$_findCachedViewById(R.id.etS12Edit)).setText("");
                        this$010.K(valueOf4);
                    }
                    return true;
                }
                return false;
            case 10:
                s5 this$011 = (s5) obj;
                int i23 = s5.f19149x;
                kotlin.jvm.internal.i.g(this$011, "this$0");
                if (i6 == 6) {
                    String valueOf5 = String.valueOf(((RobertoEditText) this$011._$_findCachedViewById(R.id.etS145Edit)).getText());
                    if (valueOf5.length() == 0) {
                        Utils utils2 = Utils.INSTANCE;
                        androidx.fragment.app.p activity2 = this$011.getActivity();
                        String string2 = this$011.getString(R.string.enter_text);
                        kotlin.jvm.internal.i.f(string2, "getString(R.string.enter_text)");
                        utils2.showCustomToast(activity2, string2);
                    } else {
                        ((RobertoEditText) this$011._$_findCachedViewById(R.id.etS145Edit)).setText("");
                        this$011.J(valueOf5);
                    }
                    return true;
                }
                return false;
            case 11:
                c7 this$012 = (c7) obj;
                int i24 = c7.D;
                kotlin.jvm.internal.i.g(this$012, "this$0");
                if (i6 == 6) {
                    String valueOf6 = String.valueOf(((RobertoEditText) this$012._$_findCachedViewById(R.id.editTextAdd)).getText());
                    if (valueOf6.length() == 0) {
                        if (this$012.f18258y.containsKey("s29_error_input")) {
                            Utils utils3 = Utils.INSTANCE;
                            androidx.fragment.app.p activity3 = this$012.getActivity();
                            kotlin.jvm.internal.i.d(activity3);
                            utils3.showCustomToast(activity3, UtilFunKt.paramsMapToString(this$012.f18258y.get("s29_error_input")));
                        } else {
                            Utils utils4 = Utils.INSTANCE;
                            androidx.fragment.app.p activity4 = this$012.getActivity();
                            kotlin.jvm.internal.i.d(activity4);
                            String string3 = this$012.getString(R.string.enter_text);
                            kotlin.jvm.internal.i.f(string3, "getString(R.string.enter_text)");
                            utils4.showCustomToast(activity4, string3);
                        }
                    } else {
                        this$012.J(valueOf6);
                        this$012.U(valueOf6);
                    }
                    return true;
                }
                return false;
            case 12:
                z7 this$013 = (z7) obj;
                int i25 = z7.K;
                kotlin.jvm.internal.i.g(this$013, "this$0");
                if (i6 == 6) {
                    String obj2 = gv.r.i1(String.valueOf(((RobertoEditText) this$013._$_findCachedViewById(R.id.editTextAdd)).getText())).toString();
                    if (obj2 == null || obj2.length() == 0) {
                        Utils utils5 = Utils.INSTANCE;
                        androidx.fragment.app.p activity5 = this$013.getActivity();
                        kotlin.jvm.internal.i.d(activity5);
                        String string4 = kotlin.jvm.internal.i.b(this$013.H, "") ? this$013.getString(R.string.enter_text) : this$013.H;
                        kotlin.jvm.internal.i.f(string4, "if (errorInput == \"\") ge…ter_text) else errorInput");
                        utils5.showCustomToast(activity5, string4);
                    } else if (this$013.f19448v.contains(obj2)) {
                        Utils.INSTANCE.showCustomToast(this$013.Q(), "Item Already Exists");
                        ((RobertoEditText) this$013._$_findCachedViewById(R.id.editTextAdd)).setText("");
                        this$013.I();
                        ((ImageButton) this$013._$_findCachedViewById(R.id.textAdd)).setVisibility(8);
                    } else {
                        this$013.f19448v.add(obj2);
                        ((RobertoEditText) this$013._$_findCachedViewById(R.id.editTextAdd)).setText("");
                        this$013.J(obj2);
                    }
                    return true;
                }
                return false;
            case 13:
                f8 this$014 = (f8) obj;
                int i26 = f8.C;
                kotlin.jvm.internal.i.g(this$014, "this$0");
                if (i6 == 6) {
                    String valueOf7 = String.valueOf(((RobertoEditText) this$014._$_findCachedViewById(R.id.etAddNew)).getText());
                    if (valueOf7.length() == 0) {
                        Utils.INSTANCE.showCustomToast(this$014.getActivity(), "Enter Text");
                    } else {
                        ((RobertoEditText) this$014._$_findCachedViewById(R.id.etAddNew)).setText("");
                        this$014.J(valueOf7);
                    }
                    return true;
                }
                return false;
            case 14:
                o8 this$015 = (o8) obj;
                int i27 = o8.H;
                kotlin.jvm.internal.i.g(this$015, "this$0");
                if (i6 == 6) {
                    String valueOf8 = String.valueOf(((RobertoEditText) this$015._$_findCachedViewById(R.id.etAddNew)).getText());
                    if (valueOf8.length() == 0) {
                        Utils.INSTANCE.showCustomToast(this$015.getActivity(), "Enter Text");
                    } else {
                        ((RobertoEditText) this$015._$_findCachedViewById(R.id.etAddNew)).setText("");
                        this$015.J(valueOf8);
                    }
                    return true;
                }
                return false;
            case 15:
                w8 this$016 = (w8) obj;
                int i28 = w8.f19358y;
                kotlin.jvm.internal.i.g(this$016, "this$0");
                if (i6 == 6) {
                    String valueOf9 = String.valueOf(((RobertoEditText) this$016._$_findCachedViewById(R.id.etS77Edit)).getText());
                    if (valueOf9.length() == 0) {
                        Utils.INSTANCE.showCustomToast(this$016.getActivity(), "Enter Text");
                    } else {
                        ((RobertoEditText) this$016._$_findCachedViewById(R.id.etS77Edit)).setText("");
                        this$016.K(valueOf9);
                    }
                    return true;
                }
                return false;
            default:
                f9 this$017 = (f9) obj;
                int i29 = f9.C;
                kotlin.jvm.internal.i.g(this$017, "this$0");
                if (i6 == 6) {
                    String valueOf10 = String.valueOf(((RobertoEditText) this$017._$_findCachedViewById(R.id.etS84Edit)).getText());
                    if (valueOf10.length() == 0) {
                        Utils.INSTANCE.showCustomToast(this$017.getActivity(), "Enter Text");
                    } else {
                        ((RobertoEditText) this$017._$_findCachedViewById(R.id.etS84Edit)).setText("");
                        this$017.K(valueOf10);
                    }
                    return true;
                }
                return false;
        }
    }
}
