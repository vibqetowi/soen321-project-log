package sq;

import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.res.ColorStateList;
import android.net.Uri;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.app.AlertController;
import androidx.appcompat.app.b;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.storage.FirebaseStorage;
import com.google.firebase.storage.OnProgressListener;
import com.google.firebase.storage.StorageReference;
import com.google.firebase.storage.UploadTask;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.activity.TemplateActivity;
import com.theinnerhour.b2b.model.Goal;
import com.theinnerhour.b2b.model.ScreenResult11Model;
import com.theinnerhour.b2b.model.ScreenResult21Model;
import com.theinnerhour.b2b.model.ScreenResult22Model;
import com.theinnerhour.b2b.model.ScreenResult28Model;
import com.theinnerhour.b2b.model.TemplateModel;
import com.theinnerhour.b2b.persistence.FirebasePersistence;
import com.theinnerhour.b2b.utils.ConnectionStatusReceiver;
import com.theinnerhour.b2b.utils.Constants;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.utils.UtilFunKt;
import com.theinnerhour.b2b.utils.Utils;
import com.theinnerhour.b2b.widgets.RobertoButton;
import com.theinnerhour.b2b.widgets.RobertoEditText;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import g0.a;
import hr.b5;
import hr.b9;
import hr.c5;
import hr.c7;
import hr.e6;
import hr.f3;
import hr.f5;
import hr.g1;
import hr.g6;
import hr.h3;
import hr.h6;
import hr.i1;
import hr.i5;
import hr.j2;
import hr.l2;
import hr.l3;
import hr.l7;
import hr.n4;
import hr.n7;
import hr.o7;
import hr.p3;
import hr.p4;
import hr.q0;
import hr.q5;
import hr.r3;
import hr.r4;
import hr.t8;
import hr.w5;
import hr.w7;
import hr.x4;
import hr.x6;
import hr.y;
import hr.y2;
import hr.y8;
import hr.z3;
import java.util.ArrayList;
import java.util.HashMap;
import kotlin.jvm.internal.v;
import kotlin.jvm.internal.x;
import r1.b0;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class p implements View.OnClickListener {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ int f31905u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ Object f31906v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ Object f31907w;

    public /* synthetic */ p(Dialog dialog, r rVar) {
        this.f31905u = 1;
        this.f31907w = dialog;
        this.f31906v = rVar;
    }

    private final void a() {
        e6 this$0 = (e6) this.f31906v;
        RelativeLayout row = (RelativeLayout) this.f31907w;
        int i6 = e6.f18340x;
        kotlin.jvm.internal.i.g(this$0, "this$0");
        kotlin.jvm.internal.i.g(row, "$row");
        try {
            if (this$0.f18342v != 5) {
                View childAt = ((LinearLayout) this$0._$_findCachedViewById(R.id.llS16List)).getChildAt(this$0.f18342v);
                childAt.setBackgroundColor(0);
                ((TextView) childAt.findViewById(R.id.tvUnderline)).setVisibility(0);
                ((RobertoTextView) childAt.findViewById(R.id.tvlabel)).setTextColor(g0.a.b(this$0.requireActivity(), R.color.unselected_row_text));
                ((RobertoTextView) childAt.findViewById(R.id.tvDescription)).setTextColor(g0.a.b(this$0.requireActivity(), R.color.unselected_row_text));
                ((ImageView) childAt.findViewById(R.id.s16RowImage)).setColorFilter(g0.a.b(this$0.requireActivity(), R.color.unselected_row_text));
            }
            row.setBackgroundColor(g0.a.b(this$0.requireActivity(), R.color.selected_row));
            ((TextView) row.findViewById(R.id.tvUnderline)).setVisibility(4);
            ((RobertoTextView) row.findViewById(R.id.tvlabel)).setTextColor(g0.a.b(this$0.requireActivity(), R.color.selected_row_text));
            ((RobertoTextView) row.findViewById(R.id.tvDescription)).setTextColor(g0.a.b(this$0.requireActivity(), R.color.selected_row_text));
            ((ImageView) row.findViewById(R.id.s16RowImage)).setColorFilter(g0.a.b(this$0.requireActivity(), R.color.selected_row_text));
            this$0.f18342v = ((LinearLayout) this$0._$_findCachedViewById(R.id.llS16List)).indexOfChild(row);
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this$0.f18341u, "exception", e10);
        }
    }

    private final void b() {
        rr.b f3Var;
        h6 this$0 = (h6) this.f31906v;
        TemplateActivity act = (TemplateActivity) this.f31907w;
        int i6 = h6.f18533w;
        kotlin.jvm.internal.i.g(this$0, "this$0");
        kotlin.jvm.internal.i.g(act, "$act");
        androidx.fragment.app.p activity = this$0.getActivity();
        kotlin.jvm.internal.i.e(activity, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
        if (((TemplateActivity) activity).getIntent().hasExtra("source") && b0.c(act, "source", "goals")) {
            androidx.fragment.app.p activity2 = this$0.getActivity();
            kotlin.jvm.internal.i.e(activity2, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
            ((TemplateActivity) activity2).Q = true;
            androidx.fragment.app.p activity3 = this$0.getActivity();
            kotlin.jvm.internal.i.e(activity3, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
            TemplateActivity templateActivity = (TemplateActivity) activity3;
            if (act.W) {
                f3Var = new h3();
            } else {
                f3Var = new f3();
            }
            templateActivity.s0(f3Var);
            return;
        }
        act.onBackPressed();
    }

    private final void c() {
        boolean z10;
        boolean z11;
        boolean z12;
        rr.b g1Var;
        x6 this$0 = (x6) this.f31906v;
        HashMap params = (HashMap) this.f31907w;
        int i6 = x6.f19390w;
        kotlin.jvm.internal.i.g(this$0, "this$0");
        kotlin.jvm.internal.i.g(params, "$params");
        String valueOf = String.valueOf(((RobertoEditText) this$0._$_findCachedViewById(R.id.editText1)).getText());
        String valueOf2 = String.valueOf(((RobertoEditText) this$0._$_findCachedViewById(R.id.editText2)).getText());
        String valueOf3 = String.valueOf(((RobertoEditText) this$0._$_findCachedViewById(R.id.editText3)).getText());
        if (valueOf.length() == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            if (valueOf2.length() == 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (!z11) {
                if (valueOf3.length() == 0) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (!z12) {
                    androidx.fragment.app.p activity = this$0.getActivity();
                    kotlin.jvm.internal.i.e(activity, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
                    ((TemplateActivity) activity).F.put("list", ca.a.k(valueOf, valueOf2, valueOf3));
                    androidx.fragment.app.p activity2 = this$0.getActivity();
                    kotlin.jvm.internal.i.e(activity2, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
                    TemplateActivity templateActivity = (TemplateActivity) activity2;
                    androidx.fragment.app.p activity3 = this$0.getActivity();
                    kotlin.jvm.internal.i.e(activity3, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
                    if (((TemplateActivity) activity3).W) {
                        g1Var = new i1();
                    } else {
                        g1Var = new g1();
                    }
                    templateActivity.s0(g1Var);
                    return;
                }
            }
        }
        Utils.INSTANCE.showCustomToast(this$0.getActivity(), UtilFunKt.paramsMapToString(params.get("s25_error")));
    }

    private final void d() {
        l7 this$0 = (l7) this.f31906v;
        TemplateActivity act = (TemplateActivity) this.f31907w;
        int i6 = l7.H;
        kotlin.jvm.internal.i.g(this$0, "this$0");
        kotlin.jvm.internal.i.g(act, "$act");
        if (this$0.f18756z) {
            if (act.W) {
                if (this$0.A != null) {
                    ProgressDialog progressDialog = this$0.C;
                    if (progressDialog != null) {
                        progressDialog.show();
                        ProgressDialog progressDialog2 = this$0.C;
                        if (progressDialog2 != null) {
                            progressDialog2.setMessage("Adding");
                        } else {
                            kotlin.jvm.internal.i.q("progressDialog");
                            throw null;
                        }
                    }
                    hs.f<String, ScreenResult11Model> fVar = this$0.A;
                    kotlin.jvm.internal.i.d(fVar);
                    hs.f<String, ScreenResult11Model> fVar2 = this$0.A;
                    kotlin.jvm.internal.i.d(fVar2);
                    ((fm.a) this$0.B.getValue()).j(fVar2.f19465v, fVar.f19464u);
                    return;
                }
                androidx.fragment.app.p activity = this$0.getActivity();
                kotlin.jvm.internal.i.e(activity, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
                if (((TemplateActivity) activity).Q) {
                    androidx.fragment.app.p activity2 = this$0.getActivity();
                    kotlin.jvm.internal.i.e(activity2, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
                    ((TemplateActivity) activity2).n0();
                    return;
                }
                androidx.fragment.app.p activity3 = this$0.getActivity();
                kotlin.jvm.internal.i.e(activity3, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
                ((TemplateActivity) activity3).t0();
                return;
            }
            androidx.fragment.app.p activity4 = this$0.getActivity();
            kotlin.jvm.internal.i.e(activity4, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
            if (((TemplateActivity) activity4).Q) {
                androidx.fragment.app.p activity5 = this$0.getActivity();
                kotlin.jvm.internal.i.e(activity5, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
                ((TemplateActivity) activity5).n0();
                return;
            }
            androidx.fragment.app.p activity6 = this$0.getActivity();
            kotlin.jvm.internal.i.e(activity6, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
            ((TemplateActivity) activity6).t0();
        } else if (this$0.f18752v != null) {
            if (ConnectionStatusReceiver.isConnected()) {
                try {
                    androidx.fragment.app.p activity7 = this$0.getActivity();
                    kotlin.jvm.internal.i.e(activity7, "null cannot be cast to non-null type com.theinnerhour.b2b.widgets.CustomActivity");
                    ProgressDialog progressDialog3 = new ProgressDialog((rr.a) activity7);
                    this$0.C = progressDialog3;
                    progressDialog3.setMessage("Please wait uploading");
                    ProgressDialog progressDialog4 = this$0.C;
                    if (progressDialog4 != null) {
                        progressDialog4.setCancelable(false);
                        ProgressDialog progressDialog5 = this$0.C;
                        if (progressDialog5 != null) {
                            progressDialog5.setProgressStyle(0);
                            ProgressDialog progressDialog6 = this$0.C;
                            if (progressDialog6 != null) {
                                progressDialog6.show();
                                Uri fromFile = Uri.fromFile(this$0.f18752v);
                                kotlin.jvm.internal.i.f(fromFile, "fromFile(imageFile)");
                                this$0.E = fromFile;
                                FirebaseStorage firebaseStorage = FirebaseStorage.getInstance();
                                StringBuilder sb2 = new StringBuilder("users/");
                                sb2.append(FirebaseAuth.getInstance().a());
                                sb2.append("/compassion_letters/");
                                Uri uri = this$0.E;
                                if (uri != null) {
                                    sb2.append(uri.getLastPathSegment());
                                    StorageReference reference = firebaseStorage.getReference(sb2.toString());
                                    kotlin.jvm.internal.i.f(reference, "getInstance().getReferen…${file.lastPathSegment}\")");
                                    Uri uri2 = this$0.E;
                                    if (uri2 != null) {
                                        reference.putFile(uri2).addOnSuccessListener((ya.f) new rk.b(10, new n7(reference, this$0))).addOnFailureListener((ya.e) new ad.f(2, this$0)).addOnProgressListener((OnProgressListener<? super UploadTask.TaskSnapshot>) new tm.h(1, new o7(this$0))).continueWithTask(new dd.a(this$0, 27, reference));
                                        return;
                                    } else {
                                        kotlin.jvm.internal.i.q("file");
                                        throw null;
                                    }
                                }
                                kotlin.jvm.internal.i.q("file");
                                throw null;
                            }
                            kotlin.jvm.internal.i.q("progressDialog");
                            throw null;
                        }
                        kotlin.jvm.internal.i.q("progressDialog");
                        throw null;
                    }
                    kotlin.jvm.internal.i.q("progressDialog");
                    throw null;
                } catch (Exception e10) {
                    LogHelper.INSTANCE.e(this$0.f18751u, "Exception", e10);
                    return;
                }
            }
            Utils.INSTANCE.showCustomToast(this$0.requireActivity(), "No internet connection");
        } else if (g0.a.a(this$0.requireActivity(), "android.permission.CAMERA") == 0) {
            this$0.J();
        } else if (f0.a.f(this$0.requireActivity(), "android.permission.CAMERA")) {
            b.a aVar = new b.a(this$0.requireActivity());
            AlertController.b bVar = aVar.f1046a;
            bVar.f1036l = true;
            bVar.f1028c = R.drawable.ic_amaha_logo_white_bg;
            aVar.setTitle("Permission necessary");
            bVar.f1031g = "Camera permission is necessary";
            aVar.setPositiveButton(17039379, new g6.g(12, this$0));
            androidx.appcompat.app.b create = aVar.create();
            kotlin.jvm.internal.i.f(create, "alertBuilder.create()");
            create.show();
        } else {
            f0.a.e(this$0.requireActivity(), this$0.f18754x, this$0.f18755y);
        }
    }

    private final void e() {
        boolean z10;
        boolean z11;
        long parseInt;
        Dialog dialog = (Dialog) this.f31906v;
        w7 this$0 = (w7) this.f31907w;
        int i6 = w7.F;
        kotlin.jvm.internal.i.g(dialog, "$dialog");
        kotlin.jvm.internal.i.g(this$0, "this$0");
        Editable text = ((RobertoEditText) dialog.findViewById(R.id.dialog_edit_mins)).getText();
        boolean z12 = false;
        if (text != null && text.length() != 0) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (z10) {
            ((RobertoEditText) dialog.findViewById(R.id.dialog_edit_mins)).setError("Set minutes");
        } else if (Integer.parseInt(String.valueOf(((RobertoEditText) dialog.findViewById(R.id.dialog_edit_mins)).getText())) < 1) {
            Utils.INSTANCE.showCustomToast(this$0.getActivity(), this$0.C);
        } else {
            Editable text2 = ((RobertoEditText) dialog.findViewById(R.id.dialog_edit_secs)).getText();
            if (text2 != null && text2.length() != 0) {
                z11 = false;
            } else {
                z11 = true;
            }
            if (!z11 && Integer.parseInt(String.valueOf(((RobertoEditText) dialog.findViewById(R.id.dialog_edit_secs)).getText())) > 60) {
                ((RobertoEditText) dialog.findViewById(R.id.dialog_edit_secs)).setText("60");
            }
            long parseInt2 = Integer.parseInt(String.valueOf(((RobertoEditText) dialog.findViewById(R.id.dialog_edit_mins)).getText())) * 60 * 1000;
            Editable text3 = ((RobertoEditText) dialog.findViewById(R.id.dialog_edit_secs)).getText();
            if ((text3 == null || text3.length() == 0) ? true : true) {
                parseInt = 0;
            } else {
                parseInt = Integer.parseInt(String.valueOf(((RobertoEditText) dialog.findViewById(R.id.dialog_edit_secs)).getText())) * 1000;
            }
            long j10 = parseInt2 + parseInt;
            this$0.f19356y = j10;
            this$0.f19357z = j10;
            dialog.dismiss();
            this$0.f19355x = true;
            this$0.J();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0089 A[Catch: Exception -> 0x00a8, TryCatch #0 {Exception -> 0x00a8, blocks: (B:3:0x0014, B:5:0x0018, B:9:0x002d, B:8:0x002b, B:10:0x0032, B:11:0x0054, B:31:0x0098, B:32:0x009b, B:13:0x0058, B:19:0x006a, B:16:0x0061, B:20:0x0073, B:26:0x0085, B:28:0x0089, B:30:0x0094, B:29:0x008f, B:23:0x007c), top: B:37:0x0014 }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x008f A[Catch: Exception -> 0x00a8, TryCatch #0 {Exception -> 0x00a8, blocks: (B:3:0x0014, B:5:0x0018, B:9:0x002d, B:8:0x002b, B:10:0x0032, B:11:0x0054, B:31:0x0098, B:32:0x009b, B:13:0x0058, B:19:0x006a, B:16:0x0061, B:20:0x0073, B:26:0x0085, B:28:0x0089, B:30:0x0094, B:29:0x008f, B:23:0x007c), top: B:37:0x0014 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void f() {
        rr.b j2Var;
        String str;
        t8 this$0 = (t8) this.f31906v;
        String slug = (String) this.f31907w;
        int i6 = t8.f19209z;
        kotlin.jvm.internal.i.g(this$0, "this$0");
        kotlin.jvm.internal.i.g(slug, "$slug");
        try {
            if (this$0.f19211v == null) {
                Utils utils = Utils.INSTANCE;
                androidx.fragment.app.p activity = this$0.getActivity();
                if (kotlin.jvm.internal.i.b(this$0.f19213x, "")) {
                    str = "Select option";
                } else {
                    str = this$0.f19213x;
                }
                utils.showCustomToast(activity, str);
                return;
            }
            androidx.fragment.app.p activity2 = this$0.getActivity();
            kotlin.jvm.internal.i.e(activity2, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
            TemplateActivity templateActivity = (TemplateActivity) activity2;
            templateActivity.F.put("list", ca.a.k(this$0.f19211v));
            switch (slug.hashCode()) {
                case 3474628:
                    if (!slug.equals("s117")) {
                        templateActivity.t0();
                        HashMap<String, Object> hashMap = templateActivity.F;
                        String str2 = this$0.f19211v;
                        kotlin.jvm.internal.i.d(str2);
                        hashMap.put("s6_user_data", str2);
                        return;
                    }
                    if (!templateActivity.W) {
                        j2Var = new l2();
                    } else {
                        j2Var = new j2();
                    }
                    templateActivity.s0(j2Var);
                    HashMap<String, Object> hashMap2 = templateActivity.F;
                    String str22 = this$0.f19211v;
                    kotlin.jvm.internal.i.d(str22);
                    hashMap2.put("s6_user_data", str22);
                    return;
                case 3474654:
                    if (slug.equals("s122")) {
                        if (!templateActivity.W) {
                        }
                        templateActivity.s0(j2Var);
                        HashMap<String, Object> hashMap22 = templateActivity.F;
                        String str222 = this$0.f19211v;
                        kotlin.jvm.internal.i.d(str222);
                        hashMap22.put("s6_user_data", str222);
                        return;
                    }
                    templateActivity.t0();
                    HashMap<String, Object> hashMap222 = templateActivity.F;
                    String str2222 = this$0.f19211v;
                    kotlin.jvm.internal.i.d(str2222);
                    hashMap222.put("s6_user_data", str2222);
                    return;
                case 3474703:
                    if (!slug.equals("s12c")) {
                        templateActivity.t0();
                        HashMap<String, Object> hashMap2222 = templateActivity.F;
                        String str22222 = this$0.f19211v;
                        kotlin.jvm.internal.i.d(str22222);
                        hashMap2222.put("s6_user_data", str22222);
                        return;
                    }
                    templateActivity.s0(new q5());
                    HashMap<String, Object> hashMap22222 = templateActivity.F;
                    String str222222 = this$0.f19211v;
                    kotlin.jvm.internal.i.d(str222222);
                    hashMap22222.put("s6_user_data", str222222);
                    return;
                case 107714218:
                    if (!slug.equals("s12-c")) {
                        templateActivity.t0();
                        HashMap<String, Object> hashMap222222 = templateActivity.F;
                        String str2222222 = this$0.f19211v;
                        kotlin.jvm.internal.i.d(str2222222);
                        hashMap222222.put("s6_user_data", str2222222);
                        return;
                    }
                    templateActivity.s0(new q5());
                    HashMap<String, Object> hashMap2222222 = templateActivity.F;
                    String str22222222 = this$0.f19211v;
                    kotlin.jvm.internal.i.d(str22222222);
                    hashMap2222222.put("s6_user_data", str22222222);
                    return;
                default:
                    templateActivity.t0();
                    HashMap<String, Object> hashMap22222222 = templateActivity.F;
                    String str222222222 = this$0.f19211v;
                    kotlin.jvm.internal.i.d(str222222222);
                    hashMap22222222.put("s6_user_data", str222222222);
                    return;
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this$0.f19210u, "Exception", e10);
        }
    }

    private final void g() {
        t8 this$0 = (t8) this.f31906v;
        RelativeLayout row = (RelativeLayout) this.f31907w;
        int i6 = t8.f19209z;
        kotlin.jvm.internal.i.g(this$0, "this$0");
        kotlin.jvm.internal.i.g(row, "$row");
        try {
            this$0.K(row);
            RelativeLayout relativeLayout = this$0.f19212w;
            kotlin.jvm.internal.i.d(relativeLayout);
            this$0.f19211v = ((RobertoTextView) relativeLayout.findViewById(R.id.label)).getText().toString();
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this$0.f19210u, "exception", e10);
        }
    }

    private final void h() {
        y8 this$0 = (y8) this.f31906v;
        x urgentImportantList = (x) this.f31907w;
        int i6 = y8.f19422w;
        kotlin.jvm.internal.i.g(this$0, "this$0");
        kotlin.jvm.internal.i.g(urgentImportantList, "$urgentImportantList");
        androidx.fragment.app.p activity = this$0.getActivity();
        kotlin.jvm.internal.i.e(activity, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
        HashMap<String, Object> hashMap = ((TemplateActivity) activity).F;
        ScreenResult21Model screenResult21Model = new ScreenResult21Model(Utils.INSTANCE.getTimeInSeconds(), (ArrayList) urgentImportantList.f23469u);
        hashMap.put("s78_user_model", screenResult21Model);
        hashMap.put("result_21", screenResult21Model);
        hashMap.put("s78_user_list", urgentImportantList.f23469u);
        androidx.fragment.app.p activity2 = this$0.getActivity();
        kotlin.jvm.internal.i.e(activity2, "null cannot be cast to non-null type com.theinnerhour.b2b.widgets.CustomActivity");
        ((rr.a) activity2).t0();
    }

    private final void i() {
        b9 this$0 = (b9) this.f31906v;
        x urgentImportantList = (x) this.f31907w;
        int i6 = b9.f18209w;
        kotlin.jvm.internal.i.g(this$0, "this$0");
        kotlin.jvm.internal.i.g(urgentImportantList, "$urgentImportantList");
        androidx.fragment.app.p activity = this$0.getActivity();
        kotlin.jvm.internal.i.e(activity, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
        HashMap<String, Object> hashMap = ((TemplateActivity) activity).F;
        ScreenResult22Model screenResult22Model = new ScreenResult22Model(Utils.INSTANCE.getTimeInSeconds(), (ArrayList) urgentImportantList.f23469u);
        hashMap.put("s82_user_model", screenResult22Model);
        hashMap.put("result_22", screenResult22Model);
        hashMap.put("s82_user_list", urgentImportantList.f23469u);
        androidx.fragment.app.p activity2 = this$0.getActivity();
        kotlin.jvm.internal.i.e(activity2, "null cannot be cast to non-null type com.theinnerhour.b2b.widgets.CustomActivity");
        ((rr.a) activity2).t0();
    }

    /* JADX WARN: Code restructure failed: missing block: B:172:0x074f, code lost:
        if (r15.equals("Se44ReTwDvoK5X0tDmWs") == false) goto L220;
     */
    /* JADX WARN: Code restructure failed: missing block: B:175:0x0759, code lost:
        if (r15.equals("JaR3ditHyPz8IGYXlSVl") == false) goto L220;
     */
    /* JADX WARN: Code restructure failed: missing block: B:178:0x0763, code lost:
        if (r15.equals("cne11nXtru0oPv0is7Yf") == false) goto L220;
     */
    /* JADX WARN: Code restructure failed: missing block: B:181:0x076d, code lost:
        if (r15.equals("Xa20frT4BnvlDzUFMmorgwJFMcI") == false) goto L220;
     */
    /* JADX WARN: Code restructure failed: missing block: B:184:0x0777, code lost:
        if (r15.equals("Y1N_bj6iqytXg-CT22vkXx-kZro") == false) goto L220;
     */
    /* JADX WARN: Code restructure failed: missing block: B:187:0x0781, code lost:
        if (r15.equals("ttm6UI4iuCiQgtJ3FbRU") == false) goto L220;
     */
    /* JADX WARN: Code restructure failed: missing block: B:190:0x078b, code lost:
        if (r15.equals("J5vUmqNOqAreowqA0DU2") == false) goto L220;
     */
    /* JADX WARN: Code restructure failed: missing block: B:193:0x0795, code lost:
        if (r15.equals("eYziRtpTFFvhGpqE8eu7TsA5vX4") == false) goto L220;
     */
    /* JADX WARN: Code restructure failed: missing block: B:196:0x079f, code lost:
        if (r15.equals("RPxbvpUZhFbiDQmTyVrZ") == false) goto L220;
     */
    /* JADX WARN: Code restructure failed: missing block: B:199:0x07a8, code lost:
        if (r15.equals("olnpt1TJoTC5oz0JmKA1") == false) goto L220;
     */
    /* JADX WARN: Code restructure failed: missing block: B:202:0x07b1, code lost:
        if (r15.equals("o6xGWmIQPyhq5RrPO5DE") == false) goto L220;
     */
    /* JADX WARN: Code restructure failed: missing block: B:205:0x07ba, code lost:
        if (r15.equals("llE3WkkaVgDuLmZz4P25") == false) goto L220;
     */
    /* JADX WARN: Code restructure failed: missing block: B:212:0x07fb, code lost:
        if (r15.equals("1C38AqobWmbvKt4V0KuMMypGbqc") == false) goto L220;
     */
    /* JADX WARN: Code restructure failed: missing block: B:214:0x07fe, code lost:
        r15 = r13.getActivity();
        kotlin.jvm.internal.i.e(r15, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
        ((com.theinnerhour.b2b.activity.TemplateActivity) r15).onBackPressed();
     */
    /* JADX WARN: Code restructure failed: missing block: B:318:?, code lost:
        return;
     */
    @Override // android.view.View.OnClickListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onClick(View view) {
        String str;
        String str2;
        String str3;
        rr.b j2Var;
        String label;
        String str4;
        int i6 = this.f31905u;
        Object obj = this.f31907w;
        Object obj2 = this.f31906v;
        switch (i6) {
            case 0:
                r this$0 = (r) obj2;
                View view2 = (View) obj;
                int i10 = r.B;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                this$0.K(((RobertoTextView) view2.findViewById(R.id.rowTitle)).getText().toString());
                this$0.f31911v = ((RobertoTextView) view2.findViewById(R.id.rowTitle)).getText().toString();
                ((RadioButton) view2.findViewById(R.id.radioToggle)).setChecked(true);
                ((RadioButton) view2.findViewById(R.id.radioToggle)).setButtonTintList(ColorStateList.valueOf(g0.a.b(this$0.requireActivity(), R.color.sea)));
                ((RobertoButton) this$0._$_findCachedViewById(R.id.continueCTA)).setBackground(a.c.b(this$0.requireContext(), R.drawable.button_dark_grey_fill));
                return;
            case 1:
                Dialog dialog = (Dialog) obj;
                r this$02 = (r) obj2;
                int i11 = r.B;
                kotlin.jvm.internal.i.g(dialog, "$dialog");
                kotlin.jvm.internal.i.g(this$02, "this$0");
                if (!gv.n.B0(String.valueOf(((RobertoEditText) dialog.findViewById(R.id.editTextOption)).getText()))) {
                    this$02.J(String.valueOf(((RobertoEditText) dialog.findViewById(R.id.editTextOption)).getText()));
                    dialog.dismiss();
                    return;
                }
                return;
            case 2:
                v score = (v) obj2;
                y this$03 = (y) obj;
                int i12 = y.f19399w;
                kotlin.jvm.internal.i.g(score, "$score");
                kotlin.jvm.internal.i.g(this$03, "this$0");
                int i13 = score.f23467u;
                if (i13 != -1) {
                    androidx.fragment.app.p activity = this$03.getActivity();
                    kotlin.jvm.internal.i.e(activity, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
                    sp.d dVar = ((TemplateActivity) activity).U;
                    if (dVar != null) {
                        String courseName = rr.a.q0();
                        kotlin.jvm.internal.i.f(courseName, "courseName");
                        ta.v.H(kc.f.H(dVar), null, 0, new sp.c(dVar, i13, courseName, null), 3);
                    }
                    androidx.fragment.app.p activity2 = this$03.getActivity();
                    kotlin.jvm.internal.i.e(activity2, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
                    ((TemplateActivity) activity2).w0();
                    String str5 = gk.a.f16573a;
                    Bundle bundle = new Bundle();
                    defpackage.e.s(bundle, "course", "type", Constants.SCREEN_ACTIVITY);
                    bundle.putInt("rating", score.f23467u);
                    hs.k kVar = hs.k.f19476a;
                    gk.a.b(bundle, "self_care_nps_submit");
                    return;
                }
                return;
            case 3:
                q0 this$04 = (q0) obj2;
                TemplateActivity act = (TemplateActivity) obj;
                int i14 = q0.f18990w;
                kotlin.jvm.internal.i.g(this$04, "this$0");
                kotlin.jvm.internal.i.g(act, "$act");
                androidx.fragment.app.p activity3 = this$04.getActivity();
                kotlin.jvm.internal.i.e(activity3, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
                if (((TemplateActivity) activity3).getIntent().hasExtra("source") && b0.c(act, "source", "goals")) {
                    androidx.fragment.app.p activity4 = this$04.getActivity();
                    kotlin.jvm.internal.i.e(activity4, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
                    ((TemplateActivity) activity4).o0();
                    return;
                }
                androidx.fragment.app.p activity5 = this$04.getActivity();
                kotlin.jvm.internal.i.e(activity5, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
                ((TemplateActivity) activity5).I = false;
                androidx.fragment.app.p activity6 = this$04.getActivity();
                kotlin.jvm.internal.i.e(activity6, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
                ((TemplateActivity) activity6).onBackPressed();
                return;
            case 4:
                g1 this$05 = (g1) obj2;
                Goal goal = (Goal) obj;
                int i15 = g1.f18430x;
                kotlin.jvm.internal.i.g(this$05, "this$0");
                TemplateActivity templateActivity = this$05.f18432v;
                if (templateActivity != null) {
                    if (kotlin.jvm.internal.i.b(templateActivity.F.get("log_back"), Boolean.TRUE)) {
                        TemplateActivity templateActivity2 = this$05.f18432v;
                        if (templateActivity2 != null) {
                            androidx.fragment.app.y yVar = templateActivity2.B;
                            kotlin.jvm.internal.i.d(yVar);
                            yVar.W();
                            return;
                        }
                        kotlin.jvm.internal.i.q("act");
                        throw null;
                    }
                    androidx.fragment.app.p activity7 = this$05.getActivity();
                    kotlin.jvm.internal.i.e(activity7, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
                    if (((TemplateActivity) activity7).getIntent().hasExtra("source")) {
                        TemplateActivity templateActivity3 = this$05.f18432v;
                        if (templateActivity3 != null) {
                            if (b0.c(templateActivity3, "source", "goals")) {
                                if (goal != null) {
                                    str = goal.getGoalId();
                                } else {
                                    str = null;
                                }
                                if (kotlin.jvm.internal.i.b(str, "AskzVbMafuaqKJtzT9g9")) {
                                    androidx.fragment.app.p activity8 = this$05.getActivity();
                                    kotlin.jvm.internal.i.e(activity8, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
                                    ((TemplateActivity) activity8).I = false;
                                    androidx.fragment.app.p activity9 = this$05.getActivity();
                                    kotlin.jvm.internal.i.e(activity9, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
                                    ((TemplateActivity) activity9).R = true;
                                    androidx.fragment.app.p activity10 = this$05.getActivity();
                                    kotlin.jvm.internal.i.e(activity10, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
                                    ((TemplateActivity) activity10).onBackPressed();
                                    return;
                                }
                                androidx.fragment.app.p activity11 = this$05.getActivity();
                                kotlin.jvm.internal.i.e(activity11, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
                                ((TemplateActivity) activity11).o0();
                                return;
                            }
                        } else {
                            kotlin.jvm.internal.i.q("act");
                            throw null;
                        }
                    }
                    androidx.fragment.app.p activity12 = this$05.getActivity();
                    kotlin.jvm.internal.i.e(activity12, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
                    ((TemplateActivity) activity12).I = false;
                    androidx.fragment.app.p activity13 = this$05.getActivity();
                    kotlin.jvm.internal.i.e(activity13, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
                    ((TemplateActivity) activity13).onBackPressed();
                    return;
                }
                kotlin.jvm.internal.i.q("act");
                throw null;
            case 5:
                y2 this$06 = (y2) obj2;
                TemplateActivity act2 = (TemplateActivity) obj;
                int i16 = y2.f19408w;
                kotlin.jvm.internal.i.g(this$06, "this$0");
                kotlin.jvm.internal.i.g(act2, "$act");
                androidx.fragment.app.p activity14 = this$06.getActivity();
                kotlin.jvm.internal.i.e(activity14, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
                ((TemplateActivity) activity14).I = false;
                androidx.fragment.app.p activity15 = this$06.getActivity();
                kotlin.jvm.internal.i.e(activity15, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
                ((TemplateActivity) activity15).R = true;
                androidx.fragment.app.p activity16 = this$06.getActivity();
                kotlin.jvm.internal.i.e(activity16, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
                ((TemplateActivity) activity16).onBackPressed();
                androidx.fragment.app.p activity17 = this$06.getActivity();
                kotlin.jvm.internal.i.e(activity17, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
                if (((TemplateActivity) activity17).getIntent().hasExtra("source") && b0.c(act2, "source", "goals")) {
                    androidx.fragment.app.p activity18 = this$06.getActivity();
                    kotlin.jvm.internal.i.e(activity18, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
                    Goal y02 = ((TemplateActivity) activity18).y0();
                    if (y02 != null) {
                        str3 = y02.getGoalId();
                    } else {
                        str3 = null;
                    }
                    if (is.u.Z1(ca.a.k("xe7jcogqngzLjogc87oW", "RCjiqbnaYq7GiSwjDK9b"), str3)) {
                        androidx.fragment.app.p activity19 = this$06.getActivity();
                        kotlin.jvm.internal.i.e(activity19, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
                        ((TemplateActivity) activity19).onBackPressed();
                    }
                }
                String[] strArr = {"Q3xwy0JpjsDxMhMSz2iJ", "RLeP6oZozGdOkedoDWi6"};
                androidx.fragment.app.p activity20 = this$06.getActivity();
                kotlin.jvm.internal.i.e(activity20, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
                Goal y03 = ((TemplateActivity) activity20).y0();
                if (y03 != null) {
                    str2 = y03.getGoalId();
                } else {
                    str2 = null;
                }
                if (is.k.Q1(str2, strArr)) {
                    androidx.fragment.app.p activity21 = this$06.getActivity();
                    kotlin.jvm.internal.i.e(activity21, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
                    ((TemplateActivity) activity21).onBackPressed();
                    androidx.fragment.app.p activity22 = this$06.getActivity();
                    kotlin.jvm.internal.i.e(activity22, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
                    ((TemplateActivity) activity22).onBackPressed();
                    androidx.fragment.app.p activity23 = this$06.getActivity();
                    kotlin.jvm.internal.i.e(activity23, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
                    ((TemplateActivity) activity23).onBackPressed();
                    androidx.fragment.app.p activity24 = this$06.getActivity();
                    kotlin.jvm.internal.i.e(activity24, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
                    ((TemplateActivity) activity24).onBackPressed();
                    return;
                }
                return;
            case 6:
                l3 this$07 = (l3) obj2;
                x list = (x) obj;
                int i17 = l3.f18737w;
                kotlin.jvm.internal.i.g(this$07, "this$0");
                kotlin.jvm.internal.i.g(list, "$list");
                androidx.fragment.app.p activity25 = this$07.getActivity();
                kotlin.jvm.internal.i.e(activity25, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
                Goal y04 = ((TemplateActivity) activity25).y0();
                if (y04 != null) {
                    y04.getData().put("result_5", list.f23469u);
                }
                FirebasePersistence.getInstance().updateUserOnFirebase();
                androidx.fragment.app.p activity26 = this$07.getActivity();
                kotlin.jvm.internal.i.e(activity26, "null cannot be cast to non-null type com.theinnerhour.b2b.widgets.CustomActivity");
                ((rr.a) activity26).t0();
                return;
            case 7:
                p3 this$08 = (p3) obj2;
                TemplateActivity act3 = (TemplateActivity) obj;
                int i18 = p3.f18950w;
                kotlin.jvm.internal.i.g(this$08, "this$0");
                kotlin.jvm.internal.i.g(act3, "$act");
                androidx.fragment.app.p activity27 = this$08.getActivity();
                kotlin.jvm.internal.i.e(activity27, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
                ((TemplateActivity) activity27).I = false;
                androidx.fragment.app.p activity28 = this$08.getActivity();
                kotlin.jvm.internal.i.e(activity28, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
                ((TemplateActivity) activity28).R = true;
                act3.F.put("edit_back", Boolean.TRUE);
                androidx.fragment.app.p activity29 = this$08.getActivity();
                kotlin.jvm.internal.i.e(activity29, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
                ((TemplateActivity) activity29).onBackPressed();
                return;
            case 8:
                z3 this$09 = (z3) obj2;
                TemplateActivity act4 = (TemplateActivity) obj;
                int i19 = z3.f19436w;
                kotlin.jvm.internal.i.g(this$09, "this$0");
                kotlin.jvm.internal.i.g(act4, "$act");
                androidx.fragment.app.p activity30 = this$09.getActivity();
                kotlin.jvm.internal.i.e(activity30, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
                ((TemplateActivity) activity30).I = false;
                androidx.fragment.app.p activity31 = this$09.getActivity();
                kotlin.jvm.internal.i.e(activity31, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
                ((TemplateActivity) activity31).R = true;
                androidx.fragment.app.p activity32 = this$09.getActivity();
                kotlin.jvm.internal.i.e(activity32, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
                ((TemplateActivity) activity32).F.put("fromEdit", Boolean.TRUE);
                androidx.fragment.app.p activity33 = this$09.getActivity();
                kotlin.jvm.internal.i.e(activity33, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
                String B0 = ((TemplateActivity) activity33).B0();
                if (kotlin.jvm.internal.i.b(B0, "s108")) {
                    androidx.fragment.app.p activity34 = this$09.getActivity();
                    kotlin.jvm.internal.i.e(activity34, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
                    ((TemplateActivity) activity34).onBackPressed();
                    androidx.fragment.app.p activity35 = this$09.getActivity();
                    kotlin.jvm.internal.i.e(activity35, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
                    ((TemplateActivity) activity35).onBackPressed();
                    return;
                } else if (kotlin.jvm.internal.i.b(B0, "s92-d")) {
                    androidx.fragment.app.p activity36 = this$09.getActivity();
                    kotlin.jvm.internal.i.e(activity36, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
                    ((TemplateActivity) activity36).onBackPressed();
                    androidx.fragment.app.p activity37 = this$09.getActivity();
                    kotlin.jvm.internal.i.e(activity37, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
                    ((TemplateActivity) activity37).onBackPressed();
                    androidx.fragment.app.p activity38 = this$09.getActivity();
                    kotlin.jvm.internal.i.e(activity38, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
                    ((TemplateActivity) activity38).onBackPressed();
                    ArrayList k10 = ca.a.k("Hu1zjaK518AGX6p1uNyw", "TVjSoqFdOrM0CE0YU1ja", "pIjSaq3mFoJJuwZZr1BW", "hFSM0DtKqmPlpmt7bTE4");
                    Goal y05 = act4.y0();
                    kotlin.jvm.internal.i.d(y05);
                    if (!is.u.Z1(k10, y05.getGoalId())) {
                        androidx.fragment.app.p activity39 = this$09.getActivity();
                        kotlin.jvm.internal.i.e(activity39, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
                        ((TemplateActivity) activity39).J = false;
                        return;
                    }
                    return;
                } else {
                    androidx.fragment.app.p activity40 = this$09.getActivity();
                    kotlin.jvm.internal.i.e(activity40, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
                    if (((TemplateActivity) activity40).y0() != null) {
                        androidx.fragment.app.p activity41 = this$09.getActivity();
                        kotlin.jvm.internal.i.e(activity41, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
                        Goal y06 = ((TemplateActivity) activity41).y0();
                        kotlin.jvm.internal.i.d(y06);
                        String goalId = y06.getGoalId();
                        if (goalId != null) {
                            switch (goalId.hashCode()) {
                                case -1509384593:
                                    break;
                                case -1455286255:
                                    if (goalId.equals("trlaIGthnGTmcverPNnj")) {
                                        androidx.fragment.app.p activity42 = this$09.getActivity();
                                        kotlin.jvm.internal.i.e(activity42, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
                                        ((TemplateActivity) activity42).onBackPressed();
                                        androidx.fragment.app.p activity43 = this$09.getActivity();
                                        kotlin.jvm.internal.i.e(activity43, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
                                        ((TemplateActivity) activity43).onBackPressed();
                                        androidx.fragment.app.p activity44 = this$09.getActivity();
                                        kotlin.jvm.internal.i.e(activity44, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
                                        ((TemplateActivity) activity44).onBackPressed();
                                        androidx.fragment.app.p activity45 = this$09.getActivity();
                                        kotlin.jvm.internal.i.e(activity45, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
                                        ((TemplateActivity) activity45).onBackPressed();
                                        return;
                                    }
                                    break;
                                case -1448057414:
                                    break;
                                case -781828056:
                                    break;
                                case -725017092:
                                    break;
                                case -590282395:
                                    break;
                                case -361428328:
                                    break;
                                case -285150597:
                                    break;
                                case -214269283:
                                    break;
                                case -109779523:
                                    break;
                                case 834188168:
                                    break;
                                case 857891394:
                                    break;
                                case 1016875456:
                                    break;
                                case 1333371330:
                                    break;
                            }
                        }
                        androidx.fragment.app.p activity46 = this$09.getActivity();
                        kotlin.jvm.internal.i.e(activity46, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
                        ((TemplateActivity) activity46).onBackPressed();
                        androidx.fragment.app.p activity47 = this$09.getActivity();
                        kotlin.jvm.internal.i.e(activity47, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
                        ((TemplateActivity) activity47).onBackPressed();
                        return;
                    }
                    androidx.fragment.app.p activity48 = this$09.getActivity();
                    kotlin.jvm.internal.i.e(activity48, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
                    ((TemplateActivity) activity48).onBackPressed();
                    return;
                }
            case 9:
                n4 this$010 = (n4) obj2;
                TemplateActivity act5 = (TemplateActivity) obj;
                int i20 = n4.A;
                kotlin.jvm.internal.i.g(this$010, "this$0");
                kotlin.jvm.internal.i.g(act5, "$act");
                RelativeLayout relativeLayout = this$010.f18880v;
                if (relativeLayout == null) {
                    Utils utils = Utils.INSTANCE;
                    androidx.fragment.app.p activity49 = this$010.getActivity();
                    String string = this$010.getString(R.string.select_option);
                    kotlin.jvm.internal.i.f(string, "getString(R.string.select_option)");
                    utils.showCustomToast(activity49, string);
                    return;
                }
                HashMap<String, Object> hashMap = act5.F;
                hashMap.put("list", ca.a.k(((RobertoTextView) relativeLayout.findViewById(R.id.tvLabel)).getText()));
                RelativeLayout relativeLayout2 = this$010.f18880v;
                kotlin.jvm.internal.i.d(relativeLayout2);
                hashMap.put("s10b_user_data", ca.a.k(((RobertoTextView) relativeLayout2.findViewById(R.id.tvLabel)).getText()));
                act5.t0();
                return;
            case 10:
                n4 this$011 = (n4) obj2;
                RelativeLayout row = (RelativeLayout) obj;
                int i21 = n4.A;
                kotlin.jvm.internal.i.g(this$011, "this$0");
                kotlin.jvm.internal.i.g(row, "$row");
                try {
                    RelativeLayout relativeLayout3 = this$011.f18880v;
                    if (relativeLayout3 != null) {
                        relativeLayout3.setBackgroundResource(0);
                        RelativeLayout relativeLayout4 = this$011.f18880v;
                        kotlin.jvm.internal.i.d(relativeLayout4);
                        androidx.fragment.app.p activity50 = this$011.getActivity();
                        kotlin.jvm.internal.i.d(activity50);
                        ((RobertoTextView) relativeLayout4.findViewById(R.id.tvLabel)).setTextColor(g0.a.b(activity50, R.color.grey_high_contrast));
                        RelativeLayout relativeLayout5 = this$011.f18880v;
                        kotlin.jvm.internal.i.d(relativeLayout5);
                        androidx.fragment.app.p activity51 = this$011.getActivity();
                        kotlin.jvm.internal.i.d(activity51);
                        ((RobertoTextView) relativeLayout5.findViewById(R.id.tvDescription)).setTextColor(g0.a.b(activity51, R.color.grey_high_contrast));
                    }
                    this$011.f18880v = row;
                    androidx.fragment.app.p activity52 = this$011.getActivity();
                    kotlin.jvm.internal.i.d(activity52);
                    row.setBackgroundColor(g0.a.b(activity52, R.color.selected_row));
                    RelativeLayout relativeLayout6 = this$011.f18880v;
                    kotlin.jvm.internal.i.d(relativeLayout6);
                    androidx.fragment.app.p activity53 = this$011.getActivity();
                    kotlin.jvm.internal.i.d(activity53);
                    ((RobertoTextView) relativeLayout6.findViewById(R.id.tvLabel)).setTextColor(g0.a.b(activity53, R.color.selected_row_text));
                    RelativeLayout relativeLayout7 = this$011.f18880v;
                    kotlin.jvm.internal.i.d(relativeLayout7);
                    androidx.fragment.app.p activity54 = this$011.getActivity();
                    kotlin.jvm.internal.i.d(activity54);
                    ((RobertoTextView) relativeLayout7.findViewById(R.id.tvDescription)).setTextColor(g0.a.b(activity54, R.color.selected_row_text));
                    return;
                } catch (Exception e10) {
                    LogHelper.INSTANCE.e(this$011.f18879u, "exception", e10);
                    return;
                }
            case 11:
                p4 this$012 = (p4) obj2;
                TemplateActivity act6 = (TemplateActivity) obj;
                int i22 = p4.F;
                kotlin.jvm.internal.i.g(this$012, "this$0");
                kotlin.jvm.internal.i.g(act6, "$act");
                androidx.fragment.app.p activity55 = this$012.getActivity();
                kotlin.jvm.internal.i.e(activity55, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
                if (((TemplateActivity) activity55).getIntent().hasExtra("source") && this$012.D == 0) {
                    androidx.fragment.app.p activity56 = this$012.getActivity();
                    kotlin.jvm.internal.i.e(activity56, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
                    ((TemplateActivity) activity56).Q = true;
                    androidx.fragment.app.p activity57 = this$012.getActivity();
                    kotlin.jvm.internal.i.e(activity57, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
                    ((TemplateActivity) activity57).J0();
                    return;
                }
                act6.onBackPressed();
                return;
            case 12:
                p4 this$013 = (p4) obj2;
                RelativeLayout row2 = (RelativeLayout) obj;
                int i23 = p4.F;
                kotlin.jvm.internal.i.g(this$013, "this$0");
                kotlin.jvm.internal.i.g(row2, "$row");
                try {
                    if (this$013.D == 0) {
                        RelativeLayout relativeLayout8 = this$013.f18954v;
                        if (relativeLayout8 != null) {
                            relativeLayout8.setBackgroundResource(0);
                            RelativeLayout relativeLayout9 = this$013.f18954v;
                            kotlin.jvm.internal.i.d(relativeLayout9);
                            androidx.fragment.app.p activity58 = this$013.getActivity();
                            kotlin.jvm.internal.i.d(activity58);
                            ((RobertoTextView) relativeLayout9.findViewById(R.id.tvLabel)).setTextColor(g0.a.b(activity58, R.color.unselected_row_text));
                            RelativeLayout relativeLayout10 = this$013.f18954v;
                            kotlin.jvm.internal.i.d(relativeLayout10);
                            androidx.fragment.app.p activity59 = this$013.getActivity();
                            kotlin.jvm.internal.i.d(activity59);
                            ((RobertoTextView) relativeLayout10.findViewById(R.id.tvDescription)).setTextColor(g0.a.b(activity59, R.color.unselected_row_text));
                        }
                        this$013.f18954v = row2;
                        androidx.fragment.app.p activity60 = this$013.getActivity();
                        kotlin.jvm.internal.i.d(activity60);
                        row2.setBackgroundColor(g0.a.b(activity60, R.color.selected_row));
                        RelativeLayout relativeLayout11 = this$013.f18954v;
                        kotlin.jvm.internal.i.d(relativeLayout11);
                        androidx.fragment.app.p activity61 = this$013.getActivity();
                        kotlin.jvm.internal.i.d(activity61);
                        ((RobertoTextView) relativeLayout11.findViewById(R.id.tvLabel)).setTextColor(g0.a.b(activity61, R.color.selected_row_text));
                        RelativeLayout relativeLayout12 = this$013.f18954v;
                        kotlin.jvm.internal.i.d(relativeLayout12);
                        androidx.fragment.app.p activity62 = this$013.getActivity();
                        kotlin.jvm.internal.i.d(activity62);
                        ((RobertoTextView) relativeLayout12.findViewById(R.id.tvDescription)).setTextColor(g0.a.b(activity62, R.color.selected_row_text));
                        return;
                    }
                    RelativeLayout relativeLayout13 = this$013.f18955w;
                    if (relativeLayout13 != null) {
                        relativeLayout13.setBackgroundResource(0);
                        RelativeLayout relativeLayout14 = this$013.f18955w;
                        kotlin.jvm.internal.i.d(relativeLayout14);
                        androidx.fragment.app.p activity63 = this$013.getActivity();
                        kotlin.jvm.internal.i.d(activity63);
                        ((RobertoTextView) relativeLayout14.findViewById(R.id.tvLabel)).setTextColor(g0.a.b(activity63, R.color.unselected_row_text));
                        RelativeLayout relativeLayout15 = this$013.f18955w;
                        kotlin.jvm.internal.i.d(relativeLayout15);
                        androidx.fragment.app.p activity64 = this$013.getActivity();
                        kotlin.jvm.internal.i.d(activity64);
                        ((RobertoTextView) relativeLayout15.findViewById(R.id.tvDescription)).setTextColor(g0.a.b(activity64, R.color.unselected_row_text));
                    }
                    this$013.f18955w = row2;
                    androidx.fragment.app.p activity65 = this$013.getActivity();
                    kotlin.jvm.internal.i.d(activity65);
                    row2.setBackgroundColor(g0.a.b(activity65, R.color.selected_row));
                    RelativeLayout relativeLayout16 = this$013.f18955w;
                    kotlin.jvm.internal.i.d(relativeLayout16);
                    androidx.fragment.app.p activity66 = this$013.getActivity();
                    kotlin.jvm.internal.i.d(activity66);
                    ((RobertoTextView) relativeLayout16.findViewById(R.id.tvLabel)).setTextColor(g0.a.b(activity66, R.color.selected_row_text));
                    RelativeLayout relativeLayout17 = this$013.f18955w;
                    kotlin.jvm.internal.i.d(relativeLayout17);
                    androidx.fragment.app.p activity67 = this$013.getActivity();
                    kotlin.jvm.internal.i.d(activity67);
                    ((RobertoTextView) relativeLayout17.findViewById(R.id.tvDescription)).setTextColor(g0.a.b(activity67, R.color.selected_row_text));
                    return;
                } catch (Exception e11) {
                    LogHelper.INSTANCE.e(this$013.f18953u, "exception", e11);
                    return;
                }
            case 13:
                r4 this$014 = (r4) obj2;
                TemplateActivity act7 = (TemplateActivity) obj;
                int i24 = r4.f19081w;
                kotlin.jvm.internal.i.g(this$014, "this$0");
                kotlin.jvm.internal.i.g(act7, "$act");
                androidx.fragment.app.p activity68 = this$014.getActivity();
                kotlin.jvm.internal.i.e(activity68, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
                if (((TemplateActivity) activity68).getIntent().hasExtra("source")) {
                    androidx.fragment.app.p activity69 = this$014.getActivity();
                    kotlin.jvm.internal.i.e(activity69, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
                    if (b0.c((TemplateActivity) activity69, "source", "goals")) {
                        androidx.fragment.app.p activity70 = this$014.getActivity();
                        kotlin.jvm.internal.i.e(activity70, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
                        Goal y07 = ((TemplateActivity) activity70).y0();
                        kotlin.jvm.internal.i.d(y07);
                        if (!kotlin.jvm.internal.i.b(y07.getGoalId(), "trlaIGthnGTmcverPNnj")) {
                            androidx.fragment.app.p activity71 = this$014.getActivity();
                            kotlin.jvm.internal.i.e(activity71, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
                            ((TemplateActivity) activity71).Q = true;
                            androidx.fragment.app.p activity72 = this$014.getActivity();
                            kotlin.jvm.internal.i.e(activity72, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
                            ((TemplateActivity) activity72).J0();
                            return;
                        }
                    }
                }
                act7.onBackPressed();
                return;
            case 14:
                String slug = (String) obj2;
                x4 this$015 = (x4) obj;
                int i25 = x4.f19385w;
                kotlin.jvm.internal.i.g(slug, "$slug");
                kotlin.jvm.internal.i.g(this$015, "this$0");
                int hashCode = slug.hashCode();
                if (hashCode == 3474628 ? !slug.equals("s117") : !(hashCode == 3474654 ? slug.equals("s122") : !(hashCode != 3474656 || !slug.equals("s124")))) {
                    androidx.fragment.app.p activity73 = this$015.getActivity();
                    kotlin.jvm.internal.i.e(activity73, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
                    ((TemplateActivity) activity73).t0();
                    return;
                }
                androidx.fragment.app.p activity74 = this$015.getActivity();
                kotlin.jvm.internal.i.e(activity74, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
                TemplateActivity templateActivity4 = (TemplateActivity) activity74;
                androidx.fragment.app.p activity75 = this$015.getActivity();
                kotlin.jvm.internal.i.e(activity75, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
                if (((TemplateActivity) activity75).W) {
                    j2Var = new l2();
                } else {
                    j2Var = new j2();
                }
                templateActivity4.s0(j2Var);
                return;
            case 15:
                c5 this$016 = (c5) obj2;
                TemplateActivity act8 = (TemplateActivity) obj;
                int i26 = c5.C;
                kotlin.jvm.internal.i.g(this$016, "this$0");
                kotlin.jvm.internal.i.g(act8, "$act");
                ScreenResult28Model screenResult28Model = this$016.f18237y;
                screenResult28Model.getAnswers().add("No");
                ArrayList<String> arrayList = this$016.f18234v;
                arrayList.add("No");
                androidx.fragment.app.p activity76 = this$016.getActivity();
                kotlin.jvm.internal.i.e(activity76, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
                HashMap<String, Object> hashMap2 = ((TemplateActivity) activity76).F;
                hashMap2.put("list", arrayList);
                hashMap2.put("3u_model", screenResult28Model);
                androidx.fragment.app.p activity77 = this$016.getActivity();
                kotlin.jvm.internal.i.e(activity77, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
                TemplateActivity templateActivity5 = (TemplateActivity) activity77;
                if (templateActivity5.W) {
                    TemplateModel templateModel = templateActivity5.f10547y;
                    if (templateModel != null && (label = templateModel.getLabel()) != null) {
                        fm.a K = this$016.K();
                        K.f15178l0.e(this$016.getViewLifecycleOwner(), new r3(12, new b5(templateActivity5, this$016, label)));
                        K.l(label);
                    }
                } else {
                    androidx.fragment.app.p activity78 = this$016.getActivity();
                    kotlin.jvm.internal.i.e(activity78, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
                    Goal y08 = ((TemplateActivity) activity78).y0();
                    if (y08 != null) {
                        boolean z10 = templateActivity5.K;
                        String str6 = this$016.f18238z;
                        if (z10) {
                            if (y08.getData().containsKey(str6)) {
                                Object obj3 = y08.getData().get(str6);
                                kotlin.jvm.internal.i.e(obj3, "null cannot be cast to non-null type java.util.ArrayList<com.theinnerhour.b2b.model.ScreenResult28Model>");
                                ArrayList arrayList2 = (ArrayList) obj3;
                                arrayList2.remove(arrayList2.size() - 1);
                                arrayList2.add(screenResult28Model);
                                y08.getData().put(str6, arrayList2);
                            } else {
                                y08.getData().put(str6, new ArrayList());
                                Object obj4 = y08.getData().get(str6);
                                kotlin.jvm.internal.i.e(obj4, "null cannot be cast to non-null type java.util.ArrayList<com.theinnerhour.b2b.model.ScreenResult28Model>");
                                ((ArrayList) obj4).add(screenResult28Model);
                            }
                        } else {
                            templateActivity5.K = true;
                            if (!y08.getData().containsKey(str6)) {
                                y08.getData().put(str6, new ArrayList());
                            }
                            Object obj5 = y08.getData().get(str6);
                            kotlin.jvm.internal.i.e(obj5, "null cannot be cast to non-null type java.util.ArrayList<com.theinnerhour.b2b.model.ScreenResult28Model>");
                            ((ArrayList) obj5).add(screenResult28Model);
                        }
                        FirebasePersistence.getInstance().updateUserOnFirebase();
                    }
                }
                act8.F.put("prefix", String.valueOf(this$016.f18236x));
                if (!act8.W) {
                    act8.s0(new w5());
                    return;
                }
                return;
            case 16:
                TemplateActivity act9 = (TemplateActivity) obj2;
                f5 this$017 = (f5) obj;
                int i27 = f5.E;
                kotlin.jvm.internal.i.g(act9, "$act");
                kotlin.jvm.internal.i.g(this$017, "this$0");
                if (act9.getIntent().hasExtra("source") && b0.c(act9, "source", "goals")) {
                    String[] strArr2 = {"ECJLIrYORnJIkN64wcxd", "ka8u4KaGKYZ7iTCNduBt"};
                    Goal y09 = act9.y0();
                    if (y09 != null) {
                        str4 = y09.getGoalId();
                    } else {
                        str4 = null;
                    }
                    if (is.k.Q1(str4, strArr2)) {
                        act9.J0();
                        return;
                    } else {
                        act9.n0();
                        return;
                    }
                }
                androidx.fragment.app.p activity79 = this$017.getActivity();
                kotlin.jvm.internal.i.e(activity79, "null cannot be cast to non-null type com.theinnerhour.b2b.widgets.CustomActivity");
                ((rr.a) activity79).t0();
                return;
            case 17:
                i5 this$018 = (i5) obj2;
                String text = (String) obj;
                int i28 = i5.A;
                kotlin.jvm.internal.i.g(this$018, "this$0");
                kotlin.jvm.internal.i.g(text, "$text");
                if (this$018.f18579x.contains(text)) {
                    View childAt = ((LinearLayout) this$018._$_findCachedViewById(R.id.llS12List)).getChildAt(this$018.f18580y.indexOf(text));
                    androidx.fragment.app.p activity80 = this$018.getActivity();
                    kotlin.jvm.internal.i.d(activity80);
                    Object obj6 = g0.a.f16164a;
                    ((RobertoTextView) defpackage.e.g(activity80, R.drawable.ic_check_box_outline_blank_gray_24dp, (ImageView) childAt.findViewById(R.id.chkBxSelected), childAt, R.id.tvLabel)).setFont("Lato-Medium.ttf");
                    androidx.fragment.app.p activity81 = this$018.getActivity();
                    kotlin.jvm.internal.i.d(activity81);
                    ((RobertoTextView) childAt.findViewById(R.id.tvLabel)).setTextColor(g0.a.b(activity81, R.color.grey_high_contrast));
                    this$018.f18579x.remove(text);
                    return;
                } else if (!this$018.O(true)) {
                    this$018.f18579x.add(text);
                    View childAt2 = ((LinearLayout) this$018._$_findCachedViewById(R.id.llS12List)).getChildAt(this$018.f18580y.indexOf(text));
                    androidx.fragment.app.p activity82 = this$018.getActivity();
                    kotlin.jvm.internal.i.d(activity82);
                    Object obj7 = g0.a.f16164a;
                    ((RobertoTextView) defpackage.e.g(activity82, R.drawable.ic_check_box_orange_24dp, (ImageView) childAt2.findViewById(R.id.chkBxSelected), childAt2, R.id.tvLabel)).setFont("Lato-Bold.ttf");
                    androidx.fragment.app.p activity83 = this$018.getActivity();
                    kotlin.jvm.internal.i.d(activity83);
                    ((RobertoTextView) childAt2.findViewById(R.id.tvLabel)).setTextColor(g0.a.b(activity83, R.color.title_high_contrast));
                    return;
                } else {
                    return;
                }
            case 18:
                String slug2 = (String) obj2;
                TemplateActivity act10 = (TemplateActivity) obj;
                int i29 = q5.f19017w;
                kotlin.jvm.internal.i.g(slug2, "$slug");
                kotlin.jvm.internal.i.g(act10, "$act");
                if (kotlin.jvm.internal.i.b(slug2, "s143-c")) {
                    act10.onBackPressed();
                    act10.onBackPressed();
                    return;
                }
                act10.onBackPressed();
                return;
            case 19:
                e6 this$019 = (e6) obj2;
                HashMap params = (HashMap) obj;
                int i30 = e6.f18340x;
                kotlin.jvm.internal.i.g(this$019, "this$0");
                kotlin.jvm.internal.i.g(params, "$params");
                int i31 = this$019.f18342v;
                if (i31 != 0) {
                    if (i31 != 1) {
                        if (params.containsKey("s16_error")) {
                            Utils.INSTANCE.showCustomToast(this$019.requireActivity(), UtilFunKt.paramsMapToString(params.get("s16_error")));
                            return;
                        }
                        Utils utils2 = Utils.INSTANCE;
                        androidx.fragment.app.p requireActivity = this$019.requireActivity();
                        String string2 = this$019.getString(R.string.select_an_option);
                        kotlin.jvm.internal.i.f(string2, "getString(R.string.select_an_option)");
                        utils2.showCustomToast(requireActivity, string2);
                        return;
                    }
                    androidx.fragment.app.p activity84 = this$019.getActivity();
                    kotlin.jvm.internal.i.e(activity84, "null cannot be cast to non-null type com.theinnerhour.b2b.widgets.CustomActivity");
                    ((rr.a) activity84).s0(new g6());
                    return;
                }
                androidx.fragment.app.p activity85 = this$019.getActivity();
                kotlin.jvm.internal.i.e(activity85, "null cannot be cast to non-null type com.theinnerhour.b2b.widgets.CustomActivity");
                ((rr.a) activity85).s0(new l7());
                return;
            case 20:
                a();
                return;
            case 21:
                b();
                return;
            case 22:
                c();
                return;
            case 23:
                c7 this$020 = (c7) obj2;
                String tt2 = (String) obj;
                int i32 = c7.D;
                kotlin.jvm.internal.i.g(this$020, "this$0");
                kotlin.jvm.internal.i.g(tt2, "$tt");
                try {
                    this$020.U(tt2);
                    this$020.Q();
                    return;
                } catch (Exception e12) {
                    LogHelper.INSTANCE.e(this$020.f18254u, "Exception", e12);
                    return;
                }
            case 24:
                d();
                return;
            case 25:
                e();
                return;
            case 26:
                f();
                return;
            case 27:
                g();
                return;
            case 28:
                h();
                return;
            default:
                i();
                return;
        }
    }

    public /* synthetic */ p(Object obj, int i6, Object obj2) {
        this.f31905u = i6;
        this.f31906v = obj;
        this.f31907w = obj2;
    }
}
