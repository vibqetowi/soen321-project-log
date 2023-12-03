package pl;

import android.app.DatePickerDialog;
import android.view.View;
import com.theinnerhour.b2b.components.dynamicActivities.fragments.N12CScreenFragment;
import com.theinnerhour.b2b.components.dynamicActivities.fragments.N4ScreenFragment;
import com.theinnerhour.b2b.components.dynamicActivities.fragments.N5ScreenFragment;
import com.theinnerhour.b2b.components.dynamicActivities.fragments.N6AScreenFragment;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class d implements View.OnClickListener {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ int f28558u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ DatePickerDialog f28559v;

    public /* synthetic */ d(DatePickerDialog datePickerDialog, int i6) {
        this.f28558u = i6;
        this.f28559v = datePickerDialog;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i6 = this.f28558u;
        DatePickerDialog dayPicker = this.f28559v;
        switch (i6) {
            case 0:
                int i10 = N12CScreenFragment.L;
                kotlin.jvm.internal.i.g(dayPicker, "$dayPicker");
                dayPicker.show();
                return;
            case 1:
                int i11 = N4ScreenFragment.I;
                kotlin.jvm.internal.i.g(dayPicker, "$dayPicker");
                dayPicker.show();
                return;
            case 2:
                int i12 = N5ScreenFragment.I;
                kotlin.jvm.internal.i.g(dayPicker, "$dayPicker");
                dayPicker.show();
                return;
            case 3:
                int i13 = N6AScreenFragment.M;
                kotlin.jvm.internal.i.g(dayPicker, "$dayPicker");
                dayPicker.show();
                return;
            case 4:
                int i14 = cm.g.E;
                kotlin.jvm.internal.i.g(dayPicker, "$onetimeGoalDayPicker");
                dayPicker.show();
                return;
            default:
                int i15 = sm.h0.E;
                kotlin.jvm.internal.i.g(dayPicker, "$dayPicker");
                dayPicker.show();
                return;
        }
    }
}
