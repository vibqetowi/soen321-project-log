package so;

import android.app.ProgressDialog;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.components.profile.experiment.activities.ExperimentAddFamilyMemberActivity;
import com.theinnerhour.b2b.widgets.RobertoEditText;
/* compiled from: ExperimentAddFamilyMemberActivity.kt */
/* loaded from: classes2.dex */
public final class d extends kotlin.jvm.internal.k implements ss.l<Boolean, hs.k> {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ ExperimentAddFamilyMemberActivity f31798u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(ExperimentAddFamilyMemberActivity experimentAddFamilyMemberActivity) {
        super(1);
        this.f31798u = experimentAddFamilyMemberActivity;
    }

    @Override // ss.l
    public final hs.k invoke(Boolean bool) {
        Boolean bool2 = bool;
        if (bool2 != null) {
            bool2.booleanValue();
            boolean booleanValue = bool2.booleanValue();
            ExperimentAddFamilyMemberActivity experimentAddFamilyMemberActivity = this.f31798u;
            if (booleanValue) {
                ProgressDialog progressDialog = experimentAddFamilyMemberActivity.f11563x;
                if (progressDialog != null) {
                    progressDialog.show();
                } else {
                    kotlin.jvm.internal.i.q("progressDialog");
                    throw null;
                }
            } else {
                experimentAddFamilyMemberActivity.getClass();
                experimentAddFamilyMemberActivity.f11561v = "";
                ((RobertoEditText) experimentAddFamilyMemberActivity.n0(R.id.etAddFamilyEmail)).setText("");
                ((RobertoEditText) experimentAddFamilyMemberActivity.n0(R.id.etAddFamilyRelationship)).setText("");
                ProgressDialog progressDialog2 = experimentAddFamilyMemberActivity.f11563x;
                if (progressDialog2 != null) {
                    progressDialog2.dismiss();
                } else {
                    kotlin.jvm.internal.i.q("progressDialog");
                    throw null;
                }
            }
        }
        return hs.k.f19476a;
    }
}
