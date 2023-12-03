package to;

import android.content.Context;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.components.profile.experiment.activities.ExperimentAddFamilyMemberActivity;
import com.theinnerhour.b2b.model.AddFamilyMember;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import java.util.List;
import kotlin.jvm.internal.i;
/* compiled from: ExperimentAddFamilyAdapter.kt */
/* loaded from: classes2.dex */
public final class c extends RecyclerView.e<RecyclerView.c0> {
    public final String A;

    /* renamed from: x  reason: collision with root package name */
    public final List<AddFamilyMember> f33388x;

    /* renamed from: y  reason: collision with root package name */
    public final Context f33389y;

    /* renamed from: z  reason: collision with root package name */
    public final b f33390z;

    /* compiled from: ExperimentAddFamilyAdapter.kt */
    /* loaded from: classes2.dex */
    public final class a extends RecyclerView.c0 {
        public a(View view) {
            super(view);
        }
    }

    /* compiled from: ExperimentAddFamilyAdapter.kt */
    /* loaded from: classes2.dex */
    public interface b {
        void A(int i6);
    }

    public c(List addFamilyList, ExperimentAddFamilyMemberActivity experimentAddFamilyMemberActivity, ExperimentAddFamilyMemberActivity experimentAddFamilyMemberActivity2) {
        i.g(addFamilyList, "addFamilyList");
        this.f33388x = addFamilyList;
        this.f33389y = experimentAddFamilyMemberActivity;
        this.f33390z = experimentAddFamilyMemberActivity2;
        this.A = LogHelper.INSTANCE.makeLogTag("ExperimentAddFamilyAdapter");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final int f() {
        return this.f33388x.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final void n(RecyclerView.c0 c0Var, int i6) {
        View view = c0Var.f2751a;
        try {
            AddFamilyMember addFamilyMember = this.f33388x.get(i6);
            ((RobertoTextView) view.findViewById(R.id.tvMemberName)).setText(addFamilyMember.getEmailId());
            RobertoTextView robertoTextView = (RobertoTextView) view.findViewById(R.id.tvMemberRelation);
            String relation = addFamilyMember.getRelation();
            if (relation == null) {
                relation = null;
            }
            robertoTextView.setText(relation);
            ((AppCompatImageView) view.findViewById(R.id.ivMemberDelete)).setOnClickListener(new to.b(addFamilyMember, this, i6, 0));
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.A, e10);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final RecyclerView.c0 p(int i6, RecyclerView parent) {
        i.g(parent, "parent");
        return new a(defpackage.e.h(parent, R.layout.row_add_family_2, parent, false, "from(parent.context).inf…_family_2, parent, false)"));
    }
}
