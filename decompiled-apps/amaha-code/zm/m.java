package zm;

import an.e0;
import an.f0;
import android.content.Context;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.model.CourseDayModelV1;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import dl.d0;
import g0.a;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.x;
import ss.p;
import tk.q;
/* compiled from: LibraryShortCourseDayPlanAdapter.kt */
/* loaded from: classes2.dex */
public final class m extends RecyclerView.e<a> {
    public final boolean A;
    public final Context B;
    public final p<CourseDayModelV1, Integer, hs.k> C;
    public final p<CourseDayModelV1, Boolean, hs.k> D;

    /* renamed from: x  reason: collision with root package name */
    public ArrayList<CourseDayModelV1> f39670x;

    /* renamed from: y  reason: collision with root package name */
    public final ArrayList<hs.f<String, Boolean>> f39671y;

    /* renamed from: z  reason: collision with root package name */
    public final boolean f39672z = true;
    public final String E = LogHelper.INSTANCE.makeLogTag(m.class);
    public final int F = 1;
    public final int G = 2;

    /* compiled from: LibraryShortCourseDayPlanAdapter.kt */
    /* loaded from: classes2.dex */
    public final class a extends RecyclerView.c0 {
        public a(View view) {
            super(view);
        }
    }

    public m(ArrayList arrayList, ArrayList arrayList2, boolean z10, androidx.fragment.app.p pVar, e0 e0Var, f0 f0Var) {
        this.f39670x = arrayList;
        this.f39671y = arrayList2;
        this.A = z10;
        this.B = pVar;
        this.C = e0Var;
        this.D = f0Var;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final int f() {
        return this.f39670x.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final int h(int i6) {
        CourseDayModelV1 courseDayModelV1;
        boolean z10;
        int i10 = this.F;
        try {
            if (i6 == 0) {
                courseDayModelV1 = this.f39670x.get(i6);
            } else {
                courseDayModelV1 = this.f39670x.get(i6 - 1);
            }
            CourseDayModelV1 courseDayModelV12 = courseDayModelV1;
            CourseDayModelV1 courseDayModelV13 = this.f39670x.get(i6);
            boolean z11 = true;
            if (courseDayModelV13 != null && courseDayModelV13.isCompleted()) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                return this.G;
            }
            if (i6 != 0) {
                if (!((courseDayModelV12 == null || !courseDayModelV12.isCompleted()) ? false : false)) {
                    return i10;
                }
            }
            return 0;
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.E, e10);
            return i10;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:25:0x007d A[Catch: Exception -> 0x0180, TryCatch #0 {Exception -> 0x0180, blocks: (B:3:0x0007, B:5:0x001e, B:6:0x0022, B:8:0x0028, B:10:0x0031, B:13:0x0039, B:15:0x003f, B:19:0x0047, B:21:0x004b, B:23:0x0051, B:25:0x007d, B:26:0x0081, B:30:0x009a, B:33:0x00ac, B:37:0x00d4, B:45:0x012c, B:47:0x0130, B:49:0x013a, B:51:0x0157, B:55:0x016e, B:56:0x0176, B:39:0x00da, B:43:0x0102, B:44:0x0106), top: B:61:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00ac A[Catch: Exception -> 0x0180, TRY_ENTER, TryCatch #0 {Exception -> 0x0180, blocks: (B:3:0x0007, B:5:0x001e, B:6:0x0022, B:8:0x0028, B:10:0x0031, B:13:0x0039, B:15:0x003f, B:19:0x0047, B:21:0x004b, B:23:0x0051, B:25:0x007d, B:26:0x0081, B:30:0x009a, B:33:0x00ac, B:37:0x00d4, B:45:0x012c, B:47:0x0130, B:49:0x013a, B:51:0x0157, B:55:0x016e, B:56:0x0176, B:39:0x00da, B:43:0x0102, B:44:0x0106), top: B:61:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0130 A[Catch: Exception -> 0x0180, TryCatch #0 {Exception -> 0x0180, blocks: (B:3:0x0007, B:5:0x001e, B:6:0x0022, B:8:0x0028, B:10:0x0031, B:13:0x0039, B:15:0x003f, B:19:0x0047, B:21:0x004b, B:23:0x0051, B:25:0x007d, B:26:0x0081, B:30:0x009a, B:33:0x00ac, B:37:0x00d4, B:45:0x012c, B:47:0x0130, B:49:0x013a, B:51:0x0157, B:55:0x016e, B:56:0x0176, B:39:0x00da, B:43:0x0102, B:44:0x0106), top: B:61:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0176 A[Catch: Exception -> 0x0180, TRY_LEAVE, TryCatch #0 {Exception -> 0x0180, blocks: (B:3:0x0007, B:5:0x001e, B:6:0x0022, B:8:0x0028, B:10:0x0031, B:13:0x0039, B:15:0x003f, B:19:0x0047, B:21:0x004b, B:23:0x0051, B:25:0x007d, B:26:0x0081, B:30:0x009a, B:33:0x00ac, B:37:0x00d4, B:45:0x012c, B:47:0x0130, B:49:0x013a, B:51:0x0157, B:55:0x016e, B:56:0x0176, B:39:0x00da, B:43:0x0102, B:44:0x0106), top: B:61:0x0007 }] */
    @Override // androidx.recyclerview.widget.RecyclerView.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void n(a aVar, int i6) {
        T t3;
        int i10;
        int i11;
        int i12;
        Object obj;
        String str;
        String str2;
        a aVar2 = aVar;
        Context context = this.B;
        View view = aVar2.f2751a;
        try {
            CourseDayModelV1 courseDayModelV1 = this.f39670x.get(i6);
            int h10 = h(i6);
            x xVar = new x();
            ArrayList<hs.f<String, Boolean>> arrayList = this.f39671y;
            String str3 = null;
            if (arrayList != null) {
                Iterator<T> it = arrayList.iterator();
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
                if (fVar2 != null) {
                    t3 = (Boolean) fVar2.f19465v;
                    xVar.f23469u = t3;
                    int i13 = 0;
                    ((RobertoTextView) view.findViewById(R.id.tvRowShortCourseDay)).setText(context.getString(R.string.LibraryDbShortCoursesDayX, String.valueOf(i6 + 1)));
                    RobertoTextView robertoTextView = (RobertoTextView) view.findViewById(R.id.tvRowShortCourseTitle);
                    if (courseDayModelV1 != null) {
                        str3 = courseDayModelV1.getContent_label();
                    }
                    robertoTextView.setText(str3);
                    View findViewById = view.findViewById(R.id.viewRowShortCourse);
                    if (this.f39670x.size() - 1 != i6) {
                        i10 = 8;
                    } else {
                        i10 = 0;
                    }
                    findViewById.setVisibility(i10);
                    i11 = this.G;
                    boolean z10 = this.A;
                    if (h10 != i11) {
                        Object obj2 = g0.a.f16164a;
                        ((AppCompatImageView) view.findViewById(R.id.ivRowShortCoursesIcon)).setImageDrawable(a.c.b(context, R.drawable.ic_check_round_circle_blue));
                        view.findViewById(R.id.viewRowShortCourse).setBackgroundColor(g0.a.b(context, R.color.libraryShortCoursesBackgroundDark));
                        AppCompatImageView appCompatImageView = (AppCompatImageView) view.findViewById(R.id.ivRowShortCoursesBookmark);
                        if (!z10) {
                            i13 = 8;
                        }
                        appCompatImageView.setVisibility(i13);
                    } else if (h10 == 0) {
                        Object obj3 = g0.a.f16164a;
                        ((AppCompatImageView) view.findViewById(R.id.ivRowShortCoursesIcon)).setImageDrawable(a.c.b(context, R.drawable.ic_short_courses_day_selected_blue));
                        view.findViewById(R.id.viewRowShortCourse).setBackgroundColor(g0.a.b(context, R.color.libraryShortCoursesBackgroundDark));
                        AppCompatImageView appCompatImageView2 = (AppCompatImageView) view.findViewById(R.id.ivRowShortCoursesBookmark);
                        if (!z10) {
                            i13 = 8;
                        }
                        appCompatImageView2.setVisibility(i13);
                    } else {
                        Object obj4 = g0.a.f16164a;
                        ((AppCompatImageView) view.findViewById(R.id.ivRowShortCoursesIcon)).setImageDrawable(a.c.b(context, R.drawable.ic_short_courses_day_locked_blue));
                        view.findViewById(R.id.viewRowShortCourse).setBackgroundColor(g0.a.b(context, R.color.libraryShortCoursesBackgroundDark));
                        ((AppCompatImageView) view.findViewById(R.id.ivRowShortCoursesBookmark)).setVisibility(8);
                    }
                    if (!this.f39672z) {
                        if (this.f39670x.get(i6) != null) {
                            view.setOnClickListener(new d0(h10, this, i6));
                            ((AppCompatImageView) view.findViewById(R.id.ivRowShortCoursesBookmark)).setOnClickListener(new q((Object) xVar, (Object) aVar2, (Object) this, (Object) courseDayModelV1, 8));
                            if (z10) {
                                AppCompatImageView appCompatImageView3 = (AppCompatImageView) view.findViewById(R.id.ivRowShortCoursesBookmark);
                                if (kotlin.jvm.internal.i.b(xVar.f23469u, Boolean.TRUE)) {
                                    i12 = R.drawable.ic_saved;
                                } else {
                                    i12 = R.drawable.ic_unsaved;
                                }
                                appCompatImageView3.setImageDrawable(a.c.b(context, i12));
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    ((AppCompatImageView) view.findViewById(R.id.ivRowShortCoursesBookmark)).setVisibility(8);
                    return;
                }
            }
            t3 = 0;
            xVar.f23469u = t3;
            int i132 = 0;
            ((RobertoTextView) view.findViewById(R.id.tvRowShortCourseDay)).setText(context.getString(R.string.LibraryDbShortCoursesDayX, String.valueOf(i6 + 1)));
            RobertoTextView robertoTextView2 = (RobertoTextView) view.findViewById(R.id.tvRowShortCourseTitle);
            if (courseDayModelV1 != null) {
            }
            robertoTextView2.setText(str3);
            View findViewById2 = view.findViewById(R.id.viewRowShortCourse);
            if (this.f39670x.size() - 1 != i6) {
            }
            findViewById2.setVisibility(i10);
            i11 = this.G;
            boolean z102 = this.A;
            if (h10 != i11) {
            }
            if (!this.f39672z) {
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.E, e10);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final RecyclerView.c0 p(int i6, RecyclerView parent) {
        kotlin.jvm.internal.i.g(parent, "parent");
        return new a(defpackage.e.h(parent, R.layout.row_short_courses_day_plan, parent, false, "from(parent.context)\n   …_day_plan, parent, false)"));
    }
}
