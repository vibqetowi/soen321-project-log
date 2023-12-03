package vf;

import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Field;
import sf.v;
import vf.n;
/* compiled from: ReflectiveTypeAdapterFactory.java */
/* loaded from: classes.dex */
public final class m extends n.b {

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ Field f35017d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ boolean f35018e;
    public final /* synthetic */ v f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ sf.i f35019g;

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ TypeToken f35020h;

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ boolean f35021i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(String str, boolean z10, boolean z11, Field field, boolean z12, v vVar, sf.i iVar, TypeToken typeToken, boolean z13) {
        super(str, z10, z11);
        this.f35017d = field;
        this.f35018e = z12;
        this.f = vVar;
        this.f35019g = iVar;
        this.f35020h = typeToken;
        this.f35021i = z13;
    }

    @Override // vf.n.b
    public final void a(yf.a aVar, Object obj) {
        Object a10 = this.f.a(aVar);
        if (a10 != null || !this.f35021i) {
            this.f35017d.set(obj, a10);
        }
    }

    @Override // vf.n.b
    public final void b(yf.b bVar, Object obj) {
        Object obj2 = this.f35017d.get(obj);
        boolean z10 = this.f35018e;
        v vVar = this.f;
        if (!z10) {
            vVar = new p(this.f35019g, vVar, this.f35020h.getType());
        }
        vVar.b(bVar, obj2);
    }

    @Override // vf.n.b
    public final boolean c(Object obj) {
        if (!this.f35029b || this.f35017d.get(obj) == obj) {
            return false;
        }
        return true;
    }
}
