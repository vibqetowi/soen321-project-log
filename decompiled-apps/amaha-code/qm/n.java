package qm;

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
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.components.journal.activity.JournalActivity;
import com.theinnerhour.b2b.components.journal.model.ImageResponse;
import com.theinnerhour.b2b.components.journal.model.JournalAttachImageModel;
import com.theinnerhour.b2b.components.journal.model.JournalModel;
import com.theinnerhour.b2b.utils.Constants;
import com.theinnerhour.b2b.utils.Extensions;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import gv.r;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.b0;
import kotlin.jvm.internal.y;
/* compiled from: JournalBasicSummaryFragment.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lqm/n;", "Lrr/b;", "<init>", "()V", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class n extends rr.b {

    /* renamed from: z  reason: collision with root package name */
    public static final /* synthetic */ int f29891z = 0;

    /* renamed from: v  reason: collision with root package name */
    public boolean f29893v;

    /* renamed from: x  reason: collision with root package name */
    public mm.b f29895x;

    /* renamed from: y  reason: collision with root package name */
    public final LinkedHashMap f29896y = new LinkedHashMap();

    /* renamed from: u  reason: collision with root package name */
    public final m0 f29892u = b0.j(this, y.a(um.c.class), new c(this), new d(this), new e(this));

    /* renamed from: w  reason: collision with root package name */
    public final ArrayList<JournalAttachImageModel> f29894w = new ArrayList<>();

    /* compiled from: JournalBasicSummaryFragment.kt */
    /* loaded from: classes2.dex */
    public static final class a extends kotlin.jvm.internal.k implements ss.l<Integer, hs.k> {

        /* renamed from: u  reason: collision with root package name */
        public static final a f29897u = new a();

        public a() {
            super(1);
        }

        @Override // ss.l
        public final /* bridge */ /* synthetic */ hs.k invoke(Integer num) {
            num.intValue();
            return hs.k.f19476a;
        }
    }

    /* compiled from: JournalBasicSummaryFragment.kt */
    /* loaded from: classes2.dex */
    public static final class b extends kotlin.jvm.internal.k implements ss.l<Integer, hs.k> {

        /* renamed from: u  reason: collision with root package name */
        public static final b f29898u = new b();

        public b() {
            super(1);
        }

        @Override // ss.l
        public final /* bridge */ /* synthetic */ hs.k invoke(Integer num) {
            num.intValue();
            return hs.k.f19476a;
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    /* loaded from: classes2.dex */
    public static final class c extends kotlin.jvm.internal.k implements ss.a<q0> {

        /* renamed from: u  reason: collision with root package name */
        public final /* synthetic */ Fragment f29899u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Fragment fragment) {
            super(0);
            this.f29899u = fragment;
        }

        @Override // ss.a
        public final q0 invoke() {
            return defpackage.e.m(this.f29899u, "requireActivity().viewModelStore");
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    /* loaded from: classes2.dex */
    public static final class d extends kotlin.jvm.internal.k implements ss.a<k1.a> {

        /* renamed from: u  reason: collision with root package name */
        public final /* synthetic */ Fragment f29900u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Fragment fragment) {
            super(0);
            this.f29900u = fragment;
        }

        @Override // ss.a
        public final k1.a invoke() {
            return defpackage.b.r(this.f29900u, "requireActivity().defaultViewModelCreationExtras");
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    /* loaded from: classes2.dex */
    public static final class e extends kotlin.jvm.internal.k implements ss.a<o0.b> {

        /* renamed from: u  reason: collision with root package name */
        public final /* synthetic */ Fragment f29901u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Fragment fragment) {
            super(0);
            this.f29901u = fragment;
        }

        @Override // ss.a
        public final o0.b invoke() {
            return pl.a.e(this.f29901u, "requireActivity().defaultViewModelProviderFactory");
        }
    }

    public final um.c J() {
        return (um.c) this.f29892u.getValue();
    }

    public final void K(boolean z10) {
        if (z10) {
            requireActivity().onBackPressed();
        } else {
            Toast.makeText(requireContext(), getString(R.string.telecommunicationsError), 0).show();
        }
        J().E.k(getViewLifecycleOwner());
    }

    public final View _$_findCachedViewById(int i6) {
        View findViewById;
        LinkedHashMap linkedHashMap = this.f29896y;
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
        return inflater.inflate(R.layout.fragment_journal_summary_regular_entry, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.f29896y.clear();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        Object obj;
        List list;
        int i6;
        ArrayList<JournalAttachImageModel> arrayList;
        Object obj2;
        String str;
        CharSequence charSequence;
        Object obj3;
        String str2;
        CharSequence charSequence2;
        kotlin.jvm.internal.i.g(view, "view");
        super.onViewCreated(view, bundle);
        final JournalModel journalModel = J().G;
        if (journalModel != null) {
            RobertoTextView robertoTextView = (RobertoTextView) _$_findCachedViewById(R.id.tvJTSDateText);
            if (robertoTextView != null) {
                robertoTextView.setText(J().F.b(journalModel.getUserEnteredDate()));
            }
            RobertoTextView robertoTextView2 = (RobertoTextView) _$_findCachedViewById(R.id.tvJTSSituationTitleText);
            if (robertoTextView2 != null) {
                HashMap<String, Object> data = journalModel.getData();
                if (data != null) {
                    obj3 = data.get("j0_0_text_1");
                } else {
                    obj3 = null;
                }
                if (obj3 instanceof String) {
                    str2 = (String) obj3;
                } else {
                    str2 = null;
                }
                if (str2 != null) {
                    charSequence2 = r.i1(ca.a.Z(str2));
                } else {
                    charSequence2 = null;
                }
                robertoTextView2.setText(charSequence2);
            }
            RobertoTextView robertoTextView3 = (RobertoTextView) _$_findCachedViewById(R.id.tvJTSSituationDescriptionText);
            if (robertoTextView3 != null) {
                HashMap<String, Object> data2 = journalModel.getData();
                if (data2 != null) {
                    obj2 = data2.get("j0_0_text_2");
                } else {
                    obj2 = null;
                }
                if (obj2 instanceof String) {
                    str = (String) obj2;
                } else {
                    str = null;
                }
                if (str != null) {
                    charSequence = r.i1(ca.a.Z(str));
                } else {
                    charSequence = null;
                }
                robertoTextView3.setText(charSequence);
            }
            HashMap<String, Object> data3 = journalModel.getData();
            if (data3 != null) {
                obj = data3.get("j0_0_images");
            } else {
                obj = null;
            }
            if (obj instanceof List) {
                list = (List) obj;
            } else {
                list = null;
            }
            if (list != null) {
                Iterator it = list.iterator();
                while (true) {
                    boolean hasNext = it.hasNext();
                    arrayList = this.f29894w;
                    if (!hasNext) {
                        break;
                    }
                    ImageResponse.Success success = new ImageResponse.Success(null, null, 3, null);
                    String str3 = (String) ((HashMap) it.next()).get("image");
                    if (str3 == null) {
                        str3 = "";
                    }
                    arrayList.add(new JournalAttachImageModel(0.0d, null, success, str3, null, 19, null));
                }
                if (arrayList.size() > 0) {
                    RecyclerView recyclerView = (RecyclerView) _$_findCachedViewById(R.id.rvJournalBasicAttachedImages);
                    if (recyclerView != null) {
                        recyclerView.setLayoutManager(new LinearLayoutManager(requireActivity(), 0, false));
                    }
                    androidx.fragment.app.p requireActivity = requireActivity();
                    kotlin.jvm.internal.i.f(requireActivity, "requireActivity()");
                    this.f29895x = new mm.b(arrayList, requireActivity, true, a.f29897u, b.f29898u);
                    RecyclerView recyclerView2 = (RecyclerView) _$_findCachedViewById(R.id.rvJournalBasicAttachedImages);
                    if (recyclerView2 != null) {
                        mm.b bVar = this.f29895x;
                        if (bVar != null) {
                            recyclerView2.setAdapter(bVar);
                        } else {
                            kotlin.jvm.internal.i.q("adapter");
                            throw null;
                        }
                    }
                }
            }
            RobertoTextView robertoTextView4 = (RobertoTextView) _$_findCachedViewById(R.id.tvMenuEdit);
            if (robertoTextView4 != null) {
                robertoTextView4.setOnClickListener(new View.OnClickListener(this) { // from class: qm.k

                    /* renamed from: v  reason: collision with root package name */
                    public final /* synthetic */ n f29884v;

                    {
                        this.f29884v = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        androidx.fragment.app.p requireActivity2;
                        int i10;
                        String str4;
                        int i11;
                        JournalActivity journalActivity;
                        int i12 = r3;
                        String str5 = "";
                        JournalModel it2 = journalModel;
                        n this$0 = this.f29884v;
                        switch (i12) {
                            case 0:
                                int i13 = n.f29891z;
                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                kotlin.jvm.internal.i.g(it2, "$it");
                                androidx.fragment.app.p requireActivity3 = this$0.requireActivity();
                                if (requireActivity3 instanceof JournalActivity) {
                                    journalActivity = (JournalActivity) requireActivity3;
                                } else {
                                    journalActivity = null;
                                }
                                if (journalActivity != null) {
                                    journalActivity.o0(it2.getId(), it2.getTemplateType());
                                }
                                String str6 = gk.a.f16573a;
                                Bundle bundle2 = new Bundle();
                                String templateType = it2.getTemplateType();
                                kotlin.jvm.internal.i.g(templateType, "templateType");
                                if (kotlin.jvm.internal.i.b(templateType, "regular")) {
                                    str5 = "free_text_journal";
                                } else if (kotlin.jvm.internal.i.b(templateType, "question")) {
                                    str5 = "question";
                                } else if (kotlin.jvm.internal.i.b(templateType, Constants.GOAL_TYPE_THOUGHT)) {
                                    str5 = "thought_journal";
                                } else if (kotlin.jvm.internal.i.b(templateType, "arc")) {
                                    str5 = "arc";
                                }
                                bundle2.putString("template", str5);
                                bundle2.putString("entry_id", it2.getId());
                                bundle2.putBoolean("is_draft", false);
                                hs.k kVar = hs.k.f19476a;
                                gk.a.b(bundle2, "journal_edit_option_click");
                                return;
                            case 1:
                                int i14 = n.f29891z;
                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                kotlin.jvm.internal.i.g(it2, "$it");
                                Extensions extensions = Extensions.INSTANCE;
                                ConstraintLayout clJournalAdditionalMenu = (ConstraintLayout) this$0._$_findCachedViewById(R.id.clJournalAdditionalMenu);
                                kotlin.jvm.internal.i.f(clJournalAdditionalMenu, "clJournalAdditionalMenu");
                                boolean isVisible = extensions.isVisible(clJournalAdditionalMenu);
                                ConstraintLayout clJournalAdditionalMenu2 = (ConstraintLayout) this$0._$_findCachedViewById(R.id.clJournalAdditionalMenu);
                                kotlin.jvm.internal.i.f(clJournalAdditionalMenu2, "clJournalAdditionalMenu");
                                if (isVisible) {
                                    extensions.gone(clJournalAdditionalMenu2);
                                } else {
                                    extensions.visible(clJournalAdditionalMenu2);
                                }
                                String str7 = gk.a.f16573a;
                                Bundle bundle3 = new Bundle();
                                String templateType2 = it2.getTemplateType();
                                kotlin.jvm.internal.i.g(templateType2, "templateType");
                                if (kotlin.jvm.internal.i.b(templateType2, "regular")) {
                                    str5 = "free_text_journal";
                                } else if (kotlin.jvm.internal.i.b(templateType2, "question")) {
                                    str5 = "question";
                                } else if (kotlin.jvm.internal.i.b(templateType2, Constants.GOAL_TYPE_THOUGHT)) {
                                    str5 = "thought_journal";
                                } else if (kotlin.jvm.internal.i.b(templateType2, "arc")) {
                                    str5 = "arc";
                                }
                                bundle3.putString("template", str5);
                                bundle3.putString("entry_id", it2.getId());
                                hs.k kVar2 = hs.k.f19476a;
                                gk.a.b(bundle3, "journal_right_top_menu_click");
                                return;
                            default:
                                int i15 = n.f29891z;
                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                kotlin.jvm.internal.i.g(it2, "$it");
                                this$0.f29893v = !this$0.f29893v;
                                um.c J = this$0.J();
                                if (this$0.f29893v) {
                                    requireActivity2 = this$0.requireActivity();
                                    i10 = R.string.added_to_favourites;
                                } else {
                                    requireActivity2 = this$0.requireActivity();
                                    i10 = R.string.removed_favourites;
                                }
                                Toast.makeText(requireActivity2, this$0.getString(i10), 0).show();
                                it2.setFavourite(this$0.f29893v);
                                J.h(it2);
                                AppCompatImageView appCompatImageView = (AppCompatImageView) this$0._$_findCachedViewById(R.id.parentNavBarInfoButton2);
                                if (appCompatImageView != null) {
                                    if (this$0.f29893v) {
                                        i11 = R.drawable.ic_journal_star_favourite_enabled;
                                    } else {
                                        i11 = R.drawable.ic_journal_star_favourite;
                                    }
                                    appCompatImageView.setImageResource(i11);
                                }
                                String str8 = gk.a.f16573a;
                                if (this$0.f29893v) {
                                    str4 = "journal_fav_icon_click";
                                } else {
                                    str4 = "journal_unfav_icon_click";
                                }
                                Bundle bundle4 = new Bundle();
                                String templateType3 = it2.getTemplateType();
                                kotlin.jvm.internal.i.g(templateType3, "templateType");
                                if (kotlin.jvm.internal.i.b(templateType3, "regular")) {
                                    str5 = "free_text_journal";
                                } else if (kotlin.jvm.internal.i.b(templateType3, "question")) {
                                    str5 = "question";
                                } else if (kotlin.jvm.internal.i.b(templateType3, Constants.GOAL_TYPE_THOUGHT)) {
                                    str5 = "thought_journal";
                                } else if (kotlin.jvm.internal.i.b(templateType3, "arc")) {
                                    str5 = "arc";
                                }
                                bundle4.putString("template", str5);
                                bundle4.putString("entry_id", it2.getId());
                                hs.k kVar3 = hs.k.f19476a;
                                gk.a.b(bundle4, str4);
                                return;
                        }
                    }
                });
            }
            RobertoTextView robertoTextView5 = (RobertoTextView) _$_findCachedViewById(R.id.tvMenuDelete);
            if (robertoTextView5 != null) {
                robertoTextView5.setOnClickListener(new View.OnClickListener(this) { // from class: qm.l

                    /* renamed from: v  reason: collision with root package name */
                    public final /* synthetic */ n f29887v;

                    {
                        this.f29887v = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        String str4;
                        int i10 = r2;
                        final n this$0 = this.f29887v;
                        switch (i10) {
                            case 0:
                                int i11 = n.f29891z;
                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                um.c J = this$0.J();
                                Context requireContext = this$0.requireContext();
                                kotlin.jvm.internal.i.f(requireContext, "requireContext()");
                                J.getClass();
                                final Dialog f = um.c.f(requireContext);
                                RobertoTextView robertoTextView6 = (RobertoTextView) f.findViewById(R.id.tvJournalDialogCancel);
                                if (robertoTextView6 != null) {
                                    robertoTextView6.setOnClickListener(new View.OnClickListener() { // from class: qm.m
                                        @Override // android.view.View.OnClickListener
                                        public final void onClick(View view3) {
                                            String str5;
                                            String str6;
                                            int i12 = r3;
                                            Dialog deletionDialog = f;
                                            n this$02 = this$0;
                                            switch (i12) {
                                                case 0:
                                                    int i13 = n.f29891z;
                                                    kotlin.jvm.internal.i.g(this$02, "this$0");
                                                    kotlin.jvm.internal.i.g(deletionDialog, "$deletionDialog");
                                                    JournalModel journalModel2 = this$02.J().G;
                                                    if (journalModel2 != null) {
                                                        String str7 = gk.a.f16573a;
                                                        Bundle bundle2 = new Bundle();
                                                        bundle2.putString("entry_id", journalModel2.getId());
                                                        bundle2.putLong("user_entered_date", journalModel2.getUserEnteredDate());
                                                        bundle2.putBoolean("is_favourite", journalModel2.isFavourite());
                                                        String templateType = journalModel2.getTemplateType();
                                                        kotlin.jvm.internal.i.g(templateType, "templateType");
                                                        if (kotlin.jvm.internal.i.b(templateType, "regular")) {
                                                            str6 = "free_text_journal";
                                                        } else if (kotlin.jvm.internal.i.b(templateType, "question")) {
                                                            str6 = "question";
                                                        } else if (kotlin.jvm.internal.i.b(templateType, Constants.GOAL_TYPE_THOUGHT)) {
                                                            str6 = "thought_journal";
                                                        } else if (!kotlin.jvm.internal.i.b(templateType, "arc")) {
                                                            str6 = "";
                                                        } else {
                                                            str6 = "arc";
                                                        }
                                                        bundle2.putString("template", str6);
                                                        bundle2.putBoolean("is_draft", false);
                                                        hs.k kVar = hs.k.f19476a;
                                                        gk.a.b(bundle2, "journal_delete_popup_no");
                                                    }
                                                    deletionDialog.dismiss();
                                                    return;
                                                default:
                                                    int i14 = n.f29891z;
                                                    kotlin.jvm.internal.i.g(this$02, "this$0");
                                                    kotlin.jvm.internal.i.g(deletionDialog, "$deletionDialog");
                                                    if (this$02.J().G != null) {
                                                        RobertoTextView robertoTextView7 = (RobertoTextView) deletionDialog.findViewById(R.id.tvJournalDialogYes);
                                                        if (robertoTextView7 != null) {
                                                            robertoTextView7.setTextColor(g0.a.b(this$02.requireContext(), R.color.amahaTerracota));
                                                        }
                                                        View findViewById = deletionDialog.findViewById(R.id.ldJournalDialogYesLoading);
                                                        if (findViewById != null) {
                                                            findViewById.setVisibility(0);
                                                        }
                                                        um.c J2 = this$02.J();
                                                        JournalModel journalModel3 = this$02.J().G;
                                                        kotlin.jvm.internal.i.d(journalModel3);
                                                        J2.e(journalModel3.getFirestoreDocumentId());
                                                        this$02.J().E.e(this$02.getViewLifecycleOwner(), new c(1, new o(this$02, deletionDialog)));
                                                        JournalModel journalModel4 = this$02.J().G;
                                                        if (journalModel4 != null) {
                                                            String str8 = gk.a.f16573a;
                                                            Bundle bundle3 = new Bundle();
                                                            bundle3.putString("entry_id", journalModel4.getId());
                                                            bundle3.putLong("user_entered_date", journalModel4.getUserEnteredDate());
                                                            bundle3.putBoolean("is_favourite", journalModel4.isFavourite());
                                                            String templateType2 = journalModel4.getTemplateType();
                                                            kotlin.jvm.internal.i.g(templateType2, "templateType");
                                                            if (kotlin.jvm.internal.i.b(templateType2, "regular")) {
                                                                str5 = "free_text_journal";
                                                            } else if (kotlin.jvm.internal.i.b(templateType2, "question")) {
                                                                str5 = "question";
                                                            } else if (kotlin.jvm.internal.i.b(templateType2, Constants.GOAL_TYPE_THOUGHT)) {
                                                                str5 = "thought_journal";
                                                            } else if (!kotlin.jvm.internal.i.b(templateType2, "arc")) {
                                                                str5 = "";
                                                            } else {
                                                                str5 = "arc";
                                                            }
                                                            bundle3.putString("template", str5);
                                                            bundle3.putBoolean("is_draft", false);
                                                            hs.k kVar2 = hs.k.f19476a;
                                                            gk.a.b(bundle3, "journal_delete_popup_yes");
                                                            return;
                                                        }
                                                        return;
                                                    }
                                                    this$02.K(false);
                                                    deletionDialog.dismiss();
                                                    return;
                                            }
                                        }
                                    });
                                }
                                RobertoTextView robertoTextView7 = (RobertoTextView) f.findViewById(R.id.tvJournalDialogYes);
                                if (robertoTextView7 != null) {
                                    robertoTextView7.setOnClickListener(new View.OnClickListener() { // from class: qm.m
                                        @Override // android.view.View.OnClickListener
                                        public final void onClick(View view3) {
                                            String str5;
                                            String str6;
                                            int i12 = r3;
                                            Dialog deletionDialog = f;
                                            n this$02 = this$0;
                                            switch (i12) {
                                                case 0:
                                                    int i13 = n.f29891z;
                                                    kotlin.jvm.internal.i.g(this$02, "this$0");
                                                    kotlin.jvm.internal.i.g(deletionDialog, "$deletionDialog");
                                                    JournalModel journalModel2 = this$02.J().G;
                                                    if (journalModel2 != null) {
                                                        String str7 = gk.a.f16573a;
                                                        Bundle bundle2 = new Bundle();
                                                        bundle2.putString("entry_id", journalModel2.getId());
                                                        bundle2.putLong("user_entered_date", journalModel2.getUserEnteredDate());
                                                        bundle2.putBoolean("is_favourite", journalModel2.isFavourite());
                                                        String templateType = journalModel2.getTemplateType();
                                                        kotlin.jvm.internal.i.g(templateType, "templateType");
                                                        if (kotlin.jvm.internal.i.b(templateType, "regular")) {
                                                            str6 = "free_text_journal";
                                                        } else if (kotlin.jvm.internal.i.b(templateType, "question")) {
                                                            str6 = "question";
                                                        } else if (kotlin.jvm.internal.i.b(templateType, Constants.GOAL_TYPE_THOUGHT)) {
                                                            str6 = "thought_journal";
                                                        } else if (!kotlin.jvm.internal.i.b(templateType, "arc")) {
                                                            str6 = "";
                                                        } else {
                                                            str6 = "arc";
                                                        }
                                                        bundle2.putString("template", str6);
                                                        bundle2.putBoolean("is_draft", false);
                                                        hs.k kVar = hs.k.f19476a;
                                                        gk.a.b(bundle2, "journal_delete_popup_no");
                                                    }
                                                    deletionDialog.dismiss();
                                                    return;
                                                default:
                                                    int i14 = n.f29891z;
                                                    kotlin.jvm.internal.i.g(this$02, "this$0");
                                                    kotlin.jvm.internal.i.g(deletionDialog, "$deletionDialog");
                                                    if (this$02.J().G != null) {
                                                        RobertoTextView robertoTextView72 = (RobertoTextView) deletionDialog.findViewById(R.id.tvJournalDialogYes);
                                                        if (robertoTextView72 != null) {
                                                            robertoTextView72.setTextColor(g0.a.b(this$02.requireContext(), R.color.amahaTerracota));
                                                        }
                                                        View findViewById = deletionDialog.findViewById(R.id.ldJournalDialogYesLoading);
                                                        if (findViewById != null) {
                                                            findViewById.setVisibility(0);
                                                        }
                                                        um.c J2 = this$02.J();
                                                        JournalModel journalModel3 = this$02.J().G;
                                                        kotlin.jvm.internal.i.d(journalModel3);
                                                        J2.e(journalModel3.getFirestoreDocumentId());
                                                        this$02.J().E.e(this$02.getViewLifecycleOwner(), new c(1, new o(this$02, deletionDialog)));
                                                        JournalModel journalModel4 = this$02.J().G;
                                                        if (journalModel4 != null) {
                                                            String str8 = gk.a.f16573a;
                                                            Bundle bundle3 = new Bundle();
                                                            bundle3.putString("entry_id", journalModel4.getId());
                                                            bundle3.putLong("user_entered_date", journalModel4.getUserEnteredDate());
                                                            bundle3.putBoolean("is_favourite", journalModel4.isFavourite());
                                                            String templateType2 = journalModel4.getTemplateType();
                                                            kotlin.jvm.internal.i.g(templateType2, "templateType");
                                                            if (kotlin.jvm.internal.i.b(templateType2, "regular")) {
                                                                str5 = "free_text_journal";
                                                            } else if (kotlin.jvm.internal.i.b(templateType2, "question")) {
                                                                str5 = "question";
                                                            } else if (kotlin.jvm.internal.i.b(templateType2, Constants.GOAL_TYPE_THOUGHT)) {
                                                                str5 = "thought_journal";
                                                            } else if (!kotlin.jvm.internal.i.b(templateType2, "arc")) {
                                                                str5 = "";
                                                            } else {
                                                                str5 = "arc";
                                                            }
                                                            bundle3.putString("template", str5);
                                                            bundle3.putBoolean("is_draft", false);
                                                            hs.k kVar2 = hs.k.f19476a;
                                                            gk.a.b(bundle3, "journal_delete_popup_yes");
                                                            return;
                                                        }
                                                        return;
                                                    }
                                                    this$02.K(false);
                                                    deletionDialog.dismiss();
                                                    return;
                                            }
                                        }
                                    });
                                }
                                f.show();
                                JournalModel journalModel2 = this$0.J().G;
                                if (journalModel2 != null) {
                                    String str5 = gk.a.f16573a;
                                    Bundle bundle2 = new Bundle();
                                    bundle2.putString("entry_id", journalModel2.getId());
                                    bundle2.putBoolean("is_draft", false);
                                    bundle2.putLong("user_entered_date", journalModel2.getUserEnteredDate());
                                    bundle2.putBoolean("is_favourite", journalModel2.isFavourite());
                                    String templateType = journalModel2.getTemplateType();
                                    kotlin.jvm.internal.i.g(templateType, "templateType");
                                    if (kotlin.jvm.internal.i.b(templateType, "regular")) {
                                        str4 = "free_text_journal";
                                    } else {
                                        String str6 = "question";
                                        if (!kotlin.jvm.internal.i.b(templateType, "question")) {
                                            if (kotlin.jvm.internal.i.b(templateType, Constants.GOAL_TYPE_THOUGHT)) {
                                                str4 = "thought_journal";
                                            } else {
                                                str6 = "arc";
                                                if (!kotlin.jvm.internal.i.b(templateType, "arc")) {
                                                    str4 = "";
                                                }
                                            }
                                        }
                                        str4 = str6;
                                    }
                                    bundle2.putString("template", str4);
                                    hs.k kVar = hs.k.f19476a;
                                    gk.a.b(bundle2, "journal_delete_click");
                                    return;
                                }
                                return;
                            default:
                                int i12 = n.f29891z;
                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                this$0.requireActivity().onBackPressed();
                                return;
                        }
                    }
                });
            }
            AppCompatImageView appCompatImageView = (AppCompatImageView) _$_findCachedViewById(R.id.parentNavBarInfoButton);
            if (appCompatImageView != null) {
                appCompatImageView.setOnClickListener(new View.OnClickListener(this) { // from class: qm.k

                    /* renamed from: v  reason: collision with root package name */
                    public final /* synthetic */ n f29884v;

                    {
                        this.f29884v = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        androidx.fragment.app.p requireActivity2;
                        int i10;
                        String str4;
                        int i11;
                        JournalActivity journalActivity;
                        int i12 = r3;
                        String str5 = "";
                        JournalModel it2 = journalModel;
                        n this$0 = this.f29884v;
                        switch (i12) {
                            case 0:
                                int i13 = n.f29891z;
                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                kotlin.jvm.internal.i.g(it2, "$it");
                                androidx.fragment.app.p requireActivity3 = this$0.requireActivity();
                                if (requireActivity3 instanceof JournalActivity) {
                                    journalActivity = (JournalActivity) requireActivity3;
                                } else {
                                    journalActivity = null;
                                }
                                if (journalActivity != null) {
                                    journalActivity.o0(it2.getId(), it2.getTemplateType());
                                }
                                String str6 = gk.a.f16573a;
                                Bundle bundle2 = new Bundle();
                                String templateType = it2.getTemplateType();
                                kotlin.jvm.internal.i.g(templateType, "templateType");
                                if (kotlin.jvm.internal.i.b(templateType, "regular")) {
                                    str5 = "free_text_journal";
                                } else if (kotlin.jvm.internal.i.b(templateType, "question")) {
                                    str5 = "question";
                                } else if (kotlin.jvm.internal.i.b(templateType, Constants.GOAL_TYPE_THOUGHT)) {
                                    str5 = "thought_journal";
                                } else if (kotlin.jvm.internal.i.b(templateType, "arc")) {
                                    str5 = "arc";
                                }
                                bundle2.putString("template", str5);
                                bundle2.putString("entry_id", it2.getId());
                                bundle2.putBoolean("is_draft", false);
                                hs.k kVar = hs.k.f19476a;
                                gk.a.b(bundle2, "journal_edit_option_click");
                                return;
                            case 1:
                                int i14 = n.f29891z;
                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                kotlin.jvm.internal.i.g(it2, "$it");
                                Extensions extensions = Extensions.INSTANCE;
                                ConstraintLayout clJournalAdditionalMenu = (ConstraintLayout) this$0._$_findCachedViewById(R.id.clJournalAdditionalMenu);
                                kotlin.jvm.internal.i.f(clJournalAdditionalMenu, "clJournalAdditionalMenu");
                                boolean isVisible = extensions.isVisible(clJournalAdditionalMenu);
                                ConstraintLayout clJournalAdditionalMenu2 = (ConstraintLayout) this$0._$_findCachedViewById(R.id.clJournalAdditionalMenu);
                                kotlin.jvm.internal.i.f(clJournalAdditionalMenu2, "clJournalAdditionalMenu");
                                if (isVisible) {
                                    extensions.gone(clJournalAdditionalMenu2);
                                } else {
                                    extensions.visible(clJournalAdditionalMenu2);
                                }
                                String str7 = gk.a.f16573a;
                                Bundle bundle3 = new Bundle();
                                String templateType2 = it2.getTemplateType();
                                kotlin.jvm.internal.i.g(templateType2, "templateType");
                                if (kotlin.jvm.internal.i.b(templateType2, "regular")) {
                                    str5 = "free_text_journal";
                                } else if (kotlin.jvm.internal.i.b(templateType2, "question")) {
                                    str5 = "question";
                                } else if (kotlin.jvm.internal.i.b(templateType2, Constants.GOAL_TYPE_THOUGHT)) {
                                    str5 = "thought_journal";
                                } else if (kotlin.jvm.internal.i.b(templateType2, "arc")) {
                                    str5 = "arc";
                                }
                                bundle3.putString("template", str5);
                                bundle3.putString("entry_id", it2.getId());
                                hs.k kVar2 = hs.k.f19476a;
                                gk.a.b(bundle3, "journal_right_top_menu_click");
                                return;
                            default:
                                int i15 = n.f29891z;
                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                kotlin.jvm.internal.i.g(it2, "$it");
                                this$0.f29893v = !this$0.f29893v;
                                um.c J = this$0.J();
                                if (this$0.f29893v) {
                                    requireActivity2 = this$0.requireActivity();
                                    i10 = R.string.added_to_favourites;
                                } else {
                                    requireActivity2 = this$0.requireActivity();
                                    i10 = R.string.removed_favourites;
                                }
                                Toast.makeText(requireActivity2, this$0.getString(i10), 0).show();
                                it2.setFavourite(this$0.f29893v);
                                J.h(it2);
                                AppCompatImageView appCompatImageView2 = (AppCompatImageView) this$0._$_findCachedViewById(R.id.parentNavBarInfoButton2);
                                if (appCompatImageView2 != null) {
                                    if (this$0.f29893v) {
                                        i11 = R.drawable.ic_journal_star_favourite_enabled;
                                    } else {
                                        i11 = R.drawable.ic_journal_star_favourite;
                                    }
                                    appCompatImageView2.setImageResource(i11);
                                }
                                String str8 = gk.a.f16573a;
                                if (this$0.f29893v) {
                                    str4 = "journal_fav_icon_click";
                                } else {
                                    str4 = "journal_unfav_icon_click";
                                }
                                Bundle bundle4 = new Bundle();
                                String templateType3 = it2.getTemplateType();
                                kotlin.jvm.internal.i.g(templateType3, "templateType");
                                if (kotlin.jvm.internal.i.b(templateType3, "regular")) {
                                    str5 = "free_text_journal";
                                } else if (kotlin.jvm.internal.i.b(templateType3, "question")) {
                                    str5 = "question";
                                } else if (kotlin.jvm.internal.i.b(templateType3, Constants.GOAL_TYPE_THOUGHT)) {
                                    str5 = "thought_journal";
                                } else if (kotlin.jvm.internal.i.b(templateType3, "arc")) {
                                    str5 = "arc";
                                }
                                bundle4.putString("template", str5);
                                bundle4.putString("entry_id", it2.getId());
                                hs.k kVar3 = hs.k.f19476a;
                                gk.a.b(bundle4, str4);
                                return;
                        }
                    }
                });
            }
            this.f29893v = journalModel.isFavourite();
            AppCompatImageView appCompatImageView2 = (AppCompatImageView) _$_findCachedViewById(R.id.parentNavBarInfoButton2);
            if (appCompatImageView2 != null) {
                if (this.f29893v) {
                    i6 = R.drawable.ic_journal_star_favourite_enabled;
                } else {
                    i6 = R.drawable.ic_journal_star_favourite;
                }
                appCompatImageView2.setImageResource(i6);
            }
            AppCompatImageView appCompatImageView3 = (AppCompatImageView) _$_findCachedViewById(R.id.parentNavBarInfoButton2);
            if (appCompatImageView3 != null) {
                appCompatImageView3.setOnClickListener(new View.OnClickListener(this) { // from class: qm.k

                    /* renamed from: v  reason: collision with root package name */
                    public final /* synthetic */ n f29884v;

                    {
                        this.f29884v = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        androidx.fragment.app.p requireActivity2;
                        int i10;
                        String str4;
                        int i11;
                        JournalActivity journalActivity;
                        int i12 = r3;
                        String str5 = "";
                        JournalModel it2 = journalModel;
                        n this$0 = this.f29884v;
                        switch (i12) {
                            case 0:
                                int i13 = n.f29891z;
                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                kotlin.jvm.internal.i.g(it2, "$it");
                                androidx.fragment.app.p requireActivity3 = this$0.requireActivity();
                                if (requireActivity3 instanceof JournalActivity) {
                                    journalActivity = (JournalActivity) requireActivity3;
                                } else {
                                    journalActivity = null;
                                }
                                if (journalActivity != null) {
                                    journalActivity.o0(it2.getId(), it2.getTemplateType());
                                }
                                String str6 = gk.a.f16573a;
                                Bundle bundle2 = new Bundle();
                                String templateType = it2.getTemplateType();
                                kotlin.jvm.internal.i.g(templateType, "templateType");
                                if (kotlin.jvm.internal.i.b(templateType, "regular")) {
                                    str5 = "free_text_journal";
                                } else if (kotlin.jvm.internal.i.b(templateType, "question")) {
                                    str5 = "question";
                                } else if (kotlin.jvm.internal.i.b(templateType, Constants.GOAL_TYPE_THOUGHT)) {
                                    str5 = "thought_journal";
                                } else if (kotlin.jvm.internal.i.b(templateType, "arc")) {
                                    str5 = "arc";
                                }
                                bundle2.putString("template", str5);
                                bundle2.putString("entry_id", it2.getId());
                                bundle2.putBoolean("is_draft", false);
                                hs.k kVar = hs.k.f19476a;
                                gk.a.b(bundle2, "journal_edit_option_click");
                                return;
                            case 1:
                                int i14 = n.f29891z;
                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                kotlin.jvm.internal.i.g(it2, "$it");
                                Extensions extensions = Extensions.INSTANCE;
                                ConstraintLayout clJournalAdditionalMenu = (ConstraintLayout) this$0._$_findCachedViewById(R.id.clJournalAdditionalMenu);
                                kotlin.jvm.internal.i.f(clJournalAdditionalMenu, "clJournalAdditionalMenu");
                                boolean isVisible = extensions.isVisible(clJournalAdditionalMenu);
                                ConstraintLayout clJournalAdditionalMenu2 = (ConstraintLayout) this$0._$_findCachedViewById(R.id.clJournalAdditionalMenu);
                                kotlin.jvm.internal.i.f(clJournalAdditionalMenu2, "clJournalAdditionalMenu");
                                if (isVisible) {
                                    extensions.gone(clJournalAdditionalMenu2);
                                } else {
                                    extensions.visible(clJournalAdditionalMenu2);
                                }
                                String str7 = gk.a.f16573a;
                                Bundle bundle3 = new Bundle();
                                String templateType2 = it2.getTemplateType();
                                kotlin.jvm.internal.i.g(templateType2, "templateType");
                                if (kotlin.jvm.internal.i.b(templateType2, "regular")) {
                                    str5 = "free_text_journal";
                                } else if (kotlin.jvm.internal.i.b(templateType2, "question")) {
                                    str5 = "question";
                                } else if (kotlin.jvm.internal.i.b(templateType2, Constants.GOAL_TYPE_THOUGHT)) {
                                    str5 = "thought_journal";
                                } else if (kotlin.jvm.internal.i.b(templateType2, "arc")) {
                                    str5 = "arc";
                                }
                                bundle3.putString("template", str5);
                                bundle3.putString("entry_id", it2.getId());
                                hs.k kVar2 = hs.k.f19476a;
                                gk.a.b(bundle3, "journal_right_top_menu_click");
                                return;
                            default:
                                int i15 = n.f29891z;
                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                kotlin.jvm.internal.i.g(it2, "$it");
                                this$0.f29893v = !this$0.f29893v;
                                um.c J = this$0.J();
                                if (this$0.f29893v) {
                                    requireActivity2 = this$0.requireActivity();
                                    i10 = R.string.added_to_favourites;
                                } else {
                                    requireActivity2 = this$0.requireActivity();
                                    i10 = R.string.removed_favourites;
                                }
                                Toast.makeText(requireActivity2, this$0.getString(i10), 0).show();
                                it2.setFavourite(this$0.f29893v);
                                J.h(it2);
                                AppCompatImageView appCompatImageView22 = (AppCompatImageView) this$0._$_findCachedViewById(R.id.parentNavBarInfoButton2);
                                if (appCompatImageView22 != null) {
                                    if (this$0.f29893v) {
                                        i11 = R.drawable.ic_journal_star_favourite_enabled;
                                    } else {
                                        i11 = R.drawable.ic_journal_star_favourite;
                                    }
                                    appCompatImageView22.setImageResource(i11);
                                }
                                String str8 = gk.a.f16573a;
                                if (this$0.f29893v) {
                                    str4 = "journal_fav_icon_click";
                                } else {
                                    str4 = "journal_unfav_icon_click";
                                }
                                Bundle bundle4 = new Bundle();
                                String templateType3 = it2.getTemplateType();
                                kotlin.jvm.internal.i.g(templateType3, "templateType");
                                if (kotlin.jvm.internal.i.b(templateType3, "regular")) {
                                    str5 = "free_text_journal";
                                } else if (kotlin.jvm.internal.i.b(templateType3, "question")) {
                                    str5 = "question";
                                } else if (kotlin.jvm.internal.i.b(templateType3, Constants.GOAL_TYPE_THOUGHT)) {
                                    str5 = "thought_journal";
                                } else if (kotlin.jvm.internal.i.b(templateType3, "arc")) {
                                    str5 = "arc";
                                }
                                bundle4.putString("template", str5);
                                bundle4.putString("entry_id", it2.getId());
                                hs.k kVar3 = hs.k.f19476a;
                                gk.a.b(bundle4, str4);
                                return;
                        }
                    }
                });
            }
        }
        AppCompatImageView appCompatImageView4 = (AppCompatImageView) _$_findCachedViewById(R.id.parentNavBarBackButton);
        if (appCompatImageView4 != null) {
            appCompatImageView4.setOnClickListener(new View.OnClickListener(this) { // from class: qm.l

                /* renamed from: v  reason: collision with root package name */
                public final /* synthetic */ n f29887v;

                {
                    this.f29887v = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    String str4;
                    int i10 = r2;
                    final n this$0 = this.f29887v;
                    switch (i10) {
                        case 0:
                            int i11 = n.f29891z;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            um.c J = this$0.J();
                            Context requireContext = this$0.requireContext();
                            kotlin.jvm.internal.i.f(requireContext, "requireContext()");
                            J.getClass();
                            final Dialog f = um.c.f(requireContext);
                            RobertoTextView robertoTextView6 = (RobertoTextView) f.findViewById(R.id.tvJournalDialogCancel);
                            if (robertoTextView6 != null) {
                                robertoTextView6.setOnClickListener(new View.OnClickListener() { // from class: qm.m
                                    @Override // android.view.View.OnClickListener
                                    public final void onClick(View view3) {
                                        String str5;
                                        String str6;
                                        int i12 = r3;
                                        Dialog deletionDialog = f;
                                        n this$02 = this$0;
                                        switch (i12) {
                                            case 0:
                                                int i13 = n.f29891z;
                                                kotlin.jvm.internal.i.g(this$02, "this$0");
                                                kotlin.jvm.internal.i.g(deletionDialog, "$deletionDialog");
                                                JournalModel journalModel2 = this$02.J().G;
                                                if (journalModel2 != null) {
                                                    String str7 = gk.a.f16573a;
                                                    Bundle bundle2 = new Bundle();
                                                    bundle2.putString("entry_id", journalModel2.getId());
                                                    bundle2.putLong("user_entered_date", journalModel2.getUserEnteredDate());
                                                    bundle2.putBoolean("is_favourite", journalModel2.isFavourite());
                                                    String templateType = journalModel2.getTemplateType();
                                                    kotlin.jvm.internal.i.g(templateType, "templateType");
                                                    if (kotlin.jvm.internal.i.b(templateType, "regular")) {
                                                        str6 = "free_text_journal";
                                                    } else if (kotlin.jvm.internal.i.b(templateType, "question")) {
                                                        str6 = "question";
                                                    } else if (kotlin.jvm.internal.i.b(templateType, Constants.GOAL_TYPE_THOUGHT)) {
                                                        str6 = "thought_journal";
                                                    } else if (!kotlin.jvm.internal.i.b(templateType, "arc")) {
                                                        str6 = "";
                                                    } else {
                                                        str6 = "arc";
                                                    }
                                                    bundle2.putString("template", str6);
                                                    bundle2.putBoolean("is_draft", false);
                                                    hs.k kVar = hs.k.f19476a;
                                                    gk.a.b(bundle2, "journal_delete_popup_no");
                                                }
                                                deletionDialog.dismiss();
                                                return;
                                            default:
                                                int i14 = n.f29891z;
                                                kotlin.jvm.internal.i.g(this$02, "this$0");
                                                kotlin.jvm.internal.i.g(deletionDialog, "$deletionDialog");
                                                if (this$02.J().G != null) {
                                                    RobertoTextView robertoTextView72 = (RobertoTextView) deletionDialog.findViewById(R.id.tvJournalDialogYes);
                                                    if (robertoTextView72 != null) {
                                                        robertoTextView72.setTextColor(g0.a.b(this$02.requireContext(), R.color.amahaTerracota));
                                                    }
                                                    View findViewById = deletionDialog.findViewById(R.id.ldJournalDialogYesLoading);
                                                    if (findViewById != null) {
                                                        findViewById.setVisibility(0);
                                                    }
                                                    um.c J2 = this$02.J();
                                                    JournalModel journalModel3 = this$02.J().G;
                                                    kotlin.jvm.internal.i.d(journalModel3);
                                                    J2.e(journalModel3.getFirestoreDocumentId());
                                                    this$02.J().E.e(this$02.getViewLifecycleOwner(), new c(1, new o(this$02, deletionDialog)));
                                                    JournalModel journalModel4 = this$02.J().G;
                                                    if (journalModel4 != null) {
                                                        String str8 = gk.a.f16573a;
                                                        Bundle bundle3 = new Bundle();
                                                        bundle3.putString("entry_id", journalModel4.getId());
                                                        bundle3.putLong("user_entered_date", journalModel4.getUserEnteredDate());
                                                        bundle3.putBoolean("is_favourite", journalModel4.isFavourite());
                                                        String templateType2 = journalModel4.getTemplateType();
                                                        kotlin.jvm.internal.i.g(templateType2, "templateType");
                                                        if (kotlin.jvm.internal.i.b(templateType2, "regular")) {
                                                            str5 = "free_text_journal";
                                                        } else if (kotlin.jvm.internal.i.b(templateType2, "question")) {
                                                            str5 = "question";
                                                        } else if (kotlin.jvm.internal.i.b(templateType2, Constants.GOAL_TYPE_THOUGHT)) {
                                                            str5 = "thought_journal";
                                                        } else if (!kotlin.jvm.internal.i.b(templateType2, "arc")) {
                                                            str5 = "";
                                                        } else {
                                                            str5 = "arc";
                                                        }
                                                        bundle3.putString("template", str5);
                                                        bundle3.putBoolean("is_draft", false);
                                                        hs.k kVar2 = hs.k.f19476a;
                                                        gk.a.b(bundle3, "journal_delete_popup_yes");
                                                        return;
                                                    }
                                                    return;
                                                }
                                                this$02.K(false);
                                                deletionDialog.dismiss();
                                                return;
                                        }
                                    }
                                });
                            }
                            RobertoTextView robertoTextView7 = (RobertoTextView) f.findViewById(R.id.tvJournalDialogYes);
                            if (robertoTextView7 != null) {
                                robertoTextView7.setOnClickListener(new View.OnClickListener() { // from class: qm.m
                                    @Override // android.view.View.OnClickListener
                                    public final void onClick(View view3) {
                                        String str5;
                                        String str6;
                                        int i12 = r3;
                                        Dialog deletionDialog = f;
                                        n this$02 = this$0;
                                        switch (i12) {
                                            case 0:
                                                int i13 = n.f29891z;
                                                kotlin.jvm.internal.i.g(this$02, "this$0");
                                                kotlin.jvm.internal.i.g(deletionDialog, "$deletionDialog");
                                                JournalModel journalModel2 = this$02.J().G;
                                                if (journalModel2 != null) {
                                                    String str7 = gk.a.f16573a;
                                                    Bundle bundle2 = new Bundle();
                                                    bundle2.putString("entry_id", journalModel2.getId());
                                                    bundle2.putLong("user_entered_date", journalModel2.getUserEnteredDate());
                                                    bundle2.putBoolean("is_favourite", journalModel2.isFavourite());
                                                    String templateType = journalModel2.getTemplateType();
                                                    kotlin.jvm.internal.i.g(templateType, "templateType");
                                                    if (kotlin.jvm.internal.i.b(templateType, "regular")) {
                                                        str6 = "free_text_journal";
                                                    } else if (kotlin.jvm.internal.i.b(templateType, "question")) {
                                                        str6 = "question";
                                                    } else if (kotlin.jvm.internal.i.b(templateType, Constants.GOAL_TYPE_THOUGHT)) {
                                                        str6 = "thought_journal";
                                                    } else if (!kotlin.jvm.internal.i.b(templateType, "arc")) {
                                                        str6 = "";
                                                    } else {
                                                        str6 = "arc";
                                                    }
                                                    bundle2.putString("template", str6);
                                                    bundle2.putBoolean("is_draft", false);
                                                    hs.k kVar = hs.k.f19476a;
                                                    gk.a.b(bundle2, "journal_delete_popup_no");
                                                }
                                                deletionDialog.dismiss();
                                                return;
                                            default:
                                                int i14 = n.f29891z;
                                                kotlin.jvm.internal.i.g(this$02, "this$0");
                                                kotlin.jvm.internal.i.g(deletionDialog, "$deletionDialog");
                                                if (this$02.J().G != null) {
                                                    RobertoTextView robertoTextView72 = (RobertoTextView) deletionDialog.findViewById(R.id.tvJournalDialogYes);
                                                    if (robertoTextView72 != null) {
                                                        robertoTextView72.setTextColor(g0.a.b(this$02.requireContext(), R.color.amahaTerracota));
                                                    }
                                                    View findViewById = deletionDialog.findViewById(R.id.ldJournalDialogYesLoading);
                                                    if (findViewById != null) {
                                                        findViewById.setVisibility(0);
                                                    }
                                                    um.c J2 = this$02.J();
                                                    JournalModel journalModel3 = this$02.J().G;
                                                    kotlin.jvm.internal.i.d(journalModel3);
                                                    J2.e(journalModel3.getFirestoreDocumentId());
                                                    this$02.J().E.e(this$02.getViewLifecycleOwner(), new c(1, new o(this$02, deletionDialog)));
                                                    JournalModel journalModel4 = this$02.J().G;
                                                    if (journalModel4 != null) {
                                                        String str8 = gk.a.f16573a;
                                                        Bundle bundle3 = new Bundle();
                                                        bundle3.putString("entry_id", journalModel4.getId());
                                                        bundle3.putLong("user_entered_date", journalModel4.getUserEnteredDate());
                                                        bundle3.putBoolean("is_favourite", journalModel4.isFavourite());
                                                        String templateType2 = journalModel4.getTemplateType();
                                                        kotlin.jvm.internal.i.g(templateType2, "templateType");
                                                        if (kotlin.jvm.internal.i.b(templateType2, "regular")) {
                                                            str5 = "free_text_journal";
                                                        } else if (kotlin.jvm.internal.i.b(templateType2, "question")) {
                                                            str5 = "question";
                                                        } else if (kotlin.jvm.internal.i.b(templateType2, Constants.GOAL_TYPE_THOUGHT)) {
                                                            str5 = "thought_journal";
                                                        } else if (!kotlin.jvm.internal.i.b(templateType2, "arc")) {
                                                            str5 = "";
                                                        } else {
                                                            str5 = "arc";
                                                        }
                                                        bundle3.putString("template", str5);
                                                        bundle3.putBoolean("is_draft", false);
                                                        hs.k kVar2 = hs.k.f19476a;
                                                        gk.a.b(bundle3, "journal_delete_popup_yes");
                                                        return;
                                                    }
                                                    return;
                                                }
                                                this$02.K(false);
                                                deletionDialog.dismiss();
                                                return;
                                        }
                                    }
                                });
                            }
                            f.show();
                            JournalModel journalModel2 = this$0.J().G;
                            if (journalModel2 != null) {
                                String str5 = gk.a.f16573a;
                                Bundle bundle2 = new Bundle();
                                bundle2.putString("entry_id", journalModel2.getId());
                                bundle2.putBoolean("is_draft", false);
                                bundle2.putLong("user_entered_date", journalModel2.getUserEnteredDate());
                                bundle2.putBoolean("is_favourite", journalModel2.isFavourite());
                                String templateType = journalModel2.getTemplateType();
                                kotlin.jvm.internal.i.g(templateType, "templateType");
                                if (kotlin.jvm.internal.i.b(templateType, "regular")) {
                                    str4 = "free_text_journal";
                                } else {
                                    String str6 = "question";
                                    if (!kotlin.jvm.internal.i.b(templateType, "question")) {
                                        if (kotlin.jvm.internal.i.b(templateType, Constants.GOAL_TYPE_THOUGHT)) {
                                            str4 = "thought_journal";
                                        } else {
                                            str6 = "arc";
                                            if (!kotlin.jvm.internal.i.b(templateType, "arc")) {
                                                str4 = "";
                                            }
                                        }
                                    }
                                    str4 = str6;
                                }
                                bundle2.putString("template", str4);
                                hs.k kVar = hs.k.f19476a;
                                gk.a.b(bundle2, "journal_delete_click");
                                return;
                            }
                            return;
                        default:
                            int i12 = n.f29891z;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.requireActivity().onBackPressed();
                            return;
                    }
                }
            });
        }
    }
}
