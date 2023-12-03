package hr;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Toast;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.activity.TemplateActivity;
import com.theinnerhour.b2b.model.ContentFeedbackModel;
import com.theinnerhour.b2b.model.CourseDayModelV1;
import com.theinnerhour.b2b.persistence.ApplicationPersistence;
import com.theinnerhour.b2b.persistence.FirebasePersistence;
import com.theinnerhour.b2b.utils.Constants;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.utils.UtilFunKt;
import com.theinnerhour.b2b.widgets.RobertoButton;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import java.io.Serializable;
import java.util.HashMap;
import java.util.LinkedHashMap;
import kotlin.Metadata;
/* compiled from: ScreenS32Fragment.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lhr/j7;", "Lrr/b;", "<init>", "()V", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class j7 extends rr.b {

    /* renamed from: w  reason: collision with root package name */
    public static final /* synthetic */ int f18629w = 0;

    /* renamed from: v  reason: collision with root package name */
    public final LinkedHashMap f18631v = new LinkedHashMap();

    /* renamed from: u  reason: collision with root package name */
    public final String f18630u = LogHelper.INSTANCE.makeLogTag("ScreenS32Fragment");

    public final void J(int i6, String str) {
        try {
            Bundle extras = requireActivity().getIntent().getExtras();
            kotlin.jvm.internal.i.d(extras);
            Serializable serializable = extras.getSerializable("day_plan");
            kotlin.jvm.internal.i.e(serializable, "null cannot be cast to non-null type com.theinnerhour.b2b.model.CourseDayModelV1");
            CourseDayModelV1 courseDayModelV1 = (CourseDayModelV1) serializable;
            ContentFeedbackModel contentFeedbackModel = new ContentFeedbackModel();
            contentFeedbackModel.setContent_id(courseDayModelV1.getContent_id());
            contentFeedbackModel.setTags(courseDayModelV1.getTags());
            contentFeedbackModel.setFeedback_type(str);
            contentFeedbackModel.setExtra_weight(i6);
            FirebasePersistence.getInstance().pushContentFeedback(contentFeedbackModel);
            androidx.fragment.app.p activity = getActivity();
            kotlin.jvm.internal.i.e(activity, "null cannot be cast to non-null type com.theinnerhour.b2b.widgets.CustomActivity");
            ((rr.a) activity).t0();
        } catch (Exception unused) {
            LogHelper.INSTANCE.e(this.f18630u, "exception in senddin");
        }
    }

    public final View _$_findCachedViewById(int i6) {
        View findViewById;
        LinkedHashMap linkedHashMap = this.f18631v;
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
        return inflater.inflate(R.layout.fragment_screen_s32, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.f18631v.clear();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        kotlin.jvm.internal.i.g(view, "view");
        super.onViewCreated(view, bundle);
        try {
            androidx.fragment.app.p activity = getActivity();
            kotlin.jvm.internal.i.e(activity, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
            final TemplateActivity templateActivity = (TemplateActivity) activity;
            HashMap<String, Object> A0 = templateActivity.A0();
            ((RobertoTextView) _$_findCachedViewById(R.id.textView2)).setText(UtilFunKt.paramsMapToString(A0.get("s32_title")));
            ((RobertoTextView) _$_findCachedViewById(R.id.textView3)).setText(UtilFunKt.paramsMapToString(A0.get("s32_question")));
            ((RobertoButton) _$_findCachedViewById(R.id.feedback_yes)).setText(UtilFunKt.paramsMapToString(A0.get("s32_btn_one_text")));
            ((RobertoButton) _$_findCachedViewById(R.id.feedback_no)).setText(UtilFunKt.paramsMapToString(A0.get("s32_btn_two_text")));
            final Bundle bundle2 = new Bundle();
            if (!kotlin.jvm.internal.i.b(templateActivity.M, "")) {
                bundle2.putString("miniCourse", templateActivity.M);
            }
            bundle2.putString("course", FirebasePersistence.getInstance().getUser().getCurrentCourseName());
            CourseDayModelV1 courseDayModelV1 = templateActivity.H;
            kotlin.jvm.internal.i.d(courseDayModelV1);
            bundle2.putString(Constants.API_COURSE_LINK, courseDayModelV1.getContent_label());
            CourseDayModelV1 courseDayModelV12 = templateActivity.H;
            kotlin.jvm.internal.i.d(courseDayModelV12);
            bundle2.putString("day", String.valueOf(courseDayModelV12.getPosition()));
            bundle2.putString("version", FirebasePersistence.getInstance().getUser().getVersion());
            bundle2.putBoolean("dynamicV1", false);
            ((RobertoButton) _$_findCachedViewById(R.id.feedback_yes)).setOnClickListener(new View.OnClickListener() { // from class: hr.i7
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    int i6;
                    int i10 = r4;
                    boolean z10 = true;
                    Bundle analyticsBundle = bundle2;
                    j7 this$0 = this;
                    TemplateActivity act = templateActivity;
                    switch (i10) {
                        case 0:
                            int i11 = j7.f18629w;
                            kotlin.jvm.internal.i.g(act, "$act");
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            kotlin.jvm.internal.i.g(analyticsBundle, "$analyticsBundle");
                            act.E = true;
                            this$0.J(10, "positive");
                            ApplicationPersistence applicationPersistence = ApplicationPersistence.getInstance();
                            if (!applicationPersistence.getBooleanValue(Constants.PLAY_STORE_FEEDBACK_GIVEN, false)) {
                                int intValue = applicationPersistence.getIntValue(Constants.MAIN_ACTIVITIES_FEEDBACK_COUNTER, 0) + 1;
                                applicationPersistence.setIntValue(Constants.MAIN_ACTIVITIES_FEEDBACK_COUNTER, intValue);
                                if (ca.a.k(2).contains(Integer.valueOf(intValue))) {
                                    applicationPersistence.setBooleanValue(Constants.NOT_V4_SHOW_FEEDBACK, true);
                                }
                            }
                            gk.a.b(analyticsBundle, "s32_yes_click");
                            Toast.makeText(this$0.requireContext(), this$0.getString(R.string.feedback_yes), 0).show();
                            return;
                        default:
                            int i12 = j7.f18629w;
                            kotlin.jvm.internal.i.g(act, "$act");
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            kotlin.jvm.internal.i.g(analyticsBundle, "$analyticsBundle");
                            act.E = false;
                            this$0.J(-5, "negative");
                            gk.a.b(analyticsBundle, "s32_no_click");
                            Context requireContext = this$0.requireContext();
                            Intent intent = act.getIntent();
                            if ((intent == null || !intent.getBooleanExtra("showAltFeedback", false)) ? false : false) {
                                i6 = R.string.feedback_no_alt;
                            } else {
                                i6 = R.string.feedback_no;
                            }
                            Toast.makeText(requireContext, i6, 0).show();
                            return;
                    }
                }
            });
            ((RobertoButton) _$_findCachedViewById(R.id.feedback_no)).setOnClickListener(new View.OnClickListener() { // from class: hr.i7
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    int i6;
                    int i10 = r4;
                    boolean z10 = true;
                    Bundle analyticsBundle = bundle2;
                    j7 this$0 = this;
                    TemplateActivity act = templateActivity;
                    switch (i10) {
                        case 0:
                            int i11 = j7.f18629w;
                            kotlin.jvm.internal.i.g(act, "$act");
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            kotlin.jvm.internal.i.g(analyticsBundle, "$analyticsBundle");
                            act.E = true;
                            this$0.J(10, "positive");
                            ApplicationPersistence applicationPersistence = ApplicationPersistence.getInstance();
                            if (!applicationPersistence.getBooleanValue(Constants.PLAY_STORE_FEEDBACK_GIVEN, false)) {
                                int intValue = applicationPersistence.getIntValue(Constants.MAIN_ACTIVITIES_FEEDBACK_COUNTER, 0) + 1;
                                applicationPersistence.setIntValue(Constants.MAIN_ACTIVITIES_FEEDBACK_COUNTER, intValue);
                                if (ca.a.k(2).contains(Integer.valueOf(intValue))) {
                                    applicationPersistence.setBooleanValue(Constants.NOT_V4_SHOW_FEEDBACK, true);
                                }
                            }
                            gk.a.b(analyticsBundle, "s32_yes_click");
                            Toast.makeText(this$0.requireContext(), this$0.getString(R.string.feedback_yes), 0).show();
                            return;
                        default:
                            int i12 = j7.f18629w;
                            kotlin.jvm.internal.i.g(act, "$act");
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            kotlin.jvm.internal.i.g(analyticsBundle, "$analyticsBundle");
                            act.E = false;
                            this$0.J(-5, "negative");
                            gk.a.b(analyticsBundle, "s32_no_click");
                            Context requireContext = this$0.requireContext();
                            Intent intent = act.getIntent();
                            if ((intent == null || !intent.getBooleanExtra("showAltFeedback", false)) ? false : false) {
                                i6 = R.string.feedback_no_alt;
                            } else {
                                i6 = R.string.feedback_no;
                            }
                            Toast.makeText(requireContext, i6, 0).show();
                            return;
                    }
                }
            });
            ((ImageView) _$_findCachedViewById(R.id.ivClose)).setOnClickListener(new i4(templateActivity, 22));
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f18630u, "exception", e10);
        }
    }
}
