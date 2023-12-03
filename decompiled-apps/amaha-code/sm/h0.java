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
import com.theinnerhour.b2b.components.journal.model.JournalModel;
import com.theinnerhour.b2b.components.journal.model.JournalThoughtThinkingItemListModel;
import com.theinnerhour.b2b.components.journal.model.ThinkingList;
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
/* compiled from: JournalThoughtThinkingFragment.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lsm/h0;", "Lnm/h;", "<init>", "()V", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class h0 extends nm.h {
    public static final /* synthetic */ int E = 0;
    public final Calendar A;
    public final ZoneOffset B;
    public String C;
    public final LinkedHashMap D = new LinkedHashMap();

    /* renamed from: v  reason: collision with root package name */
    public final m0 f31699v = kotlin.jvm.internal.b0.j(this, kotlin.jvm.internal.y.a(tm.e.class), new a(this), new b(this), new c(this));

    /* renamed from: w  reason: collision with root package name */
    public final ArrayList<JournalThoughtThinkingItemListModel> f31700w = new ArrayList<>();

    /* renamed from: x  reason: collision with root package name */
    public List<JournalThoughtThinkingItemListModel> f31701x;

    /* renamed from: y  reason: collision with root package name */
    public int f31702y;

    /* renamed from: z  reason: collision with root package name */
    public int f31703z;

    /* compiled from: FragmentViewModelLazy.kt */
    /* loaded from: classes2.dex */
    public static final class a extends kotlin.jvm.internal.k implements ss.a<q0> {

        /* renamed from: u  reason: collision with root package name */
        public final /* synthetic */ Fragment f31704u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Fragment fragment) {
            super(0);
            this.f31704u = fragment;
        }

        @Override // ss.a
        public final q0 invoke() {
            return defpackage.e.m(this.f31704u, "requireActivity().viewModelStore");
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    /* loaded from: classes2.dex */
    public static final class b extends kotlin.jvm.internal.k implements ss.a<k1.a> {

        /* renamed from: u  reason: collision with root package name */
        public final /* synthetic */ Fragment f31705u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Fragment fragment) {
            super(0);
            this.f31705u = fragment;
        }

        @Override // ss.a
        public final k1.a invoke() {
            return defpackage.b.r(this.f31705u, "requireActivity().defaultViewModelCreationExtras");
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    /* loaded from: classes2.dex */
    public static final class c extends kotlin.jvm.internal.k implements ss.a<o0.b> {

        /* renamed from: u  reason: collision with root package name */
        public final /* synthetic */ Fragment f31706u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Fragment fragment) {
            super(0);
            this.f31706u = fragment;
        }

        @Override // ss.a
        public final o0.b invoke() {
            return pl.a.e(this.f31706u, "requireActivity().defaultViewModelProviderFactory");
        }
    }

    public h0() {
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
        sb2.append(this.f31703z);
        sb2.append('_');
        hashMap.put(pl.a.g(sb2, this.f31702y, "_list"), J());
        aVar.g(hashMap);
    }

    public final List<HashMap<String, String>> J() {
        ArrayList arrayList = new ArrayList();
        Iterator<JournalThoughtThinkingItemListModel> it = this.f31700w.iterator();
        while (it.hasNext()) {
            JournalThoughtThinkingItemListModel next = it.next();
            HashMap hashMap = new HashMap();
            if (next != null) {
                hashMap.put("id", next.getId());
                hashMap.put("title", next.getHeader());
            }
            arrayList.add(hashMap);
        }
        return is.u.I2(arrayList);
    }

    public final tm.e K() {
        return (tm.e) this.f31699v.getValue();
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
        return inflater.inflate(R.layout.fragment_journal_thought_thinking, viewGroup, false);
    }

    @Override // nm.h, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        Object obj;
        List<HashMap> list;
        String str;
        String str2;
        String str3;
        String str4;
        kotlin.jvm.internal.i.g(view, "view");
        super.onViewCreated(view, bundle);
        this.f31702y = K().A.c();
        this.f31703z = K().A.f33281a;
        RobertoTextView robertoTextView = (RobertoTextView) _$_findCachedViewById(R.id.tvJournalThoughtThinkingTitleText);
        if (robertoTextView != null) {
            robertoTextView.setText(K().g().getIdentifyThinkingStyle().getTitle());
        }
        RobertoTextView robertoTextView2 = (RobertoTextView) _$_findCachedViewById(R.id.tvJournalThoughtThinkingDescriptionText);
        if (robertoTextView2 != null) {
            robertoTextView2.setText(ca.a.g0(30, ca.a.Z(K().g().getIdentifyThinkingStyle().getDescription())));
        }
        RobertoTextView robertoTextView3 = (RobertoTextView) _$_findCachedViewById(R.id.tvJournalThoughtThinkingFooterNextCta);
        if (robertoTextView3 != null) {
            robertoTextView3.setText(K().g().getIdentifyThinkingStyle().getCta());
        }
        RobertoTextView robertoTextView4 = (RobertoTextView) _$_findCachedViewById(R.id.tvJournalThoughtThinkingDateText);
        if (robertoTextView4 != null) {
            robertoTextView4.setText(K().e(K().G));
        }
        long j10 = K().G;
        Calendar calendar = this.A;
        calendar.setTimeInMillis(j10);
        ArrayList<ThinkingList> thinkingList = K().g().getIdentifyThinkingStyle().getThinkingList();
        ArrayList arrayList = new ArrayList();
        Iterator<ThinkingList> it = thinkingList.iterator();
        while (it.hasNext()) {
            ThinkingList next = it.next();
            HashMap hashMap = new HashMap();
            hashMap.put("option_id", next.getId());
            hashMap.put("option_title", next.getTitle());
            hashMap.put("option_description", next.getDescription());
            arrayList.add(hashMap);
        }
        ArrayList arrayList2 = new ArrayList(is.i.H1(arrayList, 10));
        Iterator it2 = arrayList.iterator();
        while (true) {
            String str5 = null;
            if (!it2.hasNext()) {
                break;
            }
            HashMap hashMap2 = (HashMap) it2.next();
            Object obj2 = hashMap2.get("option_id");
            if (obj2 instanceof String) {
                str = (String) obj2;
            } else {
                str = null;
            }
            if (str == null) {
                str2 = "";
            } else {
                str2 = str;
            }
            Object obj3 = hashMap2.get("option_title");
            if (obj3 instanceof String) {
                str3 = (String) obj3;
            } else {
                str3 = null;
            }
            if (str3 == null) {
                str4 = "";
            } else {
                str4 = str3;
            }
            Object obj4 = hashMap2.get("option_description");
            if (obj4 instanceof String) {
                str5 = (String) obj4;
            }
            if (str5 == null) {
                str5 = "";
            }
            arrayList2.add(new JournalThoughtThinkingItemListModel(str2, str4, str5, false, 8, null));
        }
        this.f31701x = arrayList2;
        HashMap<String, Object> d10 = K().A.d();
        if (d10 != null) {
            obj = d10.get("j" + this.f31703z + '_' + this.f31702y + "_list");
        } else {
            obj = null;
        }
        if (obj instanceof List) {
            list = (List) obj;
        } else {
            list = null;
        }
        ArrayList<JournalThoughtThinkingItemListModel> arrayList3 = this.f31700w;
        if (list != null) {
            List<JournalThoughtThinkingItemListModel> list2 = this.f31701x;
            if (list2 != null) {
                for (JournalThoughtThinkingItemListModel journalThoughtThinkingItemListModel : list2) {
                    for (HashMap hashMap3 : list) {
                        if (journalThoughtThinkingItemListModel != null && kotlin.jvm.internal.i.b(journalThoughtThinkingItemListModel.getId(), hashMap3.get("id"))) {
                            arrayList3.add(journalThoughtThinkingItemListModel);
                        }
                    }
                }
            } else {
                kotlin.jvm.internal.i.q("optionList");
                throw null;
            }
        }
        RecyclerView recyclerView = (RecyclerView) _$_findCachedViewById(R.id.rvJournalThoughtThinkingListView);
        if (recyclerView != null) {
            recyclerView.setLayoutManager(new LinearLayoutManager(requireActivity(), 1, false));
        }
        RecyclerView recyclerView2 = (RecyclerView) _$_findCachedViewById(R.id.rvJournalThoughtThinkingListView);
        if (recyclerView2 != null) {
            List<JournalThoughtThinkingItemListModel> list3 = this.f31701x;
            if (list3 != null) {
                androidx.fragment.app.p requireActivity = requireActivity();
                kotlin.jvm.internal.i.f(requireActivity, "requireActivity()");
                recyclerView2.setAdapter(new mm.i(list3, arrayList3, requireActivity, new f0(this), g0.f31697u, false));
            } else {
                kotlin.jvm.internal.i.q("optionList");
                throw null;
            }
        }
        TimePickerDialog timePickerDialog = new TimePickerDialog(requireActivity(), new pl.b(this, 8), calendar.get(11), calendar.get(12), false);
        timePickerDialog.setTitle("Pick time");
        DatePickerDialog datePickerDialog = new DatePickerDialog(requireActivity(), new pl.c(this, timePickerDialog, 9), calendar.get(1), calendar.get(2), calendar.get(5));
        datePickerDialog.getDatePicker().setMaxDate(Utils.INSTANCE.getTodayTimeInSeconds() * 1000);
        ConstraintLayout constraintLayout = (ConstraintLayout) _$_findCachedViewById(R.id.clJournalThoughtThinkingDateContainer);
        if (constraintLayout != null) {
            constraintLayout.setOnClickListener(new pl.d(datePickerDialog, 5));
        }
        ConstraintLayout constraintLayout2 = (ConstraintLayout) _$_findCachedViewById(R.id.clJournalThoughtThinkingFooterNextCta);
        if (constraintLayout2 != null) {
            constraintLayout2.setOnClickListener(new ol.k(20, this));
        }
    }
}
