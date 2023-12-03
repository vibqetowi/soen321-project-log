package zm;

import android.content.Context;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.components.libraryExperiment.model.UserLibraryItemAccessModel;
import com.theinnerhour.b2b.model.CourseDayModelV1;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import g0.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/* compiled from: LibraryDbShortCourseDayPlanAdapter.kt */
/* loaded from: classes2.dex */
public final class h extends RecyclerView.e<a> {
    public final Context A;
    public final List<hs.f<String, UserLibraryItemAccessModel>> B;
    public final int C;
    public final int D;
    public final int E;
    public final int F;

    /* renamed from: x  reason: collision with root package name */
    public final boolean f39652x;

    /* renamed from: y  reason: collision with root package name */
    public final String f39653y;

    /* renamed from: z  reason: collision with root package name */
    public final ArrayList<CourseDayModelV1> f39654z;

    /* compiled from: LibraryDbShortCourseDayPlanAdapter.kt */
    /* loaded from: classes2.dex */
    public final class a extends RecyclerView.c0 {
        public a(View view) {
            super(view);
        }
    }

    public h(ArrayList arrayList, int i6, int i10, Context context) {
        kotlin.jvm.internal.i.g(context, "context");
        this.f39652x = false;
        this.f39653y = LogHelper.INSTANCE.makeLogTag("LibraryDbShortCourseDayPlanAdapter");
        this.f39654z = new ArrayList<>();
        this.C = 1;
        this.D = 2;
        this.f39654z = arrayList;
        this.A = context;
        this.B = null;
        this.E = i10;
        this.F = i6 == 0 ? i6 + 1 : i6;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final int f() {
        return this.f39654z.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final int h(int i6) {
        CourseDayModelV1 courseDayModelV1;
        boolean z10;
        int i10 = this.C;
        ArrayList<CourseDayModelV1> arrayList = this.f39654z;
        try {
            if (i6 == 0) {
                courseDayModelV1 = arrayList.get(i6);
            } else {
                courseDayModelV1 = arrayList.get(i6 - 1);
            }
            CourseDayModelV1 courseDayModelV12 = courseDayModelV1;
            CourseDayModelV1 courseDayModelV13 = arrayList.get(i6);
            boolean z11 = true;
            if (courseDayModelV13 != null && courseDayModelV13.isCompleted()) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                return this.D;
            }
            if (i6 != 0) {
                if (!((courseDayModelV12 == null || !courseDayModelV12.isCompleted()) ? false : false)) {
                    return i10;
                }
            }
            return 0;
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f39653y, e10);
            return i10;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final void n(a aVar, int i6) {
        Object obj;
        UserLibraryItemAccessModel userLibraryItemAccessModel;
        String str;
        String str2;
        int i10 = this.F;
        Context context = this.A;
        View view = aVar.f2751a;
        try {
            CourseDayModelV1 courseDayModelV1 = this.f39654z.get(i6);
            int h10 = h(i6);
            List<hs.f<String, UserLibraryItemAccessModel>> list = this.B;
            String str3 = null;
            if (list != null) {
                Iterator<T> it = list.iterator();
                while (true) {
                    if (it.hasNext()) {
                        obj = it.next();
                        hs.f fVar = (hs.f) obj;
                        if (fVar != null) {
                            str = (String) fVar.f19464u;
                        } else {
                            str = null;
                        }
                        if (courseDayModelV1 != null) {
                            str2 = courseDayModelV1.getContent_id();
                        } else {
                            str2 = null;
                        }
                        if (kotlin.jvm.internal.i.b(str, str2)) {
                            break;
                        }
                    } else {
                        obj = null;
                        break;
                    }
                }
                hs.f fVar2 = (hs.f) obj;
                if (fVar2 != null && (userLibraryItemAccessModel = (UserLibraryItemAccessModel) fVar2.f19465v) != null) {
                    userLibraryItemAccessModel.isFavourite();
                }
            }
            int i11 = i6 + i10;
            ((RobertoTextView) view.findViewById(R.id.tvRowShortCourseDay)).setText(context.getString(R.string.LibraryDbShortCoursesDayX, String.valueOf(i11)));
            RobertoTextView robertoTextView = (RobertoTextView) view.findViewById(R.id.tvRowShortCourseTitle);
            if (courseDayModelV1 != null) {
                str3 = courseDayModelV1.getContent_label();
            }
            robertoTextView.setText(str3);
            if (this.E == i11) {
                view.findViewById(R.id.viewRowShortCourse).setVisibility(8);
            } else {
                view.findViewById(R.id.viewRowShortCourse).setVisibility(0);
            }
            int i12 = this.D;
            boolean z10 = this.f39652x;
            if (h10 == i12) {
                Object obj2 = g0.a.f16164a;
                ((AppCompatImageView) view.findViewById(R.id.ivRowShortCoursesIcon)).setImageDrawable(a.c.b(context, R.drawable.ic_check_round_circle_blue));
                view.findViewById(R.id.viewRowShortCourse).setBackgroundColor(g0.a.b(context, R.color.libraryShortCoursesBackgroundDark));
                if (z10) {
                    ((AppCompatImageView) view.findViewById(R.id.ivRowShortCoursesBookmark)).setVisibility(0);
                }
            } else if (h10 == 0) {
                Object obj3 = g0.a.f16164a;
                ((AppCompatImageView) view.findViewById(R.id.ivRowShortCoursesIcon)).setImageDrawable(a.c.b(context, R.drawable.ic_short_courses_day_selected_blue));
                view.findViewById(R.id.viewRowShortCourse).setBackgroundColor(g0.a.b(context, R.color.libraryShortCoursesBackgroundDark));
                if (z10) {
                    ((AppCompatImageView) view.findViewById(R.id.ivRowShortCoursesBookmark)).setVisibility(0);
                }
            } else {
                Object obj4 = g0.a.f16164a;
                ((AppCompatImageView) view.findViewById(R.id.ivRowShortCoursesIcon)).setImageDrawable(a.c.b(context, R.drawable.ic_short_courses_day_locked_blue));
                view.findViewById(R.id.viewRowShortCourse).setBackgroundColor(g0.a.b(context, R.color.libraryShortCoursesBackgroundDark));
                ((AppCompatImageView) view.findViewById(R.id.ivRowShortCoursesBookmark)).setVisibility(8);
            }
            ((AppCompatImageView) view.findViewById(R.id.ivRowShortCoursesBookmark)).setVisibility(8);
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f39653y, e10);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final RecyclerView.c0 p(int i6, RecyclerView parent) {
        kotlin.jvm.internal.i.g(parent, "parent");
        a aVar = new a(defpackage.e.h(parent, R.layout.row_short_courses_day_plan, parent, false, "from(parent.context)\n   …_day_plan, parent, false)"));
        aVar.s(false);
        return aVar;
    }
}
