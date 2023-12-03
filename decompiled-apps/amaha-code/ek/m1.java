package ek;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.model.Course;
import com.theinnerhour.b2b.model.CourseDayModelV1;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import java.util.ArrayList;
/* compiled from: SevenDayAdapterV3.kt */
/* loaded from: classes2.dex */
public final class m1 extends RecyclerView.e<a> {

    /* renamed from: x  reason: collision with root package name */
    public final Activity f14218x;

    /* renamed from: y  reason: collision with root package name */
    public final String f14219y;

    /* renamed from: z  reason: collision with root package name */
    public final ArrayList<CourseDayModelV1> f14220z;

    /* compiled from: SevenDayAdapterV3.kt */
    /* loaded from: classes2.dex */
    public final class a extends RecyclerView.c0 {
        public a(View view) {
            super(view);
        }
    }

    public m1(Activity activity, Course course, int i6) {
        kotlin.jvm.internal.i.g(activity, "activity");
        this.f14218x = activity;
        this.f14219y = LogHelper.INSTANCE.makeLogTag(m1.class);
        Object systemService = activity.getSystemService("layout_inflater");
        kotlin.jvm.internal.i.e(systemService, "null cannot be cast to non-null type android.view.LayoutInflater");
        LayoutInflater layoutInflater = (LayoutInflater) systemService;
        ArrayList<CourseDayModelV1> arrayList = new ArrayList<>();
        this.f14220z = arrayList;
        arrayList.clear();
        if (i6 != 1) {
            if (i6 != 2) {
                if (i6 != 3) {
                    if (i6 == 4) {
                        for (int i10 = 23; i10 < 30; i10++) {
                            arrayList.add(course.getPlanV3().get(i10));
                        }
                        return;
                    }
                    return;
                }
                for (int i11 = 16; i11 < 23; i11++) {
                    arrayList.add(course.getPlanV3().get(i11));
                }
                return;
            }
            for (int i12 = 8; i12 < 15; i12++) {
                arrayList.add(course.getPlanV3().get(i12));
            }
            return;
        }
        for (int i13 = 1; i13 < 8; i13++) {
            arrayList.add(course.getPlanV3().get(i13));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final int f() {
        return this.f14220z.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final void n(a aVar, int i6) {
        Activity activity = this.f14218x;
        View view = aVar.f2751a;
        try {
            ((RobertoTextView) view.findViewById(R.id.rowSevenDayDayText)).setText(gv.n.F0(activity.getResources().getString(R.string.day_x).toString(), "x", String.valueOf(i6 + 1)));
            RobertoTextView robertoTextView = (RobertoTextView) view.findViewById(R.id.rowSevenDayActivityName);
            ArrayList<CourseDayModelV1> arrayList = this.f14220z;
            robertoTextView.setText(arrayList.get(i6).getContent_label());
            if (arrayList.get(i6).isCompleted()) {
                ((AppCompatImageView) view.findViewById(R.id.rowSevenDayDayTick)).setBackgroundResource(R.drawable.circle_filled_sea);
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
            LogHelper.INSTANCE.e(this.f14219y, "exception", e10);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final RecyclerView.c0 p(int i6, RecyclerView recyclerView) {
        View itemView = defpackage.b.e(recyclerView, "parent", R.layout.row_seven_day, recyclerView, false);
        kotlin.jvm.internal.i.f(itemView, "itemView");
        return new a(itemView);
    }
}
