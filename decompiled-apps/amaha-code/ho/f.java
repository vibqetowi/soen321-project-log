package ho;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.components.pro.assessment.activity.ProInitialAssessmentActivity;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.utils.UiUtils;
import com.theinnerhour.b2b.widgets.RobertoEditText;
import g0.a;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import org.json.JSONArray;
import org.json.JSONObject;
/* compiled from: ProAssessmentEducationFragment.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lho/f;", "Lrr/b;", "<init>", "()V", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class f extends rr.b {

    /* renamed from: x  reason: collision with root package name */
    public static final /* synthetic */ int f17995x = 0;

    /* renamed from: v  reason: collision with root package name */
    public String f17997v;

    /* renamed from: w  reason: collision with root package name */
    public final LinkedHashMap f17998w = new LinkedHashMap();

    /* renamed from: u  reason: collision with root package name */
    public final String f17996u = LogHelper.INSTANCE.makeLogTag(f.class);

    /* JADX WARN: Removed duplicated region for block: B:256:0x046a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void J(int i6) {
        Drawable drawable;
        Drawable drawable2;
        Drawable drawable3;
        Drawable drawable4;
        Drawable drawable5;
        Drawable drawable6;
        Editable editable;
        boolean z10;
        Drawable drawable7;
        Drawable drawable8;
        Drawable drawable9;
        Drawable drawable10;
        Drawable drawable11;
        Drawable drawable12;
        RobertoEditText robertoEditText;
        try {
            ConstraintLayout constraintLayout = (ConstraintLayout) _$_findCachedViewById(R.id.paAssessmentEducationOption1);
            if (constraintLayout != null) {
                Context requireContext = requireContext();
                Object obj = g0.a.f16164a;
                constraintLayout.setBackground(a.c.b(requireContext, R.drawable.background_stroke_blue_corner_12dp));
            }
            ConstraintLayout constraintLayout2 = (ConstraintLayout) _$_findCachedViewById(R.id.paAssessmentEducationOption1);
            if (constraintLayout2 != null) {
                drawable = constraintLayout2.getBackground();
            } else {
                drawable = null;
            }
            if (drawable != null) {
                drawable.setAlpha(51);
            }
            AppCompatImageView appCompatImageView = (AppCompatImageView) _$_findCachedViewById(R.id.paAssessmentEducationOptionImage1);
            if (appCompatImageView != null) {
                appCompatImageView.setAlpha(0.2f);
            }
            ConstraintLayout constraintLayout3 = (ConstraintLayout) _$_findCachedViewById(R.id.paAssessmentEducationOption2);
            if (constraintLayout3 != null) {
                Context requireContext2 = requireContext();
                Object obj2 = g0.a.f16164a;
                constraintLayout3.setBackground(a.c.b(requireContext2, R.drawable.background_stroke_blue_corner_12dp));
            }
            ConstraintLayout constraintLayout4 = (ConstraintLayout) _$_findCachedViewById(R.id.paAssessmentEducationOption2);
            if (constraintLayout4 != null) {
                drawable2 = constraintLayout4.getBackground();
            } else {
                drawable2 = null;
            }
            if (drawable2 != null) {
                drawable2.setAlpha(51);
            }
            AppCompatImageView appCompatImageView2 = (AppCompatImageView) _$_findCachedViewById(R.id.paAssessmentEducationOptionImage2);
            if (appCompatImageView2 != null) {
                appCompatImageView2.setAlpha(0.2f);
            }
            ConstraintLayout constraintLayout5 = (ConstraintLayout) _$_findCachedViewById(R.id.paAssessmentEducationOption3);
            if (constraintLayout5 != null) {
                Context requireContext3 = requireContext();
                Object obj3 = g0.a.f16164a;
                constraintLayout5.setBackground(a.c.b(requireContext3, R.drawable.background_stroke_blue_corner_12dp));
            }
            ConstraintLayout constraintLayout6 = (ConstraintLayout) _$_findCachedViewById(R.id.paAssessmentEducationOption3);
            if (constraintLayout6 != null) {
                drawable3 = constraintLayout6.getBackground();
            } else {
                drawable3 = null;
            }
            if (drawable3 != null) {
                drawable3.setAlpha(51);
            }
            AppCompatImageView appCompatImageView3 = (AppCompatImageView) _$_findCachedViewById(R.id.paAssessmentEducationOptionImage3);
            if (appCompatImageView3 != null) {
                appCompatImageView3.setAlpha(0.2f);
            }
            ConstraintLayout constraintLayout7 = (ConstraintLayout) _$_findCachedViewById(R.id.paAssessmentEducationOption4);
            if (constraintLayout7 != null) {
                Context requireContext4 = requireContext();
                Object obj4 = g0.a.f16164a;
                constraintLayout7.setBackground(a.c.b(requireContext4, R.drawable.background_stroke_blue_corner_12dp));
            }
            ConstraintLayout constraintLayout8 = (ConstraintLayout) _$_findCachedViewById(R.id.paAssessmentEducationOption4);
            if (constraintLayout8 != null) {
                drawable4 = constraintLayout8.getBackground();
            } else {
                drawable4 = null;
            }
            if (drawable4 != null) {
                drawable4.setAlpha(51);
            }
            AppCompatImageView appCompatImageView4 = (AppCompatImageView) _$_findCachedViewById(R.id.paAssessmentEducationOptionImage4);
            if (appCompatImageView4 != null) {
                appCompatImageView4.setAlpha(0.2f);
            }
            ConstraintLayout constraintLayout9 = (ConstraintLayout) _$_findCachedViewById(R.id.paAssessmentEducationOption5);
            if (constraintLayout9 != null) {
                Context requireContext5 = requireContext();
                Object obj5 = g0.a.f16164a;
                constraintLayout9.setBackground(a.c.b(requireContext5, R.drawable.background_stroke_blue_corner_12dp));
            }
            ConstraintLayout constraintLayout10 = (ConstraintLayout) _$_findCachedViewById(R.id.paAssessmentEducationOption5);
            if (constraintLayout10 != null) {
                drawable5 = constraintLayout10.getBackground();
            } else {
                drawable5 = null;
            }
            if (drawable5 != null) {
                drawable5.setAlpha(51);
            }
            AppCompatImageView appCompatImageView5 = (AppCompatImageView) _$_findCachedViewById(R.id.paAssessmentEducationOptionImage5);
            if (appCompatImageView5 != null) {
                appCompatImageView5.setAlpha(0.2f);
            }
            ConstraintLayout constraintLayout11 = (ConstraintLayout) _$_findCachedViewById(R.id.paAssessmentEducationOption6);
            if (constraintLayout11 != null) {
                Context requireContext6 = requireContext();
                Object obj6 = g0.a.f16164a;
                constraintLayout11.setBackground(a.c.b(requireContext6, R.drawable.background_stroke_blue_corner_12dp));
            }
            ConstraintLayout constraintLayout12 = (ConstraintLayout) _$_findCachedViewById(R.id.paAssessmentEducationOption6);
            if (constraintLayout12 != null) {
                drawable6 = constraintLayout12.getBackground();
            } else {
                drawable6 = null;
            }
            if (drawable6 != null) {
                drawable6.setAlpha(51);
            }
            AppCompatImageView appCompatImageView6 = (AppCompatImageView) _$_findCachedViewById(R.id.paAssessmentEducationOptionImage6);
            if (appCompatImageView6 != null) {
                appCompatImageView6.setAlpha(0.2f);
            }
            RobertoEditText robertoEditText2 = (RobertoEditText) _$_findCachedViewById(R.id.paAssessmentEducationText);
            if (robertoEditText2 != null) {
                robertoEditText2.setAlpha(0.2f);
            }
            if (i6 != -1 && (robertoEditText = (RobertoEditText) _$_findCachedViewById(R.id.paAssessmentEducationText)) != null) {
                robertoEditText.clearFocus();
            }
            float f = 1.0f;
            switch (i6) {
                case -1:
                    RobertoEditText robertoEditText3 = (RobertoEditText) _$_findCachedViewById(R.id.paAssessmentEducationText);
                    if (robertoEditText3 != null) {
                        robertoEditText3.setAlpha(1.0f);
                    }
                    this.f17997v = null;
                    AppCompatImageView appCompatImageView7 = (AppCompatImageView) _$_findCachedViewById(R.id.paAssessmentEducationCta);
                    if (appCompatImageView7 != null) {
                        RobertoEditText robertoEditText4 = (RobertoEditText) _$_findCachedViewById(R.id.paAssessmentEducationText);
                        if (robertoEditText4 != null) {
                            editable = robertoEditText4.getText();
                        } else {
                            editable = null;
                        }
                        if (editable != null && !gv.n.B0(editable)) {
                            z10 = false;
                            if (z10) {
                                f = 0.34f;
                            }
                            appCompatImageView7.setAlpha(f);
                            return;
                        }
                        z10 = true;
                        if (z10) {
                        }
                        appCompatImageView7.setAlpha(f);
                        return;
                    }
                    return;
                case 0:
                    ConstraintLayout constraintLayout13 = (ConstraintLayout) _$_findCachedViewById(R.id.paAssessmentEducationOption1);
                    if (constraintLayout13 != null) {
                        drawable7 = constraintLayout13.getBackground();
                    } else {
                        drawable7 = null;
                    }
                    if (drawable7 != null) {
                        drawable7.setAlpha(255);
                    }
                    AppCompatImageView appCompatImageView8 = (AppCompatImageView) _$_findCachedViewById(R.id.paAssessmentEducationOptionImage1);
                    if (appCompatImageView8 != null) {
                        appCompatImageView8.setAlpha(1.0f);
                    }
                    ConstraintLayout constraintLayout14 = (ConstraintLayout) _$_findCachedViewById(R.id.paAssessmentEducationOption1);
                    if (constraintLayout14 != null) {
                        Context requireContext7 = requireContext();
                        Object obj7 = g0.a.f16164a;
                        constraintLayout14.setBackground(a.c.b(requireContext7, R.drawable.background_stroke_2dp_blue_corner_12dp));
                    }
                    this.f17997v = getString(R.string.paEducationOption1);
                    AppCompatImageView appCompatImageView9 = (AppCompatImageView) _$_findCachedViewById(R.id.paAssessmentEducationCta);
                    if (appCompatImageView9 != null) {
                        appCompatImageView9.setAlpha(1.0f);
                    }
                    if (((RobertoEditText) _$_findCachedViewById(R.id.paAssessmentEducationText)) != null) {
                        UiUtils.Companion companion = UiUtils.Companion;
                        Context requireContext8 = requireContext();
                        kotlin.jvm.internal.i.f(requireContext8, "requireContext()");
                        RobertoEditText paAssessmentEducationText = (RobertoEditText) _$_findCachedViewById(R.id.paAssessmentEducationText);
                        kotlin.jvm.internal.i.f(paAssessmentEducationText, "paAssessmentEducationText");
                        companion.hideKeyboardFrom(requireContext8, paAssessmentEducationText);
                        return;
                    }
                    return;
                case 1:
                    ConstraintLayout constraintLayout15 = (ConstraintLayout) _$_findCachedViewById(R.id.paAssessmentEducationOption2);
                    if (constraintLayout15 != null) {
                        drawable8 = constraintLayout15.getBackground();
                    } else {
                        drawable8 = null;
                    }
                    if (drawable8 != null) {
                        drawable8.setAlpha(255);
                    }
                    AppCompatImageView appCompatImageView10 = (AppCompatImageView) _$_findCachedViewById(R.id.paAssessmentEducationOptionImage2);
                    if (appCompatImageView10 != null) {
                        appCompatImageView10.setAlpha(1.0f);
                    }
                    ConstraintLayout constraintLayout16 = (ConstraintLayout) _$_findCachedViewById(R.id.paAssessmentEducationOption2);
                    if (constraintLayout16 != null) {
                        Context requireContext9 = requireContext();
                        Object obj8 = g0.a.f16164a;
                        constraintLayout16.setBackground(a.c.b(requireContext9, R.drawable.background_stroke_2dp_blue_corner_12dp));
                    }
                    AppCompatImageView appCompatImageView11 = (AppCompatImageView) _$_findCachedViewById(R.id.paAssessmentEducationCta);
                    if (appCompatImageView11 != null) {
                        appCompatImageView11.setAlpha(1.0f);
                    }
                    this.f17997v = getString(R.string.paEducationOption2);
                    if (((RobertoEditText) _$_findCachedViewById(R.id.paAssessmentEducationText)) != null) {
                        UiUtils.Companion companion2 = UiUtils.Companion;
                        Context requireContext10 = requireContext();
                        kotlin.jvm.internal.i.f(requireContext10, "requireContext()");
                        RobertoEditText paAssessmentEducationText2 = (RobertoEditText) _$_findCachedViewById(R.id.paAssessmentEducationText);
                        kotlin.jvm.internal.i.f(paAssessmentEducationText2, "paAssessmentEducationText");
                        companion2.hideKeyboardFrom(requireContext10, paAssessmentEducationText2);
                        return;
                    }
                    return;
                case 2:
                    ConstraintLayout constraintLayout17 = (ConstraintLayout) _$_findCachedViewById(R.id.paAssessmentEducationOption3);
                    if (constraintLayout17 != null) {
                        drawable9 = constraintLayout17.getBackground();
                    } else {
                        drawable9 = null;
                    }
                    if (drawable9 != null) {
                        drawable9.setAlpha(255);
                    }
                    AppCompatImageView appCompatImageView12 = (AppCompatImageView) _$_findCachedViewById(R.id.paAssessmentEducationOptionImage3);
                    if (appCompatImageView12 != null) {
                        appCompatImageView12.setAlpha(1.0f);
                    }
                    ConstraintLayout constraintLayout18 = (ConstraintLayout) _$_findCachedViewById(R.id.paAssessmentEducationOption3);
                    if (constraintLayout18 != null) {
                        Context requireContext11 = requireContext();
                        Object obj9 = g0.a.f16164a;
                        constraintLayout18.setBackground(a.c.b(requireContext11, R.drawable.background_stroke_2dp_blue_corner_12dp));
                    }
                    AppCompatImageView appCompatImageView13 = (AppCompatImageView) _$_findCachedViewById(R.id.paAssessmentEducationCta);
                    if (appCompatImageView13 != null) {
                        appCompatImageView13.setAlpha(1.0f);
                    }
                    this.f17997v = getString(R.string.paEducationOption3);
                    if (((RobertoEditText) _$_findCachedViewById(R.id.paAssessmentEducationText)) != null) {
                        UiUtils.Companion companion3 = UiUtils.Companion;
                        Context requireContext12 = requireContext();
                        kotlin.jvm.internal.i.f(requireContext12, "requireContext()");
                        RobertoEditText paAssessmentEducationText3 = (RobertoEditText) _$_findCachedViewById(R.id.paAssessmentEducationText);
                        kotlin.jvm.internal.i.f(paAssessmentEducationText3, "paAssessmentEducationText");
                        companion3.hideKeyboardFrom(requireContext12, paAssessmentEducationText3);
                        return;
                    }
                    return;
                case 3:
                    ConstraintLayout constraintLayout19 = (ConstraintLayout) _$_findCachedViewById(R.id.paAssessmentEducationOption4);
                    if (constraintLayout19 != null) {
                        drawable10 = constraintLayout19.getBackground();
                    } else {
                        drawable10 = null;
                    }
                    if (drawable10 != null) {
                        drawable10.setAlpha(255);
                    }
                    AppCompatImageView appCompatImageView14 = (AppCompatImageView) _$_findCachedViewById(R.id.paAssessmentEducationOptionImage4);
                    if (appCompatImageView14 != null) {
                        appCompatImageView14.setAlpha(1.0f);
                    }
                    ConstraintLayout constraintLayout20 = (ConstraintLayout) _$_findCachedViewById(R.id.paAssessmentEducationOption4);
                    if (constraintLayout20 != null) {
                        Context requireContext13 = requireContext();
                        Object obj10 = g0.a.f16164a;
                        constraintLayout20.setBackground(a.c.b(requireContext13, R.drawable.background_stroke_2dp_blue_corner_12dp));
                    }
                    AppCompatImageView appCompatImageView15 = (AppCompatImageView) _$_findCachedViewById(R.id.paAssessmentEducationCta);
                    if (appCompatImageView15 != null) {
                        appCompatImageView15.setAlpha(1.0f);
                    }
                    this.f17997v = getString(R.string.paEducationOption4);
                    if (((RobertoEditText) _$_findCachedViewById(R.id.paAssessmentEducationText)) != null) {
                        UiUtils.Companion companion4 = UiUtils.Companion;
                        Context requireContext14 = requireContext();
                        kotlin.jvm.internal.i.f(requireContext14, "requireContext()");
                        RobertoEditText paAssessmentEducationText4 = (RobertoEditText) _$_findCachedViewById(R.id.paAssessmentEducationText);
                        kotlin.jvm.internal.i.f(paAssessmentEducationText4, "paAssessmentEducationText");
                        companion4.hideKeyboardFrom(requireContext14, paAssessmentEducationText4);
                        return;
                    }
                    return;
                case 4:
                    ConstraintLayout constraintLayout21 = (ConstraintLayout) _$_findCachedViewById(R.id.paAssessmentEducationOption5);
                    if (constraintLayout21 != null) {
                        drawable11 = constraintLayout21.getBackground();
                    } else {
                        drawable11 = null;
                    }
                    if (drawable11 != null) {
                        drawable11.setAlpha(255);
                    }
                    AppCompatImageView appCompatImageView16 = (AppCompatImageView) _$_findCachedViewById(R.id.paAssessmentEducationOptionImage5);
                    if (appCompatImageView16 != null) {
                        appCompatImageView16.setAlpha(1.0f);
                    }
                    ConstraintLayout constraintLayout22 = (ConstraintLayout) _$_findCachedViewById(R.id.paAssessmentEducationOption5);
                    if (constraintLayout22 != null) {
                        Context requireContext15 = requireContext();
                        Object obj11 = g0.a.f16164a;
                        constraintLayout22.setBackground(a.c.b(requireContext15, R.drawable.background_stroke_2dp_blue_corner_12dp));
                    }
                    AppCompatImageView appCompatImageView17 = (AppCompatImageView) _$_findCachedViewById(R.id.paAssessmentEducationCta);
                    if (appCompatImageView17 != null) {
                        appCompatImageView17.setAlpha(1.0f);
                    }
                    this.f17997v = getString(R.string.paEducationOption5);
                    if (((RobertoEditText) _$_findCachedViewById(R.id.paAssessmentEducationText)) != null) {
                        UiUtils.Companion companion5 = UiUtils.Companion;
                        Context requireContext16 = requireContext();
                        kotlin.jvm.internal.i.f(requireContext16, "requireContext()");
                        RobertoEditText paAssessmentEducationText5 = (RobertoEditText) _$_findCachedViewById(R.id.paAssessmentEducationText);
                        kotlin.jvm.internal.i.f(paAssessmentEducationText5, "paAssessmentEducationText");
                        companion5.hideKeyboardFrom(requireContext16, paAssessmentEducationText5);
                        return;
                    }
                    return;
                case 5:
                    ConstraintLayout constraintLayout23 = (ConstraintLayout) _$_findCachedViewById(R.id.paAssessmentEducationOption6);
                    if (constraintLayout23 != null) {
                        drawable12 = constraintLayout23.getBackground();
                    } else {
                        drawable12 = null;
                    }
                    if (drawable12 != null) {
                        drawable12.setAlpha(255);
                    }
                    AppCompatImageView appCompatImageView18 = (AppCompatImageView) _$_findCachedViewById(R.id.paAssessmentEducationOptionImage6);
                    if (appCompatImageView18 != null) {
                        appCompatImageView18.setAlpha(1.0f);
                    }
                    ConstraintLayout constraintLayout24 = (ConstraintLayout) _$_findCachedViewById(R.id.paAssessmentEducationOption6);
                    if (constraintLayout24 != null) {
                        Context requireContext17 = requireContext();
                        Object obj12 = g0.a.f16164a;
                        constraintLayout24.setBackground(a.c.b(requireContext17, R.drawable.background_stroke_2dp_blue_corner_12dp));
                    }
                    AppCompatImageView appCompatImageView19 = (AppCompatImageView) _$_findCachedViewById(R.id.paAssessmentEducationCta);
                    if (appCompatImageView19 != null) {
                        appCompatImageView19.setAlpha(1.0f);
                    }
                    this.f17997v = getString(R.string.paEducationOption6);
                    if (((RobertoEditText) _$_findCachedViewById(R.id.paAssessmentEducationText)) != null) {
                        UiUtils.Companion companion6 = UiUtils.Companion;
                        Context requireContext18 = requireContext();
                        kotlin.jvm.internal.i.f(requireContext18, "requireContext()");
                        RobertoEditText paAssessmentEducationText6 = (RobertoEditText) _$_findCachedViewById(R.id.paAssessmentEducationText);
                        kotlin.jvm.internal.i.f(paAssessmentEducationText6, "paAssessmentEducationText");
                        companion6.hideKeyboardFrom(requireContext18, paAssessmentEducationText6);
                        return;
                    }
                    return;
                default:
                    return;
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f17996u, e10);
        }
    }

    public final View _$_findCachedViewById(int i6) {
        View findViewById;
        LinkedHashMap linkedHashMap = this.f17998w;
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
        return inflater.inflate(R.layout.fragment_pa_assessment_education, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.f17998w.clear();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        kotlin.jvm.internal.i.g(view, "view");
        super.onViewCreated(view, bundle);
        try {
            ConstraintLayout constraintLayout = (ConstraintLayout) _$_findCachedViewById(R.id.paAssessmentEducationOption1);
            if (constraintLayout != null) {
                constraintLayout.setOnClickListener(new View.OnClickListener(this) { // from class: ho.e

                    /* renamed from: v  reason: collision with root package name */
                    public final /* synthetic */ f f17994v;

                    {
                        this.f17994v = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        JSONArray jSONArray;
                        Editable editable;
                        boolean z10;
                        int i6 = r2;
                        f this$0 = this.f17994v;
                        switch (i6) {
                            case 0:
                                int i10 = f.f17995x;
                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                this$0.J(0);
                                return;
                            case 1:
                                int i11 = f.f17995x;
                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                this$0.J(1);
                                return;
                            case 2:
                                int i12 = f.f17995x;
                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                this$0.J(2);
                                return;
                            case 3:
                                int i13 = f.f17995x;
                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                this$0.J(3);
                                return;
                            case 4:
                                int i14 = f.f17995x;
                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                this$0.J(4);
                                return;
                            case 5:
                                int i15 = f.f17995x;
                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                this$0.J(5);
                                return;
                            default:
                                int i16 = f.f17995x;
                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                Editable editable2 = null;
                                if (this$0.f17997v == null) {
                                    RobertoEditText robertoEditText = (RobertoEditText) this$0._$_findCachedViewById(R.id.paAssessmentEducationText);
                                    if (robertoEditText != null) {
                                        editable = robertoEditText.getText();
                                    } else {
                                        editable = null;
                                    }
                                    if (editable != null && !gv.n.B0(editable)) {
                                        z10 = false;
                                    } else {
                                        z10 = true;
                                    }
                                    if (z10) {
                                        return;
                                    }
                                }
                                JSONObject jSONObject = new JSONObject();
                                jSONObject.put("question", this$0.getString(R.string.paEducationQues));
                                jSONObject.put("type", "singleselect");
                                if (this$0.f17997v == null) {
                                    String[] strArr = new String[1];
                                    RobertoEditText robertoEditText2 = (RobertoEditText) this$0._$_findCachedViewById(R.id.paAssessmentEducationText);
                                    if (robertoEditText2 != null) {
                                        editable2 = robertoEditText2.getText();
                                    }
                                    strArr[0] = gv.r.i1(String.valueOf(editable2)).toString();
                                    jSONArray = new JSONArray(strArr);
                                } else {
                                    jSONArray = new JSONArray(new String[]{this$0.f17997v});
                                }
                                jSONObject.put("options", jSONArray);
                                androidx.fragment.app.p activity = this$0.getActivity();
                                kotlin.jvm.internal.i.e(activity, "null cannot be cast to non-null type com.theinnerhour.b2b.components.pro.assessment.activity.ProInitialAssessmentActivity");
                                ((ProInitialAssessmentActivity) activity).v0(jSONObject);
                                return;
                        }
                    }
                });
            }
            ConstraintLayout constraintLayout2 = (ConstraintLayout) _$_findCachedViewById(R.id.paAssessmentEducationOption2);
            if (constraintLayout2 != null) {
                constraintLayout2.setOnClickListener(new View.OnClickListener(this) { // from class: ho.e

                    /* renamed from: v  reason: collision with root package name */
                    public final /* synthetic */ f f17994v;

                    {
                        this.f17994v = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        JSONArray jSONArray;
                        Editable editable;
                        boolean z10;
                        int i6 = r2;
                        f this$0 = this.f17994v;
                        switch (i6) {
                            case 0:
                                int i10 = f.f17995x;
                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                this$0.J(0);
                                return;
                            case 1:
                                int i11 = f.f17995x;
                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                this$0.J(1);
                                return;
                            case 2:
                                int i12 = f.f17995x;
                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                this$0.J(2);
                                return;
                            case 3:
                                int i13 = f.f17995x;
                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                this$0.J(3);
                                return;
                            case 4:
                                int i14 = f.f17995x;
                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                this$0.J(4);
                                return;
                            case 5:
                                int i15 = f.f17995x;
                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                this$0.J(5);
                                return;
                            default:
                                int i16 = f.f17995x;
                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                Editable editable2 = null;
                                if (this$0.f17997v == null) {
                                    RobertoEditText robertoEditText = (RobertoEditText) this$0._$_findCachedViewById(R.id.paAssessmentEducationText);
                                    if (robertoEditText != null) {
                                        editable = robertoEditText.getText();
                                    } else {
                                        editable = null;
                                    }
                                    if (editable != null && !gv.n.B0(editable)) {
                                        z10 = false;
                                    } else {
                                        z10 = true;
                                    }
                                    if (z10) {
                                        return;
                                    }
                                }
                                JSONObject jSONObject = new JSONObject();
                                jSONObject.put("question", this$0.getString(R.string.paEducationQues));
                                jSONObject.put("type", "singleselect");
                                if (this$0.f17997v == null) {
                                    String[] strArr = new String[1];
                                    RobertoEditText robertoEditText2 = (RobertoEditText) this$0._$_findCachedViewById(R.id.paAssessmentEducationText);
                                    if (robertoEditText2 != null) {
                                        editable2 = robertoEditText2.getText();
                                    }
                                    strArr[0] = gv.r.i1(String.valueOf(editable2)).toString();
                                    jSONArray = new JSONArray(strArr);
                                } else {
                                    jSONArray = new JSONArray(new String[]{this$0.f17997v});
                                }
                                jSONObject.put("options", jSONArray);
                                androidx.fragment.app.p activity = this$0.getActivity();
                                kotlin.jvm.internal.i.e(activity, "null cannot be cast to non-null type com.theinnerhour.b2b.components.pro.assessment.activity.ProInitialAssessmentActivity");
                                ((ProInitialAssessmentActivity) activity).v0(jSONObject);
                                return;
                        }
                    }
                });
            }
            ConstraintLayout constraintLayout3 = (ConstraintLayout) _$_findCachedViewById(R.id.paAssessmentEducationOption3);
            if (constraintLayout3 != null) {
                constraintLayout3.setOnClickListener(new View.OnClickListener(this) { // from class: ho.e

                    /* renamed from: v  reason: collision with root package name */
                    public final /* synthetic */ f f17994v;

                    {
                        this.f17994v = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        JSONArray jSONArray;
                        Editable editable;
                        boolean z10;
                        int i6 = r2;
                        f this$0 = this.f17994v;
                        switch (i6) {
                            case 0:
                                int i10 = f.f17995x;
                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                this$0.J(0);
                                return;
                            case 1:
                                int i11 = f.f17995x;
                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                this$0.J(1);
                                return;
                            case 2:
                                int i12 = f.f17995x;
                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                this$0.J(2);
                                return;
                            case 3:
                                int i13 = f.f17995x;
                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                this$0.J(3);
                                return;
                            case 4:
                                int i14 = f.f17995x;
                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                this$0.J(4);
                                return;
                            case 5:
                                int i15 = f.f17995x;
                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                this$0.J(5);
                                return;
                            default:
                                int i16 = f.f17995x;
                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                Editable editable2 = null;
                                if (this$0.f17997v == null) {
                                    RobertoEditText robertoEditText = (RobertoEditText) this$0._$_findCachedViewById(R.id.paAssessmentEducationText);
                                    if (robertoEditText != null) {
                                        editable = robertoEditText.getText();
                                    } else {
                                        editable = null;
                                    }
                                    if (editable != null && !gv.n.B0(editable)) {
                                        z10 = false;
                                    } else {
                                        z10 = true;
                                    }
                                    if (z10) {
                                        return;
                                    }
                                }
                                JSONObject jSONObject = new JSONObject();
                                jSONObject.put("question", this$0.getString(R.string.paEducationQues));
                                jSONObject.put("type", "singleselect");
                                if (this$0.f17997v == null) {
                                    String[] strArr = new String[1];
                                    RobertoEditText robertoEditText2 = (RobertoEditText) this$0._$_findCachedViewById(R.id.paAssessmentEducationText);
                                    if (robertoEditText2 != null) {
                                        editable2 = robertoEditText2.getText();
                                    }
                                    strArr[0] = gv.r.i1(String.valueOf(editable2)).toString();
                                    jSONArray = new JSONArray(strArr);
                                } else {
                                    jSONArray = new JSONArray(new String[]{this$0.f17997v});
                                }
                                jSONObject.put("options", jSONArray);
                                androidx.fragment.app.p activity = this$0.getActivity();
                                kotlin.jvm.internal.i.e(activity, "null cannot be cast to non-null type com.theinnerhour.b2b.components.pro.assessment.activity.ProInitialAssessmentActivity");
                                ((ProInitialAssessmentActivity) activity).v0(jSONObject);
                                return;
                        }
                    }
                });
            }
            ConstraintLayout constraintLayout4 = (ConstraintLayout) _$_findCachedViewById(R.id.paAssessmentEducationOption4);
            if (constraintLayout4 != null) {
                constraintLayout4.setOnClickListener(new View.OnClickListener(this) { // from class: ho.e

                    /* renamed from: v  reason: collision with root package name */
                    public final /* synthetic */ f f17994v;

                    {
                        this.f17994v = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        JSONArray jSONArray;
                        Editable editable;
                        boolean z10;
                        int i6 = r2;
                        f this$0 = this.f17994v;
                        switch (i6) {
                            case 0:
                                int i10 = f.f17995x;
                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                this$0.J(0);
                                return;
                            case 1:
                                int i11 = f.f17995x;
                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                this$0.J(1);
                                return;
                            case 2:
                                int i12 = f.f17995x;
                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                this$0.J(2);
                                return;
                            case 3:
                                int i13 = f.f17995x;
                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                this$0.J(3);
                                return;
                            case 4:
                                int i14 = f.f17995x;
                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                this$0.J(4);
                                return;
                            case 5:
                                int i15 = f.f17995x;
                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                this$0.J(5);
                                return;
                            default:
                                int i16 = f.f17995x;
                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                Editable editable2 = null;
                                if (this$0.f17997v == null) {
                                    RobertoEditText robertoEditText = (RobertoEditText) this$0._$_findCachedViewById(R.id.paAssessmentEducationText);
                                    if (robertoEditText != null) {
                                        editable = robertoEditText.getText();
                                    } else {
                                        editable = null;
                                    }
                                    if (editable != null && !gv.n.B0(editable)) {
                                        z10 = false;
                                    } else {
                                        z10 = true;
                                    }
                                    if (z10) {
                                        return;
                                    }
                                }
                                JSONObject jSONObject = new JSONObject();
                                jSONObject.put("question", this$0.getString(R.string.paEducationQues));
                                jSONObject.put("type", "singleselect");
                                if (this$0.f17997v == null) {
                                    String[] strArr = new String[1];
                                    RobertoEditText robertoEditText2 = (RobertoEditText) this$0._$_findCachedViewById(R.id.paAssessmentEducationText);
                                    if (robertoEditText2 != null) {
                                        editable2 = robertoEditText2.getText();
                                    }
                                    strArr[0] = gv.r.i1(String.valueOf(editable2)).toString();
                                    jSONArray = new JSONArray(strArr);
                                } else {
                                    jSONArray = new JSONArray(new String[]{this$0.f17997v});
                                }
                                jSONObject.put("options", jSONArray);
                                androidx.fragment.app.p activity = this$0.getActivity();
                                kotlin.jvm.internal.i.e(activity, "null cannot be cast to non-null type com.theinnerhour.b2b.components.pro.assessment.activity.ProInitialAssessmentActivity");
                                ((ProInitialAssessmentActivity) activity).v0(jSONObject);
                                return;
                        }
                    }
                });
            }
            ConstraintLayout constraintLayout5 = (ConstraintLayout) _$_findCachedViewById(R.id.paAssessmentEducationOption5);
            if (constraintLayout5 != null) {
                constraintLayout5.setOnClickListener(new View.OnClickListener(this) { // from class: ho.e

                    /* renamed from: v  reason: collision with root package name */
                    public final /* synthetic */ f f17994v;

                    {
                        this.f17994v = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        JSONArray jSONArray;
                        Editable editable;
                        boolean z10;
                        int i6 = r2;
                        f this$0 = this.f17994v;
                        switch (i6) {
                            case 0:
                                int i10 = f.f17995x;
                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                this$0.J(0);
                                return;
                            case 1:
                                int i11 = f.f17995x;
                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                this$0.J(1);
                                return;
                            case 2:
                                int i12 = f.f17995x;
                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                this$0.J(2);
                                return;
                            case 3:
                                int i13 = f.f17995x;
                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                this$0.J(3);
                                return;
                            case 4:
                                int i14 = f.f17995x;
                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                this$0.J(4);
                                return;
                            case 5:
                                int i15 = f.f17995x;
                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                this$0.J(5);
                                return;
                            default:
                                int i16 = f.f17995x;
                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                Editable editable2 = null;
                                if (this$0.f17997v == null) {
                                    RobertoEditText robertoEditText = (RobertoEditText) this$0._$_findCachedViewById(R.id.paAssessmentEducationText);
                                    if (robertoEditText != null) {
                                        editable = robertoEditText.getText();
                                    } else {
                                        editable = null;
                                    }
                                    if (editable != null && !gv.n.B0(editable)) {
                                        z10 = false;
                                    } else {
                                        z10 = true;
                                    }
                                    if (z10) {
                                        return;
                                    }
                                }
                                JSONObject jSONObject = new JSONObject();
                                jSONObject.put("question", this$0.getString(R.string.paEducationQues));
                                jSONObject.put("type", "singleselect");
                                if (this$0.f17997v == null) {
                                    String[] strArr = new String[1];
                                    RobertoEditText robertoEditText2 = (RobertoEditText) this$0._$_findCachedViewById(R.id.paAssessmentEducationText);
                                    if (robertoEditText2 != null) {
                                        editable2 = robertoEditText2.getText();
                                    }
                                    strArr[0] = gv.r.i1(String.valueOf(editable2)).toString();
                                    jSONArray = new JSONArray(strArr);
                                } else {
                                    jSONArray = new JSONArray(new String[]{this$0.f17997v});
                                }
                                jSONObject.put("options", jSONArray);
                                androidx.fragment.app.p activity = this$0.getActivity();
                                kotlin.jvm.internal.i.e(activity, "null cannot be cast to non-null type com.theinnerhour.b2b.components.pro.assessment.activity.ProInitialAssessmentActivity");
                                ((ProInitialAssessmentActivity) activity).v0(jSONObject);
                                return;
                        }
                    }
                });
            }
            ConstraintLayout constraintLayout6 = (ConstraintLayout) _$_findCachedViewById(R.id.paAssessmentEducationOption6);
            if (constraintLayout6 != null) {
                constraintLayout6.setOnClickListener(new View.OnClickListener(this) { // from class: ho.e

                    /* renamed from: v  reason: collision with root package name */
                    public final /* synthetic */ f f17994v;

                    {
                        this.f17994v = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        JSONArray jSONArray;
                        Editable editable;
                        boolean z10;
                        int i6 = r2;
                        f this$0 = this.f17994v;
                        switch (i6) {
                            case 0:
                                int i10 = f.f17995x;
                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                this$0.J(0);
                                return;
                            case 1:
                                int i11 = f.f17995x;
                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                this$0.J(1);
                                return;
                            case 2:
                                int i12 = f.f17995x;
                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                this$0.J(2);
                                return;
                            case 3:
                                int i13 = f.f17995x;
                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                this$0.J(3);
                                return;
                            case 4:
                                int i14 = f.f17995x;
                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                this$0.J(4);
                                return;
                            case 5:
                                int i15 = f.f17995x;
                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                this$0.J(5);
                                return;
                            default:
                                int i16 = f.f17995x;
                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                Editable editable2 = null;
                                if (this$0.f17997v == null) {
                                    RobertoEditText robertoEditText = (RobertoEditText) this$0._$_findCachedViewById(R.id.paAssessmentEducationText);
                                    if (robertoEditText != null) {
                                        editable = robertoEditText.getText();
                                    } else {
                                        editable = null;
                                    }
                                    if (editable != null && !gv.n.B0(editable)) {
                                        z10 = false;
                                    } else {
                                        z10 = true;
                                    }
                                    if (z10) {
                                        return;
                                    }
                                }
                                JSONObject jSONObject = new JSONObject();
                                jSONObject.put("question", this$0.getString(R.string.paEducationQues));
                                jSONObject.put("type", "singleselect");
                                if (this$0.f17997v == null) {
                                    String[] strArr = new String[1];
                                    RobertoEditText robertoEditText2 = (RobertoEditText) this$0._$_findCachedViewById(R.id.paAssessmentEducationText);
                                    if (robertoEditText2 != null) {
                                        editable2 = robertoEditText2.getText();
                                    }
                                    strArr[0] = gv.r.i1(String.valueOf(editable2)).toString();
                                    jSONArray = new JSONArray(strArr);
                                } else {
                                    jSONArray = new JSONArray(new String[]{this$0.f17997v});
                                }
                                jSONObject.put("options", jSONArray);
                                androidx.fragment.app.p activity = this$0.getActivity();
                                kotlin.jvm.internal.i.e(activity, "null cannot be cast to non-null type com.theinnerhour.b2b.components.pro.assessment.activity.ProInitialAssessmentActivity");
                                ((ProInitialAssessmentActivity) activity).v0(jSONObject);
                                return;
                        }
                    }
                });
            }
            RobertoEditText robertoEditText = (RobertoEditText) _$_findCachedViewById(R.id.paAssessmentEducationText);
            if (robertoEditText != null) {
                robertoEditText.setOnTouchListener(new dc.h(2, this));
            }
            RobertoEditText robertoEditText2 = (RobertoEditText) _$_findCachedViewById(R.id.paAssessmentEducationText);
            if (robertoEditText2 != null) {
                robertoEditText2.addTextChangedListener(new a());
            }
            AppCompatImageView appCompatImageView = (AppCompatImageView) _$_findCachedViewById(R.id.paAssessmentEducationCta);
            if (appCompatImageView != null) {
                appCompatImageView.setOnClickListener(new View.OnClickListener(this) { // from class: ho.e

                    /* renamed from: v  reason: collision with root package name */
                    public final /* synthetic */ f f17994v;

                    {
                        this.f17994v = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        JSONArray jSONArray;
                        Editable editable;
                        boolean z10;
                        int i6 = r2;
                        f this$0 = this.f17994v;
                        switch (i6) {
                            case 0:
                                int i10 = f.f17995x;
                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                this$0.J(0);
                                return;
                            case 1:
                                int i11 = f.f17995x;
                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                this$0.J(1);
                                return;
                            case 2:
                                int i12 = f.f17995x;
                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                this$0.J(2);
                                return;
                            case 3:
                                int i13 = f.f17995x;
                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                this$0.J(3);
                                return;
                            case 4:
                                int i14 = f.f17995x;
                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                this$0.J(4);
                                return;
                            case 5:
                                int i15 = f.f17995x;
                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                this$0.J(5);
                                return;
                            default:
                                int i16 = f.f17995x;
                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                Editable editable2 = null;
                                if (this$0.f17997v == null) {
                                    RobertoEditText robertoEditText3 = (RobertoEditText) this$0._$_findCachedViewById(R.id.paAssessmentEducationText);
                                    if (robertoEditText3 != null) {
                                        editable = robertoEditText3.getText();
                                    } else {
                                        editable = null;
                                    }
                                    if (editable != null && !gv.n.B0(editable)) {
                                        z10 = false;
                                    } else {
                                        z10 = true;
                                    }
                                    if (z10) {
                                        return;
                                    }
                                }
                                JSONObject jSONObject = new JSONObject();
                                jSONObject.put("question", this$0.getString(R.string.paEducationQues));
                                jSONObject.put("type", "singleselect");
                                if (this$0.f17997v == null) {
                                    String[] strArr = new String[1];
                                    RobertoEditText robertoEditText22 = (RobertoEditText) this$0._$_findCachedViewById(R.id.paAssessmentEducationText);
                                    if (robertoEditText22 != null) {
                                        editable2 = robertoEditText22.getText();
                                    }
                                    strArr[0] = gv.r.i1(String.valueOf(editable2)).toString();
                                    jSONArray = new JSONArray(strArr);
                                } else {
                                    jSONArray = new JSONArray(new String[]{this$0.f17997v});
                                }
                                jSONObject.put("options", jSONArray);
                                androidx.fragment.app.p activity = this$0.getActivity();
                                kotlin.jvm.internal.i.e(activity, "null cannot be cast to non-null type com.theinnerhour.b2b.components.pro.assessment.activity.ProInitialAssessmentActivity");
                                ((ProInitialAssessmentActivity) activity).v0(jSONObject);
                                return;
                        }
                    }
                });
            }
            J(-2);
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f17996u, e10);
        }
    }

    /* compiled from: ProAssessmentEducationFragment.kt */
    /* loaded from: classes2.dex */
    public static final class a implements TextWatcher {
        public a() {
        }

        @Override // android.text.TextWatcher
        public final void onTextChanged(CharSequence charSequence, int i6, int i10, int i11) {
            boolean z10;
            float f;
            AppCompatImageView appCompatImageView = (AppCompatImageView) f.this._$_findCachedViewById(R.id.paAssessmentEducationCta);
            if (appCompatImageView != null) {
                if (charSequence != null && !gv.n.B0(charSequence)) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                if (z10) {
                    f = 0.34f;
                } else {
                    f = 1.0f;
                }
                appCompatImageView.setAlpha(f);
            }
        }

        @Override // android.text.TextWatcher
        public final void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public final void beforeTextChanged(CharSequence charSequence, int i6, int i10, int i11) {
        }
    }
}
