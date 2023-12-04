package androidx.core.app;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationChannelGroup;
import android.app.job.JobWorkItem;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ShortcutInfo;
import android.content.pm.ShortcutManager;
import android.content.res.AssetManager;
import android.graphics.Typeface;
import android.graphics.fonts.FontVariationAxis;
import android.os.LocaleList;
import android.text.style.LocaleSpan;
import java.io.File;
import java.io.FileDescriptor;
import java.util.Locale;
/* compiled from: D8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class NotificationCompat$$ExternalSyntheticApiModelOutline0 {
    public static /* bridge */ /* synthetic */ Notification.MessagingStyle m(Object obj) {
        return (Notification.MessagingStyle) obj;
    }

    /* renamed from: m  reason: collision with other method in class */
    public static /* bridge */ /* synthetic */ NotificationChannel m5956m(Object obj) {
        return (NotificationChannel) obj;
    }

    /* renamed from: m  reason: collision with other method in class */
    public static /* bridge */ /* synthetic */ NotificationChannelGroup m5957m(Object obj) {
        return (NotificationChannelGroup) obj;
    }

    /* renamed from: m  reason: collision with other method in class */
    public static /* bridge */ /* synthetic */ android.app.Person m5958m(Object obj) {
        return (android.app.Person) obj;
    }

    public static /* synthetic */ JobWorkItem m(Intent intent) {
        return new JobWorkItem(intent);
    }

    public static /* synthetic */ ShortcutInfo.Builder m(Context context, String str) {
        return new ShortcutInfo.Builder(context, str);
    }

    /* renamed from: m  reason: collision with other method in class */
    public static /* bridge */ /* synthetic */ ShortcutInfo m5961m(Object obj) {
        return (ShortcutInfo) obj;
    }

    /* renamed from: m  reason: collision with other method in class */
    public static /* bridge */ /* synthetic */ ShortcutManager m5962m(Object obj) {
        return (ShortcutManager) obj;
    }

    public static /* synthetic */ Typeface.Builder m(AssetManager assetManager, String str) {
        return new Typeface.Builder(assetManager, str);
    }

    public static /* synthetic */ Typeface.Builder m(File file) {
        return new Typeface.Builder(file);
    }

    public static /* synthetic */ Typeface.Builder m(FileDescriptor fileDescriptor) {
        return new Typeface.Builder(fileDescriptor);
    }

    public static /* synthetic */ FontVariationAxis m(String str, float f) {
        return new FontVariationAxis(str, f);
    }

    public static /* synthetic */ LocaleList m(Locale[] localeArr) {
        return new LocaleList(localeArr);
    }

    /* renamed from: m  reason: collision with other method in class */
    public static /* synthetic */ LocaleSpan m5965m(LocaleList localeList) {
        return new LocaleSpan(localeList);
    }

    /* renamed from: m  reason: collision with other method in class */
    public static /* bridge */ /* synthetic */ Class m5967m() {
        return Notification.MessagingStyle.class;
    }

    /* renamed from: m  reason: collision with other method in class */
    public static /* synthetic */ void m5971m() {
    }

    public static /* bridge */ /* synthetic */ Class m$1() {
        return Notification.DecoratedCustomViewStyle.class;
    }

    /* renamed from: m$1  reason: collision with other method in class */
    public static /* synthetic */ void m5981m$1() {
    }

    public static /* bridge */ /* synthetic */ Class m$2() {
        return ShortcutManager.class;
    }

    /* renamed from: m$2  reason: collision with other method in class */
    public static /* synthetic */ void m5984m$2() {
    }
}
