package j$.util;

import java.security.AccessController;
import java.security.PrivilegedAction;
/* loaded from: classes3.dex */
abstract class i0 {

    /* renamed from: a  reason: collision with root package name */
    static final boolean f21234a = ((Boolean) AccessController.doPrivileged(new PrivilegedAction() { // from class: j$.util.h0
        @Override // java.security.PrivilegedAction
        public final Object run() {
            return Boolean.valueOf(Boolean.getBoolean("org.openjdk.java.util.stream.tripwire"));
        }
    })).booleanValue();

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(Class cls, String str) {
        throw new UnsupportedOperationException(cls + " tripwire tripped but logging not supported: " + str);
    }
}
