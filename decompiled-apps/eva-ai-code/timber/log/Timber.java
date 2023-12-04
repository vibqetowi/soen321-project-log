package timber.log;

import android.os.Build;
import android.util.Log;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.facebook.share.internal.ShareConstants;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.apache.commons.lang3.ClassUtils;
import org.apache.commons.logging.LogFactory;
/* compiled from: Timber.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\u0018\u0000 \u00042\u00020\u0001:\u0003\u0003\u0004\u0005B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0006"}, d2 = {"Ltimber/log/Timber;", "", "()V", "DebugTree", "Forest", "Tree", "timber_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes5.dex */
public final class Timber {
    public static final Forest Forest = new Forest(null);
    private static final ArrayList<Tree> trees = new ArrayList<>();
    private static volatile Tree[] treeArray = new Tree[0];

    @JvmStatic
    public static Tree asTree() {
        return Forest.asTree();
    }

    @JvmStatic
    public static void d(String str, Object... objArr) {
        Forest.d(str, objArr);
    }

    @JvmStatic
    public static void d(Throwable th) {
        Forest.d(th);
    }

    @JvmStatic
    public static void d(Throwable th, String str, Object... objArr) {
        Forest.d(th, str, objArr);
    }

    @JvmStatic
    public static void e(String str, Object... objArr) {
        Forest.e(str, objArr);
    }

    @JvmStatic
    public static void e(Throwable th) {
        Forest.e(th);
    }

    @JvmStatic
    public static void e(Throwable th, String str, Object... objArr) {
        Forest.e(th, str, objArr);
    }

    @JvmStatic
    public static final List<Tree> forest() {
        return Forest.forest();
    }

    @JvmStatic
    public static void i(String str, Object... objArr) {
        Forest.i(str, objArr);
    }

    @JvmStatic
    public static void i(Throwable th) {
        Forest.i(th);
    }

    @JvmStatic
    public static void i(Throwable th, String str, Object... objArr) {
        Forest.i(th, str, objArr);
    }

    @JvmStatic
    public static void log(int i, String str, Object... objArr) {
        Forest.log(i, str, objArr);
    }

    @JvmStatic
    public static void log(int i, Throwable th) {
        Forest.log(i, th);
    }

    @JvmStatic
    public static void log(int i, Throwable th, String str, Object... objArr) {
        Forest.log(i, th, str, objArr);
    }

    @JvmStatic
    public static final void plant(Tree tree) {
        Forest.plant(tree);
    }

    @JvmStatic
    public static final void plant(Tree... treeArr) {
        Forest.plant(treeArr);
    }

    @JvmStatic
    public static final Tree tag(String str) {
        return Forest.tag(str);
    }

    @JvmStatic
    public static final int treeCount() {
        return Forest.treeCount();
    }

    @JvmStatic
    public static final void uproot(Tree tree) {
        Forest.uproot(tree);
    }

    @JvmStatic
    public static final void uprootAll() {
        Forest.uprootAll();
    }

    @JvmStatic
    public static void v(String str, Object... objArr) {
        Forest.v(str, objArr);
    }

    @JvmStatic
    public static void v(Throwable th) {
        Forest.v(th);
    }

    @JvmStatic
    public static void v(Throwable th, String str, Object... objArr) {
        Forest.v(th, str, objArr);
    }

    @JvmStatic
    public static void w(String str, Object... objArr) {
        Forest.w(str, objArr);
    }

    @JvmStatic
    public static void w(Throwable th) {
        Forest.w(th);
    }

    @JvmStatic
    public static void w(Throwable th, String str, Object... objArr) {
        Forest.w(th, str, objArr);
    }

    @JvmStatic
    public static void wtf(String str, Object... objArr) {
        Forest.wtf(str, objArr);
    }

    @JvmStatic
    public static void wtf(Throwable th) {
        Forest.wtf(th);
    }

    @JvmStatic
    public static void wtf(Throwable th, String str, Object... objArr) {
        Forest.wtf(th, str, objArr);
    }

    private Timber() {
        throw new AssertionError();
    }

    /* compiled from: Timber.kt */
    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\b\b&\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J/\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u00052\u0016\u0010\u000e\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010\u000f\"\u0004\u0018\u00010\u0001H\u0016¢\u0006\u0002\u0010\u0010J\u0012\u0010\u000b\u001a\u00020\f2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0016J9\u0010\u000b\u001a\u00020\f2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00122\b\u0010\r\u001a\u0004\u0018\u00010\u00052\u0016\u0010\u000e\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010\u000f\"\u0004\u0018\u00010\u0001H\u0016¢\u0006\u0002\u0010\u0013J/\u0010\u0014\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u00052\u0016\u0010\u000e\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010\u000f\"\u0004\u0018\u00010\u0001H\u0016¢\u0006\u0002\u0010\u0010J\u0012\u0010\u0014\u001a\u00020\f2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0016J9\u0010\u0014\u001a\u00020\f2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00122\b\u0010\r\u001a\u0004\u0018\u00010\u00052\u0016\u0010\u000e\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010\u000f\"\u0004\u0018\u00010\u0001H\u0016¢\u0006\u0002\u0010\u0013J'\u0010\u0015\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u00052\u0010\u0010\u000e\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010\u000fH\u0014¢\u0006\u0002\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u0012H\u0002J/\u0010\u0018\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u00052\u0016\u0010\u000e\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010\u000f\"\u0004\u0018\u00010\u0001H\u0016¢\u0006\u0002\u0010\u0010J\u0012\u0010\u0018\u001a\u00020\f2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0016J9\u0010\u0018\u001a\u00020\f2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00122\b\u0010\r\u001a\u0004\u0018\u00010\u00052\u0016\u0010\u000e\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010\u000f\"\u0004\u0018\u00010\u0001H\u0016¢\u0006\u0002\u0010\u0013J\u0010\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001cH\u0015J\u001a\u0010\u0019\u001a\u00020\u001a2\b\u0010\b\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u001b\u001a\u00020\u001cH\u0014J7\u0010\u001d\u001a\u00020\f2\u0006\u0010\u001b\u001a\u00020\u001c2\b\u0010\r\u001a\u0004\u0018\u00010\u00052\u0016\u0010\u000e\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010\u000f\"\u0004\u0018\u00010\u0001H\u0016¢\u0006\u0002\u0010\u001eJ,\u0010\u001d\u001a\u00020\f2\u0006\u0010\u001b\u001a\u00020\u001c2\b\u0010\b\u001a\u0004\u0018\u00010\u00052\u0006\u0010\r\u001a\u00020\u00052\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H$J\u001a\u0010\u001d\u001a\u00020\f2\u0006\u0010\u001b\u001a\u00020\u001c2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0016JA\u0010\u001d\u001a\u00020\f2\u0006\u0010\u001b\u001a\u00020\u001c2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00122\b\u0010\r\u001a\u0004\u0018\u00010\u00052\u0016\u0010\u000e\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010\u000f\"\u0004\u0018\u00010\u0001H\u0016¢\u0006\u0002\u0010\u001fJA\u0010 \u001a\u00020\f2\u0006\u0010\u001b\u001a\u00020\u001c2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00122\b\u0010\r\u001a\u0004\u0018\u00010\u00052\u0016\u0010\u000e\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010\u000f\"\u0004\u0018\u00010\u0001H\u0002¢\u0006\u0002\u0010\u001fJ/\u0010!\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u00052\u0016\u0010\u000e\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010\u000f\"\u0004\u0018\u00010\u0001H\u0016¢\u0006\u0002\u0010\u0010J\u0012\u0010!\u001a\u00020\f2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0016J9\u0010!\u001a\u00020\f2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00122\b\u0010\r\u001a\u0004\u0018\u00010\u00052\u0016\u0010\u000e\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010\u000f\"\u0004\u0018\u00010\u0001H\u0016¢\u0006\u0002\u0010\u0013J/\u0010\"\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u00052\u0016\u0010\u000e\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010\u000f\"\u0004\u0018\u00010\u0001H\u0016¢\u0006\u0002\u0010\u0010J\u0012\u0010\"\u001a\u00020\f2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0016J9\u0010\"\u001a\u00020\f2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00122\b\u0010\r\u001a\u0004\u0018\u00010\u00052\u0016\u0010\u000e\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010\u000f\"\u0004\u0018\u00010\u0001H\u0016¢\u0006\u0002\u0010\u0013J/\u0010#\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u00052\u0016\u0010\u000e\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010\u000f\"\u0004\u0018\u00010\u0001H\u0016¢\u0006\u0002\u0010\u0010J\u0012\u0010#\u001a\u00020\f2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0016J9\u0010#\u001a\u00020\f2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00122\b\u0010\r\u001a\u0004\u0018\u00010\u00052\u0016\u0010\u000e\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010\u000f\"\u0004\u0018\u00010\u0001H\u0016¢\u0006\u0002\u0010\u0013R\u001c\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048@X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0016\u0010\b\u001a\u0004\u0018\u00010\u00058PX\u0090\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\n¨\u0006$"}, d2 = {"Ltimber/log/Timber$Tree;", "", "()V", "explicitTag", "Ljava/lang/ThreadLocal;", "", "getExplicitTag$timber_release", "()Ljava/lang/ThreadLocal;", ViewHierarchyConstants.TAG_KEY, "getTag$timber_release", "()Ljava/lang/String;", "d", "", ShareConstants.WEB_DIALOG_PARAM_MESSAGE, "args", "", "(Ljava/lang/String;[Ljava/lang/Object;)V", "t", "", "(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V", "e", "formatMessage", "(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;", "getStackTraceString", "i", "isLoggable", "", LogFactory.PRIORITY_KEY, "", "log", "(ILjava/lang/String;[Ljava/lang/Object;)V", "(ILjava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V", "prepareLog", "v", "w", "wtf", "timber_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    /* loaded from: classes5.dex */
    public static abstract class Tree {
        private final ThreadLocal<String> explicitTag = new ThreadLocal<>();

        @Deprecated(message = "Use isLoggable(String, int)", replaceWith = @ReplaceWith(expression = "this.isLoggable(null, priority)", imports = {}))
        protected boolean isLoggable(int i) {
            return true;
        }

        protected abstract void log(int i, String str, String str2, Throwable th);

        public final /* synthetic */ ThreadLocal getExplicitTag$timber_release() {
            return this.explicitTag;
        }

        public /* synthetic */ String getTag$timber_release() {
            String str = this.explicitTag.get();
            if (str != null) {
                this.explicitTag.remove();
            }
            return str;
        }

        public void v(String str, Object... args) {
            Intrinsics.checkNotNullParameter(args, "args");
            prepareLog(2, null, str, Arrays.copyOf(args, args.length));
        }

        public void v(Throwable th, String str, Object... args) {
            Intrinsics.checkNotNullParameter(args, "args");
            prepareLog(2, th, str, Arrays.copyOf(args, args.length));
        }

        public void v(Throwable th) {
            prepareLog(2, th, null, new Object[0]);
        }

        public void d(String str, Object... args) {
            Intrinsics.checkNotNullParameter(args, "args");
            prepareLog(3, null, str, Arrays.copyOf(args, args.length));
        }

        public void d(Throwable th, String str, Object... args) {
            Intrinsics.checkNotNullParameter(args, "args");
            prepareLog(3, th, str, Arrays.copyOf(args, args.length));
        }

        public void d(Throwable th) {
            prepareLog(3, th, null, new Object[0]);
        }

        public void i(String str, Object... args) {
            Intrinsics.checkNotNullParameter(args, "args");
            prepareLog(4, null, str, Arrays.copyOf(args, args.length));
        }

        public void i(Throwable th, String str, Object... args) {
            Intrinsics.checkNotNullParameter(args, "args");
            prepareLog(4, th, str, Arrays.copyOf(args, args.length));
        }

        public void i(Throwable th) {
            prepareLog(4, th, null, new Object[0]);
        }

        public void w(String str, Object... args) {
            Intrinsics.checkNotNullParameter(args, "args");
            prepareLog(5, null, str, Arrays.copyOf(args, args.length));
        }

        public void w(Throwable th, String str, Object... args) {
            Intrinsics.checkNotNullParameter(args, "args");
            prepareLog(5, th, str, Arrays.copyOf(args, args.length));
        }

        public void w(Throwable th) {
            prepareLog(5, th, null, new Object[0]);
        }

        public void e(String str, Object... args) {
            Intrinsics.checkNotNullParameter(args, "args");
            prepareLog(6, null, str, Arrays.copyOf(args, args.length));
        }

        public void e(Throwable th, String str, Object... args) {
            Intrinsics.checkNotNullParameter(args, "args");
            prepareLog(6, th, str, Arrays.copyOf(args, args.length));
        }

        public void e(Throwable th) {
            prepareLog(6, th, null, new Object[0]);
        }

        public void wtf(String str, Object... args) {
            Intrinsics.checkNotNullParameter(args, "args");
            prepareLog(7, null, str, Arrays.copyOf(args, args.length));
        }

        public void wtf(Throwable th, String str, Object... args) {
            Intrinsics.checkNotNullParameter(args, "args");
            prepareLog(7, th, str, Arrays.copyOf(args, args.length));
        }

        public void wtf(Throwable th) {
            prepareLog(7, th, null, new Object[0]);
        }

        public void log(int i, String str, Object... args) {
            Intrinsics.checkNotNullParameter(args, "args");
            prepareLog(i, null, str, Arrays.copyOf(args, args.length));
        }

        public void log(int i, Throwable th, String str, Object... args) {
            Intrinsics.checkNotNullParameter(args, "args");
            prepareLog(i, th, str, Arrays.copyOf(args, args.length));
        }

        public void log(int i, Throwable th) {
            prepareLog(i, th, null, new Object[0]);
        }

        protected boolean isLoggable(String str, int i) {
            return isLoggable(i);
        }

        private final void prepareLog(int i, Throwable th, String str, Object... objArr) {
            String tag$timber_release = getTag$timber_release();
            if (isLoggable(tag$timber_release, i)) {
                String str2 = str;
                if (!(str2 == null || str2.length() == 0)) {
                    if (!(objArr.length == 0)) {
                        str = formatMessage(str, objArr);
                    }
                    if (th != null) {
                        str = ((Object) str) + '\n' + getStackTraceString(th);
                    }
                } else if (th == null) {
                    return;
                } else {
                    str = getStackTraceString(th);
                }
                log(i, tag$timber_release, str, th);
            }
        }

        protected String formatMessage(String message, Object[] args) {
            Intrinsics.checkNotNullParameter(message, "message");
            Intrinsics.checkNotNullParameter(args, "args");
            Object[] copyOf = Arrays.copyOf(args, args.length);
            String format = String.format(message, Arrays.copyOf(copyOf, copyOf.length));
            Intrinsics.checkNotNullExpressionValue(format, "java.lang.String.format(this, *args)");
            return format;
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
    }

    /* compiled from: Timber.kt */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0002\b\u0016\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\n\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u000b\u001a\u00020\fH\u0014J,\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\b\u0010\u0007\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0011\u001a\u00020\u00052\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0014R\u001c\u0010\u0003\u001a\u0010\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u00050\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00058PX\u0090\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\u0015"}, d2 = {"Ltimber/log/Timber$DebugTree;", "Ltimber/log/Timber$Tree;", "()V", "fqcnIgnore", "", "", "kotlin.jvm.PlatformType", ViewHierarchyConstants.TAG_KEY, "getTag$timber_release", "()Ljava/lang/String;", "createStackElementTag", "element", "Ljava/lang/StackTraceElement;", "log", "", LogFactory.PRIORITY_KEY, "", ShareConstants.WEB_DIALOG_PARAM_MESSAGE, "t", "", "Companion", "timber_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    /* loaded from: classes5.dex */
    public static class DebugTree extends Tree {
        private static final int MAX_LOG_LENGTH = 4000;
        private static final int MAX_TAG_LENGTH = 23;
        private final List<String> fqcnIgnore = CollectionsKt.listOf((Object[]) new String[]{Timber.class.getName(), Forest.class.getName(), Tree.class.getName(), DebugTree.class.getName()});
        public static final Companion Companion = new Companion(null);
        private static final Pattern ANONYMOUS_CLASS = Pattern.compile("(\\$\\d+)+$");

        @Override // timber.log.Timber.Tree
        public String getTag$timber_release() {
            StackTraceElement[] stackTraceElementArr;
            String tag$timber_release = super.getTag$timber_release();
            if (tag$timber_release == null) {
                StackTraceElement[] stackTrace = new Throwable().getStackTrace();
                Intrinsics.checkNotNullExpressionValue(stackTrace, "Throwable().stackTrace");
                for (StackTraceElement stackTraceElement : stackTrace) {
                    if (!this.fqcnIgnore.contains(stackTraceElement.getClassName())) {
                        return createStackElementTag(stackTraceElement);
                    }
                }
                throw new NoSuchElementException("Array contains no element matching the predicate.");
            }
            return tag$timber_release;
        }

        protected String createStackElementTag(StackTraceElement element) {
            Intrinsics.checkNotNullParameter(element, "element");
            String className = element.getClassName();
            Intrinsics.checkNotNullExpressionValue(className, "element.className");
            String substringAfterLast$default = StringsKt.substringAfterLast$default(className, (char) ClassUtils.PACKAGE_SEPARATOR_CHAR, (String) null, 2, (Object) null);
            Matcher matcher = ANONYMOUS_CLASS.matcher(substringAfterLast$default);
            if (matcher.find()) {
                substringAfterLast$default = matcher.replaceAll("");
                Intrinsics.checkNotNullExpressionValue(substringAfterLast$default, "m.replaceAll(\"\")");
            }
            if (substringAfterLast$default.length() <= 23 || Build.VERSION.SDK_INT >= 26) {
                return substringAfterLast$default;
            }
            if (substringAfterLast$default != null) {
                String substring = substringAfterLast$default.substring(0, 23);
                Intrinsics.checkNotNullExpressionValue(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                return substring;
            }
            throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
        }

        @Override // timber.log.Timber.Tree
        protected void log(int i, String str, String message, Throwable th) {
            int min;
            Intrinsics.checkNotNullParameter(message, "message");
            if (message.length() < MAX_LOG_LENGTH) {
                if (i == 7) {
                    Log.wtf(str, message);
                    return;
                } else {
                    Log.println(i, str, message);
                    return;
                }
            }
            int length = message.length();
            int i2 = 0;
            while (i2 < length) {
                int indexOf$default = StringsKt.indexOf$default((CharSequence) message, '\n', i2, false, 4, (Object) null);
                if (indexOf$default == -1) {
                    indexOf$default = length;
                }
                while (true) {
                    min = Math.min(indexOf$default, i2 + MAX_LOG_LENGTH);
                    String substring = message.substring(i2, min);
                    Intrinsics.checkNotNullExpressionValue(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                    if (i == 7) {
                        Log.wtf(str, substring);
                    } else {
                        Log.println(i, str, substring);
                    }
                    if (min >= indexOf$default) {
                        break;
                    }
                    i2 = min;
                }
                i2 = min + 1;
            }
        }

        /* compiled from: Timber.kt */
        @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0016\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Ltimber/log/Timber$DebugTree$Companion;", "", "()V", "ANONYMOUS_CLASS", "Ljava/util/regex/Pattern;", "kotlin.jvm.PlatformType", "MAX_LOG_LENGTH", "", "MAX_TAG_LENGTH", "timber_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
        /* loaded from: classes5.dex */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }
        }
    }

    /* compiled from: Timber.kt */
    @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u000f\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\t\u0010\u000b\u001a\u00020\u0001H\u0097\bJ1\u0010\f\u001a\u00020\r2\n\b\u0001\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0016\u0010\u0010\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00110\u0004\"\u0004\u0018\u00010\u0011H\u0017¢\u0006\u0002\u0010\u0012J\u0012\u0010\f\u001a\u00020\r2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0017J;\u0010\f\u001a\u00020\r2\b\u0010\u0013\u001a\u0004\u0018\u00010\u00142\n\b\u0001\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0016\u0010\u0010\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00110\u0004\"\u0004\u0018\u00010\u0011H\u0017¢\u0006\u0002\u0010\u0015J1\u0010\u0016\u001a\u00020\r2\n\b\u0001\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0016\u0010\u0010\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00110\u0004\"\u0004\u0018\u00010\u0011H\u0017¢\u0006\u0002\u0010\u0012J\u0012\u0010\u0016\u001a\u00020\r2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0017J;\u0010\u0016\u001a\u00020\r2\b\u0010\u0013\u001a\u0004\u0018\u00010\u00142\n\b\u0001\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0016\u0010\u0010\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00110\u0004\"\u0004\u0018\u00010\u0011H\u0017¢\u0006\u0002\u0010\u0015J\u000e\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00010\u0018H\u0007J1\u0010\u0019\u001a\u00020\r2\n\b\u0001\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0016\u0010\u0010\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00110\u0004\"\u0004\u0018\u00010\u0011H\u0017¢\u0006\u0002\u0010\u0012J\u0012\u0010\u0019\u001a\u00020\r2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0017J;\u0010\u0019\u001a\u00020\r2\b\u0010\u0013\u001a\u0004\u0018\u00010\u00142\n\b\u0001\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0016\u0010\u0010\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00110\u0004\"\u0004\u0018\u00010\u0011H\u0017¢\u0006\u0002\u0010\u0015J9\u0010\u001a\u001a\u00020\r2\u0006\u0010\u001b\u001a\u00020\u00072\n\b\u0001\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0016\u0010\u0010\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00110\u0004\"\u0004\u0018\u00010\u0011H\u0017¢\u0006\u0002\u0010\u001cJ,\u0010\u001a\u001a\u00020\r2\u0006\u0010\u001b\u001a\u00020\u00072\b\u0010\u001d\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0014J\u001a\u0010\u001a\u001a\u00020\r2\u0006\u0010\u001b\u001a\u00020\u00072\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0017JC\u0010\u001a\u001a\u00020\r2\u0006\u0010\u001b\u001a\u00020\u00072\b\u0010\u0013\u001a\u0004\u0018\u00010\u00142\n\b\u0001\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0016\u0010\u0010\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00110\u0004\"\u0004\u0018\u00010\u0011H\u0017¢\u0006\u0002\u0010\u001eJ!\u0010\u001f\u001a\u00020\r2\u0012\u0010\t\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u0004\"\u00020\u0001H\u0007¢\u0006\u0002\u0010 J\u0010\u0010\u001f\u001a\u00020\r2\u0006\u0010!\u001a\u00020\u0001H\u0007J\u0010\u0010\u001d\u001a\u00020\u00012\u0006\u0010\u001d\u001a\u00020\u000fH\u0007J\u0010\u0010\"\u001a\u00020\r2\u0006\u0010!\u001a\u00020\u0001H\u0007J\b\u0010#\u001a\u00020\rH\u0007J1\u0010$\u001a\u00020\r2\n\b\u0001\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0016\u0010\u0010\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00110\u0004\"\u0004\u0018\u00010\u0011H\u0017¢\u0006\u0002\u0010\u0012J\u0012\u0010$\u001a\u00020\r2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0017J;\u0010$\u001a\u00020\r2\b\u0010\u0013\u001a\u0004\u0018\u00010\u00142\n\b\u0001\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0016\u0010\u0010\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00110\u0004\"\u0004\u0018\u00010\u0011H\u0017¢\u0006\u0002\u0010\u0015J1\u0010%\u001a\u00020\r2\n\b\u0001\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0016\u0010\u0010\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00110\u0004\"\u0004\u0018\u00010\u0011H\u0017¢\u0006\u0002\u0010\u0012J\u0012\u0010%\u001a\u00020\r2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0017J;\u0010%\u001a\u00020\r2\b\u0010\u0013\u001a\u0004\u0018\u00010\u00142\n\b\u0001\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0016\u0010\u0010\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00110\u0004\"\u0004\u0018\u00010\u0011H\u0017¢\u0006\u0002\u0010\u0015J1\u0010&\u001a\u00020\r2\n\b\u0001\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0016\u0010\u0010\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00110\u0004\"\u0004\u0018\u00010\u0011H\u0017¢\u0006\u0002\u0010\u0012J\u0012\u0010&\u001a\u00020\r2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0017J;\u0010&\u001a\u00020\r2\b\u0010\u0013\u001a\u0004\u0018\u00010\u00142\n\b\u0001\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0016\u0010\u0010\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00110\u0004\"\u0004\u0018\u00010\u0011H\u0017¢\u0006\u0002\u0010\u0015R\u0016\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u0004X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u0005R\u0011\u0010\u0006\u001a\u00020\u00078G¢\u0006\u0006\u001a\u0004\b\u0006\u0010\bR\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00010\nX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006'"}, d2 = {"Ltimber/log/Timber$Forest;", "Ltimber/log/Timber$Tree;", "()V", "treeArray", "", "[Ltimber/log/Timber$Tree;", "treeCount", "", "()I", "trees", "Ljava/util/ArrayList;", "asTree", "d", "", ShareConstants.WEB_DIALOG_PARAM_MESSAGE, "", "args", "", "(Ljava/lang/String;[Ljava/lang/Object;)V", "t", "", "(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V", "e", "forest", "", "i", "log", LogFactory.PRIORITY_KEY, "(ILjava/lang/String;[Ljava/lang/Object;)V", ViewHierarchyConstants.TAG_KEY, "(ILjava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V", "plant", "([Ltimber/log/Timber$Tree;)V", "tree", "uproot", "uprootAll", "v", "w", "wtf", "timber_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    /* loaded from: classes5.dex */
    public static final class Forest extends Tree {
        public /* synthetic */ Forest(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Forest() {
        }

        @Override // timber.log.Timber.Tree
        @JvmStatic
        public void v(String str, Object... args) {
            Intrinsics.checkNotNullParameter(args, "args");
            for (Tree tree : Timber.treeArray) {
                tree.v(str, Arrays.copyOf(args, args.length));
            }
        }

        @Override // timber.log.Timber.Tree
        @JvmStatic
        public void v(Throwable th, String str, Object... args) {
            Intrinsics.checkNotNullParameter(args, "args");
            for (Tree tree : Timber.treeArray) {
                tree.v(th, str, Arrays.copyOf(args, args.length));
            }
        }

        @Override // timber.log.Timber.Tree
        @JvmStatic
        public void v(Throwable th) {
            for (Tree tree : Timber.treeArray) {
                tree.v(th);
            }
        }

        @Override // timber.log.Timber.Tree
        @JvmStatic
        public void d(String str, Object... args) {
            Intrinsics.checkNotNullParameter(args, "args");
            for (Tree tree : Timber.treeArray) {
                tree.d(str, Arrays.copyOf(args, args.length));
            }
        }

        @Override // timber.log.Timber.Tree
        @JvmStatic
        public void d(Throwable th, String str, Object... args) {
            Intrinsics.checkNotNullParameter(args, "args");
            for (Tree tree : Timber.treeArray) {
                tree.d(th, str, Arrays.copyOf(args, args.length));
            }
        }

        @Override // timber.log.Timber.Tree
        @JvmStatic
        public void d(Throwable th) {
            for (Tree tree : Timber.treeArray) {
                tree.d(th);
            }
        }

        @Override // timber.log.Timber.Tree
        @JvmStatic
        public void i(String str, Object... args) {
            Intrinsics.checkNotNullParameter(args, "args");
            for (Tree tree : Timber.treeArray) {
                tree.i(str, Arrays.copyOf(args, args.length));
            }
        }

        @Override // timber.log.Timber.Tree
        @JvmStatic
        public void i(Throwable th, String str, Object... args) {
            Intrinsics.checkNotNullParameter(args, "args");
            for (Tree tree : Timber.treeArray) {
                tree.i(th, str, Arrays.copyOf(args, args.length));
            }
        }

        @Override // timber.log.Timber.Tree
        @JvmStatic
        public void i(Throwable th) {
            for (Tree tree : Timber.treeArray) {
                tree.i(th);
            }
        }

        @Override // timber.log.Timber.Tree
        @JvmStatic
        public void w(String str, Object... args) {
            Intrinsics.checkNotNullParameter(args, "args");
            for (Tree tree : Timber.treeArray) {
                tree.w(str, Arrays.copyOf(args, args.length));
            }
        }

        @Override // timber.log.Timber.Tree
        @JvmStatic
        public void w(Throwable th, String str, Object... args) {
            Intrinsics.checkNotNullParameter(args, "args");
            for (Tree tree : Timber.treeArray) {
                tree.w(th, str, Arrays.copyOf(args, args.length));
            }
        }

        @Override // timber.log.Timber.Tree
        @JvmStatic
        public void w(Throwable th) {
            for (Tree tree : Timber.treeArray) {
                tree.w(th);
            }
        }

        @Override // timber.log.Timber.Tree
        @JvmStatic
        public void e(String str, Object... args) {
            Intrinsics.checkNotNullParameter(args, "args");
            for (Tree tree : Timber.treeArray) {
                tree.e(str, Arrays.copyOf(args, args.length));
            }
        }

        @Override // timber.log.Timber.Tree
        @JvmStatic
        public void e(Throwable th, String str, Object... args) {
            Intrinsics.checkNotNullParameter(args, "args");
            for (Tree tree : Timber.treeArray) {
                tree.e(th, str, Arrays.copyOf(args, args.length));
            }
        }

        @Override // timber.log.Timber.Tree
        @JvmStatic
        public void e(Throwable th) {
            for (Tree tree : Timber.treeArray) {
                tree.e(th);
            }
        }

        @Override // timber.log.Timber.Tree
        @JvmStatic
        public void wtf(String str, Object... args) {
            Intrinsics.checkNotNullParameter(args, "args");
            for (Tree tree : Timber.treeArray) {
                tree.wtf(str, Arrays.copyOf(args, args.length));
            }
        }

        @Override // timber.log.Timber.Tree
        @JvmStatic
        public void wtf(Throwable th, String str, Object... args) {
            Intrinsics.checkNotNullParameter(args, "args");
            for (Tree tree : Timber.treeArray) {
                tree.wtf(th, str, Arrays.copyOf(args, args.length));
            }
        }

        @Override // timber.log.Timber.Tree
        @JvmStatic
        public void wtf(Throwable th) {
            for (Tree tree : Timber.treeArray) {
                tree.wtf(th);
            }
        }

        @Override // timber.log.Timber.Tree
        @JvmStatic
        public void log(int i, String str, Object... args) {
            Intrinsics.checkNotNullParameter(args, "args");
            for (Tree tree : Timber.treeArray) {
                tree.log(i, str, Arrays.copyOf(args, args.length));
            }
        }

        @Override // timber.log.Timber.Tree
        @JvmStatic
        public void log(int i, Throwable th, String str, Object... args) {
            Intrinsics.checkNotNullParameter(args, "args");
            for (Tree tree : Timber.treeArray) {
                tree.log(i, th, str, Arrays.copyOf(args, args.length));
            }
        }

        @Override // timber.log.Timber.Tree
        @JvmStatic
        public void log(int i, Throwable th) {
            for (Tree tree : Timber.treeArray) {
                tree.log(i, th);
            }
        }

        @Override // timber.log.Timber.Tree
        protected void log(int i, String str, String message, Throwable th) {
            Intrinsics.checkNotNullParameter(message, "message");
            throw new AssertionError();
        }

        @JvmStatic
        public Tree asTree() {
            return this;
        }

        @JvmStatic
        public final Tree tag(String tag) {
            Intrinsics.checkNotNullParameter(tag, "tag");
            Tree[] treeArr = Timber.treeArray;
            int length = treeArr.length;
            int i = 0;
            while (i < length) {
                Tree tree = treeArr[i];
                i++;
                tree.getExplicitTag$timber_release().set(tag);
            }
            return this;
        }

        @JvmStatic
        public final void plant(Tree tree) {
            Intrinsics.checkNotNullParameter(tree, "tree");
            if (tree != this) {
                synchronized (Timber.trees) {
                    Timber.trees.add(tree);
                    Forest forest = Timber.Forest;
                    Object[] array = Timber.trees.toArray(new Tree[0]);
                    if (array != null) {
                        Timber.treeArray = (Tree[]) array;
                        Unit unit = Unit.INSTANCE;
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
                    }
                }
                return;
            }
            throw new IllegalArgumentException("Cannot plant Timber into itself.".toString());
        }

        @JvmStatic
        public final void plant(Tree... trees) {
            boolean z;
            Intrinsics.checkNotNullParameter(trees, "trees");
            int length = trees.length;
            int i = 0;
            while (i < length) {
                Tree tree = trees[i];
                i++;
                if (tree == null) {
                    throw new IllegalArgumentException("trees contained null".toString());
                }
                if (tree != this) {
                    z = true;
                    continue;
                } else {
                    z = false;
                    continue;
                }
                if (!z) {
                    throw new IllegalArgumentException("Cannot plant Timber into itself.".toString());
                }
            }
            synchronized (Timber.trees) {
                Collections.addAll(Timber.trees, Arrays.copyOf(trees, trees.length));
                Forest forest = Timber.Forest;
                Object[] array = Timber.trees.toArray(new Tree[0]);
                if (array != null) {
                    Timber.treeArray = (Tree[]) array;
                    Unit unit = Unit.INSTANCE;
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
                }
            }
        }

        @JvmStatic
        public final void uproot(Tree tree) {
            Intrinsics.checkNotNullParameter(tree, "tree");
            synchronized (Timber.trees) {
                if (!Timber.trees.remove(tree)) {
                    throw new IllegalArgumentException(Intrinsics.stringPlus("Cannot uproot tree which is not planted: ", tree).toString());
                }
                Forest forest = Timber.Forest;
                Object[] array = Timber.trees.toArray(new Tree[0]);
                if (array != null) {
                    Timber.treeArray = (Tree[]) array;
                    Unit unit = Unit.INSTANCE;
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
                }
            }
        }

        @JvmStatic
        public final void uprootAll() {
            synchronized (Timber.trees) {
                Timber.trees.clear();
                Forest forest = Timber.Forest;
                Timber.treeArray = new Tree[0];
                Unit unit = Unit.INSTANCE;
            }
        }

        @JvmStatic
        public final List<Tree> forest() {
            List<Tree> unmodifiableList;
            synchronized (Timber.trees) {
                unmodifiableList = Collections.unmodifiableList(CollectionsKt.toList(Timber.trees));
                Intrinsics.checkNotNullExpressionValue(unmodifiableList, "unmodifiableList(trees.toList())");
            }
            return unmodifiableList;
        }

        @JvmStatic
        public final int treeCount() {
            return Timber.treeArray.length;
        }
    }
}
