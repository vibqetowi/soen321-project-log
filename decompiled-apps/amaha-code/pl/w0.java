package pl;

import android.app.DatePickerDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.view.Window;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.Toast;
import androidx.appcompat.widget.AppCompatImageView;
import com.bumptech.glide.Glide;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.components.dashboard.experiment.activity.LibraryScreenLogsActivity;
import com.theinnerhour.b2b.components.dynamicActivities.fragments.N9AScreenFragment;
import com.theinnerhour.b2b.components.journal.activity.JournalParentActivity;
import com.theinnerhour.b2b.components.journal.model.JournalAttachImageModel;
import com.theinnerhour.b2b.components.journal.model.JournalModel;
import com.theinnerhour.b2b.components.learningHub.experiment.activities.LearningHubExperimentActivity;
import com.theinnerhour.b2b.components.libraryExperiment.model.LibraryCollection;
import com.theinnerhour.b2b.components.libraryExperiment.model.LibraryCollectionItem;
import com.theinnerhour.b2b.components.login.fragment.ReworkLoginFragment;
import com.theinnerhour.b2b.components.login.fragment.ReworkSignupFragment;
import com.theinnerhour.b2b.components.login.model.ReworkSignupEvents;
import com.theinnerhour.b2b.components.login.model.SocialSignupModel;
import com.theinnerhour.b2b.components.logs.activity.ScreenLogsActivity;
import com.theinnerhour.b2b.components.logs.model.LogModel;
import com.theinnerhour.b2b.components.monetization.activitiy.ManageSubscriptionActivity;
import com.theinnerhour.b2b.components.monetization.activitiy.MiniMonetizationActivity;
import com.theinnerhour.b2b.components.monetization.activitiy.MonetizationActivity;
import com.theinnerhour.b2b.components.monetization.viewModel.MonetizationViewModel;
import com.theinnerhour.b2b.components.telecommunications.activity.TelecommunicationsPWAActivity;
import com.theinnerhour.b2b.model.LearningHubFieldModel;
import com.theinnerhour.b2b.model.LearningHubModel;
import com.theinnerhour.b2b.model.PostsRead;
import com.theinnerhour.b2b.persistence.FirebasePersistence;
import com.theinnerhour.b2b.utils.ConnectionStatusReceiver;
import com.theinnerhour.b2b.utils.Constants;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.utils.Utils;
import com.theinnerhour.b2b.widgets.RobertoButton;
import com.theinnerhour.b2b.widgets.RobertoEditText;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import java.util.ArrayList;
import java.util.Iterator;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class w0 implements View.OnClickListener {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ int f28662u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ Object f28663v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ Object f28664w;

    public /* synthetic */ w0(Object obj, int i6, Object obj2) {
        this.f28662u = i6;
        this.f28663v = obj;
        this.f28664w = obj2;
    }

    private final void a() {
        LogModel logModel = (LogModel) this.f28663v;
        jn.c this$0 = (jn.c) this.f28664w;
        int i6 = jn.c.f22501y;
        kotlin.jvm.internal.i.g(this$0, "this$0");
        jn.b bVar = new jn.b();
        Bundle bundle = new Bundle();
        if (logModel != null) {
            bundle.putString("key", logModel.getResultKey());
            bundle.putString("goalName", logModel.getGoalName());
            bundle.putString("goalId", logModel.getGoalId());
            bundle.putBoolean("isV3Log", logModel.isV3Log());
        }
        bVar.setArguments(bundle);
        androidx.fragment.app.p activity = this$0.getActivity();
        kotlin.jvm.internal.i.e(activity, "null cannot be cast to non-null type com.theinnerhour.b2b.components.dashboard.experiment.activity.LibraryScreenLogsActivity");
        ((LibraryScreenLogsActivity) activity).s0(bVar);
    }

    private final void b() {
        LogModel log = (LogModel) this.f28663v;
        jn.g this$0 = (jn.g) this.f28664w;
        int i6 = jn.g.F;
        kotlin.jvm.internal.i.g(log, "$log");
        kotlin.jvm.internal.i.g(this$0, "this$0");
        jn.b bVar = new jn.b();
        Bundle bundle = new Bundle();
        bundle.putString("key", log.getResultKey());
        bundle.putString("goalName", log.getGoalName());
        bundle.putString("goalId", log.getGoalId());
        bundle.putBoolean("isV3Log", log.isV3Log());
        bVar.setArguments(bundle);
        androidx.fragment.app.p activity = this$0.getActivity();
        kotlin.jvm.internal.i.e(activity, "null cannot be cast to non-null type com.theinnerhour.b2b.components.logs.activity.ScreenLogsActivity");
        ((ScreenLogsActivity) activity).s0(bVar);
    }

    private final void c() {
        ManageSubscriptionActivity this$0 = (ManageSubscriptionActivity) this.f28663v;
        Bundle analyticsBundle = (Bundle) this.f28664w;
        int i6 = ManageSubscriptionActivity.f11392y;
        kotlin.jvm.internal.i.g(this$0, "this$0");
        kotlin.jvm.internal.i.g(analyticsBundle, "$analyticsBundle");
        this$0.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://play.google.com/store/account/subscriptions?sku=" + this$0.o0().getPlan() + "&package=" + this$0.getPackageName())));
        gk.a.b(analyticsBundle, "grace_hold_dialog_update_click");
    }

    private final void d() {
        boolean z10;
        Dialog dialog = (Dialog) this.f28663v;
        MiniMonetizationActivity this$0 = (MiniMonetizationActivity) this.f28664w;
        int i6 = MiniMonetizationActivity.f11396b0;
        kotlin.jvm.internal.i.g(dialog, "$dialog");
        kotlin.jvm.internal.i.g(this$0, "this$0");
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
        if (z10) {
            if (ConnectionStatusReceiver.isConnected()) {
                MonetizationViewModel q02 = this$0.q0();
                ta.v.H(kc.f.H(q02), kotlinx.coroutines.o0.f23642c, 0, new qn.n(q02, obj, null), 2);
                dialog.dismiss();
                return;
            }
            return;
        }
        Toast.makeText(this$0, "Enter Feedback", 0).show();
    }

    private final void e() {
        boolean z10;
        Dialog dialog = (Dialog) this.f28663v;
        MonetizationActivity this$0 = (MonetizationActivity) this.f28664w;
        int i6 = MonetizationActivity.c0;
        kotlin.jvm.internal.i.g(dialog, "$dialog");
        kotlin.jvm.internal.i.g(this$0, "this$0");
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
        if (z10) {
            if (ConnectionStatusReceiver.isConnected()) {
                MonetizationViewModel q02 = this$0.q0();
                ta.v.H(kc.f.H(q02), kotlinx.coroutines.o0.f23642c, 0, new qn.n(q02, obj, null), 2);
                dialog.dismiss();
                return;
            }
            return;
        }
        Toast.makeText(this$0, "Enter Feedback", 0).show();
    }

    private final void f() {
        Editable editable;
        ho.c this$0 = (ho.c) this.f28663v;
        View view = (View) this.f28664w;
        int i6 = ho.c.f17972y;
        kotlin.jvm.internal.i.g(this$0, "this$0");
        boolean z10 = false;
        if (this$0.f17975w) {
            RobertoEditText robertoEditText = (RobertoEditText) view.findViewById(R.id.optionEditText);
            if (robertoEditText != null) {
                robertoEditText.setVisibility(8);
            }
            ((RobertoButton) view.findViewById(R.id.optionButton)).setSelected(false);
            this$0.J(!this$0.f17974v.isEmpty());
        } else {
            RobertoEditText robertoEditText2 = (RobertoEditText) view.findViewById(R.id.optionEditText);
            if (robertoEditText2 != null) {
                robertoEditText2.setVisibility(0);
            }
            ((RobertoButton) view.findViewById(R.id.optionButton)).setSelected(true);
            ScrollView scrollView = (ScrollView) this$0._$_findCachedViewById(R.id.addressConcernsScrollView);
            if (scrollView != null) {
                scrollView.post(new tl.o(11, this$0));
            }
            RobertoEditText robertoEditText3 = (RobertoEditText) view.findViewById(R.id.optionEditText);
            if (robertoEditText3 != null) {
                editable = robertoEditText3.getText();
            } else {
                editable = null;
            }
            this$0.J(!((editable == null || gv.n.B0(editable)) ? true : true));
        }
        this$0.f17975w = !this$0.f17975w;
    }

    /* JADX WARN: Code restructure failed: missing block: B:393:0x0962, code lost:
        if (r2.H == true) goto L417;
     */
    /* JADX WARN: Removed duplicated region for block: B:281:0x0659  */
    /* JADX WARN: Removed duplicated region for block: B:450:0x0671 A[SYNTHETIC] */
    @Override // android.view.View.OnClickListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onClick(View view) {
        String str;
        String str2;
        String str3;
        boolean z10;
        String str4;
        JournalModel journalModel;
        JournalModel journalModel2;
        tm.a aVar;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        String str10;
        String str11;
        String str12;
        Iterator<LibraryCollectionItem> it;
        int i6;
        boolean z11;
        String str13;
        String str14;
        String str15;
        boolean z12;
        String str16;
        String str17;
        String str18;
        String str19;
        int i10;
        Editable editable;
        Editable editable2;
        Editable editable3;
        Editable editable4;
        yp.m mVar;
        RobertoEditText robertoEditText;
        Editable text;
        String obj;
        yp.m mVar2;
        RobertoEditText robertoEditText2;
        Editable text2;
        Editable editable5;
        Editable editable6;
        Editable editable7;
        Editable editable8;
        ReworkSignupEvents.VerifyOTP verifyOTP;
        String str20;
        yp.m mVar3;
        RobertoEditText robertoEditText3;
        Editable text3;
        yp.m mVar4;
        RobertoEditText robertoEditText4;
        Editable text4;
        String str21;
        yp.m mVar5;
        RobertoEditText robertoEditText5;
        Editable text5;
        yp.m mVar6;
        RobertoEditText robertoEditText6;
        Editable text6;
        int i11 = this.f28662u;
        Object obj2 = this.f28664w;
        Object obj3 = this.f28663v;
        String str22 = null;
        switch (i11) {
            case 0:
                Dialog dialog = (Dialog) obj3;
                N9AScreenFragment this$0 = (N9AScreenFragment) obj2;
                int i12 = N9AScreenFragment.f11084z;
                kotlin.jvm.internal.i.g(dialog, "$dialog");
                kotlin.jvm.internal.i.g(this$0, "this$0");
                dialog.dismiss();
                this$0.requireActivity().finish();
                return;
            case 1:
                sl.a this$02 = (sl.a) obj3;
                hs.f<? extends zl.b, ? extends Object> session = (hs.f) obj2;
                kotlin.jvm.internal.i.g(this$02, "this$0");
                kotlin.jvm.internal.i.g(session, "$session");
                this$02.E.invoke(session);
                return;
            case 2:
                tl.q this$03 = (tl.q) obj3;
                String str23 = (String) obj2;
                kotlin.jvm.internal.i.g(this$03, "this$0");
                Intent putExtra = new Intent(this$03.requireActivity(), TelecommunicationsPWAActivity.class).putExtra(Constants.TELECOMMUNICATION_REDIRECT, pp.c.IN_PERSON_SESSION);
                zl.v vVar = this$03.E;
                if (vVar != null) {
                    str22 = vVar.C;
                }
                this$03.G.a(putExtra.putExtra("clinicLocation", str22).putExtra("isTherapy", this$03.B).putExtra("override_source_value", "app_expert_care"));
                String str24 = gk.a.f16573a;
                Bundle a10 = r1.b0.a("source", "app_expert_care");
                if (this$03.B) {
                    str = "therapy";
                } else {
                    str = "psychiatry";
                }
                a10.putString("flow", str);
                a10.putString("city", str23);
                hs.k kVar = hs.k.f19476a;
                gk.a.b(a10, "offline_listing_view_click");
                return;
            case 3:
                cm.g this$04 = (cm.g) obj3;
                String tt2 = (String) obj2;
                int i13 = cm.g.E;
                kotlin.jvm.internal.i.g(this$04, "this$0");
                kotlin.jvm.internal.i.g(tt2, "$tt");
                this$04.M();
                this$04.K().F = tt2;
                this$04.Y(false);
                return;
            case 4:
                Dialog templateChangeDialog = (Dialog) obj3;
                JournalParentActivity this$05 = (JournalParentActivity) obj2;
                int i14 = JournalParentActivity.C;
                kotlin.jvm.internal.i.g(templateChangeDialog, "$templateChangeDialog");
                kotlin.jvm.internal.i.g(this$05, "this$0");
                templateChangeDialog.dismiss();
                String str25 = gk.a.f16573a;
                Bundle bundle = new Bundle();
                tm.e eVar = this$05.f11217v;
                if (eVar != null && (aVar = eVar.A) != null) {
                    str2 = aVar.b();
                } else {
                    str2 = null;
                }
                bundle.putString("template", str2);
                if (this$05.f11219x) {
                    str3 = "screen_back";
                } else {
                    str3 = "hard_back";
                }
                bundle.putString("source", str3);
                tm.e eVar2 = this$05.f11217v;
                if (eVar2 != null) {
                    z10 = true;
                    break;
                }
                z10 = false;
                if (z10) {
                    if (eVar2 != null) {
                        journalModel = eVar2.J;
                    } else {
                        journalModel = null;
                    }
                    if (journalModel != null) {
                        if (eVar2 != null && (journalModel2 = eVar2.J) != null) {
                            str4 = journalModel2.getId();
                            str22 = str4;
                        }
                        bundle.putString("entry_id", str22);
                        hs.k kVar2 = hs.k.f19476a;
                        gk.a.b(bundle, "journal_exit_popup_no");
                        return;
                    }
                }
                str4 = "fresh_entry";
                str22 = str4;
                bundle.putString("entry_id", str22);
                hs.k kVar22 = hs.k.f19476a;
                gk.a.b(bundle, "journal_exit_popup_no");
                return;
            case 5:
                mm.b this$06 = (mm.b) obj3;
                JournalAttachImageModel item = (JournalAttachImageModel) obj2;
                kotlin.jvm.internal.i.g(this$06, "this$0");
                kotlin.jvm.internal.i.g(item, "$item");
                Context context = this$06.f25619y;
                Dialog dialog2 = new Dialog(context, 16973834);
                dialog2.setContentView(R.layout.dialog_image_fullscreen_new);
                com.bumptech.glide.f g5 = Glide.g(context);
                z4.f fVar = this$06.D;
                synchronized (g5) {
                    g5.s(fVar);
                }
                com.bumptech.glide.e<Bitmap> a11 = g5.a();
                a11.Z = item.getImageUploadedURL();
                a11.f5953b0 = true;
                a11.z(new mm.d(dialog2));
                View findViewById = dialog2.findViewById(R.id.ivClose);
                kotlin.jvm.internal.i.e(findViewById, "null cannot be cast to non-null type android.widget.ImageView");
                ((ImageView) findViewById).setOnClickListener(new lm.f(dialog2, 1));
                Window window = dialog2.getWindow();
                if (window != null) {
                    window.setLayout(-1, -1);
                }
                dialog2.show();
                return;
            case 6:
                DatePickerDialog dayPicker = (DatePickerDialog) obj3;
                qm.j this$07 = (qm.j) obj2;
                int i15 = qm.j.L;
                kotlin.jvm.internal.i.g(dayPicker, "$dayPicker");
                kotlin.jvm.internal.i.g(this$07, "this$0");
                dayPicker.show();
                String str26 = gk.a.f16573a;
                Bundle bundle2 = new Bundle();
                bundle2.putString("template", this$07.O().A.b());
                if (!this$07.O().H || this$07.O().J == null) {
                    str5 = "fresh_entry";
                } else {
                    JournalModel journalModel3 = this$07.O().J;
                    if (journalModel3 != null) {
                        str5 = journalModel3.getId();
                    }
                    bundle2.putString("entry_id", str22);
                    hs.k kVar3 = hs.k.f19476a;
                    gk.a.b(bundle2, "journal_date_change_open");
                    return;
                }
                str22 = str5;
                bundle2.putString("entry_id", str22);
                hs.k kVar32 = hs.k.f19476a;
                gk.a.b(bundle2, "journal_date_change_open");
                return;
            case 7:
                Dialog templateChangeDialog2 = (Dialog) obj3;
                qm.j this$08 = (qm.j) obj2;
                int i16 = qm.j.L;
                kotlin.jvm.internal.i.g(templateChangeDialog2, "$templateChangeDialog");
                kotlin.jvm.internal.i.g(this$08, "this$0");
                String str27 = gk.a.f16573a;
                Bundle bundle3 = new Bundle();
                bundle3.putString("template", this$08.O().A.b());
                if (!this$08.O().H || this$08.O().J == null) {
                    str6 = "fresh_entry";
                } else {
                    JournalModel journalModel4 = this$08.O().J;
                    if (journalModel4 != null) {
                        str6 = journalModel4.getId();
                    }
                    bundle3.putString("entry_id", str22);
                    hs.k kVar4 = hs.k.f19476a;
                    gk.a.b(bundle3, "journal_image_remove_cancel");
                    templateChangeDialog2.dismiss();
                    return;
                }
                str22 = str6;
                bundle3.putString("entry_id", str22);
                hs.k kVar42 = hs.k.f19476a;
                gk.a.b(bundle3, "journal_image_remove_cancel");
                templateChangeDialog2.dismiss();
                return;
            case 8:
                DatePickerDialog dayPicker2 = (DatePickerDialog) obj3;
                rm.h this$09 = (rm.h) obj2;
                int i17 = rm.h.N;
                kotlin.jvm.internal.i.g(dayPicker2, "$dayPicker");
                kotlin.jvm.internal.i.g(this$09, "this$0");
                dayPicker2.show();
                String str28 = gk.a.f16573a;
                Bundle bundle4 = new Bundle();
                bundle4.putString("template", this$09.O().A.b());
                if (!this$09.O().H || this$09.O().J == null) {
                    str7 = "fresh_entry";
                } else {
                    JournalModel journalModel5 = this$09.O().J;
                    if (journalModel5 != null) {
                        str7 = journalModel5.getId();
                    }
                    bundle4.putString("entry_id", str22);
                    hs.k kVar5 = hs.k.f19476a;
                    gk.a.b(bundle4, "journal_date_change_open");
                    return;
                }
                str22 = str7;
                bundle4.putString("entry_id", str22);
                hs.k kVar52 = hs.k.f19476a;
                gk.a.b(bundle4, "journal_date_change_open");
                return;
            case 9:
                Dialog templateChangeDialog3 = (Dialog) obj3;
                rm.h this$010 = (rm.h) obj2;
                int i18 = rm.h.N;
                kotlin.jvm.internal.i.g(templateChangeDialog3, "$templateChangeDialog");
                kotlin.jvm.internal.i.g(this$010, "this$0");
                String str29 = gk.a.f16573a;
                Bundle bundle5 = new Bundle();
                bundle5.putString("template", this$010.O().A.b());
                if (!this$010.O().H || this$010.O().J == null) {
                    str8 = "fresh_entry";
                } else {
                    JournalModel journalModel6 = this$010.O().J;
                    if (journalModel6 != null) {
                        str8 = journalModel6.getId();
                    }
                    bundle5.putString("entry_id", str22);
                    hs.k kVar6 = hs.k.f19476a;
                    gk.a.b(bundle5, "journal_image_remove_cancel");
                    templateChangeDialog3.dismiss();
                    return;
                }
                str22 = str8;
                bundle5.putString("entry_id", str22);
                hs.k kVar62 = hs.k.f19476a;
                gk.a.b(bundle5, "journal_image_remove_cancel");
                templateChangeDialog3.dismiss();
                return;
            case 10:
                DatePickerDialog dayPicker3 = (DatePickerDialog) obj3;
                sm.l this$011 = (sm.l) obj2;
                int i19 = sm.l.E;
                kotlin.jvm.internal.i.g(dayPicker3, "$dayPicker");
                kotlin.jvm.internal.i.g(this$011, "this$0");
                dayPicker3.show();
                String str30 = gk.a.f16573a;
                Bundle bundle6 = new Bundle();
                bundle6.putString("template", this$011.K().A.b());
                if (!this$011.K().H || this$011.K().J == null) {
                    str9 = "fresh_entry";
                } else {
                    JournalModel journalModel7 = this$011.K().J;
                    if (journalModel7 != null) {
                        str9 = journalModel7.getId();
                    }
                    bundle6.putString("entry_id", str22);
                    hs.k kVar7 = hs.k.f19476a;
                    gk.a.b(bundle6, "journal_date_change_open");
                    return;
                }
                str22 = str9;
                bundle6.putString("entry_id", str22);
                hs.k kVar72 = hs.k.f19476a;
                gk.a.b(bundle6, "journal_date_change_open");
                return;
            case 11:
                DatePickerDialog dayPicker4 = (DatePickerDialog) obj3;
                sm.s this$012 = (sm.s) obj2;
                int i20 = sm.s.K;
                kotlin.jvm.internal.i.g(dayPicker4, "$dayPicker");
                kotlin.jvm.internal.i.g(this$012, "this$0");
                dayPicker4.show();
                String str31 = gk.a.f16573a;
                Bundle bundle7 = new Bundle();
                bundle7.putString("template", this$012.O().A.b());
                if (!this$012.O().H || this$012.O().J == null) {
                    str10 = "fresh_entry";
                } else {
                    JournalModel journalModel8 = this$012.O().J;
                    if (journalModel8 != null) {
                        str10 = journalModel8.getId();
                    }
                    bundle7.putString("entry_id", str22);
                    hs.k kVar8 = hs.k.f19476a;
                    gk.a.b(bundle7, "journal_date_change_open");
                    return;
                }
                str22 = str10;
                bundle7.putString("entry_id", str22);
                hs.k kVar82 = hs.k.f19476a;
                gk.a.b(bundle7, "journal_date_change_open");
                return;
            case 12:
                Dialog templateChangeDialog4 = (Dialog) obj3;
                sm.s this$013 = (sm.s) obj2;
                int i21 = sm.s.K;
                kotlin.jvm.internal.i.g(templateChangeDialog4, "$templateChangeDialog");
                kotlin.jvm.internal.i.g(this$013, "this$0");
                String str32 = gk.a.f16573a;
                Bundle bundle8 = new Bundle();
                bundle8.putString("template", this$013.O().A.b());
                bundle8.putInt("step", this$013.f31737x + 1);
                if (!this$013.O().H || this$013.O().J == null) {
                    str11 = "fresh_entry";
                } else {
                    JournalModel journalModel9 = this$013.O().J;
                    if (journalModel9 != null) {
                        str11 = journalModel9.getId();
                    }
                    bundle8.putString("entry_id", str22);
                    hs.k kVar9 = hs.k.f19476a;
                    gk.a.b(bundle8, "journal_image_remove_cancel");
                    templateChangeDialog4.dismiss();
                    return;
                }
                str22 = str11;
                bundle8.putString("entry_id", str22);
                hs.k kVar92 = hs.k.f19476a;
                gk.a.b(bundle8, "journal_image_remove_cancel");
                templateChangeDialog4.dismiss();
                return;
            case 13:
                wm.b this$014 = (wm.b) obj3;
                LearningHubModel model = (LearningHubModel) obj2;
                kotlin.jvm.internal.i.g(this$014, "this$0");
                kotlin.jvm.internal.i.g(model, "$model");
                Context context2 = this$014.f36754y;
                context2.startActivity(new Intent(context2, LearningHubExperimentActivity.class).putExtra("model", model));
                return;
            case 14:
                zm.c this$015 = (zm.c) obj3;
                LibraryCollectionItem it2 = (LibraryCollectionItem) obj2;
                kotlin.jvm.internal.i.g(this$015, "this$0");
                kotlin.jvm.internal.i.g(it2, "$it");
                ss.u<String, String, String, Boolean, String, Integer, String, hs.k> uVar = this$015.B;
                String id2 = it2.getId();
                String itemType = it2.getItemType();
                String str33 = (String) is.u.j2(0, it2.getStrings());
                if (str33 != null) {
                    if (!kotlin.jvm.internal.i.b(str33, "-")) {
                        str22 = str33;
                    }
                    if (str22 != null) {
                        str12 = str22;
                        Boolean valueOf = Boolean.valueOf(it2.isFree());
                        String str34 = this$015.E;
                        it = this$015.D.iterator();
                        i6 = 0;
                        while (true) {
                            if (!it.hasNext()) {
                                if (!kotlin.jvm.internal.i.b(it.next().getId(), it2.getId())) {
                                    i6++;
                                }
                            } else {
                                i6 = -1;
                            }
                        }
                        uVar.g(id2, itemType, str12, valueOf, str34, Integer.valueOf(i6), it2.getDynamicVariant());
                        return;
                    }
                }
                str12 = "";
                Boolean valueOf2 = Boolean.valueOf(it2.isFree());
                String str342 = this$015.E;
                it = this$015.D.iterator();
                i6 = 0;
                while (true) {
                    if (!it.hasNext()) {
                    }
                    i6++;
                }
                uVar.g(id2, itemType, str12, valueOf2, str342, Integer.valueOf(i6), it2.getDynamicVariant());
                return;
            case 15:
                LearningHubModel learningHubModel = (LearningHubModel) obj3;
                zm.g this$016 = (zm.g) obj2;
                kotlin.jvm.internal.i.g(this$016, "this$0");
                if (learningHubModel != null) {
                    Iterator<PostsRead> it3 = FirebasePersistence.getInstance().getUser().getPostsRead().iterator();
                    while (true) {
                        if (it3.hasNext()) {
                            if (kotlin.jvm.internal.i.b(it3.next().getPostId(), learningHubModel.getId())) {
                                z11 = true;
                            }
                        } else {
                            z11 = false;
                        }
                    }
                    Bundle bundle9 = new Bundle();
                    bundle9.putString("course", FirebasePersistence.getInstance().getUser().getCurrentCourseName());
                    bundle9.putString("post_id", learningHubModel.getId());
                    bundle9.putString("post_type", learningHubModel.getPost_type());
                    Iterator<LearningHubFieldModel> it4 = learningHubModel.getFields().iterator();
                    while (it4.hasNext()) {
                        LearningHubFieldModel next = it4.next();
                        if (kotlin.jvm.internal.i.b(next.getData_title(), "title")) {
                            Object value = next.getValue();
                            if (value instanceof String) {
                                str14 = (String) value;
                            } else {
                                str14 = null;
                            }
                            if (str14 == null) {
                                str14 = "";
                            }
                            bundle9.putString("post_name", str14);
                        } else if (kotlin.jvm.internal.i.b(next.getData_title(), "short_desc")) {
                            Object value2 = next.getValue();
                            if (value2 instanceof String) {
                                str15 = (String) value2;
                            } else {
                                str15 = null;
                            }
                            if (str15 == null) {
                                str15 = "";
                            }
                            bundle9.putString("post_name", str15);
                        }
                    }
                    bundle9.putString("post_course", learningHubModel.getProgramme());
                    if (z11) {
                        str13 = "read";
                    } else {
                        str13 = "unread";
                    }
                    bundle9.putString("status", str13);
                    bundle9.putString("source", "lib_main_screen");
                    gk.a.b(bundle9, "cm_post_detail");
                    this$016.f39649x.invoke(learningHubModel, Boolean.valueOf(z11));
                    return;
                }
                return;
            case 16:
                LearningHubModel learningHubModel2 = (LearningHubModel) obj3;
                zm.k this$017 = (zm.k) obj2;
                kotlin.jvm.internal.i.g(this$017, "this$0");
                if (learningHubModel2 != null) {
                    try {
                        Iterator<PostsRead> it5 = FirebasePersistence.getInstance().getUser().getPostsRead().iterator();
                        while (true) {
                            if (it5.hasNext()) {
                                if (kotlin.jvm.internal.i.b(it5.next().getPostId(), learningHubModel2.getId())) {
                                    z12 = true;
                                }
                            } else {
                                z12 = false;
                            }
                        }
                        Bundle bundle10 = new Bundle();
                        bundle10.putString("course", FirebasePersistence.getInstance().getUser().getCurrentCourseName());
                        bundle10.putString("post_id", learningHubModel2.getId());
                        bundle10.putString("post_type", learningHubModel2.getPost_type());
                        Iterator<LearningHubFieldModel> it6 = learningHubModel2.getFields().iterator();
                        while (it6.hasNext()) {
                            LearningHubFieldModel next2 = it6.next();
                            if (kotlin.jvm.internal.i.b(next2.getData_title(), "title")) {
                                Object value3 = next2.getValue();
                                if (value3 instanceof String) {
                                    str17 = (String) value3;
                                } else {
                                    str17 = null;
                                }
                                if (str17 == null) {
                                    str17 = "";
                                }
                                bundle10.putString("post_name", str17);
                            } else if (kotlin.jvm.internal.i.b(next2.getData_title(), "short_desc")) {
                                Object value4 = next2.getValue();
                                if (value4 instanceof String) {
                                    str18 = (String) value4;
                                } else {
                                    str18 = null;
                                }
                                if (str18 == null) {
                                    str18 = "";
                                }
                                bundle10.putString("post_name", str18);
                            }
                        }
                        bundle10.putString("post_course", learningHubModel2.getProgramme());
                        if (z12) {
                            str16 = "read";
                        } else {
                            str16 = "unread";
                        }
                        bundle10.putString("status", str16);
                        bundle10.putString("source", "resource_lib_list_view");
                        gk.a.b(bundle10, "cm_post_detail");
                        this$017.f39664x.invoke(learningHubModel2, Boolean.valueOf(z12));
                        return;
                    } catch (Exception e10) {
                        LogHelper.INSTANCE.e(this$017.f39665y, e10);
                        return;
                    }
                }
                return;
            case 17:
                Dialog filterDialog = (Dialog) obj3;
                an.f this$018 = (an.f) obj2;
                int i22 = an.f.C;
                kotlin.jvm.internal.i.g(filterDialog, "$filterDialog");
                kotlin.jvm.internal.i.g(this$018, "this$0");
                String str35 = gk.a.f16573a;
                Bundle bundle11 = new Bundle();
                bundle11.putString("resource_chip ", this$018.f701v);
                hs.k kVar10 = hs.k.f19476a;
                gk.a.b(bundle11, "lib_resource_exit_icon_click");
                filterDialog.dismiss();
                return;
            case 18:
                ArrayList tempFilterList = (ArrayList) obj3;
                an.f this$019 = (an.f) obj2;
                int i23 = an.f.C;
                kotlin.jvm.internal.i.g(tempFilterList, "$tempFilterList");
                kotlin.jvm.internal.i.g(this$019, "this$0");
                tempFilterList.removeAll(tempFilterList);
                zm.l lVar = this$019.A;
                if (lVar != null) {
                    ArrayList<String> arrayList = lVar.f39668y;
                    arrayList.removeAll(arrayList);
                    lVar.i();
                    String str36 = gk.a.f16573a;
                    Bundle bundle12 = new Bundle();
                    bundle12.putString("resource_chip ", this$019.f701v);
                    hs.k kVar11 = hs.k.f19476a;
                    gk.a.b(bundle12, "lib_resource_filter_clear_click");
                    return;
                }
                kotlin.jvm.internal.i.q("resourcesFilterAdapter");
                throw null;
            case 19:
                an.n this$020 = (an.n) obj3;
                LibraryCollection collection = (LibraryCollection) obj2;
                int i24 = an.n.I;
                kotlin.jvm.internal.i.g(this$020, "this$0");
                kotlin.jvm.internal.i.g(collection, "$collection");
                if (this$020.f745v) {
                    RobertoTextView robertoTextView = (RobertoTextView) this$020._$_findCachedViewById(R.id.tvAcDescriptionText);
                    if (robertoTextView != null) {
                        robertoTextView.setVisibility(8);
                    }
                    RobertoTextView robertoTextView2 = (RobertoTextView) this$020._$_findCachedViewById(R.id.tvExpandCollapseCta);
                    if (robertoTextView2 != null) {
                        robertoTextView2.setText((CharSequence) is.u.j2(5, collection.getStrings()));
                    }
                    AppCompatImageView appCompatImageView = (AppCompatImageView) this$020._$_findCachedViewById(R.id.ivExpandCollapseCta);
                    if (appCompatImageView != null) {
                        appCompatImageView.startAnimation(Utils.INSTANCE.rotateBy180(0.0f, 180.0f));
                    }
                } else {
                    RobertoTextView robertoTextView3 = (RobertoTextView) this$020._$_findCachedViewById(R.id.tvAcDescriptionText);
                    if (robertoTextView3 != null) {
                        robertoTextView3.setVisibility(0);
                    }
                    RobertoTextView robertoTextView4 = (RobertoTextView) this$020._$_findCachedViewById(R.id.tvExpandCollapseCta);
                    if (robertoTextView4 != null) {
                        robertoTextView4.setText((CharSequence) is.u.j2(6, collection.getStrings()));
                    }
                    AppCompatImageView appCompatImageView2 = (AppCompatImageView) this$020._$_findCachedViewById(R.id.ivExpandCollapseCta);
                    if (appCompatImageView2 != null) {
                        appCompatImageView2.startAnimation(Utils.INSTANCE.rotateBy180(180.0f, 0.0f));
                    }
                }
                boolean z13 = !this$020.f745v;
                this$020.f745v = z13;
                String str37 = gk.a.f16573a;
                if (z13) {
                    str19 = "lib_collect_inside_see_more";
                } else {
                    str19 = "lib_collect_inside_see_less";
                }
                Bundle bundle13 = new Bundle();
                bundle13.putString("collection_name", collection.getStrings().get(0));
                Bundle arguments = this$020.getArguments();
                if (arguments != null) {
                    i10 = arguments.getInt("collection_pos", -1);
                } else {
                    i10 = -1;
                }
                bundle13.putInt("collection_position_in_list", i10);
                hs.k kVar12 = hs.k.f19476a;
                gk.a.b(bundle13, str19);
                return;
            case 20:
                kotlin.jvm.internal.u otpValid = (kotlin.jvm.internal.u) obj3;
                ReworkLoginFragment this$021 = (ReworkLoginFragment) obj2;
                int i25 = ReworkLoginFragment.C;
                kotlin.jvm.internal.i.g(otpValid, "$otpValid");
                kotlin.jvm.internal.i.g(this$021, "this$0");
                if (otpValid.f23466u) {
                    RobertoTextView robertoTextView5 = (RobertoTextView) this$021.I().findViewById(R.id.tvOTPDialogError);
                    if (robertoTextView5 != null) {
                        robertoTextView5.setVisibility(8);
                    }
                    StringBuilder sb2 = new StringBuilder();
                    RobertoEditText robertoEditText7 = (RobertoEditText) this$021.I().findViewById(R.id.etOTPDialog1);
                    if (robertoEditText7 != null) {
                        editable = robertoEditText7.getText();
                    } else {
                        editable = null;
                    }
                    sb2.append((Object) editable);
                    RobertoEditText robertoEditText8 = (RobertoEditText) this$021.I().findViewById(R.id.etOTPDialog2);
                    if (robertoEditText8 != null) {
                        editable2 = robertoEditText8.getText();
                    } else {
                        editable2 = null;
                    }
                    sb2.append((Object) editable2);
                    RobertoEditText robertoEditText9 = (RobertoEditText) this$021.I().findViewById(R.id.etOTPDialog3);
                    if (robertoEditText9 != null) {
                        editable3 = robertoEditText9.getText();
                    } else {
                        editable3 = null;
                    }
                    sb2.append((Object) editable3);
                    RobertoEditText robertoEditText10 = (RobertoEditText) this$021.I().findViewById(R.id.etOTPDialog4);
                    if (robertoEditText10 != null) {
                        editable4 = robertoEditText10.getText();
                    } else {
                        editable4 = null;
                    }
                    sb2.append((Object) editable4);
                    String sb3 = sb2.toString();
                    if (kotlin.jvm.internal.i.b(this$021.J().f17890b0, "variant_a")) {
                        yp.f fVar2 = this$021.f11327w;
                        if (fVar2 != null && (mVar2 = (yp.m) fVar2.f38775j) != null && (robertoEditText2 = mVar2.f38866c) != null && (text2 = robertoEditText2.getText()) != null) {
                            obj = text2.toString();
                        }
                        obj = null;
                    } else {
                        yp.f fVar3 = this$021.f11328x;
                        if (fVar3 != null && (mVar = (yp.m) fVar3.f38775j) != null && (robertoEditText = mVar.f38866c) != null && (text = robertoEditText.getText()) != null) {
                            obj = text.toString();
                        }
                        obj = null;
                    }
                    this$021.J().o(new ReworkSignupEvents.VerifyOTP(obj, null, sb3));
                    return;
                }
                return;
            case 21:
                Dialog emailDialog = (Dialog) obj3;
                ReworkLoginFragment this$022 = (ReworkLoginFragment) obj2;
                int i26 = ReworkLoginFragment.C;
                kotlin.jvm.internal.i.g(emailDialog, "$emailDialog");
                kotlin.jvm.internal.i.g(this$022, "this$0");
                try {
                    Utils utils = Utils.INSTANCE;
                    View findViewById2 = emailDialog.findViewById(R.id.getEmailEditText);
                    kotlin.jvm.internal.i.e(findViewById2, "null cannot be cast to non-null type com.theinnerhour.b2b.widgets.RobertoEditText");
                    if (utils.isValidEmail(String.valueOf(((RobertoEditText) findViewById2).getText()))) {
                        SocialSignupModel socialSignupModel = this$022.J().D;
                        if (socialSignupModel != null) {
                            hn.q J = this$022.J();
                            String url = socialSignupModel.getUrl();
                            View findViewById3 = emailDialog.findViewById(R.id.getEmailEditText);
                            kotlin.jvm.internal.i.e(findViewById3, "null cannot be cast to non-null type com.theinnerhour.b2b.widgets.RobertoEditText");
                            J.v(new SocialSignupModel(url, String.valueOf(((RobertoEditText) findViewById3).getText()), socialSignupModel.getIdToken(), socialSignupModel.getServerAuthCode(), socialSignupModel.getSocialEmail(), socialSignupModel.getType()));
                        }
                        emailDialog.dismiss();
                        return;
                    }
                    utils.showCustomToast(this$022.requireContext(), "Please enter a valid email.");
                    return;
                } catch (Exception e11) {
                    LogHelper.INSTANCE.e(e11);
                    return;
                }
            case 22:
                kotlin.jvm.internal.u otpValid2 = (kotlin.jvm.internal.u) obj3;
                ReworkSignupFragment this$023 = (ReworkSignupFragment) obj2;
                int i27 = ReworkSignupFragment.C;
                kotlin.jvm.internal.i.g(otpValid2, "$otpValid");
                kotlin.jvm.internal.i.g(this$023, "this$0");
                if (otpValid2.f23466u) {
                    RobertoTextView robertoTextView6 = (RobertoTextView) this$023.I().findViewById(R.id.tvOTPDialogError);
                    if (robertoTextView6 != null) {
                        robertoTextView6.setVisibility(8);
                    }
                    StringBuilder sb4 = new StringBuilder();
                    RobertoEditText robertoEditText11 = (RobertoEditText) this$023.I().findViewById(R.id.etOTPDialog1);
                    if (robertoEditText11 != null) {
                        editable5 = robertoEditText11.getText();
                    } else {
                        editable5 = null;
                    }
                    sb4.append((Object) editable5);
                    RobertoEditText robertoEditText12 = (RobertoEditText) this$023.I().findViewById(R.id.etOTPDialog2);
                    if (robertoEditText12 != null) {
                        editable6 = robertoEditText12.getText();
                    } else {
                        editable6 = null;
                    }
                    sb4.append((Object) editable6);
                    RobertoEditText robertoEditText13 = (RobertoEditText) this$023.I().findViewById(R.id.etOTPDialog3);
                    if (robertoEditText13 != null) {
                        editable7 = robertoEditText13.getText();
                    } else {
                        editable7 = null;
                    }
                    sb4.append((Object) editable7);
                    RobertoEditText robertoEditText14 = (RobertoEditText) this$023.I().findViewById(R.id.etOTPDialog4);
                    if (robertoEditText14 != null) {
                        editable8 = robertoEditText14.getText();
                    } else {
                        editable8 = null;
                    }
                    sb4.append((Object) editable8);
                    String sb5 = sb4.toString();
                    hn.q J2 = this$023.J();
                    if (kotlin.jvm.internal.i.b(this$023.J().f17890b0, "variant_a")) {
                        yp.f fVar4 = this$023.f11344w;
                        if (fVar4 != null && (mVar6 = (yp.m) fVar4.f38775j) != null && (robertoEditText6 = mVar6.f38866c) != null && (text6 = robertoEditText6.getText()) != null) {
                            str21 = text6.toString();
                        } else {
                            str21 = null;
                        }
                        yp.f fVar5 = this$023.f11344w;
                        if (fVar5 != null && (mVar5 = (yp.m) fVar5.f38775j) != null && (robertoEditText5 = mVar5.f38865b) != null && (text5 = robertoEditText5.getText()) != null) {
                            str22 = text5.toString();
                        }
                        verifyOTP = new ReworkSignupEvents.VerifyOTP(str21, str22, sb5);
                    } else {
                        yp.f fVar6 = this$023.f11345x;
                        if (fVar6 != null && (mVar4 = (yp.m) fVar6.f38775j) != null && (robertoEditText4 = mVar4.f38866c) != null && (text4 = robertoEditText4.getText()) != null) {
                            str20 = text4.toString();
                        } else {
                            str20 = null;
                        }
                        yp.f fVar7 = this$023.f11345x;
                        if (fVar7 != null && (mVar3 = (yp.m) fVar7.f38775j) != null && (robertoEditText3 = mVar3.f38865b) != null && (text3 = robertoEditText3.getText()) != null) {
                            str22 = text3.toString();
                        }
                        verifyOTP = new ReworkSignupEvents.VerifyOTP(str20, str22, sb5);
                    }
                    J2.p(verifyOTP);
                    return;
                }
                return;
            case 23:
                Dialog emailDialog2 = (Dialog) obj3;
                ReworkSignupFragment this$024 = (ReworkSignupFragment) obj2;
                int i28 = ReworkSignupFragment.C;
                kotlin.jvm.internal.i.g(emailDialog2, "$emailDialog");
                kotlin.jvm.internal.i.g(this$024, "this$0");
                try {
                    Utils utils2 = Utils.INSTANCE;
                    View findViewById4 = emailDialog2.findViewById(R.id.getEmailEditText);
                    kotlin.jvm.internal.i.e(findViewById4, "null cannot be cast to non-null type com.theinnerhour.b2b.widgets.RobertoEditText");
                    if (utils2.isValidEmail(String.valueOf(((RobertoEditText) findViewById4).getText()))) {
                        SocialSignupModel socialSignupModel2 = this$024.J().D;
                        if (socialSignupModel2 != null) {
                            hn.q J3 = this$024.J();
                            String url2 = socialSignupModel2.getUrl();
                            View findViewById5 = emailDialog2.findViewById(R.id.getEmailEditText);
                            kotlin.jvm.internal.i.e(findViewById5, "null cannot be cast to non-null type com.theinnerhour.b2b.widgets.RobertoEditText");
                            J3.v(new SocialSignupModel(url2, String.valueOf(((RobertoEditText) findViewById5).getText()), socialSignupModel2.getIdToken(), socialSignupModel2.getServerAuthCode(), socialSignupModel2.getSocialEmail(), socialSignupModel2.getType()));
                        }
                        emailDialog2.dismiss();
                        return;
                    }
                    utils2.showCustomToast(this$024.requireContext(), "Please enter a valid email.");
                    return;
                } catch (Exception e12) {
                    LogHelper.INSTANCE.e(e12);
                    return;
                }
            case 24:
                a();
                return;
            case 25:
                b();
                return;
            case 26:
                c();
                return;
            case 27:
                d();
                return;
            case 28:
                e();
                return;
            default:
                f();
                return;
        }
    }
}
