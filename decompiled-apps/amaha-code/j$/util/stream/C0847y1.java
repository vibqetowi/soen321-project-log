package j$.util.stream;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.util.stream.y1  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C0847y1 extends AbstractC0851z1 {

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ int f21593c;

    /* renamed from: d  reason: collision with root package name */
    private final Object f21594d;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0847y1(H0 h02, Object obj) {
        this(h02, obj, 0);
        this.f21593c = 0;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0847y1(I0 i02, Object obj, int i6) {
        super(i02);
        this.f21593c = i6;
        this.f21594d = obj;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0847y1(I0 i02, Object[] objArr) {
        this(i02, objArr, 1);
        this.f21593c = 1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0847y1(C0847y1 c0847y1, H0 h02, int i6) {
        super(c0847y1, h02, i6);
        this.f21593c = 0;
        this.f21594d = c0847y1.f21594d;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0847y1(C0847y1 c0847y1, I0 i02, int i6) {
        super(c0847y1, i02, i6);
        this.f21593c = 1;
        this.f21594d = (Object[]) c0847y1.f21594d;
    }

    @Override // j$.util.stream.AbstractC0851z1
    final void a() {
        switch (this.f21593c) {
            case 0:
                ((H0) this.f21608a).f(this.f21594d, this.f21609b);
                return;
            default:
                this.f21608a.j((Object[]) this.f21594d, this.f21609b);
                return;
        }
    }

    @Override // j$.util.stream.AbstractC0851z1
    final C0847y1 b(int i6, int i10) {
        switch (this.f21593c) {
            case 0:
                return new C0847y1(this, ((H0) this.f21608a).a(i6), i10);
            default:
                return new C0847y1(this, this.f21608a.a(i6), i10);
        }
    }
}
