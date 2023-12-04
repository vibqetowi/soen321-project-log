package com.facebook.login;

import android.content.ComponentName;
import android.net.Uri;
import androidx.browser.customtabs.CustomTabsClient;
import androidx.browser.customtabs.CustomTabsServiceConnection;
import androidx.browser.customtabs.CustomTabsSession;
import io.sentry.cache.EnvelopeCache;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: CustomTabPrefetchHelper.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bB\u0005¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0010\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0006H\u0016¨\u0006\f"}, d2 = {"Lcom/facebook/login/CustomTabPrefetchHelper;", "Landroidx/browser/customtabs/CustomTabsServiceConnection;", "()V", "onCustomTabsServiceConnected", "", "name", "Landroid/content/ComponentName;", "newClient", "Landroidx/browser/customtabs/CustomTabsClient;", "onServiceDisconnected", "componentName", "Companion", "facebook-common_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes2.dex */
public final class CustomTabPrefetchHelper extends CustomTabsServiceConnection {
    private static CustomTabsClient client;
    private static CustomTabsSession session;
    public static final Companion Companion = new Companion(null);
    private static final ReentrantLock lock = new ReentrantLock();

    @JvmStatic
    public static final CustomTabsSession getPreparedSessionOnce() {
        return Companion.getPreparedSessionOnce();
    }

    @JvmStatic
    public static final void mayLaunchUrl(Uri uri) {
        Companion.mayLaunchUrl(uri);
    }

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(ComponentName componentName) {
        Intrinsics.checkNotNullParameter(componentName, "componentName");
    }

    @Override // androidx.browser.customtabs.CustomTabsServiceConnection
    public void onCustomTabsServiceConnected(ComponentName name, CustomTabsClient newClient) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(newClient, "newClient");
        newClient.warmup(0L);
        Companion companion = Companion;
        client = newClient;
        companion.prepareSession();
    }

    /* compiled from: CustomTabPrefetchHelper.kt */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\n\u0010\t\u001a\u0004\u0018\u00010\bH\u0007J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0007J\b\u0010\u000e\u001a\u00020\u000bH\u0002R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/facebook/login/CustomTabPrefetchHelper$Companion;", "", "()V", "client", "Landroidx/browser/customtabs/CustomTabsClient;", "lock", "Ljava/util/concurrent/locks/ReentrantLock;", EnvelopeCache.PREFIX_CURRENT_SESSION_FILE, "Landroidx/browser/customtabs/CustomTabsSession;", "getPreparedSessionOnce", "mayLaunchUrl", "", "url", "Landroid/net/Uri;", "prepareSession", "facebook-common_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void prepareSession() {
            CustomTabsClient customTabsClient;
            CustomTabPrefetchHelper.lock.lock();
            if (CustomTabPrefetchHelper.session == null && (customTabsClient = CustomTabPrefetchHelper.client) != null) {
                Companion companion = CustomTabPrefetchHelper.Companion;
                CustomTabPrefetchHelper.session = customTabsClient.newSession(null);
            }
            CustomTabPrefetchHelper.lock.unlock();
        }

        @JvmStatic
        public final void mayLaunchUrl(Uri url) {
            Intrinsics.checkNotNullParameter(url, "url");
            prepareSession();
            CustomTabPrefetchHelper.lock.lock();
            CustomTabsSession customTabsSession = CustomTabPrefetchHelper.session;
            if (customTabsSession != null) {
                customTabsSession.mayLaunchUrl(url, null, null);
            }
            CustomTabPrefetchHelper.lock.unlock();
        }

        @JvmStatic
        public final CustomTabsSession getPreparedSessionOnce() {
            CustomTabPrefetchHelper.lock.lock();
            CustomTabsSession customTabsSession = CustomTabPrefetchHelper.session;
            CustomTabPrefetchHelper.session = null;
            CustomTabPrefetchHelper.lock.unlock();
            return customTabsSession;
        }
    }
}
