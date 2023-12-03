package cn;

import com.theinnerhour.b2b.components.libraryExperiment.model.MiniCourseMetadata;
import com.theinnerhour.b2b.components.libraryExperiment.model.UserLibraryItemAccessModel;
import com.theinnerhour.b2b.model.MiniCourse;
import com.theinnerhour.b2b.utils.Constants;
import com.theinnerhour.b2b.utils.LogHelper;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
/* compiled from: LibraryShortCoursesViewModel.kt */
/* loaded from: classes2.dex */
public final class j0 extends androidx.lifecycle.l0 {
    public final androidx.lifecycle.w<List<MiniCourseMetadata>> A;
    public final androidx.lifecycle.w<List<MiniCourse>> B;
    public final androidx.lifecycle.w<List<hs.f<String, UserLibraryItemAccessModel>>> C;
    public final androidx.lifecycle.w<List<MiniCourseMetadata>> D;
    public final androidx.lifecycle.w<List<MiniCourse>> E;
    public final androidx.lifecycle.w<HashSet<String>> F;
    public final hs.i G;
    public List<MiniCourseMetadata> H;

    /* renamed from: x  reason: collision with root package name */
    public final e1 f5581x;

    /* renamed from: y  reason: collision with root package name */
    public final String f5582y;

    /* renamed from: z  reason: collision with root package name */
    public final androidx.lifecycle.w<Boolean> f5583z;

    /* compiled from: LibraryShortCoursesViewModel.kt */
    /* loaded from: classes2.dex */
    public static final class a extends kotlin.jvm.internal.k implements ss.a<HashMap<String, Integer>> {

        /* renamed from: u  reason: collision with root package name */
        public static final a f5584u = new a();

        public a() {
            super(0);
        }

        @Override // ss.a
        public final HashMap<String, Integer> invoke() {
            return new HashMap<>();
        }
    }

    public j0(e1 repository) {
        kotlin.jvm.internal.i.g(repository, "repository");
        this.f5581x = repository;
        this.f5582y = LogHelper.INSTANCE.makeLogTag(j0.class);
        this.f5583z = new androidx.lifecycle.w<>();
        this.A = new androidx.lifecycle.w<>();
        this.B = new androidx.lifecycle.w<>();
        this.C = new androidx.lifecycle.w<>();
        this.D = new androidx.lifecycle.w<>();
        this.E = new androidx.lifecycle.w<>();
        this.F = new androidx.lifecycle.w<>();
        this.G = sp.b.O(a.f5584u);
        new ArrayList();
    }

    public static final int e(j0 j0Var, String str) {
        j0Var.getClass();
        switch (str.hashCode()) {
            case -2114782937:
                if (str.equals(Constants.COURSE_HAPPINESS)) {
                    return 5;
                }
                break;
            case -1617042330:
                if (str.equals(Constants.COURSE_DEPRESSION)) {
                    return 1;
                }
                break;
            case -891989580:
                if (str.equals(Constants.COURSE_STRESS)) {
                    return 3;
                }
                break;
            case 92960775:
                if (str.equals(Constants.COURSE_ANGER)) {
                    return 6;
                }
                break;
            case 109522647:
                if (str.equals(Constants.COURSE_SLEEP)) {
                    return 4;
                }
                break;
            case 113319009:
                if (str.equals(Constants.COURSE_WORRY)) {
                    return 2;
                }
                break;
        }
        return 7;
    }

    public final HashMap<String, Integer> f() {
        return (HashMap) this.G.getValue();
    }
}
