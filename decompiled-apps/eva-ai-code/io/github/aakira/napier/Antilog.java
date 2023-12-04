package io.github.aakira.napier;

import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.facebook.share.internal.ShareConstants;
import io.github.aakira.napier.Napier;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.apache.commons.logging.LogFactory;
/* compiled from: Antilog.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0005\b&\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u001a\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0016J,\u0010\t\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\u0010\r\u001a\u0004\u0018\u00010\bJ.\u0010\u000e\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\u0010\r\u001a\u0004\u0018\u00010\bH$J3\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\u0010\r\u001a\u0004\u0018\u00010\bH\u0000¢\u0006\u0002\b\u0010¨\u0006\u0011"}, d2 = {"Lio/github/aakira/napier/Antilog;", "", "()V", "isEnable", "", LogFactory.PRIORITY_KEY, "Lio/github/aakira/napier/Napier$Level;", ViewHierarchyConstants.TAG_KEY, "", "log", "", "throwable", "", ShareConstants.WEB_DIALOG_PARAM_MESSAGE, "performLog", "rawLog", "rawLog$napier_release", "napier_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes4.dex */
public abstract class Antilog {
    public boolean isEnable(Napier.Level priority, String str) {
        Intrinsics.checkNotNullParameter(priority, "priority");
        return true;
    }

    protected abstract void performLog(Napier.Level level, String str, Throwable th, String str2);

    public final void log(Napier.Level priority, String str, Throwable th, String str2) {
        Intrinsics.checkNotNullParameter(priority, "priority");
        if (isEnable(priority, str)) {
            performLog(priority, str, th, str2);
        }
    }

    public final void rawLog$napier_release(Napier.Level priority, String str, Throwable th, String str2) {
        Intrinsics.checkNotNullParameter(priority, "priority");
        performLog(priority, str, th, str2);
    }
}
