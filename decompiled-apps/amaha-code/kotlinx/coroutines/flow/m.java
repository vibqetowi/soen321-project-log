package kotlinx.coroutines.flow;

import androidx.recyclerview.widget.LinearLayoutManager;
import com.appsflyer.R;
/* compiled from: Reduce.kt */
@ns.e(c = "kotlinx.coroutines.flow.FlowKt__ReduceKt", f = "Reduce.kt", l = {R.styleable.AppCompatTheme_colorPrimary}, m = "single")
/* loaded from: classes2.dex */
public final class m<T> extends ns.c {

    /* renamed from: u  reason: collision with root package name */
    public kotlin.jvm.internal.x f23541u;

    /* renamed from: v  reason: collision with root package name */
    public /* synthetic */ Object f23542v;

    /* renamed from: w  reason: collision with root package name */
    public int f23543w;

    public m(ls.d<? super m> dVar) {
        super(dVar);
    }

    @Override // ns.a
    public final Object invokeSuspend(Object obj) {
        this.f23542v = obj;
        this.f23543w |= LinearLayoutManager.INVALID_OFFSET;
        return ta.v.M(null, this);
    }
}
