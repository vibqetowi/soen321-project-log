package tp;

import am.w;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.a1;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.components.topicalcourses.activity.TopicalGoalsActivity;
import tr.r;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class g implements View.OnClickListener {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ int f33407u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ TopicalGoalsActivity f33408v;

    public /* synthetic */ g(TopicalGoalsActivity topicalGoalsActivity, int i6) {
        this.f33407u = i6;
        this.f33408v = topicalGoalsActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i6 = this.f33407u;
        int i10 = 0;
        TopicalGoalsActivity this$0 = this.f33408v;
        switch (i6) {
            case 0:
                int i11 = TopicalGoalsActivity.P;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                this$0.onBackPressed();
                return;
            case 1:
                int i12 = TopicalGoalsActivity.P;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                a1 a1Var = new a1(this$0, (AppCompatImageView) this$0.n0(R.id.ivMenu));
                k.f a10 = a1Var.a();
                androidx.appcompat.view.menu.f fVar = a1Var.f1344b;
                a10.inflate(R.menu.topical_card_menu, fVar);
                fVar.findItem(R.id.action_remove_card).setTitle("Edit Goals");
                a1Var.f1346d = new w(28, this$0);
                a1Var.b();
                return;
            case 2:
                int i13 = TopicalGoalsActivity.P;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                RecyclerView recyclerView = (RecyclerView) this$0.n0(R.id.rvGoalsListCalendar);
                if (((RecyclerView) this$0.n0(R.id.rvGoalsListCalendar)).getVisibility() == 0) {
                    if (BottomSheetBehavior.from((ConstraintLayout) this$0.n0(R.id.bottom_sheet)).getState() == 3) {
                        BottomSheetBehavior.from((ConstraintLayout) this$0.n0(R.id.bottom_sheet)).setState(4);
                    } else {
                        BottomSheetBehavior from = BottomSheetBehavior.from((ConstraintLayout) this$0.n0(R.id.bottom_sheet));
                        from.setPeekHeight(from.getPeekHeight() + 175);
                        i10 = 8;
                    }
                } else {
                    BottomSheetBehavior from2 = BottomSheetBehavior.from((ConstraintLayout) this$0.n0(R.id.bottom_sheet));
                    from2.setPeekHeight(from2.getPeekHeight() - 175);
                    BottomSheetBehavior.from((ConstraintLayout) this$0.n0(R.id.bottom_sheet)).setState(4);
                }
                recyclerView.setVisibility(i10);
                return;
            case 3:
                int i14 = TopicalGoalsActivity.P;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                this$0.startActivityForResult(r.s(this$0, false).putExtra("source", "topical_goals"), this$0.f11677y);
                return;
            case 4:
                int i15 = TopicalGoalsActivity.P;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                this$0.startActivityForResult(r.s(this$0, false).putExtra("source", "topical_goals"), this$0.f11677y);
                return;
            case 5:
                int i16 = TopicalGoalsActivity.P;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                this$0.p0();
                return;
            default:
                int i17 = TopicalGoalsActivity.P;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                this$0.onBackPressed();
                return;
        }
    }
}
