package com.theinnerhour.b2b.components.dynamicActivities.fragments;

import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.text.Editable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.Toast;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.p;
import androidx.lifecycle.m0;
import androidx.lifecycle.o0;
import androidx.lifecycle.q0;
import com.bumptech.glide.Glide;
import com.bumptech.glide.e;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.components.dynamicActivities.activity.NewDynamicParentActivity;
import com.theinnerhour.b2b.components.dynamicActivities.fragments.N20ScreenFragment;
import com.theinnerhour.b2b.model.ContentFeedbackModel;
import com.theinnerhour.b2b.persistence.ApplicationPersistence;
import com.theinnerhour.b2b.persistence.FirebasePersistence;
import com.theinnerhour.b2b.utils.Constants;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.widgets.RobertoEditText;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import gv.n;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.b0;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.y;
import ql.t;
import rr.d;
/* compiled from: N20ScreenFragment.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/theinnerhour/b2b/components/dynamicActivities/fragments/N20ScreenFragment;", "Lrr/d;", "<init>", "()V", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class N20ScreenFragment extends d {
    public static final /* synthetic */ int B = 0;

    /* renamed from: x  reason: collision with root package name */
    public Boolean f11030x;

    /* renamed from: z  reason: collision with root package name */
    public HashMap<String, Object> f11032z;
    public final LinkedHashMap A = new LinkedHashMap();

    /* renamed from: w  reason: collision with root package name */
    public final String f11029w = LogHelper.INSTANCE.makeLogTag("N20ScreenFragment");

    /* renamed from: y  reason: collision with root package name */
    public final m0 f11031y = b0.j(this, y.a(t.class), new a(this), new b(this), new c(this));

    /* compiled from: FragmentViewModelLazy.kt */
    /* loaded from: classes2.dex */
    public static final class a extends k implements ss.a<q0> {

        /* renamed from: u  reason: collision with root package name */
        public final /* synthetic */ Fragment f11033u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Fragment fragment) {
            super(0);
            this.f11033u = fragment;
        }

        @Override // ss.a
        public final q0 invoke() {
            return e.m(this.f11033u, "requireActivity().viewModelStore");
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    /* loaded from: classes2.dex */
    public static final class b extends k implements ss.a<k1.a> {

        /* renamed from: u  reason: collision with root package name */
        public final /* synthetic */ Fragment f11034u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Fragment fragment) {
            super(0);
            this.f11034u = fragment;
        }

        @Override // ss.a
        public final k1.a invoke() {
            return defpackage.b.r(this.f11034u, "requireActivity().defaultViewModelCreationExtras");
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    /* loaded from: classes2.dex */
    public static final class c extends k implements ss.a<o0.b> {

        /* renamed from: u  reason: collision with root package name */
        public final /* synthetic */ Fragment f11035u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Fragment fragment) {
            super(0);
            this.f11035u = fragment;
        }

        @Override // ss.a
        public final o0.b invoke() {
            return pl.a.e(this.f11035u, "requireActivity().defaultViewModelProviderFactory");
        }
    }

    @Override // rr.d
    public final void K() {
        String str;
        boolean z10;
        Object obj;
        String str2;
        Editable text;
        String str3;
        Object obj2;
        Editable text2;
        Boolean bool = this.f11030x;
        if (bool != null) {
            boolean z11 = true;
            NewDynamicParentActivity newDynamicParentActivity = null;
            if (i.b(bool, Boolean.TRUE)) {
                RobertoEditText robertoEditText = (RobertoEditText) _$_findCachedViewById(R.id.tvN20ScreenUserComment);
                if (robertoEditText != null && (text2 = robertoEditText.getText()) != null) {
                    str3 = text2.toString();
                } else {
                    str3 = null;
                }
                Q(10, "positive", str3);
                HashMap<String, Object> hashMap = this.f11032z;
                if (hashMap != null) {
                    obj2 = hashMap.get("yes_toast");
                } else {
                    obj2 = null;
                }
                if (obj2 instanceof String) {
                    str2 = (String) obj2;
                }
                str2 = null;
            } else {
                RobertoEditText robertoEditText2 = (RobertoEditText) _$_findCachedViewById(R.id.tvN20ScreenUserComment);
                if (robertoEditText2 != null && (text = robertoEditText2.getText()) != null) {
                    str = text.toString();
                } else {
                    str = null;
                }
                Q(-5, "negative", str);
                Intent intent = requireActivity().getIntent();
                if (intent != null && intent.getBooleanExtra("showAltFeedback", false)) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    str2 = getString(R.string.feedback_no_alt);
                } else {
                    HashMap<String, Object> hashMap2 = this.f11032z;
                    if (hashMap2 != null) {
                        obj = hashMap2.get("no_toast");
                    } else {
                        obj = null;
                    }
                    if (obj instanceof String) {
                        str2 = (String) obj;
                    }
                    str2 = null;
                }
            }
            p requireActivity = requireActivity();
            if (requireActivity instanceof NewDynamicParentActivity) {
                newDynamicParentActivity = (NewDynamicParentActivity) requireActivity;
            }
            if (newDynamicParentActivity != null) {
                int i6 = NewDynamicParentActivity.F;
                newDynamicParentActivity.L0(false);
            }
            if (str2 != null && !n.B0(str2)) {
                z11 = false;
            }
            if (!z11) {
                Toast.makeText(requireActivity(), str2, 0).show();
                return;
            }
            return;
        }
        Toast.makeText(requireActivity(), "Please select an option to proceed", 0).show();
    }

    public final t P() {
        return (t) this.f11031y.getValue();
    }

    public final void Q(int i6, String str, String str2) {
        try {
            ContentFeedbackModel contentFeedbackModel = new ContentFeedbackModel();
            contentFeedbackModel.setContent_id(P().G);
            ArrayList<String> arrayList = P().H;
            if (arrayList == null) {
                arrayList = new ArrayList<>();
            }
            contentFeedbackModel.setTags(arrayList);
            contentFeedbackModel.setFeedback_type(str);
            contentFeedbackModel.setExtra_weight(i6);
            contentFeedbackModel.setUserComments(str2);
            FirebasePersistence.getInstance().pushContentFeedback(contentFeedbackModel);
            p activity = getActivity();
            i.e(activity, "null cannot be cast to non-null type com.theinnerhour.b2b.widgets.CustomActivity");
            ((rr.a) activity).t0();
        } catch (Exception unused) {
            LogHelper.INSTANCE.e(this.f11029w, "exception in sending feedback");
        }
    }

    @Override // rr.d
    public final void _$_clearFindViewByIdCache() {
        this.A.clear();
    }

    public final View _$_findCachedViewById(int i6) {
        View findViewById;
        LinkedHashMap linkedHashMap = this.A;
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
        return inflater.inflate(R.layout.fragment_n20_screen, viewGroup, false);
    }

    @Override // rr.d, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    @Override // rr.d, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        Integer num;
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        NewDynamicParentActivity newDynamicParentActivity;
        Object obj6;
        String str2;
        i.g(view, "view");
        super.onViewCreated(view, bundle);
        P().U = true;
        try {
            t P = P();
            Bundle arguments = getArguments();
            Boolean bool = null;
            if (arguments != null) {
                str = arguments.getString("slug");
            } else {
                str = null;
            }
            Bundle arguments2 = getArguments();
            if (arguments2 != null) {
                num = Integer.valueOf(arguments2.getInt(Constants.DAYMODEL_POSITION));
            } else {
                num = null;
            }
            this.f11032z = P.m(num, str);
            RobertoTextView robertoTextView = (RobertoTextView) _$_findCachedViewById(R.id.tvN20ScreenTitle);
            HashMap<String, Object> hashMap = this.f11032z;
            if (hashMap != null) {
                obj = hashMap.get("question");
            } else {
                obj = null;
            }
            robertoTextView.setText((String) obj);
            RobertoTextView robertoTextView2 = (RobertoTextView) _$_findCachedViewById(R.id.tvN20ScreenYesButton);
            HashMap<String, Object> hashMap2 = this.f11032z;
            if (hashMap2 != null) {
                obj2 = hashMap2.get("cta1");
            } else {
                obj2 = null;
            }
            robertoTextView2.setText((String) obj2);
            RobertoTextView robertoTextView3 = (RobertoTextView) _$_findCachedViewById(R.id.tvN20ScreenNoButton);
            HashMap<String, Object> hashMap3 = this.f11032z;
            if (hashMap3 != null) {
                obj3 = hashMap3.get("cta2");
            } else {
                obj3 = null;
            }
            robertoTextView3.setText((String) obj3);
            RobertoEditText robertoEditText = (RobertoEditText) _$_findCachedViewById(R.id.tvN20ScreenUserComment);
            HashMap<String, Object> hashMap4 = this.f11032z;
            if (hashMap4 != null) {
                obj4 = hashMap4.get("hint");
            } else {
                obj4 = null;
            }
            robertoEditText.setHint((String) obj4);
            e<Bitmap> a10 = Glide.i(requireActivity()).a();
            HashMap<String, Object> hashMap5 = this.f11032z;
            if (hashMap5 != null) {
                obj5 = hashMap5.get("image");
            } else {
                obj5 = null;
            }
            a10.Z = (String) obj5;
            a10.f5953b0 = true;
            a10.B((AppCompatImageView) _$_findCachedViewById(R.id.ivN20Screen));
            p requireActivity = requireActivity();
            if (requireActivity instanceof NewDynamicParentActivity) {
                newDynamicParentActivity = (NewDynamicParentActivity) requireActivity;
            } else {
                newDynamicParentActivity = null;
            }
            if (newDynamicParentActivity != null) {
                HashMap<String, Object> hashMap6 = this.f11032z;
                if (hashMap6 != null) {
                    obj6 = hashMap6.get("cta3");
                } else {
                    obj6 = null;
                }
                if (obj6 instanceof String) {
                    str2 = (String) obj6;
                } else {
                    str2 = null;
                }
                NewDynamicParentActivity.F0(newDynamicParentActivity, str2, null, null, null, 14);
                newDynamicParentActivity.E0("cta_type_1");
                Bundle arguments3 = getArguments();
                if (arguments3 != null) {
                    bool = Boolean.valueOf(arguments3.getBoolean("show_info_button"));
                }
                newDynamicParentActivity.O0(bool);
                newDynamicParentActivity.D0(false);
            }
            ((LinearLayout) _$_findCachedViewById(R.id.llN20ScreenYesButton)).setOnClickListener(new View.OnClickListener(this) { // from class: pl.b0

                /* renamed from: v  reason: collision with root package name */
                public final /* synthetic */ N20ScreenFragment f28550v;

                {
                    this.f28550v = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    NewDynamicParentActivity newDynamicParentActivity2;
                    NewDynamicParentActivity newDynamicParentActivity3;
                    int i6 = r2;
                    N20ScreenFragment this$0 = this.f28550v;
                    switch (i6) {
                        case 0:
                            int i10 = N20ScreenFragment.B;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.f11030x = Boolean.TRUE;
                            androidx.fragment.app.p requireActivity2 = this$0.requireActivity();
                            if (requireActivity2 instanceof NewDynamicParentActivity) {
                                newDynamicParentActivity3 = (NewDynamicParentActivity) requireActivity2;
                            } else {
                                newDynamicParentActivity3 = null;
                            }
                            if (newDynamicParentActivity3 != null) {
                                newDynamicParentActivity3.D0(true);
                            }
                            ((RobertoTextView) this$0._$_findCachedViewById(R.id.tvN20ScreenYesButton)).setTextColor(g0.a.b(this$0.requireActivity(), R.color.amahaGreen));
                            ((RobertoTextView) this$0._$_findCachedViewById(R.id.tvN20ScreenNoButton)).setTextColor(g0.a.b(this$0.requireActivity(), R.color.amahaDarkGray));
                            ((LinearLayout) this$0._$_findCachedViewById(R.id.llN20ScreenNoButton)).setBackgroundTintList(null);
                            ((LinearLayout) this$0._$_findCachedViewById(R.id.llN20ScreenNoButton)).setBackground(hc.d.H(this$0.requireActivity(), R.drawable.background_stroke_8dp));
                            ((LinearLayout) this$0._$_findCachedViewById(R.id.llN20ScreenYesButton)).setBackground(hc.d.H(this$0.requireActivity(), R.drawable.background_light_blue_corner_8dp));
                            ((LinearLayout) this$0._$_findCachedViewById(R.id.llN20ScreenYesButton)).setBackgroundTintList(ColorStateList.valueOf(g0.a.b(this$0.requireActivity(), R.color.amahaLightGreen)));
                            Bundle bundle2 = new Bundle();
                            bundle2.putString("course", FirebasePersistence.getInstance().getUser().getCurrentCourseName());
                            bundle2.putString("activity_name", this$0.P().T);
                            bundle2.putBoolean("main_activity", this$0.P().K);
                            bundle2.putBoolean("is_revamped", true);
                            bundle2.putBoolean("dynamicV1", true);
                            gk.a.b(bundle2, "s32_yes_click");
                            ApplicationPersistence applicationPersistence = ApplicationPersistence.getInstance();
                            if (!applicationPersistence.getBooleanValue(Constants.PLAY_STORE_FEEDBACK_GIVEN, false)) {
                                int intValue = applicationPersistence.getIntValue(Constants.MAIN_ACTIVITIES_FEEDBACK_COUNTER, 0) + 1;
                                applicationPersistence.setIntValue(Constants.MAIN_ACTIVITIES_FEEDBACK_COUNTER, intValue);
                                if (ca.a.k(2).contains(Integer.valueOf(intValue))) {
                                    applicationPersistence.setBooleanValue(Constants.NOT_V4_SHOW_FEEDBACK, true);
                                    return;
                                }
                                return;
                            }
                            return;
                        default:
                            int i11 = N20ScreenFragment.B;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.f11030x = Boolean.FALSE;
                            androidx.fragment.app.p requireActivity3 = this$0.requireActivity();
                            if (requireActivity3 instanceof NewDynamicParentActivity) {
                                newDynamicParentActivity2 = (NewDynamicParentActivity) requireActivity3;
                            } else {
                                newDynamicParentActivity2 = null;
                            }
                            if (newDynamicParentActivity2 != null) {
                                newDynamicParentActivity2.D0(true);
                            }
                            ((RobertoTextView) this$0._$_findCachedViewById(R.id.tvN20ScreenYesButton)).setTextColor(g0.a.b(this$0.requireActivity(), R.color.amahaDarkGray));
                            ((RobertoTextView) this$0._$_findCachedViewById(R.id.tvN20ScreenNoButton)).setTextColor(g0.a.b(this$0.requireActivity(), R.color.amahaGreen));
                            ((LinearLayout) this$0._$_findCachedViewById(R.id.llN20ScreenYesButton)).setBackgroundTintList(null);
                            ((LinearLayout) this$0._$_findCachedViewById(R.id.llN20ScreenYesButton)).setBackground(hc.d.H(this$0.requireActivity(), R.drawable.background_stroke_8dp));
                            ((LinearLayout) this$0._$_findCachedViewById(R.id.llN20ScreenNoButton)).setBackground(hc.d.H(this$0.requireActivity(), R.drawable.background_light_blue_corner_8dp));
                            ((LinearLayout) this$0._$_findCachedViewById(R.id.llN20ScreenNoButton)).setBackgroundTintList(ColorStateList.valueOf(g0.a.b(this$0.requireActivity(), R.color.amahaLightGreen)));
                            Bundle bundle3 = new Bundle();
                            bundle3.putString("course", FirebasePersistence.getInstance().getUser().getCurrentCourseName());
                            bundle3.putString("activity_name", this$0.P().T);
                            bundle3.putBoolean("main_activity", this$0.P().K);
                            bundle3.putBoolean("is_revamped", true);
                            bundle3.putBoolean("dynamicV1", true);
                            gk.a.b(bundle3, "s32_no_click");
                            return;
                    }
                }
            });
            ((LinearLayout) _$_findCachedViewById(R.id.llN20ScreenNoButton)).setOnClickListener(new View.OnClickListener(this) { // from class: pl.b0

                /* renamed from: v  reason: collision with root package name */
                public final /* synthetic */ N20ScreenFragment f28550v;

                {
                    this.f28550v = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    NewDynamicParentActivity newDynamicParentActivity2;
                    NewDynamicParentActivity newDynamicParentActivity3;
                    int i6 = r2;
                    N20ScreenFragment this$0 = this.f28550v;
                    switch (i6) {
                        case 0:
                            int i10 = N20ScreenFragment.B;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.f11030x = Boolean.TRUE;
                            androidx.fragment.app.p requireActivity2 = this$0.requireActivity();
                            if (requireActivity2 instanceof NewDynamicParentActivity) {
                                newDynamicParentActivity3 = (NewDynamicParentActivity) requireActivity2;
                            } else {
                                newDynamicParentActivity3 = null;
                            }
                            if (newDynamicParentActivity3 != null) {
                                newDynamicParentActivity3.D0(true);
                            }
                            ((RobertoTextView) this$0._$_findCachedViewById(R.id.tvN20ScreenYesButton)).setTextColor(g0.a.b(this$0.requireActivity(), R.color.amahaGreen));
                            ((RobertoTextView) this$0._$_findCachedViewById(R.id.tvN20ScreenNoButton)).setTextColor(g0.a.b(this$0.requireActivity(), R.color.amahaDarkGray));
                            ((LinearLayout) this$0._$_findCachedViewById(R.id.llN20ScreenNoButton)).setBackgroundTintList(null);
                            ((LinearLayout) this$0._$_findCachedViewById(R.id.llN20ScreenNoButton)).setBackground(hc.d.H(this$0.requireActivity(), R.drawable.background_stroke_8dp));
                            ((LinearLayout) this$0._$_findCachedViewById(R.id.llN20ScreenYesButton)).setBackground(hc.d.H(this$0.requireActivity(), R.drawable.background_light_blue_corner_8dp));
                            ((LinearLayout) this$0._$_findCachedViewById(R.id.llN20ScreenYesButton)).setBackgroundTintList(ColorStateList.valueOf(g0.a.b(this$0.requireActivity(), R.color.amahaLightGreen)));
                            Bundle bundle2 = new Bundle();
                            bundle2.putString("course", FirebasePersistence.getInstance().getUser().getCurrentCourseName());
                            bundle2.putString("activity_name", this$0.P().T);
                            bundle2.putBoolean("main_activity", this$0.P().K);
                            bundle2.putBoolean("is_revamped", true);
                            bundle2.putBoolean("dynamicV1", true);
                            gk.a.b(bundle2, "s32_yes_click");
                            ApplicationPersistence applicationPersistence = ApplicationPersistence.getInstance();
                            if (!applicationPersistence.getBooleanValue(Constants.PLAY_STORE_FEEDBACK_GIVEN, false)) {
                                int intValue = applicationPersistence.getIntValue(Constants.MAIN_ACTIVITIES_FEEDBACK_COUNTER, 0) + 1;
                                applicationPersistence.setIntValue(Constants.MAIN_ACTIVITIES_FEEDBACK_COUNTER, intValue);
                                if (ca.a.k(2).contains(Integer.valueOf(intValue))) {
                                    applicationPersistence.setBooleanValue(Constants.NOT_V4_SHOW_FEEDBACK, true);
                                    return;
                                }
                                return;
                            }
                            return;
                        default:
                            int i11 = N20ScreenFragment.B;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.f11030x = Boolean.FALSE;
                            androidx.fragment.app.p requireActivity3 = this$0.requireActivity();
                            if (requireActivity3 instanceof NewDynamicParentActivity) {
                                newDynamicParentActivity2 = (NewDynamicParentActivity) requireActivity3;
                            } else {
                                newDynamicParentActivity2 = null;
                            }
                            if (newDynamicParentActivity2 != null) {
                                newDynamicParentActivity2.D0(true);
                            }
                            ((RobertoTextView) this$0._$_findCachedViewById(R.id.tvN20ScreenYesButton)).setTextColor(g0.a.b(this$0.requireActivity(), R.color.amahaDarkGray));
                            ((RobertoTextView) this$0._$_findCachedViewById(R.id.tvN20ScreenNoButton)).setTextColor(g0.a.b(this$0.requireActivity(), R.color.amahaGreen));
                            ((LinearLayout) this$0._$_findCachedViewById(R.id.llN20ScreenYesButton)).setBackgroundTintList(null);
                            ((LinearLayout) this$0._$_findCachedViewById(R.id.llN20ScreenYesButton)).setBackground(hc.d.H(this$0.requireActivity(), R.drawable.background_stroke_8dp));
                            ((LinearLayout) this$0._$_findCachedViewById(R.id.llN20ScreenNoButton)).setBackground(hc.d.H(this$0.requireActivity(), R.drawable.background_light_blue_corner_8dp));
                            ((LinearLayout) this$0._$_findCachedViewById(R.id.llN20ScreenNoButton)).setBackgroundTintList(ColorStateList.valueOf(g0.a.b(this$0.requireActivity(), R.color.amahaLightGreen)));
                            Bundle bundle3 = new Bundle();
                            bundle3.putString("course", FirebasePersistence.getInstance().getUser().getCurrentCourseName());
                            bundle3.putString("activity_name", this$0.P().T);
                            bundle3.putBoolean("main_activity", this$0.P().K);
                            bundle3.putBoolean("is_revamped", true);
                            bundle3.putBoolean("dynamicV1", true);
                            gk.a.b(bundle3, "s32_no_click");
                            return;
                    }
                }
            });
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f11029w, e10);
        }
    }

    @Override // rr.d
    public final void M() {
    }
}
