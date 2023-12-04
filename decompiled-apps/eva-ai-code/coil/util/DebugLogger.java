package coil.util;

import android.util.Log;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.facebook.share.internal.ShareConstants;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.io.PrintWriter;
import java.io.StringWriter;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.apache.commons.logging.LogFactory;
/* compiled from: DebugLogger.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u0003H\u0002J,\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00032\b\u0010\u000f\u001a\u0004\u0018\u00010\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0016R$\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003@VX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\u0004¨\u0006\u0012"}, d2 = {"Lcoil/util/DebugLogger;", "Lcoil/util/Logger;", FirebaseAnalytics.Param.LEVEL, "", "(I)V", "value", "getLevel", "()I", "setLevel", "assertValidLevel", "", "log", ViewHierarchyConstants.TAG_KEY, "", LogFactory.PRIORITY_KEY, ShareConstants.WEB_DIALOG_PARAM_MESSAGE, "throwable", "", "coil-base_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class DebugLogger implements Logger {
    private int level;

    public DebugLogger() {
        this(0, 1, null);
    }

    public DebugLogger(int i) {
        this.level = i;
        assertValidLevel(i);
    }

    public /* synthetic */ DebugLogger(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 3 : i);
    }

    @Override // coil.util.Logger
    public int getLevel() {
        return this.level;
    }

    @Override // coil.util.Logger
    public void setLevel(int i) {
        assertValidLevel(i);
        this.level = i;
    }

    @Override // coil.util.Logger
    public void log(String str, int i, String str2, Throwable th) {
        if (str2 != null) {
            Log.println(i, str, str2);
        }
        if (th != null) {
            StringWriter stringWriter = new StringWriter();
            th.printStackTrace(new PrintWriter(stringWriter));
            Log.println(i, str, stringWriter.toString());
        }
    }

    private final void assertValidLevel(int i) {
        boolean z = false;
        if (2 <= i && i < 8) {
            z = true;
        }
        if (z) {
            return;
        }
        throw new IllegalArgumentException(("Invalid log level: " + i).toString());
    }
}
