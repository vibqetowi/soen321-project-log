package hr;

import android.app.TimePickerDialog;
import android.widget.TimePicker;
import java.io.Serializable;
import java.util.Calendar;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class r9 implements TimePickerDialog.OnTimeSetListener {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ int f19099u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ Serializable f19100v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ hs.a f19101w;

    public /* synthetic */ r9(Serializable serializable, hs.a aVar, int i6) {
        this.f19099u = i6;
        this.f19100v = serializable;
        this.f19101w = aVar;
    }

    @Override // android.app.TimePickerDialog.OnTimeSetListener
    public final void onTimeSet(TimePicker timePicker, int i6, int i10) {
        int i11 = this.f19099u;
        hs.a aVar = this.f19101w;
        Serializable serializable = this.f19100v;
        switch (i11) {
            case 0:
                kotlin.jvm.internal.x calendar = (kotlin.jvm.internal.x) serializable;
                ss.a updateTime = (ss.a) aVar;
                int i12 = s9.f19179w;
                kotlin.jvm.internal.i.g(calendar, "$calendar");
                kotlin.jvm.internal.i.g(updateTime, "$updateTime");
                ((Calendar) calendar.f23469u).set(11, i6);
                ((Calendar) calendar.f23469u).set(12, i10);
                updateTime.invoke();
                return;
            case 1:
                kotlin.jvm.internal.x calendar2 = (kotlin.jvm.internal.x) serializable;
                ss.a updateTime2 = (ss.a) aVar;
                int i13 = t9.f19215w;
                kotlin.jvm.internal.i.g(calendar2, "$calendar");
                kotlin.jvm.internal.i.g(updateTime2, "$updateTime");
                ((Calendar) calendar2.f23469u).set(11, i6);
                ((Calendar) calendar2.f23469u).set(12, i10);
                updateTime2.invoke();
                return;
            case 2:
                kotlin.jvm.internal.x calendar3 = (kotlin.jvm.internal.x) serializable;
                ss.a updateTime3 = (ss.a) aVar;
                int i14 = u9.f19255w;
                kotlin.jvm.internal.i.g(calendar3, "$calendar");
                kotlin.jvm.internal.i.g(updateTime3, "$updateTime");
                ((Calendar) calendar3.f23469u).set(11, i6);
                ((Calendar) calendar3.f23469u).set(12, i10);
                updateTime3.invoke();
                return;
            default:
                Calendar calendar4 = (Calendar) serializable;
                ss.l onTimeSelect = (ss.l) aVar;
                int i15 = uo.k.E;
                kotlin.jvm.internal.i.g(onTimeSelect, "$onTimeSelect");
                calendar4.set(11, i6);
                calendar4.set(12, i10);
                onTimeSelect.invoke(Long.valueOf(calendar4.getTimeInMillis()));
                return;
        }
    }
}
