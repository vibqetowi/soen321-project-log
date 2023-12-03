package pl;

import com.theinnerhour.b2b.components.dynamicActivities.fragments.N14AScreenFragment;
import com.theinnerhour.b2b.utils.Utils;
/* compiled from: N14AScreenFragment.kt */
/* loaded from: classes2.dex */
public final class n extends kotlin.jvm.internal.k implements ss.l<ql.g0, hs.k> {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ N14AScreenFragment f28614u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ ql.i f28615v;

    /* compiled from: N14AScreenFragment.kt */
    /* loaded from: classes2.dex */
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f28616a;

        static {
            int[] iArr = new int[ql.g0.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f28616a = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(N14AScreenFragment n14AScreenFragment, ql.i iVar) {
        super(1);
        this.f28614u = n14AScreenFragment;
        this.f28615v = iVar;
    }

    @Override // ss.l
    public final hs.k invoke(ql.g0 g0Var) {
        int i6;
        ql.g0 g0Var2 = g0Var;
        if (g0Var2 == null) {
            i6 = -1;
        } else {
            i6 = a.f28616a[g0Var2.ordinal()];
        }
        ql.g0 g0Var3 = ql.g0.NO_ERROR;
        ql.i iVar = this.f28615v;
        N14AScreenFragment n14AScreenFragment = this.f28614u;
        if (i6 != 1) {
            if (i6 == 2) {
                N14AScreenFragment.a aVar = n14AScreenFragment.T;
                if (aVar != null) {
                    Utils.INSTANCE.showCustomToast(n14AScreenFragment.requireContext(), aVar.f10961j);
                }
                iVar.I.f29769c.i(g0Var3);
            }
        } else {
            N14AScreenFragment.a aVar2 = n14AScreenFragment.T;
            if (aVar2 != null) {
                Utils.INSTANCE.showCustomToast(n14AScreenFragment.requireContext(), aVar2.f10960i);
            }
            iVar.I.f29769c.i(g0Var3);
        }
        return hs.k.f19476a;
    }
}
