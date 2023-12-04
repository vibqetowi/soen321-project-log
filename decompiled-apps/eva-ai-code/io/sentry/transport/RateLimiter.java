package io.sentry.transport;

import androidx.core.app.NotificationCompat;
import com.facebook.internal.security.CertificateUtil;
import io.sentry.ILogger;
import io.sentry.SentryEnvelope;
import io.sentry.SentryEnvelopeItem;
import io.sentry.SentryLevel;
import io.sentry.cache.EnvelopeCache;
import io.sentry.hints.Retryable;
import io.sentry.hints.SubmissionResult;
import io.sentry.util.StringUtils;
import java.util.ArrayList;
import java.util.Date;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.apache.http.client.config.CookieSpecs;
/* loaded from: classes4.dex */
public final class RateLimiter {
    private static final int HTTP_RETRY_AFTER_DEFAULT_DELAY_MILLIS = 60000;
    private final ICurrentDateProvider currentDateProvider;
    private final ILogger logger;
    private final Map<DataCategory, Date> sentryRetryAfterLimit;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes4.dex */
    public enum DataCategory {
        All("__all__"),
        Default(CookieSpecs.DEFAULT),
        Error("error"),
        Session(EnvelopeCache.PREFIX_CURRENT_SESSION_FILE),
        Attachment("attachment"),
        Transaction("transaction"),
        Security("security"),
        Unknown("unknown");
        
        private final String category;

        DataCategory(String str) {
            this.category = str;
        }

        public String getCategory() {
            return this.category;
        }
    }

    public RateLimiter(ICurrentDateProvider iCurrentDateProvider, ILogger iLogger) {
        this.sentryRetryAfterLimit = new ConcurrentHashMap();
        this.currentDateProvider = iCurrentDateProvider;
        this.logger = iLogger;
    }

    public RateLimiter(ILogger iLogger) {
        this(CurrentDateProvider.getInstance(), iLogger);
    }

    public SentryEnvelope filter(SentryEnvelope sentryEnvelope, Object obj) {
        ArrayList arrayList = null;
        for (SentryEnvelopeItem sentryEnvelopeItem : sentryEnvelope.getItems()) {
            if (isRetryAfter(sentryEnvelopeItem.getHeader().getType().getItemType())) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(sentryEnvelopeItem);
            }
        }
        if (arrayList != null) {
            this.logger.log(SentryLevel.INFO, "%d items will be dropped due rate limiting.", Integer.valueOf(arrayList.size()));
            ArrayList arrayList2 = new ArrayList();
            for (SentryEnvelopeItem sentryEnvelopeItem2 : sentryEnvelope.getItems()) {
                if (!arrayList.contains(sentryEnvelopeItem2)) {
                    arrayList2.add(sentryEnvelopeItem2);
                }
            }
            if (arrayList2.isEmpty()) {
                this.logger.log(SentryLevel.INFO, "Envelope discarded due all items rate limited.", new Object[0]);
                markHintWhenSendingFailed(obj, false);
                return null;
            }
            return new SentryEnvelope(sentryEnvelope.getHeader(), arrayList2);
        }
        return sentryEnvelope;
    }

    private static void markHintWhenSendingFailed(Object obj, boolean z) {
        if (obj instanceof SubmissionResult) {
            ((SubmissionResult) obj).setResult(false);
        }
        if (obj instanceof Retryable) {
            ((Retryable) obj).setRetry(z);
        }
    }

    private boolean isRetryAfter(String str) {
        Date date;
        DataCategory categoryFromItemType = getCategoryFromItemType(str);
        Date date2 = new Date(this.currentDateProvider.getCurrentTimeMillis());
        Date date3 = this.sentryRetryAfterLimit.get(DataCategory.All);
        if (date3 == null || date2.after(date3)) {
            if (DataCategory.Unknown.equals(categoryFromItemType) || (date = this.sentryRetryAfterLimit.get(categoryFromItemType)) == null) {
                return false;
            }
            return !date2.after(date);
        }
        return true;
    }

    private DataCategory getCategoryFromItemType(String str) {
        str.hashCode();
        char c = 65535;
        switch (str.hashCode()) {
            case -1963501277:
                if (str.equals("attachment")) {
                    c = 0;
                    break;
                }
                break;
            case 96891546:
                if (str.equals(NotificationCompat.CATEGORY_EVENT)) {
                    c = 1;
                    break;
                }
                break;
            case 1984987798:
                if (str.equals(EnvelopeCache.PREFIX_CURRENT_SESSION_FILE)) {
                    c = 2;
                    break;
                }
                break;
            case 2141246174:
                if (str.equals("transaction")) {
                    c = 3;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                return DataCategory.Attachment;
            case 1:
                return DataCategory.Error;
            case 2:
                return DataCategory.Session;
            case 3:
                return DataCategory.Transaction;
            default:
                return DataCategory.Unknown;
        }
    }

    public void updateRetryAfterLimits(String str, String str2, int i) {
        String[] split;
        if (str == null) {
            if (i == 429) {
                applyRetryAfterOnlyIfLonger(DataCategory.All, new Date(this.currentDateProvider.getCurrentTimeMillis() + parseRetryAfterOrDefault(str2)));
                return;
            }
            return;
        }
        int i2 = -1;
        String[] split2 = str.split(",", -1);
        int length = split2.length;
        int i3 = 0;
        while (i3 < length) {
            String[] split3 = split2[i3].replace(" ", "").split(CertificateUtil.DELIMITER, i2);
            if (split3.length > 0) {
                long parseRetryAfterOrDefault = parseRetryAfterOrDefault(split3[0]);
                if (split3.length > 1) {
                    String str3 = split3[1];
                    Date date = new Date(this.currentDateProvider.getCurrentTimeMillis() + parseRetryAfterOrDefault);
                    if (str3 != null && !str3.isEmpty()) {
                        for (String str4 : str3.split(";", i2)) {
                            DataCategory dataCategory = DataCategory.Unknown;
                            try {
                                String capitalize = StringUtils.capitalize(str4);
                                if (capitalize != null) {
                                    dataCategory = DataCategory.valueOf(capitalize);
                                } else {
                                    this.logger.log(SentryLevel.ERROR, "Couldn't capitalize: %s", str4);
                                }
                            } catch (IllegalArgumentException e) {
                                this.logger.log(SentryLevel.INFO, e, "Unknown category: %s", str4);
                            }
                            if (!DataCategory.Unknown.equals(dataCategory)) {
                                applyRetryAfterOnlyIfLonger(dataCategory, date);
                            }
                        }
                    } else {
                        applyRetryAfterOnlyIfLonger(DataCategory.All, date);
                    }
                }
            }
            i3++;
            i2 = -1;
        }
    }

    private void applyRetryAfterOnlyIfLonger(DataCategory dataCategory, Date date) {
        Date date2 = this.sentryRetryAfterLimit.get(dataCategory);
        if (date2 == null || date.after(date2)) {
            this.sentryRetryAfterLimit.put(dataCategory, date);
        }
    }

    private long parseRetryAfterOrDefault(String str) {
        if (str != null) {
            try {
                return (long) (Double.parseDouble(str) * 1000.0d);
            } catch (NumberFormatException unused) {
            }
        }
        return 60000L;
    }
}
