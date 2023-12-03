package hr;

import android.app.Dialog;
import android.view.View;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.utils.UiUtils;
import com.theinnerhour.b2b.utils.Utils;
import com.theinnerhour.b2b.widgets.RobertoButton;
import com.theinnerhour.b2b.widgets.RobertoEditText;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class u7 implements View.OnClickListener {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ int f19250u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ w7 f19251v;

    public /* synthetic */ u7(w7 w7Var, int i6) {
        this.f19250u = i6;
        this.f19251v = w7Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i6 = this.f19250u;
        w7 this$0 = this.f19251v;
        switch (i6) {
            case 0:
                int i10 = w7.F;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                ((RobertoButton) this$0._$_findCachedViewById(R.id.btnS41Button)).setVisibility(0);
                this$0.f19355x = !this$0.f19355x;
                this$0.J();
                return;
            case 1:
                int i11 = w7.F;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                androidx.fragment.app.p activity = this$0.getActivity();
                kotlin.jvm.internal.i.e(activity, "null cannot be cast to non-null type com.theinnerhour.b2b.widgets.CustomActivity");
                ((rr.a) activity).t0();
                return;
            case 2:
                int i12 = w7.F;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                boolean z10 = this$0.f19355x;
                if (z10) {
                    this$0.f19355x = !z10;
                    this$0.J();
                }
                this$0.K().s0(new b0());
                return;
            case 3:
                int i13 = w7.F;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                this$0.K().onBackPressed();
                return;
            default:
                int i14 = w7.F;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                if (this$0.f19353v % 2 == 0) {
                    this$0.f19355x = false;
                    this$0.J();
                    UiUtils.Companion companion = UiUtils.Companion;
                    androidx.fragment.app.p activity2 = this$0.getActivity();
                    kotlin.jvm.internal.i.d(activity2);
                    Dialog dialog = companion.getDialog(R.layout.dialog_pomodoro_time_update, activity2);
                    ((RobertoEditText) dialog.findViewById(R.id.dialog_edit_mins)).setText(String.valueOf(this$0.f19356y / 60000));
                    ((RobertoEditText) dialog.findViewById(R.id.dialog_edit_secs)).setText(String.valueOf((this$0.f19356y / 1000) % 60));
                    ((RobertoButton) dialog.findViewById(R.id.submit)).setOnClickListener(new sq.p(dialog, 25, this$0));
                    dialog.show();
                    return;
                }
                Utils.INSTANCE.showCustomToast(this$0.getActivity(), this$0.D);
                return;
        }
    }
}
