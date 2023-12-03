package cm;

import android.app.DatePickerDialog;
import android.widget.DatePicker;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.widgets.RobertoButton;
import hr.g7;
import hr.z7;
import j$.time.LocalDateTime;
import j$.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Locale;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class f implements DatePickerDialog.OnDateSetListener {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ int f5334u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ rr.b f5335v;

    public /* synthetic */ f(rr.b bVar, int i6) {
        this.f5334u = i6;
        this.f5335v = bVar;
    }

    @Override // android.app.DatePickerDialog.OnDateSetListener
    public final void onDateSet(DatePicker datePicker, int i6, int i10, int i11) {
        int i12 = this.f5334u;
        rr.b bVar = this.f5335v;
        switch (i12) {
            case 0:
                g this$0 = (g) bVar;
                int i13 = g.E;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                Calendar calendar = this$0.A;
                calendar.set(i6, i10, i11);
                ((RobertoButton) this$0._$_findCachedViewById(R.id.onetimeDatePicker)).setText(LocalDateTime.ofEpochSecond(calendar.getTimeInMillis() / 1000, 0, this$0.f5337v).format(DateTimeFormatter.ofPattern("dd.MM.yyyy").withLocale(Locale.ENGLISH)));
                return;
            case 1:
                g7 this$02 = (g7) bVar;
                int i14 = g7.J;
                kotlin.jvm.internal.i.g(this$02, "this$0");
                this$02.f18460y.set(i6, i10, i11);
                String format = this$02.f18457v.format(Long.valueOf(this$02.f18460y.getTimeInMillis()));
                kotlin.jvm.internal.i.f(format, "timeFormat.format(calendar.timeInMillis)");
                String format2 = this$02.f18459x.format(Long.valueOf(this$02.f18460y.getTimeInMillis()));
                kotlin.jvm.internal.i.f(format2, "dateFormat.format(calendar.timeInMillis)");
                this$02.K(format, format2);
                return;
            default:
                z7 this$03 = (z7) bVar;
                int i15 = z7.K;
                kotlin.jvm.internal.i.g(this$03, "this$0");
                this$03.C.set(i6, i10, i11);
                this$03.c0();
                return;
        }
    }
}
