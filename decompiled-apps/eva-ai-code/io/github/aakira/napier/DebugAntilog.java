package io.github.aakira.napier;

import android.os.Build;
import android.util.Log;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.facebook.share.internal.ShareConstants;
import io.github.aakira.napier.Napier;
import io.sentry.protocol.App;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.io.Writer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.apache.commons.lang3.ClassUtils;
import org.apache.commons.logging.LogFactory;
/* compiled from: DebugAntilog.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B\u000f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0015\u0010\f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u0003H\u0000¢\u0006\u0002\b\u000eJ.\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u00032\b\u0010\u0014\u001a\u0004\u0018\u00010\t2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0003H\u0014J\u0010\u0010\u0016\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u0003H\u0002J\f\u0010\u0017\u001a\u00020\u0018*\u00020\u0012H\u0002R\u0016\u0010\u0005\u001a\n \u0007*\u0004\u0018\u00010\u00060\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0018\u0010\b\u001a\u00020\u0003*\u00020\t8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b¨\u0006\u001a"}, d2 = {"Lio/github/aakira/napier/DebugAntilog;", "Lio/github/aakira/napier/Antilog;", "defaultTag", "", "(Ljava/lang/String;)V", "anonymousClass", "Ljava/util/regex/Pattern;", "kotlin.jvm.PlatformType", "stackTraceString", "", "getStackTraceString", "(Ljava/lang/Throwable;)Ljava/lang/String;", "createStackElementTag", "className", "createStackElementTag$napier_release", "performLog", "", LogFactory.PRIORITY_KEY, "Lio/github/aakira/napier/Napier$Level;", ViewHierarchyConstants.TAG_KEY, "throwable", ShareConstants.WEB_DIALOG_PARAM_MESSAGE, "performTag", "toValue", "", "Companion", "napier_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes4.dex */
public final class DebugAntilog extends Antilog {
    private static final int CALL_STACK_INDEX = 9;
    public static final Companion Companion = new Companion(null);
    private static final int MAX_LOG_LENGTH = 4000;
    private static final int MAX_TAG_LENGTH = 23;
    private final Pattern anonymousClass;
    private final String defaultTag;

    @Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 4, 2})
    /* loaded from: classes4.dex */
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Napier.Level.values().length];
            $EnumSwitchMapping$0 = iArr;
            iArr[Napier.Level.VERBOSE.ordinal()] = 1;
            iArr[Napier.Level.DEBUG.ordinal()] = 2;
            iArr[Napier.Level.INFO.ordinal()] = 3;
            iArr[Napier.Level.WARNING.ordinal()] = 4;
            iArr[Napier.Level.ERROR.ordinal()] = 5;
            iArr[Napier.Level.ASSERT.ordinal()] = 6;
        }
    }

    public DebugAntilog() {
        this(null, 1, null);
    }

    public DebugAntilog(String defaultTag) {
        Intrinsics.checkNotNullParameter(defaultTag, "defaultTag");
        this.defaultTag = defaultTag;
        this.anonymousClass = Pattern.compile("(\\$\\d+)+$");
    }

    public /* synthetic */ DebugAntilog(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? App.TYPE : str);
    }

    /* compiled from: DebugAntilog.kt */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lio/github/aakira/napier/DebugAntilog$Companion;", "", "()V", "CALL_STACK_INDEX", "", "MAX_LOG_LENGTH", "MAX_TAG_LENGTH", "napier_release"}, k = 1, mv = {1, 4, 2})
    /* loaded from: classes4.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0085, code lost:
        r0 = r2 + 1;
     */
    @Override // io.github.aakira.napier.Antilog
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected void performLog(Napier.Level priority, String str, Throwable th, String str2) {
        Intrinsics.checkNotNullParameter(priority, "priority");
        if (str == null) {
            str = performTag(this.defaultTag);
        }
        if (str2 != null) {
            if (th != null) {
                str2 = str2 + '\n' + getStackTraceString(th);
            }
        } else if (th == null || (str2 = getStackTraceString(th)) == null) {
            return;
        }
        int length = str2.length();
        if (length <= MAX_LOG_LENGTH) {
            if (priority == Napier.Level.ASSERT) {
                Log.wtf(str, str2);
                return;
            } else {
                Log.println(toValue(priority), str, str2);
                return;
            }
        }
        int i = 0;
        while (i < length) {
            int indexOf$default = StringsKt.indexOf$default((CharSequence) str2, '\n', i, false, 4, (Object) null);
            if (indexOf$default == -1) {
                indexOf$default = length;
            }
            while (true) {
                int min = Math.min(indexOf$default, i + MAX_LOG_LENGTH);
                if (str2 != null) {
                    String substring = str2.substring(i, min);
                    Intrinsics.checkNotNullExpressionValue(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                    if (toValue(priority) == 7) {
                        Log.wtf(str, substring);
                    } else {
                        Log.println(toValue(priority), str, substring);
                    }
                    if (min >= indexOf$default) {
                        break;
                    }
                    i = min;
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
                }
            }
        }
    }

    private final String performTag(String str) {
        Thread currentThread = Thread.currentThread();
        Intrinsics.checkNotNullExpressionValue(currentThread, "Thread.currentThread()");
        StackTraceElement[] stackTrace = currentThread.getStackTrace();
        if (stackTrace == null || stackTrace.length < 9) {
            return str;
        }
        StackTraceElement stackTraceElement = stackTrace[9];
        StringBuilder sb = new StringBuilder();
        String className = stackTraceElement.getClassName();
        Intrinsics.checkNotNullExpressionValue(className, "className");
        sb.append(createStackElementTag$napier_release(className));
        sb.append('$');
        sb.append(stackTraceElement.getMethodName());
        return sb.toString();
    }

    public final String createStackElementTag$napier_release(String className) {
        Intrinsics.checkNotNullParameter(className, "className");
        Matcher matcher = this.anonymousClass.matcher(className);
        if (matcher.find()) {
            className = matcher.replaceAll("");
            Intrinsics.checkNotNullExpressionValue(className, "m.replaceAll(\"\")");
        }
        int lastIndexOf$default = StringsKt.lastIndexOf$default((CharSequence) className, (char) ClassUtils.PACKAGE_SEPARATOR_CHAR, 0, false, 6, (Object) null) + 1;
        if (className == null) {
            throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
        }
        String substring = className.substring(lastIndexOf$default);
        Intrinsics.checkNotNullExpressionValue(substring, "(this as java.lang.String).substring(startIndex)");
        if (substring.length() <= 23 || Build.VERSION.SDK_INT >= 24) {
            return substring;
        }
        if (substring != null) {
            String substring2 = substring.substring(0, 23);
            Intrinsics.checkNotNullExpressionValue(substring2, "(this as java.lang.Strin…ing(startIndex, endIndex)");
            return substring2;
        }
        throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
    }

    private final String getStackTraceString(Throwable th) {
        StringWriter stringWriter = new StringWriter(256);
        PrintWriter printWriter = new PrintWriter((Writer) stringWriter, false);
        th.printStackTrace(printWriter);
        printWriter.flush();
        String stringWriter2 = stringWriter.toString();
        Intrinsics.checkNotNullExpressionValue(stringWriter2, "sw.toString()");
        return stringWriter2;
    }

    private final int toValue(Napier.Level level) {
        switch (WhenMappings.$EnumSwitchMapping$0[level.ordinal()]) {
            case 1:
                return 2;
            case 2:
                return 3;
            case 3:
                return 4;
            case 4:
                return 5;
            case 5:
                return 6;
            case 6:
                return 7;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
