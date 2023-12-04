package org.threeten.bp.format;

import androidx.camera.view.PreviewView$1$$ExternalSyntheticBackportWithForwarding0;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import org.threeten.bp.temporal.TemporalField;
/* loaded from: classes5.dex */
public abstract class DateTimeTextProvider {
    private static final AtomicReference<DateTimeTextProvider> MUTABLE_PROVIDER = new AtomicReference<>();

    public abstract String getText(TemporalField temporalField, long j, TextStyle textStyle, Locale locale);

    public abstract Iterator<Map.Entry<String, Long>> getTextIterator(TemporalField temporalField, TextStyle textStyle, Locale locale);

    /* JADX INFO: Access modifiers changed from: package-private */
    public static DateTimeTextProvider getInstance() {
        return ProviderSingleton.PROVIDER;
    }

    public static void setInitializer(DateTimeTextProvider dateTimeTextProvider) {
        if (!PreviewView$1$$ExternalSyntheticBackportWithForwarding0.m(MUTABLE_PROVIDER, null, dateTimeTextProvider)) {
            throw new IllegalStateException("Provider was already set, possibly with a default during initialization");
        }
    }

    /* loaded from: classes5.dex */
    static class ProviderSingleton {
        static final DateTimeTextProvider PROVIDER = initialize();

        ProviderSingleton() {
        }

        static DateTimeTextProvider initialize() {
            PreviewView$1$$ExternalSyntheticBackportWithForwarding0.m(DateTimeTextProvider.MUTABLE_PROVIDER, null, new SimpleDateTimeTextProvider());
            return (DateTimeTextProvider) DateTimeTextProvider.MUTABLE_PROVIDER.get();
        }
    }
}
