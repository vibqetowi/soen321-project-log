package uo;

import android.app.TimePickerDialog;
import android.widget.TimePicker;
import com.theinnerhour.b2b.model.Goal;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import java.util.Calendar;
import uo.k;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class m implements TimePickerDialog.OnTimeSetListener {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ int f34402u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ k f34403v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ RobertoTextView f34404w;

    /* renamed from: x  reason: collision with root package name */
    public final /* synthetic */ Goal f34405x;

    public /* synthetic */ m(k kVar, RobertoTextView robertoTextView, Goal goal, int i6) {
        this.f34402u = i6;
        this.f34403v = kVar;
        this.f34404w = robertoTextView;
        this.f34405x = goal;
    }

    @Override // android.app.TimePickerDialog.OnTimeSetListener
    public final void onTimeSet(TimePicker timePicker, int i6, int i10) {
        int i11 = this.f34402u;
        Goal goal = this.f34405x;
        RobertoTextView textView = this.f34404w;
        k this$0 = this.f34403v;
        switch (i11) {
            case 0:
                kotlin.jvm.internal.i.g(this$0, "this$0");
                kotlin.jvm.internal.i.g(textView, "$textView");
                kotlin.jvm.internal.i.g(goal, "$goal");
                Calendar calendar = Calendar.getInstance();
                calendar.set(11, i6);
                calendar.set(12, i10);
                k.O(this$0, goal, textView, calendar);
                return;
            default:
                int i12 = k.r.f34373y;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                kotlin.jvm.internal.i.g(textView, "$textView");
                kotlin.jvm.internal.i.g(goal, "$goal");
                Calendar calendar2 = Calendar.getInstance();
                calendar2.set(11, i6);
                calendar2.set(12, i10);
                k.O(this$0, goal, textView, calendar2);
                return;
        }
    }
}
