package er;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import androidx.appcompat.app.b;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.activity.SleepTimeTableActivity;
import com.theinnerhour.b2b.model.GoalType;
import com.theinnerhour.b2b.model.SleepDropDownFirebaseModel;
import com.theinnerhour.b2b.persistence.FirebasePersistence;
import com.theinnerhour.b2b.utils.Constants;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.utils.UiUtils;
import com.theinnerhour.b2b.utils.Utils;
import com.theinnerhour.b2b.widgets.RobertoButton;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
/* compiled from: SleepDropDownFragment.java */
/* loaded from: classes2.dex */
public class d extends rr.b {
    public static final /* synthetic */ int A = 0;

    /* renamed from: u  reason: collision with root package name */
    public ImageView f14479u;

    /* renamed from: v  reason: collision with root package name */
    public LinearLayout f14480v;

    /* renamed from: w  reason: collision with root package name */
    public HashMap<String, Boolean> f14481w = new HashMap<>();

    /* renamed from: x  reason: collision with root package name */
    public final String f14482x = "defualt";

    /* renamed from: y  reason: collision with root package name */
    public final ArrayList<C0221d> f14483y = new ArrayList<>();

    /* renamed from: z  reason: collision with root package name */
    public final ArrayList<String> f14484z = new ArrayList<>();

    /* compiled from: SleepDropDownFragment.java */
    /* loaded from: classes2.dex */
    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            int i6 = d.A;
            d dVar = d.this;
            dVar.getClass();
            try {
                ArrayList<SleepDropDownFirebaseModel> arrayList = new ArrayList<>();
                for (int i10 = 0; i10 < dVar.f14480v.getChildCount(); i10++) {
                    if (((Spinner) dVar.f14480v.getChildAt(i10).findViewById(R.id.customSpinner)).getSelectedItemPosition() > 0) {
                        arrayList.add(new SleepDropDownFirebaseModel(dVar.f14484z.get(i10), dVar.f14483y.get(i10).f14490w));
                    }
                }
                if (arrayList.size() > 0) {
                    FirebasePersistence.getInstance().getUser().getSleep().getSleepDropDown().clear();
                    FirebasePersistence.getInstance().getUser().getSleep().setSleepDropDown(arrayList);
                    FirebasePersistence.getInstance().updateUserOnFirebase();
                }
            } catch (Exception e10) {
                LogHelper.INSTANCE.e("sleepdropdown", "error in reading time slots", e10);
            }
            ((SleepTimeTableActivity) dVar.getActivity()).t0();
        }
    }

    /* compiled from: SleepDropDownFragment.java */
    /* loaded from: classes2.dex */
    public class b implements View.OnClickListener {
        public b() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            d.this.getActivity().finish();
        }
    }

    /* compiled from: SleepDropDownFragment.java */
    /* loaded from: classes2.dex */
    public class c implements View.OnClickListener {
        public c() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            int i6 = d.A;
            d dVar = d.this;
            b.a aVar = new b.a(dVar.getActivity());
            aVar.setTitle("Enter your activity here");
            EditText editText = new EditText(dVar.getActivity());
            editText.setInputType(1);
            aVar.setView(editText);
            aVar.b("OK", new e(dVar, editText));
            aVar.a("Cancel", new f());
            aVar.c();
        }
    }

    /* compiled from: SleepDropDownFragment.java */
    /* renamed from: er.d$d  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public class C0221d extends BaseAdapter implements SpinnerAdapter {

        /* renamed from: u  reason: collision with root package name */
        public final LinkedHashMap<String, String> f14488u;

        /* renamed from: v  reason: collision with root package name */
        public String f14489v = null;

        /* renamed from: w  reason: collision with root package name */
        public String f14490w = null;

        public C0221d(LinkedHashMap<String, String> linkedHashMap) {
            this.f14488u = new LinkedHashMap<>(linkedHashMap);
        }

        @Override // android.widget.Adapter
        public final int getCount() {
            return this.f14488u.size();
        }

        @Override // android.widget.BaseAdapter, android.widget.SpinnerAdapter
        public final View getDropDownView(int i6, View view, ViewGroup viewGroup) {
            d dVar = d.this;
            RobertoTextView robertoTextView = new RobertoTextView(dVar.getActivity());
            if (i6 > 0) {
                robertoTextView.setTextColor(Utils.INSTANCE.checkBuildBeforesetColor(R.color.seaSerpent, dVar.getContext()));
            } else {
                robertoTextView.setTextColor(Utils.INSTANCE.checkBuildBeforesetColor(R.color.colorTextGrey, dVar.getContext()));
            }
            robertoTextView.setFont("Lato-Medium.ttf");
            robertoTextView.setPadding(16, 16, 16, 16);
            robertoTextView.setTextSize(2, 15.0f);
            robertoTextView.setGravity(16);
            robertoTextView.setText((CharSequence) new ArrayList(this.f14488u.values()).get(i6));
            return robertoTextView;
        }

        @Override // android.widget.Adapter
        public final Object getItem(int i6) {
            return this.f14488u.get(Integer.valueOf(i6));
        }

        @Override // android.widget.Adapter
        public final long getItemId(int i6) {
            return i6;
        }

        @Override // android.widget.Adapter
        public final View getView(int i6, View view, ViewGroup viewGroup) {
            d dVar = d.this;
            RobertoTextView robertoTextView = new RobertoTextView(dVar.getActivity());
            robertoTextView.setGravity(17);
            robertoTextView.setTextColor(Utils.INSTANCE.checkBuildBeforesetColor(R.color.colorTextGrey, dVar.getContext()));
            robertoTextView.setFont("Lato-Medium.ttf");
            robertoTextView.setPadding(16, 16, 16, 16);
            robertoTextView.setTextSize(2, 15.0f);
            robertoTextView.setText((CharSequence) new ArrayList(this.f14488u.values()).get(i6));
            return robertoTextView;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.fragment_sleep_drop_down, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        ArrayList<String> arrayList;
        super.onViewCreated(view, bundle);
        HashMap<String, Boolean> hashMap = ((SleepTimeTableActivity) getActivity()).A;
        this.f14481w = hashMap;
        hashMap.clear();
        ((RobertoButton) view.findViewById(R.id.tap)).setOnClickListener(new a());
        ImageView imageView = (ImageView) view.findViewById(R.id.header_arrow_back);
        this.f14479u = imageView;
        UiUtils.Companion.increaseImageClickArea(imageView);
        this.f14479u.setOnClickListener(new b());
        ((LinearLayout) view.findViewById(R.id.ll_addNew)).setOnClickListener(new c());
        this.f14480v = (LinearLayout) view.findViewById(R.id.ll_spinner);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("HH:mm");
        String sleepTime = FirebasePersistence.getInstance().getUser().getSleep().getSleepTime();
        Calendar calendar = Calendar.getInstance();
        try {
            if (sleepTime != null) {
                calendar.setTime(simpleDateFormat.parse(sleepTime));
            } else {
                calendar.setTime(simpleDateFormat.parse("22:00"));
            }
        } catch (ParseException e10) {
            LogHelper.INSTANCE.e(e10);
        }
        calendar.add(10, -6);
        SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("hh:mma");
        int i6 = 0;
        while (true) {
            arrayList = this.f14484z;
            if (i6 >= 6) {
                break;
            }
            String lowerCase = simpleDateFormat2.format(calendar.getTime()).toLowerCase();
            calendar.add(10, 1);
            StringBuilder d10 = v.g.d(lowerCase, "-");
            d10.append(simpleDateFormat2.format(calendar.getTime()).toLowerCase());
            arrayList.add(d10.toString());
            i6++;
        }
        arrayList.add(simpleDateFormat2.format(calendar.getTime()).toLowerCase());
        List<GoalType> goals = Constants.getGoals(FirebasePersistence.getInstance().getUser().getCurrentCourse(), true, Constants.GOAL_TYPE_HABIT, Constants.GOAL_SUB_TYPE_TIME_TABLE);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put(this.f14482x, "Choose an activity");
        for (GoalType goalType : goals) {
            linkedHashMap.put(goalType.getGoalId(), goalType.getGoalName());
        }
        LayoutInflater layoutInflater = (LayoutInflater) getActivity().getSystemService("layout_inflater");
        for (int i10 = 0; i10 < 6; i10++) {
            View inflate = layoutInflater.inflate(R.layout.row_text_spinner, (ViewGroup) null);
            ((RobertoTextView) inflate.findViewById(R.id.text)).setText(arrayList.get(i10));
            Spinner spinner = (Spinner) inflate.findViewById(R.id.customSpinner);
            C0221d c0221d = new C0221d(linkedHashMap);
            spinner.setAdapter((SpinnerAdapter) c0221d);
            this.f14483y.add(c0221d);
            spinner.setOnItemSelectedListener(new g(this, c0221d, i10));
            this.f14480v.addView(inflate);
        }
        ((RobertoTextView) view.findViewById(R.id.sleepText)).setText(arrayList.get(arrayList.size() - 1));
        Bundle bundle2 = new Bundle();
        defpackage.b.s(bundle2, "course", bundle2, "sleep_slots_view");
    }
}
