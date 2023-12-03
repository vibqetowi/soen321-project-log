package hl;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.RotateAnimation;
import androidx.appcompat.widget.AppCompatImageView;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.model.User;
import com.theinnerhour.b2b.persistence.FirebasePersistence;
import com.theinnerhour.b2b.utils.Constants;
import com.theinnerhour.b2b.utils.Utils;
import com.theinnerhour.b2b.widgets.CircleImageView;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import java.util.LinkedHashMap;
import kotlin.Metadata;
/* compiled from: CustomNavHeaderFragment.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lhl/j;", "Lhl/a;", "<init>", "()V", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class j extends a {

    /* renamed from: x  reason: collision with root package name */
    public static final /* synthetic */ int f17701x = 0;

    /* renamed from: v  reason: collision with root package name */
    public il.b f17702v;

    /* renamed from: w  reason: collision with root package name */
    public final LinkedHashMap f17703w = new LinkedHashMap();

    @Override // hl.a
    public final void F() {
        I();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x012f, code lost:
        if (r0 == null) goto L77;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void I() {
        String str;
        String str2;
        String firstName;
        RobertoTextView robertoTextView = (RobertoTextView) _$_findCachedViewById(R.id.tvCustomDbCurrentCourse);
        if (robertoTextView != null) {
            User user = FirebasePersistence.getInstance().getUser();
            String str3 = null;
            if (user != null) {
                str = user.getCurrentCourseName();
            } else {
                str = null;
            }
            if (str != null) {
                switch (str.hashCode()) {
                    case -2114782937:
                        if (str.equals(Constants.COURSE_HAPPINESS)) {
                            RobertoTextView robertoTextView2 = (RobertoTextView) _$_findCachedViewById(R.id.tvCustomDbCurrentCourse);
                            if (robertoTextView2 != null) {
                                robertoTextView2.setTextSize(2, 20.0f);
                            }
                            str2 = Constants.COURSE_HAPPINESS_DN;
                            break;
                        }
                        break;
                    case -1617042330:
                        if (str.equals(Constants.COURSE_DEPRESSION)) {
                            RobertoTextView robertoTextView3 = (RobertoTextView) _$_findCachedViewById(R.id.tvCustomDbCurrentCourse);
                            if (robertoTextView3 != null) {
                                robertoTextView3.setTextSize(2, 20.0f);
                            }
                            str2 = Constants.COURSE_DEPRESSION_DN;
                            break;
                        }
                        break;
                    case -891989580:
                        if (str.equals(Constants.COURSE_STRESS)) {
                            RobertoTextView robertoTextView4 = (RobertoTextView) _$_findCachedViewById(R.id.tvCustomDbCurrentCourse);
                            if (robertoTextView4 != null) {
                                robertoTextView4.setTextSize(2, 20.0f);
                            }
                            str2 = Constants.COURSE_STRESS_DN;
                            break;
                        }
                        break;
                    case 109840:
                        if (str.equals(Constants.COURSE_OCD)) {
                            RobertoTextView robertoTextView5 = (RobertoTextView) _$_findCachedViewById(R.id.tvCustomDbCurrentCourse);
                            if (robertoTextView5 != null) {
                                robertoTextView5.setTextSize(2, 20.0f);
                            }
                            str2 = Constants.COURSE_OCD_DN;
                            break;
                        }
                        break;
                    case 2989151:
                        if (str.equals(Constants.COURSE_ADHD)) {
                            RobertoTextView robertoTextView6 = (RobertoTextView) _$_findCachedViewById(R.id.tvCustomDbCurrentCourse);
                            if (robertoTextView6 != null) {
                                robertoTextView6.setTextSize(2, 18.0f);
                            }
                            str2 = Constants.COURSE_ADHD_DN;
                            break;
                        }
                        break;
                    case 92960775:
                        if (str.equals(Constants.COURSE_ANGER)) {
                            RobertoTextView robertoTextView7 = (RobertoTextView) _$_findCachedViewById(R.id.tvCustomDbCurrentCourse);
                            if (robertoTextView7 != null) {
                                robertoTextView7.setTextSize(2, 20.0f);
                            }
                            str2 = Constants.COURSE_ANGER_DN;
                            break;
                        }
                        break;
                    case 109522647:
                        if (str.equals(Constants.COURSE_SLEEP)) {
                            RobertoTextView robertoTextView8 = (RobertoTextView) _$_findCachedViewById(R.id.tvCustomDbCurrentCourse);
                            if (robertoTextView8 != null) {
                                robertoTextView8.setTextSize(2, 20.0f);
                            }
                            str2 = Constants.COURSE_SLEEP_DN;
                            break;
                        }
                        break;
                    case 113319009:
                        if (str.equals(Constants.COURSE_WORRY)) {
                            RobertoTextView robertoTextView9 = (RobertoTextView) _$_findCachedViewById(R.id.tvCustomDbCurrentCourse);
                            if (robertoTextView9 != null) {
                                robertoTextView9.setTextSize(2, 20.0f);
                            }
                            str2 = Constants.COURSE_WORRY_DN;
                            break;
                        }
                        break;
                }
                robertoTextView.setText(str2);
            }
            RobertoTextView robertoTextView10 = (RobertoTextView) _$_findCachedViewById(R.id.tvCustomDbCurrentCourse);
            if (robertoTextView10 != null) {
                robertoTextView10.setTextSize(2, 20.0f);
            }
            User user2 = FirebasePersistence.getInstance().getUser();
            if (user2 != null && (firstName = user2.getFirstName()) != null) {
                if (!gv.n.B0(firstName)) {
                    str3 = firstName;
                }
                if (str3 != null) {
                    RobertoTextView robertoTextView11 = (RobertoTextView) _$_findCachedViewById(R.id.tvCustomDbCurrentCourse);
                    if (robertoTextView11 != null) {
                        robertoTextView11.setEllipsize(TextUtils.TruncateAt.END);
                    }
                    str2 = getString(R.string.expertCareDashboardHeader, str3);
                }
            }
            str2 = Constants.COURSE_EXPERT_CARE_DN;
            robertoTextView.setText(str2);
        }
    }

    @Override // hl.a
    public final void _$_clearFindViewByIdCache() {
        this.f17703w.clear();
    }

    public final View _$_findCachedViewById(int i6) {
        View findViewById;
        LinkedHashMap linkedHashMap = this.f17703w;
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
    public final void onAttach(Context context) {
        kotlin.jvm.internal.i.g(context, "context");
        super.onAttach(context);
        if (context instanceof il.b) {
            this.f17702v = (il.b) context;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        kotlin.jvm.internal.i.g(inflater, "inflater");
        return inflater.inflate(R.layout.fragment_custom_nav_header, viewGroup, false);
    }

    @Override // hl.a, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        kotlin.jvm.internal.i.g(view, "view");
        super.onViewCreated(view, bundle);
        I();
        ((AppCompatImageView) _$_findCachedViewById(R.id.ivCustomDbLeftMenu)).setOnClickListener(new View.OnClickListener(this) { // from class: hl.i

            /* renamed from: v  reason: collision with root package name */
            public final /* synthetic */ j f17700v;

            {
                this.f17700v = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                RotateAnimation rotateBy180;
                RotateAnimation rotateBy1802;
                int i6 = r2;
                boolean z10 = false;
                j this$0 = this.f17700v;
                switch (i6) {
                    case 0:
                        int i10 = j.f17701x;
                        kotlin.jvm.internal.i.g(this$0, "this$0");
                        il.b bVar = this$0.f17702v;
                        if (bVar != null) {
                            bVar.R();
                            return;
                        }
                        return;
                    case 1:
                        int i11 = j.f17701x;
                        kotlin.jvm.internal.i.g(this$0, "this$0");
                        il.b bVar2 = this$0.f17702v;
                        if (bVar2 != null) {
                            z10 = bVar2.Y();
                        }
                        AppCompatImageView appCompatImageView = (AppCompatImageView) this$0._$_findCachedViewById(R.id.ivCustomDbSwitchCourse);
                        if (z10) {
                            rotateBy180 = Utils.INSTANCE.rotateBy180(0.0f, 180.0f);
                        } else {
                            rotateBy180 = Utils.INSTANCE.rotateBy180(180.0f, 360.0f);
                        }
                        appCompatImageView.startAnimation(rotateBy180);
                        return;
                    case 2:
                        int i12 = j.f17701x;
                        kotlin.jvm.internal.i.g(this$0, "this$0");
                        il.b bVar3 = this$0.f17702v;
                        if (bVar3 != null) {
                            z10 = bVar3.Y();
                        }
                        AppCompatImageView appCompatImageView2 = (AppCompatImageView) this$0._$_findCachedViewById(R.id.ivCustomDbSwitchCourse);
                        if (z10) {
                            rotateBy1802 = Utils.INSTANCE.rotateBy180(0.0f, 180.0f);
                        } else {
                            rotateBy1802 = Utils.INSTANCE.rotateBy180(180.0f, 360.0f);
                        }
                        appCompatImageView2.startAnimation(rotateBy1802);
                        return;
                    default:
                        int i13 = j.f17701x;
                        kotlin.jvm.internal.i.g(this$0, "this$0");
                        il.b bVar4 = this$0.f17702v;
                        if (bVar4 != null) {
                            bVar4.m();
                            return;
                        }
                        return;
                }
            }
        });
        RobertoTextView robertoTextView = (RobertoTextView) _$_findCachedViewById(R.id.tvCustomDbCurrentCourse);
        if (robertoTextView != null) {
            robertoTextView.setOnClickListener(new View.OnClickListener(this) { // from class: hl.i

                /* renamed from: v  reason: collision with root package name */
                public final /* synthetic */ j f17700v;

                {
                    this.f17700v = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    RotateAnimation rotateBy180;
                    RotateAnimation rotateBy1802;
                    int i6 = r2;
                    boolean z10 = false;
                    j this$0 = this.f17700v;
                    switch (i6) {
                        case 0:
                            int i10 = j.f17701x;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            il.b bVar = this$0.f17702v;
                            if (bVar != null) {
                                bVar.R();
                                return;
                            }
                            return;
                        case 1:
                            int i11 = j.f17701x;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            il.b bVar2 = this$0.f17702v;
                            if (bVar2 != null) {
                                z10 = bVar2.Y();
                            }
                            AppCompatImageView appCompatImageView = (AppCompatImageView) this$0._$_findCachedViewById(R.id.ivCustomDbSwitchCourse);
                            if (z10) {
                                rotateBy180 = Utils.INSTANCE.rotateBy180(0.0f, 180.0f);
                            } else {
                                rotateBy180 = Utils.INSTANCE.rotateBy180(180.0f, 360.0f);
                            }
                            appCompatImageView.startAnimation(rotateBy180);
                            return;
                        case 2:
                            int i12 = j.f17701x;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            il.b bVar3 = this$0.f17702v;
                            if (bVar3 != null) {
                                z10 = bVar3.Y();
                            }
                            AppCompatImageView appCompatImageView2 = (AppCompatImageView) this$0._$_findCachedViewById(R.id.ivCustomDbSwitchCourse);
                            if (z10) {
                                rotateBy1802 = Utils.INSTANCE.rotateBy180(0.0f, 180.0f);
                            } else {
                                rotateBy1802 = Utils.INSTANCE.rotateBy180(180.0f, 360.0f);
                            }
                            appCompatImageView2.startAnimation(rotateBy1802);
                            return;
                        default:
                            int i13 = j.f17701x;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            il.b bVar4 = this$0.f17702v;
                            if (bVar4 != null) {
                                bVar4.m();
                                return;
                            }
                            return;
                    }
                }
            });
        }
        AppCompatImageView appCompatImageView = (AppCompatImageView) _$_findCachedViewById(R.id.ivCustomDbSwitchCourse);
        if (appCompatImageView != null) {
            appCompatImageView.setOnClickListener(new View.OnClickListener(this) { // from class: hl.i

                /* renamed from: v  reason: collision with root package name */
                public final /* synthetic */ j f17700v;

                {
                    this.f17700v = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    RotateAnimation rotateBy180;
                    RotateAnimation rotateBy1802;
                    int i6 = r2;
                    boolean z10 = false;
                    j this$0 = this.f17700v;
                    switch (i6) {
                        case 0:
                            int i10 = j.f17701x;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            il.b bVar = this$0.f17702v;
                            if (bVar != null) {
                                bVar.R();
                                return;
                            }
                            return;
                        case 1:
                            int i11 = j.f17701x;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            il.b bVar2 = this$0.f17702v;
                            if (bVar2 != null) {
                                z10 = bVar2.Y();
                            }
                            AppCompatImageView appCompatImageView2 = (AppCompatImageView) this$0._$_findCachedViewById(R.id.ivCustomDbSwitchCourse);
                            if (z10) {
                                rotateBy180 = Utils.INSTANCE.rotateBy180(0.0f, 180.0f);
                            } else {
                                rotateBy180 = Utils.INSTANCE.rotateBy180(180.0f, 360.0f);
                            }
                            appCompatImageView2.startAnimation(rotateBy180);
                            return;
                        case 2:
                            int i12 = j.f17701x;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            il.b bVar3 = this$0.f17702v;
                            if (bVar3 != null) {
                                z10 = bVar3.Y();
                            }
                            AppCompatImageView appCompatImageView22 = (AppCompatImageView) this$0._$_findCachedViewById(R.id.ivCustomDbSwitchCourse);
                            if (z10) {
                                rotateBy1802 = Utils.INSTANCE.rotateBy180(0.0f, 180.0f);
                            } else {
                                rotateBy1802 = Utils.INSTANCE.rotateBy180(180.0f, 360.0f);
                            }
                            appCompatImageView22.startAnimation(rotateBy1802);
                            return;
                        default:
                            int i13 = j.f17701x;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            il.b bVar4 = this$0.f17702v;
                            if (bVar4 != null) {
                                bVar4.m();
                                return;
                            }
                            return;
                    }
                }
            });
        }
        CircleImageView circleImageView = (CircleImageView) _$_findCachedViewById(R.id.ivCustomDbProfileLogo);
        if (circleImageView != null) {
            circleImageView.setOnClickListener(new View.OnClickListener(this) { // from class: hl.i

                /* renamed from: v  reason: collision with root package name */
                public final /* synthetic */ j f17700v;

                {
                    this.f17700v = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    RotateAnimation rotateBy180;
                    RotateAnimation rotateBy1802;
                    int i6 = r2;
                    boolean z10 = false;
                    j this$0 = this.f17700v;
                    switch (i6) {
                        case 0:
                            int i10 = j.f17701x;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            il.b bVar = this$0.f17702v;
                            if (bVar != null) {
                                bVar.R();
                                return;
                            }
                            return;
                        case 1:
                            int i11 = j.f17701x;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            il.b bVar2 = this$0.f17702v;
                            if (bVar2 != null) {
                                z10 = bVar2.Y();
                            }
                            AppCompatImageView appCompatImageView2 = (AppCompatImageView) this$0._$_findCachedViewById(R.id.ivCustomDbSwitchCourse);
                            if (z10) {
                                rotateBy180 = Utils.INSTANCE.rotateBy180(0.0f, 180.0f);
                            } else {
                                rotateBy180 = Utils.INSTANCE.rotateBy180(180.0f, 360.0f);
                            }
                            appCompatImageView2.startAnimation(rotateBy180);
                            return;
                        case 2:
                            int i12 = j.f17701x;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            il.b bVar3 = this$0.f17702v;
                            if (bVar3 != null) {
                                z10 = bVar3.Y();
                            }
                            AppCompatImageView appCompatImageView22 = (AppCompatImageView) this$0._$_findCachedViewById(R.id.ivCustomDbSwitchCourse);
                            if (z10) {
                                rotateBy1802 = Utils.INSTANCE.rotateBy180(0.0f, 180.0f);
                            } else {
                                rotateBy1802 = Utils.INSTANCE.rotateBy180(180.0f, 360.0f);
                            }
                            appCompatImageView22.startAnimation(rotateBy1802);
                            return;
                        default:
                            int i13 = j.f17701x;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            il.b bVar4 = this$0.f17702v;
                            if (bVar4 != null) {
                                bVar4.m();
                                return;
                            }
                            return;
                    }
                }
            });
        }
    }
}
