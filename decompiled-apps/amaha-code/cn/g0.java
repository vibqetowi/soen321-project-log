package cn;

import com.theinnerhour.b2b.model.MiniCourse;
/* compiled from: LibraryShortCoursesViewModel.kt */
/* loaded from: classes2.dex */
public final class g0 extends kotlin.jvm.internal.k implements ss.p<MiniCourse, MiniCourse, Integer> {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ j0 f5550u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(j0 j0Var) {
        super(2);
        this.f5550u = j0Var;
    }

    @Override // ss.p
    public final Integer invoke(MiniCourse miniCourse, MiniCourse miniCourse2) {
        MiniCourse miniCourse3 = miniCourse2;
        j0 j0Var = this.f5550u;
        Integer num = j0Var.f().get(miniCourse.getDomain());
        int i6 = 0;
        if (num != null) {
            int intValue = num.intValue();
            Integer num2 = j0Var.f().get(miniCourse3.getDomain());
            if (num2 != null) {
                i6 = num2.intValue();
            }
            i6 = kotlin.jvm.internal.i.i(intValue, i6);
        }
        return Integer.valueOf(i6);
    }
}
