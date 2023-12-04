package com.ifriend.common_utils;

import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.facebook.share.internal.ShareConstants;
import kotlin.Metadata;
import org.apache.commons.logging.LogFactory;
/* compiled from: Logger.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\u001a\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u0003H&J\u001a\u0010\b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u0003H&J\"\u0010\t\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0003H&J\u0010\u0010\t\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0003H&J\u0018\u0010\f\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u000eH&J\u0010\u0010\f\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u000eH&J\u0010\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u0003H&J\u001a\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u0003H&¨\u0006\u0012"}, d2 = {"Lcom/ifriend/common_utils/Logger;", "", "defaultTag", "", "error", "", ShareConstants.WEB_DIALOG_PARAM_MESSAGE, ViewHierarchyConstants.TAG_KEY, "info", "log", LogFactory.PRIORITY_KEY, "", "logException", "exception", "", "setUserId", "userId", "warn", "common_utils"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface Logger {
    String defaultTag();

    void error(String str, String str2);

    void info(String str, String str2);

    void log(int i, String str, String str2);

    void log(String str);

    void logException(String str, Throwable th);

    void logException(Throwable th);

    void setUserId(String str);

    void warn(String str, String str2);

    /* compiled from: Logger.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class DefaultImpls {
        public static String defaultTag(Logger logger) {
            return LoggerKt.LOG_TAG;
        }

        public static /* synthetic */ void log$default(Logger logger, int i, String str, String str2, int i2, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: log");
            }
            if ((i2 & 2) != 0) {
                str = logger.defaultTag();
            }
            logger.log(i, str, str2);
        }

        public static /* synthetic */ void info$default(Logger logger, String str, String str2, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: info");
            }
            if ((i & 2) != 0) {
                str2 = logger.defaultTag();
            }
            logger.info(str, str2);
        }

        public static /* synthetic */ void warn$default(Logger logger, String str, String str2, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: warn");
            }
            if ((i & 2) != 0) {
                str2 = logger.defaultTag();
            }
            logger.warn(str, str2);
        }

        public static /* synthetic */ void error$default(Logger logger, String str, String str2, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: error");
            }
            if ((i & 2) != 0) {
                str2 = logger.defaultTag();
            }
            logger.error(str, str2);
        }
    }
}
