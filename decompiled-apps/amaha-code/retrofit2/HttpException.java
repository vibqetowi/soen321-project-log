package retrofit2;

import dw.z;
import j$.util.Objects;
import lv.d0;
/* loaded from: classes2.dex */
public class HttpException extends RuntimeException {
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public HttpException(z<?> zVar) {
        super(r0.toString());
        Objects.requireNonNull(zVar, "response == null");
        StringBuilder sb2 = new StringBuilder("HTTP ");
        d0 d0Var = zVar.f13695a;
        sb2.append(d0Var.f24586x);
        sb2.append(" ");
        sb2.append(d0Var.f24585w);
        d0 d0Var2 = zVar.f13695a;
        int i6 = d0Var2.f24586x;
        String str = d0Var2.f24585w;
    }
}
