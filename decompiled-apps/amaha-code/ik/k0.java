package ik;

import android.app.Dialog;
import android.view.Window;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.utils.UiUtils;
import com.theinnerhour.b2b.utils.UtilsKt;
/* compiled from: ExptInitialAssessmentResultFragment.kt */
/* loaded from: classes2.dex */
public final class k0 extends kotlin.jvm.internal.k implements ss.a<hs.k> {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ j0 f20218u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(j0 j0Var) {
        super(0);
        this.f20218u = j0Var;
    }

    @Override // ss.a
    public final hs.k invoke() {
        UiUtils.Companion companion = UiUtils.Companion;
        j0 j0Var = this.f20218u;
        Dialog styledDialog = companion.getStyledDialog(R.layout.dialog_initial_assessment_graph, j0Var.requireContext(), R.style.Theme_Dialog_Fullscreen);
        styledDialog.findViewById(R.id.btnGraphDialogBack).setOnClickListener(new dk.n(styledDialog, 4));
        styledDialog.findViewById(R.id.btnGraphDialogDone).setOnClickListener(new dk.n(styledDialog, 5));
        Window window = styledDialog.getWindow();
        if (window != null) {
            window.setLayout(-1, -1);
        }
        int i6 = j0.G;
        UtilsKt.logError(j0Var.f20203u, "Error displaying symptoms dialog", new i0(styledDialog, j0Var));
        styledDialog.show();
        return hs.k.f19476a;
    }
}
