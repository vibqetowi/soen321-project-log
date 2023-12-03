package j$.util.concurrent;

import java.security.PrivilegedAction;
/* loaded from: classes3.dex */
final class w implements PrivilegedAction {
    @Override // java.security.PrivilegedAction
    public final Object run() {
        return Boolean.valueOf(Boolean.getBoolean("java.util.secureRandomSeed"));
    }
}
