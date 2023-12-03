package sm;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;
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
import com.theinnerhour.b2b.components.journal.activity.JournalActivity;
import com.theinnerhour.b2b.components.journal.model.ImageResponse;
import com.theinnerhour.b2b.components.journal.model.JournalAttachImageModel;
import com.theinnerhour.b2b.components.journal.model.JournalModel;
import com.theinnerhour.b2b.components.journal.model.JournalThoughtThinkingItemListModel;
import com.theinnerhour.b2b.utils.Constants;
import com.theinnerhour.b2b.utils.Extensions;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
/* compiled from: JTSFragment.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lsm/j;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class j extends Fragment {

    /* renamed from: y  reason: collision with root package name */
    public static final /* synthetic */ int f31709y = 0;

    /* renamed from: w  reason: collision with root package name */
    public boolean f31712w;

    /* renamed from: x  reason: collision with root package name */
    public final LinkedHashMap f31713x = new LinkedHashMap();

    /* renamed from: u  reason: collision with root package name */
    public final m0 f31710u = kotlin.jvm.internal.b0.j(this, kotlin.jvm.internal.y.a(um.c.class), new a(this), new b(this), new c(this));

    /* renamed from: v  reason: collision with root package name */
    public final int f31711v = 2;

    /* compiled from: FragmentViewModelLazy.kt */
    /* loaded from: classes2.dex */
    public static final class a extends kotlin.jvm.internal.k implements ss.a<q0> {

        /* renamed from: u  reason: collision with root package name */
        public final /* synthetic */ Fragment f31714u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Fragment fragment) {
            super(0);
            this.f31714u = fragment;
        }

        @Override // ss.a
        public final q0 invoke() {
            return defpackage.e.m(this.f31714u, "requireActivity().viewModelStore");
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    /* loaded from: classes2.dex */
    public static final class b extends kotlin.jvm.internal.k implements ss.a<k1.a> {

        /* renamed from: u  reason: collision with root package name */
        public final /* synthetic */ Fragment f31715u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Fragment fragment) {
            super(0);
            this.f31715u = fragment;
        }

        @Override // ss.a
        public final k1.a invoke() {
            return defpackage.b.r(this.f31715u, "requireActivity().defaultViewModelCreationExtras");
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    /* loaded from: classes2.dex */
    public static final class c extends kotlin.jvm.internal.k implements ss.a<o0.b> {

        /* renamed from: u  reason: collision with root package name */
        public final /* synthetic */ Fragment f31716u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Fragment fragment) {
            super(0);
            this.f31716u = fragment;
        }

        @Override // ss.a
        public final o0.b invoke() {
            return pl.a.e(this.f31716u, "requireActivity().defaultViewModelProviderFactory");
        }
    }

    public final um.c F() {
        return (um.c) this.f31710u.getValue();
    }

    public final void I(boolean z10) {
        if (z10) {
            requireActivity().onBackPressed();
        } else {
            Toast.makeText(requireContext(), getString(R.string.telecommunicationsError), 0).show();
        }
    }

    public final View _$_findCachedViewById(int i6) {
        View findViewById;
        LinkedHashMap linkedHashMap = this.f31713x;
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

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.f31713x.clear();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v24, types: [kotlin.jvm.internal.d, com.google.firebase.storage.StorageReference, java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v30 */
    /* JADX WARN: Type inference failed for: r3v33 */
    /* JADX WARN: Type inference failed for: r9v0, types: [is.w] */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v5, types: [java.util.ArrayList] */
    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        HashMap<String, Object> data;
        List list;
        List list2;
        ?? r92;
        List list3;
        List list4;
        int i6;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        CharSequence charSequence;
        HashMap hashMap;
        Object obj;
        String str6;
        HashMap hashMap2;
        Object obj2;
        String str7;
        String str8;
        ChipGroup chipGroup;
        String str9;
        CharSequence charSequence2;
        RobertoTextView robertoTextView;
        kotlin.jvm.internal.i.g(view, "view");
        super.onViewCreated(view, bundle);
        JournalModel journalModel = F().G;
        if (journalModel != null && (data = journalModel.getData()) != null) {
            JournalModel journalModel2 = F().G;
            if (journalModel2 != null && (robertoTextView = (RobertoTextView) _$_findCachedViewById(R.id.tvJTSDateText)) != null) {
                robertoTextView.setText(F().F.b(journalModel2.getUserEnteredDate()));
            }
            RobertoTextView robertoTextView2 = (RobertoTextView) _$_findCachedViewById(R.id.tvJTSSituationDescriptionText);
            ?? r32 = 0;
            int i10 = this.f31711v;
            if (robertoTextView2 != null) {
                Object obj3 = data.get("j" + i10 + "_0_text_2");
                if (obj3 instanceof String) {
                    str9 = (String) obj3;
                } else {
                    str9 = null;
                }
                if (str9 != null) {
                    charSequence2 = gv.r.i1(ca.a.Z(str9));
                } else {
                    charSequence2 = null;
                }
                robertoTextView2.setText(charSequence2);
            }
            Object obj4 = data.get("j" + i10 + "_1_list");
            if (obj4 instanceof List) {
                list = (List) obj4;
            } else {
                list = null;
            }
            if (list != null) {
                for (Object obj5 : list) {
                    if ((obj5 instanceof String) && (chipGroup = (ChipGroup) _$_findCachedViewById(R.id.cgJTSFeelingContainer)) != null) {
                        int i11 = bn.a.f4534a;
                        androidx.fragment.app.p requireActivity = requireActivity();
                        kotlin.jvm.internal.i.f(requireActivity, "requireActivity()");
                        ChipGroup cgJTSFeelingContainer = (ChipGroup) _$_findCachedViewById(R.id.cgJTSFeelingContainer);
                        kotlin.jvm.internal.i.f(cgJTSFeelingContainer, "cgJTSFeelingContainer");
                        chipGroup.addView(bn.a.h(requireActivity, (String) obj5, cgJTSFeelingContainer, true, null));
                    }
                }
            }
            Object obj6 = data.get("j" + i10 + "_3_list");
            if (obj6 instanceof List) {
                list2 = (List) obj6;
            } else {
                list2 = null;
            }
            if (list2 != null) {
                r92 = new ArrayList(is.i.H1(list2, 10));
                for (Object obj7 : list2) {
                    boolean z10 = obj7 instanceof HashMap;
                    if (z10) {
                        hashMap = (HashMap) obj7;
                    } else {
                        hashMap = null;
                    }
                    if (hashMap != null) {
                        obj = hashMap.get("id");
                    } else {
                        obj = null;
                    }
                    if (obj instanceof String) {
                        str6 = (String) obj;
                    } else {
                        str6 = null;
                    }
                    if (str6 == null) {
                        str6 = "";
                    }
                    if (z10) {
                        hashMap2 = (HashMap) obj7;
                    } else {
                        hashMap2 = null;
                    }
                    if (hashMap2 != null) {
                        obj2 = hashMap2.get("title");
                    } else {
                        obj2 = null;
                    }
                    if (obj2 instanceof String) {
                        str7 = (String) obj2;
                    } else {
                        str7 = null;
                    }
                    if (str7 == null) {
                        str8 = "";
                    } else {
                        str8 = str7;
                    }
                    r92.add(new JournalThoughtThinkingItemListModel(str6, str8, "", false, 8, null));
                }
            } else {
                r92 = is.w.f20676u;
            }
            List list5 = r92;
            RobertoTextView robertoTextView3 = (RobertoTextView) _$_findCachedViewById(R.id.tvJTSDescribeDescriptionText);
            if (robertoTextView3 != null) {
                Object obj8 = data.get("j" + i10 + "_2_text_2");
                if (obj8 instanceof String) {
                    str5 = (String) obj8;
                } else {
                    str5 = null;
                }
                if (str5 != null) {
                    charSequence = gv.r.i1(ca.a.Z(str5));
                } else {
                    charSequence = null;
                }
                robertoTextView3.setText(charSequence);
            }
            Object obj9 = data.get("j" + i10 + "_0_images");
            if (obj9 instanceof List) {
                list3 = (List) obj9;
            } else {
                list3 = null;
            }
            if (list3 != null) {
                ArrayList arrayList = new ArrayList();
                for (Object obj10 : list3) {
                    if (obj10 instanceof HashMap) {
                        ImageResponse.Success success = new ImageResponse.Success(r32, r32, 3, r32);
                        Object obj11 = ((Map) obj10).get("image");
                        if (obj11 instanceof String) {
                            str3 = (String) obj11;
                        } else {
                            str3 = null;
                        }
                        if (str3 == null) {
                            str4 = "";
                        } else {
                            str4 = str3;
                        }
                        arrayList.add(new JournalAttachImageModel(0.0d, null, success, str4, null, 19, null));
                        r32 = 0;
                    }
                }
                if (arrayList.size() > 0) {
                    ((RecyclerView) _$_findCachedViewById(R.id.rvJTSSituationAttachedImages)).setVisibility(0);
                    RecyclerView recyclerView = (RecyclerView) _$_findCachedViewById(R.id.rvJTSSituationAttachedImages);
                    if (recyclerView != null) {
                        recyclerView.setLayoutManager(new LinearLayoutManager(requireActivity(), 0, false));
                    }
                    RecyclerView recyclerView2 = (RecyclerView) _$_findCachedViewById(R.id.rvJTSSituationAttachedImages);
                    if (recyclerView2 != null) {
                        androidx.fragment.app.p requireActivity2 = requireActivity();
                        kotlin.jvm.internal.i.f(requireActivity2, "requireActivity()");
                        recyclerView2.setAdapter(new mm.b(arrayList, requireActivity2, true, sm.c.f31681u, d.f31683u));
                    }
                }
            }
            Object obj12 = data.get("j" + i10 + "_2_images");
            if (obj12 instanceof List) {
                list4 = (List) obj12;
            } else {
                list4 = null;
            }
            if (list4 != null) {
                ArrayList arrayList2 = new ArrayList();
                for (Object obj13 : list4) {
                    if (obj13 instanceof HashMap) {
                        ImageResponse.Success success2 = new ImageResponse.Success(null, null, 3, null);
                        Object obj14 = ((Map) obj13).get("image");
                        if (obj14 instanceof String) {
                            str = (String) obj14;
                        } else {
                            str = null;
                        }
                        if (str == null) {
                            str2 = "";
                        } else {
                            str2 = str;
                        }
                        arrayList2.add(new JournalAttachImageModel(0.0d, null, success2, str2, null, 19, null));
                    }
                }
                if (arrayList2.size() > 0) {
                    ((RecyclerView) _$_findCachedViewById(R.id.rvJTSDescribeSituationAttachedImages)).setVisibility(0);
                    RecyclerView recyclerView3 = (RecyclerView) _$_findCachedViewById(R.id.rvJTSDescribeSituationAttachedImages);
                    if (recyclerView3 != null) {
                        recyclerView3.setLayoutManager(new LinearLayoutManager(requireActivity(), 0, false));
                    }
                    RecyclerView recyclerView4 = (RecyclerView) _$_findCachedViewById(R.id.rvJTSDescribeSituationAttachedImages);
                    if (recyclerView4 != null) {
                        androidx.fragment.app.p requireActivity3 = requireActivity();
                        kotlin.jvm.internal.i.f(requireActivity3, "requireActivity()");
                        recyclerView4.setAdapter(new mm.b(arrayList2, requireActivity3, true, e.f31685u, f.f31694u));
                    }
                }
            }
            if (list5.isEmpty()) {
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
                    ArrayList arrayList3 = new ArrayList();
                    androidx.fragment.app.p requireActivity4 = requireActivity();
                    kotlin.jvm.internal.i.f(requireActivity4, "requireActivity()");
                    recyclerView8.setAdapter(new mm.i(list5, arrayList3, requireActivity4, g.f31696u, h.f31698u, true));
                }
            }
            ConstraintLayout constraintLayout = (ConstraintLayout) _$_findCachedViewById(R.id.clJTSFooterContainer);
            if (constraintLayout != null) {
                constraintLayout.setVisibility(8);
            }
            View _$_findCachedViewById = _$_findCachedViewById(R.id.viewJournalHeaderBg);
            if (_$_findCachedViewById != null) {
                _$_findCachedViewById.setVisibility(0);
            }
            AppCompatImageView appCompatImageView = (AppCompatImageView) _$_findCachedViewById(R.id.parentNavBarBackButton);
            if (appCompatImageView != null) {
                appCompatImageView.setVisibility(0);
            }
            RobertoTextView robertoTextView6 = (RobertoTextView) _$_findCachedViewById(R.id.parentNavBarHeader);
            if (robertoTextView6 != null) {
                robertoTextView6.setVisibility(0);
            }
            AppCompatImageView appCompatImageView2 = (AppCompatImageView) _$_findCachedViewById(R.id.parentNavBarInfoButton2);
            if (appCompatImageView2 != null) {
                appCompatImageView2.setVisibility(0);
            }
            AppCompatImageView appCompatImageView3 = (AppCompatImageView) _$_findCachedViewById(R.id.parentNavBarInfoButton);
            if (appCompatImageView3 != null) {
                appCompatImageView3.setVisibility(0);
            }
            AppCompatImageView appCompatImageView4 = (AppCompatImageView) _$_findCachedViewById(R.id.parentNavBarInfoButton);
            if (appCompatImageView4 != null) {
                appCompatImageView4.setOnClickListener(new View.OnClickListener(this) { // from class: sm.a

                    /* renamed from: v  reason: collision with root package name */
                    public final /* synthetic */ j f31675v;

                    {
                        this.f31675v = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        boolean z11;
                        JournalActivity journalActivity;
                        androidx.fragment.app.p requireActivity5;
                        int i12;
                        String str10;
                        int i13;
                        int i14 = r2;
                        String str11 = "";
                        final j this$0 = this.f31675v;
                        switch (i14) {
                            case 0:
                                int i15 = j.f31709y;
                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                ConstraintLayout constraintLayout2 = (ConstraintLayout) this$0._$_findCachedViewById(R.id.clJournalAdditionalMenu);
                                if (constraintLayout2 != null && Extensions.INSTANCE.isVisible(constraintLayout2)) {
                                    z11 = true;
                                } else {
                                    z11 = false;
                                }
                                ConstraintLayout constraintLayout3 = (ConstraintLayout) this$0._$_findCachedViewById(R.id.clJournalAdditionalMenu);
                                if (z11) {
                                    if (constraintLayout3 != null) {
                                        Extensions.INSTANCE.gone(constraintLayout3);
                                    }
                                } else if (constraintLayout3 != null) {
                                    Extensions.INSTANCE.visible(constraintLayout3);
                                }
                                String str12 = gk.a.f16573a;
                                Bundle bundle2 = new Bundle();
                                JournalModel journalModel3 = this$0.F().G;
                                kotlin.jvm.internal.i.d(journalModel3);
                                String templateType = journalModel3.getTemplateType();
                                kotlin.jvm.internal.i.g(templateType, "templateType");
                                if (kotlin.jvm.internal.i.b(templateType, "regular")) {
                                    str11 = "free_text_journal";
                                } else if (kotlin.jvm.internal.i.b(templateType, "question")) {
                                    str11 = "question";
                                } else if (kotlin.jvm.internal.i.b(templateType, Constants.GOAL_TYPE_THOUGHT)) {
                                    str11 = "thought_journal";
                                } else if (kotlin.jvm.internal.i.b(templateType, "arc")) {
                                    str11 = "arc";
                                }
                                bundle2.putString("template", str11);
                                JournalModel journalModel4 = this$0.F().G;
                                kotlin.jvm.internal.i.d(journalModel4);
                                bundle2.putString("entry_id", journalModel4.getId());
                                hs.k kVar = hs.k.f19476a;
                                gk.a.b(bundle2, "journal_right_top_menu_click");
                                return;
                            case 1:
                                int i16 = j.f31709y;
                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                androidx.fragment.app.p requireActivity6 = this$0.requireActivity();
                                if (requireActivity6 instanceof JournalActivity) {
                                    journalActivity = (JournalActivity) requireActivity6;
                                } else {
                                    journalActivity = null;
                                }
                                if (journalActivity != null) {
                                    JournalModel journalModel5 = this$0.F().G;
                                    kotlin.jvm.internal.i.d(journalModel5);
                                    String id2 = journalModel5.getId();
                                    JournalModel journalModel6 = this$0.F().G;
                                    kotlin.jvm.internal.i.d(journalModel6);
                                    journalActivity.o0(id2, journalModel6.getTemplateType());
                                }
                                String str13 = gk.a.f16573a;
                                Bundle bundle3 = new Bundle();
                                JournalModel journalModel7 = this$0.F().G;
                                kotlin.jvm.internal.i.d(journalModel7);
                                String templateType2 = journalModel7.getTemplateType();
                                kotlin.jvm.internal.i.g(templateType2, "templateType");
                                if (kotlin.jvm.internal.i.b(templateType2, "regular")) {
                                    str11 = "free_text_journal";
                                } else if (kotlin.jvm.internal.i.b(templateType2, "question")) {
                                    str11 = "question";
                                } else if (kotlin.jvm.internal.i.b(templateType2, Constants.GOAL_TYPE_THOUGHT)) {
                                    str11 = "thought_journal";
                                } else if (kotlin.jvm.internal.i.b(templateType2, "arc")) {
                                    str11 = "arc";
                                }
                                bundle3.putString("template", str11);
                                JournalModel journalModel8 = this$0.F().G;
                                kotlin.jvm.internal.i.d(journalModel8);
                                bundle3.putString("entry_id", journalModel8.getId());
                                bundle3.putBoolean("is_draft", false);
                                hs.k kVar2 = hs.k.f19476a;
                                gk.a.b(bundle3, "journal_edit_option_click");
                                return;
                            case 2:
                                int i17 = j.f31709y;
                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                um.c F = this$0.F();
                                Context requireContext = this$0.requireContext();
                                kotlin.jvm.internal.i.f(requireContext, "requireContext()");
                                F.getClass();
                                final Dialog f = um.c.f(requireContext);
                                RobertoTextView robertoTextView7 = (RobertoTextView) f.findViewById(R.id.tvJournalDialogCancel);
                                if (robertoTextView7 != null) {
                                    robertoTextView7.setOnClickListener(new View.OnClickListener() { // from class: sm.b
                                        @Override // android.view.View.OnClickListener
                                        public final void onClick(View view3) {
                                            String str14;
                                            String str15;
                                            int i18 = r3;
                                            Dialog deletionDialog = f;
                                            j this$02 = this$0;
                                            switch (i18) {
                                                case 0:
                                                    int i19 = j.f31709y;
                                                    kotlin.jvm.internal.i.g(this$02, "this$0");
                                                    kotlin.jvm.internal.i.g(deletionDialog, "$deletionDialog");
                                                    JournalModel journalModel9 = this$02.F().G;
                                                    if (journalModel9 != null) {
                                                        String str16 = gk.a.f16573a;
                                                        Bundle bundle4 = new Bundle();
                                                        bundle4.putString("entry_id", journalModel9.getId());
                                                        bundle4.putLong("user_entered_date", journalModel9.getUserEnteredDate());
                                                        bundle4.putBoolean("is_favourite", journalModel9.isFavourite());
                                                        String templateType3 = journalModel9.getTemplateType();
                                                        kotlin.jvm.internal.i.g(templateType3, "templateType");
                                                        if (kotlin.jvm.internal.i.b(templateType3, "regular")) {
                                                            str15 = "free_text_journal";
                                                        } else if (kotlin.jvm.internal.i.b(templateType3, "question")) {
                                                            str15 = "question";
                                                        } else if (kotlin.jvm.internal.i.b(templateType3, Constants.GOAL_TYPE_THOUGHT)) {
                                                            str15 = "thought_journal";
                                                        } else if (!kotlin.jvm.internal.i.b(templateType3, "arc")) {
                                                            str15 = "";
                                                        } else {
                                                            str15 = "arc";
                                                        }
                                                        bundle4.putString("template", str15);
                                                        bundle4.putBoolean("is_draft", false);
                                                        hs.k kVar3 = hs.k.f19476a;
                                                        gk.a.b(bundle4, "journal_delete_popup_no");
                                                    }
                                                    deletionDialog.dismiss();
                                                    return;
                                                default:
                                                    int i20 = j.f31709y;
                                                    kotlin.jvm.internal.i.g(this$02, "this$0");
                                                    kotlin.jvm.internal.i.g(deletionDialog, "$deletionDialog");
                                                    if (this$02.F().G != null) {
                                                        RobertoTextView robertoTextView8 = (RobertoTextView) deletionDialog.findViewById(R.id.tvJournalDialogYes);
                                                        if (robertoTextView8 != null) {
                                                            robertoTextView8.setTextColor(g0.a.b(this$02.requireContext(), R.color.amahaTerracota));
                                                        }
                                                        View findViewById = deletionDialog.findViewById(R.id.ldJournalDialogYesLoading);
                                                        if (findViewById != null) {
                                                            findViewById.setVisibility(0);
                                                        }
                                                        um.c F2 = this$02.F();
                                                        JournalModel journalModel10 = this$02.F().G;
                                                        kotlin.jvm.internal.i.d(journalModel10);
                                                        F2.e(journalModel10.getFirestoreDocumentId());
                                                        this$02.F().E.e(this$02.getViewLifecycleOwner(), new qm.c(5, new i(this$02, deletionDialog)));
                                                        JournalModel journalModel11 = this$02.F().G;
                                                        if (journalModel11 != null) {
                                                            String str17 = gk.a.f16573a;
                                                            Bundle bundle5 = new Bundle();
                                                            bundle5.putString("entry_id", journalModel11.getId());
                                                            bundle5.putLong("user_entered_date", journalModel11.getUserEnteredDate());
                                                            bundle5.putBoolean("is_favourite", journalModel11.isFavourite());
                                                            String templateType4 = journalModel11.getTemplateType();
                                                            kotlin.jvm.internal.i.g(templateType4, "templateType");
                                                            if (kotlin.jvm.internal.i.b(templateType4, "regular")) {
                                                                str14 = "free_text_journal";
                                                            } else if (kotlin.jvm.internal.i.b(templateType4, "question")) {
                                                                str14 = "question";
                                                            } else if (kotlin.jvm.internal.i.b(templateType4, Constants.GOAL_TYPE_THOUGHT)) {
                                                                str14 = "thought_journal";
                                                            } else if (!kotlin.jvm.internal.i.b(templateType4, "arc")) {
                                                                str14 = "";
                                                            } else {
                                                                str14 = "arc";
                                                            }
                                                            bundle5.putString("template", str14);
                                                            bundle5.putBoolean("is_draft", false);
                                                            hs.k kVar4 = hs.k.f19476a;
                                                            gk.a.b(bundle5, "journal_delete_popup_yes");
                                                            return;
                                                        }
                                                        return;
                                                    }
                                                    this$02.I(false);
                                                    deletionDialog.dismiss();
                                                    return;
                                            }
                                        }
                                    });
                                }
                                RobertoTextView robertoTextView8 = (RobertoTextView) f.findViewById(R.id.tvJournalDialogYes);
                                if (robertoTextView8 != null) {
                                    robertoTextView8.setOnClickListener(new View.OnClickListener() { // from class: sm.b
                                        @Override // android.view.View.OnClickListener
                                        public final void onClick(View view3) {
                                            String str14;
                                            String str15;
                                            int i18 = r3;
                                            Dialog deletionDialog = f;
                                            j this$02 = this$0;
                                            switch (i18) {
                                                case 0:
                                                    int i19 = j.f31709y;
                                                    kotlin.jvm.internal.i.g(this$02, "this$0");
                                                    kotlin.jvm.internal.i.g(deletionDialog, "$deletionDialog");
                                                    JournalModel journalModel9 = this$02.F().G;
                                                    if (journalModel9 != null) {
                                                        String str16 = gk.a.f16573a;
                                                        Bundle bundle4 = new Bundle();
                                                        bundle4.putString("entry_id", journalModel9.getId());
                                                        bundle4.putLong("user_entered_date", journalModel9.getUserEnteredDate());
                                                        bundle4.putBoolean("is_favourite", journalModel9.isFavourite());
                                                        String templateType3 = journalModel9.getTemplateType();
                                                        kotlin.jvm.internal.i.g(templateType3, "templateType");
                                                        if (kotlin.jvm.internal.i.b(templateType3, "regular")) {
                                                            str15 = "free_text_journal";
                                                        } else if (kotlin.jvm.internal.i.b(templateType3, "question")) {
                                                            str15 = "question";
                                                        } else if (kotlin.jvm.internal.i.b(templateType3, Constants.GOAL_TYPE_THOUGHT)) {
                                                            str15 = "thought_journal";
                                                        } else if (!kotlin.jvm.internal.i.b(templateType3, "arc")) {
                                                            str15 = "";
                                                        } else {
                                                            str15 = "arc";
                                                        }
                                                        bundle4.putString("template", str15);
                                                        bundle4.putBoolean("is_draft", false);
                                                        hs.k kVar3 = hs.k.f19476a;
                                                        gk.a.b(bundle4, "journal_delete_popup_no");
                                                    }
                                                    deletionDialog.dismiss();
                                                    return;
                                                default:
                                                    int i20 = j.f31709y;
                                                    kotlin.jvm.internal.i.g(this$02, "this$0");
                                                    kotlin.jvm.internal.i.g(deletionDialog, "$deletionDialog");
                                                    if (this$02.F().G != null) {
                                                        RobertoTextView robertoTextView82 = (RobertoTextView) deletionDialog.findViewById(R.id.tvJournalDialogYes);
                                                        if (robertoTextView82 != null) {
                                                            robertoTextView82.setTextColor(g0.a.b(this$02.requireContext(), R.color.amahaTerracota));
                                                        }
                                                        View findViewById = deletionDialog.findViewById(R.id.ldJournalDialogYesLoading);
                                                        if (findViewById != null) {
                                                            findViewById.setVisibility(0);
                                                        }
                                                        um.c F2 = this$02.F();
                                                        JournalModel journalModel10 = this$02.F().G;
                                                        kotlin.jvm.internal.i.d(journalModel10);
                                                        F2.e(journalModel10.getFirestoreDocumentId());
                                                        this$02.F().E.e(this$02.getViewLifecycleOwner(), new qm.c(5, new i(this$02, deletionDialog)));
                                                        JournalModel journalModel11 = this$02.F().G;
                                                        if (journalModel11 != null) {
                                                            String str17 = gk.a.f16573a;
                                                            Bundle bundle5 = new Bundle();
                                                            bundle5.putString("entry_id", journalModel11.getId());
                                                            bundle5.putLong("user_entered_date", journalModel11.getUserEnteredDate());
                                                            bundle5.putBoolean("is_favourite", journalModel11.isFavourite());
                                                            String templateType4 = journalModel11.getTemplateType();
                                                            kotlin.jvm.internal.i.g(templateType4, "templateType");
                                                            if (kotlin.jvm.internal.i.b(templateType4, "regular")) {
                                                                str14 = "free_text_journal";
                                                            } else if (kotlin.jvm.internal.i.b(templateType4, "question")) {
                                                                str14 = "question";
                                                            } else if (kotlin.jvm.internal.i.b(templateType4, Constants.GOAL_TYPE_THOUGHT)) {
                                                                str14 = "thought_journal";
                                                            } else if (!kotlin.jvm.internal.i.b(templateType4, "arc")) {
                                                                str14 = "";
                                                            } else {
                                                                str14 = "arc";
                                                            }
                                                            bundle5.putString("template", str14);
                                                            bundle5.putBoolean("is_draft", false);
                                                            hs.k kVar4 = hs.k.f19476a;
                                                            gk.a.b(bundle5, "journal_delete_popup_yes");
                                                            return;
                                                        }
                                                        return;
                                                    }
                                                    this$02.I(false);
                                                    deletionDialog.dismiss();
                                                    return;
                                            }
                                        }
                                    });
                                }
                                f.show();
                                JournalModel journalModel9 = this$0.F().G;
                                if (journalModel9 != null) {
                                    String str14 = gk.a.f16573a;
                                    Bundle bundle4 = new Bundle();
                                    bundle4.putBoolean("is_draft", false);
                                    bundle4.putString("entry_id", journalModel9.getId());
                                    bundle4.putLong("user_entered_date", journalModel9.getUserEnteredDate());
                                    bundle4.putBoolean("is_favourite", journalModel9.isFavourite());
                                    String templateType3 = journalModel9.getTemplateType();
                                    kotlin.jvm.internal.i.g(templateType3, "templateType");
                                    if (kotlin.jvm.internal.i.b(templateType3, "regular")) {
                                        str11 = "free_text_journal";
                                    } else if (kotlin.jvm.internal.i.b(templateType3, "question")) {
                                        str11 = "question";
                                    } else if (kotlin.jvm.internal.i.b(templateType3, Constants.GOAL_TYPE_THOUGHT)) {
                                        str11 = "thought_journal";
                                    } else if (kotlin.jvm.internal.i.b(templateType3, "arc")) {
                                        str11 = "arc";
                                    }
                                    bundle4.putString("template", str11);
                                    hs.k kVar3 = hs.k.f19476a;
                                    gk.a.b(bundle4, "journal_delete_click");
                                    return;
                                }
                                return;
                            case 3:
                                int i18 = j.f31709y;
                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                this$0.f31712w = !this$0.f31712w;
                                um.c F2 = this$0.F();
                                JournalModel journalModel10 = this$0.F().G;
                                kotlin.jvm.internal.i.d(journalModel10);
                                if (this$0.f31712w) {
                                    requireActivity5 = this$0.requireActivity();
                                    i12 = R.string.added_to_favourites;
                                } else {
                                    requireActivity5 = this$0.requireActivity();
                                    i12 = R.string.removed_favourites;
                                }
                                Toast.makeText(requireActivity5, this$0.getString(i12), 0).show();
                                journalModel10.setFavourite(this$0.f31712w);
                                F2.h(journalModel10);
                                AppCompatImageView appCompatImageView5 = (AppCompatImageView) this$0._$_findCachedViewById(R.id.parentNavBarInfoButton2);
                                if (appCompatImageView5 != null) {
                                    if (this$0.f31712w) {
                                        i13 = R.drawable.ic_journal_star_favourite_enabled;
                                    } else {
                                        i13 = R.drawable.ic_journal_star_favourite;
                                    }
                                    appCompatImageView5.setImageResource(i13);
                                }
                                String str15 = gk.a.f16573a;
                                if (this$0.f31712w) {
                                    str10 = "journal_fav_icon_click";
                                } else {
                                    str10 = "journal_unfav_icon_click";
                                }
                                Bundle bundle5 = new Bundle();
                                JournalModel journalModel11 = this$0.F().G;
                                kotlin.jvm.internal.i.d(journalModel11);
                                String templateType4 = journalModel11.getTemplateType();
                                kotlin.jvm.internal.i.g(templateType4, "templateType");
                                if (kotlin.jvm.internal.i.b(templateType4, "regular")) {
                                    str11 = "free_text_journal";
                                } else if (kotlin.jvm.internal.i.b(templateType4, "question")) {
                                    str11 = "question";
                                } else if (kotlin.jvm.internal.i.b(templateType4, Constants.GOAL_TYPE_THOUGHT)) {
                                    str11 = "thought_journal";
                                } else if (kotlin.jvm.internal.i.b(templateType4, "arc")) {
                                    str11 = "arc";
                                }
                                bundle5.putString("template", str11);
                                JournalModel journalModel12 = this$0.F().G;
                                kotlin.jvm.internal.i.d(journalModel12);
                                bundle5.putString("entry_id", journalModel12.getId());
                                hs.k kVar4 = hs.k.f19476a;
                                gk.a.b(bundle5, str10);
                                return;
                            default:
                                int i19 = j.f31709y;
                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                this$0.requireActivity().onBackPressed();
                                return;
                        }
                    }
                });
            }
            RobertoTextView robertoTextView7 = (RobertoTextView) _$_findCachedViewById(R.id.tvMenuEdit);
            if (robertoTextView7 != null) {
                robertoTextView7.setOnClickListener(new View.OnClickListener(this) { // from class: sm.a

                    /* renamed from: v  reason: collision with root package name */
                    public final /* synthetic */ j f31675v;

                    {
                        this.f31675v = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        boolean z11;
                        JournalActivity journalActivity;
                        androidx.fragment.app.p requireActivity5;
                        int i12;
                        String str10;
                        int i13;
                        int i14 = r2;
                        String str11 = "";
                        final j this$0 = this.f31675v;
                        switch (i14) {
                            case 0:
                                int i15 = j.f31709y;
                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                ConstraintLayout constraintLayout2 = (ConstraintLayout) this$0._$_findCachedViewById(R.id.clJournalAdditionalMenu);
                                if (constraintLayout2 != null && Extensions.INSTANCE.isVisible(constraintLayout2)) {
                                    z11 = true;
                                } else {
                                    z11 = false;
                                }
                                ConstraintLayout constraintLayout3 = (ConstraintLayout) this$0._$_findCachedViewById(R.id.clJournalAdditionalMenu);
                                if (z11) {
                                    if (constraintLayout3 != null) {
                                        Extensions.INSTANCE.gone(constraintLayout3);
                                    }
                                } else if (constraintLayout3 != null) {
                                    Extensions.INSTANCE.visible(constraintLayout3);
                                }
                                String str12 = gk.a.f16573a;
                                Bundle bundle2 = new Bundle();
                                JournalModel journalModel3 = this$0.F().G;
                                kotlin.jvm.internal.i.d(journalModel3);
                                String templateType = journalModel3.getTemplateType();
                                kotlin.jvm.internal.i.g(templateType, "templateType");
                                if (kotlin.jvm.internal.i.b(templateType, "regular")) {
                                    str11 = "free_text_journal";
                                } else if (kotlin.jvm.internal.i.b(templateType, "question")) {
                                    str11 = "question";
                                } else if (kotlin.jvm.internal.i.b(templateType, Constants.GOAL_TYPE_THOUGHT)) {
                                    str11 = "thought_journal";
                                } else if (kotlin.jvm.internal.i.b(templateType, "arc")) {
                                    str11 = "arc";
                                }
                                bundle2.putString("template", str11);
                                JournalModel journalModel4 = this$0.F().G;
                                kotlin.jvm.internal.i.d(journalModel4);
                                bundle2.putString("entry_id", journalModel4.getId());
                                hs.k kVar = hs.k.f19476a;
                                gk.a.b(bundle2, "journal_right_top_menu_click");
                                return;
                            case 1:
                                int i16 = j.f31709y;
                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                androidx.fragment.app.p requireActivity6 = this$0.requireActivity();
                                if (requireActivity6 instanceof JournalActivity) {
                                    journalActivity = (JournalActivity) requireActivity6;
                                } else {
                                    journalActivity = null;
                                }
                                if (journalActivity != null) {
                                    JournalModel journalModel5 = this$0.F().G;
                                    kotlin.jvm.internal.i.d(journalModel5);
                                    String id2 = journalModel5.getId();
                                    JournalModel journalModel6 = this$0.F().G;
                                    kotlin.jvm.internal.i.d(journalModel6);
                                    journalActivity.o0(id2, journalModel6.getTemplateType());
                                }
                                String str13 = gk.a.f16573a;
                                Bundle bundle3 = new Bundle();
                                JournalModel journalModel7 = this$0.F().G;
                                kotlin.jvm.internal.i.d(journalModel7);
                                String templateType2 = journalModel7.getTemplateType();
                                kotlin.jvm.internal.i.g(templateType2, "templateType");
                                if (kotlin.jvm.internal.i.b(templateType2, "regular")) {
                                    str11 = "free_text_journal";
                                } else if (kotlin.jvm.internal.i.b(templateType2, "question")) {
                                    str11 = "question";
                                } else if (kotlin.jvm.internal.i.b(templateType2, Constants.GOAL_TYPE_THOUGHT)) {
                                    str11 = "thought_journal";
                                } else if (kotlin.jvm.internal.i.b(templateType2, "arc")) {
                                    str11 = "arc";
                                }
                                bundle3.putString("template", str11);
                                JournalModel journalModel8 = this$0.F().G;
                                kotlin.jvm.internal.i.d(journalModel8);
                                bundle3.putString("entry_id", journalModel8.getId());
                                bundle3.putBoolean("is_draft", false);
                                hs.k kVar2 = hs.k.f19476a;
                                gk.a.b(bundle3, "journal_edit_option_click");
                                return;
                            case 2:
                                int i17 = j.f31709y;
                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                um.c F = this$0.F();
                                Context requireContext = this$0.requireContext();
                                kotlin.jvm.internal.i.f(requireContext, "requireContext()");
                                F.getClass();
                                final Dialog f = um.c.f(requireContext);
                                RobertoTextView robertoTextView72 = (RobertoTextView) f.findViewById(R.id.tvJournalDialogCancel);
                                if (robertoTextView72 != null) {
                                    robertoTextView72.setOnClickListener(new View.OnClickListener() { // from class: sm.b
                                        @Override // android.view.View.OnClickListener
                                        public final void onClick(View view3) {
                                            String str14;
                                            String str15;
                                            int i18 = r3;
                                            Dialog deletionDialog = f;
                                            j this$02 = this$0;
                                            switch (i18) {
                                                case 0:
                                                    int i19 = j.f31709y;
                                                    kotlin.jvm.internal.i.g(this$02, "this$0");
                                                    kotlin.jvm.internal.i.g(deletionDialog, "$deletionDialog");
                                                    JournalModel journalModel9 = this$02.F().G;
                                                    if (journalModel9 != null) {
                                                        String str16 = gk.a.f16573a;
                                                        Bundle bundle4 = new Bundle();
                                                        bundle4.putString("entry_id", journalModel9.getId());
                                                        bundle4.putLong("user_entered_date", journalModel9.getUserEnteredDate());
                                                        bundle4.putBoolean("is_favourite", journalModel9.isFavourite());
                                                        String templateType3 = journalModel9.getTemplateType();
                                                        kotlin.jvm.internal.i.g(templateType3, "templateType");
                                                        if (kotlin.jvm.internal.i.b(templateType3, "regular")) {
                                                            str15 = "free_text_journal";
                                                        } else if (kotlin.jvm.internal.i.b(templateType3, "question")) {
                                                            str15 = "question";
                                                        } else if (kotlin.jvm.internal.i.b(templateType3, Constants.GOAL_TYPE_THOUGHT)) {
                                                            str15 = "thought_journal";
                                                        } else if (!kotlin.jvm.internal.i.b(templateType3, "arc")) {
                                                            str15 = "";
                                                        } else {
                                                            str15 = "arc";
                                                        }
                                                        bundle4.putString("template", str15);
                                                        bundle4.putBoolean("is_draft", false);
                                                        hs.k kVar3 = hs.k.f19476a;
                                                        gk.a.b(bundle4, "journal_delete_popup_no");
                                                    }
                                                    deletionDialog.dismiss();
                                                    return;
                                                default:
                                                    int i20 = j.f31709y;
                                                    kotlin.jvm.internal.i.g(this$02, "this$0");
                                                    kotlin.jvm.internal.i.g(deletionDialog, "$deletionDialog");
                                                    if (this$02.F().G != null) {
                                                        RobertoTextView robertoTextView82 = (RobertoTextView) deletionDialog.findViewById(R.id.tvJournalDialogYes);
                                                        if (robertoTextView82 != null) {
                                                            robertoTextView82.setTextColor(g0.a.b(this$02.requireContext(), R.color.amahaTerracota));
                                                        }
                                                        View findViewById = deletionDialog.findViewById(R.id.ldJournalDialogYesLoading);
                                                        if (findViewById != null) {
                                                            findViewById.setVisibility(0);
                                                        }
                                                        um.c F2 = this$02.F();
                                                        JournalModel journalModel10 = this$02.F().G;
                                                        kotlin.jvm.internal.i.d(journalModel10);
                                                        F2.e(journalModel10.getFirestoreDocumentId());
                                                        this$02.F().E.e(this$02.getViewLifecycleOwner(), new qm.c(5, new i(this$02, deletionDialog)));
                                                        JournalModel journalModel11 = this$02.F().G;
                                                        if (journalModel11 != null) {
                                                            String str17 = gk.a.f16573a;
                                                            Bundle bundle5 = new Bundle();
                                                            bundle5.putString("entry_id", journalModel11.getId());
                                                            bundle5.putLong("user_entered_date", journalModel11.getUserEnteredDate());
                                                            bundle5.putBoolean("is_favourite", journalModel11.isFavourite());
                                                            String templateType4 = journalModel11.getTemplateType();
                                                            kotlin.jvm.internal.i.g(templateType4, "templateType");
                                                            if (kotlin.jvm.internal.i.b(templateType4, "regular")) {
                                                                str14 = "free_text_journal";
                                                            } else if (kotlin.jvm.internal.i.b(templateType4, "question")) {
                                                                str14 = "question";
                                                            } else if (kotlin.jvm.internal.i.b(templateType4, Constants.GOAL_TYPE_THOUGHT)) {
                                                                str14 = "thought_journal";
                                                            } else if (!kotlin.jvm.internal.i.b(templateType4, "arc")) {
                                                                str14 = "";
                                                            } else {
                                                                str14 = "arc";
                                                            }
                                                            bundle5.putString("template", str14);
                                                            bundle5.putBoolean("is_draft", false);
                                                            hs.k kVar4 = hs.k.f19476a;
                                                            gk.a.b(bundle5, "journal_delete_popup_yes");
                                                            return;
                                                        }
                                                        return;
                                                    }
                                                    this$02.I(false);
                                                    deletionDialog.dismiss();
                                                    return;
                                            }
                                        }
                                    });
                                }
                                RobertoTextView robertoTextView8 = (RobertoTextView) f.findViewById(R.id.tvJournalDialogYes);
                                if (robertoTextView8 != null) {
                                    robertoTextView8.setOnClickListener(new View.OnClickListener() { // from class: sm.b
                                        @Override // android.view.View.OnClickListener
                                        public final void onClick(View view3) {
                                            String str14;
                                            String str15;
                                            int i18 = r3;
                                            Dialog deletionDialog = f;
                                            j this$02 = this$0;
                                            switch (i18) {
                                                case 0:
                                                    int i19 = j.f31709y;
                                                    kotlin.jvm.internal.i.g(this$02, "this$0");
                                                    kotlin.jvm.internal.i.g(deletionDialog, "$deletionDialog");
                                                    JournalModel journalModel9 = this$02.F().G;
                                                    if (journalModel9 != null) {
                                                        String str16 = gk.a.f16573a;
                                                        Bundle bundle4 = new Bundle();
                                                        bundle4.putString("entry_id", journalModel9.getId());
                                                        bundle4.putLong("user_entered_date", journalModel9.getUserEnteredDate());
                                                        bundle4.putBoolean("is_favourite", journalModel9.isFavourite());
                                                        String templateType3 = journalModel9.getTemplateType();
                                                        kotlin.jvm.internal.i.g(templateType3, "templateType");
                                                        if (kotlin.jvm.internal.i.b(templateType3, "regular")) {
                                                            str15 = "free_text_journal";
                                                        } else if (kotlin.jvm.internal.i.b(templateType3, "question")) {
                                                            str15 = "question";
                                                        } else if (kotlin.jvm.internal.i.b(templateType3, Constants.GOAL_TYPE_THOUGHT)) {
                                                            str15 = "thought_journal";
                                                        } else if (!kotlin.jvm.internal.i.b(templateType3, "arc")) {
                                                            str15 = "";
                                                        } else {
                                                            str15 = "arc";
                                                        }
                                                        bundle4.putString("template", str15);
                                                        bundle4.putBoolean("is_draft", false);
                                                        hs.k kVar3 = hs.k.f19476a;
                                                        gk.a.b(bundle4, "journal_delete_popup_no");
                                                    }
                                                    deletionDialog.dismiss();
                                                    return;
                                                default:
                                                    int i20 = j.f31709y;
                                                    kotlin.jvm.internal.i.g(this$02, "this$0");
                                                    kotlin.jvm.internal.i.g(deletionDialog, "$deletionDialog");
                                                    if (this$02.F().G != null) {
                                                        RobertoTextView robertoTextView82 = (RobertoTextView) deletionDialog.findViewById(R.id.tvJournalDialogYes);
                                                        if (robertoTextView82 != null) {
                                                            robertoTextView82.setTextColor(g0.a.b(this$02.requireContext(), R.color.amahaTerracota));
                                                        }
                                                        View findViewById = deletionDialog.findViewById(R.id.ldJournalDialogYesLoading);
                                                        if (findViewById != null) {
                                                            findViewById.setVisibility(0);
                                                        }
                                                        um.c F2 = this$02.F();
                                                        JournalModel journalModel10 = this$02.F().G;
                                                        kotlin.jvm.internal.i.d(journalModel10);
                                                        F2.e(journalModel10.getFirestoreDocumentId());
                                                        this$02.F().E.e(this$02.getViewLifecycleOwner(), new qm.c(5, new i(this$02, deletionDialog)));
                                                        JournalModel journalModel11 = this$02.F().G;
                                                        if (journalModel11 != null) {
                                                            String str17 = gk.a.f16573a;
                                                            Bundle bundle5 = new Bundle();
                                                            bundle5.putString("entry_id", journalModel11.getId());
                                                            bundle5.putLong("user_entered_date", journalModel11.getUserEnteredDate());
                                                            bundle5.putBoolean("is_favourite", journalModel11.isFavourite());
                                                            String templateType4 = journalModel11.getTemplateType();
                                                            kotlin.jvm.internal.i.g(templateType4, "templateType");
                                                            if (kotlin.jvm.internal.i.b(templateType4, "regular")) {
                                                                str14 = "free_text_journal";
                                                            } else if (kotlin.jvm.internal.i.b(templateType4, "question")) {
                                                                str14 = "question";
                                                            } else if (kotlin.jvm.internal.i.b(templateType4, Constants.GOAL_TYPE_THOUGHT)) {
                                                                str14 = "thought_journal";
                                                            } else if (!kotlin.jvm.internal.i.b(templateType4, "arc")) {
                                                                str14 = "";
                                                            } else {
                                                                str14 = "arc";
                                                            }
                                                            bundle5.putString("template", str14);
                                                            bundle5.putBoolean("is_draft", false);
                                                            hs.k kVar4 = hs.k.f19476a;
                                                            gk.a.b(bundle5, "journal_delete_popup_yes");
                                                            return;
                                                        }
                                                        return;
                                                    }
                                                    this$02.I(false);
                                                    deletionDialog.dismiss();
                                                    return;
                                            }
                                        }
                                    });
                                }
                                f.show();
                                JournalModel journalModel9 = this$0.F().G;
                                if (journalModel9 != null) {
                                    String str14 = gk.a.f16573a;
                                    Bundle bundle4 = new Bundle();
                                    bundle4.putBoolean("is_draft", false);
                                    bundle4.putString("entry_id", journalModel9.getId());
                                    bundle4.putLong("user_entered_date", journalModel9.getUserEnteredDate());
                                    bundle4.putBoolean("is_favourite", journalModel9.isFavourite());
                                    String templateType3 = journalModel9.getTemplateType();
                                    kotlin.jvm.internal.i.g(templateType3, "templateType");
                                    if (kotlin.jvm.internal.i.b(templateType3, "regular")) {
                                        str11 = "free_text_journal";
                                    } else if (kotlin.jvm.internal.i.b(templateType3, "question")) {
                                        str11 = "question";
                                    } else if (kotlin.jvm.internal.i.b(templateType3, Constants.GOAL_TYPE_THOUGHT)) {
                                        str11 = "thought_journal";
                                    } else if (kotlin.jvm.internal.i.b(templateType3, "arc")) {
                                        str11 = "arc";
                                    }
                                    bundle4.putString("template", str11);
                                    hs.k kVar3 = hs.k.f19476a;
                                    gk.a.b(bundle4, "journal_delete_click");
                                    return;
                                }
                                return;
                            case 3:
                                int i18 = j.f31709y;
                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                this$0.f31712w = !this$0.f31712w;
                                um.c F2 = this$0.F();
                                JournalModel journalModel10 = this$0.F().G;
                                kotlin.jvm.internal.i.d(journalModel10);
                                if (this$0.f31712w) {
                                    requireActivity5 = this$0.requireActivity();
                                    i12 = R.string.added_to_favourites;
                                } else {
                                    requireActivity5 = this$0.requireActivity();
                                    i12 = R.string.removed_favourites;
                                }
                                Toast.makeText(requireActivity5, this$0.getString(i12), 0).show();
                                journalModel10.setFavourite(this$0.f31712w);
                                F2.h(journalModel10);
                                AppCompatImageView appCompatImageView5 = (AppCompatImageView) this$0._$_findCachedViewById(R.id.parentNavBarInfoButton2);
                                if (appCompatImageView5 != null) {
                                    if (this$0.f31712w) {
                                        i13 = R.drawable.ic_journal_star_favourite_enabled;
                                    } else {
                                        i13 = R.drawable.ic_journal_star_favourite;
                                    }
                                    appCompatImageView5.setImageResource(i13);
                                }
                                String str15 = gk.a.f16573a;
                                if (this$0.f31712w) {
                                    str10 = "journal_fav_icon_click";
                                } else {
                                    str10 = "journal_unfav_icon_click";
                                }
                                Bundle bundle5 = new Bundle();
                                JournalModel journalModel11 = this$0.F().G;
                                kotlin.jvm.internal.i.d(journalModel11);
                                String templateType4 = journalModel11.getTemplateType();
                                kotlin.jvm.internal.i.g(templateType4, "templateType");
                                if (kotlin.jvm.internal.i.b(templateType4, "regular")) {
                                    str11 = "free_text_journal";
                                } else if (kotlin.jvm.internal.i.b(templateType4, "question")) {
                                    str11 = "question";
                                } else if (kotlin.jvm.internal.i.b(templateType4, Constants.GOAL_TYPE_THOUGHT)) {
                                    str11 = "thought_journal";
                                } else if (kotlin.jvm.internal.i.b(templateType4, "arc")) {
                                    str11 = "arc";
                                }
                                bundle5.putString("template", str11);
                                JournalModel journalModel12 = this$0.F().G;
                                kotlin.jvm.internal.i.d(journalModel12);
                                bundle5.putString("entry_id", journalModel12.getId());
                                hs.k kVar4 = hs.k.f19476a;
                                gk.a.b(bundle5, str10);
                                return;
                            default:
                                int i19 = j.f31709y;
                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                this$0.requireActivity().onBackPressed();
                                return;
                        }
                    }
                });
            }
            RobertoTextView robertoTextView8 = (RobertoTextView) _$_findCachedViewById(R.id.tvMenuDelete);
            if (robertoTextView8 != null) {
                robertoTextView8.setOnClickListener(new View.OnClickListener(this) { // from class: sm.a

                    /* renamed from: v  reason: collision with root package name */
                    public final /* synthetic */ j f31675v;

                    {
                        this.f31675v = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        boolean z11;
                        JournalActivity journalActivity;
                        androidx.fragment.app.p requireActivity5;
                        int i12;
                        String str10;
                        int i13;
                        int i14 = r2;
                        String str11 = "";
                        final j this$0 = this.f31675v;
                        switch (i14) {
                            case 0:
                                int i15 = j.f31709y;
                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                ConstraintLayout constraintLayout2 = (ConstraintLayout) this$0._$_findCachedViewById(R.id.clJournalAdditionalMenu);
                                if (constraintLayout2 != null && Extensions.INSTANCE.isVisible(constraintLayout2)) {
                                    z11 = true;
                                } else {
                                    z11 = false;
                                }
                                ConstraintLayout constraintLayout3 = (ConstraintLayout) this$0._$_findCachedViewById(R.id.clJournalAdditionalMenu);
                                if (z11) {
                                    if (constraintLayout3 != null) {
                                        Extensions.INSTANCE.gone(constraintLayout3);
                                    }
                                } else if (constraintLayout3 != null) {
                                    Extensions.INSTANCE.visible(constraintLayout3);
                                }
                                String str12 = gk.a.f16573a;
                                Bundle bundle2 = new Bundle();
                                JournalModel journalModel3 = this$0.F().G;
                                kotlin.jvm.internal.i.d(journalModel3);
                                String templateType = journalModel3.getTemplateType();
                                kotlin.jvm.internal.i.g(templateType, "templateType");
                                if (kotlin.jvm.internal.i.b(templateType, "regular")) {
                                    str11 = "free_text_journal";
                                } else if (kotlin.jvm.internal.i.b(templateType, "question")) {
                                    str11 = "question";
                                } else if (kotlin.jvm.internal.i.b(templateType, Constants.GOAL_TYPE_THOUGHT)) {
                                    str11 = "thought_journal";
                                } else if (kotlin.jvm.internal.i.b(templateType, "arc")) {
                                    str11 = "arc";
                                }
                                bundle2.putString("template", str11);
                                JournalModel journalModel4 = this$0.F().G;
                                kotlin.jvm.internal.i.d(journalModel4);
                                bundle2.putString("entry_id", journalModel4.getId());
                                hs.k kVar = hs.k.f19476a;
                                gk.a.b(bundle2, "journal_right_top_menu_click");
                                return;
                            case 1:
                                int i16 = j.f31709y;
                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                androidx.fragment.app.p requireActivity6 = this$0.requireActivity();
                                if (requireActivity6 instanceof JournalActivity) {
                                    journalActivity = (JournalActivity) requireActivity6;
                                } else {
                                    journalActivity = null;
                                }
                                if (journalActivity != null) {
                                    JournalModel journalModel5 = this$0.F().G;
                                    kotlin.jvm.internal.i.d(journalModel5);
                                    String id2 = journalModel5.getId();
                                    JournalModel journalModel6 = this$0.F().G;
                                    kotlin.jvm.internal.i.d(journalModel6);
                                    journalActivity.o0(id2, journalModel6.getTemplateType());
                                }
                                String str13 = gk.a.f16573a;
                                Bundle bundle3 = new Bundle();
                                JournalModel journalModel7 = this$0.F().G;
                                kotlin.jvm.internal.i.d(journalModel7);
                                String templateType2 = journalModel7.getTemplateType();
                                kotlin.jvm.internal.i.g(templateType2, "templateType");
                                if (kotlin.jvm.internal.i.b(templateType2, "regular")) {
                                    str11 = "free_text_journal";
                                } else if (kotlin.jvm.internal.i.b(templateType2, "question")) {
                                    str11 = "question";
                                } else if (kotlin.jvm.internal.i.b(templateType2, Constants.GOAL_TYPE_THOUGHT)) {
                                    str11 = "thought_journal";
                                } else if (kotlin.jvm.internal.i.b(templateType2, "arc")) {
                                    str11 = "arc";
                                }
                                bundle3.putString("template", str11);
                                JournalModel journalModel8 = this$0.F().G;
                                kotlin.jvm.internal.i.d(journalModel8);
                                bundle3.putString("entry_id", journalModel8.getId());
                                bundle3.putBoolean("is_draft", false);
                                hs.k kVar2 = hs.k.f19476a;
                                gk.a.b(bundle3, "journal_edit_option_click");
                                return;
                            case 2:
                                int i17 = j.f31709y;
                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                um.c F = this$0.F();
                                Context requireContext = this$0.requireContext();
                                kotlin.jvm.internal.i.f(requireContext, "requireContext()");
                                F.getClass();
                                final Dialog f = um.c.f(requireContext);
                                RobertoTextView robertoTextView72 = (RobertoTextView) f.findViewById(R.id.tvJournalDialogCancel);
                                if (robertoTextView72 != null) {
                                    robertoTextView72.setOnClickListener(new View.OnClickListener() { // from class: sm.b
                                        @Override // android.view.View.OnClickListener
                                        public final void onClick(View view3) {
                                            String str14;
                                            String str15;
                                            int i18 = r3;
                                            Dialog deletionDialog = f;
                                            j this$02 = this$0;
                                            switch (i18) {
                                                case 0:
                                                    int i19 = j.f31709y;
                                                    kotlin.jvm.internal.i.g(this$02, "this$0");
                                                    kotlin.jvm.internal.i.g(deletionDialog, "$deletionDialog");
                                                    JournalModel journalModel9 = this$02.F().G;
                                                    if (journalModel9 != null) {
                                                        String str16 = gk.a.f16573a;
                                                        Bundle bundle4 = new Bundle();
                                                        bundle4.putString("entry_id", journalModel9.getId());
                                                        bundle4.putLong("user_entered_date", journalModel9.getUserEnteredDate());
                                                        bundle4.putBoolean("is_favourite", journalModel9.isFavourite());
                                                        String templateType3 = journalModel9.getTemplateType();
                                                        kotlin.jvm.internal.i.g(templateType3, "templateType");
                                                        if (kotlin.jvm.internal.i.b(templateType3, "regular")) {
                                                            str15 = "free_text_journal";
                                                        } else if (kotlin.jvm.internal.i.b(templateType3, "question")) {
                                                            str15 = "question";
                                                        } else if (kotlin.jvm.internal.i.b(templateType3, Constants.GOAL_TYPE_THOUGHT)) {
                                                            str15 = "thought_journal";
                                                        } else if (!kotlin.jvm.internal.i.b(templateType3, "arc")) {
                                                            str15 = "";
                                                        } else {
                                                            str15 = "arc";
                                                        }
                                                        bundle4.putString("template", str15);
                                                        bundle4.putBoolean("is_draft", false);
                                                        hs.k kVar3 = hs.k.f19476a;
                                                        gk.a.b(bundle4, "journal_delete_popup_no");
                                                    }
                                                    deletionDialog.dismiss();
                                                    return;
                                                default:
                                                    int i20 = j.f31709y;
                                                    kotlin.jvm.internal.i.g(this$02, "this$0");
                                                    kotlin.jvm.internal.i.g(deletionDialog, "$deletionDialog");
                                                    if (this$02.F().G != null) {
                                                        RobertoTextView robertoTextView82 = (RobertoTextView) deletionDialog.findViewById(R.id.tvJournalDialogYes);
                                                        if (robertoTextView82 != null) {
                                                            robertoTextView82.setTextColor(g0.a.b(this$02.requireContext(), R.color.amahaTerracota));
                                                        }
                                                        View findViewById = deletionDialog.findViewById(R.id.ldJournalDialogYesLoading);
                                                        if (findViewById != null) {
                                                            findViewById.setVisibility(0);
                                                        }
                                                        um.c F2 = this$02.F();
                                                        JournalModel journalModel10 = this$02.F().G;
                                                        kotlin.jvm.internal.i.d(journalModel10);
                                                        F2.e(journalModel10.getFirestoreDocumentId());
                                                        this$02.F().E.e(this$02.getViewLifecycleOwner(), new qm.c(5, new i(this$02, deletionDialog)));
                                                        JournalModel journalModel11 = this$02.F().G;
                                                        if (journalModel11 != null) {
                                                            String str17 = gk.a.f16573a;
                                                            Bundle bundle5 = new Bundle();
                                                            bundle5.putString("entry_id", journalModel11.getId());
                                                            bundle5.putLong("user_entered_date", journalModel11.getUserEnteredDate());
                                                            bundle5.putBoolean("is_favourite", journalModel11.isFavourite());
                                                            String templateType4 = journalModel11.getTemplateType();
                                                            kotlin.jvm.internal.i.g(templateType4, "templateType");
                                                            if (kotlin.jvm.internal.i.b(templateType4, "regular")) {
                                                                str14 = "free_text_journal";
                                                            } else if (kotlin.jvm.internal.i.b(templateType4, "question")) {
                                                                str14 = "question";
                                                            } else if (kotlin.jvm.internal.i.b(templateType4, Constants.GOAL_TYPE_THOUGHT)) {
                                                                str14 = "thought_journal";
                                                            } else if (!kotlin.jvm.internal.i.b(templateType4, "arc")) {
                                                                str14 = "";
                                                            } else {
                                                                str14 = "arc";
                                                            }
                                                            bundle5.putString("template", str14);
                                                            bundle5.putBoolean("is_draft", false);
                                                            hs.k kVar4 = hs.k.f19476a;
                                                            gk.a.b(bundle5, "journal_delete_popup_yes");
                                                            return;
                                                        }
                                                        return;
                                                    }
                                                    this$02.I(false);
                                                    deletionDialog.dismiss();
                                                    return;
                                            }
                                        }
                                    });
                                }
                                RobertoTextView robertoTextView82 = (RobertoTextView) f.findViewById(R.id.tvJournalDialogYes);
                                if (robertoTextView82 != null) {
                                    robertoTextView82.setOnClickListener(new View.OnClickListener() { // from class: sm.b
                                        @Override // android.view.View.OnClickListener
                                        public final void onClick(View view3) {
                                            String str14;
                                            String str15;
                                            int i18 = r3;
                                            Dialog deletionDialog = f;
                                            j this$02 = this$0;
                                            switch (i18) {
                                                case 0:
                                                    int i19 = j.f31709y;
                                                    kotlin.jvm.internal.i.g(this$02, "this$0");
                                                    kotlin.jvm.internal.i.g(deletionDialog, "$deletionDialog");
                                                    JournalModel journalModel9 = this$02.F().G;
                                                    if (journalModel9 != null) {
                                                        String str16 = gk.a.f16573a;
                                                        Bundle bundle4 = new Bundle();
                                                        bundle4.putString("entry_id", journalModel9.getId());
                                                        bundle4.putLong("user_entered_date", journalModel9.getUserEnteredDate());
                                                        bundle4.putBoolean("is_favourite", journalModel9.isFavourite());
                                                        String templateType3 = journalModel9.getTemplateType();
                                                        kotlin.jvm.internal.i.g(templateType3, "templateType");
                                                        if (kotlin.jvm.internal.i.b(templateType3, "regular")) {
                                                            str15 = "free_text_journal";
                                                        } else if (kotlin.jvm.internal.i.b(templateType3, "question")) {
                                                            str15 = "question";
                                                        } else if (kotlin.jvm.internal.i.b(templateType3, Constants.GOAL_TYPE_THOUGHT)) {
                                                            str15 = "thought_journal";
                                                        } else if (!kotlin.jvm.internal.i.b(templateType3, "arc")) {
                                                            str15 = "";
                                                        } else {
                                                            str15 = "arc";
                                                        }
                                                        bundle4.putString("template", str15);
                                                        bundle4.putBoolean("is_draft", false);
                                                        hs.k kVar3 = hs.k.f19476a;
                                                        gk.a.b(bundle4, "journal_delete_popup_no");
                                                    }
                                                    deletionDialog.dismiss();
                                                    return;
                                                default:
                                                    int i20 = j.f31709y;
                                                    kotlin.jvm.internal.i.g(this$02, "this$0");
                                                    kotlin.jvm.internal.i.g(deletionDialog, "$deletionDialog");
                                                    if (this$02.F().G != null) {
                                                        RobertoTextView robertoTextView822 = (RobertoTextView) deletionDialog.findViewById(R.id.tvJournalDialogYes);
                                                        if (robertoTextView822 != null) {
                                                            robertoTextView822.setTextColor(g0.a.b(this$02.requireContext(), R.color.amahaTerracota));
                                                        }
                                                        View findViewById = deletionDialog.findViewById(R.id.ldJournalDialogYesLoading);
                                                        if (findViewById != null) {
                                                            findViewById.setVisibility(0);
                                                        }
                                                        um.c F2 = this$02.F();
                                                        JournalModel journalModel10 = this$02.F().G;
                                                        kotlin.jvm.internal.i.d(journalModel10);
                                                        F2.e(journalModel10.getFirestoreDocumentId());
                                                        this$02.F().E.e(this$02.getViewLifecycleOwner(), new qm.c(5, new i(this$02, deletionDialog)));
                                                        JournalModel journalModel11 = this$02.F().G;
                                                        if (journalModel11 != null) {
                                                            String str17 = gk.a.f16573a;
                                                            Bundle bundle5 = new Bundle();
                                                            bundle5.putString("entry_id", journalModel11.getId());
                                                            bundle5.putLong("user_entered_date", journalModel11.getUserEnteredDate());
                                                            bundle5.putBoolean("is_favourite", journalModel11.isFavourite());
                                                            String templateType4 = journalModel11.getTemplateType();
                                                            kotlin.jvm.internal.i.g(templateType4, "templateType");
                                                            if (kotlin.jvm.internal.i.b(templateType4, "regular")) {
                                                                str14 = "free_text_journal";
                                                            } else if (kotlin.jvm.internal.i.b(templateType4, "question")) {
                                                                str14 = "question";
                                                            } else if (kotlin.jvm.internal.i.b(templateType4, Constants.GOAL_TYPE_THOUGHT)) {
                                                                str14 = "thought_journal";
                                                            } else if (!kotlin.jvm.internal.i.b(templateType4, "arc")) {
                                                                str14 = "";
                                                            } else {
                                                                str14 = "arc";
                                                            }
                                                            bundle5.putString("template", str14);
                                                            bundle5.putBoolean("is_draft", false);
                                                            hs.k kVar4 = hs.k.f19476a;
                                                            gk.a.b(bundle5, "journal_delete_popup_yes");
                                                            return;
                                                        }
                                                        return;
                                                    }
                                                    this$02.I(false);
                                                    deletionDialog.dismiss();
                                                    return;
                                            }
                                        }
                                    });
                                }
                                f.show();
                                JournalModel journalModel9 = this$0.F().G;
                                if (journalModel9 != null) {
                                    String str14 = gk.a.f16573a;
                                    Bundle bundle4 = new Bundle();
                                    bundle4.putBoolean("is_draft", false);
                                    bundle4.putString("entry_id", journalModel9.getId());
                                    bundle4.putLong("user_entered_date", journalModel9.getUserEnteredDate());
                                    bundle4.putBoolean("is_favourite", journalModel9.isFavourite());
                                    String templateType3 = journalModel9.getTemplateType();
                                    kotlin.jvm.internal.i.g(templateType3, "templateType");
                                    if (kotlin.jvm.internal.i.b(templateType3, "regular")) {
                                        str11 = "free_text_journal";
                                    } else if (kotlin.jvm.internal.i.b(templateType3, "question")) {
                                        str11 = "question";
                                    } else if (kotlin.jvm.internal.i.b(templateType3, Constants.GOAL_TYPE_THOUGHT)) {
                                        str11 = "thought_journal";
                                    } else if (kotlin.jvm.internal.i.b(templateType3, "arc")) {
                                        str11 = "arc";
                                    }
                                    bundle4.putString("template", str11);
                                    hs.k kVar3 = hs.k.f19476a;
                                    gk.a.b(bundle4, "journal_delete_click");
                                    return;
                                }
                                return;
                            case 3:
                                int i18 = j.f31709y;
                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                this$0.f31712w = !this$0.f31712w;
                                um.c F2 = this$0.F();
                                JournalModel journalModel10 = this$0.F().G;
                                kotlin.jvm.internal.i.d(journalModel10);
                                if (this$0.f31712w) {
                                    requireActivity5 = this$0.requireActivity();
                                    i12 = R.string.added_to_favourites;
                                } else {
                                    requireActivity5 = this$0.requireActivity();
                                    i12 = R.string.removed_favourites;
                                }
                                Toast.makeText(requireActivity5, this$0.getString(i12), 0).show();
                                journalModel10.setFavourite(this$0.f31712w);
                                F2.h(journalModel10);
                                AppCompatImageView appCompatImageView5 = (AppCompatImageView) this$0._$_findCachedViewById(R.id.parentNavBarInfoButton2);
                                if (appCompatImageView5 != null) {
                                    if (this$0.f31712w) {
                                        i13 = R.drawable.ic_journal_star_favourite_enabled;
                                    } else {
                                        i13 = R.drawable.ic_journal_star_favourite;
                                    }
                                    appCompatImageView5.setImageResource(i13);
                                }
                                String str15 = gk.a.f16573a;
                                if (this$0.f31712w) {
                                    str10 = "journal_fav_icon_click";
                                } else {
                                    str10 = "journal_unfav_icon_click";
                                }
                                Bundle bundle5 = new Bundle();
                                JournalModel journalModel11 = this$0.F().G;
                                kotlin.jvm.internal.i.d(journalModel11);
                                String templateType4 = journalModel11.getTemplateType();
                                kotlin.jvm.internal.i.g(templateType4, "templateType");
                                if (kotlin.jvm.internal.i.b(templateType4, "regular")) {
                                    str11 = "free_text_journal";
                                } else if (kotlin.jvm.internal.i.b(templateType4, "question")) {
                                    str11 = "question";
                                } else if (kotlin.jvm.internal.i.b(templateType4, Constants.GOAL_TYPE_THOUGHT)) {
                                    str11 = "thought_journal";
                                } else if (kotlin.jvm.internal.i.b(templateType4, "arc")) {
                                    str11 = "arc";
                                }
                                bundle5.putString("template", str11);
                                JournalModel journalModel12 = this$0.F().G;
                                kotlin.jvm.internal.i.d(journalModel12);
                                bundle5.putString("entry_id", journalModel12.getId());
                                hs.k kVar4 = hs.k.f19476a;
                                gk.a.b(bundle5, str10);
                                return;
                            default:
                                int i19 = j.f31709y;
                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                this$0.requireActivity().onBackPressed();
                                return;
                        }
                    }
                });
            }
            JournalModel journalModel3 = F().G;
            kotlin.jvm.internal.i.d(journalModel3);
            this.f31712w = journalModel3.isFavourite();
            AppCompatImageView appCompatImageView5 = (AppCompatImageView) _$_findCachedViewById(R.id.parentNavBarInfoButton2);
            if (appCompatImageView5 != null) {
                if (this.f31712w) {
                    i6 = R.drawable.ic_journal_star_favourite_enabled;
                } else {
                    i6 = R.drawable.ic_journal_star_favourite;
                }
                appCompatImageView5.setImageResource(i6);
            }
            AppCompatImageView appCompatImageView6 = (AppCompatImageView) _$_findCachedViewById(R.id.parentNavBarInfoButton2);
            if (appCompatImageView6 != null) {
                appCompatImageView6.setOnClickListener(new View.OnClickListener(this) { // from class: sm.a

                    /* renamed from: v  reason: collision with root package name */
                    public final /* synthetic */ j f31675v;

                    {
                        this.f31675v = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        boolean z11;
                        JournalActivity journalActivity;
                        androidx.fragment.app.p requireActivity5;
                        int i12;
                        String str10;
                        int i13;
                        int i14 = r2;
                        String str11 = "";
                        final j this$0 = this.f31675v;
                        switch (i14) {
                            case 0:
                                int i15 = j.f31709y;
                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                ConstraintLayout constraintLayout2 = (ConstraintLayout) this$0._$_findCachedViewById(R.id.clJournalAdditionalMenu);
                                if (constraintLayout2 != null && Extensions.INSTANCE.isVisible(constraintLayout2)) {
                                    z11 = true;
                                } else {
                                    z11 = false;
                                }
                                ConstraintLayout constraintLayout3 = (ConstraintLayout) this$0._$_findCachedViewById(R.id.clJournalAdditionalMenu);
                                if (z11) {
                                    if (constraintLayout3 != null) {
                                        Extensions.INSTANCE.gone(constraintLayout3);
                                    }
                                } else if (constraintLayout3 != null) {
                                    Extensions.INSTANCE.visible(constraintLayout3);
                                }
                                String str12 = gk.a.f16573a;
                                Bundle bundle2 = new Bundle();
                                JournalModel journalModel32 = this$0.F().G;
                                kotlin.jvm.internal.i.d(journalModel32);
                                String templateType = journalModel32.getTemplateType();
                                kotlin.jvm.internal.i.g(templateType, "templateType");
                                if (kotlin.jvm.internal.i.b(templateType, "regular")) {
                                    str11 = "free_text_journal";
                                } else if (kotlin.jvm.internal.i.b(templateType, "question")) {
                                    str11 = "question";
                                } else if (kotlin.jvm.internal.i.b(templateType, Constants.GOAL_TYPE_THOUGHT)) {
                                    str11 = "thought_journal";
                                } else if (kotlin.jvm.internal.i.b(templateType, "arc")) {
                                    str11 = "arc";
                                }
                                bundle2.putString("template", str11);
                                JournalModel journalModel4 = this$0.F().G;
                                kotlin.jvm.internal.i.d(journalModel4);
                                bundle2.putString("entry_id", journalModel4.getId());
                                hs.k kVar = hs.k.f19476a;
                                gk.a.b(bundle2, "journal_right_top_menu_click");
                                return;
                            case 1:
                                int i16 = j.f31709y;
                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                androidx.fragment.app.p requireActivity6 = this$0.requireActivity();
                                if (requireActivity6 instanceof JournalActivity) {
                                    journalActivity = (JournalActivity) requireActivity6;
                                } else {
                                    journalActivity = null;
                                }
                                if (journalActivity != null) {
                                    JournalModel journalModel5 = this$0.F().G;
                                    kotlin.jvm.internal.i.d(journalModel5);
                                    String id2 = journalModel5.getId();
                                    JournalModel journalModel6 = this$0.F().G;
                                    kotlin.jvm.internal.i.d(journalModel6);
                                    journalActivity.o0(id2, journalModel6.getTemplateType());
                                }
                                String str13 = gk.a.f16573a;
                                Bundle bundle3 = new Bundle();
                                JournalModel journalModel7 = this$0.F().G;
                                kotlin.jvm.internal.i.d(journalModel7);
                                String templateType2 = journalModel7.getTemplateType();
                                kotlin.jvm.internal.i.g(templateType2, "templateType");
                                if (kotlin.jvm.internal.i.b(templateType2, "regular")) {
                                    str11 = "free_text_journal";
                                } else if (kotlin.jvm.internal.i.b(templateType2, "question")) {
                                    str11 = "question";
                                } else if (kotlin.jvm.internal.i.b(templateType2, Constants.GOAL_TYPE_THOUGHT)) {
                                    str11 = "thought_journal";
                                } else if (kotlin.jvm.internal.i.b(templateType2, "arc")) {
                                    str11 = "arc";
                                }
                                bundle3.putString("template", str11);
                                JournalModel journalModel8 = this$0.F().G;
                                kotlin.jvm.internal.i.d(journalModel8);
                                bundle3.putString("entry_id", journalModel8.getId());
                                bundle3.putBoolean("is_draft", false);
                                hs.k kVar2 = hs.k.f19476a;
                                gk.a.b(bundle3, "journal_edit_option_click");
                                return;
                            case 2:
                                int i17 = j.f31709y;
                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                um.c F = this$0.F();
                                Context requireContext = this$0.requireContext();
                                kotlin.jvm.internal.i.f(requireContext, "requireContext()");
                                F.getClass();
                                final Dialog f = um.c.f(requireContext);
                                RobertoTextView robertoTextView72 = (RobertoTextView) f.findViewById(R.id.tvJournalDialogCancel);
                                if (robertoTextView72 != null) {
                                    robertoTextView72.setOnClickListener(new View.OnClickListener() { // from class: sm.b
                                        @Override // android.view.View.OnClickListener
                                        public final void onClick(View view3) {
                                            String str14;
                                            String str15;
                                            int i18 = r3;
                                            Dialog deletionDialog = f;
                                            j this$02 = this$0;
                                            switch (i18) {
                                                case 0:
                                                    int i19 = j.f31709y;
                                                    kotlin.jvm.internal.i.g(this$02, "this$0");
                                                    kotlin.jvm.internal.i.g(deletionDialog, "$deletionDialog");
                                                    JournalModel journalModel9 = this$02.F().G;
                                                    if (journalModel9 != null) {
                                                        String str16 = gk.a.f16573a;
                                                        Bundle bundle4 = new Bundle();
                                                        bundle4.putString("entry_id", journalModel9.getId());
                                                        bundle4.putLong("user_entered_date", journalModel9.getUserEnteredDate());
                                                        bundle4.putBoolean("is_favourite", journalModel9.isFavourite());
                                                        String templateType3 = journalModel9.getTemplateType();
                                                        kotlin.jvm.internal.i.g(templateType3, "templateType");
                                                        if (kotlin.jvm.internal.i.b(templateType3, "regular")) {
                                                            str15 = "free_text_journal";
                                                        } else if (kotlin.jvm.internal.i.b(templateType3, "question")) {
                                                            str15 = "question";
                                                        } else if (kotlin.jvm.internal.i.b(templateType3, Constants.GOAL_TYPE_THOUGHT)) {
                                                            str15 = "thought_journal";
                                                        } else if (!kotlin.jvm.internal.i.b(templateType3, "arc")) {
                                                            str15 = "";
                                                        } else {
                                                            str15 = "arc";
                                                        }
                                                        bundle4.putString("template", str15);
                                                        bundle4.putBoolean("is_draft", false);
                                                        hs.k kVar3 = hs.k.f19476a;
                                                        gk.a.b(bundle4, "journal_delete_popup_no");
                                                    }
                                                    deletionDialog.dismiss();
                                                    return;
                                                default:
                                                    int i20 = j.f31709y;
                                                    kotlin.jvm.internal.i.g(this$02, "this$0");
                                                    kotlin.jvm.internal.i.g(deletionDialog, "$deletionDialog");
                                                    if (this$02.F().G != null) {
                                                        RobertoTextView robertoTextView822 = (RobertoTextView) deletionDialog.findViewById(R.id.tvJournalDialogYes);
                                                        if (robertoTextView822 != null) {
                                                            robertoTextView822.setTextColor(g0.a.b(this$02.requireContext(), R.color.amahaTerracota));
                                                        }
                                                        View findViewById = deletionDialog.findViewById(R.id.ldJournalDialogYesLoading);
                                                        if (findViewById != null) {
                                                            findViewById.setVisibility(0);
                                                        }
                                                        um.c F2 = this$02.F();
                                                        JournalModel journalModel10 = this$02.F().G;
                                                        kotlin.jvm.internal.i.d(journalModel10);
                                                        F2.e(journalModel10.getFirestoreDocumentId());
                                                        this$02.F().E.e(this$02.getViewLifecycleOwner(), new qm.c(5, new i(this$02, deletionDialog)));
                                                        JournalModel journalModel11 = this$02.F().G;
                                                        if (journalModel11 != null) {
                                                            String str17 = gk.a.f16573a;
                                                            Bundle bundle5 = new Bundle();
                                                            bundle5.putString("entry_id", journalModel11.getId());
                                                            bundle5.putLong("user_entered_date", journalModel11.getUserEnteredDate());
                                                            bundle5.putBoolean("is_favourite", journalModel11.isFavourite());
                                                            String templateType4 = journalModel11.getTemplateType();
                                                            kotlin.jvm.internal.i.g(templateType4, "templateType");
                                                            if (kotlin.jvm.internal.i.b(templateType4, "regular")) {
                                                                str14 = "free_text_journal";
                                                            } else if (kotlin.jvm.internal.i.b(templateType4, "question")) {
                                                                str14 = "question";
                                                            } else if (kotlin.jvm.internal.i.b(templateType4, Constants.GOAL_TYPE_THOUGHT)) {
                                                                str14 = "thought_journal";
                                                            } else if (!kotlin.jvm.internal.i.b(templateType4, "arc")) {
                                                                str14 = "";
                                                            } else {
                                                                str14 = "arc";
                                                            }
                                                            bundle5.putString("template", str14);
                                                            bundle5.putBoolean("is_draft", false);
                                                            hs.k kVar4 = hs.k.f19476a;
                                                            gk.a.b(bundle5, "journal_delete_popup_yes");
                                                            return;
                                                        }
                                                        return;
                                                    }
                                                    this$02.I(false);
                                                    deletionDialog.dismiss();
                                                    return;
                                            }
                                        }
                                    });
                                }
                                RobertoTextView robertoTextView82 = (RobertoTextView) f.findViewById(R.id.tvJournalDialogYes);
                                if (robertoTextView82 != null) {
                                    robertoTextView82.setOnClickListener(new View.OnClickListener() { // from class: sm.b
                                        @Override // android.view.View.OnClickListener
                                        public final void onClick(View view3) {
                                            String str14;
                                            String str15;
                                            int i18 = r3;
                                            Dialog deletionDialog = f;
                                            j this$02 = this$0;
                                            switch (i18) {
                                                case 0:
                                                    int i19 = j.f31709y;
                                                    kotlin.jvm.internal.i.g(this$02, "this$0");
                                                    kotlin.jvm.internal.i.g(deletionDialog, "$deletionDialog");
                                                    JournalModel journalModel9 = this$02.F().G;
                                                    if (journalModel9 != null) {
                                                        String str16 = gk.a.f16573a;
                                                        Bundle bundle4 = new Bundle();
                                                        bundle4.putString("entry_id", journalModel9.getId());
                                                        bundle4.putLong("user_entered_date", journalModel9.getUserEnteredDate());
                                                        bundle4.putBoolean("is_favourite", journalModel9.isFavourite());
                                                        String templateType3 = journalModel9.getTemplateType();
                                                        kotlin.jvm.internal.i.g(templateType3, "templateType");
                                                        if (kotlin.jvm.internal.i.b(templateType3, "regular")) {
                                                            str15 = "free_text_journal";
                                                        } else if (kotlin.jvm.internal.i.b(templateType3, "question")) {
                                                            str15 = "question";
                                                        } else if (kotlin.jvm.internal.i.b(templateType3, Constants.GOAL_TYPE_THOUGHT)) {
                                                            str15 = "thought_journal";
                                                        } else if (!kotlin.jvm.internal.i.b(templateType3, "arc")) {
                                                            str15 = "";
                                                        } else {
                                                            str15 = "arc";
                                                        }
                                                        bundle4.putString("template", str15);
                                                        bundle4.putBoolean("is_draft", false);
                                                        hs.k kVar3 = hs.k.f19476a;
                                                        gk.a.b(bundle4, "journal_delete_popup_no");
                                                    }
                                                    deletionDialog.dismiss();
                                                    return;
                                                default:
                                                    int i20 = j.f31709y;
                                                    kotlin.jvm.internal.i.g(this$02, "this$0");
                                                    kotlin.jvm.internal.i.g(deletionDialog, "$deletionDialog");
                                                    if (this$02.F().G != null) {
                                                        RobertoTextView robertoTextView822 = (RobertoTextView) deletionDialog.findViewById(R.id.tvJournalDialogYes);
                                                        if (robertoTextView822 != null) {
                                                            robertoTextView822.setTextColor(g0.a.b(this$02.requireContext(), R.color.amahaTerracota));
                                                        }
                                                        View findViewById = deletionDialog.findViewById(R.id.ldJournalDialogYesLoading);
                                                        if (findViewById != null) {
                                                            findViewById.setVisibility(0);
                                                        }
                                                        um.c F2 = this$02.F();
                                                        JournalModel journalModel10 = this$02.F().G;
                                                        kotlin.jvm.internal.i.d(journalModel10);
                                                        F2.e(journalModel10.getFirestoreDocumentId());
                                                        this$02.F().E.e(this$02.getViewLifecycleOwner(), new qm.c(5, new i(this$02, deletionDialog)));
                                                        JournalModel journalModel11 = this$02.F().G;
                                                        if (journalModel11 != null) {
                                                            String str17 = gk.a.f16573a;
                                                            Bundle bundle5 = new Bundle();
                                                            bundle5.putString("entry_id", journalModel11.getId());
                                                            bundle5.putLong("user_entered_date", journalModel11.getUserEnteredDate());
                                                            bundle5.putBoolean("is_favourite", journalModel11.isFavourite());
                                                            String templateType4 = journalModel11.getTemplateType();
                                                            kotlin.jvm.internal.i.g(templateType4, "templateType");
                                                            if (kotlin.jvm.internal.i.b(templateType4, "regular")) {
                                                                str14 = "free_text_journal";
                                                            } else if (kotlin.jvm.internal.i.b(templateType4, "question")) {
                                                                str14 = "question";
                                                            } else if (kotlin.jvm.internal.i.b(templateType4, Constants.GOAL_TYPE_THOUGHT)) {
                                                                str14 = "thought_journal";
                                                            } else if (!kotlin.jvm.internal.i.b(templateType4, "arc")) {
                                                                str14 = "";
                                                            } else {
                                                                str14 = "arc";
                                                            }
                                                            bundle5.putString("template", str14);
                                                            bundle5.putBoolean("is_draft", false);
                                                            hs.k kVar4 = hs.k.f19476a;
                                                            gk.a.b(bundle5, "journal_delete_popup_yes");
                                                            return;
                                                        }
                                                        return;
                                                    }
                                                    this$02.I(false);
                                                    deletionDialog.dismiss();
                                                    return;
                                            }
                                        }
                                    });
                                }
                                f.show();
                                JournalModel journalModel9 = this$0.F().G;
                                if (journalModel9 != null) {
                                    String str14 = gk.a.f16573a;
                                    Bundle bundle4 = new Bundle();
                                    bundle4.putBoolean("is_draft", false);
                                    bundle4.putString("entry_id", journalModel9.getId());
                                    bundle4.putLong("user_entered_date", journalModel9.getUserEnteredDate());
                                    bundle4.putBoolean("is_favourite", journalModel9.isFavourite());
                                    String templateType3 = journalModel9.getTemplateType();
                                    kotlin.jvm.internal.i.g(templateType3, "templateType");
                                    if (kotlin.jvm.internal.i.b(templateType3, "regular")) {
                                        str11 = "free_text_journal";
                                    } else if (kotlin.jvm.internal.i.b(templateType3, "question")) {
                                        str11 = "question";
                                    } else if (kotlin.jvm.internal.i.b(templateType3, Constants.GOAL_TYPE_THOUGHT)) {
                                        str11 = "thought_journal";
                                    } else if (kotlin.jvm.internal.i.b(templateType3, "arc")) {
                                        str11 = "arc";
                                    }
                                    bundle4.putString("template", str11);
                                    hs.k kVar3 = hs.k.f19476a;
                                    gk.a.b(bundle4, "journal_delete_click");
                                    return;
                                }
                                return;
                            case 3:
                                int i18 = j.f31709y;
                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                this$0.f31712w = !this$0.f31712w;
                                um.c F2 = this$0.F();
                                JournalModel journalModel10 = this$0.F().G;
                                kotlin.jvm.internal.i.d(journalModel10);
                                if (this$0.f31712w) {
                                    requireActivity5 = this$0.requireActivity();
                                    i12 = R.string.added_to_favourites;
                                } else {
                                    requireActivity5 = this$0.requireActivity();
                                    i12 = R.string.removed_favourites;
                                }
                                Toast.makeText(requireActivity5, this$0.getString(i12), 0).show();
                                journalModel10.setFavourite(this$0.f31712w);
                                F2.h(journalModel10);
                                AppCompatImageView appCompatImageView52 = (AppCompatImageView) this$0._$_findCachedViewById(R.id.parentNavBarInfoButton2);
                                if (appCompatImageView52 != null) {
                                    if (this$0.f31712w) {
                                        i13 = R.drawable.ic_journal_star_favourite_enabled;
                                    } else {
                                        i13 = R.drawable.ic_journal_star_favourite;
                                    }
                                    appCompatImageView52.setImageResource(i13);
                                }
                                String str15 = gk.a.f16573a;
                                if (this$0.f31712w) {
                                    str10 = "journal_fav_icon_click";
                                } else {
                                    str10 = "journal_unfav_icon_click";
                                }
                                Bundle bundle5 = new Bundle();
                                JournalModel journalModel11 = this$0.F().G;
                                kotlin.jvm.internal.i.d(journalModel11);
                                String templateType4 = journalModel11.getTemplateType();
                                kotlin.jvm.internal.i.g(templateType4, "templateType");
                                if (kotlin.jvm.internal.i.b(templateType4, "regular")) {
                                    str11 = "free_text_journal";
                                } else if (kotlin.jvm.internal.i.b(templateType4, "question")) {
                                    str11 = "question";
                                } else if (kotlin.jvm.internal.i.b(templateType4, Constants.GOAL_TYPE_THOUGHT)) {
                                    str11 = "thought_journal";
                                } else if (kotlin.jvm.internal.i.b(templateType4, "arc")) {
                                    str11 = "arc";
                                }
                                bundle5.putString("template", str11);
                                JournalModel journalModel12 = this$0.F().G;
                                kotlin.jvm.internal.i.d(journalModel12);
                                bundle5.putString("entry_id", journalModel12.getId());
                                hs.k kVar4 = hs.k.f19476a;
                                gk.a.b(bundle5, str10);
                                return;
                            default:
                                int i19 = j.f31709y;
                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                this$0.requireActivity().onBackPressed();
                                return;
                        }
                    }
                });
            }
            AppCompatImageView appCompatImageView7 = (AppCompatImageView) _$_findCachedViewById(R.id.parentNavBarBackButton);
            if (appCompatImageView7 != null) {
                appCompatImageView7.setOnClickListener(new View.OnClickListener(this) { // from class: sm.a

                    /* renamed from: v  reason: collision with root package name */
                    public final /* synthetic */ j f31675v;

                    {
                        this.f31675v = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        boolean z11;
                        JournalActivity journalActivity;
                        androidx.fragment.app.p requireActivity5;
                        int i12;
                        String str10;
                        int i13;
                        int i14 = r2;
                        String str11 = "";
                        final j this$0 = this.f31675v;
                        switch (i14) {
                            case 0:
                                int i15 = j.f31709y;
                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                ConstraintLayout constraintLayout2 = (ConstraintLayout) this$0._$_findCachedViewById(R.id.clJournalAdditionalMenu);
                                if (constraintLayout2 != null && Extensions.INSTANCE.isVisible(constraintLayout2)) {
                                    z11 = true;
                                } else {
                                    z11 = false;
                                }
                                ConstraintLayout constraintLayout3 = (ConstraintLayout) this$0._$_findCachedViewById(R.id.clJournalAdditionalMenu);
                                if (z11) {
                                    if (constraintLayout3 != null) {
                                        Extensions.INSTANCE.gone(constraintLayout3);
                                    }
                                } else if (constraintLayout3 != null) {
                                    Extensions.INSTANCE.visible(constraintLayout3);
                                }
                                String str12 = gk.a.f16573a;
                                Bundle bundle2 = new Bundle();
                                JournalModel journalModel32 = this$0.F().G;
                                kotlin.jvm.internal.i.d(journalModel32);
                                String templateType = journalModel32.getTemplateType();
                                kotlin.jvm.internal.i.g(templateType, "templateType");
                                if (kotlin.jvm.internal.i.b(templateType, "regular")) {
                                    str11 = "free_text_journal";
                                } else if (kotlin.jvm.internal.i.b(templateType, "question")) {
                                    str11 = "question";
                                } else if (kotlin.jvm.internal.i.b(templateType, Constants.GOAL_TYPE_THOUGHT)) {
                                    str11 = "thought_journal";
                                } else if (kotlin.jvm.internal.i.b(templateType, "arc")) {
                                    str11 = "arc";
                                }
                                bundle2.putString("template", str11);
                                JournalModel journalModel4 = this$0.F().G;
                                kotlin.jvm.internal.i.d(journalModel4);
                                bundle2.putString("entry_id", journalModel4.getId());
                                hs.k kVar = hs.k.f19476a;
                                gk.a.b(bundle2, "journal_right_top_menu_click");
                                return;
                            case 1:
                                int i16 = j.f31709y;
                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                androidx.fragment.app.p requireActivity6 = this$0.requireActivity();
                                if (requireActivity6 instanceof JournalActivity) {
                                    journalActivity = (JournalActivity) requireActivity6;
                                } else {
                                    journalActivity = null;
                                }
                                if (journalActivity != null) {
                                    JournalModel journalModel5 = this$0.F().G;
                                    kotlin.jvm.internal.i.d(journalModel5);
                                    String id2 = journalModel5.getId();
                                    JournalModel journalModel6 = this$0.F().G;
                                    kotlin.jvm.internal.i.d(journalModel6);
                                    journalActivity.o0(id2, journalModel6.getTemplateType());
                                }
                                String str13 = gk.a.f16573a;
                                Bundle bundle3 = new Bundle();
                                JournalModel journalModel7 = this$0.F().G;
                                kotlin.jvm.internal.i.d(journalModel7);
                                String templateType2 = journalModel7.getTemplateType();
                                kotlin.jvm.internal.i.g(templateType2, "templateType");
                                if (kotlin.jvm.internal.i.b(templateType2, "regular")) {
                                    str11 = "free_text_journal";
                                } else if (kotlin.jvm.internal.i.b(templateType2, "question")) {
                                    str11 = "question";
                                } else if (kotlin.jvm.internal.i.b(templateType2, Constants.GOAL_TYPE_THOUGHT)) {
                                    str11 = "thought_journal";
                                } else if (kotlin.jvm.internal.i.b(templateType2, "arc")) {
                                    str11 = "arc";
                                }
                                bundle3.putString("template", str11);
                                JournalModel journalModel8 = this$0.F().G;
                                kotlin.jvm.internal.i.d(journalModel8);
                                bundle3.putString("entry_id", journalModel8.getId());
                                bundle3.putBoolean("is_draft", false);
                                hs.k kVar2 = hs.k.f19476a;
                                gk.a.b(bundle3, "journal_edit_option_click");
                                return;
                            case 2:
                                int i17 = j.f31709y;
                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                um.c F = this$0.F();
                                Context requireContext = this$0.requireContext();
                                kotlin.jvm.internal.i.f(requireContext, "requireContext()");
                                F.getClass();
                                final Dialog f = um.c.f(requireContext);
                                RobertoTextView robertoTextView72 = (RobertoTextView) f.findViewById(R.id.tvJournalDialogCancel);
                                if (robertoTextView72 != null) {
                                    robertoTextView72.setOnClickListener(new View.OnClickListener() { // from class: sm.b
                                        @Override // android.view.View.OnClickListener
                                        public final void onClick(View view3) {
                                            String str14;
                                            String str15;
                                            int i18 = r3;
                                            Dialog deletionDialog = f;
                                            j this$02 = this$0;
                                            switch (i18) {
                                                case 0:
                                                    int i19 = j.f31709y;
                                                    kotlin.jvm.internal.i.g(this$02, "this$0");
                                                    kotlin.jvm.internal.i.g(deletionDialog, "$deletionDialog");
                                                    JournalModel journalModel9 = this$02.F().G;
                                                    if (journalModel9 != null) {
                                                        String str16 = gk.a.f16573a;
                                                        Bundle bundle4 = new Bundle();
                                                        bundle4.putString("entry_id", journalModel9.getId());
                                                        bundle4.putLong("user_entered_date", journalModel9.getUserEnteredDate());
                                                        bundle4.putBoolean("is_favourite", journalModel9.isFavourite());
                                                        String templateType3 = journalModel9.getTemplateType();
                                                        kotlin.jvm.internal.i.g(templateType3, "templateType");
                                                        if (kotlin.jvm.internal.i.b(templateType3, "regular")) {
                                                            str15 = "free_text_journal";
                                                        } else if (kotlin.jvm.internal.i.b(templateType3, "question")) {
                                                            str15 = "question";
                                                        } else if (kotlin.jvm.internal.i.b(templateType3, Constants.GOAL_TYPE_THOUGHT)) {
                                                            str15 = "thought_journal";
                                                        } else if (!kotlin.jvm.internal.i.b(templateType3, "arc")) {
                                                            str15 = "";
                                                        } else {
                                                            str15 = "arc";
                                                        }
                                                        bundle4.putString("template", str15);
                                                        bundle4.putBoolean("is_draft", false);
                                                        hs.k kVar3 = hs.k.f19476a;
                                                        gk.a.b(bundle4, "journal_delete_popup_no");
                                                    }
                                                    deletionDialog.dismiss();
                                                    return;
                                                default:
                                                    int i20 = j.f31709y;
                                                    kotlin.jvm.internal.i.g(this$02, "this$0");
                                                    kotlin.jvm.internal.i.g(deletionDialog, "$deletionDialog");
                                                    if (this$02.F().G != null) {
                                                        RobertoTextView robertoTextView822 = (RobertoTextView) deletionDialog.findViewById(R.id.tvJournalDialogYes);
                                                        if (robertoTextView822 != null) {
                                                            robertoTextView822.setTextColor(g0.a.b(this$02.requireContext(), R.color.amahaTerracota));
                                                        }
                                                        View findViewById = deletionDialog.findViewById(R.id.ldJournalDialogYesLoading);
                                                        if (findViewById != null) {
                                                            findViewById.setVisibility(0);
                                                        }
                                                        um.c F2 = this$02.F();
                                                        JournalModel journalModel10 = this$02.F().G;
                                                        kotlin.jvm.internal.i.d(journalModel10);
                                                        F2.e(journalModel10.getFirestoreDocumentId());
                                                        this$02.F().E.e(this$02.getViewLifecycleOwner(), new qm.c(5, new i(this$02, deletionDialog)));
                                                        JournalModel journalModel11 = this$02.F().G;
                                                        if (journalModel11 != null) {
                                                            String str17 = gk.a.f16573a;
                                                            Bundle bundle5 = new Bundle();
                                                            bundle5.putString("entry_id", journalModel11.getId());
                                                            bundle5.putLong("user_entered_date", journalModel11.getUserEnteredDate());
                                                            bundle5.putBoolean("is_favourite", journalModel11.isFavourite());
                                                            String templateType4 = journalModel11.getTemplateType();
                                                            kotlin.jvm.internal.i.g(templateType4, "templateType");
                                                            if (kotlin.jvm.internal.i.b(templateType4, "regular")) {
                                                                str14 = "free_text_journal";
                                                            } else if (kotlin.jvm.internal.i.b(templateType4, "question")) {
                                                                str14 = "question";
                                                            } else if (kotlin.jvm.internal.i.b(templateType4, Constants.GOAL_TYPE_THOUGHT)) {
                                                                str14 = "thought_journal";
                                                            } else if (!kotlin.jvm.internal.i.b(templateType4, "arc")) {
                                                                str14 = "";
                                                            } else {
                                                                str14 = "arc";
                                                            }
                                                            bundle5.putString("template", str14);
                                                            bundle5.putBoolean("is_draft", false);
                                                            hs.k kVar4 = hs.k.f19476a;
                                                            gk.a.b(bundle5, "journal_delete_popup_yes");
                                                            return;
                                                        }
                                                        return;
                                                    }
                                                    this$02.I(false);
                                                    deletionDialog.dismiss();
                                                    return;
                                            }
                                        }
                                    });
                                }
                                RobertoTextView robertoTextView82 = (RobertoTextView) f.findViewById(R.id.tvJournalDialogYes);
                                if (robertoTextView82 != null) {
                                    robertoTextView82.setOnClickListener(new View.OnClickListener() { // from class: sm.b
                                        @Override // android.view.View.OnClickListener
                                        public final void onClick(View view3) {
                                            String str14;
                                            String str15;
                                            int i18 = r3;
                                            Dialog deletionDialog = f;
                                            j this$02 = this$0;
                                            switch (i18) {
                                                case 0:
                                                    int i19 = j.f31709y;
                                                    kotlin.jvm.internal.i.g(this$02, "this$0");
                                                    kotlin.jvm.internal.i.g(deletionDialog, "$deletionDialog");
                                                    JournalModel journalModel9 = this$02.F().G;
                                                    if (journalModel9 != null) {
                                                        String str16 = gk.a.f16573a;
                                                        Bundle bundle4 = new Bundle();
                                                        bundle4.putString("entry_id", journalModel9.getId());
                                                        bundle4.putLong("user_entered_date", journalModel9.getUserEnteredDate());
                                                        bundle4.putBoolean("is_favourite", journalModel9.isFavourite());
                                                        String templateType3 = journalModel9.getTemplateType();
                                                        kotlin.jvm.internal.i.g(templateType3, "templateType");
                                                        if (kotlin.jvm.internal.i.b(templateType3, "regular")) {
                                                            str15 = "free_text_journal";
                                                        } else if (kotlin.jvm.internal.i.b(templateType3, "question")) {
                                                            str15 = "question";
                                                        } else if (kotlin.jvm.internal.i.b(templateType3, Constants.GOAL_TYPE_THOUGHT)) {
                                                            str15 = "thought_journal";
                                                        } else if (!kotlin.jvm.internal.i.b(templateType3, "arc")) {
                                                            str15 = "";
                                                        } else {
                                                            str15 = "arc";
                                                        }
                                                        bundle4.putString("template", str15);
                                                        bundle4.putBoolean("is_draft", false);
                                                        hs.k kVar3 = hs.k.f19476a;
                                                        gk.a.b(bundle4, "journal_delete_popup_no");
                                                    }
                                                    deletionDialog.dismiss();
                                                    return;
                                                default:
                                                    int i20 = j.f31709y;
                                                    kotlin.jvm.internal.i.g(this$02, "this$0");
                                                    kotlin.jvm.internal.i.g(deletionDialog, "$deletionDialog");
                                                    if (this$02.F().G != null) {
                                                        RobertoTextView robertoTextView822 = (RobertoTextView) deletionDialog.findViewById(R.id.tvJournalDialogYes);
                                                        if (robertoTextView822 != null) {
                                                            robertoTextView822.setTextColor(g0.a.b(this$02.requireContext(), R.color.amahaTerracota));
                                                        }
                                                        View findViewById = deletionDialog.findViewById(R.id.ldJournalDialogYesLoading);
                                                        if (findViewById != null) {
                                                            findViewById.setVisibility(0);
                                                        }
                                                        um.c F2 = this$02.F();
                                                        JournalModel journalModel10 = this$02.F().G;
                                                        kotlin.jvm.internal.i.d(journalModel10);
                                                        F2.e(journalModel10.getFirestoreDocumentId());
                                                        this$02.F().E.e(this$02.getViewLifecycleOwner(), new qm.c(5, new i(this$02, deletionDialog)));
                                                        JournalModel journalModel11 = this$02.F().G;
                                                        if (journalModel11 != null) {
                                                            String str17 = gk.a.f16573a;
                                                            Bundle bundle5 = new Bundle();
                                                            bundle5.putString("entry_id", journalModel11.getId());
                                                            bundle5.putLong("user_entered_date", journalModel11.getUserEnteredDate());
                                                            bundle5.putBoolean("is_favourite", journalModel11.isFavourite());
                                                            String templateType4 = journalModel11.getTemplateType();
                                                            kotlin.jvm.internal.i.g(templateType4, "templateType");
                                                            if (kotlin.jvm.internal.i.b(templateType4, "regular")) {
                                                                str14 = "free_text_journal";
                                                            } else if (kotlin.jvm.internal.i.b(templateType4, "question")) {
                                                                str14 = "question";
                                                            } else if (kotlin.jvm.internal.i.b(templateType4, Constants.GOAL_TYPE_THOUGHT)) {
                                                                str14 = "thought_journal";
                                                            } else if (!kotlin.jvm.internal.i.b(templateType4, "arc")) {
                                                                str14 = "";
                                                            } else {
                                                                str14 = "arc";
                                                            }
                                                            bundle5.putString("template", str14);
                                                            bundle5.putBoolean("is_draft", false);
                                                            hs.k kVar4 = hs.k.f19476a;
                                                            gk.a.b(bundle5, "journal_delete_popup_yes");
                                                            return;
                                                        }
                                                        return;
                                                    }
                                                    this$02.I(false);
                                                    deletionDialog.dismiss();
                                                    return;
                                            }
                                        }
                                    });
                                }
                                f.show();
                                JournalModel journalModel9 = this$0.F().G;
                                if (journalModel9 != null) {
                                    String str14 = gk.a.f16573a;
                                    Bundle bundle4 = new Bundle();
                                    bundle4.putBoolean("is_draft", false);
                                    bundle4.putString("entry_id", journalModel9.getId());
                                    bundle4.putLong("user_entered_date", journalModel9.getUserEnteredDate());
                                    bundle4.putBoolean("is_favourite", journalModel9.isFavourite());
                                    String templateType3 = journalModel9.getTemplateType();
                                    kotlin.jvm.internal.i.g(templateType3, "templateType");
                                    if (kotlin.jvm.internal.i.b(templateType3, "regular")) {
                                        str11 = "free_text_journal";
                                    } else if (kotlin.jvm.internal.i.b(templateType3, "question")) {
                                        str11 = "question";
                                    } else if (kotlin.jvm.internal.i.b(templateType3, Constants.GOAL_TYPE_THOUGHT)) {
                                        str11 = "thought_journal";
                                    } else if (kotlin.jvm.internal.i.b(templateType3, "arc")) {
                                        str11 = "arc";
                                    }
                                    bundle4.putString("template", str11);
                                    hs.k kVar3 = hs.k.f19476a;
                                    gk.a.b(bundle4, "journal_delete_click");
                                    return;
                                }
                                return;
                            case 3:
                                int i18 = j.f31709y;
                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                this$0.f31712w = !this$0.f31712w;
                                um.c F2 = this$0.F();
                                JournalModel journalModel10 = this$0.F().G;
                                kotlin.jvm.internal.i.d(journalModel10);
                                if (this$0.f31712w) {
                                    requireActivity5 = this$0.requireActivity();
                                    i12 = R.string.added_to_favourites;
                                } else {
                                    requireActivity5 = this$0.requireActivity();
                                    i12 = R.string.removed_favourites;
                                }
                                Toast.makeText(requireActivity5, this$0.getString(i12), 0).show();
                                journalModel10.setFavourite(this$0.f31712w);
                                F2.h(journalModel10);
                                AppCompatImageView appCompatImageView52 = (AppCompatImageView) this$0._$_findCachedViewById(R.id.parentNavBarInfoButton2);
                                if (appCompatImageView52 != null) {
                                    if (this$0.f31712w) {
                                        i13 = R.drawable.ic_journal_star_favourite_enabled;
                                    } else {
                                        i13 = R.drawable.ic_journal_star_favourite;
                                    }
                                    appCompatImageView52.setImageResource(i13);
                                }
                                String str15 = gk.a.f16573a;
                                if (this$0.f31712w) {
                                    str10 = "journal_fav_icon_click";
                                } else {
                                    str10 = "journal_unfav_icon_click";
                                }
                                Bundle bundle5 = new Bundle();
                                JournalModel journalModel11 = this$0.F().G;
                                kotlin.jvm.internal.i.d(journalModel11);
                                String templateType4 = journalModel11.getTemplateType();
                                kotlin.jvm.internal.i.g(templateType4, "templateType");
                                if (kotlin.jvm.internal.i.b(templateType4, "regular")) {
                                    str11 = "free_text_journal";
                                } else if (kotlin.jvm.internal.i.b(templateType4, "question")) {
                                    str11 = "question";
                                } else if (kotlin.jvm.internal.i.b(templateType4, Constants.GOAL_TYPE_THOUGHT)) {
                                    str11 = "thought_journal";
                                } else if (kotlin.jvm.internal.i.b(templateType4, "arc")) {
                                    str11 = "arc";
                                }
                                bundle5.putString("template", str11);
                                JournalModel journalModel12 = this$0.F().G;
                                kotlin.jvm.internal.i.d(journalModel12);
                                bundle5.putString("entry_id", journalModel12.getId());
                                hs.k kVar4 = hs.k.f19476a;
                                gk.a.b(bundle5, str10);
                                return;
                            default:
                                int i19 = j.f31709y;
                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                this$0.requireActivity().onBackPressed();
                                return;
                        }
                    }
                });
            }
        }
    }
}
