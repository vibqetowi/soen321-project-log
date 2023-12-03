package so;

import androidx.appcompat.widget.AppCompatImageView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.components.profile.experiment.activities.ExperimentAddFamilyMemberActivity;
import com.theinnerhour.b2b.model.AddFamilyMember;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import java.util.ArrayList;
/* compiled from: ExperimentAddFamilyMemberActivity.kt */
/* loaded from: classes2.dex */
public final class c extends kotlin.jvm.internal.k implements ss.l<ArrayList<AddFamilyMember>, hs.k> {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ ExperimentAddFamilyMemberActivity f31795u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(ExperimentAddFamilyMemberActivity experimentAddFamilyMemberActivity) {
        super(1);
        this.f31795u = experimentAddFamilyMemberActivity;
    }

    @Override // ss.l
    public final hs.k invoke(ArrayList<AddFamilyMember> arrayList) {
        ArrayList<AddFamilyMember> arrayList2 = arrayList;
        if (arrayList2 != null) {
            ExperimentAddFamilyMemberActivity experimentAddFamilyMemberActivity = this.f31795u;
            experimentAddFamilyMemberActivity.f11564y = arrayList2;
            to.c cVar = new to.c(arrayList2, experimentAddFamilyMemberActivity, experimentAddFamilyMemberActivity);
            ((RecyclerView) experimentAddFamilyMemberActivity.n0(R.id.rvAddFamilyMember)).setHasFixedSize(true);
            ((RecyclerView) experimentAddFamilyMemberActivity.n0(R.id.rvAddFamilyMember)).setLayoutManager(new LinearLayoutManager(experimentAddFamilyMemberActivity, 1, false));
            ((RecyclerView) experimentAddFamilyMemberActivity.n0(R.id.rvAddFamilyMember)).setAdapter(cVar);
            if (arrayList2.size() == 0) {
                ((AppCompatImageView) experimentAddFamilyMemberActivity.n0(R.id.ivAddFamilyMemberNullState)).setVisibility(0);
                ((RobertoTextView) experimentAddFamilyMemberActivity.n0(R.id.tvAddFamilyMemberNullState)).setVisibility(0);
            } else {
                ((AppCompatImageView) experimentAddFamilyMemberActivity.n0(R.id.ivAddFamilyMemberNullState)).setVisibility(8);
                ((RobertoTextView) experimentAddFamilyMemberActivity.n0(R.id.tvAddFamilyMemberNullState)).setVisibility(8);
            }
        }
        return hs.k.f19476a;
    }
}
