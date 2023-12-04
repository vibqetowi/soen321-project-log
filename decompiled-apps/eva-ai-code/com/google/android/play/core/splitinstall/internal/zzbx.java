package com.google.android.play.core.splitinstall.internal;

import java.util.concurrent.Callable;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
/* compiled from: com.google.android.play:feature-delivery@@2.0.1 */
/* loaded from: classes2.dex */
public final class zzbx extends RuntimeException {
    private zzbx(Exception exc) {
        super("TunnelExceptions should always be unwrapped to deal with the checked exception underneath, this message should never be seen if TunnelException is used properly.", exc);
    }

    @Override // java.lang.Throwable
    /* renamed from: zza */
    public final synchronized Exception getCause() {
        Throwable cause;
        cause = super.getCause();
        cause.getClass();
        return (Exception) cause;
    }

    public final Exception zzb(Class cls) {
        int indexOf;
        String str;
        int i = 0;
        Class[] clsArr = {cls};
        for (int i2 = 0; i2 <= 0; i2++) {
            Class cls2 = clsArr[i2];
            if (!(!RuntimeException.class.isAssignableFrom(cls2))) {
                Object[] objArr = new Object[2];
                objArr[0] = "getCause";
                objArr[1] = cls2;
                for (int i3 = 0; i3 < 2; i3++) {
                    Object obj = objArr[i3];
                    if (obj == null) {
                        str = AbstractJsonLexerKt.NULL;
                    } else {
                        try {
                            str = obj.toString();
                        } catch (Exception e) {
                            String str2 = obj.getClass().getName() + '@' + Integer.toHexString(System.identityHashCode(obj));
                            Logger.getLogger("com.google.common.base.Strings").logp(Level.WARNING, "com.google.common.base.Strings", "lenientToString", "Exception during lenientFormat for ".concat(str2), (Throwable) e);
                            str = "<" + str2 + " threw " + e.getClass().getName() + ">";
                        }
                    }
                    objArr[i3] = str;
                }
                StringBuilder sb = new StringBuilder(118);
                int i4 = 0;
                while (i < 2 && (indexOf = "The cause of a TunnelException can never be a RuntimeException, but %s argument was %s".indexOf("%s", i4)) != -1) {
                    sb.append((CharSequence) "The cause of a TunnelException can never be a RuntimeException, but %s argument was %s", i4, indexOf);
                    sb.append(objArr[i]);
                    i4 = indexOf + 2;
                    i++;
                }
                sb.append((CharSequence) "The cause of a TunnelException can never be a RuntimeException, but %s argument was %s", i4, 86);
                if (i < 2) {
                    sb.append(" [");
                    sb.append(objArr[i]);
                    for (int i5 = i + 1; i5 < 2; i5++) {
                        sb.append(", ");
                        sb.append(objArr[i5]);
                    }
                    sb.append(AbstractJsonLexerKt.END_LIST);
                }
                throw new IllegalArgumentException(sb.toString());
            }
        }
        if (cls.isInstance(getCause())) {
            return (Exception) cls.cast(getCause());
        }
        Exception cause = getCause();
        ClassCastException classCastException = new ClassCastException(String.format("getCause(%s) doesn't match underlying exception", cls));
        classCastException.initCause(cause);
        throw classCastException;
    }

    public static Object zzc(Callable callable) {
        callable.getClass();
        try {
            return callable.call();
        } catch (RuntimeException e) {
            throw e;
        } catch (Exception e2) {
            throw new zzbx(e2);
        }
    }
}
