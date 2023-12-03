package nm;

import android.app.Dialog;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.widget.LinearLayout;
import android.widget.Toast;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.p;
import androidx.lifecycle.m0;
import androidx.lifecycle.o0;
import androidx.lifecycle.q0;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.chip.Chip;
import com.google.android.material.chip.ChipGroup;
import com.google.firebase.auth.FirebaseAuth;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.components.journal.activity.JournalActivity;
import com.theinnerhour.b2b.components.journal.model.JournalModel;
import com.theinnerhour.b2b.model.User;
import com.theinnerhour.b2b.persistence.ApplicationPersistence;
import com.theinnerhour.b2b.persistence.FirebasePersistence;
import com.theinnerhour.b2b.utils.Constants;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.utils.SessionManager;
import com.theinnerhour.b2b.utils.SingleUseEvent;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import gv.n;
import gv.r;
import is.u;
import is.w;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.WeakHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.b0;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.y;
import ss.l;
import t0.d0;
import t0.j0;
import ta.v;
import tl.m;
import w5.h0;
/* compiled from: JournalListFragment.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lnm/d;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class d extends Fragment {
    public static final /* synthetic */ int F = 0;
    public int A;
    public Dialog B;
    public boolean C;

    /* renamed from: v  reason: collision with root package name */
    public mm.f f26399v;

    /* renamed from: y  reason: collision with root package name */
    public boolean f26402y;

    /* renamed from: z  reason: collision with root package name */
    public boolean f26403z;
    public final LinkedHashMap E = new LinkedHashMap();

    /* renamed from: u  reason: collision with root package name */
    public final String f26398u = LogHelper.INSTANCE.makeLogTag("JournalListFragment");

    /* renamed from: w  reason: collision with root package name */
    public final ArrayList<JournalModel> f26400w = new ArrayList<>();

    /* renamed from: x  reason: collision with root package name */
    public final m0 f26401x = b0.j(this, y.a(um.c.class), new C0431d(this), new e(this), new f(this));
    public final a D = new a();

    /* compiled from: JournalListFragment.kt */
    /* loaded from: classes2.dex */
    public static final class a extends RecyclerView.r {
        public a() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.r
        public final void b(RecyclerView recyclerView, int i6, int i10) {
            LinearLayoutManager linearLayoutManager;
            i.g(recyclerView, "recyclerView");
            RecyclerView.m layoutManager = recyclerView.getLayoutManager();
            if (layoutManager instanceof LinearLayoutManager) {
                linearLayoutManager = (LinearLayoutManager) layoutManager;
            } else {
                linearLayoutManager = null;
            }
            if (linearLayoutManager != null) {
                int i11 = d.F;
                d.this.K().A.setValue(Integer.valueOf(linearLayoutManager.findLastVisibleItemPosition() + 1));
            }
        }
    }

    /* compiled from: JournalListFragment.kt */
    /* loaded from: classes2.dex */
    public static final class b extends k implements l<SingleUseEvent<? extends List<? extends JournalModel>>, hs.k> {

        /* renamed from: v  reason: collision with root package name */
        public final /* synthetic */ um.c f26406v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(um.c cVar) {
            super(1);
            this.f26406v = cVar;
        }

        @Override // ss.l
        public final hs.k invoke(SingleUseEvent<? extends List<? extends JournalModel>> singleUseEvent) {
            boolean z10;
            boolean z11;
            boolean z12;
            boolean z13;
            RecyclerView.e eVar;
            mm.f fVar;
            hs.k kVar;
            RecyclerView.e eVar2;
            mm.f fVar2;
            List<? extends JournalModel> contentIfNotHandled = singleUseEvent.getContentIfNotHandled();
            if (contentIfNotHandled != null) {
                HashSet hashSet = new HashSet();
                d dVar = d.this;
                ArrayList<JournalModel> arrayList = dVar.f26400w;
                ArrayList arrayList2 = new ArrayList();
                Iterator<JournalModel> it = arrayList.iterator();
                while (true) {
                    String str = null;
                    if (!it.hasNext()) {
                        break;
                    }
                    JournalModel next = it.next();
                    if (next != null) {
                        str = next.getId();
                    }
                    if (str != null) {
                        arrayList2.add(str);
                    }
                }
                hashSet.addAll(arrayList2);
                if (!contentIfNotHandled.isEmpty()) {
                    for (JournalModel journalModel : contentIfNotHandled) {
                        if (hashSet.contains(journalModel.getId())) {
                            z10 = true;
                            break;
                        }
                    }
                }
                z10 = false;
                ArrayList<JournalModel> arrayList3 = dVar.f26400w;
                if (z10) {
                    arrayList3.clear();
                    RecyclerView recyclerView = (RecyclerView) dVar._$_findCachedViewById(R.id.tvJournalListView);
                    if (recyclerView != null) {
                        eVar2 = recyclerView.getAdapter();
                    } else {
                        eVar2 = null;
                    }
                    if (eVar2 instanceof mm.f) {
                        fVar2 = (mm.f) eVar2;
                    } else {
                        fVar2 = null;
                    }
                    if (fVar2 != null) {
                        ArrayList<JournalModel> arrayList4 = fVar2.C;
                        if (!arrayList4.isEmpty()) {
                            int size = arrayList4.size();
                            arrayList4.clear();
                            fVar2.f2769u.f(0, size);
                        }
                    }
                }
                if (!contentIfNotHandled.isEmpty()) {
                    for (JournalModel journalModel2 : contentIfNotHandled) {
                        if (i.b(journalModel2.getTemplateType(), Constants.GOAL_TYPE_THOUGHT)) {
                            z11 = true;
                            break;
                        }
                    }
                }
                z11 = false;
                if (z11) {
                    ApplicationPersistence.getInstance().setBooleanValue(Constants.JOURNAL_THOUGHTS_ENTRY_PRESENT, true);
                }
                arrayList3.addAll(contentIfNotHandled);
                ArrayList arrayList5 = new ArrayList(contentIfNotHandled);
                try {
                    dVar.O();
                    RecyclerView recyclerView2 = (RecyclerView) dVar._$_findCachedViewById(R.id.tvJournalListView);
                    if (recyclerView2 != null) {
                        eVar = recyclerView2.getAdapter();
                    } else {
                        eVar = null;
                    }
                    if (eVar instanceof mm.f) {
                        fVar = (mm.f) eVar;
                    } else {
                        fVar = null;
                    }
                    if (fVar != null) {
                        ArrayList<JournalModel> arrayList6 = fVar.C;
                        int size2 = arrayList6.size();
                        arrayList6.addAll(arrayList5);
                        fVar.f2769u.e(size2, arrayList5.size());
                        kVar = hs.k.f19476a;
                    } else {
                        kVar = null;
                    }
                    if (kVar == null) {
                        RecyclerView recyclerView3 = (RecyclerView) dVar._$_findCachedViewById(R.id.tvJournalListView);
                        if (recyclerView3 != null) {
                            recyclerView3.setLayoutManager(new LinearLayoutManager(dVar.requireActivity(), 1, false));
                        }
                        p requireActivity = dVar.requireActivity();
                        i.f(requireActivity, "requireActivity()");
                        dVar.f26399v = new mm.f(requireActivity, arrayList5, new nm.e(dVar), new nm.f(dVar), new g(dVar));
                        RecyclerView recyclerView4 = (RecyclerView) dVar._$_findCachedViewById(R.id.tvJournalListView);
                        if (recyclerView4 != null) {
                            mm.f fVar3 = dVar.f26399v;
                            if (fVar3 != null) {
                                recyclerView4.setAdapter(fVar3);
                            } else {
                                i.q("journalListAdapter");
                                throw null;
                            }
                        }
                    }
                } catch (Exception e10) {
                    LogHelper.INSTANCE.e(dVar.f26398u, e10);
                }
                dVar.A++;
                String[] J = dVar.J();
                if (!dVar.f26403z) {
                    dVar.f26403z = true;
                    String str2 = gk.a.f16573a;
                    Bundle bundle = new Bundle();
                    bundle.putBoolean("list_empty", arrayList3.isEmpty());
                    if (J.length == 0) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    bundle.putBoolean("is_filter_applied", !z13);
                    bundle.putStringArray("filter_value", J);
                    hs.k kVar2 = hs.k.f19476a;
                    gk.a.b(bundle, "journal_list_load");
                } else {
                    String str3 = gk.a.f16573a;
                    Bundle bundle2 = new Bundle();
                    bundle2.putInt("page", dVar.A);
                    if (J.length == 0) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    bundle2.putBoolean("is_filter_applied", !z12);
                    bundle2.putStringArray("filter_value", J);
                    hs.k kVar3 = hs.k.f19476a;
                    gk.a.b(bundle2, "journal_list_load_more");
                }
                um.c cVar = this.f26406v;
                if (!i.b(cVar.B.d(), Boolean.TRUE) && i.b(cVar.C.d(), "all")) {
                    dVar.K().I = arrayList3.isEmpty();
                    d.F(dVar, arrayList3.isEmpty());
                    d.I(dVar, false);
                    if (arrayList3.isEmpty()) {
                        ApplicationPersistence.getInstance().setStringValue("journal_last_entry_date", "");
                    }
                } else {
                    d.F(dVar, false);
                    d.I(dVar, arrayList3.isEmpty());
                }
                if (arrayList3.isEmpty() && ((Number) dVar.K().A.getValue()).intValue() == -1) {
                    dVar.K().A.setValue(0);
                }
                dVar.P(true);
            }
            return hs.k.f19476a;
        }
    }

    /* compiled from: JournalListFragment.kt */
    /* loaded from: classes2.dex */
    public static final class c extends k implements l<tm.b, hs.k> {
        public c() {
            super(1);
        }

        @Override // ss.l
        public final hs.k invoke(tm.b bVar) {
            tm.b bVar2 = bVar;
            tm.b bVar3 = tm.b.SUCCESS;
            d dVar = d.this;
            if (bVar2 == bVar3) {
                dVar.M();
                Dialog dialog = dVar.B;
                if (dialog != null) {
                    dialog.dismiss();
                }
                dVar.B = null;
            } else if (bVar2 == tm.b.FAILURE) {
                Toast.makeText(dVar.requireContext(), dVar.getString(R.string.telecommunicationsError), 0).show();
                Dialog dialog2 = dVar.B;
                if (dialog2 != null) {
                    dialog2.dismiss();
                }
                dVar.B = null;
            }
            return hs.k.f19476a;
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    /* renamed from: nm.d$d  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0431d extends k implements ss.a<q0> {

        /* renamed from: u  reason: collision with root package name */
        public final /* synthetic */ Fragment f26408u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0431d(Fragment fragment) {
            super(0);
            this.f26408u = fragment;
        }

        @Override // ss.a
        public final q0 invoke() {
            return defpackage.e.m(this.f26408u, "requireActivity().viewModelStore");
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    /* loaded from: classes2.dex */
    public static final class e extends k implements ss.a<k1.a> {

        /* renamed from: u  reason: collision with root package name */
        public final /* synthetic */ Fragment f26409u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Fragment fragment) {
            super(0);
            this.f26409u = fragment;
        }

        @Override // ss.a
        public final k1.a invoke() {
            return defpackage.b.r(this.f26409u, "requireActivity().defaultViewModelCreationExtras");
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    /* loaded from: classes2.dex */
    public static final class f extends k implements ss.a<o0.b> {

        /* renamed from: u  reason: collision with root package name */
        public final /* synthetic */ Fragment f26410u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(Fragment fragment) {
            super(0);
            this.f26410u = fragment;
        }

        @Override // ss.a
        public final o0.b invoke() {
            return pl.a.e(this.f26410u, "requireActivity().defaultViewModelProviderFactory");
        }
    }

    public static final void F(d dVar, boolean z10) {
        try {
            if (z10) {
                LinearLayout linearLayout = (LinearLayout) dVar._$_findCachedViewById(R.id.llJournalEmptyStateView);
                if (linearLayout != null) {
                    linearLayout.setVisibility(0);
                }
                AppCompatImageView appCompatImageView = (AppCompatImageView) dVar._$_findCachedViewById(R.id.ivJournalAddCta);
                if (appCompatImageView != null) {
                    appCompatImageView.setVisibility(0);
                }
                RecyclerView recyclerView = (RecyclerView) dVar._$_findCachedViewById(R.id.tvJournalListView);
                if (recyclerView != null) {
                    recyclerView.setVisibility(8);
                }
            } else {
                LinearLayout linearLayout2 = (LinearLayout) dVar._$_findCachedViewById(R.id.llJournalEmptyStateView);
                if (linearLayout2 != null) {
                    linearLayout2.setVisibility(8);
                }
                AppCompatImageView appCompatImageView2 = (AppCompatImageView) dVar._$_findCachedViewById(R.id.ivJournalAddCta);
                if (appCompatImageView2 != null) {
                    appCompatImageView2.setVisibility(0);
                }
                RecyclerView recyclerView2 = (RecyclerView) dVar._$_findCachedViewById(R.id.tvJournalListView);
                if (recyclerView2 != null) {
                    recyclerView2.setVisibility(0);
                }
            }
            ConstraintLayout constraintLayout = (ConstraintLayout) dVar._$_findCachedViewById(R.id.clFetchingLoader);
            if (constraintLayout != null) {
                constraintLayout.setVisibility(8);
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(dVar.f26398u, e10);
        }
    }

    public static final void I(d dVar, boolean z10) {
        try {
            if (z10) {
                RobertoTextView robertoTextView = (RobertoTextView) dVar._$_findCachedViewById(R.id.tvJournalNoResult);
                if (robertoTextView != null) {
                    robertoTextView.setVisibility(0);
                }
                AppCompatImageView appCompatImageView = (AppCompatImageView) dVar._$_findCachedViewById(R.id.ivJournalNoResult);
                if (appCompatImageView != null) {
                    appCompatImageView.setVisibility(0);
                }
                RecyclerView recyclerView = (RecyclerView) dVar._$_findCachedViewById(R.id.tvJournalListView);
                if (recyclerView != null) {
                    recyclerView.setVisibility(8);
                }
            } else {
                RobertoTextView robertoTextView2 = (RobertoTextView) dVar._$_findCachedViewById(R.id.tvJournalNoResult);
                if (robertoTextView2 != null) {
                    robertoTextView2.setVisibility(8);
                }
                AppCompatImageView appCompatImageView2 = (AppCompatImageView) dVar._$_findCachedViewById(R.id.ivJournalNoResult);
                if (appCompatImageView2 != null) {
                    appCompatImageView2.setVisibility(8);
                }
                RecyclerView recyclerView2 = (RecyclerView) dVar._$_findCachedViewById(R.id.tvJournalListView);
                if (recyclerView2 != null) {
                    recyclerView2.setVisibility(0);
                }
            }
            ConstraintLayout constraintLayout = (ConstraintLayout) dVar._$_findCachedViewById(R.id.clFetchingLoader);
            if (constraintLayout != null) {
                constraintLayout.setVisibility(8);
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(dVar.f26398u, e10);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x001c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x00b9 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r4v5, types: [is.w] */
    /* JADX WARN: Type inference failed for: r4v6, types: [java.util.ArrayList] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String[] J() {
        ?? r42;
        int i6;
        Drawable.Callback callback;
        CharSequence text;
        String obj;
        Object obj2;
        boolean z10;
        List<Integer> checkedChipIds;
        View view;
        Chip chip;
        String str;
        String str2;
        CharSequence text2;
        Object obj3;
        boolean z11;
        ChipGroup chipGroup = (ChipGroup) _$_findCachedViewById(R.id.cgJournalTemplatesFiltersChipsContainer);
        Chip chip2 = null;
        if (chipGroup != null && (checkedChipIds = chipGroup.getCheckedChipIds()) != null) {
            r42 = new ArrayList();
            for (Integer num : checkedChipIds) {
                um.c K = K();
                ChipGroup chipGroup2 = (ChipGroup) _$_findCachedViewById(R.id.cgJournalTemplatesFiltersChipsContainer);
                if (chipGroup2 != null) {
                    Iterator<View> it = f6.b.B0(chipGroup2).iterator();
                    while (true) {
                        j0 j0Var = (j0) it;
                        if (j0Var.hasNext()) {
                            obj3 = j0Var.next();
                            int id2 = ((View) obj3).getId();
                            if (num != null && id2 == num.intValue()) {
                                z11 = true;
                                continue;
                            } else {
                                z11 = false;
                                continue;
                            }
                            if (z11) {
                                break;
                            }
                        } else {
                            obj3 = null;
                            break;
                        }
                    }
                    view = (View) obj3;
                } else {
                    view = null;
                }
                if (view instanceof Chip) {
                    chip = (Chip) view;
                } else {
                    chip = null;
                }
                if (chip != null && (text2 = chip.getText()) != null) {
                    str = text2.toString();
                } else {
                    str = null;
                }
                K.getClass();
                if (str != null) {
                    int hashCode = str.hashCode();
                    if (hashCode != -365242296) {
                        if (hashCode != 94644935) {
                            if (hashCode == 480058197 && str.equals("YOUR WRITING SPACE")) {
                                str2 = "free_text_journal";
                            }
                        } else if (str.equals("YOUR THOUGHTS")) {
                            str2 = "thought_journal";
                        }
                    } else if (str.equals("DAILY PROMPTS")) {
                        str2 = "question";
                    }
                    if (str2 == null) {
                        r42.add(str2);
                    }
                }
                str2 = null;
                if (str2 == null) {
                }
            }
        } else {
            r42 = 0;
        }
        ChipGroup chipGroup3 = (ChipGroup) _$_findCachedViewById(R.id.cgJournalStatesFiltersChipsContainer);
        if (chipGroup3 != null) {
            i6 = chipGroup3.getCheckedChipId();
        } else {
            i6 = -1;
        }
        String str3 = "";
        if (i6 != -1) {
            ChipGroup chipGroup4 = (ChipGroup) _$_findCachedViewById(R.id.cgJournalStatesFiltersChipsContainer);
            if (chipGroup4 != null) {
                Iterator<View> it2 = f6.b.B0(chipGroup4).iterator();
                while (true) {
                    j0 j0Var2 = (j0) it2;
                    if (j0Var2.hasNext()) {
                        obj2 = j0Var2.next();
                        if (((View) obj2).getId() == i6) {
                            z10 = true;
                            continue;
                        } else {
                            z10 = false;
                            continue;
                        }
                        if (z10) {
                            break;
                        }
                    } else {
                        obj2 = null;
                        break;
                    }
                }
                callback = (View) obj2;
            } else {
                callback = null;
            }
            if (callback instanceof Chip) {
                chip2 = (Chip) callback;
            }
            if (chip2 != null && (text = chip2.getText()) != null && (obj = text.toString()) != null) {
                Locale locale = Locale.ENGLISH;
                str3 = ri.e.e(locale, "ENGLISH", obj, locale, "this as java.lang.String).toLowerCase(locale)");
            }
            if (is.k.Q1(str3, new String[]{"favourites", "drafts"})) {
                str3 = r.W0("s", str3);
            }
        }
        if (r42 == 0) {
            r42 = w.f20676u;
        }
        ArrayList arrayList = r42;
        if (!n.B0(str3)) {
            arrayList = u.v2(str3, r42);
        }
        return (String[]) arrayList.toArray(new String[0]);
    }

    public final um.c K() {
        return (um.c) this.f26401x.getValue();
    }

    public final void M() {
        RecyclerView.e eVar;
        ConstraintLayout constraintLayout = (ConstraintLayout) _$_findCachedViewById(R.id.clFetchingLoader);
        if (constraintLayout != null) {
            constraintLayout.setVisibility(0);
        }
        P(false);
        this.f26400w.clear();
        RecyclerView recyclerView = (RecyclerView) _$_findCachedViewById(R.id.tvJournalListView);
        mm.f fVar = null;
        if (recyclerView != null) {
            eVar = recyclerView.getAdapter();
        } else {
            eVar = null;
        }
        if (eVar instanceof mm.f) {
            fVar = (mm.f) eVar;
        }
        if (fVar != null) {
            ArrayList<JournalModel> arrayList = fVar.C;
            if (!arrayList.isEmpty()) {
                int size = arrayList.size();
                arrayList.clear();
                fVar.f2769u.f(0, size);
            }
        }
        this.f26403z = false;
        this.A = 0;
        K().A.setValue(-1);
    }

    public final void O() {
        try {
            if (!ApplicationPersistence.getInstance().getBooleanValue("journal_tip_visited", false)) {
                if (ApplicationPersistence.getInstance().getIntValue("journal_save_count", 0) >= 2 && (!this.f26400w.isEmpty())) {
                    View _$_findCachedViewById = _$_findCachedViewById(R.id.layoutJournalTipsCard);
                    if (_$_findCachedViewById != null) {
                        _$_findCachedViewById.setVisibility(0);
                    }
                } else {
                    View _$_findCachedViewById2 = _$_findCachedViewById(R.id.layoutJournalTipsCard);
                    if (_$_findCachedViewById2 != null) {
                        _$_findCachedViewById2.setVisibility(8);
                    }
                }
            } else {
                View _$_findCachedViewById3 = _$_findCachedViewById(R.id.layoutJournalTipsCard);
                if (_$_findCachedViewById3 != null) {
                    _$_findCachedViewById3.setVisibility(8);
                }
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f26398u, e10);
        }
    }

    public final void P(boolean z10) {
        a aVar = this.D;
        if (z10) {
            RecyclerView recyclerView = (RecyclerView) _$_findCachedViewById(R.id.tvJournalListView);
            if (recyclerView != null) {
                recyclerView.i(aVar);
                return;
            }
            return;
        }
        RecyclerView recyclerView2 = (RecyclerView) _$_findCachedViewById(R.id.tvJournalListView);
        if (recyclerView2 != null) {
            recyclerView2.c0(aVar);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x007e, code lost:
        if (r3 == true) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void Q() {
        boolean z10;
        ChipGroup chipGroup = (ChipGroup) _$_findCachedViewById(R.id.cgJournalTemplatesFiltersChipsContainer);
        if (chipGroup != null) {
            chipGroup.removeAllViews();
        }
        ChipGroup chipGroup2 = (ChipGroup) _$_findCachedViewById(R.id.cgJournalStatesFiltersChipsContainer);
        if (chipGroup2 != null) {
            chipGroup2.removeAllViews();
        }
        Iterator it = ca.a.P0("DAILY PROMPTS", "YOUR WRITING SPACE", "YOUR THOUGHTS").iterator();
        while (true) {
            Chip chip = null;
            if (!it.hasNext()) {
                break;
            }
            String str = (String) it.next();
            int i6 = bn.a.f4534a;
            Context requireContext = requireContext();
            i.f(requireContext, "requireContext()");
            ChipGroup cgJournalTemplatesFiltersChipsContainer = (ChipGroup) _$_findCachedViewById(R.id.cgJournalTemplatesFiltersChipsContainer);
            i.f(cgJournalTemplatesFiltersChipsContainer, "cgJournalTemplatesFiltersChipsContainer");
            Chip e10 = bn.a.e(requireContext, cgJournalTemplatesFiltersChipsContainer, str);
            if (e10 != null) {
                WeakHashMap<View, t0.o0> weakHashMap = d0.f32288a;
                e10.setId(d0.e.a());
                List<String> d10 = K().J.d();
                if (d10 != null) {
                    K().getClass();
                    boolean Z1 = u.Z1(d10, um.c.g(str));
                    z10 = true;
                }
                z10 = false;
                e10.setChecked(z10);
                chip = e10;
            }
            ChipGroup chipGroup3 = (ChipGroup) _$_findCachedViewById(R.id.cgJournalTemplatesFiltersChipsContainer);
            if (chipGroup3 != null) {
                chipGroup3.addView(chip);
            }
        }
        for (String str2 : ca.a.P0("COMPLETED", "DRAFTS", "FAVOURITES")) {
            int i10 = bn.a.f4534a;
            Context requireContext2 = requireContext();
            i.f(requireContext2, "requireContext()");
            ChipGroup cgJournalStatesFiltersChipsContainer = (ChipGroup) _$_findCachedViewById(R.id.cgJournalStatesFiltersChipsContainer);
            i.f(cgJournalStatesFiltersChipsContainer, "cgJournalStatesFiltersChipsContainer");
            Chip e11 = bn.a.e(requireContext2, cgJournalStatesFiltersChipsContainer, str2);
            if (e11 != null) {
                WeakHashMap<View, t0.o0> weakHashMap2 = d0.f32288a;
                e11.setId(d0.e.a());
                e11.setChecked(i.b(K().K.d(), str2));
            } else {
                e11 = null;
            }
            ChipGroup chipGroup4 = (ChipGroup) _$_findCachedViewById(R.id.cgJournalStatesFiltersChipsContainer);
            if (chipGroup4 != null) {
                chipGroup4.addView(e11);
            }
        }
        RobertoTextView robertoTextView = (RobertoTextView) _$_findCachedViewById(R.id.tvJournalFilterApplyCta);
        if (robertoTextView != null) {
            robertoTextView.setOnClickListener(new nm.b(this, 5));
        }
        RobertoTextView robertoTextView2 = (RobertoTextView) _$_findCachedViewById(R.id.tvJournalFilterClearCta);
        if (robertoTextView2 != null) {
            robertoTextView2.setOnClickListener(new nm.b(this, 6));
        }
    }

    public final void S() {
        int i6;
        ViewPropertyAnimator animate;
        ViewPropertyAnimator animate2;
        ConstraintLayout constraintLayout = (ConstraintLayout) _$_findCachedViewById(R.id.clJournalFiltersContainer);
        if (constraintLayout != null) {
            i6 = constraintLayout.getHeight();
        } else {
            i6 = 0;
        }
        ViewPropertyAnimator viewPropertyAnimator = null;
        if (this.C) {
            this.C = false;
            ConstraintLayout constraintLayout2 = (ConstraintLayout) _$_findCachedViewById(R.id.clJournalFiltersContainer);
            if (constraintLayout2 != null && (animate2 = constraintLayout2.animate()) != null) {
                viewPropertyAnimator = animate2.translationY(0.0f);
            }
            if (viewPropertyAnimator != null) {
                viewPropertyAnimator.setDuration(200L);
            }
            View _$_findCachedViewById = _$_findCachedViewById(R.id.viewJournalFilterBlanket);
            if (_$_findCachedViewById != null) {
                _$_findCachedViewById.setVisibility(8);
                return;
            }
            return;
        }
        this.C = true;
        ConstraintLayout constraintLayout3 = (ConstraintLayout) _$_findCachedViewById(R.id.clJournalFiltersContainer);
        if (constraintLayout3 != null && (animate = constraintLayout3.animate()) != null) {
            viewPropertyAnimator = animate.translationY(i6 * 1.0f);
        }
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.setDuration(200L);
        }
        View _$_findCachedViewById2 = _$_findCachedViewById(R.id.viewJournalFilterBlanket);
        if (_$_findCachedViewById2 != null) {
            _$_findCachedViewById2.setVisibility(0);
        }
    }

    public final View _$_findCachedViewById(int i6) {
        View findViewById;
        LinkedHashMap linkedHashMap = this.E;
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
        i.g(inflater, "inflater");
        return inflater.inflate(R.layout.fragment_journal_list, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.E.clear();
    }

    /* JADX WARN: Removed duplicated region for block: B:80:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01fc  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01fd A[Catch: Exception -> 0x0211, TryCatch #0 {Exception -> 0x0211, blocks: (B:3:0x000b, B:7:0x0018, B:9:0x0051, B:11:0x0059, B:14:0x0060, B:15:0x006c, B:19:0x0080, B:21:0x008c, B:22:0x0094, B:24:0x009f, B:25:0x00a9, B:27:0x00b4, B:28:0x00bc, B:30:0x00c7, B:31:0x00d0, B:33:0x00d6, B:36:0x00de, B:41:0x00e9, B:43:0x00ef, B:45:0x00f5, B:47:0x0104, B:50:0x010a, B:51:0x010d, B:53:0x0118, B:54:0x0120, B:56:0x013a, B:59:0x0142, B:66:0x0150, B:68:0x015a, B:70:0x0160, B:72:0x016a, B:74:0x0170, B:76:0x017a, B:78:0x0189, B:95:0x01f1, B:98:0x01fd, B:102:0x0207, B:106:0x020d, B:82:0x0197, B:89:0x01a8, B:92:0x01af, B:94:0x01ee, B:93:0x01d1, B:77:0x017f, B:16:0x006f, B:18:0x0077, B:6:0x0015), top: B:111:0x000b }] */
    @Override // androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        boolean z10;
        RobertoTextView robertoTextView;
        boolean z11;
        String str2;
        AppCompatImageView appCompatImageView;
        boolean z12;
        String str3;
        String firstName;
        boolean z13;
        Serializable serializable;
        JournalActivity journalActivity;
        String j02;
        i.g(view, "view");
        super.onViewCreated(view, bundle);
        try {
            ConstraintLayout constraintLayout = (ConstraintLayout) _$_findCachedViewById(R.id.clFetchingLoader);
            int i6 = 0;
            if (constraintLayout != null) {
                constraintLayout.setVisibility(0);
            }
            um.c K = K();
            K.D.e(requireActivity(), new m(28, new b(K)));
            K().E.e(getViewLifecycleOwner(), new m(29, new c()));
            String str4 = null;
            if (!this.f26402y) {
                fd.f fVar = FirebaseAuth.getInstance().f;
                if (fVar != null && (j02 = fVar.j0()) != null) {
                    v.H(kc.f.H(K), null, 0, new um.d(K, j02, null), 3);
                }
                this.f26402y = true;
            } else if (K().H) {
                M();
                K().H = false;
            }
            Q();
            View _$_findCachedViewById = _$_findCachedViewById(R.id.viewJournalFilterBlanket);
            if (_$_findCachedViewById != null) {
                _$_findCachedViewById.setOnClickListener(new nm.b(this, 0));
            }
            ConstraintLayout constraintLayout2 = (ConstraintLayout) _$_findCachedViewById(R.id.clJournalFiltersContainer);
            if (constraintLayout2 != null) {
                constraintLayout2.setOnTouchListener(new h0(11));
            }
            AppCompatImageView appCompatImageView2 = (AppCompatImageView) _$_findCachedViewById(R.id.parentNavBarFilterButton);
            if (appCompatImageView2 != null) {
                appCompatImageView2.setOnClickListener(new nm.b(this, 1));
            }
            AppCompatImageView appCompatImageView3 = (AppCompatImageView) _$_findCachedViewById(R.id.ivJournalAddCta);
            if (appCompatImageView3 != null) {
                appCompatImageView3.setOnClickListener(new nm.b(this, 2));
            }
            if (getArguments() != null) {
                Bundle arguments = getArguments();
                if (arguments != null && arguments.containsKey("journalData")) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                if (z13) {
                    Bundle arguments2 = getArguments();
                    if (arguments2 != null) {
                        serializable = arguments2.getSerializable("journalData");
                    } else {
                        serializable = null;
                    }
                    i.e(serializable, "null cannot be cast to non-null type com.theinnerhour.b2b.components.journal.model.JournalModel");
                    JournalModel journalModel = (JournalModel) serializable;
                    p requireActivity = requireActivity();
                    if (requireActivity instanceof JournalActivity) {
                        journalActivity = (JournalActivity) requireActivity;
                    } else {
                        journalActivity = null;
                    }
                    if (journalActivity != null) {
                        journalActivity.q0(journalModel);
                    }
                }
            }
            AppCompatImageView appCompatImageView4 = (AppCompatImageView) _$_findCachedViewById(R.id.parentNavBarBackButton);
            if (appCompatImageView4 != null) {
                appCompatImageView4.setOnClickListener(new nm.b(this, 3));
            }
            _$_findCachedViewById(R.id.layoutJournalTipsCard).setOnClickListener(new nm.b(this, 4));
            User user = FirebasePersistence.getInstance().getUser();
            if (user != null) {
                str = user.getFirstName();
            } else {
                str = null;
            }
            if (str != null && str.length() != 0) {
                z10 = false;
            } else {
                z10 = true;
            }
            if (!z10) {
                User user2 = FirebasePersistence.getInstance().getUser();
                if (user2 != null && (firstName = user2.getFirstName()) != null) {
                    str3 = r.i1(firstName).toString();
                } else {
                    str3 = null;
                }
                if (!i.b(str3, "null")) {
                    User user3 = FirebasePersistence.getInstance().getUser();
                    if (user3 != null) {
                        str4 = user3.getFirstName();
                    }
                    robertoTextView = (RobertoTextView) _$_findCachedViewById(R.id.parentNavBarHeader);
                    if (robertoTextView != null) {
                        if (str4 != null && !n.B0(str4)) {
                            z11 = false;
                            if (!z11 && !i.b(str4, "null")) {
                                str2 = getString(R.string.your_journal_name, str4) + ' ' + getString(R.string.journal_title_lowercase);
                                robertoTextView.setText(str2);
                            }
                            str2 = getString(R.string.your_journal_generic) + ' ' + getString(R.string.journal_title_lowercase);
                            robertoTextView.setText(str2);
                        }
                        z11 = true;
                        if (!z11) {
                            str2 = getString(R.string.your_journal_name, str4) + ' ' + getString(R.string.journal_title_lowercase);
                            robertoTextView.setText(str2);
                        }
                        str2 = getString(R.string.your_journal_generic) + ' ' + getString(R.string.journal_title_lowercase);
                        robertoTextView.setText(str2);
                    }
                    appCompatImageView = (AppCompatImageView) _$_findCachedViewById(R.id.ivParentNavBarFilterIndicator);
                    if (appCompatImageView == null) {
                        if (J().length == 0) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        if (!(!z12)) {
                            i6 = 8;
                        }
                        appCompatImageView.setVisibility(i6);
                        return;
                    }
                    return;
                }
            }
            str4 = SessionManager.getInstance().getStringValue(SessionManager.KEY_FIRSTNAME);
            robertoTextView = (RobertoTextView) _$_findCachedViewById(R.id.parentNavBarHeader);
            if (robertoTextView != null) {
            }
            appCompatImageView = (AppCompatImageView) _$_findCachedViewById(R.id.ivParentNavBarFilterIndicator);
            if (appCompatImageView == null) {
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f26398u, e10);
        }
    }
}
