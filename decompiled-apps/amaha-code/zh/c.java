package zh;

import kotlin.jvm.internal.i;
import kotlin.jvm.internal.k;
/* compiled from: SecurityManager.kt */
/* loaded from: classes.dex */
public final class c extends k implements ss.a<String> {

    /* renamed from: u  reason: collision with root package name */
    public static final c f39404u = new c();

    public c() {
        super(0);
    }

    @Override // ss.a
    public final String invoke() {
        return i.n(" loadHandler() : Security module not found", d.f39405a);
    }
}
