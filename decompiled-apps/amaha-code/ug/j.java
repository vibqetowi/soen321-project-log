package ug;
/* compiled from: DataUtils.kt */
/* loaded from: classes.dex */
public final class j extends kotlin.jvm.internal.k implements ss.l<Byte, CharSequence> {

    /* renamed from: u  reason: collision with root package name */
    public static final j f34117u = new j();

    public j() {
        super(1);
    }

    @Override // ss.l
    public final CharSequence invoke(Byte b10) {
        return defpackage.b.o(new Object[]{Byte.valueOf(b10.byteValue())}, 1, "%02x", "format(this, *args)");
    }
}
