package wu;

import com.appsflyer.R;
import java.util.Iterator;
/* compiled from: KotlinType.kt */
/* loaded from: classes2.dex */
public abstract class i0 extends m1 implements zu.i, zu.j {
    @Override // wu.m1
    /* renamed from: V0 */
    public abstract i0 S0(boolean z10);

    @Override // wu.m1
    /* renamed from: W0 */
    public abstract i0 U0(v0 v0Var);

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        Iterator<ht.c> it = getAnnotations().iterator();
        while (it.hasNext()) {
            String[] strArr = {"[", hu.c.f19529b.p(it.next(), null), "] "};
            for (int i6 = 0; i6 < 3; i6++) {
                sb2.append(strArr[i6]);
            }
        }
        sb2.append(O0());
        if (!M0().isEmpty()) {
            is.u.l2(M0(), sb2, ", ", "<", ">", null, R.styleable.AppCompatTheme_toolbarNavigationButtonStyle);
        }
        if (P0()) {
            sb2.append("?");
        }
        String sb3 = sb2.toString();
        kotlin.jvm.internal.i.f(sb3, "StringBuilder().apply(builderAction).toString()");
        return sb3;
    }
}
