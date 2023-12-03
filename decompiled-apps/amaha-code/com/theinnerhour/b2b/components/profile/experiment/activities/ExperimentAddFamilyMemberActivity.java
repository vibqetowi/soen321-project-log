package com.theinnerhour.b2b.components.profile.experiment.activities;

import android.app.ProgressDialog;
import android.os.Build;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.view.Window;
import android.view.inputmethod.InputMethodManager;
import android.widget.Toast;
import androidx.appcompat.app.c;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.o0;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.textfield.TextInputLayout;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.components.profile.experiment.activities.ExperimentAddFamilyMemberActivity;
import com.theinnerhour.b2b.model.AddFamilyMember;
import com.theinnerhour.b2b.persistence.FirebasePersistence;
import com.theinnerhour.b2b.utils.ConnectionStatusReceiver;
import com.theinnerhour.b2b.utils.Constants;
import com.theinnerhour.b2b.utils.Utils;
import com.theinnerhour.b2b.widgets.RobertoButton;
import com.theinnerhour.b2b.widgets.RobertoEditText;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import gk.a;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import kc.f;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
import so.b;
import so.d;
import so.e;
import ta.v;
import to.c;
import wo.h;
/* compiled from: ExperimentAddFamilyMemberActivity.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/theinnerhour/b2b/components/profile/experiment/activities/ExperimentAddFamilyMemberActivity;", "Landroidx/appcompat/app/c;", "Lto/c$b;", "<init>", "()V", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class ExperimentAddFamilyMemberActivity extends c implements c.b {
    public static final /* synthetic */ int C = 0;

    /* renamed from: w  reason: collision with root package name */
    public h f11562w;

    /* renamed from: x  reason: collision with root package name */
    public ProgressDialog f11563x;

    /* renamed from: z  reason: collision with root package name */
    public BottomSheetBehavior<ConstraintLayout> f11565z;
    public final LinkedHashMap B = new LinkedHashMap();

    /* renamed from: v  reason: collision with root package name */
    public String f11561v = "";

    /* renamed from: y  reason: collision with root package name */
    public ArrayList<AddFamilyMember> f11564y = new ArrayList<>();
    public final Bundle A = new Bundle();

    @Override // to.c.b
    public final void A(int i6) {
        h hVar = this.f11562w;
        if (hVar != null) {
            AddFamilyMember addFamilyMember = this.f11564y.get(i6);
            i.f(addFamilyMember, "familyMembersList[position]");
            v.H(f.H(hVar), null, 0, new wo.i(hVar, addFamilyMember, null), 3);
            return;
        }
        i.q("experimentAddFamilyViewModel");
        throw null;
    }

    public final View n0(int i6) {
        LinkedHashMap linkedHashMap = this.B;
        View view = (View) linkedHashMap.get(Integer.valueOf(i6));
        if (view == null) {
            View findViewById = findViewById(i6);
            if (findViewById != null) {
                linkedHashMap.put(Integer.valueOf(i6), findViewById);
                return findViewById;
            }
            return null;
        }
        return view;
    }

    @Override // androidx.fragment.app.p, androidx.activity.ComponentActivity, f0.k, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_experiment_add_family_member);
        Bundle bundle2 = this.A;
        bundle2.putString("variant", "new");
        bundle2.putString("version", FirebasePersistence.getInstance().getUser().getVersion());
        a.b(bundle2, "add_family_open");
        Window window = getWindow();
        if (Build.VERSION.SDK_INT >= 23) {
            window.getDecorView().setSystemUiVisibility(8192);
        }
        window.setStatusBarColor(-1);
        ProgressDialog progressDialog = new ProgressDialog(this);
        this.f11563x = progressDialog;
        progressDialog.setMessage("Loading...");
        ProgressDialog progressDialog2 = this.f11563x;
        if (progressDialog2 != null) {
            progressDialog2.setCancelable(false);
            BottomSheetBehavior<ConstraintLayout> from = BottomSheetBehavior.from((ConstraintLayout) n0(R.id.clAddFamilyBottomSheet));
            i.f(from, "from(clAddFamilyBottomSheet)");
            this.f11565z = from;
            from.addBottomSheetCallback(new b(this));
            ((RobertoButton) n0(R.id.btnAddFamily)).setOnClickListener(new View.OnClickListener(this) { // from class: so.a

                /* renamed from: v  reason: collision with root package name */
                public final /* synthetic */ ExperimentAddFamilyMemberActivity f31789v;

                {
                    this.f31789v = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    String name;
                    boolean z10;
                    boolean z11;
                    int i6 = r2;
                    ExperimentAddFamilyMemberActivity this$0 = this.f31789v;
                    switch (i6) {
                        case 0:
                            int i10 = ExperimentAddFamilyMemberActivity.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            Editable text = ((RobertoEditText) this$0.n0(R.id.etAddFamilyEmail)).getText();
                            if (text != null) {
                                name = text.toString();
                            } else {
                                name = null;
                            }
                            if (ConnectionStatusReceiver.isConnected()) {
                                if (name != null && name.length() != 0) {
                                    z10 = false;
                                } else {
                                    z10 = true;
                                }
                                if (!z10 && Utils.INSTANCE.isValidEmail(name)) {
                                    if (this$0.f11561v.length() > 0) {
                                        z11 = true;
                                    } else {
                                        z11 = false;
                                    }
                                    if (z11) {
                                        String str = this$0.f11561v;
                                        Bundle bundle3 = this$0.A;
                                        bundle3.putString(Constants.THOUGHTS_RELATIONSHIP, str);
                                        gk.a.b(bundle3, "add_family_cta_click");
                                        wo.h hVar = this$0.f11562w;
                                        if (hVar != null) {
                                            String relation = this$0.f11561v;
                                            kotlin.jvm.internal.i.g(name, "name");
                                            kotlin.jvm.internal.i.g(relation, "relation");
                                            ta.v.H(kc.f.H(hVar), null, 0, new wo.j(hVar, name, relation, null), 3);
                                            ((RobertoTextView) this$0.n0(R.id.tvAddFamilyWarningMessage)).setVisibility(8);
                                            return;
                                        }
                                        kotlin.jvm.internal.i.q("experimentAddFamilyViewModel");
                                        throw null;
                                    }
                                }
                                Toast.makeText(this$0, "Please fill all the details", 1).show();
                                return;
                            }
                            Toast.makeText(this$0, "Connect to Internet", 0).show();
                            return;
                        case 1:
                            int i11 = ExperimentAddFamilyMemberActivity.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            BottomSheetBehavior<ConstraintLayout> bottomSheetBehavior = this$0.f11565z;
                            if (bottomSheetBehavior != null) {
                                bottomSheetBehavior.setState(4);
                                this$0.f11561v = ((RobertoTextView) this$0.n0(R.id.tvAddFamilyRelationship6)).getText().toString();
                                ((RobertoEditText) this$0.n0(R.id.etAddFamilyRelationship)).setText(((RobertoTextView) this$0.n0(R.id.tvAddFamilyRelationship6)).getText().toString());
                                ((RobertoTextView) this$0.n0(R.id.tvAddFamilyWarningMessage)).setVisibility(8);
                                return;
                            }
                            kotlin.jvm.internal.i.q("bottomSheetBehavior");
                            throw null;
                        case 2:
                            int i12 = ExperimentAddFamilyMemberActivity.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            BottomSheetBehavior<ConstraintLayout> bottomSheetBehavior2 = this$0.f11565z;
                            if (bottomSheetBehavior2 != null) {
                                bottomSheetBehavior2.setState(4);
                                this$0.f11561v = ((RobertoTextView) this$0.n0(R.id.tvAddFamilyRelationship7)).getText().toString();
                                ((RobertoEditText) this$0.n0(R.id.etAddFamilyRelationship)).setText(((RobertoTextView) this$0.n0(R.id.tvAddFamilyRelationship7)).getText().toString());
                                ((RobertoTextView) this$0.n0(R.id.tvAddFamilyWarningMessage)).setVisibility(8);
                                return;
                            }
                            kotlin.jvm.internal.i.q("bottomSheetBehavior");
                            throw null;
                        case 3:
                            int i13 = ExperimentAddFamilyMemberActivity.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.finish();
                            return;
                        case 4:
                            int i14 = ExperimentAddFamilyMemberActivity.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            BottomSheetBehavior<ConstraintLayout> bottomSheetBehavior3 = this$0.f11565z;
                            if (bottomSheetBehavior3 != null) {
                                bottomSheetBehavior3.setState(4);
                                return;
                            } else {
                                kotlin.jvm.internal.i.q("bottomSheetBehavior");
                                throw null;
                            }
                        case 5:
                            int i15 = ExperimentAddFamilyMemberActivity.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            BottomSheetBehavior<ConstraintLayout> bottomSheetBehavior4 = this$0.f11565z;
                            if (bottomSheetBehavior4 != null) {
                                bottomSheetBehavior4.setState(3);
                                Object systemService = this$0.getSystemService("input_method");
                                kotlin.jvm.internal.i.e(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
                                ((InputMethodManager) systemService).hideSoftInputFromWindow(((RobertoEditText) this$0.n0(R.id.etAddFamilyEmail)).getWindowToken(), 0);
                                return;
                            }
                            kotlin.jvm.internal.i.q("bottomSheetBehavior");
                            throw null;
                        case 6:
                            int i16 = ExperimentAddFamilyMemberActivity.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            BottomSheetBehavior<ConstraintLayout> bottomSheetBehavior5 = this$0.f11565z;
                            if (bottomSheetBehavior5 != null) {
                                bottomSheetBehavior5.setState(3);
                                Object systemService2 = this$0.getSystemService("input_method");
                                kotlin.jvm.internal.i.e(systemService2, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
                                ((InputMethodManager) systemService2).hideSoftInputFromWindow(((RobertoEditText) this$0.n0(R.id.etAddFamilyEmail)).getWindowToken(), 0);
                                return;
                            }
                            kotlin.jvm.internal.i.q("bottomSheetBehavior");
                            throw null;
                        case 7:
                            int i17 = ExperimentAddFamilyMemberActivity.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            BottomSheetBehavior<ConstraintLayout> bottomSheetBehavior6 = this$0.f11565z;
                            if (bottomSheetBehavior6 != null) {
                                bottomSheetBehavior6.setState(4);
                                this$0.f11561v = ((RobertoTextView) this$0.n0(R.id.tvAddFamilyRelationship1)).getText().toString();
                                ((RobertoEditText) this$0.n0(R.id.etAddFamilyRelationship)).setText(((RobertoTextView) this$0.n0(R.id.tvAddFamilyRelationship1)).getText().toString());
                                ((RobertoTextView) this$0.n0(R.id.tvAddFamilyWarningMessage)).setVisibility(8);
                                return;
                            }
                            kotlin.jvm.internal.i.q("bottomSheetBehavior");
                            throw null;
                        case 8:
                            int i18 = ExperimentAddFamilyMemberActivity.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            BottomSheetBehavior<ConstraintLayout> bottomSheetBehavior7 = this$0.f11565z;
                            if (bottomSheetBehavior7 != null) {
                                bottomSheetBehavior7.setState(4);
                                this$0.f11561v = ((RobertoTextView) this$0.n0(R.id.tvAddFamilyRelationship2)).getText().toString();
                                ((RobertoEditText) this$0.n0(R.id.etAddFamilyRelationship)).setText(((RobertoTextView) this$0.n0(R.id.tvAddFamilyRelationship2)).getText().toString());
                                ((RobertoTextView) this$0.n0(R.id.tvAddFamilyWarningMessage)).setVisibility(8);
                                return;
                            }
                            kotlin.jvm.internal.i.q("bottomSheetBehavior");
                            throw null;
                        case 9:
                            int i19 = ExperimentAddFamilyMemberActivity.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            BottomSheetBehavior<ConstraintLayout> bottomSheetBehavior8 = this$0.f11565z;
                            if (bottomSheetBehavior8 != null) {
                                bottomSheetBehavior8.setState(4);
                                this$0.f11561v = ((RobertoTextView) this$0.n0(R.id.tvAddFamilyRelationship3)).getText().toString();
                                ((RobertoEditText) this$0.n0(R.id.etAddFamilyRelationship)).setText(((RobertoTextView) this$0.n0(R.id.tvAddFamilyRelationship3)).getText().toString());
                                ((RobertoTextView) this$0.n0(R.id.tvAddFamilyWarningMessage)).setVisibility(0);
                                return;
                            }
                            kotlin.jvm.internal.i.q("bottomSheetBehavior");
                            throw null;
                        case 10:
                            int i20 = ExperimentAddFamilyMemberActivity.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            BottomSheetBehavior<ConstraintLayout> bottomSheetBehavior9 = this$0.f11565z;
                            if (bottomSheetBehavior9 != null) {
                                bottomSheetBehavior9.setState(4);
                                this$0.f11561v = ((RobertoTextView) this$0.n0(R.id.tvAddFamilyRelationship4)).getText().toString();
                                ((RobertoEditText) this$0.n0(R.id.etAddFamilyRelationship)).setText(((RobertoTextView) this$0.n0(R.id.tvAddFamilyRelationship4)).getText().toString());
                                ((RobertoTextView) this$0.n0(R.id.tvAddFamilyWarningMessage)).setVisibility(0);
                                return;
                            }
                            kotlin.jvm.internal.i.q("bottomSheetBehavior");
                            throw null;
                        default:
                            int i21 = ExperimentAddFamilyMemberActivity.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            BottomSheetBehavior<ConstraintLayout> bottomSheetBehavior10 = this$0.f11565z;
                            if (bottomSheetBehavior10 != null) {
                                bottomSheetBehavior10.setState(4);
                                this$0.f11561v = ((RobertoTextView) this$0.n0(R.id.tvAddFamilyRelationship5)).getText().toString();
                                ((RobertoEditText) this$0.n0(R.id.etAddFamilyRelationship)).setText(((RobertoTextView) this$0.n0(R.id.tvAddFamilyRelationship5)).getText().toString());
                                ((RobertoTextView) this$0.n0(R.id.tvAddFamilyWarningMessage)).setVisibility(8);
                                return;
                            }
                            kotlin.jvm.internal.i.q("bottomSheetBehavior");
                            throw null;
                    }
                }
            });
            ((AppCompatImageView) n0(R.id.ivAddFamilyBack)).setOnClickListener(new View.OnClickListener(this) { // from class: so.a

                /* renamed from: v  reason: collision with root package name */
                public final /* synthetic */ ExperimentAddFamilyMemberActivity f31789v;

                {
                    this.f31789v = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    String name;
                    boolean z10;
                    boolean z11;
                    int i6 = r2;
                    ExperimentAddFamilyMemberActivity this$0 = this.f31789v;
                    switch (i6) {
                        case 0:
                            int i10 = ExperimentAddFamilyMemberActivity.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            Editable text = ((RobertoEditText) this$0.n0(R.id.etAddFamilyEmail)).getText();
                            if (text != null) {
                                name = text.toString();
                            } else {
                                name = null;
                            }
                            if (ConnectionStatusReceiver.isConnected()) {
                                if (name != null && name.length() != 0) {
                                    z10 = false;
                                } else {
                                    z10 = true;
                                }
                                if (!z10 && Utils.INSTANCE.isValidEmail(name)) {
                                    if (this$0.f11561v.length() > 0) {
                                        z11 = true;
                                    } else {
                                        z11 = false;
                                    }
                                    if (z11) {
                                        String str = this$0.f11561v;
                                        Bundle bundle3 = this$0.A;
                                        bundle3.putString(Constants.THOUGHTS_RELATIONSHIP, str);
                                        gk.a.b(bundle3, "add_family_cta_click");
                                        wo.h hVar = this$0.f11562w;
                                        if (hVar != null) {
                                            String relation = this$0.f11561v;
                                            kotlin.jvm.internal.i.g(name, "name");
                                            kotlin.jvm.internal.i.g(relation, "relation");
                                            ta.v.H(kc.f.H(hVar), null, 0, new wo.j(hVar, name, relation, null), 3);
                                            ((RobertoTextView) this$0.n0(R.id.tvAddFamilyWarningMessage)).setVisibility(8);
                                            return;
                                        }
                                        kotlin.jvm.internal.i.q("experimentAddFamilyViewModel");
                                        throw null;
                                    }
                                }
                                Toast.makeText(this$0, "Please fill all the details", 1).show();
                                return;
                            }
                            Toast.makeText(this$0, "Connect to Internet", 0).show();
                            return;
                        case 1:
                            int i11 = ExperimentAddFamilyMemberActivity.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            BottomSheetBehavior<ConstraintLayout> bottomSheetBehavior = this$0.f11565z;
                            if (bottomSheetBehavior != null) {
                                bottomSheetBehavior.setState(4);
                                this$0.f11561v = ((RobertoTextView) this$0.n0(R.id.tvAddFamilyRelationship6)).getText().toString();
                                ((RobertoEditText) this$0.n0(R.id.etAddFamilyRelationship)).setText(((RobertoTextView) this$0.n0(R.id.tvAddFamilyRelationship6)).getText().toString());
                                ((RobertoTextView) this$0.n0(R.id.tvAddFamilyWarningMessage)).setVisibility(8);
                                return;
                            }
                            kotlin.jvm.internal.i.q("bottomSheetBehavior");
                            throw null;
                        case 2:
                            int i12 = ExperimentAddFamilyMemberActivity.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            BottomSheetBehavior<ConstraintLayout> bottomSheetBehavior2 = this$0.f11565z;
                            if (bottomSheetBehavior2 != null) {
                                bottomSheetBehavior2.setState(4);
                                this$0.f11561v = ((RobertoTextView) this$0.n0(R.id.tvAddFamilyRelationship7)).getText().toString();
                                ((RobertoEditText) this$0.n0(R.id.etAddFamilyRelationship)).setText(((RobertoTextView) this$0.n0(R.id.tvAddFamilyRelationship7)).getText().toString());
                                ((RobertoTextView) this$0.n0(R.id.tvAddFamilyWarningMessage)).setVisibility(8);
                                return;
                            }
                            kotlin.jvm.internal.i.q("bottomSheetBehavior");
                            throw null;
                        case 3:
                            int i13 = ExperimentAddFamilyMemberActivity.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.finish();
                            return;
                        case 4:
                            int i14 = ExperimentAddFamilyMemberActivity.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            BottomSheetBehavior<ConstraintLayout> bottomSheetBehavior3 = this$0.f11565z;
                            if (bottomSheetBehavior3 != null) {
                                bottomSheetBehavior3.setState(4);
                                return;
                            } else {
                                kotlin.jvm.internal.i.q("bottomSheetBehavior");
                                throw null;
                            }
                        case 5:
                            int i15 = ExperimentAddFamilyMemberActivity.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            BottomSheetBehavior<ConstraintLayout> bottomSheetBehavior4 = this$0.f11565z;
                            if (bottomSheetBehavior4 != null) {
                                bottomSheetBehavior4.setState(3);
                                Object systemService = this$0.getSystemService("input_method");
                                kotlin.jvm.internal.i.e(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
                                ((InputMethodManager) systemService).hideSoftInputFromWindow(((RobertoEditText) this$0.n0(R.id.etAddFamilyEmail)).getWindowToken(), 0);
                                return;
                            }
                            kotlin.jvm.internal.i.q("bottomSheetBehavior");
                            throw null;
                        case 6:
                            int i16 = ExperimentAddFamilyMemberActivity.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            BottomSheetBehavior<ConstraintLayout> bottomSheetBehavior5 = this$0.f11565z;
                            if (bottomSheetBehavior5 != null) {
                                bottomSheetBehavior5.setState(3);
                                Object systemService2 = this$0.getSystemService("input_method");
                                kotlin.jvm.internal.i.e(systemService2, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
                                ((InputMethodManager) systemService2).hideSoftInputFromWindow(((RobertoEditText) this$0.n0(R.id.etAddFamilyEmail)).getWindowToken(), 0);
                                return;
                            }
                            kotlin.jvm.internal.i.q("bottomSheetBehavior");
                            throw null;
                        case 7:
                            int i17 = ExperimentAddFamilyMemberActivity.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            BottomSheetBehavior<ConstraintLayout> bottomSheetBehavior6 = this$0.f11565z;
                            if (bottomSheetBehavior6 != null) {
                                bottomSheetBehavior6.setState(4);
                                this$0.f11561v = ((RobertoTextView) this$0.n0(R.id.tvAddFamilyRelationship1)).getText().toString();
                                ((RobertoEditText) this$0.n0(R.id.etAddFamilyRelationship)).setText(((RobertoTextView) this$0.n0(R.id.tvAddFamilyRelationship1)).getText().toString());
                                ((RobertoTextView) this$0.n0(R.id.tvAddFamilyWarningMessage)).setVisibility(8);
                                return;
                            }
                            kotlin.jvm.internal.i.q("bottomSheetBehavior");
                            throw null;
                        case 8:
                            int i18 = ExperimentAddFamilyMemberActivity.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            BottomSheetBehavior<ConstraintLayout> bottomSheetBehavior7 = this$0.f11565z;
                            if (bottomSheetBehavior7 != null) {
                                bottomSheetBehavior7.setState(4);
                                this$0.f11561v = ((RobertoTextView) this$0.n0(R.id.tvAddFamilyRelationship2)).getText().toString();
                                ((RobertoEditText) this$0.n0(R.id.etAddFamilyRelationship)).setText(((RobertoTextView) this$0.n0(R.id.tvAddFamilyRelationship2)).getText().toString());
                                ((RobertoTextView) this$0.n0(R.id.tvAddFamilyWarningMessage)).setVisibility(8);
                                return;
                            }
                            kotlin.jvm.internal.i.q("bottomSheetBehavior");
                            throw null;
                        case 9:
                            int i19 = ExperimentAddFamilyMemberActivity.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            BottomSheetBehavior<ConstraintLayout> bottomSheetBehavior8 = this$0.f11565z;
                            if (bottomSheetBehavior8 != null) {
                                bottomSheetBehavior8.setState(4);
                                this$0.f11561v = ((RobertoTextView) this$0.n0(R.id.tvAddFamilyRelationship3)).getText().toString();
                                ((RobertoEditText) this$0.n0(R.id.etAddFamilyRelationship)).setText(((RobertoTextView) this$0.n0(R.id.tvAddFamilyRelationship3)).getText().toString());
                                ((RobertoTextView) this$0.n0(R.id.tvAddFamilyWarningMessage)).setVisibility(0);
                                return;
                            }
                            kotlin.jvm.internal.i.q("bottomSheetBehavior");
                            throw null;
                        case 10:
                            int i20 = ExperimentAddFamilyMemberActivity.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            BottomSheetBehavior<ConstraintLayout> bottomSheetBehavior9 = this$0.f11565z;
                            if (bottomSheetBehavior9 != null) {
                                bottomSheetBehavior9.setState(4);
                                this$0.f11561v = ((RobertoTextView) this$0.n0(R.id.tvAddFamilyRelationship4)).getText().toString();
                                ((RobertoEditText) this$0.n0(R.id.etAddFamilyRelationship)).setText(((RobertoTextView) this$0.n0(R.id.tvAddFamilyRelationship4)).getText().toString());
                                ((RobertoTextView) this$0.n0(R.id.tvAddFamilyWarningMessage)).setVisibility(0);
                                return;
                            }
                            kotlin.jvm.internal.i.q("bottomSheetBehavior");
                            throw null;
                        default:
                            int i21 = ExperimentAddFamilyMemberActivity.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            BottomSheetBehavior<ConstraintLayout> bottomSheetBehavior10 = this$0.f11565z;
                            if (bottomSheetBehavior10 != null) {
                                bottomSheetBehavior10.setState(4);
                                this$0.f11561v = ((RobertoTextView) this$0.n0(R.id.tvAddFamilyRelationship5)).getText().toString();
                                ((RobertoEditText) this$0.n0(R.id.etAddFamilyRelationship)).setText(((RobertoTextView) this$0.n0(R.id.tvAddFamilyRelationship5)).getText().toString());
                                ((RobertoTextView) this$0.n0(R.id.tvAddFamilyWarningMessage)).setVisibility(8);
                                return;
                            }
                            kotlin.jvm.internal.i.q("bottomSheetBehavior");
                            throw null;
                    }
                }
            });
            n0(R.id.viewBottomSheetTint).setOnClickListener(new View.OnClickListener(this) { // from class: so.a

                /* renamed from: v  reason: collision with root package name */
                public final /* synthetic */ ExperimentAddFamilyMemberActivity f31789v;

                {
                    this.f31789v = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    String name;
                    boolean z10;
                    boolean z11;
                    int i6 = r2;
                    ExperimentAddFamilyMemberActivity this$0 = this.f31789v;
                    switch (i6) {
                        case 0:
                            int i10 = ExperimentAddFamilyMemberActivity.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            Editable text = ((RobertoEditText) this$0.n0(R.id.etAddFamilyEmail)).getText();
                            if (text != null) {
                                name = text.toString();
                            } else {
                                name = null;
                            }
                            if (ConnectionStatusReceiver.isConnected()) {
                                if (name != null && name.length() != 0) {
                                    z10 = false;
                                } else {
                                    z10 = true;
                                }
                                if (!z10 && Utils.INSTANCE.isValidEmail(name)) {
                                    if (this$0.f11561v.length() > 0) {
                                        z11 = true;
                                    } else {
                                        z11 = false;
                                    }
                                    if (z11) {
                                        String str = this$0.f11561v;
                                        Bundle bundle3 = this$0.A;
                                        bundle3.putString(Constants.THOUGHTS_RELATIONSHIP, str);
                                        gk.a.b(bundle3, "add_family_cta_click");
                                        wo.h hVar = this$0.f11562w;
                                        if (hVar != null) {
                                            String relation = this$0.f11561v;
                                            kotlin.jvm.internal.i.g(name, "name");
                                            kotlin.jvm.internal.i.g(relation, "relation");
                                            ta.v.H(kc.f.H(hVar), null, 0, new wo.j(hVar, name, relation, null), 3);
                                            ((RobertoTextView) this$0.n0(R.id.tvAddFamilyWarningMessage)).setVisibility(8);
                                            return;
                                        }
                                        kotlin.jvm.internal.i.q("experimentAddFamilyViewModel");
                                        throw null;
                                    }
                                }
                                Toast.makeText(this$0, "Please fill all the details", 1).show();
                                return;
                            }
                            Toast.makeText(this$0, "Connect to Internet", 0).show();
                            return;
                        case 1:
                            int i11 = ExperimentAddFamilyMemberActivity.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            BottomSheetBehavior<ConstraintLayout> bottomSheetBehavior = this$0.f11565z;
                            if (bottomSheetBehavior != null) {
                                bottomSheetBehavior.setState(4);
                                this$0.f11561v = ((RobertoTextView) this$0.n0(R.id.tvAddFamilyRelationship6)).getText().toString();
                                ((RobertoEditText) this$0.n0(R.id.etAddFamilyRelationship)).setText(((RobertoTextView) this$0.n0(R.id.tvAddFamilyRelationship6)).getText().toString());
                                ((RobertoTextView) this$0.n0(R.id.tvAddFamilyWarningMessage)).setVisibility(8);
                                return;
                            }
                            kotlin.jvm.internal.i.q("bottomSheetBehavior");
                            throw null;
                        case 2:
                            int i12 = ExperimentAddFamilyMemberActivity.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            BottomSheetBehavior<ConstraintLayout> bottomSheetBehavior2 = this$0.f11565z;
                            if (bottomSheetBehavior2 != null) {
                                bottomSheetBehavior2.setState(4);
                                this$0.f11561v = ((RobertoTextView) this$0.n0(R.id.tvAddFamilyRelationship7)).getText().toString();
                                ((RobertoEditText) this$0.n0(R.id.etAddFamilyRelationship)).setText(((RobertoTextView) this$0.n0(R.id.tvAddFamilyRelationship7)).getText().toString());
                                ((RobertoTextView) this$0.n0(R.id.tvAddFamilyWarningMessage)).setVisibility(8);
                                return;
                            }
                            kotlin.jvm.internal.i.q("bottomSheetBehavior");
                            throw null;
                        case 3:
                            int i13 = ExperimentAddFamilyMemberActivity.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.finish();
                            return;
                        case 4:
                            int i14 = ExperimentAddFamilyMemberActivity.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            BottomSheetBehavior<ConstraintLayout> bottomSheetBehavior3 = this$0.f11565z;
                            if (bottomSheetBehavior3 != null) {
                                bottomSheetBehavior3.setState(4);
                                return;
                            } else {
                                kotlin.jvm.internal.i.q("bottomSheetBehavior");
                                throw null;
                            }
                        case 5:
                            int i15 = ExperimentAddFamilyMemberActivity.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            BottomSheetBehavior<ConstraintLayout> bottomSheetBehavior4 = this$0.f11565z;
                            if (bottomSheetBehavior4 != null) {
                                bottomSheetBehavior4.setState(3);
                                Object systemService = this$0.getSystemService("input_method");
                                kotlin.jvm.internal.i.e(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
                                ((InputMethodManager) systemService).hideSoftInputFromWindow(((RobertoEditText) this$0.n0(R.id.etAddFamilyEmail)).getWindowToken(), 0);
                                return;
                            }
                            kotlin.jvm.internal.i.q("bottomSheetBehavior");
                            throw null;
                        case 6:
                            int i16 = ExperimentAddFamilyMemberActivity.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            BottomSheetBehavior<ConstraintLayout> bottomSheetBehavior5 = this$0.f11565z;
                            if (bottomSheetBehavior5 != null) {
                                bottomSheetBehavior5.setState(3);
                                Object systemService2 = this$0.getSystemService("input_method");
                                kotlin.jvm.internal.i.e(systemService2, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
                                ((InputMethodManager) systemService2).hideSoftInputFromWindow(((RobertoEditText) this$0.n0(R.id.etAddFamilyEmail)).getWindowToken(), 0);
                                return;
                            }
                            kotlin.jvm.internal.i.q("bottomSheetBehavior");
                            throw null;
                        case 7:
                            int i17 = ExperimentAddFamilyMemberActivity.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            BottomSheetBehavior<ConstraintLayout> bottomSheetBehavior6 = this$0.f11565z;
                            if (bottomSheetBehavior6 != null) {
                                bottomSheetBehavior6.setState(4);
                                this$0.f11561v = ((RobertoTextView) this$0.n0(R.id.tvAddFamilyRelationship1)).getText().toString();
                                ((RobertoEditText) this$0.n0(R.id.etAddFamilyRelationship)).setText(((RobertoTextView) this$0.n0(R.id.tvAddFamilyRelationship1)).getText().toString());
                                ((RobertoTextView) this$0.n0(R.id.tvAddFamilyWarningMessage)).setVisibility(8);
                                return;
                            }
                            kotlin.jvm.internal.i.q("bottomSheetBehavior");
                            throw null;
                        case 8:
                            int i18 = ExperimentAddFamilyMemberActivity.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            BottomSheetBehavior<ConstraintLayout> bottomSheetBehavior7 = this$0.f11565z;
                            if (bottomSheetBehavior7 != null) {
                                bottomSheetBehavior7.setState(4);
                                this$0.f11561v = ((RobertoTextView) this$0.n0(R.id.tvAddFamilyRelationship2)).getText().toString();
                                ((RobertoEditText) this$0.n0(R.id.etAddFamilyRelationship)).setText(((RobertoTextView) this$0.n0(R.id.tvAddFamilyRelationship2)).getText().toString());
                                ((RobertoTextView) this$0.n0(R.id.tvAddFamilyWarningMessage)).setVisibility(8);
                                return;
                            }
                            kotlin.jvm.internal.i.q("bottomSheetBehavior");
                            throw null;
                        case 9:
                            int i19 = ExperimentAddFamilyMemberActivity.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            BottomSheetBehavior<ConstraintLayout> bottomSheetBehavior8 = this$0.f11565z;
                            if (bottomSheetBehavior8 != null) {
                                bottomSheetBehavior8.setState(4);
                                this$0.f11561v = ((RobertoTextView) this$0.n0(R.id.tvAddFamilyRelationship3)).getText().toString();
                                ((RobertoEditText) this$0.n0(R.id.etAddFamilyRelationship)).setText(((RobertoTextView) this$0.n0(R.id.tvAddFamilyRelationship3)).getText().toString());
                                ((RobertoTextView) this$0.n0(R.id.tvAddFamilyWarningMessage)).setVisibility(0);
                                return;
                            }
                            kotlin.jvm.internal.i.q("bottomSheetBehavior");
                            throw null;
                        case 10:
                            int i20 = ExperimentAddFamilyMemberActivity.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            BottomSheetBehavior<ConstraintLayout> bottomSheetBehavior9 = this$0.f11565z;
                            if (bottomSheetBehavior9 != null) {
                                bottomSheetBehavior9.setState(4);
                                this$0.f11561v = ((RobertoTextView) this$0.n0(R.id.tvAddFamilyRelationship4)).getText().toString();
                                ((RobertoEditText) this$0.n0(R.id.etAddFamilyRelationship)).setText(((RobertoTextView) this$0.n0(R.id.tvAddFamilyRelationship4)).getText().toString());
                                ((RobertoTextView) this$0.n0(R.id.tvAddFamilyWarningMessage)).setVisibility(0);
                                return;
                            }
                            kotlin.jvm.internal.i.q("bottomSheetBehavior");
                            throw null;
                        default:
                            int i21 = ExperimentAddFamilyMemberActivity.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            BottomSheetBehavior<ConstraintLayout> bottomSheetBehavior10 = this$0.f11565z;
                            if (bottomSheetBehavior10 != null) {
                                bottomSheetBehavior10.setState(4);
                                this$0.f11561v = ((RobertoTextView) this$0.n0(R.id.tvAddFamilyRelationship5)).getText().toString();
                                ((RobertoEditText) this$0.n0(R.id.etAddFamilyRelationship)).setText(((RobertoTextView) this$0.n0(R.id.tvAddFamilyRelationship5)).getText().toString());
                                ((RobertoTextView) this$0.n0(R.id.tvAddFamilyWarningMessage)).setVisibility(8);
                                return;
                            }
                            kotlin.jvm.internal.i.q("bottomSheetBehavior");
                            throw null;
                    }
                }
            });
            ((TextInputLayout) n0(R.id.tilAddFamilyRelationship)).setOnClickListener(new View.OnClickListener(this) { // from class: so.a

                /* renamed from: v  reason: collision with root package name */
                public final /* synthetic */ ExperimentAddFamilyMemberActivity f31789v;

                {
                    this.f31789v = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    String name;
                    boolean z10;
                    boolean z11;
                    int i6 = r2;
                    ExperimentAddFamilyMemberActivity this$0 = this.f31789v;
                    switch (i6) {
                        case 0:
                            int i10 = ExperimentAddFamilyMemberActivity.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            Editable text = ((RobertoEditText) this$0.n0(R.id.etAddFamilyEmail)).getText();
                            if (text != null) {
                                name = text.toString();
                            } else {
                                name = null;
                            }
                            if (ConnectionStatusReceiver.isConnected()) {
                                if (name != null && name.length() != 0) {
                                    z10 = false;
                                } else {
                                    z10 = true;
                                }
                                if (!z10 && Utils.INSTANCE.isValidEmail(name)) {
                                    if (this$0.f11561v.length() > 0) {
                                        z11 = true;
                                    } else {
                                        z11 = false;
                                    }
                                    if (z11) {
                                        String str = this$0.f11561v;
                                        Bundle bundle3 = this$0.A;
                                        bundle3.putString(Constants.THOUGHTS_RELATIONSHIP, str);
                                        gk.a.b(bundle3, "add_family_cta_click");
                                        wo.h hVar = this$0.f11562w;
                                        if (hVar != null) {
                                            String relation = this$0.f11561v;
                                            kotlin.jvm.internal.i.g(name, "name");
                                            kotlin.jvm.internal.i.g(relation, "relation");
                                            ta.v.H(kc.f.H(hVar), null, 0, new wo.j(hVar, name, relation, null), 3);
                                            ((RobertoTextView) this$0.n0(R.id.tvAddFamilyWarningMessage)).setVisibility(8);
                                            return;
                                        }
                                        kotlin.jvm.internal.i.q("experimentAddFamilyViewModel");
                                        throw null;
                                    }
                                }
                                Toast.makeText(this$0, "Please fill all the details", 1).show();
                                return;
                            }
                            Toast.makeText(this$0, "Connect to Internet", 0).show();
                            return;
                        case 1:
                            int i11 = ExperimentAddFamilyMemberActivity.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            BottomSheetBehavior<ConstraintLayout> bottomSheetBehavior = this$0.f11565z;
                            if (bottomSheetBehavior != null) {
                                bottomSheetBehavior.setState(4);
                                this$0.f11561v = ((RobertoTextView) this$0.n0(R.id.tvAddFamilyRelationship6)).getText().toString();
                                ((RobertoEditText) this$0.n0(R.id.etAddFamilyRelationship)).setText(((RobertoTextView) this$0.n0(R.id.tvAddFamilyRelationship6)).getText().toString());
                                ((RobertoTextView) this$0.n0(R.id.tvAddFamilyWarningMessage)).setVisibility(8);
                                return;
                            }
                            kotlin.jvm.internal.i.q("bottomSheetBehavior");
                            throw null;
                        case 2:
                            int i12 = ExperimentAddFamilyMemberActivity.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            BottomSheetBehavior<ConstraintLayout> bottomSheetBehavior2 = this$0.f11565z;
                            if (bottomSheetBehavior2 != null) {
                                bottomSheetBehavior2.setState(4);
                                this$0.f11561v = ((RobertoTextView) this$0.n0(R.id.tvAddFamilyRelationship7)).getText().toString();
                                ((RobertoEditText) this$0.n0(R.id.etAddFamilyRelationship)).setText(((RobertoTextView) this$0.n0(R.id.tvAddFamilyRelationship7)).getText().toString());
                                ((RobertoTextView) this$0.n0(R.id.tvAddFamilyWarningMessage)).setVisibility(8);
                                return;
                            }
                            kotlin.jvm.internal.i.q("bottomSheetBehavior");
                            throw null;
                        case 3:
                            int i13 = ExperimentAddFamilyMemberActivity.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.finish();
                            return;
                        case 4:
                            int i14 = ExperimentAddFamilyMemberActivity.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            BottomSheetBehavior<ConstraintLayout> bottomSheetBehavior3 = this$0.f11565z;
                            if (bottomSheetBehavior3 != null) {
                                bottomSheetBehavior3.setState(4);
                                return;
                            } else {
                                kotlin.jvm.internal.i.q("bottomSheetBehavior");
                                throw null;
                            }
                        case 5:
                            int i15 = ExperimentAddFamilyMemberActivity.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            BottomSheetBehavior<ConstraintLayout> bottomSheetBehavior4 = this$0.f11565z;
                            if (bottomSheetBehavior4 != null) {
                                bottomSheetBehavior4.setState(3);
                                Object systemService = this$0.getSystemService("input_method");
                                kotlin.jvm.internal.i.e(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
                                ((InputMethodManager) systemService).hideSoftInputFromWindow(((RobertoEditText) this$0.n0(R.id.etAddFamilyEmail)).getWindowToken(), 0);
                                return;
                            }
                            kotlin.jvm.internal.i.q("bottomSheetBehavior");
                            throw null;
                        case 6:
                            int i16 = ExperimentAddFamilyMemberActivity.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            BottomSheetBehavior<ConstraintLayout> bottomSheetBehavior5 = this$0.f11565z;
                            if (bottomSheetBehavior5 != null) {
                                bottomSheetBehavior5.setState(3);
                                Object systemService2 = this$0.getSystemService("input_method");
                                kotlin.jvm.internal.i.e(systemService2, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
                                ((InputMethodManager) systemService2).hideSoftInputFromWindow(((RobertoEditText) this$0.n0(R.id.etAddFamilyEmail)).getWindowToken(), 0);
                                return;
                            }
                            kotlin.jvm.internal.i.q("bottomSheetBehavior");
                            throw null;
                        case 7:
                            int i17 = ExperimentAddFamilyMemberActivity.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            BottomSheetBehavior<ConstraintLayout> bottomSheetBehavior6 = this$0.f11565z;
                            if (bottomSheetBehavior6 != null) {
                                bottomSheetBehavior6.setState(4);
                                this$0.f11561v = ((RobertoTextView) this$0.n0(R.id.tvAddFamilyRelationship1)).getText().toString();
                                ((RobertoEditText) this$0.n0(R.id.etAddFamilyRelationship)).setText(((RobertoTextView) this$0.n0(R.id.tvAddFamilyRelationship1)).getText().toString());
                                ((RobertoTextView) this$0.n0(R.id.tvAddFamilyWarningMessage)).setVisibility(8);
                                return;
                            }
                            kotlin.jvm.internal.i.q("bottomSheetBehavior");
                            throw null;
                        case 8:
                            int i18 = ExperimentAddFamilyMemberActivity.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            BottomSheetBehavior<ConstraintLayout> bottomSheetBehavior7 = this$0.f11565z;
                            if (bottomSheetBehavior7 != null) {
                                bottomSheetBehavior7.setState(4);
                                this$0.f11561v = ((RobertoTextView) this$0.n0(R.id.tvAddFamilyRelationship2)).getText().toString();
                                ((RobertoEditText) this$0.n0(R.id.etAddFamilyRelationship)).setText(((RobertoTextView) this$0.n0(R.id.tvAddFamilyRelationship2)).getText().toString());
                                ((RobertoTextView) this$0.n0(R.id.tvAddFamilyWarningMessage)).setVisibility(8);
                                return;
                            }
                            kotlin.jvm.internal.i.q("bottomSheetBehavior");
                            throw null;
                        case 9:
                            int i19 = ExperimentAddFamilyMemberActivity.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            BottomSheetBehavior<ConstraintLayout> bottomSheetBehavior8 = this$0.f11565z;
                            if (bottomSheetBehavior8 != null) {
                                bottomSheetBehavior8.setState(4);
                                this$0.f11561v = ((RobertoTextView) this$0.n0(R.id.tvAddFamilyRelationship3)).getText().toString();
                                ((RobertoEditText) this$0.n0(R.id.etAddFamilyRelationship)).setText(((RobertoTextView) this$0.n0(R.id.tvAddFamilyRelationship3)).getText().toString());
                                ((RobertoTextView) this$0.n0(R.id.tvAddFamilyWarningMessage)).setVisibility(0);
                                return;
                            }
                            kotlin.jvm.internal.i.q("bottomSheetBehavior");
                            throw null;
                        case 10:
                            int i20 = ExperimentAddFamilyMemberActivity.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            BottomSheetBehavior<ConstraintLayout> bottomSheetBehavior9 = this$0.f11565z;
                            if (bottomSheetBehavior9 != null) {
                                bottomSheetBehavior9.setState(4);
                                this$0.f11561v = ((RobertoTextView) this$0.n0(R.id.tvAddFamilyRelationship4)).getText().toString();
                                ((RobertoEditText) this$0.n0(R.id.etAddFamilyRelationship)).setText(((RobertoTextView) this$0.n0(R.id.tvAddFamilyRelationship4)).getText().toString());
                                ((RobertoTextView) this$0.n0(R.id.tvAddFamilyWarningMessage)).setVisibility(0);
                                return;
                            }
                            kotlin.jvm.internal.i.q("bottomSheetBehavior");
                            throw null;
                        default:
                            int i21 = ExperimentAddFamilyMemberActivity.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            BottomSheetBehavior<ConstraintLayout> bottomSheetBehavior10 = this$0.f11565z;
                            if (bottomSheetBehavior10 != null) {
                                bottomSheetBehavior10.setState(4);
                                this$0.f11561v = ((RobertoTextView) this$0.n0(R.id.tvAddFamilyRelationship5)).getText().toString();
                                ((RobertoEditText) this$0.n0(R.id.etAddFamilyRelationship)).setText(((RobertoTextView) this$0.n0(R.id.tvAddFamilyRelationship5)).getText().toString());
                                ((RobertoTextView) this$0.n0(R.id.tvAddFamilyWarningMessage)).setVisibility(8);
                                return;
                            }
                            kotlin.jvm.internal.i.q("bottomSheetBehavior");
                            throw null;
                    }
                }
            });
            ((RobertoEditText) n0(R.id.etAddFamilyRelationship)).setOnClickListener(new View.OnClickListener(this) { // from class: so.a

                /* renamed from: v  reason: collision with root package name */
                public final /* synthetic */ ExperimentAddFamilyMemberActivity f31789v;

                {
                    this.f31789v = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    String name;
                    boolean z10;
                    boolean z11;
                    int i6 = r2;
                    ExperimentAddFamilyMemberActivity this$0 = this.f31789v;
                    switch (i6) {
                        case 0:
                            int i10 = ExperimentAddFamilyMemberActivity.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            Editable text = ((RobertoEditText) this$0.n0(R.id.etAddFamilyEmail)).getText();
                            if (text != null) {
                                name = text.toString();
                            } else {
                                name = null;
                            }
                            if (ConnectionStatusReceiver.isConnected()) {
                                if (name != null && name.length() != 0) {
                                    z10 = false;
                                } else {
                                    z10 = true;
                                }
                                if (!z10 && Utils.INSTANCE.isValidEmail(name)) {
                                    if (this$0.f11561v.length() > 0) {
                                        z11 = true;
                                    } else {
                                        z11 = false;
                                    }
                                    if (z11) {
                                        String str = this$0.f11561v;
                                        Bundle bundle3 = this$0.A;
                                        bundle3.putString(Constants.THOUGHTS_RELATIONSHIP, str);
                                        gk.a.b(bundle3, "add_family_cta_click");
                                        wo.h hVar = this$0.f11562w;
                                        if (hVar != null) {
                                            String relation = this$0.f11561v;
                                            kotlin.jvm.internal.i.g(name, "name");
                                            kotlin.jvm.internal.i.g(relation, "relation");
                                            ta.v.H(kc.f.H(hVar), null, 0, new wo.j(hVar, name, relation, null), 3);
                                            ((RobertoTextView) this$0.n0(R.id.tvAddFamilyWarningMessage)).setVisibility(8);
                                            return;
                                        }
                                        kotlin.jvm.internal.i.q("experimentAddFamilyViewModel");
                                        throw null;
                                    }
                                }
                                Toast.makeText(this$0, "Please fill all the details", 1).show();
                                return;
                            }
                            Toast.makeText(this$0, "Connect to Internet", 0).show();
                            return;
                        case 1:
                            int i11 = ExperimentAddFamilyMemberActivity.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            BottomSheetBehavior<ConstraintLayout> bottomSheetBehavior = this$0.f11565z;
                            if (bottomSheetBehavior != null) {
                                bottomSheetBehavior.setState(4);
                                this$0.f11561v = ((RobertoTextView) this$0.n0(R.id.tvAddFamilyRelationship6)).getText().toString();
                                ((RobertoEditText) this$0.n0(R.id.etAddFamilyRelationship)).setText(((RobertoTextView) this$0.n0(R.id.tvAddFamilyRelationship6)).getText().toString());
                                ((RobertoTextView) this$0.n0(R.id.tvAddFamilyWarningMessage)).setVisibility(8);
                                return;
                            }
                            kotlin.jvm.internal.i.q("bottomSheetBehavior");
                            throw null;
                        case 2:
                            int i12 = ExperimentAddFamilyMemberActivity.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            BottomSheetBehavior<ConstraintLayout> bottomSheetBehavior2 = this$0.f11565z;
                            if (bottomSheetBehavior2 != null) {
                                bottomSheetBehavior2.setState(4);
                                this$0.f11561v = ((RobertoTextView) this$0.n0(R.id.tvAddFamilyRelationship7)).getText().toString();
                                ((RobertoEditText) this$0.n0(R.id.etAddFamilyRelationship)).setText(((RobertoTextView) this$0.n0(R.id.tvAddFamilyRelationship7)).getText().toString());
                                ((RobertoTextView) this$0.n0(R.id.tvAddFamilyWarningMessage)).setVisibility(8);
                                return;
                            }
                            kotlin.jvm.internal.i.q("bottomSheetBehavior");
                            throw null;
                        case 3:
                            int i13 = ExperimentAddFamilyMemberActivity.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.finish();
                            return;
                        case 4:
                            int i14 = ExperimentAddFamilyMemberActivity.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            BottomSheetBehavior<ConstraintLayout> bottomSheetBehavior3 = this$0.f11565z;
                            if (bottomSheetBehavior3 != null) {
                                bottomSheetBehavior3.setState(4);
                                return;
                            } else {
                                kotlin.jvm.internal.i.q("bottomSheetBehavior");
                                throw null;
                            }
                        case 5:
                            int i15 = ExperimentAddFamilyMemberActivity.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            BottomSheetBehavior<ConstraintLayout> bottomSheetBehavior4 = this$0.f11565z;
                            if (bottomSheetBehavior4 != null) {
                                bottomSheetBehavior4.setState(3);
                                Object systemService = this$0.getSystemService("input_method");
                                kotlin.jvm.internal.i.e(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
                                ((InputMethodManager) systemService).hideSoftInputFromWindow(((RobertoEditText) this$0.n0(R.id.etAddFamilyEmail)).getWindowToken(), 0);
                                return;
                            }
                            kotlin.jvm.internal.i.q("bottomSheetBehavior");
                            throw null;
                        case 6:
                            int i16 = ExperimentAddFamilyMemberActivity.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            BottomSheetBehavior<ConstraintLayout> bottomSheetBehavior5 = this$0.f11565z;
                            if (bottomSheetBehavior5 != null) {
                                bottomSheetBehavior5.setState(3);
                                Object systemService2 = this$0.getSystemService("input_method");
                                kotlin.jvm.internal.i.e(systemService2, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
                                ((InputMethodManager) systemService2).hideSoftInputFromWindow(((RobertoEditText) this$0.n0(R.id.etAddFamilyEmail)).getWindowToken(), 0);
                                return;
                            }
                            kotlin.jvm.internal.i.q("bottomSheetBehavior");
                            throw null;
                        case 7:
                            int i17 = ExperimentAddFamilyMemberActivity.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            BottomSheetBehavior<ConstraintLayout> bottomSheetBehavior6 = this$0.f11565z;
                            if (bottomSheetBehavior6 != null) {
                                bottomSheetBehavior6.setState(4);
                                this$0.f11561v = ((RobertoTextView) this$0.n0(R.id.tvAddFamilyRelationship1)).getText().toString();
                                ((RobertoEditText) this$0.n0(R.id.etAddFamilyRelationship)).setText(((RobertoTextView) this$0.n0(R.id.tvAddFamilyRelationship1)).getText().toString());
                                ((RobertoTextView) this$0.n0(R.id.tvAddFamilyWarningMessage)).setVisibility(8);
                                return;
                            }
                            kotlin.jvm.internal.i.q("bottomSheetBehavior");
                            throw null;
                        case 8:
                            int i18 = ExperimentAddFamilyMemberActivity.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            BottomSheetBehavior<ConstraintLayout> bottomSheetBehavior7 = this$0.f11565z;
                            if (bottomSheetBehavior7 != null) {
                                bottomSheetBehavior7.setState(4);
                                this$0.f11561v = ((RobertoTextView) this$0.n0(R.id.tvAddFamilyRelationship2)).getText().toString();
                                ((RobertoEditText) this$0.n0(R.id.etAddFamilyRelationship)).setText(((RobertoTextView) this$0.n0(R.id.tvAddFamilyRelationship2)).getText().toString());
                                ((RobertoTextView) this$0.n0(R.id.tvAddFamilyWarningMessage)).setVisibility(8);
                                return;
                            }
                            kotlin.jvm.internal.i.q("bottomSheetBehavior");
                            throw null;
                        case 9:
                            int i19 = ExperimentAddFamilyMemberActivity.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            BottomSheetBehavior<ConstraintLayout> bottomSheetBehavior8 = this$0.f11565z;
                            if (bottomSheetBehavior8 != null) {
                                bottomSheetBehavior8.setState(4);
                                this$0.f11561v = ((RobertoTextView) this$0.n0(R.id.tvAddFamilyRelationship3)).getText().toString();
                                ((RobertoEditText) this$0.n0(R.id.etAddFamilyRelationship)).setText(((RobertoTextView) this$0.n0(R.id.tvAddFamilyRelationship3)).getText().toString());
                                ((RobertoTextView) this$0.n0(R.id.tvAddFamilyWarningMessage)).setVisibility(0);
                                return;
                            }
                            kotlin.jvm.internal.i.q("bottomSheetBehavior");
                            throw null;
                        case 10:
                            int i20 = ExperimentAddFamilyMemberActivity.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            BottomSheetBehavior<ConstraintLayout> bottomSheetBehavior9 = this$0.f11565z;
                            if (bottomSheetBehavior9 != null) {
                                bottomSheetBehavior9.setState(4);
                                this$0.f11561v = ((RobertoTextView) this$0.n0(R.id.tvAddFamilyRelationship4)).getText().toString();
                                ((RobertoEditText) this$0.n0(R.id.etAddFamilyRelationship)).setText(((RobertoTextView) this$0.n0(R.id.tvAddFamilyRelationship4)).getText().toString());
                                ((RobertoTextView) this$0.n0(R.id.tvAddFamilyWarningMessage)).setVisibility(0);
                                return;
                            }
                            kotlin.jvm.internal.i.q("bottomSheetBehavior");
                            throw null;
                        default:
                            int i21 = ExperimentAddFamilyMemberActivity.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            BottomSheetBehavior<ConstraintLayout> bottomSheetBehavior10 = this$0.f11565z;
                            if (bottomSheetBehavior10 != null) {
                                bottomSheetBehavior10.setState(4);
                                this$0.f11561v = ((RobertoTextView) this$0.n0(R.id.tvAddFamilyRelationship5)).getText().toString();
                                ((RobertoEditText) this$0.n0(R.id.etAddFamilyRelationship)).setText(((RobertoTextView) this$0.n0(R.id.tvAddFamilyRelationship5)).getText().toString());
                                ((RobertoTextView) this$0.n0(R.id.tvAddFamilyWarningMessage)).setVisibility(8);
                                return;
                            }
                            kotlin.jvm.internal.i.q("bottomSheetBehavior");
                            throw null;
                    }
                }
            });
            ((RobertoTextView) n0(R.id.tvAddFamilyRelationship1)).setOnClickListener(new View.OnClickListener(this) { // from class: so.a

                /* renamed from: v  reason: collision with root package name */
                public final /* synthetic */ ExperimentAddFamilyMemberActivity f31789v;

                {
                    this.f31789v = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    String name;
                    boolean z10;
                    boolean z11;
                    int i6 = r2;
                    ExperimentAddFamilyMemberActivity this$0 = this.f31789v;
                    switch (i6) {
                        case 0:
                            int i10 = ExperimentAddFamilyMemberActivity.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            Editable text = ((RobertoEditText) this$0.n0(R.id.etAddFamilyEmail)).getText();
                            if (text != null) {
                                name = text.toString();
                            } else {
                                name = null;
                            }
                            if (ConnectionStatusReceiver.isConnected()) {
                                if (name != null && name.length() != 0) {
                                    z10 = false;
                                } else {
                                    z10 = true;
                                }
                                if (!z10 && Utils.INSTANCE.isValidEmail(name)) {
                                    if (this$0.f11561v.length() > 0) {
                                        z11 = true;
                                    } else {
                                        z11 = false;
                                    }
                                    if (z11) {
                                        String str = this$0.f11561v;
                                        Bundle bundle3 = this$0.A;
                                        bundle3.putString(Constants.THOUGHTS_RELATIONSHIP, str);
                                        gk.a.b(bundle3, "add_family_cta_click");
                                        wo.h hVar = this$0.f11562w;
                                        if (hVar != null) {
                                            String relation = this$0.f11561v;
                                            kotlin.jvm.internal.i.g(name, "name");
                                            kotlin.jvm.internal.i.g(relation, "relation");
                                            ta.v.H(kc.f.H(hVar), null, 0, new wo.j(hVar, name, relation, null), 3);
                                            ((RobertoTextView) this$0.n0(R.id.tvAddFamilyWarningMessage)).setVisibility(8);
                                            return;
                                        }
                                        kotlin.jvm.internal.i.q("experimentAddFamilyViewModel");
                                        throw null;
                                    }
                                }
                                Toast.makeText(this$0, "Please fill all the details", 1).show();
                                return;
                            }
                            Toast.makeText(this$0, "Connect to Internet", 0).show();
                            return;
                        case 1:
                            int i11 = ExperimentAddFamilyMemberActivity.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            BottomSheetBehavior<ConstraintLayout> bottomSheetBehavior = this$0.f11565z;
                            if (bottomSheetBehavior != null) {
                                bottomSheetBehavior.setState(4);
                                this$0.f11561v = ((RobertoTextView) this$0.n0(R.id.tvAddFamilyRelationship6)).getText().toString();
                                ((RobertoEditText) this$0.n0(R.id.etAddFamilyRelationship)).setText(((RobertoTextView) this$0.n0(R.id.tvAddFamilyRelationship6)).getText().toString());
                                ((RobertoTextView) this$0.n0(R.id.tvAddFamilyWarningMessage)).setVisibility(8);
                                return;
                            }
                            kotlin.jvm.internal.i.q("bottomSheetBehavior");
                            throw null;
                        case 2:
                            int i12 = ExperimentAddFamilyMemberActivity.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            BottomSheetBehavior<ConstraintLayout> bottomSheetBehavior2 = this$0.f11565z;
                            if (bottomSheetBehavior2 != null) {
                                bottomSheetBehavior2.setState(4);
                                this$0.f11561v = ((RobertoTextView) this$0.n0(R.id.tvAddFamilyRelationship7)).getText().toString();
                                ((RobertoEditText) this$0.n0(R.id.etAddFamilyRelationship)).setText(((RobertoTextView) this$0.n0(R.id.tvAddFamilyRelationship7)).getText().toString());
                                ((RobertoTextView) this$0.n0(R.id.tvAddFamilyWarningMessage)).setVisibility(8);
                                return;
                            }
                            kotlin.jvm.internal.i.q("bottomSheetBehavior");
                            throw null;
                        case 3:
                            int i13 = ExperimentAddFamilyMemberActivity.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.finish();
                            return;
                        case 4:
                            int i14 = ExperimentAddFamilyMemberActivity.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            BottomSheetBehavior<ConstraintLayout> bottomSheetBehavior3 = this$0.f11565z;
                            if (bottomSheetBehavior3 != null) {
                                bottomSheetBehavior3.setState(4);
                                return;
                            } else {
                                kotlin.jvm.internal.i.q("bottomSheetBehavior");
                                throw null;
                            }
                        case 5:
                            int i15 = ExperimentAddFamilyMemberActivity.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            BottomSheetBehavior<ConstraintLayout> bottomSheetBehavior4 = this$0.f11565z;
                            if (bottomSheetBehavior4 != null) {
                                bottomSheetBehavior4.setState(3);
                                Object systemService = this$0.getSystemService("input_method");
                                kotlin.jvm.internal.i.e(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
                                ((InputMethodManager) systemService).hideSoftInputFromWindow(((RobertoEditText) this$0.n0(R.id.etAddFamilyEmail)).getWindowToken(), 0);
                                return;
                            }
                            kotlin.jvm.internal.i.q("bottomSheetBehavior");
                            throw null;
                        case 6:
                            int i16 = ExperimentAddFamilyMemberActivity.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            BottomSheetBehavior<ConstraintLayout> bottomSheetBehavior5 = this$0.f11565z;
                            if (bottomSheetBehavior5 != null) {
                                bottomSheetBehavior5.setState(3);
                                Object systemService2 = this$0.getSystemService("input_method");
                                kotlin.jvm.internal.i.e(systemService2, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
                                ((InputMethodManager) systemService2).hideSoftInputFromWindow(((RobertoEditText) this$0.n0(R.id.etAddFamilyEmail)).getWindowToken(), 0);
                                return;
                            }
                            kotlin.jvm.internal.i.q("bottomSheetBehavior");
                            throw null;
                        case 7:
                            int i17 = ExperimentAddFamilyMemberActivity.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            BottomSheetBehavior<ConstraintLayout> bottomSheetBehavior6 = this$0.f11565z;
                            if (bottomSheetBehavior6 != null) {
                                bottomSheetBehavior6.setState(4);
                                this$0.f11561v = ((RobertoTextView) this$0.n0(R.id.tvAddFamilyRelationship1)).getText().toString();
                                ((RobertoEditText) this$0.n0(R.id.etAddFamilyRelationship)).setText(((RobertoTextView) this$0.n0(R.id.tvAddFamilyRelationship1)).getText().toString());
                                ((RobertoTextView) this$0.n0(R.id.tvAddFamilyWarningMessage)).setVisibility(8);
                                return;
                            }
                            kotlin.jvm.internal.i.q("bottomSheetBehavior");
                            throw null;
                        case 8:
                            int i18 = ExperimentAddFamilyMemberActivity.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            BottomSheetBehavior<ConstraintLayout> bottomSheetBehavior7 = this$0.f11565z;
                            if (bottomSheetBehavior7 != null) {
                                bottomSheetBehavior7.setState(4);
                                this$0.f11561v = ((RobertoTextView) this$0.n0(R.id.tvAddFamilyRelationship2)).getText().toString();
                                ((RobertoEditText) this$0.n0(R.id.etAddFamilyRelationship)).setText(((RobertoTextView) this$0.n0(R.id.tvAddFamilyRelationship2)).getText().toString());
                                ((RobertoTextView) this$0.n0(R.id.tvAddFamilyWarningMessage)).setVisibility(8);
                                return;
                            }
                            kotlin.jvm.internal.i.q("bottomSheetBehavior");
                            throw null;
                        case 9:
                            int i19 = ExperimentAddFamilyMemberActivity.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            BottomSheetBehavior<ConstraintLayout> bottomSheetBehavior8 = this$0.f11565z;
                            if (bottomSheetBehavior8 != null) {
                                bottomSheetBehavior8.setState(4);
                                this$0.f11561v = ((RobertoTextView) this$0.n0(R.id.tvAddFamilyRelationship3)).getText().toString();
                                ((RobertoEditText) this$0.n0(R.id.etAddFamilyRelationship)).setText(((RobertoTextView) this$0.n0(R.id.tvAddFamilyRelationship3)).getText().toString());
                                ((RobertoTextView) this$0.n0(R.id.tvAddFamilyWarningMessage)).setVisibility(0);
                                return;
                            }
                            kotlin.jvm.internal.i.q("bottomSheetBehavior");
                            throw null;
                        case 10:
                            int i20 = ExperimentAddFamilyMemberActivity.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            BottomSheetBehavior<ConstraintLayout> bottomSheetBehavior9 = this$0.f11565z;
                            if (bottomSheetBehavior9 != null) {
                                bottomSheetBehavior9.setState(4);
                                this$0.f11561v = ((RobertoTextView) this$0.n0(R.id.tvAddFamilyRelationship4)).getText().toString();
                                ((RobertoEditText) this$0.n0(R.id.etAddFamilyRelationship)).setText(((RobertoTextView) this$0.n0(R.id.tvAddFamilyRelationship4)).getText().toString());
                                ((RobertoTextView) this$0.n0(R.id.tvAddFamilyWarningMessage)).setVisibility(0);
                                return;
                            }
                            kotlin.jvm.internal.i.q("bottomSheetBehavior");
                            throw null;
                        default:
                            int i21 = ExperimentAddFamilyMemberActivity.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            BottomSheetBehavior<ConstraintLayout> bottomSheetBehavior10 = this$0.f11565z;
                            if (bottomSheetBehavior10 != null) {
                                bottomSheetBehavior10.setState(4);
                                this$0.f11561v = ((RobertoTextView) this$0.n0(R.id.tvAddFamilyRelationship5)).getText().toString();
                                ((RobertoEditText) this$0.n0(R.id.etAddFamilyRelationship)).setText(((RobertoTextView) this$0.n0(R.id.tvAddFamilyRelationship5)).getText().toString());
                                ((RobertoTextView) this$0.n0(R.id.tvAddFamilyWarningMessage)).setVisibility(8);
                                return;
                            }
                            kotlin.jvm.internal.i.q("bottomSheetBehavior");
                            throw null;
                    }
                }
            });
            ((RobertoTextView) n0(R.id.tvAddFamilyRelationship2)).setOnClickListener(new View.OnClickListener(this) { // from class: so.a

                /* renamed from: v  reason: collision with root package name */
                public final /* synthetic */ ExperimentAddFamilyMemberActivity f31789v;

                {
                    this.f31789v = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    String name;
                    boolean z10;
                    boolean z11;
                    int i6 = r2;
                    ExperimentAddFamilyMemberActivity this$0 = this.f31789v;
                    switch (i6) {
                        case 0:
                            int i10 = ExperimentAddFamilyMemberActivity.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            Editable text = ((RobertoEditText) this$0.n0(R.id.etAddFamilyEmail)).getText();
                            if (text != null) {
                                name = text.toString();
                            } else {
                                name = null;
                            }
                            if (ConnectionStatusReceiver.isConnected()) {
                                if (name != null && name.length() != 0) {
                                    z10 = false;
                                } else {
                                    z10 = true;
                                }
                                if (!z10 && Utils.INSTANCE.isValidEmail(name)) {
                                    if (this$0.f11561v.length() > 0) {
                                        z11 = true;
                                    } else {
                                        z11 = false;
                                    }
                                    if (z11) {
                                        String str = this$0.f11561v;
                                        Bundle bundle3 = this$0.A;
                                        bundle3.putString(Constants.THOUGHTS_RELATIONSHIP, str);
                                        gk.a.b(bundle3, "add_family_cta_click");
                                        wo.h hVar = this$0.f11562w;
                                        if (hVar != null) {
                                            String relation = this$0.f11561v;
                                            kotlin.jvm.internal.i.g(name, "name");
                                            kotlin.jvm.internal.i.g(relation, "relation");
                                            ta.v.H(kc.f.H(hVar), null, 0, new wo.j(hVar, name, relation, null), 3);
                                            ((RobertoTextView) this$0.n0(R.id.tvAddFamilyWarningMessage)).setVisibility(8);
                                            return;
                                        }
                                        kotlin.jvm.internal.i.q("experimentAddFamilyViewModel");
                                        throw null;
                                    }
                                }
                                Toast.makeText(this$0, "Please fill all the details", 1).show();
                                return;
                            }
                            Toast.makeText(this$0, "Connect to Internet", 0).show();
                            return;
                        case 1:
                            int i11 = ExperimentAddFamilyMemberActivity.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            BottomSheetBehavior<ConstraintLayout> bottomSheetBehavior = this$0.f11565z;
                            if (bottomSheetBehavior != null) {
                                bottomSheetBehavior.setState(4);
                                this$0.f11561v = ((RobertoTextView) this$0.n0(R.id.tvAddFamilyRelationship6)).getText().toString();
                                ((RobertoEditText) this$0.n0(R.id.etAddFamilyRelationship)).setText(((RobertoTextView) this$0.n0(R.id.tvAddFamilyRelationship6)).getText().toString());
                                ((RobertoTextView) this$0.n0(R.id.tvAddFamilyWarningMessage)).setVisibility(8);
                                return;
                            }
                            kotlin.jvm.internal.i.q("bottomSheetBehavior");
                            throw null;
                        case 2:
                            int i12 = ExperimentAddFamilyMemberActivity.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            BottomSheetBehavior<ConstraintLayout> bottomSheetBehavior2 = this$0.f11565z;
                            if (bottomSheetBehavior2 != null) {
                                bottomSheetBehavior2.setState(4);
                                this$0.f11561v = ((RobertoTextView) this$0.n0(R.id.tvAddFamilyRelationship7)).getText().toString();
                                ((RobertoEditText) this$0.n0(R.id.etAddFamilyRelationship)).setText(((RobertoTextView) this$0.n0(R.id.tvAddFamilyRelationship7)).getText().toString());
                                ((RobertoTextView) this$0.n0(R.id.tvAddFamilyWarningMessage)).setVisibility(8);
                                return;
                            }
                            kotlin.jvm.internal.i.q("bottomSheetBehavior");
                            throw null;
                        case 3:
                            int i13 = ExperimentAddFamilyMemberActivity.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.finish();
                            return;
                        case 4:
                            int i14 = ExperimentAddFamilyMemberActivity.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            BottomSheetBehavior<ConstraintLayout> bottomSheetBehavior3 = this$0.f11565z;
                            if (bottomSheetBehavior3 != null) {
                                bottomSheetBehavior3.setState(4);
                                return;
                            } else {
                                kotlin.jvm.internal.i.q("bottomSheetBehavior");
                                throw null;
                            }
                        case 5:
                            int i15 = ExperimentAddFamilyMemberActivity.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            BottomSheetBehavior<ConstraintLayout> bottomSheetBehavior4 = this$0.f11565z;
                            if (bottomSheetBehavior4 != null) {
                                bottomSheetBehavior4.setState(3);
                                Object systemService = this$0.getSystemService("input_method");
                                kotlin.jvm.internal.i.e(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
                                ((InputMethodManager) systemService).hideSoftInputFromWindow(((RobertoEditText) this$0.n0(R.id.etAddFamilyEmail)).getWindowToken(), 0);
                                return;
                            }
                            kotlin.jvm.internal.i.q("bottomSheetBehavior");
                            throw null;
                        case 6:
                            int i16 = ExperimentAddFamilyMemberActivity.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            BottomSheetBehavior<ConstraintLayout> bottomSheetBehavior5 = this$0.f11565z;
                            if (bottomSheetBehavior5 != null) {
                                bottomSheetBehavior5.setState(3);
                                Object systemService2 = this$0.getSystemService("input_method");
                                kotlin.jvm.internal.i.e(systemService2, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
                                ((InputMethodManager) systemService2).hideSoftInputFromWindow(((RobertoEditText) this$0.n0(R.id.etAddFamilyEmail)).getWindowToken(), 0);
                                return;
                            }
                            kotlin.jvm.internal.i.q("bottomSheetBehavior");
                            throw null;
                        case 7:
                            int i17 = ExperimentAddFamilyMemberActivity.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            BottomSheetBehavior<ConstraintLayout> bottomSheetBehavior6 = this$0.f11565z;
                            if (bottomSheetBehavior6 != null) {
                                bottomSheetBehavior6.setState(4);
                                this$0.f11561v = ((RobertoTextView) this$0.n0(R.id.tvAddFamilyRelationship1)).getText().toString();
                                ((RobertoEditText) this$0.n0(R.id.etAddFamilyRelationship)).setText(((RobertoTextView) this$0.n0(R.id.tvAddFamilyRelationship1)).getText().toString());
                                ((RobertoTextView) this$0.n0(R.id.tvAddFamilyWarningMessage)).setVisibility(8);
                                return;
                            }
                            kotlin.jvm.internal.i.q("bottomSheetBehavior");
                            throw null;
                        case 8:
                            int i18 = ExperimentAddFamilyMemberActivity.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            BottomSheetBehavior<ConstraintLayout> bottomSheetBehavior7 = this$0.f11565z;
                            if (bottomSheetBehavior7 != null) {
                                bottomSheetBehavior7.setState(4);
                                this$0.f11561v = ((RobertoTextView) this$0.n0(R.id.tvAddFamilyRelationship2)).getText().toString();
                                ((RobertoEditText) this$0.n0(R.id.etAddFamilyRelationship)).setText(((RobertoTextView) this$0.n0(R.id.tvAddFamilyRelationship2)).getText().toString());
                                ((RobertoTextView) this$0.n0(R.id.tvAddFamilyWarningMessage)).setVisibility(8);
                                return;
                            }
                            kotlin.jvm.internal.i.q("bottomSheetBehavior");
                            throw null;
                        case 9:
                            int i19 = ExperimentAddFamilyMemberActivity.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            BottomSheetBehavior<ConstraintLayout> bottomSheetBehavior8 = this$0.f11565z;
                            if (bottomSheetBehavior8 != null) {
                                bottomSheetBehavior8.setState(4);
                                this$0.f11561v = ((RobertoTextView) this$0.n0(R.id.tvAddFamilyRelationship3)).getText().toString();
                                ((RobertoEditText) this$0.n0(R.id.etAddFamilyRelationship)).setText(((RobertoTextView) this$0.n0(R.id.tvAddFamilyRelationship3)).getText().toString());
                                ((RobertoTextView) this$0.n0(R.id.tvAddFamilyWarningMessage)).setVisibility(0);
                                return;
                            }
                            kotlin.jvm.internal.i.q("bottomSheetBehavior");
                            throw null;
                        case 10:
                            int i20 = ExperimentAddFamilyMemberActivity.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            BottomSheetBehavior<ConstraintLayout> bottomSheetBehavior9 = this$0.f11565z;
                            if (bottomSheetBehavior9 != null) {
                                bottomSheetBehavior9.setState(4);
                                this$0.f11561v = ((RobertoTextView) this$0.n0(R.id.tvAddFamilyRelationship4)).getText().toString();
                                ((RobertoEditText) this$0.n0(R.id.etAddFamilyRelationship)).setText(((RobertoTextView) this$0.n0(R.id.tvAddFamilyRelationship4)).getText().toString());
                                ((RobertoTextView) this$0.n0(R.id.tvAddFamilyWarningMessage)).setVisibility(0);
                                return;
                            }
                            kotlin.jvm.internal.i.q("bottomSheetBehavior");
                            throw null;
                        default:
                            int i21 = ExperimentAddFamilyMemberActivity.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            BottomSheetBehavior<ConstraintLayout> bottomSheetBehavior10 = this$0.f11565z;
                            if (bottomSheetBehavior10 != null) {
                                bottomSheetBehavior10.setState(4);
                                this$0.f11561v = ((RobertoTextView) this$0.n0(R.id.tvAddFamilyRelationship5)).getText().toString();
                                ((RobertoEditText) this$0.n0(R.id.etAddFamilyRelationship)).setText(((RobertoTextView) this$0.n0(R.id.tvAddFamilyRelationship5)).getText().toString());
                                ((RobertoTextView) this$0.n0(R.id.tvAddFamilyWarningMessage)).setVisibility(8);
                                return;
                            }
                            kotlin.jvm.internal.i.q("bottomSheetBehavior");
                            throw null;
                    }
                }
            });
            ((RobertoTextView) n0(R.id.tvAddFamilyRelationship3)).setOnClickListener(new View.OnClickListener(this) { // from class: so.a

                /* renamed from: v  reason: collision with root package name */
                public final /* synthetic */ ExperimentAddFamilyMemberActivity f31789v;

                {
                    this.f31789v = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    String name;
                    boolean z10;
                    boolean z11;
                    int i6 = r2;
                    ExperimentAddFamilyMemberActivity this$0 = this.f31789v;
                    switch (i6) {
                        case 0:
                            int i10 = ExperimentAddFamilyMemberActivity.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            Editable text = ((RobertoEditText) this$0.n0(R.id.etAddFamilyEmail)).getText();
                            if (text != null) {
                                name = text.toString();
                            } else {
                                name = null;
                            }
                            if (ConnectionStatusReceiver.isConnected()) {
                                if (name != null && name.length() != 0) {
                                    z10 = false;
                                } else {
                                    z10 = true;
                                }
                                if (!z10 && Utils.INSTANCE.isValidEmail(name)) {
                                    if (this$0.f11561v.length() > 0) {
                                        z11 = true;
                                    } else {
                                        z11 = false;
                                    }
                                    if (z11) {
                                        String str = this$0.f11561v;
                                        Bundle bundle3 = this$0.A;
                                        bundle3.putString(Constants.THOUGHTS_RELATIONSHIP, str);
                                        gk.a.b(bundle3, "add_family_cta_click");
                                        wo.h hVar = this$0.f11562w;
                                        if (hVar != null) {
                                            String relation = this$0.f11561v;
                                            kotlin.jvm.internal.i.g(name, "name");
                                            kotlin.jvm.internal.i.g(relation, "relation");
                                            ta.v.H(kc.f.H(hVar), null, 0, new wo.j(hVar, name, relation, null), 3);
                                            ((RobertoTextView) this$0.n0(R.id.tvAddFamilyWarningMessage)).setVisibility(8);
                                            return;
                                        }
                                        kotlin.jvm.internal.i.q("experimentAddFamilyViewModel");
                                        throw null;
                                    }
                                }
                                Toast.makeText(this$0, "Please fill all the details", 1).show();
                                return;
                            }
                            Toast.makeText(this$0, "Connect to Internet", 0).show();
                            return;
                        case 1:
                            int i11 = ExperimentAddFamilyMemberActivity.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            BottomSheetBehavior<ConstraintLayout> bottomSheetBehavior = this$0.f11565z;
                            if (bottomSheetBehavior != null) {
                                bottomSheetBehavior.setState(4);
                                this$0.f11561v = ((RobertoTextView) this$0.n0(R.id.tvAddFamilyRelationship6)).getText().toString();
                                ((RobertoEditText) this$0.n0(R.id.etAddFamilyRelationship)).setText(((RobertoTextView) this$0.n0(R.id.tvAddFamilyRelationship6)).getText().toString());
                                ((RobertoTextView) this$0.n0(R.id.tvAddFamilyWarningMessage)).setVisibility(8);
                                return;
                            }
                            kotlin.jvm.internal.i.q("bottomSheetBehavior");
                            throw null;
                        case 2:
                            int i12 = ExperimentAddFamilyMemberActivity.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            BottomSheetBehavior<ConstraintLayout> bottomSheetBehavior2 = this$0.f11565z;
                            if (bottomSheetBehavior2 != null) {
                                bottomSheetBehavior2.setState(4);
                                this$0.f11561v = ((RobertoTextView) this$0.n0(R.id.tvAddFamilyRelationship7)).getText().toString();
                                ((RobertoEditText) this$0.n0(R.id.etAddFamilyRelationship)).setText(((RobertoTextView) this$0.n0(R.id.tvAddFamilyRelationship7)).getText().toString());
                                ((RobertoTextView) this$0.n0(R.id.tvAddFamilyWarningMessage)).setVisibility(8);
                                return;
                            }
                            kotlin.jvm.internal.i.q("bottomSheetBehavior");
                            throw null;
                        case 3:
                            int i13 = ExperimentAddFamilyMemberActivity.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.finish();
                            return;
                        case 4:
                            int i14 = ExperimentAddFamilyMemberActivity.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            BottomSheetBehavior<ConstraintLayout> bottomSheetBehavior3 = this$0.f11565z;
                            if (bottomSheetBehavior3 != null) {
                                bottomSheetBehavior3.setState(4);
                                return;
                            } else {
                                kotlin.jvm.internal.i.q("bottomSheetBehavior");
                                throw null;
                            }
                        case 5:
                            int i15 = ExperimentAddFamilyMemberActivity.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            BottomSheetBehavior<ConstraintLayout> bottomSheetBehavior4 = this$0.f11565z;
                            if (bottomSheetBehavior4 != null) {
                                bottomSheetBehavior4.setState(3);
                                Object systemService = this$0.getSystemService("input_method");
                                kotlin.jvm.internal.i.e(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
                                ((InputMethodManager) systemService).hideSoftInputFromWindow(((RobertoEditText) this$0.n0(R.id.etAddFamilyEmail)).getWindowToken(), 0);
                                return;
                            }
                            kotlin.jvm.internal.i.q("bottomSheetBehavior");
                            throw null;
                        case 6:
                            int i16 = ExperimentAddFamilyMemberActivity.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            BottomSheetBehavior<ConstraintLayout> bottomSheetBehavior5 = this$0.f11565z;
                            if (bottomSheetBehavior5 != null) {
                                bottomSheetBehavior5.setState(3);
                                Object systemService2 = this$0.getSystemService("input_method");
                                kotlin.jvm.internal.i.e(systemService2, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
                                ((InputMethodManager) systemService2).hideSoftInputFromWindow(((RobertoEditText) this$0.n0(R.id.etAddFamilyEmail)).getWindowToken(), 0);
                                return;
                            }
                            kotlin.jvm.internal.i.q("bottomSheetBehavior");
                            throw null;
                        case 7:
                            int i17 = ExperimentAddFamilyMemberActivity.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            BottomSheetBehavior<ConstraintLayout> bottomSheetBehavior6 = this$0.f11565z;
                            if (bottomSheetBehavior6 != null) {
                                bottomSheetBehavior6.setState(4);
                                this$0.f11561v = ((RobertoTextView) this$0.n0(R.id.tvAddFamilyRelationship1)).getText().toString();
                                ((RobertoEditText) this$0.n0(R.id.etAddFamilyRelationship)).setText(((RobertoTextView) this$0.n0(R.id.tvAddFamilyRelationship1)).getText().toString());
                                ((RobertoTextView) this$0.n0(R.id.tvAddFamilyWarningMessage)).setVisibility(8);
                                return;
                            }
                            kotlin.jvm.internal.i.q("bottomSheetBehavior");
                            throw null;
                        case 8:
                            int i18 = ExperimentAddFamilyMemberActivity.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            BottomSheetBehavior<ConstraintLayout> bottomSheetBehavior7 = this$0.f11565z;
                            if (bottomSheetBehavior7 != null) {
                                bottomSheetBehavior7.setState(4);
                                this$0.f11561v = ((RobertoTextView) this$0.n0(R.id.tvAddFamilyRelationship2)).getText().toString();
                                ((RobertoEditText) this$0.n0(R.id.etAddFamilyRelationship)).setText(((RobertoTextView) this$0.n0(R.id.tvAddFamilyRelationship2)).getText().toString());
                                ((RobertoTextView) this$0.n0(R.id.tvAddFamilyWarningMessage)).setVisibility(8);
                                return;
                            }
                            kotlin.jvm.internal.i.q("bottomSheetBehavior");
                            throw null;
                        case 9:
                            int i19 = ExperimentAddFamilyMemberActivity.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            BottomSheetBehavior<ConstraintLayout> bottomSheetBehavior8 = this$0.f11565z;
                            if (bottomSheetBehavior8 != null) {
                                bottomSheetBehavior8.setState(4);
                                this$0.f11561v = ((RobertoTextView) this$0.n0(R.id.tvAddFamilyRelationship3)).getText().toString();
                                ((RobertoEditText) this$0.n0(R.id.etAddFamilyRelationship)).setText(((RobertoTextView) this$0.n0(R.id.tvAddFamilyRelationship3)).getText().toString());
                                ((RobertoTextView) this$0.n0(R.id.tvAddFamilyWarningMessage)).setVisibility(0);
                                return;
                            }
                            kotlin.jvm.internal.i.q("bottomSheetBehavior");
                            throw null;
                        case 10:
                            int i20 = ExperimentAddFamilyMemberActivity.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            BottomSheetBehavior<ConstraintLayout> bottomSheetBehavior9 = this$0.f11565z;
                            if (bottomSheetBehavior9 != null) {
                                bottomSheetBehavior9.setState(4);
                                this$0.f11561v = ((RobertoTextView) this$0.n0(R.id.tvAddFamilyRelationship4)).getText().toString();
                                ((RobertoEditText) this$0.n0(R.id.etAddFamilyRelationship)).setText(((RobertoTextView) this$0.n0(R.id.tvAddFamilyRelationship4)).getText().toString());
                                ((RobertoTextView) this$0.n0(R.id.tvAddFamilyWarningMessage)).setVisibility(0);
                                return;
                            }
                            kotlin.jvm.internal.i.q("bottomSheetBehavior");
                            throw null;
                        default:
                            int i21 = ExperimentAddFamilyMemberActivity.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            BottomSheetBehavior<ConstraintLayout> bottomSheetBehavior10 = this$0.f11565z;
                            if (bottomSheetBehavior10 != null) {
                                bottomSheetBehavior10.setState(4);
                                this$0.f11561v = ((RobertoTextView) this$0.n0(R.id.tvAddFamilyRelationship5)).getText().toString();
                                ((RobertoEditText) this$0.n0(R.id.etAddFamilyRelationship)).setText(((RobertoTextView) this$0.n0(R.id.tvAddFamilyRelationship5)).getText().toString());
                                ((RobertoTextView) this$0.n0(R.id.tvAddFamilyWarningMessage)).setVisibility(8);
                                return;
                            }
                            kotlin.jvm.internal.i.q("bottomSheetBehavior");
                            throw null;
                    }
                }
            });
            ((RobertoTextView) n0(R.id.tvAddFamilyRelationship4)).setOnClickListener(new View.OnClickListener(this) { // from class: so.a

                /* renamed from: v  reason: collision with root package name */
                public final /* synthetic */ ExperimentAddFamilyMemberActivity f31789v;

                {
                    this.f31789v = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    String name;
                    boolean z10;
                    boolean z11;
                    int i6 = r2;
                    ExperimentAddFamilyMemberActivity this$0 = this.f31789v;
                    switch (i6) {
                        case 0:
                            int i10 = ExperimentAddFamilyMemberActivity.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            Editable text = ((RobertoEditText) this$0.n0(R.id.etAddFamilyEmail)).getText();
                            if (text != null) {
                                name = text.toString();
                            } else {
                                name = null;
                            }
                            if (ConnectionStatusReceiver.isConnected()) {
                                if (name != null && name.length() != 0) {
                                    z10 = false;
                                } else {
                                    z10 = true;
                                }
                                if (!z10 && Utils.INSTANCE.isValidEmail(name)) {
                                    if (this$0.f11561v.length() > 0) {
                                        z11 = true;
                                    } else {
                                        z11 = false;
                                    }
                                    if (z11) {
                                        String str = this$0.f11561v;
                                        Bundle bundle3 = this$0.A;
                                        bundle3.putString(Constants.THOUGHTS_RELATIONSHIP, str);
                                        gk.a.b(bundle3, "add_family_cta_click");
                                        wo.h hVar = this$0.f11562w;
                                        if (hVar != null) {
                                            String relation = this$0.f11561v;
                                            kotlin.jvm.internal.i.g(name, "name");
                                            kotlin.jvm.internal.i.g(relation, "relation");
                                            ta.v.H(kc.f.H(hVar), null, 0, new wo.j(hVar, name, relation, null), 3);
                                            ((RobertoTextView) this$0.n0(R.id.tvAddFamilyWarningMessage)).setVisibility(8);
                                            return;
                                        }
                                        kotlin.jvm.internal.i.q("experimentAddFamilyViewModel");
                                        throw null;
                                    }
                                }
                                Toast.makeText(this$0, "Please fill all the details", 1).show();
                                return;
                            }
                            Toast.makeText(this$0, "Connect to Internet", 0).show();
                            return;
                        case 1:
                            int i11 = ExperimentAddFamilyMemberActivity.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            BottomSheetBehavior<ConstraintLayout> bottomSheetBehavior = this$0.f11565z;
                            if (bottomSheetBehavior != null) {
                                bottomSheetBehavior.setState(4);
                                this$0.f11561v = ((RobertoTextView) this$0.n0(R.id.tvAddFamilyRelationship6)).getText().toString();
                                ((RobertoEditText) this$0.n0(R.id.etAddFamilyRelationship)).setText(((RobertoTextView) this$0.n0(R.id.tvAddFamilyRelationship6)).getText().toString());
                                ((RobertoTextView) this$0.n0(R.id.tvAddFamilyWarningMessage)).setVisibility(8);
                                return;
                            }
                            kotlin.jvm.internal.i.q("bottomSheetBehavior");
                            throw null;
                        case 2:
                            int i12 = ExperimentAddFamilyMemberActivity.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            BottomSheetBehavior<ConstraintLayout> bottomSheetBehavior2 = this$0.f11565z;
                            if (bottomSheetBehavior2 != null) {
                                bottomSheetBehavior2.setState(4);
                                this$0.f11561v = ((RobertoTextView) this$0.n0(R.id.tvAddFamilyRelationship7)).getText().toString();
                                ((RobertoEditText) this$0.n0(R.id.etAddFamilyRelationship)).setText(((RobertoTextView) this$0.n0(R.id.tvAddFamilyRelationship7)).getText().toString());
                                ((RobertoTextView) this$0.n0(R.id.tvAddFamilyWarningMessage)).setVisibility(8);
                                return;
                            }
                            kotlin.jvm.internal.i.q("bottomSheetBehavior");
                            throw null;
                        case 3:
                            int i13 = ExperimentAddFamilyMemberActivity.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.finish();
                            return;
                        case 4:
                            int i14 = ExperimentAddFamilyMemberActivity.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            BottomSheetBehavior<ConstraintLayout> bottomSheetBehavior3 = this$0.f11565z;
                            if (bottomSheetBehavior3 != null) {
                                bottomSheetBehavior3.setState(4);
                                return;
                            } else {
                                kotlin.jvm.internal.i.q("bottomSheetBehavior");
                                throw null;
                            }
                        case 5:
                            int i15 = ExperimentAddFamilyMemberActivity.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            BottomSheetBehavior<ConstraintLayout> bottomSheetBehavior4 = this$0.f11565z;
                            if (bottomSheetBehavior4 != null) {
                                bottomSheetBehavior4.setState(3);
                                Object systemService = this$0.getSystemService("input_method");
                                kotlin.jvm.internal.i.e(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
                                ((InputMethodManager) systemService).hideSoftInputFromWindow(((RobertoEditText) this$0.n0(R.id.etAddFamilyEmail)).getWindowToken(), 0);
                                return;
                            }
                            kotlin.jvm.internal.i.q("bottomSheetBehavior");
                            throw null;
                        case 6:
                            int i16 = ExperimentAddFamilyMemberActivity.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            BottomSheetBehavior<ConstraintLayout> bottomSheetBehavior5 = this$0.f11565z;
                            if (bottomSheetBehavior5 != null) {
                                bottomSheetBehavior5.setState(3);
                                Object systemService2 = this$0.getSystemService("input_method");
                                kotlin.jvm.internal.i.e(systemService2, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
                                ((InputMethodManager) systemService2).hideSoftInputFromWindow(((RobertoEditText) this$0.n0(R.id.etAddFamilyEmail)).getWindowToken(), 0);
                                return;
                            }
                            kotlin.jvm.internal.i.q("bottomSheetBehavior");
                            throw null;
                        case 7:
                            int i17 = ExperimentAddFamilyMemberActivity.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            BottomSheetBehavior<ConstraintLayout> bottomSheetBehavior6 = this$0.f11565z;
                            if (bottomSheetBehavior6 != null) {
                                bottomSheetBehavior6.setState(4);
                                this$0.f11561v = ((RobertoTextView) this$0.n0(R.id.tvAddFamilyRelationship1)).getText().toString();
                                ((RobertoEditText) this$0.n0(R.id.etAddFamilyRelationship)).setText(((RobertoTextView) this$0.n0(R.id.tvAddFamilyRelationship1)).getText().toString());
                                ((RobertoTextView) this$0.n0(R.id.tvAddFamilyWarningMessage)).setVisibility(8);
                                return;
                            }
                            kotlin.jvm.internal.i.q("bottomSheetBehavior");
                            throw null;
                        case 8:
                            int i18 = ExperimentAddFamilyMemberActivity.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            BottomSheetBehavior<ConstraintLayout> bottomSheetBehavior7 = this$0.f11565z;
                            if (bottomSheetBehavior7 != null) {
                                bottomSheetBehavior7.setState(4);
                                this$0.f11561v = ((RobertoTextView) this$0.n0(R.id.tvAddFamilyRelationship2)).getText().toString();
                                ((RobertoEditText) this$0.n0(R.id.etAddFamilyRelationship)).setText(((RobertoTextView) this$0.n0(R.id.tvAddFamilyRelationship2)).getText().toString());
                                ((RobertoTextView) this$0.n0(R.id.tvAddFamilyWarningMessage)).setVisibility(8);
                                return;
                            }
                            kotlin.jvm.internal.i.q("bottomSheetBehavior");
                            throw null;
                        case 9:
                            int i19 = ExperimentAddFamilyMemberActivity.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            BottomSheetBehavior<ConstraintLayout> bottomSheetBehavior8 = this$0.f11565z;
                            if (bottomSheetBehavior8 != null) {
                                bottomSheetBehavior8.setState(4);
                                this$0.f11561v = ((RobertoTextView) this$0.n0(R.id.tvAddFamilyRelationship3)).getText().toString();
                                ((RobertoEditText) this$0.n0(R.id.etAddFamilyRelationship)).setText(((RobertoTextView) this$0.n0(R.id.tvAddFamilyRelationship3)).getText().toString());
                                ((RobertoTextView) this$0.n0(R.id.tvAddFamilyWarningMessage)).setVisibility(0);
                                return;
                            }
                            kotlin.jvm.internal.i.q("bottomSheetBehavior");
                            throw null;
                        case 10:
                            int i20 = ExperimentAddFamilyMemberActivity.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            BottomSheetBehavior<ConstraintLayout> bottomSheetBehavior9 = this$0.f11565z;
                            if (bottomSheetBehavior9 != null) {
                                bottomSheetBehavior9.setState(4);
                                this$0.f11561v = ((RobertoTextView) this$0.n0(R.id.tvAddFamilyRelationship4)).getText().toString();
                                ((RobertoEditText) this$0.n0(R.id.etAddFamilyRelationship)).setText(((RobertoTextView) this$0.n0(R.id.tvAddFamilyRelationship4)).getText().toString());
                                ((RobertoTextView) this$0.n0(R.id.tvAddFamilyWarningMessage)).setVisibility(0);
                                return;
                            }
                            kotlin.jvm.internal.i.q("bottomSheetBehavior");
                            throw null;
                        default:
                            int i21 = ExperimentAddFamilyMemberActivity.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            BottomSheetBehavior<ConstraintLayout> bottomSheetBehavior10 = this$0.f11565z;
                            if (bottomSheetBehavior10 != null) {
                                bottomSheetBehavior10.setState(4);
                                this$0.f11561v = ((RobertoTextView) this$0.n0(R.id.tvAddFamilyRelationship5)).getText().toString();
                                ((RobertoEditText) this$0.n0(R.id.etAddFamilyRelationship)).setText(((RobertoTextView) this$0.n0(R.id.tvAddFamilyRelationship5)).getText().toString());
                                ((RobertoTextView) this$0.n0(R.id.tvAddFamilyWarningMessage)).setVisibility(8);
                                return;
                            }
                            kotlin.jvm.internal.i.q("bottomSheetBehavior");
                            throw null;
                    }
                }
            });
            ((RobertoTextView) n0(R.id.tvAddFamilyRelationship5)).setOnClickListener(new View.OnClickListener(this) { // from class: so.a

                /* renamed from: v  reason: collision with root package name */
                public final /* synthetic */ ExperimentAddFamilyMemberActivity f31789v;

                {
                    this.f31789v = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    String name;
                    boolean z10;
                    boolean z11;
                    int i6 = r2;
                    ExperimentAddFamilyMemberActivity this$0 = this.f31789v;
                    switch (i6) {
                        case 0:
                            int i10 = ExperimentAddFamilyMemberActivity.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            Editable text = ((RobertoEditText) this$0.n0(R.id.etAddFamilyEmail)).getText();
                            if (text != null) {
                                name = text.toString();
                            } else {
                                name = null;
                            }
                            if (ConnectionStatusReceiver.isConnected()) {
                                if (name != null && name.length() != 0) {
                                    z10 = false;
                                } else {
                                    z10 = true;
                                }
                                if (!z10 && Utils.INSTANCE.isValidEmail(name)) {
                                    if (this$0.f11561v.length() > 0) {
                                        z11 = true;
                                    } else {
                                        z11 = false;
                                    }
                                    if (z11) {
                                        String str = this$0.f11561v;
                                        Bundle bundle3 = this$0.A;
                                        bundle3.putString(Constants.THOUGHTS_RELATIONSHIP, str);
                                        gk.a.b(bundle3, "add_family_cta_click");
                                        wo.h hVar = this$0.f11562w;
                                        if (hVar != null) {
                                            String relation = this$0.f11561v;
                                            kotlin.jvm.internal.i.g(name, "name");
                                            kotlin.jvm.internal.i.g(relation, "relation");
                                            ta.v.H(kc.f.H(hVar), null, 0, new wo.j(hVar, name, relation, null), 3);
                                            ((RobertoTextView) this$0.n0(R.id.tvAddFamilyWarningMessage)).setVisibility(8);
                                            return;
                                        }
                                        kotlin.jvm.internal.i.q("experimentAddFamilyViewModel");
                                        throw null;
                                    }
                                }
                                Toast.makeText(this$0, "Please fill all the details", 1).show();
                                return;
                            }
                            Toast.makeText(this$0, "Connect to Internet", 0).show();
                            return;
                        case 1:
                            int i11 = ExperimentAddFamilyMemberActivity.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            BottomSheetBehavior<ConstraintLayout> bottomSheetBehavior = this$0.f11565z;
                            if (bottomSheetBehavior != null) {
                                bottomSheetBehavior.setState(4);
                                this$0.f11561v = ((RobertoTextView) this$0.n0(R.id.tvAddFamilyRelationship6)).getText().toString();
                                ((RobertoEditText) this$0.n0(R.id.etAddFamilyRelationship)).setText(((RobertoTextView) this$0.n0(R.id.tvAddFamilyRelationship6)).getText().toString());
                                ((RobertoTextView) this$0.n0(R.id.tvAddFamilyWarningMessage)).setVisibility(8);
                                return;
                            }
                            kotlin.jvm.internal.i.q("bottomSheetBehavior");
                            throw null;
                        case 2:
                            int i12 = ExperimentAddFamilyMemberActivity.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            BottomSheetBehavior<ConstraintLayout> bottomSheetBehavior2 = this$0.f11565z;
                            if (bottomSheetBehavior2 != null) {
                                bottomSheetBehavior2.setState(4);
                                this$0.f11561v = ((RobertoTextView) this$0.n0(R.id.tvAddFamilyRelationship7)).getText().toString();
                                ((RobertoEditText) this$0.n0(R.id.etAddFamilyRelationship)).setText(((RobertoTextView) this$0.n0(R.id.tvAddFamilyRelationship7)).getText().toString());
                                ((RobertoTextView) this$0.n0(R.id.tvAddFamilyWarningMessage)).setVisibility(8);
                                return;
                            }
                            kotlin.jvm.internal.i.q("bottomSheetBehavior");
                            throw null;
                        case 3:
                            int i13 = ExperimentAddFamilyMemberActivity.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.finish();
                            return;
                        case 4:
                            int i14 = ExperimentAddFamilyMemberActivity.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            BottomSheetBehavior<ConstraintLayout> bottomSheetBehavior3 = this$0.f11565z;
                            if (bottomSheetBehavior3 != null) {
                                bottomSheetBehavior3.setState(4);
                                return;
                            } else {
                                kotlin.jvm.internal.i.q("bottomSheetBehavior");
                                throw null;
                            }
                        case 5:
                            int i15 = ExperimentAddFamilyMemberActivity.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            BottomSheetBehavior<ConstraintLayout> bottomSheetBehavior4 = this$0.f11565z;
                            if (bottomSheetBehavior4 != null) {
                                bottomSheetBehavior4.setState(3);
                                Object systemService = this$0.getSystemService("input_method");
                                kotlin.jvm.internal.i.e(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
                                ((InputMethodManager) systemService).hideSoftInputFromWindow(((RobertoEditText) this$0.n0(R.id.etAddFamilyEmail)).getWindowToken(), 0);
                                return;
                            }
                            kotlin.jvm.internal.i.q("bottomSheetBehavior");
                            throw null;
                        case 6:
                            int i16 = ExperimentAddFamilyMemberActivity.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            BottomSheetBehavior<ConstraintLayout> bottomSheetBehavior5 = this$0.f11565z;
                            if (bottomSheetBehavior5 != null) {
                                bottomSheetBehavior5.setState(3);
                                Object systemService2 = this$0.getSystemService("input_method");
                                kotlin.jvm.internal.i.e(systemService2, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
                                ((InputMethodManager) systemService2).hideSoftInputFromWindow(((RobertoEditText) this$0.n0(R.id.etAddFamilyEmail)).getWindowToken(), 0);
                                return;
                            }
                            kotlin.jvm.internal.i.q("bottomSheetBehavior");
                            throw null;
                        case 7:
                            int i17 = ExperimentAddFamilyMemberActivity.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            BottomSheetBehavior<ConstraintLayout> bottomSheetBehavior6 = this$0.f11565z;
                            if (bottomSheetBehavior6 != null) {
                                bottomSheetBehavior6.setState(4);
                                this$0.f11561v = ((RobertoTextView) this$0.n0(R.id.tvAddFamilyRelationship1)).getText().toString();
                                ((RobertoEditText) this$0.n0(R.id.etAddFamilyRelationship)).setText(((RobertoTextView) this$0.n0(R.id.tvAddFamilyRelationship1)).getText().toString());
                                ((RobertoTextView) this$0.n0(R.id.tvAddFamilyWarningMessage)).setVisibility(8);
                                return;
                            }
                            kotlin.jvm.internal.i.q("bottomSheetBehavior");
                            throw null;
                        case 8:
                            int i18 = ExperimentAddFamilyMemberActivity.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            BottomSheetBehavior<ConstraintLayout> bottomSheetBehavior7 = this$0.f11565z;
                            if (bottomSheetBehavior7 != null) {
                                bottomSheetBehavior7.setState(4);
                                this$0.f11561v = ((RobertoTextView) this$0.n0(R.id.tvAddFamilyRelationship2)).getText().toString();
                                ((RobertoEditText) this$0.n0(R.id.etAddFamilyRelationship)).setText(((RobertoTextView) this$0.n0(R.id.tvAddFamilyRelationship2)).getText().toString());
                                ((RobertoTextView) this$0.n0(R.id.tvAddFamilyWarningMessage)).setVisibility(8);
                                return;
                            }
                            kotlin.jvm.internal.i.q("bottomSheetBehavior");
                            throw null;
                        case 9:
                            int i19 = ExperimentAddFamilyMemberActivity.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            BottomSheetBehavior<ConstraintLayout> bottomSheetBehavior8 = this$0.f11565z;
                            if (bottomSheetBehavior8 != null) {
                                bottomSheetBehavior8.setState(4);
                                this$0.f11561v = ((RobertoTextView) this$0.n0(R.id.tvAddFamilyRelationship3)).getText().toString();
                                ((RobertoEditText) this$0.n0(R.id.etAddFamilyRelationship)).setText(((RobertoTextView) this$0.n0(R.id.tvAddFamilyRelationship3)).getText().toString());
                                ((RobertoTextView) this$0.n0(R.id.tvAddFamilyWarningMessage)).setVisibility(0);
                                return;
                            }
                            kotlin.jvm.internal.i.q("bottomSheetBehavior");
                            throw null;
                        case 10:
                            int i20 = ExperimentAddFamilyMemberActivity.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            BottomSheetBehavior<ConstraintLayout> bottomSheetBehavior9 = this$0.f11565z;
                            if (bottomSheetBehavior9 != null) {
                                bottomSheetBehavior9.setState(4);
                                this$0.f11561v = ((RobertoTextView) this$0.n0(R.id.tvAddFamilyRelationship4)).getText().toString();
                                ((RobertoEditText) this$0.n0(R.id.etAddFamilyRelationship)).setText(((RobertoTextView) this$0.n0(R.id.tvAddFamilyRelationship4)).getText().toString());
                                ((RobertoTextView) this$0.n0(R.id.tvAddFamilyWarningMessage)).setVisibility(0);
                                return;
                            }
                            kotlin.jvm.internal.i.q("bottomSheetBehavior");
                            throw null;
                        default:
                            int i21 = ExperimentAddFamilyMemberActivity.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            BottomSheetBehavior<ConstraintLayout> bottomSheetBehavior10 = this$0.f11565z;
                            if (bottomSheetBehavior10 != null) {
                                bottomSheetBehavior10.setState(4);
                                this$0.f11561v = ((RobertoTextView) this$0.n0(R.id.tvAddFamilyRelationship5)).getText().toString();
                                ((RobertoEditText) this$0.n0(R.id.etAddFamilyRelationship)).setText(((RobertoTextView) this$0.n0(R.id.tvAddFamilyRelationship5)).getText().toString());
                                ((RobertoTextView) this$0.n0(R.id.tvAddFamilyWarningMessage)).setVisibility(8);
                                return;
                            }
                            kotlin.jvm.internal.i.q("bottomSheetBehavior");
                            throw null;
                    }
                }
            });
            ((RobertoTextView) n0(R.id.tvAddFamilyRelationship6)).setOnClickListener(new View.OnClickListener(this) { // from class: so.a

                /* renamed from: v  reason: collision with root package name */
                public final /* synthetic */ ExperimentAddFamilyMemberActivity f31789v;

                {
                    this.f31789v = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    String name;
                    boolean z10;
                    boolean z11;
                    int i6 = r2;
                    ExperimentAddFamilyMemberActivity this$0 = this.f31789v;
                    switch (i6) {
                        case 0:
                            int i10 = ExperimentAddFamilyMemberActivity.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            Editable text = ((RobertoEditText) this$0.n0(R.id.etAddFamilyEmail)).getText();
                            if (text != null) {
                                name = text.toString();
                            } else {
                                name = null;
                            }
                            if (ConnectionStatusReceiver.isConnected()) {
                                if (name != null && name.length() != 0) {
                                    z10 = false;
                                } else {
                                    z10 = true;
                                }
                                if (!z10 && Utils.INSTANCE.isValidEmail(name)) {
                                    if (this$0.f11561v.length() > 0) {
                                        z11 = true;
                                    } else {
                                        z11 = false;
                                    }
                                    if (z11) {
                                        String str = this$0.f11561v;
                                        Bundle bundle3 = this$0.A;
                                        bundle3.putString(Constants.THOUGHTS_RELATIONSHIP, str);
                                        gk.a.b(bundle3, "add_family_cta_click");
                                        wo.h hVar = this$0.f11562w;
                                        if (hVar != null) {
                                            String relation = this$0.f11561v;
                                            kotlin.jvm.internal.i.g(name, "name");
                                            kotlin.jvm.internal.i.g(relation, "relation");
                                            ta.v.H(kc.f.H(hVar), null, 0, new wo.j(hVar, name, relation, null), 3);
                                            ((RobertoTextView) this$0.n0(R.id.tvAddFamilyWarningMessage)).setVisibility(8);
                                            return;
                                        }
                                        kotlin.jvm.internal.i.q("experimentAddFamilyViewModel");
                                        throw null;
                                    }
                                }
                                Toast.makeText(this$0, "Please fill all the details", 1).show();
                                return;
                            }
                            Toast.makeText(this$0, "Connect to Internet", 0).show();
                            return;
                        case 1:
                            int i11 = ExperimentAddFamilyMemberActivity.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            BottomSheetBehavior<ConstraintLayout> bottomSheetBehavior = this$0.f11565z;
                            if (bottomSheetBehavior != null) {
                                bottomSheetBehavior.setState(4);
                                this$0.f11561v = ((RobertoTextView) this$0.n0(R.id.tvAddFamilyRelationship6)).getText().toString();
                                ((RobertoEditText) this$0.n0(R.id.etAddFamilyRelationship)).setText(((RobertoTextView) this$0.n0(R.id.tvAddFamilyRelationship6)).getText().toString());
                                ((RobertoTextView) this$0.n0(R.id.tvAddFamilyWarningMessage)).setVisibility(8);
                                return;
                            }
                            kotlin.jvm.internal.i.q("bottomSheetBehavior");
                            throw null;
                        case 2:
                            int i12 = ExperimentAddFamilyMemberActivity.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            BottomSheetBehavior<ConstraintLayout> bottomSheetBehavior2 = this$0.f11565z;
                            if (bottomSheetBehavior2 != null) {
                                bottomSheetBehavior2.setState(4);
                                this$0.f11561v = ((RobertoTextView) this$0.n0(R.id.tvAddFamilyRelationship7)).getText().toString();
                                ((RobertoEditText) this$0.n0(R.id.etAddFamilyRelationship)).setText(((RobertoTextView) this$0.n0(R.id.tvAddFamilyRelationship7)).getText().toString());
                                ((RobertoTextView) this$0.n0(R.id.tvAddFamilyWarningMessage)).setVisibility(8);
                                return;
                            }
                            kotlin.jvm.internal.i.q("bottomSheetBehavior");
                            throw null;
                        case 3:
                            int i13 = ExperimentAddFamilyMemberActivity.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.finish();
                            return;
                        case 4:
                            int i14 = ExperimentAddFamilyMemberActivity.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            BottomSheetBehavior<ConstraintLayout> bottomSheetBehavior3 = this$0.f11565z;
                            if (bottomSheetBehavior3 != null) {
                                bottomSheetBehavior3.setState(4);
                                return;
                            } else {
                                kotlin.jvm.internal.i.q("bottomSheetBehavior");
                                throw null;
                            }
                        case 5:
                            int i15 = ExperimentAddFamilyMemberActivity.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            BottomSheetBehavior<ConstraintLayout> bottomSheetBehavior4 = this$0.f11565z;
                            if (bottomSheetBehavior4 != null) {
                                bottomSheetBehavior4.setState(3);
                                Object systemService = this$0.getSystemService("input_method");
                                kotlin.jvm.internal.i.e(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
                                ((InputMethodManager) systemService).hideSoftInputFromWindow(((RobertoEditText) this$0.n0(R.id.etAddFamilyEmail)).getWindowToken(), 0);
                                return;
                            }
                            kotlin.jvm.internal.i.q("bottomSheetBehavior");
                            throw null;
                        case 6:
                            int i16 = ExperimentAddFamilyMemberActivity.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            BottomSheetBehavior<ConstraintLayout> bottomSheetBehavior5 = this$0.f11565z;
                            if (bottomSheetBehavior5 != null) {
                                bottomSheetBehavior5.setState(3);
                                Object systemService2 = this$0.getSystemService("input_method");
                                kotlin.jvm.internal.i.e(systemService2, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
                                ((InputMethodManager) systemService2).hideSoftInputFromWindow(((RobertoEditText) this$0.n0(R.id.etAddFamilyEmail)).getWindowToken(), 0);
                                return;
                            }
                            kotlin.jvm.internal.i.q("bottomSheetBehavior");
                            throw null;
                        case 7:
                            int i17 = ExperimentAddFamilyMemberActivity.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            BottomSheetBehavior<ConstraintLayout> bottomSheetBehavior6 = this$0.f11565z;
                            if (bottomSheetBehavior6 != null) {
                                bottomSheetBehavior6.setState(4);
                                this$0.f11561v = ((RobertoTextView) this$0.n0(R.id.tvAddFamilyRelationship1)).getText().toString();
                                ((RobertoEditText) this$0.n0(R.id.etAddFamilyRelationship)).setText(((RobertoTextView) this$0.n0(R.id.tvAddFamilyRelationship1)).getText().toString());
                                ((RobertoTextView) this$0.n0(R.id.tvAddFamilyWarningMessage)).setVisibility(8);
                                return;
                            }
                            kotlin.jvm.internal.i.q("bottomSheetBehavior");
                            throw null;
                        case 8:
                            int i18 = ExperimentAddFamilyMemberActivity.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            BottomSheetBehavior<ConstraintLayout> bottomSheetBehavior7 = this$0.f11565z;
                            if (bottomSheetBehavior7 != null) {
                                bottomSheetBehavior7.setState(4);
                                this$0.f11561v = ((RobertoTextView) this$0.n0(R.id.tvAddFamilyRelationship2)).getText().toString();
                                ((RobertoEditText) this$0.n0(R.id.etAddFamilyRelationship)).setText(((RobertoTextView) this$0.n0(R.id.tvAddFamilyRelationship2)).getText().toString());
                                ((RobertoTextView) this$0.n0(R.id.tvAddFamilyWarningMessage)).setVisibility(8);
                                return;
                            }
                            kotlin.jvm.internal.i.q("bottomSheetBehavior");
                            throw null;
                        case 9:
                            int i19 = ExperimentAddFamilyMemberActivity.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            BottomSheetBehavior<ConstraintLayout> bottomSheetBehavior8 = this$0.f11565z;
                            if (bottomSheetBehavior8 != null) {
                                bottomSheetBehavior8.setState(4);
                                this$0.f11561v = ((RobertoTextView) this$0.n0(R.id.tvAddFamilyRelationship3)).getText().toString();
                                ((RobertoEditText) this$0.n0(R.id.etAddFamilyRelationship)).setText(((RobertoTextView) this$0.n0(R.id.tvAddFamilyRelationship3)).getText().toString());
                                ((RobertoTextView) this$0.n0(R.id.tvAddFamilyWarningMessage)).setVisibility(0);
                                return;
                            }
                            kotlin.jvm.internal.i.q("bottomSheetBehavior");
                            throw null;
                        case 10:
                            int i20 = ExperimentAddFamilyMemberActivity.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            BottomSheetBehavior<ConstraintLayout> bottomSheetBehavior9 = this$0.f11565z;
                            if (bottomSheetBehavior9 != null) {
                                bottomSheetBehavior9.setState(4);
                                this$0.f11561v = ((RobertoTextView) this$0.n0(R.id.tvAddFamilyRelationship4)).getText().toString();
                                ((RobertoEditText) this$0.n0(R.id.etAddFamilyRelationship)).setText(((RobertoTextView) this$0.n0(R.id.tvAddFamilyRelationship4)).getText().toString());
                                ((RobertoTextView) this$0.n0(R.id.tvAddFamilyWarningMessage)).setVisibility(0);
                                return;
                            }
                            kotlin.jvm.internal.i.q("bottomSheetBehavior");
                            throw null;
                        default:
                            int i21 = ExperimentAddFamilyMemberActivity.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            BottomSheetBehavior<ConstraintLayout> bottomSheetBehavior10 = this$0.f11565z;
                            if (bottomSheetBehavior10 != null) {
                                bottomSheetBehavior10.setState(4);
                                this$0.f11561v = ((RobertoTextView) this$0.n0(R.id.tvAddFamilyRelationship5)).getText().toString();
                                ((RobertoEditText) this$0.n0(R.id.etAddFamilyRelationship)).setText(((RobertoTextView) this$0.n0(R.id.tvAddFamilyRelationship5)).getText().toString());
                                ((RobertoTextView) this$0.n0(R.id.tvAddFamilyWarningMessage)).setVisibility(8);
                                return;
                            }
                            kotlin.jvm.internal.i.q("bottomSheetBehavior");
                            throw null;
                    }
                }
            });
            ((RobertoTextView) n0(R.id.tvAddFamilyRelationship7)).setOnClickListener(new View.OnClickListener(this) { // from class: so.a

                /* renamed from: v  reason: collision with root package name */
                public final /* synthetic */ ExperimentAddFamilyMemberActivity f31789v;

                {
                    this.f31789v = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    String name;
                    boolean z10;
                    boolean z11;
                    int i6 = r2;
                    ExperimentAddFamilyMemberActivity this$0 = this.f31789v;
                    switch (i6) {
                        case 0:
                            int i10 = ExperimentAddFamilyMemberActivity.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            Editable text = ((RobertoEditText) this$0.n0(R.id.etAddFamilyEmail)).getText();
                            if (text != null) {
                                name = text.toString();
                            } else {
                                name = null;
                            }
                            if (ConnectionStatusReceiver.isConnected()) {
                                if (name != null && name.length() != 0) {
                                    z10 = false;
                                } else {
                                    z10 = true;
                                }
                                if (!z10 && Utils.INSTANCE.isValidEmail(name)) {
                                    if (this$0.f11561v.length() > 0) {
                                        z11 = true;
                                    } else {
                                        z11 = false;
                                    }
                                    if (z11) {
                                        String str = this$0.f11561v;
                                        Bundle bundle3 = this$0.A;
                                        bundle3.putString(Constants.THOUGHTS_RELATIONSHIP, str);
                                        gk.a.b(bundle3, "add_family_cta_click");
                                        wo.h hVar = this$0.f11562w;
                                        if (hVar != null) {
                                            String relation = this$0.f11561v;
                                            kotlin.jvm.internal.i.g(name, "name");
                                            kotlin.jvm.internal.i.g(relation, "relation");
                                            ta.v.H(kc.f.H(hVar), null, 0, new wo.j(hVar, name, relation, null), 3);
                                            ((RobertoTextView) this$0.n0(R.id.tvAddFamilyWarningMessage)).setVisibility(8);
                                            return;
                                        }
                                        kotlin.jvm.internal.i.q("experimentAddFamilyViewModel");
                                        throw null;
                                    }
                                }
                                Toast.makeText(this$0, "Please fill all the details", 1).show();
                                return;
                            }
                            Toast.makeText(this$0, "Connect to Internet", 0).show();
                            return;
                        case 1:
                            int i11 = ExperimentAddFamilyMemberActivity.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            BottomSheetBehavior<ConstraintLayout> bottomSheetBehavior = this$0.f11565z;
                            if (bottomSheetBehavior != null) {
                                bottomSheetBehavior.setState(4);
                                this$0.f11561v = ((RobertoTextView) this$0.n0(R.id.tvAddFamilyRelationship6)).getText().toString();
                                ((RobertoEditText) this$0.n0(R.id.etAddFamilyRelationship)).setText(((RobertoTextView) this$0.n0(R.id.tvAddFamilyRelationship6)).getText().toString());
                                ((RobertoTextView) this$0.n0(R.id.tvAddFamilyWarningMessage)).setVisibility(8);
                                return;
                            }
                            kotlin.jvm.internal.i.q("bottomSheetBehavior");
                            throw null;
                        case 2:
                            int i12 = ExperimentAddFamilyMemberActivity.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            BottomSheetBehavior<ConstraintLayout> bottomSheetBehavior2 = this$0.f11565z;
                            if (bottomSheetBehavior2 != null) {
                                bottomSheetBehavior2.setState(4);
                                this$0.f11561v = ((RobertoTextView) this$0.n0(R.id.tvAddFamilyRelationship7)).getText().toString();
                                ((RobertoEditText) this$0.n0(R.id.etAddFamilyRelationship)).setText(((RobertoTextView) this$0.n0(R.id.tvAddFamilyRelationship7)).getText().toString());
                                ((RobertoTextView) this$0.n0(R.id.tvAddFamilyWarningMessage)).setVisibility(8);
                                return;
                            }
                            kotlin.jvm.internal.i.q("bottomSheetBehavior");
                            throw null;
                        case 3:
                            int i13 = ExperimentAddFamilyMemberActivity.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.finish();
                            return;
                        case 4:
                            int i14 = ExperimentAddFamilyMemberActivity.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            BottomSheetBehavior<ConstraintLayout> bottomSheetBehavior3 = this$0.f11565z;
                            if (bottomSheetBehavior3 != null) {
                                bottomSheetBehavior3.setState(4);
                                return;
                            } else {
                                kotlin.jvm.internal.i.q("bottomSheetBehavior");
                                throw null;
                            }
                        case 5:
                            int i15 = ExperimentAddFamilyMemberActivity.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            BottomSheetBehavior<ConstraintLayout> bottomSheetBehavior4 = this$0.f11565z;
                            if (bottomSheetBehavior4 != null) {
                                bottomSheetBehavior4.setState(3);
                                Object systemService = this$0.getSystemService("input_method");
                                kotlin.jvm.internal.i.e(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
                                ((InputMethodManager) systemService).hideSoftInputFromWindow(((RobertoEditText) this$0.n0(R.id.etAddFamilyEmail)).getWindowToken(), 0);
                                return;
                            }
                            kotlin.jvm.internal.i.q("bottomSheetBehavior");
                            throw null;
                        case 6:
                            int i16 = ExperimentAddFamilyMemberActivity.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            BottomSheetBehavior<ConstraintLayout> bottomSheetBehavior5 = this$0.f11565z;
                            if (bottomSheetBehavior5 != null) {
                                bottomSheetBehavior5.setState(3);
                                Object systemService2 = this$0.getSystemService("input_method");
                                kotlin.jvm.internal.i.e(systemService2, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
                                ((InputMethodManager) systemService2).hideSoftInputFromWindow(((RobertoEditText) this$0.n0(R.id.etAddFamilyEmail)).getWindowToken(), 0);
                                return;
                            }
                            kotlin.jvm.internal.i.q("bottomSheetBehavior");
                            throw null;
                        case 7:
                            int i17 = ExperimentAddFamilyMemberActivity.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            BottomSheetBehavior<ConstraintLayout> bottomSheetBehavior6 = this$0.f11565z;
                            if (bottomSheetBehavior6 != null) {
                                bottomSheetBehavior6.setState(4);
                                this$0.f11561v = ((RobertoTextView) this$0.n0(R.id.tvAddFamilyRelationship1)).getText().toString();
                                ((RobertoEditText) this$0.n0(R.id.etAddFamilyRelationship)).setText(((RobertoTextView) this$0.n0(R.id.tvAddFamilyRelationship1)).getText().toString());
                                ((RobertoTextView) this$0.n0(R.id.tvAddFamilyWarningMessage)).setVisibility(8);
                                return;
                            }
                            kotlin.jvm.internal.i.q("bottomSheetBehavior");
                            throw null;
                        case 8:
                            int i18 = ExperimentAddFamilyMemberActivity.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            BottomSheetBehavior<ConstraintLayout> bottomSheetBehavior7 = this$0.f11565z;
                            if (bottomSheetBehavior7 != null) {
                                bottomSheetBehavior7.setState(4);
                                this$0.f11561v = ((RobertoTextView) this$0.n0(R.id.tvAddFamilyRelationship2)).getText().toString();
                                ((RobertoEditText) this$0.n0(R.id.etAddFamilyRelationship)).setText(((RobertoTextView) this$0.n0(R.id.tvAddFamilyRelationship2)).getText().toString());
                                ((RobertoTextView) this$0.n0(R.id.tvAddFamilyWarningMessage)).setVisibility(8);
                                return;
                            }
                            kotlin.jvm.internal.i.q("bottomSheetBehavior");
                            throw null;
                        case 9:
                            int i19 = ExperimentAddFamilyMemberActivity.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            BottomSheetBehavior<ConstraintLayout> bottomSheetBehavior8 = this$0.f11565z;
                            if (bottomSheetBehavior8 != null) {
                                bottomSheetBehavior8.setState(4);
                                this$0.f11561v = ((RobertoTextView) this$0.n0(R.id.tvAddFamilyRelationship3)).getText().toString();
                                ((RobertoEditText) this$0.n0(R.id.etAddFamilyRelationship)).setText(((RobertoTextView) this$0.n0(R.id.tvAddFamilyRelationship3)).getText().toString());
                                ((RobertoTextView) this$0.n0(R.id.tvAddFamilyWarningMessage)).setVisibility(0);
                                return;
                            }
                            kotlin.jvm.internal.i.q("bottomSheetBehavior");
                            throw null;
                        case 10:
                            int i20 = ExperimentAddFamilyMemberActivity.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            BottomSheetBehavior<ConstraintLayout> bottomSheetBehavior9 = this$0.f11565z;
                            if (bottomSheetBehavior9 != null) {
                                bottomSheetBehavior9.setState(4);
                                this$0.f11561v = ((RobertoTextView) this$0.n0(R.id.tvAddFamilyRelationship4)).getText().toString();
                                ((RobertoEditText) this$0.n0(R.id.etAddFamilyRelationship)).setText(((RobertoTextView) this$0.n0(R.id.tvAddFamilyRelationship4)).getText().toString());
                                ((RobertoTextView) this$0.n0(R.id.tvAddFamilyWarningMessage)).setVisibility(0);
                                return;
                            }
                            kotlin.jvm.internal.i.q("bottomSheetBehavior");
                            throw null;
                        default:
                            int i21 = ExperimentAddFamilyMemberActivity.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            BottomSheetBehavior<ConstraintLayout> bottomSheetBehavior10 = this$0.f11565z;
                            if (bottomSheetBehavior10 != null) {
                                bottomSheetBehavior10.setState(4);
                                this$0.f11561v = ((RobertoTextView) this$0.n0(R.id.tvAddFamilyRelationship5)).getText().toString();
                                ((RobertoEditText) this$0.n0(R.id.etAddFamilyRelationship)).setText(((RobertoTextView) this$0.n0(R.id.tvAddFamilyRelationship5)).getText().toString());
                                ((RobertoTextView) this$0.n0(R.id.tvAddFamilyWarningMessage)).setVisibility(8);
                                return;
                            }
                            kotlin.jvm.internal.i.q("bottomSheetBehavior");
                            throw null;
                    }
                }
            });
            h hVar = (h) new o0(this).a(h.class);
            i.g(hVar, "<set-?>");
            this.f11562w = hVar;
            hVar.f36900y.e(this, new ko.b(5, new so.c(this)));
            hVar.f36901z.e(this, new ko.b(6, new d(this)));
            hVar.A.e(this, new ko.b(7, new e(this)));
            hVar.B.e(this, new ko.b(8, new so.f(this)));
            return;
        }
        i.q("progressDialog");
        throw null;
    }
}
