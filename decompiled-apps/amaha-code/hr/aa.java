package hr;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.o0;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.activity.TemplateActivity;
import com.theinnerhour.b2b.components.goals.model.FirestoreGoal;
import com.theinnerhour.b2b.model.ScreenResult31Model;
import com.theinnerhour.b2b.model.TemplateModel;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.utils.UtilFunKt;
import com.theinnerhour.b2b.utils.Utils;
import com.theinnerhour.b2b.widgets.RobertoButton;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import kotlin.Metadata;
/* compiled from: ScreenS95Fragment.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lhr/aa;", "Lrr/b;", "<init>", "()V", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class aa extends rr.b {
    public static final /* synthetic */ int A = 0;

    /* renamed from: w  reason: collision with root package name */
    public TemplateActivity f18168w;

    /* renamed from: z  reason: collision with root package name */
    public final LinkedHashMap f18171z = new LinkedHashMap();

    /* renamed from: u  reason: collision with root package name */
    public final String f18166u = LogHelper.INSTANCE.makeLogTag(aa.class);

    /* renamed from: v  reason: collision with root package name */
    public final androidx.lifecycle.m0 f18167v = kotlin.jvm.internal.b0.j(this, kotlin.jvm.internal.y.a(fm.a.class), new b(this), new c(this), new d(this));

    /* renamed from: x  reason: collision with root package name */
    public final ScreenResult31Model f18169x = new ScreenResult31Model(Utils.INSTANCE.getTimeInSeconds());

    /* renamed from: y  reason: collision with root package name */
    public final String f18170y = "result_32";

    /* compiled from: ScreenS95Fragment.kt */
    /* loaded from: classes2.dex */
    public static final class a extends kotlin.jvm.internal.k implements ss.l<hs.f<? extends Boolean, ? extends FirestoreGoal>, hs.k> {

        /* renamed from: v  reason: collision with root package name */
        public final /* synthetic */ String f18173v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str) {
            super(1);
            this.f18173v = str;
        }

        @Override // ss.l
        public final hs.k invoke(hs.f<? extends Boolean, ? extends FirestoreGoal> fVar) {
            hs.f<? extends Boolean, ? extends FirestoreGoal> fVar2 = fVar;
            aa aaVar = aa.this;
            if (fVar2 != null) {
                boolean z10 = aaVar.J().K;
                ScreenResult31Model screenResult31Model = aaVar.f18169x;
                String str = this.f18173v;
                if (z10) {
                    fm.a K = aaVar.K();
                    K.f15174h0.e(aaVar.getViewLifecycleOwner(), new p9(3, new y9(aaVar)));
                    K.j(screenResult31Model, str);
                } else {
                    aaVar.J().K = true;
                    fm.a K2 = aaVar.K();
                    K2.f15177k0.e(aaVar.getViewLifecycleOwner(), new p9(4, new z9(aaVar)));
                    K2.h(screenResult31Model, str);
                }
            } else {
                aaVar.J().s0(new w5());
            }
            return hs.k.f19476a;
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    /* loaded from: classes2.dex */
    public static final class b extends kotlin.jvm.internal.k implements ss.a<androidx.lifecycle.q0> {

        /* renamed from: u  reason: collision with root package name */
        public final /* synthetic */ Fragment f18174u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Fragment fragment) {
            super(0);
            this.f18174u = fragment;
        }

        @Override // ss.a
        public final androidx.lifecycle.q0 invoke() {
            return defpackage.e.m(this.f18174u, "requireActivity().viewModelStore");
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    /* loaded from: classes2.dex */
    public static final class c extends kotlin.jvm.internal.k implements ss.a<k1.a> {

        /* renamed from: u  reason: collision with root package name */
        public final /* synthetic */ Fragment f18175u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Fragment fragment) {
            super(0);
            this.f18175u = fragment;
        }

        @Override // ss.a
        public final k1.a invoke() {
            return defpackage.b.r(this.f18175u, "requireActivity().defaultViewModelCreationExtras");
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    /* loaded from: classes2.dex */
    public static final class d extends kotlin.jvm.internal.k implements ss.a<o0.b> {

        /* renamed from: u  reason: collision with root package name */
        public final /* synthetic */ Fragment f18176u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Fragment fragment) {
            super(0);
            this.f18176u = fragment;
        }

        @Override // ss.a
        public final o0.b invoke() {
            return pl.a.e(this.f18176u, "requireActivity().defaultViewModelProviderFactory");
        }
    }

    public final TemplateActivity J() {
        TemplateActivity templateActivity = this.f18168w;
        if (templateActivity != null) {
            return templateActivity;
        }
        kotlin.jvm.internal.i.q("act");
        throw null;
    }

    public final fm.a K() {
        return (fm.a) this.f18167v.getValue();
    }

    public final View _$_findCachedViewById(int i6) {
        View findViewById;
        LinkedHashMap linkedHashMap = this.f18171z;
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
        return inflater.inflate(R.layout.fragment_screen_s95, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        fm.a K = K();
        K.f15174h0.k(getViewLifecycleOwner());
        K.f15177k0.k(getViewLifecycleOwner());
        K.f15178l0.k(getViewLifecycleOwner());
        K.f15180n0.k(getViewLifecycleOwner());
        K.f15181o0.k(getViewLifecycleOwner());
        K.f15182p0.k(getViewLifecycleOwner());
        K.w();
        super.onDestroyView();
        this.f18171z.clear();
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x009f, code lost:
        if (r9.equals("s136") != false) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0189, code lost:
        if (r9.equals("s136") != false) goto L78;
     */
    @Override // androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String label;
        String str9;
        String str10;
        String str11 = this.f18166u;
        kotlin.jvm.internal.i.g(view, "view");
        super.onViewCreated(view, bundle);
        try {
            androidx.fragment.app.p activity = getActivity();
            kotlin.jvm.internal.i.e(activity, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
            this.f18168w = (TemplateActivity) activity;
            String B0 = J().B0();
            HashMap<String, Object> A0 = J().A0();
            androidx.fragment.app.p activity2 = getActivity();
            kotlin.jvm.internal.i.e(activity2, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
            Object obj = ((TemplateActivity) activity2).F.get("selection_index");
            kotlin.jvm.internal.i.e(obj, "null cannot be cast to non-null type kotlin.Int");
            int intValue = ((Integer) obj).intValue();
            ((RobertoButton) _$_findCachedViewById(R.id.btnS95ButtonOne)).setText(UtilFunKt.paramsMapToString(A0.get("s95_btn_one_text")));
            ((RobertoButton) _$_findCachedViewById(R.id.btnS95ButtonTwo)).setText(UtilFunKt.paramsMapToString(A0.get("s95_btn_two_text")));
            int hashCode = B0.hashCode();
            if (hashCode != 3474689) {
                if (hashCode != 107749775) {
                    if (hashCode == 107840109) {
                        if (!B0.equals("s59-c")) {
                        }
                        str = "s95_title_list";
                    }
                } else {
                    str = B0.equals("s28-c") ? "s95_heading_list" : "s95_heading_list";
                    str = "s95_title_list";
                }
            }
            ArrayList<String> paramsMapToList = UtilFunKt.paramsMapToList(A0.get(str));
            RobertoTextView robertoTextView = (RobertoTextView) _$_findCachedViewById(R.id.tvS95Header);
            CharSequence charSequence = "";
            if (intValue >= paramsMapToList.size()) {
                str2 = "";
            } else {
                str2 = paramsMapToList.get(intValue);
            }
            robertoTextView.setText(str2);
            ArrayList<String> paramsMapToList2 = UtilFunKt.paramsMapToList(A0.get("s95_example_text_list"));
            RobertoTextView robertoTextView2 = (RobertoTextView) _$_findCachedViewById(R.id.tvS95ExampleLabel);
            if (intValue >= paramsMapToList2.size()) {
                str3 = "";
            } else {
                str3 = paramsMapToList2.get(intValue);
            }
            robertoTextView2.setText(str3);
            if (!kotlin.jvm.internal.i.b(B0, "s59-c")) {
                if (kotlin.jvm.internal.i.b(B0, "s28-c")) {
                    str9 = "s28c_list";
                } else {
                    str9 = "s28b_list";
                }
                ArrayList<String> paramsMapToList3 = UtilFunKt.paramsMapToList(A0.get(str9));
                RobertoTextView robertoTextView3 = (RobertoTextView) _$_findCachedViewById(R.id.tvLabel);
                if (intValue >= paramsMapToList3.size()) {
                    str10 = "";
                } else {
                    str10 = paramsMapToList3.get(intValue);
                }
                robertoTextView3.setText(str10);
            } else {
                ArrayList<String> paramsMapToList4 = UtilFunKt.paramsMapToList(A0.get("s28e_list"));
                RobertoTextView robertoTextView4 = (RobertoTextView) _$_findCachedViewById(R.id.tvLabel);
                if (intValue >= paramsMapToList4.size()) {
                    str4 = "";
                } else {
                    str4 = paramsMapToList4.get(intValue);
                }
                robertoTextView4.setText(str4);
            }
            ArrayList<String> paramsMapToList5 = UtilFunKt.paramsMapToList(A0.get("s95_description_list"));
            RobertoTextView robertoTextView5 = (RobertoTextView) _$_findCachedViewById(R.id.tvS95Desc);
            if (intValue >= paramsMapToList5.size()) {
                str5 = "";
            } else {
                str5 = paramsMapToList5.get(intValue);
            }
            robertoTextView5.setText(str5);
            int hashCode2 = B0.hashCode();
            if (hashCode2 != 3474689) {
                if (hashCode2 != 107749775) {
                    if (hashCode2 == 107840109) {
                        if (!B0.equals("s59-c")) {
                        }
                        str6 = "s95_example_description_list";
                    }
                    str6 = "s95_example_list";
                } else {
                    if (!B0.equals("s28-c")) {
                        str6 = "s95_example_list";
                    }
                    str6 = "s95_example_description_list";
                }
            }
            ArrayList<String> paramsMapToList6 = UtilFunKt.paramsMapToList(A0.get(str6));
            RobertoTextView robertoTextView6 = (RobertoTextView) _$_findCachedViewById(R.id.tvS95Example);
            if (intValue >= paramsMapToList6.size()) {
                str7 = "";
            } else {
                str7 = paramsMapToList6.get(intValue);
            }
            robertoTextView6.setText(str7);
            if (kotlin.jvm.internal.i.b(B0, "s59-c") || kotlin.jvm.internal.i.b(B0, "s136")) {
                ArrayList<String> paramsMapToList7 = UtilFunKt.paramsMapToList(A0.get("s95_example_title_list"));
                RobertoTextView robertoTextView7 = (RobertoTextView) _$_findCachedViewById(R.id.tvS95ExampleLabel);
                if (intValue >= paramsMapToList7.size()) {
                    str8 = "";
                } else {
                    str8 = paramsMapToList7.get(intValue);
                }
                robertoTextView7.setText(str8);
            }
            if (kotlin.jvm.internal.i.b(B0, "s136")) {
                try {
                    Object obj2 = J().F.get("model_136_original_list");
                    kotlin.jvm.internal.i.e(obj2, "null cannot be cast to non-null type java.util.ArrayList<kotlin.String>{ kotlin.collections.TypeAliasesKt.ArrayList<kotlin.String> }");
                    ArrayList arrayList = (ArrayList) obj2;
                    RobertoTextView robertoTextView8 = (RobertoTextView) _$_findCachedViewById(R.id.tvLabel);
                    if (intValue < arrayList.size()) {
                        charSequence = (CharSequence) arrayList.get(intValue);
                    }
                    robertoTextView8.setText(charSequence);
                } catch (Exception e10) {
                    LogHelper.INSTANCE.e(str11, e10);
                }
            }
            _$_findCachedViewById(R.id.selectedRow).setBackgroundColor(g0.a.b(requireActivity(), R.color.selected_row));
            ((RobertoTextView) _$_findCachedViewById(R.id.tvLabel)).setTextColor(g0.a.b(requireActivity(), R.color.selected_row_text));
            ((RobertoButton) _$_findCachedViewById(R.id.btnS95ButtonOne)).setOnClickListener(new View.OnClickListener(this) { // from class: hr.x9

                /* renamed from: v  reason: collision with root package name */
                public final /* synthetic */ aa f19398v;

                {
                    this.f19398v = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    int i6 = r2;
                    aa this$0 = this.f19398v;
                    switch (i6) {
                        case 0:
                            int i10 = aa.A;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.J().onBackPressed();
                            return;
                        case 1:
                            int i11 = aa.A;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            androidx.appcompat.widget.a1 a1Var = new androidx.appcompat.widget.a1(this$0.requireContext(), (ImageView) this$0._$_findCachedViewById(R.id.ivEllipses));
                            a1Var.a().inflate(R.menu.logs_menu, a1Var.f1344b);
                            a1Var.f1346d = new hd.a(15, this$0);
                            a1Var.b();
                            return;
                        default:
                            int i12 = aa.A;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.J().onBackPressed();
                            return;
                    }
                }
            });
            if (J().W) {
                fm.a K = K();
                TemplateModel templateModel = J().f10547y;
                if (templateModel != null && (label = templateModel.getLabel()) != null) {
                    K.m(label, this.f18170y);
                }
            }
            ((RobertoButton) _$_findCachedViewById(R.id.btnS95ButtonTwo)).setOnClickListener(new am.c(B0, this, A0, intValue, 6));
            if (kotlin.jvm.internal.i.b(B0, "s59-c")) {
                ((ImageView) _$_findCachedViewById(R.id.ivEllipses)).setVisibility(0);
                ((ImageView) _$_findCachedViewById(R.id.ivEllipses)).setOnClickListener(new View.OnClickListener(this) { // from class: hr.x9

                    /* renamed from: v  reason: collision with root package name */
                    public final /* synthetic */ aa f19398v;

                    {
                        this.f19398v = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        int i6 = r2;
                        aa this$0 = this.f19398v;
                        switch (i6) {
                            case 0:
                                int i10 = aa.A;
                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                this$0.J().onBackPressed();
                                return;
                            case 1:
                                int i11 = aa.A;
                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                androidx.appcompat.widget.a1 a1Var = new androidx.appcompat.widget.a1(this$0.requireContext(), (ImageView) this$0._$_findCachedViewById(R.id.ivEllipses));
                                a1Var.a().inflate(R.menu.logs_menu, a1Var.f1344b);
                                a1Var.f1346d = new hd.a(15, this$0);
                                a1Var.b();
                                return;
                            default:
                                int i12 = aa.A;
                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                this$0.J().onBackPressed();
                                return;
                        }
                    }
                });
            } else {
                ((ImageView) _$_findCachedViewById(R.id.ivEllipses)).setVisibility(8);
            }
            ((ImageView) _$_findCachedViewById(R.id.ivClose)).setOnClickListener(new View.OnClickListener(this) { // from class: hr.x9

                /* renamed from: v  reason: collision with root package name */
                public final /* synthetic */ aa f19398v;

                {
                    this.f19398v = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    int i6 = r2;
                    aa this$0 = this.f19398v;
                    switch (i6) {
                        case 0:
                            int i10 = aa.A;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.J().onBackPressed();
                            return;
                        case 1:
                            int i11 = aa.A;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            androidx.appcompat.widget.a1 a1Var = new androidx.appcompat.widget.a1(this$0.requireContext(), (ImageView) this$0._$_findCachedViewById(R.id.ivEllipses));
                            a1Var.a().inflate(R.menu.logs_menu, a1Var.f1344b);
                            a1Var.f1346d = new hd.a(15, this$0);
                            a1Var.b();
                            return;
                        default:
                            int i12 = aa.A;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.J().onBackPressed();
                            return;
                    }
                }
            });
        } catch (Exception e11) {
            LogHelper.INSTANCE.e(str11, "Exception in on view created", e11);
        }
    }
}
