package com.bugsnag.android;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import com.bugsnag.android.internal.ImmutableConfig;
import com.theinnerhour.b2b.utils.SessionManager;
import gv.n;
import gv.r;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.d;
import kotlin.jvm.internal.i;
/* compiled from: SystemBroadcastReceiver.kt */
@kotlin.Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001dB\u0017\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001b\u0010\u001cJ,\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0006\u0010\b\u001a\u00020\u0005H\u0002J\u0014\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\f0\u000bH\u0002J\u0018\u0010\u0010\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R#\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\f0\u000b8\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0016\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\u001e"}, d2 = {"Lcom/bugsnag/android/SystemBroadcastReceiver;", "Landroid/content/BroadcastReceiver;", "Landroid/content/Intent;", "intent", "", "", "", "meta", "shortAction", "Lhs/k;", "addExtrasToMetadata", "", "Lcom/bugsnag/android/BreadcrumbType;", "buildActions", "Landroid/content/Context;", "context", "onReceive", "actions", "Ljava/util/Map;", "getActions", "()Ljava/util/Map;", "Lcom/bugsnag/android/Client;", SessionManager.KEY_CLIENT, "Lcom/bugsnag/android/Client;", "Lcom/bugsnag/android/Logger;", "logger", "Lcom/bugsnag/android/Logger;", "<init>", "(Lcom/bugsnag/android/Client;Lcom/bugsnag/android/Logger;)V", "Companion", "bugsnag-android-core_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes.dex */
public final class SystemBroadcastReceiver extends BroadcastReceiver {
    public static final Companion Companion = new Companion(null);
    private static final String INTENT_ACTION_KEY = "Intent Action";
    private final Map<String, BreadcrumbType> actions;
    private final Client client;
    private final Logger logger;

    /* compiled from: SystemBroadcastReceiver.kt */
    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0012\u0010\u0013J \u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007J\u000e\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nJ\u000e\u0010\u000f\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\nR\u0014\u0010\u0010\u001a\u00020\n8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0014"}, d2 = {"Lcom/bugsnag/android/SystemBroadcastReceiver$Companion;", "", "Landroid/content/Context;", "ctx", "Lcom/bugsnag/android/SystemBroadcastReceiver;", "receiver", "Lcom/bugsnag/android/Logger;", "logger", "Lhs/k;", "register", "", "actionName", "", "isAndroidKey", "action", "shortenActionNameIfNeeded", "INTENT_ACTION_KEY", "Ljava/lang/String;", "<init>", "()V", "bugsnag-android-core_release"}, k = 1, mv = {1, 4, 2})
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(d dVar) {
            this();
        }

        public final boolean isAndroidKey(String actionName) {
            i.h(actionName, "actionName");
            return n.H0(actionName, "android.");
        }

        public final void register(Context ctx, SystemBroadcastReceiver receiver, Logger logger) {
            i.h(ctx, "ctx");
            i.h(receiver, "receiver");
            i.h(logger, "logger");
            if (!receiver.getActions().isEmpty()) {
                IntentFilter intentFilter = new IntentFilter();
                for (String str : receiver.getActions().keySet()) {
                    intentFilter.addAction(str);
                }
                ContextExtensionsKt.registerReceiverSafe(ctx, receiver, intentFilter, logger);
            }
        }

        public final String shortenActionNameIfNeeded(String action) {
            i.h(action, "action");
            if (isAndroidKey(action)) {
                return r.e1(action, '.');
            }
            return action;
        }
    }

    public SystemBroadcastReceiver(Client client, Logger logger) {
        i.h(client, "client");
        i.h(logger, "logger");
        this.client = client;
        this.logger = logger;
        this.actions = buildActions();
    }

    private final void addExtrasToMetadata(Intent intent, Map<String, Object> map, String str) {
        Set<String> keySet;
        Bundle extras = intent.getExtras();
        if (extras != null && (keySet = extras.keySet()) != null) {
            for (String key : keySet) {
                Object obj = extras.get(key);
                if (obj != null) {
                    String obj2 = obj.toString();
                    Companion companion = Companion;
                    i.c(key, "key");
                    if (companion.isAndroidKey(key)) {
                        map.put("Extra", str + ": " + obj2);
                    } else {
                        map.put(key, obj2);
                    }
                }
            }
        }
    }

    private final Map<String, BreadcrumbType> buildActions() {
        HashMap hashMap = new HashMap();
        ImmutableConfig config = this.client.getConfig();
        BreadcrumbType breadcrumbType = BreadcrumbType.USER;
        if (!config.shouldDiscardBreadcrumb(breadcrumbType)) {
            hashMap.put("android.appwidget.action.APPWIDGET_DELETED", breadcrumbType);
            hashMap.put("android.appwidget.action.APPWIDGET_DISABLED", breadcrumbType);
            hashMap.put("android.appwidget.action.APPWIDGET_ENABLED", breadcrumbType);
            hashMap.put("android.intent.action.CAMERA_BUTTON", breadcrumbType);
            hashMap.put("android.intent.action.CLOSE_SYSTEM_DIALOGS", breadcrumbType);
            hashMap.put("android.intent.action.DOCK_EVENT", breadcrumbType);
        }
        BreadcrumbType breadcrumbType2 = BreadcrumbType.STATE;
        if (!config.shouldDiscardBreadcrumb(breadcrumbType2)) {
            hashMap.put("android.appwidget.action.APPWIDGET_HOST_RESTORED", breadcrumbType2);
            hashMap.put("android.appwidget.action.APPWIDGET_RESTORED", breadcrumbType2);
            hashMap.put("android.appwidget.action.APPWIDGET_UPDATE", breadcrumbType2);
            hashMap.put("android.appwidget.action.APPWIDGET_UPDATE_OPTIONS", breadcrumbType2);
            hashMap.put("android.intent.action.ACTION_POWER_CONNECTED", breadcrumbType2);
            hashMap.put("android.intent.action.ACTION_POWER_DISCONNECTED", breadcrumbType2);
            hashMap.put("android.intent.action.ACTION_SHUTDOWN", breadcrumbType2);
            hashMap.put("android.intent.action.AIRPLANE_MODE", breadcrumbType2);
            hashMap.put("android.intent.action.BATTERY_LOW", breadcrumbType2);
            hashMap.put("android.intent.action.BATTERY_OKAY", breadcrumbType2);
            hashMap.put("android.intent.action.BOOT_COMPLETED", breadcrumbType2);
            hashMap.put("android.intent.action.CONFIGURATION_CHANGED", breadcrumbType2);
            hashMap.put("android.intent.action.CONTENT_CHANGED", breadcrumbType2);
            hashMap.put("android.intent.action.DATE_CHANGED", breadcrumbType2);
            hashMap.put("android.intent.action.DEVICE_STORAGE_LOW", breadcrumbType2);
            hashMap.put("android.intent.action.DEVICE_STORAGE_OK", breadcrumbType2);
            hashMap.put("android.intent.action.INPUT_METHOD_CHANGED", breadcrumbType2);
            hashMap.put("android.intent.action.LOCALE_CHANGED", breadcrumbType2);
            hashMap.put("android.intent.action.REBOOT", breadcrumbType2);
            hashMap.put("android.intent.action.SCREEN_OFF", breadcrumbType2);
            hashMap.put("android.intent.action.SCREEN_ON", breadcrumbType2);
            hashMap.put("android.intent.action.TIMEZONE_CHANGED", breadcrumbType2);
            hashMap.put("android.intent.action.TIME_SET", breadcrumbType2);
            hashMap.put("android.os.action.DEVICE_IDLE_MODE_CHANGED", breadcrumbType2);
            hashMap.put("android.os.action.POWER_SAVE_MODE_CHANGED", breadcrumbType2);
        }
        BreadcrumbType breadcrumbType3 = BreadcrumbType.NAVIGATION;
        if (!config.shouldDiscardBreadcrumb(breadcrumbType3)) {
            hashMap.put("android.intent.action.DREAMING_STARTED", breadcrumbType3);
            hashMap.put("android.intent.action.DREAMING_STOPPED", breadcrumbType3);
        }
        return hashMap;
    }

    public static final void register(Context context, SystemBroadcastReceiver systemBroadcastReceiver, Logger logger) {
        Companion.register(context, systemBroadcastReceiver, logger);
    }

    public final Map<String, BreadcrumbType> getActions() {
        return this.actions;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        i.h(context, "context");
        i.h(intent, "intent");
        try {
            HashMap hashMap = new HashMap();
            String action = intent.getAction();
            if (action != null) {
                String shortenActionNameIfNeeded = Companion.shortenActionNameIfNeeded(action);
                hashMap.put(INTENT_ACTION_KEY, action);
                addExtrasToMetadata(intent, hashMap, shortenActionNameIfNeeded);
                BreadcrumbType breadcrumbType = this.actions.get(action);
                if (breadcrumbType == null) {
                    breadcrumbType = BreadcrumbType.STATE;
                }
                this.client.leaveBreadcrumb(shortenActionNameIfNeeded, hashMap, breadcrumbType);
            }
        } catch (Exception e10) {
            Logger logger = this.logger;
            logger.w("Failed to leave breadcrumb in SystemBroadcastReceiver: " + e10.getMessage());
        }
    }
}
