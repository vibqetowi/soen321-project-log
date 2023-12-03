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
/* compiled from: ProAssessmentRelationshipFragment.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lho/r;", "Lrr/b;", "<init>", "()V", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class r extends rr.b {

    /* renamed from: x  reason: collision with root package name */
    public static final /* synthetic */ int f18044x = 0;

    /* renamed from: v  reason: collision with root package name */
    public String f18046v;

    /* renamed from: w  reason: collision with root package name */
    public final LinkedHashMap f18047w = new LinkedHashMap();

    /* renamed from: u  reason: collision with root package name */
    public final String f18045u = LogHelper.INSTANCE.makeLogTag(r.class);

    public final void J(int i6) {
        Drawable drawable;
        Drawable drawable2;
        Drawable drawable3;
        Drawable drawable4;
        try {
            ConstraintLayout constraintLayout = (ConstraintLayout) _$_findCachedViewById(R.id.paAssessmentRelationshipOption1);
            if (constraintLayout != null) {
                Context requireContext = requireContext();
                Object obj = g0.a.f16164a;
                constraintLayout.setBackground(a.c.b(requireContext, R.drawable.background_stroke_blue_corner_12dp));
            }
            ConstraintLayout constraintLayout2 = (ConstraintLayout) _$_findCachedViewById(R.id.paAssessmentRelationshipOption1);
            Drawable drawable5 = null;
            if (constraintLayout2 != null) {
                drawable = constraintLayout2.getBackground();
            } else {
                drawable = null;
            }
            if (drawable != null) {
                drawable.setAlpha(51);
            }
            AppCompatImageView appCompatImageView = (AppCompatImageView) _$_findCachedViewById(R.id.paAssessmentRelationshipOptionImage1);
            if (appCompatImageView != null) {
                appCompatImageView.setAlpha(0.2f);
            }
            ConstraintLayout constraintLayout3 = (ConstraintLayout) _$_findCachedViewById(R.id.paAssessmentRelationshipOption2);
            if (constraintLayout3 != null) {
                Context requireContext2 = requireContext();
                Object obj2 = g0.a.f16164a;
                constraintLayout3.setBackground(a.c.b(requireContext2, R.drawable.background_stroke_blue_corner_12dp));
            }
            ConstraintLayout constraintLayout4 = (ConstraintLayout) _$_findCachedViewById(R.id.paAssessmentRelationshipOption2);
            if (constraintLayout4 != null) {
                drawable2 = constraintLayout4.getBackground();
            } else {
                drawable2 = null;
            }
            if (drawable2 != null) {
                drawable2.setAlpha(51);
            }
            AppCompatImageView appCompatImageView2 = (AppCompatImageView) _$_findCachedViewById(R.id.paAssessmentRelationshipOptionImage2);
            if (appCompatImageView2 != null) {
                appCompatImageView2.setAlpha(0.2f);
            }
            ConstraintLayout constraintLayout5 = (ConstraintLayout) _$_findCachedViewById(R.id.paAssessmentRelationshipOption3);
            if (constraintLayout5 != null) {
                Context requireContext3 = requireContext();
                Object obj3 = g0.a.f16164a;
                constraintLayout5.setBackground(a.c.b(requireContext3, R.drawable.background_stroke_blue_corner_12dp));
            }
            ConstraintLayout constraintLayout6 = (ConstraintLayout) _$_findCachedViewById(R.id.paAssessmentRelationshipOption3);
            if (constraintLayout6 != null) {
                drawable3 = constraintLayout6.getBackground();
            } else {
                drawable3 = null;
            }
            if (drawable3 != null) {
                drawable3.setAlpha(51);
            }
            AppCompatImageView appCompatImageView3 = (AppCompatImageView) _$_findCachedViewById(R.id.paAssessmentRelationshipOptionImage3);
            if (appCompatImageView3 != null) {
                appCompatImageView3.setAlpha(0.2f);
            }
            ConstraintLayout constraintLayout7 = (ConstraintLayout) _$_findCachedViewById(R.id.paAssessmentRelationshipOption4);
            if (constraintLayout7 != null) {
                Context requireContext4 = requireContext();
                Object obj4 = g0.a.f16164a;
                constraintLayout7.setBackground(a.c.b(requireContext4, R.drawable.background_stroke_blue_corner_12dp));
            }
            ConstraintLayout constraintLayout8 = (ConstraintLayout) _$_findCachedViewById(R.id.paAssessmentRelationshipOption4);
            if (constraintLayout8 != null) {
                drawable4 = constraintLayout8.getBackground();
            } else {
                drawable4 = null;
            }
            if (drawable4 != null) {
                drawable4.setAlpha(51);
            }
            AppCompatImageView appCompatImageView4 = (AppCompatImageView) _$_findCachedViewById(R.id.paAssessmentRelationshipOptionImage4);
            if (appCompatImageView4 != null) {
                appCompatImageView4.setAlpha(0.2f);
            }
            if (i6 != 0) {
                if (i6 != 1) {
                    if (i6 != 2) {
                        if (i6 == 3) {
                            ConstraintLayout constraintLayout9 = (ConstraintLayout) _$_findCachedViewById(R.id.paAssessmentRelationshipOption4);
                            if (constraintLayout9 != null) {
                                drawable5 = constraintLayout9.getBackground();
                            }
                            if (drawable5 != null) {
                                drawable5.setAlpha(255);
                            }
                            AppCompatImageView appCompatImageView5 = (AppCompatImageView) _$_findCachedViewById(R.id.paAssessmentRelationshipOptionImage4);
                            if (appCompatImageView5 != null) {
                                appCompatImageView5.setAlpha(1.0f);
                            }
                            ConstraintLayout constraintLayout10 = (ConstraintLayout) _$_findCachedViewById(R.id.paAssessmentRelationshipOption4);
                            if (constraintLayout10 != null) {
                                Context requireContext5 = requireContext();
                                Object obj5 = g0.a.f16164a;
                                constraintLayout10.setBackground(a.c.b(requireContext5, R.drawable.background_stroke_2dp_blue_corner_12dp));
                            }
                            this.f18046v = getString(R.string.paRelationshipOption4);
                            AppCompatImageView appCompatImageView6 = (AppCompatImageView) _$_findCachedViewById(R.id.paAssessmentRelationshipCta);
                            if (appCompatImageView6 != null) {
                                appCompatImageView6.setAlpha(1.0f);
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    ConstraintLayout constraintLayout11 = (ConstraintLayout) _$_findCachedViewById(R.id.paAssessmentRelationshipOption3);
                    if (constraintLayout11 != null) {
                        drawable5 = constraintLayout11.getBackground();
                    }
                    if (drawable5 != null) {
                        drawable5.setAlpha(255);
                    }
                    AppCompatImageView appCompatImageView7 = (AppCompatImageView) _$_findCachedViewById(R.id.paAssessmentRelationshipOptionImage3);
                    if (appCompatImageView7 != null) {
                        appCompatImageView7.setAlpha(1.0f);
                    }
                    ConstraintLayout constraintLayout12 = (ConstraintLayout) _$_findCachedViewById(R.id.paAssessmentRelationshipOption3);
                    if (constraintLayout12 != null) {
                        Context requireContext6 = requireContext();
                        Object obj6 = g0.a.f16164a;
                        constraintLayout12.setBackground(a.c.b(requireContext6, R.drawable.background_stroke_2dp_blue_corner_12dp));
                    }
                    this.f18046v = getString(R.string.paRelationshipOption3);
                    AppCompatImageView appCompatImageView8 = (AppCompatImageView) _$_findCachedViewById(R.id.paAssessmentRelationshipCta);
                    if (appCompatImageView8 != null) {
                        appCompatImageView8.setAlpha(1.0f);
                        return;
                    }
                    return;
                }
                ConstraintLayout constraintLayout13 = (ConstraintLayout) _$_findCachedViewById(R.id.paAssessmentRelationshipOption2);
                if (constraintLayout13 != null) {
                    drawable5 = constraintLayout13.getBackground();
                }
                if (drawable5 != null) {
                    drawable5.setAlpha(255);
                }
                AppCompatImageView appCompatImageView9 = (AppCompatImageView) _$_findCachedViewById(R.id.paAssessmentRelationshipOptionImage2);
                if (appCompatImageView9 != null) {
                    appCompatImageView9.setAlpha(1.0f);
                }
                ConstraintLayout constraintLayout14 = (ConstraintLayout) _$_findCachedViewById(R.id.paAssessmentRelationshipOption2);
                if (constraintLayout14 != null) {
                    Context requireContext7 = requireContext();
                    Object obj7 = g0.a.f16164a;
                    constraintLayout14.setBackground(a.c.b(requireContext7, R.drawable.background_stroke_2dp_blue_corner_12dp));
                }
                this.f18046v = getString(R.string.paRelationshipOption2);
                AppCompatImageView appCompatImageView10 = (AppCompatImageView) _$_findCachedViewById(R.id.paAssessmentRelationshipCta);
                if (appCompatImageView10 != null) {
                    appCompatImageView10.setAlpha(1.0f);
                    return;
                }
                return;
            }
            ConstraintLayout constraintLayout15 = (ConstraintLayout) _$_findCachedViewById(R.id.paAssessmentRelationshipOption1);
            if (constraintLayout15 != null) {
                drawable5 = constraintLayout15.getBackground();
            }
            if (drawable5 != null) {
                drawable5.setAlpha(255);
            }
            AppCompatImageView appCompatImageView11 = (AppCompatImageView) _$_findCachedViewById(R.id.paAssessmentRelationshipOptionImage1);
            if (appCompatImageView11 != null) {
                appCompatImageView11.setAlpha(1.0f);
            }
            ConstraintLayout constraintLayout16 = (ConstraintLayout) _$_findCachedViewById(R.id.paAssessmentRelationshipOption1);
            if (constraintLayout16 != null) {
                Context requireContext8 = requireContext();
                Object obj8 = g0.a.f16164a;
                constraintLayout16.setBackground(a.c.b(requireContext8, R.drawable.background_stroke_2dp_blue_corner_12dp));
            }
            this.f18046v = getString(R.string.paRelationshipOption1);
            AppCompatImageView appCompatImageView12 = (AppCompatImageView) _$_findCachedViewById(R.id.paAssessmentRelationshipCta);
            if (appCompatImageView12 != null) {
                appCompatImageView12.setAlpha(1.0f);
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f18045u, e10);
        }
    }

    public final View _$_findCachedViewById(int i6) {
        View findViewById;
        LinkedHashMap linkedHashMap = this.f18047w;
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
        return inflater.inflate(R.layout.fragment_pa_assessment_relationship, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.f18047w.clear();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        kotlin.jvm.internal.i.g(view, "view");
        super.onViewCreated(view, bundle);
        try {
            ConstraintLayout constraintLayout = (ConstraintLayout) _$_findCachedViewById(R.id.paAssessmentRelationshipOption1);
            if (constraintLayout != null) {
                constraintLayout.setOnClickListener(new View.OnClickListener(this) { // from class: ho.q

                    /* renamed from: v  reason: collision with root package name */
                    public final /* synthetic */ r f18043v;

                    {
                        this.f18043v = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        int i6 = r2;
                        r this$0 = this.f18043v;
                        switch (i6) {
                            case 0:
                                int i10 = r.f18044x;
                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                this$0.J(0);
                                return;
                            case 1:
                                int i11 = r.f18044x;
                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                this$0.J(1);
                                return;
                            case 2:
                                int i12 = r.f18044x;
                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                this$0.J(2);
                                return;
                            case 3:
                                int i13 = r.f18044x;
                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                this$0.J(3);
                                return;
                            default:
                                int i14 = r.f18044x;
                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                if (this$0.f18046v != null) {
                                    JSONObject jSONObject = new JSONObject();
                                    jSONObject.put("question", this$0.getString(R.string.paRelationshipQues));
                                    jSONObject.put("type", "singleselect");
                                    jSONObject.put("options", new JSONArray(new String[]{this$0.f18046v}));
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
            ConstraintLayout constraintLayout2 = (ConstraintLayout) _$_findCachedViewById(R.id.paAssessmentRelationshipOption2);
            if (constraintLayout2 != null) {
                constraintLayout2.setOnClickListener(new View.OnClickListener(this) { // from class: ho.q

                    /* renamed from: v  reason: collision with root package name */
                    public final /* synthetic */ r f18043v;

                    {
                        this.f18043v = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        int i6 = r2;
                        r this$0 = this.f18043v;
                        switch (i6) {
                            case 0:
                                int i10 = r.f18044x;
                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                this$0.J(0);
                                return;
                            case 1:
                                int i11 = r.f18044x;
                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                this$0.J(1);
                                return;
                            case 2:
                                int i12 = r.f18044x;
                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                this$0.J(2);
                                return;
                            case 3:
                                int i13 = r.f18044x;
                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                this$0.J(3);
                                return;
                            default:
                                int i14 = r.f18044x;
                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                if (this$0.f18046v != null) {
                                    JSONObject jSONObject = new JSONObject();
                                    jSONObject.put("question", this$0.getString(R.string.paRelationshipQues));
                                    jSONObject.put("type", "singleselect");
                                    jSONObject.put("options", new JSONArray(new String[]{this$0.f18046v}));
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
            ConstraintLayout constraintLayout3 = (ConstraintLayout) _$_findCachedViewById(R.id.paAssessmentRelationshipOption3);
            if (constraintLayout3 != null) {
                constraintLayout3.setOnClickListener(new View.OnClickListener(this) { // from class: ho.q

                    /* renamed from: v  reason: collision with root package name */
                    public final /* synthetic */ r f18043v;

                    {
                        this.f18043v = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        int i6 = r2;
                        r this$0 = this.f18043v;
                        switch (i6) {
                            case 0:
                                int i10 = r.f18044x;
                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                this$0.J(0);
                                return;
                            case 1:
                                int i11 = r.f18044x;
                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                this$0.J(1);
                                return;
                            case 2:
                                int i12 = r.f18044x;
                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                this$0.J(2);
                                return;
                            case 3:
                                int i13 = r.f18044x;
                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                this$0.J(3);
                                return;
                            default:
                                int i14 = r.f18044x;
                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                if (this$0.f18046v != null) {
                                    JSONObject jSONObject = new JSONObject();
                                    jSONObject.put("question", this$0.getString(R.string.paRelationshipQues));
                                    jSONObject.put("type", "singleselect");
                                    jSONObject.put("options", new JSONArray(new String[]{this$0.f18046v}));
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
            ConstraintLayout constraintLayout4 = (ConstraintLayout) _$_findCachedViewById(R.id.paAssessmentRelationshipOption4);
            if (constraintLayout4 != null) {
                constraintLayout4.setOnClickListener(new View.OnClickListener(this) { // from class: ho.q

                    /* renamed from: v  reason: collision with root package name */
                    public final /* synthetic */ r f18043v;

                    {
                        this.f18043v = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        int i6 = r2;
                        r this$0 = this.f18043v;
                        switch (i6) {
                            case 0:
                                int i10 = r.f18044x;
                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                this$0.J(0);
                                return;
                            case 1:
                                int i11 = r.f18044x;
                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                this$0.J(1);
                                return;
                            case 2:
                                int i12 = r.f18044x;
                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                this$0.J(2);
                                return;
                            case 3:
                                int i13 = r.f18044x;
                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                this$0.J(3);
                                return;
                            default:
                                int i14 = r.f18044x;
                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                if (this$0.f18046v != null) {
                                    JSONObject jSONObject = new JSONObject();
                                    jSONObject.put("question", this$0.getString(R.string.paRelationshipQues));
                                    jSONObject.put("type", "singleselect");
                                    jSONObject.put("options", new JSONArray(new String[]{this$0.f18046v}));
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
            AppCompatImageView appCompatImageView = (AppCompatImageView) _$_findCachedViewById(R.id.paAssessmentRelationshipCta);
            if (appCompatImageView != null) {
                appCompatImageView.setOnClickListener(new View.OnClickListener(this) { // from class: ho.q

                    /* renamed from: v  reason: collision with root package name */
                    public final /* synthetic */ r f18043v;

                    {
                        this.f18043v = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        int i6 = r2;
                        r this$0 = this.f18043v;
                        switch (i6) {
                            case 0:
                                int i10 = r.f18044x;
                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                this$0.J(0);
                                return;
                            case 1:
                                int i11 = r.f18044x;
                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                this$0.J(1);
                                return;
                            case 2:
                                int i12 = r.f18044x;
                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                this$0.J(2);
                                return;
                            case 3:
                                int i13 = r.f18044x;
                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                this$0.J(3);
                                return;
                            default:
                                int i14 = r.f18044x;
                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                if (this$0.f18046v != null) {
                                    JSONObject jSONObject = new JSONObject();
                                    jSONObject.put("question", this$0.getString(R.string.paRelationshipQues));
                                    jSONObject.put("type", "singleselect");
                                    jSONObject.put("options", new JSONArray(new String[]{this$0.f18046v}));
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
            LogHelper.INSTANCE.e(this.f18045u, e10);
        }
    }
}
