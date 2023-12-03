package dt;
/* compiled from: UnsignedType.kt */
/* loaded from: classes2.dex */
public enum q {
    /* JADX INFO: Fake field, exist only in values array */
    UBYTE(fu.b.f("kotlin/UByte", false)),
    /* JADX INFO: Fake field, exist only in values array */
    USHORT(fu.b.f("kotlin/UShort", false)),
    /* JADX INFO: Fake field, exist only in values array */
    UINT(fu.b.f("kotlin/UInt", false)),
    /* JADX INFO: Fake field, exist only in values array */
    ULONG(fu.b.f("kotlin/ULong", false));
    

    /* renamed from: u  reason: collision with root package name */
    public final fu.b f13429u;

    /* renamed from: v  reason: collision with root package name */
    public final fu.e f13430v;

    /* renamed from: w  reason: collision with root package name */
    public final fu.b f13431w;

    q(fu.b bVar) {
        this.f13429u = bVar;
        fu.e j10 = bVar.j();
        kotlin.jvm.internal.i.f(j10, "classId.shortClassName");
        this.f13430v = j10;
        fu.c h10 = bVar.h();
        this.f13431w = new fu.b(h10, fu.e.j(j10.f() + "Array"));
    }
}
