package hr;

import android.app.TimePickerDialog;
import android.content.Context;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.utils.Utils;
import com.theinnerhour.b2b.widgets.RobertoEditText;
import java.util.Calendar;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class x7 implements View.OnClickListener {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ int f19393u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ z7 f19394v;

    public /* synthetic */ x7(z7 z7Var, int i6) {
        this.f19393u = i6;
        this.f19394v = z7Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x01fc A[Catch: Exception -> 0x0230, TryCatch #0 {Exception -> 0x0230, blocks: (B:32:0x00ef, B:33:0x00f5, B:35:0x00fa, B:102:0x01f6, B:104:0x01fc, B:38:0x0104, B:41:0x010e, B:44:0x0118, B:46:0x011d, B:48:0x0123, B:49:0x012d, B:51:0x0133, B:52:0x013d, B:55:0x0147, B:58:0x0151, B:108:0x020e, B:110:0x0212, B:112:0x0218, B:113:0x0221, B:115:0x0227, B:61:0x015b, B:64:0x0165, B:67:0x016f, B:70:0x0179, B:73:0x0183, B:75:0x0187, B:77:0x018d, B:78:0x0197, B:80:0x019d, B:81:0x01a7, B:84:0x01b1, B:86:0x01b5, B:87:0x01c2, B:89:0x01c8, B:90:0x01d2, B:93:0x01db, B:96:0x01e4, B:99:0x01ed, B:105:0x0205), top: B:125:0x00ef }] */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0212 A[Catch: Exception -> 0x0230, TryCatch #0 {Exception -> 0x0230, blocks: (B:32:0x00ef, B:33:0x00f5, B:35:0x00fa, B:102:0x01f6, B:104:0x01fc, B:38:0x0104, B:41:0x010e, B:44:0x0118, B:46:0x011d, B:48:0x0123, B:49:0x012d, B:51:0x0133, B:52:0x013d, B:55:0x0147, B:58:0x0151, B:108:0x020e, B:110:0x0212, B:112:0x0218, B:113:0x0221, B:115:0x0227, B:61:0x015b, B:64:0x0165, B:67:0x016f, B:70:0x0179, B:73:0x0183, B:75:0x0187, B:77:0x018d, B:78:0x0197, B:80:0x019d, B:81:0x01a7, B:84:0x01b1, B:86:0x01b5, B:87:0x01c2, B:89:0x01c8, B:90:0x01d2, B:93:0x01db, B:96:0x01e4, B:99:0x01ed, B:105:0x0205), top: B:125:0x00ef }] */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0221 A[Catch: Exception -> 0x0230, TryCatch #0 {Exception -> 0x0230, blocks: (B:32:0x00ef, B:33:0x00f5, B:35:0x00fa, B:102:0x01f6, B:104:0x01fc, B:38:0x0104, B:41:0x010e, B:44:0x0118, B:46:0x011d, B:48:0x0123, B:49:0x012d, B:51:0x0133, B:52:0x013d, B:55:0x0147, B:58:0x0151, B:108:0x020e, B:110:0x0212, B:112:0x0218, B:113:0x0221, B:115:0x0227, B:61:0x015b, B:64:0x0165, B:67:0x016f, B:70:0x0179, B:73:0x0183, B:75:0x0187, B:77:0x018d, B:78:0x0197, B:80:0x019d, B:81:0x01a7, B:84:0x01b1, B:86:0x01b5, B:87:0x01c2, B:89:0x01c8, B:90:0x01d2, B:93:0x01db, B:96:0x01e4, B:99:0x01ed, B:105:0x0205), top: B:125:0x00ef }] */
    @Override // android.view.View.OnClickListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onClick(View view) {
        String str;
        int i6 = this.f19393u;
        boolean z10 = true;
        z7 this$0 = this.f19394v;
        switch (i6) {
            case 0:
                int i10 = z7.K;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                androidx.fragment.app.p activity = this$0.getActivity();
                kotlin.jvm.internal.i.d(activity);
                pl.b bVar = new pl.b(this$0, 14);
                Calendar calendar = this$0.C;
                TimePickerDialog timePickerDialog = new TimePickerDialog(activity, bVar, calendar.get(11), calendar.get(12), false);
                timePickerDialog.setTitle("Select Time");
                timePickerDialog.show();
                return;
            case 1:
                int i11 = z7.K;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                try {
                    String str2 = this$0.A;
                    switch (str2.hashCode()) {
                        case 112151:
                            if (!str2.equals("s37")) {
                                break;
                            }
                            if (this$0.f19452z != 1) {
                                if (this$0.P()) {
                                    this$0.f19452z++;
                                    this$0.k0();
                                    break;
                                }
                            } else if (this$0.O()) {
                                this$0.f19452z++;
                                this$0.k0();
                                break;
                            }
                            break;
                        case 112180:
                            if (!str2.equals("s45")) {
                                break;
                            }
                            if (this$0.O()) {
                                this$0.f19452z++;
                                this$0.k0();
                                break;
                            }
                            break;
                        case 112207:
                            if (!str2.equals("s51")) {
                                break;
                            }
                            if (this$0.O()) {
                            }
                            break;
                        case 112211:
                            if (!str2.equals("s55")) {
                                break;
                            }
                            if (this$0.f19452z != 1) {
                            }
                            break;
                        case 112212:
                            if (!str2.equals("s56")) {
                                break;
                            }
                            if (this$0.f19452z != 1) {
                            }
                            break;
                        case 3474660:
                            if (!str2.equals("s128")) {
                                break;
                            } else if (this$0.f19452z == 0) {
                                this$0.M();
                                this$0.f19452z++;
                                this$0.k0();
                                break;
                            } else if (this$0.O()) {
                                this$0.f19452z++;
                                this$0.k0();
                                break;
                            }
                            break;
                        case 3474661:
                            if (!str2.equals("s129")) {
                                break;
                            } else if (this$0.f19452z == 0) {
                                if (this$0.P()) {
                                    this$0.f19452z++;
                                    this$0.k0();
                                    break;
                                }
                            } else if (this$0.O()) {
                                this$0.f19452z++;
                                this$0.k0();
                                break;
                            }
                            break;
                        case 3474691:
                            if (!str2.equals("s138")) {
                                break;
                            }
                            if (this$0.O()) {
                            }
                            break;
                        case 3474692:
                            if (!str2.equals("s139")) {
                                break;
                            }
                            if (this$0.O()) {
                            }
                            break;
                        case 3474714:
                            if (!str2.equals("s140")) {
                                break;
                            }
                            if (this$0.O()) {
                            }
                            break;
                        case 3474715:
                            if (!str2.equals("s141")) {
                                break;
                            }
                            if (this$0.f19452z != 1) {
                            }
                            break;
                        case 3474716:
                            if (!str2.equals("s142")) {
                                break;
                            }
                            if (this$0.O()) {
                            }
                            break;
                        case 3474745:
                            if (!str2.equals("s150")) {
                                break;
                            }
                            if (this$0.O()) {
                            }
                            break;
                        case 3474746:
                            if (!str2.equals("s151")) {
                                break;
                            } else if (this$0.f19452z == 2) {
                                if (this$0.P()) {
                                    this$0.f19452z++;
                                    this$0.k0();
                                    break;
                                }
                            } else if (this$0.O()) {
                                this$0.f19452z++;
                                this$0.k0();
                                break;
                            }
                            break;
                        case 3474747:
                            if (!str2.equals("s152")) {
                                break;
                            }
                            if (this$0.O()) {
                            }
                            break;
                        case 3474749:
                            if (!str2.equals("s154")) {
                                break;
                            }
                            if (this$0.O()) {
                            }
                            break;
                    }
                    return;
                } catch (Exception e10) {
                    LogHelper.INSTANCE.e(this$0.f19447u, "Exception", e10);
                    return;
                }
            case 2:
                int i12 = z7.K;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                this$0.Q().t0();
                return;
            case 3:
                int i13 = z7.K;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                String obj = gv.r.i1(String.valueOf(((RobertoEditText) this$0._$_findCachedViewById(R.id.editTextAdd)).getText())).toString();
                if (obj != null && obj.length() != 0) {
                    z10 = false;
                }
                if (z10) {
                    Utils utils = Utils.INSTANCE;
                    androidx.fragment.app.p activity2 = this$0.getActivity();
                    kotlin.jvm.internal.i.d(activity2);
                    if (kotlin.jvm.internal.i.b(this$0.H, "")) {
                        str = this$0.getString(R.string.enter_text);
                    } else {
                        str = this$0.H;
                    }
                    kotlin.jvm.internal.i.f(str, "if (errorInput == \"\") ge…ter_text) else errorInput");
                    utils.showCustomToast(activity2, str);
                    return;
                } else if (this$0.f19448v.contains(obj)) {
                    Utils.INSTANCE.showCustomToast(this$0.Q(), "Item Already Exists");
                    ((RobertoEditText) this$0._$_findCachedViewById(R.id.editTextAdd)).setText("");
                    this$0.I();
                    ((ImageButton) this$0._$_findCachedViewById(R.id.textAdd)).setVisibility(8);
                    return;
                } else {
                    this$0.f19448v.add(obj);
                    ((RobertoEditText) this$0._$_findCachedViewById(R.id.editTextAdd)).setText("");
                    this$0.J(obj);
                    return;
                }
            case 4:
                int i14 = z7.K;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                androidx.fragment.app.p activity3 = this$0.getActivity();
                if (activity3 != null) {
                    activity3.onBackPressed();
                    return;
                }
                return;
            case 5:
                int i15 = z7.K;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                Context context = this$0.getContext();
                kotlin.jvm.internal.i.d(context);
                androidx.appcompat.widget.a1 a1Var = new androidx.appcompat.widget.a1(context, (ImageView) this$0._$_findCachedViewById(R.id.ivEllipses));
                a1Var.a().inflate(R.menu.logs_menu, a1Var.f1344b);
                a1Var.f1346d = new hd.a(6, this$0);
                a1Var.b();
                return;
            default:
                int i16 = z7.K;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                this$0.S();
                this$0.Q().s0(new b0());
                return;
        }
    }
}
