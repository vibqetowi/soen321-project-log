package fq;

import android.app.TimePickerDialog;
import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import com.theinnerhour.b2b.R;
import java.util.Calendar;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class p0 implements View.OnClickListener {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ int f15779u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ q0 f15780v;

    public /* synthetic */ p0(q0 q0Var, int i6) {
        this.f15779u = i6;
        this.f15780v = q0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i6 = this.f15779u;
        q0 this$0 = this.f15780v;
        switch (i6) {
            case 0:
                int i10 = q0.K;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                this$0.J().t0();
                return;
            case 1:
                int i11 = q0.K;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                this$0.G = true;
                this$0.O();
                return;
            case 2:
                int i12 = q0.K;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                this$0.J().onBackPressed();
                return;
            case 3:
                int i13 = q0.K;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                Context context = this$0.getContext();
                kotlin.jvm.internal.i.d(context);
                androidx.appcompat.widget.a1 a1Var = new androidx.appcompat.widget.a1(context, (ImageView) this$0._$_findCachedViewById(R.id.ivEllipses));
                a1Var.a().inflate(R.menu.logs_menu, a1Var.f1344b);
                a1Var.f1346d = new s(this$0, 2);
                a1Var.b();
                return;
            default:
                int i14 = q0.K;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                androidx.fragment.app.p activity = this$0.getActivity();
                pl.b bVar = new pl.b(this$0, 9);
                Calendar calendar = this$0.C;
                TimePickerDialog timePickerDialog = new TimePickerDialog(activity, bVar, calendar.get(11), calendar.get(12), false);
                timePickerDialog.setTitle("Select Time");
                timePickerDialog.show();
                return;
        }
    }
}
