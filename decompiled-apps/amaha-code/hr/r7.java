package hr;

import android.app.TimePickerDialog;
import android.view.View;
import android.widget.ImageView;
import com.theinnerhour.b2b.R;
import java.util.Calendar;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class r7 implements View.OnClickListener {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ int f19095u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ s7 f19096v;

    public /* synthetic */ r7(s7 s7Var, int i6) {
        this.f19095u = i6;
        this.f19096v = s7Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i6 = this.f19095u;
        s7 this$0 = this.f19096v;
        switch (i6) {
            case 0:
                int i10 = s7.M;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                this$0.G = true;
                this$0.O();
                return;
            case 1:
                int i11 = s7.M;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                this$0.J().getOnBackPressedDispatcher().b();
                return;
            case 2:
                int i12 = s7.M;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                androidx.appcompat.widget.a1 a1Var = new androidx.appcompat.widget.a1(this$0.requireContext(), (ImageView) this$0._$_findCachedViewById(R.id.ivEllipses));
                a1Var.a().inflate(R.menu.logs_menu, a1Var.f1344b);
                a1Var.f1346d = new hd.a(5, this$0);
                a1Var.b();
                return;
            default:
                int i13 = s7.M;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                androidx.fragment.app.p activity = this$0.getActivity();
                pl.b bVar = new pl.b(this$0, 13);
                Calendar calendar = this$0.C;
                TimePickerDialog timePickerDialog = new TimePickerDialog(activity, bVar, calendar.get(11), calendar.get(12), false);
                timePickerDialog.setTitle("Select Time");
                timePickerDialog.show();
                return;
        }
    }
}
