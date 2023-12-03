package ek;

import android.app.Activity;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Toast;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.model.CourseDayModelV1;
import com.theinnerhour.b2b.utils.Constants;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.utils.Utils;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import g0.a;
import java.util.ArrayList;
/* compiled from: BasicCourseAdapter.kt */
/* loaded from: classes2.dex */
public final class h extends RecyclerView.e<a> {
    public final ss.p<CourseDayModelV1, Integer, hs.k> A;
    public final String B;
    public final long C;
    public final int D;
    public int E;

    /* renamed from: x  reason: collision with root package name */
    public final Activity f14148x;

    /* renamed from: y  reason: collision with root package name */
    public ArrayList<CourseDayModelV1> f14149y;

    /* renamed from: z  reason: collision with root package name */
    public final hs.f<Integer, Integer> f14150z;

    /* compiled from: BasicCourseAdapter.kt */
    /* loaded from: classes2.dex */
    public final class a extends RecyclerView.c0 {
        public a(View view) {
            super(view);
        }
    }

    public h() {
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public h(Activity activity, ArrayList<CourseDayModelV1> plan, hs.f<Integer, Integer> fVar, ss.p<? super CourseDayModelV1, ? super Integer, hs.k> pVar) {
        kotlin.jvm.internal.i.g(activity, "activity");
        kotlin.jvm.internal.i.g(plan, "plan");
        this.f14148x = activity;
        this.f14149y = plan;
        this.f14150z = fVar;
        this.A = pVar;
        this.B = LogHelper.INSTANCE.makeLogTag(h.class);
        this.C = Utils.INSTANCE.getTodayTimeInSeconds();
        Object systemService = activity.getSystemService("layout_inflater");
        kotlin.jvm.internal.i.e(systemService, "null cannot be cast to non-null type android.view.LayoutInflater");
        LayoutInflater layoutInflater = (LayoutInflater) systemService;
        this.D = 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final int f() {
        return this.f14149y.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final int h(int i6) {
        CourseDayModelV1 courseDayModelV1;
        ArrayList<CourseDayModelV1> arrayList = this.f14149y;
        if (i6 == 0) {
            courseDayModelV1 = arrayList.get(i6);
        } else {
            courseDayModelV1 = arrayList.get(i6 - 1);
        }
        CourseDayModelV1 courseDayModelV12 = courseDayModelV1;
        kotlin.jvm.internal.i.f(courseDayModelV12, "if (position == 0) plan[…n] else plan[position -1]");
        if (i6 != 0 && this.f14149y.get(i6).getStart_date() == 0 && (this.f14149y.get(i6).getStart_date() != 0 || courseDayModelV12.getStart_date() == 0 || courseDayModelV12.getStart_date() >= this.C)) {
            return this.D;
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final void n(a aVar, final int i6) {
        a aVar2 = aVar;
        try {
            int h10 = h(i6);
            Activity activity = this.f14148x;
            View view = aVar2.f2751a;
            if (h10 == 0) {
                StringBuilder sb2 = new StringBuilder("Day ");
                int i10 = i6 + 1;
                sb2.append(i10);
                ((RobertoTextView) view.findViewById(R.id.basicCourseDayText)).setText(sb2.toString());
                ((RobertoTextView) view.findViewById(R.id.basicCourseTitle)).setText(this.f14149y.get(i6).getContent_label());
                ((ConstraintLayout) view.findViewById(R.id.basicCourseBackground)).setOnClickListener(new View.OnClickListener(this) { // from class: ek.g

                    /* renamed from: v  reason: collision with root package name */
                    public final /* synthetic */ h f14135v;

                    {
                        this.f14135v = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        int i11 = r3;
                        int i12 = i6;
                        h this$0 = this.f14135v;
                        switch (i11) {
                            case 0:
                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                CourseDayModelV1 courseDayModelV1 = this$0.f14149y.get(i12);
                                kotlin.jvm.internal.i.f(courseDayModelV1, "plan[position]");
                                this$0.A.invoke(courseDayModelV1, Integer.valueOf(i12));
                                return;
                            case 1:
                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                CourseDayModelV1 courseDayModelV12 = this$0.f14149y.get(i12);
                                kotlin.jvm.internal.i.f(courseDayModelV12, "plan[position]");
                                this$0.A.invoke(courseDayModelV12, Integer.valueOf(i12));
                                return;
                            default:
                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                int i13 = this$0.E;
                                Activity activity2 = this$0.f14148x;
                                if (i13 == i12) {
                                    Toast.makeText(activity2, "Available tomorrow", 0).show();
                                    return;
                                } else {
                                    Toast.makeText(activity2, "Available later", 0).show();
                                    return;
                                }
                        }
                    }
                });
                ((AppCompatImageView) view.findViewById(R.id.basicCourseChevron)).setVisibility(4);
                ((AppCompatImageView) view.findViewById(R.id.basicCourseTickImageView)).setColorFilter(g0.a.b(activity, R.color.white), PorterDuff.Mode.SRC_IN);
                ((AppCompatImageView) view.findViewById(R.id.basicCourseTickImageView)).setImageDrawable(a.c.b(activity, R.drawable.ic_round_check));
                ((AppCompatImageView) view.findViewById(R.id.basicCourseTickImageView)).setBackground(a.c.b(activity, R.drawable.circle_blue));
                hs.f<Integer, Integer> fVar = this.f14150z;
                if (fVar != null) {
                    ((AppCompatImageView) view.findViewById(R.id.basicCourseTickImageView)).setBackgroundTintList(ColorStateList.valueOf(g0.a.b(activity, fVar.f19464u.intValue())));
                }
                this.E = i10;
                int size = this.f14149y.size();
                int i11 = this.E;
                if ((size > i11 && this.f14149y.get(i11).getStart_date() == 0 && this.f14149y.get(i6).getStart_date() == 0 && (i6 == 0 || this.f14149y.get(i6 - 1).getStart_date() != 0)) || (this.f14149y.size() == this.E && this.f14149y.get(i6).getStart_date() == 0 && this.f14149y.get(i6 - 1).getStart_date() != 0)) {
                    ((AppCompatImageView) view.findViewById(R.id.basicCourseChevron)).setVisibility(0);
                    if (fVar != null) {
                        ((AppCompatImageView) view.findViewById(R.id.basicCourseChevron)).setBackgroundTintList(ColorStateList.valueOf(g0.a.b(activity, fVar.f19465v.intValue())));
                    }
                    ((AppCompatImageView) view.findViewById(R.id.basicCourseTickImageView)).setImageDrawable(null);
                    ((AppCompatImageView) view.findViewById(R.id.basicCourseTickImageView)).setBackground(activity.getDrawable(R.drawable.circle_hollow_title_grey));
                    ((AppCompatImageView) view.findViewById(R.id.basicCourseTickImageView)).setBackgroundTintList(null);
                    new Handler().postDelayed(new je.o(14, aVar2), 500L);
                    return;
                }
                return;
            }
            ((AppCompatImageView) view.findViewById(R.id.basicCourseChevron)).setVisibility(4);
            ((AppCompatImageView) view.findViewById(R.id.basicCourseTickImageView)).setImageDrawable(null);
            ((RobertoTextView) view.findViewById(R.id.basicCourseDayText)).setText("Day " + (i6 + 1));
            ((AppCompatImageView) view.findViewById(R.id.basicCourseTickImageView)).setBackground(activity.getDrawable(R.drawable.circle_hollow_title_grey));
            ((AppCompatImageView) view.findViewById(R.id.basicCourseTickImageView)).setBackgroundTintList(null);
            Boolean BASIC_COURSE_UNLOCK = Constants.BASIC_COURSE_UNLOCK;
            kotlin.jvm.internal.i.f(BASIC_COURSE_UNLOCK, "BASIC_COURSE_UNLOCK");
            if (BASIC_COURSE_UNLOCK.booleanValue()) {
                ((RobertoTextView) view.findViewById(R.id.basicCourseTitle)).setText(this.f14149y.get(i6).getContent_label());
                view.setOnClickListener(new View.OnClickListener(this) { // from class: ek.g

                    /* renamed from: v  reason: collision with root package name */
                    public final /* synthetic */ h f14135v;

                    {
                        this.f14135v = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        int i112 = r3;
                        int i12 = i6;
                        h this$0 = this.f14135v;
                        switch (i112) {
                            case 0:
                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                CourseDayModelV1 courseDayModelV1 = this$0.f14149y.get(i12);
                                kotlin.jvm.internal.i.f(courseDayModelV1, "plan[position]");
                                this$0.A.invoke(courseDayModelV1, Integer.valueOf(i12));
                                return;
                            case 1:
                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                CourseDayModelV1 courseDayModelV12 = this$0.f14149y.get(i12);
                                kotlin.jvm.internal.i.f(courseDayModelV12, "plan[position]");
                                this$0.A.invoke(courseDayModelV12, Integer.valueOf(i12));
                                return;
                            default:
                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                int i13 = this$0.E;
                                Activity activity2 = this$0.f14148x;
                                if (i13 == i12) {
                                    Toast.makeText(activity2, "Available tomorrow", 0).show();
                                    return;
                                } else {
                                    Toast.makeText(activity2, "Available later", 0).show();
                                    return;
                                }
                        }
                    }
                });
                return;
            }
            ((RobertoTextView) view.findViewById(R.id.basicCourseTitle)).setText("Locked");
            view.setOnClickListener(new View.OnClickListener(this) { // from class: ek.g

                /* renamed from: v  reason: collision with root package name */
                public final /* synthetic */ h f14135v;

                {
                    this.f14135v = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    int i112 = r3;
                    int i12 = i6;
                    h this$0 = this.f14135v;
                    switch (i112) {
                        case 0:
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            CourseDayModelV1 courseDayModelV1 = this$0.f14149y.get(i12);
                            kotlin.jvm.internal.i.f(courseDayModelV1, "plan[position]");
                            this$0.A.invoke(courseDayModelV1, Integer.valueOf(i12));
                            return;
                        case 1:
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            CourseDayModelV1 courseDayModelV12 = this$0.f14149y.get(i12);
                            kotlin.jvm.internal.i.f(courseDayModelV12, "plan[position]");
                            this$0.A.invoke(courseDayModelV12, Integer.valueOf(i12));
                            return;
                        default:
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            int i13 = this$0.E;
                            Activity activity2 = this$0.f14148x;
                            if (i13 == i12) {
                                Toast.makeText(activity2, "Available tomorrow", 0).show();
                                return;
                            } else {
                                Toast.makeText(activity2, "Available later", 0).show();
                                return;
                            }
                    }
                }
            });
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.B, "exception", e10);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final RecyclerView.c0 p(int i6, RecyclerView recyclerView) {
        View itemView = defpackage.b.e(recyclerView, "parent", R.layout.row_basic_course, recyclerView, false);
        kotlin.jvm.internal.i.f(itemView, "itemView");
        return new a(itemView);
    }
}
