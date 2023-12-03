package rq;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.utils.InsetsUtils;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.widgets.RobertoButton;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import g0.a;
import java.util.LinkedHashMap;
import kotlin.Metadata;
/* compiled from: DepressionThoughtsAssessmentFragment.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lrq/b;", "Lrr/b;", "<init>", "()V", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class b extends rr.b {

    /* renamed from: x  reason: collision with root package name */
    public static final /* synthetic */ int f30921x = 0;

    /* renamed from: v  reason: collision with root package name */
    public boolean f30923v;

    /* renamed from: w  reason: collision with root package name */
    public final LinkedHashMap f30924w = new LinkedHashMap();

    /* renamed from: u  reason: collision with root package name */
    public final String f30922u = LogHelper.INSTANCE.makeLogTag(b.class);

    public final void J(String str, String str2, final String str3, final String str4, final String str5, final String str6, final int i6, String str7, String str8, final String str9, final String str10) {
        try {
            ((RobertoButton) _$_findCachedViewById(R.id.continueCTA)).setBackgroundResource(R.drawable.button_border_gray);
            ((RobertoTextView) _$_findCachedViewById(R.id.header)).setText(str7);
            ((RobertoTextView) _$_findCachedViewById(R.id.choose)).setText(str8);
            ((RobertoTextView) _$_findCachedViewById(R.id.row1)).setText(str);
            ((RobertoTextView) _$_findCachedViewById(R.id.row2)).setText(str2);
            ((RobertoTextView) _$_findCachedViewById(R.id.row1)).setVisibility(0);
            ((RobertoTextView) _$_findCachedViewById(R.id.row2)).setVisibility(0);
            ((RobertoTextView) _$_findCachedViewById(R.id.row1)).setOnClickListener(new View.OnClickListener(this) { // from class: rq.a

                /* renamed from: v  reason: collision with root package name */
                public final /* synthetic */ b f30916v;

                {
                    this.f30916v = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int i10;
                    int i11;
                    int i12 = r9;
                    int i13 = i6;
                    String CTATextWrong = str10;
                    String reason2 = str6;
                    String emotion2Sub = str4;
                    String CTATextRight = str9;
                    String reason1 = str5;
                    String emotion1Sub = str3;
                    b this$0 = this.f30916v;
                    switch (i12) {
                        case 0:
                            int i14 = b.f30921x;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            kotlin.jvm.internal.i.g(emotion1Sub, "$emotion1Sub");
                            kotlin.jvm.internal.i.g(reason1, "$reason1");
                            kotlin.jvm.internal.i.g(CTATextRight, "$CTATextRight");
                            kotlin.jvm.internal.i.g(emotion2Sub, "$emotion2Sub");
                            kotlin.jvm.internal.i.g(reason2, "$reason2");
                            kotlin.jvm.internal.i.g(CTATextWrong, "$CTATextWrong");
                            ((RobertoTextView) this$0._$_findCachedViewById(R.id.row2)).setVisibility(8);
                            ((RobertoTextView) this$0._$_findCachedViewById(R.id.bodyTitle)).setVisibility(0);
                            ((RobertoTextView) this$0._$_findCachedViewById(R.id.bodyText)).setVisibility(0);
                            if (i13 == 1) {
                                Context context = this$0.getContext();
                                kotlin.jvm.internal.i.d(context);
                                Object obj = g0.a.f16164a;
                                ((RobertoTextView) this$0._$_findCachedViewById(R.id.row1)).setBackground(a.c.b(context, R.drawable.grey_rounded_corners_blue_stroke));
                                Context context2 = this$0.getContext();
                                kotlin.jvm.internal.i.d(context2);
                                ((RobertoTextView) this$0._$_findCachedViewById(R.id.bodyTitle)).setTextColor(g0.a.b(context2, R.color.sea));
                                ((RobertoTextView) this$0._$_findCachedViewById(R.id.bodyTitle)).setText(emotion1Sub);
                                ((RobertoTextView) this$0._$_findCachedViewById(R.id.bodyText)).setText(reason1);
                                ((RobertoButton) this$0._$_findCachedViewById(R.id.continueCTA)).setText(CTATextRight);
                                i11 = R.id.continueCTA;
                            } else {
                                Context context3 = this$0.getContext();
                                kotlin.jvm.internal.i.d(context3);
                                Object obj2 = g0.a.f16164a;
                                ((RobertoTextView) this$0._$_findCachedViewById(R.id.row1)).setBackground(a.c.b(context3, R.drawable.grey_rounded_corners_red_stroke));
                                Context context4 = this$0.getContext();
                                kotlin.jvm.internal.i.d(context4);
                                ((RobertoTextView) this$0._$_findCachedViewById(R.id.bodyTitle)).setTextColor(g0.a.b(context4, R.color.red));
                                ((RobertoTextView) this$0._$_findCachedViewById(R.id.bodyTitle)).setText(emotion2Sub);
                                ((RobertoTextView) this$0._$_findCachedViewById(R.id.bodyText)).setText(reason2);
                                i11 = R.id.continueCTA;
                                ((RobertoButton) this$0._$_findCachedViewById(R.id.continueCTA)).setText(CTATextWrong);
                            }
                            ((RobertoButton) this$0._$_findCachedViewById(i11)).setBackgroundResource(R.drawable.button_dark_grey_fill);
                            this$0.f30923v = true;
                            return;
                        default:
                            int i15 = b.f30921x;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            kotlin.jvm.internal.i.g(emotion1Sub, "$emotion1Sub");
                            kotlin.jvm.internal.i.g(reason1, "$reason1");
                            kotlin.jvm.internal.i.g(CTATextRight, "$CTATextRight");
                            kotlin.jvm.internal.i.g(emotion2Sub, "$emotion2Sub");
                            kotlin.jvm.internal.i.g(reason2, "$reason2");
                            kotlin.jvm.internal.i.g(CTATextWrong, "$CTATextWrong");
                            ((RobertoTextView) this$0._$_findCachedViewById(R.id.row1)).setVisibility(8);
                            ((RobertoTextView) this$0._$_findCachedViewById(R.id.bodyTitle)).setVisibility(0);
                            ((RobertoTextView) this$0._$_findCachedViewById(R.id.bodyText)).setVisibility(0);
                            if (i13 == 2) {
                                Context context5 = this$0.getContext();
                                kotlin.jvm.internal.i.d(context5);
                                Object obj3 = g0.a.f16164a;
                                ((RobertoTextView) this$0._$_findCachedViewById(R.id.row2)).setBackground(a.c.b(context5, R.drawable.grey_rounded_corners_blue_stroke));
                                Context context6 = this$0.getContext();
                                kotlin.jvm.internal.i.d(context6);
                                ((RobertoTextView) this$0._$_findCachedViewById(R.id.bodyTitle)).setTextColor(g0.a.b(context6, R.color.sea));
                                ((RobertoTextView) this$0._$_findCachedViewById(R.id.bodyTitle)).setText(emotion1Sub);
                                ((RobertoTextView) this$0._$_findCachedViewById(R.id.bodyText)).setText(reason1);
                                ((RobertoButton) this$0._$_findCachedViewById(R.id.continueCTA)).setText(CTATextRight);
                                i10 = R.id.continueCTA;
                            } else {
                                Context context7 = this$0.getContext();
                                kotlin.jvm.internal.i.d(context7);
                                Object obj4 = g0.a.f16164a;
                                ((RobertoTextView) this$0._$_findCachedViewById(R.id.row2)).setBackground(a.c.b(context7, R.drawable.grey_rounded_corners_red_stroke));
                                Context context8 = this$0.getContext();
                                kotlin.jvm.internal.i.d(context8);
                                ((RobertoTextView) this$0._$_findCachedViewById(R.id.bodyTitle)).setTextColor(g0.a.b(context8, R.color.red));
                                ((RobertoTextView) this$0._$_findCachedViewById(R.id.bodyTitle)).setText(emotion2Sub);
                                ((RobertoTextView) this$0._$_findCachedViewById(R.id.bodyText)).setText(reason2);
                                i10 = R.id.continueCTA;
                                ((RobertoButton) this$0._$_findCachedViewById(R.id.continueCTA)).setText(CTATextWrong);
                            }
                            ((RobertoButton) this$0._$_findCachedViewById(i10)).setBackgroundResource(R.drawable.button_dark_grey_fill);
                            this$0.f30923v = true;
                            return;
                    }
                }
            });
            ((RobertoTextView) _$_findCachedViewById(R.id.row2)).setOnClickListener(new View.OnClickListener(this) { // from class: rq.a

                /* renamed from: v  reason: collision with root package name */
                public final /* synthetic */ b f30916v;

                {
                    this.f30916v = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int i10;
                    int i11;
                    int i12 = r9;
                    int i13 = i6;
                    String CTATextWrong = str10;
                    String reason2 = str6;
                    String emotion2Sub = str4;
                    String CTATextRight = str9;
                    String reason1 = str5;
                    String emotion1Sub = str3;
                    b this$0 = this.f30916v;
                    switch (i12) {
                        case 0:
                            int i14 = b.f30921x;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            kotlin.jvm.internal.i.g(emotion1Sub, "$emotion1Sub");
                            kotlin.jvm.internal.i.g(reason1, "$reason1");
                            kotlin.jvm.internal.i.g(CTATextRight, "$CTATextRight");
                            kotlin.jvm.internal.i.g(emotion2Sub, "$emotion2Sub");
                            kotlin.jvm.internal.i.g(reason2, "$reason2");
                            kotlin.jvm.internal.i.g(CTATextWrong, "$CTATextWrong");
                            ((RobertoTextView) this$0._$_findCachedViewById(R.id.row2)).setVisibility(8);
                            ((RobertoTextView) this$0._$_findCachedViewById(R.id.bodyTitle)).setVisibility(0);
                            ((RobertoTextView) this$0._$_findCachedViewById(R.id.bodyText)).setVisibility(0);
                            if (i13 == 1) {
                                Context context = this$0.getContext();
                                kotlin.jvm.internal.i.d(context);
                                Object obj = g0.a.f16164a;
                                ((RobertoTextView) this$0._$_findCachedViewById(R.id.row1)).setBackground(a.c.b(context, R.drawable.grey_rounded_corners_blue_stroke));
                                Context context2 = this$0.getContext();
                                kotlin.jvm.internal.i.d(context2);
                                ((RobertoTextView) this$0._$_findCachedViewById(R.id.bodyTitle)).setTextColor(g0.a.b(context2, R.color.sea));
                                ((RobertoTextView) this$0._$_findCachedViewById(R.id.bodyTitle)).setText(emotion1Sub);
                                ((RobertoTextView) this$0._$_findCachedViewById(R.id.bodyText)).setText(reason1);
                                ((RobertoButton) this$0._$_findCachedViewById(R.id.continueCTA)).setText(CTATextRight);
                                i11 = R.id.continueCTA;
                            } else {
                                Context context3 = this$0.getContext();
                                kotlin.jvm.internal.i.d(context3);
                                Object obj2 = g0.a.f16164a;
                                ((RobertoTextView) this$0._$_findCachedViewById(R.id.row1)).setBackground(a.c.b(context3, R.drawable.grey_rounded_corners_red_stroke));
                                Context context4 = this$0.getContext();
                                kotlin.jvm.internal.i.d(context4);
                                ((RobertoTextView) this$0._$_findCachedViewById(R.id.bodyTitle)).setTextColor(g0.a.b(context4, R.color.red));
                                ((RobertoTextView) this$0._$_findCachedViewById(R.id.bodyTitle)).setText(emotion2Sub);
                                ((RobertoTextView) this$0._$_findCachedViewById(R.id.bodyText)).setText(reason2);
                                i11 = R.id.continueCTA;
                                ((RobertoButton) this$0._$_findCachedViewById(R.id.continueCTA)).setText(CTATextWrong);
                            }
                            ((RobertoButton) this$0._$_findCachedViewById(i11)).setBackgroundResource(R.drawable.button_dark_grey_fill);
                            this$0.f30923v = true;
                            return;
                        default:
                            int i15 = b.f30921x;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            kotlin.jvm.internal.i.g(emotion1Sub, "$emotion1Sub");
                            kotlin.jvm.internal.i.g(reason1, "$reason1");
                            kotlin.jvm.internal.i.g(CTATextRight, "$CTATextRight");
                            kotlin.jvm.internal.i.g(emotion2Sub, "$emotion2Sub");
                            kotlin.jvm.internal.i.g(reason2, "$reason2");
                            kotlin.jvm.internal.i.g(CTATextWrong, "$CTATextWrong");
                            ((RobertoTextView) this$0._$_findCachedViewById(R.id.row1)).setVisibility(8);
                            ((RobertoTextView) this$0._$_findCachedViewById(R.id.bodyTitle)).setVisibility(0);
                            ((RobertoTextView) this$0._$_findCachedViewById(R.id.bodyText)).setVisibility(0);
                            if (i13 == 2) {
                                Context context5 = this$0.getContext();
                                kotlin.jvm.internal.i.d(context5);
                                Object obj3 = g0.a.f16164a;
                                ((RobertoTextView) this$0._$_findCachedViewById(R.id.row2)).setBackground(a.c.b(context5, R.drawable.grey_rounded_corners_blue_stroke));
                                Context context6 = this$0.getContext();
                                kotlin.jvm.internal.i.d(context6);
                                ((RobertoTextView) this$0._$_findCachedViewById(R.id.bodyTitle)).setTextColor(g0.a.b(context6, R.color.sea));
                                ((RobertoTextView) this$0._$_findCachedViewById(R.id.bodyTitle)).setText(emotion1Sub);
                                ((RobertoTextView) this$0._$_findCachedViewById(R.id.bodyText)).setText(reason1);
                                ((RobertoButton) this$0._$_findCachedViewById(R.id.continueCTA)).setText(CTATextRight);
                                i10 = R.id.continueCTA;
                            } else {
                                Context context7 = this$0.getContext();
                                kotlin.jvm.internal.i.d(context7);
                                Object obj4 = g0.a.f16164a;
                                ((RobertoTextView) this$0._$_findCachedViewById(R.id.row2)).setBackground(a.c.b(context7, R.drawable.grey_rounded_corners_red_stroke));
                                Context context8 = this$0.getContext();
                                kotlin.jvm.internal.i.d(context8);
                                ((RobertoTextView) this$0._$_findCachedViewById(R.id.bodyTitle)).setTextColor(g0.a.b(context8, R.color.red));
                                ((RobertoTextView) this$0._$_findCachedViewById(R.id.bodyTitle)).setText(emotion2Sub);
                                ((RobertoTextView) this$0._$_findCachedViewById(R.id.bodyText)).setText(reason2);
                                i10 = R.id.continueCTA;
                                ((RobertoButton) this$0._$_findCachedViewById(R.id.continueCTA)).setText(CTATextWrong);
                            }
                            ((RobertoButton) this$0._$_findCachedViewById(i10)).setBackgroundResource(R.drawable.button_dark_grey_fill);
                            this$0.f30923v = true;
                            return;
                    }
                }
            });
            ((RobertoButton) _$_findCachedViewById(R.id.continueCTA)).setOnClickListener(new qq.n(this, 6));
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f30922u, "Depression Thoughts Assessment", e10);
        }
    }

    public final View _$_findCachedViewById(int i6) {
        View findViewById;
        LinkedHashMap linkedHashMap = this.f30924w;
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
        return inflater.inflate(R.layout.fragment_screen_a26, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.f30924w.clear();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        kotlin.jvm.internal.i.g(view, "view");
        super.onViewCreated(view, bundle);
        try {
            InsetsUtils insetsUtils = InsetsUtils.INSTANCE;
            RobertoTextView header = (RobertoTextView) _$_findCachedViewById(R.id.header);
            kotlin.jvm.internal.i.f(header, "header");
            insetsUtils.addStatusBarHeight(header);
            Bundle arguments = getArguments();
            kotlin.jvm.internal.i.d(arguments);
            int i6 = arguments.getInt("Quiz");
            if (i6 != 1) {
                if (i6 != 2) {
                    if (i6 != 3) {
                        if (i6 == 4) {
                            String string = getString(R.string.depressionThoughtsQuiz4Option2);
                            kotlin.jvm.internal.i.f(string, "getString(R.string.depressionThoughtsQuiz4Option2)");
                            String string2 = getString(R.string.depressionThoughtsQuiz4Option1);
                            kotlin.jvm.internal.i.f(string2, "getString(R.string.depressionThoughtsQuiz4Option1)");
                            String string3 = getString(R.string.depressionThoughtsQuiz4Right);
                            kotlin.jvm.internal.i.f(string3, "getString(R.string.depressionThoughtsQuiz4Right)");
                            String string4 = getString(R.string.depressionThoughtsQuiz4Wrong);
                            kotlin.jvm.internal.i.f(string4, "getString(R.string.depressionThoughtsQuiz4Wrong)");
                            String string5 = getString(R.string.depressionThoughtsQuiz4RightDescription);
                            kotlin.jvm.internal.i.f(string5, "getString(R.string.depre…htsQuiz4RightDescription)");
                            String string6 = getString(R.string.depressionThoughtsQuiz4WrongDescription);
                            kotlin.jvm.internal.i.f(string6, "getString(R.string.depre…htsQuiz4WrongDescription)");
                            String string7 = getString(R.string.depressionThoughtsQuiz4Head);
                            kotlin.jvm.internal.i.f(string7, "getString(R.string.depressionThoughtsQuiz4Head)");
                            String string8 = getString(R.string.depressionThoughtsQuiz4SubHead);
                            kotlin.jvm.internal.i.f(string8, "getString(R.string.depressionThoughtsQuiz4SubHead)");
                            String string9 = getString(R.string.depressionThoughtsQuiz4RightCTA);
                            kotlin.jvm.internal.i.f(string9, "getString(R.string.depre…ionThoughtsQuiz4RightCTA)");
                            String string10 = getString(R.string.depressionThoughtsQuiz4WrongCTA);
                            kotlin.jvm.internal.i.f(string10, "getString(R.string.depre…ionThoughtsQuiz4WrongCTA)");
                            J(string, string2, string3, string4, string5, string6, 2, string7, string8, string9, string10);
                        }
                    } else {
                        String string11 = getString(R.string.depressionThoughtsQuiz3Option1);
                        kotlin.jvm.internal.i.f(string11, "getString(R.string.depressionThoughtsQuiz3Option1)");
                        String string12 = getString(R.string.depressionThoughtsQuiz3Option2);
                        kotlin.jvm.internal.i.f(string12, "getString(R.string.depressionThoughtsQuiz3Option2)");
                        String string13 = getString(R.string.depressionThoughtsQuiz3Right);
                        kotlin.jvm.internal.i.f(string13, "getString(R.string.depressionThoughtsQuiz3Right)");
                        String string14 = getString(R.string.depressionThoughtsQuiz3Wrong);
                        kotlin.jvm.internal.i.f(string14, "getString(R.string.depressionThoughtsQuiz3Wrong)");
                        String string15 = getString(R.string.depressionThoughtsQuiz3RightDescription);
                        kotlin.jvm.internal.i.f(string15, "getString(R.string.depre…htsQuiz3RightDescription)");
                        String string16 = getString(R.string.depressionThoughtsQuiz3WrongDescription);
                        kotlin.jvm.internal.i.f(string16, "getString(R.string.depre…htsQuiz3WrongDescription)");
                        String string17 = getString(R.string.depressionThoughtsQuiz3Head);
                        kotlin.jvm.internal.i.f(string17, "getString(R.string.depressionThoughtsQuiz3Head)");
                        String string18 = getString(R.string.depressionThoughtsQuiz3SubHead);
                        kotlin.jvm.internal.i.f(string18, "getString(R.string.depressionThoughtsQuiz3SubHead)");
                        String string19 = getString(R.string.depressionThoughtsQuiz3RightCTA);
                        kotlin.jvm.internal.i.f(string19, "getString(R.string.depre…ionThoughtsQuiz3RightCTA)");
                        String string20 = getString(R.string.depressionThoughtsQuiz3WrongCTA);
                        kotlin.jvm.internal.i.f(string20, "getString(R.string.depre…ionThoughtsQuiz3WrongCTA)");
                        J(string11, string12, string13, string14, string15, string16, 1, string17, string18, string19, string20);
                    }
                } else {
                    String string21 = getString(R.string.depressionThoughtsQuiz2Option1);
                    kotlin.jvm.internal.i.f(string21, "getString(R.string.depressionThoughtsQuiz2Option1)");
                    String string22 = getString(R.string.depressionThoughtsQuiz2Option2);
                    kotlin.jvm.internal.i.f(string22, "getString(R.string.depressionThoughtsQuiz2Option2)");
                    String string23 = getString(R.string.depressionThoughtsQuiz2Right);
                    kotlin.jvm.internal.i.f(string23, "getString(R.string.depressionThoughtsQuiz2Right)");
                    String string24 = getString(R.string.depressionThoughtsQuiz2Wrong);
                    kotlin.jvm.internal.i.f(string24, "getString(R.string.depressionThoughtsQuiz2Wrong)");
                    String string25 = getString(R.string.depressionThoughtsQuiz2RightDescription);
                    kotlin.jvm.internal.i.f(string25, "getString(R.string.depre…htsQuiz2RightDescription)");
                    String string26 = getString(R.string.depressionThoughtsQuiz2WrongDescription);
                    kotlin.jvm.internal.i.f(string26, "getString(R.string.depre…htsQuiz2WrongDescription)");
                    String string27 = getString(R.string.depressionThoughtsQuiz2Head);
                    kotlin.jvm.internal.i.f(string27, "getString(R.string.depressionThoughtsQuiz2Head)");
                    String string28 = getString(R.string.depressionThoughtsQuiz2SubHead);
                    kotlin.jvm.internal.i.f(string28, "getString(R.string.depressionThoughtsQuiz2SubHead)");
                    String string29 = getString(R.string.depressionThoughtsQuiz2RightCTA);
                    kotlin.jvm.internal.i.f(string29, "getString(R.string.depre…ionThoughtsQuiz2RightCTA)");
                    String string30 = getString(R.string.depressionThoughtsQuiz2WrongCTA);
                    kotlin.jvm.internal.i.f(string30, "getString(R.string.depre…ionThoughtsQuiz2WrongCTA)");
                    J(string21, string22, string23, string24, string25, string26, 1, string27, string28, string29, string30);
                }
            } else {
                String string31 = getString(R.string.depressionThoughtsQuiz1Option1);
                kotlin.jvm.internal.i.f(string31, "getString(R.string.depressionThoughtsQuiz1Option1)");
                String string32 = getString(R.string.depressionThoughtsQuiz1Option2);
                kotlin.jvm.internal.i.f(string32, "getString(R.string.depressionThoughtsQuiz1Option2)");
                String string33 = getString(R.string.depressionThoughtsQuiz1Right);
                kotlin.jvm.internal.i.f(string33, "getString(R.string.depressionThoughtsQuiz1Right)");
                String string34 = getString(R.string.depressionThoughtsQuiz1Wrong);
                kotlin.jvm.internal.i.f(string34, "getString(R.string.depressionThoughtsQuiz1Wrong)");
                String string35 = getString(R.string.depressionThoughtsQuiz1RightDesription);
                kotlin.jvm.internal.i.f(string35, "getString(R.string.depre…ghtsQuiz1RightDesription)");
                String string36 = getString(R.string.depressionThoughtsQuiz1WrongDescription);
                kotlin.jvm.internal.i.f(string36, "getString(R.string.depre…htsQuiz1WrongDescription)");
                String string37 = getString(R.string.depressionThoughtsQuiz1Head);
                kotlin.jvm.internal.i.f(string37, "getString(R.string.depressionThoughtsQuiz1Head)");
                String string38 = getString(R.string.depressionThoughtsQuiz1SubHead);
                kotlin.jvm.internal.i.f(string38, "getString(R.string.depressionThoughtsQuiz1SubHead)");
                String string39 = getString(R.string.depressionThoughtsQuiz1RightCTA);
                kotlin.jvm.internal.i.f(string39, "getString(R.string.depre…ionThoughtsQuiz1RightCTA)");
                String string40 = getString(R.string.depressionThoughtsQuiz1WrongCTA);
                kotlin.jvm.internal.i.f(string40, "getString(R.string.depre…ionThoughtsQuiz1WrongCTA)");
                J(string31, string32, string33, string34, string35, string36, 2, string37, string38, string39, string40);
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f30922u, "Depression Thoughts Assessment", e10);
        }
    }
}
