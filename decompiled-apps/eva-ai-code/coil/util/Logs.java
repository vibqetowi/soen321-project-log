package coil.util;

import com.facebook.appevents.internal.ViewHierarchyConstants;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import org.apache.commons.logging.LogFactory;
/* compiled from: Logs.kt */
@Metadata(d1 = {"\u0000$\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u001a+\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\bH\u0080\b\u001a\u001c\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\nH\u0000¨\u0006\u000b"}, d2 = {"log", "", "Lcoil/util/Logger;", ViewHierarchyConstants.TAG_KEY, "", LogFactory.PRIORITY_KEY, "", "lazyMessage", "Lkotlin/Function0;", "throwable", "", "coil-base_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* renamed from: coil.util.-Logs  reason: invalid class name */
/* loaded from: classes2.dex */
public final class Logs {
    public static final void log(Logger logger, String str, int i, Function0<String> function0) {
        if (logger.getLevel() <= i) {
            logger.log(str, i, function0.invoke(), null);
        }
    }

    public static final void log(Logger logger, String str, Throwable th) {
        if (logger.getLevel() <= 6) {
            logger.log(str, 6, null, th);
        }
    }
}
