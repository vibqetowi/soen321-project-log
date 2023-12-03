package ta;

import java.util.HashSet;
/* compiled from: com.google.android.gms:play-services-measurement@@21.2.0 */
/* loaded from: classes.dex */
public final class b extends y5 {
    public Long A;
    public Long B;

    /* renamed from: x  reason: collision with root package name */
    public String f32475x;

    /* renamed from: y  reason: collision with root package name */
    public HashSet f32476y;

    /* renamed from: z  reason: collision with root package name */
    public t.b f32477z;

    public b(d6 d6Var) {
        super(d6Var);
    }

    public final p6 l(Integer num) {
        if (this.f32477z.containsKey(num)) {
            return (p6) this.f32477z.getOrDefault(num, null);
        }
        p6 p6Var = new p6(this, this.f32475x);
        this.f32477z.put(num, p6Var);
        return p6Var;
    }

    @Override // ta.y5
    public final void k() {
    }
}
