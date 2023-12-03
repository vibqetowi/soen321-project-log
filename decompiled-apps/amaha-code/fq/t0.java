package fq;

import android.app.Dialog;
import android.view.View;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.activity.T6Activity;
import com.theinnerhour.b2b.utils.UiUtils;
import com.theinnerhour.b2b.utils.Utils;
import com.theinnerhour.b2b.widgets.RobertoButton;
import com.theinnerhour.b2b.widgets.RobertoEditText;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class t0 implements View.OnClickListener {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ int f15802u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ v0 f15803v;

    public /* synthetic */ t0(v0 v0Var, int i6) {
        this.f15802u = i6;
        this.f15803v = v0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i6 = this.f15802u;
        v0 this$0 = this.f15803v;
        switch (i6) {
            case 0:
                int i10 = v0.D;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                ((RobertoButton) this$0._$_findCachedViewById(R.id.btnS41Button)).setVisibility(0);
                this$0.f15814x = !this$0.f15814x;
                this$0.J();
                return;
            case 1:
                int i11 = v0.D;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                androidx.fragment.app.p activity = this$0.getActivity();
                kotlin.jvm.internal.i.e(activity, "null cannot be cast to non-null type com.theinnerhour.b2b.widgets.CustomActivity");
                ((rr.a) activity).t0();
                return;
            case 2:
                int i12 = v0.D;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                boolean z10 = this$0.f15814x;
                if (z10) {
                    this$0.f15814x = !z10;
                    this$0.J();
                }
                T6Activity t6Activity = this$0.A;
                if (t6Activity != null) {
                    t6Activity.s0(new i());
                    return;
                } else {
                    kotlin.jvm.internal.i.q("act");
                    throw null;
                }
            case 3:
                int i13 = v0.D;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                T6Activity t6Activity2 = this$0.A;
                if (t6Activity2 != null) {
                    t6Activity2.onBackPressed();
                    return;
                } else {
                    kotlin.jvm.internal.i.q("act");
                    throw null;
                }
            default:
                int i14 = v0.D;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                if (this$0.f15812v % 2 == 0) {
                    this$0.f15814x = false;
                    this$0.J();
                    UiUtils.Companion companion = UiUtils.Companion;
                    androidx.fragment.app.p activity2 = this$0.getActivity();
                    kotlin.jvm.internal.i.d(activity2);
                    Dialog dialog = companion.getDialog(R.layout.dialog_pomodoro_time_update, activity2);
                    ((RobertoEditText) dialog.findViewById(R.id.dialog_edit_mins)).setText(String.valueOf(this$0.f15815y / 60000));
                    ((RobertoEditText) dialog.findViewById(R.id.dialog_edit_secs)).setText(String.valueOf((this$0.f15815y / 1000) % 60));
                    ((RobertoButton) dialog.findViewById(R.id.submit)).setOnClickListener(new ho.o(dialog, 16, this$0));
                    dialog.show();
                    return;
                }
                Utils.INSTANCE.showCustomToast(this$0.getActivity(), "Sorry - you can't edit break time!");
                return;
        }
    }
}
