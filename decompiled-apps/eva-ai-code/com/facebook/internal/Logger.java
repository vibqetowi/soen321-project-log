package com.facebook.internal;

import android.util.Log;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.facebook.FacebookSdk;
import com.facebook.LoggingBehavior;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import io.grpc.netty.shaded.io.netty.handler.codec.rtsp.RtspHeaders;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.StringsKt;
import org.apache.commons.logging.LogFactory;
/* compiled from: Logger.kt */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u0000  2\u00020\u0001:\u0001 B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u000e\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0005J'\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u00052\u0012\u0010\u0015\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u0016\"\u00020\u0001¢\u0006\u0002\u0010\u0017J\u0012\u0010\u0011\u001a\u00020\u00122\n\u0010\u0018\u001a\u00060\bj\u0002`\tJ\u0016\u0010\u0019\u001a\u00020\u00122\u0006\u0010\u001a\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u0001J\u0006\u0010\u001b\u001a\u00020\u0005J\u0006\u0010\u001c\u001a\u00020\u0012J\u000e\u0010\u001d\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0005J\b\u0010\u001e\u001a\u00020\u001fH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0007\u001a\u00060\bj\u0002`\tX\u0082\u000e¢\u0006\u0002\n\u0000R$\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u000b@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006!"}, d2 = {"Lcom/facebook/internal/Logger;", "", "behavior", "Lcom/facebook/LoggingBehavior;", ViewHierarchyConstants.TAG_KEY, "", "(Lcom/facebook/LoggingBehavior;Ljava/lang/String;)V", "contents", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "value", "", LogFactory.PRIORITY_KEY, "getPriority", "()I", "setPriority", "(I)V", RtspHeaders.Values.APPEND, "", TypedValues.Custom.S_STRING, "format", "args", "", "(Ljava/lang/String;[Ljava/lang/Object;)V", "stringBuilder", "appendKeyValue", "key", "getContents", "log", "logString", "shouldLog", "", "Companion", "facebook-core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes2.dex */
public final class Logger {
    public static final String LOG_TAG_BASE = "FacebookSDK.";
    private final LoggingBehavior behavior;
    private StringBuilder contents;
    private int priority;
    private final String tag;
    public static final Companion Companion = new Companion(null);
    private static final HashMap<String, String> stringsToReplace = new HashMap<>();

    @JvmStatic
    public static final void log(LoggingBehavior loggingBehavior, int i, String str, String str2) {
        Companion.log(loggingBehavior, i, str, str2);
    }

    @JvmStatic
    public static final void log(LoggingBehavior loggingBehavior, int i, String str, String str2, Object... objArr) {
        Companion.log(loggingBehavior, i, str, str2, objArr);
    }

    @JvmStatic
    public static final void log(LoggingBehavior loggingBehavior, String str, String str2) {
        Companion.log(loggingBehavior, str, str2);
    }

    @JvmStatic
    public static final void log(LoggingBehavior loggingBehavior, String str, String str2, Object... objArr) {
        Companion.log(loggingBehavior, str, str2, objArr);
    }

    @JvmStatic
    public static final synchronized void registerAccessToken(String str) {
        synchronized (Logger.class) {
            Companion.registerAccessToken(str);
        }
    }

    @JvmStatic
    public static final synchronized void registerStringToReplace(String str, String str2) {
        synchronized (Logger.class) {
            Companion.registerStringToReplace(str, str2);
        }
    }

    public Logger(LoggingBehavior behavior, String tag) {
        Intrinsics.checkNotNullParameter(behavior, "behavior");
        Intrinsics.checkNotNullParameter(tag, "tag");
        this.priority = 3;
        this.behavior = behavior;
        Validate validate = Validate.INSTANCE;
        this.tag = Intrinsics.stringPlus(LOG_TAG_BASE, Validate.notNullOrEmpty(tag, ViewHierarchyConstants.TAG_KEY));
        this.contents = new StringBuilder();
    }

    public final int getPriority() {
        return this.priority;
    }

    public final void setPriority(int i) {
        Validate validate = Validate.INSTANCE;
        Validate.oneOf(Integer.valueOf(i), "value", 7, 3, 6, 4, 2, 5);
        setPriority(i);
    }

    public final String getContents() {
        Companion companion = Companion;
        String sb = this.contents.toString();
        Intrinsics.checkNotNullExpressionValue(sb, "contents.toString()");
        return companion.replaceStrings(sb);
    }

    public final void log() {
        String sb = this.contents.toString();
        Intrinsics.checkNotNullExpressionValue(sb, "contents.toString()");
        logString(sb);
        this.contents = new StringBuilder();
    }

    public final void logString(String string) {
        Intrinsics.checkNotNullParameter(string, "string");
        Companion.log(this.behavior, this.priority, this.tag, string);
    }

    public final void append(StringBuilder stringBuilder) {
        Intrinsics.checkNotNullParameter(stringBuilder, "stringBuilder");
        if (shouldLog()) {
            this.contents.append((CharSequence) stringBuilder);
        }
    }

    public final void append(String string) {
        Intrinsics.checkNotNullParameter(string, "string");
        if (shouldLog()) {
            this.contents.append(string);
        }
    }

    public final void append(String format, Object... args) {
        Intrinsics.checkNotNullParameter(format, "format");
        Intrinsics.checkNotNullParameter(args, "args");
        if (shouldLog()) {
            StringBuilder sb = this.contents;
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            Object[] copyOf = Arrays.copyOf(args, args.length);
            String format2 = String.format(format, Arrays.copyOf(copyOf, copyOf.length));
            Intrinsics.checkNotNullExpressionValue(format2, "java.lang.String.format(format, *args)");
            sb.append(format2);
        }
    }

    public final void appendKeyValue(String key, Object value) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        append("  %s:\t%s\n", key, value);
    }

    private final boolean shouldLog() {
        FacebookSdk facebookSdk = FacebookSdk.INSTANCE;
        return FacebookSdk.isLoggingBehaviorEnabled(this.behavior);
    }

    /* compiled from: Logger.kt */
    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J(\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u0004H\u0007JA\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u00042\u0012\u0010\u0011\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u0012\"\u00020\u0001H\u0007¢\u0006\u0002\u0010\u0013J \u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u0004H\u0007J9\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u00042\u0012\u0010\u0011\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u0012\"\u00020\u0001H\u0007¢\u0006\u0002\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\t2\u0006\u0010\u0016\u001a\u00020\u0004H\u0007J\u0018\u0010\u0017\u001a\u00020\t2\u0006\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u0004H\u0007J\u0010\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u0004H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R*\u0010\u0005\u001a\u001e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0006j\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004`\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001b"}, d2 = {"Lcom/facebook/internal/Logger$Companion;", "", "()V", "LOG_TAG_BASE", "", "stringsToReplace", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "log", "", "behavior", "Lcom/facebook/LoggingBehavior;", LogFactory.PRIORITY_KEY, "", ViewHierarchyConstants.TAG_KEY, TypedValues.Custom.S_STRING, "format", "args", "", "(Lcom/facebook/LoggingBehavior;ILjava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V", "(Lcom/facebook/LoggingBehavior;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V", "registerAccessToken", "accessToken", "registerStringToReplace", "original", "replace", "replaceStrings", "facebook-core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final synchronized void registerStringToReplace(String original, String replace) {
            Intrinsics.checkNotNullParameter(original, "original");
            Intrinsics.checkNotNullParameter(replace, "replace");
            Logger.stringsToReplace.put(original, replace);
        }

        @JvmStatic
        public final synchronized void registerAccessToken(String accessToken) {
            Intrinsics.checkNotNullParameter(accessToken, "accessToken");
            FacebookSdk facebookSdk = FacebookSdk.INSTANCE;
            if (!FacebookSdk.isLoggingBehaviorEnabled(LoggingBehavior.INCLUDE_ACCESS_TOKENS)) {
                registerStringToReplace(accessToken, "ACCESS_TOKEN_REMOVED");
            }
        }

        @JvmStatic
        public final void log(LoggingBehavior behavior, String tag, String string) {
            Intrinsics.checkNotNullParameter(behavior, "behavior");
            Intrinsics.checkNotNullParameter(tag, "tag");
            Intrinsics.checkNotNullParameter(string, "string");
            log(behavior, 3, tag, string);
        }

        @JvmStatic
        public final void log(LoggingBehavior behavior, String tag, String format, Object... args) {
            Intrinsics.checkNotNullParameter(behavior, "behavior");
            Intrinsics.checkNotNullParameter(tag, "tag");
            Intrinsics.checkNotNullParameter(format, "format");
            Intrinsics.checkNotNullParameter(args, "args");
            FacebookSdk facebookSdk = FacebookSdk.INSTANCE;
            if (FacebookSdk.isLoggingBehaviorEnabled(behavior)) {
                StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                Object[] copyOf = Arrays.copyOf(args, args.length);
                String format2 = String.format(format, Arrays.copyOf(copyOf, copyOf.length));
                Intrinsics.checkNotNullExpressionValue(format2, "java.lang.String.format(format, *args)");
                log(behavior, 3, tag, format2);
            }
        }

        @JvmStatic
        public final void log(LoggingBehavior behavior, int i, String tag, String format, Object... args) {
            Intrinsics.checkNotNullParameter(behavior, "behavior");
            Intrinsics.checkNotNullParameter(tag, "tag");
            Intrinsics.checkNotNullParameter(format, "format");
            Intrinsics.checkNotNullParameter(args, "args");
            FacebookSdk facebookSdk = FacebookSdk.INSTANCE;
            if (FacebookSdk.isLoggingBehaviorEnabled(behavior)) {
                StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                Object[] copyOf = Arrays.copyOf(args, args.length);
                String format2 = String.format(format, Arrays.copyOf(copyOf, copyOf.length));
                Intrinsics.checkNotNullExpressionValue(format2, "java.lang.String.format(format, *args)");
                log(behavior, i, tag, format2);
            }
        }

        @JvmStatic
        public final void log(LoggingBehavior behavior, int i, String tag, String string) {
            Intrinsics.checkNotNullParameter(behavior, "behavior");
            Intrinsics.checkNotNullParameter(tag, "tag");
            Intrinsics.checkNotNullParameter(string, "string");
            FacebookSdk facebookSdk = FacebookSdk.INSTANCE;
            if (FacebookSdk.isLoggingBehaviorEnabled(behavior)) {
                String replaceStrings = replaceStrings(string);
                if (!StringsKt.startsWith$default(tag, Logger.LOG_TAG_BASE, false, 2, (Object) null)) {
                    tag = Intrinsics.stringPlus(Logger.LOG_TAG_BASE, tag);
                }
                Log.println(i, tag, replaceStrings);
                if (behavior == LoggingBehavior.DEVELOPER_ERRORS) {
                    new Exception().printStackTrace();
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final synchronized String replaceStrings(String str) {
            String str2;
            str2 = str;
            for (Map.Entry entry : Logger.stringsToReplace.entrySet()) {
                str2 = StringsKt.replace$default(str2, (String) entry.getKey(), (String) entry.getValue(), false, 4, (Object) null);
            }
            return str2;
        }
    }
}
