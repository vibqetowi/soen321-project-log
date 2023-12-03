package t0;

import android.view.View;
import android.view.ViewGroup;
import com.appsflyer.R;
/* compiled from: ViewGroup.kt */
@ns.e(c = "androidx.core.view.ViewGroupKt$descendants$1", f = "ViewGroup.kt", l = {R.styleable.AppCompatTheme_windowActionModeOverlay, R.styleable.AppCompatTheme_windowFixedHeightMinor}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class i0 extends ns.h implements ss.p<fv.j<? super View>, ls.d<? super hs.k>, Object> {
    public /* synthetic */ Object A;
    public final /* synthetic */ ViewGroup B;

    /* renamed from: v  reason: collision with root package name */
    public ViewGroup f32316v;

    /* renamed from: w  reason: collision with root package name */
    public View f32317w;

    /* renamed from: x  reason: collision with root package name */
    public int f32318x;

    /* renamed from: y  reason: collision with root package name */
    public int f32319y;

    /* renamed from: z  reason: collision with root package name */
    public int f32320z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(ViewGroup viewGroup, ls.d<? super i0> dVar) {
        super(dVar);
        this.B = viewGroup;
    }

    @Override // ns.a
    public final ls.d<hs.k> create(Object obj, ls.d<?> dVar) {
        i0 i0Var = new i0(this.B, dVar);
        i0Var.A = obj;
        return i0Var;
    }

    @Override // ss.p
    public final Object invoke(fv.j<? super View> jVar, ls.d<? super hs.k> dVar) {
        return ((i0) create(jVar, dVar)).invokeSuspend(hs.k.f19476a);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00b7  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x00a3 -> B:25:0x00a5). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x00ad -> B:27:0x00b2). Please submit an issue!!! */
    @Override // ns.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        fv.j jVar;
        ViewGroup viewGroup;
        int childCount;
        int i6;
        i0 i0Var;
        ms.a aVar;
        i0 i0Var2;
        ms.a aVar2;
        fv.j jVar2;
        ViewGroup viewGroup2;
        View view;
        int i10;
        int i11;
        ms.a aVar3 = ms.a.COROUTINE_SUSPENDED;
        int i12 = this.f32320z;
        if (i12 != 0) {
            if (i12 != 1) {
                if (i12 == 2) {
                    i11 = this.f32319y;
                    i10 = this.f32318x;
                    ViewGroup viewGroup3 = this.f32316v;
                    fv.j jVar3 = (fv.j) this.A;
                    sp.b.d0(obj);
                    i0Var2 = this;
                    aVar2 = aVar3;
                    aVar = aVar2;
                    fv.j jVar4 = jVar3;
                    i0Var = i0Var2;
                    jVar = jVar4;
                    ViewGroup viewGroup4 = viewGroup3;
                    int i13 = i11;
                    viewGroup = viewGroup4;
                    int i14 = i13;
                    i6 = i10 + 1;
                    childCount = i14;
                    if (i6 >= childCount) {
                        View childAt = viewGroup.getChildAt(i6);
                        kotlin.jvm.internal.i.f(childAt, "getChildAt(index)");
                        i0Var.A = jVar;
                        i0Var.f32316v = viewGroup;
                        i0Var.f32317w = childAt;
                        i0Var.f32318x = i6;
                        i0Var.f32319y = childCount;
                        i0Var.f32320z = 1;
                        jVar.b(childAt, i0Var);
                        if (aVar3 == aVar) {
                            return aVar;
                        }
                        ms.a aVar4 = aVar;
                        jVar2 = jVar;
                        i0Var2 = i0Var;
                        viewGroup2 = viewGroup;
                        i11 = childCount;
                        i10 = i6;
                        view = childAt;
                        aVar2 = aVar4;
                        if (!(view instanceof ViewGroup)) {
                            ViewGroup viewGroup5 = (ViewGroup) view;
                            kotlin.jvm.internal.i.g(viewGroup5, "<this>");
                            i0 i0Var3 = new i0(viewGroup5, null);
                            i0Var2.A = jVar2;
                            i0Var2.f32316v = viewGroup2;
                            i0Var2.f32317w = null;
                            i0Var2.f32318x = i10;
                            i0Var2.f32319y = i11;
                            i0Var2.f32320z = 2;
                            jVar2.getClass();
                            fv.i iVar = new fv.i();
                            iVar.f15982x = ca.a.M(iVar, iVar, i0Var3);
                            Object g5 = jVar2.g(iVar, i0Var2);
                            if (g5 != aVar3) {
                                g5 = hs.k.f19476a;
                            }
                            if (g5 == aVar2) {
                                return aVar2;
                            }
                            viewGroup3 = viewGroup2;
                            jVar3 = jVar2;
                            aVar = aVar2;
                            fv.j jVar42 = jVar3;
                            i0Var = i0Var2;
                            jVar = jVar42;
                            ViewGroup viewGroup42 = viewGroup3;
                            int i132 = i11;
                            viewGroup = viewGroup42;
                            int i142 = i132;
                            i6 = i10 + 1;
                            childCount = i142;
                            if (i6 >= childCount) {
                                return hs.k.f19476a;
                            }
                        } else {
                            i132 = i11;
                            viewGroup = viewGroup2;
                            i0Var = i0Var2;
                            jVar = jVar2;
                            aVar = aVar2;
                            int i1422 = i132;
                            i6 = i10 + 1;
                            childCount = i1422;
                            if (i6 >= childCount) {
                            }
                        }
                    }
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                i11 = this.f32319y;
                i10 = this.f32318x;
                view = this.f32317w;
                viewGroup2 = this.f32316v;
                jVar2 = (fv.j) this.A;
                sp.b.d0(obj);
                i0Var2 = this;
                aVar2 = aVar3;
                if (!(view instanceof ViewGroup)) {
                }
            }
        } else {
            sp.b.d0(obj);
            jVar = (fv.j) this.A;
            viewGroup = this.B;
            childCount = viewGroup.getChildCount();
            i6 = 0;
            i0Var = this;
            aVar = aVar3;
            if (i6 >= childCount) {
            }
        }
    }
}
