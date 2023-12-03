package kotlinx.coroutines.flow;

import androidx.recyclerview.widget.LinearLayoutManager;
import com.appsflyer.R;
/* compiled from: Channels.kt */
@ns.e(c = "kotlinx.coroutines.flow.FlowKt__ChannelsKt", f = "Channels.kt", l = {R.styleable.AppCompatTheme_colorBackgroundFloating, R.styleable.AppCompatTheme_dialogPreferredPadding}, m = "emitAllImpl$FlowKt__ChannelsKt")
/* loaded from: classes2.dex */
public final class f<T> extends ns.c {

    /* renamed from: u  reason: collision with root package name */
    public e f23513u;

    /* renamed from: v  reason: collision with root package name */
    public iv.s f23514v;

    /* renamed from: w  reason: collision with root package name */
    public boolean f23515w;

    /* renamed from: x  reason: collision with root package name */
    public /* synthetic */ Object f23516x;

    /* renamed from: y  reason: collision with root package name */
    public int f23517y;

    public f(ls.d<? super f> dVar) {
        super(dVar);
    }

    @Override // ns.a
    public final Object invokeSuspend(Object obj) {
        this.f23516x = obj;
        this.f23517y |= LinearLayoutManager.INVALID_OFFSET;
        return kotlin.jvm.internal.h.t(null, null, false, this);
    }
}
