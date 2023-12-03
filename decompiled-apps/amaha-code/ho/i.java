package ho;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.components.pro.assessment.activity.ProInitialAssessmentActivity;
import com.theinnerhour.b2b.utils.LogHelper;
import g0.a;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import org.json.JSONArray;
import org.json.JSONObject;
/* compiled from: ProAssessmentGenderFragment.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lho/i;", "Lrr/b;", "<init>", "()V", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class i extends rr.b {

    /* renamed from: x  reason: collision with root package name */
    public static final /* synthetic */ int f18006x = 0;

    /* renamed from: w  reason: collision with root package name */
    public final LinkedHashMap f18009w = new LinkedHashMap();

    /* renamed from: u  reason: collision with root package name */
    public final String f18007u = LogHelper.INSTANCE.makeLogTag(i.class);

    /* renamed from: v  reason: collision with root package name */
    public String f18008v = "";

    public final void J(int i6) {
        Drawable drawable;
        Drawable drawable2;
        Drawable drawable3;
        Drawable drawable4;
        Drawable drawable5;
        Drawable drawable6;
        Drawable drawable7;
        Drawable drawable8;
        Drawable drawable9;
        Drawable drawable10;
        Drawable drawable11;
        Drawable drawable12;
        try {
            ConstraintLayout constraintLayout = (ConstraintLayout) _$_findCachedViewById(R.id.paAssessmentGenderOption1);
            if (constraintLayout != null) {
                Context requireContext = requireContext();
                Object obj = g0.a.f16164a;
                constraintLayout.setBackground(a.c.b(requireContext, R.drawable.background_stroke_blue_corner_12dp));
            }
            ConstraintLayout constraintLayout2 = (ConstraintLayout) _$_findCachedViewById(R.id.paAssessmentGenderOption1);
            if (constraintLayout2 != null) {
                drawable = constraintLayout2.getBackground();
            } else {
                drawable = null;
            }
            if (drawable != null) {
                drawable.setAlpha(51);
            }
            AppCompatImageView appCompatImageView = (AppCompatImageView) _$_findCachedViewById(R.id.paAssessmentGenderOptionImage1);
            if (appCompatImageView != null) {
                appCompatImageView.setAlpha(0.2f);
            }
            ConstraintLayout constraintLayout3 = (ConstraintLayout) _$_findCachedViewById(R.id.paAssessmentGenderOption2);
            if (constraintLayout3 != null) {
                Context requireContext2 = requireContext();
                Object obj2 = g0.a.f16164a;
                constraintLayout3.setBackground(a.c.b(requireContext2, R.drawable.background_stroke_blue_corner_12dp));
            }
            ConstraintLayout constraintLayout4 = (ConstraintLayout) _$_findCachedViewById(R.id.paAssessmentGenderOption2);
            if (constraintLayout4 != null) {
                drawable2 = constraintLayout4.getBackground();
            } else {
                drawable2 = null;
            }
            if (drawable2 != null) {
                drawable2.setAlpha(51);
            }
            AppCompatImageView appCompatImageView2 = (AppCompatImageView) _$_findCachedViewById(R.id.paAssessmentGenderOptionImage2);
            if (appCompatImageView2 != null) {
                appCompatImageView2.setAlpha(0.2f);
            }
            ConstraintLayout constraintLayout5 = (ConstraintLayout) _$_findCachedViewById(R.id.paAssessmentGenderOption3);
            if (constraintLayout5 != null) {
                Context requireContext3 = requireContext();
                Object obj3 = g0.a.f16164a;
                constraintLayout5.setBackground(a.c.b(requireContext3, R.drawable.background_stroke_blue_corner_12dp));
            }
            ConstraintLayout constraintLayout6 = (ConstraintLayout) _$_findCachedViewById(R.id.paAssessmentGenderOption3);
            if (constraintLayout6 != null) {
                drawable3 = constraintLayout6.getBackground();
            } else {
                drawable3 = null;
            }
            if (drawable3 != null) {
                drawable3.setAlpha(51);
            }
            AppCompatImageView appCompatImageView3 = (AppCompatImageView) _$_findCachedViewById(R.id.paAssessmentGenderOptionImage3);
            if (appCompatImageView3 != null) {
                appCompatImageView3.setAlpha(0.2f);
            }
            ConstraintLayout constraintLayout7 = (ConstraintLayout) _$_findCachedViewById(R.id.paAssessmentGenderOption4);
            if (constraintLayout7 != null) {
                Context requireContext4 = requireContext();
                Object obj4 = g0.a.f16164a;
                constraintLayout7.setBackground(a.c.b(requireContext4, R.drawable.background_stroke_blue_corner_12dp));
            }
            ConstraintLayout constraintLayout8 = (ConstraintLayout) _$_findCachedViewById(R.id.paAssessmentGenderOption4);
            if (constraintLayout8 != null) {
                drawable4 = constraintLayout8.getBackground();
            } else {
                drawable4 = null;
            }
            if (drawable4 != null) {
                drawable4.setAlpha(51);
            }
            AppCompatImageView appCompatImageView4 = (AppCompatImageView) _$_findCachedViewById(R.id.paAssessmentGenderOptionImage4);
            if (appCompatImageView4 != null) {
                appCompatImageView4.setAlpha(0.2f);
            }
            ConstraintLayout constraintLayout9 = (ConstraintLayout) _$_findCachedViewById(R.id.paAssessmentGenderOption5);
            if (constraintLayout9 != null) {
                Context requireContext5 = requireContext();
                Object obj5 = g0.a.f16164a;
                constraintLayout9.setBackground(a.c.b(requireContext5, R.drawable.background_stroke_blue_corner_12dp));
            }
            ConstraintLayout constraintLayout10 = (ConstraintLayout) _$_findCachedViewById(R.id.paAssessmentGenderOption5);
            if (constraintLayout10 != null) {
                drawable5 = constraintLayout10.getBackground();
            } else {
                drawable5 = null;
            }
            if (drawable5 != null) {
                drawable5.setAlpha(51);
            }
            AppCompatImageView appCompatImageView5 = (AppCompatImageView) _$_findCachedViewById(R.id.paAssessmentGenderOptionImage5);
            if (appCompatImageView5 != null) {
                appCompatImageView5.setAlpha(0.2f);
            }
            ConstraintLayout constraintLayout11 = (ConstraintLayout) _$_findCachedViewById(R.id.paAssessmentGenderOption6);
            if (constraintLayout11 != null) {
                Context requireContext6 = requireContext();
                Object obj6 = g0.a.f16164a;
                constraintLayout11.setBackground(a.c.b(requireContext6, R.drawable.background_stroke_blue_corner_12dp));
            }
            ConstraintLayout constraintLayout12 = (ConstraintLayout) _$_findCachedViewById(R.id.paAssessmentGenderOption6);
            if (constraintLayout12 != null) {
                drawable6 = constraintLayout12.getBackground();
            } else {
                drawable6 = null;
            }
            if (drawable6 != null) {
                drawable6.setAlpha(51);
            }
            AppCompatImageView appCompatImageView6 = (AppCompatImageView) _$_findCachedViewById(R.id.paAssessmentGenderOptionImage6);
            if (appCompatImageView6 != null) {
                appCompatImageView6.setAlpha(0.2f);
            }
            if (i6 != 0) {
                if (i6 != 1) {
                    if (i6 != 2) {
                        if (i6 != 3) {
                            if (i6 != 4) {
                                if (i6 == 5) {
                                    ConstraintLayout constraintLayout13 = (ConstraintLayout) _$_findCachedViewById(R.id.paAssessmentGenderOption6);
                                    if (constraintLayout13 != null) {
                                        drawable12 = constraintLayout13.getBackground();
                                    } else {
                                        drawable12 = null;
                                    }
                                    if (drawable12 != null) {
                                        drawable12.setAlpha(255);
                                    }
                                    AppCompatImageView appCompatImageView7 = (AppCompatImageView) _$_findCachedViewById(R.id.paAssessmentGenderOptionImage6);
                                    if (appCompatImageView7 != null) {
                                        appCompatImageView7.setAlpha(1.0f);
                                    }
                                    ConstraintLayout constraintLayout14 = (ConstraintLayout) _$_findCachedViewById(R.id.paAssessmentGenderOption6);
                                    if (constraintLayout14 != null) {
                                        Context requireContext7 = requireContext();
                                        Object obj7 = g0.a.f16164a;
                                        constraintLayout14.setBackground(a.c.b(requireContext7, R.drawable.background_stroke_2dp_blue_corner_12dp));
                                    }
                                    AppCompatImageView appCompatImageView8 = (AppCompatImageView) _$_findCachedViewById(R.id.paAssessmentGenderCta);
                                    if (appCompatImageView8 != null) {
                                        appCompatImageView8.setAlpha(1.0f);
                                    }
                                    String string = getString(R.string.paGenderOption6);
                                    kotlin.jvm.internal.i.f(string, "getString(R.string.paGenderOption6)");
                                    this.f18008v = string;
                                    return;
                                }
                                return;
                            }
                            ConstraintLayout constraintLayout15 = (ConstraintLayout) _$_findCachedViewById(R.id.paAssessmentGenderOption5);
                            if (constraintLayout15 != null) {
                                drawable11 = constraintLayout15.getBackground();
                            } else {
                                drawable11 = null;
                            }
                            if (drawable11 != null) {
                                drawable11.setAlpha(255);
                            }
                            AppCompatImageView appCompatImageView9 = (AppCompatImageView) _$_findCachedViewById(R.id.paAssessmentGenderOptionImage5);
                            if (appCompatImageView9 != null) {
                                appCompatImageView9.setAlpha(1.0f);
                            }
                            ConstraintLayout constraintLayout16 = (ConstraintLayout) _$_findCachedViewById(R.id.paAssessmentGenderOption5);
                            if (constraintLayout16 != null) {
                                Context requireContext8 = requireContext();
                                Object obj8 = g0.a.f16164a;
                                constraintLayout16.setBackground(a.c.b(requireContext8, R.drawable.background_stroke_2dp_blue_corner_12dp));
                            }
                            AppCompatImageView appCompatImageView10 = (AppCompatImageView) _$_findCachedViewById(R.id.paAssessmentGenderCta);
                            if (appCompatImageView10 != null) {
                                appCompatImageView10.setAlpha(1.0f);
                            }
                            String string2 = getString(R.string.paGenderOption5);
                            kotlin.jvm.internal.i.f(string2, "getString(R.string.paGenderOption5)");
                            this.f18008v = string2;
                            return;
                        }
                        ConstraintLayout constraintLayout17 = (ConstraintLayout) _$_findCachedViewById(R.id.paAssessmentGenderOption4);
                        if (constraintLayout17 != null) {
                            drawable10 = constraintLayout17.getBackground();
                        } else {
                            drawable10 = null;
                        }
                        if (drawable10 != null) {
                            drawable10.setAlpha(255);
                        }
                        AppCompatImageView appCompatImageView11 = (AppCompatImageView) _$_findCachedViewById(R.id.paAssessmentGenderOptionImage4);
                        if (appCompatImageView11 != null) {
                            appCompatImageView11.setAlpha(1.0f);
                        }
                        ConstraintLayout constraintLayout18 = (ConstraintLayout) _$_findCachedViewById(R.id.paAssessmentGenderOption4);
                        if (constraintLayout18 != null) {
                            Context requireContext9 = requireContext();
                            Object obj9 = g0.a.f16164a;
                            constraintLayout18.setBackground(a.c.b(requireContext9, R.drawable.background_stroke_2dp_blue_corner_12dp));
                        }
                        AppCompatImageView appCompatImageView12 = (AppCompatImageView) _$_findCachedViewById(R.id.paAssessmentGenderCta);
                        if (appCompatImageView12 != null) {
                            appCompatImageView12.setAlpha(1.0f);
                        }
                        String string3 = getString(R.string.paGenderOption4);
                        kotlin.jvm.internal.i.f(string3, "getString(R.string.paGenderOption4)");
                        this.f18008v = string3;
                        return;
                    }
                    ConstraintLayout constraintLayout19 = (ConstraintLayout) _$_findCachedViewById(R.id.paAssessmentGenderOption3);
                    if (constraintLayout19 != null) {
                        drawable9 = constraintLayout19.getBackground();
                    } else {
                        drawable9 = null;
                    }
                    if (drawable9 != null) {
                        drawable9.setAlpha(255);
                    }
                    AppCompatImageView appCompatImageView13 = (AppCompatImageView) _$_findCachedViewById(R.id.paAssessmentGenderOptionImage3);
                    if (appCompatImageView13 != null) {
                        appCompatImageView13.setAlpha(1.0f);
                    }
                    ConstraintLayout constraintLayout20 = (ConstraintLayout) _$_findCachedViewById(R.id.paAssessmentGenderOption3);
                    if (constraintLayout20 != null) {
                        Context requireContext10 = requireContext();
                        Object obj10 = g0.a.f16164a;
                        constraintLayout20.setBackground(a.c.b(requireContext10, R.drawable.background_stroke_2dp_blue_corner_12dp));
                    }
                    AppCompatImageView appCompatImageView14 = (AppCompatImageView) _$_findCachedViewById(R.id.paAssessmentGenderCta);
                    if (appCompatImageView14 != null) {
                        appCompatImageView14.setAlpha(1.0f);
                    }
                    String string4 = getString(R.string.paGenderOption3);
                    kotlin.jvm.internal.i.f(string4, "getString(R.string.paGenderOption3)");
                    this.f18008v = string4;
                    return;
                }
                ConstraintLayout constraintLayout21 = (ConstraintLayout) _$_findCachedViewById(R.id.paAssessmentGenderOption2);
                if (constraintLayout21 != null) {
                    drawable8 = constraintLayout21.getBackground();
                } else {
                    drawable8 = null;
                }
                if (drawable8 != null) {
                    drawable8.setAlpha(255);
                }
                AppCompatImageView appCompatImageView15 = (AppCompatImageView) _$_findCachedViewById(R.id.paAssessmentGenderOptionImage2);
                if (appCompatImageView15 != null) {
                    appCompatImageView15.setAlpha(1.0f);
                }
                ConstraintLayout constraintLayout22 = (ConstraintLayout) _$_findCachedViewById(R.id.paAssessmentGenderOption2);
                if (constraintLayout22 != null) {
                    Context requireContext11 = requireContext();
                    Object obj11 = g0.a.f16164a;
                    constraintLayout22.setBackground(a.c.b(requireContext11, R.drawable.background_stroke_2dp_blue_corner_12dp));
                }
                AppCompatImageView appCompatImageView16 = (AppCompatImageView) _$_findCachedViewById(R.id.paAssessmentGenderCta);
                if (appCompatImageView16 != null) {
                    appCompatImageView16.setAlpha(1.0f);
                }
                String string5 = getString(R.string.paGenderOption2);
                kotlin.jvm.internal.i.f(string5, "getString(R.string.paGenderOption2)");
                this.f18008v = string5;
                return;
            }
            ConstraintLayout constraintLayout23 = (ConstraintLayout) _$_findCachedViewById(R.id.paAssessmentGenderOption1);
            if (constraintLayout23 != null) {
                drawable7 = constraintLayout23.getBackground();
            } else {
                drawable7 = null;
            }
            if (drawable7 != null) {
                drawable7.setAlpha(255);
            }
            AppCompatImageView appCompatImageView17 = (AppCompatImageView) _$_findCachedViewById(R.id.paAssessmentGenderOptionImage1);
            if (appCompatImageView17 != null) {
                appCompatImageView17.setAlpha(1.0f);
            }
            ConstraintLayout constraintLayout24 = (ConstraintLayout) _$_findCachedViewById(R.id.paAssessmentGenderOption1);
            if (constraintLayout24 != null) {
                Context requireContext12 = requireContext();
                Object obj12 = g0.a.f16164a;
                constraintLayout24.setBackground(a.c.b(requireContext12, R.drawable.background_stroke_2dp_blue_corner_12dp));
            }
            AppCompatImageView appCompatImageView18 = (AppCompatImageView) _$_findCachedViewById(R.id.paAssessmentGenderCta);
            if (appCompatImageView18 != null) {
                appCompatImageView18.setAlpha(1.0f);
            }
            String string6 = getString(R.string.paGenderOption1);
            kotlin.jvm.internal.i.f(string6, "getString(R.string.paGenderOption1)");
            this.f18008v = string6;
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f18007u, e10);
        }
    }

    public final View _$_findCachedViewById(int i6) {
        View findViewById;
        LinkedHashMap linkedHashMap = this.f18009w;
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
        return inflater.inflate(R.layout.fragment_pa_assessment_gender, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.f18009w.clear();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        kotlin.jvm.internal.i.g(view, "view");
        super.onViewCreated(view, bundle);
        try {
            ConstraintLayout constraintLayout = (ConstraintLayout) _$_findCachedViewById(R.id.paAssessmentGenderOption1);
            if (constraintLayout != null) {
                constraintLayout.setOnClickListener(new View.OnClickListener(this) { // from class: ho.h

                    /* renamed from: v  reason: collision with root package name */
                    public final /* synthetic */ i f18005v;

                    {
                        this.f18005v = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        int i6 = r2;
                        i this$0 = this.f18005v;
                        switch (i6) {
                            case 0:
                                int i10 = i.f18006x;
                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                this$0.J(0);
                                return;
                            case 1:
                                int i11 = i.f18006x;
                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                this$0.J(1);
                                return;
                            case 2:
                                int i12 = i.f18006x;
                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                this$0.J(2);
                                return;
                            case 3:
                                int i13 = i.f18006x;
                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                this$0.J(3);
                                return;
                            case 4:
                                int i14 = i.f18006x;
                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                this$0.J(4);
                                return;
                            case 5:
                                int i15 = i.f18006x;
                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                this$0.J(5);
                                return;
                            default:
                                int i16 = i.f18006x;
                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                if (!kotlin.jvm.internal.i.b(this$0.f18008v, "")) {
                                    JSONObject jSONObject = new JSONObject();
                                    jSONObject.put("question", this$0.getString(R.string.paGenderQues));
                                    jSONObject.put("type", "singleselect");
                                    jSONObject.put("options", new JSONArray(new String[]{this$0.f18008v}));
                                    androidx.fragment.app.p activity = this$0.getActivity();
                                    kotlin.jvm.internal.i.e(activity, "null cannot be cast to non-null type com.theinnerhour.b2b.components.pro.assessment.activity.ProInitialAssessmentActivity");
                                    ((ProInitialAssessmentActivity) activity).v0(jSONObject);
                                    return;
                                }
                                return;
                        }
                    }
                });
            }
            ConstraintLayout constraintLayout2 = (ConstraintLayout) _$_findCachedViewById(R.id.paAssessmentGenderOption2);
            if (constraintLayout2 != null) {
                constraintLayout2.setOnClickListener(new View.OnClickListener(this) { // from class: ho.h

                    /* renamed from: v  reason: collision with root package name */
                    public final /* synthetic */ i f18005v;

                    {
                        this.f18005v = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        int i6 = r2;
                        i this$0 = this.f18005v;
                        switch (i6) {
                            case 0:
                                int i10 = i.f18006x;
                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                this$0.J(0);
                                return;
                            case 1:
                                int i11 = i.f18006x;
                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                this$0.J(1);
                                return;
                            case 2:
                                int i12 = i.f18006x;
                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                this$0.J(2);
                                return;
                            case 3:
                                int i13 = i.f18006x;
                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                this$0.J(3);
                                return;
                            case 4:
                                int i14 = i.f18006x;
                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                this$0.J(4);
                                return;
                            case 5:
                                int i15 = i.f18006x;
                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                this$0.J(5);
                                return;
                            default:
                                int i16 = i.f18006x;
                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                if (!kotlin.jvm.internal.i.b(this$0.f18008v, "")) {
                                    JSONObject jSONObject = new JSONObject();
                                    jSONObject.put("question", this$0.getString(R.string.paGenderQues));
                                    jSONObject.put("type", "singleselect");
                                    jSONObject.put("options", new JSONArray(new String[]{this$0.f18008v}));
                                    androidx.fragment.app.p activity = this$0.getActivity();
                                    kotlin.jvm.internal.i.e(activity, "null cannot be cast to non-null type com.theinnerhour.b2b.components.pro.assessment.activity.ProInitialAssessmentActivity");
                                    ((ProInitialAssessmentActivity) activity).v0(jSONObject);
                                    return;
                                }
                                return;
                        }
                    }
                });
            }
            ConstraintLayout constraintLayout3 = (ConstraintLayout) _$_findCachedViewById(R.id.paAssessmentGenderOption3);
            if (constraintLayout3 != null) {
                constraintLayout3.setOnClickListener(new View.OnClickListener(this) { // from class: ho.h

                    /* renamed from: v  reason: collision with root package name */
                    public final /* synthetic */ i f18005v;

                    {
                        this.f18005v = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        int i6 = r2;
                        i this$0 = this.f18005v;
                        switch (i6) {
                            case 0:
                                int i10 = i.f18006x;
                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                this$0.J(0);
                                return;
                            case 1:
                                int i11 = i.f18006x;
                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                this$0.J(1);
                                return;
                            case 2:
                                int i12 = i.f18006x;
                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                this$0.J(2);
                                return;
                            case 3:
                                int i13 = i.f18006x;
                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                this$0.J(3);
                                return;
                            case 4:
                                int i14 = i.f18006x;
                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                this$0.J(4);
                                return;
                            case 5:
                                int i15 = i.f18006x;
                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                this$0.J(5);
                                return;
                            default:
                                int i16 = i.f18006x;
                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                if (!kotlin.jvm.internal.i.b(this$0.f18008v, "")) {
                                    JSONObject jSONObject = new JSONObject();
                                    jSONObject.put("question", this$0.getString(R.string.paGenderQues));
                                    jSONObject.put("type", "singleselect");
                                    jSONObject.put("options", new JSONArray(new String[]{this$0.f18008v}));
                                    androidx.fragment.app.p activity = this$0.getActivity();
                                    kotlin.jvm.internal.i.e(activity, "null cannot be cast to non-null type com.theinnerhour.b2b.components.pro.assessment.activity.ProInitialAssessmentActivity");
                                    ((ProInitialAssessmentActivity) activity).v0(jSONObject);
                                    return;
                                }
                                return;
                        }
                    }
                });
            }
            ConstraintLayout constraintLayout4 = (ConstraintLayout) _$_findCachedViewById(R.id.paAssessmentGenderOption4);
            if (constraintLayout4 != null) {
                constraintLayout4.setOnClickListener(new View.OnClickListener(this) { // from class: ho.h

                    /* renamed from: v  reason: collision with root package name */
                    public final /* synthetic */ i f18005v;

                    {
                        this.f18005v = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        int i6 = r2;
                        i this$0 = this.f18005v;
                        switch (i6) {
                            case 0:
                                int i10 = i.f18006x;
                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                this$0.J(0);
                                return;
                            case 1:
                                int i11 = i.f18006x;
                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                this$0.J(1);
                                return;
                            case 2:
                                int i12 = i.f18006x;
                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                this$0.J(2);
                                return;
                            case 3:
                                int i13 = i.f18006x;
                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                this$0.J(3);
                                return;
                            case 4:
                                int i14 = i.f18006x;
                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                this$0.J(4);
                                return;
                            case 5:
                                int i15 = i.f18006x;
                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                this$0.J(5);
                                return;
                            default:
                                int i16 = i.f18006x;
                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                if (!kotlin.jvm.internal.i.b(this$0.f18008v, "")) {
                                    JSONObject jSONObject = new JSONObject();
                                    jSONObject.put("question", this$0.getString(R.string.paGenderQues));
                                    jSONObject.put("type", "singleselect");
                                    jSONObject.put("options", new JSONArray(new String[]{this$0.f18008v}));
                                    androidx.fragment.app.p activity = this$0.getActivity();
                                    kotlin.jvm.internal.i.e(activity, "null cannot be cast to non-null type com.theinnerhour.b2b.components.pro.assessment.activity.ProInitialAssessmentActivity");
                                    ((ProInitialAssessmentActivity) activity).v0(jSONObject);
                                    return;
                                }
                                return;
                        }
                    }
                });
            }
            ConstraintLayout constraintLayout5 = (ConstraintLayout) _$_findCachedViewById(R.id.paAssessmentGenderOption5);
            if (constraintLayout5 != null) {
                constraintLayout5.setOnClickListener(new View.OnClickListener(this) { // from class: ho.h

                    /* renamed from: v  reason: collision with root package name */
                    public final /* synthetic */ i f18005v;

                    {
                        this.f18005v = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        int i6 = r2;
                        i this$0 = this.f18005v;
                        switch (i6) {
                            case 0:
                                int i10 = i.f18006x;
                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                this$0.J(0);
                                return;
                            case 1:
                                int i11 = i.f18006x;
                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                this$0.J(1);
                                return;
                            case 2:
                                int i12 = i.f18006x;
                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                this$0.J(2);
                                return;
                            case 3:
                                int i13 = i.f18006x;
                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                this$0.J(3);
                                return;
                            case 4:
                                int i14 = i.f18006x;
                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                this$0.J(4);
                                return;
                            case 5:
                                int i15 = i.f18006x;
                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                this$0.J(5);
                                return;
                            default:
                                int i16 = i.f18006x;
                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                if (!kotlin.jvm.internal.i.b(this$0.f18008v, "")) {
                                    JSONObject jSONObject = new JSONObject();
                                    jSONObject.put("question", this$0.getString(R.string.paGenderQues));
                                    jSONObject.put("type", "singleselect");
                                    jSONObject.put("options", new JSONArray(new String[]{this$0.f18008v}));
                                    androidx.fragment.app.p activity = this$0.getActivity();
                                    kotlin.jvm.internal.i.e(activity, "null cannot be cast to non-null type com.theinnerhour.b2b.components.pro.assessment.activity.ProInitialAssessmentActivity");
                                    ((ProInitialAssessmentActivity) activity).v0(jSONObject);
                                    return;
                                }
                                return;
                        }
                    }
                });
            }
            ConstraintLayout constraintLayout6 = (ConstraintLayout) _$_findCachedViewById(R.id.paAssessmentGenderOption6);
            if (constraintLayout6 != null) {
                constraintLayout6.setOnClickListener(new View.OnClickListener(this) { // from class: ho.h

                    /* renamed from: v  reason: collision with root package name */
                    public final /* synthetic */ i f18005v;

                    {
                        this.f18005v = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        int i6 = r2;
                        i this$0 = this.f18005v;
                        switch (i6) {
                            case 0:
                                int i10 = i.f18006x;
                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                this$0.J(0);
                                return;
                            case 1:
                                int i11 = i.f18006x;
                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                this$0.J(1);
                                return;
                            case 2:
                                int i12 = i.f18006x;
                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                this$0.J(2);
                                return;
                            case 3:
                                int i13 = i.f18006x;
                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                this$0.J(3);
                                return;
                            case 4:
                                int i14 = i.f18006x;
                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                this$0.J(4);
                                return;
                            case 5:
                                int i15 = i.f18006x;
                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                this$0.J(5);
                                return;
                            default:
                                int i16 = i.f18006x;
                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                if (!kotlin.jvm.internal.i.b(this$0.f18008v, "")) {
                                    JSONObject jSONObject = new JSONObject();
                                    jSONObject.put("question", this$0.getString(R.string.paGenderQues));
                                    jSONObject.put("type", "singleselect");
                                    jSONObject.put("options", new JSONArray(new String[]{this$0.f18008v}));
                                    androidx.fragment.app.p activity = this$0.getActivity();
                                    kotlin.jvm.internal.i.e(activity, "null cannot be cast to non-null type com.theinnerhour.b2b.components.pro.assessment.activity.ProInitialAssessmentActivity");
                                    ((ProInitialAssessmentActivity) activity).v0(jSONObject);
                                    return;
                                }
                                return;
                        }
                    }
                });
            }
            AppCompatImageView appCompatImageView = (AppCompatImageView) _$_findCachedViewById(R.id.paAssessmentGenderCta);
            if (appCompatImageView != null) {
                appCompatImageView.setOnClickListener(new View.OnClickListener(this) { // from class: ho.h

                    /* renamed from: v  reason: collision with root package name */
                    public final /* synthetic */ i f18005v;

                    {
                        this.f18005v = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        int i6 = r2;
                        i this$0 = this.f18005v;
                        switch (i6) {
                            case 0:
                                int i10 = i.f18006x;
                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                this$0.J(0);
                                return;
                            case 1:
                                int i11 = i.f18006x;
                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                this$0.J(1);
                                return;
                            case 2:
                                int i12 = i.f18006x;
                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                this$0.J(2);
                                return;
                            case 3:
                                int i13 = i.f18006x;
                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                this$0.J(3);
                                return;
                            case 4:
                                int i14 = i.f18006x;
                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                this$0.J(4);
                                return;
                            case 5:
                                int i15 = i.f18006x;
                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                this$0.J(5);
                                return;
                            default:
                                int i16 = i.f18006x;
                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                if (!kotlin.jvm.internal.i.b(this$0.f18008v, "")) {
                                    JSONObject jSONObject = new JSONObject();
                                    jSONObject.put("question", this$0.getString(R.string.paGenderQues));
                                    jSONObject.put("type", "singleselect");
                                    jSONObject.put("options", new JSONArray(new String[]{this$0.f18008v}));
                                    androidx.fragment.app.p activity = this$0.getActivity();
                                    kotlin.jvm.internal.i.e(activity, "null cannot be cast to non-null type com.theinnerhour.b2b.components.pro.assessment.activity.ProInitialAssessmentActivity");
                                    ((ProInitialAssessmentActivity) activity).v0(jSONObject);
                                    return;
                                }
                                return;
                        }
                    }
                });
            }
            J(-1);
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f18007u, e10);
        }
    }
}
