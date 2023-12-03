package ek;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.model.Course;
import com.theinnerhour.b2b.model.CourseDayModel;
import com.theinnerhour.b2b.model.CourseHeroBannerModel;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import java.util.ArrayList;
/* compiled from: SevenDayAdapter.kt */
/* loaded from: classes2.dex */
public final class l1 extends RecyclerView.e<a> {
    public final int A;
    public final ArrayList<CourseDayModel> B;

    /* renamed from: x  reason: collision with root package name */
    public final Activity f14207x;

    /* renamed from: y  reason: collision with root package name */
    public final Course f14208y;

    /* renamed from: z  reason: collision with root package name */
    public final String f14209z;

    /* compiled from: SevenDayAdapter.kt */
    /* loaded from: classes2.dex */
    public final class a extends RecyclerView.c0 {
        public a(View view) {
            super(view);
        }
    }

    public l1(Activity activity, Course course, int i6) {
        kotlin.jvm.internal.i.g(activity, "activity");
        this.f14207x = activity;
        this.f14208y = course;
        this.f14209z = LogHelper.INSTANCE.makeLogTag(l1.class);
        Object systemService = activity.getSystemService("layout_inflater");
        kotlin.jvm.internal.i.e(systemService, "null cannot be cast to non-null type android.view.LayoutInflater");
        LayoutInflater layoutInflater = (LayoutInflater) systemService;
        this.A = 1;
        ArrayList<CourseDayModel> arrayList = new ArrayList<>();
        this.B = arrayList;
        this.A = i6;
        arrayList.clear();
        if (i6 != 1) {
            if (i6 != 2) {
                if (i6 != 3) {
                    if (i6 == 4) {
                        if (course.getPlan().size() > 28) {
                            for (int i10 = 22; i10 < 29; i10++) {
                                arrayList.add(course.getPlan().get(i10));
                            }
                            return;
                        }
                        for (int i11 = 21; i11 < 28; i11++) {
                            arrayList.add(course.getPlan().get(i11));
                        }
                        return;
                    }
                    return;
                } else if (course.getPlan().size() > 28) {
                    for (int i12 = 15; i12 < 22; i12++) {
                        arrayList.add(course.getPlan().get(i12));
                    }
                    return;
                } else {
                    for (int i13 = 14; i13 < 21; i13++) {
                        arrayList.add(course.getPlan().get(i13));
                    }
                    return;
                }
            } else if (course.getPlan().size() > 28) {
                for (int i14 = 8; i14 < 15; i14++) {
                    arrayList.add(course.getPlan().get(i14));
                }
                return;
            } else {
                for (int i15 = 7; i15 < 14; i15++) {
                    arrayList.add(course.getPlan().get(i15));
                }
                return;
            }
        }
        int i16 = 0;
        if (course.getPlan().size() > 28) {
            while (i16 < 8) {
                arrayList.add(course.getPlan().get(i16));
                i16++;
            }
            return;
        }
        while (i16 < 7) {
            arrayList.add(course.getPlan().get(i16));
            i16++;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final int f() {
        return this.B.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final void n(a aVar, int i6) {
        a aVar2 = aVar;
        try {
            int size = this.f14208y.getPlan().size();
            Activity activity = this.f14207x;
            View view = aVar2.f2751a;
            if (size > 28 && this.A == 1) {
                ((RobertoTextView) view.findViewById(R.id.rowSevenDayDayText)).setText(gv.n.F0(activity.getResources().getString(R.string.day_x).toString(), "x", String.valueOf(i6)));
            } else {
                ((RobertoTextView) view.findViewById(R.id.rowSevenDayDayText)).setText(gv.n.F0(activity.getResources().getString(R.string.day_x).toString(), "x", String.valueOf(i6 + 1)));
            }
            RobertoTextView robertoTextView = (RobertoTextView) view.findViewById(R.id.rowSevenDayActivityName);
            ArrayList<CourseDayModel> arrayList = this.B;
            CourseHeroBannerModel hero_banner = arrayList.get(i6).getHero_banner();
            kotlin.jvm.internal.i.d(hero_banner);
            robertoTextView.setText(hero_banner.getTitle());
            if (arrayList.get(i6).isCompleted()) {
                ((AppCompatImageView) view.findViewById(R.id.rowSevenDayDayTick)).setBackgroundResource(R.drawable.circle_filled_grey_high_contrast);
                ((AppCompatImageView) view.findViewById(R.id.rowSevenDayDayTick)).setColorFilter(g0.a.b(activity, R.color.white));
            } else {
                ((AppCompatImageView) view.findViewById(R.id.rowSevenDayDayTick)).setBackgroundResource(R.drawable.circle_hollow_grey_high_contrast);
                ((AppCompatImageView) view.findViewById(R.id.rowSevenDayDayTick)).setColorFilter(g0.a.b(activity, R.color.grey_high_contrast));
            }
            if (i6 == arrayList.size() - 1) {
                view.findViewById(R.id.rowSevenDayVerticalLine).setVisibility(4);
            } else {
                view.findViewById(R.id.rowSevenDayVerticalLine).setVisibility(0);
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f14209z, "exception", e10);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final RecyclerView.c0 p(int i6, RecyclerView recyclerView) {
        View itemView = defpackage.b.e(recyclerView, "parent", R.layout.row_seven_day, recyclerView, false);
        kotlin.jvm.internal.i.f(itemView, "itemView");
        return new a(itemView);
    }
}
