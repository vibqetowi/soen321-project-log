package kotlin.reflect.jvm.internal.impl.protobuf;

import gu.n;
import java.io.IOException;
/* loaded from: classes2.dex */
public class InvalidProtocolBufferException extends IOException {

    /* renamed from: u  reason: collision with root package name */
    public n f23476u;

    public InvalidProtocolBufferException(String str) {
        super(str);
        this.f23476u = null;
    }

    public static InvalidProtocolBufferException b() {
        return new InvalidProtocolBufferException("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either than the input has been truncated or that an embedded message misreported its own length.");
    }

    public final void a(n nVar) {
        this.f23476u = nVar;
    }
}
