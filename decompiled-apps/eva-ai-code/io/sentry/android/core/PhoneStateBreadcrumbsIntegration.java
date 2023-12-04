package io.sentry.android.core;

import android.content.Context;
import android.telephony.PhoneStateListener;
import android.telephony.TelephonyManager;
import androidx.autofill.HintConstants;
import com.facebook.internal.NativeProtocol;
import io.sentry.Breadcrumb;
import io.sentry.IHub;
import io.sentry.Integration;
import io.sentry.SentryLevel;
import io.sentry.SentryOptions;
import io.sentry.android.core.internal.util.Permissions;
import io.sentry.util.Objects;
import java.io.Closeable;
import java.io.IOException;
/* loaded from: classes4.dex */
public final class PhoneStateBreadcrumbsIntegration implements Integration, Closeable {
    private final Context context;
    PhoneStateChangeListener listener;
    private SentryAndroidOptions options;
    private TelephonyManager telephonyManager;

    public PhoneStateBreadcrumbsIntegration(Context context) {
        this.context = (Context) Objects.requireNonNull(context, "Context is required");
    }

    @Override // io.sentry.Integration
    public void register(IHub iHub, SentryOptions sentryOptions) {
        Objects.requireNonNull(iHub, "Hub is required");
        SentryAndroidOptions sentryAndroidOptions = (SentryAndroidOptions) Objects.requireNonNull(sentryOptions instanceof SentryAndroidOptions ? (SentryAndroidOptions) sentryOptions : null, "SentryAndroidOptions is required");
        this.options = sentryAndroidOptions;
        sentryAndroidOptions.getLogger().log(SentryLevel.DEBUG, "enableSystemEventBreadcrumbs enabled: %s", Boolean.valueOf(this.options.isEnableSystemEventBreadcrumbs()));
        if (this.options.isEnableSystemEventBreadcrumbs() && Permissions.hasPermission(this.context, "android.permission.READ_PHONE_STATE")) {
            TelephonyManager telephonyManager = (TelephonyManager) this.context.getSystemService(HintConstants.AUTOFILL_HINT_PHONE);
            this.telephonyManager = telephonyManager;
            if (telephonyManager != null) {
                try {
                    PhoneStateChangeListener phoneStateChangeListener = new PhoneStateChangeListener(iHub);
                    this.listener = phoneStateChangeListener;
                    this.telephonyManager.listen(phoneStateChangeListener, 32);
                    sentryOptions.getLogger().log(SentryLevel.DEBUG, "PhoneStateBreadcrumbsIntegration installed.", new Object[0]);
                    return;
                } catch (Throwable th) {
                    this.options.getLogger().log(SentryLevel.INFO, th, "TelephonyManager is not available or ready to use.", new Object[0]);
                    return;
                }
            }
            this.options.getLogger().log(SentryLevel.INFO, "TelephonyManager is not available", new Object[0]);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        PhoneStateChangeListener phoneStateChangeListener;
        TelephonyManager telephonyManager = this.telephonyManager;
        if (telephonyManager == null || (phoneStateChangeListener = this.listener) == null) {
            return;
        }
        telephonyManager.listen(phoneStateChangeListener, 0);
        this.listener = null;
        SentryAndroidOptions sentryAndroidOptions = this.options;
        if (sentryAndroidOptions != null) {
            sentryAndroidOptions.getLogger().log(SentryLevel.DEBUG, "PhoneStateBreadcrumbsIntegration removed.", new Object[0]);
        }
    }

    /* loaded from: classes4.dex */
    static final class PhoneStateChangeListener extends PhoneStateListener {
        private final IHub hub;

        PhoneStateChangeListener(IHub iHub) {
            this.hub = iHub;
        }

        @Override // android.telephony.PhoneStateListener
        public void onCallStateChanged(int i, String str) {
            if (i == 1) {
                Breadcrumb breadcrumb = new Breadcrumb();
                breadcrumb.setType("system");
                breadcrumb.setCategory("device.event");
                breadcrumb.setData(NativeProtocol.WEB_DIALOG_ACTION, "CALL_STATE_RINGING");
                breadcrumb.setMessage("Device ringing");
                breadcrumb.setLevel(SentryLevel.INFO);
                this.hub.addBreadcrumb(breadcrumb);
            }
        }
    }
}
