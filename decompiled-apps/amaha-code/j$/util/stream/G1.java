package j$.util.stream;
/* loaded from: classes3.dex */
final class G1 extends AbstractC0850z0 {

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ int f21286h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ G1(EnumC0770h3 enumC0770h3, int i6) {
        super(enumC0770h3);
        this.f21286h = i6;
    }

    @Override // j$.util.stream.AbstractC0850z0
    public final /* bridge */ /* synthetic */ U1 G0() {
        switch (this.f21286h) {
            case 0:
                return M0();
            case 1:
                return M0();
            case 2:
                return M0();
            default:
                return M0();
        }
    }

    public final Long K0(AbstractC0850z0 abstractC0850z0, j$.util.S s10) {
        switch (this.f21286h) {
            case 0:
                return EnumC0765g3.SIZED.r(abstractC0850z0.s0()) ? Long.valueOf(s10.getExactSizeIfKnown()) : (Long) super.k(abstractC0850z0, s10);
            case 1:
                return EnumC0765g3.SIZED.r(abstractC0850z0.s0()) ? Long.valueOf(s10.getExactSizeIfKnown()) : (Long) super.k(abstractC0850z0, s10);
            case 2:
                return EnumC0765g3.SIZED.r(abstractC0850z0.s0()) ? Long.valueOf(s10.getExactSizeIfKnown()) : (Long) super.k(abstractC0850z0, s10);
            default:
                return EnumC0765g3.SIZED.r(abstractC0850z0.s0()) ? Long.valueOf(s10.getExactSizeIfKnown()) : (Long) super.k(abstractC0850z0, s10);
        }
    }

    public final Long L0(AbstractC0850z0 abstractC0850z0, j$.util.S s10) {
        switch (this.f21286h) {
            case 0:
                return EnumC0765g3.SIZED.r(abstractC0850z0.s0()) ? Long.valueOf(s10.getExactSizeIfKnown()) : (Long) super.y(abstractC0850z0, s10);
            case 1:
                return EnumC0765g3.SIZED.r(abstractC0850z0.s0()) ? Long.valueOf(s10.getExactSizeIfKnown()) : (Long) super.y(abstractC0850z0, s10);
            case 2:
                return EnumC0765g3.SIZED.r(abstractC0850z0.s0()) ? Long.valueOf(s10.getExactSizeIfKnown()) : (Long) super.y(abstractC0850z0, s10);
            default:
                return EnumC0765g3.SIZED.r(abstractC0850z0.s0()) ? Long.valueOf(s10.getExactSizeIfKnown()) : (Long) super.y(abstractC0850z0, s10);
        }
    }

    public final AbstractC0734a2 M0() {
        switch (this.f21286h) {
            case 0:
                return new Y1();
            case 1:
                return new W1();
            case 2:
                return new Z1();
            default:
                return new X1();
        }
    }

    @Override // j$.util.stream.AbstractC0850z0, j$.util.stream.P3
    public final /* bridge */ /* synthetic */ Object k(AbstractC0850z0 abstractC0850z0, j$.util.S s10) {
        switch (this.f21286h) {
            case 0:
                return K0(abstractC0850z0, s10);
            case 1:
                return K0(abstractC0850z0, s10);
            case 2:
                return K0(abstractC0850z0, s10);
            default:
                return K0(abstractC0850z0, s10);
        }
    }

    @Override // j$.util.stream.AbstractC0850z0, j$.util.stream.P3
    public final int o() {
        switch (this.f21286h) {
            case 0:
                return EnumC0765g3.r;
            case 1:
                return EnumC0765g3.r;
            case 2:
                return EnumC0765g3.r;
            default:
                return EnumC0765g3.r;
        }
    }

    @Override // j$.util.stream.AbstractC0850z0, j$.util.stream.P3
    public final /* bridge */ /* synthetic */ Object y(AbstractC0850z0 abstractC0850z0, j$.util.S s10) {
        switch (this.f21286h) {
            case 0:
                return L0(abstractC0850z0, s10);
            case 1:
                return L0(abstractC0850z0, s10);
            case 2:
                return L0(abstractC0850z0, s10);
            default:
                return L0(abstractC0850z0, s10);
        }
    }
}
