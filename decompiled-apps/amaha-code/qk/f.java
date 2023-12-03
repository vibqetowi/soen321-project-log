package qk;

import kotlin.jvm.internal.k;
import ss.l;
/* compiled from: EncodingUtils.kt */
/* loaded from: classes2.dex */
public final class f extends k implements l<Byte, CharSequence> {

    /* renamed from: u  reason: collision with root package name */
    public static final f f29655u = new f();

    public f() {
        super(1);
    }

    @Override // ss.l
    public final CharSequence invoke(Byte b10) {
        return defpackage.b.o(new Object[]{Byte.valueOf(b10.byteValue())}, 1, "%02x", "format(this, *args)");
    }
}
