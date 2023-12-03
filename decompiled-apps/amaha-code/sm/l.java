package sm;

import android.app.DatePickerDialog;
import android.app.TimePickerDialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.m0;
import androidx.lifecycle.o0;
import androidx.lifecycle.q0;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.components.journal.activity.JournalParentActivity;
import com.theinnerhour.b2b.components.journal.model.Feelings;
import com.theinnerhour.b2b.components.journal.model.FeelingsList;
import com.theinnerhour.b2b.components.journal.model.JournalModel;
import com.theinnerhour.b2b.utils.Constants;
import com.theinnerhour.b2b.utils.Utils;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import j$.time.Instant;
import j$.time.ZoneId;
import j$.time.ZoneOffset;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Metadata;
import pl.w0;
/* compiled from: JournalThoughtAcknowledgeFragment.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lsm/l;", "Lnm/h;", "<init>", "()V", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class l extends nm.h {
    public static final /* synthetic */ int E = 0;
    public final Calendar A;
    public final ZoneOffset B;
    public String C;
    public final LinkedHashMap D = new LinkedHashMap();

    /* renamed from: v  reason: collision with root package name */
    public final m0 f31718v = kotlin.jvm.internal.b0.j(this, kotlin.jvm.internal.y.a(tm.e.class), new a(this), new b(this), new c(this));

    /* renamed from: w  reason: collision with root package name */
    public final ArrayList<hs.f<String, ArrayList<String>>> f31719w = new ArrayList<>();

    /* renamed from: x  reason: collision with root package name */
    public final ArrayList<hs.f<String, ArrayList<String>>> f31720x = new ArrayList<>();

    /* renamed from: y  reason: collision with root package name */
    public int f31721y;

    /* renamed from: z  reason: collision with root package name */
    public int f31722z;

    /* compiled from: FragmentViewModelLazy.kt */
    /* loaded from: classes2.dex */
    public static final class a extends kotlin.jvm.internal.k implements ss.a<q0> {

        /* renamed from: u  reason: collision with root package name */
        public final /* synthetic */ Fragment f31723u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Fragment fragment) {
            super(0);
            this.f31723u = fragment;
        }

        @Override // ss.a
        public final q0 invoke() {
            return defpackage.e.m(this.f31723u, "requireActivity().viewModelStore");
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    /* loaded from: classes2.dex */
    public static final class b extends kotlin.jvm.internal.k implements ss.a<k1.a> {

        /* renamed from: u  reason: collision with root package name */
        public final /* synthetic */ Fragment f31724u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Fragment fragment) {
            super(0);
            this.f31724u = fragment;
        }

        @Override // ss.a
        public final k1.a invoke() {
            return defpackage.b.r(this.f31724u, "requireActivity().defaultViewModelCreationExtras");
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    /* loaded from: classes2.dex */
    public static final class c extends kotlin.jvm.internal.k implements ss.a<o0.b> {

        /* renamed from: u  reason: collision with root package name */
        public final /* synthetic */ Fragment f31725u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Fragment fragment) {
            super(0);
            this.f31725u = fragment;
        }

        @Override // ss.a
        public final o0.b invoke() {
            return pl.a.e(this.f31725u, "requireActivity().defaultViewModelProviderFactory");
        }
    }

    public l() {
        Calendar calendar = Calendar.getInstance();
        kotlin.jvm.internal.i.f(calendar, "getInstance()");
        this.A = calendar;
        this.B = ZoneId.systemDefault().getRules().getOffset(Instant.now());
    }

    @Override // nm.h
    public final void F(Integer num) {
        JournalModel journalModel;
        I();
        long currentTimeMillis = System.currentTimeMillis();
        K().A.f(false);
        if (K().H && K().J != null) {
            journalModel = K().J;
            kotlin.jvm.internal.i.d(journalModel);
            journalModel.setData(K().A.d());
            journalModel.setLastUpdated(Calendar.getInstance().getTimeInMillis());
            journalModel.setUserEnteredDate(K().G);
            journalModel.setDraft(true);
        } else {
            journalModel = new JournalModel(String.valueOf(currentTimeMillis), currentTimeMillis, K().G, currentTimeMillis, true, Constants.GOAL_TYPE_THOUGHT, false, K().A.d(), true);
        }
        androidx.fragment.app.p requireActivity = requireActivity();
        kotlin.jvm.internal.i.e(requireActivity, "null cannot be cast to non-null type com.theinnerhour.b2b.components.journal.activity.JournalParentActivity");
        ((JournalParentActivity) requireActivity).r0(journalModel, true, num);
    }

    @Override // nm.h
    public final void I() {
        tm.a aVar = K().A;
        HashMap<String, Object> hashMap = new HashMap<>();
        StringBuilder sb2 = new StringBuilder("j");
        sb2.append(this.f31722z);
        sb2.append('_');
        hashMap.put(pl.a.g(sb2, this.f31721y, "_list"), J());
        aVar.g(hashMap);
    }

    public final List<String> J() {
        ArrayList arrayList = new ArrayList();
        Iterator<hs.f<String, ArrayList<String>>> it = this.f31720x.iterator();
        while (it.hasNext()) {
            Iterator<String> it2 = it.next().f19465v.iterator();
            while (it2.hasNext()) {
                arrayList.add(it2.next());
            }
        }
        return is.u.I2(arrayList);
    }

    public final tm.e K() {
        return (tm.e) this.f31718v.getValue();
    }

    @Override // nm.h
    public final void _$_clearFindViewByIdCache() {
        this.D.clear();
    }

    public final View _$_findCachedViewById(int i6) {
        View findViewById;
        LinkedHashMap linkedHashMap = this.D;
        View view = (View) linkedHashMap.get(Integer.valueOf(i6));
        if (view == null) {
            View view2 = getView();
            if (view2 != null && (findViewById = view2.findViewById(i6)) != null) {
                linkedHashMap.put(Integer.valueOf(i6), findViewById);
                return findViewById;
            }
            return null;
        }
        return view;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        kotlin.jvm.internal.i.g(inflater, "inflater");
        return inflater.inflate(R.layout.fragment_journal_thought_acknowledge, viewGroup, false);
    }

    @Override // nm.h, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        ArrayList<hs.f<String, ArrayList<String>>> arrayList;
        Object obj;
        List<String> list;
        hs.f<String, ArrayList<String>> fVar;
        kotlin.jvm.internal.i.g(view, "view");
        super.onViewCreated(view, bundle);
        this.f31721y = K().A.c();
        this.f31722z = K().A.f33281a;
        Iterator<FeelingsList> it = K().g().getAcknowledge().getFeelingsList().iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            arrayList = this.f31719w;
            if (!hasNext) {
                break;
            }
            FeelingsList next = it.next();
            ArrayList arrayList2 = new ArrayList();
            Iterator<Feelings> it2 = next.getFeelings().iterator();
            while (it2.hasNext()) {
                arrayList2.add(it2.next().getFeeling());
            }
            arrayList.add(new hs.f<>(next.getTitle(), arrayList2));
        }
        RobertoTextView robertoTextView = (RobertoTextView) _$_findCachedViewById(R.id.tvJournalThoughtAcknowledgeTitleText);
        if (robertoTextView != null) {
            robertoTextView.setText(K().g().getAcknowledge().getTitle());
        }
        RobertoTextView robertoTextView2 = (RobertoTextView) _$_findCachedViewById(R.id.tvJournalThoughtAcknowledgeSubTitleText);
        if (robertoTextView2 != null) {
            robertoTextView2.setText(K().g().getAcknowledge().getSubTitle());
        }
        RobertoTextView robertoTextView3 = (RobertoTextView) _$_findCachedViewById(R.id.tvJournalThoughtAcknowledgeFooterNextCta);
        if (robertoTextView3 != null) {
            robertoTextView3.setText(K().g().getAcknowledge().getCta());
        }
        HashMap<String, Object> d10 = K().A.d();
        if (d10 != null) {
            obj = d10.get("j" + this.f31722z + '_' + this.f31721y + "_list");
        } else {
            obj = null;
        }
        if (obj instanceof List) {
            list = (List) obj;
        } else {
            list = null;
        }
        ArrayList<hs.f<String, ArrayList<String>>> arrayList3 = this.f31720x;
        if (list != null) {
            Iterator<hs.f<String, ArrayList<String>>> it3 = arrayList.iterator();
            while (it3.hasNext()) {
                hs.f<String, ArrayList<String>> next2 = it3.next();
                Iterator<hs.f<String, ArrayList<String>>> it4 = arrayList3.iterator();
                while (true) {
                    if (it4.hasNext()) {
                        fVar = it4.next();
                        if (kotlin.jvm.internal.i.b(fVar.f19464u, next2.f19464u)) {
                            break;
                        }
                    } else {
                        fVar = null;
                        break;
                    }
                }
                hs.f<String, ArrayList<String>> fVar2 = fVar;
                Iterator<String> it5 = next2.f19465v.iterator();
                while (it5.hasNext()) {
                    String item = it5.next();
                    for (String str : list) {
                        if (kotlin.jvm.internal.i.b(item, str)) {
                            if (fVar2 != null) {
                                fVar2.f19465v.add(item);
                            } else {
                                kotlin.jvm.internal.i.f(item, "item");
                                arrayList3.add(new hs.f<>(next2.f19464u, ca.a.k(item)));
                            }
                        }
                    }
                }
            }
        }
        RecyclerView recyclerView = (RecyclerView) _$_findCachedViewById(R.id.rvJournalThoughtAcknowledgeListView);
        if (recyclerView != null) {
            recyclerView.setLayoutManager(new LinearLayoutManager(requireActivity(), 1, false));
        }
        RecyclerView recyclerView2 = (RecyclerView) _$_findCachedViewById(R.id.rvJournalThoughtAcknowledgeListView);
        if (recyclerView2 != null) {
            androidx.fragment.app.p requireActivity = requireActivity();
            kotlin.jvm.internal.i.f(requireActivity, "requireActivity()");
            recyclerView2.setAdapter(new mm.h(arrayList, arrayList3, requireActivity, k.f31717u));
        }
        RobertoTextView robertoTextView4 = (RobertoTextView) _$_findCachedViewById(R.id.tvJournalThoughtAcknowledgeDateText);
        if (robertoTextView4 != null) {
            robertoTextView4.setText(K().e(K().G));
        }
        long j10 = K().G;
        Calendar calendar = this.A;
        calendar.setTimeInMillis(j10);
        TimePickerDialog timePickerDialog = new TimePickerDialog(requireActivity(), new pl.b(this, 6), calendar.get(11), calendar.get(12), false);
        timePickerDialog.setTitle("Pick time");
        DatePickerDialog datePickerDialog = new DatePickerDialog(requireActivity(), new pl.c(this, timePickerDialog, 7), calendar.get(1), calendar.get(2), calendar.get(5));
        datePickerDialog.getDatePicker().setMaxDate(Utils.INSTANCE.getTodayTimeInSeconds() * 1000);
        ConstraintLayout constraintLayout = (ConstraintLayout) _$_findCachedViewById(R.id.clJournalThoughtAcknowledgeDateContainer);
        if (constraintLayout != null) {
            constraintLayout.setOnClickListener(new w0(datePickerDialog, 10, this));
        }
        ConstraintLayout constraintLayout2 = (ConstraintLayout) _$_findCachedViewById(R.id.clJournalThoughtAcknowledgeFooterNextCta);
        if (constraintLayout2 != null) {
            constraintLayout2.setOnClickListener(new ol.k(19, this));
        }
    }
}
