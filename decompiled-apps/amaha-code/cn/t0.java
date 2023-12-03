package cn;

import com.theinnerhour.b2b.model.MiniCourse;
/* compiled from: LibraryViewModel.kt */
/* loaded from: classes2.dex */
public final class t0 extends kotlin.jvm.internal.k implements ss.p<MiniCourse, MiniCourse, Integer> {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ k0 f5785u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t0(k0 k0Var) {
        super(2);
        this.f5785u = k0Var;
    }

    @Override // ss.p
    public final Integer invoke(MiniCourse miniCourse, MiniCourse miniCourse2) {
        MiniCourse miniCourse3 = miniCourse2;
        k0 k0Var = this.f5785u;
        Integer num = k0Var.o().get(miniCourse.getDomain());
        int i6 = 0;
        if (num != null) {
            int intValue = num.intValue();
            Integer num2 = k0Var.o().get(miniCourse3.getDomain());
            if (num2 != null) {
                i6 = num2.intValue();
            }
            i6 = kotlin.jvm.internal.i.i(intValue, i6);
        }
        return Integer.valueOf(i6);
    }
}
