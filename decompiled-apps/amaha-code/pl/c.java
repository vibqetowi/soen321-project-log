package pl;

import android.app.DatePickerDialog;
import android.app.TimePickerDialog;
import android.widget.DatePicker;
import androidx.fragment.app.Fragment;
import com.theinnerhour.b2b.components.dynamicActivities.fragments.N12CScreenFragment;
import com.theinnerhour.b2b.components.dynamicActivities.fragments.N19ScreenFragment;
import com.theinnerhour.b2b.components.dynamicActivities.fragments.N4ScreenFragment;
import com.theinnerhour.b2b.components.dynamicActivities.fragments.N5ScreenFragment;
import com.theinnerhour.b2b.components.dynamicActivities.fragments.N6AScreenFragment;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class c implements DatePickerDialog.OnDateSetListener {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ int f28551u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ TimePickerDialog f28552v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ Fragment f28553w;

    public /* synthetic */ c(Fragment fragment, TimePickerDialog timePickerDialog, int i6) {
        this.f28551u = i6;
        this.f28553w = fragment;
        this.f28552v = timePickerDialog;
    }

    @Override // android.app.DatePickerDialog.OnDateSetListener
    public final void onDateSet(DatePicker datePicker, int i6, int i10, int i11) {
        int i12 = this.f28551u;
        TimePickerDialog timePicker = this.f28552v;
        Fragment fragment = this.f28553w;
        switch (i12) {
            case 0:
                N12CScreenFragment this$0 = (N12CScreenFragment) fragment;
                int i13 = N12CScreenFragment.L;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                kotlin.jvm.internal.i.g(timePicker, "$timePicker");
                this$0.H.set(i6, i10, i11);
                timePicker.show();
                return;
            case 1:
                N19ScreenFragment this$02 = (N19ScreenFragment) fragment;
                int i14 = N19ScreenFragment.K;
                kotlin.jvm.internal.i.g(this$02, "this$0");
                kotlin.jvm.internal.i.g(timePicker, "$oneTimeGoalTimePicker");
                this$02.B.set(i6, i10, i11);
                timePicker.show();
                return;
            case 2:
                N4ScreenFragment this$03 = (N4ScreenFragment) fragment;
                int i15 = N4ScreenFragment.I;
                kotlin.jvm.internal.i.g(this$03, "this$0");
                kotlin.jvm.internal.i.g(timePicker, "$timePicker");
                this$03.F.set(i6, i10, i11);
                timePicker.show();
                return;
            case 3:
                N5ScreenFragment this$04 = (N5ScreenFragment) fragment;
                int i16 = N5ScreenFragment.I;
                kotlin.jvm.internal.i.g(this$04, "this$0");
                kotlin.jvm.internal.i.g(timePicker, "$timePicker");
                this$04.F.set(i6, i10, i11);
                timePicker.show();
                return;
            case 4:
                N6AScreenFragment this$05 = (N6AScreenFragment) fragment;
                int i17 = N6AScreenFragment.M;
                kotlin.jvm.internal.i.g(this$05, "this$0");
                kotlin.jvm.internal.i.g(timePicker, "$timePicker");
                this$05.J.set(i6, i10, i11);
                timePicker.show();
                return;
            case 5:
                qm.j this$06 = (qm.j) fragment;
                int i18 = qm.j.L;
                kotlin.jvm.internal.i.g(this$06, "this$0");
                kotlin.jvm.internal.i.g(timePicker, "$timePicker");
                this$06.f29879z.set(i6, i10, i11);
                timePicker.show();
                return;
            case 6:
                rm.h this$07 = (rm.h) fragment;
                int i19 = rm.h.N;
                kotlin.jvm.internal.i.g(this$07, "this$0");
                kotlin.jvm.internal.i.g(timePicker, "$timePicker");
                this$07.B.set(i6, i10, i11);
                timePicker.show();
                return;
            case 7:
                sm.l this$08 = (sm.l) fragment;
                int i20 = sm.l.E;
                kotlin.jvm.internal.i.g(this$08, "this$0");
                kotlin.jvm.internal.i.g(timePicker, "$timePicker");
                this$08.A.set(i6, i10, i11);
                timePicker.show();
                return;
            case 8:
                sm.s this$09 = (sm.s) fragment;
                int i21 = sm.s.K;
                kotlin.jvm.internal.i.g(this$09, "this$0");
                kotlin.jvm.internal.i.g(timePicker, "$timePicker");
                this$09.f31739z.set(i6, i10, i11);
                timePicker.show();
                return;
            default:
                sm.h0 this$010 = (sm.h0) fragment;
                int i22 = sm.h0.E;
                kotlin.jvm.internal.i.g(this$010, "this$0");
                kotlin.jvm.internal.i.g(timePicker, "$timePicker");
                this$010.A.set(i6, i10, i11);
                timePicker.show();
                return;
        }
    }
}
