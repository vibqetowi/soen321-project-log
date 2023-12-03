package er;

import android.app.TimePickerDialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.activity.SleepTimeTableActivity;
import com.theinnerhour.b2b.persistence.FirebasePersistence;
import com.theinnerhour.b2b.utils.Constants;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.widgets.RobertoButton;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import java.text.SimpleDateFormat;
import java.util.Calendar;
/* compiled from: ClockFragment.java */
/* loaded from: classes2.dex */
public class b extends rr.b {

    /* renamed from: y  reason: collision with root package name */
    public static final /* synthetic */ int f14471y = 0;

    /* renamed from: u  reason: collision with root package name */
    public RobertoTextView f14472u;

    /* renamed from: v  reason: collision with root package name */
    public RobertoTextView f14473v;

    /* renamed from: w  reason: collision with root package name */
    public int f14474w = 1;

    /* renamed from: x  reason: collision with root package name */
    public final Calendar f14475x = Calendar.getInstance();

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.fragment_clock, viewGroup, false);
        this.f14472u = (RobertoTextView) inflate.findViewById(R.id.clockHeader);
        this.f14473v = (RobertoTextView) inflate.findViewById(R.id.timeText);
        return inflate;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        view.findViewById(R.id.header_arrow_back).setOnClickListener(new View.OnClickListener(this) { // from class: er.a

            /* renamed from: v  reason: collision with root package name */
            public final /* synthetic */ b f14470v;

            {
                this.f14470v = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i6 = r2;
                b bVar = this.f14470v;
                switch (i6) {
                    case 0:
                        int i10 = b.f14471y;
                        bVar.getActivity().finish();
                        return;
                    case 1:
                        Calendar calendar = bVar.f14475x;
                        calendar.get(11);
                        calendar.get(12);
                        String format = new SimpleDateFormat("HH:mm").format(calendar.getTime());
                        if (bVar.f14474w == 1) {
                            FirebasePersistence.getInstance().getUser().getSleep().setSleepTime(format);
                        } else {
                            FirebasePersistence.getInstance().getUser().getSleep().setWakeUpTime(format);
                        }
                        FirebasePersistence.getInstance().updateUserOnFirebase();
                        ((SleepTimeTableActivity) bVar.getActivity()).t0();
                        return;
                    default:
                        Calendar calendar2 = bVar.f14475x;
                        TimePickerDialog timePickerDialog = new TimePickerDialog(bVar.getContext(), new pl.b(bVar, 10), calendar2.get(11), calendar2.get(12), false);
                        timePickerDialog.setTitle("Select Time");
                        timePickerDialog.show();
                        return;
                }
            }
        });
        try {
            Bundle arguments = getArguments();
            new Bundle().putInt("screen_sequence", arguments.getInt("screen_sequence"));
            int i6 = arguments.getInt("screen_sequence");
            this.f14474w = i6;
            Calendar calendar = this.f14475x;
            if (i6 == 1) {
                calendar.set(11, 22);
                calendar.set(12, 0);
                this.f14473v.setText("10:00 PM");
                this.f14472u.setText("What time do you usually go to sleep?");
            } else {
                calendar.set(11, 6);
                calendar.set(12, 0);
                this.f14473v.setText("6:00 AM");
                this.f14472u.setText("What time do you usually wake up?");
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(Constants.ONBOARDING_VARIANT, "View not found", e10);
            getActivity().onBackPressed();
        }
        ((RobertoButton) view.findViewById(R.id.tap)).setOnClickListener(new View.OnClickListener(this) { // from class: er.a

            /* renamed from: v  reason: collision with root package name */
            public final /* synthetic */ b f14470v;

            {
                this.f14470v = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i62 = r2;
                b bVar = this.f14470v;
                switch (i62) {
                    case 0:
                        int i10 = b.f14471y;
                        bVar.getActivity().finish();
                        return;
                    case 1:
                        Calendar calendar2 = bVar.f14475x;
                        calendar2.get(11);
                        calendar2.get(12);
                        String format = new SimpleDateFormat("HH:mm").format(calendar2.getTime());
                        if (bVar.f14474w == 1) {
                            FirebasePersistence.getInstance().getUser().getSleep().setSleepTime(format);
                        } else {
                            FirebasePersistence.getInstance().getUser().getSleep().setWakeUpTime(format);
                        }
                        FirebasePersistence.getInstance().updateUserOnFirebase();
                        ((SleepTimeTableActivity) bVar.getActivity()).t0();
                        return;
                    default:
                        Calendar calendar22 = bVar.f14475x;
                        TimePickerDialog timePickerDialog = new TimePickerDialog(bVar.getContext(), new pl.b(bVar, 10), calendar22.get(11), calendar22.get(12), false);
                        timePickerDialog.setTitle("Select Time");
                        timePickerDialog.show();
                        return;
                }
            }
        });
        this.f14473v.setOnClickListener(new View.OnClickListener(this) { // from class: er.a

            /* renamed from: v  reason: collision with root package name */
            public final /* synthetic */ b f14470v;

            {
                this.f14470v = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i62 = r2;
                b bVar = this.f14470v;
                switch (i62) {
                    case 0:
                        int i10 = b.f14471y;
                        bVar.getActivity().finish();
                        return;
                    case 1:
                        Calendar calendar2 = bVar.f14475x;
                        calendar2.get(11);
                        calendar2.get(12);
                        String format = new SimpleDateFormat("HH:mm").format(calendar2.getTime());
                        if (bVar.f14474w == 1) {
                            FirebasePersistence.getInstance().getUser().getSleep().setSleepTime(format);
                        } else {
                            FirebasePersistence.getInstance().getUser().getSleep().setWakeUpTime(format);
                        }
                        FirebasePersistence.getInstance().updateUserOnFirebase();
                        ((SleepTimeTableActivity) bVar.getActivity()).t0();
                        return;
                    default:
                        Calendar calendar22 = bVar.f14475x;
                        TimePickerDialog timePickerDialog = new TimePickerDialog(bVar.getContext(), new pl.b(bVar, 10), calendar22.get(11), calendar22.get(12), false);
                        timePickerDialog.setTitle("Select Time");
                        timePickerDialog.show();
                        return;
                }
            }
        });
    }
}
