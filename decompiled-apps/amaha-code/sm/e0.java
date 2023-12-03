package sm;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.m0;
import androidx.lifecycle.o0;
import androidx.lifecycle.q0;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.chip.ChipGroup;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.components.journal.activity.JournalParentActivity;
import com.theinnerhour.b2b.components.journal.model.ImageResponse;
import com.theinnerhour.b2b.components.journal.model.JournalAttachImageModel;
import com.theinnerhour.b2b.components.journal.model.JournalModel;
import com.theinnerhour.b2b.components.journal.model.JournalThoughtThinkingItemListModel;
import com.theinnerhour.b2b.utils.Constants;
import com.theinnerhour.b2b.utils.Extensions;
import com.theinnerhour.b2b.widgets.LoadingDots;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Metadata;
/* compiled from: JournalThoughtSummaryFragment.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lsm/e0;", "Lnm/h;", "<init>", "()V", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class e0 extends nm.h {

    /* renamed from: z  reason: collision with root package name */
    public static final /* synthetic */ int f31686z = 0;

    /* renamed from: w  reason: collision with root package name */
    public int f31688w;

    /* renamed from: x  reason: collision with root package name */
    public int f31689x;

    /* renamed from: y  reason: collision with root package name */
    public final LinkedHashMap f31690y = new LinkedHashMap();

    /* renamed from: v  reason: collision with root package name */
    public final m0 f31687v = kotlin.jvm.internal.b0.j(this, kotlin.jvm.internal.y.a(tm.e.class), new a(this), new b(this), new c(this));

    /* compiled from: FragmentViewModelLazy.kt */
    /* loaded from: classes2.dex */
    public static final class a extends kotlin.jvm.internal.k implements ss.a<q0> {

        /* renamed from: u  reason: collision with root package name */
        public final /* synthetic */ Fragment f31691u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Fragment fragment) {
            super(0);
            this.f31691u = fragment;
        }

        @Override // ss.a
        public final q0 invoke() {
            return defpackage.e.m(this.f31691u, "requireActivity().viewModelStore");
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    /* loaded from: classes2.dex */
    public static final class b extends kotlin.jvm.internal.k implements ss.a<k1.a> {

        /* renamed from: u  reason: collision with root package name */
        public final /* synthetic */ Fragment f31692u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Fragment fragment) {
            super(0);
            this.f31692u = fragment;
        }

        @Override // ss.a
        public final k1.a invoke() {
            return defpackage.b.r(this.f31692u, "requireActivity().defaultViewModelCreationExtras");
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    /* loaded from: classes2.dex */
    public static final class c extends kotlin.jvm.internal.k implements ss.a<o0.b> {

        /* renamed from: u  reason: collision with root package name */
        public final /* synthetic */ Fragment f31693u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Fragment fragment) {
            super(0);
            this.f31693u = fragment;
        }

        @Override // ss.a
        public final o0.b invoke() {
            return pl.a.e(this.f31693u, "requireActivity().defaultViewModelProviderFactory");
        }
    }

    @Override // nm.h
    public final void F(Integer num) {
        K(num, true);
    }

    public final tm.e J() {
        return (tm.e) this.f31687v.getValue();
    }

    public final void K(Integer num, boolean z10) {
        JournalModel journalModel;
        J().M = this.f31689x;
        long currentTimeMillis = System.currentTimeMillis();
        if (J().H && J().J != null) {
            journalModel = J().J;
            kotlin.jvm.internal.i.d(journalModel);
            journalModel.setData(J().A.d());
            journalModel.setLastUpdated(Calendar.getInstance().getTimeInMillis());
            journalModel.setUserEnteredDate(J().G);
            journalModel.setDraft(false);
        } else {
            journalModel = new JournalModel(String.valueOf(currentTimeMillis), currentTimeMillis, J().G, System.currentTimeMillis(), true, Constants.GOAL_TYPE_THOUGHT, false, J().A.d(), z10);
        }
        AppCompatImageView appCompatImageView = (AppCompatImageView) _$_findCachedViewById(R.id.ivJTSFooterSaveCta);
        if (appCompatImageView != null) {
            appCompatImageView.setVisibility(8);
        }
        RobertoTextView robertoTextView = (RobertoTextView) _$_findCachedViewById(R.id.tvJTSFooterSaveCta);
        if (robertoTextView != null) {
            robertoTextView.setVisibility(8);
        }
        LoadingDots loadingDots = (LoadingDots) _$_findCachedViewById(R.id.parentBottomButtonLoader);
        if (loadingDots != null) {
            loadingDots.setVisibility(0);
        }
        ConstraintLayout constraintLayout = (ConstraintLayout) _$_findCachedViewById(R.id.clJTSFooterSaveCta);
        if (constraintLayout != null) {
            constraintLayout.setOnClickListener(null);
        }
        if (z10) {
            J().A.f(false);
        }
        androidx.fragment.app.p requireActivity = requireActivity();
        kotlin.jvm.internal.i.e(requireActivity, "null cannot be cast to non-null type com.theinnerhour.b2b.components.journal.activity.JournalParentActivity");
        ((JournalParentActivity) requireActivity).r0(journalModel, z10, num);
    }

    @Override // nm.h
    public final void _$_clearFindViewByIdCache() {
        this.f31690y.clear();
    }

    public final View _$_findCachedViewById(int i6) {
        View findViewById;
        LinkedHashMap linkedHashMap = this.f31690y;
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
        return inflater.inflate(R.layout.fragment_journal_thought_summary, viewGroup, false);
    }

    @Override // nm.h, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        List<HashMap> list;
        List<HashMap> list2;
        String str;
        String str2;
        String str3;
        String str4;
        kotlin.jvm.internal.i.g(view, "view");
        super.onViewCreated(view, bundle);
        this.f31688w = J().A.f33281a;
        HashMap<String, Object> d10 = J().A.d();
        if (d10 != null) {
            RobertoTextView robertoTextView = (RobertoTextView) _$_findCachedViewById(R.id.tvJTSDateText);
            if (robertoTextView != null) {
                robertoTextView.setText(J().e(J().G));
            }
            RobertoTextView robertoTextView2 = (RobertoTextView) _$_findCachedViewById(R.id.tvJTSSituationDescriptionText);
            if (robertoTextView2 != null) {
                Object obj = d10.get("j" + this.f31688w + "_0_text_2");
                kotlin.jvm.internal.i.e(obj, "null cannot be cast to non-null type kotlin.String");
                robertoTextView2.setText(gv.r.i1(ca.a.Z((String) obj)));
            }
            Object obj2 = d10.get("j" + this.f31688w + "_1_list");
            kotlin.jvm.internal.i.e(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
            for (String str5 : (List) obj2) {
                ChipGroup chipGroup = (ChipGroup) _$_findCachedViewById(R.id.cgJTSFeelingContainer);
                if (chipGroup != null) {
                    int i6 = bn.a.f4534a;
                    androidx.fragment.app.p requireActivity = requireActivity();
                    kotlin.jvm.internal.i.f(requireActivity, "requireActivity()");
                    ChipGroup cgJTSFeelingContainer = (ChipGroup) _$_findCachedViewById(R.id.cgJTSFeelingContainer);
                    kotlin.jvm.internal.i.f(cgJTSFeelingContainer, "cgJTSFeelingContainer");
                    chipGroup.addView(bn.a.h(requireActivity, str5, cgJTSFeelingContainer, true, null));
                }
            }
            Object obj3 = d10.get("j" + this.f31688w + "_3_list");
            kotlin.jvm.internal.i.e(obj3, "null cannot be cast to non-null type kotlin.collections.List<java.util.HashMap<kotlin.String, kotlin.String>{ kotlin.collections.TypeAliasesKt.HashMap<kotlin.String, kotlin.String> }>");
            List<HashMap> list3 = (List) obj3;
            ArrayList arrayList = new ArrayList(is.i.H1(list3, 10));
            for (HashMap hashMap : list3) {
                String str6 = (String) hashMap.get("id");
                if (str6 == null) {
                    str3 = "";
                } else {
                    str3 = str6;
                }
                String str7 = (String) hashMap.get("title");
                if (str7 == null) {
                    str4 = "";
                } else {
                    str4 = str7;
                }
                arrayList.add(new JournalThoughtThinkingItemListModel(str3, str4, "", false, 8, null));
            }
            RobertoTextView robertoTextView3 = (RobertoTextView) _$_findCachedViewById(R.id.tvJTSDescribeDescriptionText);
            if (robertoTextView3 != null) {
                Object obj4 = d10.get("j" + this.f31688w + "_2_text_2");
                kotlin.jvm.internal.i.e(obj4, "null cannot be cast to non-null type kotlin.String");
                robertoTextView3.setText(gv.r.i1(ca.a.Z((String) obj4)));
            }
            Object obj5 = d10.get("j" + this.f31688w + "_0_images");
            if (obj5 instanceof List) {
                list = (List) obj5;
            } else {
                list = null;
            }
            if (list != null) {
                ArrayList arrayList2 = new ArrayList();
                for (HashMap hashMap2 : list) {
                    ImageResponse.Success success = new ImageResponse.Success(null, null, 3, null);
                    String str8 = (String) hashMap2.get("image");
                    if (str8 == null) {
                        str2 = "";
                    } else {
                        str2 = str8;
                    }
                    arrayList2.add(new JournalAttachImageModel(0.0d, null, success, str2, null, 19, null));
                }
                if (arrayList2.size() > 0) {
                    this.f31689x = arrayList2.size() + this.f31689x;
                    ((RecyclerView) _$_findCachedViewById(R.id.rvJTSSituationAttachedImages)).setVisibility(0);
                    RecyclerView recyclerView = (RecyclerView) _$_findCachedViewById(R.id.rvJTSSituationAttachedImages);
                    if (recyclerView != null) {
                        recyclerView.setLayoutManager(new LinearLayoutManager(requireActivity(), 0, false));
                    }
                    RecyclerView recyclerView2 = (RecyclerView) _$_findCachedViewById(R.id.rvJTSSituationAttachedImages);
                    if (recyclerView2 != null) {
                        androidx.fragment.app.p requireActivity2 = requireActivity();
                        kotlin.jvm.internal.i.f(requireActivity2, "requireActivity()");
                        recyclerView2.setAdapter(new mm.b(arrayList2, requireActivity2, true, y.f31768u, z.f31769u));
                    }
                }
            }
            Object obj6 = d10.get("j" + this.f31688w + "_2_images");
            if (obj6 instanceof List) {
                list2 = (List) obj6;
            } else {
                list2 = null;
            }
            if (list2 != null) {
                ArrayList arrayList3 = new ArrayList();
                for (HashMap hashMap3 : list2) {
                    ImageResponse.Success success2 = new ImageResponse.Success(null, null, 3, null);
                    String str9 = (String) hashMap3.get("image");
                    if (str9 == null) {
                        str = "";
                    } else {
                        str = str9;
                    }
                    arrayList3.add(new JournalAttachImageModel(0.0d, null, success2, str, null, 19, null));
                }
                if (arrayList3.size() > 0) {
                    this.f31689x = arrayList3.size() + this.f31689x;
                    ((RecyclerView) _$_findCachedViewById(R.id.rvJTSDescribeSituationAttachedImages)).setVisibility(0);
                    RecyclerView recyclerView3 = (RecyclerView) _$_findCachedViewById(R.id.rvJTSDescribeSituationAttachedImages);
                    if (recyclerView3 != null) {
                        recyclerView3.setLayoutManager(new LinearLayoutManager(requireActivity(), 0, false));
                    }
                    RecyclerView recyclerView4 = (RecyclerView) _$_findCachedViewById(R.id.rvJTSDescribeSituationAttachedImages);
                    if (recyclerView4 != null) {
                        androidx.fragment.app.p requireActivity3 = requireActivity();
                        kotlin.jvm.internal.i.f(requireActivity3, "requireActivity()");
                        recyclerView4.setAdapter(new mm.b(arrayList3, requireActivity3, true, a0.f31676u, b0.f31680u));
                    }
                }
            }
            if (arrayList.isEmpty()) {
                RobertoTextView robertoTextView4 = (RobertoTextView) _$_findCachedViewById(R.id.tvJTSThoughtTitleText);
                if (robertoTextView4 != null) {
                    Extensions.INSTANCE.gone(robertoTextView4);
                }
                RecyclerView recyclerView5 = (RecyclerView) _$_findCachedViewById(R.id.rvJTSThinkingStyleListView);
                if (recyclerView5 != null) {
                    Extensions.INSTANCE.gone(recyclerView5);
                }
            } else {
                RobertoTextView robertoTextView5 = (RobertoTextView) _$_findCachedViewById(R.id.tvJTSThoughtTitleText);
                if (robertoTextView5 != null) {
                    Extensions.INSTANCE.visible(robertoTextView5);
                }
                RecyclerView recyclerView6 = (RecyclerView) _$_findCachedViewById(R.id.rvJTSThinkingStyleListView);
                if (recyclerView6 != null) {
                    Extensions.INSTANCE.visible(recyclerView6);
                }
                RecyclerView recyclerView7 = (RecyclerView) _$_findCachedViewById(R.id.rvJTSThinkingStyleListView);
                if (recyclerView7 != null) {
                    recyclerView7.setLayoutManager(new LinearLayoutManager(requireActivity(), 1, false));
                }
                RecyclerView recyclerView8 = (RecyclerView) _$_findCachedViewById(R.id.rvJTSThinkingStyleListView);
                if (recyclerView8 != null) {
                    ArrayList arrayList4 = new ArrayList();
                    androidx.fragment.app.p requireActivity4 = requireActivity();
                    kotlin.jvm.internal.i.f(requireActivity4, "requireActivity()");
                    recyclerView8.setAdapter(new mm.i(arrayList, arrayList4, requireActivity4, c0.f31682u, d0.f31684u, true));
                }
            }
        }
        ConstraintLayout constraintLayout = (ConstraintLayout) _$_findCachedViewById(R.id.clJTSFooterSaveCta);
        if (constraintLayout != null) {
            constraintLayout.setOnClickListener(new View.OnClickListener(this) { // from class: sm.x

                /* renamed from: v  reason: collision with root package name */
                public final /* synthetic */ e0 f31767v;

                {
                    this.f31767v = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    tm.a aVar;
                    tm.a aVar2;
                    int i10 = r2;
                    int i11 = 0;
                    String str10 = null;
                    e0 this$0 = this.f31767v;
                    switch (i10) {
                        case 0:
                            int i12 = e0.f31686z;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.K(null, false);
                            return;
                        default:
                            int i13 = e0.f31686z;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            androidx.fragment.app.p requireActivity5 = this$0.requireActivity();
                            kotlin.jvm.internal.i.e(requireActivity5, "null cannot be cast to non-null type com.theinnerhour.b2b.components.journal.activity.JournalParentActivity");
                            JournalParentActivity journalParentActivity = (JournalParentActivity) requireActivity5;
                            tm.e eVar = journalParentActivity.f11217v;
                            if (eVar != null && (aVar2 = eVar.A) != null) {
                                int i14 = aVar2.f33281a;
                                Integer[] numArr = aVar2.f33286g;
                                numArr[i14] = 0;
                                int i15 = aVar2.f33281a;
                                str10 = aVar2.f33282b[i15][numArr[i15].intValue()];
                            }
                            journalParentActivity.w0(R.anim.fragment_slide_left_enter, R.anim.fragment_slide_right_exit, str10);
                            tm.e eVar2 = journalParentActivity.f11217v;
                            if (eVar2 != null && (aVar = eVar2.A) != null) {
                                i11 = aVar.f33282b[aVar.f33281a].length;
                            }
                            if (i11 > 1) {
                                journalParentActivity.s0();
                                return;
                            }
                            return;
                    }
                }
            });
        }
        ConstraintLayout constraintLayout2 = (ConstraintLayout) _$_findCachedViewById(R.id.clJTSFooterEditCta);
        if (constraintLayout2 != null) {
            constraintLayout2.setOnClickListener(new View.OnClickListener(this) { // from class: sm.x

                /* renamed from: v  reason: collision with root package name */
                public final /* synthetic */ e0 f31767v;

                {
                    this.f31767v = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    tm.a aVar;
                    tm.a aVar2;
                    int i10 = r2;
                    int i11 = 0;
                    String str10 = null;
                    e0 this$0 = this.f31767v;
                    switch (i10) {
                        case 0:
                            int i12 = e0.f31686z;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.K(null, false);
                            return;
                        default:
                            int i13 = e0.f31686z;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            androidx.fragment.app.p requireActivity5 = this$0.requireActivity();
                            kotlin.jvm.internal.i.e(requireActivity5, "null cannot be cast to non-null type com.theinnerhour.b2b.components.journal.activity.JournalParentActivity");
                            JournalParentActivity journalParentActivity = (JournalParentActivity) requireActivity5;
                            tm.e eVar = journalParentActivity.f11217v;
                            if (eVar != null && (aVar2 = eVar.A) != null) {
                                int i14 = aVar2.f33281a;
                                Integer[] numArr = aVar2.f33286g;
                                numArr[i14] = 0;
                                int i15 = aVar2.f33281a;
                                str10 = aVar2.f33282b[i15][numArr[i15].intValue()];
                            }
                            journalParentActivity.w0(R.anim.fragment_slide_left_enter, R.anim.fragment_slide_right_exit, str10);
                            tm.e eVar2 = journalParentActivity.f11217v;
                            if (eVar2 != null && (aVar = eVar2.A) != null) {
                                i11 = aVar.f33282b[aVar.f33281a].length;
                            }
                            if (i11 > 1) {
                                journalParentActivity.s0();
                                return;
                            }
                            return;
                    }
                }
            });
        }
    }

    @Override // nm.h
    public final void I() {
    }
}
