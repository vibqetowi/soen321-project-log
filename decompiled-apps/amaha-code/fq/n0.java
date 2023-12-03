package fq;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bumptech.glide.Glide;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.model.Course;
import com.theinnerhour.b2b.persistence.FirebasePersistence;
import com.theinnerhour.b2b.utils.Constants;
import com.theinnerhour.b2b.utils.Utils;
import com.theinnerhour.b2b.widgets.RobertoButton;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import java.util.LinkedHashMap;
import kotlin.Metadata;
/* compiled from: StaticS32Fragment.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lfq/n0;", "Lrr/b;", "<init>", "()V", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class n0 extends rr.b {

    /* renamed from: v  reason: collision with root package name */
    public static final /* synthetic */ int f15767v = 0;

    /* renamed from: u  reason: collision with root package name */
    public final LinkedHashMap f15768u = new LinkedHashMap();

    /* compiled from: StaticS32Fragment.kt */
    /* loaded from: classes2.dex */
    public static final class a extends a5.f<Drawable> {
        public a() {
        }

        @Override // a5.h
        public final void f(Object obj) {
            ((ConstraintLayout) n0.this._$_findCachedViewById(R.id.constraintLayout)).setBackground((Drawable) obj);
        }
    }

    public final View _$_findCachedViewById(int i6) {
        View findViewById;
        LinkedHashMap linkedHashMap = this.f15768u;
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
        return inflater.inflate(R.layout.fragment_static_s32, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.f15768u.clear();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        rr.a aVar;
        String str;
        kotlin.jvm.internal.i.g(view, "view");
        super.onViewCreated(view, bundle);
        androidx.fragment.app.p activity = getActivity();
        kotlin.jvm.internal.i.e(activity, "null cannot be cast to non-null type com.theinnerhour.b2b.widgets.CustomActivity");
        rr.a aVar2 = (rr.a) activity;
        Course courseById = FirebasePersistence.getInstance().getCourseById(defpackage.c.n());
        androidx.fragment.app.p activity2 = getActivity();
        kotlin.jvm.internal.i.d(activity2);
        String stringExtra = activity2.getIntent().getStringExtra(Constants.API_COURSE_LINK);
        Bundle arguments = getArguments();
        kotlin.jvm.internal.i.d(arguments);
        kotlin.jvm.internal.i.f(arguments.getString(Constants.TEMPLATE_TITLE_KEY, ""), "arguments!!.getString(TEMPLATE_TITLE_KEY,\"\")");
        Glide.h(this).o(Integer.valueOf((int) R.drawable.template_background)).z(new a());
        if (kotlin.jvm.internal.i.b(courseById.getCourseName(), Constants.COURSE_STRESS) && kotlin.jvm.internal.i.b(stringExtra, Constants.SCREEN_T4C)) {
            ((RobertoTextView) _$_findCachedViewById(R.id.textView2)).setText("Your Happy Place");
            ((RobertoTextView) _$_findCachedViewById(R.id.textView3)).setText("Did you like today's activity?");
        } else if (kotlin.jvm.internal.i.b(courseById.getCourseName(), Constants.COURSE_SLEEP) && kotlin.jvm.internal.i.b(stringExtra, Constants.SCREEN_T4C)) {
            ((RobertoTextView) _$_findCachedViewById(R.id.textView2)).setText("Your Safe Space");
            ((RobertoTextView) _$_findCachedViewById(R.id.textView3)).setText("Do you feel this activity was helpful?");
        } else if (kotlin.jvm.internal.i.b(courseById.getCourseName(), Constants.COURSE_WORRY) && kotlin.jvm.internal.i.b(stringExtra, Constants.SCREEN_T4C)) {
            ((RobertoTextView) _$_findCachedViewById(R.id.textView2)).setText("Your Peaceful Place");
            ((RobertoTextView) _$_findCachedViewById(R.id.textView3)).setText("Was this activity helpful?");
        } else if (kotlin.jvm.internal.i.b(courseById.getCourseName(), Constants.COURSE_ANGER) && kotlin.jvm.internal.i.b(stringExtra, Constants.SCREEN_T4C)) {
            ((RobertoTextView) _$_findCachedViewById(R.id.textView2)).setText("Your Peaceful Place");
            ((RobertoTextView) _$_findCachedViewById(R.id.textView3)).setText("Was this activity helpful?");
        } else if (kotlin.jvm.internal.i.b(courseById.getCourseName(), Constants.COURSE_DEPRESSION) && kotlin.jvm.internal.i.b(stringExtra, Constants.SCREEN_T1F)) {
            ((RobertoTextView) _$_findCachedViewById(R.id.textView2)).setText("Time Out");
            ((RobertoTextView) _$_findCachedViewById(R.id.textView3)).setText("Did you like today's activity?");
        } else if (kotlin.jvm.internal.i.b(courseById.getCourseName(), Constants.COURSE_ANGER) && kotlin.jvm.internal.i.b(stringExtra, Constants.SCREEN_T1F)) {
            ((RobertoTextView) _$_findCachedViewById(R.id.textView2)).setText("Time Out");
            ((RobertoTextView) _$_findCachedViewById(R.id.textView3)).setText("Did you like today's activity?");
        } else {
            aVar = aVar2;
            if (kotlin.jvm.internal.i.b(courseById.getCourseName(), Constants.COURSE_STRESS) && kotlin.jvm.internal.i.b(stringExtra, Constants.SCREEN_T1G)) {
                ((RobertoTextView) _$_findCachedViewById(R.id.textView2)).setText("Positive Affirmations");
                ((RobertoTextView) _$_findCachedViewById(R.id.textView3)).setText("Did you find today's activity helpful?");
            } else if (kotlin.jvm.internal.i.b(courseById.getCourseName(), Constants.COURSE_SLEEP) && kotlin.jvm.internal.i.b(stringExtra, Constants.SCREEN_T1G)) {
                ((RobertoTextView) _$_findCachedViewById(R.id.textView2)).setText("Positive Affirmations");
                ((RobertoTextView) _$_findCachedViewById(R.id.textView3)).setText("Was this activity helpful?");
            } else if (kotlin.jvm.internal.i.b(courseById.getCourseName(), Constants.COURSE_WORRY) && kotlin.jvm.internal.i.b(stringExtra, Constants.SCREEN_T1H)) {
                ((RobertoTextView) _$_findCachedViewById(R.id.textView2)).setText("Acceptance Affirmations ");
                ((RobertoTextView) _$_findCachedViewById(R.id.textView3)).setText("Was this activity helpful?");
            } else {
                boolean b10 = kotlin.jvm.internal.i.b(courseById.getCourseName(), Constants.COURSE_ANGER);
                str = Constants.API_COURSE_LINK;
                if (b10 && kotlin.jvm.internal.i.b(stringExtra, Constants.SCREEN_T1I)) {
                    ((RobertoTextView) _$_findCachedViewById(R.id.textView2)).setText("Positive Affirmations");
                    ((RobertoTextView) _$_findCachedViewById(R.id.textView3)).setText("Did you like this activity?");
                } else if (kotlin.jvm.internal.i.b(courseById.getCourseName(), Constants.COURSE_HAPPINESS) && kotlin.jvm.internal.i.b(stringExtra, Constants.SCREEN_T1I)) {
                    ((RobertoTextView) _$_findCachedViewById(R.id.textView2)).setText("Positive Affirmations");
                    ((RobertoTextView) _$_findCachedViewById(R.id.textView3)).setText("Did you like today's activity?");
                } else if (kotlin.jvm.internal.i.b(courseById.getCourseName(), Constants.COURSE_DEPRESSION) && kotlin.jvm.internal.i.b(stringExtra, Constants.SCREEN_T2A)) {
                    ((RobertoTextView) _$_findCachedViewById(R.id.textView2)).setText("Focussed Meditation");
                    ((RobertoTextView) _$_findCachedViewById(R.id.textView3)).setText("Did you find today's activity helpful?");
                } else if (kotlin.jvm.internal.i.b(courseById.getCourseName(), Constants.COURSE_HAPPINESS) && kotlin.jvm.internal.i.b(stringExtra, Constants.SCREEN_T2A)) {
                    ((RobertoTextView) _$_findCachedViewById(R.id.textView2)).setText("Alternate Breathing");
                    ((RobertoTextView) _$_findCachedViewById(R.id.textView3)).setText("Did today's activity help you?");
                } else if (kotlin.jvm.internal.i.b(courseById.getCourseName(), Constants.COURSE_STRESS) && kotlin.jvm.internal.i.b(stringExtra, Constants.GROUNDING)) {
                    ((RobertoTextView) _$_findCachedViewById(R.id.textView2)).setText("Grounding");
                    ((RobertoTextView) _$_findCachedViewById(R.id.textView3)).setText("Did you like today's activity?");
                } else if (kotlin.jvm.internal.i.b(courseById.getCourseName(), Constants.COURSE_ANGER) && kotlin.jvm.internal.i.b(stringExtra, Constants.THREE_MINUTE_BREATHING_SPACE)) {
                    ((RobertoTextView) _$_findCachedViewById(R.id.textView2)).setText("Breathing Space");
                    ((RobertoTextView) _$_findCachedViewById(R.id.textView3)).setText("Was today's activity helpful?");
                } else if (kotlin.jvm.internal.i.b(courseById.getCourseName(), Constants.COURSE_SLEEP) && kotlin.jvm.internal.i.b(stringExtra, Constants.HUMMING)) {
                    ((RobertoTextView) _$_findCachedViewById(R.id.textView2)).setText("Humming Meditation");
                    ((RobertoTextView) _$_findCachedViewById(R.id.textView3)).setText("Did you find this activity helpful?");
                } else if (kotlin.jvm.internal.i.b(courseById.getCourseName(), Constants.COURSE_SLEEP) && kotlin.jvm.internal.i.b(stringExtra, Constants.TOE_TENSING)) {
                    ((RobertoTextView) _$_findCachedViewById(R.id.textView2)).setText("Toe Tensing");
                    ((RobertoTextView) _$_findCachedViewById(R.id.textView3)).setText("Do you feel this activity was helpful?");
                } else if (kotlin.jvm.internal.i.b(courseById.getCourseName(), Constants.COURSE_WORRY) && kotlin.jvm.internal.i.b(stringExtra, Constants.GROUNDING_LOWER_BODY)) {
                    ((RobertoTextView) _$_findCachedViewById(R.id.textView2)).setText("Lower Body Grounding");
                    ((RobertoTextView) _$_findCachedViewById(R.id.textView3)).setText("Did this activity help you?");
                } else if (kotlin.jvm.internal.i.b(courseById.getCourseName(), Constants.COURSE_WORRY) && kotlin.jvm.internal.i.b(stringExtra, Constants.FOCUSSED_ATTENTION_MEDITATION)) {
                    ((RobertoTextView) _$_findCachedViewById(R.id.textView2)).setText("Focussed Meditation");
                    ((RobertoTextView) _$_findCachedViewById(R.id.textView3)).setText("Did you find today's activity helpful?");
                } else if (kotlin.jvm.internal.i.b(courseById.getCourseName(), Constants.COURSE_STRESS) && kotlin.jvm.internal.i.b(stringExtra, Constants.SCREEN_T8A)) {
                    ((RobertoTextView) _$_findCachedViewById(R.id.textView2)).setText("The Assertiveness Formula");
                    ((RobertoTextView) _$_findCachedViewById(R.id.textView3)).setText("Did you find this activity helpful?");
                } else if (kotlin.jvm.internal.i.b(courseById.getCourseName(), Constants.COURSE_DEPRESSION) && kotlin.jvm.internal.i.b(stringExtra, Constants.SCREEN_T8B)) {
                    ((RobertoTextView) _$_findCachedViewById(R.id.textView2)).setText("Double Standard Dispute");
                    ((RobertoTextView) _$_findCachedViewById(R.id.textView3)).setText("Was this activity helpful?");
                } else if (kotlin.jvm.internal.i.b(courseById.getCourseName(), Constants.COURSE_STRESS) && kotlin.jvm.internal.i.b(stringExtra, Constants.SCREEN_T8B)) {
                    ((RobertoTextView) _$_findCachedViewById(R.id.textView2)).setText("Double Standard Dispute");
                    ((RobertoTextView) _$_findCachedViewById(R.id.textView3)).setText("Was this activity helpful?");
                } else if (kotlin.jvm.internal.i.b(courseById.getCourseName(), Constants.COURSE_ANGER) && kotlin.jvm.internal.i.b(stringExtra, Constants.SCREEN_T8C)) {
                    ((RobertoTextView) _$_findCachedViewById(R.id.textView2)).setText("Helicopter Perspective");
                    ((RobertoTextView) _$_findCachedViewById(R.id.textView3)).setText("Did you find today's activity helpful?");
                } else if (kotlin.jvm.internal.i.b(courseById.getCourseName(), Constants.COURSE_DEPRESSION) && kotlin.jvm.internal.i.b(stringExtra, Constants.SCREEN_T8G)) {
                    ((RobertoTextView) _$_findCachedViewById(R.id.textView2)).setText("Three Good Things");
                    ((RobertoTextView) _$_findCachedViewById(R.id.textView3)).setText("Did you like this activity?");
                } else if (kotlin.jvm.internal.i.b(courseById.getCourseName(), Constants.COURSE_STRESS) && kotlin.jvm.internal.i.b(stringExtra, Constants.SCREEN_T8I)) {
                    ((RobertoTextView) _$_findCachedViewById(R.id.textView2)).setText("Problem Solving Formula");
                    ((RobertoTextView) _$_findCachedViewById(R.id.textView3)).setText("Did you find this activity helpful?");
                } else if (kotlin.jvm.internal.i.b(courseById.getCourseName(), Constants.COURSE_ANGER) && kotlin.jvm.internal.i.b(stringExtra, Constants.SCREEN_T1J)) {
                    ((RobertoTextView) _$_findCachedViewById(R.id.textView2)).setText("Self-Compassion Pause");
                    ((RobertoTextView) _$_findCachedViewById(R.id.textView3)).setText("Did this activity help you?");
                } else if (kotlin.jvm.internal.i.b(courseById.getCourseName(), Constants.COURSE_HAPPINESS) && kotlin.jvm.internal.i.b(stringExtra, Constants.SCREEN_T1J)) {
                    ((RobertoTextView) _$_findCachedViewById(R.id.textView2)).setText("Self-Compassion Pause");
                    ((RobertoTextView) _$_findCachedViewById(R.id.textView3)).setText("Was this activity helpful?");
                } else if (kotlin.jvm.internal.i.b(courseById.getCourseName(), Constants.COURSE_SLEEP) && kotlin.jvm.internal.i.b(stringExtra, Constants.SCREEN_T1K)) {
                    ((RobertoTextView) _$_findCachedViewById(R.id.textView2)).setText("The 20 Minute Rule");
                    ((RobertoTextView) _$_findCachedViewById(R.id.textView3)).setText("Did you like what you learned today?");
                } else if (kotlin.jvm.internal.i.b(courseById.getCourseName(), Constants.COURSE_HAPPINESS) && kotlin.jvm.internal.i.b(stringExtra, Constants.SCREEN_T11A)) {
                    ((RobertoTextView) _$_findCachedViewById(R.id.textView2)).setText("Gratitude Object");
                    ((RobertoTextView) _$_findCachedViewById(R.id.textView3)).setText("Did you like this activity?");
                } else if (kotlin.jvm.internal.i.b(courseById.getCourseName(), Constants.COURSE_DEPRESSION) && kotlin.jvm.internal.i.b(stringExtra, Constants.SCREEN_T6A)) {
                    ((RobertoTextView) _$_findCachedViewById(R.id.textView2)).setText("Attention Chunking");
                    ((RobertoTextView) _$_findCachedViewById(R.id.textView3)).setText("Did you enjoy this activity?");
                } else if (kotlin.jvm.internal.i.b(courseById.getCourseName(), Constants.COURSE_STRESS) && kotlin.jvm.internal.i.b(stringExtra, Constants.SCREEN_T6A)) {
                    ((RobertoTextView) _$_findCachedViewById(R.id.textView2)).setText("Attention Chunking");
                    ((RobertoTextView) _$_findCachedViewById(R.id.textView3)).setText("Was this activity helpful?");
                } else if (kotlin.jvm.internal.i.b(courseById.getCourseName(), Constants.COURSE_WORRY) && kotlin.jvm.internal.i.b(stringExtra, Constants.SCREEN_T6A)) {
                    ((RobertoTextView) _$_findCachedViewById(R.id.textView2)).setText("Attention Chunking");
                    ((RobertoTextView) _$_findCachedViewById(R.id.textView3)).setText("Did this activity help you?");
                } else if (kotlin.jvm.internal.i.b(courseById.getCourseName(), Constants.COURSE_HAPPINESS) && kotlin.jvm.internal.i.b(stringExtra, Constants.SCREEN_TAE)) {
                    ((RobertoTextView) _$_findCachedViewById(R.id.textView2)).setText("Mindfulness Minute");
                    ((RobertoTextView) _$_findCachedViewById(R.id.textView3)).setText("Did you like today's activity?");
                } else if (kotlin.jvm.internal.i.b(courseById.getCourseName(), Constants.COURSE_WORRY) && kotlin.jvm.internal.i.b(stringExtra, Constants.SCREEN_T5B)) {
                    ((RobertoTextView) _$_findCachedViewById(R.id.textView2)).setText("Worry Time");
                    ((RobertoTextView) _$_findCachedViewById(R.id.textView3)).setText("Did this activity help you?");
                } else if (kotlin.jvm.internal.i.b(courseById.getCourseName(), Constants.COURSE_SLEEP) && kotlin.jvm.internal.i.b(stringExtra, Constants.SCREEN_T5A)) {
                    ((RobertoTextView) _$_findCachedViewById(R.id.textView2)).setText("Worry Time");
                    ((RobertoTextView) _$_findCachedViewById(R.id.textView3)).setText("Did this activity help you?");
                }
                ((RobertoButton) _$_findCachedViewById(R.id.feedback_yes)).setText("Yes");
                ((RobertoButton) _$_findCachedViewById(R.id.feedback_no)).setText("No");
                final Bundle bundle2 = new Bundle();
                bundle2.putString("course", courseById.getCourseName());
                bundle2.putString(str, stringExtra);
                bundle2.putString("version", FirebasePersistence.getInstance().getUser().getVersion());
                bundle2.putBoolean("dynamicV1", false);
                final rr.a aVar3 = aVar;
                ((RobertoButton) _$_findCachedViewById(R.id.feedback_yes)).setOnClickListener(new View.OnClickListener() { // from class: fq.l0
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        int i6 = r4;
                        n0 this$0 = this;
                        Bundle analyticsBundle = bundle2;
                        rr.a act = aVar3;
                        switch (i6) {
                            case 0:
                                int i10 = n0.f15767v;
                                kotlin.jvm.internal.i.g(act, "$act");
                                kotlin.jvm.internal.i.g(analyticsBundle, "$analyticsBundle");
                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                act.t0();
                                gk.a.b(analyticsBundle, "statics32_yes_click");
                                Utils utils = Utils.INSTANCE;
                                androidx.fragment.app.p activity3 = this$0.getActivity();
                                kotlin.jvm.internal.i.d(activity3);
                                String string = this$0.getString(R.string.feedback_yes);
                                kotlin.jvm.internal.i.f(string, "getString(R.string.feedback_yes)");
                                utils.showCustomToast(activity3, string);
                                return;
                            default:
                                int i11 = n0.f15767v;
                                kotlin.jvm.internal.i.g(act, "$act");
                                kotlin.jvm.internal.i.g(analyticsBundle, "$analyticsBundle");
                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                act.t0();
                                gk.a.b(analyticsBundle, "statics32_no_click");
                                Utils utils2 = Utils.INSTANCE;
                                androidx.fragment.app.p activity4 = this$0.getActivity();
                                kotlin.jvm.internal.i.d(activity4);
                                String string2 = this$0.getString(R.string.feedback_no);
                                kotlin.jvm.internal.i.f(string2, "getString(R.string.feedback_no)");
                                utils2.showCustomToast(activity4, string2);
                                return;
                        }
                    }
                });
                ((RobertoButton) _$_findCachedViewById(R.id.feedback_no)).setOnClickListener(new View.OnClickListener() { // from class: fq.l0
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        int i6 = r4;
                        n0 this$0 = this;
                        Bundle analyticsBundle = bundle2;
                        rr.a act = aVar3;
                        switch (i6) {
                            case 0:
                                int i10 = n0.f15767v;
                                kotlin.jvm.internal.i.g(act, "$act");
                                kotlin.jvm.internal.i.g(analyticsBundle, "$analyticsBundle");
                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                act.t0();
                                gk.a.b(analyticsBundle, "statics32_yes_click");
                                Utils utils = Utils.INSTANCE;
                                androidx.fragment.app.p activity3 = this$0.getActivity();
                                kotlin.jvm.internal.i.d(activity3);
                                String string = this$0.getString(R.string.feedback_yes);
                                kotlin.jvm.internal.i.f(string, "getString(R.string.feedback_yes)");
                                utils.showCustomToast(activity3, string);
                                return;
                            default:
                                int i11 = n0.f15767v;
                                kotlin.jvm.internal.i.g(act, "$act");
                                kotlin.jvm.internal.i.g(analyticsBundle, "$analyticsBundle");
                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                act.t0();
                                gk.a.b(analyticsBundle, "statics32_no_click");
                                Utils utils2 = Utils.INSTANCE;
                                androidx.fragment.app.p activity4 = this$0.getActivity();
                                kotlin.jvm.internal.i.d(activity4);
                                String string2 = this$0.getString(R.string.feedback_no);
                                kotlin.jvm.internal.i.f(string2, "getString(R.string.feedback_no)");
                                utils2.showCustomToast(activity4, string2);
                                return;
                        }
                    }
                });
                ((ImageView) _$_findCachedViewById(R.id.header_arrow_back)).setOnClickListener(new m0(aVar3, 0));
            }
            str = Constants.API_COURSE_LINK;
            ((RobertoButton) _$_findCachedViewById(R.id.feedback_yes)).setText("Yes");
            ((RobertoButton) _$_findCachedViewById(R.id.feedback_no)).setText("No");
            final Bundle bundle22 = new Bundle();
            bundle22.putString("course", courseById.getCourseName());
            bundle22.putString(str, stringExtra);
            bundle22.putString("version", FirebasePersistence.getInstance().getUser().getVersion());
            bundle22.putBoolean("dynamicV1", false);
            final rr.a aVar32 = aVar;
            ((RobertoButton) _$_findCachedViewById(R.id.feedback_yes)).setOnClickListener(new View.OnClickListener() { // from class: fq.l0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    int i6 = r4;
                    n0 this$0 = this;
                    Bundle analyticsBundle = bundle22;
                    rr.a act = aVar32;
                    switch (i6) {
                        case 0:
                            int i10 = n0.f15767v;
                            kotlin.jvm.internal.i.g(act, "$act");
                            kotlin.jvm.internal.i.g(analyticsBundle, "$analyticsBundle");
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            act.t0();
                            gk.a.b(analyticsBundle, "statics32_yes_click");
                            Utils utils = Utils.INSTANCE;
                            androidx.fragment.app.p activity3 = this$0.getActivity();
                            kotlin.jvm.internal.i.d(activity3);
                            String string = this$0.getString(R.string.feedback_yes);
                            kotlin.jvm.internal.i.f(string, "getString(R.string.feedback_yes)");
                            utils.showCustomToast(activity3, string);
                            return;
                        default:
                            int i11 = n0.f15767v;
                            kotlin.jvm.internal.i.g(act, "$act");
                            kotlin.jvm.internal.i.g(analyticsBundle, "$analyticsBundle");
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            act.t0();
                            gk.a.b(analyticsBundle, "statics32_no_click");
                            Utils utils2 = Utils.INSTANCE;
                            androidx.fragment.app.p activity4 = this$0.getActivity();
                            kotlin.jvm.internal.i.d(activity4);
                            String string2 = this$0.getString(R.string.feedback_no);
                            kotlin.jvm.internal.i.f(string2, "getString(R.string.feedback_no)");
                            utils2.showCustomToast(activity4, string2);
                            return;
                    }
                }
            });
            ((RobertoButton) _$_findCachedViewById(R.id.feedback_no)).setOnClickListener(new View.OnClickListener() { // from class: fq.l0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    int i6 = r4;
                    n0 this$0 = this;
                    Bundle analyticsBundle = bundle22;
                    rr.a act = aVar32;
                    switch (i6) {
                        case 0:
                            int i10 = n0.f15767v;
                            kotlin.jvm.internal.i.g(act, "$act");
                            kotlin.jvm.internal.i.g(analyticsBundle, "$analyticsBundle");
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            act.t0();
                            gk.a.b(analyticsBundle, "statics32_yes_click");
                            Utils utils = Utils.INSTANCE;
                            androidx.fragment.app.p activity3 = this$0.getActivity();
                            kotlin.jvm.internal.i.d(activity3);
                            String string = this$0.getString(R.string.feedback_yes);
                            kotlin.jvm.internal.i.f(string, "getString(R.string.feedback_yes)");
                            utils.showCustomToast(activity3, string);
                            return;
                        default:
                            int i11 = n0.f15767v;
                            kotlin.jvm.internal.i.g(act, "$act");
                            kotlin.jvm.internal.i.g(analyticsBundle, "$analyticsBundle");
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            act.t0();
                            gk.a.b(analyticsBundle, "statics32_no_click");
                            Utils utils2 = Utils.INSTANCE;
                            androidx.fragment.app.p activity4 = this$0.getActivity();
                            kotlin.jvm.internal.i.d(activity4);
                            String string2 = this$0.getString(R.string.feedback_no);
                            kotlin.jvm.internal.i.f(string2, "getString(R.string.feedback_no)");
                            utils2.showCustomToast(activity4, string2);
                            return;
                    }
                }
            });
            ((ImageView) _$_findCachedViewById(R.id.header_arrow_back)).setOnClickListener(new m0(aVar32, 0));
        }
        aVar = aVar2;
        str = Constants.API_COURSE_LINK;
        ((RobertoButton) _$_findCachedViewById(R.id.feedback_yes)).setText("Yes");
        ((RobertoButton) _$_findCachedViewById(R.id.feedback_no)).setText("No");
        final Bundle bundle222 = new Bundle();
        bundle222.putString("course", courseById.getCourseName());
        bundle222.putString(str, stringExtra);
        bundle222.putString("version", FirebasePersistence.getInstance().getUser().getVersion());
        bundle222.putBoolean("dynamicV1", false);
        final rr.a aVar322 = aVar;
        ((RobertoButton) _$_findCachedViewById(R.id.feedback_yes)).setOnClickListener(new View.OnClickListener() { // from class: fq.l0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i6 = r4;
                n0 this$0 = this;
                Bundle analyticsBundle = bundle222;
                rr.a act = aVar322;
                switch (i6) {
                    case 0:
                        int i10 = n0.f15767v;
                        kotlin.jvm.internal.i.g(act, "$act");
                        kotlin.jvm.internal.i.g(analyticsBundle, "$analyticsBundle");
                        kotlin.jvm.internal.i.g(this$0, "this$0");
                        act.t0();
                        gk.a.b(analyticsBundle, "statics32_yes_click");
                        Utils utils = Utils.INSTANCE;
                        androidx.fragment.app.p activity3 = this$0.getActivity();
                        kotlin.jvm.internal.i.d(activity3);
                        String string = this$0.getString(R.string.feedback_yes);
                        kotlin.jvm.internal.i.f(string, "getString(R.string.feedback_yes)");
                        utils.showCustomToast(activity3, string);
                        return;
                    default:
                        int i11 = n0.f15767v;
                        kotlin.jvm.internal.i.g(act, "$act");
                        kotlin.jvm.internal.i.g(analyticsBundle, "$analyticsBundle");
                        kotlin.jvm.internal.i.g(this$0, "this$0");
                        act.t0();
                        gk.a.b(analyticsBundle, "statics32_no_click");
                        Utils utils2 = Utils.INSTANCE;
                        androidx.fragment.app.p activity4 = this$0.getActivity();
                        kotlin.jvm.internal.i.d(activity4);
                        String string2 = this$0.getString(R.string.feedback_no);
                        kotlin.jvm.internal.i.f(string2, "getString(R.string.feedback_no)");
                        utils2.showCustomToast(activity4, string2);
                        return;
                }
            }
        });
        ((RobertoButton) _$_findCachedViewById(R.id.feedback_no)).setOnClickListener(new View.OnClickListener() { // from class: fq.l0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i6 = r4;
                n0 this$0 = this;
                Bundle analyticsBundle = bundle222;
                rr.a act = aVar322;
                switch (i6) {
                    case 0:
                        int i10 = n0.f15767v;
                        kotlin.jvm.internal.i.g(act, "$act");
                        kotlin.jvm.internal.i.g(analyticsBundle, "$analyticsBundle");
                        kotlin.jvm.internal.i.g(this$0, "this$0");
                        act.t0();
                        gk.a.b(analyticsBundle, "statics32_yes_click");
                        Utils utils = Utils.INSTANCE;
                        androidx.fragment.app.p activity3 = this$0.getActivity();
                        kotlin.jvm.internal.i.d(activity3);
                        String string = this$0.getString(R.string.feedback_yes);
                        kotlin.jvm.internal.i.f(string, "getString(R.string.feedback_yes)");
                        utils.showCustomToast(activity3, string);
                        return;
                    default:
                        int i11 = n0.f15767v;
                        kotlin.jvm.internal.i.g(act, "$act");
                        kotlin.jvm.internal.i.g(analyticsBundle, "$analyticsBundle");
                        kotlin.jvm.internal.i.g(this$0, "this$0");
                        act.t0();
                        gk.a.b(analyticsBundle, "statics32_no_click");
                        Utils utils2 = Utils.INSTANCE;
                        androidx.fragment.app.p activity4 = this$0.getActivity();
                        kotlin.jvm.internal.i.d(activity4);
                        String string2 = this$0.getString(R.string.feedback_no);
                        kotlin.jvm.internal.i.f(string2, "getString(R.string.feedback_no)");
                        utils2.showCustomToast(activity4, string2);
                        return;
                }
            }
        });
        ((ImageView) _$_findCachedViewById(R.id.header_arrow_back)).setOnClickListener(new m0(aVar322, 0));
    }
}
