package uo;

import android.app.TimePickerDialog;
import android.widget.TimePicker;
import com.theinnerhour.b2b.components.goals.model.FirestoreGoal;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import java.util.Calendar;
import uo.k;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class p implements TimePickerDialog.OnTimeSetListener {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ int f34416u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ k f34417v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ RobertoTextView f34418w;

    /* renamed from: x  reason: collision with root package name */
    public final /* synthetic */ FirestoreGoal f34419x;

    public /* synthetic */ p(k kVar, RobertoTextView robertoTextView, FirestoreGoal firestoreGoal, int i6) {
        this.f34416u = i6;
        this.f34417v = kVar;
        this.f34418w = robertoTextView;
        this.f34419x = firestoreGoal;
    }

    @Override // android.app.TimePickerDialog.OnTimeSetListener
    public final void onTimeSet(TimePicker timePicker, int i6, int i10) {
        int i11 = this.f34416u;
        FirestoreGoal goal = this.f34419x;
        RobertoTextView textView = this.f34418w;
        k this$0 = this.f34417v;
        switch (i11) {
            case 0:
                kotlin.jvm.internal.i.g(this$0, "this$0");
                kotlin.jvm.internal.i.g(textView, "$textView");
                kotlin.jvm.internal.i.g(goal, "$goal");
                Calendar calendar = Calendar.getInstance();
                calendar.set(11, i6);
                calendar.set(12, i10);
                k.P(goal, this$0, textView, calendar);
                return;
            default:
                int i12 = k.u.f34388y;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                kotlin.jvm.internal.i.g(textView, "$textView");
                kotlin.jvm.internal.i.g(goal, "$goal");
                Calendar calendar2 = Calendar.getInstance();
                calendar2.set(11, i6);
                calendar2.set(12, i10);
                k.P(goal, this$0, textView, calendar2);
                return;
        }
    }
}
