package ek;

import android.app.Activity;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Toast;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.activity.MiniCourseActivity;
import com.theinnerhour.b2b.model.CourseDayModelV1;
import com.theinnerhour.b2b.utils.Constants;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.utils.Utils;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import java.util.ArrayList;
/* compiled from: MiniCoursesAadapter.kt */
/* loaded from: classes2.dex */
public final class g1 extends RecyclerView.e<a> {
    public final ss.p<CourseDayModelV1, Integer, hs.k> A;
    public final String B;
    public final long C;
    public final int D;
    public final int E;
    public int F;

    /* renamed from: x  reason: collision with root package name */
    public final Activity f14145x;

    /* renamed from: y  reason: collision with root package name */
    public final boolean f14146y;

    /* renamed from: z  reason: collision with root package name */
    public final ArrayList<CourseDayModelV1> f14147z;

    /* compiled from: MiniCoursesAadapter.kt */
    /* loaded from: classes2.dex */
    public final class a extends RecyclerView.c0 {
        public a(View view) {
            super(view);
        }
    }

    public g1(Activity activity, boolean z10, ArrayList plan, MiniCourseActivity.c cVar) {
        kotlin.jvm.internal.i.g(activity, "activity");
        kotlin.jvm.internal.i.g(plan, "plan");
        this.f14145x = activity;
        this.f14146y = z10;
        this.f14147z = plan;
        this.A = cVar;
        this.B = LogHelper.INSTANCE.makeLogTag(g1.class);
        this.C = Utils.INSTANCE.getTodayTimeInSeconds();
        Object systemService = activity.getSystemService("layout_inflater");
        kotlin.jvm.internal.i.e(systemService, "null cannot be cast to non-null type android.view.LayoutInflater");
        LayoutInflater layoutInflater = (LayoutInflater) systemService;
        this.D = 1;
        this.E = 2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final int f() {
        return this.f14147z.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final int h(int i6) {
        CourseDayModelV1 courseDayModelV1;
        ArrayList<CourseDayModelV1> arrayList = this.f14147z;
        if (i6 == 0) {
            courseDayModelV1 = arrayList.get(i6);
        } else {
            courseDayModelV1 = arrayList.get(i6 - 1);
        }
        CourseDayModelV1 courseDayModelV12 = courseDayModelV1;
        kotlin.jvm.internal.i.f(courseDayModelV12, "if (position == 0) plan[…n] else plan[position -1]");
        if (!this.f14146y) {
            return this.E;
        }
        if (i6 != 0 && arrayList.get(i6).getStart_date() == 0 && (arrayList.get(i6).getStart_date() != 0 || courseDayModelV12.getStart_date() == 0 || courseDayModelV12.getStart_date() >= this.C)) {
            return this.D;
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final void n(a aVar, final int i6) {
        a aVar2 = aVar;
        try {
            int h10 = h(i6);
            Activity activity = this.f14145x;
            ArrayList<CourseDayModelV1> arrayList = this.f14147z;
            View view = aVar2.f2751a;
            if (h10 == 0) {
                int i10 = (int) ((4 * activity.getResources().getDisplayMetrics().density) + 0.5f);
                ((AppCompatImageView) view.findViewById(R.id.basicCourseTickImageView)).setPadding(i10, i10, i10, i10);
                StringBuilder sb2 = new StringBuilder("Day ");
                int i11 = i6 + 1;
                sb2.append(i11);
                ((RobertoTextView) view.findViewById(R.id.basicCourseDayText)).setText(sb2.toString());
                ((RobertoTextView) view.findViewById(R.id.basicCourseTitle)).setText(arrayList.get(i6).getContent_label());
                ((ConstraintLayout) view.findViewById(R.id.basicCourseBackground)).setOnClickListener(new View.OnClickListener(this) { // from class: ek.f1

                    /* renamed from: v  reason: collision with root package name */
                    public final /* synthetic */ g1 f14132v;

                    {
                        this.f14132v = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        int i12 = r3;
                        int i13 = i6;
                        g1 this$0 = this.f14132v;
                        switch (i12) {
                            case 0:
                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                CourseDayModelV1 courseDayModelV1 = this$0.f14147z.get(i13);
                                kotlin.jvm.internal.i.f(courseDayModelV1, "plan[position]");
                                this$0.A.invoke(courseDayModelV1, Integer.valueOf(i13));
                                return;
                            case 1:
                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                CourseDayModelV1 courseDayModelV12 = this$0.f14147z.get(i13);
                                kotlin.jvm.internal.i.f(courseDayModelV12, "plan[position]");
                                this$0.A.invoke(courseDayModelV12, Integer.valueOf(i13));
                                return;
                            case 2:
                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                CourseDayModelV1 courseDayModelV13 = this$0.f14147z.get(i13);
                                kotlin.jvm.internal.i.f(courseDayModelV13, "plan[position]");
                                this$0.A.invoke(courseDayModelV13, Integer.valueOf(i13));
                                return;
                            default:
                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                int i14 = this$0.F;
                                Activity activity2 = this$0.f14145x;
                                if (i14 == i13) {
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
                ((AppCompatImageView) view.findViewById(R.id.basicCourseTickImageView)).setImageDrawable(activity.getDrawable(R.drawable.ic_right));
                ((AppCompatImageView) view.findViewById(R.id.basicCourseTickImageView)).setBackground(activity.getDrawable(R.drawable.circle_blue));
                ((AppCompatImageView) view.findViewById(R.id.basicCourseTickImageView)).setColorFilter(g0.a.b(activity, R.color.white), PorterDuff.Mode.SRC_IN);
                this.F = i11;
                int size = arrayList.size();
                int i12 = this.F;
                if ((size > i12 && arrayList.get(i12).getStart_date() == 0 && arrayList.get(i6).getStart_date() == 0 && (i6 == 0 || arrayList.get(i6 - 1).getStart_date() != 0)) || (arrayList.size() == this.F && arrayList.get(i6).getStart_date() == 0 && arrayList.get(i6 - 1).getStart_date() != 0)) {
                    ((AppCompatImageView) view.findViewById(R.id.basicCourseChevron)).setVisibility(0);
                    ((AppCompatImageView) view.findViewById(R.id.basicCourseTickImageView)).setImageDrawable(null);
                    ((AppCompatImageView) view.findViewById(R.id.basicCourseTickImageView)).setBackground(activity.getDrawable(R.drawable.circle_hollow_title_grey));
                    new Handler().postDelayed(new je.o(15, aVar2), 500L);
                }
            } else if (h10 == this.E) {
                ((AppCompatImageView) view.findViewById(R.id.basicCourseTickImageView)).setPadding(0, 0, 0, 0);
                ((AppCompatImageView) view.findViewById(R.id.basicCourseTickImageView)).setImageDrawable(activity.getDrawable(R.drawable.ic_lock_circle));
                ((AppCompatImageView) view.findViewById(R.id.basicCourseTickImageView)).setColorFilter((ColorFilter) null);
                ((AppCompatImageView) view.findViewById(R.id.basicCourseTickImageView)).setBackground(activity.getDrawable(R.drawable.circle_filled_white));
                ((AppCompatImageView) view.findViewById(R.id.basicCourseChevron)).setVisibility(4);
                ((RobertoTextView) view.findViewById(R.id.basicCourseDayText)).setText("Day " + (i6 + 1));
                Boolean BASIC_COURSE_UNLOCK = Constants.BASIC_COURSE_UNLOCK;
                kotlin.jvm.internal.i.f(BASIC_COURSE_UNLOCK, "BASIC_COURSE_UNLOCK");
                if (BASIC_COURSE_UNLOCK.booleanValue()) {
                    ((RobertoTextView) view.findViewById(R.id.basicCourseTitle)).setText(arrayList.get(i6).getContent_label());
                    view.setOnClickListener(new View.OnClickListener(this) { // from class: ek.f1

                        /* renamed from: v  reason: collision with root package name */
                        public final /* synthetic */ g1 f14132v;

                        {
                            this.f14132v = this;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view2) {
                            int i122 = r3;
                            int i13 = i6;
                            g1 this$0 = this.f14132v;
                            switch (i122) {
                                case 0:
                                    kotlin.jvm.internal.i.g(this$0, "this$0");
                                    CourseDayModelV1 courseDayModelV1 = this$0.f14147z.get(i13);
                                    kotlin.jvm.internal.i.f(courseDayModelV1, "plan[position]");
                                    this$0.A.invoke(courseDayModelV1, Integer.valueOf(i13));
                                    return;
                                case 1:
                                    kotlin.jvm.internal.i.g(this$0, "this$0");
                                    CourseDayModelV1 courseDayModelV12 = this$0.f14147z.get(i13);
                                    kotlin.jvm.internal.i.f(courseDayModelV12, "plan[position]");
                                    this$0.A.invoke(courseDayModelV12, Integer.valueOf(i13));
                                    return;
                                case 2:
                                    kotlin.jvm.internal.i.g(this$0, "this$0");
                                    CourseDayModelV1 courseDayModelV13 = this$0.f14147z.get(i13);
                                    kotlin.jvm.internal.i.f(courseDayModelV13, "plan[position]");
                                    this$0.A.invoke(courseDayModelV13, Integer.valueOf(i13));
                                    return;
                                default:
                                    kotlin.jvm.internal.i.g(this$0, "this$0");
                                    int i14 = this$0.F;
                                    Activity activity2 = this$0.f14145x;
                                    if (i14 == i13) {
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
                view.setOnClickListener(new w5.i0(13, this));
            } else {
                ((AppCompatImageView) view.findViewById(R.id.basicCourseTickImageView)).setPadding(0, 0, 0, 0);
                ((AppCompatImageView) view.findViewById(R.id.basicCourseChevron)).setVisibility(4);
                ((AppCompatImageView) view.findViewById(R.id.basicCourseTickImageView)).setImageDrawable(null);
                ((RobertoTextView) view.findViewById(R.id.basicCourseDayText)).setText("Day " + (i6 + 1));
                ((AppCompatImageView) view.findViewById(R.id.basicCourseTickImageView)).setBackground(activity.getDrawable(R.drawable.circle_hollow_title_grey));
                Boolean BASIC_COURSE_UNLOCK2 = Constants.BASIC_COURSE_UNLOCK;
                kotlin.jvm.internal.i.f(BASIC_COURSE_UNLOCK2, "BASIC_COURSE_UNLOCK");
                if (BASIC_COURSE_UNLOCK2.booleanValue()) {
                    ((RobertoTextView) view.findViewById(R.id.basicCourseTitle)).setText(arrayList.get(i6).getContent_label());
                    view.setOnClickListener(new View.OnClickListener(this) { // from class: ek.f1

                        /* renamed from: v  reason: collision with root package name */
                        public final /* synthetic */ g1 f14132v;

                        {
                            this.f14132v = this;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view2) {
                            int i122 = r3;
                            int i13 = i6;
                            g1 this$0 = this.f14132v;
                            switch (i122) {
                                case 0:
                                    kotlin.jvm.internal.i.g(this$0, "this$0");
                                    CourseDayModelV1 courseDayModelV1 = this$0.f14147z.get(i13);
                                    kotlin.jvm.internal.i.f(courseDayModelV1, "plan[position]");
                                    this$0.A.invoke(courseDayModelV1, Integer.valueOf(i13));
                                    return;
                                case 1:
                                    kotlin.jvm.internal.i.g(this$0, "this$0");
                                    CourseDayModelV1 courseDayModelV12 = this$0.f14147z.get(i13);
                                    kotlin.jvm.internal.i.f(courseDayModelV12, "plan[position]");
                                    this$0.A.invoke(courseDayModelV12, Integer.valueOf(i13));
                                    return;
                                case 2:
                                    kotlin.jvm.internal.i.g(this$0, "this$0");
                                    CourseDayModelV1 courseDayModelV13 = this$0.f14147z.get(i13);
                                    kotlin.jvm.internal.i.f(courseDayModelV13, "plan[position]");
                                    this$0.A.invoke(courseDayModelV13, Integer.valueOf(i13));
                                    return;
                                default:
                                    kotlin.jvm.internal.i.g(this$0, "this$0");
                                    int i14 = this$0.F;
                                    Activity activity2 = this$0.f14145x;
                                    if (i14 == i13) {
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
                view.setOnClickListener(new View.OnClickListener(this) { // from class: ek.f1

                    /* renamed from: v  reason: collision with root package name */
                    public final /* synthetic */ g1 f14132v;

                    {
                        this.f14132v = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        int i122 = r3;
                        int i13 = i6;
                        g1 this$0 = this.f14132v;
                        switch (i122) {
                            case 0:
                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                CourseDayModelV1 courseDayModelV1 = this$0.f14147z.get(i13);
                                kotlin.jvm.internal.i.f(courseDayModelV1, "plan[position]");
                                this$0.A.invoke(courseDayModelV1, Integer.valueOf(i13));
                                return;
                            case 1:
                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                CourseDayModelV1 courseDayModelV12 = this$0.f14147z.get(i13);
                                kotlin.jvm.internal.i.f(courseDayModelV12, "plan[position]");
                                this$0.A.invoke(courseDayModelV12, Integer.valueOf(i13));
                                return;
                            case 2:
                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                CourseDayModelV1 courseDayModelV13 = this$0.f14147z.get(i13);
                                kotlin.jvm.internal.i.f(courseDayModelV13, "plan[position]");
                                this$0.A.invoke(courseDayModelV13, Integer.valueOf(i13));
                                return;
                            default:
                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                int i14 = this$0.F;
                                Activity activity2 = this$0.f14145x;
                                if (i14 == i13) {
                                    Toast.makeText(activity2, "Available tomorrow", 0).show();
                                    return;
                                } else {
                                    Toast.makeText(activity2, "Available later", 0).show();
                                    return;
                                }
                        }
                    }
                });
            }
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
